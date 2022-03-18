package com.ss.android.lark.searchcommon.view.recommend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.ui.p1198b.C26183a;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.recommend.IRecommendPageDataPuller;
import com.ss.android.lark.searchcommon.view.SearchPtrFooter;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.ActionRecommendBinder;
import com.ss.android.lark.searchcommon.view.binder.IOnProfileClickListener;
import com.ss.android.lark.searchcommon.view.binder.OnHistoryTagClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u0001HB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020!J\u0006\u0010$\u001a\u00020\u001bJ\b\u0010%\u001a\u00020\u001bH\u0002J\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bJ\u0014\u0010(\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u001dJ\u0006\u0010*\u001a\u00020\u001bJ\u0016\u0010+\u001a\u00020\u001b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001dJ\b\u0010,\u001a\u00020\u001bH\u0002J\u0014\u0010-\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u001dJ\u0010\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u00010\tJ\u0010\u00101\u001a\u00020\u001b2\b\u00102\u001a\u0004\u0018\u00010\u000fJ\u000e\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0013J\u000e\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:J\u000e\u0010;\u001a\u00020\u001b2\u0006\u00106\u001a\u00020<J\u000e\u0010=\u001a\u00020\u001b2\u0006\u00106\u001a\u00020>J\u0010\u0010?\u001a\u00020\u001b2\b\u00106\u001a\u0004\u0018\u00010@J\u000e\u0010A\u001a\u00020\u001b2\u0006\u00106\u001a\u00020BJ\u000e\u0010C\u001a\u00020\u001b2\u0006\u00106\u001a\u00020DJ\u000e\u0010E\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u0013J\u000e\u0010F\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\u0013R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "mData", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "Lkotlin/collections/LinkedHashSet;", "mDataPuller", "Lcom/ss/android/lark/searchcommon/recommend/IRecommendPageDataPuller;", "mHeadersDecor", "Lcom/larksuite/framework/ui/stickyheader/StickyRecyclerHeadersDecoration;", "mNeedLoadMore", "", "mRecommendAdapter", "Lcom/ss/android/lark/searchcommon/view/recommend/RecommendViewAdapter;", "mRecommendRv", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "recommendPtr", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "appendContent", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "erasePadding", "getTargetData", "position", "", "getTargetViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "grayTitleColor", "initView", "normalRoundHeader", "refresh", "refreshSelected", "selectedList", "removeHistoryItem", "resetContent", "resetHeader", "sameListContent", "newList", "setClickHandler", "clickHandler", "setDataPuller", "dataPuller", "setNeedLoadMore", "needLoadMore", "setOnActionTagClickListener", "listener", "Lcom/ss/android/lark/searchcommon/view/binder/ActionRecommendBinder$OnActionTagClickListener;", "setOnBusinessConsumeItem", "onBusinessConsumeItem", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "setOnClearHistoryListener", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnClearHistoryListener;", "setOnHistoryTagClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/OnHistoryTagClickListener;", "setOnItemOnScreenListener", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemOnScreenListener;", "setOnMoreClickListener", "Lcom/ss/android/lark/searchcommon/view/recommend/IOnMoreClickListener;", "setProfileClickListener", "Lcom/ss/android/lark/searchcommon/view/binder/IOnProfileClickListener;", "showDivider", "switchMultiple", "isMultiple", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DefaultRecommendView extends FrameLayout {

    /* renamed from: d */
    public static final Companion f133808d = new Companion(null);

    /* renamed from: a */
    public IRecommendPageDataPuller f133809a;

    /* renamed from: b */
    public SearchResultViewAdapter.IOnItemClickHandler f133810b;

    /* renamed from: c */
    public boolean f133811c;

    /* renamed from: e */
    private CommonRecyclerView f133812e;

    /* renamed from: f */
    private LKUIPtrClassicFrameLayout f133813f;

    /* renamed from: g */
    private RecommendViewAdapter f133814g;

    /* renamed from: h */
    private LinkedHashSet<SearchBaseInfo> f133815h;

    /* renamed from: i */
    private C26198f f133816i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView$refresh$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView$d */
    public static final class C54044d implements IGetDataCallback<List<? extends SearchBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ DefaultRecommendView f133824a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView$refresh$1$onSuccess$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView$d$a */
        public static final class RunnableC54045a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f133825a;

            /* renamed from: b */
            final /* synthetic */ C54044d f133826b;

            RunnableC54045a(List list, C54044d dVar) {
                this.f133825a = list;
                this.f133826b = dVar;
            }

            public final void run() {
                this.f133826b.f133824a.mo184992a(this.f133825a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54044d(DefaultRecommendView defaultRecommendView) {
            this.f133824a = defaultRecommendView;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends SearchBaseInfo> list) {
            if (list != null) {
                this.f133824a.post(new RunnableC54045a(list, this));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Common.V2.DefaultRecommendView", "error in load recommend page data.");
        }
    }

    /* renamed from: a */
    public final void mo184991a() {
        IRecommendPageDataPuller aVar = this.f133809a;
        if (aVar != null) {
            aVar.mo141031a(new C54044d(this));
        }
    }

    /* renamed from: b */
    public final void mo184995b() {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185031c();
    }

    /* renamed from: c */
    public final void mo184997c() {
        findViewById(R.id.recommend_layout).setPadding(0, 0, 0, 0);
    }

    /* renamed from: d */
    public final void mo184999d() {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185032d();
    }

    /* renamed from: e */
    public final void mo185001e() {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185033e();
    }

    /* renamed from: f */
    private final void m209712f() {
        View findViewById = findViewById(R.id.recommend_rv);
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) findViewById;
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(commonRecyclerView.getContext(), 1, false));
        Context context = commonRecyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        RecommendViewAdapter dVar = new RecommendViewAdapter(context, new C54039b(this));
        commonRecyclerView.setAdapter(dVar);
        this.f133814g = dVar;
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<CommonRecyc…s\n            }\n        }");
        this.f133812e = commonRecyclerView;
        View findViewById2 = findViewById(R.id.recommend_ptr_layout);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) findViewById2;
        SearchPtrFooter searchPtrFooter = new SearchPtrFooter(lKUIPtrClassicFrameLayout.getContext());
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        lKUIPtrClassicFrameLayout.setFooterView(searchPtrFooter);
        lKUIPtrClassicFrameLayout.addPtrUIHandler(searchPtrFooter);
        lKUIPtrClassicFrameLayout.disableWhenHorizontalMove(true);
        lKUIPtrClassicFrameLayout.setForceBackWhenComplete(true);
        lKUIPtrClassicFrameLayout.setEnableScrollContentAfterLoad(true);
        lKUIPtrClassicFrameLayout.setPtrHandler(new C54040c(lKUIPtrClassicFrameLayout, this));
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<LKUIPtrClas…\n            })\n        }");
        this.f133813f = lKUIPtrClassicFrameLayout;
    }

    /* renamed from: g */
    private final void m209713g() {
        IRecommendPageDataPuller aVar = this.f133809a;
        if (aVar == null || aVar.mo141032a()) {
            CommonRecyclerView commonRecyclerView = this.f133812e;
            if (commonRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendRv");
            }
            if (commonRecyclerView.getItemDecorationCount() > 0 && this.f133816i != null) {
                CommonRecyclerView commonRecyclerView2 = this.f133812e;
                if (commonRecyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRecommendRv");
                }
                C26198f fVar = this.f133816i;
                if (fVar == null) {
                    Intrinsics.throwNpe();
                }
                commonRecyclerView2.removeItemDecoration(fVar);
            }
            RecommendViewAdapter dVar = this.f133814g;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
            }
            this.f133816i = new C26183a(dVar);
            CommonRecyclerView commonRecyclerView3 = this.f133812e;
            if (commonRecyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendRv");
            }
            C26198f fVar2 = this.f133816i;
            if (fVar2 == null) {
                Intrinsics.throwNpe();
            }
            commonRecyclerView3.addItemDecoration(fVar2);
        }
    }

    public final void setClickHandler(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        this.f133810b = bVar;
    }

    public final void setDataPuller(IRecommendPageDataPuller aVar) {
        this.f133809a = aVar;
    }

    public final void setNeedLoadMore(boolean z) {
        this.f133811c = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView$initView$1$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView$b */
    public static final class C54039b implements SearchResultViewAdapter.IOnItemClickHandler {

        /* renamed from: a */
        final /* synthetic */ DefaultRecommendView f133817a;

        C54039b(DefaultRecommendView defaultRecommendView) {
            this.f133817a = defaultRecommendView;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
        /* renamed from: a */
        public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            SearchResultViewAdapter.IOnItemClickHandler bVar = this.f133817a.f133810b;
            if (bVar != null) {
                bVar.mo182499a(searchBaseInfo, z, i);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultRecommendView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setOnBusinessConsumeItem(SearchResultView.IOnBusinessConsumeItem cVar) {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185020a(cVar);
    }

    public final void setOnItemOnScreenListener(SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185024a(cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/recommend/DefaultRecommendView$initView$2$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView$c */
    public static final class C54040c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ LKUIPtrClassicFrameLayout f133818a;

        /* renamed from: b */
        final /* synthetic */ DefaultRecommendView f133819b;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "header");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IRecommendPageDataPuller aVar = this.f133819b.f133809a;
            if (aVar != null) {
                aVar.mo141033b(new IGetDataCallback<List<? extends SearchBaseInfo>>(this) {
                    /* class com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView.C54040c.C540411 */

                    /* renamed from: a */
                    final /* synthetic */ C54040c f133820a;

                    {
                        this.f133820a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(final List<? extends SearchBaseInfo> list) {
                        if (list != null) {
                            this.f133820a.f133818a.post(new Runnable() {
                                /* class com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView.C54040c.C540411.RunnableC540421 */

                                public final void run() {
                                    this.f133820a.f133819b.mo184996b(list);
                                    this.f133820a.f133818a.refreshComplete();
                                }
                            });
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Log.m165383e("LarkSearch.Common.V2.DefaultRecommendView", "error in load more recommend page data.");
                        this.f133820a.f133818a.post(new Runnable(this) {
                            /* class com.ss.android.lark.searchcommon.view.recommend.DefaultRecommendView.C54040c.C540411.RunnableC540432 */

                            /* renamed from: a */
                            final /* synthetic */ C540411 f133823a;

                            {
                                this.f133823a = r1;
                            }

                            public final void run() {
                                this.f133823a.f133820a.f133818a.refreshComplete();
                            }
                        });
                    }
                });
            }
        }

        C54040c(LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout, DefaultRecommendView defaultRecommendView) {
            this.f133818a = lKUIPtrClassicFrameLayout;
            this.f133819b = defaultRecommendView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f133819b.f133811c) {
                return false;
            }
            IRecommendPageDataPuller aVar = this.f133819b.f133809a;
            if (aVar != null) {
                z = aVar.mo141034b();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo184993a(boolean z) {
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185028a(z);
    }

    public final void setOnActionTagClickListener(ActionRecommendBinder.OnActionTagClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185021a(aVar);
    }

    public final void setOnClearHistoryListener(IOnClearHistoryListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185025a(aVar);
    }

    public final void setOnHistoryTagClickListener(OnHistoryTagClickListener uVar) {
        Intrinsics.checkParameterIsNotNull(uVar, "listener");
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185023a(uVar);
    }

    public final void setOnMoreClickListener(IOnMoreClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185026a(bVar);
    }

    public final void setProfileClickListener(IOnProfileClickListener oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        dVar.mo185022a(oVar);
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder mo184990a(int i) {
        RecyclerView.ViewHolder viewHolder = null;
        if (i <= 0) {
            return viewHolder;
        }
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        if (i >= dVar.getItems().size()) {
            return viewHolder;
        }
        CommonRecyclerView commonRecyclerView = this.f133812e;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendRv");
        }
        return commonRecyclerView.findViewHolderForAdapterPosition(i);
    }

    /* renamed from: b */
    public final SearchBaseInfo mo184994b(int i) {
        SearchBaseInfo searchBaseInfo = null;
        if (i <= 0) {
            return searchBaseInfo;
        }
        RecommendViewAdapter dVar = this.f133814g;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        if (i >= dVar.getItems().size()) {
            return searchBaseInfo;
        }
        RecommendViewAdapter dVar2 = this.f133814g;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
        }
        return (SearchBaseInfo) dVar2.getItems().get(i);
    }

    /* renamed from: d */
    public final void mo185000d(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedList");
        Iterator<SearchBaseInfo> it = this.f133815h.iterator();
        while (it.hasNext()) {
            SearchBaseInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "item");
            if (next.isSelected() != list.contains(next)) {
                next.selected(list.contains(next));
                RecommendViewAdapter dVar = this.f133814g;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
                }
                dVar.notifyItemChanged(next);
            }
        }
    }

    /* renamed from: a */
    public final void mo184992a(List<? extends SearchBaseInfo> list) {
        if (list != null && !list.isEmpty() && !mo184998c(list)) {
            LinkedHashSet<SearchBaseInfo> linkedHashSet = this.f133815h;
            linkedHashSet.clear();
            linkedHashSet.addAll(list);
            m209713g();
            RecommendViewAdapter dVar = this.f133814g;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
            }
            dVar.resetAll(linkedHashSet);
        }
    }

    /* renamed from: b */
    public final void mo184996b(List<? extends SearchBaseInfo> list) {
        if (list != null) {
            int size = this.f133815h.size();
            List<? extends SearchBaseInfo> list2 = list;
            this.f133815h.addAll(list2);
            RecommendViewAdapter dVar = this.f133814g;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
            }
            dVar.getItems().addAll(list2);
            RecommendViewAdapter dVar2 = this.f133814g;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
            }
            dVar2.notifyItemRangeInserted(size, list.size());
        }
    }

    /* renamed from: c */
    public final boolean mo184998c(List<? extends SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "newList");
        LinkedHashSet<SearchBaseInfo> linkedHashSet = this.f133815h;
        if (linkedHashSet == list) {
            return true;
        }
        if (linkedHashSet.size() != list.size()) {
            return false;
        }
        int i = 0;
        for (T t : this.f133815h) {
            if (!Intrinsics.areEqual(t, (SearchBaseInfo) list.get(i))) {
                return false;
            }
            if (!Intrinsics.areEqual(t.getSession(), ((SearchBaseInfo) list.get(i)).getSession())) {
                t.setSession(((SearchBaseInfo) list.get(i)).getSession());
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133815h = new LinkedHashSet<>();
        this.f133811c = true;
        LayoutInflater.from(context).inflate(R.layout.view_default_recommend, (ViewGroup) this, true);
        m209712f();
    }
}
