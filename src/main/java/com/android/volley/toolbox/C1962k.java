package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import com.android.volley.C1934i;
import com.android.volley.C1936j;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.android.volley.toolbox.k */
public class C1962k {

    /* renamed from: a */
    public final HashMap<String, C1966a> f6667a;

    /* renamed from: b */
    public final HashMap<String, C1966a> f6668b;

    /* renamed from: c */
    public Runnable f6669c;

    /* renamed from: d */
    private final C1934i f6670d;

    /* renamed from: e */
    private int f6671e;

    /* renamed from: f */
    private final AbstractC1967b f6672f;

    /* renamed from: g */
    private final Handler f6673g;

    /* renamed from: com.android.volley.toolbox.k$b */
    public interface AbstractC1967b {
        /* renamed from: a */
        Bitmap mo9862a(String str);

        /* renamed from: a */
        void mo9863a(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.volley.toolbox.k$d */
    public interface AbstractC1969d extends C1936j.AbstractC1937a {
        /* renamed from: a */
        void mo9826a(C1968c cVar, boolean z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.android.volley.toolbox.k$a */
    public static class C1966a {

        /* renamed from: a */
        public Bitmap f6679a;

        /* renamed from: b */
        public final List<C1968c> f6680b;

        /* renamed from: c */
        private final Request<?> f6681c;

        /* renamed from: d */
        private VolleyError f6682d;

        /* renamed from: a */
        public VolleyError mo9858a() {
            return this.f6682d;
        }

        /* renamed from: a */
        public void mo9859a(VolleyError volleyError) {
            this.f6682d = volleyError;
        }

        /* renamed from: a */
        public void mo9860a(C1968c cVar) {
            this.f6680b.add(cVar);
        }

        /* renamed from: b */
        public boolean mo9861b(C1968c cVar) {
            this.f6680b.remove(cVar);
            if (this.f6680b.size() != 0) {
                return false;
            }
            this.f6681c.cancel();
            return true;
        }

        public C1966a(Request<?> request, C1968c cVar) {
            ArrayList arrayList = new ArrayList();
            this.f6680b = arrayList;
            this.f6681c = request;
            arrayList.add(cVar);
        }
    }

    /* renamed from: com.android.volley.toolbox.k$c */
    public class C1968c {

        /* renamed from: a */
        public Bitmap f6683a;

        /* renamed from: b */
        public final AbstractC1969d f6684b;

        /* renamed from: d */
        private final String f6686d;

        /* renamed from: e */
        private final String f6687e;

        /* renamed from: b */
        public Bitmap mo9865b() {
            return this.f6683a;
        }

        /* renamed from: c */
        public String mo9866c() {
            return this.f6687e;
        }

        /* renamed from: a */
        public void mo9864a() {
            C1974p.m8698a();
            if (this.f6684b != null) {
                C1966a aVar = C1962k.this.f6667a.get(this.f6686d);
                if (aVar == null) {
                    C1966a aVar2 = C1962k.this.f6668b.get(this.f6686d);
                    if (aVar2 != null) {
                        aVar2.mo9861b(this);
                        if (aVar2.f6680b.size() == 0) {
                            C1962k.this.f6668b.remove(this.f6686d);
                        }
                    }
                } else if (aVar.mo9861b(this)) {
                    C1962k.this.f6667a.remove(this.f6686d);
                }
            }
        }

        public C1968c(Bitmap bitmap, String str, String str2, AbstractC1969d dVar) {
            this.f6683a = bitmap;
            this.f6687e = str;
            this.f6686d = str2;
            this.f6684b = dVar;
        }
    }

    /* renamed from: a */
    private void m8681a(String str, C1966a aVar) {
        this.f6668b.put(str, aVar);
        if (this.f6669c == null) {
            RunnableC19653 r3 = new Runnable() {
                /* class com.android.volley.toolbox.C1962k.RunnableC19653 */

                public void run() {
                    for (C1966a aVar : C1962k.this.f6668b.values()) {
                        for (C1968c cVar : aVar.f6680b) {
                            if (cVar.f6684b != null) {
                                if (aVar.mo9858a() == null) {
                                    cVar.f6683a = aVar.f6679a;
                                    cVar.f6684b.mo9826a(cVar, false);
                                } else {
                                    cVar.f6684b.onErrorResponse(aVar.mo9858a());
                                }
                            }
                        }
                    }
                    C1962k.this.f6668b.clear();
                    C1962k.this.f6669c = null;
                }
            };
            this.f6669c = r3;
            this.f6673g.postDelayed(r3, (long) this.f6671e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9854a(String str, Bitmap bitmap) {
        this.f6672f.mo9863a(str, bitmap);
        C1966a remove = this.f6667a.remove(str);
        if (remove != null) {
            remove.f6679a = bitmap;
            m8681a(str, remove);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9855a(String str, VolleyError volleyError) {
        C1966a remove = this.f6667a.remove(str);
        if (remove != null) {
            remove.mo9859a(volleyError);
            m8681a(str, remove);
        }
    }

    /* renamed from: a */
    private static String m8680a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request<Bitmap> mo9852a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new C1970l(str, new C1936j.AbstractC1938b<Bitmap>() {
            /* class com.android.volley.toolbox.C1962k.C19631 */

            /* renamed from: a */
            public void onResponse(Bitmap bitmap) {
                C1962k.this.mo9854a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new C1936j.AbstractC1937a() {
            /* class com.android.volley.toolbox.C1962k.C19642 */

            @Override // com.android.volley.C1936j.AbstractC1937a
            public void onErrorResponse(VolleyError volleyError) {
                C1962k.this.mo9855a(str2, volleyError);
            }
        });
    }

    /* renamed from: a */
    public C1968c mo9853a(String str, AbstractC1969d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        C1974p.m8698a();
        String a = m8680a(str, i, i2, scaleType);
        Bitmap a2 = this.f6672f.mo9862a(a);
        if (a2 != null) {
            C1968c cVar = new C1968c(a2, str, null, null);
            dVar.mo9826a(cVar, true);
            return cVar;
        }
        C1968c cVar2 = new C1968c(null, str, a, dVar);
        dVar.mo9826a(cVar2, true);
        C1966a aVar = this.f6667a.get(a);
        if (aVar != null) {
            aVar.mo9860a(cVar2);
            return cVar2;
        }
        Request<Bitmap> a3 = mo9852a(str, i, i2, scaleType, a);
        this.f6670d.mo9808a(a3);
        this.f6667a.put(a, new C1966a(a3, cVar2));
        return cVar2;
    }
}
