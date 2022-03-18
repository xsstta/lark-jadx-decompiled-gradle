package com.ss.android.lark.todo.impl.features.detail.time;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.section.IActionDispatcher;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentViewV2;", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "Lcom/ss/android/lark/todo/impl/features/detail/IMVInitiator;", "()V", "finishCallback", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "getFinishCallback", "()Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "setFinishCallback", "(Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;)V", "isAddToActivity", "", "()Z", "setAddToActivity", "(Z)V", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "initMVComposer", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragVisibilityChange", "isVisible", "refreshPage", "syncData", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.time.b */
public final class TodoDetailTimeFragmentViewV2 extends DetailBaseFragment implements IMVInitiator {

    /* renamed from: a */
    private SectionManager<ITodoDetailViewDataStore, TodoDetailModel> f140111a;

    /* renamed from: b */
    private boolean f140112b;

    /* renamed from: c */
    private DetailBaseFragment.FinishCallBack f140113c = new C56717a();

    /* renamed from: d */
    private HashMap f140114d;

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public View mo192093a(int i) {
        if (this.f140114d == null) {
            this.f140114d = new HashMap();
        }
        View view = (View) this.f140114d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140114d.put(Integer.valueOf(i), findViewById);
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
        HashMap hashMap = this.f140114d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo192104f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentViewV2$finishCallback$1", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "onFinish", "", "fragment", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.b$a */
    public static final class C56717a implements DetailBaseFragment.FinishCallBack {
        C56717a() {
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public boolean mo192097a() {
        return this.f140112b;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192096a(boolean z) {
        this.f140112b = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView;", "it", "Lcom/larksuite/framework/section/IViewAbility;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.b$b */
    static final class C56718b extends Lambda implements Function1<IViewAbility<ITodoDetailViewDataStore>, TodoDetailTimeFragmentView> {
        final /* synthetic */ View $rootView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56718b(View view) {
            super(1);
            this.$rootView = view;
        }

        public final TodoDetailTimeFragmentView invoke(IViewAbility<ITodoDetailViewDataStore> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "it");
            View view = this.$rootView;
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            return new TodoDetailTimeFragmentView(view, fVar);
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: a */
    public void mo192095a(SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sectionManager");
        this.f140111a = hVar;
        View view = getView();
        if (view != null) {
            hVar.mo92078a(new C56718b(view));
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.DetailBaseFragment
    /* renamed from: b */
    public void mo192100b(boolean z) {
        SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar;
        IActionDispatcher d;
        super.mo192100b(z);
        if (!z && (hVar = this.f140111a) != null && (d = hVar.mo92075d()) != null) {
            d.mo92064a(2002);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return mo192094a(layoutInflater, R.layout.todo_detail_time_fragment);
    }
}
