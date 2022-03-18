package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.FilterStatus;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.bytedance.lark.pb.email.client.v1.Thread;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.MailThreadStatus;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ah */
public class C42120ah extends C42128h<MailGetThreadListResponse.ThreadItem, MailThread> {
    public C42120ah(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailThread mo152042b(MailGetThreadListResponse.ThreadItem threadItem, MailThread mailThread) {
        super.mo152042b((Object) threadItem, (Object) mailThread);
        if (mailThread == null) {
            mailThread = new MailThread();
        }
        m168113a(threadItem.thread, mailThread);
        if (threadItem.actions != null) {
            mailThread.mo151694c(threadItem.actions);
        }
        mailThread.mo151679a(threadItem.code);
        mailThread.mo151700d(threadItem.is_external.booleanValue());
        return mailThread;
    }

    /* renamed from: a */
    private MailThread m168113a(Thread thread, MailThread mailThread) {
        if (thread != null) {
            mailThread.mo151682a(thread.id);
            mailThread.mo151678a(thread.message_count.longValue());
            MailThreadStatus mailThreadStatus = new MailThreadStatus();
            FilterStatus filterStatus = thread.status;
            if (filterStatus != null) {
                if (filterStatus.is_archived.booleanValue()) {
                    mailThreadStatus.mo151737a(SmActions.ACTION_ONTHECALL_EXIT);
                }
                if (filterStatus.is_spam.booleanValue()) {
                    mailThreadStatus.mo151737a(32);
                }
                if (filterStatus.is_deleted.booleanValue()) {
                    mailThreadStatus.mo151737a(8);
                }
            }
            mailThread.mo151681a(mailThreadStatus);
            mailThread.mo151683a(this.f107148a.f107150a.mo152106a(thread.display_address, this.f107148a.f107152c));
            mailThread.mo151688b(thread.message_subject);
            mailThread.mo151693c(thread.message_plaintext);
            mailThread.mo151698d(thread.draft_plaintext);
            mailThread.mo151687b(thread.last_updated_timestamp.longValue());
            mailThread.mo151684a(thread.has_attachment.booleanValue());
            mailThread.mo151690b(thread.is_read.booleanValue());
            mailThread.mo151705e(thread.is_flagged.booleanValue());
            mailThread.mo151692c(thread.last_message_timestamp.longValue());
            mailThread.mo151699d(thread.label_ids);
            mailThread.mo151709f(thread.is_compose_draft.booleanValue());
            mailThread.mo151703e(thread.schedule_send_message_count.longValue());
            mailThread.mo151697d(thread.schedule_send_timestamp.longValue());
            mailThread.mo151689b(this.f107148a.f107150a.mo152106a(thread.bcc_address, this.f107148a.f107152c));
            mailThread.mo151711g(thread.has_reply_thread.booleanValue());
        }
        return mailThread;
    }

    /* renamed from: b */
    public MailGetThreadListResponse.ThreadItem mo152040a(MailGetThreadListResponse.ThreadItem threadItem, MailThread mailThread) {
        super.mo152040a((Object) threadItem, (Object) mailThread);
        FilterStatus filterStatus = new FilterStatus(Boolean.valueOf(mailThread.mo151691c().mo151738a()), Boolean.valueOf(mailThread.mo151691c().mo151743e()), Boolean.valueOf(mailThread.mo151691c().mo151740c()));
        Thread.C16992a aVar = new Thread.C16992a();
        aVar.mo60030a(mailThread.mo151676a()).mo60029a(Long.valueOf(mailThread.mo151686b())).mo60027a(filterStatus).mo60031a(this.f107148a.f107150a.mo152107b(mailThread.mo151696d(), this.f107148a.f107152c)).mo60035b(mailThread.mo151702e()).mo60039c(mailThread.mo151707f()).mo60042d(mailThread.mo151710g()).mo60034b(Long.valueOf(mailThread.mo151717l())).mo60043e(Boolean.valueOf(mailThread.mo151715j())).mo60028a(Boolean.valueOf(mailThread.mo151716k())).mo60038c(Long.valueOf(mailThread.mo151719n())).mo60033b(Boolean.valueOf(mailThread.mo151727v())).mo60037c(Boolean.valueOf(mailThread.mo151730x())).mo60041d(Long.valueOf(mailThread.mo151732z())).mo60044e(Long.valueOf(mailThread.mo151731y())).mo60036b(this.f107148a.f107150a.mo152107b(mailThread.mo151720o(), this.f107148a.f107152c)).mo60040d(Boolean.valueOf(mailThread.mo151674A()));
        return new MailGetThreadListResponse.ThreadItem(aVar.build(), mailThread.mo151721p(), mailThread.mo151725t(), Boolean.valueOf(mailThread.mo151726u()));
    }
}
