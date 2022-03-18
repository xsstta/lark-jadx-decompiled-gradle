package com.ss.android.lark.search.impl.func.detail.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.func.detail.C53548a;
import com.ss.android.lark.search.impl.func.detail.C53604c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;
import com.ss.android.lark.search.impl.func.detail.base.C53598j;
import com.ss.android.lark.search.impl.hitpoint.loading.SearchLoadingLog;
import com.ss.android.lark.search.impl.hitpoint.onscreen.OnScreenReporter;
import com.ss.android.lark.search.impl.p2591a.C53330a;
import com.ss.android.lark.searchcommon.constant.C53887a;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.List;

public abstract class BaseSearchView implements C53330a.AbstractC53333a, AbstractC53584f.AbstractC53585a {

    /* renamed from: a */
    public final int f132293a;

    /* renamed from: b */
    protected AbstractC53568a f132294b;

    /* renamed from: c */
    protected AbstractC53584f.AbstractC53585a.AbstractC53586a f132295c;

    /* renamed from: d */
    protected C53548a f132296d;

    /* renamed from: e */
    protected Activity f132297e;

    /* renamed from: f */
    public boolean f132298f;

    /* renamed from: g */
    public final OnScreenReporter f132299g = new OnScreenReporter(mo182801q());

    /* renamed from: h */
    private boolean f132300h;

    /* renamed from: i */
    private Bitmap f132301i;

    /* renamed from: j */
    private int f132302j;

    /* renamed from: k */
    private C53598j f132303k;

    /* renamed from: l */
    private boolean f132304l;
    @BindView(7624)
    ImageView mSearchBackBtnIV;
    @BindView(7581)
    FrameLayout mSearchBarFL;
    @BindView(7582)
    LinearLayout mSearchBarRootLL;
    @BindView(7583)
    TextView mSearchBgTV;
    @BindView(7586)
    TextView mSearchCancelBtnTV;
    @BindView(7596)
    View mSearchDeleteBtnIV;
    @BindView(7606)
    ImageView mSearchDetailEmptyIV;
    @BindView(7615)
    ViewGroup mSearchDetailEmptyLayout;
    @BindView(7605)
    TextView mSearchDetailEmptyTV;
    @BindView(7597)
    LKUIPtrClassicFrameLayout mSearchDetailPtrFL;
    @BindView(7599)
    CommonRecyclerView mSearchDetailRV;
    @BindView(7598)
    LinearLayout mSearchDetailRootLL;
    @BindView(7601)
    protected EditText mSearchET;
    @BindView(7603)
    protected TextView mSearchEditHintTV;
    @BindView(7600)
    ImageView mTitleView;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.base.BaseSearchView$a */
    public interface AbstractC53568a {
        /* renamed from: a */
        void mo182830a();

        /* renamed from: a */
        void mo182831a(BaseSearchView baseSearchView);
    }

