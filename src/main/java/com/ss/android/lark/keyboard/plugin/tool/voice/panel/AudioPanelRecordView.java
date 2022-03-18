package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.content.Context;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.AudioCircleView;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41040d;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2;
import com.ss.android.lark.ui.p2892a.C57582a;

public class AudioPanelRecordView extends RelativeLayout {

    /* renamed from: a */
    public TextView f104640a;

    /* renamed from: b */
    public AudioCircleView f104641b;

    /* renamed from: c */
    public AudioInputPanel2 f104642c;

    /* renamed from: d */
    public C41026a f104643d;

    /* renamed from: e */
    private PopupWindow f104644e;

    /* renamed from: f */
    private Vibrator f104645f;

    /* renamed from: g */
    private IKeyBoardPlugin.IKeyBoardContext f104646g;

    /* renamed from: a */
    public void mo148106a() {
        PopupWindow popupWindow = this.f104644e;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f104644e.dismiss();
        }
    }

    public int getKeyboardHeight() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104646g;
        if (bVar != null) {
            return bVar.mo147368E() + this.f104646g.mo147366C() + this.f104646g.mo147367D();
        }
        return 0;
    }

    public void setAudioRecorderListener(C41026a aVar) {
        this.f104643d = aVar;
    }

    public void setKeyboardContext(IKeyBoardPlugin.IKeyBoardContext bVar) {
        this.f104646g = bVar;
    }

    public AudioPanelRecordView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View.OnTouchListener m162871b(Context context) {
        return new View.OnTouchListener(context) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordView.View$OnTouchListenerC410721 */

            /* renamed from: a */
            final /* synthetic */ Context f104647a;

            /* renamed from: c */
            private float f104649c;

            /* renamed from: d */
            private boolean f104650d;

            /* renamed from: e */
            private boolean f104651e;

            /* renamed from: f */
            private float f104652f;

            /* renamed from: g */
            private float f104653g;

            /* renamed from: h */
            private Runnable f104654h;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m162874a() {
                AudioPanelRecordView.this.mo148107a(false);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m162876a(boolean z) {
                this.f104650d = z;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m162875a(MotionEvent motionEvent) {
                this.f104651e = true;
                AudioPanelRecordView.this.getParent().requestDisallowInterceptTouchEvent(true);
                AudioPanelRecordView.this.setAudioPanelEnable(true);
                AudioPanelRecordView.this.mo148107a(true);
                motionEvent.setAction(0);
                AudioPanelRecordView.this.f104642c.onTouchEvent(motionEvent);
            }

            {
                this.f104647a = r2;
                this.f104649c = (float) UIUtils.dp2px(r2, 10.0f);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
                if (r5 != 3) goto L_0x0066;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
                /*
                // Method dump skipped, instructions count: 208
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordView.View$OnTouchListenerC410721.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
    }

    public void setAudioPanelEnable(boolean z) {
        AudioInputPanel2 audioInputPanel2 = this.f104642c;
        if (audioInputPanel2 != null) {
            audioInputPanel2.setEnabled(z);
        }
    }

    public void setAudioAmplitude(double d) {
        PopupWindow popupWindow = this.f104644e;
        if (popupWindow != null && this.f104642c != null && popupWindow.isShowing()) {
            this.f104642c.setAudioAmplitude(d);
        }
    }

    public void setAudioCountDown(String str) {
        PopupWindow popupWindow = this.f104644e;
        if (popupWindow != null && this.f104642c != null && popupWindow.isShowing()) {
            this.f104642c.setAudioCountDown(str);
        }
    }

    public void setAudioDuration(int i) {
        PopupWindow popupWindow = this.f104644e;
        if (popupWindow != null && this.f104642c != null && popupWindow.isShowing()) {
            this.f104642c.setAudioDuration(i);
        }
    }

    /* renamed from: a */
    private void m162870a(Context context) {
        AudioCircleView audioCircleView = new AudioCircleView(context);
        this.f104641b = audioCircleView;
        audioCircleView.setId(R.id.record_btn);
        this.f104641b.setRadius(C57582a.m223601a(context, 65.0f));
        this.f104641b.setOnTouchListener(m162871b(context));
        addView(this.f104641b, C41040d.m162714a(130.0f, 130.0f, 13));
        TextView textView = new TextView(context);
        this.f104640a = textView;
        textView.setId(R.id.record_hint_text);
        this.f104640a.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        this.f104640a.setTextSize(14.0f);
        this.f104640a.setText(R.string.Lark_Chat_HoldToRecordAudio);
        addView(this.f104640a, C41040d.m162713a(-2.0f, -2.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15.0f, 14, 2, R.id.record_btn));
        setState(false);
    }

    private void setState(boolean z) {
        if (!z) {
            this.f104640a.setText(R.string.Lark_Chat_HoldToRecordAudio);
            this.f104641b.mo147862a(UIUtils.getColor(getContext(), R.color.ud_W400), UIUtils.getColor(getContext(), R.color.ud_W500));
            return;
        }
        this.f104640a.setText(R.string.Lark_Chat_HoldToRecordAudio);
        this.f104641b.mo147862a(UIUtils.getColor(getContext(), R.color.function_danger_400), UIUtils.getColor(getContext(), R.color.function_danger_500));
    }

    /* renamed from: a */
    public void mo148107a(boolean z) {
        if (this.f104642c == null) {
            AudioInputPanel2 audioInputPanel2 = new AudioInputPanel2(getContext());
            this.f104642c = audioInputPanel2;
            audioInputPanel2.setInputBarMargin(C57582a.m223601a(getContext(), 63.0f));
            this.f104642c.setDelegate(new AudioInputPanel2.AbstractC41066a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordView.C410732 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
                /* renamed from: a */
                public void mo147989a() {
                    C41037b.m162698a(AudioPanelRecordView.this.getContext()).mo147954a();
                    AudioPanelRecordView.this.f104643d.mo147908a(false, false);
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
                /* renamed from: b */
                public void mo147990b() {
                    AudioPanelRecordView.this.f104643d.mo147910c();
                    HitPointHelper.f103322b.mo146886d();
                    C41037b.m162698a(AudioPanelRecordView.this.getContext()).mo147957b();
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
                /* renamed from: c */
                public void mo147991c() {
                    AudioPanelRecordView.this.f104643d.mo147909b();
                    C41037b.m162698a(AudioPanelRecordView.this.getContext()).mo147957b();
                }
            });
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f104642c, -1, -2);
            this.f104644e = basePopupWindow;
            basePopupWindow.setOutsideTouchable(false);
        }
        if (z && !this.f104644e.isShowing()) {
            int[] iArr = new int[2];
            this.f104641b.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            getLocationOnScreen(iArr2);
            this.f104642c.mo148073a(C57582a.m223601a(getContext(), 130.0f), ((iArr2[1] + getMeasuredHeight()) - iArr[1]) - this.f104641b.getMeasuredHeight());
            this.f104642c.mo148074b(getKeyboardHeight(), 0);
            if (this.f104645f == null) {
                this.f104645f = (Vibrator) getContext().getSystemService("vibrator");
            }
            this.f104645f.vibrate(100);
            this.f104644e.showAtLocation(this.f104641b, 8388691, 0, 0);
            HitPointHelper.f103322b.mo146876a("audio_menu");
        } else if (!z) {
            this.f104644e.dismiss();
        }
    }

    public AudioPanelRecordView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioPanelRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162870a(context);
    }
}
