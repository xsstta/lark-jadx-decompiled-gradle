package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.e */
public final class C22571e extends AbstractC22567a {

    /* renamed from: a */
    private final String f55622a;

    /* renamed from: b */
    private final int f55623b;

    /* renamed from: c */
    private final int f55624c;

    /* renamed from: d */
    private final int f55625d;

    /* renamed from: e */
    private final Integer f55626e;

    /* renamed from: f */
    private final int f55627f;

    /* renamed from: g */
    private final long f55628g;

    /* renamed from: h */
    private final long f55629h;

    /* renamed from: i */
    private final long f55630i;

    /* renamed from: j */
    private final long f55631j;

    /* renamed from: k */
    private final PendingIntent f55632k;

    /* renamed from: l */
    private final PendingIntent f55633l;

    /* renamed from: m */
    private final PendingIntent f55634m;

    /* renamed from: n */
    private final PendingIntent f55635n;

    C22571e(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f55622a = str;
        this.f55623b = i;
        this.f55624c = i2;
        this.f55625d = i3;
        this.f55626e = num;
        this.f55627f = i4;
        this.f55628g = j;
        this.f55629h = j2;
        this.f55630i = j3;
        this.f55631j = j4;
        this.f55632k = pendingIntent;
        this.f55633l = pendingIntent2;
        this.f55634m = pendingIntent3;
        this.f55635n = pendingIntent4;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: a */
    public final String mo78661a() {
        return this.f55622a;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: b */
    public final int mo78662b() {
        return this.f55623b;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: c */
    public final int mo78663c() {
        return this.f55624c;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: d */
    public final int mo78664d() {
        return this.f55625d;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: e */
    public final Integer mo78665e() {
        return this.f55626e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22567a) {
            AbstractC22567a aVar = (AbstractC22567a) obj;
            if (this.f55622a.equals(aVar.mo78661a()) && this.f55623b == aVar.mo78662b() && this.f55624c == aVar.mo78663c() && this.f55625d == aVar.mo78664d() && ((num = this.f55626e) == null ? aVar.mo78665e() == null : num.equals(aVar.mo78665e())) && this.f55627f == aVar.mo78666f() && this.f55628g == aVar.mo78667g() && this.f55629h == aVar.mo78668h() && this.f55630i == aVar.mo78669i() && this.f55631j == aVar.mo78670j() && ((pendingIntent = this.f55632k) == null ? aVar.mo78671k() == null : pendingIntent.equals(aVar.mo78671k())) && ((pendingIntent2 = this.f55633l) == null ? aVar.mo78672l() == null : pendingIntent2.equals(aVar.mo78672l())) && ((pendingIntent3 = this.f55634m) == null ? aVar.mo78673m() == null : pendingIntent3.equals(aVar.mo78673m()))) {
                PendingIntent pendingIntent4 = this.f55635n;
                PendingIntent n = aVar.mo78674n();
                if (pendingIntent4 == null ? n == null : pendingIntent4.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: f */
    public final int mo78666f() {
        return this.f55627f;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: g */
    public final long mo78667g() {
        return this.f55628g;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: h */
    public final long mo78668h() {
        return this.f55629h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f55622a.hashCode() ^ 1000003) * 1000003) ^ this.f55623b) * 1000003) ^ this.f55624c) * 1000003) ^ this.f55625d) * 1000003;
        Integer num = this.f55626e;
        int i = 0;
        int hashCode2 = num != null ? num.hashCode() : 0;
        int i2 = this.f55627f;
        long j = this.f55628g;
        long j2 = this.f55629h;
        long j3 = this.f55630i;
        long j4 = this.f55631j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f55632k;
        int hashCode3 = (i3 ^ (pendingIntent != null ? pendingIntent.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent2 = this.f55633l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 != null ? pendingIntent2.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent3 = this.f55634m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 != null ? pendingIntent3.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent4 = this.f55635n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: i */
    public final long mo78669i() {
        return this.f55630i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: j */
    public final long mo78670j() {
        return this.f55631j;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: k */
    public final PendingIntent mo78671k() {
        return this.f55632k;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: l */
    public final PendingIntent mo78672l() {
        return this.f55633l;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: m */
    public final PendingIntent mo78673m() {
        return this.f55634m;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.appupdate.AbstractC22567a
    /* renamed from: n */
    public final PendingIntent mo78674n() {
        return this.f55635n;
    }

    public final String toString() {
        String str = this.f55622a;
        int i = this.f55623b;
        int i2 = this.f55624c;
        int i3 = this.f55625d;
        String valueOf = String.valueOf(this.f55626e);
        int i4 = this.f55627f;
        long j = this.f55628g;
        long j2 = this.f55629h;
        long j3 = this.f55630i;
        long j4 = this.f55631j;
        String valueOf2 = String.valueOf(this.f55632k);
        String valueOf3 = String.valueOf(this.f55633l);
        String valueOf4 = String.valueOf(this.f55634m);
        String valueOf5 = String.valueOf(this.f55635n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j3);
        sb.append(", assetPackStorageSize=");
        sb.append(j4);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
