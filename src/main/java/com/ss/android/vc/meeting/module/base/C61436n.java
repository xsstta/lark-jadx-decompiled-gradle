package com.ss.android.vc.meeting.module.base;

import android.content.Context;

/* renamed from: com.ss.android.vc.meeting.module.base.n */
public final class C61436n {
    /* renamed from: a */
    public static synchronized AbstractC61430j m239798a(Context context) {
        synchronized (C61436n.class) {
            if (context != null) {
                if (context instanceof AbstractC61430j) {
                    return (AbstractC61430j) context;
                }
            }
            return null;
        }
    }
}
