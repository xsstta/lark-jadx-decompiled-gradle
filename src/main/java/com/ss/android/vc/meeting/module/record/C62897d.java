package com.ss.android.vc.meeting.module.record;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.request.RecordMeetingEntityRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.record.d */
public class C62897d extends AbstractC62894a implements C61381c.AbstractC61382a {

    /* renamed from: a */
    private boolean f158427a;

    /* renamed from: b */
    private boolean f158428b;

    /* renamed from: c */
    private boolean f158429c;

    /* renamed from: d */
    private boolean f158430d;

    /* renamed from: e */
    private VcMsgInfo f158431e;

    /* renamed from: f */
    private InMeetingData.RecordMeetingData f158432f;

    /* renamed from: g */
    private Handler f158433g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private ArrayList<AbstractC62895b> f158434h = new ArrayList<>();

    /* renamed from: i */
    private ILKUIGlobalDialog f158435i;

    /* renamed from: j */
    private Runnable f158436j = new Runnable() {
        /* class com.ss.android.vc.meeting.module.record.$$Lambda$d$gneVK63m0pyDQMxpF21KPCOtnZc */

        public final void run() {
            C62897d.this.m246236l();
        }
    };

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212487a(boolean z) {
        C61381c.AbstractC61382a.CC.$default$a(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: c */
    public boolean mo217365c() {
        return this.f158430d;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: d */
    public InMeetingData.RecordMeetingData mo217366d() {
        return this.f158432f;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: e */
    public boolean mo217367e() {
        return this.f158427a;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: f */
    public boolean mo217368f() {
        return this.f158429c;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: h */
    public VcMsgInfo mo217370h() {
        return this.f158431e;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b, com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: a */
    public void mo217359a(boolean z, boolean z2) {
        this.f158428b = z;
        this.f158429c = z2;
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217359a(z, this.f158429c);
                }
            }
        }
        getMeeting().ah().mo219487c(z);
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: b */
    public boolean mo217363b() {
        return this.f158428b;
    }

    /* renamed from: j */
    public void mo217376j() {
        this.f158434h.clear();
    }

    /* renamed from: k */
    public void mo217377k() {
        ILKUIGlobalDialog cVar = this.f158435i;
        if (cVar != null) {
            cVar.mo89212a();
            this.f158435i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m246236l() {
        mo217364c(false);
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217356a();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b, com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: a */
    public void mo217356a() {
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217356a();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b, com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: g */
    public void mo217369g() {
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217369g();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: i */
    public void mo217374i() {
        if (this.mMeeting != null && this.mMeeting.aE().mo208293c()) {
            C60700b.m235851b("RecordControl", "dismissInMeetingRequestDialog", "");
            Iterator<AbstractC62895b> it = this.f158434h.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217374i();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: b */
    public void mo217360b(InMeetingData.RecordMeetingData recordMeetingData) {
        this.f158432f = recordMeetingData;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    public void s_(boolean z) {
        this.f158428b = z;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: a */
    public void mo217358a(AbstractC62895b bVar) {
        if (bVar != null) {
            this.f158434h.add(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: b */
    public void mo217361b(AbstractC62895b bVar) {
        if (this.f158434h.contains(bVar)) {
            this.f158434h.remove(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: b */
    public void mo217362b(boolean z) {
        C60700b.m235851b("RecordControl", "[setDialogShown]", "isShown = " + z);
        this.f158430d = z;
    }

    public C62897d(C61303k kVar) {
        super(kVar);
        kVar.mo212091I().mo212490a().mo212468a(this);
    }

    /* renamed from: c */
    private void m246234c(InMeetingData.RecordMeetingData recordMeetingData) {
        if (recordMeetingData == null || recordMeetingData.mo209054c() == null) {
            m246233a(recordMeetingData, "");
            return;
        }
        ByteviewUser c = recordMeetingData.mo209054c();
        UserInfoService.getUserInfoById(getMeeting().mo212055d(), c.getUserId(), c.getParticipantType(), new GetUserInfoListener(recordMeetingData) {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$d$I5lla_Xdhl9TYn5p9kXW0EUU7C8 */
            public final /* synthetic */ InMeetingData.RecordMeetingData f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C62897d.this.m246232a((C62897d) this.f$1, (InMeetingData.RecordMeetingData) videoChatUser);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m246235d(InMeetingData.RecordMeetingData recordMeetingData) {
        try {
            Activity c = VCAppLifeCycle.m236256c();
            if (c != null) {
                c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(recordMeetingData.mo209055d())));
            }
        } catch (Exception e) {
            e.printStackTrace();
            C60700b.m235864f("RecordControl", "[participantRequestInternal]", "showTips startActivity" + recordMeetingData.mo209055d());
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217372a(View view) {
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217372a(view);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        if (this.f158431e == null && videoChatInMeetingInfo != null && videoChatInMeetingInfo.getRecordMeetingData() != null && videoChatInMeetingInfo.getRecordMeetingData().mo209056e() != null) {
            this.f158431e = videoChatInMeetingInfo.getRecordMeetingData().mo209056e();
            mo217357a(videoChatInMeetingInfo.getRecordMeetingData());
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: c */
    public void mo217364c(boolean z) {
        this.f158427a = z;
        if (z) {
            this.f158433g.removeCallbacks(this.f158436j);
            this.f158433g.postDelayed(this.f158436j, 30000);
            return;
        }
        this.f158433g.removeCallbacks(this.f158436j);
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217356a();
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b, com.ss.android.vc.meeting.module.record.AbstractC62894a
    /* renamed from: a */
    public void mo217357a(InMeetingData.RecordMeetingData recordMeetingData) {
        if (recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.RECORDING_STATUS_CHANGE) {
            s_(recordMeetingData.mo209053b());
        }
        if (!recordMeetingData.mo209053b()) {
            getMeeting().mo212109a((VCNotice) null);
        }
        mo217364c(false);
        if (recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.RECORDING_STATUS_CHANGE && !recordMeetingData.mo209053b()) {
            C60738ac.m236037c((int) R.string.View_M_RecordingStopped);
        }
        this.f158433g.removeCallbacks(this.f158436j);
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217357a(recordMeetingData);
                }
            }
        }
        if (this.mMeeting.mo212067p() == DisplayMode.WINDOW && recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.PARTICIPANT_REQUEST) {
            m246234c(recordMeetingData);
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217373a(AbstractC61222a aVar) {
        ArrayList<AbstractC62895b> arrayList = this.f158434h;
        if (arrayList != null) {
            Iterator<AbstractC62895b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC62895b next = it.next();
                if (next != null) {
                    next.mo217373a(aVar);
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        if (DisplayMode.WINDOW == displayMode) {
            mo217377k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246232a(InMeetingData.RecordMeetingData recordMeetingData, VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser == null) {
            str = "";
        } else {
            str = videoChatUser.getName();
        }
        m246233a(recordMeetingData, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246230a(DialogInterface dialogInterface, int i) {
        if (isCallType()) {
            C63763l.m250315i(getMeeting().mo212056e());
        } else {
            C63742at.m250088c(true, getMeeting().mo212056e());
        }
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.HOST_ACCEPT, (ByteviewUser) null, C60774p.m236129a()).mo219896d();
        if (this.mMeeting != null && this.mMeeting.aE().mo208293c()) {
            mo217374i();
        }
        getMeeting().mo212106X().mo217362b(false);
        mo217360b((InMeetingData.RecordMeetingData) null);
        MeetingPopupEvent.m249838a().mo220318a("confirm", "record_request_confirm", getMeeting().mo212056e());
    }

    /* renamed from: a */
    private void m246233a(InMeetingData.RecordMeetingData recordMeetingData, String str) {
        String str2;
        if ((isMeetHost() || isCallType()) && isParticipant(recordMeetingData.mo209054c()) && !getMeeting().mo212106X().mo217363b()) {
            this.f158432f = recordMeetingData;
            mo217362b(true);
            if (isMeetType()) {
                str2 = UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_M_RequestToRecordInfoNew), "name", str);
            } else {
                str2 = UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_AV_RequestToRecordInfoNew), "name", str);
            }
            ILKUIGlobalDialog cVar = this.f158435i;
            if (cVar != null) {
                cVar.mo89212a();
                this.f158435i = null;
            }
            this.f158435i = VCDialogUtils.m236175a((int) R.string.View_M_RequestToRecord, 1, str2, (int) R.string.View_G_DeclineButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(recordMeetingData) {
                /* class com.ss.android.vc.meeting.module.record.$$Lambda$d$iJBEiZE6uWAXJvUWqdDjePFsoV8 */
                public final /* synthetic */ InMeetingData.RecordMeetingData f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62897d.this.m246231a(this.f$1, dialogInterface, i);
                }
            }, (int) R.string.View_G_ApproveButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.record.$$Lambda$d$cElcpO6Pp1obT3UQc18LHQ3mfUg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62897d.this.m246230a((C62897d) dialogInterface, (DialogInterface) i);
                }
            }, false, (LKVCJumpDialogController.OnJumpListener) new LKVCJumpDialogController.OnJumpListener() {
                /* class com.ss.android.vc.meeting.module.record.$$Lambda$d$x6yDkT6eq0TdWBKFaLVcJexMlFo */

                @Override // com.ss.android.vc.common.widget.LKVCJumpDialogController.OnJumpListener
                public final void onJump() {
                    C62897d.m246235d(InMeetingData.RecordMeetingData.this);
                }
            }, str.length());
            MeetingPopupEvent.m249838a().mo220317a("record_request_confirm", getMeeting().mo212056e());
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            C60700b.m235851b("RecordControl", "[onTransform]", "remove timer");
            this.f158433g.removeCallbacks(this.f158436j);
            mo217376j();
            mo217377k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246231a(InMeetingData.RecordMeetingData recordMeetingData, DialogInterface dialogInterface, int i) {
        if (isCallType()) {
            C63763l.m250316j(getMeeting().mo212056e());
        } else {
            C63742at.m250088c(false, getMeeting().mo212056e());
        }
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.HOST_REFUSE, recordMeetingData.mo209054c(), C60774p.m236129a()).mo219896d();
        if (this.mMeeting != null && this.mMeeting.aE().mo208293c()) {
            mo217374i();
        }
        getMeeting().mo212106X().mo217362b(false);
        mo217360b((InMeetingData.RecordMeetingData) null);
        MeetingPopupEvent.m249838a().mo220318a("cancel", "record_request_confirm", getMeeting().mo212056e());
    }
}
