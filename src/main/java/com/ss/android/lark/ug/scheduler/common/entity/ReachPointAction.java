package com.ss.android.lark.ug.scheduler.common.entity;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "", "scenarioId", "", "action", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getScenarioId", "getValue", "equals", "", "other", "hashCode", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.entity.a */
public final class ReachPointAction {

    /* renamed from: a */
    private final String f141783a;

    /* renamed from: b */
    private final String f141784b;

    /* renamed from: c */
    private final String f141785c;

    /* renamed from: a */
    public final String mo195280a() {
        return this.f141783a;
    }

    /* renamed from: b */
    public final String mo195281b() {
        return this.f141784b;
    }

    /* renamed from: c */
    public final String mo195282c() {
        return this.f141785c;
    }

    public int hashCode() {
        return (this.f141783a.hashCode() * 31) + this.f141784b.hashCode();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            ReachPointAction aVar = (ReachPointAction) obj;
            if (!(!Intrinsics.areEqual(this.f141783a, aVar.f141783a)) && !(!Intrinsics.areEqual(this.f141784b, aVar.f141784b))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction");
    }

    public ReachPointAction(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str2, "action");
        this.f141783a = str;
        this.f141784b = str2;
        this.f141785c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReachPointAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
