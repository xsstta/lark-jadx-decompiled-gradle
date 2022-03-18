package com.ss.android.vc.meeting.module.meetingdialog.meetinginfo;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.basedialog.IBackPressHandlerRegister;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.module.base.AbstractC61425e;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62305c;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.MeetingPstnInvitationDialog;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.MeetingPstnInvitationViewHolder;
import com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.pstn.PstnInviteInfo;
import com.ss.android.vc.meeting.module.share.C62955c;
import com.ss.android.vc.meeting.module.share.p3163d.C62965c;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatUIConfigService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event2.MeetingCardEvent;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.c */
public class C62305c {

    /* renamed from: a */
    TextView f156544a;

    /* renamed from: b */
    TextView f156545b;

    /* renamed from: c */
    View f156546c;

    /* renamed from: d */
    TextView f156547d;

    /* renamed from: e */
    View f156548e;

    /* renamed from: f */
    TextView f156549f;

    /* renamed from: g */
    TextView f156550g;

    /* renamed from: h */
    View f156551h;

    /* renamed from: i */
    View f156552i;

    /* renamed from: j */
    View f156553j;

    /* renamed from: k */
    ViewGroup f156554k;

    /* renamed from: l */
    C61303k f156555l;

    /* renamed from: m */
    public Activity f156556m;

    /* renamed from: n */
    AbstractC61222a f156557n;

    /* renamed from: o */
    AtomicBoolean f156558o = new AtomicBoolean(false);

    /* renamed from: p */
    public IBackPressHandlerRegister f156559p;

    /* renamed from: q */
    public C61373b.AbstractC61374a f156560q;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m243396d() {
        this.f156558o.set(false);
    }

    /* renamed from: a */
    private boolean m243392a() {
        return this.f156555l.aa().mo216288p();
    }

    /* renamed from: b */
    private boolean m243394b() {
        return this.f156555l.aa().mo216290r();
    }

