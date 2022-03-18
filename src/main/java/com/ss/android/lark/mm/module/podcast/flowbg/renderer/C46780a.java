package com.ss.android.lark.mm.module.podcast.flowbg.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a.C46784c;
import com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2326a.C46785d;
import com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2327b.C46787a;
import com.ss.android.lark.mm.p2288b.C45850b;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.a */
public class C46780a implements GLSurfaceView.Renderer {

    /* renamed from: a */
    private long f117716a;

    /* renamed from: b */
    private final float[] f117717b = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: c */
    private final float[] f117718c = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: d */
    private final float[] f117719d = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: e */
    private Bitmap f117720e;

    /* renamed from: f */
    private int[] f117721f;

    /* renamed from: g */
    private float f117722g = 1.0f;

    /* renamed from: h */
    private int f117723h;

    /* renamed from: i */
    private final Context f117724i;

    /* renamed from: j */
    private float f117725j = 1.67f;

    /* renamed from: k */
    private C46784c f117726k;

    /* renamed from: a */
    public void mo164373a(float f) {
        this.f117722g = f;
    }

    /* renamed from: b */
    public void mo164378b(float f) {
        this.f117725j = f;
    }

    /* renamed from: a */
    public void mo164374a(int i) {
        this.f117723h = i;
    }

    /* renamed from: a */
    public void mo164376a(Bitmap bitmap) {
        this.f117720e = bitmap;
    }

    public C46780a(Context context) {
        this.f117724i = context;
    }

    /* renamed from: a */
    public void mo164377a(MotionEvent motionEvent) {
        float[] fArr = this.f117719d;
        float x = motionEvent.getX(0);
        float f = this.f117722g;
        fArr[0] = x * f;
        this.f117719d[1] = ((float) Math.round(this.f117717b[1] * f)) - (motionEvent.getY(0) * this.f117722g);
    }

    public void onDrawFrame(GL10 gl10) {
        this.f117726k.mo164392a(((float) (System.nanoTime() - this.f117716a)) / 1.0E9f, this.f117718c, this.f117717b, this.f117719d, this.f117721f, this.f117725j);
        if (C45850b.m181645a()) {
            C46787a.m185412a();
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glDisable(2884);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Bitmap bitmap = this.f117720e;
        if (bitmap != null) {
            this.f117721f = C46785d.m185408a(this.f117724i, bitmap);
        }
        this.f117726k = new C46784c(this.f117724i, R.raw.simplevert, this.f117723h);
    }

    /* renamed from: a */
    public void mo164375a(int i, float f, Bitmap bitmap) {
        mo164373a(f);
        mo164374a(i);
        mo164376a(bitmap);
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f117716a = System.nanoTime();
        float[] fArr = this.f117717b;
        float f = (float) i;
        fArr[0] = f;
        float f2 = (float) i2;
        fArr[1] = f2;
        this.f117718c[0] = (float) Math.round(f * this.f117722g);
        this.f117718c[1] = (float) Math.round(f2 * this.f117722g);
    }
}