    /* renamed from: q */
    public abstract String mo182801q();

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: c */
    public View mo181966c() {
        return this.mSearchDetailPtrFL;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: d */
    public View mo181967d() {
        return this.mSearchBgTV;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: e */
    public View mo181968e() {
        return this.mSearchCancelBtnTV;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: f */
    public Bitmap mo181969f() {
        return this.f132301i;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: h */
    public EditText mo181971h() {
        return this.mSearchET;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: i */
    public Activity mo181972i() {
        return this.f132297e;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: j */
    public View mo181973j() {
        return this.mSearchDeleteBtnIV;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: a */
    public ImageView mo181964a() {
        return this.mTitleView;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132295c = null;
        this.f132294b = null;
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a
    /* renamed from: r */
    public void mo182827r() {
        this.f132299g.mo182047b();
    }

    /* renamed from: u */
    private void m207415u() {
        this.f132296d.mo182783a(new C53548a.AbstractC53550a() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535643 */

            @Override // com.ss.android.lark.search.impl.func.detail.C53548a.AbstractC53550a
            /* renamed from: a */
            public void mo182785a(SearchBaseViewData searchBaseViewData, int i) {
                C53604c.m207542a(searchBaseViewData, i, BaseSearchView.this.f132295c);
            }

            @Override // com.ss.android.lark.search.impl.func.detail.C53548a.AbstractC53550a
            /* renamed from: a */
            public void mo182786a(SearchBaseViewData searchBaseViewData, int i, String str) {
                C53604c.m207543a(searchBaseViewData, i, str, BaseSearchView.this.f132295c);
            }
        });
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: b */
    public View mo181965b() {
        return this.mSearchBarRootLL;
    }

    @Override // com.ss.android.lark.search.impl.p2591a.C53330a.AbstractC53333a
    /* renamed from: g */
    public int mo181970g() {
        int i = this.f132302j;
        if (i == 0) {
            return this.mTitleView.getLayoutParams().height;
        }
        return i;
    }

    /* renamed from: o */
    public void mo182825o() {
        if (this.mSearchDetailPtrFL.isRefreshing()) {
            this.mSearchDetailPtrFL.refreshComplete();
        }
    }

    /* renamed from: v */
    private void m207416v() {
        this.mSearchBackBtnIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.detail.base.$$Lambda$BaseSearchView$Z31CuYzvYQ7009DtM3A9LlgKJ3A */

            public final void onClick(View view) {
                BaseSearchView.this.m207410c((BaseSearchView) view);
            }
        });
        this.mSearchCancelBtnTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.detail.base.$$Lambda$BaseSearchView$UoFFVpYfBENRPrDCT5xUxA9seA */

            public final void onClick(View view) {
                BaseSearchView.this.m207408b((BaseSearchView) view);
            }
        });
        this.mSearchDeleteBtnIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.detail.base.$$Lambda$BaseSearchView$r6mct8gbxamLghiHBXvL3sRtMs */

            public final void onClick(View view) {
                BaseSearchView.this.m207407a((BaseSearchView) view);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132294b.mo182831a(this);
        m207413s();
        m207416v();
        m207417w();
        m207414t();
    }

    /* renamed from: k */
    public void mo182821k() {
        this.mSearchET.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535654 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(Editable editable) {
                String str;
                BaseSearchView.this.f132296d.clear();
                if (TextUtils.isEmpty(editable)) {
                    BaseSearchView.this.mSearchDeleteBtnIV.setVisibility(8);
                    BaseSearchView.this.mSearchEditHintTV.setVisibility(0);
                } else {
                    BaseSearchView.this.mSearchEditHintTV.setVisibility(8);
                    BaseSearchView.this.mSearchDeleteBtnIV.setVisibility(0);
                }
                if (BaseSearchView.this.f132295c != null) {
                    AbstractC53584f.AbstractC53585a.AbstractC53586a aVar = BaseSearchView.this.f132295c;
                    if (TextUtils.isEmpty(editable)) {
                        str = "";
                    } else {
                        str = editable.toString();
                    }
                    aVar.mo182866a(str);
                }
            }
        });
        this.mSearchET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535665 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return true;
                }
                String obj = BaseSearchView.this.mSearchET.getText().toString();
                if (TextUtils.isEmpty(obj.trim())) {
                    return true;
                }
                BaseSearchView.this.f132295c.mo182866a(obj);
                KeyboardUtils.hideKeyboard(BaseSearchView.this.f132297e);
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo182822l() {
        KeyboardUtils.hideKeyboard(this.f132297e, this.mSearchET);
        mo182826p();
        AbstractC53584f.AbstractC53585a.AbstractC53586a aVar = this.f132295c;
        if (aVar != null) {
            aVar.mo182864a(this.f132297e);
        }
    }

    /* renamed from: m */
    public void mo182823m() {
        mo182825o();
        this.mSearchDetailPtrFL.setVisibility(8);
        this.mSearchDetailEmptyLayout.setVisibility(0);
    }

    /* renamed from: n */
    public void mo182824n() {
        mo182825o();
        if (!C53258a.m205939a().mo181745a("lark.search.toastoff")) {
            mo182820b(UIHelper.getString(R.string.Lark_Legacy_SearchFail));
        }
    }

    @Override // com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f.AbstractC53585a
    /* renamed from: p */
    public void mo182826p() {
        if (!this.f132304l) {
            this.f132304l = true;
            this.mSearchDeleteBtnIV.setVisibility(8);
            this.f132303k.mo182893b();
        }
    }

    /* renamed from: t */
    private void m207414t() {
        this.mSearchDetailRV.setLayoutManager(new LinearLayoutManager(this.f132297e, 1, false));
        C53548a aVar = new C53548a(this.f132297e);
        this.f132296d = aVar;
        aVar.mo182782a(this.f132299g);
        this.mSearchDetailRV.setAdapter(this.f132296d);
        this.mSearchDetailRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535632 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m207444a(double d) {
                SearchLoadingLog.f131887a.mo182027a(BaseSearchView.this.f132293a, d);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                boolean z;
                if (BaseSearchView.this.f132295c == null || !BaseSearchView.this.f132295c.mo182871a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (i2 >= BaseSearchView.this.f132296d.getItemCount() - 10 && z) {
                    BaseSearchView.this.mSearchDetailPtrFL.autoLoadMore();
                }
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                KeyboardUtils.hideKeyboard(BaseSearchView.this.f132297e);
                if (!BaseSearchView.this.f132298f && i == 0) {
                    BaseSearchView.this.mSearchDetailRV.setFpsCallback(new CommonRecyclerView.IFpsCallback() {
                        /* class com.ss.android.lark.search.impl.func.detail.base.$$Lambda$BaseSearchView$2$aH7oS0Wab0cxYwo8moGO52SE4SI */

                        @Override // com.ss.android.lark.widget.recyclerview.CommonRecyclerView.IFpsCallback
                        public final void callback(double d) {
                            BaseSearchView.C535632.this.m207444a(d);
                        }
                    });
                    BaseSearchView.this.f132298f = true;
                }
                if (i != 0) {
                    BaseSearchView.this.f132299g.mo182045a();
                }
            }
        });
        m207415u();
    }

    /* renamed from: w */
    private void m207417w() {
        SearchLoadingLog.f131887a.mo182030b();
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f132297e);
        this.mSearchDetailPtrFL.setKeepHeaderWhenRefresh(true);
        this.mSearchDetailPtrFL.setHeaderView(chatWindowPtrLoadingHeader);
        this.mSearchDetailPtrFL.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mSearchDetailPtrFL.disableWhenHorizontalMove(true);
        this.mSearchDetailPtrFL.setForceBackWhenComplete(true);
        this.mSearchDetailPtrFL.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535676 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                SearchLoadingLog.f131887a.mo182031c();
                BaseSearchView.this.f132295c.mo182872b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !BaseSearchView.this.f132295c.mo182871a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: s */
    private void m207413s() {
        C53598j jVar = new C53598j();
        this.f132303k = jVar;
        jVar.mo182892a(this.f132300h);
        this.f132303k.mo182885a(this.f132297e);
        this.f132303k.mo182890a(this);
        this.f132303k.mo182887a(this.mSearchET);
        this.f132303k.mo182888a(this.mSearchBarFL);
        this.f132303k.mo182886a(this.mSearchDetailRootLL);
        this.f132303k.mo182889a(this.mSearchCancelBtnTV);
        this.f132303k.mo182891a(new C53598j.AbstractC53602a() {
            /* class com.ss.android.lark.search.impl.func.detail.base.BaseSearchView.C535621 */

            @Override // com.ss.android.lark.search.impl.func.detail.base.C53598j.AbstractC53602a
            /* renamed from: a */
            public void mo182828a() {
                if (BaseSearchView.this.f132294b != null) {
                    BaseSearchView.this.f132294b.mo182830a();
                }
            }
        });
        this.f132303k.mo182884a();
        this.f132303k.mo182895d();
    }

    /* renamed from: a */
    private void m207405a(int i) {
        this.f132302j = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m207408b(View view) {
        mo182822l();
    }

    /* renamed from: b */
    private void m207409b(boolean z) {
        this.f132300h = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207407a(View view) {
        this.mSearchET.setText("");
        KeyboardUtils.showKeyboard(this.mSearchET);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m207410c(View view) {
        KeyboardUtils.hideKeyboard(this.f132297e);
        mo182826p();
    }

    /* renamed from: a */
    private void m207406a(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.mSearchEditHintTV.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: c */
    private void mo182800c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Object a = al.m95028a().mo93365a(str);
            if (a instanceof Bitmap) {
                this.f132301i = (Bitmap) a;
            }
        }
    }

    /* renamed from: d */
    private void mo182905d(String str) {
        this.mSearchET.setText(str);
        DesktopUtil.m144299a(this.mSearchET);
        this.mSearchET.setSelection(str.length());
    }

    /* renamed from: b */
    public void mo182820b(String str) {
        LKUIToast.show(this.f132297e, str);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53584f.AbstractC53585a.AbstractC53586a aVar) {
        this.f132295c = aVar;
    }

    /* renamed from: a */
    public void mo182815a(C53887a aVar) {
        this.mSearchEditHintTV.setText(aVar.mo183803a());
        m207406a(UIUtils.getDrawable(this.f132297e, aVar.mo183804b()));
    }

    /* renamed from: a */
    public void mo182816a(String str) {
        this.mSearchET.setText(str);
    }

    /* renamed from: a */
    public void mo182818a(List<SearchBaseViewData> list) {
        mo182825o();
        this.mSearchDetailEmptyLayout.setVisibility(8);
        this.mSearchDetailPtrFL.setVisibility(0);
        this.f132296d.addAll(list);
    }

    /* renamed from: a */
    public void mo182819a(boolean z) {
        this.f132296d.mo182784a(z);
    }

    /* renamed from: a */
    public void mo182817a(String str, List<SearchBaseViewData> list) {
        AbstractC53584f.AbstractC53585a.AbstractC53586a aVar;
        if (!TextUtils.isEmpty(str)) {
            mo182905d(str);
            this.mSearchDeleteBtnIV.setVisibility(0);
            this.mSearchEditHintTV.setVisibility(8);
        } else {
            this.mSearchDeleteBtnIV.setVisibility(8);
            this.mSearchEditHintTV.setVisibility(0);
            this.f132303k.mo182894c();
        }
        if (!list.isEmpty()) {
            mo182818a(list);
        } else if (!TextUtils.isEmpty(str) && (aVar = this.f132295c) != null) {
            aVar.mo182866a(str);
        }
        mo182821k();
    }

    public BaseSearchView(Activity activity, AbstractC53568a aVar, SearchDetailInitData searchDetailInitData) {
        this.f132294b = aVar;
        this.f132297e = activity;
        this.f132293a = searchDetailInitData.resultType;
        m207409b(searchDetailInitData.isMainPage);
        mo182800c(searchDetailInitData.bitmapKey);
        m207405a(searchDetailInitData.translateY);
    }
}
