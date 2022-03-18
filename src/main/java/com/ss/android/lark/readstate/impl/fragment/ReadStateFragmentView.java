package com.ss.android.lark.readstate.impl.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.readstate.impl.adapter.C53102c;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.impl.fragment.C53127b;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.List;

public class ReadStateFragmentView implements C53127b.AbstractC53129b {

    /* renamed from: a */
    C53127b.AbstractC53129b.AbstractC53130a f131386a;

    /* renamed from: b */
    AbstractC53126a f131387b;

    /* renamed from: c */
    Context f131388c;

    /* renamed from: d */
    String f131389d;

    /* renamed from: e */
    public C53102c f131390e;
    @BindView(6019)
    public ImageView mEmptyHintImageView;
    @BindView(6020)
    public TextView mEmptyHintTextView;
    @BindView(6347)
    public LKUIPtrClassicFrameLayout mPtrLayout;
    @BindView(6360)
    public RecyclerView mRecyclerView;

    /* renamed from: com.ss.android.lark.readstate.impl.fragment.ReadStateFragmentView$a */
    public interface AbstractC53126a {
        /* renamed from: a */
        void mo181453a(ReadStateFragmentView readStateFragmentView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f131387b.mo181453a(this);
        m205638c();
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: a */
    public void mo181446a() {
        if (!DesktopUtil.m144307b()) {
            this.mEmptyHintImageView.setVisibility(0);
        }
        this.mEmptyHintTextView.setVisibility(0);
        this.mRecyclerView.setVisibility(8);
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: b */
    public void mo181451b() {
        this.mEmptyHintImageView.setVisibility(8);
        this.mEmptyHintTextView.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
    }

    /* renamed from: c */
    private void m205638c() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f131388c);
        this.mPtrLayout.setKeepHeaderWhenRefresh(true);
        this.mPtrLayout.setHeaderView(chatWindowPtrLoadingHeader);
        this.mPtrLayout.setForceBackWhenComplete(true);
        this.mPtrLayout.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrLayout.disableWhenHorizontalMove(true);
        this.mPtrLayout.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.readstate.impl.fragment.ReadStateFragmentView.C531241 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                ReadStateFragmentView.this.f131386a.mo181463b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!ReadStateFragmentView.this.f131386a.mo181462a() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                }
                return true;
            }
        });
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f131388c, 1, false);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        C53102c cVar = new C53102c(this.f131388c, this.f131389d);
        this.f131390e = cVar;
        this.mRecyclerView.setAdapter(cVar);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.readstate.impl.fragment.ReadStateFragmentView.C531252 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                ReadStateFragmentView.this.mRecyclerView.requestFocus();
                KeyboardUtils.hideKeyboard(ReadStateFragmentView.this.f131388c);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i2 > 8 && ReadStateFragmentView.this.f131386a.mo181462a() && linearLayoutManager.findLastVisibleItemPosition() + 1 == ReadStateFragmentView.this.f131390e.getItemCount() - 3) {
                    ReadStateFragmentView.this.mPtrLayout.autoLoadMore();
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C53127b.AbstractC53129b.AbstractC53130a aVar) {
        this.f131386a = aVar;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: a */
    public void mo181447a(ErrorResult errorResult) {
        this.mPtrLayout.refreshComplete();
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: a */
    public void mo181449a(List<C53123f> list) {
        this.f131390e.mo181383b(list);
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: b */
    public void mo181452b(List<C53123f> list) {
        this.f131390e.mo181382a(list);
        this.mPtrLayout.refreshComplete();
    }

    public ReadStateFragmentView(Context context, AbstractC53126a aVar, String str) {
        this.f131388c = context;
        this.f131387b = aVar;
        this.f131389d = str;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b
    /* renamed from: a */
    public void mo181450a(boolean z, boolean z2, int i) {
        if (z) {
            if (i == 4) {
                this.mEmptyHintTextView.setText(R.string.Lark_Legacy_MessageReadStateAllUnread);
            } else if (i == 2) {
                this.mEmptyHintTextView.setText(R.string.Lark_Legacy_ReadStatusAllread);
            }
        } else if (z2) {
            if (i == 4) {
                this.mEmptyHintTextView.setText(R.string.Lark_Legacy_MessageReadStateAllUnCheck);
            } else if (i == 2) {
                this.mEmptyHintTextView.setText(R.string.Lark_Legacy_MessageReadStateAllCheck);
            }
        } else if (i == 4) {
            this.mEmptyHintTextView.setText(R.string.Lark_Legacy_MessageReadStateAllUnread);
        } else if (i == 2) {
            this.mEmptyHintTextView.setText(R.string.Lark_Legacy_ReadStatusAllread);
        }
    }
}
