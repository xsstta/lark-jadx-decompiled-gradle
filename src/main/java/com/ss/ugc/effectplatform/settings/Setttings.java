package com.ss.ugc.effectplatform.settings;

/* renamed from: com.ss.ugc.effectplatform.g.c */
public interface Setttings {
    /* renamed from: a */
    void mo227813a(String str, String str2);

    /* renamed from: b */
    String mo227814b(String str, String str2);

    /* renamed from: com.ss.ugc.effectplatform.g.c$a */
    public static final class C65511a {
        /* renamed from: a */
        public static /* synthetic */ String m256855a(Setttings cVar, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "";
                }
                return cVar.mo227814b(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
    }
}
