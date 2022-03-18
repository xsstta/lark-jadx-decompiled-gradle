package com.lynx.tasm.fontface;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.core.C26880a;
import com.lynx.tasm.fontface.FontFace;
import com.lynx.tasm.p1220b.C26603c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.fontface.b */
public class C26890b {

    /* renamed from: a */
    private Map<String, C26902c> f66757a = new HashMap();

    /* renamed from: b */
    private List<C26889a> f66758b = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.fontface.b$a */
    public static class C26901a {

        /* renamed from: a */
        static final C26890b f66793a = new C26890b();
    }

    /* renamed from: a */
    public static C26890b m97746a() {
        return C26901a.f66793a;
    }

    /* renamed from: a */
    private synchronized C26902c m97747a(FontFace fontFace) {
        Iterator<Pair<FontFace.TYPE, String>> it = fontFace.mo95689b().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Pair<FontFace.TYPE, String> next = it.next();
        return this.f66757a.get(((FontFace.TYPE) next.first).name() + ((String) next.second));
    }

    /* renamed from: a */
    private synchronized void m97749a(FontFace fontFace, C26902c cVar) {
        for (Pair<FontFace.TYPE, String> pair : fontFace.mo95689b()) {
            this.f66757a.put(((FontFace.TYPE) pair.first).name() + ((String) pair.second), cVar);
        }
    }

    /* renamed from: a */
    private void m97748a(AbstractC26684l lVar, final C26889a aVar, Iterator<Pair<FontFace.TYPE, String>> it, final Handler handler) {
        if (it.hasNext()) {
            Pair<FontFace.TYPE, String> next = it.next();
            Typeface c = C26603c.m96407a().mo94487c(lVar, (FontFace.TYPE) next.first, (String) next.second);
            if (c == null) {
                m97748a(lVar, aVar, it, handler);
                return;
            }
            final C26902c cVar = new C26902c(c);
            synchronized (this) {
                for (FontFace fontFace : aVar.mo95692a()) {
                    fontFace.mo95686a(cVar);
                    m97749a(fontFace, cVar);
                }
                this.f66758b.remove(aVar);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                for (Pair<C26734o.AbstractC26736b, Integer> pair : aVar.mo95695b()) {
                    cVar.mo95709a(((Integer) pair.second).intValue());
                }
            }
            handler.post(new Runnable() {
                /* class com.lynx.tasm.fontface.C26890b.RunnableC268985 */

                public void run() {
                    Iterator<Pair<C26734o.AbstractC26736b, Integer>> it = aVar.mo95695b().iterator();
                    while (it.hasNext()) {
                        final Pair<C26734o.AbstractC26736b, Integer> next = it.next();
                        it.remove();
                        if (next.first != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                LLog.m96425c(LynxKitALogDelegate.f38587a, "load font success");
                                ((C26734o.AbstractC26736b) next.first).mo94878a(cVar.mo95709a(((Integer) next.second).intValue()), ((Integer) next.second).intValue());
                            } else {
                                new Handler(Looper.getMainLooper()).post(new Runnable() {
                                    /* class com.lynx.tasm.fontface.C26890b.RunnableC268985.RunnableC268991 */

                                    public void run() {
                                        final Typeface a = cVar.mo95709a(((Integer) next.second).intValue());
                                        handler.post(new Runnable() {
                                            /* class com.lynx.tasm.fontface.C26890b.RunnableC268985.RunnableC268991.RunnableC269001 */

                                            public void run() {
                                                LLog.m96425c(LynxKitALogDelegate.f38587a, "load font success");
                                                ((C26734o.AbstractC26736b) next.first).mo94878a(a, ((Integer) next.second).intValue());
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public Typeface mo95697a(final AbstractC26684l lVar, final String str, final int i, final C26734o.AbstractC26736b bVar) {
        final FontFace e = lVar.mo94681e(str);
        if (e == null) {
            return null;
        }
        final C26902c a = e.mo95685a();
        final Handler handler = new Handler(Looper.myLooper());
        if (a != null) {
            if (bVar != null) {
                handler.post(new Runnable() {
                    /* class com.lynx.tasm.fontface.C26890b.RunnableC268911 */

                    public void run() {
                        LLog.m96425c(LynxKitALogDelegate.f38587a, "load font success " + str + i);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bVar.mo94878a(a.mo95709a(i), i);
                        } else if (Looper.getMainLooper() == Looper.myLooper()) {
                            bVar.mo94878a(a.mo95709a(i), i);
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                /* class com.lynx.tasm.fontface.C26890b.RunnableC268911.RunnableC268921 */

                                public void run() {
                                    final Typeface a = a.mo95709a(i);
                                    handler.post(new Runnable() {
                                        /* class com.lynx.tasm.fontface.C26890b.RunnableC268911.RunnableC268921.RunnableC268931 */

                                        public void run() {
                                            bVar.mo94878a(a, i);
                                        }
                                    });
                                }
                            });
                        }
                    }
                });
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return a.mo95709a(i);
            }
            return a.mo95709a(0);
        }
        C26880a.m97713a().execute(new Runnable() {
            /* class com.lynx.tasm.fontface.C26890b.RunnableC268942 */

            public void run() {
                C26890b.this.mo95698a(lVar, e, i, bVar, handler);
            }
        });
        return null;
    }

    /* renamed from: a */
    public void mo95698a(AbstractC26684l lVar, FontFace fontFace, final int i, final C26734o.AbstractC26736b bVar, final Handler handler) {
        synchronized (this) {
            final C26902c a = m97747a(fontFace);
            if (a != null) {
                fontFace.mo95686a(a);
                m97749a(fontFace, a);
                if (Build.VERSION.SDK_INT >= 28) {
                    final Typeface a2 = a.mo95709a(i);
                    if (bVar != null) {
                        handler.post(new Runnable() {
                            /* class com.lynx.tasm.fontface.C26890b.RunnableC268953 */

                            public void run() {
                                LLog.m96425c(LynxKitALogDelegate.f38587a, "load font success");
                                bVar.mo94878a(a2, i);
                            }
                        });
                    } else {
                        return;
                    }
                } else if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.lynx.tasm.fontface.C26890b.RunnableC268964 */

                        public void run() {
                            final Typeface a = a.mo95709a(i);
                            handler.post(new Runnable() {
                                /* class com.lynx.tasm.fontface.C26890b.RunnableC268964.RunnableC268971 */

                                public void run() {
                                    LLog.m96425c(LynxKitALogDelegate.f38587a, "load font success");
                                    bVar.mo94878a(a, i);
                                }
                            });
                        }
                    });
                } else {
                    return;
                }
                return;
            }
            for (C26889a aVar : this.f66758b) {
                if (aVar.mo95696b(fontFace)) {
                    aVar.mo95694a(fontFace);
                    aVar.mo95693a(new Pair<>(bVar, Integer.valueOf(i)));
                    return;
                }
            }
            C26889a aVar2 = new C26889a();
            aVar2.mo95693a(new Pair<>(bVar, Integer.valueOf(i)));
            aVar2.mo95694a(fontFace);
            this.f66758b.add(aVar2);
            m97748a(lVar, aVar2, fontFace.mo95689b().iterator(), handler);
        }
    }
}
