package com.ss.android.vc.meeting.module.breakoutroom;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.breakoutroom.p3112a.AbstractC61518b;
import com.ss.android.vc.meeting.module.breakoutroom.p3112a.C61517a;
import com.ss.android.vc.meeting.module.breakoutroom.widgets.BreakoutRoomPopWindowDialogController;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageResult;
import com.ss.android.vc.statistics.event.C63752c;
import com.ss.android.vc.statistics.event2.MeetingBreakoutRoomsPopupEvent;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b */
public class C61519b extends AbstractC61424d implements AbsBreakoutRoomControl.AbstractC61508b, BreakoutRoomPopWindowDialogController.IDelegate {

    /* renamed from: a */
    private AbstractC61518b f154301a;

    /* renamed from: b */
    private BreakoutRoomViewStub f154302b;

    /* renamed from: c */
    private DialogC25637f f154303c;

    /* renamed from: d */
    private UDDialog f154304d;

    /* renamed from: e */
    private boolean f154305e;

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: f */
    public void mo213198f(boolean z) {
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m240147b() {
        this.f154304d.dismiss();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213189a() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$tzOCKyzV3u5bdzxYp49uN5Cl7JM */

            public final void run() {
                C61519b.lambda$tzOCKyzV3u5bdzxYp49uN5Cl7JM(C61519b.this);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().al().mo213170b(this);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m240149d() {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[closeBroadcastTips]", "closeBroadcastTips");
        AbstractC61518b bVar = this.f154301a;
        if (bVar != null) {
            bVar.mo213216a();
        } else {
            getMeeting().al().mo213168a(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: c */
    public void mo213196c() {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[dismissPopupWindow]", "dismissPopupWindow");
        UDDialog uDDialog = this.f154304d;
        if (uDDialog != null && uDDialog.isShowing()) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$WsUDHws7ZnfBI_01DKFB3FCxFjM */

                public final void run() {
                    C61519b.lambda$WsUDHws7ZnfBI_01DKFB3FCxFjM(C61519b.this);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().al().mo213163a(this);
        if (getMeeting().al().mo213174c()) {
            mo213192a(getMeeting().al().mo213175d());
        }
        this.f154302b = new BreakoutRoomViewStub(getRootView(), getMeeting());
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: e */
    public void mo213197e(boolean z) {
        this.f154305e = z;
    }

    public C61519b(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.widgets.BreakoutRoomPopWindowDialogController.IDelegate
    /* renamed from: c */
    public void mo213218c(String str) {
        getMeeting().al().mo213169b();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: b */
    public void mo213195b(String str) {
        if (this.f154304d == null) {
            this.f154304d = VCDialogUtils.m236209a(getMeeting(), getContext(), (int) R.string.View_G_YouWillLeaveRoomAutomatically, (int) R.string.View_G_BackToMainRoom, (int) R.string.Lark_View_OkButton, false, (BreakoutRoomPopWindowDialogController.IDelegate) this, this.f154305e, (BreakoutRoomPopWindowDialogController.OnShouldShowListener) new BreakoutRoomPopWindowDialogController.OnShouldShowListener() {
                /* class com.ss.android.vc.meeting.module.breakoutroom.C61519b.C615201 */

                @Override // com.ss.android.vc.meeting.module.breakoutroom.widgets.BreakoutRoomPopWindowDialogController.OnShouldShowListener
                /* renamed from: a */
                public void mo213219a(boolean z) {
                    C61519b.this.mo213197e(z);
                }
            }, str);
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213190a(long j) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[updatePopupWindowTitle]", "time= " + j);
        UDDialog uDDialog = this.f154304d;
        if (uDDialog == null) {
            VCBreakoutRoomInfo k = getMeeting().al().mo213184k();
            if (k != null) {
                mo213195b(k.getBreakoutRoomId());
            }
        } else if (j <= 0) {
            uDDialog.dismiss();
        } else if (!uDDialog.isShowing() && this.f154305e) {
            C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[updatePopupWindowTitle2]", "showPopupWindow");
            this.f154304d.show();
            C63752c.m250237a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "leaveroom_soon", (JSONObject) null, getMeeting().mo212056e());
            MeetingBreakoutRoomsPopupEvent.m249771a().mo220263a(getMeeting(), "leave_countdown");
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213191a(VCManageResult.Action action) {
        VCBreakoutRoomInfo k;
        if (action == VCManageResult.Action.HOSTREJECT) {
            C60738ac.m236037c((int) R.string.View_G_HostBusy);
        } else if (action == VCManageResult.Action.HOSTALLOWED && (k = getMeeting().al().mo213184k()) != null) {
            C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_G_HostJoinedRoom, "roomName", k.getRoomTopic()));
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213192a(String str) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[showBroadcastTips]", "content= " + str);
        if (!TextUtils.isEmpty(str)) {
            if (this.f154301a == null) {
                this.f154301a = new C61517a(this.mPresent);
            }
            this.f154301a.mo213217a(str);
            getMeeting().al().mo213161a();
            if (getMeeting().al().mo213183j()) {
                C63752c.m250236a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "breakoutrooms_receive_broadcast", "mainroom", getMeeting().mo212056e());
            } else if (getMeeting().al().mo213182i()) {
                C63752c.m250236a(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "breakoutrooms_receive_broadcast", "inrooms", getMeeting().mo212056e());
            }
            MeetingBreakoutRoomsPopupEvent.m249771a().mo220263a(getMeeting(), "breakoutrooms_receive_broadcast");
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213194a(boolean z, boolean z2) {
        C60735ab.m236001a(new Runnable(z, z2) {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$gT7AMBSSFlynURLTFVboA6qPDXw */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C61519b.lambda$gT7AMBSSFlynURLTFVboA6qPDXw(C61519b.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m240148b(boolean z, boolean z2) {
        C60700b.m235851b("BreakoutRoom_BreakoutRoomViewControl", "[updateTransitionPage]", "show= " + z + " isTransfer=" + z2);
        if (!z) {
            this.f154302b.mo213237c();
        } else if (z2) {
            this.f154302b.mo213236b();
        } else {
            this.f154302b.mo213235a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61508b
    /* renamed from: a */
    public void mo213193a(String str, String str2) {
        AbsBreakoutRoomControl al = getMeeting().al();
        Activity c = VCAppLifeCycle.m236256c();
        $$Lambda$b$MJucV9NJDbYpgWiyXWLhrGXQhVg r2 = new DialogInterface.OnClickListener(str2) {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$MJucV9NJDbYpgWiyXWLhrGXQhVg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C61519b.lambda$MJucV9NJDbYpgWiyXWLhrGXQhVg(C61519b.this, this.f$1, dialogInterface, i);
            }
        };
        $$Lambda$b$BFDOhVHqWEtTV2Qf3x7xEjl3o0 r3 = new DialogInterface.OnClickListener(al, str, str2) {
            /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$BFDOhVHqWEtTV2Qf3x7xEjl3o0 */
            public final /* synthetic */ AbsBreakoutRoomControl f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C61519b.m271220lambda$BFDOhVHqWEtTV2Qf3x7xEjl3o0(C61519b.this, this.f$1, this.f$2, this.f$3, dialogInterface, i);
            }
        };
        if (C60773o.m236120a(c) && (c instanceof MeetingActivity)) {
            C60735ab.m236001a(new Runnable(c, r2, r3) {
                /* class com.ss.android.vc.meeting.module.breakoutroom.$$Lambda$b$MFDCpHDPMk2zFwo2DvqfJxqmA_I */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ DialogInterface.OnClickListener f$2;
                public final /* synthetic */ DialogInterface.OnClickListener f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C61519b.lambda$MFDCpHDPMk2zFwo2DvqfJxqmA_I(C61519b.this, this.f$1, this.f$2, this.f$3);
                }
            });
            MeetingBreakoutRoomsPopupEvent.m249771a().mo220263a(getMeeting(), "ask_for_help");
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240144a(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if (this.f154303c == null) {
            this.f154303c = VCDialogUtils.m236184a((Context) activity, UIHelper.getString(R.string.View_G_AskHostForHelpQuestion), 2, (int) R.string.View_G_CancelButton, onClickListener, (int) R.string.View_M_SendRequest, onClickListener2, false);
        }
        this.f154303c.show();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240146a(String str, DialogInterface dialogInterface, int i) {
        C63752c.m250239b("cancel", str, null, getMeeting().mo212056e());
        MeetingBreakoutRoomsPopupEvent.m249771a().mo220265a("cancel", str, "none", Boolean.valueOf(getMeeting().al().mo213181h()), Boolean.valueOf(getMeeting().al().mo213182i()), getMeeting().mo212056e());
        DialogC25637f fVar = this.f154303c;
        if (fVar != null) {
            fVar.dismiss();
            this.f154303c = null;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240145a(AbsBreakoutRoomControl absBreakoutRoomControl, String str, String str2, DialogInterface dialogInterface, int i) {
        if (getMeeting().al().mo213180g()) {
            C60738ac.m236037c((int) R.string.View_G_HostAlreadyInRoom);
            return;
        }
        absBreakoutRoomControl.mo213172b(str);
        C63752c.m250239b("sendrequest", str2, null, getMeeting().mo212056e());
        MeetingBreakoutRoomsPopupEvent.m249771a().mo220265a("sendrequest", str2, "none", Boolean.valueOf(getMeeting().al().mo213181h()), Boolean.valueOf(getMeeting().al().mo213182i()), getMeeting().mo212056e());
        DialogC25637f fVar = this.f154303c;
        if (fVar != null) {
            fVar.dismiss();
            this.f154303c = null;
        }
    }
}
