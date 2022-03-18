package com.ss.android.vc.meeting.module.meetingdialog.sip;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.net.request.AbstractC63598b;

public interface ISIPInviteContract {

    public enum InviteState {
        IDLE,
        CALLING,
        CANCELED,
        BUSY,
        REFUSE,
        FORBIDDEN,
        SUCCEED
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract$a */
    public interface AbstractC62429a extends IModel {
        /* renamed from: a */
        void mo215828a(String str, String str2, ParticipantType participantType);

        /* renamed from: a */
        void mo215829a(String str, String str2, ParticipantType participantType, AbstractC63598b<C60955ab> bVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract$b */
    public interface AbstractC62430b extends IView<AbstractC62431a> {

        /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.sip.ISIPInviteContract$b$a */
        public interface AbstractC62431a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo215834a();

            /* renamed from: b */
            void mo215835b();
        }

        /* renamed from: a */
        void mo215830a(InviteState inviteState);

        ParticipantType getParticipantType();

        String getUri();

        void setState(InviteState inviteState);
    }
}
