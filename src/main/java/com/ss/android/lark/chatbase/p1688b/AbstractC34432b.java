package com.ss.android.lark.chatbase.p1688b;

import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import java.util.List;

/* renamed from: com.ss.android.lark.chatbase.b.b */
public abstract class AbstractC34432b<K, T, PageData, L extends List<T>> {

    /* renamed from: h */
    protected AbstractExecutorC33962g f88909h;

    /* renamed from: com.ss.android.lark.chatbase.b.b$b */
    public interface AbstractC34434b<T> {
        T doUpdate(T t);
    }

    /* renamed from: a */
    public abstract void mo127103a(PageData pagedata);

    /* renamed from: b */
    public abstract void mo127108b(PageData pagedata);

    /* renamed from: c */
    public abstract void mo127112c(PageData pagedata);

    /* renamed from: l */
    public abstract L mo127125l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo127141m() {
        this.f88909h.mo124078d();
    }

    /* renamed from: com.ss.android.lark.chatbase.b.b$a */
    public static class C34433a<T> implements AbstractC34434b<T> {

        /* renamed from: b */
        protected T f88910b;

        @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
        public T doUpdate(T t) {
            return this.f88910b;
        }

        public C34433a(T t) {
            this.f88910b = t;
        }
    }

    public AbstractC34432b(AbstractExecutorC33962g gVar) {
        this.f88909h = gVar;
    }

    /* renamed from: com.ss.android.lark.chatbase.b.b$c */
    public static abstract class AbstractC34435c<T> implements AbstractC34434b<T> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo122917a(T t);

        @Override // com.ss.android.lark.chatbase.p1688b.AbstractC34432b.AbstractC34434b
        public final T doUpdate(T t) {
            if (t != null) {
                return mo122917a(t);
            }
            return null;
        }
    }
}
