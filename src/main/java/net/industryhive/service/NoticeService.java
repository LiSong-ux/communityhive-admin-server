package net.industryhive.service;

import net.industryhive.bean.Notice;
import net.industryhive.bean.NoticeExample;
import net.industryhive.bean.wrap.WrapNotice;
import net.industryhive.dao.NoticeMapper;
import net.industryhive.entity.UnifiedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公告管理Service
 *
 * @author 未央
 * @create 2020-01-21 10:03
 */
@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public List<WrapNotice> getWrapNoticeList(int page) {
        int startRow = (page - 1) * 50;
        List<WrapNotice> wrapNoticeList = noticeMapper.findListWithUsername(startRow);
        return wrapNoticeList;
    }

    public long getNoticeCount() {
        NoticeExample example = new NoticeExample();
        long count = noticeMapper.countByExample(example);
        return count;
    }

    public int addNotice(Notice newNotice){
        noticeMapper.insertSelective(newNotice);
        return newNotice.getId();
    }

    public WrapNotice getWrapNotice(int id){
        WrapNotice wrapNotice = noticeMapper.findWithUsername(id);
        return wrapNotice;
    }

    public UnifiedResult deleteNotice(int id) {
        Notice notice = noticeMapper.selectByPrimaryKey(id);
        if (notice == null) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        if (notice.getDeleted() == true) {
            return UnifiedResult.build(400, "公告已被删除", null);
        }
        notice.setDeleted(true);
        noticeMapper.updateByPrimaryKeySelective(notice);
        return UnifiedResult.ok();
    }
}
