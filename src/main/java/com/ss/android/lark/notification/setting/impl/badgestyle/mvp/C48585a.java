package com.ss.android.lark.notification.setting.impl.badgestyle.mvp;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48566a;

/* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.a */
public class C48585a extends BaseModel implements C48592c.AbstractC48593a {

    /* renamed from: a */
    C48592c.AbstractC48593a.AbstractC48594a f122231a;

    /* renamed from: b */
    AbstractC48566a f122232b = new AbstractC48566a() {
        /* class com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48585a.C485861 */

        @Override // com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48566a
        /* renamed from: a */
        public void mo169647a(boolean z) {
            if (C48585a.this.f122231a != null) {
                C48585a.this.f122231a.onBadgeStyleChanged(z);
            }
        }
    };

    /* renamed from: c */
    private final AbstractC48407a.AbstractC48427o f122233c = C48398a.m190922a().mo169341d();

    /* renamed from: d */
    private CallbackManager f122234d;

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a
    /* renamed from: a */
    public boolean mo169692a() {
        return this.f122233c.mo169424e();
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a
    /* renamed from: b */
    public boolean mo169694b() {
        return this.f122233c.mo169425f();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f122233c.mo169413b(this.f122232b);
        this.f122234d.cancelCallbacks();
        super.destroy();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f122234d = new CallbackManager();
        this.f122233c.mo169404a(this.f122232b);
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a
    /* renamed from: a */
    public void mo169690a(C48592c.AbstractC48593a.AbstractC48594a aVar) {
        this.f122231a = aVar;
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a
    /* renamed from: a */
    public void mo169691a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122233c.mo169417b(z, this.f122234d.wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.notification.setting.impl.badgestyle.mvp.C48592c.AbstractC48593a
    /* renamed from: b */
    public void mo169693b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        this.f122233c.mo169420c(z, this.f122234d.wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
