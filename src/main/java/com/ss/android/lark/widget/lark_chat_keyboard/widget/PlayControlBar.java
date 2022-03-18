package com.ss.android.lark.widget.lark_chat_keyboard.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.C58323b;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class PlayControlBar extends LinearLayout implements AbstractC58321a {

    /* renamed from: a */
    public float f144036a;

    /* renamed from: b */
    public AbstractC58473a f144037b;

    /* renamed from: c */
    private final CheckBox f144038c;

    /* renamed from: d */
    private final ProgressBar f144039d;

    /* renamed from: e */
    private final SeekBar f144040e;

    /* renamed from: f */
    private final TextView f144041f;

    /* renamed from: g */
    private int f144042g;

    /* renamed from: h */
    private final float f144043h;

    /* renamed from: i */
    private AbstractC58321a.AbstractC58322a f144044i;

    /* renamed from: com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar$a */
    public interface AbstractC58473a {
        /* renamed from: a */
        void mo122658a();

        /* renamed from: a */
        void mo122659a(int i);

        /* renamed from: b */
        void mo122660b();

        /* renamed from: c */
        void mo122661c();

        /* renamed from: d */
        void mo122662d();
    }

    public AbstractC58473a getDelegate() {
        return this.f144037b;
    }

    public int getDuration() {
        return this.f144042g;
    }

    public AbstractC58321a.AbstractC58322a getListener() {
        return this.f144044i;
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: f */
    public void mo136739f() {
        AbstractC58321a.AbstractC58322a aVar = this.f144044i;
        if (aVar != null) {
            aVar.mo122668a(this);
        }
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public float getProgress() {
        return (float) this.f144040e.getProgress();
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public String getDurationText() {
        return this.f144041f.getText().toString();
    }

    /* renamed from: i */
    private void m226693i() {
        this.f144040e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.C584711 */

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (PlayControlBar.this.f144037b != null) {
                    PlayControlBar.this.f144037b.mo122658a();
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (PlayControlBar.this.f144037b != null) {
                    PlayControlBar.this.f144037b.mo122660b();
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                PlayControlBar.this.f144036a = ((float) i) / 100.0f;
                PlayControlBar playControlBar = PlayControlBar.this;
                playControlBar.setDurationText(playControlBar.f144036a);
                if (PlayControlBar.this.f144037b != null) {
                    PlayControlBar.this.f144037b.mo122659a(i);
                }
            }
        });
        this.f144038c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.C584722 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (PlayControlBar.this.mo197984g()) {
                    LKUIToast.show(PlayControlBar.this.getContext(), (int) R.string.Lark_Message_AudioMessageWithdrawToast);
                } else {
                    PlayControlBar.this.mo197988h();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m226694j() {
        setDurationText(1.0f);
        Log.m165379d("PlayControlBar", "stopPlay:" + this.f144036a);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: a */
    public void mo136734a() {
        Log.m165379d("PlayControlBar", "startPlay");
        this.f144038c.setChecked(true);
        this.f144040e.setHovered(true);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: b */
    public void mo136735b() {
        Log.m165379d("PlayControlBar", "stopPlay");
        this.f144038c.setChecked(false);
        this.f144040e.setHovered(false);
        setProgress(BitmapDescriptorFactory.HUE_RED);
        post(new Runnable() {
            /* class com.ss.android.lark.widget.lark_chat_keyboard.widget.$$Lambda$PlayControlBar$HpwvoPo_xgBEuZGj1Zg4b5udso */

            public final void run() {
                PlayControlBar.this.m226694j();
            }
        });
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: c */
    public void mo136736c() {
        Log.m165379d("PlayControlBar", "pausePlay");
        this.f144038c.setChecked(false);
        this.f144040e.setHovered(false);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: d */
    public void mo136737d() {
        Log.m165379d("PlayControlBar", "resumePlay");
        this.f144038c.setChecked(true);
        this.f144040e.setHovered(true);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: e */
    public void mo136738e() {
        if (mo197984g()) {
            LKUIToast.show(getContext(), (int) R.string.Lark_Message_AudioMessageWithdrawToast);
            return;
        }
        CheckBox checkBox = this.f144038c;
        checkBox.setChecked(!checkBox.isChecked());
        mo197988h();
    }

    /* renamed from: g */
    public boolean mo197984g() {
        CheckBox checkBox = this.f144038c;
        if (checkBox != null) {
            Object tag = checkBox.getTag(R.id.play_btn);
            if (tag instanceof Boolean) {
                return ((Boolean) tag).booleanValue();
            }
            Log.m165383e("PlayControlBar", "mPlayBtn tag class is not same");
        }
        return false;
    }

    /* renamed from: h */
    public void mo197988h() {
        if (this.f144037b == null) {
            return;
        }
        if (this.f144038c.isChecked()) {
            this.f144037b.mo122661c();
        } else {
            this.f144037b.mo122662d();
        }
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setDelegate(AbstractC58473a aVar) {
        this.f144037b = aVar;
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setListener(AbstractC58321a.AbstractC58322a aVar) {
        this.f144044i = aVar;
    }

    public PlayControlBar(Context context) {
        this(context, null);
    }

    public void setDurationTvColor(int i) {
        this.f144041f.setTextColor(i);
    }

    public void setPlayBtnDrawable(Drawable drawable) {
        this.f144038c.setButtonDrawable(drawable);
    }

    public void setDisabled(boolean z) {
        this.f144038c.setTag(R.id.play_btn, Boolean.valueOf(z));
        this.f144040e.setEnabled(!z);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setDuration(int i) {
        Log.m165379d("PlayControlBar", "setDuration:" + i);
        this.f144042g = i;
        setDurationText(1.0f);
    }

    public void setLoadingDrawable(Drawable drawable) {
        Rect bounds = this.f144039d.getIndeterminateDrawable().getBounds();
        this.f144039d.setIndeterminateDrawable(drawable);
        this.f144039d.getIndeterminateDrawable().setBounds(bounds);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f144038c.setOnLongClickListener(onLongClickListener);
        this.f144040e.setOnLongClickListener(onLongClickListener);
        this.f144041f.setOnLongClickListener(onLongClickListener);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setProgress(float f) {
        this.f144036a = f / 1.0f;
        SeekBar seekBar = this.f144040e;
        seekBar.setProgress((int) (((float) seekBar.getMax()) * this.f144036a));
    }

    public void setProgressBarDrawable(Drawable drawable) {
        Rect bounds = this.f144040e.getProgressDrawable().getBounds();
        this.f144040e.setProgressDrawable(drawable);
        this.f144040e.getProgressDrawable().setBounds(bounds);
    }

    public void setThumbDrawable(Drawable drawable) {
        drawable.setBounds(this.f144040e.getThumb().getBounds());
        this.f144040e.setThumb(drawable);
    }

    /* renamed from: a */
    public void mo197983a(boolean z) {
        int i;
        ProgressBar progressBar = this.f144039d;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        progressBar.setVisibility(i);
        CheckBox checkBox = this.f144038c;
        if (z) {
            i2 = 4;
        }
        checkBox.setVisibility(i2);
    }

    public void setDurationText(float f) {
        String str;
        if (f < BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            str = C26279i.m95149a(this.f144042g);
        } else {
            str = C26279i.m95149a((int) (((float) this.f144042g) * this.f144036a));
        }
        this.f144041f.setText(str);
    }

    public PlayControlBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayControlBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PlayControlBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f144036a = 1.0f;
        this.f144043h = 1.0f;
        setOrientation(0);
        setGravity(16);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, C58323b.m226139a(-2, -2, 8388627, 0, 0, 1, 0));
        CheckBox checkBox = new CheckBox(context);
        this.f144038c = checkBox;
        checkBox.setId(R.id.play_btn);
        checkBox.setBackground(null);
        checkBox.setButtonDrawable(R.drawable.ic_play_selector);
        frameLayout.addView(checkBox, C58323b.m226144b(20.0f, 20.0f, 17));
        ProgressBar progressBar = new ProgressBar(context);
        this.f144039d = progressBar;
        progressBar.setId(R.id.loading_progress);
        progressBar.setInterpolator(new AccelerateDecelerateInterpolator());
        progressBar.setIndeterminateDrawable(C57582a.m223614c(context, R.drawable.play_control_loading_bg));
        progressBar.setVisibility(8);
        frameLayout.addView(progressBar, C58323b.m226144b(20.0f, 20.0f, 17));
        SeekBar seekBar = new SeekBar(context, null, 0, R.style.PlayControlSeekBarDefaultStyle);
        this.f144040e = seekBar;
        seekBar.setId(R.id.play_seekbar);
        seekBar.setBackground(null);
        seekBar.setPadding(UIUtils.dp2px(context, 11.0f), 0, UIUtils.dp2px(context, 8.0f), 0);
        seekBar.setProgressDrawable(UIUtils.getDrawable(context, R.drawable.seekbar_progress));
        seekBar.setThumb(UIUtils.getDrawable(context, R.drawable.seekbar_thumb_selector));
        seekBar.setThumbOffset(UIUtils.dp2px(context, 5.0f));
        seekBar.setSplitTrack(false);
        LinearLayout.LayoutParams a = C58323b.m226139a(0, -2, 16, 2, 0, 2, 0);
        a.weight = 1.0f;
        addView(seekBar, a);
        TextView textView = new TextView(context);
        this.f144041f = textView;
        textView.setTextSize(12.0f);
        textView.setTextColor(UIUtils.getColor(context, R.color.imtoken_message_voice_text_time_grey));
        addView(textView, C58323b.m226138a(-2, -2, 16));
        m226693i();
    }
}
