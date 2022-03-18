package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LiveSettingGuideView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.livestream.C60944d;
import com.ss.android.vc.entity.livestream.LiveInfo;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.request.VideoChatLiveActionEntityRequest;
import com.ss.android.vc.entity.response.bb;
import com.ss.android.vc.lark.guidetips.VideoChatGuideConstants;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.livestream.C62075j;
import com.ss.android.vc.meeting.module.livestream.RunnableC62069g;
import com.ss.android.vc.meeting.module.livestream.activity.RealAuthenticationActivity;
import com.ss.android.vc.meeting.module.livestream.view.LiveActionView;
import com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView;
import com.ss.android.vc.meeting.module.livestream.view.LivePrivilegeView;
import com.ss.android.vc.meeting.module.livestream.view.LiveReactionView;
import com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j;
import com.ss.android.vc.meeting.utils.SpanUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.statistics.event.aq;
import com.ss.android.vc.statistics.event2.LiveMeetingSettingEvent;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import java.util.LinkedList;

/* renamed from: com.ss.android.vc.meeting.module.o.a.j */
public class C62580j {

    /* renamed from: a */
    public Activity f157534a;

    /* renamed from: b */
    public View f157535b;

    /* renamed from: c */
    public C61303k f157536c;

    /* renamed from: d */
    public C62590b f157537d;

    /* renamed from: e */
    public AbstractC62589a f157538e;

    /* renamed from: f */
    private AbstractC61222a f157539f;

    /* renamed from: g */
    private LiveSettingGuideView f157540g;

    /* renamed from: h */
    private boolean f157541h = true;

    /* renamed from: i */
    private VideoChatLiveActionEntityRequest.Action f157542i = VideoChatLiveActionEntityRequest.Action.START;

    /* renamed from: com.ss.android.vc.meeting.module.o.a.j$a */
    public interface AbstractC62589a {
        void onChanged(boolean z);
    }

    /* renamed from: a */
    public void mo216349a(AbstractC62589a aVar) {
        this.f157538e = aVar;
    }

