package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttvecamera.C60408m;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.ttvecamera.C60424p;
import com.ss.android.ttvecamera.C60427s;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* renamed from: com.ss.android.ttvecamera.hardware.e */
public class C60390e {

    /* renamed from: b */
    protected static String f150946b = "-1";

    /* renamed from: c */
    public static int f150947c = 1;

    /* renamed from: a */
    protected Context f150948a;

    /* renamed from: d */
    private int f150949d;

    /* renamed from: a */
    public boolean mo206822a(CameraCharacteristics cameraCharacteristics, int i) {
        if (cameraCharacteristics == null) {
            return false;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            C60427s.m234844d("TECameraHardware2Proxy", "Invalid hardware level = " + intValue);
            return false;
        }
        int i2 = C60389d.f150945b[intValue];
        this.f150949d = i2;
        C60408m.m234769a("te_record_camera_hardware_level", (long) i2);
        if (Build.VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        }
        if (this.f150949d >= i) {
            C60427s.m234839a("TECameraHardware2Proxy", "Camera hardware level supported, deviceLevel = " + this.f150949d + ", require = " + i);
            return true;
        }
        C60427s.m234844d("TECameraHardware2Proxy", "Camera hardware level not supported, deviceLevel = " + this.f150949d + ", require = " + i);
        return false;
    }

    /* renamed from: a */
    public String mo206814a() {
        CameraManager cameraManager = (CameraManager) this.f150948a.getSystemService("camera");
        try {
            return mo206821a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* renamed from: b */
    public boolean mo206824b() {
        try {
            if (f150947c == 1) {
                return false;
            }
            Class<?> cls = Class.forName("com.google.ar.core.ArCoreApk");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Object invoke2 = cls.getMethod("checkAvailability", Context.class).invoke(invoke, this.f150948a);
            C60427s.m234839a("TECameraHardware2Proxy", "ARCore availability " + invoke2.toString());
            return "SUPPORTED_INSTALLED".equals(invoke2.toString());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public C60390e(Context context) {
        this.f150948a = context;
    }

    /* renamed from: b */
    public boolean mo206825b(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    /* renamed from: d */
    public boolean mo206826d(CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo206827e(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo206828f(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() < 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo206829g(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() < 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo206817c(CameraCharacteristics cameraCharacteristics) {
        int i;
        if (mo206826d(cameraCharacteristics)) {
            i = 1;
        } else {
            i = 0;
        }
        if (mo206827e(cameraCharacteristics)) {
            i |= 2;
        }
        C60427s.m234839a("TECameraHardware2Proxy", "Stabilization type: " + Integer.toBinaryString(i));
        C60408m.m234769a("te_record_camera_stabilization", (long) i);
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public float mo206818a(CameraCharacteristics cameraCharacteristics) {
        float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format((double) ((((float) (rect.width() - ((int) (((float) rect.width()) / floatValue)))) / floatValue) / ((float) rect.width()))).trim()).floatValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.01f;
        }
    }

    /* renamed from: b */
    public String mo206823b(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    if (fArr[0] > f) {
                        f = fArr[0];
                        str = str2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public static C60390e m234633a(Context context, int i) {
        C60390e eVar;
        C60427s.m234839a("TECameraHardware2Proxy", "getDeviceProxy:getDeviceProxy  " + i);
        f150947c = i;
        synchronized (C60390e.class) {
            if (i == 3) {
                eVar = new TECameraOGXMProxy(context);
            } else if (i == 4) {
                eVar = new C60387b(context);
            } else if (i == 5) {
                eVar = new C60391f(context);
            } else if (i == 6) {
                eVar = new C60386a(context);
            } else if (i == 8) {
                eVar = new C60393h(context);
            } else if (C60389d.m234632d()) {
                eVar = new C60395j(context);
            } else if (C60389d.m234629a()) {
                eVar = new C60394i(context);
            } else if (C60389d.m234630b()) {
                eVar = new C60392g(context);
            } else if (C60389d.m234631c()) {
                eVar = new C60388c(context);
            } else {
                C60427s.m234844d("TECameraHardware2Proxy", "Unknown platform");
                eVar = new C60390e(context);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public String mo206821a(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float f2 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
                    if (f2 <= f) {
                        str = str2;
                        f = f2;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return str;
    }

    /* renamed from: a */
    public void mo206816a(int i, CameraManager cameraManager) {
        try {
            f150946b = mo206821a(cameraManager.getCameraIdList(), cameraManager);
            C60427s.m234839a("TECameraHardware2Proxy", "fillWideCameraID mWideCameraID = " + f150946b);
        } catch (CameraAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public float mo206819a(CameraCharacteristics cameraCharacteristics, int i, float f) {
        Float f2 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float floatValue = f2.floatValue();
        if (f != -1.0f) {
            return floatValue * f;
        }
        if (i != 6) {
            return floatValue / 2.0f;
        }
        return floatValue;
    }

    /* renamed from: a */
    public int mo206813a(CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            C60427s.m234839a("TECameraHardware2Proxy", "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                C60427s.m234839a("TECameraHardware2Proxy", "EIS mode: " + i);
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    C60427s.m234839a("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C60427s.m234839a("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                C60427s.m234839a("TECameraHardware2Proxy", "OIS mode: " + i2);
                if (i2 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    C60427s.m234839a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
            return -200;
        }
        C60427s.m234839a("TECameraHardware2Proxy", "Don't supported OIS");
        return -200;
    }

    /* renamed from: a */
    public C60424p mo206820a(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3, int i4) {
        Range[] rangeArr;
        C60424p pVar = new C60424p(i, i2);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return pVar;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i5 = pVar.f151004c;
        int i6 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i5, ((Integer) range.getUpper()).intValue() * i5};
            arrayList.add(iArr);
            if (i6 < iArr[1]) {
                i6 = iArr[1];
            }
        }
        C60408m.m234769a("te_record_camera_max_fps", (long) i6);
        int[] a = C60410n.m234789a(i3, i4, pVar.mo206917a(), arrayList);
        pVar.f151002a = a[0];
        pVar.f151003b = a[1];
        return pVar;
    }
}
