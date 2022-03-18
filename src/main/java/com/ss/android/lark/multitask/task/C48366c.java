package com.ss.android.lark.multitask.task;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.lark.multitask.task.Task;

/* renamed from: com.ss.android.lark.multitask.task.c */
public class C48366c implements Task {

    /* renamed from: a */
    private final FragmentActivity f121794a;

    /* renamed from: b */
    private final C48374k f121795b;

    /* renamed from: c */
    private long f121796c;

    /* renamed from: d */
    private final Intent f121797d;

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: b */
    public void mo169193b(Bundle bundle) {
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: c */
    public /* synthetic */ String mo23791c() {
        return Task.CC.$default$c(this);
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: d */
    public /* synthetic */ String mo23792d() {
        return Task.CC.$default$d(this);
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: e */
    public long mo169194e() {
        return this.f121796c;
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: a */
    public Task.IconFactory mo23788a() {
        return new DrawableIconFactory(0);
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: b */
    public CharSequence mo23790b() {
        return this.f121794a.getTitle();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f121795b.getLifecycle();
    }

    /* renamed from: f */
    public Intent mo169215f() {
        Intent intent = this.f121797d;
        if (intent == null) {
            return this.f121794a.getIntent();
        }
        return intent;
    }

    public String toString() {
        return "ActivityTask{mActivity=" + this.f121794a.getClass() + '}';
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: a */
    public void mo169192a(long j) {
        this.f121796c = j;
    }

    public C48366c(FragmentActivity fragmentActivity) {
        this(fragmentActivity, null);
    }

    @Override // com.ss.android.lark.multitask.task.Task
    /* renamed from: a */
    public void mo23789a(Bundle bundle) {
        bundle.putBoolean("lark.multitask.task.restored", mo169215f().getBooleanExtra("lark.multitask.task.restored", false));
    }

    public C48366c(FragmentActivity fragmentActivity, Intent intent) {
        this.f121794a = fragmentActivity;
        this.f121797d = intent;
        C48374k kVar = new C48374k();
        this.f121795b = kVar;
        fragmentActivity.getSupportFragmentManager().beginTransaction().add(kVar, "multitask.lifecycle.fragment.tag").commitAllowingStateLoss();
    }
}
