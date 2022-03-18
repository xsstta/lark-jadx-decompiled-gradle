package com.ss.android.lark.voip.service.impl.app;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.ak;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.ui.CommonLoadingView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.AbstractC58041d;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58136v;
import com.ss.android.lark.voip.service.impl.app.feedback.C58063a;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.lark.voip.service.impl.util.VoIPAudioManager;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.irtc.RtcNetworkQualityInfo;
import io.reactivex.functions.Consumer;

public class VoIpCallView implements AbstractC58041d.AbstractC58044b, C58103o.AbstractC58117b, C58136v.AbstractC58137a, VoIPAudioManager.AbstractC58193a {

    /* renamed from: a */
    public final boolean f142744a;

    /* renamed from: b */
    public AbstractC58041d.AbstractC58044b.AbstractC58045a f142745b;

    /* renamed from: c */
    private boolean f142746c;

    /* renamed from: d */
    private boolean f142747d;

    /* renamed from: e */
    private final Activity f142748e;

    /* renamed from: f */
    private final AbstractC58030a f142749f;
    @BindView(9070)
    ImageView mBlurBkg;
    @BindView(9069)
    View mBlurImageFg;
    @BindView(9211)
    TextView mCallStatus;
    @BindView(9249)
    TextView mCancel;
    @BindView(9006)
    ImageView mChatterAvatar;
    @BindView(10673)
    TextView mChatterName;
    @BindView(9379)
    TextView mConfirm;
    @BindView(9437)
    View mContract;
    @BindView(9916)
    LKUILottieAnimationView mHeadRipple;
    @BindView(10672)
    TextView mMuteTip;
    @BindView(11367)
    TextView mSpeakerTip;
    @BindView(11395)
    CommonLoadingView mStartLoadingView;
    @BindView(12027)
    FrameLayout mStatusToast;
    @BindView(10254)
    View mVoIPContent;
    @BindView(12024)
    ViewGroup mVoipCallContainer;

    /* renamed from: com.ss.android.lark.voip.service.impl.app.VoIpCallView$a */
    public interface AbstractC58030a {
        /* renamed from: a */
        void mo196713a(Object obj);

