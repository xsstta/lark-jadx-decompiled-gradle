package com.ss.android.bytedcert.p1308f.p1309a.p1310a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.bytedance.common.utility.Logger;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.bytedcert.f.a.a.a */
public class C28361a {

    /* renamed from: a */
    private boolean f71248a = true;

    /* renamed from: b */
    private Context f71249b;

    /* renamed from: c */
    private int f71250c;

    /* renamed from: d */
    private Camera f71251d;

    /* renamed from: e */
    private Camera.CameraInfo f71252e = new Camera.CameraInfo();

    /* renamed from: a */
    public Camera mo101036a() {
        return this.f71251d;
    }

    /* renamed from: f */
    public int mo101045f() {
        return Camera.getNumberOfCameras();
    }

    /* renamed from: c */
    public void mo101042c() {
        Camera camera = this.f71251d;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception unused) {
                Logger.m15173i("CameraProxy", "stopPreview failed");
            }
        }
    }

    /* renamed from: d */
    public int mo101043d() {
        Camera.CameraInfo cameraInfo = this.f71252e;
        if (cameraInfo == null) {
            return 0;
        }
        return cameraInfo.orientation;
    }

    /* renamed from: e */
    public boolean mo101044e() {
        Camera.CameraInfo cameraInfo = this.f71252e;
        if (cameraInfo != null && cameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo101041b() {
        try {
            Camera camera = this.f71251d;
            if (camera != null) {
                camera.setPreviewCallback(null);
                this.f71251d.stopPreview();
                this.f71251d.release();
                this.f71251d = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m104025g() {
        Camera.Parameters parameters = this.f71251d.getParameters();
        Logger.m15170e("CameraProxy", "parameters: " + parameters.flatten());
        if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        }
        parameters.getFlashMode();
        parameters.setFlashMode("off");
        Point h = m104026h();
        parameters.setPreviewSize(h.x, h.y);
        Point i = m104027i();
        parameters.setPictureSize(i.x, i.y);
        try {
            this.f71251d.setParameters(parameters);
        } catch (RuntimeException e) {
            Logger.m15173i("CameraProxy", "setParameters fail msg=" + e.getMessage());
        }
    }

    /* renamed from: h */
    private Point m104026h() {
        Point point = new Point(640, 480);
        Camera camera = this.f71251d;
        if (camera == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        for (Camera.Size size : supportedPreviewSizes) {
            if (size.width == point.x && size.height == point.y) {
                return point;
            }
        }
        for (Camera.Size size2 : supportedPreviewSizes) {
            long j = (long) (size2.width * size2.height);
            if (j >= 202500 && j <= 2250000) {
                return new Point(size2.width, size2.height);
            }
        }
        Point point2 = new Point(0, 0);
        for (Camera.Size size3 : supportedPreviewSizes) {
            if (point2.x < size3.width) {
                point2.x = size3.width;
                point2.y = size3.height;
            }
        }
        return point2;
    }

    /* renamed from: i */
    private Point m104027i() {
        Point point = new Point(1280, 720);
        Camera camera = this.f71251d;
        if (camera == null) {
            return null;
        }
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        for (Camera.Size size : supportedPictureSizes) {
            if (size.width == point.x && size.height == point.y) {
                return point;
            }
        }
        for (Camera.Size size2 : supportedPictureSizes) {
            long j = (long) (size2.height * size2.width);
            if (j >= 202500 && j <= 4000000) {
                return new Point(size2.width, size2.height);
            }
        }
        Point point2 = new Point(0, 0);
        for (Camera.Size size3 : supportedPictureSizes) {
            if (point2.x < size3.width) {
                point2.x = size3.width;
                point2.y = size3.height;
            }
        }
        return point2;
    }

    public C28361a(Context context) {
        this.f71249b = context;
    }

    /* renamed from: a */
    public ArrayList<String> mo101037a(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        Camera camera = this.f71251d;
        if (camera != null) {
            List<Camera.Size> list = null;
            try {
                list = camera.getParameters().getSupportedPreviewSizes();
            } catch (RuntimeException unused) {
            }
            if (list == null) {
                return arrayList;
            }
            for (String str : strArr) {
                int indexOf = str.indexOf(SmEvents.EVENT_NW);
                if (indexOf != -1) {
                    int parseInt = Integer.parseInt(str.substring(0, indexOf));
                    int parseInt2 = Integer.parseInt(str.substring(indexOf + 1));
                    for (Camera.Size size : list) {
                        if (size.width == parseInt && size.height == parseInt2) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo101040a(int i) {
        try {
            mo101041b();
            Camera open = Camera.open(i);
            this.f71251d = open;
            open.getParameters();
            this.f71250c = i;
            Camera.getCameraInfo(i, this.f71252e);
            m104025g();
            return true;
        } catch (Exception e) {
            this.f71251d = null;
            Logger.m15173i("CameraProxy", "openCamera fail msg=" + e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public void mo101038a(int i, int i2) {
        Camera camera = this.f71251d;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setPreviewSize(i, i2);
            try {
                this.f71251d.setParameters(parameters);
            } catch (RuntimeException e) {
                Logger.m15173i("CameraProxy", "setParameters fail msg=" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo101039a(SurfaceTexture surfaceTexture, Camera.PreviewCallback previewCallback) {
        try {
            Camera camera = this.f71251d;
            if (camera != null) {
                camera.setPreviewTexture(surfaceTexture);
                if (previewCallback != null) {
                    this.f71251d.setPreviewCallbackWithBuffer(previewCallback);
                }
                this.f71251d.startPreview();
            }
        } catch (IOException unused) {
            Logger.m15173i("CameraProxy", "startPreview failed");
        } catch (Exception unused2) {
            Logger.m15173i("CameraProxy", "startPreview failed");
        }
    }
}
