package com.ss.android.lark.tab.space.list.mvp.base;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.ak;
import com.ss.android.lark.dependency.an;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.entity.CommonListResponse;
import com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract;
import com.ss.android.lark.tab.space.list.util.CommonTabListUtil;
import com.ss.android.lark.tangram.base.render.DefaultContextIdCreator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u00010B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ*\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'H\u0003J\u0010\u0010)\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0016\u0010*\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0'H\u0016J$\u0010,\u001a\u00020#2\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'2\u0006\u0010)\u001a\u00020\rH\u0016J\b\u0010-\u001a\u00020#H\u0016J\u001e\u0010.\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020/0'H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabModel;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "chatId", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "getChatId", "()Ljava/lang/String;", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "mData", "Ljava/util/ArrayList;", "mSearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "getMSearchContext", "()Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "mSearchContext$delegate", "Lkotlin/Lazy;", "mSearchLifecycleObserver", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "getMSearchLifecycleObserver", "()Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "mSearchLifecycleObserver$delegate", "requestId", "getType", "()I", "handleChatInsideSearchSuccess", "", "response", "Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "successCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "loadMore", "loadTimeFormat", "callback", "pull", "reset", "search", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "SearchResponseCallbackWrapper", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a */
public abstract class CommonListTabModel<T extends BaseListViewData> extends BaseModel implements ICommonListTabContract.IModel<T> {

    /* renamed from: a */
    public String f136470a;

    /* renamed from: b */
    private final ArrayList<T> f136471b = new ArrayList<>();

    /* renamed from: c */
    private final Lazy f136472c = LazyKt.lazy(new C55300c(this));

    /* renamed from: d */
    private final Lazy f136473d = LazyKt.lazy(C55301d.INSTANCE);

    /* renamed from: e */
    private boolean f136474e;

    /* renamed from: f */
    private final String f136475f;

    /* renamed from: g */
    private final int f136476g;

    /* renamed from: d */
    private final SearchContext m214475d() {
        return (SearchContext) this.f136472c.getValue();
    }

    /* renamed from: e */
    private final ISearchLifecycleObserver m214476e() {
        return (ISearchLifecycleObserver) this.f136473d.getValue();
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: a */
    public String mo188481a() {
        return this.f136475f;
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: c */
    public boolean mo188485c() {
        return this.f136474e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabModel$pull$wrapperCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$e */
    public static final class C55302e implements IGetDataCallback<CommonListResponse<T>> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabModel f136481a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136482b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$e$a */
        public static final class RunnableC55303a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C55302e f136483a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f136484b;

            RunnableC55303a(C55302e eVar, ErrorResult errorResult) {
                this.f136483a = eVar;
                this.f136484b = errorResult;
            }

            public final void run() {
                this.f136483a.f136482b.onError(this.f136484b);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$e$b */
        public static final class RunnableC55304b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C55302e f136485a;

            /* renamed from: b */
            final /* synthetic */ CommonListResponse f136486b;

            RunnableC55304b(C55302e eVar, CommonListResponse aVar) {
                this.f136485a = eVar;
                this.f136486b = aVar;
            }

            public final void run() {
                this.f136485a.f136481a.mo188512a(this.f136486b.mo188475b());
                this.f136485a.f136481a.mo188511a(this.f136486b, this.f136485a.f136482b);
            }
        }

        /* renamed from: a */
        public void onSuccess(CommonListResponse<T> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "response");
            UICallbackExecutor.execute(new RunnableC55304b(this, aVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC55303a(this, errorResult));
        }

        C55302e(CommonListTabModel aVar, IGetDataCallback iGetDataCallback) {
            this.f136481a = aVar;
            this.f136482b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$c */
    static final class C55300c extends Lambda implements Function0<SearchContext> {
        final /* synthetic */ CommonListTabModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55300c(CommonListTabModel aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SearchContext invoke() {
            CommonListTabModel aVar = this.this$0;
            return aVar.mo188479a(aVar.mo188481a());
        }
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: b */
    public void mo188484b() {
        this.f136471b.clear();
        mo188512a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "kotlin.jvm.PlatformType", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$d */
    static final class C55301d extends Lambda implements Function0<ISearchLifecycleObserver> {
        public static final C55301d INSTANCE = new C55301d();

        C55301d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ISearchLifecycleObserver invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            ak ae = b.ae();
            Intrinsics.checkExpressionValueIsNotNull(ae, "ChatModuleInstanceHolder…ndency().searchDependency");
            return ae.mo134459a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$b */
    static final class RunnableC55299b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommonListTabModel f136479a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136480b;

        RunnableC55299b(CommonListTabModel aVar, IGetDataCallback iGetDataCallback) {
            this.f136479a = aVar;
            this.f136480b = iGetDataCallback;
        }

        public final void run() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            an W = b.mo134524W();
            Intrinsics.checkExpressionValueIsNotNull(W, "ChatModuleInstanceHolder…cy().timeFormatDependency");
            this.f136479a.getCallbackManager().wrapAndAddGetDataCallback(this.f136480b).onSuccess(Boolean.valueOf(W.mo134469a()));
        }
    }

    /* renamed from: b */
    private final void m214474b(String str) {
        m214476e().mo181872a(str);
    }

    /* renamed from: a */
    public void mo188512a(boolean z) {
        this.f136474e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabModel$SearchResponseCallbackWrapper;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "callback", "Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "(Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabModel;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "getCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a$a */
    public final class SearchResponseCallbackWrapper implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabModel f136477a;

        /* renamed from: b */
        private final IGetDataCallback<CommonListResponse<T>> f136478b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136478b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!(!Intrinsics.areEqual(this.f136477a.f136470a, searchResponse.getRequestId()))) {
                this.f136478b.onSuccess(this.f136477a.mo188480a(searchResponse));
            }
        }

        public SearchResponseCallbackWrapper(CommonListTabModel aVar, IGetDataCallback<CommonListResponse<T>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f136477a = aVar;
            this.f136478b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: a */
    public void mo188482a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC55299b(this, iGetDataCallback));
    }

    /* renamed from: a */
    private final void m214473a(String str, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m214476e().mo181873a(str, m214475d(), iGetDataCallback);
    }

    public CommonListTabModel(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f136475f = str;
        this.f136476g = i;
    }

    /* renamed from: a */
    public final void mo188511a(CommonListResponse<T> aVar, IGetDataCallback<List<T>> iGetDataCallback) {
        List<T> a = CommonTabListUtil.f136450a.mo188437a(this.f136471b, aVar.mo188474a());
        if (!CollectionUtils.isEmpty(a)) {
            this.f136471b.addAll(a);
        }
        iGetDataCallback.onSuccess(this.f136471b);
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: a */
    public void mo188483a(IGetDataCallback<List<T>> iGetDataCallback, boolean z) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C55302e eVar = new C55302e(this, iGetDataCallback);
        this.f136470a = DefaultContextIdCreator.f136648a.mo188788a();
        SearchResponseCallbackWrapper aVar = new SearchResponseCallbackWrapper(this, eVar);
        if (!z) {
            String str = this.f136470a;
            if (str != null) {
                m214473a(str, aVar);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String str2 = this.f136470a;
        if (str2 != null) {
            m214474b(str2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
