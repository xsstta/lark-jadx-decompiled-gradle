package com.ss.android.lark.integrator.todo.dependency;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.todo.dependency.entity.SearchChatterResult;
import com.ss.android.lark.todo.dependency.entity.SearchInfo;
import com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoSearch;", "Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "()V", "openSearchPage", "", "context", "Landroid/content/Context;", "titleKey", "", "titleHeight", "", "searchChatter", "key", "count", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/dependency/entity/SearchChatterResult;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.r */
public final class TodoSearch implements ISearchModuleDependency {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/todo/dependency/TodoSearch$searchChatter$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.a.r$a */
    public static final class C40055a implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f101802a;

        /* renamed from: b */
        final /* synthetic */ String f101803b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f101802a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            if (searchResponse == null) {
                IGetDataCallback iGetDataCallback = this.f101802a;
                iGetDataCallback.onError(new ErrorResult("search chatter result is null for key " + this.f101803b));
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<SearchBaseInfo> infoList = searchResponse.getInfoList();
            Intrinsics.checkExpressionValueIsNotNull(infoList, "data.infoList");
            for (T t : infoList) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                String title = t.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "it.title");
                String subTitle = t.getSubTitle();
                Intrinsics.checkExpressionValueIsNotNull(subTitle, "it.subTitle");
                String id = t.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "it.id");
                String avatarKey = t.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "it.avatarKey");
                arrayList.add(new SearchInfo(title, subTitle, id, avatarKey, t.isCrossTenant()));
            }
            String query = searchResponse.getQuery();
            Intrinsics.checkExpressionValueIsNotNull(query, "data.query");
            this.f101802a.onSuccess(new SearchChatterResult(query, searchResponse.getTotal(), searchResponse.isHasMore(), arrayList));
        }

        C40055a(IGetDataCallback iGetDataCallback, String str) {
            this.f101802a = iGetDataCallback;
            this.f101803b = str;
        }
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency
    /* renamed from: a */
    public void mo145424a(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "titleKey");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openSearchMainPageFromTodo(context, "", str, i);
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency
    /* renamed from: a */
    public void mo145425a(String str, int i, IGetDataCallback<SearchChatterResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).searchUser(str, C53234a.m205877a(), true, true, 0, i, false, null, new C40055a(iGetDataCallback, str));
    }
}
