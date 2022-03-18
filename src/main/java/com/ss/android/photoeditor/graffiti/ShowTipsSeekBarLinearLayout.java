package com.ss.android.photoeditor.graffiti;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.p3010b.C59613d;

public class ShowTipsSeekBarLinearLayout extends LinearLayout {

    /* renamed from: a */
    public TextView f148252a;

    /* renamed from: b */
    private AppCompatSeekBar f148253b;

    /* renamed from: a */
    private void m231593a() {
        inflate(getContext(), R.layout.view_photo_editor_graffiti_showtips_seekbar, this);
        this.f148252a = (TextView) findViewById(R.id.tv_tips);
        this.f148253b = (AppCompatSeekBar) findViewById(R.id.seek_bar_paint_size);
    }

    public ShowTipsSeekBarLinearLayout(Context context) {
        super(context);
        m231593a();
    }

    public void setProgress(int i) {
        this.f148253b.setProgress(i);
    }

    public void setOnSeekBarChangeListener(final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f148253b.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.photoeditor.graffiti.ShowTipsSeekBarLinearLayout.C597171 */

            public void onStartTrackingTouch(SeekBar seekBar) {
                ShowTipsSeekBarLinearLayout.this.f148252a.setVisibility(0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = onSeekBarChangeListener;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                ShowTipsSeekBarLinearLayout.this.invalidate();
                ShowTipsSeekBarLinearLayout.this.f148252a.setVisibility(4);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = onSeekBarChangeListener;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                int i2 = i - 50;
                String valueOf = String.valueOf(i2);
                if (i2 > 0) {
                    valueOf = "+" + valueOf;
                }
                ShowTipsSeekBarLinearLayout.this.f148252a.setText(valueOf);
                ShowTipsSeekBarLinearLayout.this.mo203332a(i);
                ShowTipsSeekBarLinearLayout.this.invalidate();
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = onSeekBarChangeListener;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo203332a(int i) {
        float paddingLeft = (float) this.f148253b.getPaddingLeft();
        float left = ((((float) this.f148253b.getLeft()) + paddingLeft) + (((((float) this.f148253b.getWidth()) - (paddingLeft * 2.0f)) / 100.0f) * ((float) i))) - (((float) this.f148252a.getWidth()) / 2.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f148252a.getLayoutParams();
        layoutParams.leftMargin = (int) left;
        layoutParams.topMargin = (int) ((float) ((this.f148253b.getTop() - this.f148252a.getHeight()) - C59613d.m231216a(4)));
        this.f148252a.setLayoutParams(layoutParams);
    }

    public ShowTipsSeekBarLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m231593a();
    }

    public ShowTipsSeekBarLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m231593a();
    }
}
