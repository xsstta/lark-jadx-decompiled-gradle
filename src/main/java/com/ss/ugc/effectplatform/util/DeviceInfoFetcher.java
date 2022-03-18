package com.ss.ugc.effectplatform.util;

import android.content.Context;
import android.os.Build;
import com.ss.ugc.effectplatform.util.C65550e;
import java.util.HashMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"Lcom/ss/ugc/effectplatform/util/DeviceInfoFetcher;", "", "()V", "fetch", "", "context", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.util.d */
public final class DeviceInfoFetcher {
    /* renamed from: a */
    public final String mo228296a(Object obj) {
        Object obj2;
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            Result.Companion aVar = Result.Companion;
            DeviceInfoFetcher dVar = this;
            obj2 = Result.m271569constructorimpl(Float.valueOf(Float.parseFloat(GPUUtils.f165114a.mo228328b())));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj2 = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271575isFailureimpl(obj2)) {
            obj2 = null;
        }
        Float f = (Float) obj2;
        if (f != null) {
            hashMap.put("gl_version", Float.valueOf(f.floatValue()));
        }
        hashMap.put("gl_vendor", GPUUtils.f165114a.mo228329c());
        hashMap.put("gl_renderer", GPUUtils.f165114a.mo228327a());
        hashMap.put("gl_extension", GPUUtils.f165114a.mo228330d());
        if (obj != null && (obj instanceof Context)) {
            C65550e.C65551a c = C65550e.m257053c((Context) obj);
            Intrinsics.checkExpressionValueIsNotNull(c, "DeviceUtil.getMemoryInfo(context)");
            long a = c.mo228297a();
            if (a > 0) {
                hashMap.put("memory_total_size", Long.valueOf(a));
            }
        }
        String a2 = C65550e.m257049a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "DeviceUtil.getCpuModel()");
        hashMap.put("cpu_vendor", a2);
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.VERSION.RELEASE");
        hashMap.put("os_version", str);
        return new JSONObject(hashMap).toString();
    }
}