    /* renamed from: c */
    private boolean m243395c() {
        if (this.f156555l.mo212057f() != VideoChat.Type.CALL || !C63634c.m249496b("byteview.meeting.android.copymeetinglink") || !VideoChatUIConfigService.m249507j(this.f156555l)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243393b(View view) {
        if (m243392a() || m243394b()) {
            this.f156555l.aa().mo216273b(this.f156555l);
        } else {
            this.f156555l.aa().mo216267a(this.f156555l);
        }
        C63742at.m250110q(this.f156555l.mo212056e());
        MeetingCardEvent.m249792a(this.f156555l, "copy_meeting_in", null, null);
    }

    /* renamed from: a */
    private String m243389a(C61303k kVar) {
        String str;
        String str2;
        if (!(kVar == null || kVar.mo212088F() == null)) {
            VideoChatUser currentUser = VideoChatUserService.getCurrentUser();
            VideoChatUser singleRemoteUser = kVar.mo212088F().getSingleRemoteUser();
            if (!(currentUser == null || singleRemoteUser == null)) {
                if (kVar.mo212088F().getCurrentUserRole() == VideoChatUserRole.SINGLE_CALLER) {
                    str = currentUser.getName();
                    str2 = singleRemoteUser.getName();
                } else {
                    str2 = currentUser.getName();
                    str = singleRemoteUser.getName();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("callerName", str);
                hashMap.put("calleeName", str2);
                return UIHelper.mustacheFormat((int) R.string.View_AV_CallTitleCallerNameCalleeName, hashMap);
            }
        }
        return "";
    }

    /* renamed from: a */
    private void m243390a(View view) {
        VideoChat e;
        this.f156544a = (TextView) view.findViewById(R.id.meeting_info_dialog_title);
        this.f156545b = (TextView) view.findViewById(R.id.meeting_info_meetingid);
        this.f156546c = view.findViewById(R.id.meeting_info_id_label);
        this.f156547d = (TextView) view.findViewById(R.id.meeting_info_link);
        this.f156548e = view.findViewById(R.id.vg_pstn_number_container);
        this.f156549f = (TextView) view.findViewById(R.id.meeting_info_dial_in_call);
        this.f156550g = (TextView) view.findViewById(R.id.meeting_info_dial_more);
        this.f156551h = view.findViewById(R.id.meeting_info_copy);
        this.f156552i = view.findViewById(R.id.meeting_info_share);
        this.f156553j = view.findViewById(R.id.meeting_operation_container);
        this.f156554k = (ViewGroup) view.findViewById(R.id.container);
        C61303k kVar = this.f156555l;
        if (kVar != null && (e = kVar.mo212056e()) != null) {
            VideoChatSettings videoChatSettings = e.getVideoChatSettings();
            if (this.f156555l.mo212057f() == VideoChat.Type.CALL) {
                this.f156544a.setText(m243389a(this.f156555l));
            } else if (!(videoChatSettings == null || videoChatSettings.getTopic() == null)) {
                if (this.f156555l.mo212090H() == VideoChat.MeetingSource.VC_FROM_INTERVIEW) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", videoChatSettings.getTopic());
                    this.f156544a.setText(UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, hashMap));
                } else if (!TextUtils.isEmpty(videoChatSettings.getTopic())) {
                    this.f156544a.setText(videoChatSettings.getTopic());
                } else {
                    this.f156544a.setText(R.string.View_G_ServerNoTitle);
                }
            }
            this.f156545b.setText(C60754h.m236085a(e.getMeetNumber()));
            this.f156547d.setText(e.getMeetingUrl());
            int i = 8;
            if (m243392a()) {
                this.f156555l.aa().mo216268a(this.f156555l, new AbstractC63598b<List<PstnInviteInfo>>() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62305c.C623082 */

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("MeetingInfoViewHolder", "[requestPstnInviteInfo2]", "failed, hide view: " + eVar);
                    }

                    /* renamed from: a */
                    public void onSuccess(List<PstnInviteInfo> list) {
                        C60700b.m235851b("MeetingInfoViewHolder", "[requestPstnInviteInfo]", "success: " + list);
                        if (list != null && list.size() > 0) {
                            C60735ab.m236001a(new Runnable(list) {
                                /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$2$N_RQkxgGY5ZNmpr01J8X1iJDsk */
                                public final /* synthetic */ List f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    C62305c.C623082.this.m243402b(this.f$1);
                                }
                            });
                        }
                    }

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: b */
                    private /* synthetic */ void m243402b(List list) {
                        C62305c.this.f156548e.setVisibility(0);
                        C62305c.this.f156549f.setText(String.format("%s (%s)", ((PstnInviteInfo) list.get(0)).mo215503b(), ((PstnInviteInfo) list.get(0)).mo215502a()));
                        if (list.size() > 1) {
                            C62305c.this.f156550g.setVisibility(0);
                        } else {
                            C62305c.this.f156550g.setVisibility(8);
                        }
                    }
                });
                this.f156550g.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62305c.C623093 */

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: a */
                    private /* synthetic */ void m243404a(View view) {
                        C62305c.this.f156554k.removeView(view);
                        if (C62305c.this.f156557n != null) {
                            C62305c.this.f156557n.mo211610a(UIHelper.getString(R.string.View_N_MeetingInfo));
                        }
                    }

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        String str;
                        C63742at.m250111r(C62305c.this.f156555l.mo212056e());
                        if (C62305c.this.f156555l == null || C62305c.this.f156555l.mo212056e() == null) {
                            str = "";
                        } else {
                            str = C62305c.this.f156555l.mo212056e().getMeetNumber();
                        }
                        if (!DesktopUtil.m144307b()) {
                            new MeetingPstnInvitationDialog(C62305c.this.f156556m, C62305c.this.f156555l, str, null).mo211628a(C62305c.this.f156556m).mo211606a();
                        } else {
                            MeetingPstnInvitationViewHolder cVar = new MeetingPstnInvitationViewHolder(C62305c.this.f156556m, C62305c.this.f156555l, C62305c.this.f156557n, C62305c.this.f156559p, str, null);
                            View b = cVar.mo215496b();
                            cVar.mo215494a(new AbstractC61425e(b) {
                                /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$3$Il_S2zHaxbo4ewTTtRRPmTfl8UA */
                                public final /* synthetic */ View f$1;

                                {
                                    this.f$1 = r2;
                                }

                                @Override // com.ss.android.vc.meeting.module.base.AbstractC61425e
                                public final void dismiss() {
                                    C62305c.C623093.this.m243404a(this.f$1);
                                }
                            });
                            C62305c.this.f156554k.addView(b);
                        }
                        C62305c.this.f156557n.dismiss();
                    }
                });
            } else {
                this.f156548e.setVisibility(8);
            }
            if (this.f156555l.aa().mo216277e() || m243395c()) {
                this.f156553j.setVisibility(0);
                View view2 = this.f156552i;
                if (VideoChatUIConfigService.m249506i(this.f156555l)) {
                    i = 0;
                }
                view2.setVisibility(i);
                this.f156552i.setOnClickListener(new View.OnClickListener(e) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$c2IghK4DZSOKJ2FMwIl089IiH4 */
                    public final /* synthetic */ VideoChat f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C62305c.this.m243391a(this.f$1, view);
                    }
                });
                this.f156551h.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$HAwMAsuDBCKYUlqOZkNhjFc6ra8 */

                    public final void onClick(View view) {
                        C62305c.this.m243393b(view);
                    }
                });
                return;
            }
            this.f156553j.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243391a(VideoChat videoChat, View view) {
        if (!this.f156558o.get() && videoChat != null && videoChat.getVideoChatSettings() != null) {
            if (videoChat.getVideoChatSettings().isLocked()) {
                C60738ac.m236037c((int) R.string.View_M_MeetingLocked);
                return;
            }
            this.f156558o.set(true);
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$aygy4_FkRHFojthPRyEUOBgbDG8 */

                public final void run() {
                    C62305c.this.m243396d();
                }
            }, 1000);
            C61303k kVar = this.f156555l;
            if (kVar != null && kVar.mo212056e() != null) {
                C63742at.m250070a("meeting_info", this.f156555l.mo212056e());
                MeetingCardEvent.m249792a(this.f156555l, "share", "public_share_view", null);
                Activity activity = this.f156556m;
                C61303k kVar2 = this.f156555l;
                C62965c.m246556a(activity, kVar2, new C62955c(kVar2.mo212055d(), VideoChat.VendorType.RTC.getNumber()), false).mo211606a();
            }
        }
    }

    /* renamed from: a */
    public View mo215473a(final C61303k kVar, Activity activity, AbstractC61222a aVar, IBackPressHandlerRegister cVar) {
        this.f156555l = kVar;
        this.f156556m = activity;
        this.f156557n = aVar;
        this.f156559p = cVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.meeting_info_dialog_layout, (ViewGroup) null);
        m243390a(inflate);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        inflate.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62305c.View$OnAttachStateChangeListenerC623061 */

            public void onViewAttachedToWindow(View view) {
                if (kVar != null) {
                    C62305c.this.f156560q = new C61373b.AbstractC61374a() {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.C62305c.View$OnAttachStateChangeListenerC623061.C623071 */

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: b */
                        public /* synthetic */ void mo212445b(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$b(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bC_() {
                            C61373b.AbstractC61374a.CC.$default$bC_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bF_() {
                            C61373b.AbstractC61374a.CC.$default$bF_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void bX_() {
                            C61373b.AbstractC61374a.CC.$default$bX_(this);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: c */
                        public /* synthetic */ void mo212449c(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$c(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        /* renamed from: d */
                        public /* synthetic */ void mo212451d(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$d(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void i_(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$i_(this, z);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
                            C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
                        }

                        /* access modifiers changed from: private */
                        /* access modifiers changed from: public */
                        /* renamed from: a */
                        private /* synthetic */ void m243398a(String str) {
                            C62305c.this.f156544a.setText(str);
                        }

                        @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
                        public void c_(String str, String str2) {
                            if (kVar != null && TextUtils.equals(str, kVar.mo212055d())) {
                                C60735ab.m236001a(new Runnable(str2) {
                                    /* class com.ss.android.vc.meeting.module.meetingdialog.meetinginfo.$$Lambda$c$1$1$2d5wxImDgPhjQonwgX5NgSdsMwQ */
                                    public final /* synthetic */ String f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void run() {
                                        C62305c.View$OnAttachStateChangeListenerC623061.C623071.this.m243398a(this.f$1);
                                    }
                                });
                            }
                        }
                    };
                    kVar.mo212091I().mo212498e().mo212443a(C62305c.this.f156560q);
                }
            }

            public void onViewDetachedFromWindow(View view) {
                C61303k kVar = kVar;
                if (kVar != null) {
                    kVar.mo212091I().mo212498e().mo212444b(C62305c.this.f156560q);
                }
            }
        });
        return inflate;
    }
}
