package com.ss.android.lark.integrator.todo.dependency;

import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.todo.dependency.idependency.IBlockitDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0011H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoBlockit;", "Lcom/ss/android/lark/todo/dependency/idependency/IBlockitDependency;", "()V", "openPlatformApi", "Lcom/ss/android/lark/openplatform_api/IOpenPlatformApi;", "kotlin.jvm.PlatformType", "getOpenPlatformApi", "()Lcom/ss/android/lark/openplatform_api/IOpenPlatformApi;", "generateBlockIDFromLocal", "", "domain", "Lcom/larksuite/component/blockit/entity/Domain;", "uuid", "", "blockType", "Lcom/larksuite/component/blockit/entity/BlockTypeID;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.d */
public final class TodoBlockit implements IBlockitDependency {

    /* renamed from: a */
    private final IOpenPlatformApi f101795a = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class));

    @Override // com.ss.android.lark.todo.dependency.idependency.IBlockitDependency
    /* renamed from: a */
    public void mo145367a(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(domain, "domain");
        Intrinsics.checkParameterIsNotNull(str, "uuid");
        Intrinsics.checkParameterIsNotNull(blockTypeID, "blockType");
        this.f101795a.generateBlockIDFromLocal(domain, str, blockTypeID, iGetDataCallback);
    }
}
