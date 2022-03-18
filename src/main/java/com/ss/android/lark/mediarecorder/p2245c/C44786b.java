package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.hardware.Camera;
import android.view.WindowManager;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mediarecorder.c.b */
public class C44786b {

    /* renamed from: a */
    private C44788a f113412a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediarecorder.c.b$b */
    public static final class C44789b {

        /* renamed from: a */
        public static final C44786b f113414a = new C44786b();
    }

    /* renamed from: a */
    public static C44786b m177616a() {
        return C44789b.f113414a;
    }

    private C44786b() {
        this.f113412a = new C44788a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediarecorder.c.b$a */
    public class C44788a implements Comparator<Camera.Size> {
        private C44788a() {
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
    private boolean m177617a(Camera.Size size, float f) {
        if (((double) Math.abs((((float) size.width) / ((float) size.height)) - f)) <= 0.2d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Camera.Size m177615a(List<Camera.Size> list, float f) {
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
    public int mo158541a(Context context, int i) {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
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
        } catch (Exception e) {
            C44796g.m177635a("getCameraDisplayOrientation e: " + e);
            return 90;
        }
    }

    /* renamed from: a */
    public boolean mo158543a(List<Integer> list, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == list.get(i2).intValue()) {
                C44796g.m177637c("Formats supported " + i);
                return true;
            }
        }
        C44796g.m177637c("Formats not supported " + i);
        return false;
    }

    /* renamed from: a */
    public boolean mo158544a(List<String> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i))) {
                C44796g.m177637c("FocusMode supported " + str);
                return true;
            }
        }
        C44796g.m177637c("FocusMode not supported " + str);
        return false;
    }

    /* renamed from: b */
    public Camera.Size mo158545b(List<Camera.Size> list, int i, float f) {
        Collections.sort(list, this.f113412a);
        Iterator<Camera.Size> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width > i && m177617a(next, f)) {
                C44796g.m177637c("MakeSure Picture :w = " + next.width + " h = " + next.height);
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            return m177615a(list, f);
        }
        return list.get(i2);
    }

    /* renamed from: a */
    public Camera.Size mo158542a(List<Camera.Size> list, int i, float f) {
        Collections.sort(list, this.f113412a);
        Iterator<Camera.Size> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            if (next.width > i && m177617a(next, f)) {
                C44796g.m177637c("MakeSure Preview :w = " + next.width + " h = " + next.height);
                break;
            }
            i2++;
        }
        if (i2 == list.size()) {
            return m177615a(list, f);
        }
        return list.get(i2);
    }
}
