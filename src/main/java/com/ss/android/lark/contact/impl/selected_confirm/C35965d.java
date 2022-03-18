package com.ss.android.lark.contact.impl.selected_confirm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.contact.impl.selected_confirm.d */
public class C35965d extends C26033a<AbstractC35958a.AbstractC35959a, AbstractC35958a.AbstractC35960b> {

    /* renamed from: a */
    AbstractC35967e f92992a;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AbstractC35958a.AbstractC35960b.AbstractC35961a mo132308c() {
        return new C35966a();
    }

    /* renamed from: com.ss.android.lark.contact.impl.selected_confirm.d$a */
    public class C35966a implements AbstractC35958a.AbstractC35960b.AbstractC35961a {
        @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35960b.AbstractC35961a
        /* renamed from: a */
        public void mo132303a() {
            Intent intent = new Intent();
            intent.putExtra(C35358a.f91400a, (ArrayList) ((AbstractC35958a.AbstractC35959a) C35965d.this.mo92554b()).mo132301a());
            C35965d.this.f92992a.mo132306a(-1, intent);
        }

        public C35966a() {
        }

        @Override // com.ss.android.lark.contact.impl.selected_confirm.AbstractC35958a.AbstractC35960b.AbstractC35961a
        /* renamed from: a */
        public void mo132304a(int i) {
            ((AbstractC35958a.AbstractC35960b) C35965d.this.mo92551a()).mo132299a(((AbstractC35958a.AbstractC35959a) C35965d.this.mo92554b()).mo132302a(i));
            ((AbstractC35958a.AbstractC35960b) C35965d.this.mo92551a()).mo132300b(((AbstractC35958a.AbstractC35959a) C35965d.this.mo92554b()).mo132301a());
        }
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC35958a.AbstractC35960b) mo92551a()).mo132299a(((AbstractC35958a.AbstractC35959a) mo92554b()).mo132301a());
        ((AbstractC35958a.AbstractC35960b) mo92551a()).mo132300b(((AbstractC35958a.AbstractC35959a) mo92554b()).mo132301a());
    }

    public C35965d(Context context, AbstractC35967e eVar, Bundle bundle) {
        this.f92992a = eVar;
        C35964c cVar = new C35964c(bundle);
        SelectedConfirmView selectedConfirmView = new SelectedConfirmView(context, eVar);
        super.mo92553a(selectedConfirmView, cVar);
        selectedConfirmView.setViewDelegate(mo132308c());
    }
}
