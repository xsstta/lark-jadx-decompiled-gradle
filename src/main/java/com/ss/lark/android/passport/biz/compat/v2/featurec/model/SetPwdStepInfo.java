package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;

public class SetPwdStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "from_recover_account")
    public boolean fromRecoverAccount;
    @JSONField(name = "rsa_info")
    public RsaInfo rsaInfo;
    @JSONField(name = "source_type")
    public int sourceType;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "title")
    public String title;
}
