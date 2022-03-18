package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioInputButton;
import com.ss.android.lark.utils.UIHelper;

public class AudioInputPanel extends RelativeLayout {

    /* renamed from: a */
    public ObjectAnimator f104594a;

    /* renamed from: b */
    private AbstractC41064a f104595b;

    /* renamed from: c */
    private AnimatorSet f104596c;

    /* renamed from: d */
    private boolean f104597d;

    /* renamed from: e */
    private boolean f104598e;

    /* renamed from: f */
    private boolean f104599f;

    /* renamed from: g */
    private float f104600g;

    /* renamed from: h */
    private float f104601h;

    /* renamed from: i */
    private int f104602i;

    /* renamed from: j */
    private boolean f104603j;
    @BindView(6212)
    AudioInputButton mAudioInputBtn;
    @BindView(6801)
    TextView mNoSwipeRightHintTv;
    @BindView(6217)
    View mPanelView;
    @BindView(6889)
    TextView mRecordTimeHintTv;
    @BindView(6929)
    View mRootView;
    @BindView(7078)
    TextView mSwipeRightHintTv;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel$a */
    public interface AbstractC41064a {
        /* renamed from: a */
        void mo148066a();

        /* renamed from: b */
        void mo148067b();

        /* renamed from: c */
        void mo148068c();

        /* renamed from: d */
        void mo148069d();

        /* renamed from: e */
        void mo148070e();

        /* renamed from: f */
        void mo148071f();

        /* renamed from: g */
        void mo148072g();
    }

    public AbstractC41064a getDelegate() {
        return this.f104595b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162827a() {
        LKUIToast.show(getContext(), (int) R.string.Lark_Legacy_RecordShortTimeWarning);
    }

    public int getAudioPanelMarginBottom() {
        return ((RelativeLayout.LayoutParams) this.mPanelView.getLayoutParams()).bottomMargin;
    }

    public void setDelegate(AbstractC41064a aVar) {
        this.f104595b = aVar;
    }

    public void setShownInPopupWindow(boolean z) {
        this.f104603j = z;
    }

    public AudioInputPanel(Context context) {
        this(context, null);
    }

    public void setAudioAmplitude(int i) {
        this.mAudioInputBtn.setAmplitudeAnimate(i);
    }

    public void setAudioDuration(int i) {
        this.f104602i = i;
        this.mRecordTimeHintTv.setText(C26279i.m95149a(i));
    }

    public void setAudio2TextEnabled(boolean z) {
        if (z) {
            this.mNoSwipeRightHintTv.setVisibility(8);
            this.mSwipeRightHintTv.setVisibility(0);
            return;
        }
        this.mNoSwipeRightHintTv.setVisibility(0);
        this.mSwipeRightHintTv.setVisibility(8);
    }

    /* renamed from: a */
    private void m162828a(final boolean z) {
        TextView textView;
        if (this.f104596c == null) {
            this.f104596c = new AnimatorSet();
            if (this.mSwipeRightHintTv.getVisibility() == 0) {
                textView = this.mSwipeRightHintTv;
            } else {
                textView = this.mNoSwipeRightHintTv;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mAudioInputBtn, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mAudioInputBtn, "scale", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView, "translationX", (float) UIHelper.dp2px(-109.0f), 0.0f);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.mRecordTimeHintTv, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.mRecordTimeHintTv, "translationX", (float) UIHelper.dp2px(30.0f), 0.0f);
            this.f104596c.setDuration(500L);
            this.f104596c.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
            this.f104596c.setInterpolator(new AccelerateInterpolator());
        }
        if (this.f104594a == null) {
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.mAudioInputBtn, "deleteScale", 0.8f, 1.0f);
            this.f104594a = ofFloat7;
            ofFloat7.setInterpolator(new LinearInterpolator());
            this.f104594a.setDuration(800L);
            this.f104594a.setRepeatMode(2);
            this.f104594a.setRepeatCount(-1);
        }
        this.f104596c.removeAllListeners();
        this.f104596c.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel.C410631 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (z) {
                    AudioInputPanel.this.f104594a.start();
                } else {
                    AudioInputPanel.this.f104594a.cancel();
                }
            }
        });
        if (z) {
            this.mSwipeRightHintTv.setText(UIHelper.getString(R.string.Lark_Chat_RecordAudio));
            this.mNoSwipeRightHintTv.setText(UIHelper.getString(R.string.Lark_Chat_RecordAudiotips));
            this.mAudioInputBtn.mo147886a(false, 0);
            this.f104596c.start();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f104596c.reverse();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0042, code lost:
        if (r3 != 3) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public AudioInputPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m162829a(boolean z, int i) {
        String str;
        String str2;
        if (i == 0) {
            TextView textView = this.mSwipeRightHintTv;
            if (z) {
                str2 = UIHelper.getString(R.string.Lark_Chat_RecordAudioConvertToText);
            } else {
                str2 = UIHelper.getString(R.string.Lark_Chat_RecordAudio);
            }
            textView.setText(str2);
            return;
        }
        TextView textView2 = this.mNoSwipeRightHintTv;
        if (z) {
            str = UIHelper.getString(R.string.Lark_Legacy_VoiceIndicatorCancel);
        } else {
            str = UIHelper.getString(R.string.Lark_Chat_RecordAudiotips);
        }
        textView2.setText(str);
        this.mAudioInputBtn.mo147886a(z, i);
    }

    public AudioInputPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.kb_audio_input_panel_layout, (ViewGroup) this, true);
        ButterKnife.bind(this);
    }
}
