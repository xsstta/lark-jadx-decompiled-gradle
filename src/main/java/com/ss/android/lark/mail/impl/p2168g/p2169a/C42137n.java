package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.SmartInboxOnboarding;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;

/* renamed from: com.ss.android.lark.mail.impl.g.a.n */
public class C42137n extends C42128h<Setting, EngagementSettings> {
    /* renamed from: b */
    public Setting mo152040a(Setting setting, EngagementSettings gVar) {
        return null;
    }

    public C42137n(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public Setting.C16982a mo152096a(Setting.C16982a aVar, EngagementSettings.Builder aVar2) {
        if (aVar2 == null) {
            return aVar;
        }
        if (aVar2.mo151926b() != null) {
            aVar.mo59997f(aVar2.mo151926b());
        }
        if (aVar2.mo151930e() != null) {
            aVar.mo59990b(aVar2.mo151930e());
        }
        if (aVar2.mo151931f() != null) {
            aVar.mo59993c(aVar2.mo151931f());
        }
        if (aVar2.mo151929d() != null) {
            aVar.mo59985a(aVar2.mo151929d());
        }
        if (aVar2.mo151928c() != null) {
            aVar.mo59977a(Setting.OnboardingState.fromValue(aVar2.mo151928c().intValue()));
        }
        if (aVar2.mo151932g() != null) {
            aVar.mo59981a(new SmartInboxOnboarding(Boolean.valueOf(aVar2.mo151932g().mo151934a()), Boolean.valueOf(aVar2.mo151932g().mo151935b())));
        }
        if (aVar2.mo151933h() != null) {
            aVar.mo60000i(aVar2.mo151933h());
        }
        return aVar;
    }

    /* renamed from: a */
    public EngagementSettings mo152042b(Setting setting, EngagementSettings gVar) {
        EngagementSettings.Builder aVar = new EngagementSettings.Builder();
        if (setting != null) {
            if (setting.onboarding_state != null) {
                aVar.mo151919a(setting.onboarding_state.getValue());
            }
            if (setting.last_onboarding_prompt_display_timestamp != null) {
                aVar.mo151920a(setting.last_onboarding_prompt_display_timestamp.longValue());
            }
            if (setting.last_visit_important_label_timestamp != null) {
                aVar.mo151924b(setting.last_visit_important_label_timestamp.longValue());
            }
            if (setting.last_visit_other_label_timestamp != null) {
                aVar.mo151927c(setting.last_visit_other_label_timestamp.longValue());
            }
            if (setting.status_is_migration_done_prompt_rendered != null) {
                aVar.mo151922a(setting.status_is_migration_done_prompt_rendered.booleanValue());
            }
            if (setting.status_smart_inbox_onboarding != null) {
                aVar.mo151921a(new EngagementSettings.SmartInboxState(setting.status_smart_inbox_onboarding.smart_inbox_prompt_rendered.booleanValue(), setting.status_smart_inbox_onboarding.smart_inbox_alert_rendered.booleanValue()));
            }
            if (setting.email_recall != null) {
                aVar.mo151925b(setting.email_recall.booleanValue());
            }
        }
        return aVar.mo151923a();
    }
}
