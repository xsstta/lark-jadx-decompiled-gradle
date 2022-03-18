package com.ss.android.lark.statistics.extensions;

import com.ss.android.lark.statistics.extensions.ITargetParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/statistics/extensions/TARGET_NONE;", "Lcom/ss/android/lark/statistics/extensions/ITargetParam;", "()V", "value", "", "getValue", "()Ljava/lang/String;", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.statistics.extensions.e */
public final class TARGET_NONE implements ITargetParam {

    /* renamed from: a */
    public static final TARGET_NONE f135700a = new TARGET_NONE();

    /* renamed from: b */
    private static final String f135701b = f135701b;

    private TARGET_NONE() {
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public String getValue() {
        return f135701b;
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public String getKey() {
        return ITargetParam.C54955a.m213215a(this);
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public JSONObject toJson() {
        return ITargetParam.C54955a.m213216b(this);
    }

    @Override // com.ss.android.lark.statistics.extensions.IParam
    public IParam plus(IParam cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "target");
        return ITargetParam.C54955a.m213214a(this, cVar);
    }
}
