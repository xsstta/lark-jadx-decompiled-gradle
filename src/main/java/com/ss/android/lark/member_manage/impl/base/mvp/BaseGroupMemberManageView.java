package com.ss.android.lark.member_manage.impl.base.mvp;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.impl.base.C45033a;
import com.ss.android.lark.member_manage.impl.base.adapter.C45044d;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AbstractC45064a;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseGroupMemberManageView<T extends IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, VD extends AbstractC45064a> implements IGroupMemberBaseContract.AbstractC45066b<T> {

    /* renamed from: a */
    protected TextView f114076a;

    /* renamed from: b */
    protected C45044d f114077b;

    /* renamed from: c */
    protected C45044d f114078c;

    /* renamed from: d */
    protected SelectPreviewAdapter f114079d;

    /* renamed from: e */
    public T f114080e;

    /* renamed from: f */
    public Chat f114081f;

    /* renamed from: g */
    public VD f114082g;

    /* renamed from: h */
    public final Activity f114083h;

    /* renamed from: i */
    IFuncBinder.AbstractC45038a f114084i;

    /* renamed from: j */
    private C26198f f114085j;
    protected FrameLayout mBannerContainer;
    protected ConstraintLayout mBottomDetailRL;
    public Button mConfirmBT;
    protected View mLoadEmptyView;
    protected View mLoadFailView;
    protected LKUIPtrClassicFrameLayout mMemberPtrFrame;
    protected RecyclerView mMemberRV;
    protected View mQuickSideBarCover;
    protected QuickSideBarTipsView mQuickSideBarTipView;
    protected QuickSideBarView mQuickSideBarView;
    protected LinearLayout mSearchBar;
    protected LinearLayout mSearchBarContainer;
    protected ImageView mSearchDeleteIV;
    protected TextView mSearchEmptyHintTV;
    public EditText mSearchEt;
    protected LKUIPtrClassicFrameLayout mSearchPtrFrame;
    protected RecyclerView mSearchRV;
    public View mSelectAvatarsView;
    protected TextView mSelectCountTV;
    protected RecyclerView mSelectedRV;
    protected CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView$a */
    public interface AbstractC45064a {

        /* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView$a$-CC */
        public final /* synthetic */ class CC {
            public static void $default$b(AbstractC45064a aVar) {
            }
        }

        /* renamed from: a */
        void mo159423a();

        /* renamed from: a */
        void mo159424a(Context context, String str, int i);

        /* renamed from: a */
        void mo159425a(Chat chat, String str);

        /* renamed from: a */
        void mo159426a(Chat chat, boolean z, int i, String str);

        /* renamed from: a */
        void mo159427a(Chatter chatter);

        /* renamed from: a */
        void mo159428a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo159429a(IGroupMemberBaseContract.AbstractC45066b bVar);

        /* renamed from: a */
        void mo159430a(String str);

        /* renamed from: a */
        void mo159431a(List<ChatChatter> list);

        /* renamed from: b */
        void mo159432b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo159397a(Map<String, C45084c> map);

    public boolean aX_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo159400b();

    /* renamed from: c */
    public void mo159406c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo159409d();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: j */
    public boolean mo159415j() {
        return false;
    }

    /* renamed from: h */
    public Context mo159414h() {
        return this.f114083h;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159396a(String str, List<C45084c> list) {
        this.mSearchPtrFrame.refreshComplete();
        this.mSearchPtrFrame.setVisibility(0);
        this.mLoadEmptyView.setVisibility(8);
        this.mQuickSideBarTipView.setVisibility(8);
        this.mQuickSideBarView.setVisibility(8);
        this.mQuickSideBarCover.setVisibility(8);
        this.mMemberRV.setVisibility(8);
        this.mSearchRV.setVisibility(0);
        this.f114078c.mo159357b();
        this.f114078c.mo159354a(list);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159395a(String str, ErrorResult errorResult) {
        this.mSearchPtrFrame.refreshComplete();
        LKUIToast.show(mo159414h(), UIHelper.getString(R.string.Lark_Legacy_NetError));
    }

    /* renamed from: p */
    private void m178695p() {
        m178696q();
        m178697r();
    }

    /* access modifiers changed from: public */
    /* renamed from: s */
    private /* synthetic */ void m178698s() {
        this.mSelectAvatarsView.setVisibility(8);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f114082g.mo159429a(this);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: f */
    public void mo159412f() {
        this.f114078c.mo159357b();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: g */
    public void mo159413g() {
        this.mMemberPtrFrame.refreshComplete();
    }

    /* renamed from: a */
    public void mo159385a() {
        mo159400b();
        mo159572k();
        mo159643l();
        m178695p();
        mo159411e();
    }

    /* renamed from: k */
    private void mo159572k() {
        if (!this.f114083h.getIntent().getBooleanExtra("key_support_search", true)) {
            this.mSearchBarContainer.setVisibility(8);
        }
        mo159406c();
    }

    /* renamed from: l */
    private void mo159643l() {
        this.mSelectAvatarsView.setVisibility(8);
        m178694o();
        m178693n();
        mo159644m();
    }

    /* renamed from: n */
    private void m178693n() {
        this.mSelectedRV.setLayoutManager(new LinearLayoutManager(this.f114083h, 0, false));
        SelectPreviewAdapter selectPreviewAdapter = new SelectPreviewAdapter();
        this.f114079d = selectPreviewAdapter;
        this.mSelectedRV.setAdapter(selectPreviewAdapter);
    }

    /* renamed from: m */
    private void mo159644m() {
        this.mSearchRV.setLayoutManager(new LinearLayoutManager(this.f114083h, 1, false));
        C45044d dVar = new C45044d(this.f114083h, mo159409d(), this.f114081f);
        this.f114078c = dVar;
        this.mSearchRV.setAdapter(dVar);
    }

    /* renamed from: o */
    private void m178694o() {
        this.mMemberRV.setLayoutManager(new LinearLayoutManager(this.f114083h, 1, false));
        C45044d dVar = new C45044d(this.f114083h, mo159409d(), this.f114081f);
        this.f114077b = dVar;
        this.mMemberRV.setAdapter(dVar);
        this.f114085j = new C26198f(this.f114077b);
        if (this.mMemberRV.getItemDecorationCount() > 0) {
            this.mMemberRV.removeItemDecorationAt(0);
        }
        this.mMemberRV.addItemDecoration(this.f114085j);
    }

    /* renamed from: q */
    private void m178696q() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f114083h);
        this.mMemberPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mMemberPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mMemberPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mMemberPtrFrame.setForceBackWhenComplete(true);
        this.mMemberPtrFrame.disableWhenHorizontalMove(true);
        this.mMemberPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450551 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                BaseGroupMemberManageView.this.f114080e.mo159455b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!BaseGroupMemberManageView.this.f114080e.mo159459d() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: r */
    private void m178697r() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f114083h);
        this.mSearchPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mSearchPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mSearchPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mSearchPtrFrame.disableWhenHorizontalMove(true);
        this.mSearchPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450639 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                BaseGroupMemberManageView.this.mSearchEt.clearFocus();
                KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
                BaseGroupMemberManageView.this.f114080e.mo159450a();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!BaseGroupMemberManageView.this.f114080e.mo159457c() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: e */
    public void mo159411e() {
        this.mQuickSideBarView.setOnQuickSideBarTouchListener(new AbstractC58955a() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
            /* renamed from: a */
            public void mo131379a(boolean z) {
                int i;
                QuickSideBarTipsView quickSideBarTipsView = BaseGroupMemberManageView.this.mQuickSideBarTipView;
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                quickSideBarTipsView.setVisibility(i);
            }

            @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
            /* renamed from: a */
            public void mo131378a(String str, int i, float f) {
                BaseGroupMemberManageView.this.mQuickSideBarTipView.mo200024a(str, i, f - ((float) UIUtils.dp2px(BaseGroupMemberManageView.this.f114083h, 40.0f)));
                if (C45033a.m178595a().containsKey(str)) {
                    ((LinearLayoutManager) BaseGroupMemberManageView.this.mMemberRV.getLayoutManager()).scrollToPositionWithOffset(C45033a.m178595a().get(str).intValue(), 0);
                }
            }
        });
        AnonymousClass11 r0 = new IFuncBinder.AbstractC45039b() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass11 */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
            /* renamed from: a */
            public void mo159334a(C45084c cVar) {
                BaseGroupMemberManageView.this.f114080e.mo159452a(cVar, true);
            }

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
            /* renamed from: b */
            public void mo159335b(C45084c cVar) {
                BaseGroupMemberManageView.this.f114080e.mo159452a(cVar, false);
            }

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
            /* renamed from: c */
            public void mo159336c(C45084c cVar) {
                KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
                if (cVar != null) {
                    BaseGroupMemberManageView.this.f114080e.mo159456c(cVar);
                }
            }
        };
        AnonymousClass12 r1 = new IFuncBinder.AbstractC45040c() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass12 */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45040c
            /* renamed from: a */
            public void mo159337a(C45084c cVar) {
                KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
                if (cVar != null) {
                    BaseGroupMemberManageView.this.f114080e.mo159458d(cVar);
                }
            }
        };
        this.f114077b.mo159351a(r0);
        this.f114078c.mo159351a(r0);
        this.f114077b.mo159352a(r1);
        this.f114078c.mo159352a(r1);
        this.f114077b.mo159350a(new IFuncBinder.AbstractC45038a() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$BaseGroupMemberManageView$pJjVx5V1vK8GMJ7JP2DqtSvleuA */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45038a
            public final void onItemLongClick(C45084c cVar) {
                BaseGroupMemberManageView.lambda$pJjVx5V1vK8GMJ7JP2DqtSvleuA(BaseGroupMemberManageView.this, cVar);
            }
        });
        this.f114078c.mo159350a(new IFuncBinder.AbstractC45038a() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$BaseGroupMemberManageView$s_HL60Dz9QlG_kNNuu3MXGqSyys */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45038a
            public final void onItemLongClick(C45084c cVar) {
                BaseGroupMemberManageView.lambda$s_HL60Dz9QlG_kNNuu3MXGqSyys(BaseGroupMemberManageView.this, cVar);
            }
        });
        this.f114079d.mo159338a(new SelectPreviewAdapter.AbstractC45042a() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass13 */

            @Override // com.ss.android.lark.member_manage.impl.base.adapter.SelectPreviewAdapter.AbstractC45042a
            /* renamed from: a */
            public void mo159340a(C45084c cVar) {
                BaseGroupMemberManageView.this.f114080e.mo159451a(cVar);
            }
        });
        this.mMemberRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass14 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    BaseGroupMemberManageView.this.mSearchEt.clearFocus();
                    KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) BaseGroupMemberManageView.this.mMemberRV.getLayoutManager();
                if (i2 > 8 && BaseGroupMemberManageView.this.f114080e.mo159459d() && linearLayoutManager.findLastVisibleItemPosition() + 1 == BaseGroupMemberManageView.this.f114077b.getItemCount() - 3) {
                    BaseGroupMemberManageView.this.mMemberPtrFrame.autoLoadMore();
                }
            }
        });
        this.mConfirmBT.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                BaseGroupMemberManageView.this.mConfirmBT.setEnabled(false);
                BaseGroupMemberManageView.this.f114080e.mo159460e();
            }
        });
        this.mSearchBar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.AnonymousClass16 */

            public void onClick(View view) {
                BaseGroupMemberManageView.this.mSearchEt.setFocusable(true);
                BaseGroupMemberManageView.this.mSearchEt.setFocusableInTouchMode(true);
                BaseGroupMemberManageView.this.mSearchEt.requestFocus();
                KeyboardUtils.showKeyboard(BaseGroupMemberManageView.this.f114083h);
            }
        });
        this.mSearchEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.View$OnFocusChangeListenerC450562 */

            public void onFocusChange(View view, boolean z) {
                InputMethodManager inputMethodManager = (InputMethodManager) BaseGroupMemberManageView.this.f114083h.getSystemService("input_method");
                if (z) {
                    inputMethodManager.showSoftInput(BaseGroupMemberManageView.this.mSearchEt, 2);
                } else if (TextUtils.isEmpty(BaseGroupMemberManageView.this.mSearchEt.getText())) {
                    inputMethodManager.hideSoftInputFromWindow(BaseGroupMemberManageView.this.mSearchEt.getWindowToken(), 0);
                }
            }
        });
        this.mSearchEt.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450573 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                if (TextUtils.isEmpty(obj)) {
                    BaseGroupMemberManageView.this.mSearchDeleteIV.setVisibility(8);
                } else {
                    BaseGroupMemberManageView.this.mSearchDeleteIV.setVisibility(0);
                }
                BaseGroupMemberManageView.this.f114080e.mo159453a(obj);
            }
        });
        if (this.mSearchBarContainer.getVisibility() == 0 && DesktopUtil.m144301a((Context) this.f114083h)) {
            this.mSearchEt.setFocusable(true);
            this.mSearchEt.setFocusableInTouchMode(true);
            this.mSearchEt.requestFocus();
        }
        this.mSearchRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450584 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    BaseGroupMemberManageView.this.mSearchEt.clearFocus();
                    KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
                }
            }
        });
        this.mLoadEmptyView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.View$OnClickListenerC450595 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(BaseGroupMemberManageView.this.f114083h);
            }
        });
        this.mSearchDeleteIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.View$OnClickListenerC450606 */

            public void onClick(View view) {
                BaseGroupMemberManageView.this.mSearchEt.setText("");
                KeyboardUtils.showKeyboard(BaseGroupMemberManageView.this.f114083h);
            }
        });
    }

    /* renamed from: a */
    public void mo159390a(IFuncBinder.AbstractC45038a aVar) {
        this.f114084i = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void mo159640a(C45084c cVar) {
        IFuncBinder.AbstractC45038a aVar = this.f114084i;
        if (aVar != null) {
            aVar.onItemLongClick(cVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void mo159642b(C45084c cVar) {
        IFuncBinder.AbstractC45038a aVar = this.f114084i;
        if (aVar != null) {
            aVar.onItemLongClick(cVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: c */
    public void mo159407c(String str) {
        this.f114082g.mo159430a(str);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: d */
    public void mo159410d(String str) {
        LKUIToast.show(this.f114083h, str);
    }

    /* renamed from: c */
    private void mo159570c(List<C45084c> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f114078c.mo159354a(list);
        }
    }

    /* renamed from: e */
    private void m178689e(SelectBeansResult dVar) {
        if (!CollectionUtils.isEmpty(dVar.mo159516b())) {
            this.f114077b.mo159353a(dVar);
        }
    }

    /* renamed from: b */
    private void mo159793b(int i) {
        if (i != 0 || mo159415j()) {
            this.mConfirmBT.setVisibility(0);
        } else {
            this.mConfirmBT.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo159386a(int i) {
        this.mSelectCountTV.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_GroupSettingSelectedNumber, "number", Integer.toString(i)));
        mo159793b(i);
    }

    /* renamed from: c */
    public void mo159408c(Map<String, C45084c> map) {
        if (map.size() == 0) {
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.member_manage.impl.base.mvp.$$Lambda$BaseGroupMemberManageView$w9JZdqjCvh7LwOjpCWfuwbcDUY */

                public final void run() {
                    BaseGroupMemberManageView.m270814lambda$w9JZdqjCvh7LwOjpCWfuwbcDUY(BaseGroupMemberManageView.this);
                }
            });
            this.f114076a.setVisibility(8);
        }
    }

    public void a_(SelectBeansResult dVar) {
        this.mSearchPtrFrame.setVisibility(8);
        this.mLoadEmptyView.setVisibility(8);
        this.mSearchRV.setVisibility(8);
        this.mMemberRV.setVisibility(0);
        if (!CollectionUtils.isEmpty(dVar.mo159516b())) {
            this.mLoadEmptyView.setVisibility(8);
            this.mLoadFailView.setVisibility(8);
            this.mMemberRV.setVisibility(0);
            this.f114077b.mo159353a(dVar);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159401b(SelectBeansResult dVar) {
        dVar.mo159516b().addAll(0, this.f114077b.mo159348a());
        b_(dVar);
        a_(dVar);
        this.mMemberPtrFrame.refreshComplete();
    }

    public void b_(List<C45084c> list) {
        if (list.size() > 0 && aX_()) {
            this.mSelectAvatarsView.setVisibility(0);
        } else if (list.size() == 0) {
            this.mSelectAvatarsView.setVisibility(8);
        }
        this.f114079d.resetAll(list);
        mo159386a(list.size());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159388a(Chatter chatter) {
        this.f114082g.mo159427a(chatter);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: b */
    public void mo159402b(String str) {
        this.mSearchPtrFrame.refreshComplete();
        this.mMemberRV.setVisibility(8);
        this.mLoadEmptyView.setVisibility(0);
        this.f114078c.mo159357b();
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Noresult, "search_key", str);
        this.mSearchEmptyHintTV.setText(C57782ag.m224238a(mustacheFormat, mustacheFormat.indexOf("'"), mustacheFormat.lastIndexOf("'"), str, UIHelper.getColor(R.color.function_info_500)));
    }

    public void b_(SelectBeansResult dVar) {
        if (dVar.mo159518d()) {
            this.mQuickSideBarView.setLetters(C45033a.m178594a(dVar.mo159516b()));
            this.mQuickSideBarView.setVisibility(0);
            this.mQuickSideBarCover.setVisibility(8);
            this.mQuickSideBarTipView.setVisibility(8);
            return;
        }
        this.mQuickSideBarView.setVisibility(8);
        this.mQuickSideBarCover.setVisibility(8);
        this.mQuickSideBarTipView.setVisibility(8);
        if (this.f114085j != null && CollectionUtils.isNotEmpty(dVar.mo159516b())) {
            this.mMemberRV.removeItemDecoration(this.f114085j);
        }
    }

    /* renamed from: b */
    public void mo159403b(Map<String, C45084c> map) {
        if (CollectionUtils.isEmpty(map) || !aX_()) {
            this.f114079d.clear();
        } else {
            this.mSelectAvatarsView.setVisibility(0);
            this.f114079d.resetAll(new ArrayList(map.values()));
            this.mSelectedRV.scrollToPosition(this.f114079d.getItemCount() - 1);
        }
        mo159408c(map);
    }

    /* renamed from: a */
    public void setViewDelegate(T t) {
        this.f114080e = t;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159393a(String str) {
        this.mLoadFailView.setVisibility(0);
    }

    public BaseGroupMemberManageView(Activity activity, VD vd) {
        this.f114083h = activity;
        this.f114082g = vd;
    }

    /* renamed from: a */
    public void mo159387a(int i, int i2) {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(i), i2) {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450617 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                BaseGroupMemberManageView.this.f114080e.mo159461f();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f114076a = rightText;
        rightText.setPadding(0, 0, UIUtils.dp2px(this.f114083h, 15.0f), 0);
    }

    /* renamed from: a */
    public void mo159394a(String str, int i) {
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(str, i) {
            /* class com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView.C450628 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                BaseGroupMemberManageView.this.f114080e.mo159461f();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f114076a = rightText;
        rightText.setPadding(0, 0, UIUtils.dp2px(this.f114083h, 15.0f), 0);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159389a(Chatter chatter, String str, String str2) {
        this.f114082g.mo159428a(chatter, str, str2);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b
    /* renamed from: a */
    public void mo159392a(SelectBeansResult dVar, List<C45084c> list, Map<String, C45084c> map) {
        m178689e(dVar);
        mo159570c(list);
        mo159397a(map);
        mo159386a(map.size());
    }
}
