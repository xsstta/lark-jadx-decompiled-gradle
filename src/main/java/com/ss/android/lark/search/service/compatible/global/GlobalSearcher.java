package com.ss.android.lark.search.service.compatible.global;

import android.util.SparseArray;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.search.impl.func.global.search.order.SearchOrderManager;
import com.ss.android.lark.search.service.compatible.BaseSearcher;
import com.ss.android.lark.search.service.compatible.SearcherForCalendarEvent;
import com.ss.android.lark.search.service.compatible.SearcherForCard;
import com.ss.android.lark.search.service.compatible.SearcherForChatter;
import com.ss.android.lark.search.service.compatible.SearcherForDoc;
import com.ss.android.lark.search.service.compatible.SearcherForGroup;
import com.ss.android.lark.search.service.compatible.SearcherForHelpDesk;
import com.ss.android.lark.search.service.compatible.SearcherForMessage;
import com.ss.android.lark.search.service.compatible.SearcherForOpenApp;
import com.ss.android.lark.search.service.compatible.SearcherForSmartSearch;
import com.ss.android.lark.search.service.compatible.SearcherForThread;
import com.ss.android.lark.search.service.localSearcher.LocalChatSearcher;
import com.ss.android.lark.search.service.localSearcher.LocalChatterSearcher;
import com.ss.android.lark.search.service.localSearcher.LocalEmptySearcher;
import com.ss.android.lark.search.service.localSearcher.LocalMessageSearcher;
import com.ss.android.lark.search.service.localSearcher.LocalThreadSearcher;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\tH\u0016J \u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J \u0010\u001f\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/global/GlobalSearcher;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "globalSearchOrderData", "Lcom/ss/android/lark/search/impl/func/global/search/entity/GlobalSearchOrderData;", "mLocalSearcherArray", "Landroid/util/SparseArray;", "mNetSearcherArray", "mSearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "generateErrorResponse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "context", "requestId", "", ShareHitPoint.f121869d, "", "from", "imprId", "needQACard", "", "needServiceCard", "onSuggestionError", "", "onSuggestionSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "searchType", "parseBusinessParams", "v1Search", "session", "seqId", "v2Search", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.a.a */
public final class GlobalSearcher extends BaseSearcher {

    /* renamed from: c */
    public static final Companion f131677c = new Companion(null);

    /* renamed from: d */
    private GlobalSearchOrderData f131678d;

    /* renamed from: e */
    private SearchContext f131679e;

    /* renamed from: f */
    private final SparseArray<BaseSearcher> f131680f;

    /* renamed from: g */
    private final SparseArray<BaseSearcher> f131681g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/global/GlobalSearcher$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    private final boolean m206121j() {
        return C53258a.m205939a().mo181745a("lark.search.mobile.qa.card");
    }

    /* renamed from: k */
    private final boolean m206122k() {
        return C53258a.m205939a().mo181745a("lark.search.mobile.service.card");
    }

