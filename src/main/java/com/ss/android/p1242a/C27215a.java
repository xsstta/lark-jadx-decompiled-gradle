package com.ss.android.p1242a;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.a.a */
public class C27215a {

    /* renamed from: a */
    public static final Map<String, C27217a> f67703a = new HashMap();

    /* renamed from: c */
    private static boolean f67704c = true;

    /* renamed from: b */
    public C27220c f67705b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.a.a$b */
    public class C27218b {

        /* renamed from: a */
        Runnable f67712a;

        /* renamed from: b */
        String[] f67713b;

        /* renamed from: c */
        volatile boolean f67714c;

        /* renamed from: a */
        public void mo97075a() {
            Runnable runnable;
            if (!this.f67714c && (runnable = this.f67712a) != null) {
                C27215a.this.mo97069a(runnable);
                this.f67714c = true;
            }
        }

        /* renamed from: a */
        public boolean mo97076a(String str) {
            String[] strArr = this.f67713b;
            for (String str2 : strArr) {
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public C27218b(Runnable runnable, String[] strArr) {
            this.f67712a = runnable;
            this.f67713b = strArr;
        }
    }

    /* renamed from: a */
    public static void m98918a(boolean z) {
        f67704c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.a.a$a */
    public static class C27217a {

        /* renamed from: a */
        final String[] f67708a;

        /* renamed from: b */
        int f67709b;

        /* renamed from: c */
        final List<C27218b> f67710c = new ArrayList();

        /* renamed from: d */
        final List<C27218b> f67711d = new ArrayList();

        /* renamed from: a */
        public void mo97073a(C27218b bVar) {
            synchronized (this.f67710c) {
                this.f67710c.add(bVar);
            }
        }

        /* renamed from: b */
        public void mo97074b(C27218b bVar) {
            synchronized (this.f67711d) {
                this.f67711d.add(bVar);
            }
        }

        public C27217a(String[] strArr) {
            this.f67708a = strArr;
        }
    }

    /* renamed from: a */
    public static boolean m98919a(String[] strArr) {
        if (!f67704c) {
            return true;
        }
        synchronized (f67703a) {
            for (String str : strArr) {
                Map<String, C27217a> map = f67703a;
                if (!map.containsKey(str)) {
                    return false;
                }
                if (map.get(str).f67709b != 2) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m98920b(String[] strArr) {
        if (!f67704c) {
            return false;
        }
        synchronized (f67703a) {
            for (String str : strArr) {
                Map<String, C27217a> map = f67703a;
                if (!map.containsKey(str)) {
                    return true;
                }
                if (map.get(str).f67709b == 3) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo97069a(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                C27220c cVar = this.f67705b;
                cVar.mo97083b("sodecompress", "execute runnable exception " + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m98917a(String str, String[] strArr) {
        if (f67704c) {
            f67703a.put(str, new C27217a(strArr));
        }
    }

    /* renamed from: a */
    public void mo97070a(String str, boolean z) {
        C27217a aVar;
        Map<String, C27217a> map = f67703a;
        synchronized (map) {
            if (map.containsKey(str)) {
                aVar = map.get(str);
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            if (z) {
                synchronized (aVar.f67710c) {
                    for (C27218b bVar : aVar.f67710c) {
                        if (bVar.mo97076a(str) && m98919a(bVar.f67713b)) {
                            bVar.mo97075a();
                        }
                    }
                }
                return;
            }
            synchronized (aVar.f67711d) {
                for (C27218b bVar2 : aVar.f67711d) {
                    if (bVar2.mo97076a(str)) {
                        bVar2.mo97075a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo97068a(Context context, String[] strArr, boolean z) {
        if (f67704c) {
            for (String str : strArr) {
                mo97067a(context, str, z);
            }
        }
    }

    /* renamed from: a */
    public void mo97067a(Context context, final String str, boolean z) {
        if (f67704c) {
            if (context == null || TextUtils.isEmpty(str)) {
                this.f67705b.mo97083b("sodecompress", "context or soGroup is null");
                return;
            }
            Map<String, C27217a> map = f67703a;
            synchronized (map) {
                if (!map.containsKey(str)) {
                    C27220c cVar = this.f67705b;
                    cVar.mo97083b("sodecompress", "so load info map not contain group : " + str);
                    return;
                }
                C27217a aVar = map.get(str);
                if (aVar.f67709b != 1) {
                    if (aVar.f67709b != 2) {
                        if (aVar.f67708a != null) {
                            if (aVar.f67708a.length != 0) {
                                aVar.f67709b = 1;
                                this.f67705b.mo97081a(!z, aVar.f67708a, new AbstractC27219b() {
                                    /* class com.ss.android.p1242a.C27215a.C272161 */

                                    @Override // com.ss.android.p1242a.AbstractC27219b
                                    /* renamed from: a */
                                    public void mo97072a(boolean z) {
                                        int i;
                                        String str;
                                        synchronized (C27215a.f67703a) {
                                            C27217a aVar = C27215a.f67703a.get(str);
                                            if (z) {
                                                i = 2;
                                            } else {
                                                i = 3;
                                            }
                                            aVar.f67709b = i;
                                        }
                                        C27220c cVar = C27215a.this.f67705b;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("decompress ");
                                        sb.append(str);
                                        if (z) {
                                            str = " success ";
                                        } else {
                                            str = " failed ";
                                        }
                                        sb.append(str);
                                        cVar.mo97083b("sodecompress", sb.toString());
                                        C27215a.this.mo97070a(str, z);
                                    }
                                });
                                return;
                            }
                        }
                        C27220c cVar2 = this.f67705b;
                        cVar2.mo97083b("sodecompress", "decompress task " + str + "'s source is empty ");
                        return;
                    }
                }
                C27220c cVar3 = this.f67705b;
                cVar3.mo97083b("sodecompress", "decompress task " + str + " has already finished ");
            }
        }
    }

    /* renamed from: a */
    public void mo97071a(String[] strArr, Runnable runnable, Runnable runnable2) {
        if (!f67704c) {
            mo97069a(runnable);
        } else if (m98919a(strArr)) {
            mo97069a(runnable);
        } else if (m98920b(strArr)) {
            mo97069a(runnable2);
        } else {
            C27218b bVar = new C27218b(runnable, strArr);
            C27218b bVar2 = new C27218b(runnable2, strArr);
            for (String str : strArr) {
                Map<String, C27217a> map = f67703a;
                synchronized (map) {
                    if (!map.containsKey(str)) {
                        mo97069a(runnable2);
                    } else {
                        C27217a aVar = map.get(str);
                        aVar.mo97073a(bVar);
                        aVar.mo97074b(bVar2);
                    }
                }
            }
        }
    }

    public C27215a(Context context, String str, boolean z, AbstractC27227h hVar, AbstractC27222d dVar) {
        if (f67704c) {
            this.f67705b = new C27220c(context, str, z, hVar, dVar);
        }
    }
}
