package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.ActiveUserConfig;
import com.ss.android.vc.entity.EffectPlatformConfig;
import com.ss.android.vc.entity.FeaturePerfConfig;
import com.ss.android.vc.entity.VcBillingLinkConfig;
import com.ss.android.vc.entity.VcEnterprisePhoneLinkConfig;
import com.ss.android.vc.entity.VcStreamResoultionsDescModel;
import com.ss.android.vc.entity.VcVideoSortConfig;
import com.ss.android.vc.net.service.VCSettingsService;

/* renamed from: com.ss.android.vc.meeting.framework.manager.e */
public class C61282e {

    /* renamed from: a */
    private VcStreamResoultionsDescModel f153513a;

    /* renamed from: b */
    private ActiveUserConfig f153514b;

    /* renamed from: c */
    private VcVideoSortConfig f153515c;

    /* renamed from: d */
    private VcBillingLinkConfig f153516d;

    /* renamed from: e */
    private VcEnterprisePhoneLinkConfig f153517e;

    /* renamed from: f */
    private FeaturePerfConfig f153518f;

    /* renamed from: g */
    private EffectPlatformConfig f153519g;

    /* renamed from: a */
    public VcStreamResoultionsDescModel mo211940a() {
        VcStreamResoultionsDescModel vcStreamResoultionsDescModel = this.f153513a;
        if (vcStreamResoultionsDescModel != null) {
            return vcStreamResoultionsDescModel;
        }
        String settings = VCSettingsService.getSettings("vc_simulcast_stream_desc");
        if (TextUtils.isEmpty(settings)) {
            settings = "{\"full_screen\":720,\"half_screen\":480,\"quater_screen\":240,\"float_window\":240,\"main_mode\":0,\"thumbnail_mode\":0,\"float_mode\":0,\"resolutions\":[{\"width\":360,\"height\":640,\"maxKbps\":400,\"frameRate\":15,\"scaleMode\":2},{\"width\":180,\"height\":320,\"maxKbps\":140,\"frameRate\":15,\"scaleMode\":2}]}";
        }
        try {
            VcStreamResoultionsDescModel vcStreamResoultionsDescModel2 = (VcStreamResoultionsDescModel) JSON.parseObject(settings, VcStreamResoultionsDescModel.class);
            if (vcStreamResoultionsDescModel2 == null || vcStreamResoultionsDescModel2.resolutions == null || vcStreamResoultionsDescModel2.resolutions.size() == 0) {
                vcStreamResoultionsDescModel2 = (VcStreamResoultionsDescModel) JSON.parseObject("{\"full_screen\":720,\"half_screen\":480,\"quater_screen\":240,\"float_window\":240,\"main_mode\":0,\"thumbnail_mode\":0,\"float_mode\":0,\"resolutions\":[{\"width\":360,\"height\":640,\"maxKbps\":400,\"frameRate\":15,\"scaleMode\":2},{\"width\":180,\"height\":320,\"maxKbps\":140,\"frameRate\":15,\"scaleMode\":2}]}", VcStreamResoultionsDescModel.class);
            }
            this.f153513a = vcStreamResoultionsDescModel2;
        } catch (Exception e) {
            C60700b.m235864f("MeetingConfig", "[getResoultionsDescModel]", e.getMessage());
            if (this.f153513a == null) {
                this.f153513a = (VcStreamResoultionsDescModel) JSON.parseObject("{\"full_screen\":720,\"half_screen\":480,\"quater_screen\":240,\"float_window\":240,\"main_mode\":0,\"thumbnail_mode\":0,\"float_mode\":0,\"resolutions\":[{\"width\":360,\"height\":640,\"maxKbps\":400,\"frameRate\":15,\"scaleMode\":2},{\"width\":180,\"height\":320,\"maxKbps\":140,\"frameRate\":15,\"scaleMode\":2}]}", VcStreamResoultionsDescModel.class);
            }
        }
        return this.f153513a;
    }

