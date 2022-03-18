package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.hardware.j */
public class C60395j extends C60390e {

    /* renamed from: d */
    public Map<String, Float> f150952d = new HashMap();

    /* renamed from: c */
    public String mo206833c() {
        Map<String, Float> map = this.f150952d;
        if (map == null) {
            return null;
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        String str = "";
        for (String str2 : map.keySet()) {
            float floatValue = this.f150952d.get(str2).floatValue();
            if (f < floatValue) {
                str = str2;
                f = floatValue;
            }
        }
        return str;
    }

    public C60395j(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo206832a(CameraCharacteristics cameraCharacteristics, String str) {
        this.f150952d.put(str, Float.valueOf(((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getHeight()));
    }

    /* renamed from: a */
    public String mo206831a(CameraManager cameraManager, int i, String[] strArr) throws CameraAccessException {
        int i2;
        int i3 = 0;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 == i) {
                if (i2 != 1) {
                    return str;
                }
                mo206832a(cameraCharacteristics, str);
                i3++;
            }
        }
        if (i3 >= 2) {
            return mo206833c();
        }
        return null;
    }
}
