package com.ss.android.ttve.common;

import android.opengl.GLES20;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.h */
public class C60190h {

    /* renamed from: a */
    public static final float[] f150221a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    protected C60186e f150222b;

    /* renamed from: c */
    private int f150223c;

    /* renamed from: d */
    private int f150224d;

    /* renamed from: e */
    private int f150225e;

    /* renamed from: f */
    private int f150226f;

    protected C60190h() {
    }

    /* renamed from: a */
    public static C60190h m233952a() {
        C60190h hVar = new C60190h();
        if (hVar.mo205551a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}")) {
            return hVar;
        }
        C63929ab.m250980d("TETextureDrawer", "TETextureDrawer create failed!");
        hVar.mo205552b();
        return null;
    }

    /* renamed from: b */
    public void mo205552b() {
        this.f150222b.mo205528a();
        GLES20.glDeleteBuffers(1, new int[]{this.f150223c}, 0);
        this.f150222b = null;
        this.f150223c = 0;
    }

    /* renamed from: a */
    public void mo205548a(int i) {
        mo205549a(i, 3553);
    }

    /* renamed from: a */
    public void mo205546a(float f) {
        double d = (double) f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.f150222b.mo205532b();
        GLES20.glUniformMatrix2fv(this.f150224d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    /* renamed from: a */
    public void mo205550a(boolean z) {
        this.f150222b.mo205532b();
        GLES20.glUniform1i(this.f150226f, z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo205547a(float f, float f2) {
        this.f150222b.mo205532b();
        GLES20.glUniform2f(this.f150225e, 1.0f / f, 1.0f / f2);
    }

    /* renamed from: a */
    public void mo205549a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i2, i);
        GLES20.glBindBuffer(34962, this.f150223c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f150222b.mo205532b();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo205551a(String str, String str2) {
        C60186e eVar = new C60186e();
        this.f150222b = eVar;
        if (!eVar.mo205530a(str, str2)) {
            this.f150222b.mo205528a();
            this.f150222b = null;
            return false;
        }
        this.f150222b.mo205532b();
        this.f150224d = this.f150222b.mo205527a("rotation");
        this.f150225e = this.f150222b.mo205527a("flipScale");
        this.f150226f = this.f150222b.mo205527a("debug");
        this.f150222b.mo205529a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        this.f150223c = i;
        GLES20.glBindBuffer(34962, i);
        float[] fArr = f150221a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        mo205546a(BitmapDescriptorFactory.HUE_RED);
        mo205547a(1.0f, 1.0f);
        mo205550a(false);
        C63929ab.m250974a("TETextureDrawer", "init: success.");
        return true;
    }
}
