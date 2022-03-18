package com.ss.lark.android.passport.biz.feature.accountandsecurity.service.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.http.model.BaseResponseModel;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.entity.ContactPointBean;
import java.util.List;

public class QueryContactPointsResponse extends BaseResponseModel {
    @JSONField(name = "credentials")
    public List<ContactPointBean> cps;
}
