package com.ss.android.lark.voip.service.impl.app.feedback;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58133t;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.service.VoiceCallFeedback;
import com.ss.android.lark.voip.service.impl.statistics.VoipHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60750d;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.meeting.utils.UserCallStatusMonitor;
import java.util.ArrayList;

public class VoIpFeedbackActivity extends VoipBaseActivity {

    /* renamed from: a */
    public boolean f142780a = false;

    /* renamed from: b */
    private Handler f142781b = new Handler();

    /* renamed from: c */
    private VoiceCallFeedback.Evaluation f142782c = VoiceCallFeedback.Evaluation.UNKNOWN;

    /* renamed from: d */
    private boolean[] f142783d = new boolean[5];

    /* renamed from: e */
    private VoiceCallFeedback.Tag[] f142784e = {VoiceCallFeedback.Tag.UNKNOWN, VoiceCallFeedback.Tag.HUNG_UP_UNEXPECTEDLY, VoiceCallFeedback.Tag.NOT_CLEAR_AND_NOISY, VoiceCallFeedback.Tag.GOES_ON_AND_OFF, VoiceCallFeedback.Tag.CANNOT_HEAR, VoiceCallFeedback.Tag.OTHER};

    /* renamed from: f */
    private C60762k f142785f;
    @BindView(9727)
    LinearLayout feedbackContainer;
    @BindView(9729)
    View feedbackPartingLine;

    /* renamed from: g */
    private VoiceCall f142786g;

    /* renamed from: h */
    private UserCallStatusMonitor.AbstractC63478a f142787h = new UserCallStatusMonitor.AbstractC63478a() {
        /* class com.ss.android.lark.voip.service.impl.app.feedback.$$Lambda$VoIpFeedbackActivity$4edgo0GldOxlGNlQqSwlVPvu07k */

        @Override // com.ss.android.vc.meeting.utils.UserCallStatusMonitor.AbstractC63478a
        public final void onEnterOnCall(int i) {
            VoIpFeedbackActivity.lambda$4edgo0GldOxlGNlQqSwlVPvu07k(VoIpFeedbackActivity.this, i);
        }
    };
    @BindView(9374)
    TextView mComment;
    @BindView(9717)
    View mFeedBack;
    @BindView(9718)
    TextView mFeedBackAwesome;
    @BindView(9721)
    TextView mFeedBackBad;
    @BindView(9724)
    View mFeedBackBody;
    @BindView(9725)
    View mFeedBackBottom;
    @BindView(9728)
    View mFeedBackHint;
    @BindView(9731)
    View mTagContainer;
    @BindView(10680)
    LinearLayout negativeReasons;

