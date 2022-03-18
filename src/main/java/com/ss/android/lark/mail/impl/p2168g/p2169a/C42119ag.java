package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.bytedance.lark.pb.email.client.v1.FilterStatus;
import com.ss.android.lark.mail.impl.entity.MailThreadStatus;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.mail.impl.g.a.ag */
public class C42119ag extends C42128h<FilterStatus, MailThreadStatus> {
    public C42119ag(C42129i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public MailThreadStatus mo152042b(FilterStatus filterStatus, MailThreadStatus mailThreadStatus) {
        if (mailThreadStatus == null) {
            mailThreadStatus = new MailThreadStatus();
        }
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
        return mailThreadStatus;
    }

    /* renamed from: b */
    public FilterStatus mo152040a(FilterStatus filterStatus, MailThreadStatus mailThreadStatus) {
        FilterStatus.C16616a aVar = new FilterStatus.C16616a();
        if (mailThreadStatus.mo151738a()) {
            aVar.f43030a = true;
        }
        if (mailThreadStatus.mo151739b()) {
            aVar.f43030a = false;
        }
        if (mailThreadStatus.mo151743e()) {
            aVar.f43031b = true;
        }
        if (mailThreadStatus.mo151744f()) {
            aVar.f43031b = false;
        }
        if (mailThreadStatus.mo151740c()) {
            aVar.f43032c = true;
        }
        if (mailThreadStatus.mo151741d()) {
            aVar.f43032c = false;
        }
        return aVar.build();
    }
}
