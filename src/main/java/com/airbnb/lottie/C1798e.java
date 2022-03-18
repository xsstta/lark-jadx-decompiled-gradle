package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.model.C1849f;
import com.airbnb.lottie.network.C1867b;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.parser.C1903t;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.C69705k;

/* renamed from: com.airbnb.lottie.e */
public class C1798e {

    /* renamed from: a */
    public static final Map<String, C1812l<C1792d>> f6173a = new HashMap();

    /* renamed from: a */
    private static boolean m8073a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: a */
    public static C1812l<C1792d> m8071a(final InputStream inputStream, final String str) {
        return m8072a(str, new Callable<C1811k<C1792d>>() {
            /* class com.airbnb.lottie.C1798e.CallableC18046 */

            /* renamed from: a */
            public C1811k<C1792d> call() {
                return C1798e.m8076b(inputStream, str);
            }
        });
    }

    /* renamed from: a */
    private static C1812l<C1792d> m8072a(final String str, Callable<C1811k<C1792d>> callable) {
        final C1792d a = str == null ? null : C1849f.m8289a().mo9262a(str);
        if (a != null) {
            return new C1812l<>(new Callable<C1811k<C1792d>>() {
                /* class com.airbnb.lottie.C1798e.CallableC18057 */

                /* renamed from: a */
                public C1811k<C1792d> call() {
                    return new C1811k<>(C1792d.this);
                }
            });
        }
        if (str != null) {
            Map<String, C1812l<C1792d>> map = f6173a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C1812l<C1792d> lVar = new C1812l<>(callable);
        if (str != null) {
            lVar.mo9114a(new AbstractC1807g<C1792d>() {
                /* class com.airbnb.lottie.C1798e.C18002 */

                /* renamed from: a */
                public void mo8835a(C1792d dVar) {
                    C1798e.f6173a.remove(str);
                }
            });
            lVar.mo9119c(new AbstractC1807g<Throwable>() {
                /* class com.airbnb.lottie.C1798e.C18013 */

                /* renamed from: a */
                public void mo8835a(Throwable th) {
                    C1798e.f6173a.remove(str);
                }
            });
            f6173a.put(str, lVar);
        }
        return lVar;
    }

    /* renamed from: a */
    public static C1811k<C1792d> m8063a(JsonReader jsonReader, String str) {
        return m8064a(jsonReader, str, true);
    }

    /* renamed from: b */
    public static C1811k<C1792d> m8076b(InputStream inputStream, String str) {
        return m8065a(inputStream, str, true);
    }

    /* renamed from: a */
    public static C1811k<C1792d> m8066a(ZipInputStream zipInputStream, String str) {
        try {
            return m8077b(zipInputStream, str);
        } finally {
            C1791h.m8021a(zipInputStream);
        }
    }

    /* renamed from: b */
    public static C1811k<C1792d> m8074b(Context context, int i) {
        return m8075b(context, i, m8081c(context, i));
    }

    /* renamed from: c */
    private static String m8081c(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if (m8073a(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    private static C1806f m8062a(C1792d dVar, String str) {
        for (C1806f fVar : dVar.mo9070l().values()) {
            if (fVar.mo9107d().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1812l<C1792d> m8078b(Context context, String str) {
        return m8079b(context, str, "asset_" + str);
    }

    /* renamed from: a */
    public static C1812l<C1792d> m8067a(Context context, int i) {
        return m8068a(context, i, m8081c(context, i));
    }

    /* renamed from: b */
    private static C1811k<C1792d> m8077b(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1792d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = m8064a(JsonReader.m8455a(C69705k.m267590a(C69705k.m267596a(zipInputStream))), (String) null, false).mo9110a();
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new C1811k<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C1806f a = m8062a(dVar, (String) entry.getKey());
                if (a != null) {
                    a.mo9104a(C1791h.m8015a((Bitmap) entry.getValue(), a.mo9103a(), a.mo9105b()));
                }
            }
            for (Map.Entry<String, C1806f> entry2 : dVar.mo9070l().entrySet()) {
                if (entry2.getValue().mo9108e() == null) {
                    return new C1811k<>(new IllegalStateException("There is no image for " + entry2.getValue().mo9107d()));
                }
            }
            if (str != null) {
                C1849f.m8289a().mo9263a(str, dVar);
            }
            return new C1811k<>(dVar);
        } catch (IOException e) {
            return new C1811k<>(e);
        }
    }

    /* renamed from: a */
    public static C1812l<C1792d> m8069a(Context context, String str) {
        return m8070a(context, str, "url_" + str);
    }

    /* renamed from: a */
    private static C1811k<C1792d> m8065a(InputStream inputStream, String str, boolean z) {
        try {
            return m8063a(JsonReader.m8455a(C69705k.m267590a(C69705k.m267596a(inputStream))), str);
        } finally {
            if (z) {
                C1791h.m8021a(inputStream);
            }
        }
    }

    /* renamed from: b */
    public static C1811k<C1792d> m8075b(Context context, int i, String str) {
        try {
            return m8076b(context.getResources().openRawResource(i), str);
        } catch (Resources.NotFoundException e) {
            return new C1811k<>(e);
        }
    }

    /* renamed from: c */
    public static C1811k<C1792d> m8080c(Context context, String str, String str2) {
        try {
            if (str.endsWith(".zip")) {
                return m8066a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return m8076b(context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new C1811k<>(e);
        }
    }

    /* renamed from: a */
    private static C1811k<C1792d> m8064a(JsonReader jsonReader, String str, boolean z) {
        try {
            C1792d a = C1903t.m8524a(jsonReader);
            if (str != null) {
                C1849f.m8289a().mo9263a(str, a);
            }
            C1811k<C1792d> kVar = new C1811k<>(a);
            if (z) {
                C1791h.m8021a(jsonReader);
            }
            return kVar;
        } catch (Exception e) {
            C1811k<C1792d> kVar2 = new C1811k<>(e);
            if (z) {
                C1791h.m8021a(jsonReader);
            }
            return kVar2;
        } catch (Throwable th) {
            if (z) {
                C1791h.m8021a(jsonReader);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static C1812l<C1792d> m8079b(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m8072a(str2, new Callable<C1811k<C1792d>>() {
            /* class com.airbnb.lottie.C1798e.CallableC18024 */

            /* renamed from: a */
            public C1811k<C1792d> call() {
                return C1798e.m8080c(applicationContext, str, str2);
            }
        });
    }

    /* renamed from: a */
    public static C1812l<C1792d> m8068a(Context context, final int i, String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m8072a(str, new Callable<C1811k<C1792d>>() {
            /* class com.airbnb.lottie.C1798e.CallableC18035 */

            /* renamed from: a */
            public C1811k<C1792d> call() {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    context = applicationContext;
                }
                return C1798e.m8074b(context, i);
            }
        });
    }

    /* renamed from: a */
    public static C1812l<C1792d> m8070a(final Context context, final String str, final String str2) {
        return m8072a(str2, new Callable<C1811k<C1792d>>() {
            /* class com.airbnb.lottie.C1798e.CallableC17991 */

            /* renamed from: a */
            public C1811k<C1792d> call() {
                return C1867b.m8395a(context, str, str2);
            }
        });
    }
}
