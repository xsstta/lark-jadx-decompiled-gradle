package com.ss.android.ttve.common;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.i */
public class C60191i {

    /* renamed from: a */
    private static final float[] f150227a = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: b */
    private static float[] f150228b = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: c */
    private C60186e f150229c;

    /* renamed from: d */
    private int[] f150230d;

    /* renamed from: e */
    private FloatBuffer f150231e;

    /* renamed from: f */
    private FloatBuffer f150232f;

    /* renamed from: g */
    private int f150233g;

    /* renamed from: h */
    private RectF f150234h;

    /* renamed from: i */
    private int f150235i = Integer.MAX_VALUE;

    private C60191i() {
    }

    /* renamed from: a */
    public static C60191i m233960a() {
        C60191i iVar = new C60191i();
        if (iVar.m233962a("attribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = aTextureCoord;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uTextureSampler;\nvarying vec2 vTextureCoord;\nvoid main() \n{\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n}")) {
            return iVar;
        }
        C63929ab.m250980d("TETextureOESDrawer", "TETextureOESDrawer create failed!");
        iVar.mo205556b();
        return null;
    }

    /* renamed from: b */
    public void mo205556b() {
        this.f150229c.mo205528a();
        int[] iArr = this.f150230d;
        if (iArr != null) {
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            this.f150230d = null;
        }
        this.f150229c = null;
        this.f150231e = null;
        this.f150232f = null;
    }

    /* renamed from: a */
    private FloatBuffer m233961a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr, 0, fArr.length).position(0);
        return asFloatBuffer;
    }

    /* renamed from: a */
    public void mo205553a(int i) {
        this.f150229c.mo205532b();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindBuffer(34962, this.f150230d[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f150230d[1]);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: a */
    public void mo205555a(RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = this.f150234h;
            if (rectF2 == null || !rectF.equals(rectF2)) {
                this.f150234h = rectF;
                f150228b[0] = rectF.left;
                f150228b[1] = 1.0f - rectF.top;
                f150228b[2] = rectF.left;
                f150228b[3] = 1.0f - rectF.bottom;
                f150228b[4] = rectF.right;
                f150228b[5] = 1.0f - rectF.top;
                f150228b[6] = rectF.right;
                f150228b[7] = 1.0f - rectF.bottom;
                this.f150232f = m233961a(f150228b);
                this.f150229c.mo205532b();
                GLES20.glBindBuffer(34962, this.f150230d[1]);
                this.f150232f.position(0);
                GLES20.glBufferSubData(34962, 0, 32, this.f150232f);
            }
        }
    }

    /* renamed from: a */
    private boolean m233962a(String str, String str2) {
        this.f150231e = m233961a(f150227a);
        this.f150232f = m233961a(f150228b);
        C60186e eVar = new C60186e();
        this.f150229c = eVar;
        if (!eVar.mo205530a(str, str2)) {
            this.f150229c.mo205528a();
            this.f150229c = null;
            return false;
        }
        this.f150229c.mo205532b();
        this.f150233g = this.f150229c.mo205527a("uMVPMatrix");
        int[] iArr = new int[2];
        this.f150230d = iArr;
        GLES20.glGenBuffers(2, iArr, 0);
        this.f150229c.mo205529a("aPosition", 0);
        GLES20.glBindBuffer(34962, this.f150230d[0]);
        this.f150231e.position(0);
        GLES20.glBufferData(34962, 32, this.f150231e, 35044);
        this.f150229c.mo205529a("aTextureCoord", 1);
        GLES20.glBindBuffer(34962, this.f150230d[1]);
        this.f150232f.position(0);
        GLES20.glBufferData(34962, 32, this.f150232f, 35048);
        mo205554a(0, false, 0, 0, 0, 0);
        C63929ab.m250974a("TETextureOESDrawer", "init: success.");
        return true;
    }

    /* renamed from: a */
    public void mo205554a(int i, boolean z, int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        this.f150229c.mo205532b();
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.f150233g, 1, false, fArr, 0);
        } else if (this.f150235i != i) {
            this.f150235i = i;
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, (float) i, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
            if (z) {
                Matrix.rotateM(fArr2, 0, 180.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                f = (float) i3;
            } else {
                f = (float) i2;
            }
            if (Math.abs(i) == 90 || Math.abs(i) == 270) {
                f2 = (float) i2;
            } else {
                f2 = (float) i3;
            }
            float f3 = (float) i4;
            float f4 = f3 / f;
            float f5 = (float) i5;
            float f6 = f5 / f2;
            if (f4 <= f6) {
                f4 = f6;
            }
            Matrix.scaleM(fArr2, 0, (((float) i2) / 2.0f) * f4, (((float) i3) / 2.0f) * f4, 1.0f);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.setLookAtM(fArr3, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.orthoM(fArr4, 0, ((float) (-i4)) / 2.0f, f3 / 2.0f, ((float) (-i5)) / 2.0f, f5 / 2.0f, -2.0f, 2.0f);
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr2, 0);
            float[] fArr6 = new float[16];
            Matrix.setIdentityM(fArr6, 0);
            Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
            GLES20.glUniformMatrix4fv(this.f150233g, 1, false, fArr6, 0);
        }
    }
}
