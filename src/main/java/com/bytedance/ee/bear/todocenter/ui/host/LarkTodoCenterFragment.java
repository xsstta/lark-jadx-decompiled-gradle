package com.bytedance.ee.bear.todocenter.ui.host;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.todocenter.C11688b;
import com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u001a\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/todocenter/ui/host/LarkTodoCenterFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "mPause", "", "Ljava/lang/Boolean;", "mTodoCenterFragment", "Lcom/bytedance/ee/bear/todocenter/ui/TodoCenterFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onStart", "onViewCreated", "view", "todo-center-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.todocenter.ui.b.c */
public final class LarkTodoCenterFragment extends C7667e {

    /* renamed from: a */
    private TodoCenterFragment f31549a;

    /* renamed from: b */
    private Boolean f31550b;

    /* renamed from: c */
    private HashMap f31551c;

    /* renamed from: a */
    public void mo44905a() {
        HashMap hashMap = this.f31551c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44905a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C11688b.m48499a("close_todo_center");
        this.f31550b = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C11688b.m48499a("open_todo_center");
        Boolean bool = this.f31550b;
        if (bool != null && bool.booleanValue()) {
            this.f31550b = false;
            TodoCenterFragment todoCenterFragment = this.f31549a;
            if (todoCenterFragment != null) {
                todoCenterFragment.mo44882a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.titleBar);
        HashMap hashMap = new HashMap();
        hashMap.put("module", "todo");
        findViewById.setTag(R.id.title_bar_common_params, hashMap);
        this.f31549a = (TodoCenterFragment) getChildFragmentManager().findFragmentById(R.id.todo_center_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_lark_home_todo_center, viewGroup, false);
    }
}
