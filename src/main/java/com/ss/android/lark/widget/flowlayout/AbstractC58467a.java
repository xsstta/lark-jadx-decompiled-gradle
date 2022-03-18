package com.ss.android.lark.widget.flowlayout;

import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.flowlayout.a */
public abstract class AbstractC58467a<T> {

    /* renamed from: a */
    private List<T> f144012a;

    /* renamed from: b */
    private AbstractC58468a f144013b;

    /* renamed from: c */
    private HashSet<Integer> f144014c;

    /* renamed from: com.ss.android.lark.widget.flowlayout.a$a */
    interface AbstractC58468a {
    }

    /* renamed from: a */
    public abstract View mo197958a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public boolean mo197962a(int i, T t) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashSet<Integer> mo197960a() {
        return this.f144014c;
    }

    /* renamed from: b */
    public int mo197963b() {
        List<T> list = this.f144012a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public T mo197959a(int i) {
        return this.f144012a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo197961a(AbstractC58468a aVar) {
        this.f144013b = aVar;
    }
}
