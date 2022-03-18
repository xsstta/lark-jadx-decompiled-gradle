package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioCircleView;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41040d;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel;
import com.ss.android.lark.ui.p2892a.C57582a;

public class AudioPanelTextView extends RelativeLayout {

    /* renamed from: a */
    public TextView f104656a;

    /* renamed from: b */
    public AudioCircleView f104657b;

    /* renamed from: c */
    public TextView f104658c;

    /* renamed from: d */
    public boolean f104659d;

    /* renamed from: e */
    public AbstractC41077a f104660e;

    /* renamed from: f */
    public C41026a f104661f;

    /* renamed from: g */
    private Vibrator f104662g;

    /* renamed from: h */
    private BasePopupWindow f104663h;

    /* renamed from: i */
    private Audio2TextPanel f104664i;

    /* renamed from: j */
    private IKeyBoardPlugin.IKeyBoardContext f104665j;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView$a */
    public interface AbstractC41077a {
        /* renamed from: a */
        void mo147987a();

        /* renamed from: b */
        void mo147988b();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m162883c() {
        mo148118a(false);
        mo148117a(0.0d, true);
    }

    /* renamed from: b */
    public void mo148119b() {
        BasePopupWindow basePopupWindow = this.f104663h;
        if (basePopupWindow != null && basePopupWindow.isShowing()) {
            this.f104663h.dismiss();
        }
    }

    public int getKeyboardHeight() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104665j;
        if (bVar != null) {
            return bVar.mo147366C() + this.f104665j.mo147367D();
        }
        return 0;
    }

