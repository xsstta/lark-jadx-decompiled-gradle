package com.ss.android.lark.chat.base.view.recycleview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.ss.android.lark.chat.base.view.recycleview.C32944d;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ItemShineManager<T extends RecyclerView.Adapter & AbstractC58983c> {

    /* renamed from: a */
    private RecyclerView f84646a;

    /* renamed from: b */
    private AbstractC32943c f84647b;

    /* renamed from: c */
    private C32944d.AbstractC32948b f84648c;

    /* renamed from: d */
    private int f84649d = 100;

    /* renamed from: e */
    private int f84650e;

    /* renamed from: f */
    private IShineAnimator f84651f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ItemShineStyle {
    }

    /* renamed from: d */
    public void mo121645d() {
        this.f84651f = null;
    }

    /* renamed from: a */
    public ItemShineManager mo121641a() {
        m126854e();
        return this;
    }

    /* renamed from: c */
    public void mo121644c() {
        IShineAnimator aVar = this.f84651f;
        if (aVar != null) {
            aVar.mo121647b();
        }
    }

    /* renamed from: b */
    public void mo121643b() {
        if (this.f84651f == null) {
            m126854e();
        }
        this.f84651f.mo121646a();
    }

    /* renamed from: e */
    private void m126854e() {
        int i = this.f84650e;
        if (i == 0) {
            this.f84651f = new C32944d(this.f84646a, this.f84648c).mo121651a(this.f84647b).mo121650a(this.f84649d);
        } else if (i == 1) {
            this.f84651f = new C32940b(this.f84646a, this.f84647b, this.f84648c, this.f84649d);
        }
    }

    /* renamed from: a */
    public ItemShineManager mo121642a(int i) {
        this.f84650e = i;
        return this;
    }

    public ItemShineManager(RecyclerView recyclerView, AbstractC32943c cVar, C32944d.AbstractC32948b bVar) {
        this.f84646a = recyclerView;
        this.f84647b = cVar;
        this.f84648c = bVar;
    }
}
