package com.ss.android.ttve.utils;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vesdk.C63929ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CameraInstance {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static CameraInstance mThisInstance;
    private Comparator<Camera.Size> comparatorBigger = new Comparator<Camera.Size>() {
        /* class com.ss.android.ttve.utils.CameraInstance.C602711 */

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size2.width - size.width;
            if (i == 0) {
                return size2.height - size.height;
            }
            return i;
        }
    };
    private Comparator<Camera.Size> comparatorSmaller = new Comparator<Camera.Size>() {
        /* class com.ss.android.ttve.utils.CameraInstance.C602722 */

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.width - size2.width;
            if (i == 0) {
                return size.height - size2.height;
            }
            return i;
        }
    };
    private Camera mCameraDevice;
    private int mDefaultCameraID = -1;
    private int mFacing;
    private boolean mIsPreviewing;
    private Camera.Parameters mParams;
    private int mPictureHeight = 720;
    private int mPictureWidth = 1280;
    private int mPreferPreviewHeight = 720;
    private int mPreferPreviewWidth = 1280;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mRotation;

    /* renamed from: com.ss.android.ttve.utils.CameraInstance$a */
    public interface AbstractC60274a {
        /* renamed from: a */
        void mo206350a();
    }

    private static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public Camera getCameraDevice() {
        return this.mCameraDevice;
    }

    public int getCameraFacing() {
        return this.mFacing;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public boolean isPreviewing() {
        return this.mIsPreviewing;
    }

    public int pictureHeight() {
        return this.mPictureHeight;
    }

    public int pictureWidth() {
        return this.mPictureWidth;
    }

    public int previewHeight() {
        return this.mPreviewHeight;
    }

    public int previewWidth() {
        return this.mPreviewWidth;
    }

    public boolean isCameraOpened() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public boolean isUsingFrontCamera() {
        if (this.mFacing == 1) {
            return true;
        }
        return false;
    }

    public static synchronized CameraInstance getInstance() {
        CameraInstance cameraInstance;
        synchronized (CameraInstance.class) {
            if (mThisInstance == null) {
                mThisInstance = new CameraInstance();
            }
            cameraInstance = mThisInstance;
        }
        return cameraInstance;
    }

    public synchronized Camera.Parameters getParams() {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            return null;
        }
        return camera.getParameters();
    }

    public synchronized void stopCamera() {
        C63929ab.m250974a("CameraInstance", "stopCamera...");
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            try {
                this.mCameraDevice.setPreviewTexture(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mCameraDevice.release();
            this.mCameraDevice = null;
        }
    }

    public synchronized void stopPreview() {
        Camera camera;
        C63929ab.m250976b("CameraInstance", "Camera stopPreview...");
        if (this.mIsPreviewing && (camera = this.mCameraDevice) != null) {
            this.mIsPreviewing = false;
            camera.stopPreview();
            C63929ab.m250974a("CameraInstance", "Camera stopped!");
        }
    }

    public boolean tryOpenCamera(AbstractC60274a aVar) {
        return tryOpenCamera(aVar, 0);
    }

    private static int clamp(int i) {
        return clamp(i, IByteRtcError.BRERR_INVALID_TOKEN, 1000);
    }

    public synchronized void setParams(Camera.Parameters parameters) {
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            this.mParams = parameters;
            camera.setParameters(parameters);
        }
    }

    private void setCameraDisplayOrientation(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        this.mRotation = setOrientationDegrees(i);
    }

    public synchronized void setFocusMode(String str) {
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            this.mParams = parameters;
            if (parameters.getSupportedFocusModes().contains(str)) {
                this.mParams.setFocusMode(str);
            }
        }
    }

    public int setOrientationDegrees(int i) {
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mDefaultCameraID, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = ((360 - ((cameraInfo.orientation + i) % 360)) + 180) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
        }
        try {
            this.mCameraDevice.setDisplayOrientation(i2);
        } catch (Exception unused) {
        }
        return i2;
    }

    public synchronized void startPreview(SurfaceTexture surfaceTexture) {
        C63929ab.m250974a("CameraInstance", "Camera startPreview...");
        if (this.mIsPreviewing) {
            C63929ab.m250978c("CameraInstance", "Camera is previewing...");
            return;
        }
        Camera camera = this.mCameraDevice;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
                this.mCameraDevice.startPreview();
                this.mIsPreviewing = true;
            } catch (Exception e) {
                e.printStackTrace();
                C63929ab.m250980d("CameraInstance", "startPreview: Error " + e.getMessage());
                this.mIsPreviewing = false;
                try {
                    this.mCameraDevice.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.mCameraDevice = null;
            }
        }
    }

    public void initCamera(int i) {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            C63929ab.m250980d("CameraInstance", "initCamera: Camera is not opened!");
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        Iterator<Integer> it = parameters.getSupportedPictureFormats().iterator();
        while (it.hasNext()) {
            C63929ab.m250974a("CameraInstance", String.format("Picture Format: %x", Integer.valueOf(it.next().intValue())));
        }
        this.mParams.setPictureFormat(DynamicModule.f58006b);
        List<Camera.Size> supportedPictureSizes = this.mParams.getSupportedPictureSizes();
        Collections.sort(supportedPictureSizes, this.comparatorBigger);
        Camera.Size size = null;
        Camera.Size size2 = null;
        for (Camera.Size size3 : supportedPictureSizes) {
            if (size2 == null || (size3.width >= this.mPictureWidth && size3.height >= this.mPictureHeight)) {
                size2 = size3;
            }
        }
        List<Camera.Size> supportedPreviewSizes = this.mParams.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, this.comparatorBigger);
        for (Camera.Size size4 : supportedPreviewSizes) {
            C63929ab.m250976b("CameraInstance", String.format("Supported preview size: %d x %d", Integer.valueOf(size4.width), Integer.valueOf(size4.height)));
            if (size == null || (size4.width >= this.mPreferPreviewWidth && size4.height >= this.mPreferPreviewHeight)) {
                size = size4;
            }
        }
        List<Integer> supportedPreviewFrameRates = this.mParams.getSupportedPreviewFrameRates();
        this.mParams.setPreviewSize(size.width, size.height);
        this.mParams.setPictureSize(size2.width, size2.height);
        if (this.mParams.getSupportedFocusModes().contains("continuous-video")) {
            this.mParams.setFocusMode("continuous-video");
        }
        int i2 = 30;
        int i3 = (i * 2) / 3;
        int i4 = (i * 4) / 3;
        int i5 = 0;
        for (Integer num : supportedPreviewFrameRates) {
            C63929ab.m250981e("CameraInstance", "Supported frame rate: " + num);
            if (i5 < num.intValue()) {
                i5 = num.intValue();
            }
            if (i2 > num.intValue()) {
                i2 = num.intValue();
            }
        }
        int max = Math.max(i2, i3);
        int min = Math.min(i4, i5);
        C63929ab.m250974a("CameraInstance", "FpsRange = [" + max + ", " + min + "]");
        this.mParams.setPreviewFpsRange(max * 1000, min * 1000);
        int[] iArr = new int[2];
        this.mParams.getPreviewFpsRange(iArr);
        C63929ab.m250974a("CameraInstance", "FpsRange = [" + (iArr[0] / 1000) + ", " + (iArr[1] / 1000) + "]");
        try {
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Camera.Parameters parameters2 = this.mCameraDevice.getParameters();
        this.mParams = parameters2;
        Camera.Size pictureSize = parameters2.getPictureSize();
        Camera.Size previewSize = this.mParams.getPreviewSize();
        this.mPreviewWidth = previewSize.width;
        this.mPreviewHeight = previewSize.height;
        this.mPictureWidth = pictureSize.width;
        this.mPictureHeight = pictureSize.height;
        C63929ab.m250974a("CameraInstance", String.format("Camera Picture Size: %d x %d", Integer.valueOf(pictureSize.width), Integer.valueOf(pictureSize.height)));
        C63929ab.m250974a("CameraInstance", String.format("Camera Preview Size: %d x %d", Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height)));
    }

    public void focusAtPoint(float f, float f2) {
        focusAtPoint(f, f2, 0.08f);
    }

    public void setPreferPreviewSize(int i, int i2) {
        this.mPreferPreviewHeight = i;
        this.mPreferPreviewWidth = i2;
    }

    public synchronized boolean tryOpenCamera(AbstractC60274a aVar, int i) {
        C63929ab.m250974a("CameraInstance", "try open camera...");
        try {
            if (Build.VERSION.SDK_INT > 8) {
                int numberOfCameras = Camera.getNumberOfCameras();
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i2 = 0; i2 < numberOfCameras; i2++) {
                    Camera.getCameraInfo(i2, cameraInfo);
                    if (cameraInfo.facing == i) {
                        this.mDefaultCameraID = i2;
                        this.mFacing = i;
                    }
                }
            }
            stopPreview();
            Camera camera = this.mCameraDevice;
            if (camera != null) {
                camera.release();
            }
            int i3 = this.mDefaultCameraID;
            if (i3 >= 0) {
                this.mCameraDevice = Camera.open(i3);
            } else {
                this.mCameraDevice = Camera.open();
                this.mFacing = 0;
            }
            this.mRotation = setOrientationDegrees(0);
            C63929ab.m250976b("CameraInstance", "Camera rotation = " + this.mRotation);
            if (this.mCameraDevice == null) {
                return false;
            }
            C63929ab.m250974a("CameraInstance", "Camera opened!");
            try {
                initCamera(30);
                if (aVar != null) {
                    aVar.mo206350a();
                }
                return true;
            } catch (Exception unused) {
                this.mCameraDevice.release();
                this.mCameraDevice = null;
                return false;
            }
        } catch (Exception e) {
            C63929ab.m250980d("CameraInstance", "Open Camera Failed!");
            e.printStackTrace();
            this.mCameraDevice = null;
            return false;
        }
    }

    private void rotateRectForOrientation(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public synchronized void setPictureSize(int i, int i2, boolean z) {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            this.mPictureWidth = i;
            this.mPictureHeight = i2;
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Camera.Size size = null;
        if (z) {
            Collections.sort(supportedPictureSizes, this.comparatorBigger);
            for (Camera.Size size2 : supportedPictureSizes) {
                if (size == null || (size2.width >= i && size2.height >= i2)) {
                    size = size2;
                }
            }
        } else {
            Collections.sort(supportedPictureSizes, this.comparatorSmaller);
            for (Camera.Size size3 : supportedPictureSizes) {
                if (size == null || (size3.width <= i && size3.height <= i2)) {
                    size = size3;
                }
            }
        }
        if (size != null) {
            this.mPictureWidth = size.width;
        }
        if (size != null) {
            this.mPictureHeight = size.height;
        }
        try {
            this.mParams.setPictureSize(this.mPictureWidth, this.mPictureHeight);
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void focusAtPoint(float f, float f2, float f3) {
        Camera camera = this.mCameraDevice;
        if (camera == null) {
            C63929ab.m250980d("CameraInstance", "Error: focus after release.");
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.mParams = parameters;
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Rect calculateTapArea = calculateTapArea(f, f2, f3, this.mRotation);
            C63929ab.m250976b("CameraInstance", String.format("FocusAreas: [%d, %d, %d, %d]", Integer.valueOf(calculateTapArea.left), Integer.valueOf(calculateTapArea.top), Integer.valueOf(calculateTapArea.right), Integer.valueOf(calculateTapArea.bottom)));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(calculateTapArea, 1000));
            try {
                this.mCameraDevice.cancelAutoFocus();
                if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                    this.mParams.setFocusAreas(arrayList);
                }
                this.mParams.setMeteringAreas(arrayList);
                this.mParams.setFocusMode("continuous-video");
                this.mCameraDevice.setParameters(this.mParams);
                this.mCameraDevice.autoFocus(new Camera.AutoFocusCallback() {
                    /* class com.ss.android.ttve.utils.CameraInstance.C602733 */

                    public void onAutoFocus(boolean z, Camera camera) {
                        if (z) {
                            C63929ab.m250974a("CameraInstance", "Camera Focus Succeed!");
                            return;
                        }
                        C63929ab.m250974a("CameraInstance", "Camera Focus Failed!");
                        try {
                            Camera.Parameters parameters = camera.getParameters();
                            parameters.setFocusMode("auto");
                            camera.setParameters(parameters);
                        } catch (Exception unused) {
                        }
                    }
                });
            } catch (Exception e) {
                C63929ab.m250980d("CameraInstance", "Error: focusAtPoint failed: " + e.toString());
            }
        } else {
            C63929ab.m250974a("CameraInstance", "The device does not support metering areas...");
        }
    }

    public Rect calculateTapArea(float f, float f2, float f3, int i) {
        int intValue = Float.valueOf(f3 * 1000.0f).intValue();
        int i2 = intValue / 2;
        int clamp = clamp((((int) (f * 2000.0f)) - 1000) - i2, IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        int clamp2 = clamp((((int) (f2 * 2000.0f)) - 1000) - i2, IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        rotateRectForOrientation(i, new Rect(IByteRtcError.BRERR_INVALID_TOKEN, IByteRtcError.BRERR_INVALID_TOKEN, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
