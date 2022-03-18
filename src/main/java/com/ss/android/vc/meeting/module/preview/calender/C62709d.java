package com.ss.android.vc.meeting.module.preview.calender;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.JoinCalendarGroupMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.C62725g;
import com.ss.android.vc.meeting.module.preview.calender.C62697a;

/* renamed from: com.ss.android.vc.meeting.module.preview.calender.d */
public class C62709d extends AbstractC62715f<C62697a.AbstractC62700b.AbstractC62701a> implements C62697a.AbstractC62700b {

    /* renamed from: Q */
    protected VcPreviewAvatarListView f157787Q;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        m245316C();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: s */
    public void mo216579s() {
        super.mo216579s();
        if (this.f157822e != null) {
            this.f157787Q = (VcPreviewAvatarListView) this.f157822e.findViewById(R.id.meeting_avatar_list);
        }
    }

    /* renamed from: C */
    private void m245316C() {
        String str;
        this.f157824g.setVisibility(0);
        if (this.f157818a.getArguments() != null) {
            str = this.f157818a.getArguments().getString("param_meeting_title");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = UIHelper.getString(R.string.View_G_ServerNoTitle);
        }
        this.f157824g.setText(mo216682b(str));
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216526a(VideoChat videoChat) {
        super.mo216526a(videoChat);
        if (videoChat != null && videoChat.getParticipants() != null && videoChat.getParticipants().size() >= 1) {
            this.f157787Q.setVisibility(0);
            this.f157787Q.mo208618a(videoChat.getId(), videoChat.getParticipants());
            this.f157787Q.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.preview.calender.$$Lambda$d$7QDv3rXRXfFpTSzgEDfH10GZxc */

                public final void onClick(View view) {
                    C62709d.m245317a(VideoChat.this, view);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.calender.C62697a.AbstractC62700b
    /* renamed from: a */
    public void mo216648a(JoinCalendarGroupMeetingEntity joinCalendarGroupMeetingEntity) {
        if (joinCalendarGroupMeetingEntity.f152596a == JoinCalendarGroupMeetingEntity.Type.CALENDAR_VOIP_BUSY) {
            LKUIToast.show(ar.m236694a(), (int) R.string.View_G_CurrentlyInCall);
        } else if (joinCalendarGroupMeetingEntity.f152596a == JoinCalendarGroupMeetingEntity.Type.CALENDAR_PARTICIPANT_LIMIT_EXCEED) {
            LKUIToast.show(ar.m236694a(), (int) R.string.View_M_CapacityReached);
        } else if (joinCalendarGroupMeetingEntity.f152596a == JoinCalendarGroupMeetingEntity.Type.CALENDAR_MEETING_OUT_OF_DATE) {
            LKUIToast.show(ar.m236694a(), (int) R.string.View_M_MeetingExpired);
        } else if (joinCalendarGroupMeetingEntity.f152596a != JoinCalendarGroupMeetingEntity.Type.CALENDAR_VERSION_LOW) {
            C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
        } else if (VideoChatModuleDependency.getAppUpgradeDependency().isHasNewVersion()) {
            mo216672A();
        } else {
            C60738ac.m236023a((int) R.string.View_G_FeatureNotSupported);
        }
        mo216528a((AbstractC62650a.AbstractC62655c) null);
    }

    C62709d(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m245317a(VideoChat videoChat, View view) {
        C62725g.m245472a(videoChat.getId(), videoChat.getSponsorUser(), videoChat.getVideoChatSettings().getTopic(), videoChat.getParticipants());
    }
}
