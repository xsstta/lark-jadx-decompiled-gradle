package com.ss.ugc.effectplatform.model;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.utils.Multimap;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR<\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/model/LoadedModelList;", "", "()V", "mLoadedModelInfos", "Lbytekn/foundation/collections/SharedMutableMap;", "", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "getMLoadedModelInfos", "()Lbytekn/foundation/collections/SharedMutableMap;", "setMLoadedModelInfos", "(Lbytekn/foundation/collections/SharedMutableMap;)V", "value", "Lbytekn/foundation/utils/Multimap;", "Lcom/ss/ugc/effectplatform/model/LoadedModelList$ModelInfoState;", "requirementModelInfoStateMap", "getRequirementModelInfoStateMap", "()Lbytekn/foundation/utils/Multimap;", "setRequirementModelInfoStateMap", "(Lbytekn/foundation/utils/Multimap;)V", "getDownloadUrl", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "modelName", "getModelInfoList", "", "ModelInfoState", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.d */
public final class LoadedModelList {

    /* renamed from: a */
    private Multimap<String, ModelInfoState> f164945a = new Multimap<>();

    /* renamed from: b */
    private SharedMutableMap<String, ModelInfo> f164946b = new SharedMutableMap<>(false, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/model/LoadedModelList$ModelInfoState;", "", "modelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;)V", "isLoaded", "", "()Z", "setLoaded", "(Z)V", "<set-?>", "getModelInfo", "()Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "name", "", "getName", "()Ljava/lang/String;", "size", "", "getSize", "()Ljava/lang/Integer;", "url", "Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", "getUrl", "()Lcom/ss/ugc/effectplatform/model/algorithm/ExtendedUrlModel;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "equals", ActivityC23764o.f58839a, "hashCode", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.model.d$a */
    public static final class ModelInfoState {

        /* renamed from: a */
        private ModelInfo f164947a;

        /* renamed from: a */
        public final ModelInfo mo227918a() {
            return this.f164947a;
        }

        /* renamed from: b */
        public final String mo227919b() {
            return this.f164947a.getName();
        }

        /* renamed from: c */
        public final ExtendedUrlModel mo227920c() {
            return this.f164947a.getFile_url();
        }

        public int hashCode() {
            return this.f164947a.hashCode();
        }

        public ModelInfoState(ModelInfo modelInfo) {
            Intrinsics.checkParameterIsNotNull(modelInfo, "modelInfo");
            this.f164947a = modelInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                return Intrinsics.areEqual(this.f164947a, ((ModelInfoState) obj).f164947a);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.LoadedModelList.ModelInfoState");
        }
    }

    /* renamed from: a */
    public final Multimap<String, ModelInfoState> mo227914a() {
        return this.f164945a;
    }

    /* renamed from: b */
    public final Map<String, ModelInfo> mo227917b() {
        Collection<ModelInfoState> b;
        if (this.f164946b.isEmpty() && (b = this.f164945a.mo8673b()) != null) {
            for (T t : b) {
                this.f164946b.put(t.mo227918a().getName(), t.mo227918a());
            }
        }
        return this.f164946b;
    }

    /* renamed from: a */
    public final void mo227916a(Multimap<String, ModelInfoState> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "value");
        this.f164945a = cVar;
        this.f164946b.clear();
        Collection<ModelInfoState> b = cVar.mo8673b();
        if (b != null) {
            for (T t : b) {
                this.f164946b.put(t.mo227918a().getName(), t.mo227918a());
            }
        }
    }

    /* renamed from: a */
    public final ExtendedUrlModel mo227915a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        Collection<ModelInfoState> b = this.f164945a.mo8673b();
        if (b != null) {
            for (T t : b) {
                if (Intrinsics.areEqual(t.mo227919b(), str)) {
                    return t.mo227920c();
                }
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }
}
