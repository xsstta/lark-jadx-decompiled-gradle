package androidx.core.provider;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C0517d;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C0760e;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.C0773d;
import androidx.core.graphics.C0794k;
import androidx.core.provider.C0814b;
import androidx.core.util.C0845f;
import com.huawei.hms.android.HwBuildEx;
import com.ss.ttm.player.MediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class FontsContractCompat {

    /* renamed from: a */
    static final C0517d<String, Typeface> f3217a = new C0517d<>(16);

    /* renamed from: b */
    static final Object f3218b = new Object();

    /* renamed from: c */
    static final SimpleArrayMap<String, ArrayList<C0814b.AbstractC0819a<C0812c>>> f3219c = new SimpleArrayMap<>();

    /* renamed from: d */
    private static final C0814b f3220d = new C0814b("fonts", 10, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);

    /* renamed from: e */
    private static final Comparator<byte[]> f3221e = new Comparator<byte[]>() {
        /* class androidx.core.provider.FontsContractCompat.C08094 */

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    };

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$a */
    public static class C0810a {

        /* renamed from: a */
        private final int f3229a;

        /* renamed from: b */
        private final C0811b[] f3230b;

        /* renamed from: a */
        public int mo4410a() {
            return this.f3229a;
        }

        /* renamed from: b */
        public C0811b[] mo4411b() {
            return this.f3230b;
        }

        public C0810a(int i, C0811b[] bVarArr) {
            this.f3229a = i;
            this.f3230b = bVarArr;
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$b */
    public static class C0811b {

        /* renamed from: a */
        private final Uri f3231a;

        /* renamed from: b */
        private final int f3232b;

        /* renamed from: c */
        private final int f3233c;

        /* renamed from: d */
        private final boolean f3234d;

        /* renamed from: e */
        private final int f3235e;

        /* renamed from: a */
        public Uri mo4412a() {
            return this.f3231a;
        }

        /* renamed from: b */
        public int mo4413b() {
            return this.f3232b;
        }

        /* renamed from: c */
        public int mo4414c() {
            return this.f3233c;
        }

        /* renamed from: d */
        public boolean mo4415d() {
            return this.f3234d;
        }

        /* renamed from: e */
        public int mo4416e() {
            return this.f3235e;
        }

        public C0811b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f3231a = (Uri) C0845f.m3991a(uri);
            this.f3232b = i;
            this.f3233c = i2;
            this.f3234d = z;
            this.f3235e = i3;
        }
    }

    /* renamed from: a */
    private static boolean m3905a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static C0811b[] m3906a(Context context, C0813a aVar, String str, CancellationSignal cancellationSignal) {
        Uri uri;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo4419c()}, null, cancellationSignal);
            } else {
                query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo4419c()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList2.add(new C0811b(uri, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C0811b[]) arrayList.toArray(new C0811b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private static List<byte[]> m3903a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.provider.FontsContractCompat$c */
    public static final class C0812c {

        /* renamed from: a */
        final Typeface f3236a;

        /* renamed from: b */
        final int f3237b;

        C0812c(Typeface typeface, int i) {
            this.f3236a = typeface;
            this.f3237b = i;
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m3902a(C0813a aVar, Resources resources) {
        if (aVar.mo4420d() != null) {
            return aVar.mo4420d();
        }
        return FontResourcesParserCompat.m3637a(resources, aVar.mo4421e());
    }

    /* renamed from: a */
    public static C0810a m3900a(Context context, CancellationSignal cancellationSignal, C0813a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo a = m3898a(context.getPackageManager(), aVar, context.getResources());
        if (a == null) {
            return new C0810a(1, null);
        }
        return new C0810a(0, m3906a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C0812c m3901a(Context context, C0813a aVar, int i) {
        try {
            C0810a a = m3900a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo4410a() == 0) {
                Typeface a2 = C0773d.m3738a(context, null, a.mo4411b(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0812c(a2, i2);
            }
            if (a.mo4410a() == 1) {
                i2 = -2;
            }
            return new C0812c(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0812c(null, -1);
        }
    }

    /* renamed from: a */
    public static ProviderInfo m3898a(PackageManager packageManager, C0813a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String a = aVar.mo4417a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + a);
        } else if (resolveContentProvider.packageName.equals(aVar.mo4418b())) {
            List<byte[]> a2 = m3903a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f3221e);
            List<List<byte[]>> a3 = m3902a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList(a3.get(i));
                Collections.sort(arrayList, f3221e);
                if (m3905a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + a + ", but package was not " + aVar.mo4418b());
        }
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m3904a(Context context, C0811b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0811b bVar : bVarArr) {
            if (bVar.mo4416e() == 0) {
                Uri a = bVar.mo4412a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0794k.m3867a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static Typeface m3899a(final Context context, final C0813a aVar, final C0760e.AbstractC0761a aVar2, final Handler handler, boolean z, int i, final int i2) {
        C08072 r3;
        final String str = aVar.mo4422f() + "-" + i2;
        Typeface a = f3217a.mo2974a(str);
        if (a != null) {
            if (aVar2 != null) {
                aVar2.mo2635a(a);
            }
            return a;
        } else if (!z || i != -1) {
            CallableC08061 r1 = new Callable<C0812c>() {
                /* class androidx.core.provider.FontsContractCompat.CallableC08061 */

                /* renamed from: a */
                public C0812c call() throws Exception {
                    C0812c a = FontsContractCompat.m3901a(context, aVar, i2);
                    if (a.f3236a != null) {
                        FontsContractCompat.f3217a.mo2975a(str, a.f3236a);
                    }
                    return a;
                }
            };
            if (z) {
                try {
                    return ((C0812c) f3220d.mo4424a(r1, i)).f3236a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (aVar2 == null) {
                    r3 = null;
                } else {
                    r3 = new C0814b.AbstractC0819a<C0812c>() {
                        /* class androidx.core.provider.FontsContractCompat.C08072 */

                        /* renamed from: a */
                        public void mo4406a(C0812c cVar) {
                            if (cVar == null) {
                                C0760e.AbstractC0761a.this.mo4286a(1, handler);
                            } else if (cVar.f3237b == 0) {
                                C0760e.AbstractC0761a.this.mo4287a(cVar.f3236a, handler);
                            } else {
                                C0760e.AbstractC0761a.this.mo4286a(cVar.f3237b, handler);
                            }
                        }
                    };
                }
                synchronized (f3218b) {
                    SimpleArrayMap<String, ArrayList<C0814b.AbstractC0819a<C0812c>>> simpleArrayMap = f3219c;
                    ArrayList<C0814b.AbstractC0819a<C0812c>> arrayList = simpleArrayMap.get(str);
                    if (arrayList != null) {
                        if (r3 != null) {
                            arrayList.add(r3);
                        }
                        return null;
                    }
                    if (r3 != null) {
                        ArrayList<C0814b.AbstractC0819a<C0812c>> arrayList2 = new ArrayList<>();
                        arrayList2.add(r3);
                        simpleArrayMap.put(str, arrayList2);
                    }
                    f3220d.mo4427a(r1, new C0814b.AbstractC0819a<C0812c>() {
                        /* class androidx.core.provider.FontsContractCompat.C08083 */

                        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
                            if (r0 >= r1.size()) goto L_0x002c;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
                            r1.get(r0).mo4406a(r5);
                            r0 = r0 + 1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
                            r0 = 0;
                         */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void mo4406a(androidx.core.provider.FontsContractCompat.C0812c r5) {
                            /*
                                r4 = this;
                                java.lang.Object r0 = androidx.core.provider.FontsContractCompat.f3218b
                                monitor-enter(r0)
                                androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.b$a<androidx.core.provider.FontsContractCompat$c>>> r1 = androidx.core.provider.FontsContractCompat.f3219c     // Catch:{ all -> 0x002d }
                                java.lang.String r2 = r0     // Catch:{ all -> 0x002d }
                                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                                if (r1 != 0) goto L_0x0011
                                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                                return
                            L_0x0011:
                                androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.b$a<androidx.core.provider.FontsContractCompat$c>>> r2 = androidx.core.provider.FontsContractCompat.f3219c     // Catch:{ all -> 0x002d }
                                java.lang.String r3 = r0     // Catch:{ all -> 0x002d }
                                r2.remove(r3)     // Catch:{ all -> 0x002d }
                                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                                r0 = 0
                            L_0x001a:
                                int r2 = r1.size()
                                if (r0 >= r2) goto L_0x002c
                                java.lang.Object r2 = r1.get(r0)
                                androidx.core.provider.b$a r2 = (androidx.core.provider.C0814b.AbstractC0819a) r2
                                r2.mo4406a(r5)
                                int r0 = r0 + 1
                                goto L_0x001a
                            L_0x002c:
                                return
                            L_0x002d:
                                r5 = move-exception
                                monitor-exit(r0)
                                throw r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontsContractCompat.C08083.mo4406a(androidx.core.provider.FontsContractCompat$c):void");
                        }
                    });
                    return null;
                }
            }
        } else {
            C0812c a2 = m3901a(context, aVar, i2);
            if (aVar2 != null) {
                if (a2.f3237b == 0) {
                    aVar2.mo4287a(a2.f3236a, handler);
                } else {
                    aVar2.mo4286a(a2.f3237b, handler);
                }
            }
            return a2.f3236a;
        }
    }
}
