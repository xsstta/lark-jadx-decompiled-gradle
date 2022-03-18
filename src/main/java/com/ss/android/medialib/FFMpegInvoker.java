package com.ss.android.medialib;

import com.ss.android.medialib.FFMpegManager;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

public class FFMpegInvoker {
    AbstractC59375b mFFMpagCaller;
    AbstractC59394d metaInterface;

    public native int addFastReverseVideo(String str, String str2);

    public native int checkAudioFile(String str);

    public native int checkMp3File(String str);

    public native CoverInfo getFrameCover(String str, int i, int i2, int i3, int i4);

    public native int[] initVideoToGraph(String str, int i, int i2);

    public native int isCanImport(String str, long j, long j2);

    public native int remuxVideo(String str, String str2);

    public native int rencodeAndSplitFile(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, String str4, int i4, String str5, float f, boolean z, boolean z2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, FFMpegManager.EncoderListener encoderListener);

    public native int resampleCycleAudioToWav(String str, String str2, long j, long j2);

    public native void stopGetFrameThumbnail();

    public native int stopReverseVideo();

    public native int uninitVideoToGraph();

    static {
        TENativeLibsLoader.m234148d();
    }

    public String onNativeCallback_getMetaKey() {
        AbstractC59394d dVar = this.metaInterface;
        if (dVar != null) {
            return dVar.mo202248a();
        }
        return null;
    }

    public void setMetaInterface(AbstractC59394d dVar) {
        this.metaInterface = dVar;
    }

    public void setmFFMpagCaller(AbstractC59375b bVar) {
        this.mFFMpagCaller = bVar;
    }

    public void onNativeCallback_progress(int i) {
        AbstractC59375b bVar = this.mFFMpagCaller;
        if (bVar != null) {
            bVar.mo202209a(i);
        }
    }

    public void onNativeCallback_MetaData(String str, String str2) {
        AbstractC59394d dVar = this.metaInterface;
        if (dVar != null) {
            dVar.mo202249a(str, str2);
        }
    }
}
