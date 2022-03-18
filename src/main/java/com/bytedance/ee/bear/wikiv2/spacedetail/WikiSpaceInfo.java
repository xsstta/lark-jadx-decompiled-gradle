package com.bytedance.ee.bear.wikiv2.spacedetail;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wikiv2.spacedetail.SpaceBean;
import java.util.List;

public class WikiSpaceInfo extends NetService.Result {
    public List<SpaceBean.MembersBean> members;
}
