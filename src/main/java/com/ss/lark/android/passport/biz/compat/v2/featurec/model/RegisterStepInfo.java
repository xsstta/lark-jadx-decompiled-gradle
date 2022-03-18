package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class RegisterStepInfo extends BaseStepInfo implements Serializable {
    public String contact;
    @JSONField(name = "country_code")
    public String countryCode;
    @JSONField(name = "join_team_button")
    public ButtonInfo joinTeamButton;
    @JSONField(name = "locale_button")
    public ButtonInfo localeButton;
    public int mode;
    @JSONField(name = "skip_one_key_auth")
    public boolean skipOneKeyAuth;
    public String source;
    @JSONField(name = "start_cause_rebuild")
    public boolean startCauseRebuild;
}
