package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class JoinTenantCodeInfo extends BaseStepInfo implements Serializable {
    @JSONField(name = "code_input")
    public CodeInput codeInput;
    @JSONField(name = "flow_type")
    public String flowType;
    public Next next;
    @JSONField(name = "next_button")
    public ButtonInfo nextButton;
    @JSONField(name = "subtitle")
    public String subTitle;
    @JSONField(name = "subtitle_switch_scan_text")
    public String subtitleSwitchScanText;
    @JSONField(name = "switch_button")
    public ButtonInfo switchButton;
    public String title;

    public static class CodeInput implements Serializable {
        @JSONField(name = "placeholder")
        public String placeHolder;
    }

    public static class Next implements Serializable {
        @JSONField(name = "join_tenant_scan")
        public JoinQrCodeInfo openQrStepInfo;
    }
}
