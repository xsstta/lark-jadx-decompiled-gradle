package com.bytedance.memory.p846b;

import android.util.Log;

/* renamed from: com.bytedance.memory.b.c */
public final class C20063c {

    /* renamed from: a */
    public static boolean f49008a;

    /* renamed from: b */
    private static volatile AbstractC20065b f49009b = new C20064a();

    /* renamed from: com.bytedance.memory.b.c$b */
    public interface AbstractC20065b {
        /* renamed from: a */
        void mo68036a(String str, Object... objArr);

        /* renamed from: a */
        void mo68037a(Throwable th, String str, Object... objArr);
    }

    /* renamed from: com.bytedance.memory.b.c$a */
    private static class C20064a implements AbstractC20065b {
        C20064a() {
        }

        @Override // com.bytedance.memory.p846b.C20063c.AbstractC20065b
        /* renamed from: a */
        public void mo68036a(String str, Object... objArr) {
            if (C20067e.f49011a || C20063c.f49008a) {
                String format = String.format(str, objArr);
                if (format.length() < 4000) {
                    Log.d("memory", format);
                    return;
                }
                for (String str2 : format.split("\n", -1)) {
                    Log.d("memory", str2);
                }
            }
        }

        @Override // com.bytedance.memory.p846b.C20063c.AbstractC20065b
        /* renamed from: a */
        public void mo68037a(Throwable th, String str, Object... objArr) {
            mo68036a(String.format(str, objArr) + '\n' + Log.getStackTraceString(th), new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m73220a(String str, Object... objArr) {
        AbstractC20065b bVar = f49009b;
        if (bVar != null) {
            bVar.mo68036a(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m73221a(Throwable th, String str, Object... objArr) {
        AbstractC20065b bVar = f49009b;
        if (bVar != null) {
            bVar.mo68037a(th, str, objArr);
        }
    }
}
