package com.ss.android.lark.keyboard.plugin.tool.voice.legacy;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.log.Log;

public class LarkRecorderPanel extends RelativeLayout {

    /* renamed from: a */
    public AbstractC41060a f104553a;

    /* renamed from: b */
    private TextView f104554b;

    /* renamed from: c */
    private TextView f104555c;

    /* renamed from: d */
    private ImageView f104556d;

    /* renamed from: e */
    private LarkRecorderCircle f104557e;

    /* renamed from: f */
    private LarkVoiceLineView f104558f;

    /* renamed from: g */
    private LarkVoiceLineView f104559g;

    /* renamed from: h */
    private volatile boolean f104560h;

    /* renamed from: i */
    private Runnable f104561i;

    /* renamed from: j */
    private AudioManager.OnAudioFocusChangeListener f104562j;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel$a */
    public interface AbstractC41060a {
        /* renamed from: a */
        void mo147908a(boolean z, boolean z2);

        /* renamed from: b */
        void mo147909b();

        /* renamed from: c */
        void mo147910c();

        /* renamed from: d */
        int mo147911d();

        /* renamed from: e */
        void mo147912e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo147999a() {
        this.f104557e.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.View$OnTouchListenerC410573 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                float f = (float) iArr[1];
                float rawY = motionEvent.getRawY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    return LarkRecorderPanel.this.mo148009g();
                }
                if (action == 1) {
                    LarkRecorderPanel.this.mo148000a(f, rawY);
                    return false;
                } else if (action == 2) {
                    LarkRecorderPanel.this.mo148004b(f, rawY);
                    return false;
                } else if (action != 3) {
                    return false;
                } else {
                    LarkRecorderPanel.this.mo148008f();
                    return false;
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f104561i);
    }

    /* renamed from: c */
    public void mo148005c() {
        this.f104557e.setVisibility(0);
        this.f104556d.setVisibility(8);
        this.f104555c.setText(getResources().getString(R.string.Lark_Legacy_GuideCancelVoiceRecord));
    }

    /* renamed from: f */
    public void mo148008f() {
        C41037b.m162698a(getContext()).mo147957b();
        if (this.f104560h) {
            this.f104560h = false;
            AbstractC41060a aVar = this.f104553a;
            if (aVar != null) {
                aVar.mo147910c();
            }
            mo148006d();
        }
    }

    /* renamed from: b */
    public void mo148003b() {
        this.f104557e.setVisibility(8);
        this.f104556d.setVisibility(0);
        this.f104556d.setImageResource(R.drawable.trash_voice);
        this.f104555c.setText(getResources().getString(R.string.Lark_Legacy_VoiceIndicatorCancel));
    }

    /* renamed from: d */
    public void mo148006d() {
        this.f104557e.setVisibility(0);
        this.f104556d.setVisibility(8);
        this.f104554b.setText(R.string.Lark_Legacy_StartVoiceRecord);
        this.f104555c.setText("");
        this.f104557e.mo147993b();
        this.f104558f.mo148022c();
        this.f104559g.mo148022c();
        this.f104558f.setVisibility(8);
        this.f104559g.setVisibility(8);
    }

    /* renamed from: e */
    public void mo148007e() {
        this.f104557e.setVisibility(8);
        this.f104556d.setVisibility(0);
        this.f104556d.setImageResource(R.drawable.recorder_warning);
        this.f104554b.setText(getResources().getString(R.string.Lark_Legacy_RecordShortTimeWarning));
        this.f104555c.setText("");
    }

    /* renamed from: g */
    public boolean mo148009g() {
        this.f104560h = true;
        C41037b.m162698a(getContext()).mo147954a();
        AbstractC41060a aVar = this.f104553a;
        if (aVar != null) {
            aVar.mo147908a(false, false);
        }
        this.f104557e.mo147992a();
        this.f104558f.mo148021b();
        this.f104559g.mo148021b();
        this.f104558f.setVisibility(0);
        this.f104559g.setVisibility(0);
        return true;
    }

    public void setRecordListener(AbstractC41060a aVar) {
        this.f104553a = aVar;
    }

    public LarkRecorderPanel(Context context) {
        this(context, null);
    }

    public void setRecorderVolume(double d) {
        this.f104558f.setVolume(d);
        this.f104559g.setVolume(d);
    }

    public void setTitleText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f104560h || charSequence.equals(getResources().getString(R.string.Lark_Legacy_StartVoiceRecord))) {
                this.f104554b.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public void mo148001a(int i) {
        C41037b.m162698a(getContext()).mo147957b();
        if (this.f104560h) {
            this.f104560h = false;
            AbstractC41060a aVar = this.f104553a;
            if (aVar != null) {
                if (i == 1 && aVar.mo147911d() >= 300000) {
                    this.f104553a.mo147909b();
                } else if (i == 2) {
                    this.f104553a.mo147910c();
                } else if (i == 3) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.RunnableC410584 */

                        public void run() {
                            LarkRecorderPanel.this.f104553a.mo147912e();
                        }
                    });
                }
            }
            post(new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.RunnableC410595 */

                public void run() {
                    LarkRecorderPanel.this.mo148006d();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo148002a(Context context) {
        View inflate = View.inflate(context, R.layout.kb_chat_keyboard_recorder_panel, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        this.f104554b = (TextView) findViewById(R.id.recorder_title_tv);
        this.f104555c = (TextView) findViewById(R.id.recorder_details);
        this.f104556d = (ImageView) findViewById(R.id.recorder_tips_iv);
        this.f104557e = (LarkRecorderCircle) findViewById(R.id.recorder_btn);
        this.f104558f = (LarkVoiceLineView) findViewById(R.id.recorder_left_volume);
        this.f104559g = (LarkVoiceLineView) findViewById(R.id.recorder_right_volume);
    }

    public LarkRecorderPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo148004b(float f, float f2) {
        if (this.f104560h) {
            if (f > f2) {
                mo148003b();
            } else {
                mo148005c();
            }
        }
    }

    /* renamed from: a */
    public void mo148000a(float f, float f2) {
        Log.m165379d("MarcusTest", "handleEventUp: " + this.f104560h);
        C41037b.m162698a(getContext()).mo147957b();
        if (this.f104560h) {
            this.f104560h = false;
            AbstractC41060a aVar = this.f104553a;
            if (aVar != null) {
                if (f > f2) {
                    aVar.mo147910c();
                    mo148006d();
                } else if (aVar.mo147911d() < 1000) {
                    mo148007e();
                    this.f104553a.mo147910c();
                    this.f104558f.setVisibility(8);
                    this.f104559g.setVisibility(8);
                    postDelayed(this.f104561i, 1000);
                } else {
                    this.f104553a.mo147909b();
                    mo148006d();
                }
            }
        }
    }

    public LarkRecorderPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104561i = new Runnable() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.RunnableC410551 */

            public void run() {
                LarkRecorderPanel.this.mo148006d();
            }
        };
        this.f104562j = new AudioManager.OnAudioFocusChangeListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.C410562 */

            public void onAudioFocusChange(int i) {
            }
        };
        mo148002a(context);
        mo147999a();
        mo148006d();
    }
}
