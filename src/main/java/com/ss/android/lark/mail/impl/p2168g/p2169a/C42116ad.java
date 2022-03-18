package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.EmailAlias;
import com.bytedance.lark.pb.email.client.v1.MailVacationResponder;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.bytedance.lark.pb.email.client.v1.Signature;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;
import com.ss.android.lark.mail.impl.entity.MailOnBoardStatus;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ad */
public class C42116ad extends C42128h<Setting, C42094f> {
    public C42116ad(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public C42094f mo152042b(Setting setting, C42094f fVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        if (fVar == null) {
            fVar = new C42094f();
        }
        if (setting == null) {
            return fVar;
        }
        boolean z6 = false;
        if (setting.new_mail_notification == null) {
            z = false;
        } else {
            z = setting.new_mail_notification.booleanValue();
        }
        fVar.mo151874a(z);
        if (setting.all_new_mail_notification_switch == null) {
            z2 = false;
        } else {
            z2 = setting.all_new_mail_notification_switch.booleanValue();
        }
        fVar.mo151895i(z2);
        if (setting.new_mail_notification_channel == null) {
            i = 0;
        } else {
            i = setting.new_mail_notification_channel.intValue();
        }
        fVar.mo151876b(i);
        fVar.mo151865a(setting.user_type);
        if (setting.client_tab_visible == null) {
            z3 = false;
        } else {
            z3 = setting.client_tab_visible.booleanValue();
        }
        fVar.mo151885e(z3);
        if (setting.smart_inbox_mode == null) {
            z4 = false;
        } else {
            z4 = setting.smart_inbox_mode.booleanValue();
        }
        fVar.mo151881c(z4);
        if (setting.smart_inbox_visible == null) {
            z5 = false;
        } else {
            z5 = setting.smart_inbox_visible.booleanValue();
        }
        fVar.mo151883d(z5);
        fVar.mo151873a(this.f107148a.f107150a.mo152106a(setting.email_client_configs, this.f107148a.f107171v));
        fVar.mo151872a(this.f107148a.f107172w.mo152042b(setting, (EmailSignature) null));
        EmailAutoReply.C42059a aVar = new EmailAutoReply.C42059a(false, 0, 0, "");
        if (setting.vacation_responder != null) {
            fVar.mo151868a(this.f107148a.f107163n.mo152042b(setting.vacation_responder, (EmailAutoReply) null));
        } else {
            fVar.mo151868a(aVar.mo151154a());
        }
        if (setting.email_alias != null) {
            fVar.mo151867a(this.f107148a.f107164o.mo152042b(setting.email_alias, (EmailAliasList) null));
        }
        if (setting.smart_reply_open != null) {
            z6 = setting.smart_reply_open.booleanValue();
        }
        fVar.mo151878b(z6);
        if (setting.account_revoke_notify_popup_visible != null) {
            fVar.mo151887f(setting.account_revoke_notify_popup_visible.booleanValue());
        }
        fVar.mo151870a(this.f107148a.f107167r.mo152042b(setting, (EngagementSettings) null));
        if (setting.undo_send_enable != null) {
            fVar.mo151871a(new C42101o.C42103a().mo152008a(setting.undo_send_enable.booleanValue()).mo152007a(setting.undo_time.longValue()).mo152009a());
        }
        if (setting.mail_onboard_status != null) {
            fVar.mo151869a(MailOnBoardStatus.fromValue(setting.mail_onboard_status.getValue()));
        }
        fVar.mo151877b(setting.translation_recommendation_skip_language);
        if (setting.reply_language != null) {
            fVar.mo151864a(setting.reply_language.getValue());
        }
        if (setting.storageLimitNotify != null) {
            fVar.mo151866a(setting.storageLimitNotify);
        }
        if (setting.show_api_onboarding_page != null) {
            fVar.mo151890g(setting.show_api_onboarding_page.booleanValue());
        }
        if (setting.enable_conversation_mode == null || (!C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode") && !C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode_internal"))) {
            fVar.mo151892h(true);
        } else {
            fVar.mo151892h(setting.enable_conversation_mode.booleanValue());
        }
        return fVar;
    }

    /* renamed from: b */
    public Setting mo152040a(Setting setting, C42094f fVar) {
        EmailAlias emailAlias;
        Setting.UserType userType;
        EngagementSettings.Builder aVar = null;
        if (fVar == null) {
            return null;
        }
        if (fVar.mo151896j() != null) {
            emailAlias = this.f107148a.f107164o.mo152040a((EmailAlias) null, fVar.mo151896j());
        } else {
            emailAlias = null;
        }
        Setting.C16982a aVar2 = new Setting.C16982a();
        if (fVar.mo151898l() != null) {
            aVar2.mo60001j(Boolean.valueOf(fVar.mo151898l().mo152005a())).mo59995d(Long.valueOf(fVar.mo151898l().mo152006b()));
        }
        if (fVar.mo151901o() != null) {
            aVar2.mo59978a(Setting.ReplyLanguage.fromValue(fVar.mo151901o().getValue()));
        }
        if (fVar.mo151884e() != null) {
            userType = Setting.UserType.fromValue(fVar.mo151884e().getValue());
        } else {
            userType = null;
        }
        aVar2.mo59983a(Boolean.valueOf(fVar.mo151875a())).mo60004m(Boolean.valueOf(fVar.mo151906t())).mo59984a(Integer.valueOf(fVar.mo151908u())).mo59980a(new Signature(Boolean.valueOf(fVar.mo151880c().mo155470b()), fVar.mo151880c().mo155472d(), this.f107148a.f107150a.mo152107b(fVar.mo151880c().mo155474e(), this.f107148a.f107155f))).mo59989b(Boolean.valueOf(fVar.mo151882d().mo155172b())).mo59996e(Boolean.valueOf(fVar.mo151882d().mo155170a())).mo59992c(Boolean.valueOf(fVar.mo151888f())).mo59986a(this.f107148a.f107150a.mo152107b(fVar.mo151889g(), this.f107148a.f107171v)).mo59979a(userType).mo59975a(emailAlias).mo59976a(this.f107148a.f107163n.mo152040a((MailVacationResponder) null, fVar.mo151891h())).mo59998g(Boolean.valueOf(fVar.mo151879b())).mo59999h(Boolean.valueOf(fVar.mo151897k())).mo59991b(fVar.mo151900n()).mo59982a(fVar.mo151903q());
        if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode") || C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode_internal")) {
            aVar2.mo60003l(Boolean.valueOf(fVar.mo151905s()));
        }
        this.f107148a.f107172w.mo152051a(aVar2, fVar.mo151880c());
        C42137n nVar = this.f107148a.f107167r;
        if (fVar.mo151899m() != null) {
            aVar = new EngagementSettings.Builder(fVar.mo151899m());
        }
        nVar.mo152096a(aVar2, aVar);
        return aVar2.build();
    }
}