    public GlobalSearcher() {
        SparseArray<BaseSearcher> sparseArray = new SparseArray<>();
        this.f131680f = sparseArray;
        SparseArray<BaseSearcher> sparseArray2 = new SparseArray<>();
        this.f131681g = sparseArray2;
        boolean j = m206121j();
        boolean k = m206122k();
        sparseArray.put(1, new LocalChatterSearcher());
        sparseArray.put(2, new LocalChatSearcher());
        sparseArray.put(3, new LocalMessageSearcher());
        sparseArray.put(10, new LocalEmptySearcher(Scene.Type.SEARCH_HELP_DESK));
        sparseArray.put(6, new LocalEmptySearcher(Scene.Type.SEARCH_SPACE));
        sparseArray.put(8, new LocalThreadSearcher());
        sparseArray.put(12, new LocalEmptySearcher(Scene.Type.SEARCH_OPEN_APP_SCENE));
        sparseArray.put(10000004, new LocalEmptySearcher(Scene.Type.SEARCH_CALENDAR_EVENT));
        sparseArray.put(100000012, new LocalEmptySearcher(Scene.Type.SMART_SEARCH));
        sparseArray.put(100000015, new LocalEmptySearcher(Scene.Type.SEARCH_CARDS));
        sparseArray2.put(1, new SearcherForChatter());
        sparseArray2.put(2, new SearcherForGroup());
        sparseArray2.put(3, new SearcherForMessage());
        sparseArray2.put(10, new SearcherForHelpDesk());
        sparseArray2.put(6, new SearcherForDoc());
        sparseArray2.put(8, new SearcherForThread());
        sparseArray2.put(12, new SearcherForOpenApp());
        sparseArray2.put(10000004, new SearcherForCalendarEvent());
        sparseArray2.put(100000012, new SearcherForSmartSearch());
        sparseArray2.put(100000015, new SearcherForCard(j, k));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/service/compatible/global/GlobalSearcher$v1Search$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.a.a$b */
    public static final class C53283b implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ GlobalSearcher f131682a;

        /* renamed from: b */
        final /* synthetic */ String f131683b;

        /* renamed from: c */
        final /* synthetic */ Integer f131684c;

        /* renamed from: d */
        final /* synthetic */ SearchContext f131685d;

        /* renamed from: e */
        final /* synthetic */ String f131686e;

        /* renamed from: f */
        final /* synthetic */ int f131687f;

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165379d("LarkSearch.Search.V2.GlobalSearcher", "V1 net search, requestId: " + this.f131683b + ", onSuccess");
            Integer num = this.f131684c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            searchResponse.setResultType(num.intValue());
            searchResponse.setFrom(1);
            this.f131682a.mo181850b().onSuccess(searchResponse);
            GlobalSearcher aVar = this.f131682a;
            Integer num2 = this.f131684c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar.mo181867a(searchResponse, num2.intValue(), 1);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.GlobalSearcher", "v1 net search , requestId: " + this.f131683b + ", onError, msg: " + errorResult.getDisplayMsg());
            GlobalSearcher aVar = this.f131682a;
            SearchContext searchContext = this.f131685d;
            String str = this.f131683b;
            Integer num = this.f131684c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            this.f131682a.mo181850b().onSuccess(GlobalSearcher.m206120a(aVar, searchContext, str, num.intValue(), 1, null, 16, null));
            GlobalSearcher aVar2 = this.f131682a;
            SearchContext searchContext2 = this.f131685d;
            String str2 = this.f131683b;
            Integer num2 = this.f131684c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar2.mo181868a(searchContext2, str2, num2.intValue(), 1);
        }

        C53283b(GlobalSearcher aVar, String str, Integer num, SearchContext searchContext, String str2, int i) {
            this.f131682a = aVar;
            this.f131683b = str;
            this.f131684c = num;
            this.f131685d = searchContext;
            this.f131686e = str2;
            this.f131687f = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/service/compatible/global/GlobalSearcher$v1Search$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.a.a$c */
    public static final class C53284c implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ GlobalSearcher f131688a;

        /* renamed from: b */
        final /* synthetic */ String f131689b;

        /* renamed from: c */
        final /* synthetic */ Integer f131690c;

        /* renamed from: d */
        final /* synthetic */ SearchContext f131691d;

        /* renamed from: e */
        final /* synthetic */ String f131692e;

        /* renamed from: f */
        final /* synthetic */ int f131693f;

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165379d("LarkSearch.Search.V2.GlobalSearcher", "V1 local search, requestId: " + this.f131689b + ", onSuccess");
            Integer num = this.f131690c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            searchResponse.setResultType(num.intValue());
            searchResponse.setFrom(0);
            this.f131688a.mo181850b().onSuccess(searchResponse);
            GlobalSearcher aVar = this.f131688a;
            Integer num2 = this.f131690c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar.mo181867a(searchResponse, num2.intValue(), 0);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.GlobalSearcher", "V1 local search, requestId: " + this.f131689b + ", onError, msg: " + errorResult.getDisplayMsg());
            GlobalSearcher aVar = this.f131688a;
            SearchContext searchContext = this.f131691d;
            String str = this.f131689b;
            Integer num = this.f131690c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            this.f131688a.mo181850b().onSuccess(GlobalSearcher.m206120a(aVar, searchContext, str, num.intValue(), 0, null, 16, null));
            GlobalSearcher aVar2 = this.f131688a;
            SearchContext searchContext2 = this.f131691d;
            String str2 = this.f131689b;
            Integer num2 = this.f131690c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar2.mo181868a(searchContext2, str2, num2.intValue(), 0);
        }

