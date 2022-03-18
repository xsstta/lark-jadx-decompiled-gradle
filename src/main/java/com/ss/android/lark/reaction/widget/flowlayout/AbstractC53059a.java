package com.ss.android.lark.reaction.widget.flowlayout;

import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.a */
public abstract class AbstractC53059a<T> {

    /* renamed from: a */
    private List<T> f131130a;

    /* renamed from: b */
    private AbstractC53060a f131131b;

    /* renamed from: c */
    private HashSet<Integer> f131132c = new HashSet<>();

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.a$a */
    interface AbstractC53060a {
    }

    /* renamed from: a */
    public abstract View mo181205a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public boolean mo181228a(int i, T t) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashSet<Integer> mo181226a() {
        return this.f131132c;
    }

    /* renamed from: b */
    public int mo181229b() {
        List<T> list = this.f131130a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public T mo181225a(int i) {
        return this.f131130a.get(i);
    }

    public AbstractC53059a(List<T> list) {
        this.f131130a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo181227a(AbstractC53060a aVar) {
        this.f131131b = aVar;
    }
}
