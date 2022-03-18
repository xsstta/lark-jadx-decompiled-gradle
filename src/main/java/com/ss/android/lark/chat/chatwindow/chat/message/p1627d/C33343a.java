package com.ss.android.lark.chat.chatwindow.chat.message.p1627d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.d.a */
public class C33343a extends AbstractC33290a<ContentVO<?>, C33344a> {

    /* renamed from: a */
    IOpenMessageCell f85900a;

    /* renamed from: b */
    C33346c f85901b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<C33344a> mo122650b() {
        return C33344a.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return this.f85900a.mo120409a();
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    public int ao_() {
        return this.f85900a.getClass().hashCode();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.d.a$a */
    public static class C33344a extends AbstractC59010e {

        /* renamed from: a */
        public View f85902a;

        /* renamed from: b */
        public static C33344a m129109b(View view) {
            return (C33344a) view.getTag(R.id.tag_item_holder_view);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            this.f85902a = view;
            view.setTag(R.id.tag_item_holder_view, this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public View mo122823a(ViewGroup viewGroup) {
        return this.f85900a.mo120406a(LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122700a(C33344a aVar) {
        this.f85900a.mo120410a(aVar.f85902a);
    }

    /* renamed from: b */
    public boolean mo122828b(View view, AbsMessageVO<ContentVO<?>> aVar) {
        return mo122755b(C33344a.m129109b(view), aVar);
    }

    /* renamed from: a */
    public void mo122824a(View view, AbsMessageVO<ContentVO<?>> aVar) {
        mo122683c(C33344a.m129109b(view), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(C33344a aVar, AbsMessageVO<ContentVO<?>> aVar2) {
        super.mo122648a((AbstractC59010e) aVar, (AbsMessageVO) aVar2);
        this.f85900a.mo120411a(aVar.f85902a, aVar.mo200148l(), aVar2);
    }

    public C33343a(AbstractC33342d dVar, IOpenMessageCell cVar, C33346c cVar2) {
        super(dVar);
        this.f85900a = cVar;
        this.f85901b = cVar2;
        cVar2.mo122831a(this);
    }
}
