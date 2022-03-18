package com.ss.ugc.effectplatform.model;

import bytekn.foundation.utils.Multimap;
import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/model/ServerConfig;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lbytekn/foundation/utils/Multimap;", "", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Lbytekn/foundation/utils/Multimap;)V", "getData", "()Lbytekn/foundation/utils/Multimap;", "setData", "loadedModelList", "Lcom/ss/ugc/effectplatform/model/LoadedModelList;", "checkContent", "", "getLoadedModelList", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.model.g */
public final class ServerConfig {

    /* renamed from: a */
    private LoadedModelList f164955a;

    /* renamed from: b */
    private Multimap<String, ModelInfo> f164956b;

    /* renamed from: a */
    public final LoadedModelList mo227941a() {
        LoadedModelList dVar = this.f164955a;
        if (dVar != null) {
            return dVar;
        }
        ServerConfig gVar = this;
        mo227942b();
        LoadedModelList dVar2 = new LoadedModelList();
        Multimap<String, LoadedModelList.ModelInfoState> cVar = new Multimap<>();
        for (String str : this.f164956b.mo8671a()) {
            for (ModelInfo modelInfo : this.f164956b.mo8670a(str)) {
                cVar.mo8672a(str, new LoadedModelList.ModelInfoState(modelInfo));
            }
        }
        dVar2.mo227916a(cVar);
        gVar.f164955a = dVar2;
        return dVar2;
    }

    /* renamed from: b */
    public final void mo227942b() {
        ModelInfo next;
        String name;
        HashMap hashMap = new HashMap();
        Collection<ModelInfo> b = this.f164956b.mo8673b();
        if (b != null) {
            Iterator<ModelInfo> it = b.iterator();
            while (it.hasNext() && (name = (next = it.next()).getName()) != null) {
                if (!hashMap.containsKey(name)) {
                    hashMap.put(name, next.getVersion());
                } else if (!Intrinsics.areEqual((String) hashMap.get(name), next.getVersion())) {
                    throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
                }
            }
        }
    }

    public ServerConfig(Multimap<String, ModelInfo> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f164956b = cVar;
    }
}
