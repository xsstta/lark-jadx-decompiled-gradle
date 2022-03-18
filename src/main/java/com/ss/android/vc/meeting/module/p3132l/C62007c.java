package com.ss.android.vc.meeting.module.p3132l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.p3132l.AbstractC62004a;
import com.ss.android.vc.statistics.event.ca;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;

/* renamed from: com.ss.android.vc.meeting.module.l.c */
public class C62007c extends AbstractC61424d implements AbstractC62004a.AbstractC62005a {

    /* renamed from: a */
    private Dialog f155798a;

    /* renamed from: b */
    private Dialog f155799b;

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onResume() {
        mo214639a();
        mo214641b();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().aA().mo214637a(this);
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().aA().mo214638b(this);
        try {
            Dialog dialog = this.f155798a;
            if (dialog != null && dialog.isShowing()) {
                this.f155798a.dismiss();
            }
            this.f155798a = null;
            Dialog dialog2 = this.f155799b;
            if (dialog2 != null && dialog2.isShowing()) {
                this.f155799b.dismiss();
            }
            this.f155799b = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3132l.AbstractC62004a.AbstractC62005a
    /* renamed from: a */
    public void mo214639a() {
        if ((getMeeting() == null || !getMeeting().aE().mo208293c() || !(getMeeting().mo212067p() == DisplayMode.WINDOW || getMeeting().mo212067p() == DisplayMode.FAST_ENTRY)) && getMeeting().aA().f155795a) {
            Dialog dialog = this.f155798a;
            if (dialog == null || !dialog.isShowing()) {
                C60700b.m235851b("PopupViewControl", "[showHostOpenCameraPopup]", "start");
                this.f155798a = VCDialogUtils.m236178a((Context) getActivity(), (int) R.string.View_M_HostCameraRequestStandard, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.p3132l.$$Lambda$c$BSEBeP9_WFKJ8LJ72RxrcSdOWLQ */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62007c.this.m242273d(dialogInterface, i);
                    }
                }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.p3132l.$$Lambda$c$e6rqycR4PGzSyUDbW9dVoA4JwY */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62007c.this.m242272c(dialogInterface, i);
                    }
                }, false);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3132l.AbstractC62004a.AbstractC62005a
    /* renamed from: b */
    public void mo214641b() {
        int i;
        Integer num;
        if ((getMeeting() == null || !getMeeting().aE().mo208293c() || !(getMeeting().mo212067p() == DisplayMode.WINDOW || getMeeting().mo212067p() == DisplayMode.FAST_ENTRY)) && getMeeting().aA().f155796b) {
            Dialog dialog = this.f155799b;
            if (dialog == null || !dialog.isShowing()) {
                boolean G = getMeeting().mo212092J().mo212510G();
                C60700b.m235851b("PopupViewControl", "[showHostOpenMicrophonePopup]", "mute = " + G);
                Activity activity = getActivity();
                if (G) {
                    i = R.string.View_MV_HostAskTurnOnEcho;
                } else {
                    i = R.string.View_M_HostMicRequestStandard;
                }
                $$Lambda$c$BI1xT2VjvUAPZWJpXuc4FjSVXzc r8 = new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.p3132l.$$Lambda$c$BI1xT2VjvUAPZWJpXuc4FjSVXzc */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62007c.this.m242271b(dialogInterface, i);
                    }
                };
                $$Lambda$c$SO5cnstbD4TNuSyAgC7FFRF6WLI r10 = new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.p3132l.$$Lambda$c$SO5cnstbD4TNuSyAgC7FFRF6WLI */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62007c.this.m242270a(dialogInterface, i);
                    }
                };
                if (G) {
                    num = Integer.valueOf((int) R.color.function_danger_500);
                } else {
                    num = null;
                }
                this.f155799b = VCDialogUtils.m236179a((Context) activity, i, 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) r8, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) r10, false, num);
                MeetingPopupEvent.m249838a().mo220317a("host_mic_on", getMeeting().mo212056e());
            }
        }
    }

    public C62007c(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    @Override // com.ss.android.vc.meeting.module.p3132l.AbstractC62004a.AbstractC62005a
    /* renamed from: a */
    public void mo214640a(boolean z) {
        C60700b.m235851b("PopupViewControl", "[allowParticipantUnMuteChanged]", "allow = " + z);
        if (getMeeting().aA().f155796b && !z) {
            getMeeting().aA().f155796b = false;
            try {
                Dialog dialog = this.f155799b;
                if (dialog != null && dialog.isShowing()) {
                    this.f155799b.dismiss();
                }
                this.f155799b = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m242273d(DialogInterface dialogInterface, int i) {
        ca.m250249f(getMeeting().mo212056e());
        getMeeting().aA().f155795a = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m242271b(DialogInterface dialogInterface, int i) {
        ca.m250251h(getMeeting().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("cancel", "host_mic_on", getMeeting().mo212056e());
        getMeeting().aA().f155796b = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242270a(DialogInterface dialogInterface, int i) {
        getMeeting().ai().mo213029f();
        getMeeting().ao().mo218463b();
        if (getMeeting().af().mo216825c()) {
            C60738ac.m236037c((int) R.string.View_G_PhoneCallNoMic);
            return;
        }
        ca.m250250g(getMeeting().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("confirm", "host_mic_on", getMeeting().mo212056e());
        getMeeting().aA().f155796b = false;
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j == null || j.getParticipantSettings() == null || !(j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST || j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNKNOWN || j.getParticipantSettings().getMicrophoneStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE)) {
            getMeeting().ai().mo213017b(false, true);
            return;
        }
        C60738ac.m236023a((int) R.string.View_VM_NoMicTip);
        C60700b.m235851b("PopupViewControl", "[showHostOpenMicrophonePopup2]", "no usable microphone device");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m242272c(DialogInterface dialogInterface, int i) {
        if (getMeeting().af().mo216825c()) {
            C60738ac.m236037c((int) R.string.View_G_PhoneCallNoCamera);
            return;
        }
        ca.m250248e(getMeeting().mo212056e());
        getMeeting().aA().f155795a = false;
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j == null || j.getParticipantSettings() == null || !(j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.NOT_EXIST || j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNKNOWN || j.getParticipantSettings().getCameraStatus() == ParticipantSettings.EquipmentStatus.UNAVAILABLE)) {
            getMeeting().ai().mo213011a(false, true);
            return;
        }
        C60738ac.m236023a((int) R.string.View_VM_NoCameraTip);
        C60700b.m235851b("PopupViewControl", "[showHostOpenCameraPopup2]", "no usable camera device");
    }
}
