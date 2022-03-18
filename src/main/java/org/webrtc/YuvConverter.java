package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

public class YuvConverter {
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* access modifiers changed from: private */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;

        private ShaderCallbacks() {
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = (float) i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        ShaderCallbacks shaderCallbacks2 = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks2;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks2);
        threadChecker2.detachThread();
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, FilterType.Origin, 0, 0);
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer, FilterType filterType, int i, int i2) {
        this.threadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error("YUVConverter");
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i3 = ((width + 7) / 8) * 8;
        int i4 = (height + 1) / 2;
        int i5 = height + i4;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3 * i5);
        int i6 = i3 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.i420TextureFrameBuffer.setSize(i6, i5);
        GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, 0, i6, height, filterType, i, i2);
        this.shaderCallbacks.setPlaneU();
        int i7 = i6 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, 0, height, i7, i4, filterType, i, i2);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, matrix, width, height, i7, height, i7, i4, filterType, i, i2);
        GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("YUVConverter", "error: " + glGetError);
            RXLogging.m74904e("YUVConverter", "convert i420 failed as opengl error " + glGetError);
            if (1285 != glGetError && 1282 != glGetError) {
                throw new RuntimeException("YuvConverter.convert: GLES20 error: " + glGetError);
            } else if (nativeAllocateByteBuffer == null) {
                return null;
            } else {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                return null;
            }
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            int i8 = (i3 * height) + 0;
            int i9 = i3 / 2;
            int i10 = i8 + i9;
            nativeAllocateByteBuffer.position(0);
            nativeAllocateByteBuffer.limit(i8);
            ByteBuffer slice = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i8);
            int i11 = ((i4 - 1) * i3) + i9;
            nativeAllocateByteBuffer.limit(i8 + i11);
            ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
            nativeAllocateByteBuffer.position(i10);
            nativeAllocateByteBuffer.limit(i10 + i11);
            return JavaI420Buffer.wrap(width, height, slice, i3, slice2, i3, nativeAllocateByteBuffer.slice(), i3, new Runnable(nativeAllocateByteBuffer) {
                /* class org.webrtc.$$Lambda$YuvConverter$Ojo4FXd8nZYyUQuSpjMZbMLuYQ */
                public final /* synthetic */ ByteBuffer f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    JniCommon.nativeFreeByteBuffer(this.f$0);
                }
            });
        }
    }
}
