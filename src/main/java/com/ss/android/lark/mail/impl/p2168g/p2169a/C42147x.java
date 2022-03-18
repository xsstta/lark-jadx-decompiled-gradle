package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.Address;
import com.bytedance.lark.pb.email.client.v1.FilterStatus;
import com.bytedance.lark.pb.email.client.v1.Message;
import com.bytedance.lark.pb.email.client.v1.UnsubscribeOption;
import com.ss.android.lark.mail.impl.entity.C42098k;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.entity.MailMessageDeliveryState;
import com.ss.android.lark.mail.impl.entity.MailMessageRecallState;
import com.ss.android.lark.mail.impl.entity.MailThreadStatus;
import com.ss.android.lark.mail.impl.entity.SendState;

/* renamed from: com.ss.android.lark.mail.impl.g.a.x */
public class C42147x extends C42128h<Message, MailMessage> {
    public C42147x(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailMessage mo152042b(Message message, MailMessage mailMessage) {
        super.mo152042b((Object) message, (Object) mailMessage);
        if (mailMessage == null) {
            mailMessage = new MailMessage();
        }
        mailMessage.mo151578a(message.id);
        mailMessage.mo151571a(this.f107148a.f107152c.mo152042b(message.from, (MailAddress) null));
        mailMessage.mo151579a(this.f107148a.f107150a.mo152106a(message.to, this.f107148a.f107152c));
        mailMessage.mo151584b(this.f107148a.f107150a.mo152106a(message.cc, this.f107148a.f107152c));
        mailMessage.mo151589c(this.f107148a.f107150a.mo152106a(message.bcc, this.f107148a.f107152c));
        mailMessage.mo151583b(message.subject);
        mailMessage.mo151588c(message.body_html);
        mailMessage.mo151593d(message.body_plaintext);
        mailMessage.mo151594d(this.f107148a.f107150a.mo152106a(message.attachments, this.f107148a.f107153d));
        mailMessage.mo151599e(this.f107148a.f107150a.mo152106a(message.images, this.f107148a.f107155f));
        mailMessage.mo151575a(this.f107148a.f107160k.mo152042b(message.status, (MailThreadStatus) null));
        mailMessage.mo151573a(this.f107148a.f107161l.mo152042b(message.delivery_state, (MailMessageDeliveryState) null));
        mailMessage.mo151567a(message.last_updated_timestamp.longValue());
        mailMessage.mo151582b(message.created_timestamp.longValue());
        mailMessage.mo151587c(message.thread_index.longValue());
        mailMessage.mo151580a(message.is_read.booleanValue());
        if (message.calendar_event_card != null) {
            mailMessage.mo151572a(this.f107148a.f107159j.mo152042b(message.calendar_event_card, (MailCalendar) null));
        }
        if (message.security_level != null) {
            mailMessage.mo151570a(message.security_level);
        }
        mailMessage.mo151590c(message.is_body_clipped.booleanValue());
        mailMessage.mo151574a(this.f107148a.f107168s.mo152042b(message.recall_status, (MailMessageRecallState) null));
        mailMessage.mo151595d(message.can_reply_all.booleanValue());
        mailMessage.mo151609i(message.language_identifier);
        mailMessage.mo151577a(this.f107148a.f107173x.mo152042b(message.unsubscribe_option, (C42098k) null));
        if (message.schedule_send_timestamp != null) {
            mailMessage.mo151592d(message.schedule_send_timestamp.longValue());
        }
        mailMessage.mo151600e(message.is_send_separately.booleanValue());
        mailMessage.mo151607h(message.locale_language);
        mailMessage.mo151569a(message.report_type);
        mailMessage.mo151603f(message.is_suspect.booleanValue());
        mailMessage.mo151568a(message.redirect_type);
        if (message.send_state != null) {
            mailMessage.mo151576a(SendState.fromValue(message.send_state.getValue()));
        }
        return mailMessage;
    }

    /* renamed from: b */
    public Message mo152040a(Message message, MailMessage mailMessage) {
        super.mo152040a((Object) message, (Object) mailMessage);
        Message.C16966a aVar = new Message.C16966a();
        aVar.mo59926a(mailMessage.mo151581b());
        aVar.mo59915a(this.f107148a.f107152c.mo152040a((Address) null, mailMessage.mo151586c()));
        aVar.mo59927a(this.f107148a.f107150a.mo152107b(mailMessage.mo151591d(), this.f107148a.f107152c));
        aVar.mo59932b(this.f107148a.f107150a.mo152107b(mailMessage.mo151598e(), this.f107148a.f107152c));
        aVar.mo59936c(this.f107148a.f107150a.mo152107b(mailMessage.mo151601f(), this.f107148a.f107152c));
        aVar.mo59931b(mailMessage.mo151604g());
        aVar.mo59935c(mailMessage.mo151606h());
        aVar.mo59939d(mailMessage.mo151608i());
        aVar.mo59940d(this.f107148a.f107150a.mo152107b(mailMessage.mo151610j(), this.f107148a.f107153d));
        aVar.mo59942e(this.f107148a.f107150a.mo152107b(mailMessage.mo151611k(), this.f107148a.f107155f));
        aVar.mo59916a(this.f107148a.f107160k.mo152040a((FilterStatus) null, mailMessage.mo151612l()));
        aVar.mo59917a(this.f107148a.f107161l.mo152040a((Message.DeliveryState) null, mailMessage.mo151613m()));
        aVar.mo59925a(Long.valueOf(mailMessage.mo151614n()));
        aVar.mo59930b(Long.valueOf(mailMessage.mo151615o()));
        aVar.mo59924a(Boolean.valueOf(mailMessage.mo151616p()));
        aVar.mo59934c(Long.valueOf(mailMessage.mo151617q()));
        aVar.mo59929b(Boolean.valueOf(mailMessage.mo151550C()));
        aVar.mo59918a(this.f107148a.f107168s.mo152040a((Message.RecallStatus) null, mailMessage.mo151551D()));
        aVar.mo59941e(mailMessage.mo151555H());
        aVar.mo59922a(mailMessage.mo151565a());
        aVar.mo59923a(this.f107148a.f107173x.mo152040a((UnsubscribeOption) null, mailMessage.mo151557J()));
        aVar.mo59938d(Long.valueOf(mailMessage.mo151559L()));
        aVar.mo59933c(Boolean.valueOf(mailMessage.mo151560M()));
        aVar.mo59920a(mailMessage.mo151562O());
        aVar.mo59937d(Boolean.valueOf(mailMessage.mo151563P()));
        aVar.mo59943f(mailMessage.mo151556I());
        aVar.mo59919a(mailMessage.mo151564Q());
        if (mailMessage.mo151561N() != null) {
            aVar.mo59921a(com.bytedance.lark.pb.email.client.v1.SendState.fromValue(mailMessage.mo151561N().getValue()));
        }
        return aVar.build();
    }
}
