package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.breakoutroom.BreakoutRoomManage;
import com.ss.android.vc.entity.request.HostManageRequest;
import com.ss.android.vc.entity.response.C60976j;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.bi;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.b */
public class View$OnClickListenerC62384b extends AbstractC63524a<View$OnClickListenerC62384b> implements View.OnClickListener, AbsBreakoutRoomControl.AbstractC61510d {

    /* renamed from: a */
    public final C61303k f156896a;

    /* renamed from: b */
    private final Context f156897b;

    /* renamed from: c */
    private final View f156898c;

    /* renamed from: d */
    private UDDialog f156899d;

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void a_(String str, String str2) {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213205d(String str, String str2) {
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    public void bE_() {
        mo211398c();
    }

    @Override // com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl.AbstractC61510d
    /* renamed from: d */
    public void mo213204d() {
        mo211398c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219687a(R.layout.participant_list_host_more_pop_window, this.f156898c.getWidth(), -2);
        mo219688a(true);
        mo219695b(false);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        try {
            C61303k kVar = this.f156896a;
            if (kVar != null) {
                kVar.al().mo213171b(this);
            }
            super.mo211398c();
        } catch (IllegalArgumentException e) {
            C60700b.m235864f("HostMoreActionPopup", "[dismiss]", e.getMessage());
        }
    }

    /* renamed from: e */
    public void mo215682e() {
        mo219691a(this.f156898c, 0, -(C60773o.m236115a(4.0d) + this.f156898c.getHeight() + C60773o.m236115a(108.0d)), 8388611);
    }

    /* renamed from: m */
    private void m243813m() {
        $$Lambda$b$7J68LS2dgK4h63oBDhJgAMybZLU r0 = new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.$$Lambda$b$7J68LS2dgK4h63oBDhJgAMybZLU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62384b.this.m243812b(dialogInterface, i);
            }
        };
        $$Lambda$b$KuYT5dBQRycuO23o_PlzIIUl_Eo r1 = new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.$$Lambda$b$KuYT5dBQRycuO23o_PlzIIUl_Eo */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC62384b.this.m243811a((View$OnClickListenerC62384b) dialogInterface, (DialogInterface) i);
            }
        };
        Activity c = VCAppLifeCycle.m236256c();
        if (C60773o.m236120a(c) && (c instanceof MeetingActivity)) {
            C60735ab.m236001a(new Runnable(c, r0, r1) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.$$Lambda$b$n5h6fiFYGKNd0jbnZkCyHBJP5J8 */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ DialogInterface.OnClickListener f$2;
                public final /* synthetic */ DialogInterface.OnClickListener f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    View$OnClickListenerC62384b.this.m243810a((View$OnClickListenerC62384b) this.f$1, (Activity) this.f$2, this.f$3);
                }
            });
        }
    }

    public void onClick(View view) {
        BreakoutRoomManage breakoutRoomManage;
        String str;
        VCBreakoutRoomInfo k;
        if (view.getId() == R.id.ll_unmute_all) {
            mo211398c();
            if (!this.f156896a.al().mo213182i() || (k = this.f156896a.al().mo213184k()) == null) {
                str = null;
                breakoutRoomManage = null;
            } else {
                String breakoutRoomId = k.getBreakoutRoomId();
                BreakoutRoomManage breakoutRoomManage2 = new BreakoutRoomManage();
                breakoutRoomManage2.setManageType(BreakoutRoomManage.ManageType.UPDATE_SETTINGS);
                ArrayList arrayList = new ArrayList();
                arrayList.add(k);
                breakoutRoomManage2.setRoomInfos(arrayList);
                str = breakoutRoomId;
                breakoutRoomManage = breakoutRoomManage2;
            }
            VcBizService.sendManageRequest(this.f156896a.mo212055d(), str, breakoutRoomManage, HostManageRequest.Action.MUTE_ALL_MICROPHONE, (String) null, (String) null, (ParticipantType) null, false, false, false, (Boolean) false, (String) null);
            C60738ac.m236037c((int) R.string.View_G_RequestSent);
            bi.m250172a(false, this.f156896a.mo212056e());
            MeetingOnTheCallEvent2.m249823a().mo220301a(this.f156896a, "unmute_all");
            C60700b.m235851b("HostMoreActionPopup", "[onClick]", "click unmute all button");
        } else if (view.getId() == R.id.ll_reclaim_host) {
            mo211398c();
            if (!this.f156896a.al().mo213181h() || this.f156896a.al().mo213185l() == VCBreakoutRoomInfo.Status.COUNT_DOWN) {
                final String j = this.f156896a.mo212091I().mo212490a().mo212478j();
                final String i = this.f156896a.mo212091I().mo212490a().mo212477i();
                bi.m250178c(i, j, this.f156896a.mo212056e());
                VcBizSender.m249293j(this.f156896a.mo212055d()).mo219893b(new AbstractC63598b<C60976j>() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.View$OnClickListenerC62384b.C623851 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                    }

                    /* renamed from: a */
                    public void onSuccess(C60976j jVar) {
                        bi.m250170a(i, j, true, View$OnClickListenerC62384b.this.f156896a.mo212056e());
                    }
                });
                return;
            }
            m243813m();
        } else {
            mo211398c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243812b(DialogInterface dialogInterface, int i) {
        UDDialog uDDialog = this.f156899d;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f156899d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243811a(DialogInterface dialogInterface, int i) {
        final String j = this.f156896a.mo212091I().mo212490a().mo212478j();
        final String i2 = this.f156896a.mo212091I().mo212490a().mo212477i();
        bi.m250178c(i2, j, this.f156896a.mo212056e());
        VcBizSender.m249293j(this.f156896a.mo212055d()).mo219893b(new AbstractC63598b<C60976j>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.popupwindow.View$OnClickListenerC62384b.C623862 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(C60976j jVar) {
                bi.m250170a(i2, j, true, View$OnClickListenerC62384b.this.f156896a.mo212056e());
            }
        });
        UDDialog uDDialog = this.f156899d;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f156899d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, View$OnClickListenerC62384b bVar) {
        ((LinearLayout) mo219693b(R.id.ll_unmute_all)).setOnClickListener(this);
        ((LinearLayout) mo219693b(R.id.ll_reclaim_host)).setOnClickListener(this);
        C61303k kVar = this.f156896a;
        if (kVar != null) {
            kVar.al().mo213165a(this);
        }
    }

    /* renamed from: a */
    public static View$OnClickListenerC62384b m243809a(Activity activity, View view, C61303k kVar) {
        return new View$OnClickListenerC62384b(activity, view, kVar);
    }

    public View$OnClickListenerC62384b(Activity activity, View view, C61303k kVar) {
        this.f156897b = activity;
        this.f156896a = kVar;
        this.f156898c = view;
        mo219694b((Context) activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243810a(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if (this.f156899d == null) {
            this.f156899d = VCDialogUtils.m236218b((Context) activity, (int) R.string.View_G_ReclaimHostQuestion, 2, (int) R.string.View_G_BreakoutRoomsNotSupportedOnMobile, (int) R.string.View_G_CancelButton, onClickListener, (int) R.string.View_M_ReclaimHost, onClickListener2, false);
        }
        UDDialog uDDialog = this.f156899d;
        if (uDDialog != null) {
            uDDialog.show();
        }
    }
}
