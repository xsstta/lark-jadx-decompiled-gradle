package com.ss.android.lark.integrator.im;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.integrator.im.dependency.ITodoDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/im/TodoDependencyImpl;", "Lcom/ss/android/lark/integrator/im/dependency/ITodoDependency;", "()V", "getChatTodoListReadState", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "gotoChatTodoListActivity", "context", "Landroid/content/Context;", "isThread", "isTodoTabEnable", "Companion", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.n */
public final class TodoDependencyImpl implements ITodoDependency {

    /* renamed from: a */
    public static final Companion f101286a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/im/TodoDependencyImpl$Companion;", "", "()V", "TAG", "", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.im.n$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ITodoDependency
    /* renamed from: a */
    public boolean mo143691a() {
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        return ((ICalendarApi) api).isTodoTabEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ITodoDependency
    /* renamed from: a */
    public void mo143690a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getChatTodoListReadState(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ITodoDependency
    /* renamed from: a */
    public void mo143689a(Context context, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).gotoChatTodoListActivity(context, str, z);
    }
}