        /* renamed from: a */
        void mo196714a(boolean z);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: g */
    public void mo196757g() {
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    public void bs_() {
        mo196758h();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58103o.AbstractC58117b
    /* renamed from: a */
    public void mo196668a(String str, RtcNetworkQualityInfo rtcNetworkQualityInfo) {
        if (Math.abs(rtcNetworkQualityInfo.f152893d) == 1 || rtcNetworkQualityInfo.f152893d == 0) {
            this.mStatusToast.setVisibility(0);
        } else if (rtcNetworkQualityInfo.f152893d > 1) {
            this.mStatusToast.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196748a(boolean z) {
        this.f142749f.mo196714a(z);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196747a(String str) {
        this.mCallStatus.setText(str);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196749a(boolean z, boolean z2, Chatter chatter, int i) {
        Context context = this.mVoIPContent.getContext();
        $$Lambda$VoIpCallView$UH37thGfK0C8QJNFhS5xDlKEa0 r7 = new Runnable(context, i, chatter, z2) {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$UH37thGfK0C8QJNFhS5xDlKEa0 */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ Chatter f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                VoIpCallView.this.m225070a((VoIpCallView) this.f$1, (Context) this.f$2, (int) this.f$3, (Chatter) this.f$4);
            }
        };
        if (z) {
            new C25639g(context).mo89248g(R.string.View_A_MinCallSpeakerMode).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.View_G_OkButton, new DialogInterface.OnClickListener(r7) {
                /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$StrvnTVjlcXSawM75EN79d0gfc */
                public final /* synthetic */ Runnable f$0;

                {
                    this.f$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    VoIpCallView.m225074a(this.f$0, dialogInterface, i);
                }
            }).mo89239c();
        } else {
            r7.run();
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AbstractC58193a
    /* renamed from: a */
    public void mo196667a(VoIPAudioManager.AudioType audioType, boolean z, boolean z2) {
        AbstractC58041d.AbstractC58044b.AbstractC58045a aVar;
        VoiceCall j;
        if (z2 && (aVar = this.f142745b) != null && (j = aVar.mo196800j()) != null) {
            VoipHitPoint.m225606a(j.getStatus() == VoiceCall.Status.ON_THE_CALL ? "voip_call_page_onthecall" : "voip_call_page_calling", audioType, z, j.getId(), C58133t.m225480a(j));
        }
    }

    /* renamed from: j */
    private void m225084j() {
        StatusBarUtil.setTransparentForImageView(this.f142748e, this.mContract);
    }

    /* renamed from: m */
    private void m225087m() {
        this.mHeadRipple.cancelAnimation();
        UIUtils.invisible(this.mHeadRipple);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: e */
    public void mo196675e() {
        this.f142745b.mo196791a(false);
        this.f142746c = false;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: f */
    public void mo196756f() {
        Activity activity = this.f142748e;
        C58131s.m225478a(activity, activity.getString(R.string.View_E_PhoneCallMicOff));
    }

    /* renamed from: i */
    private void m225083i() {
        VoIPAudioManager.m225760a().mo197184a(this);
        if (DesktopUtil.m144301a((Context) this.f142748e)) {
            VoIPAudioManager.m225760a().mo197185a(false);
        }
    }

    /* renamed from: n */
    private void m225088n() {
        UIUtils.show(this.mHeadRipple);
        this.mHeadRipple.setRepeatCount(-1);
        this.mHeadRipple.playAnimation();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m225083i();
        this.f142749f.mo196713a(this);
        C58136v.m225487f().mo197015a(this);
        m225084j();
        m225085k();
        C58103o.m225371a().mo196931a(this);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: d */
    public void mo196674d() {
        C58151d.m225578a("ui", "ui", "voip telephone off hook, change mute state.", "[VoIpCallView] onChangeVoipMuteState");
        this.f142745b.mo196796f();
        this.f142745b.mo196791a(true);
        this.f142746c = true;
    }

    /* renamed from: h */
    public void mo196758h() {
        C58151d.m225578a("ui", "ui", "finish activity with transition", "[VoIpCallView] finishActivityWithTransition");
        this.f142748e.finish();
        this.f142748e.overridePendingTransition(0, R.anim.fade_out);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.voip.service.impl.app.VoIpCallView$2 */
    public static /* synthetic */ class C580292 {

        /* renamed from: a */
        static final /* synthetic */ int[] f142751a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType[] r0 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.voip.service.impl.app.VoIpCallView.C580292.f142751a = r0
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType r1 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIpCallView.C580292.f142751a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType r1 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.voip.service.impl.app.VoIpCallView.C580292.f142751a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType r1 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.voip.service.impl.app.VoIpCallView.C580292.<clinit>():void");
        }
    }

    /* renamed from: l */
    private void m225086l() {
        this.mVoIPContent.setAlpha(1.0f);
        this.mBlurBkg.setVisibility(0);
        this.mBlurImageFg.setVisibility(0);
        mo196671b(VoIPAudioManager.m225760a().mo197191f(), VoIPAudioManager.m225760a().mo197192g(), false);
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    public void br_() {
        C58151d.m225578a("ui", "ui", "show start call view", "[VoIpCallView] showStartCallView");
        this.mVoIPContent.setVisibility(8);
        this.mStartLoadingView.setVisibility(0);
        this.mStartLoadingView.setContainerBackGround(null);
        this.mStartLoadingView.mo195421a(true, "");
    }

    @Override // com.ss.android.lark.voip.service.impl.app.C58136v.AbstractC58137a
    /* renamed from: c */
    public void mo196673c() {
        C58151d.m225578a("ui", "ui", "voip telephone off hook, cancel ring up view", "[VoIpCallView] onCancelVoipCall");
        this.f142745b.mo196792b();
        mo196758h();
        VoiceCall j = this.f142745b.mo196800j();
        if (j != null) {
            VoipHitPoint.m225626c(j.getId());
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.mHeadRipple.cancelAnimation();
        VoIPAudioManager.m225760a().mo197187b(this);
        C58136v.m225487f().mo197018b(this);
        C58136v.m225487f().mo197022g();
        C58103o.m225371a().mo196951h();
    }

    /* renamed from: k */
    private void m225085k() {
        int i;
        int i2;
        this.mCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpCallView.View$OnClickListenerC580281 */

            public void onClick(View view) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("[VoIpCallView] initView: click cancel button to ");
                if (VoIpCallView.this.f142744a) {
                    str = "cancel call";
                } else {
                    str = "refuse call";
                }
                sb.append(str);
                C58151d.m225578a("ui", "ui", "click cancel button", sb.toString());
                VoIpCallView.this.mo196758h();
                if (VoIpCallView.this.f142744a) {
                    VoIpCallView.this.f142745b.mo196792b();
                } else {
                    VoIpCallView.this.f142745b.mo196790a();
                }
            }
        });
        TextView textView = this.mCancel;
        Context context = textView.getContext();
        if (this.f142744a) {
            i = R.string.Lark_Legacy_Cancel;
        } else {
            i = R.string.View_G_DeclineButton;
        }
        textView.setText(UIUtils.getString(context, i));
        TextView textView2 = this.mCallStatus;
        Context context2 = textView2.getContext();
        if (this.f142744a) {
            i2 = R.string.View_G_CallStarting;
        } else {
            i2 = R.string.View_E_IncomingEncryptedCall;
        }
        textView2.setText(UIUtils.getString(context2, i2));
        this.mConfirm.setOnClickListener($$Lambda$VoIpCallView$aaHZ4pdejw5MzwTbGneUava2AY.INSTANCE);
        this.mMuteTip.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$t7eFnq0vcOPB1wBPuIwlmVqY1o0 */

            public final void onClick(View view) {
                VoIpCallView.this.m225075b((VoIpCallView) view);
            }
        });
        this.mSpeakerTip.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$fTGqkdusPeRks2AUaPuTltzYA */

            public final void onClick(View view) {
                VoIpCallView.this.m225071a((VoIpCallView) view);
            }
        });
        m225086l();
        this.mHeadRipple.setAnimation("voip_call_ripple.json");
        ak.m95026a(this.mContract, UIUtils.dp2px(this.f142748e, 30.0f));
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: b */
    public void mo196750b() {
        C58151d.m225578a("ui", "ui", "show answer call view", "[VoIpCallView] showAnswerCallView");
        this.mVoIPContent.setVisibility(0);
        this.mStartLoadingView.setVisibility(8);
        m225088n();
        this.mSpeakerTip.setVisibility(8);
        this.mMuteTip.setVisibility(8);
        this.mMuteTip.setEnabled(true);
        this.mConfirm.setVisibility(0);
        this.mCancel.setVisibility(0);
        TextView textView = this.mCancel;
        textView.setText(UIUtils.getString(textView.getContext(), R.string.View_G_DeclineButton));
        this.mConfirm.setText(UIUtils.getString(this.mCancel.getContext(), R.string.View_G_AcceptButton));
        m225072a(this.mCancel, R.drawable.selector_voip_hung_up);
        m225072a(this.mConfirm, R.drawable.selector_voip_answerd);
        this.f142747d = false;
        this.mCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$9M_EwiIrdVEm610kJl9x4LWosc */

            public final void onClick(View view) {
                VoIpCallView.this.m225081f(view);
            }
        });
        this.mConfirm.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$j9ZdujiRbzBNo4oMYTn1oQzLBJA */

            public final void onClick(View view) {
                VoIpCallView.this.m225079e((VoIpCallView) view);
            }
        });
        VoipHitPoint.m225634g();
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    public void bq_() {
        C58151d.m225578a("ui", "ui", "show onTheCall view", "[VoIpCallView] showOnTheCallView");
        this.mVoIPContent.setVisibility(0);
        this.mStartLoadingView.setVisibility(8);
        m225087m();
        this.mConfirm.setVisibility(8);
        this.mCancel.setVisibility(0);
        TextView textView = this.mCancel;
        textView.setText(UIUtils.getString(textView.getContext(), R.string.View_G_EndCallButton));
        this.mSpeakerTip.setVisibility(0);
        this.mMuteTip.setVisibility(0);
        this.mMuteTip.setEnabled(true);
        if (C58136v.m225487f().mo197019c()) {
            this.f142745b.mo196796f();
            this.f142746c = true;
        }
        this.mCallStatus.setText(UIHelper.getString(R.string.View_G_Connecting));
        m225072a(this.mCancel, R.drawable.selector_voip_hung_up);
        this.mCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$aOK7QA0jmA0ENukgciSjyQEUWM */

            public final void onClick(View view) {
                VoIpCallView.this.m225077d((VoIpCallView) view);
            }
        });
    }

