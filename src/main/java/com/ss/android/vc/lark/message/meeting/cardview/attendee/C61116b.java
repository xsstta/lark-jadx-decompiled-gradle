package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import java.util.List;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.b */
public class C61116b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.b$a */
    public interface AbstractC61117a extends IModel {
        /* renamed from: a */
        AttendeeFromSource mo211399a();

        /* renamed from: b */
        String mo211400b();

        /* renamed from: c */
        String mo211401c();

        /* renamed from: d */
        String mo211402d();

        /* renamed from: e */
        String mo211403e();

        /* renamed from: f */
        List<ParticipantType> mo211404f();

        /* renamed from: g */
        List<Participant.DeviceType> mo211405g();

        /* renamed from: h */
        List<String> mo211406h();

        /* renamed from: i */
        List<Boolean> mo211407i();

        /* renamed from: j */
        List<Boolean> mo211408j();

        /* renamed from: k */
        boolean mo211409k();

        /* renamed from: l */
        long mo211410l();

        /* renamed from: m */
        String mo211411m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.b$b */
    public interface AbstractC61118b extends IView<AbstractC61119a> {

        /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.b$b$a */
        public interface AbstractC61119a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo211413a();

            /* renamed from: a */
            void mo211414a(String str);
        }

        /* renamed from: a */
        void mo211412a(String str, String str2, List<String> list, List<ParticipantType> list2, List<Participant.DeviceType> list3, List<Boolean> list4, List<Boolean> list5, String str3, AttendeeFromSource attendeeFromSource, boolean z, long j, String str4);
    }
}