        C53284c(GlobalSearcher aVar, String str, Integer num, SearchContext searchContext, String str2, int i) {
            this.f131688a = aVar;
            this.f131689b = str;
            this.f131690c = num;
            this.f131691d = searchContext;
            this.f131692e = str2;
            this.f131693f = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/service/compatible/global/GlobalSearcher$v2Search$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.a.a$d */
    public static final class C53285d implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ GlobalSearcher f131694a;

        /* renamed from: b */
        final /* synthetic */ String f131695b;

        /* renamed from: c */
        final /* synthetic */ Integer f131696c;

        /* renamed from: d */
        final /* synthetic */ SearchContext f131697d;

        /* renamed from: e */
        final /* synthetic */ String f131698e;

        /* renamed from: f */
        final /* synthetic */ int f131699f;

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165379d("LarkSearch.Search.V2.GlobalSearcher", "V2 search callBack: " + this + ", requestId: " + this.f131695b + ", data.requestId: " + searchResponse.getRequestId() + ", onSuccess, scene:" + this.f131696c + ", query:" + this.f131697d.mo184397b());
            Integer num = this.f131696c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            searchResponse.setResultType(num.intValue());
            searchResponse.setFrom(1);
            this.f131694a.mo181850b().onSuccess(searchResponse);
            GlobalSearcher aVar = this.f131694a;
            Integer num2 = this.f131696c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar.mo181867a(searchResponse, num2.intValue(), 1);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.GlobalSearcher", " V2 search, requestId: " + this.f131695b + ", onError, msg: " + errorResult.getDisplayMsg());
            GlobalSearcher aVar = this.f131694a;
            SearchContext searchContext = this.f131697d;
            String str = this.f131695b;
            Integer num = this.f131696c;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            int intValue = num.intValue();
            this.f131694a.mo181850b().onSuccess(aVar.mo181866a(searchContext, str, intValue, 1, this.f131698e + '_' + this.f131699f));
            GlobalSearcher aVar2 = this.f131694a;
            SearchContext searchContext2 = this.f131697d;
            String str2 = this.f131695b;
            Integer num2 = this.f131696c;
            Intrinsics.checkExpressionValueIsNotNull(num2, ShareHitPoint.f121869d);
            aVar2.mo181868a(searchContext2, str2, num2.intValue(), 1);
        }