    /* renamed from: a */
    public View mo216346a() {
        View inflate = LayoutInflater.from(this.f157534a).inflate(R.layout.dialog_live_setting, (ViewGroup) null);
        this.f157535b = inflate;
        this.f157540g = (LiveSettingGuideView) inflate.findViewById(R.id.view_guide);
        mo216350b();
        return this.f157535b;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m244791h() {
        this.f157539f.dismiss();
    }

    /* renamed from: d */
    private void m244787d() {
        VcBizSender.m249264d(this.f157536c.mo212055d(), new AbstractC63598b<bb>() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625822 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m244798a(C63602e eVar) {
                if (eVar != null) {
                    C60700b.m235851b("LiveSettingViewHolder", "[onError]", eVar.toString());
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$2$y74RRCeYmcmgn7khraHfymHqRQ */

                    public final void run() {
                        C62580j.C625822.m244798a(C63602e.this);
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(bb bbVar) {
                C60735ab.m236001a(new Runnable(bbVar) {
                    /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$2$uX7cH6_SC8LlcWQd78w88tknUw */
                    public final /* synthetic */ bb f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C62580j.C625822.this.m244799b(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m244799b(bb bbVar) {
                if (bbVar == null) {
                    C60700b.m235851b("LiveSettingViewHolder", "[pullLiveSetting3]", "VideoChatPullLiveSettingEntity = null");
                } else if (bbVar.f152672c != null) {
                    if (bbVar.f152672c.f152681b != null) {
                        boolean z = bbVar.f152672c.f152681b.f152675b;
                        C60700b.m235851b("LiveSettingViewHolder", "[pullLiveSetting]", "public scope disable : " + z);
                        if (z) {
                            C62580j.this.f157537d.f157554b.f155992a.setEnabled(false);
                            SpanUtil.f160471a.mo219672a(C62580j.this.f157537d.f157554b.f155996e, C62580j.this.f157534a, MeetingChargingEvent.Type.LIVE);
                        } else {
                            C62580j.this.f157537d.f157554b.f155992a.setEnabled(true);
                        }
                    }
                    if (bbVar.f152672c.f152680a != null) {
                        boolean z2 = bbVar.f152672c.f152680a.f152675b;
                        C60700b.m235851b("LiveSettingViewHolder", "[pullLiveSetting2]", "tenant scope disable : " + z2);
                        if (z2) {
                            C62580j.this.f157537d.f157554b.f155993b.setEnabled(false);
                            SpanUtil.f160471a.mo219672a(C62580j.this.f157537d.f157554b.f155997f, C62580j.this.f157534a, MeetingChargingEvent.Type.LIVE);
                            return;
                        }
                        C62580j.this.f157537d.f157554b.f155993b.setEnabled(true);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m244790g() {
        VideoChatModule.getDependency().getGuideDependency().completeGuide("all_vc_live_layout_setting", true);
    }

    /* renamed from: c */
    public void mo216351c() {
        boolean z;
        if (this.f157538e != null && this.f157541h) {
            LiveInfo c = this.f157536c.am().mo214677c();
            AbstractC62589a aVar = this.f157538e;
            if (c != null) {
                z = c.mo209943b();
            } else {
                z = false;
            }
            aVar.onChanged(z);
        }
    }

    /* renamed from: e */
    private void m244788e() {
        VcBizSender.m249169a(this.f157536c.mo212055d(), this.f157542i, this.f157537d.f157554b.getPrivilege(), m244781b(this.f157537d.f157555c.getStyle()), this.f157537d.f157556d.getEnable(), C62075j.m242555e()).mo219889a(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625866 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m244805b(DialogInterface dialogInterface, int i) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("LiveSettingViewHolder", "[startLiveAction3]", "<LiveStreamTag> error=" + eVar);
                if (C62580j.this.f157538e != null) {
                    C62580j.this.f157538e.onChanged(false);
                }
            }

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                boolean z;
                C60700b.m235851b("LiveSettingViewHolder", "[startLiveAction]", "<LiveStreamTag> onSuccess");
                if (dVar == null || !dVar.f152540b) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C60700b.m235851b("LiveSettingViewHolder", "[startLiveAction2]", "<LiveStreamTag> onSuccess need_verification");
                    VCDialogUtils.m236177a((Context) C62580j.this.f157534a, (int) R.string.View_G_PersonalRealNameAuthentication, 2, (int) R.string.View_G_AuthenticateToLivestreamLegal, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$j$6$iHMRxFw5qwaTxCQMaehpS0e8V0.INSTANCE, (int) R.string.View_G_GoToAuthentication, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$6$GbEcrrhxP_t4EsMcQmxUwhBzPBY */

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C62580j.C625866.this.m244804a(dialogInterface, i);
                        }
                    }, false);
                    return;
                }
                C62580j.this.f157537d.f157557e.setState(true);
                if (C62580j.this.f157538e != null) {
                    C62580j.this.f157538e.onChanged(true);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m244804a(DialogInterface dialogInterface, int i) {
                RealAuthenticationActivity.m242374a(C62580j.this.f157534a, C62580j.this.f157536c.mo212055d(), false);
                C60700b.m235851b("LiveSettingViewHolder", "[checkRealNameAuth]", "onSuccess gotoAuthPage");
            }
        });
        this.f157541h = false;
        this.f157539f.dismiss();
    }

    /* renamed from: f */
    private void m244789f() {
        if (C60773o.m236120a(C60773o.m236124b(this.f157534a))) {
            VCDialogUtils.m236185a((Context) this.f157534a, C60773o.m236119a((int) R.string.View_M_StopLivestreamingQuestionNew), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$C7S2ecJhXRLACTMt0CGqWh6ADI */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62580j.this.m244782b(dialogInterface, i);
                }
            }, (int) R.string.View_G_StopButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$o5JHrKHzGwSMr0kchdCIHzsfa0 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62580j.this.m244774a((C62580j) dialogInterface, (DialogInterface) i);
                }
            }, false, (DialogInterface.OnShowListener) new DialogInterface.OnShowListener() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$Y35CAAeka8fq578fCyQNHApJwA */

                public final void onShow(DialogInterface dialogInterface) {
                    C62580j.this.m244773a((C62580j) dialogInterface);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.o.a.j$8 */
    public static /* synthetic */ class C625888 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157551a;

        /* renamed from: b */
        static final /* synthetic */ int[] f157552b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style[] r0 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157552b = r0
                r1 = 1
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r2 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.LIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157552b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r3 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.GALLERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157552b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$Style r4 = com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.Style.FULLSCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$LayoutStyle[] r3 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.LayoutStyle.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157551a = r3
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$LayoutStyle r4 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.LayoutStyle.LIST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157551a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$LayoutStyle r3 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.LayoutStyle.GALLERY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.f157551a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.ss.android.vc.entity.InMeetingData$LiveMeetingData$LayoutStyle r1 = com.ss.android.vc.entity.InMeetingData.LiveMeetingData.LayoutStyle.SIMPLE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625888.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.o.a.j$b */
    public class C62590b {

        /* renamed from: a */
        public View f157553a;

        /* renamed from: b */
        public LivePrivilegeView f157554b;

        /* renamed from: c */
        public LiveLayoutStyleView f157555c;

        /* renamed from: d */
        public LiveReactionView f157556d;

        /* renamed from: e */
        public LiveActionView f157557e;

        /* renamed from: a */
        public void mo216358a() {
            this.f157553a = C62580j.this.f157535b.findViewById(R.id.ll_share_live_url);
            this.f157554b = (LivePrivilegeView) C62580j.this.f157535b.findViewById(R.id.privilege);
            this.f157555c = (LiveLayoutStyleView) C62580j.this.f157535b.findViewById(R.id.layoutstyle);
            this.f157556d = (LiveReactionView) C62580j.this.f157535b.findViewById(R.id.reaction);
            this.f157557e = (LiveActionView) C62580j.this.f157535b.findViewById(R.id.action);
        }

        C62590b() {
        }
    }

    /* renamed from: b */
    public void mo216350b() {
        int i;
        int i2;
        C62590b bVar = new C62590b();
        this.f157537d = bVar;
        bVar.mo216358a();
        final LiveInfo c = this.f157536c.am().mo214677c();
        if (c == null) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$4J8WoW7TdqoCLZpnKBCq4hEUxfw */

                public final void run() {
                    C62580j.this.m244791h();
                }
            });
            return;
        }
        this.f157537d.f157553a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625811 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                long j;
                LiveMeetingSettingEvent.m249762a().mo220256a("is_copy_link", "vc_live_meeting_setting_view", null, null, null, C62580j.this.f157536c.mo212056e());
                MeetingOnTheCallEvent2.m249823a().mo220309b(C62580j.this.f157536c, "copy_live_link");
                VideoChat e = C62580j.this.f157536c.mo212056e();
                LiveInfo aVar = c;
                if (aVar != null) {
                    j = aVar.mo209952j();
                } else {
                    j = 0;
                }
                aq.m250033a(e, Long.valueOf(j), C62580j.this.f157536c.am().mo214676b());
                new RunnableC62069g(C62580j.this.f157536c).run();
            }
        });
        this.f157537d.f157554b.mo214850a(c.mo209946d(), c.mo209947e());
        LivePrivilegeView livePrivilegeView = this.f157537d.f157554b;
        int i3 = 0;
        if (C62075j.m242555e()) {
            i = 0;
        } else {
            i = 8;
        }
        livePrivilegeView.setVisibility(i);
        this.f157537d.f157554b.setOnPrivilegeListener(new LivePrivilegeView.AbstractC62095a() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$epsAhKE24DGWbNle_WpsyF6BC0g */

            @Override // com.ss.android.vc.meeting.module.livestream.view.LivePrivilegeView.AbstractC62095a
            public final void onPrivilege(InMeetingData.LiveMeetingData.Privilege privilege) {
                C62580j.this.m244784b((C62580j) privilege);
            }
        });
        this.f157537d.f157555c.mo214842a(m244772a(c.mo209948f(), LiveLayoutStyleView.Style.LIST), m244772a(c.mo209949g(), LiveLayoutStyleView.Style.LIST));
        LiveLayoutStyleView liveLayoutStyleView = this.f157537d.f157555c;
        if (C62075j.m242556f()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        liveLayoutStyleView.setVisibility(i2);
        this.f157537d.f157555c.setOnStyleListener(new LiveLayoutStyleView.AbstractC62094a() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$cEmZCZ1CacDafDxQfhmtjdgIBk */

            @Override // com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.AbstractC62094a
            public final void onStyle(LiveLayoutStyleView.Style style) {
                C62580j.this.m244786c(style);
            }
        });
        this.f157537d.f157556d.mo214855a(c.mo209950h(), c.mo209951i());
        LiveReactionView liveReactionView = this.f157537d.f157556d;
        if (!C62075j.m242557g()) {
            i3 = 8;
        }
        liveReactionView.setVisibility(i3);
        this.f157537d.f157556d.setOnEnableListener(new LiveReactionView.AbstractC62096a() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$HfshdPRTR3TBDjr7LmKayQDHHXU */

            @Override // com.ss.android.vc.meeting.module.livestream.view.LiveReactionView.AbstractC62096a
            public final void onEnable(boolean z) {
                C62580j.this.m244785b((C62580j) z);
            }
        });
        this.f157537d.f157557e.setState(c.mo209943b());
        this.f157537d.f157557e.setOnActionListener(new LiveActionView.AbstractC62089b(c) {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$lD2RdtKSDFdzlpCkR0F3AaLBk */
            public final /* synthetic */ LiveInfo f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.meeting.module.livestream.view.LiveActionView.AbstractC62089b
            public final void onAction(boolean z) {
                C62580j.this.m244778a((C62580j) this.f$1, (LiveInfo) z);
            }
        });
        this.f157535b.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.$$Lambda$j$NrWfhE1REX9AMw0cKSSaJmbWVX8 */

            public final void onClick(View view) {
                C62580j.this.m244783b((C62580j) view);
            }
        });
        m244776a(this.f157537d.f157555c.getGuideAnchorView(), VideoChatGuideConstants.GuideType.LiveSetting);
        m244787d();
    }

    /* renamed from: a */
    public void mo216348a(VideoChatLiveActionEntityRequest.Action action) {
        this.f157542i = action;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244783b(View view) {
        this.f157539f.dismiss();
    }

    /* renamed from: a */
    public void mo216347a(MsgWithUrlInfo bVar) {
        this.f157537d.f157557e.setMsgWithUrlInfo(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244773a(DialogInterface dialogInterface) {
        LiveMeetingSettingEvent.m249762a().mo220258b(this.f157536c.mo212056e());
    }

    /* renamed from: b */
    private InMeetingData.LiveMeetingData.LayoutStyle m244781b(LiveLayoutStyleView.Style style) {
        InMeetingData.LiveMeetingData.LayoutStyle layoutStyle = InMeetingData.LiveMeetingData.LayoutStyle.STYLE_UNKNOWN;
        int i = C625888.f157552b[style.ordinal()];
        if (i == 1) {
            return InMeetingData.LiveMeetingData.LayoutStyle.LIST;
        }
        if (i == 2) {
            return InMeetingData.LiveMeetingData.LayoutStyle.GALLERY;
        }
        if (i != 3) {
            return layoutStyle;
        }
        return InMeetingData.LiveMeetingData.LayoutStyle.SIMPLE;
    }

    /* renamed from: a */
    private void m244775a(View view) {
        NewGuideDelegate.m240526a(new NewGuideConfig(view, "all_vc_live_layout_setting", null, this.f157534a.getString(R.string.View_M_ChooseLayoutOnboarding)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m244784b(InMeetingData.LiveMeetingData.Privilege privilege) {
        long j;
        LiveInfo c = this.f157536c.am().mo214677c();
        VideoChat e = this.f157536c.mo212056e();
        if (c != null) {
            j = c.mo209952j();
        } else {
            j = 0;
        }
        aq.m250034a(e, Long.valueOf(j), this.f157536c.am().mo214676b(), privilege);
        if (this.f157536c.am().mo214676b()) {
            VcBizSender.m249170a(this.f157536c.mo212055d(), VideoChatLiveActionEntityRequest.Action.LIVE_SETTING, privilege, C62075j.m242555e()).mo219889a(new AbstractC63598b<C60944d>() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625833 */

                /* renamed from: a */
                public void onSuccess(C60944d dVar) {
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    if (eVar.f160600c) {
                        C60738ac.m236039c(eVar.f160599b.getMessage());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m244786c(LiveLayoutStyleView.Style style) {
        long j;
        LiveInfo c = this.f157536c.am().mo214677c();
        VideoChat e = this.f157536c.mo212056e();
        if (c != null) {
            j = c.mo209952j();
        } else {
            j = 0;
        }
        aq.m250035a(e, Long.valueOf(j), this.f157536c.am().mo214676b(), style);
        if (this.f157536c.am().mo214676b()) {
            VcBizSender.m249168a(this.f157536c.mo212055d(), VideoChatLiveActionEntityRequest.Action.LIVE_SETTING, m244781b(style)).mo219889a(new AbstractC63598b<C60944d>() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625844 */

                /* renamed from: a */
                public void onSuccess(C60944d dVar) {
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    if (eVar.f160600c) {
                        C60738ac.m236039c(eVar.f160599b.getMessage());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m244785b(boolean z) {
        long j;
        LiveInfo c = this.f157536c.am().mo214677c();
        VideoChat e = this.f157536c.mo212056e();
        if (c != null) {
            j = c.mo209952j();
        } else {
            j = 0;
        }
        aq.m250037a(e, Long.valueOf(j), this.f157536c.am().mo214676b(), z);
        if (this.f157536c.am().mo214676b()) {
            VcBizSender.m249171a(this.f157536c.mo212055d(), VideoChatLiveActionEntityRequest.Action.LIVE_SETTING, z).mo219889a(new AbstractC63598b<C60944d>() {
                /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625855 */

                /* renamed from: a */
                public void onSuccess(C60944d dVar) {
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    if (eVar.f160600c) {
                        C60738ac.m236039c(eVar.f160599b.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private LiveLayoutStyleView.Style m244772a(InMeetingData.LiveMeetingData.LayoutStyle layoutStyle, LiveLayoutStyleView.Style style) {
        int i = C625888.f157551a[layoutStyle.ordinal()];
        if (i == 1) {
            return LiveLayoutStyleView.Style.LIST;
        }
        if (i == 2) {
            return LiveLayoutStyleView.Style.GALLERY;
        }
        if (i != 3) {
            return style;
        }
        return LiveLayoutStyleView.Style.FULLSCREEN;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244774a(DialogInterface dialogInterface, int i) {
        LiveMeetingSettingEvent.m249762a().mo220257a("confirm", "vc_meeting_onthecall_view", this.f157536c.mo212056e());
        aq.m250047c(this.f157536c.mo212056e());
        VcBizSender.m249167a(this.f157536c.mo212055d(), VideoChatLiveActionEntityRequest.Action.STOP, (ByteviewUser) null, (String) null).mo219889a(new AbstractC63598b<C60944d>() {
            /* class com.ss.android.vc.meeting.module.p3148o.p3149a.C62580j.C625877 */

            /* renamed from: a */
            public void onSuccess(C60944d dVar) {
                C60700b.m235851b("LiveSettingViewHolder", "[stopLiveAction]", "<LiveStreamTag> onSuccess");
                C62580j.this.f157537d.f157557e.setState(false);
                C62580j.this.f157536c.am().mo214675b(false);
                if (C62580j.this.f157538e != null) {
                    C62580j.this.f157538e.onChanged(false);
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("LiveSettingViewHolder", "[stopLiveAction2]", "<LiveStreamTag> error=" + eVar);
                if (C62580j.this.f157538e != null) {
                    C62580j.this.f157538e.onChanged(true);
                }
            }
        });
        this.f157541h = false;
        this.f157539f.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m244782b(DialogInterface dialogInterface, int i) {
        aq.m250049d(this.f157536c.mo212056e());
        LiveMeetingSettingEvent.m249762a().mo220257a("cancel", "vc_live_meeting_setting_view", this.f157536c.mo212056e());
    }

    /* renamed from: a */
    private void m244776a(View view, VideoChatGuideConstants.GuideType guideType) {
        if (guideType != VideoChatGuideConstants.GuideType.LiveSetting) {
            return;
        }
        if (NewGuideDelegate.m240533b()) {
            LiveSettingGuideView liveSettingGuideView = this.f157540g;
            if (liveSettingGuideView != null) {
                liveSettingGuideView.mo208462b();
            }
            m244775a(view);
        } else if (!VideoChatModuleDependency.getGuideDependency().checkToShow("all_vc_live_layout_setting") || view == null || view.getVisibility() != 0) {
            LiveSettingGuideView liveSettingGuideView2 = this.f157540g;
            if (liveSettingGuideView2 != null) {
                liveSettingGuideView2.mo208462b();
            }
        } else {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new LiveSettingGuideView.C60808a("all_vc_live_layout_setting", this.f157534a.getString(R.string.View_M_ChooseLayoutOnboarding)));
            this.f157540g.setDismissListener($$Lambda$j$Asph45NlrC7bxvh7RvA2qDfaLhU.INSTANCE);
            this.f157540g.mo208461a(view, linkedList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m244778a(LiveInfo aVar, boolean z) {
        long j = 0;
        if (z) {
            VideoChat e = this.f157536c.mo212056e();
            if (aVar != null) {
                j = aVar.mo209952j();
            }
            aq.m250032a(e, Long.valueOf(j), this.f157537d.f157554b.getPrivilege(), this.f157537d.f157555c.getStyle(), this.f157537d.f157556d.getEnable());
            LiveMeetingSettingEvent.m249762a().mo220256a("start_upstreaming", "vc_meeting_onthecall_view", this.f157537d.f157554b.getPrivilege(), this.f157537d.f157555c.getStyle(), Boolean.valueOf(this.f157537d.f157556d.getEnable()), this.f157536c.mo212056e());
            m244788e();
            return;
        }
        if (aVar != null) {
            j = aVar.mo209952j();
        }
        aq.m250048c(Long.valueOf(j), this.f157536c.mo212056e());
        m244789f();
        LiveMeetingSettingEvent.m249762a().mo220256a("end_upstreaming", "vc_live_confirm_view", this.f157537d.f157554b.getPrivilege(), this.f157537d.f157555c.getStyle(), Boolean.valueOf(this.f157537d.f157556d.getEnable()), this.f157536c.mo212056e());
    }

    public C62580j(Context context, C61303k kVar, AbstractC61222a aVar) {
        this.f157534a = C60773o.m236124b(context);
        this.f157539f = aVar;
        this.f157536c = kVar;
    }
}
