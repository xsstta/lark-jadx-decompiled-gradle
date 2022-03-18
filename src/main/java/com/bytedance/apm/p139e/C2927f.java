package com.bytedance.apm.p139e;

import android.util.Log;

/* renamed from: com.bytedance.apm.e.f */
public class C2927f {

    /* renamed from: a */
    public static AbstractC2929a f9439a = new AbstractC2929a() {
        /* class com.bytedance.apm.p139e.C2927f.C29281 */

        @Override // com.bytedance.apm.p139e.C2927f.AbstractC2929a
        /* renamed from: a */
        public void mo12633a(String str, String str2, Object... objArr) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(str2, objArr);
            }
            Log.i(str, str2);
        }

        @Override // com.bytedance.apm.p139e.C2927f.AbstractC2929a
        /* renamed from: b */
        public void mo12634b(String str, String str2, Object... objArr) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(str2, objArr);
            }
            Log.w(str, str2);
        }

        @Override // com.bytedance.apm.p139e.C2927f.AbstractC2929a
        /* renamed from: c */
        public void mo12635c(String str, String str2, Object... objArr) {
            if (!(objArr == null || objArr.length == 0)) {
                str2 = String.format(str2, objArr);
            }
            Log.e(str, str2);
        }
    };

    /* renamed from: com.bytedance.apm.e.f$a */
    public interface AbstractC2929a {
        /* renamed from: a */
        void mo12633a(String str, String str2, Object... objArr);

        /* renamed from: b */
        void mo12634b(String str, String str2, Object... objArr);

        /* renamed from: c */
        void mo12635c(String str, String str2, Object... objArr);
    }
}
