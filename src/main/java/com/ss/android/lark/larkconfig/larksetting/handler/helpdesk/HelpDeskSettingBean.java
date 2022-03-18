package com.ss.android.lark.larkconfig.larksetting.handler.helpdesk;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class HelpDeskSettingBean implements Serializable {
    private static final long serialVersionUID = 1944318157725016728L;
    @JSONField(name = "feishu_mini_app_link")
    private String feiShuMiniAppLink = "https://applink.feishu.cn/client/mini_program/open?appId=cli_9f9f8825d53b900d&mode=appCenter";
    @JSONField(name = "helpdesk-mini-program-appId")
    private String helpdeskMiniProgramAppId = "cli_9da5b90fc3ec110b";

    public String getFeiShuMiniAppLink() {
        return this.feiShuMiniAppLink;
    }

    public String getHelpdeskMiniProgramAppId() {
        return this.helpdeskMiniProgramAppId;
    }

    public void setFeiShuMiniAppLink(String str) {
        this.feiShuMiniAppLink = str;
    }

    public void setHelpdeskMiniProgramAppId(String str) {
        this.helpdeskMiniProgramAppId = str;
    }
}
