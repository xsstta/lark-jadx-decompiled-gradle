package com.ss.android.lark.chat.chatwindow.chat.banner;

import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.a */
public abstract class AbstractC33152a<T extends AbstractC33155c> implements AbstractC33187f<T> {

    /* renamed from: a */
    protected int f85301a;

    /* renamed from: b */
    protected int f85302b;

    /* renamed from: c */
    protected boolean f85303c;

    /* renamed from: d */
    protected boolean f85304d;

    /* renamed from: e */
    protected AbstractC33186e f85305e;

    /* renamed from: f */
    protected AbstractC33185d f85306f;

    /* renamed from: g */
    protected View f85307g;

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: f */
    public int mo122352f() {
        return 0;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: a */
    public int mo122344a() {
        return this.f85301a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: b */
    public int mo122348b() {
        return this.f85302b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: c */
    public boolean mo122349c() {
        return this.f85303c;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: d */
    public AbstractC33186e mo122350d() {
        return this.f85305e;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: e */
    public View mo122351e() {
        return this.f85307g;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: g */
    public boolean mo122353g() {
        return this.f85304d;
    }

    /* renamed from: h */
    public AbstractC33185d mo122354h() {
        return this.f85306f;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.a$a */
    public static abstract class AbstractC33153a {

        /* renamed from: a */
        public int f85308a;

        /* renamed from: b */
        public int f85309b;

        /* renamed from: c */
        public boolean f85310c = true;

        /* renamed from: d */
        public AbstractC33186e f85311d;

        /* renamed from: a */
        public abstract AbstractC33152a mo122358a();

        /* renamed from: a */
        public AbstractC33153a mo122355a(int i) {
            this.f85308a = i;
            return this;
        }

        /* renamed from: b */
        public AbstractC33153a mo122359b(int i) {
            this.f85309b = i;
            return this;
        }

        /* renamed from: a */
        public AbstractC33153a mo122356a(AbstractC33186e eVar) {
            this.f85311d = eVar;
            return this;
        }

        /* renamed from: a */
        public AbstractC33153a mo122357a(boolean z) {
            this.f85310c = z;
            return this;
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: a */
    public void mo122346a(AbstractC33185d dVar) {
        this.f85306f = dVar;
    }

    public AbstractC33152a(AbstractC33153a aVar) {
        this.f85301a = aVar.f85308a;
        this.f85302b = aVar.f85309b;
        this.f85303c = aVar.f85310c;
        this.f85305e = aVar.f85311d;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: a */
    public void mo122347a(boolean z) {
        this.f85304d = z;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: a */
    public void mo122345a(View view, T t) {
        this.f85307g = view;
    }
}
