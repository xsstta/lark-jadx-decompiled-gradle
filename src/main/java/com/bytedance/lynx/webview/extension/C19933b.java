package com.bytedance.lynx.webview.extension;

import java.util.Set;

/* renamed from: com.bytedance.lynx.webview.extension.b */
public class C19933b {

    /* renamed from: a */
    private static AbstractC19934a f48701a;

    /* renamed from: com.bytedance.lynx.webview.extension.b$a */
    public interface AbstractC19934a {
        /* renamed from: a */
        void mo67588a(String str, long j, long j2, long j3, Set<String> set);
    }

    /* renamed from: a */
    public static void m72695a(String str, long j, long j2, long j3, Set<String> set) {
        AbstractC19934a aVar = f48701a;
        if (aVar != null) {
            aVar.mo67588a(str, j, j2, j3, set);
        }
    }
}
