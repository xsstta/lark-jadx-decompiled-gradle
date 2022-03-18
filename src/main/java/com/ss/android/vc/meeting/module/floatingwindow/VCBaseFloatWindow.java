package com.ss.android.vc.meeting.module.floatingwindow;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60740ad;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.common.widget.PreviewVideoView;
import com.ss.android.vc.dependency.AbstractC60886c;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.ILoadDocsThumbnailCallback;
import com.ss.android.vc.entity.follow.ThumbnailDetail;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.p3117d.C61600b;
import com.ss.android.vc.meeting.module.record.RecordingAniView;
import com.ss.android.vc.meeting.p3104c.C61246b;

public class VCBaseFloatWindow extends AbstractC61729b {

    /* renamed from: d */
    protected static int f154812d = ((UIHelper.getDimens(R.dimen.fv_noshadow_width) - (UIHelper.getDimens(R.dimen.fv_namecontainer_margin) * 2)) - (C60773o.m236115a(4.0d) * 2));

    /* renamed from: A */
    protected Handler f154813A = new Handler(Looper.getMainLooper());

    /* renamed from: B */
    protected String f154814B = "";

    /* renamed from: C */
    protected boolean f154815C = VideoChatModuleDependency.getMultiTaskDependency().mo196453b();

    /* renamed from: D */
    protected C61600b<VCBaseFloatWindow> f154816D = new C61600b<VCBaseFloatWindow>("VCBaseFloatWindow", this) {
        /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.C616901 */

        /* renamed from: b */
        public void mo213458b(VCBaseFloatWindow vCBaseFloatWindow) {
            C60700b.m235851b(this.f154539a, "[WeakRtcEglRenderListener onEndRender]", "onEndRender");
        }

        /* renamed from: a */
        public void mo213457a(VCBaseFloatWindow vCBaseFloatWindow) {
            C60700b.m235851b(this.f154539a, "[WeakRtcEglRenderListener onBeginRender]", "onBeginRender");
            if (!(vCBaseFloatWindow == null || vCBaseFloatWindow.f154838u == null)) {
                vCBaseFloatWindow.f154838u.setVisibility(8);
                C60700b.m235851b("VCBaseFloatWindow", "[WeakRtcEglRenderListener onBeginRender2]", "onBeginRender share icon gone!");
            }
            if (vCBaseFloatWindow != null && vCBaseFloatWindow.f154840w != null && !vCBaseFloatWindow.f154840w.isShown()) {
                vCBaseFloatWindow.f154840w.setVisibility(0);
            }
        }
    };

    /* renamed from: E */
    public boolean f154817E;

    /* renamed from: F */
    private ComponentCallbacks2 f154818F;

    /* renamed from: G */
    private AbstractC60886c.AbstractC60887a f154819G;

    /* renamed from: H */
    private aj.AbstractC60884a f154820H;

    /* renamed from: I */
    private String f154821I = "";

    /* renamed from: e */
    protected ViewGroup f154822e;

    /* renamed from: f */
    protected FrameLayout f154823f;

    /* renamed from: g */
    protected LinearLayout f154824g;

    /* renamed from: h */
    protected View f154825h;

    /* renamed from: i */
    protected ImageView f154826i;

    /* renamed from: j */
    protected ImageView f154827j;

    /* renamed from: k */
    protected TextView f154828k;

    /* renamed from: l */
    protected ImageView f154829l;

    /* renamed from: m */
    protected TextView f154830m;

    /* renamed from: n */
    protected TextView f154831n;

    /* renamed from: o */
    protected View f154832o;

    /* renamed from: p */
    protected RecordingAniView f154833p;

    /* renamed from: q */
    protected PreviewVideoView f154834q;

    /* renamed from: r */
    protected ImageView f154835r;

    /* renamed from: s */
    protected View f154836s;

    /* renamed from: t */
    protected LKUIRoundedImageView f154837t;

    /* renamed from: u */
    protected ImageView f154838u;

    /* renamed from: v */
    protected String f154839v;

