package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import java.io.Serializable;
import java.util.Map;

public class SpliteStepInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "bottom_title")
    public String bottomTitle;
    @JSONField(name = "button_title")
    public String buttonTitle;
    public String code = "";
    public String from;
    public String name = "";
    public NextInfo next;
    @JSONField(name = "subtitle")
    public String subTitle;
    public String title;

    public static class NextInfo implements Serializable {
        @JSONField(name = "recover_account_bank")
        public Map<String, Object> recoverAccountBank;
        @JSONField(name = "verify_face")
        public VerifyFace verifyFace;
        @JSONField(name = "verify_identity")
        public Map<String, Object> verifyIdentity;
    }

    public static class VerifyFace implements Serializable {
        @JSONField(name = "bottom_title")
        public String bottomTitle;
        @JSONField(name = "button_title")
        public String buttonTitle;
        public int mode;
        @JSONField(name = "source_type")
        public int sourceType;
        @JSONField(name = "subtitle")
        public String subTitle;
        public String title;
    }
}
