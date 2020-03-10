package net.industryhive.controller;

import net.industryhive.bean.Notice;
import net.industryhive.bean.User;
import net.industryhive.bean.wrap.WrapNotice;
import net.industryhive.entity.UnifiedResult;
import net.industryhive.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 公告管理Controller
 *
 * @author 未央
 * @create 2020-01-21 10:02
 */
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/allNotice")
    public UnifiedResult getAllNotice(Integer page) {
        if (page == null) {
            page = 1;
        }
        List<WrapNotice> wrapNoticeList = noticeService.getWrapNoticeList(page);
        long noticeCount = noticeService.getNoticeCount();
        Map<String, Object> map = new HashMap<>();
        map.put("noticeList", wrapNoticeList);
        map.put("noticeCount", noticeCount);
        return UnifiedResult.ok(map);
    }

    @RequestMapping("/submitNotice")
    public UnifiedResult submitNotice(HttpSession session,Notice newNotice){
        String regLabel = "^[\\u4e00-\\u9fa5]{2,4}$";
        Pattern pattern = Pattern.compile(regLabel);
        Matcher matcher = pattern.matcher(newNotice.getLabel());
        if (!matcher.matches()) {
            return UnifiedResult.build(400, "公告标签为2至4位汉字", null);
        }

        if (newNotice.getTitle().length() < 4 || newNotice.getTitle().length() > 35) {
            return UnifiedResult.build(400, "公告标题的长度为4至35个字符", null);
        }

        String validate = newNotice.getContent();
        String validateA = validate.replaceAll(" ", "");
        String validateB = validateA.replaceAll("<p>", "");
        String validateC = validateB.replaceAll("</p>", "");
        String validateD = validateC.replaceAll("&nbsp;", "");
        String validateE = validateD.replaceAll("<br>", "");
        if (validateE.length() == 0) {
            return UnifiedResult.build(400, "公告内容不能为空！", null);
        }

        if (newNotice.getContent().length() > 16384) {
            return UnifiedResult.build(400, "公告内容的长度不得超过16000个字符", null);
        }

        User user = (User) session.getAttribute("admin");
        Date date = new Date();
        //设置公告作者id
        newNotice.setUser_id(user.getId());
        //设置发布时间
        newNotice.setSubmitTime(date);
        //设置最后编辑者id
        newNotice.setLastUser_id(user.getId());
        //设置最后编辑时间
        newNotice.setLastSubmitTime(date);
        //将公告写入数据库
        int id = noticeService.addNotice(newNotice);

        return UnifiedResult.ok(id);
    }

    @RequestMapping("/notice")
    public UnifiedResult getNotice(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        WrapNotice wrapNotice = noticeService.getWrapNotice(id);
        if (wrapNotice == null) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        return UnifiedResult.ok(wrapNotice);
    }

    @RequestMapping("/hideNotice")
    public UnifiedResult hideNotice(Integer id, Integer hided) {
        if (id == null || hided == null || (hided != 0 && hided != 1)) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        UnifiedResult result = noticeService.hideNotice(id, hided);
        return result;
    }

    @RequestMapping("/deleteNotice")
    public UnifiedResult deleteNotice(Integer id) {
        if (id == null) {
            return UnifiedResult.build(400, "参数错误", null);
        }
        UnifiedResult result = noticeService.deleteNotice(id);
        return result;
    }

}
