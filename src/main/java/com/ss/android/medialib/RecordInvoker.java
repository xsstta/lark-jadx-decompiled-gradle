package com.ss.android.medialib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.medialib.AVCEncoder;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.medialib.listener.AbstractC59397a;
import com.ss.android.medialib.listener.AbstractC59398b;
import com.ss.android.medialib.listener.AbstractC59399c;
import com.ss.android.medialib.listener.AbstractC59400d;
import com.ss.android.medialib.listener.DistortionInfoCallback;
import com.ss.android.medialib.listener.SmallWindowSnapshotListener;
import com.ss.android.medialib.log.C59401a;
import com.ss.android.medialib.model.C59403b;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.FaceAttributeInfo;
import com.ss.android.medialib.model.FaceDetectInfo;
import com.ss.android.medialib.model.SceneDetectInfo;
import com.ss.android.medialib.model.SkeletonInfo;
import com.ss.android.medialib.p2999b.C59376a;
import com.ss.android.medialib.p2999b.C59380b;
import com.ss.android.medialib.p2999b.C59381c;
import com.ss.android.medialib.p3000c.C59386a;
import com.ss.android.medialib.presenter.C59424g;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.medialib.style.AbstractC59429a;
import com.ss.android.medialib.style.StyleActionListener;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.AbstractC64086z;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.LandMarkFrame;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDebugSettings;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEGestureEvent;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class RecordInvoker implements MessageCenter.AbstractC2081a {
    private static AbstractC59367a mRecordStopCallback;
    private static Runnable sDuetCompleteRunable = null;
    private static AbstractC59397a sFaceDetectListener;
    private static MessageCenter.AbstractC2081a sMessageListener;
    private static AbstractC59398b sNativeInitListener;
    private static List<AbstractC59399c> sSlamDetectListeners = new ArrayList();
    public AVCEncoder mAVCEncoder;
    private AbstractC59369a mAVCEncoderInterface;
    private Runnable mDuetCompleteRunable;
    private AbstractC59369a mEncoderCaller;
    private AbstractC59397a mFaceDetectListener;
    private C59376a.AbstractC59377a mGetTimestampCallback;
    public long mHandler = 0;
    private boolean mIsDuringScreenshot;
    private boolean mIsRenderReady = false;
    private List<AbstractC64086z> mLandmarkDetectListeners = new ArrayList();
    private MessageCenter.AbstractC2081a mMessageListener;
    private AbstractC59398b mNativeInitListener;
    private C59376a.AbstractC59378b mOpenGLCallback;
    private C59376a.AbstractC59379c mShotScreenCallback;
    private List<AbstractC59399c> mSlamDetectListeners = new ArrayList();
    private C59368b mStyleProxyImpl = null;
    private AbstractC59400d mTextureTimeListener;
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    C59424g.AbstractC59425a onDuetProcessListener;
    C59424g.AbstractC59426b onVideoEOFListener;

    public interface EffectAlgorithmCallback {
        void onResult(int[] iArr, long[] jArr, float f);
    }

    public interface FaceResultCallback {
        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }

    public interface OnARTextCountCallback {
        void onResult(int i);
    }

    public interface OnCherEffectParmaCallback {
        void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr);
    }

    public interface OnFrameCallback {
        void onFrame(int i, double d);

        void onFrame(ByteBuffer byteBuffer, int i, int i2, int i3, double d);

        void onInit(EGLContext eGLContext, int i, int i2, int i3, long j);
    }

    public interface OnHandDetectCallback {
        void onResult(int[] iArr);
    }

    public interface OnLensResultCallback {
        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    public interface OnPictureCallback {
        void onResult(int[] iArr, int i, int i2);
    }

    public interface OnPictureCallbackV2 {
        void onImage(int[] iArr, int i, int i2);

        void onResult(int i, int i2);
    }

    public interface OnPreviewRadioListener {
        void onInfo(int i, int i2);
    }

    public interface OnRunningErrorCallback {
        void onAccurateInfo(int i, double d);

        void onError(int i);

        void onInfo(int i, int i2);
    }

    public interface OnSceneDetectCallback {
        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    public interface OnSkeletonDetectCallback {
        void onResult(SkeletonInfo skeletonInfo);
    }

    public interface OnSmartBeautyCallback {
        void onResult(C59403b bVar);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$a */
    public interface AbstractC59367a {
        /* renamed from: a */
        void mo202189a();
    }

    private native int nativeAddMetadata(long j, String str, String str2);

    private native int nativeAddPCMData(long j, byte[] bArr, int i);

    private native int nativeAddPipRenderTargetSurface(long j, Surface surface, int i, int i2, Bitmap bitmap, boolean z);

    private native int nativeAddTrack(long j, int i, String str, long j2, long j3);

    private native int nativeAnimateImagesToPreview(long j, String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2);

    private native int nativeBindEffectAudioProcessor(long j, int i, int i2, boolean z);

    private native void nativeCancelAll(long j);

    private native int nativeChangeDuetVideo(long j, String str, String str2);

    private native int nativeChangeMusicPath(long j, String str);

    private native void nativeChangeOutputVideoSize(long j, int i, int i2);

    private native void nativeChangePreviewRadioMode(long j, int i);

    private native int nativeChangeSurface(long j, Surface surface);

    private native int[] nativeCheckComposerNodeExclusion(long j, String str, String str2, String str3);

    private native void nativeChooseAreaFromRatio34(long j, float f);

    private native void nativeChooseSlamFace(long j, int i);

    private native int nativeClearFragFile(long j);

    private native int nativeCloseWavFile(long j, boolean z);

    private native int nativeConcat(long j, String str, String str2, int i, String str3, String str4, boolean z, int i2);

    private native long nativeConfigStyleResourceFinder(long j, AssetManager assetManager);

    private native long nativeCreate();

    private native int nativeDeleteLastFrag(long j);

    private native void nativeDisableRender(long j, boolean z);

    private native void nativeEnableAbandonFirstFrame(long j, boolean z);

    private native int nativeEnableAudio(long j, int i);

    private native void nativeEnableAudioAlgorithmParam(long j, boolean z, String str, String str2);

    private native void nativeEnableAudioLoudnessBalanceFilter(long j, boolean z, double d);

    private native int nativeEnableAudioPlayerFromVE(long j, int i);

    private native int nativeEnableAutoTestLog(long j, boolean z);

    private native void nativeEnableEffect(long j, boolean z);

    private native void nativeEnableEffectBGM(long j, boolean z);

    private native void nativeEnableFaceBeautifyDetect(long j, int i);

    private native void nativeEnableFaceExtInfo(int i);

    private native void nativeEnableLandMark(long j, boolean z);

    private native void nativeEnableLensProcess(long j, int i, boolean z);

    private native void nativeEnablePBO(boolean z);

    private native void nativeEnablePictureTestMode(long j, boolean z);

    private native void nativeEnablePreloadEffectResource(long j, boolean z);

    private native void nativeEnableRecordBGMToMp4(long j, boolean z);

    private native int nativeEnableRecordFlip(long j, int i);

    private native void nativeEnableRecordingMp4(long j, boolean z);

    private native void nativeEnableScan(long j, boolean z, long j2);

    private native void nativeEnableSceneRecognition(long j, boolean z);

    private native void nativeEnableShotScreenUseOesTexture(long j, boolean z);

    private native void nativeEnableSkeletonDetect(long j, boolean z);

    private native void nativeEnableSmartBeauty(long j, boolean z);

    private native void nativeEnableStickerRecognition(long j, boolean z);

    private native int nativeEnableTimestampCallback(long j, boolean z);

    private native void nativeEnableUse16BitAlign(long j, boolean z);

    private native void nativeEnableWaterMark(long j, boolean z);

    private native int nativeExpandPreviewAndRecordInterval(long j, boolean z);

    private native int nativeFetchDistortionInfo(long j, DistortionInfoCallback distortionInfoCallback);

    private native long nativeGetAudioEndTime(long j);

    private native long nativeGetEndFrameTime(long j);

    private native EnigmaResult nativeGetEnigmaResult(long j);

    private native float nativeGetFilterIntensity(long j, String str);

    private native String[] nativeGetFragVideoPaths(long j);

    private native long nativeGetLastAudioLength(long j);

    private native int nativeGetLastRecordFrameNum(long j);

    private native int nativeGetPreviewRenderRect(long j, int[] iArr);

    private native float nativeGetReactionCamRotation(long j);

    private native int[] nativeGetReactionCameraPosInRecordPixel(long j);

    private native int[] nativeGetReactionCameraPosInViewPixel(long j);

    private native int[] nativeGetReactionPosMarginInViewPixel(long j);

    private native String nativeGetResourceMultiViewTag(long j, String str);

    private native void nativeGetSequencePreviewFrame(long j, int i, int i2, boolean z, int i3, String str);

    private native int nativeGetSlamFaceCount(long j);

    private native int nativeGetSmallWindowSnapshot(long j, int i, int i2, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener);

    private native void nativeHandleEffectAudio(long j, boolean z, long j2);

    private native int nativeHideSlamKeyBoard(long j, boolean z);

    private native int nativeInitAudioConfig(long j, int i, int i2, int i3, int i4, int i5);

    private native int nativeInitAudioPlayer(long j, String str, int i, int i2, long j2, boolean z, boolean z2, int i3);

    private native int nativeInitBeautyPlay(long j, int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeInitBeautyPlayOnlyPreview(long j, ScanSettings scanSettings);

    private native int nativeInitDuet(long j, String str, float f, float f2, float f3, boolean z, boolean z2, int i);

    private native void nativeInitFaceBeautifyDetectExtParam(long j, boolean z, boolean z2, boolean z3);

    private native void nativeInitFaceBeautyDetectExtParam(long j, boolean z);

    private native void nativeInitFaceDetectExtParam(long j, int i, boolean z, boolean z2);

    private native void nativeInitHDRNetDetectExtParam(long j, boolean z, String str);

    private native void nativeInitHandDetectExtParam(long j, int i, int i2, int i3);

    private native int nativeInitImageDrawer(long j, int i);

    private native int nativeInitMediaCodecSurface(long j, Surface surface);

    private native int nativeInitReaction(long j, String str);

    private native int nativeInitWavFile(long j, int i, int i2, double d);

    private native boolean nativeIsQualcomm(long j);

    private native boolean nativeIsSmallWinCameraRender(long j);

    private native boolean nativeIsStickerEnabled(long j);

    private native int nativeMarkPlayDone(long j);

    private native int nativeOnAudioCallback(long j, byte[] bArr, int i);

    private native int nativeOnDrawFrameBuffer(long j, byte[] bArr, int i, int i2, int i3, boolean z);

    private native int nativeOnDrawFrameBuffer2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, boolean z);

    private native int nativeOnDrawFrameBuffer3(long j, byte[] bArr, int i, int i2, int i3, int i4, boolean z);

    private native int nativeOnDrawFrameBuffer4(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, boolean z);

    private native int nativeOnFrameAvailable(long j, int i, float[] fArr, boolean z);

    private native int nativeOnFrameTime(long j, double d);

    private native int nativePauseEffectAudio(long j, boolean z);

    private native int nativePauseRender(long j);

    private native boolean nativePosInReactionRegion(long j, int i, int i2);

    private native int nativePostDuetAction(long j, int i, long j2);

    private native void nativePreviewVideoBg(long j);

    private native int nativeProcessTouchEvent(long j, float f, float f2);

    private native void nativeRecoverCherEffect(long j, String[] strArr, double[] dArr, boolean[] zArr);

    private native void nativeRegisterCherEffectParamCallback(long j, OnCherEffectParmaCallback onCherEffectParmaCallback);

    private native void nativeRegisterEffectAlgorithmCallback(long j, EffectAlgorithmCallback effectAlgorithmCallback);

    private native void nativeRegisterFaceResultCallback(long j, boolean z, FaceResultCallback faceResultCallback);

    private native void nativeRegisterHandDetectCallback(long j, int[] iArr, OnHandDetectCallback onHandDetectCallback);

    private native void nativeRegisterSceneDetectCallback(long j, OnSceneDetectCallback onSceneDetectCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j, OnSkeletonDetectCallback onSkeletonDetectCallback);

    private native void nativeRegisterSmartBeautyCallback(long j, OnSmartBeautyCallback onSmartBeautyCallback);

    private native void nativeReleaseGPUResources(long j);

    private native int nativeRemoveTrack(long j, int i, int i2);

    private native int nativeRenderPicture(long j, byte[] bArr, int i, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture2(long j, ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, int[] iArr2, ByteBuffer byteBuffer3, int[] iArr3, int i, int i2, int i3, int i4, int i5, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPicture3(long j, Bitmap bitmap, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2);

    private native int nativeRenderPictureToBitmap(long j, byte[] bArr, int i, int i2, int i3, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap);

    private native void nativeResetPerfStats(long j);

    private native int nativeResetStartTime(long j, long j2, long j3);

    private native float nativeRotateReactionWindow(long j, float f);

    private native int nativeSave(long j);

    private native int[] nativeScaleReactionWindow(long j, float f);

    private native int nativeSeekTrack(long j, int i, int i2, long j2);

    private native void nativeSendEffectMsg(long j, int i, long j2, long j3, String str, boolean z);

    private native void nativeSetAdaptiveSharpenParams(long j, VEAdaptiveSharpenParams vEAdaptiveSharpenParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetAlgorithmChangeMsg(long j, int i, boolean z);

    private native int nativeSetBGMVolume(long j, float f, int i);

    private native int nativeSetBeautyFace(long j, int i, String str);

    private native int nativeSetBeautyFaceIntensity(long j, float f, float f2);

    private native int nativeSetBgmMute(long j, boolean z);

    private native void nativeSetCamPreviewSize(long j, int i, int i2);

    private native void nativeSetCameraClose(long j, boolean z);

    private native void nativeSetCameraFirstFrameOptimize(long j, boolean z, int i);

    private native void nativeSetCustomVideoBg(long j, String str, String str2, String str3, int i, int i2, long j2, boolean z, int i3);

    private native void nativeSetCustomVideoBgGif(long j, String str, String str2);

    private native int nativeSetDLEEnable(long j, boolean z);

    private native void nativeSetDebugSettings(long j, VEDebugSettings vEDebugSettings);

    private native void nativeSetDetectInterval(long j, int i);

    private native void nativeSetDetectionMode(long j, boolean z);

    private native int nativeSetDeviceRotationWithStamp(long j, float[] fArr, double d);

    private native int nativeSetDoubleFilterNew(long j, String str, String str2, float f, float f2, float f3);

    private native void nativeSetDuetCameraPaused(long j, boolean z);

    private native void nativeSetEffectAlgorithmRequirement(long j, long j2);

    private native void nativeSetEffectBuildChainType(long j, int i);

    private native int nativeSetEnableDuetV2(long j, boolean z);

    private native int nativeSetEnableEffCtrl(long j, boolean z);

    private native void nativeSetEnigmaDetectParams(long j, boolean z, float f, float f2, float f3, float f4, boolean z2, int i, long j2, int i2, boolean z3, boolean z4, boolean z5);

    private native int nativeSetFaceMakeUp(long j, String str, float f, float f2);

    private native int nativeSetFaceMakeUp2(long j, String str);

    private native int nativeSetFilter(long j, String str, String str2, float f);

    private native int nativeSetFilterIntensity(long j, float f);

    private native int nativeSetFilterNew(long j, String str, float f);

    private native int nativeSetFrameCallback(long j, OnFrameCallback onFrameCallback, boolean z, int i);

    private native int nativeSetHandDetectLowpower(long j, boolean z);

    private native int nativeSetHardEncoderStatus(long j, boolean z);

    private native int nativeSetInitHardEncodeRet(long j, int i);

    private native int nativeSetIntensityByType(long j, int i, float f);

    private native int nativeSetKaraoke(long j, boolean z, boolean z2);

    private native void nativeSetLandMarkInfo(long j, LandMarkFrame landMarkFrame);

    private native void nativeSetLumaDetectParams(long j, VELumaDetectParams vELumaDetectParams, OnLensResultCallback onLensResultCallback);

    private native void nativeSetMemoryOpt(long j, boolean z);

    private native void nativeSetModeChangeState(long j, int i);

    private native int nativeSetMusicNodes(long j, String str);

    private native int nativeSetMusicTime(long j, long j2, long j3);

    private native void nativeSetNativeLibraryDir(String str);

    private native void nativeSetPaddingBottomInRatio34(long j, float f);

    private native int nativeSetPlayLength(long j, long j2);

    private native void nativeSetPreviewSizeRatio(long j, float f, int i, int i2);

    private native void nativeSetReactionBorderParam(long j, int i, int i2);

    private native boolean nativeSetReactionMaskImage(long j, String str, boolean z);

    private native void nativeSetReactionPosMargin(long j, int i, int i2, int i3, int i4);

    private native int nativeSetRecordPrepareTime(long j, long j2);

    private native void nativeSetRenderCacheString(long j, String str, String str2);

    private native void nativeSetRenderCacheTexture(long j, String str, String str2);

    private native int nativeSetReshape(long j, String str, float f, float f2);

    private native int nativeSetReshapeResource(long j, String str);

    private native int nativeSetRunningErrorCallback(long j, OnRunningErrorCallback onRunningErrorCallback);

    private native int nativeSetSafeArea(long j, int i, VESafeAreaParams[] vESafeAreaParamsArr, int i2);

    private native void nativeSetScale(long j, float f);

    private native boolean nativeSetSharedTextureStatus(boolean z);

    private native int nativeSetSkinTone(long j, String str);

    private native int nativeSetSlamFace(long j, Bitmap bitmap);

    private native int nativeSetSlamInputText(long j, String str, int i, int i2, String str2);

    private native int nativeSetSticker(long j, Bitmap bitmap, int i, int i2);

    private native int nativeSetStickerPathWithTag(long j, int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2);

    private native int nativeSetSwapDuetRegion(long j, boolean z);

    private native int nativeSetSwapReactionRegion(long j, boolean z);

    private native void nativeSetTaintSceneDetectParams(long j, VETaintSceneDetectParams vETaintSceneDetectParams, OnLensResultCallback onLensResultCallback);

    private native int nativeSetUseMusic(long j, int i);

    private native void nativeSetVideoBgSpeed(long j, double d);

    private native void nativeSetVideoEncodeRotation(long j, int i);

    private native int nativeSetVideoQuality(long j, int i, int i2);

    private native void nativeSetWaterMark(long j, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native void nativeSetWaterMark2(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    private native int nativeShotHDScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3);

    private native int nativeShotScreen(long j, String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, boolean z2);

    private native int nativeSlamDeviceConfig(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native int nativeSlamGetTextBitmap(long j, OnARTextBitmapCallback onARTextBitmapCallback);

    private native int nativeSlamGetTextLimitCount(long j, OnARTextCountCallback onARTextCountCallback);

    private native int nativeSlamGetTextParagraphContent(long j, OnARTextContentCallback onARTextContentCallback);

    private native int nativeSlamProcessDoubleClickEvent(long j, float f, float f2);

    private native int nativeSlamProcessIngestAcc(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGra(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestGyr(long j, double d, double d2, double d3, double d4);

    private native int nativeSlamProcessIngestOri(long j, double[] dArr, double d);

    private native int nativeSlamProcessPanEvent(long j, float f, float f2, float f3, float f4, float f5);

    private native int nativeSlamProcessRotationEvent(long j, float f, float f2);

    private native int nativeSlamProcessScaleEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEvent(long j, float f, float f2);

    private native int nativeSlamProcessTouchEventByType(long j, int i, float f, float f2, int i2);

    private native int nativeSlamSetLanguge(long j, String str);

    private native int nativeStartPlay(long j, Surface surface, int i, int i2, String str);

    private native int nativeStartPlay2(long j, int i, int i2, int i3, int i4, String str);

    private native int nativeStartPrePlay(long j, boolean z, int i);

    private native int nativeStartRecord(long j, double d, boolean z, int i, int i2, int i3, String str, String str2, boolean z2);

    private native int nativeStartRender(long j);

    private native int nativeStopPlay(long j);

    private native int nativeStopPrePlay(long j);

    private native int nativeStopRecord(long j, boolean z);

    private native int nativeSwapMainAndPipRenderTarget(long j, boolean z);

    private native int nativeSwitchEffectInGLTask(long j, boolean z);

    private native int nativeTryRestore(long j, int i, String str);

    private native void nativeUnRegisterEffectAlgorithmCallback(long j);

    private native void nativeUnRegisterFaceResultCallback(long j);

    private native int nativeUninitAudioPlayer(long j);

    private native int nativeUninitBeautyPlay(long j);

    private native void nativeUpdateAlgorithmRuntimeParam(long j, int i, float f);

    private native void nativeUpdateReactionBGAlpha(long j, float f);

    private native int[] nativeUpdateReactionCameraPos(long j, int i, int i2, int i3, int i4);

    private native int[] nativeUpdateReactionCameraPosWithRotation(long j, int i, int i2, int i3, int i4, float f);

    private native void nativeUpdateRotation(long j, float f, float f2, float f3);

    private native void nativeUpdateRotationAndFront(long j, int i, boolean z, boolean z2);

    private native void nativeUseLargeMattingModel(long j, boolean z);

    private native int natvieEnableGetPropTrack(long j, boolean z);

    private native int natvieSetExternalFaceMakeupOpacity(long j, String str, float f, float f2);

    private native void setCaptureMirror(long j, boolean z);

    private native void setCaptureMirror2(long j, int i);

    private native void setCaptureResize(long j, boolean z, int[] iArr, int[] iArr2);

    private native void setImageExposure(long j, float f);

    public native long nativeAllocateStyleEngine(long j, int i, int i2, int i3, StyleActionListener styleActionListener);

    public native long nativeAllocateStyleManager(long j, long j2, StyleActionListener styleActionListener);

    public native int nativeAnimateImageToPreview(long j, String str, String str2, int i);

    public native int nativeAppendComposerNodes(long j, String[] strArr, int i);

    public native void nativeAttachExtFrameData(long j, Object obj);

    public native int nativeDrawStyleToBitmap(long j, long j2, long j3, Bitmap bitmap, StyleActionListener styleActionListener);

    public native void nativeEnable3buffer(long j, boolean z);

    public native void nativeEnableClearColorAfterRender(long j, boolean z);

    public native int nativeEnableDuetGlFinish(long j, boolean z);

    public native void nativeEnableEffectRT(long j, boolean z);

    public native void nativeEnableMakeUpBackground(long j, boolean z);

    public native int nativeEnableRecordMaxDuration(long j, boolean z);

    public native void nativeForceFirstFrameHasEffect(long j, boolean z);

    public native float[] nativeGetAECSuggestVolume(long j);

    public native String nativeGetComposerNodePaths(long j);

    public native float nativeGetComposerNodeValue(long j, String str, String str2);

    public native long nativeGetEffectHandler(long j);

    public native String nativeGetEvents(long j, long j2);

    public native String nativeGetFeatureParam(long j, long j2, long j3, int i, boolean z);

    public native long[] nativeGetFeatures(long j, long j2);

    public native ImageFrame nativeGetFrameByKey(long j, String str);

    public native VEMapBufferInfo nativeGetMapBuffer(long j);

    public native String nativeGetStyleRenderRect(long j, long j2);

    public native boolean nativeIsGestureRegistered(long j, int i);

    public native void nativeOnSwapGlBuffers(long j);

    public native long nativeOperateFeature(long j, long j2, long j3, int i, String str, StyleActionListener styleActionListener);

    public native String[] nativeOperateFeatureGroup(long j, long j2, long[] jArr, int[] iArr, String[] strArr);

    public native long nativeOperateStyleManager(long j, long j2, int i, long j3, String str, String str2, String str3, StyleActionListener styleActionListener);

    public native boolean nativePreviewDuetVideo(long j);

    public native boolean nativeProcessTouchEvent2(long j, int i, float f, float f2, float f3, float f4, int i2, int i3);

    public native int nativeRefreshEvent(long j, long j2);

    public native long nativeReleaseStyleEngine(long j, long j2, boolean z, StyleActionListener styleActionListener);

    public native long nativeReleaseStyleManager(long j, long j2, boolean z, StyleActionListener styleActionListener);

    public native int nativeReloadComposerNodes(long j, String[] strArr, int i);

    public native int nativeRemoveComposerNodes(long j, String[] strArr, int i);

    public native int nativeReplaceComposerNodes(long j, String[] strArr, int i, String[] strArr2, int i2);

    public native int nativeSetAlgorithmPreConfig(long j, int i, int i2);

    public native int nativeSetAudioDataInterface(long j, long j2);

    public native void nativeSetCaptureRenderWidth(long j, int i, int i2);

    public native void nativeSetClientState(long j, int i);

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetCodecType(long j, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetComposerMode(long j, int i, int i2);

    public native int nativeSetComposerNodes(long j, String[] strArr, int i);

    public native int nativeSetComposerResourcePath(long j, String str);

    public native int nativeSetDisplaySettings(long j, int i, long j2, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z);

    public native void nativeSetDropFrames(long j, int i);

    public native int nativeSetEffectMaxMemoryCache(long j, int i);

    public native int nativeSetEnableAEC(long j, boolean z, String str);

    public native int nativeSetEnableEarBack(long j, boolean z);

    public native int nativeSetEventEnable(long j, long j2, boolean z);

    public native long nativeSetEvents(long j, long j2, String str);

    public native void nativeSetForceAlgorithmCnt(long j, int i);

    public native int nativeSetLoudness(long j, boolean z, int i);

    public native int nativeSetMaleMakeupState(long j, boolean z);

    public native void nativeSetPreviewDuetVideoPaused(long j, boolean z);

    public native int nativeSetPreviewRadioListener(long j, OnPreviewRadioListener onPreviewRadioListener);

    public native void nativeSetRecordContentType(long j, boolean z);

    public native int nativeSetRecordMaxDuration(long j, long j2);

    public native int nativeSetStickerRequestCallback(long j, IStickerRequestCallback iStickerRequestCallback);

    public native int nativeSetStylePictureOffset(long j, long j2, float f, float f2, float f3, float f4);

    public native int nativeSetVEEffectParams(long j, VEEffectParams vEEffectParams);

    public native long nativeStyleMusicSeek(long j, long j2, long j3);

    public native long nativeStyleRenderEnable(long j, long j2, boolean z);

    public native boolean nativeSuspendGestureRecognizer(long j, int i, boolean z);

    public native int nativeTurnToOffScreenRender(long j);

    public native int nativeUpdateComposerNode(long j, String str, String str2, float f);

    public native long nativeUpdateEvents(long j, long j2, String str);

    public native int nativeUpdateMultiComposerNodes(long j, int i, String[] strArr, String[] strArr2, float[] fArr);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native int nativeWriteFile2(long j, ByteBuffer byteBuffer, int i, long j2, long j3, int i2, boolean z);

    public static AbstractC59398b getNativeInitListener() {
        return sNativeInitListener;
    }

    private boolean isRenderReady() {
        return this.mIsRenderReady;
    }

    public void destroyMessageCenter() {
        MessageCenter.m9051b(this);
    }

    public long getHandler() {
        return this.mHandler;
    }

    public AbstractC59429a getStyleProxy() {
        return this.mStyleProxyImpl;
    }

    public void initMessageCenter() {
        MessageCenter.m9049a(this);
    }

    public void onNativeRecordStop() {
        AbstractC59367a aVar = mRecordStopCallback;
        if (aVar != null) {
            aVar.mo202189a();
        }
    }

    public void onNativeVideoBgEOF() {
        C59424g.AbstractC59426b bVar = this.onVideoEOFListener;
        if (bVar != null) {
            bVar.mo202662a();
        }
    }

    public void releaseEncoder() {
        AVCEncoder aVCEncoder = this.mAVCEncoder;
        if (aVCEncoder != null) {
            aVCEncoder.mo201736h();
        }
    }

    static {
        TENativeLibsLoader.m234148d();
    }

    public static synchronized void clearSlamDetectListener() {
        synchronized (RecordInvoker.class) {
            sSlamDetectListeners.clear();
        }
    }

    public void cancelAll() {
        long j = this.mHandler;
        if (j != 0) {
            nativeCancelAll(j);
        }
    }

    public synchronized void clearLandMarkDetectListener() {
        this.mLandmarkDetectListeners.clear();
    }

    public synchronized void clearSlamDetectListener2() {
        this.mSlamDetectListeners.clear();
    }

    public int[] getReactionCameraPosInRecordPixel() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetReactionCameraPosInRecordPixel(j);
    }

    public int[] getReactionCameraPosInViewPixel() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetReactionCameraPosInViewPixel(j);
    }

    public int[] getReactionPosMarginInViewPixel() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetReactionPosMarginInViewPixel(j);
    }

    public String[] getRecordedVideoPaths() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetFragVideoPaths(j);
    }

    public void initHardEncoderInAdvance() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new AVCEncoder();
        }
    }

    public boolean isSmallWinCameraRender() {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativeIsSmallWinCameraRender(j);
    }

    public void onDuetVideoComplete() {
        Runnable runnable = this.mDuetCompleteRunable;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = sDuetCompleteRunable;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public String onNativeCall_GenerateUUID() {
        return UUID.randomUUID().toString();
    }

    public void onNativeCallback_onOpenGLCreate() {
        C63929ab.m250974a("RecordInvoker", "onNativeCallback_onOpenGLCreate");
        C59376a.AbstractC59378b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.mo202211a();
        }
    }

    public void onNativeCallback_onOpenGLDestroy() {
        C63929ab.m250974a("RecordInvoker", "onNativeCallback_onOpenGLDestroy");
        C59376a.AbstractC59378b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            bVar.mo202212b();
        }
    }

    public void onPause() {
        C63929ab.m250976b("RecordInvoker", "reset screenshot flag for next capture");
        this.mIsDuringScreenshot = false;
    }

    public boolean previewDuetVideo() {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativePreviewDuetVideo(j);
    }

    public void previewVideoBg() {
        long j = this.mHandler;
        if (j != 0) {
            nativePreviewVideoBg(j);
        }
    }

    public void releaseGPUResources() {
        long j = this.mHandler;
        if (j != 0) {
            nativeReleaseGPUResources(j);
        }
    }

    public void resetPerfStats() {
        long j = this.mHandler;
        if (j != 0) {
            nativeResetPerfStats(j);
        }
    }

    public void uninitAudioPlayer() {
        long j = this.mHandler;
        if (j != 0) {
            nativeUninitAudioPlayer(j);
        }
    }

    private int onNativeCallback_GetHardEncoderProfile() {
        if (this.mEncoderCaller == null) {
            return -1;
        }
        C63929ab.m250974a("RecordInvoker", "GetHardEncoderProfile");
        return this.mEncoderCaller.mo202156a();
    }

    public int clearFragFile() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeClearFragFile(j);
    }

    public void createEncoder() {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new AVCEncoder();
        }
        this.mAVCEncoder.mo201732d();
    }

    public int deleteLastFrag() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeDeleteLastFrag(j);
    }

    public long getAudioEndTime() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeGetAudioEndTime(j);
    }

    public String getComposerNodePaths() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetComposerNodePaths(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return "";
    }

    public long getEffectHandler() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetEffectHandler(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public long getEndFrameTime() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeGetEndFrameTime(j);
    }

    public EnigmaResult getEnigmaResult() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetEnigmaResult(j);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return null;
    }

    public long getLastAudioLength() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeGetLastAudioLength(j);
    }

    public int getLastRecordFrameNum() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeGetLastRecordFrameNum(j);
    }

    public VEMapBufferInfo getMapBuffer() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetMapBuffer(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return null;
    }

    public int[] getPreviewRenderRect() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        int[] iArr = new int[4];
        if (nativeGetPreviewRenderRect(j, iArr) == 0) {
            return iArr;
        }
        return null;
    }

    public float getReactionCamRotation() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000.0f;
        }
        return nativeGetReactionCamRotation(j);
    }

    public int getSlamFaceCount() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetSlamFaceCount(j);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public boolean isStickerEnabled() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeIsStickerEnabled(j);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return false;
    }

    public int markPlayDone() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeMarkPlayDone(j);
    }

    public void onNativeCallback_UninitHardEncoder() {
        C63929ab.m250974a("RecordInvoker", " onUninitHardEncoder == enter");
        AbstractC59369a aVar = this.mEncoderCaller;
        if (aVar != null) {
            aVar.mo202164b();
        }
        C63929ab.m250974a("RecordInvoker", " onUninitHardEncoder == exit");
    }

    public int onNativeCallback_onOpenGLRunning() {
        C63929ab.m250976b("RecordInvoker", "onNativeCallback_onOpenGLRunning");
        C59376a.AbstractC59378b bVar = this.mOpenGLCallback;
        if (bVar != null) {
            return bVar.mo202213c();
        }
        return 0;
    }

    public int pauseRender() {
        long j = this.mHandler;
        if (j != 0) {
            return nativePauseRender(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int save() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSave(j);
    }

    public int startRender() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeStartRender(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int stopPlay() {
        this.mIsRenderReady = false;
        if (this.mHandler == 0) {
            return -100000;
        }
        destroyMessageCenter();
        return nativeStopPlay(this.mHandler);
    }

    public int stopPrePlay() {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeStopPrePlay(j);
    }

    public int turnToOffScreenRender() {
        long j = this.mHandler;
        if (j != 0) {
            return nativeTurnToOffScreenRender(j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void unRegisterEffectAlgorithmCallback() {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeUnRegisterEffectAlgorithmCallback(j);
        }
    }

    public void unRegisterFaceResultCallback() {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeUnRegisterFaceResultCallback(j);
        }
    }

    public RecordInvoker() {
        C593661 r0 = new AbstractC59369a() {
            /* class com.ss.android.medialib.RecordInvoker.C593661 */

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public int mo202156a() {
                return RecordInvoker.this.mAVCEncoder.mo201730c();
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: c */
            public void mo202165c() {
                if (RecordInvoker.this.mHandler != 0) {
                    RecordInvoker recordInvoker = RecordInvoker.this;
                    recordInvoker.nativeOnSwapGlBuffers(recordInvoker.mHandler);
                }
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: b */
            public void mo202164b() {
                C63929ab.m250974a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.mo201735g();
                    RecordInvoker.this.mAVCEncoder = null;
                    C63929ab.m250974a("RecordInvoker", "====== uninitAVCEncoder ======");
                }
                C63929ab.m250974a("RecordInvoker", "FaceBeautyManager onUninitHardEncoder == exit");
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public void mo202159a(int i) {
                if (RecordInvoker.this.mHandler != 0) {
                    RecordInvoker recordInvoker = RecordInvoker.this;
                    recordInvoker.nativeSetColorFormat(recordInvoker.mHandler, i);
                }
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public void mo202160a(ByteBuffer byteBuffer) {
                C63929ab.m250976b("RecordInvoker", "onSetCodecConfig: data size = " + byteBuffer.remaining());
                if (RecordInvoker.this.mHandler != 0) {
                    RecordInvoker recordInvoker = RecordInvoker.this;
                    recordInvoker.nativeSetCodecConfig(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining());
                }
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public void mo202163a(byte[] bArr, int i, boolean z) {
                C63929ab.m250976b("RecordInvoker", "FaceBeautyManager onEncoderData == enter");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    RecordInvoker.this.mAVCEncoder.mo201726a(bArr, i, z);
                }
                C63929ab.m250976b("RecordInvoker", "FaceBeautyManager onEncoderData == exit");
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public int mo202157a(int i, int i2, int i3, boolean z) {
                C63929ab.m250976b("RecordInvoker", "onEncoderData: ...");
                if (RecordInvoker.this.mAVCEncoder != null) {
                    return RecordInvoker.this.mAVCEncoder.mo201725a(i, i2, i3, z);
                }
                return 0;
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public void mo202161a(ByteBuffer byteBuffer, int i, int i2, int i3) {
                if (RecordInvoker.this.mHandler != 0) {
                    RecordInvoker recordInvoker = RecordInvoker.this;
                    recordInvoker.nativeWriteFile(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), i, i3);
                }
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public void mo202162a(ByteBuffer byteBuffer, long j, long j2, int i, boolean z) {
                if (RecordInvoker.this.mHandler != 0) {
                    RecordInvoker recordInvoker = RecordInvoker.this;
                    recordInvoker.nativeWriteFile2(recordInvoker.mHandler, byteBuffer, byteBuffer.remaining(), j, j2, i, z);
                }
            }

            @Override // com.ss.android.medialib.AbstractC59369a
            /* renamed from: a */
            public Surface mo202158a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
                C63929ab.m250974a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == enter");
                C63929ab.m250974a("RecordInvoker", "width = " + i + "\theight = " + i2 + "\tcodecType = " + i7);
                if (RecordInvoker.this.mAVCEncoder == null) {
                    RecordInvoker.this.mAVCEncoder = new AVCEncoder();
                }
                RecordInvoker.this.mAVCEncoder.mo201731c(i7);
                RecordInvoker.this.mAVCEncoder.mo201728a(this);
                Surface a = RecordInvoker.this.mAVCEncoder.mo201727a(i, i2, i3, i4, i5, i6, z);
                RecordInvoker recordInvoker = RecordInvoker.this;
                recordInvoker.setInitHardEncodeRet(recordInvoker.mAVCEncoder.mo201737i());
                if (a == null) {
                    if (i7 == AVCEncoder.kCodecType.ByteVC1.ordinal()) {
                        RecordInvoker.this.mAVCEncoder.mo201735g();
                        RecordInvoker.this.mAVCEncoder.mo201731c(AVCEncoder.kCodecType.H264.ordinal());
                        a = RecordInvoker.this.mAVCEncoder.mo201727a(i, i2, i3, i4, i5, i6, z);
                    }
                    if (a == null) {
                        RecordInvoker.this.mAVCEncoder.mo201735g();
                        RecordInvoker.this.mAVCEncoder = null;
                        RecordInvoker.this.setHardEncoderStatus(false);
                        return null;
                    }
                    RecordInvoker.this.setCodecType(AVCEncoder.kCodecType.H264.ordinal());
                    RecordInvoker.this.setHardEncoderStatus(true);
                } else {
                    C63929ab.m250980d("RecordInvoker", "====== initAVCEncoder succeed ======");
                    RecordInvoker.this.setHardEncoderStatus(true);
                }
                C63929ab.m250974a("RecordInvoker", "FaceBeautyManager onInitHardEncoder == exit");
                return a;
            }
        };
        this.mAVCEncoderInterface = r0;
        this.mEncoderCaller = r0;
    }

    public float[] getAECSuggestVolume() {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        }
        float[] nativeGetAECSuggestVolume = nativeGetAECSuggestVolume(j);
        if (nativeGetAECSuggestVolume == null) {
            return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        }
        return nativeGetAECSuggestVolume;
    }

    public int uninitBeautyPlay() {
        int nativeUninitBeautyPlay;
        if (this.mHandler == 0) {
            return -100000;
        }
        synchronized (this) {
            long j = this.mHandler;
            this.mHandler = 0;
            this.mTextureTimeListener = null;
            this.mShotScreenCallback = null;
            mRecordStopCallback = null;
            this.mNativeInitListener = null;
            this.mFaceDetectListener = null;
            this.mMessageListener = null;
            sMessageListener = null;
            nativeUninitBeautyPlay = nativeUninitBeautyPlay(j);
        }
        return nativeUninitBeautyPlay;
    }

    private int getOptFirstFrameBypassEffectFrameCnt() {
        int intValue;
        VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_opt_first_frame_bypass_effect_frame_cnt");
        int i = 3;
        if (a != null && a.mo220637a() != null && (a.mo220637a() instanceof Integer) && (intValue = ((Integer) a.mo220637a()).intValue()) > 0 && intValue < 100) {
            i = intValue;
        }
        C59381c.m230519a("RecordInvoker", "mOptFirstFrameBypassEffectFrameCnt: " + i);
        return i;
    }

    public static void setDuetVideoCompleteCallback(Runnable runnable) {
        sDuetCompleteRunable = runnable;
    }

    public static void setFaceDetectListener(AbstractC59397a aVar) {
        sFaceDetectListener = aVar;
    }

    public static void setNativeInitListener(AbstractC59398b bVar) {
        sNativeInitListener = bVar;
    }

    public static void setRecordStopCallback(AbstractC59367a aVar) {
        mRecordStopCallback = aVar;
    }

    public void enableFaceExtInfo(int i) {
        nativeEnableFaceExtInfo(i);
    }

    public void setDuetVideoCompleteCallback2(Runnable runnable) {
        this.mDuetCompleteRunable = runnable;
    }

    public void setFaceDetectListener2(AbstractC59397a aVar) {
        this.mFaceDetectListener = aVar;
    }

    public void setMessageListenerV2(MessageCenter.AbstractC2081a aVar) {
        this.mMessageListener = aVar;
    }

    public void setNativeInitListener2(AbstractC59398b bVar) {
        this.mNativeInitListener = bVar;
    }

    public void setOnDuetProcessListener(C59424g.AbstractC59425a aVar) {
        this.onDuetProcessListener = aVar;
    }

    public void setOnOpenGLCallback(C59376a.AbstractC59378b bVar) {
        this.mOpenGLCallback = bVar;
    }

    public void setTextureTimeListener(AbstractC59400d dVar) {
        this.mTextureTimeListener = dVar;
    }

    public void setVEOnVideoEOFListener(C59424g.AbstractC59426b bVar) {
        this.onVideoEOFListener = bVar;
    }

    public void enableFaceBeautifyDetect(int i) {
        nativeEnableFaceBeautifyDetect(this.mHandler, i);
    }

    public void enablePreloadEffectRes(boolean z) {
        nativeEnablePreloadEffectResource(this.mHandler, z);
    }

    public void enableSceneRecognition(boolean z) {
        nativeEnableSceneRecognition(this.mHandler, z);
    }

    public void enableSkeletonDetect(boolean z) {
        nativeEnableSkeletonDetect(this.mHandler, z);
    }

    public void enableSmartBeauty(boolean z) {
        nativeEnableSmartBeauty(this.mHandler, z);
    }

    public void enableStickerRecognition(boolean z) {
        nativeEnableStickerRecognition(this.mHandler, z);
    }

    public void setCaptureMirror(int i) {
        setCaptureMirror2(this.mHandler, i);
    }

    public void setEffectAlgorithmRequirement(long j) {
        nativeSetEffectAlgorithmRequirement(this.mHandler, j);
    }

    public int setEnableEffCtrl(boolean z) {
        return nativeSetEnableEffCtrl(this.mHandler, z);
    }

    public void setImageExposure(float f) {
        setImageExposure(this.mHandler, f);
    }

    /* renamed from: com.ss.android.medialib.RecordInvoker$b */
    public static class C59368b implements AbstractC59429a {

        /* renamed from: a */
        private long f147390a = -1;

        /* renamed from: b */
        private WeakReference<RecordInvoker> f147391b;

        /* renamed from: a */
        public void mo202190a(RecordInvoker recordInvoker) {
            this.f147390a = recordInvoker.getHandler();
            this.f147391b = new WeakReference<>(recordInvoker);
        }
    }

    public static synchronized void addSlamDetectListener(AbstractC59399c cVar) {
        synchronized (RecordInvoker.class) {
            if (cVar != null) {
                sSlamDetectListeners.add(cVar);
            }
        }
    }

    public static synchronized void removeSlamDetectListener(AbstractC59399c cVar) {
        synchronized (RecordInvoker.class) {
            sSlamDetectListeners.remove(cVar);
        }
    }

    public static synchronized void setMessageListener(MessageCenter.AbstractC2081a aVar) {
        synchronized (RecordInvoker.class) {
            sMessageListener = aVar;
        }
    }

    public static synchronized void setSlamDetectListener(AbstractC59399c cVar) {
        synchronized (RecordInvoker.class) {
            addSlamDetectListener(cVar);
        }
    }

    public synchronized void addLandMarkDetectListener(AbstractC64086z zVar) {
        this.mLandmarkDetectListeners.add(zVar);
    }

    public synchronized void addSlamDetectListener2(AbstractC59399c cVar) {
        if (cVar != null) {
            this.mSlamDetectListeners.add(cVar);
        }
    }

    public ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public void chooseAreaFromRatio34(float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeChooseAreaFromRatio34(j, f);
        }
    }

    public void enable3buffer(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnable3buffer(j, z);
        }
    }

    public void enableClearColorAfterRender(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableClearColorAfterRender(j, z);
        }
    }

    public void enableEffectRT(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableEffectRT(j, z);
        }
    }

    public void enableMakeUpBackground(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableMakeUpBackground(j, z);
        }
    }

    public void enableRecordingMp4(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableRecordingMp4(j, z);
        }
    }

    public void enableShotScreenUseOesTexture(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableShotScreenUseOesTexture(j, z);
        }
    }

    public void forceFirstFrameHasEffect(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeForceFirstFrameHasEffect(j, z);
        }
    }

    public ImageFrame getFrameByKey(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetFrameByKey(j, str);
    }

    public long getTextureDeltaTime(boolean z) {
        AbstractC59400d dVar = this.mTextureTimeListener;
        if (dVar != null) {
            return dVar.mo202258a(z);
        }
        return 0;
    }

    public synchronized void removeLandMarkDetectListener(AbstractC64086z zVar) {
        this.mLandmarkDetectListeners.remove(zVar);
    }

    public synchronized void removeSlamDetectListener2(AbstractC59399c cVar) {
        this.mSlamDetectListeners.remove(cVar);
    }

    public int[] scaleReactionWindow(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeScaleReactionWindow(j, f);
    }

    public void setCameraClose(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetCameraClose(j, z);
        }
    }

    public void setCaptureMirror(boolean z) {
        setCaptureMirror(this.mHandler, z);
    }

    public void setDetectionMode(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetDetectionMode(j, z);
        }
    }

    public void setDeviceRotation(float[] fArr) {
        if (isRenderReady()) {
            setDeviceRotation(fArr, -1.0d);
        }
    }

    public void setDuetCameraPaused(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetDuetCameraPaused(j, z);
        }
    }

    public void setEffectBuildChainType(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetEffectBuildChainType(j, i);
        }
    }

    public int setFilterPos(float f) {
        if (this.mHandler == 0) {
            return -100000;
        }
        return 0;
    }

    public void setNativeLibraryDir(String str) {
        if (!TextUtils.isEmpty(str)) {
            nativeSetNativeLibraryDir(str);
        }
    }

    public void setPaddingBottomInRatio34(float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPaddingBottomInRatio34(j, f);
        }
    }

    public void setPreviewDuetVideoPaused(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPreviewDuetVideoPaused(j, z);
        }
    }

    public void setPreviewRadioListener(OnPreviewRadioListener onPreviewRadioListener) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPreviewRadioListener(j, onPreviewRadioListener);
        }
    }

    public void setRecordContentType(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetRecordContentType(j, z);
        }
    }

    public void setRunningErrorCallback(OnRunningErrorCallback onRunningErrorCallback) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetRunningErrorCallback(j, onRunningErrorCallback);
        }
    }

    public void setScale(float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetScale(j, f);
        }
    }

    public void setSwapDuetRegion(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetSwapDuetRegion(j, z);
        }
    }

    public void setSwapReactionRegion(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetSwapReactionRegion(j, z);
        }
    }

    public void setSwitchEffectInGLTask(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSwitchEffectInGLTask(j, z);
        }
    }

    public void setVideoBgSpeed(double d) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetVideoBgSpeed(j, d);
        }
    }

    public void updateReactionBGAlpha(float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUpdateReactionBGAlpha(j, f);
        }
    }

    public void attachExtFrameData(Object obj) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        } else {
            nativeAttachExtFrameData(j, obj);
        }
    }

    public synchronized int changeMusicPath(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeChangeMusicPath(j, str);
    }

    public synchronized void changePreviewRadioMode(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeChangePreviewRadioMode(j, i);
        }
    }

    public synchronized int changeSurface(Surface surface) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeChangeSurface(j, surface);
    }

    public void chooseSlamFace(int i) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeChooseSlamFace(j, i);
        }
    }

    public int closeWavFile(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        int nativeCloseWavFile = nativeCloseWavFile(j, z);
        save();
        return nativeCloseWavFile;
    }

    public int configStyleResourceFinder(AssetManager assetManager) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return (int) nativeConfigStyleResourceFinder(j, assetManager);
    }

    public void disableRender(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeDisableRender(j, z);
        }
    }

    public void enableAbandonFirstFrame(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeEnableAbandonFirstFrame(j, z);
        }
    }

    public synchronized void enableAudio(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableAudio(j, i);
        }
    }

    public synchronized void enableAudioPlayerFromVE(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableAudioPlayerFromVE(j, i);
        }
    }

    public synchronized void enableAutoTestLog(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableAutoTestLog(j, z);
        }
    }

    public int enableDuetGlFinish(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeEnableDuetGlFinish(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void enableEffect(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableEffect(j, z);
        }
    }

    public void enableEffectBGM(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableEffectBGM(j, z);
        }
    }

    public int enableGetPropTrack(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return natvieEnableGetPropTrack(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void enableLandMark(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableLandMark(j, z);
        }
    }

    public void enablePBO(boolean z) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        }
        nativeEnablePBO(z);
    }

    public void enablePictureTestModel(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnablePictureTestMode(j, z);
        }
    }

    public void enableRecordBGMToMp4(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableRecordBGMToMp4(j, z);
        }
    }

    public synchronized void enableRecordFlip(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableRecordFlip(j, i);
        }
    }

    public int enableRecordMaxDuration(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeEnableRecordMaxDuration(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public synchronized void enableTimestampCallback(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableTimestampCallback(j, z);
        }
    }

    public void enableWaterMark(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableWaterMark(j, z);
        }
    }

    public boolean fetchDistortionInfo(DistortionInfoCallback distortionInfoCallback) {
        long j = this.mHandler;
        if (j != 0 && nativeFetchDistortionInfo(j, distortionInfoCallback) == 0) {
            return true;
        }
        return false;
    }

    public float getFilterIntensity(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000.0f;
        }
        return nativeGetFilterIntensity(j, str);
    }

    public String getResourceMultiViewTag(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetResourceMultiViewTag(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return null;
    }

    public int initBeautyPlayOnlyPreview(ScanSettings scanSettings) {
        long nativeCreate = nativeCreate();
        this.mHandler = nativeCreate;
        if (nativeCreate == 0) {
            return -100000;
        }
        return nativeInitBeautyPlayOnlyPreview(nativeCreate, scanSettings);
    }

    public void initFaceBeautyDetectExtParam(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeInitFaceBeautyDetectExtParam(j, z);
        }
    }

    public int initImageDrawer(int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeInitImageDrawer(j, i);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int initMediaCodecSurface(Surface surface) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeInitMediaCodecSurface(j, surface);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int onDrawFrameTime(double d) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeOnFrameTime(j, d);
    }

    public void pauseEffectAudio(boolean z) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else if (isRenderReady()) {
            nativePauseEffectAudio(this.mHandler, z);
        }
    }

    public void registerCherEffectParamCallback(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterCherEffectParamCallback(j, onCherEffectParmaCallback);
        }
    }

    public void registerEffectAlgorithmCallback(EffectAlgorithmCallback effectAlgorithmCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterEffectAlgorithmCallback(j, effectAlgorithmCallback);
        }
    }

    public void registerSceneDetectCallback(OnSceneDetectCallback onSceneDetectCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterSceneDetectCallback(j, onSceneDetectCallback);
        }
    }

    public void registerSkeletonDetectCallback(OnSkeletonDetectCallback onSkeletonDetectCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterSkeletonDetectCallback(j, onSkeletonDetectCallback);
        }
    }

    public void registerSmartBeautyCallback(OnSmartBeautyCallback onSmartBeautyCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterSmartBeautyCallback(j, onSmartBeautyCallback);
        }
    }

    public float rotateReactionWindow(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000.0f;
        }
        return nativeRotateReactionWindow(j, f);
    }

    public int setAudioDataInterface(long j) {
        long j2 = this.mHandler;
        if (j2 != 0) {
            return nativeSetAudioDataInterface(j2, j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void setBgmMute(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        } else {
            nativeSetBgmMute(j, z);
        }
    }

    public void setClientState(int i) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        }
        nativeSetClientState(this.mHandler, i);
    }

    public int setCodecType(int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetCodecType(j, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setComposerResourcePath(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetComposerResourcePath(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void setDLEEnable(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeSetDLEEnable(j, z);
        }
    }

    public void setDebugSettings(VEDebugSettings vEDebugSettings) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "setDebugSettings failed, handler is null");
        }
        nativeSetDebugSettings(this.mHandler, vEDebugSettings);
    }

    public void setDetectInterval(int i) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetDetectInterval(j, i);
        }
    }

    public void setDropFrames(int i) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetDropFrames(j, i);
        }
    }

    public int setEffectMaxMemoryCache(int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetEffectMaxMemoryCache(j, i);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public void setEnableDuetV2(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetEnableDuetV2(j, z);
        }
    }

    public int setEnableEarBack(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetEnableEarBack(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setFaceMakeUp(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetFaceMakeUp2(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setFilter(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetFilter(j, str, str, 1.0f);
    }

    public int setFilterIntensity(float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetFilterIntensity(j, f);
    }

    public void setForceAlgorithmCnt(int i) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetForceAlgorithmCnt(j, i);
        }
    }

    public int setHandDetectLowpower(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetHandDetectLowpower(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setHardEncoderStatus(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetHardEncoderStatus(j, z);
    }

    public int setInitHardEncodeRet(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetInitHardEncodeRet(j, i);
    }

    public void setLandMarkInfo(LandMarkFrame landMarkFrame) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeSetLandMarkInfo(this.mHandler, landMarkFrame);
        }
    }

    public int setMaleMakeupState(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetMaleMakeupState(j, z);
    }

    public void setMemoryOpt(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeSetMemoryOpt(j, z);
        }
    }

    public synchronized void setModeChangeState(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetModeChangeState(j, i);
        }
    }

    public int setMusicNodes(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetMusicNodes(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setPlayLength(long j) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            return -100000;
        }
        return nativeSetPlayLength(j2, j);
    }

    public int setRecordMaxDuration(long j) {
        long j2 = this.mHandler;
        if (j2 != 0) {
            return nativeSetRecordMaxDuration(j2, j);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setRecordPrepareTime(long j) {
        long j2 = this.mHandler;
        if (j2 != 0) {
            return nativeSetRecordPrepareTime(j2, j);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -108;
    }

    public int setReshapeResource(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetReshapeResource(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public boolean setSharedTextureStatus(boolean z) {
        if (this.mHandler != 0) {
            return nativeSetSharedTextureStatus(z);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return false;
    }

    public int setSkinTone(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetSkinTone(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setSlamFace(Bitmap bitmap) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetSlamFace(j, bitmap);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetStickerRequestCallback(j, iStickerRequestCallback);
    }

    public synchronized void setUseMusic(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetUseMusic(j, i);
        }
    }

    public int setVEEffectParams(VEEffectParams vEEffectParams) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetVEEffectParams(j, vEEffectParams);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public void setVideoEncodeRotation(int i) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return;
        }
        AVCEncoder.m230450b(i);
        nativeSetVideoEncodeRotation(this.mHandler, i);
    }

    public int slamGetTextBitmap(OnARTextBitmapCallback onARTextBitmapCallback) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSlamGetTextBitmap(j, onARTextBitmapCallback);
        }
        C59381c.m230520b("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int slamGetTextLimitCount(OnARTextCountCallback onARTextCountCallback) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSlamGetTextLimitCount(j, onARTextCountCallback);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int slamGetTextParagraphContent(OnARTextContentCallback onARTextContentCallback) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSlamGetTextParagraphContent(j, onARTextContentCallback);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int slamNotifyHideKeyBoard(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeHideSlamKeyBoard(j, z);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int slamSetLanguge(String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSlamSetLanguge(j, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int stopRecord(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeStopRecord(j, z);
    }

    public boolean swapMainAndPipRenderTarget(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("ae_style", "ae_style, swap failed, no proxy");
            return false;
        } else if (nativeSwapMainAndPipRenderTarget(j, z) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void useLargeMattingModel(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeUseLargeMattingModel(j, z);
        }
    }

    public boolean isGestureRegistered(VEGestureEvent vEGestureEvent) {
        int i;
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return false;
        }
        if (vEGestureEvent.ordinal() == VEGestureEvent.ANY_SUPPORTED.ordinal()) {
            i = -1;
        } else {
            i = vEGestureEvent.ordinal();
        }
        return nativeIsGestureRegistered(this.mHandler, i);
    }

    public void onNativeCallback_onLandMarkDetect(boolean z) {
        ArrayList<AbstractC64086z> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            for (AbstractC64086z zVar : this.mLandmarkDetectListeners) {
                arrayList.add(zVar);
            }
        }
        for (AbstractC64086z zVar2 : arrayList) {
            if (zVar2 != null) {
                zVar2.mo221857a(z);
            }
        }
    }

    public void setCameraFirstFrameOptimize(boolean z) {
        int i;
        if (this.mHandler == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
            return;
        }
        C59381c.m230519a("RecordInvoker", "setCameraFirstFrameOptimize: " + z);
        if (z) {
            i = getOptFirstFrameBypassEffectFrameCnt();
        } else {
            i = 3;
        }
        nativeSetCameraFirstFrameOptimize(this.mHandler, z, i);
    }

    private void onNativeCallback_Init(int i) {
        if (i < 0) {
            C63929ab.m250980d("RecordInvoker", "onNativeCallback_Init error = " + i);
        } else {
            this.mIsRenderReady = true;
            C63929ab.m250974a("RecordInvoker", "onNativeCallback_Init success = " + i);
        }
        AbstractC59398b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.mo202255a(i);
        }
        AbstractC59398b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.mo202255a(i);
        }
        this.mIsRenderReady = true;
    }

    public void onNativeCallback_onSlamDetect(boolean z) {
        ArrayList<AbstractC59399c> arrayList = new ArrayList();
        synchronized (RecordInvoker.class) {
            for (AbstractC59399c cVar : sSlamDetectListeners) {
                arrayList.add(cVar);
            }
            for (AbstractC59399c cVar2 : this.mSlamDetectListeners) {
                arrayList.add(cVar2);
            }
        }
        for (AbstractC59399c cVar3 : arrayList) {
            if (cVar3 != null) {
                cVar3.mo202257a(z);
            }
        }
    }

    public void onNativeDuetProcess(long j, boolean z) {
        C59424g.AbstractC59425a aVar = this.onDuetProcessListener;
        if (aVar != null) {
            aVar.mo202661a(j, z);
        }
    }

    public void setCustomVideoBg(String str, String str2) {
        nativeSetCustomVideoBgGif(this.mHandler, str, str2);
    }

    public void changeDuetVideo(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeChangeDuetVideo(j, str, str2);
        }
    }

    public void changeOutputVideoSize(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeChangeOutputVideoSize(j, i, i2);
        }
    }

    public boolean posInReactionRegion(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativePosInReactionRegion(j, i, i2);
    }

    public int postDuetAction(int i, long j) {
        return nativePostDuetAction(this.mHandler, i, j);
    }

    public void setCamPreviewSize(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            try {
                nativeSetCamPreviewSize(j, i, i2);
            } catch (Throwable unused) {
            }
        }
    }

    public void setCaptureRenderWidth(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetCaptureRenderWidth(j, i, i2);
        }
    }

    public void setReactionBorderParam(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetReactionBorderParam(j, i, i2);
        }
    }

    public boolean setReactionMaskImage(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativeSetReactionMaskImage(j, str, z);
    }

    public boolean addMetadata(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "recorder add metadata failed, no env...");
            return false;
        } else if (nativeAddMetadata(j, str, str2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int addPCMData(byte[] bArr, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeAddPCMData(j, bArr, i);
    }

    public int appendComposerNodes(String[] strArr, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeAppendComposerNodes(j, strArr, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void enableAudioLoudnessBalanceFilter(boolean z, double d) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        } else {
            nativeEnableAudioLoudnessBalanceFilter(j, z, d);
        }
    }

    public void enableLensProcess(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        } else {
            nativeEnableLensProcess(j, i, z);
        }
    }

    public void enableScan(boolean z, long j) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeEnableScan(j2, z, j);
        }
    }

    public float getComposerNodeValue(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeGetComposerNodeValue(j, str, str2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000.0f;
    }

    public void handleEffectAudio(boolean z, long j) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else if (isRenderReady()) {
            nativeHandleEffectAudio(this.mHandler, z, j);
        }
    }

    public void initHDRNetDetectExtParam(boolean z, String str) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeInitHDRNetDetectExtParam(j, z, str);
        }
    }

    public void onAudioCallback(byte[] bArr, int i) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeOnAudioCallback(this.mHandler, bArr, i);
        }
    }

    public void registerFaceResultCallback(boolean z, FaceResultCallback faceResultCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterFaceResultCallback(j, z, faceResultCallback);
        }
    }

    public void registerHandDetectCallback(int[] iArr, OnHandDetectCallback onHandDetectCallback) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRegisterHandDetectCallback(j, iArr, onHandDetectCallback);
        }
    }

    public int reloadComposerNodes(String[] strArr, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeReloadComposerNodes(j, strArr, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int removeComposerNodes(String[] strArr, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeRemoveComposerNodes(j, strArr, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int removeTrack(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeRemoveTrack(j, i, i2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -108;
    }

    public void setAlgorithmChangeMsg(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetAlgorithmChangeMsg(j, i, z);
        }
    }

    public int setAlgorithmPreConfig(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetAlgorithmPreConfig(j, i, i2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setBGMVolume(float f, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetBGMVolume(j, f, i);
    }

    public int setBeautyFace(int i, String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetBeautyFace(j, i, str);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setBeautyFaceIntensity(float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetBeautyFaceIntensity(j, f, f2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setComposerMode(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetComposerMode(j, i, i2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setComposerNodes(String[] strArr, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetComposerNodes(j, strArr, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void setDeviceRotation(float[] fArr, double d) {
        if (this.mHandler != 0 && isRenderReady()) {
            nativeSetDeviceRotationWithStamp(this.mHandler, fArr, d);
        }
    }

    public int setEnableAEC(boolean z, String str) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetEnableAEC(j, z, str);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setFilterNew(String str, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetFilterNew(j, str, f);
    }

    public int setIntensityByType(int i, float f) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetIntensityByType(j, i, f);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public void setKaraoke(boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetKaraoke(j, z, z2);
        }
    }

    public int setLoudness(boolean z, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetLoudness(j, z, i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public synchronized int setMusicTime(long j, long j2) {
        long j3 = this.mHandler;
        if (j3 == 0) {
            return -100000;
        }
        return nativeSetMusicTime(j3, j, j2);
    }

    public void setRenderCacheString(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetRenderCacheString(j, str, str2);
        }
    }

    public void setRenderCacheTexture(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetRenderCacheTexture(j, str, str2);
        }
    }

    public int setVideoQuality(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetVideoQuality(j, i, i2);
    }

    public int startPrePlay(boolean z, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeStartPrePlay(j, z, i);
    }

    public int tryRestore(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeTryRestore(j, i, str);
    }

    public void updateAlgorithmRuntimeParam(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeUpdateAlgorithmRuntimeParam(j, i, f);
        }
    }

    public synchronized int animateImageToPreview(String str, String str2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
        return nativeAnimateImageToPreview(this.mHandler, str, str2, C59380b.m230517a(str2));
    }

    public int[] checkComposerNodeExclusion(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeCheckComposerNodeExclusion(j, str, null, str2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return new int[]{-1, 0};
    }

    public void onNativeCallback_InitHardEncoderRet(int i, int i2) {
        C63929ab.m250974a("RecordInvoker", "onInitHardEncoderRet");
        C63929ab.m250974a("RecordInvoker", "isCPUEncode = " + i);
        AbstractC59398b bVar = this.mNativeInitListener;
        if (bVar != null) {
            bVar.mo202256a(i, i2);
        }
        AbstractC59398b bVar2 = sNativeInitListener;
        if (bVar2 != null) {
            bVar2.mo202256a(i, i2);
        }
    }

    public void onNativeCallback_onFaceDetect(int i, int i2) {
        C63929ab.m250976b("RecordInvoker", "BeautyInvoker onFaceDetect " + i2);
        AbstractC59397a aVar = sFaceDetectListener;
        if (aVar != null) {
            aVar.mo202254a(i, i2);
        }
        AbstractC59397a aVar2 = this.mFaceDetectListener;
        if (aVar2 != null) {
            aVar2.mo202254a(i, i2);
        }
    }

    public synchronized void onNativeCallback_onShotScreen(int i, long j) {
        C63929ab.m250974a("RecordInvoker", "onNativeCallback_onShotScreen: ret = " + i + ", timeStamp = " + j);
        this.mIsDuringScreenshot = false;
        C59376a.AbstractC59379c cVar = this.mShotScreenCallback;
        if (cVar != null) {
            cVar.mo202214a(i);
        }
        C59376a.AbstractC59377a aVar = this.mGetTimestampCallback;
        if (aVar != null) {
            aVar.mo202210a((double) j);
        }
    }

    public int processTouchEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeProcessTouchEvent(this.mHandler, f, f2);
        }
    }

    public void setLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams, OnLensResultCallback onLensResultCallback) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return;
        }
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i == 21) {
            nativeSetTaintSceneDetectParams(this.mHandler, (VETaintSceneDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
        } else if (i == 24) {
            nativeSetAdaptiveSharpenParams(this.mHandler, (VEAdaptiveSharpenParams) vEBaseRecorderLensParams, onLensResultCallback);
        } else if (i == 27) {
            nativeSetLumaDetectParams(this.mHandler, (VELumaDetectParams) vEBaseRecorderLensParams, onLensResultCallback);
        }
    }

    public int setSafeArea(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "set safearea invalid handle");
            return -100000;
        } else if (vESafeAreaParamsArr == null) {
            return nativeSetSafeArea(j, i, null, 0);
        } else {
            return nativeSetSafeArea(j, i, vESafeAreaParamsArr, vESafeAreaParamsArr.length);
        }
    }

    public int slamProcessDoubleClickEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessDoubleClickEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessIngestOri(double[] dArr, double d) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestOri(this.mHandler, dArr, d);
        }
    }

    public int slamProcessRotationEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessRotationEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessScaleEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessScaleEvent(this.mHandler, f, f2);
        }
    }

    public int slamProcessTouchEvent(float f, float f2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessTouchEvent(this.mHandler, f, f2);
        }
    }

    public boolean suspendGestureRecognizer(VEGestureEvent vEGestureEvent, boolean z) {
        int i;
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return false;
        }
        if (vEGestureEvent.ordinal() == VEGestureEvent.ANY_SUPPORTED.ordinal()) {
            i = -1;
        } else {
            i = vEGestureEvent.ordinal();
        }
        return nativeSuspendGestureRecognizer(this.mHandler, i, z);
    }

    public boolean processTouchEvent(VETouchPointer vETouchPointer, int i) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeProcessTouchEvent2(j, vETouchPointer.mo220978a(), vETouchPointer.mo220980c(), vETouchPointer.mo220981d(), vETouchPointer.mo220982e(), vETouchPointer.mo220983f(), vETouchPointer.mo220979b().ordinal(), i);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return false;
    }

    public int onDrawFrame(ImageFrame imageFrame, boolean z) {
        if (this.mHandler == 0) {
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), z);
            return -1;
        } else if (Build.VERSION.SDK_INT < 19 || imageFrame.getFormat() != -2) {
            return -1;
        } else {
            int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (new C59395e(imageFrame).mo202250a(iArr, byteBufferArr)) {
                return nativeOnDrawFrameBuffer2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), z);
            }
            return -1;
        }
    }

    public static void onNativeCallback_onMonitorLogFloat(String str, String str2, float f) {
        C60229h.m234101a(str, str2, f);
    }

    public static void onNativeCallback_onMonitorLogInt(String str, String str2, int i) {
        C60229h.m234102a(str, str2, (long) i);
    }

    public void onNativeCallback_encodeData(byte[] bArr, int i, boolean z) {
        AbstractC59369a aVar = this.mEncoderCaller;
        if (aVar != null) {
            aVar.mo202163a(bArr, i, z);
        }
    }

    public int initAudioPlayer(Context context, String str, long j) {
        return initAudioPlayer(context, str, j, false, false);
    }

    public void initReaction(Context context, String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeInitReaction(j, str);
        }
    }

    public int onNativeCallback_encodeTexture(int i, int i2, boolean z) {
        AbstractC59369a aVar = this.mEncoderCaller;
        if (aVar != null) {
            return aVar.mo202157a(i, i2, 0, z);
        }
        return 0;
    }

    public void setCaptureResize(boolean z, int[] iArr, int[] iArr2) {
        setCaptureResize(this.mHandler, z, iArr, iArr2);
    }

    public int bindEffectAudioProcessor(int i, int i2, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeBindEffectAudioProcessor(j, i, i2, z);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public void enableAudioAlgorithmParam(boolean z, String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        } else {
            nativeEnableAudioAlgorithmParam(j, z, str, str2);
        }
    }

    public void initFaceBeautifyDetectExtParam(boolean z, boolean z2, boolean z3) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeInitFaceBeautifyDetectExtParam(j, z, z2, z3);
        }
    }

    public void initFaceDetectExtParam(int i, boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeInitFaceDetectExtParam(j, i, z, z2);
        }
    }

    public void initHandDetectExtParam(int i, int i2, int i3) {
        long j = this.mHandler;
        if (j == 0) {
            C59381c.m230520b("RecordInvoker", "invalid handle");
        } else {
            nativeInitHandDetectExtParam(j, i, i2, i3);
        }
    }

    public int initWavFile(int i, int i2, double d) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeInitWavFile(j, i, i2, d);
    }

    public int onDrawFrame(int i, float[] fArr, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeOnFrameAvailable(j, i, fArr, z);
    }

    public void recoverCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeRecoverCherEffect(j, strArr, dArr, zArr);
        }
    }

    public int seekTrack(int i, int i2, long j) {
        long j2 = this.mHandler;
        if (j2 != 0) {
            return nativeSeekTrack(j2, i, i2, j);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -108;
    }

    public int setExternalFaceMakeupOpacity(String str, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            return natvieSetExternalFaceMakeupOpacity(j, str, f, f2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int setFrameCallback(OnFrameCallback onFrameCallback, boolean z, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        try {
            return nativeSetFrameCallback(j, onFrameCallback, z, i);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void setPreviewSizeRatio(float f, int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPreviewSizeRatio(j, f, i, i2);
        }
    }

    public int setReshape(String str, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetReshape(j, str, f, f2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setSticker(Bitmap bitmap, int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetSticker(j, bitmap, i, i2);
    }

    public int updateComposerNode(String str, String str2, float f) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeUpdateComposerNode(j, str, str2, f);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void updateRotation(float f, float f2, float f3) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUpdateRotation(j, f, f2, f3);
        }
    }

    public int setFaceMakeUp(String str, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetFaceMakeUp(j, str, f, f2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int setFilter(String str, String str2, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetFilter(j, str, str2, f);
    }

    public void updateRotation(int i, boolean z, boolean z2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUpdateRotationAndFront(j, i, z, z2);
        }
    }

    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeCheckComposerNodeExclusion(j, str, str2, str3);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return new int[]{-1, 0};
    }

    public void onFirstFrameRenderInfo(int i, int i2, double d) {
        String str;
        if (i == 0) {
            C60229h.m234089a(0, "te_preview_first_frame_screen_time", d - ((double) C59401a.f147462a));
            C63929ab.m250974a("RecordInvoker", "Camera Preview First Frame Cost: " + (d - ((double) C59401a.f147462a)));
        } else if (i == 1) {
            C60229h.m234089a(0, "te_preview_switch_camera_screen_time", d - ((double) C59401a.f147463b));
            double d2 = d - ((double) C59401a.f147463b);
            if (i2 == 1) {
                str = "te_preview_first_frame_on_screen_b2f";
            } else {
                str = "te_preview_first_frame_on_screen_f2b";
            }
            C63929ab.m250973a(str, Double.valueOf(d2));
        }
    }

    public int onDrawFrame(ImageFrame imageFrame, int i, boolean z) {
        if (this.mHandler == 0) {
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            nativeOnDrawFrameBuffer3(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, imageFrame.getWidth(), imageFrame.getHeight(), i, z);
            return -1;
        } else if (Build.VERSION.SDK_INT < 19 || imageFrame.getFormat() != -2) {
            return -1;
        } else {
            int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (new C59395e(imageFrame).mo202250a(iArr, byteBufferArr)) {
                return nativeOnDrawFrameBuffer4(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, z);
            }
            return -1;
        }
    }

    public void sendEffectMsg(int i, long j, long j2, String str) {
        sendEffectMsg(i, j, j2, str, false);
    }

    public int addTrack(int i, String str, long j, long j2) {
        long j3 = this.mHandler;
        if (j3 != 0) {
            return nativeAddTrack(j3, i, str, j, j2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -108;
    }

    public int concat(String str, String str2, String str3, String str4) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeConcat(j, str, str2, 0, str3, str4, false, -1);
    }

    public boolean getSmallWindowSnapshot(int i, int i2, Bitmap bitmap, SmallWindowSnapshotListener smallWindowSnapshotListener) {
        long j = this.mHandler;
        if (j != 0 && nativeGetSmallWindowSnapshot(j, i, i2, bitmap, smallWindowSnapshotListener) == 0) {
            return true;
        }
        return false;
    }

    public int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeReplaceComposerNodes(j, strArr, i, strArr2, i2);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public void setReactionPosMargin(int i, int i2, int i3, int i4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetReactionPosMargin(j, i, i2, i3, i4);
        }
    }

    public int slamSetInputText(String str, int i, int i2, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeSetSlamInputText(j, str, i, i2, str2);
        }
        C63929ab.m250980d("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int slamSetTextBitmapResult(Bitmap bitmap, int i, int i2, int i3) {
        if (this.mHandler != 0) {
            return 0;
        }
        C59381c.m230520b("RecordInvoker", "invalid handle");
        return -100000;
    }

    public int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeUpdateMultiComposerNodes(j, i, strArr, strArr2, fArr);
        }
        C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
        return -100000;
    }

    public int[] updateReactionCameraPos(int i, int i2, int i3, int i4) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeUpdateReactionCameraPos(j, i, i2, i3, i4);
    }

    public int writeFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeWriteFile(j, byteBuffer, i, i2, i3);
    }

    public synchronized int animateImagesToPreview(String[] strArr, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "Native instance handle == 0 invalid.");
            return -100000;
        }
        return nativeAnimateImagesToPreview(j, strArr, byteBufferArr, iArr, iArr2);
    }

    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamDeviceConfig(this.mHandler, z, z2, z3, z4);
        }
    }

    public int slamProcessIngestAcc(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestAcc(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessIngestGra(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestGra(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessIngestGyr(double d, double d2, double d3, double d4) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessIngestGyr(this.mHandler, d, d2, d3, d4);
        }
    }

    public int slamProcessTouchEventByType(int i, float f, float f2, int i2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessTouchEventByType(this.mHandler, i, f, f2, i2);
        }
    }

    public int startPlay(Surface surface, String str, int i, int i2) {
        if (this.mHandler == 0) {
            return -100000;
        }
        initMessageCenter();
        return nativeStartPlay(this.mHandler, surface, i, i2, str);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.AbstractC2081a
    public void onMessageReceived(int i, int i2, int i3, String str) {
        synchronized (RecordInvoker.class) {
            MessageCenter.AbstractC2081a aVar = this.mMessageListener;
            if (aVar != null) {
                aVar.onMessageReceived(i, i2, i3, str);
            }
            MessageCenter.AbstractC2081a aVar2 = sMessageListener;
            if (aVar2 != null) {
                aVar2.onMessageReceived(i, i2, i3, str);
            }
            C63929ab.m250976b("RecordInvoker", "msg:" + i + ",arg3:" + str);
            if (i == 72) {
                try {
                    sendEffectMsg(i, (long) i2, (long) i3, String.valueOf(new JSONObject(str).getDouble("recordRate")), true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (i == 58) {
                sendEffectMsg(i, (long) i2, (long) i3, str, true);
            }
        }
    }

    public void setBeautyFace(int i, String str, float f, float f2) {
        C63929ab.m250976b("RecordInvoker", "nativeSetBeautyFace: " + i);
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else if (i != 3 || C59385c.m230538a(str)) {
            nativeSetBeautyFace(this.mHandler, i, str);
            nativeSetBeautyFaceIntensity(this.mHandler, f, f2);
        } else {
            nativeSetBeautyFace(this.mHandler, 0, "");
            nativeSetBeautyFaceIntensity(this.mHandler, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public int renderPicture(ImageFrame imageFrame, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2) {
        if (this.mHandler == 0) {
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            return nativeRenderPicture(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, i, i2, onPictureCallbackV2);
        }
        if (Build.VERSION.SDK_INT >= 19 && imageFrame.getFormat() == -2) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            if (new C59395e(imageFrame).mo202250a(iArr, byteBufferArr)) {
                return nativeRenderPicture2(this.mHandler, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], imageFrame.getFormat(), imageFrame.getWidth(), imageFrame.getHeight(), i, i2, onPictureCallbackV2);
            }
            return -1;
        } else if (imageFrame.getBitmap() != null) {
            return nativeRenderPicture3(this.mHandler, imageFrame.getBitmap(), i, i2, onPictureCallbackV2);
        } else {
            return nativeRenderPicture(this.mHandler, null, 0, 0, 0, null);
        }
    }

    public int startPlay(Surface surface, String str, boolean z, int i, int i2) {
        int startPlay = startPlay(surface, str, i, i2);
        if (startPlay == 0 && z) {
            initHardEncoderInAdvance();
        }
        return startPlay;
    }

    public boolean addPipRenderTarget(Surface surface, int i, int i2, Bitmap bitmap, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("ae_style", "ae_style, addPipRenderTarget failed, no proxy");
            return false;
        } else if (nativeAddPipRenderTargetSurface(j, surface, i, i2, bitmap, z) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int initAudioConfig(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeInitAudioConfig(j, i, i2, i3, i4, i5);
    }

    public void sendEffectMsg(int i, long j, long j2, String str, boolean z) {
        long j3 = this.mHandler;
        if (j3 == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSendEffectMsg(j3, i, j, j2, str, z);
        }
    }

    public int startPlay(int i, int i2, String str, int i3, int i4) {
        if (this.mHandler == 0) {
            return -100000;
        }
        initMessageCenter();
        return nativeStartPlay2(this.mHandler, i, i2, i3, i4, str);
    }

    public int[] updateReactionCameraPosWithRotation(int i, int i2, int i3, int i4, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeUpdateReactionCameraPosWithRotation(j, i, i2, i3, i4, f);
    }

    public int renderPictureToBitmap(ImageFrame imageFrame, int i, int i2, OnPictureCallbackV2 onPictureCallbackV2, Bitmap bitmap) {
        if (this.mHandler == 0) {
            return -100000;
        }
        if (imageFrame.getBuf() != null) {
            return nativeRenderPictureToBitmap(this.mHandler, imageFrame.getBuf(), imageFrame.getBuf().length, i, i2, onPictureCallbackV2, bitmap);
        }
        return -1;
    }

    public int setFilterNew(String str, String str2, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeSetDoubleFilterNew(j, str, str2, f, f2, f3);
    }

    public int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSlamProcessPanEvent(this.mHandler, f, f2, f3, f4, f5);
        }
    }

    public int initAudioPlayer(Context context, String str, long j, boolean z, boolean z2) {
        Pair<Integer, Integer> pair;
        int i;
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = false;
        if (packageManager != null) {
            z3 = packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        C63929ab.m250976b("RecordInvoker", "has low latency ? " + z3);
        if (z2) {
            pair = new Pair<>(0, 0);
        } else {
            pair = C59386a.m230540a(context);
        }
        C63929ab.m250976b("RecordInvoker", "nativeSampleRate ? " + pair.first + " nativeSamleBufferSize? " + pair.second);
        boolean equals = "SM-A710F".equals(Build.MODEL);
        synchronized (this) {
            long j2 = this.mHandler;
            if (j2 == 0) {
                return -100000;
            }
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            return nativeInitAudioPlayer(j2, str, intValue, intValue2, j, z, equals, i);
        }
    }

    public int getSequencePreviewFrame(int i, int i2, boolean z, int i3, String str, C59376a.AbstractC59377a aVar) {
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        this.mGetTimestampCallback = aVar;
        nativeGetSequencePreviewFrame(j, i, i2, z, i3, str);
        return 0;
    }

    public int initBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5) {
        return initBeautyPlay(i, i2, str, i3, i4, str2, i5, false, false, false);
    }

    public void initDuet(String str, float f, float f2, float f3, boolean z, boolean z2, int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeInitDuet(j, str, f, f2, f3, z, z2, i);
        }
    }

    public int concat(String str, String str2, int i, String str3, String str4, boolean z, int i2) {
        synchronized (this) {
            long j = this.mHandler;
            if (j == 0) {
                return -100000;
            }
            return nativeConcat(j, str, str2, i, str3, str4, z, i2);
        }
    }

    public synchronized int shotScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C59376a.AbstractC59379c cVar, boolean z2) {
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j = this.mHandler;
            if (j == 0) {
                return -100000;
            }
            return nativeShotScreen(j, str, iArr, z, i, onPictureCallback, z2);
        }
        C63929ab.m250978c("RecordInvoker", "Last screenshot not complete");
        cVar.mo202214a(-1);
        return -1;
    }

    public void setCustomVideoBg(Context context, String str, String str2, String str3, long j, boolean z, boolean z2) {
        boolean z3;
        Pair<Integer, Integer> pair;
        int i;
        if (this.mHandler != 0) {
            if (TextUtils.isEmpty(str2)) {
                nativeSetCustomVideoBg(this.mHandler, null, null, null, 0, 0, 0, false, 0);
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || !packageManager.hasSystemFeature("android.hardware.audio.low_latency")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2) {
                pair = new Pair<>(0, 0);
            } else {
                pair = C59386a.m230540a(context);
            }
            long j2 = this.mHandler;
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            if (z3) {
                i = 45;
            } else {
                i = -1;
            }
            nativeSetCustomVideoBg(j2, str, str2, str3, intValue, intValue2, j, z, i);
        }
    }

    public Surface onNativeCallback_InitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        if (this.mEncoderCaller == null) {
            return null;
        }
        C63929ab.m250974a("RecordInvoker", "InitHardEncoder");
        return this.mEncoderCaller.mo202158a(i, i2, i3, i4, i5, i6, z, i7);
    }

    public void setWaterMark(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetWaterMark2(j, bitmap, i, i2, i3, i4, i5, i6, i7);
        }
    }

    public int startRecord(double d, boolean z, float f, int i, int i2, String str, String str2, boolean z2) {
        int i3 = (int) (((float) 4000000) * f);
        long j = this.mHandler;
        if (j == 0) {
            return -100000;
        }
        return nativeStartRecord(j, d, z, i3, i, i2, str, str2, z2);
    }

    public void setWaterMark(String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j = this.mHandler;
        if (j == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetWaterMark(j, strArr, i, i2, i3, i4, i5, i6, i7);
        }
    }

    public int setStickerPathWithTag(int i, String str, int i2, int i3, String str2, String[] strArr, float[] fArr, boolean z, boolean z2) {
        if (this.mHandler == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
            return -100000;
        } else if (!isRenderReady()) {
            return -100001;
        } else {
            return nativeSetStickerPathWithTag(this.mHandler, i, str, i2, i3, str2, strArr, fArr, z, z2);
        }
    }

    public int initBeautyPlay(int i, int i2, String str, int i3, int i4, String str2, int i5, boolean z, boolean z2, boolean z3) {
        this.mHandler = nativeCreate();
        AVCEncoder.m230449a(5000);
        synchronized (this) {
            long j = this.mHandler;
            if (j == 0) {
                return -100000;
            }
            int nativeInitBeautyPlay = nativeInitBeautyPlay(j, i, i2, str, i3, i4, str2, i5, false, z, z2, z3);
            if (nativeInitBeautyPlay == 0 && Build.MODEL.contains("OPPO R7")) {
                nativeExpandPreviewAndRecordInterval(this.mHandler, true);
            }
            if (z3) {
                if (this.mStyleProxyImpl == null) {
                    this.mStyleProxyImpl = new C59368b();
                }
                this.mStyleProxyImpl.mo202190a(this);
            }
            return nativeInitBeautyPlay;
        }
    }

    public synchronized int shotHDScreen(String str, int[] iArr, boolean z, int i, OnPictureCallback onPictureCallback, C59376a.AbstractC59379c cVar, boolean z2, OnPictureCallback onPictureCallback2, Bitmap bitmap, boolean z3) {
        if (!this.mIsDuringScreenshot) {
            this.mIsDuringScreenshot = true;
            this.mShotScreenCallback = cVar;
            long j = this.mHandler;
            if (j == 0) {
                C63929ab.m250980d("RecordInvoker", "shot hd screen failed, handle not ready...");
                onNativeCallback_onShotScreen(-1, -1);
                return -100000;
            }
            int nativeShotHDScreen = nativeShotHDScreen(j, str, iArr, z, i, onPictureCallback, z2, onPictureCallback2, bitmap, z3);
            if (nativeShotHDScreen != 0) {
                C63929ab.m250980d("RecordInvoker", "shot hd screen failed, rect = " + nativeShotHDScreen);
                onNativeCallback_onShotScreen(nativeShotHDScreen, 0);
            }
            return nativeShotHDScreen;
        }
        C63929ab.m250978c("RecordInvoker", "Last screenshot not complete");
        cVar.mo202214a(-1);
        return -1;
    }

    public void setEnigmaDetectParams(boolean z, float f, float f2, float f3, float f4, boolean z2, int i, long j, int i2, boolean z3, boolean z4, boolean z5) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            C63929ab.m250980d("RecordInvoker", "invalid handle");
        } else {
            nativeSetEnigmaDetectParams(j2, z, f, f2, f3, f4, z2, i, j, i2, z3, z4, z5);
        }
    }

    public int setDisplaySettings(int i, long j, float f, int i2, int i3, int i4, int i5, float f2, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            return -100000;
        }
        return nativeSetDisplaySettings(j2, i, j, f, i2, i3, i4, i5, f2, i6, i7, i8, i9, i10, i11, z);
    }
}
