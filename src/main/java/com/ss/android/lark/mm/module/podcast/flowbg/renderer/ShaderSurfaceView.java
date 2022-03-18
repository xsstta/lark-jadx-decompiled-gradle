package com.ss.android.lark.mm.module.podcast.flowbg.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class ShaderSurfaceView extends GLSurfaceView {

    /* renamed from: a */
    private C46780a f117715a;

    public C46780a getRenderer() {
        return this.f117715a;
    }

    public ShaderSurfaceView(Context context) {
        super(context);
        setRenderer(context);
    }

    /* renamed from: a */
    public void mo164369a(float f) {
        this.f117715a.mo164378b(f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f117715a.mo164377a(motionEvent);
        return true;
    }

    private void setRenderer(Context context) {
        this.f117715a = new C46780a(context);
        setEGLContextClientVersion(2);
        setRenderer(this.f117715a);
        setRenderMode(1);
    }

    public ShaderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setRenderer(context);
    }

    /* renamed from: a */
    public void mo164370a(int i, float f, Bitmap bitmap) {
        onPause();
        this.f117715a.mo164375a(i, f, bitmap);
        onResume();
    }
}
