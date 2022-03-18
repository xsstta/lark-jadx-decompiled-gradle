package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62330g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

public class InMeetingParticipantControlPopWindow extends BasePopupWindow implements AbstractC61298f {

    /* renamed from: a */
    private final View$OnClickListenerC62330g f156884a;

    /* renamed from: b */
    private final C61303k f156885b;

    /* renamed from: c */
    private Participant f156886c;

    /* renamed from: d */
    private final GridType f156887d;

    /* renamed from: e */
    private final Activity f156888e;

    public enum GridType {
        GRID_VIEW,
        GALLERY,
        FLOAT,
        FULL_SCREEN
    }

    /* renamed from: a */
    private void m243792a() {
        m243794b();
    }

    /* renamed from: b */
    private void m243794b() {
        C61303k kVar = this.f156885b;
        if (kVar != null) {
            kVar.mo212112a(this);
        }
    }

    /* renamed from: c */
    private void m243795c() {
        C61303k kVar = this.f156885b;
        if (kVar != null) {
            kVar.mo212152b(this);
        }
    }

    @Override // com.larksuite.framework.ui.BasePopupWindow
    public void dismiss() {
        C60700b.m235851b("InMeetingParticipantControlPopWindow", "[dismiss]", "PopupWindow is dismissed");
        try {
            super.dismiss();
            m243795c();
        } catch (IllegalArgumentException e) {
            C60700b.m235864f("InMeetingParticipantControlPopWindow", "[dismiss2]]", e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo100027a(View view) {
        if (this.f156888e != null) {
            C60700b.m235851b("InMeetingParticipantControlPopWindow", "[show]", "PopupWindow is shown");
            try {
                Point b = m243793b(view);
                showAsDropDown(view, b.x, b.y, 8388611);
            } catch (IllegalArgumentException e) {
                C60700b.m235864f("InMeetingParticipantControlPopWindow", "[show2]", e.getMessage());
            } catch (WindowManager.BadTokenException e2) {
                C60700b.m235864f("InMeetingParticipantControlPopWindow", "[show3]", e2.getMessage());
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61303k kVar = this.f156885b;
        if (kVar != null && kVar.mo212091I().mo212494b() != null && this.f156886c != null) {
            Participant a = this.f156885b.mo212091I().mo212494b().mo212589a(this.f156886c.getId(), this.f156886c.getParticipantType(), this.f156886c.getDeviceId());
            if (a == null) {
                C60700b.m235864f("InMeetingParticipantControlPopWindow", "[onInMeetingInfoUpdate]", "participant has left..." + this.f156886c.getRtcJoinId());
                dismiss();
            }
            this.f156886c = a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00de  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Point m243793b(android.view.View r18) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.InMeetingParticipantControlPopWindow.m243793b(android.view.View):android.graphics.Point");
    }

    public InMeetingParticipantControlPopWindow(Activity activity, C61303k kVar, GridType gridType, Participant participant) {
        super(-2, -2);
        this.f156885b = kVar;
        this.f156888e = activity;
        this.f156887d = gridType;
        participant = ParticipantUtil.m248732c(participant) ? kVar.mo212091I().mo212494b().mo212605j() : participant;
        this.f156886c = participant;
        View$OnClickListenerC62330g gVar = new View$OnClickListenerC62330g(activity, kVar, gridType, participant, this);
        this.f156884a = gVar;
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(C60773o.m236128f(R.color.transparent));
        mo93124a(false);
        setContentView(gVar.mo215576b());
        m243792a();
    }
}
