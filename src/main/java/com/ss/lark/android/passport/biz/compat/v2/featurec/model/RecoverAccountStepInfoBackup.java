package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;

public class RecoverAccountStepInfoBackup extends BaseStepInfo implements Serializable {
    @JSONField(name = "appeal_url")
    public String appealUrl;
    public String from;
    @JSONField(name = "rsa_info")
    public RsaInfo rsaInfo;
    @JSONField(name = "source_type")
    public int sourceType;
    @JSONField(name = "subtitle")
    public String subTitle;
    public String title;
    public String unit;
}
