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
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioCircleView;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioDeleteButton;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioInputBar;
import com.ss.android.lark.utils.UIHelper;

public class AudioInputPanel2 extends LinearLayout {

    /* renamed from: a */
    public ObjectAnimator f104606a;

    /* renamed from: b */
    private View f104607b;

    /* renamed from: c */
    private AudioDeleteButton f104608c;

    /* renamed from: d */
    private AudioCircleView f104609d;

    /* renamed from: e */
    private AudioInputBar f104610e;

    /* renamed from: f */
    private View f104611f;

    /* renamed from: g */
    private AnimatorSet f104612g;

    /* renamed from: h */
    private boolean f104613h;

    /* renamed from: i */
    private boolean f104614i;

    /* renamed from: j */
    private boolean f104615j;

    /* renamed from: k */
    private AbstractC41066a f104616k;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2$a */
    public interface AbstractC41066a {
        /* renamed from: a */
        void mo147989a();

        /* renamed from: b */
        void mo147990b();

        /* renamed from: c */
        void mo147991c();
    }

    public AbstractC41066a getDelegate() {
        return this.f104616k;
    }

    public int getAudioPanelMarginBottom() {
        return ((ConstraintLayout.LayoutParams) this.f104611f.getLayoutParams()).bottomMargin;
    }

    /* renamed from: a */
    private void m162837a() {
        this.f104610e.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f104608c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f104608c.setRectWidth(0);
        this.f104608c.setVisibility(0);
        this.f104610e.mo147878a();
        setCancelState(false);
    }

    public void setDelegate(AbstractC41066a aVar) {
        this.f104616k = aVar;
    }

    public AudioInputPanel2(Context context) {
        this(context, null);
    }

    public void setAudioAmplitude(double d) {
        this.f104610e.setAudioAmplitude(d);
    }

    public void setAudioCountDown(String str) {
        this.f104610e.setCountDown(str);
    }

    public void setAudioDuration(int i) {
        this.f104610e.setDuration(C26279i.m95150a((long) i));
    }

    public void setCircleStartMargin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104609d.getLayoutParams();
        layoutParams.f2834z = BitmapDescriptorFactory.HUE_RED;
        layoutParams.setMargins(i, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
    }

    public void setInputBarMargin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104610e.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, i);
    }

    public void setPanelFullShown(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f104607b.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (z) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, -UIUtils.dp2px(getContext(), 23.0f));
        }
    }

    /* renamed from: a */
    private void m162838a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.kb_audio_input_panel_layout2, this);
        this.f104607b = findViewById(R.id.root_view);
        this.f104608c = (AudioDeleteButton) findViewById(R.id.audio_delete_btn);
        this.f104610e = (AudioInputBar) findViewById(R.id.audio_input_bar);
        this.f104609d = (AudioCircleView) findViewById(R.id.audio_circle_btn);
        this.f104611f = findViewById(R.id.audio_circle_bg);
        this.f104609d.mo147862a(UIUtils.getColor(context, R.color.audio_input_button_start), UIUtils.getColor(context, R.color.audio_input_button_end));
    }

    private void setCancelState(boolean z) {
        this.f104610e.setCancelState(z);
        if (z) {
            this.f104608c.setColor(UIUtils.getColor(getContext(), R.color.function_danger_400));
            this.f104609d.mo147862a(UIUtils.getColor(getContext(), R.color.function_danger_400), UIUtils.getColor(getContext(), R.color.function_danger_500));
            return;
        }
        this.f104608c.setColor(UIUtils.getColor(getContext(), R.color.text_title));
        this.f104609d.mo147862a(UIUtils.getColor(getContext(), R.color.ud_W400), UIUtils.getColor(getContext(), R.color.ud_W500));
    }

    /* renamed from: a */
    private void m162839a(final boolean z) {
        if (this.f104612g == null) {
            this.f104612g = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f104610e, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f104610e, "scaleX", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f104610e, "scaleY", BitmapDescriptorFactory.HUE_RED, 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f104610e, "translationY", (float) UIHelper.dp2px(63.0f), 0.0f);
            this.f104612g.setDuration(300L);
            this.f104612g.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.f104612g.setInterpolator(new AccelerateInterpolator());
        }
        if (this.f104606a == null) {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f104608c, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f104606a = ofFloat5;
            ofFloat5.setInterpolator(new LinearInterpolator());
            this.f104606a.setDuration(300L);
        }
        this.f104612g.removeAllListeners();
        this.f104612g.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.C410651 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (z) {
                    AudioInputPanel2.this.f104606a.start();
                }
            }
        });
        if (z) {
            m162837a();
            this.f104610e.mo147879a(true);
            this.f104612g.start();
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f104612g.reverse();
        }
        this.f104606a.reverse();
        this.f104610e.mo147879a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0072, code lost:
        if (r3 != 3) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public AudioInputPanel2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo148074b(int i, int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104611f.getLayoutParams();
        layoutParams.height = i;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, i2);
    }

    /* renamed from: a */
    public void mo148073a(int i, int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104609d.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, i2);
        this.f104609d.setRadius(i / 2);
    }

    public AudioInputPanel2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104615j = true;
        m162838a(context);
    }
}