    /* renamed from: a */
    public Context mo196817a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo196818a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo196819a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.voip.service.impl.app.feedback.VoipBaseActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m225204a(this, context);
    }

    /* renamed from: b */
    public void mo196820b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo196821c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m225200a(this, configuration);
    }

    public AssetManager getAssets() {
        return m225207c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m225201a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m225206b(this);
    }

    /* renamed from: f */
    private void m225210f() {
        C60762k kVar = new C60762k(this);
        this.f142785f = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity.C580501 */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public void onKeyboardStateChanged(boolean z, int i) {
                C60700b.m235851b("VoIpFeedbackActivity", "[onKeyboardStateChanged]", String.format("isShown=%b, isGoodOrBadSelected=%b, keyboardHeight=%d", Boolean.valueOf(z), Boolean.valueOf(VoIpFeedbackActivity.this.f142780a), Integer.valueOf(i)));
                final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) VoIpFeedbackActivity.this.mFeedBackBody.getLayoutParams();
                if (!VoIpFeedbackActivity.this.f142780a) {
                    layoutParams.bottomMargin = 0;
                    VoIpFeedbackActivity.this.mFeedBackBody.setLayoutParams(layoutParams);
                } else if (z) {
                    VoIpFeedbackActivity.this.negativeReasons.setVisibility(8);
                    VoIpFeedbackActivity.this.feedbackContainer.setVisibility(8);
                    ViewGroup.LayoutParams layoutParams2 = VoIpFeedbackActivity.this.mComment.getLayoutParams();
                    layoutParams2.height = C28459a.m104293b(VoIpFeedbackActivity.this, 81);
                    VoIpFeedbackActivity.this.mComment.setLayoutParams(layoutParams2);
                    layoutParams.bottomMargin = i;
                    VoIpFeedbackActivity.this.mFeedBackBody.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity.C580501.RunnableC580511 */

                        public void run() {
                            VoIpFeedbackActivity.this.mFeedBackBody.setLayoutParams(layoutParams);
                        }
                    }, 50);
                } else {
                    VoIpFeedbackActivity.this.negativeReasons.setVisibility(0);
                    VoIpFeedbackActivity.this.feedbackContainer.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams3 = VoIpFeedbackActivity.this.mComment.getLayoutParams();
                    layoutParams3.height = C28459a.m104293b(VoIpFeedbackActivity.this, 40);
                    VoIpFeedbackActivity.this.mComment.setLayoutParams(layoutParams3);
                    layoutParams.bottomMargin = 0;
                    VoIpFeedbackActivity.this.mFeedBackBody.setLayoutParams(layoutParams);
                }
            }
        });
    }

    @OnClick({9726})
    public void onClickClose() {
        C58151d.m225578a("ui", "ui", "click close", "[VoIpFeedbackView] onClickClose");
        VoipHitPoint.m225620b();
        finish();
    }

    @OnClick({9717})
    public void onClickFeedBack() {
        C58151d.m225578a("ui", "ui", "click feedback", "[VoIpFeedbackView] onClickFeedBack");
        VoipHitPoint.m225625c();
        finish();
    }

    /* renamed from: d */
    private void m225208d() {
        try {
            if (Build.VERSION.SDK_INT == 26) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
        } catch (Exception e) {
            C60700b.m235864f("VoIpFeedbackActivity", "[initScreenOrientation]", e.getMessage());
        }
    }

    /* renamed from: e */
    private void m225209e() {
        Intent intent = getIntent();
        if (!(intent == null || intent.getExtras() == null)) {
            this.f142786g = (VoiceCall) intent.getExtras().getSerializable("voipCallInfo");
        }
        m225211g();
    }

    /* renamed from: g */
    private void m225211g() {
        this.f142781b.removeCallbacksAndMessages(null);
        if (!this.f142780a) {
            this.f142781b.postDelayed(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity.RunnableC580533 */

                public void run() {
                    if (!VoIpFeedbackActivity.this.f142780a) {
                        C60700b.m235851b("VoIpFeedbackActivity", "[resetAutoFinishHandler]", "finish because no user operation in 20 seconds");
                        VoIpFeedbackActivity.this.finish();
                    }
                }
            }, 5000);
        }
    }

    @OnClick({9721})
    public void onClickBad() {
        C58151d.m225578a("ui", "ui", "click bad", "[VoIpFeedbackView] onClickBad");
        if (this.f142782c != VoiceCallFeedback.Evaluation.POOR_QUALITY) {
            this.f142782c = VoiceCallFeedback.Evaluation.POOR_QUALITY;
            m225205a(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C60700b.m235851b("VoIpFeedbackActivity", "[onDestroy]", "onDestroy");
        super.onDestroy();
        C58063a.f142821a = false;
        this.f142781b.removeCallbacksAndMessages(null);
        UserCallStatusMonitor.m248763b(this.f142787h);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        C60700b.m235851b("VoIpFeedbackActivity", "[finish]", "finish");
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.mComment.getWindowToken(), 0);
        super.finish();
        overridePendingTransition(R.anim.voip_activity_bottom_in, R.anim.activity_bottom_out);
    }

    @OnClick({9718})
    public void onClickAwesome() {
        C58151d.m225578a("ui", "ui", "click awesome", "[VoIpFeedbackView] onClickAwesome");
        if (this.f142782c != VoiceCallFeedback.Evaluation.GOOD_QUALITY) {
            this.f142782c = VoiceCallFeedback.Evaluation.GOOD_QUALITY;
            m225205a(true);
        }
        C58063a.m225219a().mo196840a(getApplicationContext(), this.f142786g, new VoiceCallFeedback().setEvaluation(VoiceCallFeedback.Evaluation.GOOD_QUALITY));
        VoipHitPoint.m225601a();
        this.feedbackContainer.postDelayed(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.VoIpFeedbackActivity.RunnableC580522 */

            public void run() {
                VoIpFeedbackActivity.this.finish();
            }
        }, 500);
    }

    @OnClick({9381})
    public void onClickConfirm() {
        C58151d.m225578a("ui", "ui", "click confirm", "[VoIpFeedbackView] onClickConfirm");
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            boolean[] zArr = this.f142783d;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                arrayList.add(this.f142784e[i]);
            }
            i++;
        }
        String charSequence = this.mComment.getText().toString();
        C58063a.m225219a().mo196840a(getApplicationContext(), this.f142786g, new VoiceCallFeedback().setComment(charSequence).setEvaluation(VoiceCallFeedback.Evaluation.POOR_QUALITY).setTags(arrayList));
        VoiceCall voiceCall = this.f142786g;
        if (voiceCall != null) {
            VoipHitPoint.m225617a(voiceCall.getId(), C58133t.m225480a(this.f142786g), arrayList, true ^ TextUtils.isEmpty(charSequence));
        }
        finish();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m225211g();
        return super.dispatchTouchEvent(motionEvent);
    }

    @OnClick({9732})
    public void onClickGoesOff(TextView textView) {
        C58151d.m225578a("ui", "ui", "click goes off", "[VoIpFeedbackView] onClickGoesOff");
        m225203a(3, textView);
    }

    @OnClick({9733})
    public void onClickHungUp(TextView textView) {
        C58151d.m225578a("ui", "ui", "click hung up", "[VoIpFeedbackView] onClickHungUp");
        m225203a(1, textView);
    }

    @OnClick({9734})
    public void onClickNoise(TextView textView) {
        C58151d.m225578a("ui", "ui", "click noise", "[VoIpFeedbackView] onClickNoise");
        m225203a(2, textView);
    }

    @OnClick({9730})
    public void onClickSilence(TextView textView) {
        C58151d.m225578a("ui", "ui", "click silence", "[VoIpFeedbackView] onClickSilence");
        m225203a(4, textView);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        C60700b.m235851b("VoIpFeedbackActivity", "[onNewIntent]", "onNewIntent");
        super.onNewIntent(intent);
        m225209e();
    }

    /* renamed from: a */
    public static Resources m225201a(VoIpFeedbackActivity voIpFeedbackActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpFeedbackActivity);
        }
        return voIpFeedbackActivity.mo196818a();
    }

    /* renamed from: c */
    public static AssetManager m225207c(VoIpFeedbackActivity voIpFeedbackActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpFeedbackActivity);
        }
        return voIpFeedbackActivity.mo196821c();
    }

    /* renamed from: b */
    public static void m225206b(VoIpFeedbackActivity voIpFeedbackActivity) {
        voIpFeedbackActivity.mo196820b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VoIpFeedbackActivity voIpFeedbackActivity2 = voIpFeedbackActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    voIpFeedbackActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Log.m165389i("VoIpFeedbackActivity", "onCreate");
        super.onCreate(bundle);
        UserCallStatusMonitor.m248762a(this.f142787h);
        C60750d.m236072a(this);
        C58063a.f142821a = true;
        setContentView(R.layout.view_voip_feed_back);
        m225208d();
        ButterKnife.bind(this);
        m225210f();
        overridePendingTransition(R.anim.voip_activity_bottom_in, 0);
        m225209e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m225202a(int i) {
        C60700b.m235851b("VoIpFeedbackActivity", "[onCallStatus]", "user enter oncall + type: " + i);
        finish();
    }

    /* renamed from: a */
    private void m225205a(boolean z) {
        int i;
        int i2;
        Drawable drawable;
        int i3;
        int i4;
        if (!this.f142780a) {
            int i5 = R.color.primary_pri_500;
            if (z) {
                i4 = R.color.primary_pri_500;
            } else {
                i4 = R.color.text_title;
            }
            if (z) {
                i5 = R.color.text_title;
            }
            this.mFeedBackAwesome.setTextColor(getResources().getColor(i4));
            this.mFeedBackBad.setTextColor(getResources().getColor(i5));
            if (z) {
                i = R.drawable.vc_feedback_awesome_press;
            } else {
                i = R.drawable.vc_feedback_awesome_normal;
            }
        } else if (z) {
            i = R.drawable.vc_feedback_awesome_badpage_press;
        } else {
            i = R.drawable.vc_feedback_awesome_badpage_normal;
        }
        if (z) {
            i2 = R.drawable.vc_feedback_bad_normal;
        } else {
            i2 = R.drawable.vc_feedback_bad_press;
        }
        this.mFeedBackAwesome.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(i), (Drawable) null, (Drawable) null);
        TextView textView = this.mFeedBackBad;
        Drawable drawable2 = getResources().getDrawable(i2);
        if (this.f142780a) {
            drawable = getResources().getDrawable(R.drawable.voip_feedback_arrow_icon);
        } else {
            drawable = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable);
        if (!z) {
            this.mFeedBackHint.setVisibility(8);
            this.mTagContainer.setVisibility(0);
            this.mFeedBackBad.setTextSize(BitmapDescriptorFactory.HUE_RED);
            this.mFeedBackAwesome.setTextSize(BitmapDescriptorFactory.HUE_RED);
            this.mFeedBackBad.setCompoundDrawablePadding(UIUtils.dp2px(this, 12.0f));
            this.mFeedBackAwesome.setCompoundDrawablePadding(UIUtils.dp2px(this, 12.0f));
            this.mFeedBackBad.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(i2), (Drawable) null, getResources().getDrawable(R.drawable.voip_feedback_arrow_icon));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.feedbackPartingLine.getLayoutParams();
            layoutParams.height = UIUtils.dp2px(this, 22.0f);
            layoutParams.width = UIUtils.dp2px(this, 2.0f);
            layoutParams.setMargins(0, 0, 0, UIUtils.dp2px(this, 18.0f));
            this.feedbackPartingLine.setLayoutParams(layoutParams);
            this.mFeedBackAwesome.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, getResources().getDrawable(R.drawable.vc_feedback_awesome_badpage_normal), (Drawable) null, (Drawable) null);
            if (z) {
                i3 = UIUtils.dp2px(this, 30.0f);
            } else {
                i3 = 0;
            }
            this.feedbackContainer.setPadding(UIUtils.dp2px(this, 83.0f), 0, UIUtils.dp2px(this, 83.0f), i3);
        }
        this.f142780a = true;
    }

    /* renamed from: a */
    private void m225203a(int i, TextView textView) {
        boolean[] zArr = this.f142783d;
        zArr[i] = !zArr[i];
        textView.setSelected(zArr[i]);
    }

    /* renamed from: a */
    public static Context m225200a(VoIpFeedbackActivity voIpFeedbackActivity, Configuration configuration) {
        Context a = voIpFeedbackActivity.mo196817a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m225204a(VoIpFeedbackActivity voIpFeedbackActivity, Context context) {
        voIpFeedbackActivity.mo196819a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(voIpFeedbackActivity);
        }
    }
}
