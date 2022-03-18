package com.ss.ugc.effectplatform.algorithm;

import com.ss.ugc.effectplatform.model.LocalModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/ModelInfoCache;", "", "localModelInfo", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "serverModelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Lcom/ss/ugc/effectplatform/model/LocalModelInfo;Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "getLocalModelInfo", "()Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "setLocalModelInfo", "(Lcom/ss/ugc/effectplatform/model/LocalModelInfo;)V", "getServerModelInfo", "()Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "setServerModelInfo", "(Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.h */
public final class ModelInfoCache {

    /* renamed from: a */
    private LocalModelInfo f164857a;

    /* renamed from: b */
    private ModelInfo f164858b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInfoCache)) {
            return false;
        }
        ModelInfoCache hVar = (ModelInfoCache) obj;
        return Intrinsics.areEqual(this.f164857a, hVar.f164857a) && Intrinsics.areEqual(this.f164858b, hVar.f164858b);
    }

    public int hashCode() {
        LocalModelInfo eVar = this.f164857a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.f164858b;
        if (modelInfo != null) {
            i = modelInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ModelInfoCache(localModelInfo=" + this.f164857a + ", serverModelInfo=" + this.f164858b + ")";
    }

    /* renamed from: a */
    public final LocalModelInfo mo227724a() {
        return this.f164857a;
    }

    /* renamed from: b */
    public final ModelInfo mo227725b() {
        return this.f164858b;
    }

    public ModelInfoCache(LocalModelInfo eVar, ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(eVar, "localModelInfo");
        Intrinsics.checkParameterIsNotNull(modelInfo, "serverModelInfo");
        this.f164857a = eVar;
        this.f164858b = modelInfo;
    }
}
