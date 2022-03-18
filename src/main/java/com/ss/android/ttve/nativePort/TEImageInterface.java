package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.view.Surface;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vesdk.algorithm.SceneDetectInfo;
import com.ss.android.vesdk.algorithm.model.FaceAttributeInfo;
import com.ss.android.vesdk.algorithm.model.FaceDetectInfo;
import com.ss.android.vesdk.algorithm.model.SkeletonInfo;
import com.ss.android.vesdk.bean.VECommandBean;
import com.ss.android.vesdk.bean.VEUndoRedoBean;
import java.util.ArrayList;

public class TEImageInterface {
    private long mHandler;

    public interface FaceInfoCallback {
        void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo);
    }

    public interface SceneInfoCallback {
        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    public interface SkeletonInfoCallback {
        void onResult(SkeletonInfo skeletonInfo);
    }

    private native int nativeAddBrushSticker(long j, String str);

    private native int nativeAddInfoSticker(long j, String str, String[] strArr);

    private native void nativeAddNewLayer(long j, String str, int i, boolean z);

    private native void nativeAddNewLayerWithBuffer(long j, String str, int i, int i2, int i3, boolean z);

    private native void nativeAddPanoramicLayer(long j, String str, String str2);

    private native void nativeAddTransparentLayer(long j, int i, int i2);

    private native void nativeAddVectorGraphicsWithParams(long j, int i, String str, String str2);

    private native int nativeAddVectorSticker(long j, String str);

    private native int nativeAddWaterMask(long j, String str, float f, float f2, float f3, boolean z);

    private native void nativeApplyCurrentLayerInfoFromTemp(long j);

    private native void nativeBeginStickerBrush(long j, int i);

    private native String nativeCacheCurrentFrame(long j, String str, boolean z);

    private native void nativeCancelSelect(long j);

    private native void nativeClearBursh(long j, String str);

    private native void nativeClearEffect(long j);

    private native void nativeClearLiquefyBuffer(long j);

    private native void nativeClearStickerBrush(long j, int i);

    private native void nativeConfrimOriginalLayerParams(long j);

    private native void nativeContrastImage(long j, int i);

    private native long nativeCreateImageHandle(int i, int i2, boolean z);

    private native void nativeCustomContrastImage(long j, String str, boolean z);

    private native void nativeCutoutImage(long j, String str, float f, float f2, float f3, float f4);

    private native int[] nativeDecodeBufferToLocalPath(long j, String str, String str2);

    private native int nativeDeleteWaterMask(long j);

    private native void nativeDestorySurface(long j, Surface surface);

    private native void nativeDestoryVEImage(long j);

    private native void nativeEnableCanvas(long j, int i, int i2);

    private native void nativeEnableFaceBeautify(long j, boolean z, boolean z2, boolean z3, boolean z4);

    private native void nativeEnableLensHdr(long j, boolean z);

    private native void nativeEnableMirror(long j, int i);

    private native int nativeEnableMmap(long j, boolean z);

    private static native void nativeEnableOpenGL3(boolean z);

    private native void nativeEnableRenderAutomation(long j, boolean z);

    private native void nativeEnableUndoRedo(long j);

    private native void nativeEndStickerBrush(long j);

    private native void nativeExecuteConfirmParams(long j);

    private native void nativeExecuteConfirmRender(long j);

    private native void nativeExecuteRedoUndo(long j, boolean z, int i, boolean z2);

    private native ArrayList<VECommandBean> nativeGetCommandQueue(long j);

    private native float[] nativeGetInfoStickerBoundingBox(long j, int i, boolean z);

    private native float[] nativeGetInfoStickerPosition(long j, int i);

    private native String nativeGetInfoStickerTemplateParam(long j, int i);

    private native int[] nativeGetOutputSize(long j);

    private native int[] nativeGetPixelColor(long j, int i, int i2, int i3, int i4);

    private native String nativeGetStickerBrushState(long j, int i);

    private native void nativeGetUndoRedoList(long j, VEUndoRedoBean.JniHolder jniHolder, boolean z, int i);

    private native int nativeGetUndoRedoListSize(long j, boolean z);

    private native String nativeGetVectorCurrentGraphics(long j, int i);

    private native String nativeGetVectorGraphicsParamsWithId(long j, int i, String str);

    private native void nativeInitLensHdrEngine(long j, String str, int i, String str2);

    private native void nativeInitOffScreenSurface(long j, int i, int i2);

    private native void nativeInitPreviewSurface(long j, Surface surface);

    private native boolean nativeIsBrushOverlapped(long j, String str, float f, float f2, float f3, float f4);

    private native void nativeProcessGestureEvent(long j, String str, String str2, int i, float f, float f2, float f3, float f4, float f5, int i2);

    private native String nativeQueryLayerParams(long j, boolean z, boolean z2);

    private native String nativeQueryPaintParams(long j, String str);

    private native void nativeRegisterFaceInfoUpload(long j, boolean z, FaceInfoCallback faceInfoCallback);

    private native void nativeRegisterSceneDetectCallback(long j, SceneInfoCallback sceneInfoCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j, SkeletonInfoCallback skeletonInfoCallback);

    private native void nativeReleaseSkinTexture(long j);

    private native void nativeRemoveComposerFilter(long j, String str, String str2, String str3, String str4);

    private native int nativeRemoveInfoSticker(long j, int i);

    private native int nativeRemoveMagnifier(long j, boolean z);

    private native void nativeRemoveVectorGraphicsWithId(long j, int i, String str);

    private native void nativeRenderEffect(long j);

    private native void nativeRenderLayerQueue(long j, boolean z);

    private native void nativeReplaceLayer(long j, String str, int i, boolean z);

    private native void nativeReplaceLayerWithBuffer(long j, String str, int i, int i2, int i3, boolean z);

    private native void nativeReplacePanoramicLayer(long j, String str, String str2);

    private native int nativeRequestCacheSkinAlgorithm(long j, String str, int i, int i2);

    private native void nativeRequestRenderAlgorithm(long j, int i);

    private native String nativeRequestSkinAlgorithm(long j, String str);

    private native int nativeResetEffectEngine(long j);

    private native void nativeResumeRender(long j, ArrayList<VECommandBean> arrayList);

    private native void nativeRotate(long j, String str, float f, float f2, float f3);

    private native void nativeRotateCanvas(long j, String str, float f, float f2, float f3);

    private native int nativeSaveCurrentImage(long j, Bitmap bitmap);

    private native int nativeSaveCurrentImageWithPath(long j, String str, boolean z, boolean z2);

    private native void nativeSaveCurrentLayerInfoToTemp(long j);

    private native void nativeSaveFinalDisplayLayerInfo(long j);

    private native void nativeSaveFinishLoadLayerInfo(long j);

    private native void nativeScale(long j, String str, float f, float f2, float f3, float f4);

    private native void nativeScaleCanvas(long j, String str, float f, float f2, float f3, float f4);

    private native void nativeSelectWithCoord(long j, float f, float f2);

    private native void nativeSelectWithIndex(long j, String str);

    private native void nativeSendMsgToEffect(long j, int i, long j2, long j3, String str);

    private native void nativeSetBackgroundColor(long j, int i);

    private native void nativeSetComposerResource(long j, String str);

    private native void nativeSetComposerSlideFilter(long j, String str, String str2, String str3, float f, float f2);

    private native void nativeSetEffectFaceId(long j, int i);

    private native void nativeSetEffectHDRFilter(long j, String str, float f);

    private native int nativeSetInfoStickerAlpha(long j, int i, float f);

    private native int nativeSetInfoStickerLayer(long j, int i, int i2);

    private native int nativeSetInfoStickerPosition(long j, int i, float f, float f2);

    private native int nativeSetInfoStickerRotation(long j, int i, float f);

    private native int nativeSetInfoStickerScale(long j, int i, float f, float f2);

    private native void nativeSetLayerCanvasRect(long j, float f, float f2, float f3, float f4);

    private native void nativeSetMultiValueFilter(long j, String str, String str2, String str3);

    private native void nativeSetOneValueFilter(long j, String str, String str2, float f);

    private native void nativeSetPaintBrushEnable(long j, String str, String str2, boolean z);

    private native void nativeSetPaintParams(long j, String str, String str2);

    private native int nativeSetRenderType(long j, int i);

    private native int nativeSetSkinFilterValue(long j, String str, float f);

    private native void nativeSetStickerBrushParams(long j, String str);

    private native void nativeSetStickerBrushResource(long j, String str);

    private native void nativeSetStickerFilter(long j, String str, String str2, String str3, float f, float f2);

    private native void nativeSetStrokeRgba(long j, String str, float f, float f2, float f3, float f4, long j2);

    private native void nativeSetVectorGraphicsBrushEnable(long j, int i, boolean z);

    private native void nativeTranslate(long j, String str, float f, float f2);

    private native void nativeTranslateCanvas(long j, String str, float f, float f2);

    private native void nativeUnRegisterFaceInfoUpload(long j);

    private native void nativeUndoRedoBursh(long j, String str, boolean z);

    private native void nativeUndoRedoStickerBrush(long j, boolean z, int i);

    private native void nativeUndoRedoVectorGraphics(long j, int i, boolean z);

    private native int nativeUpdateAlgorithmCache(long j);

    private native void nativeUpdateComposerNode(long j, String str, String str2, float f);

    private native int nativeUpdateInfoStickerTemplateParam(long j, int i, String str);

    private native int nativeUpdateMagnifier(long j, float f, float f2, float f3, boolean z);

    private native int nativeUpdatePixelMeshPreview(long j, boolean z);

    private native int nativeUpdateText(long j, int i, String str);

    private native void nativeUpdateVectorGraphicsParamsWithId(long j, int i, String str, String str2, boolean z);

    private native int nativeUpdateWaterMask(long j, float f, float f2, float f3, boolean z);

    private native void nativeremoveComposerWithoutUndo(long j, String str, String str2);

    static {
        TENativeLibsLoader.m234146b();
    }

    public void enableUndoRedo() {
        nativeEnableUndoRedo(this.mHandler);
    }

    public synchronized void applyCurrentLayerInfoFromTemp() {
        long j = this.mHandler;
        if (j != 0) {
            nativeApplyCurrentLayerInfoFromTemp(j);
        }
    }

    public synchronized void cancelSelect() {
        long j = this.mHandler;
        if (j != 0) {
            nativeCancelSelect(j);
        }
    }

    public synchronized void clearEffect() {
        long j = this.mHandler;
        if (j != 0) {
            nativeClearEffect(j);
        }
    }

    public synchronized void clearLiquefyBuffer() {
        long j = this.mHandler;
        if (j != 0) {
            nativeClearLiquefyBuffer(j);
        }
    }

    public synchronized void confrimOriginalLayerParams() {
        long j = this.mHandler;
        if (j != 0) {
            nativeConfrimOriginalLayerParams(j);
        }
    }

    public synchronized int deleteWaterMask() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeDeleteWaterMask(j);
    }

    public synchronized void destoryVEImage() {
        long j = this.mHandler;
        if (j != 0) {
            nativeDestoryVEImage(j);
            this.mHandler = 0;
        }
    }

    public synchronized void doRenderEffect() {
        long j = this.mHandler;
        if (j != 0) {
            nativeRenderEffect(j);
        }
    }

    public synchronized void endStickerBrush() {
        long j = this.mHandler;
        if (j != 0) {
            nativeEndStickerBrush(j);
        }
    }

    public synchronized void executeConfirmParams() {
        long j = this.mHandler;
        if (j != 0) {
            nativeExecuteConfirmParams(j);
        }
    }

    public synchronized void executeConfirmRender() {
        long j = this.mHandler;
        if (j != 0) {
            nativeExecuteConfirmRender(j);
        }
    }

    public synchronized ArrayList<VECommandBean> getCommandQueue() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetCommandQueue(j);
    }

    public synchronized int[] getOutputSize() {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetOutputSize(j);
    }

    public synchronized void releaseSkinTexture() {
        long j = this.mHandler;
        if (j != 0) {
            nativeReleaseSkinTexture(j);
        }
    }

    public synchronized int resetEffectEngine() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeResetEffectEngine(j);
    }

    public synchronized void saveCurrentLayerInfoToTemp() {
        long j = this.mHandler;
        if (j != 0) {
            nativeSaveCurrentLayerInfoToTemp(j);
        }
    }

    public synchronized void saveFinalDisplayLayerInfo() {
        long j = this.mHandler;
        if (j != 0) {
            nativeSaveFinalDisplayLayerInfo(j);
        }
    }

    public synchronized void saveFinishLoadLayerInfo() {
        long j = this.mHandler;
        if (j != 0) {
            nativeSaveFinishLoadLayerInfo(j);
        }
    }

    public synchronized void unRegisterFaceInfoUpload() {
        long j = this.mHandler;
        if (j != 0) {
            nativeUnRegisterFaceInfoUpload(j);
        }
    }

    public synchronized void unRegisterSceneDetectCallback() {
        long j = this.mHandler;
        if (j != 0) {
            nativeRegisterSceneDetectCallback(j, null);
        }
    }

    public synchronized void unRegisterSkeletonDetectCallback() {
        long j = this.mHandler;
        if (j != 0) {
            nativeRegisterSkeletonDetectCallback(j, null);
        }
    }

    public synchronized int updateAlgorithmCache() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateAlgorithmCache(j);
    }

    public static void enableOpenGL3(boolean z) {
        nativeEnableOpenGL3(z);
    }

    public synchronized void enableLensHdr(boolean z) {
        nativeEnableLensHdr(this.mHandler, z);
    }

    public synchronized ArrayList<VEUndoRedoBean> getUndoRedoList(boolean z) {
        return getUndoRedoList(z, -1);
    }

    public synchronized int getUndoRedoListSize(boolean z) {
        return nativeGetUndoRedoListSize(this.mHandler, z);
    }

    public synchronized int addBrushSticker(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddBrushSticker(j, str);
    }

    public synchronized int addVectorSticker(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddVectorSticker(j, str);
    }

    public synchronized void beginStickerBrush(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeBeginStickerBrush(j, i);
        }
    }

    public synchronized void clearStickerBrush(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeClearStickerBrush(j, i);
        }
    }

    public synchronized void contrastImage(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeContrastImage(j, i);
        }
    }

    public synchronized void destorySurface(Surface surface) {
        long j = this.mHandler;
        if (j != 0) {
            nativeDestorySurface(j, surface);
        }
    }

    public synchronized void enableMirror(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableMirror(j, i);
        }
    }

    public synchronized int enableMmap(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeEnableMmap(j, z);
    }

    public synchronized void enableRenderAutomation(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableRenderAutomation(j, z);
        }
    }

    public synchronized float[] getInfoStickerPosition(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetInfoStickerPosition(j, i);
    }

    public synchronized String getInfoStickerTemplateParam(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetInfoStickerTemplateParam(j, i);
    }

    public synchronized String getStickerBrushState(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetStickerBrushState(j, i);
    }

    public synchronized String getVectorCurrentGraphics(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetVectorCurrentGraphics(j, i);
    }

    public synchronized void initPreviewSurface(Surface surface) {
        long j = this.mHandler;
        if (j != 0) {
            nativeInitPreviewSurface(j, surface);
        }
    }

    public synchronized String queryPaintParams(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeQueryPaintParams(j, str);
    }

    public synchronized void registerFaceInfoUpload(FaceInfoCallback faceInfoCallback) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRegisterFaceInfoUpload(j, true, faceInfoCallback);
        }
    }

    public synchronized void registerSceneDetectCallback(SceneInfoCallback sceneInfoCallback) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRegisterSceneDetectCallback(j, sceneInfoCallback);
        }
    }

    public synchronized void registerSkeletonDetectCallback(SkeletonInfoCallback skeletonInfoCallback) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRegisterSkeletonDetectCallback(j, skeletonInfoCallback);
        }
    }

    public synchronized int removeInfoSticker(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveInfoSticker(j, i);
    }

    public synchronized int removeMagnifier(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeRemoveMagnifier(j, z);
    }

    public synchronized void renderLayerQueue(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRenderLayerQueue(j, z);
        }
    }

    public synchronized void requestRenderAlgorithm(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRequestRenderAlgorithm(j, i);
        }
    }

    public synchronized String requestSkinAlgorithm(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeRequestSkinAlgorithm(j, str);
    }

    public synchronized void resumeRender(ArrayList<VECommandBean> arrayList) {
        long j = this.mHandler;
        if (j != 0) {
            nativeResumeRender(j, arrayList);
        }
    }

    public synchronized int saveCurrentImage(Bitmap bitmap) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveCurrentImage(j, bitmap);
    }

    public synchronized void selectWithIndex(String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSelectWithIndex(j, str);
        }
    }

    public synchronized void setBackgroundColor(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetBackgroundColor(j, i);
        }
    }

    public synchronized void setComposerResource(String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetComposerResource(j, str);
        }
    }

    public synchronized void setEffectFaceId(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetEffectFaceId(j, i);
        }
    }

    public synchronized int setRenderType(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetRenderType(j, i);
    }

    public synchronized void setStickerBrushParams(String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetStickerBrushParams(j, str);
        }
    }

    public synchronized void setStickerBrushResource(String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetStickerBrushResource(j, str);
        }
    }

    public synchronized void undoRedoBursh(String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeClearBursh(j, str);
        }
    }

    public synchronized int updatePixelMeshPreview(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdatePixelMeshPreview(j, z);
    }

    public void addTransparentLayer(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeAddTransparentLayer(j, i, i2);
        }
    }

    public void enableCanvas(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableCanvas(j, i, i2);
        }
    }

    public void setPaintParams(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPaintParams(j, str, str2);
        }
    }

    public synchronized int addInfoSticker(String str, String[] strArr) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeAddInfoSticker(j, str, strArr);
    }

    public synchronized void addPanoramicLayer(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeAddPanoramicLayer(j, str, str2);
        }
    }

    public synchronized String cacheCurrentFrame(String str, Boolean bool) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeCacheCurrentFrame(j, str, bool.booleanValue());
    }

    public synchronized void customContrastImage(String str, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeCustomContrastImage(j, str, z);
        }
    }

    public synchronized int[] decodeBufferToLocalPath(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeDecodeBufferToLocalPath(j, str, str2);
    }

    public synchronized String getVectorGraphicsParamsWithId(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeGetVectorGraphicsParamsWithId(j, i, str);
    }

    public synchronized void initOffScreenSurface(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeInitOffScreenSurface(j, i, i2);
        }
    }

    public synchronized String queryLayerParams(boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        return nativeQueryLayerParams(j, z, z2);
    }

    public synchronized void removeComposerWithoutUndo(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeremoveComposerWithoutUndo(j, str, str2);
        }
    }

    public synchronized void removeVectorGraphicsWithId(int i, String str) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRemoveVectorGraphicsWithId(j, i, str);
        }
    }

    public synchronized void replacePanoramicLayer(String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeReplacePanoramicLayer(j, str, str2);
        }
    }

    public synchronized void selectWithCoord(float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSelectWithCoord(j, f, f2);
        }
    }

    public synchronized void setEffectHDRFilter(String str, float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetEffectHDRFilter(j, str, f);
        }
    }

    public synchronized int setInfoStickerAlpha(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerAlpha(j, i, f);
    }

    public synchronized int setInfoStickerLayer(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerLayer(j, i, i2);
    }

    public synchronized int setInfoStickerRotation(int i, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerRotation(j, i, f);
    }

    public synchronized int setSkinFilterValue(String str, float f) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetSkinFilterValue(j, str, f);
    }

    public synchronized void setVectorGraphicsBrushEnable(int i, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetVectorGraphicsBrushEnable(j, i, z);
        }
    }

    public synchronized void undoRedoStickerBrush(boolean z, int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUndoRedoStickerBrush(j, z, i);
        }
    }

    public synchronized void undoRedoVectorGraphics(int i, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUndoRedoVectorGraphics(j, i, z);
        }
    }

    public synchronized int updateInfoStickerTemplateParam(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateInfoStickerTemplateParam(j, i, str);
    }

    public synchronized int updateText(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateText(j, i, str);
    }

    public synchronized float[] getInfoStickerBoundingBox(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        float[] nativeGetInfoStickerBoundingBox = nativeGetInfoStickerBoundingBox(j, i, z);
        if (nativeGetInfoStickerBoundingBox[0] != BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        float[] fArr = new float[4];
        System.arraycopy(nativeGetInfoStickerBoundingBox, 1, fArr, 0, 4);
        return fArr;
    }

    public synchronized ArrayList<VEUndoRedoBean> getUndoRedoList(boolean z, int i) {
        if (this.mHandler == 0) {
            return null;
        }
        VEUndoRedoBean.JniHolder jniHolder = new VEUndoRedoBean.JniHolder();
        nativeGetUndoRedoList(this.mHandler, jniHolder, z, i);
        return jniHolder.getJniResult();
    }

    public synchronized void undoRedoBursh(String str, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUndoRedoBursh(j, str, z);
        }
    }

    private synchronized long createImageHandle(int i, int i2, boolean z) {
        return nativeCreateImageHandle(i, i2, z);
    }

    public static synchronized TEImageInterface createVEImage(int i, int i2, boolean z) {
        synchronized (TEImageInterface.class) {
            TEImageInterface tEImageInterface = new TEImageInterface();
            long createImageHandle = tEImageInterface.createImageHandle(i, i2, z);
            if (createImageHandle == 0) {
                return null;
            }
            tEImageInterface.mHandler = createImageHandle;
            return tEImageInterface;
        }
    }

    public synchronized void addNewLayer(String str, int i, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeAddNewLayer(j, str, i, z);
        }
    }

    public synchronized void addVectorGraphicsWithParams(int i, String str, String str2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeAddVectorGraphicsWithParams(j, i, str, str2);
        }
    }

    public synchronized void executeRedoUndo(boolean z, int i, boolean z2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeExecuteRedoUndo(j, z, i, z2);
        }
    }

    public synchronized void replaceLayer(String str, int i, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeReplaceLayer(j, str, i, z);
        }
    }

    public synchronized int requestCacheSkinAlgorithm(String str, int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeRequestCacheSkinAlgorithm(j, str, i, i2);
    }

    public synchronized int setInfoStickerPosition(int i, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerPosition(j, i, f, f2);
    }

    public synchronized int setInfoStickerScale(int i, float f, float f2) {
        long j = this.mHandler;
        if (j == 0) {
            return -112;
        }
        return nativeSetInfoStickerScale(j, i, f, f2);
    }

    public synchronized void setMultiValueFilter(String str, String str2, String str3) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetMultiValueFilter(j, str, str2, str3);
        }
    }

    public synchronized void setOneValueFilter(String str, String str2, float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetOneValueFilter(j, str, str2, f);
        }
    }

    public synchronized void setPaintBrushEnable(String str, String str2, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetPaintBrushEnable(j, str, str2, z);
        }
    }

    public synchronized void translate(String str, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeTranslate(j, str, f, f2);
        }
    }

    public void translateCanvas(String str, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeTranslateCanvas(j, str, f, f2);
        }
    }

    public synchronized void updateComposerNode(String str, String str2, float f) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUpdateComposerNode(j, str, str2, f);
        }
    }

    public synchronized int saveCurrentImage(String str, boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveCurrentImageWithPath(j, str, z, z2);
    }

    public synchronized void initLensHdrEngine(String[] strArr, int i, int[] iArr) {
        if (this.mHandler != 0) {
            int length = strArr.length;
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(strArr[i2]);
                if (i2 < length - 1) {
                    sb.append(";");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 : iArr) {
                sb2.append(i3 + ",");
            }
            nativeInitLensHdrEngine(this.mHandler, sb.toString(), i, sb2.toString());
        }
    }

    public void setLayerCanvasRect(float f, float f2, float f3, float f4) {
        nativeSetLayerCanvasRect(this.mHandler, f, f2, f3, f4);
    }

    public synchronized void enableFaceBeautify(boolean z, boolean z2, boolean z3, boolean z4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeEnableFaceBeautify(j, z, z2, z3, z4);
        }
    }

    public synchronized void removeComposerFilter(String str, String str2, String str3, String str4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRemoveComposerFilter(j, str, str2, str3, str4);
        }
    }

    public synchronized void rotate(String str, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRotate(j, str, f, f2, f3);
        }
    }

    public void rotateCanvas(String str, float f, float f2, float f3) {
        long j = this.mHandler;
        if (j != 0) {
            nativeRotateCanvas(j, str, f, f2, f3);
        }
    }

    public synchronized void sendMsgToEffect(int i, long j, long j2, String str) {
        long j3 = this.mHandler;
        if (j3 != 0) {
            nativeSendMsgToEffect(j3, i, j, j2, str);
        }
    }

    public synchronized int updateMagnifier(float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateMagnifier(j, f, f2, f3, z);
    }

    public synchronized void updateVectorGraphicsParamsWithId(int i, String str, String str2, boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeUpdateVectorGraphicsParamsWithId(j, i, str, str2, z);
        }
    }

    public synchronized int updateWaterMask(float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateWaterMask(j, f, f2, f3, z);
    }

    public synchronized int[] getPixelColor(int i, int i2, int i3, int i4) {
        long j = this.mHandler;
        if (j == 0) {
            return null;
        }
        int[] nativeGetPixelColor = nativeGetPixelColor(j, i, i2, i3, i4);
        if (nativeGetPixelColor[0] != 0) {
            return null;
        }
        int[] iArr = new int[4];
        System.arraycopy(nativeGetPixelColor, 1, iArr, 0, 4);
        return iArr;
    }

    public synchronized int addWaterMask(String str, float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddWaterMask(j, str, f, f2, f3, z);
    }

    public synchronized void cutoutImage(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeCutoutImage(j, str, f, f2, f3, f4);
        }
    }

    public synchronized boolean isBrushOverlapped(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativeIsBrushOverlapped(j, str, f, f2, f3, f4);
    }

    public synchronized void scale(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeScale(j, str, f, f2, f3, f4);
        }
    }

    public void scaleCanvas(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j != 0) {
            nativeScaleCanvas(j, str, f, f2, f3, f4);
        }
    }

    public synchronized void setComposerSlideFilter(String str, String str2, String str3, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetComposerSlideFilter(j, str, str2, str3, f, f2);
        }
    }

    public synchronized void setStickerFilter(String str, String str2, String str3, float f, float f2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetStickerFilter(j, str, str2, str3, f, f2);
        }
    }

    public synchronized void addNewLayerWithBuffer(String[] strArr, int i, int i2, int i3, boolean z) {
        if (this.mHandler != 0) {
            int length = strArr.length;
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < length; i4++) {
                sb.append(strArr[i4]);
                if (i4 < length - 1) {
                    sb.append(";");
                }
            }
            nativeAddNewLayerWithBuffer(this.mHandler, sb.toString(), i, i2, i3, z);
        }
    }

    public synchronized void replaceLayerWithBuffer(String[] strArr, int i, int i2, int i3, boolean z) {
        if (this.mHandler != 0) {
            int length = strArr.length;
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < length; i4++) {
                sb.append(strArr[i4]);
                if (i4 < length - 1) {
                    sb.append(";");
                }
            }
            nativeReplaceLayerWithBuffer(this.mHandler, sb.toString(), i, i2, i3, z);
        }
    }

    public synchronized void setStrokeRgba(String str, float f, float f2, float f3, float f4, long j) {
        long j2 = this.mHandler;
        if (j2 != 0) {
            nativeSetStrokeRgba(j2, str, f, f2, f3, f4, j);
        }
    }

    public synchronized void processGestureEvent(String str, String str2, int i, float f, float f2, float f3, float f4, float f5, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeProcessGestureEvent(j, str, str2, i, f, f2, f3, f4, f5, i2);
        }
    }
}