    public RichTextEmojiconEditText getMsgEditText() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104665j;
        if (bVar == null) {
            return null;
        }
        EditText l = bVar.mo147381z().mo146904l();
        if (l instanceof RichTextEmojiconEditText) {
            return (RichTextEmojiconEditText) l;
        }
        return null;
    }

    /* renamed from: a */
    public void mo148116a() {
        getParent().requestDisallowInterceptTouchEvent(false);
        if (this.f104659d) {
            this.f104659d = false;
            this.f104661f.mo147910c();
            C41037b.m162698a(getContext()).mo147957b();
            this.f104657b.postDelayed(new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioPanelTextView$1_VQG_AJZGwccH_C8vvlJJj2tvg */

                public final void run() {
                    AudioPanelTextView.lambda$1_VQG_AJZGwccH_C8vvlJJj2tvg(AudioPanelTextView.this);
                }
            }, 500);
        }
    }

    public void setAudioRecorderListener(C41026a aVar) {
        this.f104661f = aVar;
    }

    public void setDelegate(AbstractC41077a aVar) {
        this.f104660e = aVar;
    }

    public void setKeyboardContext(IKeyBoardPlugin.IKeyBoardContext bVar) {
        this.f104665j = bVar;
    }

    public AudioPanelTextView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View.OnTouchListener m162882b(Context context) {
        return new View.OnTouchListener(context) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.View$OnTouchListenerC410741 */

            /* renamed from: a */
            final /* synthetic */ Context f104666a;

            /* renamed from: c */
            private boolean f104668c;

            /* renamed from: d */
            private float f104669d;

            /* renamed from: e */
            private float f104670e;

            /* renamed from: f */
            private float f104671f;

            /* renamed from: g */
            private Runnable f104672g = new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.View$OnTouchListenerC410741.RunnableC410751 */

                public void run() {
                    AudioPanelTextView.this.f104659d = true;
                    AudioPanelTextView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    AudioPanelTextView.this.mo148118a(true);
                    C41037b.m162698a(AudioPanelTextView.this.getContext()).mo147954a();
                    AudioPanelTextView.this.f104661f.mo147908a(true, true);
                }
            };

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m162889a() {
                AudioPanelTextView.this.mo148118a(false);
                AudioPanelTextView.this.mo148117a(0.0d, true);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m162890a(boolean z) {
                this.f104668c = z;
            }

            {
                this.f104666a = r2;
                this.f104669d = (float) UIUtils.dp2px(r2, 10.0f);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
                if (r2 != 3) goto L_0x00b8;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                /*
                // Method dump skipped, instructions count: 246
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.View$OnTouchListenerC410741.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
    }

    public void setAudioAmplitude(double d) {
        mo148117a(d, false);
    }

    /* renamed from: a */
    public void mo148118a(boolean z) {
        if (z) {
            mo148120b(true);
            return;
        }
        Audio2TextPanel audio2TextPanel = this.f104664i;
        if (audio2TextPanel != null) {
            audio2TextPanel.setActionBtnVisibility(true);
        }
    }

    public void setLanguageOption(int i) {
        TextView textView = this.f104658c;
        if (textView != null) {
            textView.setText(getResources().getStringArray(R.array.audio2text_option_array)[i]);
        }
    }

    /* renamed from: a */
    private void m162880a(Context context) {
        AudioCircleView audioCircleView = new AudioCircleView(context);
        this.f104657b = audioCircleView;
        audioCircleView.setId(R.id.audio_2_text_btn);
        this.f104657b.setIcon(R.drawable.kb_ic_svg_audio_2_text);
        this.f104657b.setRadius(C57582a.m223601a(context, 65.0f));
        this.f104657b.mo147862a(UIUtils.getColor(context, R.color.ud_T400), UIUtils.getColor(context, R.color.ud_T500));
        this.f104657b.setOnTouchListener(m162882b(context));
        addView(this.f104657b, C41040d.m162714a(210.0f, 210.0f, 13));
        TextView textView = new TextView(context);
        this.f104656a = textView;
        textView.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        this.f104656a.setTextSize(14.0f);
        this.f104656a.setText(R.string.Lark_Chat_AudioToTextTips);
        $$Lambda$AudioPanelTextView$ens6WfId2JK6MIOLVQW0vfVhl8 r0 = new View.OnClickListener(context) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioPanelTextView$ens6WfId2JK6MIOLVQW0vfVhl8 */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AudioPanelTextView.m270681lambda$ens6WfId2JK6MIOLVQW0vfVhl8(AudioPanelTextView.this, this.f$1, view);
            }
        };
        this.f104656a.setOnClickListener(r0);
        addView(this.f104656a, C41040d.m162713a(-2.0f, -2.0f, BitmapDescriptorFactory.HUE_RED, 18.0f, BitmapDescriptorFactory.HUE_RED, -28.5f, 14, 2, R.id.audio_2_text_btn));
        this.f104658c = new TextView(context);
        setLanguageOption(!C41039c.m162705a().equals("zh_ch"));
        this.f104658c.setGravity(17);
        this.f104658c.setCompoundDrawablePadding(C57582a.m223601a(context, 5.0f));
        this.f104658c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, UIUtils.getDrawable(context, R.drawable.kb_ic_audio_menu_arrow), (Drawable) null);
        this.f104658c.setTextColor(C57582a.m223616d(context, R.color.text_title));
        this.f104658c.setTextSize(16.0f);
        this.f104658c.setTypeface(null, 1);
        this.f104658c.setOnClickListener(r0);
        addView(this.f104658c, C41040d.m162713a(-2.0f, -2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -6.5f, 14, 2, R.id.audio_2_text_btn));
    }

    /* renamed from: b */
    public void mo148120b(boolean z) {
        int i;
        if (this.f104664i == null) {
            Audio2TextPanel audio2TextPanel = new Audio2TextPanel(getContext());
            this.f104664i = audio2TextPanel;
            audio2TextPanel.setDelegate(new Audio2TextPanel.AbstractC41062a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.C410762 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel.AbstractC41062a
                /* renamed from: c */
                public void mo148054c() {
                    AudioPanelTextView.this.f104659d = true;
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel.AbstractC41062a
                /* renamed from: d */
                public void mo148055d() {
                    AudioPanelTextView.this.f104659d = false;
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel.AbstractC41062a
                /* renamed from: b */
                public void mo148053b() {
                    if (AudioPanelTextView.this.f104660e != null) {
                        AudioPanelTextView.this.f104660e.mo147988b();
                    }
                    AudioPanelTextView.this.mo148120b(false);
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.Audio2TextPanel.AbstractC41062a
                /* renamed from: a */
                public void mo148052a() {
                    if (AudioPanelTextView.this.f104660e != null) {
                        AudioPanelTextView.this.f104660e.mo147987a();
                    }
                    if (AudioPanelTextView.this.f104660e != null) {
                        AudioPanelTextView.this.f104660e.mo147988b();
                    }
                    AudioPanelTextView.this.mo148120b(false);
                }
            });
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f104664i, -1, -2);
            this.f104663h = basePopupWindow;
            basePopupWindow.setOutsideTouchable(true);
        }
        if (z && !this.f104663h.isShowing()) {
            int[] iArr = new int[2];
            this.f104657b.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            int measuredHeight = ((iArr2[1] + getMeasuredHeight()) - iArr[1]) - this.f104657b.getMeasuredHeight();
            int keyboardHeight = getKeyboardHeight();
            this.f104664i.mo148044a(keyboardHeight, 0);
            Audio2TextPanel audio2TextPanel2 = this.f104664i;
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104665j;
            if (bVar != null) {
                i = bVar.mo147366C();
            } else {
                i = 0;
            }
            audio2TextPanel2.setDividerMargin(i);
            this.f104664i.setCircleBottomMargin(measuredHeight);
            this.f104664i.setAudioAmplitude(0);
            this.f104664i.setActionBtnVisibility(false);
            this.f104664i.setAudioRecorderListener(this.f104661f);
            this.f104663h.setHeight(keyboardHeight);
            this.f104662g.vibrate(100);
            this.f104663h.showAtLocation(this.f104657b, 8388691, 0, 0);
        } else if (!z) {
            this.f104663h.dismiss();
        }
    }

    public AudioPanelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162881a(Context context, View view) {
        C41035a.m162694a(context, new C41035a.AbstractC41036a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$Trznxi2CjR6lIBeg4zEcCCdZARE */

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a.AbstractC41036a
            public final void onOptionSelected(int i) {
                AudioPanelTextView.this.setLanguageOption(i);
            }
        }, false);
    }

    /* renamed from: a */
    public void mo148117a(double d, boolean z) {
        if (this.f104659d || z) {
            double min = Math.min(1100.0d, Math.max(0.0d, d - 100.0d));
            Audio2TextPanel audio2TextPanel = this.f104664i;
            if (audio2TextPanel != null) {
                audio2TextPanel.setAudioAmplitude((int) ((min / 1100.0d) * 100.0d));
            }
        }
    }

    public AudioPanelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162880a(context);
        if (this.f104662g == null) {
            this.f104662g = (Vibrator) getContext().getSystemService("vibrator");
        }
    }
}
