package com.ss.lark.android.avatar.ui;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.lark.android.avatar.ui.IAvatarDecorationContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarDecorationModel;", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IModel;", "()V", "api", "Lcom/ss/lark/android/avatar/ui/QueryMiniAppsAPIImpl;", "create", "", "destroy", "queryMiniApps", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.b */
public final class AvatarDecorationModel implements IAvatarDecorationContract.IModel {

    /* renamed from: a */
    private final QueryMiniAppsAPIImpl f162390a = new QueryMiniAppsAPIImpl();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.lark.android.avatar.ui.IAvatarDecorationContract.IModel
    /* renamed from: a */
    public void mo222683a(IGetDataCallback<List<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f162390a.mo222707a(iGetDataCallback);
    }
}
