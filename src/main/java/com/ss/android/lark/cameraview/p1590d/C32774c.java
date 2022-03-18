package com.ss.android.lark.cameraview.p1590d;

import android.content.Context;
import android.hardware.Camera;
import android.view.WindowManager;
import com.ss.android.lark.log.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.cameraview.d.c */
public class C32774c {

    /* renamed from: a */
    private C32776a f84098a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.cameraview.d.c$b */
    public static final class C32777b {

        /* renamed from: a */
        public static final C32774c f84100a = new C32774c();
    }

    /* renamed from: a */
    public static C32774c m125806a() {
        return C32777b.f84100a;
    }

    private C32774c() {
        this.f84098a = new C32776a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.cameraview.d.c$a */
    public class C32776a implements Comparator<Camera.Size> {
        private C32776a() {
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            if (size.width == size2.width) {
                return 0;
            }
            if (size.width > size2.width) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: a */
    private boolean m125807a(Camera.Size size, float f) {
        if (((double) Math.abs((((float) size.width) / ((float) size.height)) - f)) <= 0.2d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Camera.Size m125805a(List<Camera.Size> list, float f) {
        int i = 0;
        float f2 = 100.0f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Camera.Size size = list.get(i2);
            float f3 = f - (((float) size.width) / ((float) size.height));
            if (Math.abs(f3) < f2) {
                f2 = Math.abs(f3);
                i = i2;
            }
        }
        return list.get(i);
    }

    /* renamed from: a */
    public int mo120748a(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165383e("JCameraView", e.getMessage());
        }
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    /* renamed from: a */
    public boolean mo120750a(List<Integer> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == list.get(i2).intValue()) {
                Log.m165389i("JCameraView", "Formats supported " + i);
                return true;
            }
        }
        Log.m165389i("JCameraView", "Formats not supported " + i);
        return false;
    }

    /* renamed from: a */
    public boolean mo120751a(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i))) {
                Log.m165389i("JCameraView", "FocusMode supported " + str);
                return true;
            }
        }
        Log.m165389i("JCameraView", "FocusMode not supported " + str);
        return false;
    }

    /* renamed from: b */
    public Camera.Size mo120752b(List<Camera.Size> list, int i, float f) {
        Collections.sort(list, this.f84098a);
        Iterator<Camera.Size> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width > i && m125807a(next, f)) {
                Log.m165389i("JCameraView", "MakeSure Picture :w = " + next.width + " h = " + next.height);
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            return m125805a(list, f);
        }
        return list.get(i2);
    }

    /* renamed from: a */
    public Camera.Size mo120749a(List<Camera.Size> list, int i, float f) {
        Collections.sort(list, this.f84098a);
        Iterator<Camera.Size> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width > i && m125807a(next, f)) {
                Log.m165389i("JCameraView", "MakeSure Preview :w = " + next.width + " h = " + next.height);
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            return m125805a(list, f);
        }
        return list.get(i2);
    }
}
