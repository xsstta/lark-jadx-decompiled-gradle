package com.ss.android.lark.oncall.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.transition.AutoTransition;
import androidx.transition.C1555u;
import androidx.transition.C1556v;
import androidx.transition.Transition;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import com.larksuite.framework.ui.flowlayout.C26227b;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.framework.ui.flowlayout.TagFlowLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.oncall.OnCallModule;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import com.ss.android.lark.oncall.ui.AbstractC48732a;
import com.ss.android.lark.oncall.ui.LarkOnCallAdapter;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.ArrayList;
import java.util.List;

public class OnCallView implements AbstractC48732a.AbstractC48735b {

    /* renamed from: a */
    public LarkOnCallAdapter f122456a;

    /* renamed from: b */
    public AbstractC48732a.AbstractC48735b.AbstractC48736a f122457b;

    /* renamed from: c */
    public AbstractC48731b f122458c;

    /* renamed from: d */
    public Activity f122459d;

    /* renamed from: e */
    public OnCallTag f122460e;

    /* renamed from: f */
    public String f122461f;

    /* renamed from: g */
    public View f122462g;

    /* renamed from: h */
    public List<OnCallTag> f122463h = new ArrayList();

    /* renamed from: i */
    private C48730a f122464i;

    /* renamed from: j */
    private LinearLayoutManager f122465j;

    /* renamed from: k */
    private Drawable f122466k;

    /* renamed from: l */
    private Drawable f122467l;

    /* renamed from: m */
    private int f122468m;
    @BindView(6031)
    TextView mDesktopTitleBar;
    @BindView(6365)
    View mLoadFailView;
    @BindView(6367)
    LKUIPtrClassicFrameLayout mOnCallPtrLayout;
    @BindView(6122)
    RecyclerView mRecyclerView;
    @BindView(6434)
    ViewGroup mRoot;
    @BindView(6474)
    View mSearchBar;
    @BindView(6168)
    View mSearchClear;
    @BindView(6478)
    EditText mSearchET;
    @BindView(6577)
    TagFlowLayout mTagFlowLayout;
    @BindView(6630)
    CommonTitleBar mTitleBar;

    /* renamed from: n */
    private int f122469n;

    /* renamed from: com.ss.android.lark.oncall.ui.OnCallView$b */
    public interface AbstractC48731b {
        /* renamed from: a */
        void mo169994a();

