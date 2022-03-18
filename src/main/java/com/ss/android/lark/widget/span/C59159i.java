package com.ss.android.lark.widget.span;

import android.view.View;
import com.ss.android.lark.widget.span.C59160j;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.widget.span.i */
public class C59159i implements C59160j.AbstractC59163b {

    /* renamed from: a */
    private WeakReference<View> f146843a;

    /* renamed from: c */
    public void mo201098c() {
        this.f146843a = null;
    }

    @Override // com.ss.android.lark.widget.span.C59160j.AbstractC59163b
    /* renamed from: a */
    public void mo201096a() {
        WeakReference<View> weakReference = this.f146843a;
        if (weakReference != null && weakReference.get() != null) {
            this.f146843a.get().invalidate();
        }
    }

    @Override // com.ss.android.lark.widget.span.C59160j.AbstractC59163b
    /* renamed from: b */
    public void mo201097b() {
        WeakReference<View> weakReference = this.f146843a;
        if (weakReference != null && weakReference.get() != null) {
            this.f146843a.get().invalidate();
        }
    }

    public C59159i(View view) {
        this.f146843a = new WeakReference<>(view);
    }
}
