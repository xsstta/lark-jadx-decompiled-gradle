package com.ss.android.lark.statistics.extensions;

import com.ss.android.lark.statistics.extensions.IParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "Lcom/ss/android/lark/statistics/extensions/IParam;", "key", "", "getKey", "()Ljava/lang/String;", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.statistics.extensions.d */
public interface ITargetParam extends IParam {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.statistics.extensions.d$a */
    public static final class C54955a {
        /* renamed from: a */
        public static IParam m213214a(ITargetParam dVar, IParam cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "target");
            return IParam.C54954a.m213212a(dVar, cVar);
        }

        /* renamed from: a */
        public static String m213215a(ITargetParam dVar) {
            return "target";
        }

        /* renamed from: b */
        public static JSONObject m213216b(ITargetParam dVar) {
            return IParam.C54954a.m213213a(dVar);
        }
    }
}
