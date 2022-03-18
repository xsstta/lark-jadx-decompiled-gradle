package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.YuvHelper;

/* access modifiers changed from: package-private */
public class YuvUploader {
    private ByteBuffer copyBuffer;
    private int[] yuvTextures;

    YuvUploader() {
    }

    public int[] getYuvTextures() {
        return this.yuvTextures;
    }

    public void release() {
        this.copyBuffer = null;
        int[] iArr = this.yuvTextures;
        if (iArr != null) {
            GLES20.glDeleteTextures(3, iArr, 0);
            this.yuvTextures = null;
        }
    }

    public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
        return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
    }

    public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i3 = i / 2;
        int[] iArr2 = {i, i3, i3};
        int i4 = i2 / 2;
        int[] iArr3 = {i2, i4, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 3; i6++) {
            if (iArr[i6] > iArr2[i6]) {
                i5 = Math.max(i5, iArr2[i6] * iArr3[i6]);
            }
        }
        if (i5 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i5)) {
            this.copyBuffer = ByteBuffer.allocateDirect(i5);
        }
        if (this.yuvTextures == null) {
            this.yuvTextures = new int[3];
            for (int i7 = 0; i7 < 3; i7++) {
                this.yuvTextures[i7] = GlUtil.generateTexture(3553);
            }
        }
        for (int i8 = 0; i8 < 3; i8++) {
            GLES20.glActiveTexture(33984 + i8);
            GLES20.glBindTexture(3553, this.yuvTextures[i8]);
            if (iArr[i8] == iArr2[i8]) {
                byteBuffer = byteBufferArr[i8];
            } else {
                YuvHelper.copyPlane(byteBufferArr[i8], iArr[i8], this.copyBuffer, iArr2[i8], iArr2[i8], iArr3[i8]);
                byteBuffer = this.copyBuffer;
            }
            GLES20.glTexImage2D(3553, 0, 6409, iArr2[i8], iArr3[i8], 0, 6409, 5121, byteBuffer);
        }
        return this.yuvTextures;
    }
}
