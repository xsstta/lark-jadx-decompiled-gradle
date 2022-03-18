package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsMainModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IMainModuleDependency;", "()V", "getTabIndex", "", "tabKey", "", "getTabType", "Lcom/ss/android/lark/maincore/TabType;", "isTabEnable", "", "launchMainWindow", "", "context", "Landroid/content/Context;", "pageName", "bundle", "Landroid/os/Bundle;", "registerBootMileStoneListener", "listener", "Lcom/ss/android/lark/maincore/IBootMileStoneListener;", "unregisterBootMileStoneListener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.l */
public final class MomentsMainModule implements IMainModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: b */
    public TabType mo144720b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabKey");
        TabType tabType = ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType(str);
        Intrinsics.checkExpressionValueIsNotNull(tabType, "ApiUtils.getApi(ICoreApi….java).getTabType(tabKey)");
        return tabType;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: c */
    public int mo144722c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabKey");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabIndex(str);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public void mo144718a(AbstractC44544a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(aVar);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: b */
    public void mo144721b(AbstractC44544a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterBootMileStoneListener(aVar);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public boolean mo144719a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabKey");
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getTabType(str) != TabType.Others) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency
    /* renamed from: a */
    public void mo144717a(Context context, String str, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "pageName");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).launchMainWindow(context, str, bundle);
    }
}