        C53285d(GlobalSearcher aVar, String str, Integer num, SearchContext searchContext, String str2, int i) {
            this.f131694a = aVar;
            this.f131695b = str;
            this.f131696c = num;
            this.f131697d = searchContext;
            this.f131698e = str2;
            this.f131699f = i;
        }
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131678d = SearchOrderManager.f132393b.mo182934a(searchContext.mo184434o());
        this.f131679e = searchContext;
    }

    /* renamed from: a */
    public final void mo181867a(SearchResponse searchResponse, int i, int i2) {
        Integer num;
        if (i == 100000015) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuggestionSuccess, suggestion list size: ");
            List<SearchBaseInfo> suggestionList = searchResponse.getSuggestionList();
            if (suggestionList != null) {
                num = Integer.valueOf(suggestionList.size());
            } else {
                num = null;
            }
            sb.append(num);
            Log.m165379d("LarkSearch.Search.V2.GlobalSearcher", sb.toString());
            SearchResponse searchResponse2 = new SearchResponse();
            searchResponse2.setQuery(searchResponse.getQuery());
            searchResponse2.setRequestId(searchResponse.getRequestId());
            searchResponse2.setFrom(i2);
            searchResponse2.setInfoList(searchResponse.getSuggestionList());
            List<SearchBaseInfo> suggestionList2 = searchResponse.getSuggestionList();
            Intrinsics.checkExpressionValueIsNotNull(suggestionList2, "data.suggestionList");
            if (!suggestionList2.isEmpty()) {
                SearchBaseInfo searchBaseInfo = searchResponse.getSuggestionList().get(0);
                Intrinsics.checkExpressionValueIsNotNull(searchBaseInfo, "data.suggestionList[0]");
                searchResponse2.setResultType(searchBaseInfo.getType());
            } else {
                searchResponse2.setResultType(100000014);
            }
            mo181850b().onSuccess(searchResponse2);
        }
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Iterator<Integer> it;
        GlobalSearcher aVar = this;
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchContext searchContext = aVar.f131679e;
        if (searchContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchContext");
        }
        GlobalSearchOrderData globalSearchOrderData = aVar.f131678d;
        if (globalSearchOrderData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchOrderData");
        }
        Iterator<Integer> it2 = globalSearchOrderData.getSearchOrderList().iterator();
        while (it2.hasNext()) {
            Integer next = it2.next();
            SparseArray<BaseSearcher> sparseArray = aVar.f131681g;
            Intrinsics.checkExpressionValueIsNotNull(next, ShareHitPoint.f121869d);
            BaseSearcher aVar2 = sparseArray.get(next.intValue());
            if (aVar2 != null) {
                SearchContext searchContext2 = aVar.f131679e;
                if (searchContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSearchContext");
                }
                it = it2;
                aVar2.mo181847a(searchContext2, new C53283b(this, str, next, searchContext, str2, i));
                aVar2.mo181854b(str, str2, i);
            } else {
                it = it2;
            }
            it2 = it;
        }
        GlobalSearchOrderData globalSearchOrderData2 = aVar.f131678d;
        if (globalSearchOrderData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchOrderData");
        }
        for (Integer num : globalSearchOrderData2.getSearchOrderList()) {
            SparseArray<BaseSearcher> sparseArray2 = aVar.f131680f;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            BaseSearcher aVar3 = sparseArray2.get(num.intValue());
            if (aVar3 != null) {
                SearchContext searchContext3 = aVar.f131679e;
                if (searchContext3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSearchContext");
                }
                aVar3.mo181847a(searchContext3, new C53284c(this, str, num, searchContext, str2, i));
                aVar3.mo181854b(str, str2, i);
            }
            aVar = this;
        }
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchContext searchContext = this.f131679e;
        if (searchContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchContext");
        }
        GlobalSearchOrderData globalSearchOrderData = this.f131678d;
        if (globalSearchOrderData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchOrderData");
        }
        for (Integer num : globalSearchOrderData.getSearchOrderList()) {
            SparseArray<BaseSearcher> sparseArray = this.f131681g;
            Intrinsics.checkExpressionValueIsNotNull(num, ShareHitPoint.f121869d);
            BaseSearcher aVar = sparseArray.get(num.intValue());
            Log.m165379d("LarkSearch.Search.V2.GlobalSearcher", "V2 search, requestId: " + str + ", onStart, scene:" + num + ", query:" + searchContext.mo184397b());
            if (aVar != null) {
                SearchContext searchContext2 = this.f131679e;
                if (searchContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSearchContext");
                }
                aVar.mo181847a(searchContext2, new C53285d(this, str, num, searchContext, str2, i));
                aVar.mo181853b(str);
                aVar.mo181857c(str2);
                aVar.mo181856c(i);
                aVar.mo181858c(str, str2, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo181868a(SearchContext searchContext, String str, int i, int i2) {
        if (i == 100000015) {
            mo181850b().onSuccess(m206120a(this, searchContext, str, 100000014, i2, null, 16, null));
        }
    }

    /* renamed from: a */
    public final SearchResponse mo181866a(SearchContext searchContext, String str, int i, int i2, String str2) {
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setErrorResponse(true);
        searchResponse.setQuery(searchContext.mo184397b());
        searchResponse.setRequestId(str);
        searchResponse.setFrom(i2);
        searchResponse.setResultType(i);
        searchResponse.setImprId(str2);
        return searchResponse;
    }

    /* renamed from: a */
    static /* synthetic */ SearchResponse m206120a(GlobalSearcher aVar, SearchContext searchContext, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            str2 = "";
        }
        return aVar.mo181866a(searchContext, str, i, i2, str2);
    }
}
