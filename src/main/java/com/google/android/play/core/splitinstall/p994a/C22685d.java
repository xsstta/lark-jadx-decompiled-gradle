package com.google.android.play.core.splitinstall.p994a;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.a.d */
final class C22685d implements AbstractC22692k {

    /* renamed from: a */
    final /* synthetic */ Integer f56128a;

    /* renamed from: b */
    final /* synthetic */ int f56129b;

    /* renamed from: c */
    final /* synthetic */ int f56130c;

    /* renamed from: d */
    final /* synthetic */ Long f56131d;

    /* renamed from: e */
    final /* synthetic */ Long f56132e;

    /* renamed from: f */
    final /* synthetic */ List f56133f;

    /* renamed from: g */
    final /* synthetic */ List f56134g;

    C22685d(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.f56128a = num;
        this.f56129b = i;
        this.f56130c = i2;
        this.f56131d = l;
        this.f56132e = l2;
        this.f56133f = list;
        this.f56134g = list2;
    }

    @Override // com.google.android.play.core.splitinstall.p994a.AbstractC22692k
    /* renamed from: a */
    public final SplitInstallSessionState mo79035a(SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState == null) {
            splitInstallSessionState = SplitInstallSessionState.create(0, 0, 0, 0, 0, new ArrayList(), new ArrayList());
        }
        Integer num = this.f56128a;
        int intValue = num != null ? num.intValue() : splitInstallSessionState.sessionId();
        int i = this.f56129b;
        int i2 = this.f56130c;
        Long l = this.f56131d;
        long longValue = l != null ? l.longValue() : splitInstallSessionState.bytesDownloaded();
        Long l2 = this.f56132e;
        long longValue2 = l2 == null ? splitInstallSessionState.totalBytesToDownload() : l2.longValue();
        List<String> list = this.f56133f;
        if (list == null) {
            list = splitInstallSessionState.moduleNames();
        }
        List<String> list2 = this.f56134g;
        return SplitInstallSessionState.create(intValue, i, i2, longValue, longValue2, list, list2 == null ? splitInstallSessionState.languages() : list2);
    }
}
