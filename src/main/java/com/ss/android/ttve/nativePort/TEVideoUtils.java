package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VEException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class TEVideoUtils {
    private static long getFrameInterval = 1000;

    public interface CompileProbeListener {
        void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2);
    }

    public interface CompileProbeListener2 {
        void onCompileProbeResult2(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3);
    }

    public interface ExecuteCommandAndDumpInfoListener {
        void updateFFmpegInfo(String str);
    }

    public interface ExecuteCommandListener {
        void onProgressChanged(int i);
    }

    public static native void nativeCancelCompileProbe();

    private static native int nativeCheckMVResourceIntegrity(String str);

    private static native int nativeClearWavSeg(String str, int i, int i2);

    public static native int nativeCompileProbe(String str, String str2, int i, int i2, long j, long j2, int i3, int i4, int i5, long j3, double d, CompileProbeListener compileProbeListener, CompileProbeListener2 compileProbeListener2, int i6);

    private static native int nativeConcat(String[] strArr, String str, int i);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4);

    public static native int nativeConverBitmapToRGBA(Bitmap bitmap, String str);

    public static native int nativeConverRGBAToIMG(String str, String str2, int i, int i2);

    public static native int nativeConvertJpegToMp4(String str, String str2, int i, boolean z);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    private static native long nativeCreateGetFrameHandler(String str);

    private static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f, int i3);

    public static native void nativeCurveSpeedDestroy(long j);

    private static native int nativeDeleteRTAudioWaveformMgr(long j);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, int i4);

    private static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    private static native int nativeExecuteFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener);

    private static native int nativeExtractVideo(String str, String str2);

    public static native int nativeFindAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3);

    private static native String nativeFindBestRemuxSuffix(String str);

    private static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    private static native int nativeGetAVFileInfoFromXml(String str, int[] iArr);

    private static native Object nativeGetAudioAlgorithmResult(String str, String str2, int i, int i2);

    private static native int nativeGetAudioFileInfo(String str, int[] iArr);

    private static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    private static native double nativeGetAudioVolume(byte[] bArr, int i, int i2, int i3);

    private static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    public static native double nativeGetAveCurveSpeed(long j);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j, long j2);

    private static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    private static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    private static native Object nativeGetFileInfo(String str, int[] iArr);

    private static native int nativeGetFileType(String str);

    private static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    private static native String nativeGetInfostickerConvertTotemplate(String str);

    private static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i);

    private static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    private static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    private static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3);

    private static native int nativeGetVideoFrame2(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrame3(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    private static native int nativeGetVideoFrameData(String str, int i, int i2, int i3, int i4, int i5, Object obj);

    private static native int nativeGetVideoFrameMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj);

    private static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    private static native long nativeInitResampleContext(int i, int i2, int i3, int i4);

    private static native int nativeIsByteVC110Bit(byte[] bArr);

    private static native int nativeIsCanImport(String str);

    private static native int nativeIsCanImportFd(int i, long j, long j2);

    private static native int nativeIsCanTransCode(String str, int i, int i2);

    private static native int nativeIsCanTransCodeWithResult(String str, int i, int i2, String[] strArr);

    private static native boolean nativeIsFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z);

    private static native boolean nativeIsSupportGLES3();

    private static native long nativeLoadModel(int i, String str);

    public static native long nativeMapSeqDeltaToTrimDelta(long j, long j2);

    public static native long nativeMapTrimDeltaToSeqDelta(long j, long j2);

    private static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    private static native int nativeMux(String str, String str2, String str3);

    private static native int nativePcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    private static native int nativeRTAudioWaveformFinish(long j);

    private static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    private static native int nativeRTAudioWaveformReset(long j);

    private static native void nativeReleaseGetFrameHandler(long j);

    private static native int nativeReleaseGetFramesReader();

    private static native void nativeReleaseResampleContext(long j);

    private static native void nativeResetModel(long j);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    private static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    private static native int nativeReverseAllIVideo(String str, String str2);

    private static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    private static native int nativeSaveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4);

    public static native int nativeSetCurveSpeedData(long j, float[] fArr, float[] fArr2);

    public static native void nativeSetSeqDuration(long j, long j2);

    private static native int nativeSplitVideo(String str, String[] strArr, int[] iArr, boolean z);

    private static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    private static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    private static native double nativeVoiceActivityDetection(byte[] bArr, long j, int i, int i2);

    public enum FrameDataType {
        YUV(0),
        Y(1),
        U(2),
        V(3);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        private FrameDataType(int i) {
            this.value = i;
        }
    }

    static {
        TENativeLibsLoader.m234143a();
    }

    public static boolean isSupportGLES3() {
        return nativeIsSupportGLES3();
    }

    public static int releaseGetFramesReader() {
        return nativeReleaseGetFramesReader();
    }

    public static void releaseGetFrameHandler(long j) {
        nativeReleaseGetFrameHandler(j);
    }

    public static void releaseResampleContext(long j) {
        nativeReleaseResampleContext(j);
    }

    public static void resetModel(long j) {
        nativeResetModel(j);
    }

    public static int checkMVResourceIntegrity(String str) {
        return nativeCheckMVResourceIntegrity(str);
    }

    public static long createGetFrameHandler(String str) {
        return nativeCreateGetFrameHandler(str);
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        return nativeDeleteRTAudioWaveformMgr(j);
    }

    public static int getFileType(String str) {
        return nativeGetFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return nativeGetInfostickerConvertTotemplate(str);
    }

    public static int isByteVC110Bit(byte[] bArr) {
        return nativeIsByteVC110Bit(bArr);
    }

    public static int rtAudioWaveformFinish(long j) {
        return nativeRTAudioWaveformFinish(j);
    }

    public static int rtAudioWaveformReset(long j) {
        return nativeRTAudioWaveformReset(j);
    }

    public static int isCanImport(String str) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeIsCanImport(str);
    }

    public static String findBestRemuxSuffix(String str) throws VEException {
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                return nativeFindBestRemuxSuffix;
            }
            throw new VEException(-205, "This file does not support re-packaging for the time being!");
        }
        throw new VEException(-100, "Please check the input parameters!");
    }

    public static int ConverBitmapToRGBA(Bitmap bitmap, String str) {
        return nativeConverBitmapToRGBA(bitmap, str);
    }

    public static int concat(String[] strArr, String str) {
        return nativeConcat(strArr, str, 0);
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        return nativeCreateCurveSpeedUtils(fArr, fArr2);
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        return nativeExecuteFFmpegCommand(str, executeCommandListener);
    }

    public static int extractVideo(String str, String str2) {
        return nativeExtractVideo(str, str2);
    }

    public static int getAVFileInfoFromXml(String str, int[] iArr) {
        return nativeGetAVFileInfoFromXml(str, iArr);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        return nativeGetAudioFileInfo(str, iArr);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        return nativeGetMusicDefaultAlgorithm(str, str2);
    }

    public static Object getVideoFileInfo(String str, int[] iArr) {
        return nativeGetFileInfo(str, iArr);
    }

    public static long loadModel(int i, String str) {
        return nativeLoadModel(i, str);
    }

    public static int reverseAllIVideo(String str, String str2) {
        return nativeReverseAllIVideo(str, str2);
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigs(str, strArr, size);
    }

    public static int clearWavSeg(String str, int i, int i2) {
        return nativeClearWavSeg(str, i, i2);
    }

    public static int executeFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener) {
        return nativeExecuteFFmpegCommandAndDumpInfo(str, executeCommandListener, executeCommandAndDumpInfoListener);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        return nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return nativeIsCanTransCode(str, i, i2);
    }

    public static boolean isFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z) {
        return nativeIsFrameCanDrop(byteBuffer, i, z);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        return nativeMixAudio(arrayList, str, obj);
    }

    public static int mux(String str, String str2, String str3) {
        return nativeMux(str, str2, str3);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        return nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
    }

    public static int concat(String[] strArr, String str, int i) {
        return nativeConcat(strArr, str, i);
    }

    public static int isCanImportFd(int i, long j, long j2) {
        if (i <= 0) {
            return -100;
        }
        return nativeIsCanImportFd(i, j, j2);
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIVideo2(str, str2, tEReverseCallback);
    }

    public static int ConverRGBAToIMG(String str, String str2, int i, int i2) {
        return nativeConverRGBAToIMG(str, str2, i, i2);
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        return nativeConvertJpegToMp4(str, str2, i, z);
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f, int i3) {
        return nativeCreateRTAudioWaveformMgr(i, i2, f, i3);
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        return nativeGenerateMuteWav(str, i, i2, i3);
    }

    public static Object getAudioAlgorithmResult(String str, String str2, int i, int i2) {
        return nativeGetAudioAlgorithmResult(str, str2, i, i2);
    }

    public static double getAudioVolume(byte[] bArr, int i, int i2, int i3) {
        return nativeGetAudioVolume(bArr, i, i2, i3);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        return nativeGetFileAudio(str, str2, arrayList, z);
    }

    public static long initResampleContext(int i, int i2, int i3, int i4) {
        return nativeInitResampleContext(i, i2, i3, i4);
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        return nativeIsCanTransCodeWithResult(str, i, i2, strArr);
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        return nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        return nativeRTAudioWaveformProcess(j, fArr, i, i2);
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return nativeSplitVideo(str, strArr, iArr, z);
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        return nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static double voiceActivityDetection(byte[] bArr, long j, int i, int i2) {
        return nativeVoiceActivityDetection(bArr, j, i, i2);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static int pcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        return nativePcmResampleFilter(j, bArr, bArr2, i, i2);
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        if (nativeGetFrameWithHandler(j, createBitmap, i, iArr[0], iArr[1], z) == 0) {
            return createBitmap;
        }
        if (createBitmap != null && !createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        return null;
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        return nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame2(str, iArr, i, i2, z, obj);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame3(str, iArr, i, i2, z, obj);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3) {
        return nativeGetVideoFrame(str, iArr, i, i2, z, obj, i3);
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, FrameDataType frameDataType, Object obj) {
        return nativeGetVideoFrameData(str, i, i2, i3, i4, frameDataType.getValue(), obj);
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
        }
        return -100;
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        return nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4) {
        return nativeSaveVideoFrames(str, iArr, i, i2, z, str2, i3, i4);
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj) {
        return nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, obj);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, 0);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || strArr.length == 0 || jArr.length != strArr.length || strArr.length != strArr2.length || strArr.length != jArr2.length) {
            C63929ab.m250980d("TEVideoUtils", "ConmatRecordFrag parameter error!");
            return -100;
        }
        File file = new File(str3.substring(0, str3.lastIndexOf("/")));
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(str4.substring(0, str4.lastIndexOf("/")));
            if (file2.exists() || file2.mkdirs()) {
                return nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
            }
            C63929ab.m250980d("TEVideoUtils", "create audio output dir failed. Output audio Directory: " + str4);
            return -114;
        }
        C63929ab.m250980d("TEVideoUtils", "create video output dir failed. Output Video Directory: " + str3);
        return -114;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, int i4) {
        return nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, i4);
    }
}
