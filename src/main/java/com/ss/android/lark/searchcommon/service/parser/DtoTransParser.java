package com.ss.android.lark.searchcommon.service.parser;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0006\u0018\u00010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/parser/DtoTransParser;", "", "()V", "parseChatterIdsToSearchChatterInfoList", "", "chatterIds", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.a.a */
public final class DtoTransParser {

    /* renamed from: a */
    public static final Companion f133200a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/parser/DtoTransParser$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.service.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.service.a.a$c */
    public static final class RunnableC53903c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f133204a;

        /* renamed from: b */
        final /* synthetic */ List f133205b;

        RunnableC53903c(IGetDataCallback iGetDataCallback, List list) {
            this.f133204a = iGetDataCallback;
            this.f133205b = list;
        }

        public final void run() {
            IGetDataCallback iGetDataCallback = this.f133204a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(this.f133205b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/searchcommon/service/parser/DtoTransParser$parseChatterIdsToSearchChatterInfoList$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", "chatterMap", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.service.a.a$b */
    public static final class C53902b extends UIGetDataCallback<Map<String, ? extends Chatter>> {

        /* renamed from: a */
        final /* synthetic */ List f133201a;

        /* renamed from: b */
        final /* synthetic */ List f133202b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f133203c;

        /* renamed from: a */
        public void onSuccessed(Map<String, ? extends Chatter> map) {
            if (map != null) {
                for (String str : this.f133201a) {
                    Chatter chatter = (Chatter) map.get(str);
                    if (chatter != null) {
                        this.f133202b.add(SearchCommonUtils.m209224a(chatter));
                    }
                }
            }
            IGetDataCallback iGetDataCallback = this.f133203c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(this.f133202b);
            }
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            Log.m165383e("LarkSearch.Common.DtoTransParser", "parseToSearchChatterInfoFromChatterId, onError! msg: " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f133203c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C53902b(List list, List list2, IGetDataCallback iGetDataCallback) {
            this.f133201a = list;
            this.f133202b = list2;
            this.f133203c = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo184287a(List<String> list, IGetDataCallback<List<SearchChatterInfo>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        if (list == null || !(!list.isEmpty())) {
            UICallbackExecutor.execute(new RunnableC53903c(iGetDataCallback, arrayList));
        } else {
            SearchCommonModuleDependency.m208732b().mo102899a(list, new C53902b(list, arrayList, iGetDataCallback));
        }
    }
}
