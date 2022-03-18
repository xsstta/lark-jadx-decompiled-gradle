package com.ss.android.vc.meeting.module.preview.calender;

import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;

/* renamed from: com.ss.android.vc.meeting.module.preview.calender.a */
class C62697a implements AbstractC62650a {

    /* renamed from: com.ss.android.vc.meeting.module.preview.calender.a$a */
    interface AbstractC62698a extends AbstractC62650a.AbstractC62651a<AbstractC62699a> {

        /* renamed from: com.ss.android.vc.meeting.module.preview.calender.a$a$a */
        public interface AbstractC62699a extends AbstractC62650a.AbstractC62651a.AbstractC62652a {
        }

        /* renamed from: a */
        void mo216644a(AbstractC63598b<JoinCalendarGroupMeetingEntity> bVar);

        /* renamed from: b */
        void mo216645b(AbstractC63598b bVar);

        /* renamed from: e */
        String mo216646e();

        void n_(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.preview.calender.a$b */
    interface AbstractC62700b extends AbstractC62650a.AbstractC62653b<AbstractC62701a> {

        /* renamed from: com.ss.android.vc.meeting.module.preview.calender.a$b$a */
        public interface AbstractC62701a extends AbstractC62650a.AbstractC62653b.AbstractC62654a {
        }

        /* renamed from: a */
        void mo216648a(JoinCalendarGroupMeetingEntity joinCalendarGroupMeetingEntity);

        /* renamed from: a */
        void mo216649a(JoinMeetingEntity joinMeetingEntity);

        /* renamed from: a */
        void mo216650a(C63602e eVar);
    }
}
