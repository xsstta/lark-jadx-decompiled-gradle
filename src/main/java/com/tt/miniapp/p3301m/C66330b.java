package com.tt.miniapp.p3301m;

import android.app.Application;
import android.content.Context;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.p3382c.AbstractC67605c;
import com.tt.option.p3382c.C67602b;

/* renamed from: com.tt.miniapp.m.b */
public class C66330b implements AbstractC67605c {
    @Override // com.tt.option.p3382c.AbstractC67605c
    public void firstFavoriteAction() {
        String str;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (AppbrandContext.getInst().isGame()) {
            str = HostDependManager.getInst().getHostCustomFavoriteEntity(applicationContext).mo234859h();
        } else {
            str = HostDependManager.getInst().getHostCustomFavoriteEntity(applicationContext).mo234858g();
        }
        HostDependManager.getInst().showToast(applicationContext, null, str, 0, "success");
    }

    @Override // com.tt.option.p3382c.AbstractC67605c
    public C67602b getHostCustomFavoriteEntity(Context context) {
        return new C67602b.C67604a(context).mo234868a();
    }
}
