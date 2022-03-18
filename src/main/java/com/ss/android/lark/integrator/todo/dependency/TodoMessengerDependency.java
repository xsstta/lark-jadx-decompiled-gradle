package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import android.view.View;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoMessengerDependency;", "Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "()V", "getBlockView", "", "blockId", "", "listener", "Lcom/larksuite/component/blockit/todo/ITodoBlockViewClickListener;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/view/View;", "goUserProfile", "context", "Landroid/content/Context;", "userId", "mountBlockById", "viewGroup", "Landroid/view/ViewGroup;", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.o */
public final class TodoMessengerDependency implements IMessengerDependency {

    /* renamed from: a */
    public static final Companion f101801a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoMessengerDependency$Companion;", "", "()V", "ADD_ASSIGNEE_REQUEST_CODE", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMessengerDependency
    /* renamed from: a */
    public void mo145420a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(0);
        String str2 = null;
        contactSource.setSourceName(str2);
        contactSource.setSourceId(str2);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startUserProfile(context, str, null, contactSource);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.IMessengerDependency
    /* renamed from: a */
    public void mo145421a(String str, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "blockId");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getBlockViewById(str, aVar, iGetDataCallback);
    }
}
