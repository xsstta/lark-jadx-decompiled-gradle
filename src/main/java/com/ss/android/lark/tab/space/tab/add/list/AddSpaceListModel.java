package com.ss.android.lark.tab.space.tab.add.list;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32832c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.ak;
import com.ss.android.lark.doc.entity.C36837b;
import com.ss.android.lark.doc.entity.C36838c;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.ISearchLifecycleObserver;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.tab.space.tab.add.list.entity.ModelParserForSearchResponseInAddTab;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectResult;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.tab.space.tab.add.list.service.DocHistoryService;
import com.ss.android.lark.tangram.base.render.DefaultContextIdCreator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0002\u0006\u0012\u0018\u0000 52\u00020\u0001:\u000256B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0$H\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J(\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010+\u001a\u0004\u0018\u00010\"2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020.0-H\u0002J\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0002J\b\u00104\u001a\u000200H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \r*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "viewModel", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;", "(Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;)V", "loadMoreCallback", "com/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$loadMoreCallback$2$1", "getLoadMoreCallback", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$loadMoreCallback$2$1;", "loadMoreCallback$delegate", "Lkotlin/Lazy;", "loginDependency", "Lcom/ss/android/lark/dependency/ILoginDependency;", "kotlin.jvm.PlatformType", "getLoginDependency", "()Lcom/ss/android/lark/dependency/ILoginDependency;", "loginDependency$delegate", "searchCallback", "com/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$searchCallback$2$1", "getSearchCallback", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$searchCallback$2$1;", "searchCallback$delegate", "searchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "getSearchContext", "()Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "searchContext$delegate", "searchLifeCycleObserver", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "getSearchLifeCycleObserver", "()Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "searchLifeCycleObserver$delegate", "buildSearchContext", "searchKey", "", "buildViewDataList", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "historyList", "Lcom/ss/android/lark/doc/entity/DocHistory;", "completeViewDataList", "viewDataList", "getOwnerName", "ownerId", "chatterMap", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "load", "", "loadMore", "loadRecommendData", "loadSearch", "onCreate", "Companion", "WrapperCallback", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceListModel extends Widget {

    /* renamed from: b */
    public static final Companion f136528b = new Companion(null);

    /* renamed from: a */
    public final AddSpaceListViewModel f136529a;

    /* renamed from: c */
    private final Lazy f136530c = LazyKt.lazy(C55320e.INSTANCE);

    /* renamed from: d */
    private final Lazy f136531d = LazyKt.lazy(C55327k.INSTANCE);

    /* renamed from: e */
    private final Lazy f136532e = LazyKt.lazy(C55326j.INSTANCE);

    /* renamed from: f */
    private final Lazy f136533f = LazyKt.lazy(new C55324i(this));

    /* renamed from: g */
    private final Lazy f136534g = LazyKt.lazy(new C55317c(this));

    /* renamed from: g */
    private final AbstractC36450aa m214569g() {
        return (AbstractC36450aa) this.f136530c.getValue();
    }

    /* renamed from: h */
    private final ISearchLifecycleObserver m214570h() {
        return (ISearchLifecycleObserver) this.f136531d.getValue();
    }

    /* renamed from: i */
    private final SearchContext m214571i() {
        return (SearchContext) this.f136532e.getValue();
    }

    /* renamed from: j */
    private final C55324i.C553251 m214572j() {
        return (C55324i.C553251) this.f136533f.getValue();
    }

    /* renamed from: k */
    private final C55317c.C553181 m214573k() {
        return (C55317c.C553181) this.f136534g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$Companion;", "", "()V", "RECOMMEND_PAGE_SIZE", "", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo188564a() {
        mo188566b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$loadMoreCallback$2$1", "invoke", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$loadMoreCallback$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$c */
    public static final class C55317c extends Lambda implements Function0<C553181> {
        final /* synthetic */ AddSpaceListModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55317c(AddSpaceListModel addSpaceListModel) {
            super(0);
            this.this$0 = addSpaceListModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C553181 invoke() {
            return new IGetDataCallback<SpaceSelectResult>(this) {
                /* class com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel.C55317c.C553181 */

                /* renamed from: a */
                final /* synthetic */ C55317c f136538a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f136538a = r1;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f136538a.this$0.f136529a.getErrorLiveData().mo5926a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(SpaceSelectResult bVar) {
                    Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.f136538a.this$0.f136529a.setCanLoadMore(bVar.mo188668a());
                    ArrayList arrayList = new ArrayList();
                    List<SpaceSelectViewData> b = this.f136538a.this$0.f136529a.getSearchListLiveData().mo5927b();
                    if (b != null) {
                        arrayList.addAll(b);
                    }
                    C1177w<List<SpaceSelectViewData>> searchListLiveData = this.f136538a.this$0.f136529a.getSearchListLiveData();
                    arrayList.addAll(this.f136538a.this$0.mo188565b(bVar.mo188669b()));
                    searchListLiveData.mo5926a(arrayList);
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$searchCallback$2$1", "invoke", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$searchCallback$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$i */
    public static final class C55324i extends Lambda implements Function0<C553251> {
        final /* synthetic */ AddSpaceListModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55324i(AddSpaceListModel addSpaceListModel) {
            super(0);
            this.this$0 = addSpaceListModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C553251 invoke() {
            return new IGetDataCallback<SpaceSelectResult>(this) {
                /* class com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel.C55324i.C553251 */

                /* renamed from: a */
                final /* synthetic */ C55324i f136543a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f136543a = r1;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f136543a.this$0.f136529a.getErrorLiveData().mo5926a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(SpaceSelectResult bVar) {
                    Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.f136543a.this$0.f136529a.setCanLoadMore(bVar.mo188668a());
                    this.f136543a.this$0.f136529a.getSearchListLiveData().mo5926a(this.f136543a.this$0.mo188565b(bVar.mo188669b()));
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/dependency/ILoginDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$e */
    static final class C55320e extends Lambda implements Function0<AbstractC36450aa> {
        public static final C55320e INSTANCE = new C55320e();

        C55320e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC36450aa invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134515N();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$j */
    static final class C55326j extends Lambda implements Function0<SearchContext> {
        public static final C55326j INSTANCE = new C55326j();

        C55326j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SearchContext invoke() {
            SearchContext searchContext = new SearchContext();
            searchContext.mo184391a(Scene.Type.SEARCH_DOCS_WIKI_IN_CHAT_SCENE);
            return searchContext;
        }
    }

    /* renamed from: b */
    public final void mo188566b() {
        DocHistoryService.m214632a(20, new C55319d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$k */
    static final class C55327k extends Lambda implements Function0<ISearchLifecycleObserver> {
        public static final C55327k INSTANCE = new C55327k();

        C55327k() {
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

    /* renamed from: c */
    public final void mo121985c() {
        String b = this.f136529a.getSearchKeyLiveData().mo5927b();
        if (b != null) {
            String a = DefaultContextIdCreator.f136648a.mo188788a();
            ISearchLifecycleObserver h = m214570h();
            Intrinsics.checkExpressionValueIsNotNull(b, "this");
            h.mo181873a(a, m214567a(b), new WrapperCallback(this, a, m214572j()));
        }
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        AddSpaceListModel addSpaceListModel = this;
        this.f136529a.getLoadRecommendFlag().mo5923a(addSpaceListModel, new C55321f(this));
        this.f136529a.getLoadSearchFlag().mo5923a(addSpaceListModel, new C55322g(this));
        this.f136529a.getLoadMoreFlag().mo5923a(addSpaceListModel, new C55323h(this));
    }

    /* renamed from: f */
    public final void mo188567f() {
        String b = this.f136529a.getSearchKeyLiveData().mo5927b();
        if (b != null) {
            String a = DefaultContextIdCreator.f136648a.mo188788a();
            ISearchLifecycleObserver h = m214570h();
            Intrinsics.checkExpressionValueIsNotNull(b, "this");
            h.mo181874b(a, m214567a(b), new WrapperCallback(this, a, m214573k()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$loadRecommendData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/doc/entity/DocHistoryResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$d */
    public static final class C55319d implements IGetDataCallback<C36838c> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListModel f136539a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55319d(AddSpaceListModel addSpaceListModel) {
            this.f136539a = addSpaceListModel;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136539a.f136529a.getErrorLiveData().mo5926a(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(C36838c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C1177w<List<SpaceSelectViewData>> recommendListLiveData = this.f136539a.f136529a.getRecommendListLiveData();
            AddSpaceListModel addSpaceListModel = this.f136539a;
            List<C36837b> a = cVar.mo135975a();
            Intrinsics.checkExpressionValueIsNotNull(a, "data.docHistory");
            recommendListLiveData.mo5926a(addSpaceListModel.mo188563a(a));
            this.f136539a.f136529a.setCanLoadMore(false);
        }
    }

    /* renamed from: a */
    private final SearchContext m214567a(String str) {
        SearchContext i = m214571i();
        i.mo184394a(str);
        return i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel$WrapperCallback;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "requestId", "", "callback", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectResult;", "(Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListModel;Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "getCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "getRequestId", "()Ljava/lang/String;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$b */
    public final class WrapperCallback implements IGetDataCallback<SearchResponse> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListModel f136535a;

        /* renamed from: b */
        private final String f136536b;

        /* renamed from: c */
        private final IGetDataCallback<SpaceSelectResult> f136537c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136537c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchResponse searchResponse) {
            Intrinsics.checkParameterIsNotNull(searchResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!(!Intrinsics.areEqual(this.f136536b, searchResponse.getRequestId()))) {
                this.f136537c.onSuccess(ModelParserForSearchResponseInAddTab.f136591a.mo188667a(searchResponse));
            }
        }

        public WrapperCallback(AddSpaceListModel addSpaceListModel, String str, IGetDataCallback<SpaceSelectResult> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "requestId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f136535a = addSpaceListModel;
            this.f136536b = str;
            this.f136537c = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$f */
    static final class C55321f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListModel f136540a;

        C55321f(AddSpaceListModel addSpaceListModel) {
            this.f136540a = addSpaceListModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f136540a.mo188566b();
                this.f136540a.f136529a.getLoadRecommendFlag().mo5926a((Boolean) false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$g */
    static final class C55322g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListModel f136541a;

        C55322g(AddSpaceListModel addSpaceListModel) {
            this.f136541a = addSpaceListModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f136541a.mo121985c();
                this.f136541a.f136529a.getLoadSearchFlag().mo5926a((Boolean) false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListModel$h */
    static final class C55323h<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListModel f136542a;

        C55323h(AddSpaceListModel addSpaceListModel) {
            this.f136542a = addSpaceListModel;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            if (bool.booleanValue()) {
                this.f136542a.mo188567f();
                this.f136542a.f136529a.getLoadMoreFlag().mo5926a((Boolean) false);
            }
        }
    }

    public AddSpaceListModel(AddSpaceListViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f136529a = bVar;
    }

    /* renamed from: b */
    public final List<SpaceSelectViewData> mo188565b(List<SpaceSelectViewData> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<SpaceSelectViewData> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String ownerId = it.next().getOwnerId();
            if (ownerId != null) {
                arrayList.add(ownerId);
            }
        }
        Map<String, Chatter> a = C32835d.m126323c().mo121189a(arrayList);
        for (T t : list2) {
            String ownerId2 = t.getOwnerId();
            Intrinsics.checkExpressionValueIsNotNull(a, "chatterMap");
            t.setOwnerName(m214568a(ownerId2, a));
            Chatter chatter = a.get(t.getOwnerId());
            if (chatter != null) {
                str = chatter.getAvatarKey();
            } else {
                str = null;
            }
            t.setOwnerAvatar(str);
        }
        return list;
    }

    /* renamed from: a */
    public final List<SpaceSelectViewData> mo188563a(List<? extends C36837b> list) {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<? extends C36837b> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo135969e());
        }
        Map<String, Chatter> a = C32835d.m126323c().mo121189a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (T t : list2) {
            SpaceSelectViewData.Builder a2 = SpaceSelectViewData.Companion.mo188666a();
            String i = t.mo135974i();
            Intrinsics.checkExpressionValueIsNotNull(i, "history.docId");
            SpaceSelectViewData.Builder a3 = a2.mo188655a(i);
            String a4 = t.mo135955a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "history.docUrl");
            SpaceSelectViewData.Builder b = a3.mo188660b(a4);
            DocType b2 = t.mo135961b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "history.docType");
            SpaceSelectViewData.Builder c = b.mo188653a(b2).mo188659b(t.mo135965c()).mo188662c(t.mo135969e());
            String e = t.mo135969e();
            Intrinsics.checkExpressionValueIsNotNull(a, "chatterMap");
            SpaceSelectViewData.Builder d = c.mo188663d(m214568a(e, a));
            Chatter chatter = a.get(t.mo135969e());
            if (chatter != null) {
                str = chatter.getAvatarKey();
            } else {
                str = null;
            }
            SpaceSelectViewData.Builder e2 = d.mo188664e(str);
            String d2 = t.mo135967d();
            Intrinsics.checkExpressionValueIsNotNull(d2, "history.title");
            SpaceSelectViewData.Builder a5 = e2.mo188665f(d2).mo188652a(t.mo135971f()).mo188654a(t.mo135973h());
            if (t.mo135972g()) {
                AbstractC36450aa g = m214569g();
                Intrinsics.checkExpressionValueIsNotNull(g, "loginDependency");
                if (!g.mo134399b()) {
                    z = true;
                    arrayList2.add(a5.mo188657a(z).mo188658a());
                }
            }
            z = false;
            arrayList2.add(a5.mo188657a(z).mo188658a());
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final String m214568a(String str, Map<String, ? extends Chatter> map) {
        if (str != null) {
            return C32832c.m126312a().mo121121a((OpenChatter) map.get(str), ChatterNameDisplayRule.NAME);
        }
        return null;
    }
}
