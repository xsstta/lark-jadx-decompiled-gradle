package com.ss.android.bytedcert.p1308f.p1309a.p1311b;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.bytedance.common.utility.Logger;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28371a;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28372b;
import com.ss.android.bytedcert.p1308f.p1309a.p1312c.C28373c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.bytedcert.f.a.b.b */
public class C28369b {

    /* renamed from: a */
    private final FloatBuffer f71292a;

    /* renamed from: b */
    private final FloatBuffer f71293b;

    /* renamed from: c */
    private final FloatBuffer f71294c;

    /* renamed from: d */
    private FloatBuffer f71295d;

    /* renamed from: e */
    private FloatBuffer f71296e;

    /* renamed from: f */
    private boolean f71297f;

    /* renamed from: g */
    private ArrayList<HashMap<String, Integer>> f71298g = new ArrayList<HashMap<String, Integer>>(2) {
        /* class com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28369b.C283701 */

        {
            for (int i = 0; i < 2; i++) {
                HashMap hashMap = new HashMap();
                hashMap.put("program", 0);
                hashMap.put("position", -1);
                hashMap.put("inputImageTexture", -1);
                hashMap.put("inputTextureCoordinate", -1);
                hashMap.put("uSTMatrix", -1);
                hashMap.put("uMVPMatrix", -1);
                hashMap.put("intensity", -1);
                add(hashMap);
            }
        }
    };

    /* renamed from: h */
    private int f71299h;

    /* renamed from: i */
    private int f71300i;

    /* renamed from: j */
    private int[] f71301j;

    /* renamed from: k */
    private int[] f71302k;

    /* renamed from: l */
    private float[] f71303l = new float[16];

    /* renamed from: m */
    private float[] f71304m = new float[16];

