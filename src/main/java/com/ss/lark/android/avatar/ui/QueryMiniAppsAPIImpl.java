package com.ss.lark.android.avatar.ui;

import android.app.Application;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J$\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/lark/android/avatar/ui/QueryMiniAppsAPIImpl;", "Lcom/ss/lark/android/avatar/ui/IQueryMiniAppsAPI;", "()V", "doRequest", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "error", "message", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.l */
public final class QueryMiniAppsAPIImpl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/avatar/ui/QueryMiniAppsAPIImpl$doRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.l$a */
    public static final class C64256a implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ QueryMiniAppsAPIImpl f162438a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f162439b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f162439b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            try {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                JSONObject jSONObject = new JSONObject(str);
                if (Intrinsics.areEqual(jSONObject.get("code"), (Object) 0)) {
                    JSONArray jSONArray = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getJSONArray("availableAppList");
                    if (jSONArray.length() > 0) {
                        this.f162439b.onSuccess(CollectionsKt.listOf(jSONArray.getJSONObject(0).getString("mobileApplinkUrl")));
                        return;
                    }
                    QueryMiniAppsAPIImpl lVar = this.f162438a;
                    IGetDataCallback<List<String>> iGetDataCallback = this.f162439b;
                    lVar.mo222708a(iGetDataCallback, "Empty avatar app list: " + str);
                    return;
                }
                QueryMiniAppsAPIImpl lVar2 = this.f162438a;
                IGetDataCallback<List<String>> iGetDataCallback2 = this.f162439b;
                lVar2.mo222708a(iGetDataCallback2, "Response code != 0: " + str);
            } catch (Exception e) {
                this.f162439b.onError(new ErrorResult(e));
            }
        }

        C64256a(QueryMiniAppsAPIImpl lVar, IGetDataCallback iGetDataCallback) {
            this.f162438a = lVar;
            this.f162439b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public void mo222707a(IGetDataCallback<List<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IAvatarModuleDependency a = AvatarModule.f162301b.mo222601a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        a.mo132671a(application, new C64256a(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo222708a(IGetDataCallback<List<String>> iGetDataCallback, String str) {
        iGetDataCallback.onError(new ErrorResult(str));
    }
}
