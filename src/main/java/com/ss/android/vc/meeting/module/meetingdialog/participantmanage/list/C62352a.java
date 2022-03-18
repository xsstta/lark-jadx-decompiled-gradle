package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62355b;
import com.ss.android.vc.meeting.utils.C63496i;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.a */
public class C62352a extends AbstractC62355b {

    /* renamed from: a */
    protected C61303k f156764a;

    /* renamed from: b */
    protected Activity f156765b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo215645d(ParticipantItem participantItem) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo215641a() {
        return C63496i.m248850d(this.f156764a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo215644c(ParticipantItem participantItem) {
        mo215645d(participantItem);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo215643b(ParticipantItem participantItem) {
        Participant participant;
        if (participantItem.mo215629a() != ParticipantItem.GroupType.USER || (participant = participantItem.f156729a) == null) {
            return false;
        }
        Participant.Status status = participant.getStatus();
        if ((status == null || status != Participant.Status.RINGING) && participantItem.mo215631b() != ParticipantItem.ParticipantType.SUGGESTION) {
            return C63496i.m248843a(participant, this.f156764a);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo215642a(ParticipantItem participantItem) {
        if (!DesktopUtil.m144307b() || participantItem.mo215629a() != ParticipantItem.GroupType.USER) {
            return false;
        }
        Participant participant = participantItem.f156729a;
        if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
            return C63496i.m248843a(participant, this.f156764a);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215640a(View view, View view2) {
        if (DesktopUtil.m144307b()) {
            view.setOnHoverListener(new View.OnHoverListener(view, view2) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$a$eYtv4OFrAafbo45l7t8piV9Zz9w */
                public final /* synthetic */ View f$0;
                public final /* synthetic */ View f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return C62352a.lambda$eYtv4OFrAafbo45l7t8piV9Zz9w(this.f$0, this.f$1, view, motionEvent);
                }
            });
        }
    }

    public C62352a(View view, C61303k kVar, Activity activity) {
        super(view);
        this.f156764a = kVar;
        this.f156765b = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m243657a(View view, View view2, View view3, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            view.setHovered(true);
            view2.setSelected(true);
            return true;
        } else if (motionEvent.getAction() != 10) {
            return false;
        } else {
            view.setHovered(false);
            view2.setSelected(false);
            return true;
        }
    }
}
