package com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.share_profile.p2524a.C52461a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.a */
public abstract class AbstractC52501a extends BaseModel implements AbstractC52510c.AbstractC52511a {

    /* renamed from: a */
    private IProfileModuleDependency.AbstractC52246c f129971a;

    /* renamed from: a */
    public abstract void mo179496a(IGetDataCallback<Bitmap> iGetDataCallback);

    public AbstractC52501a() {
        if (C52239a.m202617d() != null) {
            this.f129971a = C52239a.m202617d().mo133586p();
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52511a
    /* renamed from: b */
    public void mo179516b(IGetDataCallback<Bitmap> iGetDataCallback) {
        mo179496a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52511a
    /* renamed from: c */
    public void mo179517c(final IGetDataCallback<ShareProfileQRCodeView.C52515a> iGetDataCallback) {
        C52461a.m203281a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<ShareProfileQRCodeView.C52515a>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a.C525021 */

            /* renamed from: a */
            public void onSuccess(ShareProfileQRCodeView.C52515a aVar) {
                iGetDataCallback.onSuccess(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m203349a(Bitmap bitmap) {
        return C26311p.m95265a(bitmap, C57881t.m224651w(C52239a.m202617d().mo133562b()) + System.currentTimeMillis() + ".jpg");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m203350a(IGetDataCallback iGetDataCallback, String str) {
        if (iGetDataCallback != null) {
            if (!TextUtils.isEmpty(str)) {
                iGetDataCallback.onSuccess(str);
            } else {
                iGetDataCallback.onError(new ErrorResult("the image absolute path is empty"));
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52511a
    /* renamed from: a */
    public void mo179495a(Bitmap bitmap, IGetDataCallback<String> iGetDataCallback) {
        C57865c.m224574a(new C57865c.AbstractC57873d(bitmap) {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.$$Lambda$a$GU4p4jkmtB6QWzLpGZvBAJXKes */
            public final /* synthetic */ Bitmap f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return AbstractC52501a.m203349a(this.f$0);
            }
        }, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.$$Lambda$a$gsAWloI_UbaZAgfE5S0knHc22e0 */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                AbstractC52501a.m203350a(IGetDataCallback.this, (String) obj);
            }
        });
    }
}
