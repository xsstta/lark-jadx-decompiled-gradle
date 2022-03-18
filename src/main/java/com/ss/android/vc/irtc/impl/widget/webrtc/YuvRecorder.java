package com.ss.android.vc.irtc.impl.widget.webrtc;

import com.ss.video.rtc.engine.utils.ExtVideoFrame;
import com.ss.video.rtc.engine.utils.TextureHelper;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.VideoFrame;

public class YuvRecorder {
    public static boolean DEBUG;
    private ExecutorService executorService = Executors.newSingleThreadExecutor();
    public String filename;
    private TextureHelper helper;
    public boolean isFirst;

    public void release() {
        TextureHelper textureHelper = this.helper;
        if (textureHelper != null) {
            textureHelper.dispose();
            this.helper = null;
        }
    }

    public YuvRecorder(String str) {
        this.filename = str;
    }

    public void writeVideoFrame(ExtVideoFrame extVideoFrame, boolean z) {
        try {
            if (this.helper != null) {
                VideoFrame videoFrame = null;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                byte[] bArr = new byte[dataY.limit()];
                byte[] bArr2 = new byte[dataU.limit()];
                byte[] bArr3 = new byte[dataV.limit()];
                dataY.get(bArr);
                dataU.get(bArr2);
                dataV.get(bArr3);
                if (z) {
                    write(bArr, bArr2, bArr3, strideY, strideU, strideV, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                } else {
                    write(bArr, bArr3, bArr2, strideY, strideV, strideU, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                }
                i420.release();
                videoFrame.release();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void write(final byte[] bArr, final byte[] bArr2, final byte[] bArr3, final int i, final int i2, final int i3, final int i4, final int i5) {
        this.executorService.execute(new Runnable() {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.YuvRecorder.RunnableC610571 */

            /* JADX WARNING: Removed duplicated region for block: B:44:0x00de A[SYNTHETIC, Splitter:B:44:0x00de] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 231
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.YuvRecorder.RunnableC610571.run():void");
            }
        });
    }
}
