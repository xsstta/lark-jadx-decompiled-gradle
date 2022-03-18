package com.bytedance.ee.lark.infra.foundation.dependency;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0010\u001a\u00020\u0005H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/lark/infra/foundation/dependency/ICommonDependency;", "", "getAppbrandContext", "Landroid/content/Context;", "getDeviceId", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "getFgValue", "", "key", "getGlobalTrace", "Lcom/ss/android/lark/optrace/api/TracingCoreSpan;", "getGlobalUniqueId", "getIsolatePrefix", "getLarkSession", "getSpPrefixPath", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.foundation.a.b */
public interface ICommonDependency {
    /* renamed from: a */
    String mo48297a();

    /* renamed from: a */
    String mo48298a(IAppContext iAppContext);

    /* renamed from: a */
    boolean mo48299a(String str);

    /* renamed from: b */
    String mo48300b();

    /* renamed from: b */
    String mo48301b(IAppContext iAppContext);

    /* renamed from: c */
    TracingCoreSpan mo48302c();

    /* renamed from: d */
    String mo48303d();

    /* renamed from: e */
    Context mo48304e();
}
