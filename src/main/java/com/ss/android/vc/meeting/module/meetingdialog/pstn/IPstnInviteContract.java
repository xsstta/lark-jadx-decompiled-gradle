package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.net.request.AbstractC63598b;
import java.util.List;

public interface IPstnInviteContract {

    public enum InviteState {
        IDLE,
        CALLING,
        CANCELED,
        BUSY,
        REFUSE,
        FORBIDDEN,
        SUCCEED
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$a */
    public interface AbstractC62388a extends IModel {
        /* renamed from: a */
        void mo215701a(String str, String str2);

        /* renamed from: a */
        void mo215702a(String str, String str2, String str3, AbstractC63598b<C60955ab> bVar);

        /* renamed from: a */
        void mo215703a(List<String> list, AbstractC63598b<List<Participant>> bVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$b */
    public interface AbstractC62389b extends IView<AbstractC62390a> {

        /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.IPstnInviteContract$b$a */
        public interface AbstractC62390a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo215710a();

            /* renamed from: b */
            void mo215711b();
        }

        /* renamed from: a */
        void mo215704a(C60987v vVar);

        /* renamed from: a */
        void mo215705a(InviteState inviteState);

        String getName();

        String getPhone();

        void setDefaultCountryCode(String str);

        void setState(InviteState inviteState);
    }
}
