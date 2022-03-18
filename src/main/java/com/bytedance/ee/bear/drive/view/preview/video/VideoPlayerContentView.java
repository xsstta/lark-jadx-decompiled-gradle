package com.bytedance.ee.bear.drive.view.preview.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;

public class VideoPlayerContentView extends FrameLayout {

    /* renamed from: a */
    private View f20179a;

    /* renamed from: b */
    private TextureView f20180b;

    public TextureView getTextureView() {
        return this.f20180b;
    }

    public VideoPlayerContentView(Context context) {
        super(context);
        m29912a(context);
    }

    public void setEmptyViewColor(int i) {
        this.f20179a.setBackgroundColor(i);
    }

    public void setEmptyViewVisibility(int i) {
        this.f20179a.setVisibility(i);
    }

    /* renamed from: a */
    private void m29912a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.drive_preview_video_texture_view, (ViewGroup) this, true);
        this.f20179a = findViewById(R.id.drive_video_view_empty);
        this.f20180b = (TextureView) findViewById(R.id.drive_video_texture_view);
    }

    public VideoPlayerContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29912a(context);
    }

    public VideoPlayerContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29912a(context);
    }
}
