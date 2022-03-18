package com.google.android.datatransport.runtime.scheduling.p974a;

import com.google.android.datatransport.runtime.scheduling.p974a.C21450a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.d */
public abstract class AbstractC21462d {

    /* renamed from: a */
    static final AbstractC21462d f52100a = m77641e().mo72708a(10485760L).mo72707a(LocationRequest.PRIORITY_HD_ACCURACY).mo72710b(HwBuildEx.VersionCodes.CUR_DEVELOPMENT).mo72711b(604800000L).mo72709a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo72700a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo72701b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo72702c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract long mo72703d();

    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.d$a */
    static abstract class AbstractC21463a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21463a mo72707a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21463a mo72708a(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract AbstractC21462d mo72709a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC21463a mo72710b(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC21463a mo72711b(long j);

        AbstractC21463a() {
        }
    }

    AbstractC21462d() {
    }

    /* renamed from: e */
    static AbstractC21463a m77641e() {
        return new C21450a.C21452a();
    }
}
