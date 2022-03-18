package com.ss.android.vc.meeting.utils;

import com.ss.android.vc.irtc.StreamDescription;
import com.ss.android.vc.irtc.VcByteStream;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.utils.m */
public class C63503m {
    /* renamed from: a */
    public static int m248872a(VcByteStream vcByteStream, int i) {
        if (vcByteStream == null || vcByteStream.f152912f == null || vcByteStream.f152912f.size() < 2 || i == 0) {
            return 0;
        }
        int i2 = Integer.MAX_VALUE;
        List<StreamDescription> list = vcByteStream.f152912f;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < list.size(); i6++) {
            StreamDescription streamDescription = vcByteStream.f152912f.get(i6);
            int min = Math.min(streamDescription.f152900a, streamDescription.f152901b);
            if (min < i2) {
                i4 = i6;
                i2 = min;
            }
            if (min <= i && (i3 == -1 || min > i5)) {
                i3 = i6;
                i5 = min;
            }
        }
        if (i3 != -1) {
            return i3;
        }
        return i4;
    }
}
