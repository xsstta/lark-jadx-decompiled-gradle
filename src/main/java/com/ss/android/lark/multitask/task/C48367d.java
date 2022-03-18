package com.ss.android.lark.multitask.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: com.ss.android.lark.multitask.task.d */
public class C48367d extends AbstractC48363a implements AbstractC48378t {

    /* renamed from: b */
    private boolean f121798b;

    public C48367d(Class<? extends FragmentActivity> cls) {
        super(cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo169217a(C48376q qVar, Bundle bundle) {
        bundle.putAll(qVar.mo169246g());
        bundle.putLong("lark.multitask.snapshot.id", qVar.mo169234a());
        bundle.putBoolean("lark.multitask.task.restored", true);
        this.f121798b = true;
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48378t
    public final void a_(C48376q qVar, AbstractC48375n nVar) {
        this.f121798b = false;
        mo169218b(qVar, nVar);
        if (!this.f121798b) {
            throw new IllegalStateException("You must call putExtras() in onStart()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo169218b(C48376q qVar, AbstractC48375n nVar) {
        List<Activity> a = ActivityLifecycle.f121792a.mo169205a();
        FragmentActivity fragmentActivity = (FragmentActivity) a.get(a.size() - 1);
        Intent intent = new Intent(fragmentActivity, this.f121791a);
        Bundle bundle = new Bundle();
        mo169217a(qVar, bundle);
        intent.putExtras(bundle);
        fragmentActivity.startActivity(intent);
    }
}
