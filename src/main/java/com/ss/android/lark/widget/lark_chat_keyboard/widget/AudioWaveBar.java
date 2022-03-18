package com.ss.android.lark.widget.lark_chat_keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;

public class AudioWaveBar extends LinearLayout {

    /* renamed from: a */
    private int f144017a;
    @BindView(5818)
    TextView mDurationTv;
    @BindView(6442)
    AudioWaveView mWaveView;

    public AudioWaveBar(Context context) {
        this(context, null);
    }

    public void setDurationText(String str) {
        this.mDurationTv.setText(str);
    }

    public void setProgress(int i) {
        this.f144017a = i;
        this.mWaveView.setProgress(i);
    }

    public void setWaveBytes(byte[] bArr) {
        this.mWaveView.setWaveformBytes(bArr);
    }

    public AudioWaveBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioWaveBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.audio_wave_bar_layout, (ViewGroup) this, true);
        ButterKnife.bind(this);
    }
}
