package com.service.web.inter;

import com.domain.wx.WxTag;
import com.models.web.BaseResp;
import com.models.web.DataListResp;
import com.models.web.tag.*;

import java.util.List;

/**
 * Created by admin on 2016/11/30.
 */
public interface TagService {
    BaseResp addTag(AddTagReq req);

    WxTagInfo getTag(int tagId);

    WxTag getWxTag(int tagId);

    DataListResp getTagList(int pageSize, int pageIndex, int domain, String args);

    BaseResp deleteTag(Integer id);

    BaseResp syncWxTag(SyncWxTagReq req);

    List<TagSelectItem> getTagSelect(TagSelectReq req);
}
