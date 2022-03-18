package com.ss.android.lark.tab.space.list.mvp.base;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract;
import com.ss.android.lark.tab.space.list.mvp.base.adapter.CommonListTabAdapter;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.util.C59252a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000 ]*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\\]B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020:H\u0016J\b\u0010F\u001a\u00020CH\u0016J\b\u0010G\u001a\u00020CH\u0016J\n\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020CH\u0016J\b\u0010K\u001a\u00020CH\u0002J\b\u0010L\u001a\u00020CH\u0002J\b\u0010M\u001a\u00020CH\u0002J\b\u0010N\u001a\u00020CH\u0016J\u0010\u0010O\u001a\u00020C2\u0006\u0010E\u001a\u00020:H\u0016J\u0010\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020RH\u0016J\u0018\u0010S\u001a\u00020C2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010=H\u0016J\b\u0010U\u001a\u00020CH\u0016J\u0010\u0010V\u001a\u00020C2\u0006\u0010W\u001a\u00020RH\u0016J\b\u0010X\u001a\u00020CH\u0016J\u001e\u0010Y\u001a\u00020C2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000[2\u0006\u0010W\u001a\u00020RH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R!\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(8BX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u000e\u0010-\u001a\u00020.X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001e\u00102\u001a\u0002038\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;X\u0004¢\u0006\u0002\n\u0000R\"\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006^"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "hostActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getHostActivity", "()Landroid/app/Activity;", "mAdapter", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter;", "getMAdapter", "()Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter;", "setMAdapter", "(Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter;)V", "mContentRV", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "getMContentRV", "()Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "setMContentRV", "(Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;)V", "mEmptyHolder", "Landroid/view/View;", "getMEmptyHolder", "()Landroid/view/View;", "setMEmptyHolder", "(Landroid/view/View;)V", "mEmptyMarkIV", "Landroid/widget/ImageView;", "getMEmptyMarkIV", "()Landroid/widget/ImageView;", "setMEmptyMarkIV", "(Landroid/widget/ImageView;)V", "mEmptyMarkTV", "Landroid/widget/TextView;", "getMEmptyMarkTV", "()Landroid/widget/TextView;", "setMEmptyMarkTV", "(Landroid/widget/TextView;)V", "mHandler", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$CommonListTabHandler;", "getMHandler", "()Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$CommonListTabHandler;", "mHandler$delegate", "Lkotlin/Lazy;", "mLastRefreshTime", "", "mLoadingView", "getMLoadingView", "setMLoadingView", "mPtrFrame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "getMPtrFrame", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "setMPtrFrame", "(Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;)V", "mScrollListener", "Ljava/util/ArrayList;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Lkotlin/collections/ArrayList;", "mViewDelegate", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "getMViewDelegate", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "setMViewDelegate", "(Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;)V", "addFirstItemDecoration", "", "addOnListScrollListener", "listener", "create", "destroy", "getContext", "Landroid/content/Context;", "hideLoading", "initPullToRefresh", "initRecycleView", "initView", "pullData", "removeOnListScrollListener", "setIs24HourFormat", "is24Hour", "", "setViewDelegate", "viewDelegate", "showEmptyResultView", "showFailedView", "loadMore", "showLoading", "showResult", "resultList", "", "CommonListTabHandler", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CommonListTabView<T extends BaseListViewData> implements ICommonListTabContract.IView<T> {

    /* renamed from: b */
    public static final Companion f136455b = new Companion(null);

    /* renamed from: a */
    public final ArrayList<RecyclerView.OnScrollListener> f136456a = new ArrayList<>();

    /* renamed from: c */
    private CommonListTabAdapter<T> f136457c;

    /* renamed from: d */
    private ICommonListTabContract.IView.Delegate<T> f136458d;

    /* renamed from: e */
    private final Lazy f136459e = LazyKt.lazy(new C55298g(this));

    /* renamed from: f */
    private long f136460f;

    /* renamed from: g */
    private final Activity f136461g;
    @BindView(7488)
    public CommonRecyclerView mContentRV;
    @BindView(7645)
    public View mEmptyHolder;
    @BindView(7644)
    public ImageView mEmptyMarkIV;
    @BindView(7643)
    public TextView mEmptyMarkTV;
    @BindView(JosStatusCodes.RTN_CODE_PARAMS_ERROR)
    public View mLoadingView;
    @BindView(8453)
    public LKUIPtrClassicFrameLayout mPtrFrame;

    /* renamed from: k */
    private final CommonListTabHandler<T> m214447k() {
        return (CommonListTabHandler) this.f136459e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$Companion;", "", "()V", "DEFAULT_THRESHOLD", "", "LIMIT_REFRESH_INTERVAL", "LOADING_DELAY", "", "MSG_LOADING", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ICommonListTabContract.IView.Delegate<T> mo188502g() {
        return this.f136458d;
    }

    /* renamed from: j */
    public final Activity mo188505j() {
        return this.f136461g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$CommonListTabHandler;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$g */
    static final class C55298g extends Lambda implements Function0<CommonListTabHandler<T>> {
        final /* synthetic */ CommonListTabView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55298g(CommonListTabView commonListTabView) {
            super(0);
            this.this$0 = commonListTabView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CommonListTabHandler<T> invoke() {
            return new CommonListTabHandler<>(this.this$0);
        }
    }

    /* renamed from: l */
    private final void m214448l() {
        m214449m();
        m214451o();
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: b */
    public Context mo188490b() {
        return this.f136461g;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f136458d = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$initRecycleView$1$3$1", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "im_chat_chat_productionUsRelease", "com/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$f */
    public static final class C55297f implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ CommonListTabAdapter f136466a;

        /* renamed from: b */
        final /* synthetic */ CommonListTabView f136467b;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            return this.f136466a.getItemCount() - 10;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            boolean z;
            if (this.f136467b.mo188502g() == null) {
                return false;
            }
            ICommonListTabContract.IView.Delegate<T> g = this.f136467b.mo188502g();
            if (g != null) {
                z = g.mo188497b();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }

        C55297f(CommonListTabAdapter bVar, CommonListTabView commonListTabView) {
            this.f136466a = bVar;
            this.f136467b = commonListTabView;
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        Activity activity = this.f136461g;
        if (activity != null) {
            ButterKnife.bind(this, activity);
            m214448l();
        }
    }

    /* renamed from: d */
    public final LKUIPtrClassicFrameLayout mo188499d() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        return lKUIPtrClassicFrameLayout;
    }

    /* renamed from: e */
    public final View mo188500e() {
        View view = this.mLoadingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        }
        return view;
    }

    /* renamed from: f */
    public final ImageView mo188501f() {
        ImageView imageView = this.mEmptyMarkIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyMarkIV");
        }
        return imageView;
    }

    /* renamed from: i */
    public void mo188504i() {
        m214447k().sendEmptyMessageDelayed(1, 200);
    }

    /* renamed from: n */
    private final void m214450n() {
        int dimens = UIHelper.getDimens(R.dimen.title_height);
        int dp2px = UIHelper.dp2px((float) 50);
        CommonRecyclerView commonRecyclerView = this.mContentRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
        }
        commonRecyclerView.addItemDecoration(new FirstItemPaddingDecoration(dimens + dp2px));
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: c */
    public void mo188492c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f136460f > ((long) 600000)) {
            mo188504i();
            View view = this.mEmptyHolder;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyHolder");
            }
            view.setVisibility(8);
            CommonListTabAdapter<T> bVar = this.f136457c;
            if (bVar != null) {
                bVar.clear();
            }
            ICommonListTabContract.IView.Delegate<T> aVar = this.f136458d;
            if (aVar != null) {
                aVar.mo188495a(true);
            }
            this.f136460f = currentTimeMillis;
        }
    }

    /* renamed from: m */
    private final void m214449m() {
        Activity activity = this.f136461g;
        if (activity != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, 1, false);
            CommonRecyclerView commonRecyclerView = this.mContentRV;
            if (commonRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
            }
            commonRecyclerView.setLayoutManager(linearLayoutManager);
            this.f136457c = new CommonListTabAdapter<>(this.f136461g, new C55295d(this));
            CommonRecyclerView commonRecyclerView2 = this.mContentRV;
            if (commonRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
            }
            commonRecyclerView2.setAdapter(this.f136457c);
            CommonRecyclerView commonRecyclerView3 = this.mContentRV;
            if (commonRecyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
            }
            commonRecyclerView3.setOverScrollMode(2);
            CommonRecyclerView commonRecyclerView4 = this.mContentRV;
            if (commonRecyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
            }
            commonRecyclerView4.addOnScrollListener(new C55296e(this));
            CommonListTabAdapter<T> bVar = this.f136457c;
            if (bVar != null) {
                Activity activity2 = this.f136461g;
                LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
                if (lKUIPtrClassicFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
                }
                CommonRecyclerView commonRecyclerView5 = this.mContentRV;
                if (commonRecyclerView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
                }
                C59252a.m230151a(activity2, lKUIPtrClassicFrameLayout, commonRecyclerView5, new C55297f(bVar, this));
            }
            m214450n();
        }
    }

    /* renamed from: o */
    private final void m214451o() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f136461g);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout2.setFooterView(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout3.addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout4 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout4.disableWhenHorizontalMove(true);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout5 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout5.setPtrHandler(new C55294c(this));
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: a */
    public void mo188486a() {
        if (m214447k().hasMessages(1)) {
            m214447k().removeMessages(1);
        }
        View view = this.mLoadingView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
        }
        view.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.setVisibility(0);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        if (lKUIPtrClassicFrameLayout2.isRefreshing()) {
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout3 = this.mPtrFrame;
            if (lKUIPtrClassicFrameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
            }
            lKUIPtrClassicFrameLayout3.refreshComplete();
        }
    }

    /* renamed from: h */
    public void mo188503h() {
        this.f136460f = 0;
        CommonRecyclerView commonRecyclerView = this.mContentRV;
        if (commonRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
        }
        commonRecyclerView.setVisibility(8);
        View view = this.mEmptyHolder;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyHolder");
        }
        view.setVisibility(0);
        TextView textView = this.mEmptyMarkTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyMarkTV");
        }
        textView.setText(UIHelper.getString(R.string.Lark_Legacy_PullEmptyResult));
        ImageView imageView = this.mEmptyMarkIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyMarkIV");
        }
        imageView.setImageResource(R.drawable.icon_no_content);
        View view2 = this.mEmptyHolder;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyHolder");
        }
        C57582a.m223615c(view2);
    }

    /* renamed from: a */
    public void setViewDelegate(ICommonListTabContract.IView.Delegate<T> aVar) {
        this.f136458d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$c */
    public static final class C55294c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ CommonListTabView f136463a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55294c(CommonListTabView commonListTabView) {
            this.f136463a = commonListTabView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            ICommonListTabContract.IView.Delegate<T> g = this.f136463a.mo188502g();
            if (g != null) {
                g.mo188493a();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            boolean checkCanDoLoadMore = super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2);
            ICommonListTabContract.IView.Delegate<T> g = this.f136463a.mo188502g();
            if (g != null) {
                z = g.mo188497b();
            } else {
                z = false;
            }
            if (!z || !checkCanDoLoadMore) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J'\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$initRecycleView$1$1", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabAdapter$OnItemClickListener;", "onItemClick", "", "viewData", "position", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;I)V", "onItemPartialClick", "partialClickAction", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;ILjava/lang/String;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$d */
    public static final class C55295d implements CommonListTabAdapter.OnItemClickListener<T> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabView f136464a;

        C55295d(CommonListTabView commonListTabView) {
            this.f136464a = commonListTabView;
        }

        @Override // com.ss.android.lark.tab.space.list.mvp.base.adapter.CommonListTabAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo188507a(T t, int i) {
            Intrinsics.checkParameterIsNotNull(t, "viewData");
            KeyboardUtils.hideKeyboard(this.f136464a.mo188505j());
            ICommonListTabContract.IView.Delegate<T> g = this.f136464a.mo188502g();
            if (g != null) {
                g.mo188494a(t, i);
            }
        }

        @Override // com.ss.android.lark.tab.space.list.mvp.base.adapter.CommonListTabAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo188508a(T t, int i, String str) {
            Intrinsics.checkParameterIsNotNull(t, "viewData");
            KeyboardUtils.hideKeyboard(this.f136464a.mo188505j());
            ICommonListTabContract.IView.Delegate<T> g = this.f136464a.mo188502g();
            if (g != null) {
                g.mo188496b(t, i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$initRecycleView$1$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$e */
    public static final class C55296e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CommonListTabView f136465a;

        C55296e(CommonListTabView commonListTabView) {
            this.f136465a = commonListTabView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            KeyboardUtils.hideKeyboard(this.f136465a.mo188505j());
            Iterator<T> it = this.f136465a.f136456a.iterator();
            while (it.hasNext()) {
                it.next().onScrollStateChanged(recyclerView, i);
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView$CommonListTabHandler;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Landroid/os/Handler;", "view", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView;", "(Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView;)V", "mReference", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView$a */
    public static final class CommonListTabHandler<T extends BaseListViewData> extends Handler {

        /* renamed from: a */
        private WeakReference<CommonListTabView<T>> f136462a;

        public CommonListTabHandler(CommonListTabView<T> commonListTabView) {
            Intrinsics.checkParameterIsNotNull(commonListTabView, "view");
            this.f136462a = new WeakReference<>(commonListTabView);
        }

        public void handleMessage(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "msg");
            CommonListTabView<T> commonListTabView = this.f136462a.get();
            if (message.what == 1 && commonListTabView != null) {
                commonListTabView.mo188500e().setVisibility(0);
                commonListTabView.mo188499d().setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: a */
    public void mo188487a(RecyclerView.OnScrollListener onScrollListener) {
        Intrinsics.checkParameterIsNotNull(onScrollListener, "listener");
        this.f136456a.add(onScrollListener);
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: b */
    public void mo188491b(boolean z) {
        CommonListTabAdapter<T> bVar = this.f136457c;
        if (bVar != null) {
            bVar.mo188523a(z);
        }
    }

    public CommonListTabView(Activity activity) {
        this.f136461g = activity;
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: a */
    public void mo188489a(boolean z) {
        if (z) {
            CommonRecyclerView commonRecyclerView = this.mContentRV;
            if (commonRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
            }
            commonRecyclerView.setVisibility(0);
            return;
        }
        CommonListTabAdapter<T> bVar = this.f136457c;
        if (bVar != null) {
            bVar.clear();
        }
        mo188503h();
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView
    /* renamed from: a */
    public void mo188488a(List<? extends T> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "resultList");
        CommonListTabAdapter<T> bVar = this.f136457c;
        if (bVar != null) {
            List<? extends T> list2 = list;
            if (!CollectionUtils.isEmpty(list2)) {
                if (z) {
                    bVar.addAll(list2);
                } else {
                    bVar.resetAll(list2);
                }
                CommonRecyclerView commonRecyclerView = this.mContentRV;
                if (commonRecyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
                }
                commonRecyclerView.setVisibility(0);
                View view = this.mEmptyHolder;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyHolder");
                }
                view.setVisibility(8);
            } else if (!z) {
                bVar.clear();
                mo188503h();
            } else {
                CommonRecyclerView commonRecyclerView2 = this.mContentRV;
                if (commonRecyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContentRV");
                }
                commonRecyclerView2.setVisibility(0);
                View view2 = this.mEmptyHolder;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mEmptyHolder");
                }
                view2.setVisibility(8);
            }
        }
    }
}
