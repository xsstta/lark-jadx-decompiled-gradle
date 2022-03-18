package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.todo.dependency.ITodoTitleControllerProxy;
import com.ss.android.lark.todo.impl.features.mainview.listener.OnFragmentDestroyListener;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/mvvm/TodoBaseMainFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "handlePageSwitch", "", "preIsTodoTab", "", "curIsTodoTab", "setActivity", "activity", "Landroid/app/Activity;", "setArgumentsFromSpec", "args", "Landroid/os/Bundle;", "setOnDestroyListener", "fragmentDestroyListener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/OnFragmentDestroyListener;", "updateTitleController", "titleController", "Lcom/ss/android/lark/todo/dependency/ITodoTitleControllerProxy;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.a */
public abstract class TodoBaseMainFragment extends BaseFragment {

    /* renamed from: a */
    private HashMap f140425a;

    /* renamed from: a */
    public View mo193225a(int i) {
        if (this.f140425a == null) {
            this.f140425a = new HashMap();
        }
        View view = (View) this.f140425a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f140425a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo193226a() {
        HashMap hashMap = this.f140425a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public abstract void mo193228a(Activity activity);

    /* renamed from: a */
    public abstract void mo193229a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo193231a(ITodoTitleControllerProxy bVar);

    /* renamed from: a */
    public abstract void mo193232a(OnFragmentDestroyListener bVar);

    /* renamed from: a */
    public abstract void mo193235a(boolean z, boolean z2);

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo193226a();
    }
}
