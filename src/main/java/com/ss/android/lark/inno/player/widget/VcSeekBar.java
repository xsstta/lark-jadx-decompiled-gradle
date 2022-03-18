package com.ss.android.lark.inno.player.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.ss.android.lark.inno.player.widget.VcSeekBar;

public class VcSeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    public boolean f100329a;

    /* renamed from: b */
    public Handler f100330b = new Handler(Looper.getMainLooper());

    public VcSeekBar(Context context) {
        super(context);
    }

    public void setOnSeekBarChangeListener(final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        super.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.lark.inno.player.widget.VcSeekBar.C390781 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m154305a() {
                VcSeekBar.this.f100329a = false;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                VcSeekBar.this.f100330b.removeCallbacksAndMessages(null);
                VcSeekBar.this.f100329a = true;
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                VcSeekBar.this.f100330b.removeCallbacksAndMessages(null);
                VcSeekBar.this.f100330b.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.inno.player.widget.$$Lambda$VcSeekBar$1$ohrELqlr7H2GegeFjQoOPLK_9k */

                    public final void run() {
                        VcSeekBar.C390781.this.m154305a();
                    }
                }, 500);
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        });
    }

    public VcSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VcSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
