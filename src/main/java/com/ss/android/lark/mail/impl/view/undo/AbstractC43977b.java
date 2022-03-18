package com.ss.android.lark.mail.impl.view.undo;

import android.content.Context;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.view.undo.UndoBar;

/* renamed from: com.ss.android.lark.mail.impl.view.undo.b */
public abstract class AbstractC43977b<T> implements UndoBar.AbstractC43972b<T> {

    /* renamed from: a */
    private UndoBar f111606a;

    /* renamed from: b */
    protected final T f111607b;

    /* renamed from: c */
    protected final String f111608c;

    /* renamed from: d */
    protected final String f111609d;

    /* renamed from: e */
    protected long f111610e = 5;

    /* renamed from: f */
    protected Runnable f111611f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract long mo156428a();

    /* renamed from: a */
    public abstract void mo156429a(Context context, T t);

    @Override // com.ss.android.lark.mail.impl.view.undo.UndoBar.AbstractC43972b
    /* renamed from: b */
    public void mo156457b(Context context, T t) {
    }

    /* renamed from: b */
    public boolean mo156431b() {
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.UndoBar.AbstractC43972b
    /* renamed from: c */
    public void mo156504c() {
        this.f111606a = null;
    }

    /* renamed from: d */
    public void mo156524d() {
        UndoBar undoBar = this.f111606a;
        if (undoBar != null) {
            undoBar.mo156476b();
        }
    }

    /* renamed from: e */
    public void mo156525e() {
        UndoBar undoBar = this.f111606a;
        if (undoBar != null) {
            undoBar.mo156480c();
        }
    }

    public String toString() {
        return "UndoAction{mAction=" + ((Object) this.f111607b) + '}';
    }

    /* renamed from: a */
    public boolean mo156523a(UndoBar.C43971a<T> aVar) {
        return mo156448a(aVar, (Runnable) null);
    }

    @Override // com.ss.android.lark.mail.impl.view.undo.UndoBar.AbstractC43972b
    /* renamed from: c */
    public void mo156505c(Context context, T t) {
        mo156429a(context, t);
    }

    /* renamed from: a */
    public boolean mo156448a(UndoBar.C43971a<T> aVar, Runnable runnable) {
        this.f111611f = runnable;
        this.f111606a = aVar.mo156498a((UndoBar.AbstractC43972b) this).mo156497a(this.f111610e * 1000).mo156499a((CharSequence) this.f111608c).mo156502b(this.f111609d).mo156500a((Object) this.f111607b).mo156503b();
        C42187a.m168477a(this, this.f111607b.toString());
        UndoBar undoBar = this.f111606a;
        if (undoBar != null) {
            return undoBar.mo156475a();
        }
        return false;
    }

    public AbstractC43977b(T t, String str, String str2) {
        this.f111607b = t;
        this.f111608c = str;
        this.f111609d = str2;
        this.f111610e = mo156428a();
    }
}
