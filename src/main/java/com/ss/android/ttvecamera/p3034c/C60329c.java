package com.ss.android.ttvecamera.p3034c;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Build;
import com.ss.android.ttvecamera.C60410n;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.c.c */
public class C60329c {

    /* renamed from: e */
    public static final List<String> f150759e;

    /* renamed from: a */
    protected final int f150760a = 90;

    /* renamed from: b */
    protected final float f150761b = 1.0f;

    /* renamed from: c */
    protected final float f150762c = 2.0f;

    /* renamed from: d */
    int f150763d;

    /* renamed from: f */
    private int f150764f;

    /* renamed from: g */
    private List<Camera.Area> f150765g;

    /* renamed from: h */
    private List<Camera.Area> f150766h;

    static {
        ArrayList arrayList = new ArrayList();
        f150759e = arrayList;
        arrayList.add("multilaser");
        arrayList.add("ms40");
    }

    public C60329c(int i) {
        this.f150764f = i;
        this.f150765g = new ArrayList();
        this.f150766h = new ArrayList();
    }

    /* renamed from: a */
    public boolean mo206618a(Camera.Parameters parameters) {
        if (parameters == null || f150759e.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo206617a(int i, Camera.Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo206619a(Camera.Parameters parameters, String str) {
        if (!mo206618a(parameters)) {
            return false;
        }
        return parameters.getSupportedFocusModes().contains(str);
    }

    /* renamed from: a */
    public String mo206615a(int i, Camera.Parameters parameters, boolean z) {
        if (parameters == null) {
            return "";
        }
        this.f150763d = i;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (i == 1) {
            if (z && supportedFocusModes.contains("continuous-video")) {
                return "continuous-video";
            }
            if (supportedFocusModes.contains("macro")) {
                return "macro";
            }
            if (!supportedFocusModes.contains("auto")) {
                return "";
            }
        } else if (supportedFocusModes.contains("continuous-video")) {
            return "continuous-video";
        } else {
            if (supportedFocusModes.contains("continuous-picture")) {
                return "continuous-picture";
            }
            if (!supportedFocusModes.contains("auto")) {
                return "";
            }
        }
        return "auto";
    }

    /* renamed from: a */
    public List<Camera.Area> mo206616a(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = mo206614a(i, i2, f, 90.0f, i3, i4, i5);
        if (this.f150765g.size() > 0) {
            this.f150765g.clear();
        }
        this.f150765g.add(new Camera.Area(a, 1000));
        return this.f150765g;
    }

    /* renamed from: b */
    public List<Camera.Area> mo206620b(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = mo206614a(i, i2, f, 180.0f, i3, i4, i5);
        if (this.f150766h.size() > 0) {
            this.f150766h.clear();
        }
        this.f150766h.add(new Camera.Area(a, 1000));
        return this.f150766h;
    }

    /* renamed from: a */
    public Rect mo206614a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
        int intValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) ((((float) (i3 * 2000)) * 1.0f) / ((float) i))) - 1000;
        int i7 = ((int) ((((float) (i4 * 2000)) * 1.0f) / ((float) i2))) - 1000;
        if (this.f150763d == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a = C60410n.m234775a(i6 - i8, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        int a2 = C60410n.m234775a(i7 - i8, (int) IByteRtcError.BRERR_INVALID_TOKEN, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) C60410n.m234774a(a + intValue), (float) C60410n.m234774a(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C60410n.m234784a(i5, new Rect(IByteRtcError.BRERR_INVALID_TOKEN, IByteRtcError.BRERR_INVALID_TOKEN, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = C60410n.m234774a(rect2.left);
        rect2.right = C60410n.m234774a(rect2.right);
        rect2.top = C60410n.m234774a(rect2.top);
        rect2.bottom = C60410n.m234774a(rect2.bottom);
        return rect2;
    }
}
