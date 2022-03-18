package com.ss.android.lark.setting.service.usersetting.p2674b;

import com.ss.android.lark.pb.ai.CorrectionSetting;
import com.ss.android.lark.pb.ai.FeatureSetting;
import com.ss.android.lark.pb.ai.SceneSetting;
import com.ss.android.lark.pb.ai.UserASSetting;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.b.c */
public class C54662c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, Boolean> f135061a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo186730c() {
        m212211d();
        m212212e();
        this.f135061a.clear();
    }

    /* renamed from: e */
    private void m212212e() {
        UserSP.getInstance().remove("error_correction_msg_enable");
        UserSP.getInstance().remove("error_correction_doc_enable");
        UserSP.getInstance().remove("error_correction_mail_enable");
    }

    /* renamed from: d */
    private void m212211d() {
        UserSP.getInstance().remove("enterprise_topic_msg_enable");
        UserSP.getInstance().remove("enterprise_topic_doc_enable");
        UserSP.getInstance().remove("enterprise_topic_mail_enable");
        UserSP.getInstance().remove("enterprise_topic_tenant_enable");
    }

    /* renamed from: a */
    public UserASSetting mo186724a() {
        UserASSetting.C49531a aVar = new UserASSetting.C49531a();
        FeatureSetting.C49459a aVar2 = new FeatureSetting.C49459a();
        aVar2.mo172574a(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("enterprise_topic_msg_enable", true))));
        aVar2.mo172578c(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("enterprise_topic_doc_enable", true))));
        aVar2.mo172577b(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("enterprise_topic_mail_enable", true))));
        aVar2.mo172575a(Boolean.valueOf(UserSP.getInstance().getBoolean("enterprise_topic_tenant_enable", false)));
        return aVar.mo172744a(aVar2.build()).build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public CorrectionSetting mo186728b() {
        CorrectionSetting.C49441a aVar = new CorrectionSetting.C49441a();
        aVar.mo172524a(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("error_correction_msg_enable", true))));
        aVar.mo172527c(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("error_correction_doc_enable", true))));
        aVar.mo172526b(new SceneSetting(Boolean.valueOf(UserSP.getInstance().getBoolean("error_correction_mail_enable", true))));
        return aVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo186725a(CorrectionSetting correctionSetting) {
        if (correctionSetting.mmessenger_setting != null) {
            mo186727a("error_correction_msg_enable", correctionSetting.mmessenger_setting.mis_enabled.booleanValue());
        }
        if (correctionSetting.mdocs_setting != null) {
            mo186727a("error_correction_doc_enable", correctionSetting.mdocs_setting.mis_enabled.booleanValue());
        }
        if (correctionSetting.mmail_setting != null) {
            mo186727a("error_correction_mail_enable", correctionSetting.mmail_setting.mis_enabled.booleanValue());
        }
    }

    /* renamed from: a */
    public void mo186726a(FeatureSetting featureSetting) {
        if (featureSetting.mmessenger_setting != null) {
            mo186727a("enterprise_topic_msg_enable", featureSetting.mmessenger_setting.mis_enabled.booleanValue());
        }
        if (featureSetting.mdocs_setting != null) {
            mo186727a("enterprise_topic_doc_enable", featureSetting.mdocs_setting.mis_enabled.booleanValue());
        }
        if (featureSetting.mmail_setting != null) {
            mo186727a("enterprise_topic_mail_enable", featureSetting.mmail_setting.mis_enabled.booleanValue());
        }
        if (featureSetting.mis_tenant_enabled != null) {
            mo186727a("enterprise_topic_tenant_enable", featureSetting.mis_tenant_enabled.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo186727a(String str, boolean z) {
        this.f135061a.put(str, Boolean.valueOf(z));
        UserSP.getInstance().putBoolean(str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo186729b(String str, boolean z) {
        Boolean bool = this.f135061a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return UserSP.getInstance().getBoolean(str, z);
    }
}
