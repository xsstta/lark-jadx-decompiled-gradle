package com.tt.option.p3382c;

import android.content.Context;
import com.tt.miniapp.p3301m.C66330b;
import com.tt.option.AbstractC67593a;
import com.tt.option.p3382c.C67602b;

/* renamed from: com.tt.option.c.a */
public class C67601a extends AbstractC67593a<AbstractC67605c> implements AbstractC67605c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67605c mo232057b() {
        return new C66330b();
    }

    @Override // com.tt.option.p3382c.AbstractC67605c
    public void firstFavoriteAction() {
        if (mo234790c()) {
            ((AbstractC67605c) this.f170423a).firstFavoriteAction();
        }
    }

    @Override // com.tt.option.p3382c.AbstractC67605c
    public C67602b getHostCustomFavoriteEntity(Context context) {
        if (mo234790c()) {
            ((AbstractC67605c) this.f170423a).getHostCustomFavoriteEntity(context);
        }
        return new C67602b.C67604a(context).mo234868a();
    }
}
