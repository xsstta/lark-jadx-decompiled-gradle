package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0013H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\f\u001a\u00020\rR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/AssigneeRecycleFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "adapter", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "getAdapter", "()Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "isDoing", "", "isEmpty", "title", "", "getTitle", "initRecyclerView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setData", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.a */
public final class AssigneeRecycleFragment extends BaseFragment {

    /* renamed from: a */
    public final IViewAbility<ITodoDetailViewDataStore> f139490a;

    /* renamed from: b */
    private String f139491b = "";

    /* renamed from: c */
    private final Lazy f139492c = LazyKt.lazy(new C56396a(this));

    /* renamed from: d */
    private boolean f139493d;

    /* renamed from: e */
    private boolean f139494e = true;

    /* renamed from: f */
    private HashMap f139495f;

    /* renamed from: c */
    private final TodoAssigneeAdapter m219910c() {
        return (TodoAssigneeAdapter) this.f139492c.getValue();
    }

    /* renamed from: a */
    public View mo192125a(int i) {
        if (this.f139495f == null) {
            this.f139495f = new HashMap();
        }
        View view = (View) this.f139495f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f139495f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo192128b() {
        HashMap hashMap = this.f139495f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo192128b();
    }

    /* renamed from: a */
    public final String mo192126a() {
        return this.f139491b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoAssigneeAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.a$a */
    static final class C56396a extends Lambda implements Function0<TodoAssigneeAdapter> {
        final /* synthetic */ AssigneeRecycleFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56396a(AssigneeRecycleFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TodoAssigneeAdapter invoke() {
            return new TodoAssigneeAdapter(this.this$0.f139490a);
        }
    }

    /* renamed from: d */
    private final void m219911d() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) mo192125a(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "assignee_list");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo192125a(R.id.assignee_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "assignee_list");
        recyclerView2.setAdapter(m219910c());
    }

    public AssigneeRecycleFragment(IViewAbility<ITodoDetailViewDataStore> fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139490a = fVar;
    }

    /* renamed from: a */
    public final void mo192127a(List<AssigneeBean> list, boolean z) {
        String str;
        Intrinsics.checkParameterIsNotNull(list, "assignees");
        m219910c().mo192134a(list);
        if (z) {
            str = ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_IncompleteTitleNum, "num", String.valueOf(list.size()));
        } else {
            str = ResUtil.f139261a.mo191778a(R.string.Todo_CollabTask_CompletedTitleNum, "num", String.valueOf(list.size()));
        }
        this.f139491b = str;
        this.f139493d = CollectionUtils.isEmpty(list);
        this.f139494e = z;
        RelativeLayout relativeLayout = (RelativeLayout) mo192125a(R.id.empty_container);
        if (relativeLayout != null) {
            C25877a.m93659a(relativeLayout, this.f139493d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        m219911d();
        RelativeLayout relativeLayout = (RelativeLayout) mo192125a(R.id.empty_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "empty_container");
        C25877a.m93659a(relativeLayout, this.f139493d);
        TextView textView = (TextView) mo192125a(R.id.tv_empty_list);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_empty_list");
        if (this.f139494e) {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_AssigneePage_AllAssigneesHaveComleted_EmptyState);
        } else {
            str = ResUtil.f139261a.mo191781c(R.string.Todo_AssigneePage_NoAssigneesCompletedTask_EmptyState);
        }
        textView.setText(str);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.todo_detail_assignee_fragment_recyle, (ViewGroup) null, false);
    }
}
