package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.b */
public final class C22703b extends SplitInstallSessionState {

    /* renamed from: a */
    private final int f56175a;

    /* renamed from: b */
    private final int f56176b;

    /* renamed from: c */
    private final int f56177c;

    /* renamed from: d */
    private final long f56178d;

    /* renamed from: e */
    private final long f56179e;

    /* renamed from: f */
    private final List<String> f56180f;

    /* renamed from: g */
    private final List<String> f56181g;

    /* renamed from: h */
    private final PendingIntent f56182h;

    /* renamed from: i */
    private final List<Intent> f56183i;

    C22703b(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f56175a = i;
        this.f56176b = i2;
        this.f56177c = i3;
        this.f56178d = j;
        this.f56179e = j2;
        this.f56180f = list;
        this.f56181g = list2;
        this.f56182h = pendingIntent;
        this.f56183i = list3;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: a */
    public final List<String> mo79023a() {
        return this.f56180f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: b */
    public final List<String> mo79024b() {
        return this.f56181g;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.f56178d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: c */
    public final List<Intent> mo79026c() {
        return this.f56183i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f56175a == splitInstallSessionState.sessionId() && this.f56176b == splitInstallSessionState.status() && this.f56177c == splitInstallSessionState.errorCode() && this.f56178d == splitInstallSessionState.bytesDownloaded() && this.f56179e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f56180f) == null ? splitInstallSessionState.mo79023a() == null : list.equals(splitInstallSessionState.mo79023a())) && ((list2 = this.f56181g) == null ? splitInstallSessionState.mo79024b() == null : list2.equals(splitInstallSessionState.mo79024b())) && ((pendingIntent = this.f56182h) == null ? splitInstallSessionState.resolutionIntent() == null : pendingIntent.equals(splitInstallSessionState.resolutionIntent()))) {
                List<Intent> list3 = this.f56183i;
                List<Intent> c = splitInstallSessionState.mo79026c();
                if (list3 == null ? c == null : list3.equals(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int errorCode() {
        return this.f56177c;
    }

    public final int hashCode() {
        int i = this.f56175a;
        int i2 = this.f56176b;
        int i3 = this.f56177c;
        long j = this.f56178d;
        long j2 = this.f56179e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f56180f;
        int i5 = 0;
        int hashCode = (i4 ^ (list != null ? list.hashCode() : 0)) * 1000003;
        List<String> list2 = this.f56181g;
        int hashCode2 = (hashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003;
        PendingIntent pendingIntent = this.f56182h;
        int hashCode3 = (hashCode2 ^ (pendingIntent != null ? pendingIntent.hashCode() : 0)) * 1000003;
        List<Intent> list3 = this.f56183i;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final PendingIntent resolutionIntent() {
        return this.f56182h;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.f56175a;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int status() {
        return this.f56176b;
    }

    public final String toString() {
        int i = this.f56175a;
        int i2 = this.f56176b;
        int i3 = this.f56177c;
        long j = this.f56178d;
        long j2 = this.f56179e;
        String valueOf = String.valueOf(this.f56180f);
        String valueOf2 = String.valueOf(this.f56181g);
        String valueOf3 = String.valueOf(this.f56182h);
        String valueOf4 = String.valueOf(this.f56183i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.f56179e;
    }
}
