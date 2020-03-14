package net.industryhive.service;

import net.industryhive.bean.Notice;
import net.industryhive.bean.NoticeExample;
import net.industryhive.bean.wrap.WrapNotice;
import net.industryhive.dao.NoticeMapper;
import net.industryhive.entity.UnifiedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public int addNotice(Notice newNotice) {
        noticeMapper.insertSelective(newNotice);
        return newNotice.getId();
    }

    @Transactional(rollbackFor = Exception.class)
    public UnifiedResult updateNotice(Notice updatedNotice) {
        Notice notice = noticeMapper.selectByPrimaryKey(updatedNotice.getId());
        if (notice == null || notice.getDeleted()) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        if (notice.getLocked()) {
            return UnifiedResult.build(400, "公告已被锁定，无法修改", null);
        }
        noticeMapper.updateByPrimaryKeySelective(updatedNotice);
        return UnifiedResult.ok();
    }

    public WrapNotice getWrapNotice(int id) {
        WrapNotice wrapNotice = noticeMapper.findWithUsername(id);
        return wrapNotice;
    }

    /**
     * 对公告执行锁定或解锁操作
     *
     * @param id
     * @param locked
     * @return
     */
    public UnifiedResult lockNotice(int id, int locked) {
        Notice notice = noticeMapper.selectByPrimaryKey(id);
        if (notice == null || notice.getDeleted()) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        if (!notice.getLocked() && locked == 1) {
            notice.setLocked(true);
        } else if (notice.getLocked() && locked == 0) {
            notice.setLocked(false);
        } else {
            if (!notice.getLocked() && locked == 0) {
                return UnifiedResult.build(400, "公告已解锁", null);
            } else {
                return UnifiedResult.build(400, "公告已锁定", null);
            }
        }
        noticeMapper.updateByPrimaryKeySelective(notice);
        return UnifiedResult.ok();
    }

    public UnifiedResult hideNotice(int id, int hided) {
        Notice notice = noticeMapper.selectByPrimaryKey(id);
        if (notice == null || notice.getDeleted() == true) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        if (notice.getHided() == false && hided == 1) {
            notice.setHided(true);
        } else if (notice.getHided() == true && hided == 0) {
            notice.setHided(false);
        } else {
            if (notice.getHided() == false && hided == 0) {
                return UnifiedResult.build(400, "公告已上架", null);
            } else {
                return UnifiedResult.build(400, "公告已下架", null);
            }
        }
        noticeMapper.updateByPrimaryKeySelective(notice);
        return UnifiedResult.ok();
    }

    public UnifiedResult deleteNotice(int id) {
        Notice notice = noticeMapper.selectByPrimaryKey(id);
        if (notice == null || notice.getDeleted() == true) {
            return UnifiedResult.build(400, "公告不存在", null);
        }
        notice.setDeleted(true);
        noticeMapper.updateByPrimaryKeySelective(notice);
        return UnifiedResult.ok();
    }
}
