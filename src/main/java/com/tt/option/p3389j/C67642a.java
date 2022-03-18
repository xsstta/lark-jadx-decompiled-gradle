package com.tt.option.p3389j;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3301m.C66331c;
import com.tt.miniapphost.entity.C67524d;
import com.tt.miniapphost.entity.C67526f;
import com.tt.miniapphost.entity.C67537k;
import com.tt.option.AbstractC67593a;
import com.tt.option.p3389j.AbstractC67643b;

/* renamed from: com.tt.option.j.a */
public class C67642a extends AbstractC67593a<AbstractC67643b> implements AbstractC67643b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67643b mo232057b() {
        return new C66331c();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public AbstractC67645c createChooseFileHandler(Activity activity) {
        if (mo234790c()) {
            return ((AbstractC67643b) this.f170423a).createChooseFileHandler(activity);
        }
        return null;
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public boolean scanCode(Activity activity, AbstractC67643b.AbstractC67644a aVar) {
        if (mo234790c()) {
            return ((AbstractC67643b) this.f170423a).scanCode(activity, aVar);
        }
        return false;
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67524d handleActivityImageResult(int i, int i2, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67643b) this.f170423a).handleActivityImageResult(i, i2, intent);
        }
        return new C67524d();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67537k handleActivityScanResult(int i, int i2, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67643b) this.f170423a).handleActivityScanResult(i, i2, intent);
        }
        return new C67537k();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public C67526f handleActivityVideoResult(int i, int i2, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67643b) this.f170423a).handleActivityVideoResult(i, i2, intent);
        }
        return new C67526f();
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImage(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        if (mo234790c()) {
            ((AbstractC67643b) this.f170423a).chooseImage(iAppContext, i, z, z2, str);
        }
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseImageForFeedback(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        if (mo234790c()) {
            ((AbstractC67643b) this.f170423a).chooseImage(iAppContext, i, z, z2, str);
        }
    }

    @Override // com.tt.option.p3389j.AbstractC67643b
    public void chooseVideo(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        if (mo234790c()) {
            ((AbstractC67643b) this.f170423a).chooseVideo(iAppContext, i, z, z2, str);
        }
    }
}
