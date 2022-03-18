package com.ss.android.photoeditor.base;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.photoeditor.base.k */
public class C59641k {

    /* renamed from: a */
    private static volatile AbstractC59643a f148024a = new AbstractC59643a() {
        /* class com.ss.android.photoeditor.base.C59641k.C596421 */

        @Override // com.ss.android.photoeditor.base.C59641k.AbstractC59643a
        /* renamed from: a */
        public void mo177144a(String str, String str2) {
            Log.m165389i(str, str2);
        }

        @Override // com.ss.android.photoeditor.base.C59641k.AbstractC59643a
        /* renamed from: b */
        public void mo177145b(String str, String str2) {
            Log.m165383e(str, str2);
        }
    };

    /* renamed from: com.ss.android.photoeditor.base.k$a */
    public interface AbstractC59643a {
        /* renamed from: a */
        void mo177144a(String str, String str2);

        /* renamed from: b */
        void mo177145b(String str, String str2);
    }

    /* renamed from: a */
    public static void m231333a(AbstractC59643a aVar) {
        f148024a = aVar;
    }

    /* renamed from: a */
    public static void m231334a(String str, String str2) {
        f148024a.mo177144a(str, str2);
    }

    /* renamed from: b */
    public static void m231335b(String str, String str2) {
        f148024a.mo177145b(str, str2);
    }
}
