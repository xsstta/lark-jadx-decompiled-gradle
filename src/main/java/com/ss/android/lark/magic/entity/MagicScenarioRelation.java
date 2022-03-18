package com.ss.android.lark.magic.entity;

import com.ss.android.lark.biz.core.api.MagicViewContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/magic/entity/MagicScenarioRelation;", "", "scenarioId", "", "viewContainer", "Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "(Ljava/lang/String;Lcom/ss/android/lark/biz/core/api/MagicViewContainer;)V", "getScenarioId", "()Ljava/lang/String;", "getViewContainer", "()Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.c.a */
public final class MagicScenarioRelation {

    /* renamed from: a */
    private final String f105930a;

    /* renamed from: b */
    private final MagicViewContainer f105931b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicScenarioRelation)) {
            return false;
        }
        MagicScenarioRelation aVar = (MagicScenarioRelation) obj;
        return Intrinsics.areEqual(this.f105930a, aVar.f105930a) && Intrinsics.areEqual(this.f105931b, aVar.f105931b);
    }

    public int hashCode() {
        String str = this.f105930a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MagicViewContainer awVar = this.f105931b;
        if (awVar != null) {
            i = awVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MagicScenarioRelation(scenarioId=" + this.f105930a + ", viewContainer=" + this.f105931b + ")";
    }

    /* renamed from: a */
    public final String mo150016a() {
        return this.f105930a;
    }

    /* renamed from: b */
    public final MagicViewContainer mo150017b() {
        return this.f105931b;
    }

    public MagicScenarioRelation(String str, MagicViewContainer awVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        Intrinsics.checkParameterIsNotNull(awVar, "viewContainer");
        this.f105930a = str;
        this.f105931b = awVar;
    }
}
