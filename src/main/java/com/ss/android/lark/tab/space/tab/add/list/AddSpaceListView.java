package com.ss.android.lark.tab.space.tab.add.list;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1556v;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.tab.space.tab.add.common.IItemBinder;
import com.ss.android.lark.tab.space.tab.add.list.entity.SpaceSelectViewData;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001PB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020AH\u0002J\b\u0010G\u001a\u00020AH\u0016J\u0016\u0010H\u001a\u00020A2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0002J\b\u0010L\u001a\u00020AH\u0002J\b\u0010M\u001a\u00020AH\u0002J\b\u0010N\u001a\u00020AH\u0002J\b\u0010O\u001a\u00020AH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;", "viewDependency", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$ViewDependency;)V", "getContext", "()Landroid/content/Context;", "mAdapter", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceAdapter;", "mLoadEmptyView", "getMLoadEmptyView", "()Landroid/view/View;", "setMLoadEmptyView", "(Landroid/view/View;)V", "mLoadFailedView", "getMLoadFailedView", "setMLoadFailedView", "mPtrFrame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "getMPtrFrame", "()Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;", "setMPtrFrame", "(Lcom/ss/android/lark/widget/ptr/LKUIPtrClassicFrameLayout;)V", "mSearchBar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMSearchBar", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMSearchBar", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mSearchEmptyTip", "Landroid/widget/TextView;", "getMSearchEmptyTip", "()Landroid/widget/TextView;", "setMSearchEmptyTip", "(Landroid/widget/TextView;)V", "mSearchEt", "Landroid/widget/EditText;", "getMSearchEt", "()Landroid/widget/EditText;", "setMSearchEt", "(Landroid/widget/EditText;)V", "mSearchResultRv", "Landroidx/recyclerview/widget/RecyclerView;", "getMSearchResultRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setMSearchResultRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "getRootView", "getViewDependency", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$ViewDependency;", "getViewModel", "()Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListViewModel;", "initListeners", "", "initPullToRefresh", "initRecyclerView", "initTitleBar", "initView", "initViewModel", "onCreate", "refreshData", "dataList", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "reportSearchEvent", "showErrorView", "showInitLoadEmpty", "showSearchEmpty", "ViewDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceListView extends Widget {

    /* renamed from: a */
    public AddSpaceAdapter f136544a;

    /* renamed from: b */
    private final Context f136545b;

    /* renamed from: c */
    private final View f136546c;

    /* renamed from: d */
    private final AddSpaceListViewModel f136547d;

    /* renamed from: e */
    private final ViewDependency f136548e;
    @BindView(8089)
    public View mLoadEmptyView;
    @BindView(8090)
    public View mLoadFailedView;
    @BindView(8453)
    public LKUIPtrClassicFrameLayout mPtrFrame;
    @BindView(8670)
    public ConstraintLayout mSearchBar;
    @BindView(8942)
    public TextView mSearchEmptyTip;
    @BindView(8680)
    public EditText mSearchEt;
    @BindView(8561)
    public RecyclerView mSearchResultRv;
    @BindView(PlacesStatusCodes.OVER_QUERY_LIMIT)
    public CommonTitleBar mTitleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$ViewDependency;", "", "finish", "", "onItemClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo188584a();

        /* renamed from: a */
        void mo188585a(SpaceSelectViewData spaceSelectViewData);
    }

    /* renamed from: i */
    public final Context mo188581i() {
        return this.f136545b;
    }

    /* renamed from: j */
    public final AddSpaceListViewModel mo188582j() {
        return this.f136547d;
    }

    /* renamed from: k */
    public final ViewDependency mo188583k() {
        return this.f136548e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$initRecyclerView$2", "Lcom/ss/android/lark/widget/util/PtrFrameLayoutUtil$LoadMoreCallback;", "canLoadMore", "", "loadMoreThreshold", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$h */
    public static final class C55334h implements C59252a.AbstractC59254a {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136555a;

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: a */
        public int mo31266a() {
            return AddSpaceListView.m214588a(this.f136555a).getItemCount() - 7;
        }

        @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
        /* renamed from: b */
        public boolean mo31267b() {
            return this.f136555a.mo188582j().getCanLoadMore();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55334h(AddSpaceListView addSpaceListView) {
            this.f136555a = addSpaceListView;
        }
    }

    /* renamed from: l */
    private final void m214589l() {
        m214590m();
        m214591n();
        m214592p();
        m214593s();
        m214594t();
    }

    /* renamed from: b */
    public final EditText mo188577b() {
        EditText editText = this.mSearchEt;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEt");
        }
        return editText;
    }

    /* renamed from: c */
    public final void mo121985c() {
        ChatTabHitPoint.f136619a.mo188721a(ChatTabHitPoint.ChatTabExtraParam.Click.SEARCH_DOC.plus(ChatTabHitPoint.ChatTabExtraParam.Target.NONE));
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        ButterKnife.bind(this, this.f136546c);
        m214589l();
    }

    /* renamed from: a */
    public final ConstraintLayout mo188575a() {
        ConstraintLayout constraintLayout = this.mSearchBar;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchBar");
        }
        return constraintLayout;
    }

    /* renamed from: n */
    private final void m214591n() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(R.string.Lark_Groups_AddTabsTitle);
        CommonTitleBar commonTitleBar2 = this.mTitleBar;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        CommonTitleBar commonTitleBar3 = this.mTitleBar;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar3.setLeftClickListener(new View$OnClickListenerC55335i(this));
    }

    /* renamed from: h */
    public final void mo188580h() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        View view = this.mLoadEmptyView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadEmptyView");
        }
        view.setVisibility(8);
        View view2 = this.mLoadFailedView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadFailedView");
        }
        view2.setVisibility(0);
    }

    /* renamed from: m */
    private final void m214590m() {
        AddSpaceListView addSpaceListView = this;
        this.f136547d.getSearchKeyLiveData().mo5923a(addSpaceListView, new C55336j(this));
        this.f136547d.getRecommendListLiveData().mo5923a(addSpaceListView, new C55337k(this));
        this.f136547d.getSearchListLiveData().mo5923a(addSpaceListView, new C55338l(this));
        this.f136547d.getErrorLiveData().mo5923a(addSpaceListView, new C55339m(this));
    }

    /* renamed from: p */
    private final void m214592p() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f136545b, 1, false);
        RecyclerView recyclerView = this.mSearchResultRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultRv");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f136544a = new AddSpaceAdapter(this.f136545b, new C55333g(this));
        RecyclerView recyclerView2 = this.mSearchResultRv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultRv");
        }
        recyclerView2.setOverScrollMode(2);
        RecyclerView recyclerView3 = this.mSearchResultRv;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultRv");
        }
        AddSpaceAdapter aVar = this.f136544a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView3.setAdapter(aVar);
        Context context = this.f136545b;
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        RecyclerView recyclerView4 = this.mSearchResultRv;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultRv");
        }
        C59252a.m230151a(context, lKUIPtrClassicFrameLayout, recyclerView4, new C55334h(this));
    }

    /* renamed from: s */
    private final void m214593s() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f136545b);
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
        lKUIPtrClassicFrameLayout5.setPtrHandler(new C55332f(this));
    }

    /* renamed from: t */
    private final void m214594t() {
        ConstraintLayout constraintLayout = this.mSearchBar;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchBar");
        }
        constraintLayout.setOnClickListener(new View$OnClickListenerC55328b(this));
        EditText editText = this.mSearchEt;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEt");
        }
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC55329c(this));
        EditText editText2 = this.mSearchEt;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEt");
        }
        editText2.addTextChangedListener(new C55330d(this));
        RecyclerView recyclerView = this.mSearchResultRv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchResultRv");
        }
        recyclerView.addOnScrollListener(new C55331e(this));
    }

    /* renamed from: f */
    public final void mo188578f() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        View view = this.mLoadEmptyView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadEmptyView");
        }
        view.setVisibility(0);
        View view2 = this.mLoadFailedView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadFailedView");
        }
        view2.setVisibility(8);
        TextView textView = this.mSearchEmptyTip;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyTip");
        }
        textView.setText(R.string.Lark_Legacy_RecentEmpty);
    }

    /* renamed from: g */
    public final void mo188579g() {
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        View view = this.mLoadEmptyView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadEmptyView");
        }
        view.setVisibility(0);
        View view2 = this.mLoadFailedView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadFailedView");
        }
        view2.setVisibility(8);
        TextView textView = this.mSearchEmptyTip;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEmptyTip");
        }
        textView.setText(R.string.Lark_Legacy_SearchEmpty);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$initListeners$3", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$d */
    public static final class C55330d extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136551a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55330d(AddSpaceListView addSpaceListView) {
            this.f136551a = addSpaceListView;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                this.f136551a.mo188582j().getSearchKeyLiveData().mo5926a("");
                return;
            }
            this.f136551a.mo188582j().getSearchKeyLiveData().mo5926a(String.valueOf(editable));
            this.f136551a.mo121985c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$initListeners$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$e */
    public static final class C55331e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136552a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55331e(AddSpaceListView addSpaceListView) {
            this.f136552a = addSpaceListView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                this.f136552a.mo188577b().clearFocus();
                KeyboardUtils.hideKeyboard(this.f136552a.mo188581i());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$initPullToRefresh$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$f */
    public static final class C55332f extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136553a;

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

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55332f(AddSpaceListView addSpaceListView) {
            this.f136553a = addSpaceListView;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f136553a.mo188577b().clearFocus();
            KeyboardUtils.hideKeyboard(this.f136553a.mo188581i());
            this.f136553a.mo188582j().getLoadMoreFlag().mo5926a((Boolean) true);
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f136553a.mo188582j().getCanLoadMore()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/tab/space/tab/add/list/AddSpaceListView$initRecyclerView$1", "Lcom/ss/android/lark/tab/space/tab/add/common/IItemBinder$OnItemClickListener;", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$g */
    public static final class C55333g implements IItemBinder.OnItemClickListener<SpaceSelectViewData> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136554a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55333g(AddSpaceListView addSpaceListView) {
            this.f136554a = addSpaceListView;
        }

        /* renamed from: a */
        public void mo188562a(SpaceSelectViewData spaceSelectViewData) {
            Intrinsics.checkParameterIsNotNull(spaceSelectViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ChatTabHitPoint.f136619a.mo188721a(ChatTabHitPoint.ChatTabExtraParam.Click.SELECT_DOC_MOBILE.plus(ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_DOC_PAGE_NAME_SETTING_VIEW));
            this.f136554a.mo188583k().mo188585a(spaceSelectViewData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$m */
    public static final class C55339m<T> implements AbstractC1178x<ErrorResult> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136560a;

        C55339m(AddSpaceListView addSpaceListView) {
            this.f136560a = addSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(ErrorResult errorResult) {
            this.f136560a.mo188580h();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$i */
    public static final class View$OnClickListenerC55335i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136556a;

        View$OnClickListenerC55335i(AddSpaceListView addSpaceListView) {
            this.f136556a = addSpaceListView;
        }

        public final void onClick(View view) {
            this.f136556a.mo188583k().mo188584a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AddSpaceAdapter m214588a(AddSpaceListView addSpaceListView) {
        AddSpaceAdapter aVar = addSpaceListView.f136544a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$k */
    public static final class C55337k<T> implements AbstractC1178x<List<? extends SpaceSelectViewData>> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136558a;

        C55337k(AddSpaceListView addSpaceListView) {
            this.f136558a = addSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(List<SpaceSelectViewData> list) {
            if (list.isEmpty()) {
                this.f136558a.mo188578f();
                return;
            }
            AddSpaceListView addSpaceListView = this.f136558a;
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            addSpaceListView.mo188576a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "Lcom/ss/android/lark/tab/space/tab/add/list/entity/SpaceSelectViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$l */
    public static final class C55338l<T> implements AbstractC1178x<List<? extends SpaceSelectViewData>> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136559a;

        C55338l(AddSpaceListView addSpaceListView) {
            this.f136559a = addSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(List<SpaceSelectViewData> list) {
            if (list.isEmpty()) {
                this.f136559a.mo188579g();
                return;
            }
            AddSpaceListView addSpaceListView = this.f136559a;
            Intrinsics.checkExpressionValueIsNotNull(list, "list");
            addSpaceListView.mo188576a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$b */
    public static final class View$OnClickListenerC55328b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136549a;

        View$OnClickListenerC55328b(AddSpaceListView addSpaceListView) {
            this.f136549a = addSpaceListView;
        }

        public final void onClick(View view) {
            this.f136549a.mo188577b().setFocusable(true);
            this.f136549a.mo188577b().setFocusableInTouchMode(true);
            this.f136549a.mo188577b().requestFocus();
            KeyboardUtils.showKeyboard(this.f136549a.mo188581i());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$j */
    public static final class C55336j<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136557a;

        C55336j(AddSpaceListView addSpaceListView) {
            this.f136557a = addSpaceListView;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f136557a.mo188582j().getLoadRecommendFlag().mo5926a((Boolean) true);
            } else {
                this.f136557a.mo188582j().getLoadSearchFlag().mo5926a((Boolean) true);
            }
        }
    }

    /* renamed from: a */
    public final void mo188576a(List<SpaceSelectViewData> list) {
        AddSpaceAdapter aVar = this.f136544a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        aVar.diff(list);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout.refreshComplete();
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = this.mPtrFrame;
        if (lKUIPtrClassicFrameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPtrFrame");
        }
        lKUIPtrClassicFrameLayout2.setVisibility(0);
        View view = this.mLoadEmptyView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadEmptyView");
        }
        view.setVisibility(8);
        View view2 = this.mLoadFailedView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadFailedView");
        }
        view2.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.tab.add.list.AddSpaceListView$c */
    public static final class View$OnFocusChangeListenerC55329c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ AddSpaceListView f136550a;

        View$OnFocusChangeListenerC55329c(AddSpaceListView addSpaceListView) {
            this.f136550a = addSpaceListView;
        }

        public final void onFocusChange(View view, boolean z) {
            C1556v.m7130a(this.f136550a.mo188575a());
            InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.f136550a.mo188581i(), InputMethodManager.class);
            if (z) {
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(this.f136550a.mo188577b(), 2);
                }
            } else if (TextUtils.isEmpty(this.f136550a.mo188577b().getText()) && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.f136550a.mo188577b().getWindowToken(), 0);
            }
        }
    }

    public AddSpaceListView(Context context, View view, AddSpaceListViewModel bVar, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f136545b = context;
        this.f136546c = view;
        this.f136547d = bVar;
        this.f136548e = aVar;
    }
}
