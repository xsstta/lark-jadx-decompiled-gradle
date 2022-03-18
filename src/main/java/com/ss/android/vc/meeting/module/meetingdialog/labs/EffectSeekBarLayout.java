package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.widget.LabsSeekBar;

public class EffectSeekBarLayout extends FrameLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private TextView f156280a;

    /* renamed from: b */
    private LinearLayout f156281b;

    /* renamed from: c */
    private LabsSeekBar f156282c;

    /* renamed from: d */
    private SeekBar.OnSeekBarChangeListener f156283d;

    /* renamed from: e */
    private int f156284e = -1;

    public void requestLayout() {
        super.requestLayout();
    }

    /* renamed from: a */
    private void m242887a() {
        LayoutInflater.from(getContext()).inflate(R.layout.labs_beautify_seek_bar, (ViewGroup) this, true);
        this.f156280a = (TextView) findViewById(R.id.seek_indicator);
        this.f156281b = (LinearLayout) findViewById(R.id.seek_indicator_container);
        LabsSeekBar labsSeekBar = (LabsSeekBar) findViewById(R.id.beautify_seek);
        this.f156282c = labsSeekBar;
        labsSeekBar.setOnSeekBarChangeListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m242889b() {
        int i;
        int progress = this.f156282c.getProgress();
        float width = (((float) ((this.f156282c.getWidth() - this.f156282c.getPaddingLeft()) - this.f156282c.getPaddingRight())) / ((float) this.f156282c.getMax())) * ((float) progress);
        if (progress == this.f156282c.getMax()) {
            i = UIHelper.dp2px(4.0f);
        } else {
            i = 0;
        }
        if (this.f156281b.getWidth() > 0) {
            LinearLayout linearLayout = this.f156281b;
            linearLayout.setTranslationX((width + (((float) (-linearLayout.getWidth())) / 2.0f)) - ((float) i));
            TextView textView = this.f156280a;
            textView.setText("" + progress);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f156283d = onSeekBarChangeListener;
    }

    public void setEnable(boolean z) {
        this.f156282c.setEnabled(z);
    }

    public EffectSeekBarLayout(Context context) {
        super(context);
        m242887a();
    }

    /* renamed from: a */
    private void m242888a(boolean z) {
        int i;
        LinearLayout linearLayout = this.f156281b;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C60700b.m235851b("EffectSeekBarLayout", "[onStartTrackingTouch]", "onStartTrackingTouch");
        m242888a(true);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f156283d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C60700b.m235851b("EffectSeekBarLayout", "[onStopTrackingTouch]", "onStopTrackingTouch");
        m242888a(false);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f156283d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public EffectSeekBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242887a();
    }

    public EffectSeekBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242887a();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C60700b.m235851b("EffectSeekBarLayout", "[onProgressChanged]", "[progress]" + i + "  [fromUser]" + z);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f156283d;
        if (!(onSeekBarChangeListener == null || i == this.f156284e)) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
        m242889b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo215181a(String str, int i, int i2, int i3, int i4) {
        C60700b.m235851b("EffectSeekBarLayout", "[updateValues]", str + ", min:" + i + ", max:" + i2 + ", default:" + i3 + ", progress:" + i4);
        LabsSeekBar labsSeekBar = this.f156282c;
        if (labsSeekBar != null) {
            labsSeekBar.setMin(i);
            this.f156282c.setMax(i2);
            this.f156282c.setDefault(i3);
            this.f156282c.setProgress(i4);
            this.f156282c.post(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$EffectSeekBarLayout$h0c6ZNPLO4bAxSVlQ7gk0olqw50 */

                public final void run() {
                    EffectSeekBarLayout.lambda$h0c6ZNPLO4bAxSVlQ7gk0olqw50(EffectSeekBarLayout.this);
                }
            });
            this.f156282c.invalidate();
        }
    }
}
