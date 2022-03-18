package com.ss.android.lark.widget.audioview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

public class AudioChatView extends FrameLayout implements AbstractC58321a {

    /* renamed from: a */
    public AbstractC58321a.AbstractC58322a f143476a;

    /* renamed from: b */
    private int f143477b;

    /* renamed from: c */
    private long f143478c;

    /* renamed from: d */
    private AnimationDrawable f143479d;
    @BindView(5940)
    public View mAudioContentView;
    @BindView(5817)
    public TextView mDurationText;
    @BindView(6132)
    public ProgressBar mProgressBar;
    @BindView(6440)
    public ImageView mVoicePlay;

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: c */
    public void mo136736c() {
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: d */
    public void mo136737d() {
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: e */
    public void mo136738e() {
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: f */
    public void mo136739f() {
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public String getDurationText() {
        return null;
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public float getProgress() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setDelegate(PlayControlBar.AbstractC58473a aVar) {
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: a */
    public void mo136734a() {
        this.f143479d.start();
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: b */
    public void mo136735b() {
        this.f143479d.stop();
        this.f143479d.selectDrawable(0);
        setDurationText(this.f143478c);
    }

    /* renamed from: g */
    private void m226122g() {
        LayoutInflater.from(getContext()).inflate(this.f143477b, (ViewGroup) this, true);
        ButterKnife.bind(this);
        this.f143479d = (AnimationDrawable) this.mVoicePlay.getDrawable();
        setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.audioview.AudioChatView.View$OnClickListenerC583191 */

            public void onClick(View view) {
                if (AudioChatView.this.f143476a != null) {
                    AudioChatView.this.f143476a.mo122668a(view);
                }
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.widget.audioview.AudioChatView.View$OnLongClickListenerC583202 */

            public boolean onLongClick(View view) {
                if (AudioChatView.this.f143476a != null) {
                    return AudioChatView.this.f143476a.mo122669b(view);
                }
                return false;
            }
        });
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setListener(AbstractC58321a.AbstractC58322a aVar) {
        this.f143476a = aVar;
    }

    public AudioChatView(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setDuration(int i) {
        long j = (long) i;
        this.f143478c = j;
        setDurationText(j);
    }

    private void setDurationText(long j) {
        this.mDurationText.setText(C26279i.m95150a(j));
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setProgress(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            setDurationText((long) (((float) this.f143478c) * (1.0f - f)));
        } else {
            setDurationText(this.f143478c);
        }
    }

    public AudioChatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m226121a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout});
            this.f143477b = obtainStyledAttributes.getResourceId(0, this.f143477b);
            obtainStyledAttributes.recycle();
        }
    }

    public AudioChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f143477b = R.layout.chat_item_audio_layout;
        m226121a(context, attributeSet);
        m226122g();
    }
}
