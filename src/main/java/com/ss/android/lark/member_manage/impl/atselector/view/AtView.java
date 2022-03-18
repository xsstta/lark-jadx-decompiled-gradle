package com.ss.android.lark.member_manage.impl.atselector.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.transition.C1556v;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.ui.p1198b.C26183a;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.C44972b;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.AtHeaderSelectedAdapter;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.C45021a;
import com.ss.android.lark.member_manage.impl.statistics.AtSelectPerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtView implements C44972b.AbstractC44975b {

    /* renamed from: a */
    public Context f113969a;

    /* renamed from: b */
    public AbstractC45018a f113970b;

    /* renamed from: c */
    public HashMap<String, Integer> f113971c = new HashMap<>();

    /* renamed from: d */
    public int f113972d = 0;

    /* renamed from: e */
    public C44972b.AbstractC44975b.AbstractC44976a f113973e;

    /* renamed from: f */
    private TextView f113974f;

    /* renamed from: g */
    private C45021a f113975g;

    /* renamed from: h */
    private C45021a f113976h;

    /* renamed from: i */
    private AtHeaderSelectedAdapter f113977i;

    /* renamed from: j */
    private GroupMemberManageModule.IItemContainer.AbstractC44875a f113978j = new GroupMemberManageModule.IItemContainer.AbstractC44875a() {
        /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450091 */

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer.AbstractC44875a
        /* renamed from: a */
        public void mo158810a(BaseAtBean baseAtBean) {
            AtView.this.f113973e.mo159103a(baseAtBean);
        }

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer.AbstractC44875a
        /* renamed from: b */
        public void mo158811b(BaseAtBean baseAtBean) {
            AtView.this.f113973e.mo159106b(baseAtBean);
        }

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.IItemContainer.AbstractC44875a
        /* renamed from: c */
        public void mo158812c(BaseAtBean baseAtBean) {
            AtView.this.f113973e.mo159107c(baseAtBean);
        }
    };

    /* renamed from: k */
    private AtHeaderSelectedAdapter.AbstractC45020a f113979k = new AtHeaderSelectedAdapter.AbstractC45020a() {
        /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450124 */

        @Override // com.ss.android.lark.member_manage.impl.atselector.view.adapter.AtHeaderSelectedAdapter.AbstractC45020a
        /* renamed from: a */
        public void mo159256a(BaseAtBean baseAtBean) {
            AtView.this.f113973e.mo159110d(baseAtBean);
        }
    };

    /* renamed from: l */
    private TextWatcher f113980l = new TextWatcher() {
        /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450113 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                AtView.this.mo159250b();
                Log.m165389i("AtView", "afterTextChanged clearSearchResult");
                AtView.this.mQuickSideBarView.setVisibility(0);
                AtView.this.mQuickSideBarCover.setVisibility(8);
                AtView.this.mLoadEmptyView.setVisibility(8);
                AtView.this.mRecommendRecyclerView.setVisibility(0);
                AtView.this.mQuickSideBarTipView.setVisibility(8);
                return;
            }
            String obj = editable.toString();
            AtView.this.f113973e.mo159104a(obj);
            Log.m165389i("AtView", obj);
        }
    };
    View mLoadEmptyView;
    LKUIPtrClassicFrameLayout mPtrFrame;
    View mQuickSideBarCover;
    QuickSideBarTipsView mQuickSideBarTipView;
    QuickSideBarView mQuickSideBarView;
    RecyclerView mRecommendRecyclerView;
    LinearLayout mRecyclerViewLayout;
    LinearLayout mSearchBar;
    TextView mSearchEmptyHintTV;
    EditText mSearchEt;
    RecyclerView mSearchResultRV;
    LinearLayout mSelectAtLayout;
    RecyclerView mSelectedRV;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.AtView$a */
    public interface AbstractC45018a {
        /* renamed from: a */
        void mo159090a();

        /* renamed from: a */
        void mo159091a(AtView atView);

        /* renamed from: a */
        void mo159092a(String str);

        /* renamed from: a */
        void mo159093a(List<ChatChatter> list);
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public int mo159136a() {
        return this.f113972d;
    }

    /* renamed from: h */
    public static /* synthetic */ void m178497h() {
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159947j();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        EditText editText = this.mSearchEt;
        if (editText != null) {
            editText.removeTextChangedListener(this.f113980l);
        }
    }

    /* renamed from: c */
    private void m178491c() {
        m178493d();
        m178494e();
        m178495f();
        this.mQuickSideBarView.setVisibility(8);
        this.mQuickSideBarCover.setVisibility(0);
    }

    /* renamed from: b */
    public void mo159250b() {
        this.f113976h.clear();
        this.mSearchResultRV.setVisibility(4);
        this.mPtrFrame.setVisibility(4);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f113970b.mo159091a(this);
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159943f();
        m178491c();
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159944g();
        m178496g();
    }

    /* renamed from: f */
    private void m178495f() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f113969a);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450168 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                AtView.this.mSearchEt.clearFocus();
                KeyboardUtils.hideKeyboard(AtView.this.f113969a);
                AtView.this.f113973e.mo159105b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!AtView.this.f113973e.mo159108c() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: g */
    private void m178496g() {
        this.mQuickSideBarView.setOnQuickSideBarTouchListener(new AbstractC58955a() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450179 */

            @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
            /* renamed from: a */
            public void mo131379a(boolean z) {
                int i;
                QuickSideBarTipsView quickSideBarTipsView = AtView.this.mQuickSideBarTipView;
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
                AtView.this.mQuickSideBarTipView.mo200024a(str, i, f - ((float) UIUtils.dp2px(AtView.this.f113969a, 40.0f)));
                if (AtView.this.f113971c.containsKey(str)) {
                    ((LinearLayoutManager) AtView.this.mRecommendRecyclerView.getLayoutManager()).scrollToPositionWithOffset(AtView.this.f113971c.get(str).intValue(), 0);
                }
            }
        });
        this.mRecommendRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.AnonymousClass10 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    AtView.this.mSearchEt.clearFocus();
                    KeyboardUtils.hideKeyboard(AtView.this.f113969a);
                }
            }
        });
        this.mSearchBar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.AnonymousClass11 */

            public void onClick(View view) {
                AtView.this.mSearchEt.setFocusable(true);
                AtView.this.mSearchEt.setFocusableInTouchMode(true);
                AtView.this.mSearchEt.requestFocus();
                KeyboardUtils.showKeyboard(AtView.this.f113969a);
            }
        });
        this.mSearchEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.$$Lambda$AtView$Frjgfi0jjlcVx4pGFUZ91IazaMc */

            public final void onFocusChange(View view, boolean z) {
                AtView.lambda$Frjgfi0jjlcVx4pGFUZ91IazaMc(AtView.this, view, z);
            }
        });
        this.mSearchEt.addTextChangedListener(this.f113980l);
        this.mSearchResultRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450102 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    AtView.this.mSearchEt.clearFocus();
                    KeyboardUtils.hideKeyboard(AtView.this.f113969a);
                }
            }
        });
    }

    /* renamed from: d */
    private void m178493d() {
        this.mTitleBar.setTitle(R.string.Lark_Legacy_TitleSelectMember);
        this.mTitleBar.setLeftTextOnly(CommonTitleBarConstants.Lark_Legacy_Cancel);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f113969a, R.string.Lark_Legacy_Select)) {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.C450135 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                AtView.this.f113973e.mo159102a(AtView.this.f113972d);
            }
        });
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.View$OnClickListenerC450146 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(AtView.this.f113969a);
                AtView.this.f113970b.mo159090a();
            }
        });
        TextView rightText = this.mTitleBar.getRightText();
        this.f113974f = rightText;
        rightText.setPadding(0, 0, UIUtils.dp2px(this.f113969a, 15.0f), 0);
    }

    /* renamed from: e */
    private void m178494e() {
        this.mRecommendRecyclerView.setLayoutManager(new LinearLayoutManager(this.f113969a, 1, false));
        ((SimpleItemAnimator) this.mRecommendRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mRecommendRecyclerView.getItemAnimator().setRemoveDuration(0);
        this.mRecommendRecyclerView.getItemAnimator().setAddDuration(0);
        this.mRecyclerViewLayout.setVisibility(8);
        C45021a aVar = new C45021a();
        this.f113975g = aVar;
        aVar.mo159264b(0);
        this.f113975g.mo159263a(this.f113978j);
        this.mRecommendRecyclerView.setAdapter(this.f113975g);
        this.mRecommendRecyclerView.addItemDecoration(new C26183a(this.f113975g));
        this.mSearchResultRV.setLayoutManager(new LinearLayoutManager(this.f113969a, 1, false));
        this.f113976h = new C45021a();
        ((SimpleItemAnimator) this.mSearchResultRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mSearchResultRV.setAdapter(this.f113976h);
        this.f113976h.mo159263a(this.f113978j);
        AtHeaderSelectedAdapter atHeaderSelectedAdapter = new AtHeaderSelectedAdapter();
        this.f113977i = atHeaderSelectedAdapter;
        atHeaderSelectedAdapter.mo159261a(this.f113979k);
        this.mSelectedRV.setLayoutManager(new LinearLayoutManager(this.f113969a, 0, false));
        this.mSelectedRV.setAdapter(this.f113977i);
    }

    /* renamed from: a */
    public void setViewDelegate(C44972b.AbstractC44975b.AbstractC44976a aVar) {
        this.f113973e = aVar;
    }

    /* renamed from: c */
    public void mo159251c(String str) {
        this.f113970b.mo159092a(str);
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159137a(String str) {
        this.mPtrFrame.refreshComplete();
        mo159251c(UIHelper.getString(R.string.Lark_Legacy_NetError));
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: c */
    public void mo159145c(List<BaseAtBean> list) {
        C45021a aVar = this.f113976h;
        if (aVar != null && list != null) {
            aVar.resetAll(list);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159139a(List<BaseAtBean> list) {
        this.f113971c.clear();
        m178489a(false, list);
        this.f113975g.resetAll(list);
        this.mRecommendRecyclerView.post($$Lambda$AtView$Yhdh32cQGiDyAIy66sN1xul2gHg.INSTANCE);
        C48211b.m190251a().mo168687a(this.mRecommendRecyclerView);
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159144b(List<BaseAtBean> list) {
        C45021a aVar = this.f113975g;
        if (aVar != null && list != null) {
            aVar.diff(list);
        }
    }

    /* renamed from: b */
    private void m178490b(Map<String, BaseAtBean> map) {
        if (this.f113972d == 1) {
            if (map.isEmpty()) {
                this.f113974f.setText(R.string.Lark_Legacy_SelectSingle);
                this.f113974f.setTextColor(UDColorUtils.getColor(this.f113969a, R.color.text_title));
            } else {
                this.f113974f.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerConfirmWithCount, "count", Integer.toString(map.size())));
                this.f113974f.setTextColor(UDColorUtils.getColor(this.f113969a, R.color.primary_pri_500));
            }
            if (this.f113975g != null) {
                this.f113973e.mo159109d();
                return;
            }
            return;
        }
        this.f113974f.setText(R.string.Lark_Legacy_Select);
        if (this.f113975g != null) {
            this.f113973e.mo159111e();
        }
    }

    /* renamed from: d */
    private List<String> m178492d(List<BaseAtBean> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (BaseAtBean baseAtBean : list) {
            if (baseAtBean != null && baseAtBean.getType() == 0) {
                String valueOf = String.valueOf(baseAtBean.getPinyin());
                if (!this.f113971c.containsKey(valueOf.toUpperCase())) {
                    this.f113971c.put(valueOf.toUpperCase(), Integer.valueOf(i));
                    arrayList.add(valueOf.toUpperCase());
                }
            }
            i++;
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159142b(String str) {
        this.mPtrFrame.refreshComplete();
        if (str.equals(this.mSearchEt.getText().toString().trim())) {
            mo159250b();
            this.mRecommendRecyclerView.setVisibility(8);
            this.mLoadEmptyView.setVisibility(0);
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Noresult, "search_key", str);
            int indexOf = mustacheFormat.indexOf("'");
            int lastIndexOf = mustacheFormat.lastIndexOf("'");
            TextView textView = this.mSearchEmptyHintTV;
            textView.setText(C57782ag.m224238a(mustacheFormat, indexOf, lastIndexOf, str, C57582a.m223616d(textView.getContext(), R.color.function_info_500)));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159140a(Map<String, BaseAtBean> map) {
        int i = (this.f113972d + 1) % 2;
        this.f113972d = i;
        C45021a aVar = this.f113975g;
        if (aVar != null) {
            aVar.mo159264b(i);
            m178490b(map);
        }
        C45021a aVar2 = this.f113976h;
        if (aVar2 != null) {
            aVar2.mo159264b(this.f113972d);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: b */
    public void mo159143b(String str, List<ChatChatter> list) {
        KeyboardUtils.hideKeyboard(this.f113969a);
        this.f113970b.mo159093a(list);
    }

    public AtView(Context context, AbstractC45018a aVar) {
        this.f113969a = context;
        this.f113970b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m178488a(View view, boolean z) {
        C1556v.m7130a(this.mSearchBar);
        InputMethodManager inputMethodManager = (InputMethodManager) this.f113969a.getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(this.mSearchEt, 2);
        } else if (TextUtils.isEmpty(this.mSearchEt.getText())) {
            inputMethodManager.hideSoftInputFromWindow(this.mSearchEt.getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private void m178489a(boolean z, List<BaseAtBean> list) {
        if (!z) {
            this.mQuickSideBarView.setLetters(m178492d(list));
            this.mQuickSideBarView.setVisibility(0);
            this.mQuickSideBarCover.setVisibility(8);
            return;
        }
        this.mQuickSideBarView.setVisibility(8);
        this.mQuickSideBarCover.setVisibility(0);
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159138a(String str, List<BaseAtBean> list) {
        this.mPtrFrame.refreshComplete();
        if (str.equals(this.mSearchEt.getText().toString().trim())) {
            m178489a(true, list);
            this.mSearchResultRV.scrollToPosition(0);
            this.mPtrFrame.setVisibility(0);
            this.mLoadEmptyView.setVisibility(8);
            this.mRecommendRecyclerView.setVisibility(8);
            this.mSearchResultRV.setVisibility(0);
            this.mQuickSideBarTipView.setVisibility(8);
            this.mQuickSideBarView.setVisibility(8);
            this.f113976h.resetAll(list);
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b
    /* renamed from: a */
    public void mo159141a(Map<String, BaseAtBean> map, boolean z) {
        m178490b(map);
        if (map.isEmpty()) {
            this.f113977i.diff(map.values());
            this.mRecyclerViewLayout.post(new Runnable() {
                /* class com.ss.android.lark.member_manage.impl.atselector.view.AtView.RunnableC450157 */

                public void run() {
                    AtView.this.mRecyclerViewLayout.setVisibility(8);
                }
            });
            return;
        }
        this.mRecyclerViewLayout.setVisibility(0);
        this.f113977i.diff(map.values());
        if (z) {
            this.mSelectedRV.getLayoutManager().scrollToPosition(this.f113977i.getItemCount() - 1);
        }
    }
}
