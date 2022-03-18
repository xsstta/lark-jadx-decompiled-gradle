package com.bytedance.ee.bear.lark.selector.base;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.transition.C1556v;
import butterknife.BindView;
import com.bytedance.ee.bear.lark.selector.base.ISelectorView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import com.ss.android.lark.widget.recyclerview.C58984d;
import com.ss.android.lark.widget.util.C59252a;
import java.util.Collections;
import java.util.List;

public class SelectorView<Value> implements ISelectorView<Value> {

    /* renamed from: a */
    public Activity f21646a;

    /* renamed from: b */
    public ISelectorView.AbstractC8088a f21647b;

    /* renamed from: c */
    public ISelectorView.AbstractC8089b f21648c;

    /* renamed from: d */
    public C8114g<Value> f21649d;

    /* renamed from: e */
    public C58984d f21650e;

    /* renamed from: f */
    public C8105d<Value> f21651f;

    /* renamed from: g */
    public String f21652g;

    /* renamed from: h */
    private int f21653h;
    @BindView(9860)
    RelativeLayout mBottomSelectActionRL;
    @BindView(8403)
    Button mConfirmBtn;
    @BindView(9170)
    View mLoadEmptyView;
    @BindView(9171)
    View mLoadFailView;
    @BindView(8812)
    LKUIPtrClassicFrameLayout mPtrFrame;
    @BindView(9675)
    LinearLayout mSearchBar;
    @BindView(10012)
    TextView mSearchEmptyHintTV;
    @BindView(9689)
    SpaceEditText mSearchEt;
    @BindView(9712)
    RecyclerView mSearchResultRV;
    @BindView(9744)
    TextView mSelectCountTV;
    @BindView(10082)
    CommonTitleBar mTitleBar;

    /* renamed from: com.bytedance.ee.bear.lark.selector.base.SelectorView$a */
    public interface AbstractC8099a<Value> {
        /* renamed from: a */
        AbstractView$OnClickListenerC58987e.AbstractC58989b<Value> mo31236a(C58984d dVar);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public List<Value> mo31245a() {
        return this.f21650e.mo200097a();
    }

    /* renamed from: f */
    private void m32360f() {
        m32361g();
        m32362h();
        m32363i();
        m32364j();
    }

    /* renamed from: c */
    public void mo31251c() {
        this.mPtrFrame.refreshComplete();
        this.mPtrFrame.setVisibility(4);
        this.mLoadEmptyView.setVisibility(0);
        this.mLoadFailView.setVisibility(4);
        this.mSearchEmptyHintTV.setText(R.string.Lark_Legacy_RecentEmpty);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        if (this.f21649d != null) {
            this.f21648c.mo31239a(this);
            m32360f();
            return;
        }
        throw new IllegalStateException("SelectorView's viewConfig not inited!");
    }

    /* renamed from: d */
    public void mo31253d() {
        this.mPtrFrame.refreshComplete();
        this.mPtrFrame.setVisibility(4);
        this.mLoadEmptyView.setVisibility(0);
        this.mLoadFailView.setVisibility(4);
        this.mSearchEmptyHintTV.setText(R.string.Lark_Legacy_SearchEmpty);
    }

    /* renamed from: e */
    public void mo31254e() {
        this.mPtrFrame.refreshComplete();
        this.mPtrFrame.setVisibility(4);
        this.mLoadEmptyView.setVisibility(4);
        this.mLoadFailView.setVisibility(0);
    }

