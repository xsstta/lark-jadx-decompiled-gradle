package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.opengl.GLES20;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.irtc.impl.widget.utils.GlUtils;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public class GlRectDrawer implements RendererCommon.GlDrawer {
    private static final FloatBuffer FULL_RECTANGLE_BUF = GlUtils.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEX_BUF = GlUtils.createFloatBuffer(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f});
    private final Map<String, Shader> shaders = new IdentityHashMap();

    GlRectDrawer() {
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.GlDrawer
    public void release() {
        for (Shader shader : this.shaders.values()) {
            shader.glShader.release();
        }
        this.shaders.clear();
    }

    /* access modifiers changed from: private */
    public static class Shader {
        public final GlShader glShader;
        public final int texMatrixLocation;

        public Shader(String str) {
            GlShader glShader2 = new GlShader("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n", str);
            this.glShader = glShader2;
            this.texMatrixLocation = glShader2.getUniformLocation("texMatrix");
        }
    }

    private void prepareShader(String str, float[] fArr) {
        Shader shader;
        if (this.shaders.containsKey(str)) {
            shader = this.shaders.get(str);
        } else {
            Shader shader2 = new Shader(str);
            this.shaders.put(str, shader2);
            shader2.glShader.useProgram();
            if ("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n".equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("y_tex"), 0);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("u_tex"), 1);
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("v_tex"), 2);
            } else if ("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n".equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("rgb_tex"), 0);
            } else if ("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n".equals(str)) {
                GLES20.glUniform1i(shader2.glShader.getUniformLocation("oes_tex"), 0);
            } else {
                throw new IllegalStateException("Unknown fragment shader: " + str);
            }
            GlUtils.checkNoGLES2Error("Initialize fragment shader uniform values.");
            shader2.glShader.setVertexAttribArray("in_pos", 2, FULL_RECTANGLE_BUF);
            shader2.glShader.setVertexAttribArray("in_tc", 2, FULL_RECTANGLE_TEX_BUF);
            shader = shader2;
        }
        shader.glShader.useProgram();
        GLES20.glUniformMatrix4fv(shader.texMatrixLocation, 1, false, fArr, 0);
    }

    private void drawRectangle(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.GlDrawer
    public void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(36197, 0);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.GlDrawer
    public void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(rgb_tex, interp_tc);\n}\n", fArr);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        drawRectangle(i4, i5, i6, i7);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.GlDrawer
    public void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        prepareShader("precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\n\nvoid main() {\n  float y = texture2D(y_tex, interp_tc).r;\n  float u = texture2D(u_tex, interp_tc).r - 0.5;\n  float v = texture2D(v_tex, interp_tc).r - 0.5;\n  gl_FragColor = vec4(y + 1.403 * v,                       y - 0.344 * u - 0.714 * v,                       y + 1.77 * u, 1);\n}\n", fArr);
        for (int i7 = 0; i7 < 3; i7++) {
            GLES20.glActiveTexture(33984 + i7);
            GLES20.glBindTexture(3553, iArr[i7]);
        }
        drawRectangle(i3, i4, i5, i6);
        for (int i8 = 0; i8 < 3; i8++) {
            GLES20.glActiveTexture(i8 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
