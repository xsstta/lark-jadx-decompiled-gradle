package com.ss.android.vc.meeting.module.p3151p;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import com.ss.android.vc.statistics.event2.MeetingShareWindowEvent;

/* renamed from: com.ss.android.vc.meeting.module.p.f */
public class C62623f implements IShareScreenStatusListener {

    /* renamed from: a */
    public View f157658a;

    /* renamed from: b */
    public ImageView f157659b;

    /* renamed from: c */
    public TextView f157660c;

    /* renamed from: d */
    public C61303k f157661d;

    /* renamed from: e */
    public AbstractC61222a f157662e;

    /* renamed from: f */
    private ShareContentViewHolder.SharePanelSource f157663f;

    /* renamed from: g */
    private ILocalSharePrepareContract.IView f157664g;

    /* renamed from: a */
    public void mo216446a() {
        if (this.f157663f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            this.f157661d.aj().mo216410b(this);
        }
    }

    /* renamed from: b */
    private void m245008b() {
        boolean z;
        if (this.f157663f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            z = this.f157661d.aj().mo216408a();
        } else {
            z = false;
        }
        if (z) {
            m245009b(true);
        }
        View view = this.f157658a;
        if (view != null) {
            view.setVisibility(0);
            this.f157658a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$f$6Lok6wKriyZZDRsTR_xMCaHkv30 */

                public final void onClick(View view) {
                    C62623f.this.m245007a((C62623f) view);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.sharescreen.IShareScreenStatusListener
    /* renamed from: a */
    public void mo216428a(boolean z) {
        if (!z) {
            m245009b(false);
        }
    }

    /* renamed from: b */
    private void m245009b(boolean z) {
        C60735ab.m236001a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.p3151p.$$Lambda$f$A1xOmESJ37bvTzWsZmVSMGPTXo */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C62623f.this.m245010c(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m245010c(boolean z) {
        if (z) {
            this.f157660c.setText(R.string.View_VM_StopSharing);
            this.f157660c.setTextColor(C60773o.m236126d(R.color.function_danger_500));
            this.f157659b.setImageDrawable(C60773o.m236128f(R.drawable.vc_stop_share_icon));
            return;
        }
        this.f157660c.setText(R.string.View_MV_SharePhoneScreen_GreenButton);
        this.f157660c.setTextColor(C60773o.m236126d(R.color.text_title));
        this.f157659b.setImageDrawable(C60773o.m236128f(R.drawable.vc_share_screen_icon));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245007a(View view) {
        String str;
        boolean z;
        if (this.f157663f == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            C61303k kVar = this.f157661d;
            if (kVar != null && kVar.f153550c != null) {
                VideoChat e = this.f157661d.mo212056e();
                if (e == null || e.getVideoChatSettings() == null || e.getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.f157661d.aj().mo216408a()) {
                    if (z) {
                        this.f157661d.ah().mo219482b();
                    } else {
                        this.f157661d.aj().mo216414d();
                    }
                    if (this.f157661d.f153550c == VideoChat.Type.CALL) {
                        C63763l.m250310d(e);
                    } else if (this.f157661d.f153550c == VideoChat.Type.MEET) {
                        C63742at.m250107n(e);
                    }
                    MeetingOnTheCallEvent2.m249823a().mo220309b(this.f157661d, "stop_share_screen");
                } else {
                    if (z) {
                        this.f157661d.ab().mo213885k();
                    }
                    this.f157661d.aj().mo216412c();
                    if (this.f157661d.f153550c == VideoChat.Type.CALL) {
                        C63763l.m250305b(e);
                    } else if (this.f157661d.f153550c == VideoChat.Type.MEET) {
                        C63742at.m250105l(e);
                    }
                }
                this.f157662e.dismiss();
            } else {
                return;
            }
        } else if (this.f157663f == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
            this.f157664g.mo217799c();
        }
        MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
        C61303k kVar2 = this.f157661d;
        ShareContentViewHolder.SharePanelSource sharePanelSource = this.f157663f;
        ILocalSharePrepareContract.IView bVar = this.f157664g;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.mo217810n();
        }
        aVar.mo220363a(kVar2, "share_screen", sharePanelSource, str);
    }

    public C62623f(C61303k kVar, AbstractC61222a aVar, View view, ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar) {
        this.f157661d = kVar;
        this.f157662e = aVar;
        this.f157663f = sharePanelSource;
        this.f157664g = bVar;
        this.f157658a = view.findViewById(R.id.viewholder_share_screen);
        this.f157659b = (ImageView) view.findViewById(R.id.viewholder_share_screen_icon);
        this.f157660c = (TextView) view.findViewById(R.id.viewholder_share_screen_text);
        m245008b();
        if (sharePanelSource == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            this.f157661d.aj().mo216404a(this);
        }
    }
}
