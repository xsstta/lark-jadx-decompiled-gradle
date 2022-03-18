package com.ss.lark.android.passport.biz.feature.sso;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SuiteInfo;
import java.io.Serializable;
import java.util.List;

public class QRLoginStepInfo implements Serializable {
    @JSONField(name = "authz")
    public AuthInfo authInfo;
    @JSONField(name = "button_list")
    public List<ButtonInfo> buttonList;
    @JSONField(name = "suite")
    public SuiteInfo suiteInfo;
    @JSONField(name = "template")
    public String template;
}
