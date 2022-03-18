package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C63936ag;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEGestureEvent;
import com.ss.android.vesdk.VEGestureType;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMusicSRTEffectParam;
import com.ss.android.vesdk.VERuntimeConfig;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEStickerAnimator;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.am;
import com.ss.android.vesdk.clipparam.VEAICutOutClipParam;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipAuxiliaryParam;
import com.ss.android.vesdk.clipparam.VEClipParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.clipparam.VEClipVideoFileInfoParam;
import com.ss.android.vesdk.clipparam.VECommonClipParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VEMultiComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoLensOneKeyHdrParam;
import com.ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class TEInterface extends TENativeServiceBase {
    public static boolean m_IsConfigedAB = false;
    private int mHostTrackIndex = -1;
    private long mNative;

    private native int nativeAddAudioTrack(long j, String str, int i, int i2, int i3, int i4, boolean z);

    private native int nativeAddAudioTrack2(long j, String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    private native int nativeAddAudioTrackForClips(long j, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeAddAudioTrackMV(long j, String str, int i, int i2, int i3, int i4, int i5, boolean z, float f);

    private native int nativeAddAudioTrackWithNeedPrepare(long j, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2);

    private native int nativeAddAudioTrackWithStruct(long j, VECommonClipParam vECommonClipParam, boolean z);

    private native int nativeAddClipAuxiliaryParam(long j, int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr);

    private native String nativeAddFileInfoCache(long j, String str);

    private native int[] nativeAddFilters(long j, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6);

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native int nativeAddInfoStickerWithBuffer(long j);

    private native void nativeAddMetaData(long j, String str, String str2);

    private native int nativeAddSubTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddSubTrackMV(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, double d, double d2, double d3, double d4, int i, int i2);

    private native int nativeAddSubVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i);

    private native int nativeAddVideoTrack(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, int i3, boolean[] zArr, float f);

    private native int nativeAddVidoeClipWithAlgorithm(long j, String[] strArr);

    private native int nativeAdjustFilterInOut(long j, int i, int i2, int i3);

    private native int nativeAppendComposerNodes(long j, String[] strArr);

    private static native String nativeAudioExtend(String str, float f, float f2, float f3);

    private static native int nativeAudioHwEncoder(boolean z);

    private native int nativeBegin2DBrush(long j);

    private native int nativeBeginAudioExtendToFile(long j, String str, String str2, String str3, float f, float f2, float f3);

    private native int nativeBeginInfoStickerPin(long j, int i);

    private static native int nativeBingoRefactor(boolean z);

    private native int nativeCancelAudioExtendToFile(long j);

    private native int nativeCancelExtractVideoFrames(long j, int i);

    private native int nativeCancelGetImages(long j);

    private native int nativeCancelInfoStickerPin(long j, int i);

    private native int nativeChangeResWithEffect(long j, boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5);

    private native int nativeChangeTransitonAt(long j, int i, VETransitionFilterParam vETransitionFilterParam);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native int nativeCheckScoresFile(long j, String str);

    private native void nativeClearDisplay(long j, int i);

    private native int nativeClearFilter(long j);

    private native int nativeConcatShootVideo(long j, String str, String[] strArr, long[] jArr, boolean z);

    private static native int nativeConfigMaxCacheFrameCount(int i);

    private native int nativeControlInfoStickerAnimationPreview(long j, boolean z, int i, int i2);

    private native long nativeCreateEngine(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeCreateTimeline(long j);

    private native int nativeDeleteAudioTrack(long j, int i, boolean z);

    private native int nativeDeleteClip(long j, int i, int i2, int i3);

    private native int nativeDeleteKeyFrameParam(long j, int i, int i2, int i3);

    private native int nativeDeleteSubTrack(long j, int i);

    private native int nativeDeleteSubVideoTrack(long j, int i);

    private native int nativeDeleteVideoClipWithAlgorithm(long j, int i);

    private native int nativeDestroyEngine(long j);

    private static native LoudnessDetectResult[] nativeDetectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeDoLensOneKeyHdrDetect(long j);

    private static native int nativeEnableAGFXCtx(boolean z);

    private static native int nativeEnableAndroidHdr2SDRSupport(boolean z);

    private static native int nativeEnableAndroidHdrPreviewSupport(boolean z);

    private static native int nativeEnableAudioDisplayCallBack(boolean z);

    private static native int nativeEnableAudioGBU(boolean z);

    private static native int nativeEnableColorSpace2020(boolean z);

    private static native int nativeEnableCompileGLContextReuse(boolean z);

    private static native int nativeEnableCreateDecoderByName(boolean z);

    private static native int nativeEnableCrossplatformGLBaseFBO(boolean z);

    private static native int nativeEnableDecoderResourceScheduleOptHw(int i);

    private static native int nativeEnableDisplayP3ReEncode(boolean z);

    private static native int nativeEnableDisplayP3Render(boolean z);

    private native int nativeEnableEffect(long j, boolean z);

    private native int nativeEnableEffectAmazing(long j, boolean z);

    private static native int nativeEnableEffectAmazingMV(boolean z);

    private static native int nativeEnableEffectCanvas(boolean z);

    private static native int nativeEnableEffectRenderWithoutGlreadpixels(boolean z);

    private static native int nativeEnableEffectTransiton(boolean z);

    private static native int nativeEnableEngineResourceOpt(boolean z);

    private native int nativeEnableFaceDetect(long j, boolean z);

    private static native int nativeEnableFileInfoCache(boolean z);

    private static native int nativeEnableFirstFrameOpt(boolean z);

    private native int nativeEnableHDRSetting(long j, boolean z);

    private static native int nativeEnableHighSpeed(boolean z);

    private native int nativeEnableHighSpeedForSingle(long j, boolean z);

    private static native int nativeEnableImageAlgorithmReuseAndOptForAmazing(boolean z);

    private native int nativeEnableImageEditor(long j, boolean z);

    private static native int nativeEnableMultiThreadDecode(boolean z);

    private static native int nativeEnableNewAudioMixer(boolean z);

    private static native int nativeEnableOptGLFlush(boolean z);

    private static native int nativeEnableOptPlayBackDropFrame(boolean z);

    private static native int nativeEnableOutResolutionAlign4(boolean z);

    private static native int nativeEnableParallDecodeMatting(boolean z);

    private static native int nativeEnablePinRefactor(boolean z);

    private static native int nativeEnablePipResolutionOpt(boolean z);

    private native void nativeEnableReEncodeOpt(long j, boolean z);

    private static native int nativeEnableReaderRefactor(boolean z);

    private static native int nativeEnableRefaComposer(boolean z);

    private static native int nativeEnableRenderLib(boolean z);

    private static native int nativeEnableSeekAndPreloadOpt(boolean z);

    private static native int nativeEnableSmartTransDetect(boolean z);

    private native int nativeEnd2DBrush(long j, String str);

    private native int nativeExcAICutOutTask(long j);

    private native int nativeExpandTimeline(long j, int i);

    private native int nativeExtractVideoFrames(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeFaceCoverClear(long j, int i, String str, boolean z);

    private native int nativeFaceCoverClearCache(long j);

    private native int nativeFaceCoverLoad(long j, int i, String[] strArr, int i2, String str, boolean z);

    private native int nativeFaceCoverRestoreAll(long j);

    private native int nativeFaceCoverScale(long j, int i, double d, double d2, double d3, String str, boolean z);

    private native int nativeFaceCoverSet(long j, int i, double d, double d2, String str, boolean z);

    private native int nativeFlushSeekCmd(long j);

    private static native int nativeForceCompileBytevc1SWdecode(boolean z);

    private static native int nativeForceEditBytevc1SWdecode(boolean z);

    private native int nativeFrameTrace(long j, String str, int i);

    private native int nativeGenAISolve(long j);

    private native long nativeGenEditorStatus(long j);

    private native int nativeGenRandomSolve(long j);

    private native int nativeGet2DBrushStrokeCount(long j);

    private native List<VEClipParam> nativeGetAllClips(long j, int i, int i2);

    private native List<VEClipVideoFileInfoParam> nativeGetAllVideoFileInfos(long j);

    private native List<VEClipAlgorithmParam> nativeGetAllVideoRangeData(long j);

    private native byte[] nativeGetAudioCommonFilterPreprocessResult(long j, long j2);

    private native String nativeGetClipInfoString(long j, int i, int i2, int i3);

    private native String nativeGetClipInfoStringWithPath(long j, int i, int i2, int i3, String str);

    private native String nativeGetClipPath(long j, int i);

    private native float nativeGetClipProgress(long j, int i);

    private native long nativeGetClipSequenceOut(long j, int i, int i2, int i3);

    private native float nativeGetColorFilterIntensity(long j, String str);

    private native int nativeGetCurPosition(long j);

    private native int nativeGetCurState(long j);

    private native int[] nativeGetDecodeDumpInfo(long j, int i, int i2);

    private native int nativeGetDecodeImage(long j, Bitmap bitmap, int i, int i2);

    private native int[] nativeGetDisplayDumpSize(long j);

    private native int nativeGetDisplayImage(long j, Bitmap bitmap);

    private native int nativeGetDuration(long j);

    private native long nativeGetDurationUs(long j);

    private native int nativeGetImages(long j, int[] iArr, int i, int i2, int i3);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i);

    private native float[] nativeGetInfoStickerBoundingBoxWithoutRotate(long j, int i);

    private native int nativeGetInfoStickerFlip(long j, int i, boolean[] zArr);

    private native int nativeGetInfoStickerPinData(long j, int i, ByteBuffer[] byteBufferArr);

    private native int nativeGetInfoStickerPinState(long j, int i);

    private native int nativeGetInfoStickerPosition(long j, int i, float[] fArr);

    private native float nativeGetInfoStickerRotate(long j, int i);

    private native float nativeGetInfoStickerScale(long j, int i);

    private native String nativeGetInfoStickerTemplateParam(long j, int i);

    private native String nativeGetInfoStickerTemplateParamWithPath(long j, String str);

    private native boolean nativeGetInfoStickerVisible(long j, int i);

    private native int[] nativeGetInitResolution(long j);

    private static native Object nativeGetMVInfoStatic(String str);

    private native Object nativeGetMVOriginalBackgroundAudio(long j);

    private native String nativeGetMetaData(long j, String str);

    private native long nativeGetPCMDeliverHandle(long j);

    private native int nativeGetProcessedImage(long j, Bitmap bitmap);

    private native float nativeGetProjectProgress(long j);

    private native int nativeGetRuntimeGLVersion(long j);

    private native Object nativeGetServerAlgorithmConfig(long j);

    private native int nativeGetSingleTrackProcessedImage(long j, int i, Bitmap bitmap);

    private native int nativeGetSrtInfoStickerInitPosition(long j, int i, float[] fArr);

    private native int nativeGetSubTrackFilter(long j, int i);

    private native int nativeGetTextContentCallback(long j, NativeCallbacks.OnARTextContentCallback onARTextContentCallback);

    private native int nativeGetTextLimitCount(long j);

    private native int nativeGetTimeEffectCurPosition(long j);

    private native int nativeGetTimeEffectDuration(long j);

    private native float nativeGetTrackVolume(long j, int i, int i2, int i3);

    private native int nativeGetTransparentImage(long j, Bitmap bitmap);

    private native int nativeInitAudioEditor(long j, String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr);

    private native int nativeInitAudioExtendToFile(long j);

    private native int nativeInitBingoAlgorithm(long j);

    private native int nativeInitImageEditor(long j, Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i);

    private native Object nativeInitMVResources(long j, String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4);

    private native int nativeInitVideoEditor(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i);

    private native int nativeInitVideoEditor2(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z);

    private native int nativeInitVideoEditor2LoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorLoadCache(long j, String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorMV(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z);

    private native int nativeInitVideoEditorMVLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5);

    private native int nativeInitVideoEditorWithAlgorithm(long j, String[] strArr, int i);

    private native int nativeInitVideoEditorWithAlgorithmLoadCache(long j, String[] strArr, int i, boolean[] zArr, String[] strArr2);

    private native int nativeInitVideoEditorWithCanvas(long j, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i, VESize[] vESizeArr);

    private native int nativeInitVideoEditorWithStruct(long j, VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i);

    private native int nativeInsertClip(long j, int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native boolean nativeIsAudioExtendToFileProcessing(long j);

    private native int nativeIsCompileEncode(long j);

    private native boolean nativeIsGestureRegistered(long j, int i);

    private native boolean nativeIsInfoStickerAnimatable(long j, int i);

    private native int nativeIsWatermarkCompileEncode(long j);

    private native int nativeLockSeekVideoClip(long j, int i);

    private native int nativeMoveClip(long j, int i, int i2, int i3, boolean z);

    private native int nativeMoveVideoClipWithAlgorithm(long j, int i, int i2);

    private native int nativeNotifyHideKeyBoard(long j, boolean z);

    private static native int nativeOpenEditorFpsLog(boolean z);

    private static native int nativeOpenOutputCallback(boolean z);

    private native int nativePause(long j, int i);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseInfoStickerAnimation(long j, boolean z);

    private native int nativePauseSync(long j);

    private native int nativePrepareEngine(long j, int i);

    private native int nativePreprocessAudioTrackForFilter(long j, int i, int i2, String str, byte[] bArr, long[] jArr);

    private native int nativeProcessBingoFrames(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str);

    private native int nativeProcessDoubleClickEvent(long j, float f, float f2);

    private native int nativeProcessLongPressEvent(long j, float f, float f2);

    private native int nativeProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeProcessRotationEvent(long j, float f, float f2);

    private native int nativeProcessScaleEvent(long j, float f, float f2);

    private native int nativeProcessTouchDownEvent(long j, float f, float f2, int i);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native boolean nativeProcessTouchEvent2(long j, int i, float f, float f2, float f3, float f4, int i2, int i3);

    private native int nativeProcessTouchMoveEvent(long j, float f, float f2);

    private native int nativeProcessTouchUpEvent(long j, float f, float f2, int i);

    private native int nativePushImageToBuffer(long j, String str);

    private native int nativeRefreshCurrentFrame(long j, int i);

    private native int nativeReleaseEngine(long j);

    private native int nativeReleaseEngineAsync(long j);

    private native void nativeReleasePreviewSurface(long j);

    private native int nativeReloadComposerNodes(long j, String[] strArr);

    private native int nativeRemoveAICutOutClipParam(long j, int i);

    private native int nativeRemoveAllVideoSound(long j);

    private native int nativeRemoveComposerNodes(long j, String[] strArr);

    private native int nativeRemoveEffectCallback(long j);

    private native int nativeRemoveFilter(long j, int[] iArr);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveInfoStickerWithBuffer(long j, int i);

    private native int nativeRemoveMusic(long j, int i);

    private native int nativeReplaceClip(long j, int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam);

    private native int nativeReplaceComposerNodesWithTag(long j, String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native void nativeResetCallback(long j);

    private native int nativeRestoreAllVideoSound(long j);

    private native int nativeRestoreInfoStickerPinWithJson(long j, int i, ByteBuffer byteBuffer, int i2);

    private native int nativeSeek(long j, int i, int i2, int i3, int i4);

    private static native int nativeSeekPredictOpt(boolean z);

    private native int nativeSeekWithResult(long j, int i);

    private native int nativeSeekWithTolerance(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeSet2DBrushCanvasColor(long j, float f);

    private native int nativeSet2DBrushColor(long j, float f, float f2, float f3, float f4);

    private native int nativeSet2DBrushSize(long j, float f);

    private native int nativeSetAIRotation(long j, int i, int i2);

    private native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    private native int nativeSetAlgorithmSyncAndNum(long j, boolean z, int i);

    private native int nativeSetAudioBeatAlgorithmResult(long j, VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult);

    private native void nativeSetBackGroundColor(long j, int i);

    private native int nativeSetClientState(long j, int i);

    private native int nativeSetClipAttr(long j, int i, int i2, int i3, String str, String str2);

    private native int nativeSetCompileAudioDriver(long j, String str, int i, int i2, String str2);

    private static native int nativeSetCompileReport(int i);

    private native int nativeSetComposerMode(long j, int i, int i2);

    private native int nativeSetComposerNodes(long j, String[] strArr);

    private native int nativeSetDestroyVersion(long j, boolean z);

    private native int nativeSetDeviceRotation(long j, float[] fArr, double d);

    private native void nativeSetDisplayState(long j, float f, float f2, float f3, float f4, int i, int i2, int i3);

    private native int nativeSetDldEnabled(long j, boolean z);

    private native int nativeSetDldThrVal(long j, int i);

    private native int nativeSetDleEnabled(long j, boolean z);

    private native int nativeSetDleEnabledPreview(long j, boolean z);

    private static native int nativeSetDropFrameParam(boolean z, long j, long j2);

    private static native int nativeSetEditorFirstFrameDelay(int i);

    private native int nativeSetEffectBgmEnable(long j, boolean z);

    private native int nativeSetEffectCacheInt(long j, String str, int i);

    private native int nativeSetEffectCallback(long j, VEListener.VEEditorEffectListener vEEditorEffectListener);

    private native int nativeSetEffectFontPath(long j, String str, int i);

    private native int nativeSetEffectInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetEffectMaxMemoryCache(long j, int i);

    private native int nativeSetEffectParams(long j, VEEffectParams vEEffectParams);

    private native void nativeSetEnableMultipleAudioFilter(long j, boolean z);

    private native void nativeSetEnableRemuxVideo(long j, boolean z);

    private native void nativeSetEncoderParallel(long j, boolean z);

    private native void nativeSetExpandLastFrame(long j, boolean z);

    private native int nativeSetExternalAlgorithmResult(long j, String str, String str2, String str3, int i);

    private native int nativeSetFilterParam(long j, int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam);

    private native int nativeSetFilterParam(long j, int i, String str, VEStickerAnimator vEStickerAnimator);

    private native int nativeSetFilterParam(long j, int i, String str, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeSetFilterParam(long j, int i, String str, String str2);

    private native int nativeSetFilterParam2(long j, int i, String str, byte[] bArr);

    private static native int nativeSetForceDropFrameWithoutAudio(boolean z);

    private static native int nativeSetImageBufferLimit(int i, int i2, int i3);

    private native int nativeSetInfoStickerAnimationParam(long j, int i, boolean z, String str, int i2, String str2, int i3, int i4);

    private native int nativeSetInfoStickerAnimationPreview(long j, int i, boolean z);

    private native int nativeSetInfoStickerBufferCallback(long j, VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener);

    private native int nativeSetInfoStickerCallSync(long j, boolean z);

    private native int nativeSetInfoStickerFlip(long j, int i, boolean z, boolean z2);

    private native int nativeSetInfoStickerRestoreMode(long j, int i);

    private native float nativeSetInfoStickerScale(long j, int i, float f);

    private static native int nativeSetInfoStickerTransEnable(boolean z);

    private native int nativeSetInterimScoresToFile(long j, String str);

    private native int nativeSetKeyFrameParam(long j, int i, int i2, int i3, String str);

    private native int nativeSetLanguage(long j, String str);

    private native int nativeSetMVDataJson(long j, String str);

    private native int nativeSetMaleMakeupState(long j, boolean z);

    private static native int nativeSetMaxAudioReaderCount(int i);

    private static native void nativeSetMaxDetectFrameCount(int i);

    private static native int nativeSetMaxSoftwareVideoReaderCount(int i, int i2, int i3, int i4);

    private native int nativeSetMusicAndResult(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4);

    private native int nativeSetMusicAndResultLoadCache(long j, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr);

    private native int nativeSetMusicCropRatio(long j, int i);

    private static native int nativeSetOptVersion(int i);

    private native void nativeSetOption(long j, int i, String str, float f);

    private native void nativeSetOption(long j, int i, String str, long j2);

    private native void nativeSetOption(long j, int i, String str, String str2);

    private native void nativeSetOptionArray(long j, int i, String[] strArr, long[] jArr);

    private native void nativeSetOptionIntArray(long j, int i, String str, int[] iArr);

    private native void nativeSetPreviewFps(long j, int i);

    private native int nativeSetPreviewScaleMode(long j, int i);

    private native void nativeSetPreviewSurface(long j, Surface surface);

    private native void nativeSetPreviewSurfaceBitmap(long j, Bitmap bitmap);

    private native void nativeSetSpeedRatio(long j, float f);

    private native int nativeSetStickerPinArea(long j, int i, VEStickerPinAreaParam vEStickerPinAreaParam);

    private native int nativeSetSubTrackSeqIn(long j, int i, int i2, int i3);

    private native void nativeSetSurfaceSize(long j, int i, int i2);

    private native int nativeSetTextBitmapCallback(long j, NativeCallbacks.OnARTextBitmapCallback onARTextBitmapCallback);

    private static native int nativeSetTexturePoolLimit(int i, int i2);

    private native int nativeSetTimeRange(long j, int i, int i2, int i3);

    private native int nativeSetTrackDurationType(long j, int i, int i2, int i3);

    private native int nativeSetTrackFilterEnable(long j, int i, boolean z, boolean z2);

    private native int nativeSetTrackLayer(long j, int i, int i2, int i3);

    private native int nativeSetTrackMinMaxDuration(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetTrackVolume(long j, int i, int i2, float f);

    private native int nativeSetTransitionAt(long j, int i, long j2, String str);

    private native void nativeSetVideoBackGroundColor(long j, int i);

    private native void nativeSetViewPort(long j, int i, int i2, int i3, int i4);

    private native void nativeSetWaterMark(long j, VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask);

    private native int nativeStart(long j);

    private native int nativeStartEffectMonitor(long j);

    private native int nativeStop(long j);

    private native int nativeStopEffectMonitor(long j);

    private native int nativeStopInfoStickerPin(long j, int i);

    private native boolean nativeSuspendGestureRecognizer(long j, int i, boolean z);

    private native int nativeSwitchResourceLoadMode(long j, boolean z, int i);

    private native int nativeUndo2DBrush(long j);

    private native int nativeUninitAudioExtendToFile(long j);

    private native int nativeUpdateAICutOutClipParam(long j, int i, int i2, VEAICutOutClipParam vEAICutOutClipParam);

    private native int nativeUpdateAlgorithmFromNormal(long j);

    private native int nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native int nativeUpdateAmazingFilterParam(long j, int i, int i2, VEAmazingFilterParam vEAmazingFilterParam);

    private native int nativeUpdateAudioDspFilterParam(long j, int i, int i2, VEAudioDspFilterParam vEAudioDspFilterParam);

    private native int nativeUpdateAudioEffectFilterParam(long j, int i, int i2, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j, int i, int i2, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioLoudnessBalanceFilterParam(long j, int i, int i2, VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter);

    private native int nativeUpdateAudioNoiseFilterParam(long j, int i, int i2, VEAudioNoiseFilterParam vEAudioNoiseFilterParam);

    private native int nativeUpdateAudioTrack(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private native int nativeUpdateAudioTrack2(long j, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7);

    private native int nativeUpdateAudioVolumeFilterParam(long j, int i, int i2, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    private native int nativeUpdateBeautyFilterParam(long j, int i, int i2, VEBeautyFilterParam vEBeautyFilterParam);

    private native int nativeUpdateCanvasFilterParam(long j, int i, int i2, VECanvasFilterParam vECanvasFilterParam);

    private native int nativeUpdateCanvasResolution(long j, int i, int i2);

    private native int nativeUpdateClipsSourceParam(long j, int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr);

    private native int nativeUpdateClipsTimelineParam(long j, int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr);

    private native int nativeUpdateColorAdjustHslFilterParam(long j, int i, int i2, VEColorHslFilterParam vEColorHslFilterParam);

    private native int nativeUpdateColorFilterParam(long j, int i, int i2, VEColorFilterParam vEColorFilterParam);

    private native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateCropFilterParam(long j, int i, int i2, VEVideoCropFilterParam vEVideoCropFilterParam);

    private native int nativeUpdateEffectComposerParam(long j, int i, int i2, VEComposerFilterParam vEComposerFilterParam);

    private native int nativeUpdateEffectFilterParam(long j, int i, int i2, VEEffectFilterParam vEEffectFilterParam);

    private native int nativeUpdateEffectHdrFilterParam(long j, int i, int i2, VEEffectHdrFilterParam vEEffectHdrFilterParam);

    private native int nativeUpdateFilterTime(long j, int i, int i2, int i3, int i4);

    private native int nativeUpdateImageAddFilterParam(long j, int i, int i2, VEImageAddFilterParam vEImageAddFilterParam);

    private native int nativeUpdateImageTransformFilterParam(long j, int i, int i2, VEImageTransformFilterParam vEImageTransformFilterParam);

    private native int nativeUpdateLensOneKeyHdrFilterParam(long j, int i, int i2, VEVideoLensOneKeyHdrParam vEVideoLensOneKeyHdrParam);

    private native int nativeUpdateMultiComposerNodes(long j, int i, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeUpdateMultiEffectComposerParam(long j, int i, int i2, VEMultiComposerFilterParam vEMultiComposerFilterParam);

    private native int nativeUpdateQualityFilterParam(long j, int i, int i2, VEVideoAjustmentFilterParam vEVideoAjustmentFilterParam);

    private native int nativeUpdateReshapeFilterParam(long j, int i, int i2, VEReshapeFilterParam vEReshapeFilterParam);

    private native int nativeUpdateScene(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native int nativeUpdateSceneFileOrder(long j, int[] iArr);

    private native int nativeUpdateSceneLoadCache(long j, String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2);

    private native int nativeUpdateSceneTime(long j, boolean[] zArr, int[] iArr, int[] iArr2, int[] iArr3, double[] dArr);

    private native int nativeUpdateTextSticker(long j, int i, String str);

    private native int nativeUpdateTrackClip(long j, int i, int i2, String[] strArr);

    private native int nativeUpdateTrackFilter(long j, int i, int i2, boolean z);

    private native int nativeUpdateTrackFilterDuration(long j, int i, int i2, boolean z, long j2);

    private native int nativeUpdateVideoStabFilterParam(long j, int i, int i2, VEVideoStableFilterParam vEVideoStableFilterParam);

    private native int nativeUpdateVideoTransformFilterParam(long j, int i, int i2, VEVideoTransformFilterParam vEVideoTransformFilterParam);

    public native int nativeSetAudioOffset(long j, int i, int i2);

    public native String stringFromJNI();

    public int getHostTrackIndex() {
        return this.mHostTrackIndex;
    }

    public long getNativeHandler() {
        return this.mNative;
    }

    static {
        TENativeLibsLoader.m234143a();
    }

    public static TEInterface createEngine() {
        return createEngine((VEUserConfig) null);
    }

    public int cancelAudioExtendToFile() {
        return nativeCancelAudioExtendToFile(this.mNative);
    }

    public int cancelGetImages() {
        return nativeCancelGetImages(this.mNative);
    }

    public long genEditorStatus() {
        return nativeGenEditorStatus(this.mNative);
    }

    public boolean isAudioExtendToFileProcessing() {
        return nativeIsAudioExtendToFileProcessing(this.mNative);
    }

    public int uninitAudioExtendToFile() {
        return nativeUninitAudioExtendToFile(this.mNative);
    }

    public int addInfoStickerWithBuffer() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoStickerWithBuffer(j);
    }

    public int begin2DBrush() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeBegin2DBrush(j);
    }

    public int clearFilter() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeClearFilter(j);
    }

    public int createTimeline() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeCreateTimeline(j);
    }

    public int doLensOneKeyHdrDetect() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDoLensOneKeyHdrDetect(j);
    }

    public int excAICutOutTask() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeExcAICutOutTask(j);
    }

    public int faceCoverClearCache() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverClearCache(j);
    }

    public int faceCoverRestoreAll() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverRestoreAll(j);
    }

    public int flushSeekCmd() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFlushSeekCmd(j);
    }

    public int genAISolve() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGenAISolve(j);
    }

    public int get2DBrushStrokeCount() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGet2DBrushStrokeCount(j);
    }

    public List<VEClipVideoFileInfoParam> getAllVideoFileInfos() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllVideoFileInfos(j);
    }

    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllVideoRangeData(j);
    }

    public int getCurPosition() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetCurPosition(j);
    }

    public int getCurState() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetCurState(j);
    }

    public int getDuration() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetDuration(j);
    }

    public long getDurationUs() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeGetDurationUs(j);
    }

    public long getPCMDeliverHandle() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetPCMDeliverHandle(j);
    }

    public float getProjectMattingProgress() {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetProjectProgress(j);
    }

    public int getRandomSolve() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGenRandomSolve(j);
    }

    public int getRuntimeGLVersion() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetRuntimeGLVersion(j);
    }

    public int getTextLimitCount() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetTextLimitCount(j);
    }

    public int initAudioExtendToFile() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInitAudioExtendToFile(j);
    }

    public int initBingoAlgorithm() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInitBingoAlgorithm(j);
    }

    public int isCompileEncode() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeIsCompileEncode(j);
    }

    public int isWatermarkCompileEncode() {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeIsWatermarkCompileEncode(j);
    }

    public int pauseSync() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePauseSync(j);
    }

    public int releaseEngine() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReleaseEngine(j);
    }

    public int releaseEngineAsync() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReleaseEngineAsync(j);
    }

    public void releasePreviewSurface() {
        long j = this.mNative;
        if (j != 0) {
            nativeReleasePreviewSurface(j);
        }
    }

    public int removeAllVideoSound() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveAllVideoSound(j);
    }

    public int removeEffectCallback() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveEffectCallback(j);
    }

    public int restoreAllVideoSound() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRestoreAllVideoSound(j);
    }

    public int start() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeStart(j);
    }

    public int startEffectMonitor() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeStartEffectMonitor(j);
        return 0;
    }

    public int stop() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeStop(j);
    }

    public int stopEffectMonitor() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeStopEffectMonitor(j);
        return 0;
    }

    public int undo2DBrush() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUndo2DBrush(j);
    }

    public int updateAlgorithmFromNormal() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAlgorithmFromNormal(j);
    }

    private TEInterface() {
        if (!m_IsConfigedAB) {
            configABforEditor();
            m_IsConfigedAB = true;
        }
    }

    public int destroyEngine() {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeDestroyEngine = nativeDestroyEngine(j);
        this.mNative = 0;
        return nativeDestroyEngine;
    }

    public int[] getInitResolution() {
        int[] iArr = {-1, -1, -1, -1};
        long j = this.mNative;
        if (j == 0) {
            return iArr;
        }
        return nativeGetInitResolution(j);
    }

    public Object getMVOriginalBackgroundAudio() {
        long j = this.mNative;
        if (j != 0) {
            return nativeGetMVOriginalBackgroundAudio(j);
        }
        C63929ab.m250980d("TEInterface", "getMVOriginalBackgroundAudio error, mNative == 0");
        return null;
    }

    public Object getServerAlgorithmConfig() {
        long j = this.mNative;
        if (j != 0) {
            return nativeGetServerAlgorithmConfig(j);
        }
        C63929ab.m250980d("TEInterface", "getServerAlgorithmConfig error, mNative == 0");
        return null;
    }

    public C63936ag getDisplayRect() {
        long j = this.mNative;
        if (j == 0) {
            return new C63936ag(0, 0, 0, 0);
        }
        int[] nativeGetDisplayDumpSize = nativeGetDisplayDumpSize(j);
        return new C63936ag(nativeGetDisplayDumpSize[0], nativeGetDisplayDumpSize[1], nativeGetDisplayDumpSize[2], nativeGetDisplayDumpSize[3]);
    }

    private void configABforEditor() {
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        boolean booleanValue4;
        boolean booleanValue5;
        boolean booleanValue6;
        boolean booleanValue7;
        boolean booleanValue8;
        boolean booleanValue9;
        int intValue;
        boolean booleanValue10;
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("mv_use_amazing_engine");
        if (a != null && a.mo220637a() != null && (a.mo220637a() instanceof Boolean) && (booleanValue10 = ((Boolean) a.mo220637a()).booleanValue())) {
            enableEffectAmazingMV(booleanValue10);
        }
        VEConfigCenter.C63827a a2 = VEConfigCenter.m250617a().mo220631a("vesdk_max_cache_count");
        if (a2 != null && a2.mo220637a() != null && (a2.mo220637a() instanceof Integer) && (intValue = ((Integer) a2.mo220637a()).intValue()) > 0) {
            configMaxCacheFrameCount(intValue);
        }
        VEConfigCenter.C63827a a3 = VEConfigCenter.m250617a().mo220631a("vesdk_seek_predict_opt");
        if (a3 != null && a3.mo220637a() != null && (a3.mo220637a() instanceof Boolean) && (booleanValue9 = ((Boolean) a3.mo220637a()).booleanValue())) {
            enableSeekPredictOpt(booleanValue9);
        }
        VEConfigCenter.C63827a a4 = VEConfigCenter.m250617a().mo220631a("create_by_codec_name");
        if (a4 != null && a4.mo220637a() != null && (a4.mo220637a() instanceof Boolean) && (booleanValue8 = ((Boolean) a4.mo220637a()).booleanValue())) {
            enableCreateDecoderByName(booleanValue8);
        }
        VEConfigCenter.C63827a a5 = VEConfigCenter.m250617a().mo220631a("enable_android_hdr2sdr_support");
        if (!(a5 == null || a5.mo220637a() == null || !(a5.mo220637a() instanceof Boolean))) {
            boolean booleanValue11 = ((Boolean) a5.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "enableAndroidHdr2SdrSupport: " + booleanValue11);
            if (booleanValue11) {
                enableAndroidHdr2SDRSupport(booleanValue11);
            }
        }
        VEConfigCenter.C63827a a6 = VEConfigCenter.m250617a().mo220631a("enable_android_hdr_preview_support");
        if (a6 != null && a6.mo220637a() != null && (a6.mo220637a() instanceof Boolean) && (booleanValue7 = ((Boolean) a6.mo220637a()).booleanValue())) {
            enableAndroidHdr2SDRSupport(booleanValue7);
        }
        VEConfigCenter.C63827a a7 = VEConfigCenter.m250617a().mo220631a("ve_force_edit_bytevc1_swdecode");
        if (!(a7 == null || a7.mo220637a() == null || !(a7.mo220637a() instanceof Boolean))) {
            boolean booleanValue12 = ((Boolean) a7.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "forceEditBytevc1SWdecode: " + booleanValue12);
            if (booleanValue12) {
                forceEditBytevc1SWdecode(booleanValue12);
            }
        }
        VEConfigCenter.C63827a a8 = VEConfigCenter.m250617a().mo220631a("ve_force_compile_bytevc1_swdecode");
        if (!(a8 == null || a8.mo220637a() == null || !(a8.mo220637a() instanceof Boolean))) {
            boolean booleanValue13 = ((Boolean) a8.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "forceCompileBytevc1SWdecode: " + booleanValue13);
            if (booleanValue13) {
                forceCompileBytevc1SWdecode(booleanValue13);
            }
        }
        VEConfigCenter.C63827a a9 = VEConfigCenter.m250617a().mo220631a("vesdk_audiomix_replace");
        if (a9 != null && a9.mo220637a() != null && (a9.mo220637a() instanceof Boolean) && (booleanValue6 = ((Boolean) a9.mo220637a()).booleanValue())) {
            enableNewAudioMixer(booleanValue6);
        }
        VEConfigCenter.C63827a a10 = VEConfigCenter.m250617a().mo220631a("ve_color_space_for_2020");
        if (a10 != null && a10.mo220637a() != null && (a10.mo220637a() instanceof Boolean) && (booleanValue5 = ((Boolean) a10.mo220637a()).booleanValue())) {
            enableColorSpace2020(booleanValue5);
        }
        VEConfigCenter.C63827a a11 = VEConfigCenter.m250617a().mo220631a("ve_enable_bingo_refactor");
        if (a11 != null && a11.mo220637a() != null && (a11.mo220637a() instanceof Boolean) && (booleanValue4 = ((Boolean) a11.mo220637a()).booleanValue())) {
            VERuntimeConfig.f161379d = true;
            enableBingoRefactor(booleanValue4);
        }
        VEConfigCenter.C63827a a12 = VEConfigCenter.m250617a().mo220631a("vesdk_audio_hw_encoder");
        if (a12 != null && a12.mo220637a() != null && (a12.mo220637a() instanceof Boolean) && (booleanValue3 = ((Boolean) a12.mo220637a()).booleanValue())) {
            enableAudioHwEncoder(booleanValue3);
        }
        VEConfigCenter.C63827a a13 = VEConfigCenter.m250617a().mo220631a("crossplat_glbase_fbo");
        if (!(a13 == null || a13.mo220637a() == null || !(a13.mo220637a() instanceof Boolean))) {
            boolean booleanValue14 = ((Boolean) a13.mo220637a()).booleanValue();
            C63929ab.m250980d("TEInterface", "KEY_CROSSPLAT_GLBASE_FBO: " + booleanValue14);
            if (booleanValue14) {
                enableCrossplatformGLBaseFBO(booleanValue14);
            }
        }
        VEConfigCenter.C63827a a14 = VEConfigCenter.m250617a().mo220631a("enable_render_lib");
        if (!(a14 == null || a14.mo220637a() == null || !(a14.mo220637a() instanceof Boolean))) {
            boolean booleanValue15 = ((Boolean) a14.mo220637a()).booleanValue();
            C63929ab.m250980d("TEInterface", "KEY_ENABLE_RENDER_LIB: " + booleanValue15);
            if (booleanValue15) {
                enableRenderLib(booleanValue15);
            }
        }
        VEConfigCenter.C63827a a15 = VEConfigCenter.m250617a().mo220631a("vesdk_use_agfxcontext");
        if (!(a15 == null || a15.mo220637a() == null || !(a15.mo220637a() instanceof Boolean))) {
            boolean booleanValue16 = ((Boolean) a15.mo220637a()).booleanValue();
            C63929ab.m250980d("TEInterface", "KEY_ENABLE_AGFX_CTX: " + booleanValue16);
            if (booleanValue16) {
                enableAGFXCtx(booleanValue16);
            }
        }
        VEConfigCenter.C63827a a16 = VEConfigCenter.m250617a().mo220631a("vesdk_enable_reader_refactor");
        if (a16 != null && a16.mo220637a() != null && (a16.mo220637a() instanceof Boolean) && (booleanValue2 = ((Boolean) a16.mo220637a()).booleanValue())) {
            enableReaderRefactor(booleanValue2);
        }
        VEConfigCenter.C63827a a17 = VEConfigCenter.m250617a().mo220631a("ve_enable_engine_resource_opt");
        if (!(a17 == null || a17.mo220637a() == null || !(a17.mo220637a() instanceof Boolean))) {
            enableEngineResourceOpt(((Boolean) a17.mo220637a()).booleanValue());
        }
        VEConfigCenter.C63827a a18 = VEConfigCenter.m250617a().mo220631a("ve_enable_decoder_schedule_opt_hw");
        if (!(a18 == null || a18.mo220637a() == null || !(a18.mo220637a() instanceof Integer))) {
            Integer num = (Integer) a18.mo220637a();
            if (num.intValue() > 0) {
                VEConfigCenter.m250617a().mo220635b("ve_enable_engine_resource_opt", (Object) true);
                enableEngineResourceOpt(true);
                VEConfigCenter.m250617a().mo220635b("vesdk_enable_reader_refactor", (Object) true);
                enableReaderRefactor(true);
                enableDecoderResourceScheduleOptHw(num.intValue());
            }
        }
        VEConfigCenter.m250617a().mo220631a("ve_enable_audio_gbu_refactor");
        enableAudioGBU(true);
        VEConfigCenter.C63827a a19 = VEConfigCenter.m250617a().mo220631a("ve_enable_render_encode_resolution_align4");
        if (a19 != null && a19.mo220637a() != null && (a19.mo220637a() instanceof Boolean) && ((Boolean) a19.mo220637a()).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C63929ab.m250974a("TEInterface", "enableRenderEncodeAlign4: true");
            enableOutResolutionAlign4(true);
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        VEConfigCenter.C63827a a20 = VEConfigCenter.m250617a().mo220631a("ve_enable_pin_refactor");
        if (a20 != null && a20.mo220637a() != null && (a20.mo220637a() instanceof Boolean) && (booleanValue = ((Boolean) a20.mo220637a()).booleanValue())) {
            enablePinRefactor(booleanValue);
        }
        VEConfigCenter.C63827a a21 = VEConfigCenter.m250617a().mo220631a("ve_enable_hwdecode_playback_dropframe_opt");
        if (!(a21 == null || a21.mo220637a() == null || !(a21.mo220637a() instanceof Boolean))) {
            boolean booleanValue17 = ((Boolean) a21.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "hwdecodePlaybackDropFrameOpt: " + booleanValue17);
            if (booleanValue17) {
                enableOptPlayBackDropFrame(booleanValue17);
            }
        }
        VEConfigCenter.C63827a a22 = VEConfigCenter.m250617a().mo220631a("ve_enable_mpeg24vp89_hwdecoder2");
        if (!(a22 == null || a22.mo220637a() == null || !(a22.mo220637a() instanceof Boolean))) {
            boolean booleanValue18 = ((Boolean) a22.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "enableMpeg24VP89HWDecoder: " + booleanValue18);
            if (booleanValue18) {
                VERuntime.m251382a().mo221790h(booleanValue18);
            }
        }
        VEConfigCenter.C63827a a23 = VEConfigCenter.m250617a().mo220631a("ve_enable_glflush_opt");
        if (!(a23 == null || a23.mo220637a() == null || !(a23.mo220637a() instanceof Boolean))) {
            boolean booleanValue19 = ((Boolean) a23.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "glFlushOpt: " + booleanValue19);
            if (booleanValue19) {
                enableOptGlFlush(booleanValue19);
            }
        }
        VEConfigCenter.C63827a a24 = VEConfigCenter.m250617a().mo220631a("vesdk_high_speed_change_opt");
        if (!(a24 == null || a24.mo220637a() == null || !(a24.mo220637a() instanceof Boolean))) {
            boolean booleanValue20 = ((Boolean) a24.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "highSpeedChangeOpt: " + booleanValue20);
            if (booleanValue20) {
                enableHighSpeed(booleanValue20);
            }
        }
        VEConfigCenter.C63827a a25 = VEConfigCenter.m250617a().mo220631a("ve_enable_p3_re_encode");
        if (!(a25 == null || a25.mo220637a() == null || !(a25.mo220637a() instanceof Boolean))) {
            boolean booleanValue21 = ((Boolean) a25.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "p3ReEncodeOpt: " + booleanValue21);
            if (booleanValue21) {
                enableDisplayP3ReEncode(booleanValue21);
            }
        }
        VEConfigCenter.C63827a a26 = VEConfigCenter.m250617a().mo220631a("ve_enable_imageAlgorithmReuseAndOptForAmazing");
        if (!(a26 == null || a26.mo220637a() == null || !(a26.mo220637a() instanceof Boolean))) {
            boolean booleanValue22 = ((Boolean) a26.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "imageAlgorithmReuseAndOptForAmazing: " + booleanValue22);
            if (booleanValue22) {
                enableImageAlgorithmReuseAndOptForAmazing(booleanValue22);
            }
        }
        VEConfigCenter.C63827a a27 = VEConfigCenter.m250617a().mo220631a("ve_enable_parallelDecodeMatting");
        if (!(a27 == null || a27.mo220637a() == null || !(a27.mo220637a() instanceof Boolean))) {
            boolean booleanValue23 = ((Boolean) a27.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "parall Encode Matting: " + booleanValue23);
            if (booleanValue23) {
                enableParallDecodeMatting(booleanValue23);
            }
        }
        VEConfigCenter.C63827a a28 = VEConfigCenter.m250617a().mo220631a("ve_enable_pip_resolution_opt");
        if (!(a28 == null || a28.mo220637a() == null || !(a28.mo220637a() instanceof Boolean))) {
            boolean booleanValue24 = ((Boolean) a28.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "pip resolution opt: " + booleanValue24);
            if (booleanValue24) {
                enablePipResolutionOpt(booleanValue24);
            }
        }
        VEConfigCenter.C63827a a29 = VEConfigCenter.m250617a().mo220631a("ve_hardware_encode_fallback");
        if (!(a29 == null || a29.mo220637a() == null || !(a29.mo220637a() instanceof Integer))) {
            Integer num2 = (Integer) a29.mo220637a();
            if (num2.intValue() != 0) {
                C63929ab.m250978c("TEInterface", "ATTENTION!!! TESTING, HARDWARE ENCODE WILL FALLBACK TO SOFT, MODE = " + num2);
                VERuntimeConfig.f161380e = num2.intValue();
            }
        }
        VEConfigCenter.C63827a a30 = VEConfigCenter.m250617a().mo220631a("ve_enable_effect_render_without_glreadpixels");
        if (!(a30 == null || a30.mo220637a() == null || !(a30.mo220637a() instanceof Boolean))) {
            boolean booleanValue25 = ((Boolean) a30.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "effect render without glreadpixels: " + booleanValue25);
            if (booleanValue25) {
                enableEffectRenderWithoutGlreadpixels(booleanValue25);
            }
        }
        VEConfigCenter.C63827a a31 = VEConfigCenter.m250617a().mo220631a("ve_smart_trans_detect");
        if (a31 != null && a31.mo220637a() != null && (a31.mo220637a() instanceof Boolean)) {
            boolean booleanValue26 = ((Boolean) a31.mo220637a()).booleanValue();
            C63929ab.m250974a("TEInterface", "smart trans detect: " + booleanValue26);
            if (booleanValue26) {
                enableSmartTransDetect(booleanValue26);
            }
        }
    }

    public static void setLensOneKeyHdrMaxCacheSize(int i) {
        nativeSetMaxDetectFrameCount(i);
    }

    public void setHostTrackIndex(int i) {
        this.mHostTrackIndex = i;
    }

    public static int configMaxCacheFrameCount(int i) {
        return nativeConfigMaxCacheFrameCount(i);
    }

    public static int enableAGFXCtx(boolean z) {
        return nativeEnableAGFXCtx(z);
    }

    public static int enableAndroidHdr2SDRSupport(boolean z) {
        return nativeEnableAndroidHdr2SDRSupport(z);
    }

    public static int enableAndroidHdrPreviewSupport(boolean z) {
        return nativeEnableAndroidHdrPreviewSupport(z);
    }

    public static int enableAudioDisplayCallBack(boolean z) {
        return nativeEnableAudioDisplayCallBack(z);
    }

    public static int enableAudioGBU(boolean z) {
        return nativeEnableAudioGBU(z);
    }

    public static int enableAudioHwEncoder(boolean z) {
        return nativeAudioHwEncoder(z);
    }

    public static int enableBingoRefactor(boolean z) {
        return nativeBingoRefactor(z);
    }

    public static int enableColorSpace2020(boolean z) {
        return nativeEnableColorSpace2020(z);
    }

    public static int enableCreateDecoderByName(boolean z) {
        return nativeEnableCreateDecoderByName(z);
    }

    public static int enableCrossplatformGLBaseFBO(boolean z) {
        return nativeEnableCrossplatformGLBaseFBO(z);
    }

    public static int enableDecoderResourceScheduleOptHw(int i) {
        return nativeEnableDecoderResourceScheduleOptHw(i);
    }

    public static int enableDisplayP3ReEncode(boolean z) {
        return nativeEnableDisplayP3ReEncode(z);
    }

    public static int enableDisplayP3Render(boolean z) {
        return nativeEnableDisplayP3Render(z);
    }

    public static int enableEffectAmazingMV(boolean z) {
        return nativeEnableEffectAmazingMV(z);
    }

    public static int enableEffectRenderWithoutGlreadpixels(boolean z) {
        return nativeEnableEffectRenderWithoutGlreadpixels(z);
    }

    public static int enableEngineResourceOpt(boolean z) {
        return nativeEnableEngineResourceOpt(z);
    }

    public static int enableFileInfoCache(boolean z) {
        return nativeEnableFileInfoCache(z);
    }

    public static int enableFirstFrameOpt(boolean z) {
        return nativeEnableFirstFrameOpt(z);
    }

    public static int enableHighSpeed(boolean z) {
        return nativeEnableHighSpeed(z);
    }

    public static int enableImageAlgorithmReuseAndOptForAmazing(boolean z) {
        return nativeEnableImageAlgorithmReuseAndOptForAmazing(z);
    }

    public static int enableMultiThreadDecode(boolean z) {
        return nativeEnableMultiThreadDecode(z);
    }

    public static int enableNewAudioMixer(boolean z) {
        return nativeEnableNewAudioMixer(z);
    }

    public static int enableOptGlFlush(boolean z) {
        return nativeEnableOptGLFlush(z);
    }

    public static int enableOptPlayBackDropFrame(boolean z) {
        return nativeEnableOptPlayBackDropFrame(z);
    }

    public static int enableOutResolutionAlign4(boolean z) {
        return nativeEnableOutResolutionAlign4(z);
    }

    public static int enableParallDecodeMatting(boolean z) {
        return nativeEnableParallDecodeMatting(z);
    }

    public static int enablePinRefactor(boolean z) {
        return nativeEnablePinRefactor(z);
    }

    public static int enablePipResolutionOpt(boolean z) {
        return nativeEnablePipResolutionOpt(z);
    }

    public static int enableReaderRefactor(boolean z) {
        return nativeEnableReaderRefactor(z);
    }

    public static int enableRenderLib(boolean z) {
        return nativeEnableRenderLib(z);
    }

    public static int enableSeekAndPreloadOpt(boolean z) {
        return nativeEnableSeekAndPreloadOpt(z);
    }

    public static int enableSeekPredictOpt(boolean z) {
        return nativeSeekPredictOpt(z);
    }

    public static int enableSmartTransDetect(boolean z) {
        return nativeEnableSmartTransDetect(z);
    }

    public static int forceCompileBytevc1SWdecode(boolean z) {
        return nativeForceCompileBytevc1SWdecode(z);
    }

    public static int forceEditBytevc1SWdecode(boolean z) {
        return nativeForceEditBytevc1SWdecode(z);
    }

    public static Object getMVInfoStatic(String str) {
        return nativeGetMVInfoStatic(str);
    }

    public static int openEditorFpsLog(boolean z) {
        return nativeOpenEditorFpsLog(z);
    }

    public static int openOutputCallback(boolean z) {
        return nativeOpenOutputCallback(z);
    }

    public static int setCompileGLContextReuse(boolean z) {
        return nativeEnableCompileGLContextReuse(z);
    }

    public static int setCompileReportState(int i) {
        return nativeSetCompileReport(i);
    }

    public static int setEnableEffectCanvas(boolean z) {
        return nativeEnableEffectCanvas(z);
    }

    public static int setEnableEffectTransition(boolean z) {
        return nativeEnableEffectTransiton(z);
    }

    public static int setEnableOpt(int i) {
        return nativeSetOptVersion(i);
    }

    public static int setEnableRefaComposer(boolean z) {
        return nativeEnableRefaComposer(z);
    }

    public static int setForceDropFrameWithoutAudio(boolean z) {
        return nativeSetForceDropFrameWithoutAudio(z);
    }

    public static int setInfoStickerTransEnable(boolean z) {
        return nativeSetInfoStickerTransEnable(z);
    }

    public static int setMaxAudioReaderCount(int i) {
        return nativeSetMaxAudioReaderCount(i);
    }

    public void clearDisplay(int i) {
        nativeClearDisplay(this.mNative, i);
    }

    public int expandTimeline(int i) {
        return nativeExpandTimeline(this.mNative, i);
    }

    public float[] getInfoStickerBoundingBox(int i) throws VEException {
        return getInfoStickerBoundingBox(i, true);
    }

    public void setCompileFps(int i) {
        setOption(0, "CompileFps", (long) i);
    }

    public void setCompileHardwareEncodeOptions(int i) {
        setOption(0, "CompileHardwareBitrate", (long) i);
    }

    public void setCompileType(int i) {
        setOption(0, "CompileType", (long) i);
    }

    public int setEditorFirstFrameDelay(int i) {
        return nativeSetEditorFirstFrameDelay(i);
    }

    public void setEncGopSize(int i) {
        setOption(0, "video gop size", (long) i);
    }

    public void setPageMode(int i) {
        setOption(0, "engine page mode", (long) i);
    }

    public void setScaleMode(int i) {
        setOption(0, "filter mode", (long) i);
    }

    public String addFileInfoCache(String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeAddFileInfoCache(j, str);
    }

    public int addVidoeClipWithAlgorithm(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddVidoeClipWithAlgorithm(j, strArr);
    }

    public int appendComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAppendComposerNodes(j, strArr);
    }

    public int cancelExtractVideoFrames(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeCancelExtractVideoFrames(j, i);
    }

    public int checkScoresFile(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeCheckScoresFile(j, str);
    }

    public int deleteAICutOutClipParam(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveAICutOutClipParam(j, i);
    }

    public int deleteExternalVideoTrack(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteSubVideoTrack(j, i);
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteVideoClipWithAlgorithm(j, i);
    }

    public int enableEffect(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableEffect(j, z);
    }

    public int enableEffectAmazing(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableEffectAmazing(j, z);
    }

    public int enableFaceDetect(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableFaceDetect(j, z);
    }

    public int enableHighSpeedForSingle(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableHighSpeedForSingle(j, z);
    }

    public int enableImageEditor(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnableImageEditor(j, z);
    }

    public void enableReEncodeOpt(boolean z) {
        long j = this.mNative;
        if (j != 0) {
            nativeEnableReEncodeOpt(j, z);
        }
    }

    public void enableSimpleProcessor(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "engine processor mode", j);
    }

    public int end2DBrush(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeEnd2DBrush(j, str);
    }

    public byte[] getAudioCommonFilterPreprocessResult(long j) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return null;
        }
        return nativeGetAudioCommonFilterPreprocessResult(j2, j);
    }

    public float getClipMattingProgress(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetClipProgress(j, i);
    }

    public String getClipPath(int i) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipPath(j, i);
    }

    public float getColorFilterIntensity(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeGetColorFilterIntensity(j, str);
    }

    public int getDisplayImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetDisplayImage(j, bitmap);
    }

    public String getMetaData(String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetMetaData(j, str);
    }

    public int getProcessedImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetProcessedImage(j, bitmap);
    }

    public int getTransparentImage(Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetTransparentImage(j, bitmap);
    }

    public int lockSeekVideoClip(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeLockSeekVideoClip(j, i);
    }

    public int notifyHideKeyBoard(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeNotifyHideKeyBoard(j, z);
    }

    public int pause(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePause(j, i);
    }

    public int pauseEffectAudio(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePauseEffectAudio(j, z);
    }

    public int prepareEngine(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePrepareEngine(j, i);
    }

    public int pushImageToBuffer(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePushImageToBuffer(j, str);
    }

    public int refreshCurrentFrame(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRefreshCurrentFrame(j, i);
    }

    public int reloadComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReloadComposerNodes(j, strArr);
    }

    public int removeComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveComposerNodes(j, strArr);
    }

    public int removeFilter(int[] iArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveFilter(j, iArr);
    }

    public int removeInfoStickerWithBuffer(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveInfoStickerWithBuffer(j, i);
    }

    public int removeMusic(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveMusic(j, i);
    }

    public int seekWithResult(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeekWithResult(j, i);
    }

    public int set2DBrushCanvasAlpha(float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushCanvasColor(j, f);
    }

    public int set2DBrushSize(float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushSize(j, f);
    }

    public void setBackGroundColor(int i) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetBackGroundColor(j, i);
        }
    }

    public int setClientState(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetClientState(j, i);
    }

    public int setComposerNodes(String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetComposerNodes(j, strArr);
    }

    public int setDestroyVersion(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDestroyVersion(j, z);
    }

    public int setDldEnabled(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDldEnabled(j, z);
    }

    public int setDldThrVal(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDldThrVal(j, i);
    }

    public int setDleEnabled(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDleEnabled(j, z);
    }

    public int setDleEnabledPreview(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDleEnabledPreview(j, z);
    }

    public int setEffectBgmEnable(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectBgmEnable(j, z);
    }

    public int setEffectCallback(VEListener.VEEditorEffectListener vEEditorEffectListener) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectCallback(j, vEEditorEffectListener);
    }

    public int setEffectMaxMemoryCache(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectMaxMemoryCache(j, i);
    }

    public int setEffectParams(VEEffectParams vEEffectParams) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectParams(j, vEEffectParams);
    }

    public void setEnableMultipleAudioFilter(boolean z) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetEnableMultipleAudioFilter(j, z);
        }
    }

    public void setEnableRemuxVideo(boolean z) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetEnableRemuxVideo(j, z);
        }
    }

    public void setEncoderParallel(boolean z) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetEncoderParallel(j, z);
        }
    }

    public void setExpandLastFrame(boolean z) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetExpandLastFrame(j, z);
        }
    }

    public void setForceDetectForFirstFrameByClip(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "force detect for first frame by clip", j);
    }

    public void setHeightWidthRatio(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            setOption(0, "engine height width ratio", f);
        }
    }

    public int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerBufferCallback(j, vEInfoStickerBufferListener);
    }

    public int setInfoStickerCallSync(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerCallSync(j, z);
    }

    public int setInterimScoresToFile(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInterimScoresToFile(j, str);
    }

    public void setKeyFramePoints(int[] iArr) {
        if (this.mNative != 0) {
            setOption(0, "compileKeyFramePoints", iArr);
        }
    }

    public int setLanguage(String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetLanguage(j, str);
    }

    public void setLooping(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(1, "engine loop play", j);
    }

    public int setMaleMakeupState(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMaleMakeupState(j, z);
    }

    public void setMultiComposer(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "is multi composer filter", j);
    }

    public int setMusicCropRatio(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicCropRatio(j, i);
    }

    public int setPreviewFps(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeSetPreviewFps(j, i);
        return 0;
    }

    public int setPreviewScaleMode(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetPreviewScaleMode(j, i);
    }

    public void setPreviewSurface(Surface surface) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetPreviewSurface(j, surface);
        }
    }

    public void setPreviewSurfaceBitmap(Bitmap bitmap) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetPreviewSurfaceBitmap(j, bitmap);
        }
    }

    public void setSpeedRatio(float f) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetSpeedRatio(j, f);
        }
    }

    public void setUseHwEnc(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "HardwareVideo", j);
    }

    public void setUseLargeMattingModel(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        setOption(0, "UseLargeMattingModel", j);
    }

    public void setVideoBackGroundColor(int i) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetVideoBackGroundColor(j, i);
        }
    }

    public int beginInfoStickerPin(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeBeginInfoStickerPin = nativeBeginInfoStickerPin(j, i);
        if (nativeBeginInfoStickerPin != 0) {
            return -1;
        }
        return nativeBeginInfoStickerPin;
    }

    public int cancelInfoStickerPin(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeCancelInfoStickerPin = nativeCancelInfoStickerPin(j, i);
        if (nativeCancelInfoStickerPin != 0) {
            return -1;
        }
        return nativeCancelInfoStickerPin;
    }

    public int deleteSticker(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteSubTrack(j, i);
    }

    public int deleteWatermark(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeDeleteSubTrack(j, i);
    }

    public int getInfoStickerPinState(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeGetInfoStickerPinState(j, i);
    }

    public float getInfoStickerRotate(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        if (this.mHostTrackIndex < 0) {
            return -105.0f;
        }
        return nativeGetInfoStickerRotate(j, i);
    }

    public float getInfoStickerScale(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        if (this.mHostTrackIndex < 0) {
            return -105.0f;
        }
        float nativeGetInfoStickerScale = nativeGetInfoStickerScale(j, i);
        if (nativeGetInfoStickerScale < BitmapDescriptorFactory.HUE_RED) {
            return -1.0f;
        }
        return nativeGetInfoStickerScale;
    }

    public String getInfoStickerTemplateParam(int i) {
        long j = this.mNative;
        if (j != 0 && this.mHostTrackIndex >= 0) {
            return nativeGetInfoStickerTemplateParam(j, i);
        }
        return "";
    }

    public boolean getInfoStickerVisible(int i) {
        long j = this.mNative;
        if (j != 0 && this.mHostTrackIndex >= 0) {
            return nativeGetInfoStickerVisible(j, i);
        }
        return true;
    }

    public int getStickerFilterIndex(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (i < 0) {
            return -100;
        }
        return nativeGetSubTrackFilter(j, i);
    }

    public int getTextContent(final VEEditor.AbstractC63847c cVar) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeGetTextContentCallback(j, new NativeCallbacks.OnARTextContentCallback() {
            /* class com.ss.android.ttve.nativePort.TEInterface.C602453 */

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextContentCallback
            public void onResult(String[] strArr) {
                VEEditor.AbstractC63847c cVar = cVar;
                if (cVar != null) {
                    cVar.mo220744a(strArr);
                }
            }
        });
        return 0;
    }

    public boolean isInfoStickerAnimatable(int i) {
        long j = this.mNative;
        if (j != 0 && this.mHostTrackIndex >= 0) {
            return nativeIsInfoStickerAnimatable(j, i);
        }
        return false;
    }

    public int pauseInfoStickerAnimation(boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativePauseInfoStickerAnimation(j, z);
    }

    public int removeInfoSticker(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeRemoveInfoSticker(j, i);
    }

    public void setCompileSoftInfo(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileSoftInfo", j);
        }
    }

    public void setEnableAvInterLeave(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileAvInterleave", j);
        }
    }

    public void setEnableCompileVboost(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "EnableCompileVboost", j);
        }
    }

    public void setEnableInterLeave(boolean z) {
        long j = 0;
        if (this.mNative != 0) {
            if (z) {
                j = 1;
            }
            setOption(0, "CompileInterleave", j);
        }
    }

    public int setInfoStickerRestoreMode(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeSetInfoStickerRestoreMode = nativeSetInfoStickerRestoreMode(j, i);
        if (nativeSetInfoStickerRestoreMode != 0) {
            return -1;
        }
        return nativeSetInfoStickerRestoreMode;
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        long j = this.mNative;
        if (j != 0) {
            return nativeSetAudioBeatAlgorithmResult(j, vEMVAudioAlgorithmResult);
        }
        C63929ab.m250980d("TEInterface", "setExternalAlgorithmResult error, mNative == 0");
        return -112;
    }

    public int setMVDataJson(String str) {
        long j = this.mNative;
        if (j != 0) {
            return nativeSetMVDataJson(j, str);
        }
        C63929ab.m250980d("TEInterface", "setExternalAlgorithmResult error, mNative == 0");
        return -112;
    }

    public int setTextBitmapCallback(final VEEditor.AbstractC63846b bVar) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        nativeSetTextBitmapCallback(j, new NativeCallbacks.OnARTextBitmapCallback() {
            /* class com.ss.android.ttve.nativePort.TEInterface.C602464 */

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextBitmapCallback
            public BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                VEEditor.AbstractC63846b bVar = bVar;
                if (bVar != null) {
                    return bVar.mo220743a(str, befTextLayout);
                }
                return null;
            }
        });
        return 0;
    }

    public int stopInfoStickerPin(int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeStopInfoStickerPin = nativeStopInfoStickerPin(j, i);
        if (nativeStopInfoStickerPin != 0) {
            return -1;
        }
        return nativeStopInfoStickerPin;
    }

    public int updateSceneFileOrder(am amVar) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateSceneFileOrder(j, amVar.f161456b);
    }

    public int updateSenceTime(am amVar) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateSceneTime(j, amVar.f161462h, amVar.f161457c, amVar.f161458d, ROTATE_DEGREE.toIntArray(amVar.f161463i), amVar.f161461g);
    }

    public String getInfoStickerTemplateParam(String str) {
        long j = this.mNative;
        if (j == 0) {
            C63929ab.m250980d("TEInterface", "[getInfoStickerTemplateParam] mNative wrong value");
            return "";
        } else if (this.mHostTrackIndex >= 0) {
            return nativeGetInfoStickerTemplateParamWithPath(j, str);
        } else {
            C63929ab.m250980d("TEInterface", "[getInfoStickerTemplateParam] no host tack");
            return "";
        }
    }

    public boolean isGestureRegistered(VEGestureEvent vEGestureEvent) {
        int i;
        if (this.mNative == 0) {
            return false;
        }
        if (vEGestureEvent.ordinal() == VEGestureEvent.ANY_SUPPORTED.ordinal()) {
            i = -1;
        } else {
            i = vEGestureEvent.ordinal();
        }
        return nativeIsGestureRegistered(this.mNative, i);
    }

    public void setCompileWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam.needExtFile) {
            setOption(0, "SingleWayCompileWithWatermark", 0L);
            setOption(0, "CompilePathWatermark", vEWatermarkParam.extFile);
        } else {
            setOption(0, "SingleWayCompileWithWatermark", 1L);
        }
        setOption(0, "CompilePathWavWatermark", "");
    }

    public void setUsrRotate(int i) {
        if (i == 0) {
            setOption(0, "usr rotate", 0L);
        } else if (i == 90) {
            setOption(0, "usr rotate", 1L);
        } else if (i == 180) {
            setOption(0, "usr rotate", 2L);
        } else if (i != 270) {
            setOption(0, "usr rotate", 0L);
        } else {
            setOption(0, "usr rotate", 3L);
        }
    }

    public static TEInterface createEngine(long j) {
        int i;
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.m251382a().mo221780b()) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.m251382a().mo221781c().width, VERuntime.m251382a().mo221781c().height);
        if (j == 0) {
            return null;
        }
        tEInterface.mNative = j;
        tEInterface.nativeResetCallback(j);
        C60217b.m234045a("vesdk_event_editor_init", (JSONObject) null, "behavior");
        return tEInterface;
    }

    public int enableHDRSetting(boolean z) {
        if (this.mNative == 0) {
            return -112;
        }
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("enable_android_hdr_preview_support");
        if (a != null && a.mo220637a() != null && (a.mo220637a() instanceof Boolean) && !((Boolean) a.mo220637a()).booleanValue()) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return -101;
        }
        return nativeEnableHDRSetting(this.mNative, z);
    }

    public static TEInterface createEngine(VEUserConfig vEUserConfig) {
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        int i;
        int length;
        if (vEUserConfig == null || (length = vEUserConfig.mo220985a().length) <= 0) {
            iArr2 = null;
            iArr = null;
            strArr = null;
        } else {
            iArr = new int[length];
            strArr = new String[length];
            iArr2 = new int[length];
            for (int i2 = 0; i2 < vEUserConfig.mo220985a().length; i2++) {
                strArr[i2] = vEUserConfig.mo220985a()[i2].f161396a.value();
                iArr2[i2] = vEUserConfig.mo220985a()[i2].mo220989b().value();
                if (iArr2[i2] == 0) {
                    iArr[i2] = ((Boolean) vEUserConfig.mo220985a()[i2].mo220988a()).booleanValue() ? 1 : 0;
                } else if (iArr2[i2] == 1) {
                    iArr[i2] = ((Integer) vEUserConfig.mo220985a()[i2].mo220988a()).intValue();
                } else {
                    C63929ab.m250980d("setUserConfig", "illegal type");
                    iArr[i2] = -1;
                }
            }
        }
        TEInterface tEInterface = new TEInterface();
        if (VERuntime.m251382a().mo221780b()) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        TEGLGlobalContext.nativeSetMaxRenderSize(VERuntime.m251382a().mo221781c().width, VERuntime.m251382a().mo221781c().height);
        long nativeCreateEngine = tEInterface.nativeCreateEngine(strArr, iArr2, iArr);
        if (nativeCreateEngine == 0) {
            return null;
        }
        tEInterface.mNative = nativeCreateEngine;
        C60217b.m234045a("vesdk_event_editor_init", (JSONObject) null, "behavior");
        return tEInterface;
    }

    public static int setTexturePoolLimit(int i, int i2) {
        return nativeSetTexturePoolLimit(i, i2);
    }

    public void addMetaData(String str, String str2) {
        long j = this.mNative;
        if (j != 0) {
            nativeAddMetaData(j, str, str2);
        }
    }

    public int changeTransitionAt(int i, VETransitionFilterParam vETransitionFilterParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeChangeTransitonAt(j, i, vETransitionFilterParam);
    }

    public int deleteAudioTrack(int i, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteAudioTrack(j, i, z);
    }

    public int enableStickerAnimationPreview(int i, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationPreview(j, i, z);
    }

    public List<VEClipParam> getAllClips(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return null;
        }
        return nativeGetAllClips(j, i, i2);
    }

    public int getSingleTrackProcessedImage(int i, Bitmap bitmap) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetSingleTrackProcessedImage(j, i, bitmap);
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeMoveVideoClipWithAlgorithm(j, i, i2);
    }

    public int processDoubleClickEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessDoubleClickEvent(j, f, f2);
    }

    public int processLongPressEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessLongPressEvent(j, f, f2);
    }

    public int processRotationEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessRotationEvent(j, f, f2);
    }

    public int processScaleEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessScaleEvent(j, f, f2);
    }

    public int processTouchEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessTouchEvent(j, f, f2);
    }

    public int processTouchMoveEvent(float f, float f2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessTouchMoveEvent(j, f, f2);
    }

    public int setAIRotation(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAIRotation(j, i, i2);
    }

    public int setAlgorithmPreConfig(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAlgorithmPreConfig(j, i, i2);
    }

    public int setAlgorithmSyncAndNum(boolean z, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAlgorithmSyncAndNum(j, z, i);
    }

    public int setAudioOffset(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetAudioOffset(j, i, i2);
    }

    public void setCompileCommonEncodeOptions(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileEncodeProfile", (long) i2);
    }

    public int setComposerMode(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetComposerMode(j, i, i2);
    }

    public int setEffectCacheInt(String str, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectCacheInt(j, str, i);
    }

    public int setEffectFontPath(String str, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectFontPath(j, str, i);
    }

    public void setEngineCompilePath(String str, String str2) {
        setOption(0, "CompilePath", str);
        setOption(0, "CompilePathWav", str2);
    }

    public float setInfoStickerScale(int i, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112.0f;
        }
        return nativeSetInfoStickerScale(j, i, f);
    }

    public void setSurfaceSize(int i, int i2) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetSurfaceSize(j, i, i2);
        }
    }

    public void setVideoCompileBitrate(int i, int i2) {
        setOption(0, "CompileBitrateMode", (long) i);
        setOption(0, "CompileBitrateValue", (long) i2);
    }

    public void setWaterMark(VEWatermarkParam.VEWatermarkEntity[] vEWatermarkEntityArr, VEWatermarkParam.VEWatermarkMask vEWatermarkMask) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetWaterMark(j, vEWatermarkEntityArr, vEWatermarkMask);
        }
    }

    public int switchResourceLoadMode(boolean z, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSwitchResourceLoadMode(j, z, i);
    }

    public int updateAlgorithmRuntimeParam(int i, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAlgorithmRuntimeParam(j, i, f);
    }

    public int updateCanvasResolution(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateCanvasResolution(j, i, i2);
    }

    public int addAudioTrackWithStruct(VECommonClipParam vECommonClipParam, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(vECommonClipParam.path)) {
            return -100;
        }
        return nativeAddAudioTrackWithStruct(this.mNative, vECommonClipParam, z);
    }

    public int addInfoSticker(String str, String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeAddInfoSticker(j, str, strArr);
    }

    public int[] getDecodeInfo(int i, int i2) {
        int[] iArr = {0};
        long j = this.mNative;
        if (j == 0) {
            return iArr;
        }
        return nativeGetDecodeDumpInfo(j, i, i2);
    }

    public int getInfoStickerFlip(int i, boolean[] zArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetInfoStickerFlip = nativeGetInfoStickerFlip(j, i, zArr);
        if (nativeGetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeGetInfoStickerFlip;
    }

    public int getInfoStickerPinData(int i, ByteBuffer[] byteBufferArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        return nativeGetInfoStickerPinData(j, i, byteBufferArr);
    }

    public int getInfoStickerPosition(int i, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetInfoStickerPosition = nativeGetInfoStickerPosition(j, i, fArr);
        if (nativeGetInfoStickerPosition != 0) {
            return -1;
        }
        return nativeGetInfoStickerPosition;
    }

    public int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeGetSrtInfoStickerInitPosition = nativeGetSrtInfoStickerInitPosition(j, i, fArr);
        if (nativeGetSrtInfoStickerInitPosition != 0) {
            return -1;
        }
        return nativeGetSrtInfoStickerInitPosition;
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithm = nativeInitVideoEditorWithAlgorithm(j, strArr, i);
        if (nativeInitVideoEditorWithAlgorithm < 0) {
            return nativeInitVideoEditorWithAlgorithm;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithm;
        return 0;
    }

    public void setAlgorithmReplay(int i, String str) {
        if (this.mNative != 0) {
            setOption(0, "AlgorithmReplayMode", (long) i);
            setOption(0, "AlgorithmReplayFilePath", str);
        }
    }

    public int setDeviceRotation(float[] fArr, double d) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetDeviceRotation(j, fArr, d);
    }

    public boolean setFrameTrace(String str, int i) {
        long j = this.mNative;
        if (j != 0 && nativeFrameTrace(j, str, i) == 0) {
            return true;
        }
        return false;
    }

    public void setMaxWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine max video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine max video height", (long) i2);
        }
    }

    public int setStickerPinArea(int i, VEStickerPinAreaParam vEStickerPinAreaParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeSetStickerPinArea = nativeSetStickerPinArea(j, i, vEStickerPinAreaParam);
        if (nativeSetStickerPinArea != 0) {
            return -1;
        }
        return nativeSetStickerPinArea;
    }

    public void setWatermarkWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine watermark video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine watermark video height", (long) i2);
        }
    }

    public void setWidthHeight(int i, int i2) {
        if (i > 0) {
            setOption(0, "engine video width", (long) i);
        }
        if (i2 > 0) {
            setOption(0, "engine video height", (long) i2);
        }
    }

    public int updateTextSticker(int i, String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeUpdateTextSticker = nativeUpdateTextSticker(j, i, str);
        if (nativeUpdateTextSticker != 0) {
            return -1;
        }
        return nativeUpdateTextSticker;
    }

    public C63936ag getDecodeRect(int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return new C63936ag(0, 0, 0, 0);
        }
        int[] nativeGetDecodeDumpInfo = nativeGetDecodeDumpInfo(j, i, i2);
        return new C63936ag(nativeGetDecodeDumpInfo[0], nativeGetDecodeDumpInfo[1], nativeGetDecodeDumpInfo[2], nativeGetDecodeDumpInfo[3]);
    }

    public boolean processTouchEvent(VETouchPointer vETouchPointer, int i) {
        long j = this.mNative;
        if (j == 0) {
            return false;
        }
        return nativeProcessTouchEvent2(j, vETouchPointer.mo220978a(), vETouchPointer.mo220980c(), vETouchPointer.mo220981d(), vETouchPointer.mo220982e(), vETouchPointer.mo220983f(), vETouchPointer.mo220979b().ordinal(), i);
    }

    public int restoreInfoStickerPinWithJson(int i, ByteBuffer byteBuffer) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -105;
        }
        int nativeRestoreInfoStickerPinWithJson = nativeRestoreInfoStickerPinWithJson(j, i, byteBuffer, byteBuffer.capacity());
        if (nativeRestoreInfoStickerPinWithJson != 0) {
            return -1;
        }
        return nativeRestoreInfoStickerPinWithJson;
    }

    public boolean suspendGestureRecognizer(VEGestureEvent vEGestureEvent, boolean z) {
        int i;
        if (this.mNative == 0) {
            return false;
        }
        if (vEGestureEvent.ordinal() == VEGestureEvent.ANY_SUPPORTED.ordinal()) {
            i = -1;
        } else {
            i = vEGestureEvent.ordinal();
        }
        return nativeSuspendGestureRecognizer(this.mNative, i, z);
    }

    public float[] getInfoStickerBoundingBox(int i, boolean z) throws VEException {
        float[] fArr;
        long j = this.mNative;
        if (j == 0) {
            throw new VEException(-112, "");
        } else if (this.mHostTrackIndex >= 0) {
            if (z) {
                fArr = nativeGetInfoStickerBoundingBox(j, i);
            } else {
                fArr = nativeGetInfoStickerBoundingBoxWithoutRotate(j, i);
            }
            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                float[] fArr2 = new float[4];
                System.arraycopy(fArr, 1, fArr2, 0, 4);
                return fArr2;
            }
            throw new VEException(-1, "native getInfoStickerBoundingBox failed: " + fArr[0] + " index: " + i);
        } else {
            throw new VEException(-100, "");
        }
    }

    public static LoudnessDetectResult[] detectAudioLoudness(String[] strArr, int[] iArr, int[] iArr2) {
        return nativeDetectAudioLoudness(strArr, iArr, iArr2);
    }

    public static int setDropFrameParam(boolean z, long j, long j2) {
        return nativeSetDropFrameParam(z, j, j2);
    }

    public static int setImageBufferLimit(int i, int i2, int i3) {
        return nativeSetImageBufferLimit(i, i2, i3);
    }

    public int adjustFilterInOut(int i, int i2, int i3) {
        return nativeAdjustFilterInOut(this.mNative, i, i2, i3);
    }

    public int addClipAuxiliaryParam(int i, int i2, VEClipAuxiliaryParam[] vEClipAuxiliaryParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddClipAuxiliaryParam(j, i, i2, vEClipAuxiliaryParamArr);
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        long j = this.mNative;
        if (j == 0) {
            return new int[]{-1, 0};
        }
        return nativeCheckComposerNodeExclusion(j, str, str2, str3);
    }

    public int deleteClip(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteClip(j, i, i2, i3);
    }

    public int deleteKeyFrameParam(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeDeleteKeyFrameParam(j, i, i2, i3);
    }

    public int faceCoverClear(int i, String str, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverClear(j, i, str, z);
    }

    public String getClipInfoString(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipInfoString(j, i, i2, i3);
    }

    public long getClipSequenceOut(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetClipSequenceOut(j, i, i2, i3);
    }

    public int getDecodeImage(Bitmap bitmap, int i, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeGetDecodeImage(j, bitmap, i, i2);
    }

    public float getTrackVolume(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return nativeGetTrackVolume(j, i, i2, i3);
    }

    public int processTouchDownEvent(float f, float f2, VEGestureType vEGestureType) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessTouchDownEvent(j, f, f2, vEGestureType.ordinal());
    }

    public int processTouchUpEvent(float f, float f2, VEGestureType vEGestureType) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessTouchUpEvent(j, f, f2, vEGestureType.ordinal());
    }

    public void setAudioCompileSetting(int i, int i2, int i3) {
        if (this.mNative != 0) {
            setOption(0, "AudioSampleRate", (long) i);
            setOption(0, "AudioChannels", (long) i2);
            setOption(0, "AudioBitrate", (long) i3);
        }
    }

    public int setExtTrackSeqIn(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetSubTrackSeqIn(j, i, i2, i3);
    }

    public int setFilterParam(int i, String str, VEMusicSRTEffectParam vEMusicSRTEffectParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEMusicSRTEffectParam);
    }

    public int setInfoStickerFlip(int i, boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        if (this.mHostTrackIndex < 0) {
            return -100;
        }
        int nativeSetInfoStickerFlip = nativeSetInfoStickerFlip(j, i, z, z2);
        if (nativeSetInfoStickerFlip != 0) {
            return -1;
        }
        return nativeSetInfoStickerFlip;
    }

    public void setOption(int i, String str, float f) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetOption(j, i, str, f);
        }
    }

    public void setResizer(int i, float f, float f2) {
        setOption(0, "filter mode", (long) i);
        setOption(0, "resizer offset x percent", f);
        setOption(0, "resizer offset y percent", f2);
    }

    public int setTimeRange(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTimeRange(j, i, i2, i3);
    }

    public int setTrackDurationType(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackDurationType(j, i, i2, i3);
    }

    public int setTrackFilterEnable(int i, boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackFilterEnable(j, i, z, z2);
    }

    public int setTrackLayer(int i, int i2, int i3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackLayer(j, i, i2, i3);
    }

    public boolean setTrackVolume(int i, int i2, float f) {
        long j = this.mNative;
        if (j == 0) {
            return false;
        }
        return nativeSetTrackVolume(j, i, i2, f);
    }

    public int setTransitionAt(int i, long j, String str) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return -112;
        }
        return nativeSetTransitionAt(j2, i, j, str);
    }

    public int updateAICutOutClipParam(int i, int i2, VEAICutOutClipParam vEAICutOutClipParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateAICutOutClipParam(j, i, i2, vEAICutOutClipParam);
    }

    public int updateComposerNode(String str, String str2, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateComposerNode(j, str, str2, f);
    }

    public int updateScene(String[] strArr, int[] iArr, int[] iArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeUpdateScene = nativeUpdateScene(j, strArr, iArr, iArr2);
        if (nativeUpdateScene < 0) {
            return nativeUpdateScene;
        }
        this.mHostTrackIndex = nativeUpdateScene;
        return 0;
    }

    public int updateTrackClips(int i, int i2, String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateTrackClip(j, i, i2, strArr);
    }

    public int updateTrackFilter(int i, int i2, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateTrackFilter(j, i, i2, z);
    }

    public int setFilterParam(int i, String str, VEStickerAnimator vEStickerAnimator) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEStickerAnimator);
    }

    public void setOption(int i, String str, long j) {
        long j2 = this.mNative;
        if (j2 != 0) {
            nativeSetOption(j2, i, str, j);
        }
    }

    public int setFilterParam(int i, String str, VEEffectFilterParam vEEffectFilterParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, vEEffectFilterParam);
    }

    public void setOption(int i, String str, String str2) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetOption(j, i, str, str2);
        }
    }

    public int setFilterParam(int i, String str, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam(j, i, str, str2);
    }

    public void setOption(int i, String str, int[] iArr) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetOptionIntArray(j, i, str, iArr);
        }
    }

    public int setFilterParam(int i, String str, byte[] bArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetFilterParam2(j, i, str, bArr);
    }

    public void setOption(int i, String[] strArr, long[] jArr) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetOptionArray(j, i, strArr, jArr);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ab A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int updateFilterParam(int r10, int r11, com.ss.android.vesdk.filterparam.VEBaseFilterParam r12) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEInterface.updateFilterParam(int, int, com.ss.android.vesdk.filterparam.VEBaseFilterParam):int");
    }

    public static String audioExtend(String str, float f, float f2, float f3) {
        return nativeAudioExtend(str, f, f2, f3);
    }

    public static int setMaxSoftWareVideoReaderCount(int i, int i2, int i3, int i4) {
        return nativeSetMaxSoftwareVideoReaderCount(i, i2, i3, i4);
    }

    public int getImages(int[] iArr, int i, int i2, int i3) {
        return nativeGetImages(this.mNative, iArr, i, i2, i3);
    }

    public int addAudioTrackForClips(String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (strArr == null || strArr.length == 0) {
            return -100;
        }
        return nativeAddAudioTrackForClips(j, strArr, iArr, iArr2, fArr);
    }

    public int concatShootVideo(String str, String[] strArr, long[] jArr, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeConcatShootVideo(j, str, strArr, jArr, z);
    }

    public int controlStickerAnimationPreview(boolean z, int i, float f, int i2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeControlInfoStickerAnimationPreview(j, z, i, i2);
    }

    public String getClipInfoStringWithPath(int i, int i2, int i3, String str) {
        long j = this.mNative;
        if (j == 0) {
            return "";
        }
        return nativeGetClipInfoStringWithPath(j, i, i2, i3, str);
    }

    public int initVideoEditorWithStruct(VECommonClipParam[] vECommonClipParamArr, VECommonClipParam[] vECommonClipParamArr2, String[] strArr, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitVideoEditorWithStruct = nativeInitVideoEditorWithStruct(j, vECommonClipParamArr, vECommonClipParamArr2, strArr, i);
        if (nativeInitVideoEditorWithStruct < 0) {
            return nativeInitVideoEditorWithStruct;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithStruct;
        return 0;
    }

    public int moveClip(int i, int i2, int i3, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeMoveClip(j, i, i2, i3, z);
    }

    public int replaceClip(int i, int i2, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReplaceClip(j, i, i2, vEClipSourceParam, vEClipTimelineParam);
    }

    public int seek(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeek(j, i, i2, i3, i4);
    }

    public int set2DBrushColor(float f, float f2, float f3, float f4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSet2DBrushColor(j, f, f2, f3, f4);
    }

    public int setCompileAudioDriver(String str, int i, int i2, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetCompileAudioDriver(j, str, i, i2, str2);
    }

    public void setCompileSoftwareEncodeOptions(int i, long j, int i2, int i3) {
        setOption(0, "CompileSoftwareCrf", (long) i);
        setOption(0, "CompileSoftwareMaxrate", j);
        setOption(0, "CompileSoftwarePreset", (long) i2);
        setOption(0, "CompileSoftwareQp", (long) i3);
    }

    public int setEffectInputText(String str, int i, int i2, String str2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetEffectInputText(j, str, i, i2, str2);
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, int i) {
        long j = this.mNative;
        if (j != 0) {
            return nativeSetExternalAlgorithmResult(j, str, str2, str3, i);
        }
        C63929ab.m250980d("TEInterface", "setExternalAlgorithmResult error, mNative == 0");
        return -112;
    }

    public int setKeyFrameParam(int i, int i2, int i3, String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetKeyFrameParam(j, i, i2, i3, str);
    }

    public int setTrackMinMaxDuration(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetTrackMinMaxDuration(j, i, i2, i3, i4);
    }

    public void setViewPort(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetViewPort(j, i, i2, i3, i4);
        }
    }

    public int updateClipsSourceParam(int i, int i2, int[] iArr, VEClipSourceParam[] vEClipSourceParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateClipsSourceParam(j, i, i2, iArr, vEClipSourceParamArr);
    }

    public int updateClipsTimelineParam(int i, int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateClipsTimelineParam(j, i, i2, iArr, vEClipTimelineParamArr);
    }

    public int updateFilterTime(int i, int i2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateFilterTime(j, i, i2, i3, i4);
    }

    public int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateMultiComposerNodes(j, i, strArr, strArr2, fArr);
    }

    public int updateTrackFilterDuration(int i, int i2, boolean z, long j) {
        long j2 = this.mNative;
        if (j2 == 0) {
            return -112;
        }
        return nativeUpdateTrackFilterDuration(j2, i, i2, z, j);
    }

    public int initVideoEditorWithAlgorithm(String[] strArr, int i, boolean[] zArr, String[] strArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitVideoEditorWithAlgorithmLoadCache = nativeInitVideoEditorWithAlgorithmLoadCache(j, strArr, i, zArr, strArr2);
        if (nativeInitVideoEditorWithAlgorithmLoadCache < 0) {
            return nativeInitVideoEditorWithAlgorithmLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithAlgorithmLoadCache;
        return 0;
    }

    public void setCrop(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine crop x", "engine crop y", "engine crop width", "engine crop height"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public void updateResolution(int i, int i2, int i3, int i4) {
        setOption(1, new String[]{"engine preivew width", "engine preivew height", "engine preivew width percent", "engine preivew height percent"}, new long[]{(long) i, (long) i2, (long) i3, (long) i4});
    }

    public int setClipAttr(int i, int i2, int i3, String str, String str2) {
        return nativeSetClipAttr(this.mNative, i, i2, i3, str, str2);
    }

    public int faceCoverLoad(int i, String[] strArr, int i2, String str, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverLoad(j, i, strArr, i2, str, z);
    }

    public int faceCoverSet(int i, double d, double d2, String str, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverSet(j, i, d, d2, str, z);
    }

    public int initAudioEditor(String str, String[] strArr, int[] iArr, int[] iArr2, float[] fArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitAudioEditor = nativeInitAudioEditor(j, str, strArr, iArr, iArr2, fArr);
        if (nativeInitAudioEditor < 0) {
            return nativeInitAudioEditor;
        }
        this.mHostTrackIndex = nativeInitAudioEditor;
        return 0;
    }

    public int insertClip(int i, int i2, int i3, VEClipSourceParam vEClipSourceParam, VEClipTimelineParam vEClipTimelineParam) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeInsertClip(j, i, i2, i3, vEClipSourceParam, vEClipTimelineParam);
    }

    public int preprocessAudioTrackForFilter(int i, int i2, String str, byte[] bArr, long[] jArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativePreprocessAudioTrackForFilter(j, i, i2, str, bArr, jArr);
    }

    public int processPanEvent(float f, float f2, float f3, float f4, float f5) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessPanEvent(j, f, f2, f3, f4, f5);
    }

    public int replaceComposerNodesWithTag(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeReplaceComposerNodesWithTag(j, strArr, i, strArr2, i2, strArr3);
    }

    public int seekWithTolerance(int i, int i2, int i3, int i4, int i5) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSeekWithTolerance(j, i, i2, i3, i4, i5);
    }

    public int updateScene(String[] strArr, int[] iArr, int[] iArr2, boolean[] zArr, String[] strArr2) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeUpdateSceneLoadCache = nativeUpdateSceneLoadCache(j, strArr, iArr, iArr2, zArr, strArr2);
        if (nativeUpdateSceneLoadCache < 0) {
            return nativeUpdateSceneLoadCache;
        }
        this.mHostTrackIndex = nativeUpdateSceneLoadCache;
        return 0;
    }

    public int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        return addFilters(iArr, strArr, iArr2, iArr3, iArr4, iArr5, null);
    }

    public int extractVideoFrames(int i, int i2, int i3, int i4, int i5, final VEListener.AbstractC63865h hVar) {
        if (this.mNative == 0) {
            return -112;
        }
        setExtractFrameProcessCallback(new NativeCallbacks.AbstractC60236b() {
            /* class com.ss.android.ttve.nativePort.TEInterface.C602442 */

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60236b
            /* renamed from: a */
            public void mo205729a(float f) {
                VEListener.AbstractC63865h hVar = hVar;
                if (hVar != null) {
                    hVar.mo220844a(f);
                }
            }
        });
        return nativeExtractVideoFrames(this.mNative, i, i2, i3, i4, i5);
    }

    public int faceCoverScale(int i, double d, double d2, double d3, String str, boolean z) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeFaceCoverScale(j, i, d, d2, d3, str, z);
    }

    public int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitVideoEditor = nativeInitVideoEditor(j, str, strArr, strArr2, strArr3, strArr4, i);
        if (nativeInitVideoEditor < 0) {
            return nativeInitVideoEditor;
        }
        this.mHostTrackIndex = nativeInitVideoEditor;
        return 0;
    }

    public int processBingoFrames(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, float f, String str) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeProcessBingoFrames(j, byteBuffer, byteBuffer2, i, i2, f, str);
    }

    public int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack(this.mNative, str, i, i2, i3, i4, z);
    }

    public int addExternalVideoTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeAddSubVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, i);
    }

    public void setDisplayState(float f, float f2, float f3, float f4, int i, int i2, int i3) {
        long j = this.mNative;
        if (j != 0) {
            nativeSetDisplayState(j, f, f2, f3, f4, i, i2, i3);
        }
    }

    public int setStickerAnimation(int i, boolean z, String str, int i2, String str2, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAnimationParam(j, i, z, str, i2, str2, i3, i4);
    }

    public int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack(j, i, i2, i3, i4, i5, z, z2);
    }

    public int[] addFilters(int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        long j = this.mNative;
        if (j != 0) {
            return nativeAddFilters(j, iArr, strArr, iArr2, iArr3, iArr4, iArr5, iArr6);
        }
        return new int[]{-1};
    }

    public int beginAudioExtendToFile(String str, String str2, String str3, float f, float f2, float f3, final VEListener.AbstractC63883z zVar) {
        if (this.mNative == 0) {
            return -112;
        }
        setAudioExtendToFileCallback(new NativeCallbacks.AbstractC60235a() {
            /* class com.ss.android.ttve.nativePort.TEInterface.C602431 */

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60235a
            /* renamed from: a */
            public void mo205726a() {
                VEListener.AbstractC63883z zVar = zVar;
                if (zVar != null) {
                    zVar.mo220865a();
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60235a
            /* renamed from: a */
            public void mo205727a(float f) {
                VEListener.AbstractC63883z zVar = zVar;
                if (zVar != null) {
                    zVar.mo220866a(f);
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60235a
            /* renamed from: a */
            public void mo205728a(boolean z) {
                VEListener.AbstractC63883z zVar = zVar;
                if (zVar != null) {
                    zVar.mo220867a(z);
                }
            }
        });
        return nativeBeginAudioExtendToFile(this.mNative, str, str2, str3, f, f2, f3);
    }

    public int addAudioTrackForMV(String str, int i, int i2, int i3, int i4, int i5, boolean z, float f) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackMV(this.mNative, str, i, i2, i3, i4, i5, z, f);
    }

    public int addWaterMark(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, double d, double d2, double d3, double d4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int i = this.mHostTrackIndex;
        if (i < 0) {
            return -105;
        }
        return nativeAddSubTrack(j, strArr, strArr2, iArr, iArr2, iArr, iArr2, d, d2, d3, d4, 5, i);
    }

    public int initVideoEditor(String str, String[] strArr, String[] strArr2, String[] strArr3, String[][] strArr4, int i, boolean[] zArr, String[] strArr5) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int nativeInitVideoEditorLoadCache = nativeInitVideoEditorLoadCache(j, str, strArr, strArr2, strArr3, strArr4, i, zArr, strArr5);
        if (nativeInitVideoEditorLoadCache < 0) {
            return nativeInitVideoEditorLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorLoadCache;
        return 0;
    }

    public int updateAudioTrack(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -100;
        }
        return nativeUpdateAudioTrack2(j, i, i2, i3, i4, i5, z, i6, i7);
    }

    public int addAudioTrack(String str, int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrack2(this.mNative, str, i, i2, i3, i4, z, i5, i6);
    }

    public int addAudioTrack(String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (this.mNative == 0) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeAddAudioTrackWithNeedPrepare(this.mNative, str, str2, i, i2, i3, i4, z, z2);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false);
    }

    public int addSticker(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        int i = this.mHostTrackIndex;
        if (i < 0) {
            return -105;
        }
        return nativeAddSubTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, d, d2, d3, d4, 0, i);
    }

    public int setMusicAndResult(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicAndResult(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4);
    }

    public int addExternalTrack(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double d, double d2, double d3, double d4, int i) {
        return nativeAddSubTrack(this.mNative, strArr, strArr2, iArr, iArr2, iArr, iArr2, d, d2, d3, d4, 5, this.mHostTrackIndex);
    }

    public int initImageEditor(Bitmap[] bitmapArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, int[] iArr4, String[] strArr2, String[][] strArr3, float[] fArr, int[] iArr5, int i) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[bitmapArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            fArr2 = fArr;
        }
        int nativeInitImageEditor = nativeInitImageEditor(this.mNative, bitmapArr, iArr, iArr2, strArr, iArr3, iArr4, strArr2, strArr3, fArr2, iArr5, i);
        if (nativeInitImageEditor < 0) {
            return nativeInitImageEditor;
        }
        this.mHostTrackIndex = nativeInitImageEditor;
        return 0;
    }

    public int addVideoTrackForMV(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, VESize[] vESizeArr, int i2, boolean[] zArr, float f) {
        long j = this.mNative;
        if (j == 0) {
            return -1;
        }
        int i3 = this.mHostTrackIndex;
        if (i3 < 0) {
            return -105;
        }
        return nativeAddVideoTrack(j, strArr, strArr2, iArr, iArr2, iArr3, iArr4, iArr5, i, vESizeArr, i3, i2, zArr, f);
    }

    public Object initMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        return nativeInitMVResources(this.mNative, str, strArr, strArr2, iArr, str2, i, i2, z, z2, z3, i3, i4);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        return initVideoEditor2(strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr, fArr, null, i, false, zArr, strArr5);
    }

    public int setMusicAndResultLoadCache(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, boolean[] zArr, String[] strArr) {
        long j = this.mNative;
        if (j == 0) {
            return -112;
        }
        return nativeSetMusicAndResultLoadCache(j, i, i2, str, str2, str3, str4, str5, str6, i3, i4, zArr, strArr);
    }

    public int changeResWithEffect(boolean[] zArr, String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, int[] iArr5) {
        float[] fArr3;
        float[] fArr4;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr5 = new float[strArr.length];
            Arrays.fill(fArr5, 1.0f);
            fArr3 = fArr5;
        } else {
            fArr3 = fArr;
        }
        if (fArr2 != null || strArr3 == null) {
            fArr4 = fArr2;
        } else {
            float[] fArr6 = new float[strArr3.length];
            Arrays.fill(fArr6, 1.0f);
            fArr4 = fArr6;
        }
        return nativeChangeResWithEffect(this.mNative, zArr, strArr, strArr2, iArr, iArr2, fArr3, strArr3, strArr4, iArr3, iArr4, fArr4, iArr5);
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z) {
        float[] fArr3;
        float[] fArr4;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr5 = new float[strArr.length];
            Arrays.fill(fArr5, 1.0f);
            fArr3 = fArr5;
        } else {
            fArr3 = fArr;
        }
        if (fArr2 != null || strArr2 == null) {
            fArr4 = fArr2;
        } else {
            float[] fArr6 = new float[strArr2.length];
            Arrays.fill(fArr6, 1.0f);
            fArr4 = fArr6;
        }
        int nativeInitVideoEditor2 = nativeInitVideoEditor2(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr3, fArr4, iArr5, i, z);
        if (nativeInitVideoEditor2 < 0) {
            return nativeInitVideoEditor2;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2;
        return 0;
    }

    public int initVideoEditorWithCanvas(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, String[] strArr5, int[] iArr5, int[] iArr6, String[][] strArr6, float[] fArr, int i, VESize[] vESizeArr) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            fArr2 = fArr;
        }
        int nativeInitVideoEditorWithCanvas = nativeInitVideoEditorWithCanvas(this.mNative, strArr, strArr2, iArr, iArr2, strArr3, strArr4, iArr3, iArr4, strArr5, iArr5, iArr6, strArr6, fArr2, i, vESizeArr);
        if (nativeInitVideoEditorWithCanvas < 0) {
            return nativeInitVideoEditorWithCanvas;
        }
        this.mHostTrackIndex = nativeInitVideoEditorWithCanvas;
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, String[] strArr2, int[] iArr3, int[] iArr4, String[] strArr3, String[][] strArr4, float[] fArr, float[] fArr2, int[] iArr5, int i, boolean z, boolean[] zArr, String[] strArr5) {
        float[] fArr3;
        float[] fArr4;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr5 = new float[strArr.length];
            Arrays.fill(fArr5, 1.0f);
            fArr3 = fArr5;
        } else {
            fArr3 = fArr;
        }
        if (fArr2 != null || strArr2 == null) {
            fArr4 = fArr2;
        } else {
            float[] fArr6 = new float[strArr2.length];
            Arrays.fill(fArr6, 1.0f);
            fArr4 = fArr6;
        }
        int nativeInitVideoEditor2LoadCache = nativeInitVideoEditor2LoadCache(this.mNative, strArr, iArr, iArr2, strArr2, iArr3, iArr4, strArr3, strArr4, fArr3, fArr4, iArr5, i, z, zArr, strArr5);
        if (nativeInitVideoEditor2LoadCache < 0) {
            return nativeInitVideoEditor2LoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditor2LoadCache;
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean z) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            fArr2 = fArr;
        }
        int nativeInitVideoEditorMV = nativeInitVideoEditorMV(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, z);
        if (nativeInitVideoEditorMV < 0) {
            return nativeInitVideoEditorMV;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMV;
        return 0;
    }

    public int initVideoEditor2(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr2, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, String[] strArr3, String[][] strArr4, float[] fArr, int i, boolean[] zArr, String[] strArr5) {
        float[] fArr2;
        if (this.mNative == 0) {
            return -112;
        }
        if (fArr == null) {
            float[] fArr3 = new float[strArr.length];
            Arrays.fill(fArr3, 1.0f);
            fArr2 = fArr3;
        } else {
            fArr2 = fArr;
        }
        int nativeInitVideoEditorMVLoadCache = nativeInitVideoEditorMVLoadCache(this.mNative, strArr, iArr, iArr2, iArr3, iArr4, strArr2, iArr5, iArr6, iArr7, iArr8, iArr9, strArr3, strArr4, fArr2, i, zArr, strArr5);
        if (nativeInitVideoEditorMVLoadCache < 0) {
            return nativeInitVideoEditorMVLoadCache;
        }
        this.mHostTrackIndex = nativeInitVideoEditorMVLoadCache;
        return 0;
    }
}