    @OnClick({9437})
    public void onMinimizeVoIP() {
        VoiceCall.Status status = VoiceCall.Status.NONE;
        VoiceCall j = this.f142745b.mo196800j();
        if (j != null) {
            status = j.getStatus();
        }
        C58151d.m225578a("ui", "ui", "onMinimizeVoIP", "[VoIpCallView] onMinimizeVoIP: status = " + status.name());
        if (status != VoiceCall.Status.TERMINATED) {
            if (C57977a.m224905c().getVideoChatDependency().mo145480d()) {
                C58151d.m225577a("ui", "voip accept, interruptFloatLive");
                C57977a.m224905c().getVideoChatDependency().mo145481e();
            }
            if (C28460b.m104296a(this.f142748e)) {
                VoIPFloatIcon.m225001a().mo196664a(this.mVoIPContent.getContext());
                this.f142745b.mo196798h();
            } else {
                Activity activity = this.f142748e;
                VCDialogUtils.m236160a((Context) activity, (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VoipUtil.m225802a(activity)), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(this.f142748e.getResources().getConfiguration()));
            }
            VoipHitPoint.m225628d();
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196742a() {
        C58151d.m225578a("ui", "ui", "show ring up view", "[VoIpCallView] showRingUpView");
        this.mVoIPContent.setVisibility(0);
        this.mStartLoadingView.setVisibility(8);
        m225088n();
        this.mConfirm.setVisibility(8);
        if (this.f142745b.mo196799i()) {
            this.mMuteTip.setEnabled(false);
        } else {
            this.mMuteTip.setEnabled(true);
        }
        this.mMuteTip.setVisibility(0);
        this.mSpeakerTip.setVisibility(0);
        this.mCancel.setVisibility(0);
        TextView textView = this.mCancel;
        textView.setText(UIUtils.getString(textView.getContext(), R.string.Lark_Legacy_CancelTip));
        m225072a(this.mCancel, R.drawable.selector_voip_hung_up);
        this.mCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$bmeVn48gGtNHUr4iy1OeQjP1RsI */

            public final void onClick(View view) {
                VoIpCallView.this.m225082g(view);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC58041d.AbstractC58044b.AbstractC58045a aVar) {
        this.f142745b = aVar;
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196743a(int i) {
        if (i != 0) {
            this.mCallStatus.setText(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m225077d(View view) {
        C58151d.m225578a("ui", "ui", "click cancel button of onTheCall view", "[VoIpCallView] showOnTheCallView: click cancel button");
        this.f142745b.mo196795e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225075b(View view) {
        C58151d.m225578a("ui", "ui", "click mute tip", "[VoIpCallView] initView: click mute tip");
        this.f142745b.mo196796f();
        VoipHitPoint.m225630e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225071a(View view) {
        if (C58136v.m225487f().mo197020d()) {
            C58151d.m225578a("ui", "ui", "click speaker tip", "[VoIpCallView] initView: click speaker tip");
            VoipHitPoint.m225632f();
            VoIPAudioManager.m225760a().mo197200o();
        } else if (C58136v.m225487f().mo197019c()) {
            Activity activity = this.f142748e;
            C58131s.m225478a(activity, activity.getString(R.string.View_G_PhoneCallNoSpeaker));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m225081f(View view) {
        if (this.f142747d) {
            C58151d.m225579b("ui", "ui", "click answer cancel button fail for confirmed", "[VoIpCallView] showAnswerCallView: click cancel button fail for confirmed");
            return;
        }
        this.f142747d = true;
        C58151d.m225578a("ui", "ui", "click cancel button of answer view", "[VoIpCallView] showAnswerCallView: click cancel button");
        this.f142748e.finish();
        this.f142745b.mo196790a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m225082g(View view) {
        C58151d.m225578a("ui", "ui", "click cancel button of ring up view", "[VoIpCallView] showRingUpView: click cancel");
        this.f142745b.mo196792b();
        mo196758h();
        VoiceCall j = this.f142745b.mo196800j();
        if (j != null) {
            VoipHitPoint.m225626c(j.getId());
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: b */
    public void mo196751b(boolean z) {
        if (z) {
            m225072a(this.mMuteTip, R.drawable.selector_mic_offline);
        } else {
            m225072a(this.mMuteTip, R.drawable.selector_mic_surface);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225073a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C58151d.m225578a("ui", "ui", "permission granted to answer call", "[VoIpCallView] showAnswerCallView: permission RECORD_AUDIO granted");
            this.f142745b.mo196793c();
            return;
        }
        C58151d.m225578a("ui", "ui", "permission refuse to answer call", "[VoIpCallView] showAnswerCallView: permission RECORD_AUDIO not granted");
        this.f142745b.mo196790a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m225080e(boolean z) {
        int i;
        int i2;
        int i3 = R.string.View_A_Speaker;
        if (z) {
            i = R.drawable.selector_speaker_surface;
            C60700b.m235851b("VOIPCallView", "[updateSpeakerStatus]", "setSpeakerOn=" + z + ",type=Default");
        } else {
            VoIPAudioManager.AudioType f = VoIPAudioManager.m225760a().mo197191f();
            int i4 = C580292.f142751a[f.ordinal()];
            if (i4 == 1) {
                i3 = R.string.View_G_Bluetooth;
                i2 = R.drawable.selector_bluetooth;
            } else if (i4 == 2) {
                i3 = R.string.View_G_Headphones;
                i2 = R.drawable.selector_earpiece;
            } else if (i4 != 3) {
                i3 = 0;
                i2 = 0;
            } else {
                i2 = R.drawable.selector_speaker_offline;
            }
            C60700b.m235851b("VOIPCallView", "[updateSpeakerStatus2]", "setSpeakerOn=" + z + ",type=" + f);
            i = i2;
        }
        TextView textView = this.mSpeakerTip;
        if (textView != null) {
            textView.setText(i3);
            m225072a(this.mSpeakerTip, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m225079e(View view) {
        if (this.f142747d) {
            C58151d.m225579b("ui", "ui", "click answer confirm button fail for canceled", "[VoIpCallView] showAnswerCallView: click confirm button fail for canceled");
            return;
        }
        this.f142747d = true;
        C58151d.m225578a("ui", "ui", "click confirm button of answer view", "[VoIpCallView] showAnswerCallView: click confirm button");
        C51331a aVar = new C51331a(this.f142748e);
        if (aVar.mo176921a("android.permission.RECORD_AUDIO")) {
            this.f142745b.mo196793c();
            return;
        }
        this.f142745b.mo196794d();
        aVar.mo176924c("android.permission.RECORD_AUDIO").subscribe(new Consumer() {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$9lzicB3ZYwjkoTarCND05AlNgbI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VoIpCallView.this.m225073a((VoIpCallView) ((Boolean) obj));
            }
        });
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: c */
    public void mo196755c(boolean z) {
        boolean z2 = this.f142746c;
        int i = R.string.View_G_YouTurnedOffMic;
        if (!z2) {
            Activity activity = this.f142748e;
            if (!z) {
                i = R.string.View_G_YouTurnedOnMic;
            }
            C58131s.m225478a(activity, activity.getString(i));
        } else if (this.f142745b.mo196797g()) {
            Activity activity2 = this.f142748e;
            C58131s.m225478a(activity2, activity2.getString(R.string.View_G_PhoneCallNoMic));
        } else {
            Activity activity3 = this.f142748e;
            if (!z) {
                i = R.string.View_G_YouTurnedOnMic;
            }
            C58131s.m225478a(activity3, activity3.getString(i));
        }
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196744a(Chatter chatter) {
        if (chatter == null) {
            C58151d.m225579b("ui", "ui", "show user info failure with null chatter", "[VoIpCallView] showUserInfo: null chatter");
            return;
        }
        int dpFromDimenXml = DeviceUtils.getDpFromDimenXml(this.f142748e, R.dimen.avatar_width_voip);
        C57977a.m224905c().getImageDependency().mo145510a(this.f142748e, chatter.getId() + ".jpg", chatter.getAvatarKey(), chatter.getId(), this.mChatterAvatar, dpFromDimenXml, dpFromDimenXml);
        this.mChatterName.setText(C57977a.m224905c().getChatDependency().mo145505a((OpenChatter) chatter));
    }

    @Override // com.ss.android.lark.voip.service.impl.app.AbstractC58041d.AbstractC58044b
    /* renamed from: a */
    public void mo196746a(VoiceCall voiceCall) {
        if (voiceCall != null) {
            C58151d.m225578a("ui", "ui", "show end call view", "[VoIpCallView] showEndCallView isShowFeedback:" + voiceCall.isNeedFeedback());
        }
        mo196758h();
        if (VideoChatModuleDependency.getFeatureGatingDependency().mo196393a("byteview.callmeeting.android.feedback_display")) {
            C58151d.m225578a("ui", "ui", "showEndCallView", "fg don't show feedback dialog.");
        } else if (voiceCall != null && voiceCall.isNeedFeedback()) {
            C58063a.m225219a().mo196839a(this.f142748e, voiceCall);
        }
    }

    /* renamed from: a */
    private void m225072a(TextView textView, int i) {
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, UIUtils.getDrawable(textView.getContext(), i), (Drawable) null, (Drawable) null);
        }
    }

    public VoIpCallView(AbstractC58030a aVar, Activity activity, boolean z) {
        this.f142749f = aVar;
        this.f142748e = activity;
        this.f142744a = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m225074a(Runnable runnable, DialogInterface dialogInterface, int i) {
        C58151d.m225578a("ui", "ui", "dismiss hint dialog", "[VoIpCallView] showVoIPFloatIcon: onClick hintDialog to dismiss");
        dialogInterface.dismiss();
        runnable.run();
    }

    @Override // com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AbstractC58193a
    /* renamed from: b */
    public void mo196671b(VoIPAudioManager.AudioType audioType, boolean z, boolean z2) {
        AbstractC58041d.AbstractC58044b.AbstractC58045a aVar;
        VoiceCall j;
        boolean g = VoIPAudioManager.m225760a().mo197192g();
        VoIPAudioManager.AudioType f = VoIPAudioManager.m225760a().mo197191f();
        UICallbackExecutor.execute(new Runnable(g) {
            /* class com.ss.android.lark.voip.service.impl.app.$$Lambda$VoIpCallView$XSd5XWbpSHkZWFwSdIAM1UsWT4A */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VoIpCallView.this.m225080e((VoIpCallView) this.f$1);
            }
        });
        if (z2 && (aVar = this.f142745b) != null && (j = aVar.mo196800j()) != null) {
            if (j.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                VoipHitPoint.m225605a("voip_call_page_onthecall", audioType, z, f, g, j.getId(), C58133t.m225480a(j));
            } else if (this.f142745b.mo196801k()) {
                VoipHitPoint.m225605a("voip_call_page_calling", audioType, z, f, g, j.getId(), C58133t.m225480a(j));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225070a(Context context, int i, Chatter chatter, boolean z) {
        VoIPFloatIcon a = VoIPFloatIcon.m225001a();
        a.mo196665a(context.getApplicationContext(), i);
        a.mo196666a(chatter);
        Activity activity = this.f142748e;
        if (activity instanceof VoIpCallActivity) {
            ((VoIpCallActivity) activity).f142713a = true;
        }
        if (z) {
            mo196758h();
        }
    }
}
