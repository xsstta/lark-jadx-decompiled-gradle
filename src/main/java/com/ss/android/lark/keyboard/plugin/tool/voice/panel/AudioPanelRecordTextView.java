package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
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
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41040d;
import com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup;
import com.ss.android.lark.ui.p2892a.C57582a;

public class AudioPanelRecordTextView extends RelativeLayout {

    /* renamed from: a */
    public TextView f104620a;

    /* renamed from: b */
    public TextView f104621b;

    /* renamed from: c */
    public AudioCircleView f104622c;

    /* renamed from: d */
    public AbstractC41071a f104623d;

    /* renamed from: e */
    public C41026a f104624e;

    /* renamed from: f */
    public boolean f104625f;

    /* renamed from: g */
    private Vibrator f104626g;

    /* renamed from: h */
    private IAudioPopup f104627h;

    /* renamed from: i */
    private AudioWithTextPanel f104628i;

    /* renamed from: j */
    private IKeyBoardPlugin.IKeyBoardContext f104629j;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView$a */
    public interface AbstractC41071a {
        /* renamed from: a */
        void mo147981a();

        /* renamed from: b */
        void mo147982b();

        /* renamed from: c */
        void mo147983c();

        /* renamed from: d */
        void mo147984d();

        /* renamed from: e */
        void mo147985e();

        /* renamed from: f */
        void mo147986f();
    }

