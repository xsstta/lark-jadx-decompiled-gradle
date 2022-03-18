package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;

public class BeautifySeekBar extends RelativeLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private TextView f156274a;

    /* renamed from: b */
    private LinearLayout f156275b;

    /* renamed from: c */
    private SeekBar f156276c;

    /* renamed from: d */
    private SeekBar.OnSeekBarChangeListener f156277d;

    /* renamed from: e */
    private int f156278e = -1;

    /* renamed from: f */
    private int f156279f = (m242883a(getResources(), R.integer.vc_labs_beautify_seek_bar_max_val) / 100);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m242886c() {
        int a = m242882a(this.f156276c.getProgress());
        this.f156275b.setTranslationX((float) ((((((this.f156276c.getWidth() - this.f156276c.getPaddingLeft()) - this.f156276c.getPaddingRight()) + (this.f156276c.getThumbOffset() * 2)) - this.f156276c.getThumb().getBounds().width()) * this.f156276c.getProgress()) / this.f156276c.getMax()));
        TextView textView = this.f156274a;
        textView.setText("" + a);
    }

    /* renamed from: a */
    private void m242884a() {
        LayoutInflater.from(getContext()).inflate(R.layout.labs_beautify_seek_bar, (ViewGroup) this, true);
        this.f156274a = (TextView) findViewById(R.id.seek_indicator);
        this.f156275b = (LinearLayout) findViewById(R.id.indicator_container);
        SeekBar seekBar = (SeekBar) findViewById(R.id.beautify_seek);
        this.f156276c = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        this.f156276c.setProgress(0);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$BeautifySeekBar$gpa9DL3z04ybpmBlT1jKjrwyEE */

            public final void onGlobalLayout() {
                BeautifySeekBar.m271293lambda$gpa9DL3z04ybpmBlT1jKjrwyEE(BeautifySeekBar.this);
            }
        });
    }

    public void setSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f156277d = onSeekBarChangeListener;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f156277d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f156277d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public void setEnable(boolean z) {
        this.f156276c.setEnabled(z);
    }

    /* renamed from: a */
    private int m242882a(int i) {
        return Math.round((((float) i) * 1.0f) / ((float) this.f156279f));
    }

    public BeautifySeekBar(Context context) {
        super(context);
        m242884a();
    }

    public BeautifySeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242884a();
    }

    /* renamed from: a */
    public static int m242883a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int a;
        C60700b.m235851b("BeautifySeekBar", "[onProgressChanged]", "[progress]" + i + "  [fromUser]" + z);
        if (!(this.f156277d == null || (a = m242882a(i)) == this.f156278e)) {
            this.f156277d.onProgressChanged(seekBar, a, z);
        }
        m242886c();
    }

    public BeautifySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242884a();
    }
}
