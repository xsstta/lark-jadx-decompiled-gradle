package com.bytedance.ee.bear.todocenter.ui.host;

import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.p380a.C7663b;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.todocenter.C11688b;
import com.bytedance.ee.bear.todocenter.ui.TodoCenterFragment;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/todocenter/ui/host/LarkDocsTodoCenterFragment;", "Lcom/bytedance/ee/bear/facade/common/lazy/LazyFragment;", "Lcom/bytedance/ee/bear/todocenter/ui/host/ITodoCenterTitleBar;", "()V", "mHomeTitleBar", "Lcom/bytedance/ee/bear/list/homepage/title/ITitleBar;", "mIsUserVisible", "", "mPause", "Ljava/lang/Boolean;", "mTodoCenterFragment", "Lcom/bytedance/ee/bear/todocenter/ui/TodoCenterFragment;", "onCreateViewLazy", "", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentStartLazy", "onFragmentStopLazy", "onScrollBy", "dx", "", "dy", "todo-center-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.todocenter.ui.b.b */
public final class LarkDocsTodoCenterFragment extends C7663b implements AbstractC11735a {

    /* renamed from: c */
    private AbstractC8505c f31544c;

    /* renamed from: d */
    private boolean f31545d;

    /* renamed from: e */
    private TodoCenterFragment f31546e;

    /* renamed from: f */
    private Boolean f31547f;

    /* renamed from: g */
    private HashMap f31548g;

    /* renamed from: a */
    public void mo44904a() {
        HashMap hashMap = this.f31548g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.p380a.C7663b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44904a();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: e */
    public void mo30116e() {
        super.mo30116e();
        this.f31547f = true;
        C11688b.m48499a("close_todo_center");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: d */
    public void mo30115d() {
        super.mo30115d();
        C11688b.m48499a("open_todo_center");
        Boolean bool = this.f31547f;
        if (bool != null && bool.booleanValue()) {
            this.f31547f = false;
            TodoCenterFragment todoCenterFragment = this.f31546e;
            if (todoCenterFragment != null) {
                todoCenterFragment.mo44882a();
            }
        }
        this.f31545d = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        mo30107a(R.layout.fragment_lark_docs_todo_center);
        if (getParentFragment() != null && (getParentFragment() instanceof AbstractC8476f)) {
            AbstractC8476f fVar = (AbstractC8476f) getParentFragment();
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            this.f31544c = fVar.mo30786c();
        }
        this.f31546e = (TodoCenterFragment) getChildFragmentManager().findFragmentById(R.id.todo_center_fragment);
    }

    @Override // com.bytedance.ee.bear.todocenter.ui.p566b.AbstractC11735a
    /* renamed from: a */
    public void mo44903a(int i, int i2) {
        AbstractC8505c cVar;
        if (this.f31545d && (cVar = this.f31544c) != null) {
            cVar.mo33176a(i, i2);
        }
    }
}
