package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.Phonemetadata;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: io.michaelrocks.libphonenumber.android.e */
public final class C68246e {

    /* renamed from: a */
    private static final Logger f171505a = Logger.getLogger(C68246e.class.getName());

    /* renamed from: b */
    private final AbstractC68245d f171506b;

    /* renamed from: c */
    private final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> f171507c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> f171508d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final Set<Integer> f171509e = C68237a.m264936a();

    /* renamed from: f */
    private final Set<String> f171510f = C68253j.m264978a();

    C68246e(AbstractC68245d dVar) {
        this.f171506b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034 A[SYNTHETIC, Splitter:B:23:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038 A[Catch:{ IOException -> 0x003c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static io.michaelrocks.libphonenumber.android.Phonemetadata.PhoneMetadataCollection m264947a(java.io.InputStream r5) {
        /*
            java.lang.String r0 = "error closing input stream (ignored)"
            java.lang.String r1 = "cannot load/parse metadata"
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x002b }
            r3.<init>(r5)     // Catch:{ IOException -> 0x002b }
            io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadataCollection r2 = new io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadataCollection     // Catch:{ all -> 0x0026 }
            r2.<init>()     // Catch:{ all -> 0x0026 }
            r2.readExternal(r3)     // Catch:{ IOException -> 0x001f }
            r3.close()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001e
        L_0x0016:
            r5 = move-exception
            java.util.logging.Logger r1 = io.michaelrocks.libphonenumber.android.C68246e.f171505a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r5)
        L_0x001e:
            return r2
        L_0x001f:
            r2 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r1, r2)
            throw r4
        L_0x0026:
            r1 = move-exception
            r2 = r3
            goto L_0x0032
        L_0x0029:
            r1 = move-exception
            goto L_0x0032
        L_0x002b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0029 }
            r4.<init>(r1, r3)     // Catch:{ all -> 0x0029 }
            throw r4     // Catch:{ all -> 0x0029 }
        L_0x0032:
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0044
        L_0x0038:
            r5.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0044
        L_0x003c:
            r5 = move-exception
            java.util.logging.Logger r2 = io.michaelrocks.libphonenumber.android.C68246e.f171505a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r2.log(r3, r0, r5)
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.C68246e.m264947a(java.io.InputStream):io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadataCollection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo237421a(int i, String str) {
        if (!this.f171509e.contains(Integer.valueOf(i))) {
            return null;
        }
        return mo237422a(Integer.valueOf(i), this.f171507c, str);
    }

    /* renamed from: a */
    private static List<Phonemetadata.PhoneMetadata> m264948a(String str, AbstractC68245d dVar) {
        InputStream a = dVar.mo237420a(str);
        if (a != null) {
            List<Phonemetadata.PhoneMetadata> metadataList = m264947a(a).getMetadataList();
            if (metadataList.size() != 0) {
                return metadataList;
            }
            throw new IllegalStateException("empty metadata: " + str);
        }
        throw new IllegalStateException("missing metadata: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> Phonemetadata.PhoneMetadata mo237422a(T t, ConcurrentHashMap<T, Phonemetadata.PhoneMetadata> concurrentHashMap, String str) {
        Phonemetadata.PhoneMetadata phoneMetadata = concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        String str2 = str + "_" + ((Object) t);
        List<Phonemetadata.PhoneMetadata> a = m264948a(str2, this.f171506b);
        if (a.size() > 1) {
            f171505a.log(Level.WARNING, "more than one metadata in file " + str2);
        }
        Phonemetadata.PhoneMetadata phoneMetadata2 = a.get(0);
        Phonemetadata.PhoneMetadata putIfAbsent = concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        return putIfAbsent != null ? putIfAbsent : phoneMetadata2;
    }
}