        /* renamed from: a */
        void mo169995a(OnCallView onCallView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public void mo169978a() {
        if (this.mOnCallPtrLayout.isRefreshing()) {
            this.mOnCallPtrLayout.refreshComplete();
        }
    }

    /* renamed from: f */
    private void m191981f() {
        if (this.mTagFlowLayout.getVisibility() != 0) {
            C1556v.m7131a(this.mTagFlowLayout, new AutoTransition());
            this.mTagFlowLayout.setVisibility(0);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC48731b bVar = this.f122458c;
        if (bVar != null) {
            bVar.mo169995a(this);
        }
        m191976b();
        m191984i();
        m191983h();
        m191979d();
        m191978c();
    }

    /* renamed from: b */
    private void m191976b() {
        this.f122466k = this.f122459d.getResources().getDrawable(R.drawable.oncall_tag_item_bg_selected);
        this.f122467l = this.f122459d.getResources().getDrawable(R.drawable.oncall_tag_item_bg_unselected);
        this.f122468m = this.f122459d.getResources().getColor(R.color.text_caption);
        this.f122469n = this.f122459d.getResources().getColor(R.color.static_white);
    }

    /* renamed from: c */
    private void m191978c() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f122459d);
        this.mOnCallPtrLayout.setKeepHeaderWhenRefresh(true);
        this.mOnCallPtrLayout.setFooterView(chatWindowPtrLoadingHeader);
        this.mOnCallPtrLayout.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mOnCallPtrLayout.disableWhenHorizontalMove(true);
        this.mOnCallPtrLayout.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.C487211 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                OnCallView.this.f122457b.mo170008b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return OnCallView.this.mo169984a(super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2));
            }
        });
        C59252a.m230151a(this.f122459d, this.mOnCallPtrLayout, this.mRecyclerView, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.C487244 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return OnCallView.this.f122456a.getItemCount() - 10;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                return OnCallView.this.f122457b.mo170007a();
            }
        });
        this.f122456a.mo169975a(new LarkOnCallAdapter.AbstractC48720a() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.C487255 */

            @Override // com.ss.android.lark.oncall.ui.LarkOnCallAdapter.AbstractC48720a
            /* renamed from: a */
            public void mo169977a(String str) {
                OnCallView.this.f122457b.mo170006a(str);
            }
        });
    }

    /* renamed from: d */
    private void m191979d() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f122459d, 1, false);
        this.f122465j = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        LarkOnCallAdapter larkOnCallAdapter = new LarkOnCallAdapter();
        this.f122456a = larkOnCallAdapter;
        this.mRecyclerView.setAdapter(larkOnCallAdapter);
        ((SimpleItemAnimator) this.mRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* renamed from: e */
    private void m191980e() {
        if (this.f122463h.size() == 0) {
            this.mTagFlowLayout.setVisibility(8);
        } else if (this.mTagFlowLayout.getVisibility() == 0) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.mo7880a(new C1555u() {
                /* class com.ss.android.lark.oncall.ui.OnCallView.C487266 */

                @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                /* renamed from: a */
                public void mo7815a(Transition transition) {
                    super.mo7815a(transition);
                    OnCallView.this.mTagFlowLayout.setVisibility(8);
                }

                @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                /* renamed from: b */
                public void mo7816b(Transition transition) {
                    super.mo7816b(transition);
                    OnCallView.this.mTagFlowLayout.setVisibility(8);
                }
            });
            C1556v.m7131a(this.mTagFlowLayout, autoTransition);
            this.mTagFlowLayout.setVisibility(4);
        }
    }

    /* renamed from: g */
    private void m191982g() {
        C26227b bVar = (C26227b) this.mTagFlowLayout.getChildAt(0);
        if (bVar != null) {
            View tagView = bVar.getTagView();
            this.f122462g = tagView;
            tagView.setSelected(true);
            mo169979a(this.f122462g, true);
            this.f122460e = this.f122463h.get(0);
        }
    }

    /* renamed from: h */
    private void m191983h() {
        this.mLoadFailView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.View$OnClickListenerC487277 */

            public void onClick(View view) {
                KeyboardUtils.hideKeyboard(OnCallView.this.f122459d);
            }
        });
        this.mSearchET.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.C487288 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                OnCallView.this.f122461f = charSequence.toString();
                if (TextUtils.isEmpty(charSequence)) {
                    OnCallView.this.mSearchClear.setVisibility(8);
                    OnCallView.this.f122457b.mo170010c();
                } else {
                    OnCallView.this.mSearchClear.setVisibility(0);
                    OnCallView.this.f122457b.mo170011c(charSequence.toString());
                }
                OnCallView.this.mo169978a();
            }
        });
        this.mSearchBar.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.View$OnClickListenerC487299 */

            public void onClick(View view) {
                OnCallView.this.mSearchET.setFocusable(true);
                OnCallView.this.mSearchET.setFocusableInTouchMode(true);
                OnCallView.this.mSearchET.requestFocus();
                KeyboardUtils.showKeyboard(OnCallView.this.f122459d);
            }
        });
        this.mSearchClear.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.AnonymousClass10 */

            public void onClick(View view) {
                OnCallView.this.mSearchET.setText("");
                KeyboardUtils.hideKeyboard(OnCallView.this.f122459d);
            }
        });
        C48730a aVar = new C48730a(this.f122463h);
        this.f122464i = aVar;
        this.mTagFlowLayout.setAdapter(aVar);
        this.mTagFlowLayout.setOnTagClickListener(new TagFlowLayout.AbstractC26224b() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.AnonymousClass11 */

            @Override // com.larksuite.framework.ui.flowlayout.TagFlowLayout.AbstractC26224b
            /* renamed from: a */
            public boolean mo93289a(View view, int i, FlowLayout flowLayout) {
                if (!TextUtils.isEmpty(OnCallView.this.f122461f)) {
                    return false;
                }
                if (!view.isSelected()) {
                    if (OnCallView.this.f122462g != null) {
                        OnCallView.this.f122462g.setSelected(false);
                        OnCallView onCallView = OnCallView.this;
                        onCallView.mo169979a(onCallView.f122462g, false);
                    }
                    OnCallView.this.f122462g = view;
                    view.setSelected(true);
                    OnCallView.this.mo169979a(view, true);
                    OnCallView onCallView2 = OnCallView.this;
                    onCallView2.f122460e = onCallView2.f122463h.get(i);
                    if (OnCallView.this.f122460e.getId().equals("tag_all_id")) {
                        OnCallView.this.f122457b.mo170010c();
                    } else {
                        OnCallView.this.f122457b.mo170009b(OnCallView.this.f122460e.getId());
                    }
                }
                OnCallView.this.mo169978a();
                return true;
            }
        });
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.oncall.ui.OnCallView.C487222 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    OnCallView.this.mSearchET.clearFocus();
                    KeyboardUtils.hideKeyboard(OnCallView.this.f122459d);
                }
            }
        });
    }

    /* renamed from: i */
    private void m191984i() {
        if (!DesktopUtil.m144301a((Context) this.f122459d)) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_HelpDesk_HelpDeskTitle));
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.oncall.ui.OnCallView.View$OnClickListenerC487233 */

                public void onClick(View view) {
                    KeyboardUtils.hideKeyboard(OnCallView.this.f122459d);
                    OnCallView.this.f122458c.mo169994a();
                }
            });
            return;
        }
        this.mDesktopTitleBar.setText(UIHelper.getString(R.string.Lark_HelpDesk_HelpDeskTitle));
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        ((RelativeLayout.LayoutParams) this.mSearchBar.getLayoutParams()).topMargin = UIHelper.dp2px(8.0f);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC48732a.AbstractC48735b.AbstractC48736a aVar) {
        this.f122457b = aVar;
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b
    /* renamed from: b */
    public void mo169985b(String str) {
        LKUIToast.show(this.f122459d, str);
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b
    /* renamed from: a */
    public void mo169981a(String str) {
        OnCallModule.f122434b.mo169922a().mo143994a(this.f122459d, str);
    }

    /* renamed from: b */
    private void m191977b(List<OnCall> list) {
        if (list != null) {
            if (list.size() == 0) {
                this.mLoadFailView.setVisibility(0);
            } else {
                this.mLoadFailView.setVisibility(8);
            }
            if (this.mOnCallPtrLayout.isRefreshing()) {
                this.mOnCallPtrLayout.refreshComplete();
            }
        }
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b
    /* renamed from: a */
    public void mo169982a(List<OnCallTag> list) {
        if (list.size() > 0) {
            this.f122463h.add(new OnCallTag("tag_all_id", this.f122459d.getString(R.string.Lark_Legacy_All)));
            this.f122463h.addAll(list);
        }
        this.f122460e = null;
        this.f122462g = null;
        this.f122464i.mo93296c();
        m191982g();
    }

    /* renamed from: a */
    public boolean mo169984a(boolean z) {
        if (!this.f122457b.mo170007a() || !z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.oncall.ui.OnCallView$a */
    public class C48730a extends AbstractC26225a<OnCallTag> {
        public C48730a(List<OnCallTag> list) {
            super(list);
        }

        /* renamed from: a */
        public View mo93290a(FlowLayout flowLayout, int i, OnCallTag onCallTag) {
            TextView textView = (TextView) LayoutInflater.from(OnCallView.this.f122459d).inflate(R.layout.oncall_tag_item, (ViewGroup) null);
            textView.setText(((OnCallTag) mo93291a(i)).getName());
            return textView;
        }
    }

    public OnCallView(AbstractC48731b bVar, Activity activity) {
        this.f122458c = bVar;
        this.f122459d = activity;
    }

    /* renamed from: a */
    public void mo169979a(View view, boolean z) {
        if (z) {
            view.setBackground(this.f122466k);
            ((TextView) view).setTextColor(this.f122469n);
            return;
        }
        view.setBackground(this.f122467l);
        ((TextView) view).setTextColor(this.f122468m);
    }

    @Override // com.ss.android.lark.oncall.ui.AbstractC48732a.AbstractC48735b
    /* renamed from: a */
    public void mo169983a(List<OnCall> list, int i, boolean z) {
        if (i == 1) {
            m191980e();
        } else if (i == 0) {
            View view = this.f122462g;
            if (view != null) {
                view.setSelected(false);
                mo169979a(this.f122462g, false);
            }
            m191982g();
            m191981f();
        } else {
            m191981f();
        }
        this.f122456a.diff(list);
        if (z) {
            this.f122465j.scrollToPosition(0);
        }
        m191977b(list);
    }
}
