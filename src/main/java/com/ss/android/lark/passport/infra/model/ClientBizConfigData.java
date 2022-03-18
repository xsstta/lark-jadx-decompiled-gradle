package com.ss.android.lark.passport.infra.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ClientBizConfigData implements Serializable {
    @JSONField(name = "bioauth_appid")
    public String bioAuthAppId;
    @JSONField(name = "bioauth_scene")
    public String bioAuthScene;
    @JSONField(name = "enable_languages_before_login")
    public boolean enableLanguageBeforeLogin;
    @JSONField(name = "join_team_host_whitelist")
    public List<String> joinTeamHostWhitelist;
    @JSONField(name = "log_by_opmonitor_ver_50")
    public boolean logByOPMonitor = true;
    @JSONField(name = "onekey_login_config")
    public OneKeyAuthConfigData oneKeyAuth;
    @JSONField(name = "recover_appid")
    public String recoverAppId;
    @JSONField(name = "recover_scene")
    public String recoverScene;
    @JSONField(name = "h5_url_config")
    public Map<String, String> urlConfig;
}
