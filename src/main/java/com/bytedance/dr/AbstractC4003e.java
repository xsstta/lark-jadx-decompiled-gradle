package com.bytedance.dr;

import android.util.Log;

/* renamed from: com.bytedance.dr.e */
interface AbstractC4003e {
    /* renamed from: a */
    void mo15735a(String str, String str2, Throwable th);

    /* renamed from: b */
    void mo15736b(String str, String str2, Throwable th);

    /* renamed from: com.bytedance.dr.e$a */
    public static class C4004a implements AbstractC4003e {
        @Override // com.bytedance.dr.AbstractC4003e
        /* renamed from: a */
        public void mo15735a(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        @Override // com.bytedance.dr.AbstractC4003e
        /* renamed from: b */
        public void mo15736b(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }
    }
}
