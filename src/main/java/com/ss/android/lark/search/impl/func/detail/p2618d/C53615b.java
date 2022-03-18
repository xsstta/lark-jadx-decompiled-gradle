package com.ss.android.lark.search.impl.func.detail.p2618d;

import com.bytedance.lark.pb.basic.v1.ActionType;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53593g;
import com.ss.android.lark.search.impl.func.detail.base.C53575b;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.detail.d.b */
public class C53615b extends C53575b implements AbstractC53593g<C53385a> {
    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53593g
    /* renamed from: b */
    public void mo182879b(C53385a aVar, IGetDataCallback<SearchResponse> iGetDataCallback) {
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53593g
    /* renamed from: a */
    public void mo182878a(C53385a aVar, IGetDataCallback<SearchResponse> iGetDataCallback) {
        this.f132339a.mo181835a(aVar.f131929a, aVar.f131932d, true, false, aVar.f131930b, aVar.f131931c, false, (List<ActionType>) null, iGetDataCallback);
    }
}