    public int getKeyboardHeight() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104629j;
        if (bVar != null) {
            return bVar.mo147367D();
        }
        return 0;
    }

    public RichTextEmojiconEditText getMsgEditText() {
        AudioWithTextPanel audioWithTextPanel = this.f104628i;
        if (audioWithTextPanel != null) {
            return audioWithTextPanel.getMsgEditText();
        }
        return null;
    }

    /* renamed from: a */
    public void mo148087a() {
        IAudioPopup cVar = this.f104627h;
        if (cVar != null && cVar.mo147922a()) {
            this.f104627h.mo147923b();
        }
    }

    /* renamed from: b */
    public boolean mo148092b() {
        IAudioPopup cVar = this.f104627h;
        if (cVar == null || !cVar.mo147922a() || !this.f104627h.mo147924c()) {
            return false;
        }
        return true;
    }

    public void setAudioRecorderListener(C41026a aVar) {
        this.f104624e = aVar;
    }

    public void setDelegate(AbstractC41071a aVar) {
        this.f104623d = aVar;
    }

    public void setKeyboardContext(IKeyBoardPlugin.IKeyBoardContext bVar) {
        this.f104629j = bVar;
    }

    public AudioPanelRecordTextView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View.OnTouchListener m162847b(Context context) {
        return new View.OnTouchListener(context) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.View$OnTouchListenerC410671 */

            /* renamed from: a */
            public boolean f104630a;

            /* renamed from: b */
            final /* synthetic */ Context f104631b;

            /* renamed from: d */
            private float f104633d;

            /* renamed from: e */
            private float f104634e;

            /* renamed from: f */
            private float f104635f;

            /* renamed from: g */
            private Runnable f104636g = new Runnable() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.View$OnTouchListenerC410671.RunnableC410681 */

                public void run() {
                    AudioPanelRecordTextView.this.f104625f = true;
                    AudioPanelRecordTextView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    AudioPanelRecordTextView.this.setAudioPanelEnable(true);
                    AudioPanelRecordTextView.this.mo148090a(true);
                    C41037b.m162698a(AudioPanelRecordTextView.this.getContext()).mo147954a();
                    AudioPanelRecordTextView.this.f104624e.mo147908a(true, false);
                }
            };

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m162857a() {
                AudioPanelRecordTextView.this.mo148090a(false);
                AudioPanelRecordTextView.this.mo148088a(0.0d, true);
            }

            {
                this.f104631b = r2;
                this.f104633d = (float) UIUtils.dp2px(r2, 10.0f);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
                if (r2 != 3) goto L_0x00cb;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                /*
                // Method dump skipped, instructions count: 273
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.View$OnTouchListenerC410671.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
    }

    public void setAudioAmplitude(double d) {
        mo148088a(d, false);
    }

    public void setAudioPanelEnable(boolean z) {
        AudioWithTextPanel audioWithTextPanel = this.f104628i;
        if (audioWithTextPanel != null) {
            audioWithTextPanel.setEnabled(z);
        }
    }

    /* renamed from: d */
    public void mo148094d(boolean z) {
        IAudioPopup cVar = this.f104627h;
        if (cVar != null && cVar.mo147922a()) {
            m162848e(z);
        }
    }

    public void setAudioDuration(int i) {
        IAudioPopup cVar = this.f104627h;
        if (cVar != null && this.f104628i != null && cVar.mo147922a()) {
            this.f104628i.setAudioDuration(i);
        }
    }

    public void setLanguageOption(int i) {
        TextView textView = this.f104621b;
        if (textView != null) {
            textView.setText(getResources().getStringArray(R.array.audio2text_option_array)[i]);
        }
    }

    /* renamed from: a */
    public void mo148090a(boolean z) {
        if (z) {
            mo148091b(true);
            return;
        }
        AudioWithTextPanel audioWithTextPanel = this.f104628i;
        if (audioWithTextPanel != null) {
            audioWithTextPanel.mo148155d();
        }
    }

    /* renamed from: c */
    public void m162848e(boolean z) {
        int i;
        AudioWithTextPanel audioWithTextPanel = this.f104628i;
        if (audioWithTextPanel == null) {
            return;
        }
        if (audioWithTextPanel.isInLayout()) {
            this.f104628i.post(new Runnable(z) {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioPanelRecordTextView$AinUv_IzUogkjqiFdsfPqpzq0_8 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AudioPanelRecordTextView.lambda$AinUv_IzUogkjqiFdsfPqpzq0_8(AudioPanelRecordTextView.this, this.f$1);
                }
            });
            return;
        }
        if (z) {
            AudioWithTextPanel audioWithTextPanel2 = this.f104628i;
            audioWithTextPanel2.setTag(Integer.valueOf(audioWithTextPanel2.getBackgroundHeight()));
            if (VoiceKBPlugin.f104495h.mo147974a()) {
                i = 210;
            } else {
                i = 178;
            }
            this.f104628i.mo148148a(UIUtils.dp2px(getContext(), (float) i) / 2, 0);
        } else {
            AudioWithTextPanel audioWithTextPanel3 = this.f104628i;
            audioWithTextPanel3.mo148148a(((Integer) audioWithTextPanel3.getTag()).intValue(), 0);
        }
        this.f104628i.mo148150a(z);
    }

    /* renamed from: a */
    private void m162845a(Context context) {
        AudioCircleView audioCircleView = new AudioCircleView(context);
        this.f104622c = audioCircleView;
        audioCircleView.setId(R.id.audio_2_text_btn);
        this.f104622c.setIcon(R.drawable.kb_ic_svg_audio_with_text);
        this.f104622c.setRadius(C57582a.m223601a(context, 65.0f));
        this.f104622c.mo147862a(UIUtils.getColor(context, R.color.function_info_400), UIUtils.getColor(context, R.color.function_info_500));
        this.f104622c.setOnTouchListener(m162847b(context));
        addView(this.f104622c, C41040d.m162714a(210.0f, 210.0f, 13));
        TextView textView = new TextView(context);
        this.f104620a = textView;
        textView.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        this.f104620a.setTextSize(14.0f);
        this.f104620a.setText(R.string.Lark_Chat_AudioToTextTips);
        $$Lambda$AudioPanelRecordTextView$0I6MwIjlMM1aYI7IDUgm9UDx7h4 r0 = new View.OnClickListener(context) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioPanelRecordTextView$0I6MwIjlMM1aYI7IDUgm9UDx7h4 */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                AudioPanelRecordTextView.lambda$0I6MwIjlMM1aYI7IDUgm9UDx7h4(AudioPanelRecordTextView.this, this.f$1, view);
            }
        };
        this.f104620a.setOnClickListener(r0);
        addView(this.f104620a, C41040d.m162713a(-2.0f, -2.0f, BitmapDescriptorFactory.HUE_RED, 18.0f, BitmapDescriptorFactory.HUE_RED, -28.5f, 14, 2, R.id.audio_2_text_btn));
        this.f104621b = new TextView(context);
        setLanguageOption(!C41039c.m162705a().equals("zh_ch"));
        this.f104621b.setGravity(17);
        this.f104621b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, UIUtils.getDrawable(context, R.drawable.kb_ic_audio_menu_arrow), (Drawable) null);
        this.f104621b.setCompoundDrawablePadding(C57582a.m223601a(context, 5.0f));
        this.f104621b.setTextColor(C57582a.m223616d(context, R.color.text_title));
        this.f104621b.setTextSize(16.0f);
        this.f104621b.setTypeface(null, 1);
        this.f104621b.setOnClickListener(r0);
        addView(this.f104621b, C41040d.m162713a(-2.0f, -2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -6.5f, 14, 2, R.id.audio_2_text_btn));
    }

    /* renamed from: b */
    public void mo148091b(boolean z) {
        if (this.f104628i == null) {
            AudioWithTextPanel audioWithTextPanel = new AudioWithTextPanel(getContext());
            this.f104628i = audioWithTextPanel;
            audioWithTextPanel.setMode(0);
            this.f104628i.setDelegate(new AbstractC41071a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.C410702 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: a */
                public void mo147981a() {
                    AudioPanelRecordTextView.this.f104623d.mo147981a();
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: e */
                public void mo147985e() {
                    AudioPanelRecordTextView.this.f104623d.mo147985e();
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: f */
                public void mo147986f() {
                    AudioPanelRecordTextView.this.f104623d.mo147986f();
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: b */
                public void mo147982b() {
                    AudioPanelRecordTextView.this.f104623d.mo147982b();
                    AudioPanelRecordTextView.this.mo148091b(false);
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: c */
                public void mo147983c() {
                    AudioPanelRecordTextView.this.f104623d.mo147983c();
                    AudioPanelRecordTextView.this.mo148091b(false);
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
                /* renamed from: d */
                public void mo147984d() {
                    AudioPanelRecordTextView.this.f104623d.mo147984d();
                    AudioPanelRecordTextView.this.mo148091b(false);
                }
            });
            IAudioPopup a = IAudioPopup.f104478a.mo147935a(this.f104628i);
            this.f104627h = a;
            BasePopupWindow d = a.mo147925d();
            if (d != null) {
                d.setOutsideTouchable(false);
                d.setFocusable(true);
                d.setInputMethodMode(1);
                d.setSoftInputMode(16);
            }
        }
        if (z && !this.f104627h.mo147922a()) {
            int[] iArr = new int[2];
            this.f104622c.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            int measuredHeight = ((iArr2[1] + getMeasuredHeight()) - iArr[1]) - this.f104622c.getMeasuredHeight();
            this.f104628i.mo148148a(getKeyboardHeight(), 0);
            this.f104628i.setCircleBottomMargin(measuredHeight);
            this.f104628i.setAudioAmplitude(0);
            this.f104628i.setActionBtnVisibility(false);
            this.f104628i.mo148147a();
            this.f104628i.setAudioRecorderListener(this.f104624e);
            this.f104626g.vibrate(100);
            this.f104627h.mo147921a(this.f104622c, 8388691, 0, 0);
        } else if (!z) {
            this.f104627h.mo147923b();
            this.f104628i.mo148153c();
        }
    }

    public AudioPanelRecordTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162846a(Context context, View view) {
        C41035a.m162694a(context, new C41035a.AbstractC41036a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$mrgm__xJTJdE5pTZI195D9wvhQ0 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a.AbstractC41036a
            public final void onOptionSelected(int i) {
                AudioPanelRecordTextView.this.setLanguageOption(i);
            }
        }, true);
    }

    /* renamed from: a */
    public void mo148088a(double d, boolean z) {
        if (this.f104625f || z) {
            double min = Math.min(1100.0d, Math.max(0.0d, d - 100.0d));
            AudioWithTextPanel audioWithTextPanel = this.f104628i;
            if (audioWithTextPanel != null) {
                audioWithTextPanel.setAudioAmplitude((int) ((min / 1100.0d) * 100.0d));
            }
        }
    }

    /* renamed from: a */
    public void mo148089a(String str, boolean z, boolean z2) {
        AudioWithTextPanel audioWithTextPanel = this.f104628i;
        if (audioWithTextPanel != null) {
            audioWithTextPanel.mo148149a(str, z, z2);
        }
    }

    public AudioPanelRecordTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162845a(context);
        if (this.f104626g == null) {
            this.f104626g = (Vibrator) getContext().getSystemService("vibrator");
        }
    }
}
