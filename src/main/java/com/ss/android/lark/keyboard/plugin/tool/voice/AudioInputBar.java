package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;

public class AudioInputBar extends RelativeLayout {
    @BindView(6213)
    public TextView mAudioCountDownTV;
    @BindView(6214)
    public TextView mAudioDurationTV;
    @BindView(6215)
    public TextView mAudioHintTV;
    @BindView(6216)
    public ImageView mAudioIconIV;
    @BindView(6221)
    public AudioWaveLineView mAudioWaveView;
    @BindView(6929)
    public View mRootView;

    /* renamed from: a */
    public void mo147878a() {
        this.mAudioDurationTV.setVisibility(0);
        this.mAudioCountDownTV.setVisibility(8);
    }

    public AudioInputBar(Context context) {
        this(context, null);
    }

    public void setAudioAmplitude(double d) {
        this.mAudioWaveView.setVolume(d);
    }

    public void setDuration(String str) {
        this.mAudioDurationTV.setText(str);
    }

    public void setHint(String str) {
        this.mAudioHintTV.setText(str);
    }

    public void setCountDown(String str) {
        this.mAudioCountDownTV.setVisibility(0);
        this.mAudioCountDownTV.setText(str);
    }

    /* renamed from: a */
    public void mo147879a(boolean z) {
        if (z) {
            this.mAudioWaveView.mo147898b();
        } else {
            this.mAudioWaveView.mo147899c();
        }
    }

    public void setCancelState(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.mRootView;
        if (z) {
            i = R.drawable.kb_audio_input_bar_red_bg;
        } else {
            i = R.drawable.kb_audio_input_bar_blue_bg;
        }
        view.setBackgroundResource(i);
        ImageView imageView = this.mAudioIconIV;
        if (z) {
            i2 = R.drawable.kb_ic_svg_audio_input_cancel;
        } else {
            i2 = R.drawable.kb_ic_svg_audio_input_normal;
        }
        imageView.setImageResource(i2);
        TextView textView = this.mAudioHintTV;
        Resources resources = getResources();
        if (z) {
            i3 = R.color.function_danger_200;
        } else {
            i3 = R.color.ud_W200;
        }
        textView.setTextColor(resources.getColor(i3));
        TextView textView2 = this.mAudioHintTV;
        if (z) {
            i4 = R.string.Lark_Chat_RecordAudioCancel;
        } else {
            i4 = R.string.Lark_Chat_RecordAudioSlideUp;
        }
        textView2.setText(i4);
    }

    public AudioInputBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioInputBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.kb_audio_input_bar_layout, (ViewGroup) this, true);
        ButterKnife.bind(this);
    }
}
