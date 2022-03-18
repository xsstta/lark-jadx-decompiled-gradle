package com.ss.android.lark.todo.impl.features.detail.assignee.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.SectionManager;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment;
import com.ss.android.lark.todo.impl.features.detail.IMVInitiator;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006%"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2;", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "Lcom/ss/android/lark/todo/impl/features/detail/IMVInitiator;", "()V", "finishCallback", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "getFinishCallback", "()Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "setFinishCallback", "(Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;)V", "isAddToActivity", "", "()Z", "setAddToActivity", "(Z)V", "mEnterFragmentAnim", "", "getMEnterFragmentAnim", "()I", "mOutFragmentAnim", "getMOutFragmentAnim", "initMVComposer", "", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "refreshPage", "syncData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.c */
public final class TodoDetailAssigneeFragmentV2 extends DetailBaseFragment implements IMVInitiator {

    /* renamed from: a */
    private final int f139523a = R.anim.todo_slide_right_left;

    /* renamed from: b */
    private final int f139524b = R.anim.todo_slide_left_right;

    /* renamed from: c */
    private boolean f139525c;

    /* renamed from: d */
    private DetailBaseFragment.FinishCallBack f139526d = new C56410a();

    /* renamed from: e */
    private HashMap f139527e;

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public View mo192093a(int i) {
        if (this.f139527e == null) {
            this.f139527e = new HashMap();
        }
        View view = (View) this.f139527e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f139527e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: d */
    public void mo192102d() {
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: e */
    public void mo192103e() {
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: f */
    public void mo192104f() {
        HashMap hashMap = this.f139527e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo192104f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2$finishCallback$1", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "onFinish", "", "fragment", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.c$a */
    public static final class C56410a implements DetailBaseFragment.FinishCallBack {
        C56410a() {
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: b */
    public int mo192098b() {
        return this.f139523a;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: c */
    public int mo192101c() {
        return this.f139524b;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public boolean mo192097a() {
        return this.f139525c;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192096a(boolean z) {
        this.f139525c = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentView;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke", "com/ss/android/lark/todo/impl/features/detail/assignee/list/TodoDetailAssigneeFragmentV2$initMVComposer$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.a.c$b */
    static final class C56411b extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, TodoDetailAssigneeFragmentView> {
        final /* synthetic */ View $rootView;
        final /* synthetic */ SectionManager $sectionManager$inlined;
        final /* synthetic */ TodoDetailAssigneeFragmentV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56411b(View view, TodoDetailAssigneeFragmentV2 cVar, SectionManager hVar) {
            super(1);
            this.$rootView = view;
            this.this$0 = cVar;
            this.$sectionManager$inlined = hVar;
        }

        public final TodoDetailAssigneeFragmentView invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View view = this.$rootView;
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
            return new TodoDetailAssigneeFragmentView(view, childFragmentManager, fVar);
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192095a(SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sectionManager");
        View view = getView();
        if (view != null) {
            hVar.mo92078a(new C56411b(view, this, hVar));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return mo192094a(layoutInflater, R.layout.todo_detail_assignee_fragment);
    }
}
