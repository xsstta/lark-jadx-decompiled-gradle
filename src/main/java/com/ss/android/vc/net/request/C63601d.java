package com.ss.android.vc.net.request;

import android.util.SparseArray;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.vc.net.request.d */
public final class C63601d {

    /* renamed from: a */
    private static SparseArray<Integer> f160597a;

    /* renamed from: a */
    public static SparseArray<Integer> m249418a() {
        return f160597a;
    }

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        f160597a = sparseArray;
        Integer valueOf = Integer.valueOf((int) R.string.View_G_CurrentlyInCall);
        sparseArray.put(220001, valueOf);
        f160597a.put(220002, Integer.valueOf((int) R.string.View_G_RecipientNeedsUpdate));
        f160597a.put(220003, Integer.valueOf((int) R.string.View_G_RecipientUnavailable));
        f160597a.put(220005, Integer.valueOf((int) R.string.View_G_UpdateToUse));
        f160597a.put(220006, Integer.valueOf((int) R.string.View_M_CannotStartMeetings));
        f160597a.put(220102, Integer.valueOf((int) R.string.View_M_NoVideoMeetingsToast));
        SparseArray<Integer> sparseArray2 = f160597a;
        Integer valueOf2 = Integer.valueOf((int) R.string.View_M_InvalidMeetingId);
        sparseArray2.put(220101, valueOf2);
        f160597a.put(220301, valueOf2);
        f160597a.put(220801, Integer.valueOf((int) R.string.View_M_CapacityReachedAndroid));
        f160597a.put(220004, Integer.valueOf((int) R.string.View_G_ServerError));
        f160597a.put(222301, valueOf);
        f160597a.put(222302, valueOf);
    }

    /* renamed from: a */
    public static boolean m249419a(int i) {
        if (f160597a.get(i) != null) {
            return true;
        }
        return false;
    }
}
