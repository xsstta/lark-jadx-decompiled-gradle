package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.bytedance.lark.pb.email.client.v1.Draft;
import com.bytedance.lark.pb.email.client.v1.Label;
import com.bytedance.lark.pb.email.client.v1.MailAccount;
import com.bytedance.lark.pb.email.client.v1.MailGetSignatureResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.bytedance.lark.pb.email.client.v1.MailSignatureUsage;
import com.bytedance.lark.pb.email.client.v1.MailVacationResponder;
import com.bytedance.lark.pb.email.client.v1.Message;
import com.bytedance.lark.pb.email.client.v1.MessageItem;
import com.bytedance.lark.pb.email.client.v1.Setting;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.C42094f;
import com.ss.android.lark.mail.impl.entity.C42095h;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.EngagementSettings;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EmailSignature;
import com.ss.android.lark.pb.mailentities.MailSendStatusDetail;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.g.a.j */
public class C42130j {

    /* renamed from: a */
    C42129i f107176a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.g.a.j$a */
    public static class C42132a {

        /* renamed from: a */
        public static final C42130j f107177a = new C42130j();
    }

    /* renamed from: a */
    public static C42130j m168150a() {
        return C42132a.f107177a;
    }

    /* renamed from: a */
    public List<MailThread> mo152085a(List<MailGetThreadListResponse.ThreadItem> list) {
        return this.f107176a.f107150a.mo152106a(list, this.f107176a.f107154e);
    }

    /* renamed from: a */
    public MailThread mo152081a(MailGetThreadListResponse.ThreadItem threadItem) {
        return this.f107176a.f107154e.mo152042b(threadItem, new MailThread());
    }

    /* renamed from: a */
    public C42093e mo152082a(MailAccount mailAccount) {
        return this.f107176a.f107169t.mo152042b(mailAccount, (C42093e) null);
    }

    /* renamed from: a */
    public C42094f mo152083a(Setting setting) {
        return this.f107176a.f107165p.mo152042b(setting, (C42094f) null);
    }

    /* renamed from: a */
    public C42095h mo152084a(MailGetSignatureResponse mailGetSignatureResponse) {
        return this.f107176a.f107175z.mo152042b(mailGetSignatureResponse, (C42095h) null);
    }

    private C42130j() {
        this.f107176a = new C42129i();
    }

    /* renamed from: a */
    public Address mo152072a(MailAddress mailAddress) {
        return this.f107176a.f107152c.mo152040a((Address) null, mailAddress);
    }

    /* renamed from: b */
    public List<MailDraft> mo152086b(List<Draft> list) {
        return this.f107176a.f107150a.mo152106a(list, this.f107176a.f107156g);
    }

    /* renamed from: c */
    public List<C42097j> mo152087c(List<MessageItem> list) {
        return this.f107176a.f107150a.mo152106a(list, this.f107176a.f107157h);
    }

    /* renamed from: d */
    public List<MailLabelEntity> mo152088d(List<Label> list) {
        return this.f107176a.f107150a.mo152106a(list, this.f107176a.f107162m);
    }

    /* renamed from: e */
    public List<SendStatusDetail> mo152089e(List<MailSendStatusDetail> list) {
        return this.f107176a.f107150a.mo152106a(list, this.f107176a.f107174y);
    }

    /* renamed from: a */
    public Draft mo152073a(MailDraft mailDraft) {
        return this.f107176a.f107156g.mo152040a((Draft) null, mailDraft);
    }

    /* renamed from: a */
    public MailSignatureUsage mo152074a(EntSignatureUsage entSignatureUsage) {
        return this.f107176a.f107149A.mo152040a((MailSignatureUsage) null, entSignatureUsage);
    }

    /* renamed from: a */
    public MailVacationResponder mo152075a(EmailAutoReply emailAutoReply) {
        return this.f107176a.f107163n.mo152040a((MailVacationResponder) null, emailAutoReply);
    }

    /* renamed from: a */
    public MailDraft mo152078a(Draft draft) {
        return this.f107176a.f107156g.mo152042b(draft, (MailDraft) null);
    }

    /* renamed from: a */
    public MailLabelEntity mo152079a(Label label) {
        return this.f107176a.f107162m.mo152042b(label, (MailLabelEntity) null);
    }

    /* renamed from: a */
    public MailMessage mo152080a(Message message) {
        return this.f107176a.f107158i.mo152042b(message, (MailMessage) null);
    }

    /* renamed from: a */
    public Setting.C16982a mo152076a(Setting.C16982a aVar, EngagementSettings.Builder aVar2) {
        return this.f107176a.f107167r.mo152096a(aVar, aVar2);
    }

    /* renamed from: a */
    public Setting.C16982a mo152077a(Setting.C16982a aVar, EmailSignature emailSignature) {
        return this.f107176a.f107172w.mo152051a(aVar, emailSignature);
    }
}
