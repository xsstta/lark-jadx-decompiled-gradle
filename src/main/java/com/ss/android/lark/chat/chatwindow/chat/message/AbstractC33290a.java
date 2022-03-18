package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.C35259b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.a */
public abstract class AbstractC33290a<M extends ContentVO<?>, VH extends AbstractC59010e> extends AbstractC59004b<AbsMessageVO<M>, VH> {

    /* renamed from: d */
    public AbstractC33342d f85789d;

    /* renamed from: d */
    public Context mo122719d() {
        return this.f85789d.mo122543g();
    }

    public AbstractC33290a(AbstractC33342d dVar) {
        this.f85789d = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.widget.recyclerview.hive.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo122649a(AbstractC59010e eVar, Object obj) {
        mo122648a(eVar, (AbsMessageVO) ((AbsMessageVO) obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122648a(VH vh, AbsMessageVO<M> aVar) {
        C35259b.m137683a(vh.f146209n, aVar, vh.mo200148l());
    }
}
