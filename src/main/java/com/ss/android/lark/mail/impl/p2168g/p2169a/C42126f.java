package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailEventReply;
import com.ss.android.lark.mail.impl.entity.MailFullEventInfo;
import com.ss.android.lark.mail.impl.entity.MailPartEventInfo;

/* renamed from: com.ss.android.lark.mail.impl.g.a.f */
public class C42126f extends C42128h<EmailCalendarEventInfo, MailCalendar> {
    public C42126f(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: b */
    public EmailCalendarEventInfo mo152040a(EmailCalendarEventInfo emailCalendarEventInfo, MailCalendar mailCalendar) {
        super.mo152040a((Object) emailCalendarEventInfo, (Object) mailCalendar);
        return null;
    }

    /* renamed from: a */
    private void m168139a(MailCalendar mailCalendar, EmailCalendarEventInfo.PartEventInfo partEventInfo) {
        MailPartEventInfo mailPartEventInfo = new MailPartEventInfo();
        mailPartEventInfo.mo151645a(partEventInfo.inter_type);
        mailPartEventInfo.mo151647a(partEventInfo.is_self_attendee_optional.booleanValue());
        mailPartEventInfo.mo151646a(partEventInfo.summary);
        mailCalendar.mo151255a(mailPartEventInfo);
    }

    /* renamed from: a */
    private void m168138a(MailCalendar mailCalendar, EmailCalendarEventInfo.FullEventInfo fullEventInfo) {
        MailFullEventInfo mailFullEventInfo = new MailFullEventInfo();
        mailFullEventInfo.mo151441a(fullEventInfo.is_all_day.booleanValue());
        mailFullEventInfo.mo151440a(fullEventInfo.attendee_emails);
        if (fullEventInfo.conflict_info == null || fullEventInfo.conflict_info.conflict_type == ConflictType.NONE) {
            mailFullEventInfo.mo151448c(false);
        } else {
            mailFullEventInfo.mo151446c(fullEventInfo.conflict_info.conflict_time.longValue());
            mailFullEventInfo.mo151438a(fullEventInfo.conflict_info.conflict_type);
            mailFullEventInfo.mo151448c(true);
        }
        mailFullEventInfo.mo151443b(fullEventInfo.end_time.longValue());
        mailFullEventInfo.mo151444b(fullEventInfo.end_timezone);
        mailFullEventInfo.mo151437a(fullEventInfo.inter_type);
        mailFullEventInfo.mo151451d(fullEventInfo.location);
        mailFullEventInfo.mo151456f(fullEventInfo.organizer_email);
        mailFullEventInfo.mo151454e(fullEventInfo.rrule);
        mailFullEventInfo.mo151445b(fullEventInfo.is_self_attendee_optional.booleanValue());
        mailFullEventInfo.mo151436a(fullEventInfo.self_attendee_status);
        mailFullEventInfo.mo151435a(fullEventInfo.start_time.longValue());
        mailFullEventInfo.mo151439a(fullEventInfo.start_timezone);
        mailFullEventInfo.mo151447c(fullEventInfo.summary);
        mailCalendar.mo151254a(mailFullEventInfo);
    }

    /* renamed from: a */
    public MailCalendar mo152042b(EmailCalendarEventInfo emailCalendarEventInfo, MailCalendar mailCalendar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super.mo152042b((Object) emailCalendarEventInfo, (Object) mailCalendar);
        if (mailCalendar == null) {
            mailCalendar = new MailCalendar();
        }
        mailCalendar.mo151256a(emailCalendarEventInfo.event_server_id);
        mailCalendar.mo151260b(emailCalendarEventInfo.calendar_id);
        mailCalendar.mo151263c(emailCalendarEventInfo.uid);
        mailCalendar.mo151250a(emailCalendarEventInfo.original_time.longValue());
        mailCalendar.mo151266d(emailCalendarEventInfo.mail_id);
        mailCalendar.mo151270e(emailCalendarEventInfo.sender_email);
        mailCalendar.mo151251a(emailCalendarEventInfo.type);
        boolean z6 = true;
        if (emailCalendarEventInfo.event_invite != null) {
            z = true;
        } else {
            z = false;
        }
        mailCalendar.mo151257a(z);
        if (emailCalendarEventInfo.event_cancel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        mailCalendar.mo151261b(z2);
        if (emailCalendarEventInfo.event_update != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        mailCalendar.mo151264c(z3);
        if (emailCalendarEventInfo.event_update_outdated != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        mailCalendar.mo151267d(z4);
        if (emailCalendarEventInfo.event_update_outdated != null) {
            mailCalendar.mo151252a(emailCalendarEventInfo.event_update_outdated.outdated_type);
        }
        if (emailCalendarEventInfo.event_self_delete != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        mailCalendar.mo151271e(z5);
        if (emailCalendarEventInfo.event_self_delete != null) {
            mailCalendar.mo151259b(emailCalendarEventInfo.event_self_delete.original_type);
        }
        if (emailCalendarEventInfo.event_not_found == null) {
            z6 = false;
        }
        mailCalendar.mo151273f(z6);
        if (emailCalendarEventInfo.event_reply != null) {
            MailEventReply mailEventReply = new MailEventReply();
            mailEventReply.mo151422b(emailCalendarEventInfo.event_reply.is_all_day.booleanValue());
            mailEventReply.mo151420b(emailCalendarEventInfo.event_reply.end_time.longValue());
            mailEventReply.mo151421b(emailCalendarEventInfo.event_reply.end_timezone);
            mailEventReply.mo151417a(emailCalendarEventInfo.event_reply.is_latest.booleanValue());
            mailEventReply.mo151415a(emailCalendarEventInfo.event_reply.outdated_type);
            mailEventReply.mo151414a(emailCalendarEventInfo.event_reply.reply_status);
            mailEventReply.mo151424c(emailCalendarEventInfo.event_reply.rrule);
            mailEventReply.mo151413a(emailCalendarEventInfo.event_reply.start_time.longValue());
            mailEventReply.mo151416a(emailCalendarEventInfo.event_reply.start_timezone);
            mailCalendar.mo151253a(mailEventReply);
        }
        if (emailCalendarEventInfo.event_invite != null) {
            m168138a(mailCalendar, emailCalendarEventInfo.event_invite.event_info);
        } else if (emailCalendarEventInfo.event_update != null) {
            m168138a(mailCalendar, emailCalendarEventInfo.event_update.event_info);
        } else if (emailCalendarEventInfo.event_cancel != null) {
            m168139a(mailCalendar, emailCalendarEventInfo.event_cancel.event_info);
        } else if (emailCalendarEventInfo.event_reply != null) {
            m168139a(mailCalendar, emailCalendarEventInfo.event_reply.event_info);
        } else if (emailCalendarEventInfo.event_update_outdated != null) {
            m168139a(mailCalendar, emailCalendarEventInfo.event_update_outdated.event_info);
        } else if (emailCalendarEventInfo.event_self_delete != null) {
            m168139a(mailCalendar, emailCalendarEventInfo.event_self_delete.event_info);
        } else if (emailCalendarEventInfo.event_not_found != null) {
            m168138a(mailCalendar, emailCalendarEventInfo.event_not_found.event_info);
        }
        return mailCalendar;
    }
}
