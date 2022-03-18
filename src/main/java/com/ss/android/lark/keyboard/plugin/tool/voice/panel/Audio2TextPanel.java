package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioCircleView;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.log.Log;

public class Audio2TextPanel extends LinearLayout {

    /* renamed from: a */
    private AudioCircleView f104583a;

    /* renamed from: b */
    private View f104584b;

    /* renamed from: c */
    private View f104585c;

    /* renamed from: d */
    private TextView f104586d;

    /* renamed from: e */
    private TextView f104587e;

    /* renamed from: f */
    private RectF f104588f;

    /* renamed from: g */
    private Vibrator f104589g;

    /* renamed from: h */
    private boolean f104590h;

    /* renamed from: i */
    private AnimatorSet f104591i;

    /* renamed from: j */
    private AbstractC41062a f104592j;

    /* renamed from: k */
    private C41026a f104593k;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel$a */
    public interface AbstractC41062a {
        /* renamed from: a */
        void mo148052a();

        /* renamed from: b */
        void mo148053b();

        /* renamed from: c */
        void mo148054c();

        /* renamed from: d */
        void mo148055d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m162819b() {
        setAudioAmplitude(0);
    }

    /* renamed from: a */
    private void m162815a() {
        this.f104586d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$Audio2TextPanel$L6gsmAgmH4QJw6iCWcpTEK1LttY */

            public final void onClick(View view) {
                Audio2TextPanel.lambda$L6gsmAgmH4QJw6iCWcpTEK1LttY(Audio2TextPanel.this, view);
            }
        });
        this.f104587e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$Audio2TextPanel$whaccNUeo_1IU_4RP0pZloMIUs */

            public final void onClick(View view) {
                Audio2TextPanel.m270679lambda$whaccNUeo_1IU_4RP0pZloMIUs(Audio2TextPanel.this, view);
            }
        });
        this.f104583a.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$Audio2TextPanel$kXHOyEfpiySR7gBJhkiTsXkfOj4 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Audio2TextPanel.lambda$kXHOyEfpiySR7gBJhkiTsXkfOj4(Audio2TextPanel.this, view, motionEvent);
            }
        });
    }

    public void setAudioRecorderListener(C41026a aVar) {
        this.f104593k = aVar;
    }

    public void setDelegate(AbstractC41062a aVar) {
        this.f104592j = aVar;
    }

    public Audio2TextPanel(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162817a(View view) {
        AbstractC41062a aVar = this.f104592j;
        if (aVar != null) {
            aVar.mo148053b();
        }
    }

    public void setAudioAmplitude(int i) {
        this.f104583a.setAmplitudeAnimate(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m162820b(View view) {
        AbstractC41062a aVar = this.f104592j;
        if (aVar != null) {
            aVar.mo148052a();
        }
    }

    public void setCircleBottomMargin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104583a.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, i);
        this.f104583a.setLayoutParams(layoutParams);
    }

    public void setDividerMargin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104585c.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, i, layoutParams.rightMargin, layoutParams.f2819k);
        this.f104585c.setLayoutParams(layoutParams);
    }

    public void setActionBtnVisibility(boolean z) {
        int i;
        float f;
        TextView textView = this.f104587e;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f104586d;
        if (!z) {
            i2 = 4;
        }
        textView2.setVisibility(i2);
        AudioCircleView audioCircleView = this.f104583a;
        Context context = getContext();
        if (z) {
            f = 40.0f;
        } else {
            f = 65.0f;
        }
        audioCircleView.setRadius(UIUtils.dp2px(context, f));
        mo148045a(z);
    }

    /* renamed from: a */
    private void m162816a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.kb_audio_text_panel_layout, this);
        this.f104583a = (AudioCircleView) findViewById(R.id.audio_circle_btn);
        this.f104584b = findViewById(R.id.audio_circle_bg);
        this.f104585c = findViewById(R.id.audio_bg_divider);
        this.f104586d = (TextView) findViewById(R.id.audio_2_text_send);
        this.f104587e = (TextView) findViewById(R.id.audio_2_text_clear);
        this.f104583a.mo147862a(UIUtils.getColor(context, R.color.ud_T400), UIUtils.getColor(context, R.color.ud_T500));
        this.f104583a.setIcon(R.drawable.kb_ic_svg_audio_2_text);
        this.f104583a.setRadius(UIUtils.dp2px(context, 65.0f));
    }

    /* renamed from: a */
    public void mo148045a(boolean z) {
        int dp2px = UIUtils.dp2px(getContext(), 60.0f);
        if (this.f104591i == null) {
            this.f104591i = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f104587e, "translationX", (float) dp2px, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f104586d, "translationX", (float) (-dp2px), 0.0f);
            this.f104591i.playTogether(ofFloat, ofFloat2);
            this.f104591i.setDuration(300L);
            this.f104591i.setInterpolator(new LinearInterpolator());
        }
        if (z) {
            this.f104591i.start();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f104591i.reverse();
        }
    }

    public Audio2TextPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo148044a(int i, int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f104584b.getLayoutParams();
        layoutParams.height = i;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, i2);
        this.f104584b.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m162818a(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (this.f104588f == null) {
            this.f104588f = new RectF();
            RectF innerBound = this.f104583a.getInnerBound();
            int[] iArr = new int[2];
            this.f104583a.getLocationOnScreen(iArr);
            this.f104588f.set(((float) iArr[0]) + innerBound.left, ((float) iArr[1]) + innerBound.top, ((float) iArr[0]) + innerBound.right, ((float) iArr[1]) + innerBound.bottom);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    return this.f104590h;
                }
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            if (this.f104590h) {
                AbstractC41062a aVar = this.f104592j;
                if (aVar != null) {
                    aVar.mo148055d();
                }
                C41026a aVar2 = this.f104593k;
                if (aVar2 != null) {
                    aVar2.mo147909b();
                }
                C41037b.m162698a(getContext()).mo147957b();
                this.f104583a.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$Audio2TextPanel$21QjIdOR1hl65Qph3lQBqZZ5QmQ */

                    public final void run() {
                        Audio2TextPanel.lambda$21QjIdOR1hl65Qph3lQBqZZ5QmQ(Audio2TextPanel.this);
                    }
                }, 500);
                this.f104590h = false;
                setActionBtnVisibility(true);
                HitPointHelper.f103322b.mo146880a(true, "audio_menu");
            }
            return true;
        } else if (!this.f104588f.contains(rawX, rawY)) {
            return false;
        } else {
            if (!isEnabled()) {
                Log.m165389i("Audio2TextPanel", "the view is not enable!");
                return false;
            }
            if (!this.f104590h) {
                this.f104590h = true;
                this.f104589g.vibrate(100);
                AbstractC41062a aVar3 = this.f104592j;
                if (aVar3 != null) {
                    aVar3.mo148054c();
                }
                C41037b.m162698a(getContext()).mo147954a();
                C41026a aVar4 = this.f104593k;
                if (aVar4 != null) {
                    aVar4.mo147908a(true, true);
                }
                setActionBtnVisibility(false);
            }
            return this.f104590h;
        }
    }

    public Audio2TextPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162816a(context);
        m162815a();
        if (this.f104589g == null) {
            this.f104589g = (Vibrator) getContext().getSystemService("vibrator");
        }
    }
}
