package com.tt.miniapp.video.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.tt.miniapp.video.view.CoreVideoView;

public class PluginMediaViewLayout extends FrameLayout {

    /* renamed from: a */
    private CoreVideoView f169145a;

    /* renamed from: b */
    private RelativeLayout f169146b;

    public ViewGroup getPluginMainContainer() {
        return this.f169146b;
    }

    public CoreVideoView getVideoView() {
        return this.f169145a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo233291a() {
        this.f169145a = (CoreVideoView) findViewById(R.id.microapp_m_video_media_view);
        this.f169146b = (RelativeLayout) findViewById(R.id.microapp_m_video_plugin_root);
    }

    public PluginMediaViewLayout(Context context) {
        this(context, null);
    }

    public PluginMediaViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PluginMediaViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.microapp_m_video_view_layout, this);
        mo233291a();
    }
}
