package com.ss.android.lark.contact.impl.department.detail.frame.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.contact.impl.department.detail.frame.C35850a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.util.C59252a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class DepartmentListView extends LinearLayout {

    /* renamed from: a */
    public C35871b f92718a;

    /* renamed from: b */
    public AbstractC35854a f92719b;

    /* renamed from: c */
    private boolean f92720c;

    /* renamed from: d */
    private RecyclerView f92721d;

    /* renamed from: e */
    private LKUIPtrClassicFrameLayout f92722e;

    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView$a */
    public interface AbstractC35854a {
        /* renamed from: a */
        void mo131783a();

        /* renamed from: a */
        boolean mo131784a(boolean z);
    }

    /* renamed from: b */
    public boolean mo131913b() {
        return this.f92720c;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m140434h() {
        this.f92721d.scrollToPosition(0);
    }

    public List<DepartmentRecyclerViewItem> getItems() {
        return this.f92718a.mo132057b();
    }

    /* renamed from: g */
    private void m140433g() {
        if (this.f92722e.isRefreshing()) {
            this.f92722e.refreshComplete();
        }
    }

    /* renamed from: a */
    public void mo131908a() {
        post(new Runnable() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.list.$$Lambda$DepartmentListView$obauG9630BNcWGvBpkEECJQi5zA */

            public final void run() {
                DepartmentListView.this.m140434h();
            }
        });
    }

    /* renamed from: c */
    public void mo131914c() {
        this.f92718a.notifyDataSetChanged();
        getRootView().requestLayout();
    }

    /* renamed from: d */
    public void mo131915d() {
        this.f92718a.mo132053a((List<DepartmentRecyclerViewItem>) new ArrayList());
        mo131914c();
    }

    /* renamed from: f */
    private void m140432f() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(getContext());
        this.f92722e.setKeepHeaderWhenRefresh(true);
        this.f92722e.setFooterView(chatWindowPtrLoadingHeader);
        this.f92722e.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.f92722e.disableWhenHorizontalMove(true);
        this.f92722e.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.C358532 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                DepartmentListView.this.f92719b.mo131783a();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return DepartmentListView.this.f92719b.mo131784a(super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2));
            }
        });
    }

    /* renamed from: e */
    private void m140431e() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_department_listview, (ViewGroup) this, false);
        addView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f92722e = (LKUIPtrClassicFrameLayout) inflate.findViewById(R.id.ptr_view);
        m140432f();
        if (this.f92721d == null) {
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recylerview);
            this.f92721d = recyclerView;
            recyclerView.setBackgroundColor(getResources().getColor(R.color.lkui_transparent));
            C58996h.m228978b(this.f92721d);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            this.f92721d.setItemAnimator(null);
            this.f92721d.setLayoutManager(linearLayoutManager);
        }
        if (this.f92718a == null) {
            this.f92718a = new C35871b(this);
        }
        this.f92721d.setAdapter(this.f92718a);
        C59252a.m230151a(getContext(), this.f92722e, this.f92721d, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.C358521 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return DepartmentListView.this.f92718a.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (DepartmentListView.this.f92719b == null || !DepartmentListView.this.f92719b.mo131784a(true)) {
                    return false;
                }
                return true;
            }
        });
    }

    public void setPullToRefreshListener(AbstractC35854a aVar) {
        this.f92719b = aVar;
    }

    public DepartmentListView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo131909a(RecyclerView.OnScrollListener onScrollListener) {
        this.f92721d.addOnScrollListener(onScrollListener);
    }

    public void setContainsMemberIds(Set<String> set) {
        this.f92718a.mo132060b(set);
    }

    public void setDisableOutChatter(boolean z) {
        this.f92718a.mo132056a(z);
    }

    public void setItemOperationHandler(AbstractC35856a aVar) {
        this.f92718a.mo132051a(aVar);
    }

    public void setSelectMode(boolean z) {
        this.f92720c = z;
        mo131914c();
    }

    public void setSelectedDepartment(List<String> list) {
        this.f92718a.mo132062c(list);
    }

    public void setSelectedMembers(List<String> list) {
        this.f92718a.mo132058b(list);
    }

    /* renamed from: b */
    public void mo131912b(boolean z) {
        C35871b bVar = this.f92718a;
        if (bVar != null) {
            bVar.mo132064c(z);
        }
    }

    public void setPickType(PickType pickType) {
        this.f92718a.mo132050a(pickType);
        mo131914c();
    }

    /* renamed from: a */
    public void mo131911a(boolean z) {
        this.f92718a.mo132061b(z);
    }

    /* renamed from: a */
    public void mo131910a(C35850a aVar) {
        this.f92718a.mo132052a((Collection<? extends DepartmentRecyclerViewItem>) aVar.mo131900b());
        this.f92718a.mo132063c(aVar.mo131904d());
        this.f92718a.mo132054a(aVar.mo131905e());
        this.f92718a.mo132059b(aVar.mo131906f());
        mo131914c();
        m140433g();
    }

    public void setItemsFromDepartmentStructure(C35850a aVar) {
        List<DepartmentRecyclerViewItem> b = aVar.mo131900b();
        this.f92718a.mo132055a(aVar.mo131903c());
        this.f92718a.mo132063c(aVar.mo131904d());
        this.f92718a.mo132054a(aVar.mo131905e());
        this.f92718a.mo132059b(aVar.mo131906f());
        this.f92718a.mo132053a(b);
        mo131914c();
    }

    public DepartmentListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DepartmentListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m140431e();
    }
}
