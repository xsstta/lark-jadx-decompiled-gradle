package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.reporter.SearchOnScreenReporter;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public abstract class BaseChatInsideSearchView implements AbstractC53452d.AbstractC53455b {

    /* renamed from: a */
    protected Activity f132044a;

    /* renamed from: b */
    protected BaseFragment f132045b;

    /* renamed from: c */
    public AbstractC53452d.AbstractC53455b.AbstractC53456a f132046c;

    /* renamed from: d */
    private AbstractC53442a f132047d;

    /* renamed from: e */
    private SearchOnScreenReporter f132048e;
    @BindView(7594)
    public ImageView mDefaultIV;
    @BindView(7593)
    public TextView mDefaultTV;
    @BindView(6729)
    public View mDefaultView;
    @BindView(6730)
    public FrameLayout mFilterFL;
    @BindView(6731)
    public SearchInputView mSearchInput;
    @BindView(6732)
    public SearchResultView mSearchResultView;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView$a */
    public interface AbstractC53442a {
        /* renamed from: a */
        void mo182500a(BaseChatInsideSearchView baseChatInsideSearchView);

        /* renamed from: a */
        void mo182501a(String str, int i);

        /* renamed from: b */
        void mo182502b(String str, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo182467a();

    /* renamed from: b */
    public void mo182486b() {
        mo182489e();
    }

    /* renamed from: f */
    public Context mo182490f() {
        return this.f132044a;
    }

    /* renamed from: c */
    public void mo182488c() {
        this.mSearchResultView.mo184621d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132047d = null;
        this.f132046c = null;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b
    /* renamed from: g */
    public void mo182491g() {
        this.mSearchInput.mo184580a();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b
    /* renamed from: h */
    public void mo182492h() {
        this.mSearchInput.clearFocus();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b
    /* renamed from: i */
    public String mo182493i() {
        return this.mSearchInput.getQuery();
    }

    /* renamed from: j */
    private void mo182572j() {
        m206904l();
        m206903k();
        mo182467a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132047d.mo182500a(this);
        mo182572j();
    }

    /* renamed from: l */
    private void m206904l() {
        this.mSearchInput.setOnSearch(new SearchInputView.IOnSearch() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534405 */

            @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
            /* renamed from: a */
            public void mo162383a(String str) {
                BaseChatInsideSearchView.this.mo182481a(str);
            }
        });
        this.mSearchInput.setOnQueryClear(new SearchInputView.IOnQueryClear() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534416 */

            @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnQueryClear
            /* renamed from: a */
            public void mo162384a() {
                BaseChatInsideSearchView.this.mSearchInput.mo184580a();
                BaseChatInsideSearchView.this.mo182481a("");
            }
        });
    }

    /* renamed from: d */
    public void mo182470d() {
        this.mSearchResultView.setVisibility(8);
        this.mDefaultView.setVisibility(0);
        this.mDefaultTV.setText(UIHelper.getString(R.string.Lark_Legacy_PullEmptyResult));
        UIUtils.setViewOnScreenOneThirdPlaceByTranslationY(this.mDefaultView);
    }

    /* renamed from: e */
    public void mo182489e() {
        this.mSearchResultView.setVisibility(0);
        this.mSearchResultView.mo184609a();
        this.mDefaultView.setVisibility(8);
    }

    /* renamed from: k */
    private void m206903k() {
        this.mSearchResultView.mo184622e();
        this.mSearchResultView.setOnLoadMore(new SearchResultView.IOnLoadMore() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534361 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
            /* renamed from: a */
            public boolean mo182494a() {
                if (BaseChatInsideSearchView.this.f132046c == null || !BaseChatInsideSearchView.this.f132046c.mo182539b()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnLoadMore
            /* renamed from: b */
            public void mo182495b() {
                if (BaseChatInsideSearchView.this.f132046c != null) {
                    BaseChatInsideSearchView.this.f132046c.mo182535a(BaseChatInsideSearchView.this.mSearchInput.getQuery());
                }
            }
        });
        this.mSearchResultView.setOnResultScroll(new SearchResultView.IOnResultScroll() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534372 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
            /* renamed from: a */
            public void mo182497a(int i) {
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnResultScroll
            /* renamed from: a */
            public void mo182496a() {
                BaseChatInsideSearchView.this.mSearchInput.clearFocus();
            }
        });
        this.mSearchResultView.setOnClickEmptyView(new SearchResultView.IOnClickEmptyView() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534383 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnClickEmptyView
            /* renamed from: a */
            public void mo182498a() {
                BaseChatInsideSearchView.this.mSearchInput.clearFocus();
            }
        });
        this.mSearchResultView.setClickHandler(new SearchResultViewAdapter.IOnItemClickHandler() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.C534394 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
            /* renamed from: a */
            public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
                if (BaseChatInsideSearchView.this.f132046c != null) {
                    KeyboardUtils.hideKeyboard(BaseChatInsideSearchView.this.mo182490f());
                    BaseChatInsideSearchView.this.f132046c.mo182534a(searchBaseInfo, i);
                    Log.m165379d("LarkSearch.Search.BaseChatInsideSearchView", "click!!! " + SearchCommonConstants.m208815b(searchBaseInfo.getType()));
                    SearchClickReporter.m208839b(searchBaseInfo, "chat", BaseChatInsideSearchView.this.f132046c.mo182545g(), Integer.valueOf(i + 1));
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53452d.AbstractC53455b.AbstractC53456a aVar) {
        this.f132046c = aVar;
    }

    /* renamed from: a */
    public void mo182481a(String str) {
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar;
        if (TextUtils.isEmpty(str) && (aVar = this.f132046c) != null) {
            aVar.mo182542d();
        }
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar2 = this.f132046c;
        if (aVar2 != null) {
            aVar2.mo182536a(str, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182484a(List<SearchBaseInfo> list) {
        for (SearchBaseInfo searchBaseInfo : list) {
            searchBaseInfo.setQuery(this.mSearchInput.getQuery());
            AbstractC53452d.AbstractC53455b.AbstractC53456a aVar = this.f132046c;
            if (aVar != null) {
                searchBaseInfo.setFilterStatus(aVar.mo182544f());
            }
        }
    }

    /* renamed from: b */
    public void mo182487b(String str, int i) {
        AbstractC53442a aVar = this.f132047d;
        if (aVar != null) {
            aVar.mo182502b(str, i);
        }
    }

    public BaseChatInsideSearchView(BaseFragment baseFragment, AbstractC53442a aVar) {
        this.f132045b = baseFragment;
        this.f132044a = baseFragment.getActivity();
        this.f132047d = aVar;
    }

    /* renamed from: a */
    public void mo182482a(String str, int i) {
        AbstractC53442a aVar = this.f132047d;
        if (aVar != null) {
            aVar.mo182501a(str, i);
        }
    }

    /* renamed from: a */
    public void mo182483a(String str, List<SearchBaseInfo> list) {
        this.mSearchInput.setTextPurely(str);
        mo182485a(list, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo182485a(java.util.List<com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo> r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView.mo182485a(java.util.List, boolean):void");
    }
}