    /* renamed from: a */
    public void mo101067a() {
        int[] iArr = this.f71302k;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.f71302k = null;
        }
        int[] iArr2 = this.f71301j;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(2, iArr2, 0);
            this.f71301j = null;
        }
    }

    public C28369b() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(C28373c.f71309e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f71292a = asFloatBuffer;
        asFloatBuffer.put(C28373c.f71309e).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(C28373c.f71305a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f71293b = asFloatBuffer2;
        asFloatBuffer2.put(C28373c.f71305a).position(0);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(C28373c.f71305a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f71294c = asFloatBuffer3;
        asFloatBuffer3.put(C28373c.m104069a(0, false, true)).position(0);
    }

    /* renamed from: a */
    public int mo101065a(int i) {
        if (!this.f71297f) {
            return -1;
        }
        GLES20.glUseProgram(this.f71298g.get(1).get("program").intValue());
        this.f71296e.position(0);
        int intValue = this.f71298g.get(1).get("position").intValue();
        GLES20.glVertexAttribPointer(intValue, 2, 5126, false, 0, (Buffer) this.f71296e);
        GLES20.glEnableVertexAttribArray(intValue);
        this.f71293b.position(0);
        int intValue2 = this.f71298g.get(1).get("inputTextureCoordinate").intValue();
        GLES20.glVertexAttribPointer(intValue2, 2, 5126, false, 0, (Buffer) this.f71293b);
        GLES20.glEnableVertexAttribArray(intValue2);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(this.f71298g.get(1).get("inputImageTexture").intValue(), 0);
        }
        Matrix.setIdentityM(this.f71304m, 0);
        GLES20.glUniformMatrix4fv(this.f71298g.get(1).get("uSTMatrix").intValue(), 1, false, this.f71304m, 0);
        int intValue3 = this.f71298g.get(1).get("uMVPMatrix").intValue();
        Matrix.setIdentityM(this.f71303l, 0);
        GLES20.glUniformMatrix4fv(intValue3, 1, false, this.f71303l, 0);
        C28371a.m104064a("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f71298g.get(1).get("intensity").intValue(), ((float) BytedCertManager.getInstance().getThemeConfig().mo100963j()) / 100.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(intValue);
        GLES20.glDisableVertexAttribArray(intValue2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        return 1;
    }

    /* renamed from: b */
    private void m104055b(int i, int i2) {
        mo101067a();
        if (this.f71301j == null) {
            int[] iArr = new int[2];
            this.f71301j = iArr;
            this.f71302k = new int[2];
            GLES20.glGenFramebuffers(2, iArr, 0);
            GLES20.glGenTextures(2, this.f71302k, 0);
            m104056b(this.f71302k[0], this.f71301j[0], i, i2);
            m104056b(this.f71302k[1], this.f71301j[1], i, i2);
        }
    }

    /* renamed from: a */
    public void mo101068a(int i, int i2) {
        if (this.f71299h != i || this.f71300i != i2) {
            m104054a("#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", this.f71298g.get(0));
            m104054a("precision mediump float;\n//当前要采集像素的点\nvarying mediump vec2 textureCoordinate;\n//纹理\nuniform sampler2D inputImageTexture;\n//输出的宽与高\n//uniform vec2 singleStepOffset;\nuniform float intensity;\nvec2 blurCoordinates[20];\n\nvoid modifyColor(vec4 color){\n    color.r=max(min(color.r, 1.0), 0.0);\n    color.g=max(min(color.g, 1.0), 0.0);\n    color.b=max(min(color.b, 1.0), 0.0);\n    color.a=max(min(color.a, 1.0), 0.0);\n}\n\nvoid main(){\n    //1、 模糊 ： 平滑处理 降噪    //singleStepOffset：步长 \n    int width = 480;\n    int height = 640;\n    vec2 singleStepOffset =vec2(1.0/float(width), 1.0/float(height));\n    blurCoordinates[0] = textureCoordinate.xy + singleStepOffset *vec2(0.0, -10.0);\n    blurCoordinates[1] = textureCoordinate.xy + singleStepOffset *vec2(0.0, 10.0);\n    blurCoordinates[2] = textureCoordinate.xy + singleStepOffset *vec2(-10.0, 0.0);\n    blurCoordinates[3] = textureCoordinate.xy + singleStepOffset *vec2(10.0, 0.0);\n    blurCoordinates[4] = textureCoordinate.xy + singleStepOffset *vec2(5.0, -8.0);\n    blurCoordinates[5] = textureCoordinate.xy + singleStepOffset *vec2(5.0, 8.0);\n    blurCoordinates[6] = textureCoordinate.xy + singleStepOffset *vec2(-5.0, 8.0);\n    blurCoordinates[7] = textureCoordinate.xy + singleStepOffset *vec2(-5.0, -8.0);\n    blurCoordinates[8] = textureCoordinate.xy + singleStepOffset *vec2(8.0, -5.0);\n    blurCoordinates[9] = textureCoordinate.xy + singleStepOffset *vec2(8.0, 5.0);\n    blurCoordinates[10] = textureCoordinate.xy + singleStepOffset *vec2(-8.0, 5.0);\n    blurCoordinates[11] = textureCoordinate.xy + singleStepOffset *vec2(-8.0, -5.0);\n    blurCoordinates[12] = textureCoordinate.xy + singleStepOffset *vec2(0.0, -6.0);\n    blurCoordinates[13] = textureCoordinate.xy + singleStepOffset *vec2(0.0, 6.0);\n    blurCoordinates[14] = textureCoordinate.xy + singleStepOffset *vec2(6.0, 0.0);\n    blurCoordinates[15] = textureCoordinate.xy + singleStepOffset *vec2(-6.0, 0.0);\n    blurCoordinates[16] = textureCoordinate.xy + singleStepOffset *vec2(-4.0, -4.0);\n    blurCoordinates[17] = textureCoordinate.xy + singleStepOffset *vec2(-4.0, 4.0);\n    blurCoordinates[18] = textureCoordinate.xy + singleStepOffset *vec2(4.0, -4.0);\n    blurCoordinates[19] = textureCoordinate.xy + singleStepOffset *vec2(4.0, 4.0);\n    //计算平均值     //本身的点的像素值   \n    vec4 currentColor = texture2D(inputImageTexture, textureCoordinate);\n    vec3 rgb = currentColor.rgb;\n    // 计算偏移坐标的颜色值总和       \n    for (int i =0; i <20; i++) {\n        //采集20个点 的像素值 相加 得到总和\n        rgb += texture2D(inputImageTexture, blurCoordinates[i].xy).rgb; }\n    // rgb：21个点的像素和     //平均值 模糊效果     // rgba   \n    vec4 blur =vec4(rgb *1.0 /21.0, currentColor.a);\n    //gl_FragColor = blur;        //高反差       \n    //强光处理:color = 2 * color1 * color2;\n    //  24.0 强光程度        // clamp:获得三个参数中大小处在中间的那个值       \n    vec4 highPassColor = currentColor - blur;\n    highPassColor.r = clamp(2.0 * highPassColor.r * highPassColor.r *24.0, 0.0, 1.0);\n    highPassColor.g = clamp(2.0 * highPassColor.g * highPassColor.g *24.0, 0.0, 1.0);\n    highPassColor.b = clamp(2.0 * highPassColor.b * highPassColor.b *24.0, 0.0, 1.0);\n    // 过滤疤痕\n    vec4 highPassBlur =vec4(highPassColor.rgb, 1.0);\n    //3、融合 -> 磨皮            //蓝色通道值\n    float b = min(currentColor.b, blur.b);\n    float value = clamp((b -0.2) *5.0, 0.0, 1.0);\n    // RGB的最大值\n    float maxChannelColor = max(max(highPassBlur.r, highPassBlur.g), highPassBlur.b);\n    // 磨皮程度       \n\n    //float intensity = 0.5;\n    float currentIntensity = (1.0 - maxChannelColor / (maxChannelColor +0.2)) * value * intensity;\n    //gl_FragColor = highPassBlur;\n    // 一个滤镜        //opengl 内置函数 线性融合        //混合 x*(1−a)+y⋅a        // 第三个值越大，在这里融合的图像 越模糊       \n    vec3 r = mix(currentColor.rgb, blur.rgb, currentIntensity);\n\n    // 美白\n    //float level = 0.4;\n    vec4 deltaColor = vec4(r, 1.0) + vec4(intensity * 0.15, intensity * 0.25, intensity * 0.25, 0.0);\n    modifyColor(deltaColor);\n\n    gl_FragColor =deltaColor;\n\n}\n", this.f71298g.get(1));
            this.f71299h = i;
            this.f71300i = i2;
            m104055b(i, i2);
            this.f71297f = true;
        }
    }

    /* renamed from: a */
    private void m104054a(String str, HashMap<String, Integer> hashMap) {
        if (hashMap.get("program").intValue() == 0) {
            int a = C28372b.m104067a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n\tgl_Position = uMVPMatrix * position;\n\ttextureCoordinate = (uSTMatrix*inputTextureCoordinate).xy;\n}", str);
            hashMap.put("program", Integer.valueOf(a));
            hashMap.put("position", Integer.valueOf(GLES20.glGetAttribLocation(a, "position")));
            hashMap.put("inputImageTexture", Integer.valueOf(GLES20.glGetUniformLocation(a, "inputImageTexture")));
            hashMap.put("inputTextureCoordinate", Integer.valueOf(GLES20.glGetAttribLocation(a, "inputTextureCoordinate")));
            hashMap.put("uMVPMatrix", Integer.valueOf(GLES20.glGetUniformLocation(a, "uMVPMatrix")));
            hashMap.put("uSTMatrix", Integer.valueOf(GLES20.glGetUniformLocation(a, "uSTMatrix")));
            hashMap.put("intensity", Integer.valueOf(GLES20.glGetUniformLocation(a, "intensity")));
        }
    }

    /* renamed from: a */
    public void mo101070a(int i, boolean z) {
        float[] a = C28373c.m104069a(i, true, z);
        if (this.f71295d == null) {
            this.f71295d = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f71295d.clear();
        this.f71295d.put(a).position(0);
    }

    /* renamed from: a */
    public int mo101066a(int i, ByteBuffer byteBuffer, float[] fArr) {
        if (this.f71301j != null && this.f71297f) {
            GLES20.glUseProgram(this.f71298g.get(0).get("program").intValue());
            try {
                C28371a.m104064a("glUseProgram");
                this.f71292a.position(0);
                int intValue = this.f71298g.get(0).get("position").intValue();
                GLES20.glVertexAttribPointer(intValue, 2, 5126, false, 0, (Buffer) this.f71292a);
                GLES20.glEnableVertexAttribArray(intValue);
                this.f71295d.position(0);
                int intValue2 = this.f71298g.get(0).get("inputTextureCoordinate").intValue();
                GLES20.glVertexAttribPointer(intValue2, 2, 5126, false, 0, (Buffer) this.f71295d);
                GLES20.glEnableVertexAttribArray(intValue2);
                int intValue3 = this.f71298g.get(0).get("uSTMatrix").intValue();
                if (fArr != null) {
                    GLES20.glUniformMatrix4fv(intValue3, 1, false, fArr, 0);
                } else {
                    Matrix.setIdentityM(this.f71304m, 0);
                    GLES20.glUniformMatrix4fv(intValue3, 1, false, this.f71304m, 0);
                }
                if (i != -1) {
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, i);
                    GLES20.glUniform1i(this.f71298g.get(0).get("inputImageTexture").intValue(), 0);
                }
                GLES20.glBindFramebuffer(36160, this.f71301j[0]);
                C28371a.m104064a("glBindFramebuffer");
                GLES20.glViewport(0, 0, this.f71299h, this.f71300i);
                int intValue4 = this.f71298g.get(0).get("uMVPMatrix").intValue();
                Matrix.setIdentityM(this.f71303l, 0);
                GLES20.glUniformMatrix4fv(intValue4, 1, false, this.f71303l, 0);
                C28371a.m104064a("glUniformMatrix4fv");
                GLES20.glDrawArrays(5, 0, 4);
                if (byteBuffer != null) {
                    GLES20.glReadPixels(0, 0, this.f71299h, this.f71300i, 6408, 5121, byteBuffer);
                }
                GLES20.glDisableVertexAttribArray(intValue);
                GLES20.glDisableVertexAttribArray(intValue2);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(0);
                return this.f71302k[0];
            } catch (RuntimeException e) {
                Logger.m15173i("STGLRender", "glUseProgram fail msg=" + e.getMessage());
            }
        }
        return -2;
    }

    /* renamed from: b */
    private void m104056b(int i, int i2, int i3, int i4) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* renamed from: a */
    public void mo101069a(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i3;
        float f3 = (float) i2;
        float f4 = (float) i4;
        float max = Math.max(f / f2, f3 / f4);
        float round = ((float) Math.round(f2 * max)) / f;
        float round2 = ((float) Math.round(f4 * max)) / f3;
        float[] fArr = {C28373c.f71309e[0] / round2, C28373c.f71309e[1] / round, C28373c.f71309e[2] / round2, C28373c.f71309e[3] / round, C28373c.f71309e[4] / round2, C28373c.f71309e[5] / round, C28373c.f71309e[6] / round2, C28373c.f71309e[7] / round};
        if (this.f71296e == null) {
            this.f71296e = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f71296e.clear();
        this.f71296e.put(fArr).position(0);
    }
}
