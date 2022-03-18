package com.bytedance.ee.bear.debug.net;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.RequestCache;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.list.C8707s;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestListFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "adapter", "Lcom/bytedance/ee/bear/debug/net/RequestAdapter;", "initRecycler", "", "root", "Landroid/view/View;", "initSearchBar", "initTitleBar", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "search", SearchIntents.EXTRA_QUERY, "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.net.c */
public final class RequestListFragment extends C7667e {

    /* renamed from: a */
    public RequestAdapter f15222a = new RequestAdapter();

    /* renamed from: b */
    private HashMap f15223b;

    /* renamed from: a */
    public void mo21329a() {
        HashMap hashMap = this.f15223b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo21329a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestListFragment$initTitleBar$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.c$c */
    public static final class C5312c extends BaseTitleBar.C11804e {

        /* renamed from: a */
        final /* synthetic */ RequestListFragment f15228a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            RequestCache.f14808a.mo20219b();
            this.f15228a.f15222a.notifyDataSetChanged();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5312c(RequestListFragment cVar, CharSequence charSequence) {
            super(charSequence);
            this.f15228a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestListFragment$initSearchBar$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.c$a */
    public static final class C5310a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ RequestListFragment f15224a;

        /* renamed from: b */
        final /* synthetic */ View f15225b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ((SpaceEditText) this.f15225b.findViewById(R.id.inputEt)).setText("");
            this.f15224a.mo21330a("");
        }

        C5310a(RequestListFragment cVar, View view) {
            this.f15224a = cVar;
            this.f15225b = view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestListFragment$initTitleBar$2", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.c$d */
    public static final class C5313d extends BaseTitleBar.C11804e {

        /* renamed from: a */
        final /* synthetic */ RequestListFragment f15229a;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            super.mo16854a(view);
            this.f15229a.f15222a.mo70690f(RequestCache.f14808a.mo20217a());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5313d(RequestListFragment cVar, CharSequence charSequence) {
            super(charSequence);
            this.f15229a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestListFragment$initSearchBar$2", "Lcom/bytedance/ee/bear/list/TextWatcherImpl;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.c$b */
    public static final class C5311b extends C8707s {

        /* renamed from: a */
        final /* synthetic */ RequestListFragment f15226a;

        /* renamed from: b */
        final /* synthetic */ View f15227b;

        @Override // com.bytedance.ee.bear.list.C8707s
        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            super.afterTextChanged(editable);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            this.f15226a.mo21330a(str);
            ImageView imageView = (ImageView) this.f15227b.findViewById(R.id.clearIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "root.clearIcon");
            int i = 0;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }

        C5311b(RequestListFragment cVar, View view) {
            this.f15226a = cVar;
            this.f15227b = view;
        }
    }

    /* renamed from: a */
    private final void m21704a(View view) {
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).setTitle("网络请求");
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).mo45070a((BaseTitleBar.AbstractC11800a) new C5312c(this, "清除"));
        ((BaseTitleBar) view.findViewById(R.id.titleBar)).mo45070a((BaseTitleBar.AbstractC11800a) new C5313d(this, "刷新"));
    }

    /* renamed from: b */
    private final void m21705b(View view) {
        ((ImageView) view.findViewById(R.id.clearIcon)).setOnClickListener(new C5310a(this, view));
        ImageView imageView = (ImageView) view.findViewById(R.id.clearIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "root.clearIcon");
        imageView.setVisibility(8);
        ((SpaceEditText) view.findViewById(R.id.inputEt)).addTextChangedListener(new C5311b(this, view));
    }

    /* renamed from: c */
    private final void m21706c(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "root.recycler");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "root.recycler");
        recyclerView2.setAdapter(this.f15222a);
        this.f15222a.mo70690f(RequestCache.f14808a.mo20217a());
    }

    /* renamed from: a */
    public final void mo21330a(String str) {
        boolean z;
        String str2 = str;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f15222a.mo70690f(RequestCache.f14808a.mo20217a());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : RequestCache.f14808a.mo20217a()) {
            if (StringsKt.contains$default((CharSequence) t.mo20046b(), (CharSequence) str2, false, 2, (Object) null)) {
                arrayList.add(t);
            }
        }
        this.f15222a.mo70690f(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m21704a(view);
        m21705b(view);
        m21706c(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_request_list, viewGroup, false);
    }
}
