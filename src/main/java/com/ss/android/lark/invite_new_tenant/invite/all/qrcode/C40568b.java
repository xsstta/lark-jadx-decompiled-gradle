package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.C40578b;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a;
import com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.invite_new_tenant.p2065c.C40536a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.b */
public class C40568b extends BaseModel implements C40564a.AbstractC40565a {

    /* renamed from: a */
    public AbstractC40532a.AbstractC40533a f102982a;

    /* renamed from: b */
    private AbstractC40532a f102983b;

    /* renamed from: a */
    private /* synthetic */ C40534a m160528a() {
        return this.f102983b.mo143861d();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f102983b = C40531a.m160431a();
        this.f102982a = C40531a.m160431a().mo143862e();
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40565a
    /* renamed from: b */
    public void mo146690b(IGetDataCallback<C40534a> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.$$Lambda$b$befam2n8IN3HFdGzAie8nnyO_6s */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C40568b.this.m160528a();
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.$$Lambda$b$Xt7oBiypqGyCmx1fG_lEYYHBIKI */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C40568b.m160530a(IGetDataCallback.this, (C40534a) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ String m160529a(Bitmap bitmap) {
        return C26311p.m95265a(bitmap, C57881t.m224651w(C40531a.m160431a().mo143857a()) + System.currentTimeMillis() + ".jpg");
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40565a
    /* renamed from: a */
    public void mo146689a(final IGetDataCallback<Bitmap> iGetDataCallback) {
        C405691 r0 = new IGetDataCallback<C40547a>() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40568b.C405691 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C40547a aVar) {
                iGetDataCallback.onSuccess(C40568b.this.f102982a.mo143863a(aVar.f102964a, C40578b.f102994a, C40578b.f102995b, C40578b.f102996c));
            }
        };
        C40536a.m160445a().mo146648c((IGetDataCallback) getCallbackManager().wrapAndAddCallback(r0));
    }

    /* renamed from: a */
    public static /* synthetic */ void m160530a(IGetDataCallback iGetDataCallback, C40534a aVar) {
        if (iGetDataCallback != null) {
            if (aVar != null) {
                iGetDataCallback.onSuccess(aVar);
            } else {
                iGetDataCallback.onError(new ErrorResult("the login chatter is null"));
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m160531a(IGetDataCallback iGetDataCallback, String str) {
        if (iGetDataCallback != null) {
            if (!TextUtils.isEmpty(str)) {
                iGetDataCallback.onSuccess(str);
            } else {
                iGetDataCallback.onError(new ErrorResult("the image absolute path is empty"));
            }
        }
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40564a.AbstractC40565a
    /* renamed from: a */
    public void mo146688a(Bitmap bitmap, IGetDataCallback<String> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d(bitmap) {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.$$Lambda$b$GuNUBTXlZhZF0wGCpCD1BsT4uJY */
            public final /* synthetic */ Bitmap f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C40568b.lambda$GuNUBTXlZhZF0wGCpCD1BsT4uJY(this.f$0);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.$$Lambda$b$fsVJ0sOisdcc5oVcZDqWyILCSOU */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C40568b.m160531a(IGetDataCallback.this, (String) obj);
            }
        });
    }
}
