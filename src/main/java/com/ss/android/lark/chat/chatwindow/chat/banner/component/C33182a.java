package com.ss.android.lark.chat.chatwindow.chat.banner.component;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a;
import com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33155c;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.a */
public class C33182a extends AbstractC33152a<C33183a> {

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.a$a */
    public static class C33183a implements AbstractC33155c {
    }

    /* renamed from: a */
    public void mo122361a(C33183a aVar) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33187f
    /* renamed from: i */
    public int mo122363i() {
        return 1;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.component.a$b */
    public static class C33184b extends AbstractC33152a.AbstractC33153a {
        @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33152a.AbstractC33153a
        /* renamed from: a */
        public AbstractC33152a mo122358a() {
            return new C33182a(this);
        }
    }

    /* renamed from: j */
    public static AbstractC33152a.AbstractC33153a m128201j() {
        return new C33184b();
    }

    public C33182a(AbstractC33152a.AbstractC33153a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public void mo122345a(View view, C33183a aVar) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.addView(view);
        super.mo122345a((View) frameLayout, (AbstractC33155c) aVar);
        mo122361a(aVar);
    }
}
