package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.Phonemetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: io.michaelrocks.libphonenumber.android.g */
public final class C68248g implements AbstractC68247f {

    /* renamed from: a */
    private final String f171511a;

    /* renamed from: b */
    private final String f171512b;

    /* renamed from: c */
    private final String f171513c;

    /* renamed from: d */
    private final C68246e f171514d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, Phonemetadata.PhoneMetadata> f171515e;

    /* renamed from: f */
    private final ConcurrentHashMap<Integer, Phonemetadata.PhoneMetadata> f171516f;

    C68248g(AbstractC68245d dVar) {
        this("/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto", "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto", "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto", dVar);
    }

    @Override // io.michaelrocks.libphonenumber.android.AbstractC68247f
    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo237424a(String str) {
        return this.f171514d.mo237422a(str, this.f171515e, this.f171511a);
    }

    @Override // io.michaelrocks.libphonenumber.android.AbstractC68247f
    /* renamed from: b */
    public Phonemetadata.PhoneMetadata mo237425b(int i) {
        return this.f171514d.mo237421a(i, this.f171512b);
    }

    @Override // io.michaelrocks.libphonenumber.android.AbstractC68247f
    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo237423a(int i) {
        if (!m264954c(i)) {
            return null;
        }
        return this.f171514d.mo237422a(Integer.valueOf(i), this.f171516f, this.f171511a);
    }

    /* renamed from: c */
    private boolean m264954c(int i) {
        List<String> list = C68244c.m264945a().get(Integer.valueOf(i));
        if (list.size() != 1 || !"001".equals(list.get(0))) {
            return false;
        }
        return true;
    }

    C68248g(String str, String str2, String str3, AbstractC68245d dVar) {
        this.f171515e = new ConcurrentHashMap<>();
        this.f171516f = new ConcurrentHashMap<>();
        this.f171511a = str;
        this.f171512b = str2;
        this.f171513c = str3;
        this.f171514d = new C68246e(dVar);
    }
}