    /* renamed from: b */
    public FeaturePerfConfig mo211941b() {
        FeaturePerfConfig featurePerfConfig = this.f153518f;
        if (featurePerfConfig != null) {
            return featurePerfConfig;
        }
        String settings = VCSettingsService.getSettings("vc_feature_performance_config");
        C60700b.m235851b("MeetingConfig", "[getFeaturePerfConfig]", "perfConfig: " + settings);
        if (TextUtils.isEmpty(settings)) {
            settings = "{\"dynamic\":{\"effect\":[{\"detection\":{\"action_interval\":7200,\"entry_meeting_duration\":600,\"overload_duration\":15,\"overload_rules\":[{\"app_cpu\":50,\"system_cpu\":0}]},\"range\":{\"max\":4,\"min\":0}},{\"detection\":{\"action_interval\":7200,\"entry_meeting_duration\":600,\"overload_duration\":15,\"overload_rules\":[{\"app_cpu\":35,\"system_cpu\":0}]},\"range\":{\"max\":99,\"min\":5}}]},\"static\":{\"effect\":[{\"cpu_cores\":4,\"cpu_frequency\":1.59,\"cpu_threads\":0,\"memory\":2}]}}";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                FeaturePerfConfig featurePerfConfig2 = (FeaturePerfConfig) JSON.parseObject(settings, FeaturePerfConfig.class);
                if (featurePerfConfig2 != null && featurePerfConfig2.isValid()) {
                    this.f153518f = featurePerfConfig2;
                }
            } catch (JSONException e) {
                C60700b.m235864f("MeetingConfig", "[getFeaturePerfConfig2]", e.getMessage());
            }
        }
        FeaturePerfConfig featurePerfConfig3 = this.f153518f;
        if (featurePerfConfig3 == null) {
            return FeaturePerfConfig.createDefault();
        }
        return featurePerfConfig3;
    }

    /* renamed from: c */
    public EffectPlatformConfig mo211942c() {
        EffectPlatformConfig effectPlatformConfig = this.f153519g;
        if (effectPlatformConfig != null) {
            return effectPlatformConfig;
        }
        String settings = VCSettingsService.getSettings("vc_platform_config");
        C60700b.m235851b("MeetingConfig", "[getEffectPlatformConfig]", "platformConfig: " + settings);
        if (TextUtils.isEmpty(settings)) {
            settings = "{\"accessKey\":\"05f43500d79911eab76b63d0864735f8\",\"feishuHost\":\"https://effect-bd.feishu.cn\",\"larkHost\":\"https://effect-bd.larksuite.com\"}";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                this.f153519g = (EffectPlatformConfig) JSON.parseObject(settings, EffectPlatformConfig.class);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingConfig", "[getEffectPlatformConfig2]", e.getMessage());
            }
        }
        return this.f153519g;
    }

    /* renamed from: d */
    public VcVideoSortConfig mo211943d() {
        VcVideoSortConfig vcVideoSortConfig = this.f153515c;
        if (vcVideoSortConfig != null) {
            return vcVideoSortConfig;
        }
        String settings = VCSettingsService.getSettings("vc_video_sort_config");
        if (TextUtils.isEmpty(settings)) {
            settings = "";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                VcVideoSortConfig vcVideoSortConfig2 = (VcVideoSortConfig) JSON.parseObject(settings, VcVideoSortConfig.class);
                if (vcVideoSortConfig2.getTimeScope() > 0) {
                    this.f153515c = vcVideoSortConfig2;
                }
            } catch (JSONException e) {
                C60700b.m235864f("MeetingConfig", "[getVideoSortConfig]", e.getMessage());
            }
        }
        if (this.f153515c == null) {
            this.f153515c = new VcVideoSortConfig();
        }
        return this.f153515c;
    }

    /* renamed from: e */
    public VcBillingLinkConfig mo211944e() {
        VcBillingLinkConfig vcBillingLinkConfig = this.f153516d;
        if (vcBillingLinkConfig != null) {
            return vcBillingLinkConfig;
        }
        String settings = VCSettingsService.getSettings("vc_billing_link_config");
        if (TextUtils.isEmpty(settings)) {
            settings = "";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                VcBillingLinkConfig vcBillingLinkConfig2 = (VcBillingLinkConfig) JSON.parseObject(settings, VcBillingLinkConfig.class);
                if (!TextUtils.isEmpty(vcBillingLinkConfig2.getUpgradeLink())) {
                    this.f153516d = vcBillingLinkConfig2;
                }
            } catch (JSONException e) {
                C60700b.m235864f("MeetingConfig", "[getVcBillingLinkConfig]", e.getMessage());
            }
        }
        if (this.f153516d == null) {
            this.f153516d = new VcBillingLinkConfig();
        }
        return this.f153516d;
    }

    /* renamed from: f */
    public VcEnterprisePhoneLinkConfig mo211945f() {
        VcEnterprisePhoneLinkConfig vcEnterprisePhoneLinkConfig = this.f153517e;
        if (vcEnterprisePhoneLinkConfig != null) {
            return vcEnterprisePhoneLinkConfig;
        }
        String settings = VCSettingsService.getSettings("vc_enterprise_control_link");
        if (TextUtils.isEmpty(settings)) {
            settings = "";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                VcEnterprisePhoneLinkConfig vcEnterprisePhoneLinkConfig2 = (VcEnterprisePhoneLinkConfig) JSON.parseObject(settings, VcEnterprisePhoneLinkConfig.class);
                if (!TextUtils.isEmpty(vcEnterprisePhoneLinkConfig2.getControlLink())) {
                    this.f153517e = vcEnterprisePhoneLinkConfig2;
                }
            } catch (JSONException e) {
                C60700b.m235864f("MeetingConfig", "[getVcBillingLinkConfig]", e.getMessage());
            }
        }
        if (this.f153517e == null) {
            this.f153517e = new VcEnterprisePhoneLinkConfig();
        }
        return this.f153517e;
    }

    /* renamed from: g */
    public ActiveUserConfig mo211946g() {
        ActiveUserConfig activeUserConfig = this.f153514b;
        if (activeUserConfig != null) {
            return activeUserConfig;
        }
        String settings = VCSettingsService.getSettings("vc_active_speaker_config_v2");
        if (TextUtils.isEmpty(settings)) {
            settings = "";
        }
        if (!TextUtils.isEmpty(settings)) {
            try {
                ActiveUserConfig activeUserConfig2 = (ActiveUserConfig) JSON.parseObject(settings, ActiveUserConfig.class);
                if (activeUserConfig2.getSampleInterval() > 0) {
                    this.f153514b = activeUserConfig2;
                }
            } catch (Exception e) {
                C60700b.m235864f("MeetingConfig", "[getActiveSpeakerConfig]", e.getMessage());
            }
        }
        if (this.f153514b == null) {
            this.f153514b = new ActiveUserConfig();
        }
        return this.f153514b;
    }
}
