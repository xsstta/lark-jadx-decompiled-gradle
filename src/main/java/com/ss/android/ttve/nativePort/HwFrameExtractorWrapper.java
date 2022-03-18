package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.AbstractC64077u;
import java.nio.ByteBuffer;

public class HwFrameExtractorWrapper {
    private static final String TAG = "HwFrameExtractorWrapper";
    private C60262a mExtractor;
    private C60267b mExtractorRange;
    private long mNativeAddr;

    public native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public void stop() {
        C60262a aVar = this.mExtractor;
        if (aVar != null) {
            aVar.mo206302c();
            this.mExtractor = null;
        }
        C60267b bVar = this.mExtractorRange;
        if (bVar != null) {
            bVar.mo206312b();
            this.mExtractorRange = null;
        }
    }

    public HwFrameExtractorWrapper(long j) {
        this.mNativeAddr = j;
    }

    public static HwFrameExtractorWrapper create(long j) {
        return new HwFrameExtractorWrapper(j);
    }

    public void startExtractFrame(String str, int[] iArr, int i, int i2, int i3, int i4) {
        final long j = this.mNativeAddr;
        C60262a aVar = new C60262a(str, iArr, i, i2, false, i3, i4, new AbstractC64077u() {
            /* class com.ss.android.ttve.nativePort.HwFrameExtractorWrapper.C602331 */

            @Override // com.ss.android.vesdk.AbstractC64077u
            public boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                return HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j, byteBuffer, i, i2, i3);
            }
        });
        this.mExtractor = aVar;
        aVar.mo206299a();
    }

    public void startExtractFrameForRangeTime(String str, int i, int i2, int i3, int i4, int i5) {
        final long j = this.mNativeAddr;
        this.mExtractorRange = new C60267b(str, i, i2, i3, i4, false, i5, new AbstractC64077u() {
            /* class com.ss.android.ttve.nativePort.HwFrameExtractorWrapper.C602342 */

            @Override // com.ss.android.vesdk.AbstractC64077u
            public boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                return HwFrameExtractorWrapper.this.nativeOnFrameAvailable(j, byteBuffer, i, i2, i3);
            }
        });
    }
}
