package com.ss.android.vc.meeting.p3104c;

import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.vc.meeting.c.e */
public class C61261e {
    /* renamed from: b */
    public static void m238322b(RectF rectF) {
        if (rectF != null) {
            rectF.left = BitmapDescriptorFactory.HUE_RED;
            rectF.right = BitmapDescriptorFactory.HUE_RED;
            rectF.top = BitmapDescriptorFactory.HUE_RED;
            rectF.bottom = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* renamed from: a */
    public static boolean m238321a(RectF rectF) {
        if (rectF != null && !Float.isNaN(rectF.bottom) && !Float.isNaN(rectF.left) && !Float.isNaN(rectF.top) && !Float.isNaN(rectF.right) && C61260d.m238319b(rectF.right, rectF.left) && C61260d.m238319b(rectF.bottom, rectF.top)) {
            return true;
        }
        return false;
    }
}
