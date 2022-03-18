package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C1556v;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioCircleView;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41040d;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class AudioWithTextPanel extends ConstraintLayout {

    /* renamed from: A */
    private ObjectAnimator f104684A;

    /* renamed from: B */
    private AnimatorSet f104685B;

    /* renamed from: C */
    private boolean f104686C;

    /* renamed from: D */
    private boolean f104687D;

    /* renamed from: E */
    private String f104688E;

    /* renamed from: F */
    private boolean f104689F;

    /* renamed from: G */
    private Runnable f104690G;

    /* renamed from: a */
    public AudioCircleView f104691a;

    /* renamed from: b */
    public TextView f104692b;

    /* renamed from: c */
    public RectF f104693c;

    /* renamed from: d */
    public Vibrator f104694d;

    /* renamed from: e */
    public boolean f104695e;

    /* renamed from: f */
    public AudioPanelRecordTextView.AbstractC41071a f104696f;

    /* renamed from: g */
    public C41026a f104697g;

    /* renamed from: h */
    public boolean f104698h;

    /* renamed from: i */
    public boolean f104699i;

    /* renamed from: j */
    public boolean f104700j;

    /* renamed from: k */
    private View f104701k;

    /* renamed from: l */
    private View f104702l;

    /* renamed from: m */
    private View f104703m;

    /* renamed from: n */
    private View f104704n;

    /* renamed from: o */
    private TextView f104705o;

    /* renamed from: p */
    private TextView f104706p;

    /* renamed from: q */
    private RichTextEmojiconEditText f104707q;

    /* renamed from: r */
    private TextView f104708r;

    /* renamed from: s */
    private TextView f104709s;

    /* renamed from: t */
    private ProgressBar f104710t;

    /* renamed from: u */
    private ConstraintLayout f104711u;

    /* renamed from: v */
    private TextView f104712v;

    /* renamed from: w */
    private C0689b f104713w;

    /* renamed from: x */
    private C0689b f104714x;

    /* renamed from: y */
    private int f104715y;

    /* renamed from: z */
    private View.OnTouchListener f104716z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PanelMode {
    }

    public RichTextEmojiconEditText getMsgEditText() {
        return this.f104707q;
    }

    public int getBackgroundHeight() {
        return this.f104701k.getMeasuredHeight();
    }

    public int getAudioPanelMarginBottom() {
        return ((ConstraintLayout.LayoutParams) this.f104701k.getLayoutParams()).bottomMargin;
    }

    public int getPanelHeight() {
        return this.f104701k.getMeasuredHeight() + this.f104703m.getMeasuredHeight();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m162914h() {
        Object tag = this.f104710t.getTag();
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue() && this.f104710t.isAttachedToWindow()) {
            m162913g();
        }
    }

    /* renamed from: a */
    public void mo148147a() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f104707q;
        if (richTextEmojiconEditText != null) {
            richTextEmojiconEditText.setText("");
        }
        mo148150a(false);
        mo148153c();
    }

    /* renamed from: b */
    public void mo148151b() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f104707q;
        if (richTextEmojiconEditText != null) {
            richTextEmojiconEditText.setText("");
            this.f104707q.requestFocus();
        }
        mo148153c();
    }

    /* renamed from: e */
    private void m162911e() {
        this.f104706p.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.C410801 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AudioWithTextPanel.this.f104696f != null) {
                    AudioWithTextPanel.this.f104696f.mo147984d();
                }
            }
        });
        this.f104692b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.C410812 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                String str;
                HitPointHelper.Companion aVar = HitPointHelper.f103322b;
                if (AudioWithTextPanel.this.f104698h) {
                    str = "audio_button";
                } else {
                    str = "audio_menu";
                }
                aVar.mo146882b(str);
                if (AudioWithTextPanel.this.f104696f != null) {
                    AudioWithTextPanel.this.f104696f.mo147983c();
                }
                if (AudioWithTextPanel.this.f104696f != null) {
                    AudioWithTextPanel.this.f104696f.mo147984d();
                }
            }
        });
        this.f104705o.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.C410823 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AudioWithTextPanel.this.f104696f != null) {
                    AudioWithTextPanel.this.f104696f.mo147982b();
                }
                if (AudioWithTextPanel.this.f104696f != null) {
                    AudioWithTextPanel.this.f104696f.mo147984d();
                }
            }
        });
        View.OnTouchListener b = m162910b(getContext());
        this.f104716z = b;
        this.f104691a.setOnTouchListener(b);
        this.f104707q.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.C410834 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (AudioWithTextPanel.this.f104692b != null) {
                    AudioWithTextPanel.this.f104692b.setEnabled(!TextUtils.isEmpty(charSequence));
                }
            }
        });
    }

    /* renamed from: f */
    private void m162912f() {
        Log.d("Audio2TextPanel", "remove Callbacks: " + this.f104690G);
        this.f104710t.setTag(false);
        this.f104710t.removeCallbacks(this.f104690G);
    }

    /* renamed from: g */
    private void m162913g() {
        this.f104712v.setText(R.string.Lark_Chat_SendAudioAndTextPoorNetworkTip);
        this.f104712v.setVisibility(0);
        this.f104689F = true;
        this.f104710t.setVisibility(4);
        this.f104692b.setVisibility(0);
        this.f104692b.setEnabled(true ^ TextUtils.isEmpty(this.f104688E));
    }

    /* renamed from: c */
    public void mo148153c() {
        if (VoiceKBPlugin.f104495h.mo147974a()) {
            m162912f();
            this.f104711u.setBackgroundResource(R.drawable.kb_audio_send_all_btn_bg);
            this.f104692b.setVisibility(0);
            this.f104692b.setEnabled(true);
            this.f104689F = false;
            this.f104712v.setVisibility(4);
            this.f104686C = false;
            this.f104687D = false;
        }
    }

    /* renamed from: d */
    public void mo148155d() {
        if (!VoiceKBPlugin.f104495h.mo147974a()) {
            setActionBtnVisibility(true);
            return;
        }
        Log.d("Audio2TextPanel", "notifyRecordFinish");
        if (!this.f104686C) {
            this.f104710t.setVisibility(0);
            this.f104692b.setVisibility(4);
            if (this.f104690G == null) {
                this.f104690G = new Runnable() {
                    /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioWithTextPanel$82rm9ESsigjNLUSgDP4f5T6ReoE */

                    public final void run() {
                        AudioWithTextPanel.this.m162914h();
                    }
                };
            }
            Log.d("Audio2TextPanel", "callback = " + this.f104690G);
            this.f104710t.setTag(true);
            this.f104710t.postDelayed(this.f104690G, VoiceKBPlugin.f104495h.mo147973a(false));
        }
        setActionBtnVisibility(true);
    }

    public void setAudioRecorderListener(C41026a aVar) {
        this.f104697g = aVar;
    }

    public void setDelegate(AudioPanelRecordTextView.AbstractC41071a aVar) {
        this.f104696f = aVar;
    }

    public AudioWithTextPanel(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View.OnTouchListener m162910b(Context context) {
        return new View.OnTouchListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.View$OnTouchListenerC410856 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m162924a() {
                AudioWithTextPanel.this.setAudioAmplitude(0);
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (AudioWithTextPanel.this.f104693c == null) {
                    AudioWithTextPanel.this.f104693c = new RectF();
                    RectF innerBound = AudioWithTextPanel.this.f104691a.getInnerBound();
                    int[] iArr = new int[2];
                    AudioWithTextPanel.this.f104691a.getLocationOnScreen(iArr);
                    AudioWithTextPanel.this.f104693c.set(((float) iArr[0]) + innerBound.left, ((float) iArr[1]) + innerBound.top, ((float) iArr[0]) + innerBound.right, ((float) iArr[1]) + innerBound.bottom);
                }
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            return AudioWithTextPanel.this.f104695e;
                        }
                        if (action != 3) {
                            return false;
                        }
                    }
                    if (AudioWithTextPanel.this.f104695e) {
                        if (AudioWithTextPanel.this.f104696f != null) {
                            AudioWithTextPanel.this.f104696f.mo147986f();
                        }
                        if (AudioWithTextPanel.this.f104697g != null) {
                            AudioWithTextPanel.this.f104697g.mo147907a(false);
                            AudioWithTextPanel.this.f104697g.mo147909b();
                        }
                        C41037b.m162698a(AudioWithTextPanel.this.getContext()).mo147957b();
                        AudioWithTextPanel.this.f104691a.postDelayed(new Runnable() {
                            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioWithTextPanel$6$YzBaSvWaAEEbbruJ5XmFKlGJXs */

                            public final void run() {
                                AudioWithTextPanel.View$OnTouchListenerC410856.this.m162924a();
                            }
                        }, 500);
                        AudioWithTextPanel.this.f104695e = false;
                        if (AudioWithTextPanel.this.f104700j) {
                            HitPointHelper.Companion aVar = HitPointHelper.f103322b;
                            if (AudioWithTextPanel.this.f104698h) {
                                str = "audio_button";
                            } else {
                                str = "audio_menu";
                            }
                            aVar.mo146880a(true, str);
                        }
                    }
                    return true;
                } else if (!AudioWithTextPanel.this.f104693c.contains(rawX, rawY) && !AudioWithTextPanel.this.f104698h) {
                    return false;
                } else {
                    if (!AudioWithTextPanel.this.isEnabled()) {
                        Log.i("Audio2TextPanel", "the view is not enable!");
                        return false;
                    } else if (AudioWithTextPanel.this.f104699i) {
                        return false;
                    } else {
                        if (!AudioWithTextPanel.this.f104695e) {
                            AudioWithTextPanel.this.f104695e = true;
                            AudioWithTextPanel.this.f104694d.vibrate(100);
                            if (AudioWithTextPanel.this.f104696f != null) {
                                AudioWithTextPanel.this.f104696f.mo147985e();
                            }
                            C41037b.m162698a(AudioWithTextPanel.this.getContext()).mo147954a();
                            if (AudioWithTextPanel.this.f104697g != null) {
                                AudioWithTextPanel.this.f104697g.mo147908a(true, false);
                            }
                            AudioWithTextPanel.this.setActionBtnVisibility(false);
                        }
                        return AudioWithTextPanel.this.f104695e;
                    }
                }
            }
        };
    }

    public void setAudioAmplitude(int i) {
        this.f104691a.setAmplitudeAnimate(i);
    }

    public void setAudioDuration(int i) {
        this.f104708r.setText(C26279i.m95150a((long) i));
    }

    public void setAudioLocale(String str) {
        this.f104709s.setText(UIHelper.mustacheFormat((int) R.string.Lark_Chat_AudioRecognitionLanguageTip, "language", str));
    }

    public void setCircleBottomMargin(int i) {
        this.f104713w.mo3881a(R.id.audio_circle_btn, 4, i);
        this.f104713w.mo3905c(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f104716z;
        if (onTouchListener == null || !this.f104698h) {
            return super.onTouchEvent(motionEvent);
        }
        return onTouchListener.onTouch(this, motionEvent);
    }

    public void setCircleStartMargin(int i) {
        this.f104713w.mo3879a(R.id.audio_circle_btn, BitmapDescriptorFactory.HUE_RED);
        this.f104713w.mo3881a(R.id.audio_circle_btn, 6, i);
        this.f104713w.mo3905c(this);
    }

    public void setPanelFullShown(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (z) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, -UIUtils.dp2px(getContext(), 83.0f));
        }
    }

    public void setShowInPopupWindow(boolean z) {
        this.f104698h = z;
        this.f104707q.setMinLines(3);
        this.f104707q.setMaxLines(4);
        this.f104713w.mo3899b(R.id.audio_bg_divider, 8);
        this.f104713w.mo3905c(this);
    }

    public void setMode(int i) {
        this.f104715y = i;
        if (i == 1) {
            this.f104709s.setVisibility(0);
            this.f104691a.setRadius(UIUtils.dp2px(getContext(), 45.0f));
            return;
        }
        this.f104709s.setVisibility(8);
        this.f104691a.setRadius(UIUtils.dp2px(getContext(), 65.0f));
    }

    /* renamed from: b */
    public void mo148152b(boolean z) {
        int dp2px = UIUtils.dp2px(getContext(), 60.0f);
        if (this.f104685B == null) {
            this.f104685B = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f104706p, "translationX", (float) dp2px, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f104705o, "translationX", (float) (-dp2px), 0.0f);
            this.f104685B.playTogether(ofFloat, ofFloat2);
            this.f104685B.setDuration(500L);
            this.f104685B.setInterpolator(new LinearInterpolator());
        }
        if (z) {
            this.f104685B.start();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f104685B.reverse();
        }
    }

    /* renamed from: c */
    public void mo148154c(boolean z) {
        if (this.f104684A == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f104684A = ofFloat;
            ofFloat.setDuration(200L);
            this.f104684A.setInterpolator(new LinearInterpolator());
        }
        if (z) {
            this.f104684A.start();
            return;
        }
        this.f104684A.reverse();
        mo148153c();
    }

    public void setActionBtnVisibility(boolean z) {
        int i;
        int i2;
        int i3;
        C1556v.m7130a(this);
        C0689b bVar = this.f104713w;
        int i4 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        bVar.mo3899b(R.id.audio_2_text_clear, i);
        C0689b bVar2 = this.f104713w;
        if (this.f104700j) {
            i2 = 8;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        bVar2.mo3899b(R.id.audio_2_text_center_btn_layout, i2);
        C0689b bVar3 = this.f104713w;
        if (z) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        bVar3.mo3899b(R.id.audio_2_text_send_audio, i3);
        C0689b bVar4 = this.f104713w;
        if (z) {
            i4 = 4;
        }
        bVar4.mo3899b(R.id.audio_circle_btn, i4);
        this.f104713w.mo3905c(this);
        this.f104699i = z;
        mo148152b(z);
    }

    /* renamed from: a */
    public void mo148150a(boolean z) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        float f2;
        float f3;
        int i5;
        C1556v.m7130a(this);
        int dp2px = UIUtils.dp2px(getContext(), 107.5f);
        int dp2px2 = UIUtils.dp2px(getContext(), 44.0f);
        int dp2px3 = UIUtils.dp2px(getContext(), 80.0f);
        C0689b bVar = this.f104713w;
        if (z) {
            i = dp2px;
        } else {
            i = dp2px3;
        }
        bVar.mo3907d(R.id.audio_2_text_clear, i);
        C0689b bVar2 = this.f104713w;
        if (z) {
            i2 = dp2px2;
        } else {
            i2 = dp2px3;
        }
        bVar2.mo3904c(R.id.audio_2_text_clear, i2);
        C0689b bVar3 = this.f104713w;
        if (z) {
            f = 0.7f;
        } else {
            f = 0.5f;
        }
        bVar3.mo3898b(R.id.audio_2_text_clear, f);
        C0689b bVar4 = this.f104713w;
        if (z) {
            i3 = dp2px;
        } else {
            i3 = dp2px3;
        }
        bVar4.mo3907d(R.id.audio_2_text_center_btn_layout, i3);
        C0689b bVar5 = this.f104713w;
        if (z) {
            i4 = dp2px2;
        } else {
            i4 = dp2px3;
        }
        bVar5.mo3904c(R.id.audio_2_text_center_btn_layout, i4);
        C0689b bVar6 = this.f104713w;
        if (!z) {
            dp2px = dp2px3;
        }
        bVar6.mo3907d(R.id.audio_2_text_send_audio, dp2px);
        C0689b bVar7 = this.f104713w;
        if (!z) {
            dp2px2 = dp2px3;
        }
        bVar7.mo3904c(R.id.audio_2_text_send_audio, dp2px2);
        C0689b bVar8 = this.f104713w;
        Context context = getContext();
        float f4 = 10.0f;
        if (z) {
            f2 = 10.0f;
        } else {
            f2 = 40.0f;
        }
        bVar8.mo3881a(R.id.audio_2_text_clear, 7, UIUtils.dp2px(context, f2));
        C0689b bVar9 = this.f104713w;
        Context context2 = getContext();
        if (!z) {
            f4 = 40.0f;
        }
        bVar9.mo3881a(R.id.audio_2_text_send_audio, 6, UIUtils.dp2px(context2, f4));
        C0689b bVar10 = this.f104713w;
        Context context3 = getContext();
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f3 = 16.0f;
        }
        bVar10.mo3881a(R.id.warning_textView, 3, UIUtils.dp2px(context3, f3));
        C0689b bVar11 = this.f104713w;
        if (z) {
            f5 = 1.0f;
        }
        bVar11.mo3898b(R.id.warning_textView, f5);
        C0689b bVar12 = this.f104713w;
        if (this.f104689F) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        bVar12.mo3899b(R.id.warning_textView, i5);
        this.f104713w.mo3905c(this);
    }

    public void setWithTextMode(boolean z) {
        this.f104700j = z;
        if (z) {
            this.f104691a.mo147862a(UIUtils.getColor(getContext(), R.color.audio_to_text_button_start), UIUtils.getColor(getContext(), R.color.audio_to_text_button_start));
            this.f104713w.mo3899b(R.id.audio_2_text_center_btn_layout, 8);
            this.f104713w.mo3899b(R.id.audio_duration, 4);
            this.f104713w.mo3882a(R.id.audio_recognize_locale, 6, 0, 6);
            this.f104713w.mo3879a(R.id.audio_recognize_locale, BitmapDescriptorFactory.HUE_RED);
            this.f104713w.mo3881a(R.id.audio_2_text_clear, 6, UIUtils.dp2px(getContext(), 67.5f));
            this.f104713w.mo3881a(R.id.audio_2_text_send_audio, 7, UIUtils.dp2px(getContext(), 67.5f));
            this.f104713w.mo3905c(this);
            this.f104705o.setText(R.string.Lark_Legacy_Send);
            this.f104705o.setTextColor(UIUtils.getColor(getContext(), R.color.function_info_500));
            this.f104705o.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel.C410845 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (AudioWithTextPanel.this.f104696f != null) {
                        AudioWithTextPanel.this.f104696f.mo147981a();
                    }
                    if (AudioWithTextPanel.this.f104696f != null) {
                        AudioWithTextPanel.this.f104696f.mo147984d();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m162909a(Context context) {
        View view = new View(context);
        this.f104703m = view;
        view.setId(R.id.panel_bg);
        this.f104703m.setBackgroundColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        ConstraintLayout.LayoutParams a = C41040d.m162715a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        a.f2818j = R.id.audio_circle_bg;
        a.f2825q = 0;
        a.f2827s = 0;
        a.f2817i = R.id.panel_bg_divider;
        addView(this.f104703m, a);
        View view2 = new View(context);
        this.f104704n = view2;
        view2.setId(R.id.panel_bg_divider);
        this.f104704n.setBackgroundColor(UIUtils.getColor(context, R.color.line_border_card));
        this.f104704n.setVisibility(0);
        this.f104704n.setBackgroundResource(R.drawable.common_keyboard_shadow);
        ConstraintLayout.LayoutParams a2 = C41040d.m162716a(BitmapDescriptorFactory.HUE_RED, 5.0f, 0, 0, 0, UIUtils.dp2px(context, 7.0f));
        a2.f2816h = 0;
        a2.f2818j = R.id.audio_duration;
        a2.f2825q = 0;
        a2.f2827s = 0;
        a2.f2790H = 2;
        a2.f2783A = 1.0f;
        addView(this.f104704n, a2);
        View view3 = new View(context);
        this.f104701k = view3;
        view3.setId(R.id.audio_circle_bg);
        this.f104701k.setBackgroundColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        ConstraintLayout.LayoutParams a3 = C41040d.m162715a(BitmapDescriptorFactory.HUE_RED, 10.0f);
        a3.f2819k = 0;
        a3.f2825q = 0;
        a3.f2827s = 0;
        a3.f2817i = R.id.input_edit;
        addView(this.f104701k, a3);
        View view4 = new View(context);
        this.f104702l = view4;
        view4.setId(R.id.audio_bg_divider);
        this.f104702l.setBackgroundColor(UIUtils.getColor(context, R.color.line_border_card));
        this.f104702l.setVisibility(0);
        ConstraintLayout.LayoutParams a4 = C41040d.m162715a(BitmapDescriptorFactory.HUE_RED, 0.5f);
        a4.f2816h = R.id.audio_circle_bg;
        a4.f2825q = 0;
        a4.f2827s = 0;
        addView(this.f104702l, a4);
        TextView textView = new TextView(context);
        this.f104712v = textView;
        textView.setId(R.id.warning_textView);
        Drawable e = C57582a.m223617e(context, R.drawable.ic_warning_filled);
        e.setBounds(0, 0, e.getIntrinsicWidth(), e.getIntrinsicHeight());
        this.f104712v.setCompoundDrawablesWithIntrinsicBounds(e, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f104712v.setTextColor(UIUtils.getColor(context, R.color.text_title));
        this.f104712v.setTextSize(12.0f);
        this.f104712v.setGravity(17);
        this.f104712v.setVisibility(8);
        ConstraintLayout.LayoutParams a5 = C41040d.m162715a(-2.0f, -2.0f);
        a5.f2817i = R.id.audio_bg_divider;
        a5.f2825q = 0;
        a5.f2827s = 0;
        a5.topMargin = UIUtils.dp2px(context, 16.0f);
        a5.bottomMargin = UIUtils.dp2px(context, 16.0f);
        a5.f2818j = R.id.audio_2_text_center_btn_layout;
        addView(this.f104712v, a5);
        AudioCircleView audioCircleView = new AudioCircleView(context);
        this.f104691a = audioCircleView;
        audioCircleView.setId(R.id.audio_circle_btn);
        this.f104691a.mo147862a(UIUtils.getColor(context, R.color.audio_with_text_button_start), UIUtils.getColor(context, R.color.audio_with_text_button_end));
        this.f104691a.setIcon(R.drawable.kb_ic_svg_audio_with_text);
        this.f104691a.setRadius(UIUtils.dp2px(context, 65.0f));
        ConstraintLayout.LayoutParams a6 = C41040d.m162715a(210.0f, 210.0f);
        a6.f2819k = 0;
        a6.f2825q = 0;
        a6.f2827s = 0;
        addView(this.f104691a, a6);
        RichTextEmojiconEditText richTextEmojiconEditText = new RichTextEmojiconEditText(context);
        this.f104707q = richTextEmojiconEditText;
        richTextEmojiconEditText.setId(R.id.input_edit);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f104707q.setTextCursorDrawable(R.drawable.text_cursor_drawable);
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this.f104707q, Integer.valueOf((int) R.drawable.text_cursor_drawable));
            } catch (Throwable unused) {
            }
        }
        this.f104707q.setMaxLines(4);
        this.f104707q.setGravity(8388659);
        this.f104707q.setTextSize(16.0f);
        this.f104707q.setBackground(null);
        this.f104707q.setFocusable(true);
        this.f104707q.setTextColor(UIUtils.getColor(context, R.color.text_title));
        this.f104707q.setHintTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        ConstraintLayout.LayoutParams a7 = C41040d.m162716a(BitmapDescriptorFactory.HUE_RED, -2.0f, UIUtils.dp2px(context, 14.0f), 0, UIUtils.dp2px(context, 14.0f), UIUtils.dp2px(context, 12.0f));
        a7.f2818j = R.id.audio_circle_bg;
        a7.f2817i = R.id.audio_duration;
        a7.f2825q = 0;
        a7.f2827s = 0;
        addView(this.f104707q, a7);
        TextView textView2 = new TextView(context);
        this.f104708r = textView2;
        textView2.setId(R.id.audio_duration);
        this.f104708r.setTextSize(14.0f);
        this.f104708r.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        this.f104708r.setCompoundDrawablesWithIntrinsicBounds(R.drawable.kb_ic_svg_audio_send_audio_duration, 0, 0, 0);
        this.f104708r.setCompoundDrawablePadding(UIUtils.dp2px(context, 10.0f));
        ConstraintLayout.LayoutParams a8 = C41040d.m162716a(-2.0f, -2.0f, UIUtils.dp2px(context, 16.0f), UIUtils.dp2px(context, 11.0f), 0, 0);
        a8.f2825q = 0;
        a8.f2818j = R.id.input_edit;
        a8.f2817i = R.id.panel_bg_divider;
        addView(this.f104708r, a8);
        TextView textView3 = new TextView(context);
        this.f104709s = textView3;
        textView3.setId(R.id.audio_recognize_locale);
        this.f104709s.setTextSize(11.0f);
        this.f104709s.setTextColor(UIUtils.getColor(context, R.color.text_placeholder));
        ConstraintLayout.LayoutParams a9 = C41040d.m162716a(-2.0f, -2.0f, UIUtils.dp2px(context, 16.0f), 0, UIUtils.dp2px(context, 12.0f), UIUtils.dp2px(context, 8.0f));
        a9.f2827s = 0;
        a9.f2818j = R.id.input_edit;
        addView(this.f104709s, a9);
        int dp2px = UIUtils.dp2px(context, 5.0f);
        TextView textView4 = new TextView(context);
        this.f104706p = textView4;
        textView4.setId(R.id.audio_2_text_clear);
        this.f104706p.setBackgroundResource(R.drawable.kb_audio_2_text_btn_bg);
        this.f104706p.setPadding(dp2px, dp2px, dp2px, dp2px);
        this.f104706p.setTextColor(UIUtils.getColor(context, R.color.text_title));
        this.f104706p.setTextSize(17.0f);
        this.f104706p.setGravity(17);
        this.f104706p.setText(R.string.Lark_Chat_ClearText);
        this.f104706p.setEllipsize(TextUtils.TruncateAt.END);
        float f = (float) 80;
        ConstraintLayout.LayoutParams a10 = C41040d.m162716a(f, f, 0, 0, UIUtils.dp2px(getContext(), 40.0f), 0);
        a10.f2825q = 0;
        a10.f2826r = R.id.audio_2_text_center_btn_layout;
        a10.f2816h = R.id.audio_circle_bg;
        a10.f2819k = R.id.audio_circle_bg;
        a10.f2789G = 2;
        addView(this.f104706p, a10);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.f104711u = constraintLayout;
        constraintLayout.setId(R.id.audio_2_text_center_btn_layout);
        this.f104711u.setBackgroundResource(R.drawable.kb_audio_send_all_btn_bg);
        ConstraintLayout.LayoutParams a11 = C41040d.m162715a(80.0f, 80.0f);
        a11.f2824p = R.id.audio_2_text_clear;
        a11.f2816h = R.id.audio_2_text_clear;
        a11.f2819k = R.id.audio_2_text_clear;
        a11.f2826r = R.id.audio_2_text_send_audio;
        addView(this.f104711u, a11);
        TextView textView5 = new TextView(context);
        this.f104692b = textView5;
        textView5.setId(R.id.audio_2_text_send_all);
        this.f104692b.setBackgroundResource(R.drawable.kb_audio_send_all_btn_bg_selector);
        this.f104692b.setPadding(dp2px, dp2px, dp2px, dp2px);
        this.f104692b.setTextColor(UIUtils.getColor(context, R.color.static_white));
        this.f104692b.setTextSize(17.0f);
        this.f104692b.setGravity(17);
        this.f104692b.setText(R.string.Lark_Legacy_Send);
        this.f104692b.setEllipsize(TextUtils.TruncateAt.END);
        ConstraintLayout.LayoutParams a12 = C41040d.m162715a(-1.0f, -1.0f);
        a12.f2825q = 0;
        a12.f2827s = 0;
        a12.f2816h = 0;
        a12.f2819k = 0;
        this.f104711u.addView(this.f104692b, a12);
        ProgressBar progressBar = new ProgressBar(context);
        this.f104710t = progressBar;
        progressBar.setId(R.id.pb_recognizing);
        this.f104710t.setIndeterminateTintList(ColorStateList.valueOf(getResources().getColor(R.color.static_white)));
        ConstraintLayout.LayoutParams a13 = C41040d.m162715a(24.0f, 24.0f);
        a13.f2825q = 0;
        a13.f2827s = 0;
        a13.f2816h = 0;
        a13.f2819k = 0;
        this.f104710t.setVisibility(4);
        this.f104711u.addView(this.f104710t, a13);
        TextView textView6 = new TextView(context);
        this.f104705o = textView6;
        textView6.setId(R.id.audio_2_text_send_audio);
        this.f104705o.setBackgroundResource(R.drawable.kb_audio_2_text_btn_bg);
        this.f104705o.setPadding(dp2px, dp2px, dp2px, dp2px);
        this.f104705o.setTextColor(UIUtils.getColor(context, R.color.text_title));
        this.f104705o.setTextSize(17.0f);
        this.f104705o.setGravity(17);
        this.f104705o.setText(R.string.Lark_Chat_SendAudioOnly);
        this.f104705o.setEllipsize(TextUtils.TruncateAt.END);
        ConstraintLayout.LayoutParams a14 = C41040d.m162716a(f, f, UIUtils.dp2px(getContext(), 40.0f), 0, 0, 0);
        a14.f2824p = R.id.audio_2_text_center_btn_layout;
        a14.f2816h = R.id.audio_2_text_clear;
        a14.f2819k = R.id.audio_2_text_clear;
        a14.f2827s = 0;
        addView(this.f104705o, a14);
        setId(R.id.root_view);
        this.f104713w = new C0689b();
        this.f104714x = new C0689b();
        this.f104713w.mo3901b(this);
        this.f104714x.mo3901b(this);
    }

    public AudioWithTextPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo148148a(int i, int i2) {
        this.f104713w.mo3904c(R.id.audio_circle_bg, i);
        this.f104713w.mo3881a(R.id.audio_circle_bg, 4, i2);
        this.f104713w.mo3905c(this);
    }

    public AudioWithTextPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104686C = true;
        this.f104687D = true;
        this.f104688E = "";
        m162909a(context);
        m162911e();
        if (this.f104694d == null) {
            this.f104694d = (Vibrator) getContext().getSystemService("vibrator");
        }
    }

    /* renamed from: a */
    public void mo148149a(String str, boolean z, boolean z2) {
        if (VoiceKBPlugin.f104495h.mo147974a()) {
            Log.d("Audio2TextPanel", "notifySpeechResult fromResp = " + z + ",isFinish = " + z2);
            this.f104688E = str;
            if (!this.f104687D && z) {
                this.f104687D = true;
            }
            if (!this.f104686C && z2) {
                this.f104686C = true;
                if (z) {
                    ObjectAnimator objectAnimator = this.f104684A;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        Log.d("Audio2TextPanel", "clear animation");
                        clearAnimation();
                    }
                    this.f104710t.setVisibility(4);
                    this.f104692b.setVisibility(0);
                    m162912f();
                }
            }
        }
    }
}
