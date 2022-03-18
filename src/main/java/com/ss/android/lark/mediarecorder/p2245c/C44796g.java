package com.ss.android.lark.mediarecorder.p2245c;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.mediarecorder.c.g */
public class C44796g {

    /* renamed from: a */
    private static volatile AbstractC44798a f113417a = new AbstractC44798a() {
        /* class com.ss.android.lark.mediarecorder.p2245c.C44796g.C447971 */

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: a */
        public void mo158369a(String str, String str2) {
            Log.m165379d(str, str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: b */
        public void mo158370b(String str, String str2) {
            Log.m165389i(str, str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: c */
        public void mo158371c(String str, String str2) {
            Log.m165397w(str, str2);
        }

        @Override // com.ss.android.lark.mediarecorder.p2245c.C44796g.AbstractC44798a
        /* renamed from: d */
        public void mo158372d(String str, String str2) {
            Log.m165383e(str, str2);
        }
    };

    /* renamed from: com.ss.android.lark.mediarecorder.c.g$a */
    public interface AbstractC44798a {
        /* renamed from: a */
        void mo158369a(String str, String str2);

        /* renamed from: b */
        void mo158370b(String str, String str2);

        /* renamed from: c */
        void mo158371c(String str, String str2);

        /* renamed from: d */
        void mo158372d(String str, String str2);
    }

    /* renamed from: a */
    public static void m177634a(AbstractC44798a aVar) {
        f113417a = aVar;
    }

    /* renamed from: a */
    public static void m177635a(String str) {
        if (f113417a != null) {
            f113417a.mo158372d("MediaRecorderLog", str);
        }
    }

    /* renamed from: b */
    public static void m177636b(String str) {
        if (f113417a != null) {
            f113417a.mo158371c("MediaRecorderLog", str);
        }
    }

    /* renamed from: c */
    public static void m177637c(String str) {
        if (f113417a != null) {
            f113417a.mo158370b("MediaRecorderLog", str);
        }
    }

    /* renamed from: d */
    public static void m177638d(String str) {
        if (f113417a != null) {
            f113417a.mo158369a("MediaRecorderLog", str);
        }
    }
}
