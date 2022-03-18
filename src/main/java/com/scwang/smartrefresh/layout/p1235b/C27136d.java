package com.scwang.smartrefresh.layout.p1235b;

import android.view.MotionEvent;
import android.view.View;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27130i;
import com.scwang.smartrefresh.layout.p1237d.C27145c;

/* renamed from: com.scwang.smartrefresh.layout.b.d */
public class C27136d implements AbstractC27130i {

    /* renamed from: a */
    protected MotionEvent f67460a;

    /* renamed from: b */
    protected AbstractC27130i f67461b;

    /* renamed from: c */
    protected boolean f67462c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96488a(MotionEvent motionEvent) {
        this.f67460a = motionEvent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96489a(AbstractC27130i iVar) {
        this.f67461b = iVar;
    }

    /* renamed from: a */
    public void mo96490a(boolean z) {
        this.f67462c = z;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
    /* renamed from: a */
    public boolean mo96480a(View view) {
        AbstractC27130i iVar = this.f67461b;
        if (iVar != null) {
            return iVar.mo96480a(view);
        }
        return C27145c.m98684a(view, this.f67460a);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
    /* renamed from: b */
    public boolean mo96481b(View view) {
        AbstractC27130i iVar = this.f67461b;
        if (iVar != null) {
            return iVar.mo96481b(view);
        }
        if (this.f67462c) {
            return !C27145c.m98688c(view, this.f67460a);
        }
        return C27145c.m98687b(view, this.f67460a);
    }
}
