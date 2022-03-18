package com.ss.android.medialib.p2999b;

import android.opengl.GLES20;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.b.e */
public class C59384e {

    /* renamed from: a */
    public static final float[] f147427a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C59382d f147428b;

    /* renamed from: c */
    private int f147429c;

    /* renamed from: d */
    private int f147430d;

    /* renamed from: e */
    private int f147431e;

    protected C59384e() {
    }

    /* renamed from: a */
    public static C59384e m230531a() {
        C59384e eVar = new C59384e();
        if (eVar.mo202228a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            return eVar;
        }
        C63929ab.m250980d("TextureDrawer", "TextureDrawer create failed!");
        eVar.mo202229b();
        return null;
    }

    /* renamed from: b */
    public void mo202229b() {
        this.f147428b.mo202216a();
        GLES20.glDeleteBuffers(1, new int[]{this.f147429c}, 0);
        this.f147428b = null;
        this.f147429c = 0;
    }

    /* renamed from: a */
    public void mo202226a(int i) {
        mo202227a(i, 3553);
    }

    /* renamed from: a */
    public void mo202224a(float f) {
        double d = (double) f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.f147428b.mo202220b();
        GLES20.glUniformMatrix2fv(this.f147430d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    /* renamed from: a */
    public void mo202225a(float f, float f2) {
        this.f147428b.mo202220b();
        GLES20.glUniform2f(this.f147431e, 1.0f / f, 1.0f / f2);
    }

    /* renamed from: a */
    public void mo202227a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i2, i);
        GLES20.glBindBuffer(34962, this.f147429c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f147428b.mo202220b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo202228a(String str, String str2) {
        C59382d dVar = new C59382d();
        this.f147428b = dVar;
        if (!dVar.mo202218a(str, str2)) {
            this.f147428b.mo202216a();
            this.f147428b = null;
            return false;
        }
        this.f147428b.mo202220b();
        this.f147430d = this.f147428b.mo202215a("rotation");
        this.f147431e = this.f147428b.mo202215a("flipScale");
        this.f147428b.mo202217a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i = iArr[0];
        this.f147429c = i;
        GLES20.glBindBuffer(34962, i);
        float[] fArr = f147427a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        mo202224a(BitmapDescriptorFactory.HUE_RED);
        mo202225a(1.0f, 1.0f);
        C63929ab.m250976b("TextureDrawer", "init: success.");
        return true;
    }
}
