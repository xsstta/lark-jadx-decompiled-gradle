package com.ss.android.bytedcert.view.camera;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.bytedance.common.utility.Logger;
import com.ss.android.bytedcert.utils.C28432b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.view.camera.a */
public class C28445a {

    /* renamed from: a */
    public static int f71543a = 0;

    /* renamed from: b */
    private static C28445a f71544b = new C28445a();

    /* renamed from: c */
    private Camera f71545c;

    /* renamed from: d */
    private Camera.CameraInfo f71546d = new Camera.CameraInfo();

    /* renamed from: e */
    private Camera.Size f71547e = null;

    /* renamed from: a */
    public static C28445a m104254a() {
        return f71544b;
    }

    /* renamed from: b */
    public int mo101257b() {
        return f71543a;
    }

    /* renamed from: e */
    public void mo101260e() {
        try {
            Camera camera = this.f71545c;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo101259d() {
        try {
            Camera camera = this.f71545c;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode("torch");
                this.f71545c.setParameters(parameters);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo101261f() {
        try {
            Camera camera = this.f71545c;
            if (camera != null) {
                camera.setPreviewCallback(null);
                this.f71545c.stopPreview();
                this.f71545c.release();
                this.f71545c = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo101258c() {
        try {
            Camera camera = this.f71545c;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode("off");
                this.f71545c.setParameters(parameters);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo101255a(Camera.PictureCallback pictureCallback) {
        try {
            C28432b.m104209a("id_card_photo_upload_camera_button", new JSONObject());
            Camera camera = this.f71545c;
            if (camera != null) {
                camera.takePicture(null, null, null, pictureCallback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private Camera.Size m104252a(Camera.Size size) {
        Camera camera = this.f71545c;
        Camera.Size size2 = null;
        if (camera == null) {
            return null;
        }
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        float f = Float.MAX_VALUE;
        float f2 = ((float) size.height) / ((float) size.width);
        for (Camera.Size size3 : supportedPictureSizes) {
            if ((size3.width >= 400 || size3.height >= 400) && (size3.width <= 1600 || size3.height <= 1600)) {
                float f3 = (((float) size3.height) / ((float) size3.width)) - f2;
                if (Math.abs(f3) < f) {
                    f = Math.abs(f3);
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    /* renamed from: c */
    private Camera.Size m104256c(int i, int i2) {
        Camera camera = this.f71545c;
        if (camera == null) {
            return null;
        }
        Camera.Size a = m104253a(camera.getParameters().getSupportedPreviewSizes(), i, i2);
        if (a != null) {
            return a;
        }
        return m104257d(i, i2);
    }

    /* renamed from: d */
    private Camera.Size m104257d(int i, int i2) {
        Camera camera = this.f71545c;
        Camera.Size size = null;
        if (camera == null) {
            return null;
        }
        float f = Float.MAX_VALUE;
        float f2 = ((float) i) / ((float) i2);
        for (Camera.Size size2 : camera.getParameters().getSupportedPreviewSizes()) {
            float f3 = (((float) size2.height) / ((float) size2.width)) - f2;
            if (Math.abs(f3) < f) {
                f = Math.abs(f3);
                size = size2;
            }
        }
        return size;
    }

    /* renamed from: a */
    public void mo101254a(int i, int i2) {
        int i3 = 0;
        while (i3 < 3) {
            try {
                this.f71545c = Camera.open(f71543a);
                m104255b(i, i2);
                Camera.getCameraInfo(f71543a, this.f71546d);
                this.f71545c.setDisplayOrientation(90);
                return;
            } catch (Exception e) {
                Thread.sleep(100);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return;
        e.printStackTrace();
        i3++;
    }

    /* renamed from: b */
    private void m104255b(int i, int i2) {
        Camera camera = this.f71545c;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.getSupportedPreviewSizes();
            Camera.Size c = m104256c(i, i2);
            this.f71547e = c;
            if (c != null) {
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                } else if (supportedFocusModes.contains("infinity")) {
                    parameters.setFocusMode("infinity");
                }
                parameters.setPreviewSize(this.f71547e.width, this.f71547e.height);
                Camera.Size a = m104252a(this.f71547e);
                if (a != null) {
                    parameters.setPictureSize(a.width, a.height);
                }
                this.f71545c.setParameters(parameters);
                Logger.m15167d("CameraDevice", "set opt size");
                return;
            }
            parameters.setPreviewSize(1280, 720);
            parameters.setPictureSize(1280, 720);
            Logger.m15167d("CameraDevice", "720 1280");
        }
    }

    /* renamed from: a */
    public void mo101256a(SurfaceHolder surfaceHolder, Camera.PreviewCallback previewCallback) {
        try {
            Camera camera = this.f71545c;
            if (camera != null) {
                camera.setPreviewDisplay(surfaceHolder);
                this.f71545c.startPreview();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private Camera.Size m104253a(List<Camera.Size> list, int i, int i2) {
        double d = ((double) i2) / ((double) i);
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            Logger.m15167d("Camera.Size", size2.width + "," + size2.height);
            double d4 = ((double) size2.width) / ((double) size2.height);
            if (Math.abs(d4 - d) <= 0.2d) {
                if (((double) Math.abs(size2.height - i2)) < d3) {
                    d3 = (double) Math.abs(size2.height - i2);
                    size = size2;
                }
                Logger.m15167d("Camera radio", " width " + size2.width + " height " + size2.height + " ratio " + d4 + " targetRadio " + d + " minDiff " + d3);
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (((double) Math.abs(size3.height - i2)) < d2) {
                    d2 = (double) Math.abs(size3.height - i2);
                    size = size3;
                }
            }
        }
        Logger.m15167d("Camera Device", "width = " + size.width + " height = " + size.height + " w = " + i + " h = " + i2);
        return size;
    }
}
