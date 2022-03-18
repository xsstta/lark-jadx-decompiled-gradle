package com.ss.android.lark.todo.impl.features.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.section.SectionManager;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TodoDetailModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0010J\u001c\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H&J\u001c\u0010(\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u00020#H&J\b\u0010,\u001a\u00020#H&R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/todo/impl/features/detail/IMVInitiator;", "()V", "finishCallback", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "getFinishCallback", "()Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "setFinishCallback", "(Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;)V", "isAddToActivity", "", "()Z", "setAddToActivity", "(Z)V", "mEnterFragmentAnim", "", "getMEnterFragmentAnim", "()I", "mOutFragmentAnim", "getMOutFragmentAnim", "mvComposerInitialized", "getMvComposerInitialized", "setMvComposerInitialized", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "getCachedView", "inflater", "Landroid/view/LayoutInflater;", "resource", "initMVComposer", "", "sectionManager", "Lcom/larksuite/framework/section/SectionManager;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "initMVComposerIfNeeded", "onFragVisibilityChange", "isVisible", "refreshPage", "syncData", "FinishCallBack", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.a */
public abstract class DetailBaseFragment extends BaseFragment implements IMVInitiator {

    /* renamed from: a */
    private final int f139473a = R.anim.todo_slide_bottom_top;

    /* renamed from: b */
    private final int f139474b = R.anim.todo_slide_top_bottom;

    /* renamed from: c */
    private View f139475c;

    /* renamed from: d */
    private boolean f139476d;

    /* renamed from: e */
    private HashMap f139477e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment$FinishCallBack;", "", "onFinish", "", "fragment", "Lcom/ss/android/lark/todo/impl/features/detail/DetailBaseFragment;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.a$a */
    public interface FinishCallBack {
    }

    /* renamed from: a */
    public View mo192093a(int i) {
        if (this.f139477e == null) {
            this.f139477e = new HashMap();
        }
        View view = (View) this.f139477e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f139477e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract void mo192095a(SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar);

    /* renamed from: a */
    public abstract void mo192096a(boolean z);

    /* renamed from: a */
    public abstract boolean mo192097a();

    /* renamed from: b */
    public void mo192100b(boolean z) {
    }

    /* renamed from: d */
    public abstract void mo192102d();

    /* renamed from: e */
    public abstract void mo192103e();

    /* renamed from: f */
    public void mo192104f() {
        HashMap hashMap = this.f139477e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo192104f();
    }

    /* renamed from: b */
    public int mo192098b() {
        return this.f139473a;
    }

    /* renamed from: c */
    public int mo192101c() {
        return this.f139474b;
    }

    @Override // com.ss.android.lark.todo.impl.features.detail.IMVInitiator
    /* renamed from: b */
    public void mo192099b(SectionManager<ITodoDetailViewDataStore, TodoDetailModel> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "sectionManager");
        if (!this.f139476d) {
            this.f139476d = true;
            mo192095a(hVar);
        }
    }

    /* renamed from: a */
    public final View mo192094a(LayoutInflater layoutInflater, int i) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View view = this.f139475c;
        if (view != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(i, (ViewGroup) null, false);
        this.f139475c = inflate;
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return inflate;
    }
}