    /* renamed from: i */
    private void m32363i() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f21646a);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80989 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                SelectorView.this.mSearchEt.clearFocus();
                KeyboardUtils.hideKeyboard(SelectorView.this.f21646a);
                SelectorView.this.f21647b.mo31244b(SelectorView.this.f21652g);
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !SelectorView.this.f21647b.mo31243a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: j */
    private void m32364j() {
        this.mSearchBar.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.AnonymousClass10 */

            public void onClick(View view) {
                SelectorView.this.mSearchEt.setFocusable(true);
                SelectorView.this.mSearchEt.setFocusableInTouchMode(true);
                SelectorView.this.mSearchEt.requestFocus();
                KeyboardUtils.showKeyboard(SelectorView.this.f21646a);
            }
        });
        this.mSearchEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.AnonymousClass11 */

            public void onFocusChange(View view, boolean z) {
                C1556v.m7130a(SelectorView.this.mSearchBar);
                InputMethodManager inputMethodManager = (InputMethodManager) SelectorView.this.f21646a.getSystemService("input_method");
                if (inputMethodManager == null) {
                    return;
                }
                if (z) {
                    inputMethodManager.showSoftInput(SelectorView.this.mSearchEt, 2);
                    SelectorView.this.mSearchBar.setGravity(3);
                } else if (TextUtils.isEmpty(SelectorView.this.mSearchEt.getText())) {
                    inputMethodManager.hideSoftInputFromWindow(SelectorView.this.mSearchEt.getWindowToken(), 0);
                    SelectorView.this.mSearchBar.setGravity(17);
                }
            }
        });
        this.mSearchEt.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.AnonymousClass12 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable)) {
                    SelectorView.this.f21652g = "";
                } else {
                    SelectorView.this.f21652g = editable.toString();
                }
                SelectorView.this.f21647b.mo31242a(SelectorView.this.f21652g);
            }
        });
        this.mSearchResultRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80912 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    SelectorView.this.mSearchEt.clearFocus();
                    KeyboardUtils.hideKeyboard(SelectorView.this.f21646a);
                }
            }
        });
        this.mConfirmBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.View$OnClickListenerC80923 */

            public void onClick(View view) {
                SelectorView.this.f21648c.mo31240a(SelectorView.this.mo31245a());
            }
        });
        this.mSelectCountTV.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.View$OnClickListenerC80934 */

            public void onClick(View view) {
                SelectorView.this.f21648c.mo31241b(SelectorView.this.mo31245a());
            }
        });
    }

    /* renamed from: b */
    public void mo31249b() {
        int i;
        this.f21653h = 1 - this.f21653h;
        TextView rightText = this.mTitleBar.getRightText();
        Activity activity = this.f21646a;
        if (this.f21653h == 0) {
            i = R.string.Lark_Legacy_Select;
        } else {
            i = R.string.Lark_Legacy_SelectSingle;
        }
        rightText.setText(UIUtils.getString(activity, i));
    }

    /* renamed from: g */
    private void m32361g() {
        int i;
        this.mTitleBar.setTitle(this.f21649d.f21679c);
        this.mTitleBar.setLeftImageResource(R.drawable.titlebar_close_bg_selector);
        if (this.f21649d.f21677a == 2) {
            Activity activity = this.f21646a;
            if (this.f21653h == 0) {
                i = R.string.Lark_Legacy_Select;
            } else {
                i = R.string.Lark_Legacy_SelectSingle;
            }
            this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(activity, i)) {
                /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80901 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    SelectorView.this.mo31249b();
                }
            });
            this.mTitleBar.getRightText().setPadding(0, 0, UIUtils.dp2px(this.f21646a, 15.0f), 0);
        }
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.View$OnClickListenerC80945 */

            public void onClick(View view) {
                SelectorView.this.f21648c.mo31238a();
            }
        });
    }

    /* renamed from: h */
    private void m32362h() {
        this.mSelectCountTV.setText(this.f21648c.mo31237a(0));
        this.mConfirmBtn.setAlpha(0.4f);
        this.mConfirmBtn.setText(this.f21649d.f21680d);
        boolean z = true;
        this.mSearchResultRV.setLayoutManager(new LinearLayoutManager(this.f21646a, 1, false));
        C8105d<Value> dVar = new C8105d<>();
        this.f21651f = dVar;
        C58984d dVar2 = new C58984d(dVar);
        this.f21650e = dVar2;
        dVar2.mo200101a((C58984d.AbstractC58986b) new C58984d.AbstractC58986b() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80956 */

            @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58986b
            /* renamed from: a */
            public void mo31263a() {
                int b = SelectorView.this.f21650e.mo200104b();
                SelectorView.this.mSelectCountTV.setText(SelectorView.this.f21648c.mo31237a(b));
                if (b <= 0) {
                    SelectorView.this.mConfirmBtn.setAlpha(0.4f);
                } else {
                    SelectorView.this.mConfirmBtn.setAlpha(1.0f);
                }
            }

            @Override // com.ss.android.lark.widget.recyclerview.C58984d.AbstractC58986b
            /* renamed from: a */
            public void mo31264a(boolean z) {
                int i;
                RelativeLayout relativeLayout = SelectorView.this.mBottomSelectActionRL;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                relativeLayout.setVisibility(i);
            }
        });
        C58984d dVar3 = this.f21650e;
        if (this.f21653h != 1) {
            z = false;
        }
        dVar3.mo200103a(z);
        this.f21651f.mo200108a(this.f21649d.f21682f.mo31236a(this.f21650e));
        ((SimpleItemAnimator) this.mSearchResultRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mSearchResultRV.setAdapter(this.f21651f);
        this.f21651f.mo200109a(new AbstractView$OnClickListenerC58987e.AbstractC58990c<Value>() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80967 */

            @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e.AbstractC58990c
            public void onItemClicked(View view, int i, Value value) {
                if (!SelectorView.this.f21650e.mo200107c()) {
                    SelectorView.this.f21648c.mo31240a(Collections.singletonList(value));
                } else if (SelectorView.this.f21650e.mo200105b(i)) {
                    SelectorView.this.f21650e.mo200099a(i, false);
                } else if (SelectorView.this.f21650e.mo200104b() < SelectorView.this.f21649d.f21681e) {
                    SelectorView.this.f21650e.mo200099a(i, true);
                } else {
                    LKUIToast.show(SelectorView.this.f21646a, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DocsSelectMaxCount, "max_count", Integer.toString(SelectorView.this.f21649d.f21681e)));
                }
            }
        });
        C59252a.m230151a(this.f21646a, this.mPtrFrame, this.mSearchResultRV, new C59252a.AbstractC59254a() {
            /* class com.bytedance.ee.bear.lark.selector.base.SelectorView.C80978 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return SelectorView.this.f21651f.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (SelectorView.this.f21647b == null || !SelectorView.this.f21647b.mo31243a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(ISelectorView.AbstractC8088a aVar) {
        this.f21647b = aVar;
    }

    /* renamed from: a */
    public void mo31247a(C8114g<Value> gVar) {
        this.f21649d = gVar;
        this.f21653h = gVar.f21678b;
    }

    /* renamed from: a */
    public void mo31248a(List<Value> list) {
        C58984d dVar = this.f21650e;
        if (dVar != null) {
            dVar.mo200102a((List) list);
        }
    }

    /* renamed from: b */
    public void mo31250b(List<Value> list) {
        this.f21651f.mo31277a(list);
        this.mPtrFrame.refreshComplete();
        this.mPtrFrame.setVisibility(0);
        this.mLoadEmptyView.setVisibility(4);
        this.mLoadFailView.setVisibility(4);
    }

    /* renamed from: c */
    public void mo31252c(List<Value> list) {
        this.f21651f.mo31278b(list);
        this.mPtrFrame.refreshComplete();
        this.mPtrFrame.setVisibility(0);
        this.mLoadEmptyView.setVisibility(4);
        this.mLoadFailView.setVisibility(4);
    }

    public SelectorView(Activity activity, ISelectorView.AbstractC8089b bVar) {
        this.f21646a = activity;
        this.f21648c = bVar;
    }
}