    /* renamed from: w */
    protected C61246b f154840w;

    /* renamed from: x */
    protected LinearLayout f154841x;

    /* renamed from: y */
    protected LineHeightTextView f154842y;

    /* renamed from: z */
    protected View f154843z;

    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ void mo213692o() {
        this.f154837t.setVisibility(8);
        this.f154825h.setVisibility(8);
        this.f154827j.setVisibility(8);
    }

    /* access modifiers changed from: public */
    /* renamed from: p */
    private /* synthetic */ void mo213695p() {
        this.f154838u.setVisibility(0);
        this.f154823f.setVisibility(8);
        this.f154825h.setVisibility(8);
        this.f154827j.setVisibility(8);
    }

    public FollowInfo getFollowInfo() {
        return mo213813e().mo212091I().mo212490a().mo212480l();
    }

    public void processShareContent() {
        C60700b.m235851b("VCBaseFloatWindow", "[processShareContent]", "processShareContent");
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$Pvx2Cf_DtPl8GD8SLRTncCCEUQ */

            public final void run() {
                VCBaseFloatWindow.m271245lambda$Pvx2Cf_DtPl8GD8SLRTncCCEUQ(VCBaseFloatWindow.this);
            }
        });
        updateScreenStreamSubscribe(false);
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$SW7S4Hju1GQGqKku2mYVh22SYA */

            public final void run() {
                VCBaseFloatWindow.m271246lambda$SW7S4Hju1GQGqKku2mYVh22SYA(VCBaseFloatWindow.this);
            }
        });
    }

    public void detachScreenShareView() {
        this.f154821I = "";
        if (this.f154840w != null) {
            this.f154838u.setVisibility(0);
            C60700b.m235851b("VCBaseFloatWindow", "[detachScreenShareView]", "[WeakRtcEglRenderListener onBeginRender] onBeginRender share icon visible!");
            mo213813e().mo212165y().mo211992a(this.f154840w.getRenderer());
            this.f154840w = null;
        }
        mo213813e().ag().setFloatWindowWrapper(null);
    }

    public boolean isInFollow() {
        String m = mo213813e().mo212092J().mo212556m();
        String n = mo213813e().mo212092J().mo212558n();
        FollowInfo l = mo213813e().mo212091I().mo212490a().mo212480l();
        C60700b.m235851b("VCBaseFloatWindow", "[isInFollow]", "shareInfo: " + n + ", " + m + "followInfo: " + l);
        if ((TextUtils.isEmpty(m) || TextUtils.isEmpty(n)) && FollowConfig.m241446b() && l != null && !TextUtils.isEmpty(l.getDeviceId())) {
            return true;
        }
        return false;
    }

    public boolean isInShareContent() {
        String m = mo213813e().mo212092J().mo212556m();
        String n = mo213813e().mo212092J().mo212558n();
        C60700b.m235851b("VCBaseFloatWindow", "[isInShareContent]", "shareInfo: " + n + ", " + m);
        if (TextUtils.isEmpty(m) || TextUtils.isEmpty(n)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61729b
    /* renamed from: n */
    public void mo213691n() {
        super.mo213691n();
        if (this.f154834q != null && MeetingManager.m238341a().mo211892a(true)) {
            this.f154834q.mo208477c();
        }
        C61246b bVar = this.f154840w;
        if (!(bVar == null || bVar.getRenderer() == null)) {
            mo213813e().mo212165y().mo211992a(this.f154840w.getRenderer());
            C60740ad.m236044a((View) this.f154840w);
            this.f154840w = null;
        }
        if (this.f154818F != null) {
            ar.m236697b().unregisterComponentCallbacks(this.f154818F);
        }
        if (this.f154819G != null) {
            VideoChatModuleDependency.getAppConfigurationDependency().mo196508b(this.f154819G);
        }
        VideoChatModuleDependency.getSettingDependency().mo196469b(this.f154820H);
        this.f154813A.removeCallbacksAndMessages(null);
    }

    public void showFollowThumbnail() {
        C60700b.m235851b("VCBaseFloatWindow", "[showFollowThumbnail]", "showFollowThumbnail");
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$BvnTdVF07Cop_Ju7HfVKOU4QMM */

            public final void run() {
                VCBaseFloatWindow.m271244lambda$BvnTdVF07Cop_Ju7HfVKOU4QMM(VCBaseFloatWindow.this);
            }
        });
        FollowInfo followInfo = getFollowInfo();
        if (followInfo == null) {
            C60700b.m235851b("VCBaseFloatWindow", "[showFollowThumbnail2]", "followInfo is null");
            return;
        }
        ThumbnailDetail thumbnailDetail = followInfo.getThumbnailDetail();
        if (thumbnailDetail == null || TextUtils.isEmpty(thumbnailDetail.getThumbnailUrl())) {
            C60700b.m235851b("VCBaseFloatWindow", "[showFollowThumbnail3]", "ThumbnailDetail wrong, detail = " + thumbnailDetail);
            return;
        }
        VcDoc vcDoc = new VcDoc();
        vcDoc.setDocUrl(followInfo.getRawUrl());
        vcDoc.setThumbnailDetail(thumbnailDetail);
        C26171w.m94675a(new Runnable(vcDoc) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$jZfvvjUrnzrsAM6sJO9JHk6dIVk */
            public final /* synthetic */ VcDoc f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VCBaseFloatWindow.lambda$jZfvvjUrnzrsAM6sJO9JHk6dIVk(VCBaseFloatWindow.this, this.f$1);
            }
        });
    }

    /* renamed from: u */
    public void mo213716u() {
        int i;
        if (this.f154829l.isShown()) {
            i = UIHelper.getDimens(R.dimen.fv_ic_size) + C60773o.m236115a(2.0d);
        } else {
            i = 0;
        }
        if (((int) this.f154830m.getPaint().measureText(this.f154814B)) + i > f154812d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f154824g.getLayoutParams();
            layoutParams.width = -1;
            this.f154824g.setLayoutParams(layoutParams);
            this.f154824g.setBackground(C60773o.m236128f(R.drawable.vc_bg_floatview_name_long));
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f154824g.getLayoutParams();
            layoutParams2.width = -2;
            this.f154824g.setLayoutParams(layoutParams2);
            this.f154824g.setBackground(C60773o.m236128f(R.drawable.bg_floatview_name_not_fill));
        }
        if (!TextUtils.isEmpty(this.f154814B)) {
            this.f154824g.setVisibility(0);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void mo213204d() {
        String d = mo213813e().mo212092J().mo212534d();
        boolean k = mo213813e().mo212062k();
        C60700b.m235851b("VCBaseFloatWindow", "[processShareContent2]", "idle: " + k + ", shareScreenRtcId: " + d);
        if (!k) {
            if (this.f154840w == null) {
                C60700b.m235851b("VCBaseFloatWindow", "[processShareContent3]", "New surface view wrapper");
                View a = mo213813e().mo212165y().mo211988a(false);
                C61074b.m237511a(a, C60773o.m236126d(R.color.vctoken_meeting_bg_float_video));
                C61246b b = mo213813e().mo212165y().mo212006b(a);
                this.f154840w = b;
                if (b == null) {
                    C60700b.m235864f("VCBaseFloatWindow", "[processShareContent4]", "invalid surfaceViewWrapper");
                    return;
                }
                mo213813e().ag().setGestureSurfaceViewWrapper(this.f154840w);
                mo213813e().ag().checkAndCreateSketchView();
                this.f154840w.setRtcEglRenderListener(this.f154816D);
                this.f154840w.setCornerRadius((float) C60773o.m236115a(8.0d));
                this.f154840w.setAutoRenderMode(true);
                this.f154840w.setId(R.id.gesture_wrapper);
                this.f154840w.setGestureEnable(false);
                mo213813e().ag().setFloatWindowWrapper(this.f154840w);
            }
            if (!this.f154823f.isShown()) {
                this.f154823f.setVisibility(0);
            }
            if (this.f154840w.getParent() != this.f154823f) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                this.f154823f.removeAllViews();
                this.f154823f.addView(this.f154840w, 0, layoutParams);
                this.f154840w.setOnVisible(true);
                this.f154840w.mo211810c();
            }
            if (!TextUtils.equals(this.f154821I, d)) {
                C60700b.m235851b("VCBaseFloatWindow", "[processShareContent5]", "Share surface rebind");
                this.f154838u.setVisibility(0);
                C60700b.m235851b("VCBaseFloatWindow", "[processShareContent6]", "[WeakRtcEglRenderListener onBeginRender] onBeginRender share icon visible!");
                mo213813e().mo212165y().mo212015c(this.f154840w.getRenderer(), d);
            }
            this.f154821I = d;
        }
    }

    /* renamed from: t */
    public void mo213715t() {
        if (this.f154822e == null) {
            this.f154904a.mo213670o().removeAllViews();
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(ar.m236694a()).inflate(R.layout.layout_float_view_new, (ViewGroup) this.f154904a.mo213670o(), true);
            this.f154822e = viewGroup;
            this.f154906c = viewGroup;
            this.f154823f = (FrameLayout) this.f154822e.findViewById(R.id.container_surface);
            this.f154824g = (LinearLayout) this.f154822e.findViewById(R.id.container_name);
            this.f154825h = this.f154822e.findViewById(R.id.container_avatar);
            this.f154826i = (ImageView) this.f154822e.findViewById(R.id.img_avatar);
            this.f154827j = (ImageView) this.f154822e.findViewById(R.id.camera_unavailable);
            this.f154828k = (TextView) this.f154822e.findViewById(R.id.tv_status);
            this.f154829l = (ImageView) this.f154822e.findViewById(R.id.img_icon);
            this.f154830m = (TextView) this.f154822e.findViewById(R.id.tv_name);
            this.f154831n = (TextView) this.f154822e.findViewById(R.id.tag_live);
            this.f154832o = this.f154822e.findViewById(R.id.tag_record);
            this.f154833p = (RecordingAniView) this.f154822e.findViewById(R.id.img_record_ic);
            this.f154834q = (PreviewVideoView) this.f154822e.findViewById(R.id.lobbyLayout);
            this.f154835r = (ImageView) this.f154822e.findViewById(R.id.avatarView);
            this.f154837t = (LKUIRoundedImageView) this.f154822e.findViewById(R.id.follow_thumbnail);
            this.f154841x = (LinearLayout) this.f154822e.findViewById(R.id.breakout_room_cover);
            this.f154842y = (LineHeightTextView) this.f154822e.findViewById(R.id.breakout_room_tv);
            this.f154838u = (ImageView) this.f154822e.findViewById(R.id.share_icon);
            this.f154843z = this.f154822e.findViewById(R.id.foreground_follow_thumbnail);
            View c = C61237h.m238223a().mo210531c(false);
            this.f154836s = c;
            C61074b.m237510a(c, (float) C60773o.m236115a(8.0d));
            this.f154817E = UDUiModeUtils.m93319a(ar.m236697b().getApplicationContext());
            this.f154818F = new ComponentCallbacks2() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.ComponentCallbacks2C616912 */

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                }

                public void onConfigurationChanged(Configuration configuration) {
                    boolean a = UDUiModeUtils.m93320a(configuration);
                    if (a != VCBaseFloatWindow.this.f154817E) {
                        VCBaseFloatWindow.this.f154817E = a;
                        VCBaseFloatWindow.this.f154813A.postDelayed(new Runnable() {
                            /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.ComponentCallbacks2C616912.RunnableC616921 */

                            public void run() {
                                VCBaseFloatWindow.this.k_(false);
                            }
                        }, 100);
                    }
                }
            };
            ar.m236697b().registerComponentCallbacks(this.f154818F);
            this.f154819G = new AbstractC60886c.AbstractC60887a() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.C616933 */

                @Override // com.ss.android.vc.dependency.AbstractC60886c.AbstractC60887a
                /* renamed from: a */
                public void mo208747a(int i) {
                    boolean z;
                    ByteRTCMeetingActivity a;
                    VCBaseFloatWindow vCBaseFloatWindow = VCBaseFloatWindow.this;
                    if ((i & 48) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vCBaseFloatWindow.f154817E = z;
                    if (!(VCBaseFloatWindow.this.mo213813e() == null || (a = VCBaseFloatWindow.this.mo213813e().aE().mo208290a()) == null)) {
                        a.finishAndRemoveTask();
                    }
                    VCBaseFloatWindow.this.f154813A.postDelayed(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.C616933.RunnableC616941 */

                        public void run() {
                            VCBaseFloatWindow.this.k_(true);
                        }
                    }, 100);
                }
            };
            VideoChatModuleDependency.getAppConfigurationDependency().mo196507a(this.f154819G);
            this.f154820H = new aj.AbstractC60884a() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.C616954 */

                @Override // com.ss.android.vc.dependency.aj.AbstractC60884a
                /* renamed from: a */
                public void mo208735a() {
                    ByteRTCMeetingActivity a;
                    if (VCBaseFloatWindow.this.mo213813e() != null && VCBaseFloatWindow.this.mo213813e().aE().mo208293c() && (a = VCBaseFloatWindow.this.mo213813e().aE().mo208290a()) != null) {
                        a.finishAndRemoveTask();
                    }
                }
            };
            VideoChatModule.getDependency().getSettingDependency().mo196468a(this.f154820H);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m240884d(int i) {
        LKUIRoundedImageView lKUIRoundedImageView = this.f154837t;
        if (lKUIRoundedImageView != null) {
            lKUIRoundedImageView.setVisibility(i);
        }
    }

    public void setFollowThumbnailVisibility(int i) {
        C26171w.m94675a(new Runnable(i) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$wAt4YXPovDvDARimIWUcQYfe25I */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VCBaseFloatWindow.lambda$wAt4YXPovDvDARimIWUcQYfe25I(VCBaseFloatWindow.this, this.f$1);
            }
        });
    }

    public void setShareIconVisibility(int i) {
        C26171w.m94675a(new Runnable(i) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$0wxzYResuMjF3DXMkxyt4Xi7qQ */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VCBaseFloatWindow.m271243lambda$0wxzYResuMjF3DXMkxyt4Xi7qQ(VCBaseFloatWindow.this, this.f$1);
            }
        });
    }

    public void updateScreenStreamSubscribe(boolean z) {
        mo213813e().ay().mo216071c(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m240885e(int i) {
        ImageView imageView = this.f154838u;
        if (imageView != null) {
            imageView.setVisibility(i);
            C60700b.m235851b("VCBaseFloatWindow", "[setShareIconVisibility]", "[WeakRtcEglRenderListener onBeginRender] onBeginRender share icon visible!");
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240881a(VcDoc vcDoc) {
        this.f154837t.setImageDrawable(null);
        this.f154837t.setVisibility(0);
        this.f154843z.setVisibility(0);
        VideoChatModuleDependency.getDocsDependency().mo196377a(ar.m236694a(), vcDoc, this.f154837t, true, new ILoadDocsThumbnailCallback() {
            /* class com.ss.android.vc.meeting.module.floatingwindow.VCBaseFloatWindow.C616965 */

            @Override // com.ss.android.vc.entity.follow.ILoadDocsThumbnailCallback
            public boolean onLoadFailed() {
                C60700b.m235864f("VCBaseFloatWindow", "[showFollowThumbnail5]", "[onLoadFailed]");
                VCBaseFloatWindow.this.f154838u.setVisibility(0);
                VCBaseFloatWindow.this.f154837t.setVisibility(8);
                VCBaseFloatWindow.this.f154843z.setVisibility(8);
                VCBaseFloatWindow.this.f154825h.setVisibility(8);
                VCBaseFloatWindow.this.f154827j.setVisibility(8);
                VCBaseFloatWindow.this.f154839v = null;
                return true;
            }

            @Override // com.ss.android.vc.entity.follow.ILoadDocsThumbnailCallback
            public boolean onResourceReady() {
                C60700b.m235851b("VCBaseFloatWindow", "[showFollowThumbnail4]", "[onResourceReady]");
                VCBaseFloatWindow.this.f154838u.setVisibility(8);
                VCBaseFloatWindow.this.f154825h.setVisibility(8);
                VCBaseFloatWindow.this.f154827j.setVisibility(8);
                VCBaseFloatWindow.this.f154843z.setVisibility(8);
                VCBaseFloatWindow vCBaseFloatWindow = VCBaseFloatWindow.this;
                vCBaseFloatWindow.f154839v = vCBaseFloatWindow.mo213813e().mo212091I().mo212490a().mo212480l().getRawUrl();
                return false;
            }
        });
    }

    public void k_(boolean z) {
        ViewGroup viewGroup = this.f154822e;
        if (viewGroup != null) {
            viewGroup.findViewById(R.id.bg_float_window).setBackground(C60773o.m236128f(R.drawable.bg_float_view_2));
            this.f154822e.findViewById(R.id.v_bg_float_window_lobby).setBackground(C60773o.m236128f(R.drawable.bg_float_window_lobby));
            this.f154822e.findViewById(R.id.v_bg_border).setBackground(C60773o.m236128f(R.drawable.bg_float_window_border));
            this.f154838u.setBackground(C60773o.m236128f(R.drawable.bg_floatwindow));
            this.f154832o.setBackground(C60773o.m236128f(R.drawable.bg_floatview_record));
            this.f154841x.setBackground(C60773o.m236128f(R.drawable.bg_floatwindow_live));
            this.f154833p.setBackground(C60773o.m236128f(R.drawable.shape_oval_r400));
            this.f154838u.getDrawable().setTint(C60773o.m236126d(R.color.ud_N400));
            this.f154828k.setTextColor(C60773o.m236126d(R.color.text_caption));
            mo213716u();
            this.f154830m.setTextColor(C60773o.m236126d(R.color.text_title));
            this.f154842y.setTextColor(C60773o.m236126d(R.color.text_caption));
            ((TextView) this.f154822e.findViewById(R.id.ifv_record_en_new)).setTextColor(C60773o.m236126d(R.color.text_title));
            ((TextView) this.f154822e.findViewById(R.id.tv_waiting)).setTextColor(C60773o.m236126d(R.color.static_white));
        }
    }

    public void setBreakoutRoomCoverVisibility(AbsBreakoutRoomControl.Status status, int i) {
        C26171w.m94675a(new Runnable(status, i) {
            /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$VCBaseFloatWindow$NonG4swb6Cfe9azshIq7nlxCT_g */
            public final /* synthetic */ AbsBreakoutRoomControl.Status f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                VCBaseFloatWindow.lambda$NonG4swb6Cfe9azshIq7nlxCT_g(VCBaseFloatWindow.this, this.f$1, this.f$2);
            }
        });
    }

    public VCBaseFloatWindow(IFloatWindowPresent iFloatWindowPresent, IFloatWindowPresent.FloatWindowType floatWindowType) {
        super(iFloatWindowPresent, floatWindowType);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m240882a(AbsBreakoutRoomControl.Status status, int i) {
        String str;
        VCBreakoutRoomInfo k = mo213813e().al().mo213184k();
        if (k != null) {
            str = k.getRoomTopic();
        } else {
            str = "";
        }
        if (status == AbsBreakoutRoomControl.Status.LEAVING) {
            this.f154842y.setText(UIHelper.getString(R.string.View_G_ReturningToMainRoom));
        } else if (status == AbsBreakoutRoomControl.Status.JOINING) {
            this.f154842y.setText(UIHelper.mustacheFormat((int) R.string.View_G_JoiningRoom, "roomName", str));
        }
        LinearLayout linearLayout = this.f154841x;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }
}
