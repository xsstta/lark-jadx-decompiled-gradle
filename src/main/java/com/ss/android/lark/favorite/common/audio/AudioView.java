package com.ss.android.lark.favorite.common.audio;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class AudioView extends FrameLayout implements AbstractC58321a {

    /* renamed from: a */
    AnimationDrawable f95340a;

    /* renamed from: b */
    public AbstractC58321a.AbstractC58322a f95341b;

    /* renamed from: c */
    private int f95342c;
    @BindView(7626)
    TextView mDurationTV;
    @BindView(8423)
    View mPlayZone;
    @BindView(8596)
    View mRootView;
    @BindView(9309)
    ImageView mVoicePlayIV;

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
        this.f95340a.start();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f95340a.stop();
        this.f95340a.selectDrawable(0);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    /* renamed from: b */
    public void mo136735b() {
        this.f95340a.stop();
        this.f95340a.selectDrawable(0);
        setDurationText((long) this.f95342c);
    }

    /* renamed from: g */
    private void m146307g() {
        LayoutInflater.from(getContext()).inflate(R.layout.save_item_audio_layout, (ViewGroup) this, true);
        ButterKnife.bind(this);
        this.f95340a = (AnimationDrawable) ((ImageView) findViewById(R.id.voice_play)).getDrawable();
        this.mRootView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.favorite.common.audio.AudioView.C370981 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (AudioView.this.f95341b != null) {
                    AudioView.this.f95341b.mo122668a(view);
                }
            }
        });
        this.mRootView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.audio.$$Lambda$AudioView$NS_BNhNtrU_shQCPhXlsQuijQ0 */

            public final boolean onLongClick(View view) {
                return AudioView.m270532lambda$NS_BNhNtrU_shQCPhXlsQuijQ0(AudioView.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setListener(AbstractC58321a.AbstractC58322a aVar) {
        this.f95341b = aVar;
    }

    public AudioView(Context context) {
        this(context, null);
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setDuration(int i) {
        this.f95342c = i;
        setDurationText((long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m146306a(View view) {
        AbstractC58321a.AbstractC58322a aVar = this.f95341b;
        if (aVar != null) {
            return aVar.mo122669b(view);
        }
        return false;
    }

    private void setDurationText(long j) {
        this.mDurationTV.setText(C26279i.m95150a(j));
    }

    @Override // com.ss.android.lark.widget.audioview.AbstractC58321a
    public void setProgress(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            setDurationText((long) (((float) this.f95342c) * (1.0f - f)));
        } else {
            setDurationText((long) this.f95342c);
        }
    }

    public AudioView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m146307g();
    }
}
