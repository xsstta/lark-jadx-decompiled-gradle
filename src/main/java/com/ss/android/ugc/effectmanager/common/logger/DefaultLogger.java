package com.ss.android.ugc.effectmanager.common.logger;

import android.util.Log;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/logger/DefaultLogger;", "Lcom/ss/android/ugc/effectmanager/common/logger/ILogger;", "()V", "DEFAULT_TAG", "", C63690d.f160779a, "", "msg", "e", "t", "", "i", "w", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.d.a */
public final class DefaultLogger implements ILogger {

    /* renamed from: a */
    public static final DefaultLogger f151296a = new DefaultLogger();

    private DefaultLogger() {
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: a */
    public void mo207191a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        if (EPLog.f151297a.mo207194a()) {
            Log.i("DefaultEPLog", str);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: b */
    public void mo207193b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        if (EPLog.f151297a.mo207194a()) {
            Log.d("DefaultEPLog", str);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    /* renamed from: a */
    public void mo207192a(String str, Throwable th) {
        Log.e("DefaultEPLog", str, th);
    }
}
