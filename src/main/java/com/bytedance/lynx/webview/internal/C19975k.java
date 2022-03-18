package com.bytedance.lynx.webview.internal;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.lynx.webview.internal.k */
public class C19975k {

    /* renamed from: a */
    private static final Object f48805a = new Object();

    /* renamed from: b */
    private static AbstractC19978l f48806b;

    /* renamed from: c */
    private static AbstractC19978l f48807c;

    /* renamed from: d */
    private static volatile Map<Integer, Vector<String>> f48808d = new ConcurrentHashMap();

    /* renamed from: e */
    private static AtomicBoolean f48809e = new AtomicBoolean(false);

    /* renamed from: f */
    private static AtomicBoolean f48810f = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.lynx.webview.internal.k$a */
    public static class C19977a implements AbstractC19978l {
        private C19977a() {
        }

        @Override // com.bytedance.lynx.webview.internal.AbstractC19978l
        /* renamed from: a */
        public void mo67804a(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // com.bytedance.lynx.webview.internal.AbstractC19978l
        /* renamed from: b */
        public void mo67805b(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // com.bytedance.lynx.webview.internal.AbstractC19978l
        /* renamed from: c */
        public void mo67806c(String str, String str2) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m72855a() {
        synchronized (C19975k.class) {
            if (f48809e.get()) {
                Log.e("LYNX_TT_WEBVIEW_NOALOG", "enableLogOutput can't be called more than once!");
                return;
            }
            if (C19986s.m72924a().mo67856a("sdk_enable_normal_write")) {
                f48807c = new C19977a();
            }
            if (!C19986s.m72924a().mo67858a("sdk_enable_alog_write", true)) {
                f48806b = null;
            }
            if (f48809e.compareAndSet(false, true)) {
                Log.i("LYNX_TT_WEBVIEW_NOALOG", "enable log output!!!");
            }
        }
    }

    /* renamed from: b */
    private static boolean m72860b() {
        if (!f48809e.get()) {
            return false;
        }
        synchronized (f48805a) {
            if (f48808d.size() > 0 && !(f48807c == null && f48806b == null)) {
                Iterator<Map.Entry<Integer, Vector<String>>> it = f48808d.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry<Integer, Vector<String>> next = it.next();
                    Iterator<String> it2 = next.getValue().iterator();
                    if (it2.hasNext()) {
                        m72856a(next.getKey().intValue(), it2.next());
                        it2.remove();
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m72857a(String str, String str2) {
        if (m72860b()) {
            AbstractC19978l lVar = f48806b;
            if (lVar != null) {
                lVar.mo67804a("LYNX_TT_WEBVIEW", str2);
                return;
            }
            return;
        }
        m72858b(1, str2);
    }

    /* renamed from: b */
    public static void m72859b(String str, String str2) {
        if (m72860b()) {
            AbstractC19978l lVar = f48806b;
            if (lVar != null) {
                lVar.mo67804a("LYNX_TT_WEBVIEW", str2);
            }
            AbstractC19978l lVar2 = f48807c;
            if (lVar2 != null) {
                lVar2.mo67804a("LYNX_TT_WEBVIEW_NOALOG", str2);
                return;
            }
            return;
        }
        m72858b(4, str2);
    }

    /* renamed from: c */
    public static void m72861c(String str, String str2) {
        if (m72860b()) {
            AbstractC19978l lVar = f48806b;
            if (lVar != null) {
                lVar.mo67805b("LYNX_TT_WEBVIEW", str2);
            }
            AbstractC19978l lVar2 = f48807c;
            if (lVar2 != null) {
                lVar2.mo67805b("LYNX_TT_WEBVIEW_NOALOG", str2);
                return;
            }
            return;
        }
        m72858b(3, str2);
    }

    /* renamed from: d */
    public static void m72862d(String str, String str2) {
        if (m72860b()) {
            AbstractC19978l lVar = f48807c;
            if (lVar != null) {
                lVar.mo67806c("LYNX_TT_WEBVIEW_NOALOG", str2);
                return;
            }
            return;
        }
        m72858b(2, str2);
    }

    /* renamed from: b */
    private static void m72858b(int i, String str) {
        synchronized (f48805a) {
            if (!f48810f.get()) {
                Vector<String> vector = f48808d.get(Integer.valueOf(i));
                if (vector == null) {
                    vector = new Vector<>();
                }
                vector.add(str);
                f48808d.put(Integer.valueOf(i), vector);
                if (vector.size() >= 200) {
                    f48810f.compareAndSet(false, true);
                    f48808d.clear();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m72856a(int i, String str) {
        if (i == 1) {
            AbstractC19978l lVar = f48806b;
            if (lVar != null) {
                lVar.mo67804a("LYNX_TT_WEBVIEW_BACKEND", str);
            }
        } else if (i == 2) {
            AbstractC19978l lVar2 = f48806b;
            if (lVar2 != null) {
                lVar2.mo67806c("LYNX_TT_WEBVIEW_BACKEND", str);
            }
            AbstractC19978l lVar3 = f48807c;
            if (lVar3 != null) {
                lVar3.mo67806c("LYNX_TT_WEBVIEW_NOALOG_BACKEND", str);
            }
        } else if (i == 3) {
            AbstractC19978l lVar4 = f48806b;
            if (lVar4 != null) {
                lVar4.mo67805b("LYNX_TT_WEBVIEW_BACKEND", str);
            }
            AbstractC19978l lVar5 = f48807c;
            if (lVar5 != null) {
                lVar5.mo67805b("LYNX_TT_WEBVIEW_NOALOG_BACKEND", str);
            }
        } else if (i != 4) {
            Log.e("LYNX_TT_WEBVIEW_NOALOG_BACKEND", str);
        } else {
            AbstractC19978l lVar6 = f48806b;
            if (lVar6 != null) {
                lVar6.mo67804a("LYNX_TT_WEBVIEW_BACKEND", str);
            }
            AbstractC19978l lVar7 = f48807c;
            if (lVar7 != null) {
                lVar7.mo67804a("LYNX_TT_WEBVIEW_NOALOG_BACKEND", str);
            }
        }
    }
}
