package com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52527c;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.c */
public class C52527c extends AbstractC52503b<AbstractC52517a.AbstractC52518a, AbstractC52517a.AbstractC52520b, AbstractC52517a.AbstractC52520b.AbstractC52521a> {

    /* renamed from: a */
    private AbstractC52530b f129999a;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.c$b */
    public interface AbstractC52530b extends AbstractC52503b.AbstractC52507a {
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b, com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52517a.AbstractC52520b.AbstractC52521a createViewDelegate() {
        return new C52531c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.c$c */
    public class C52531c extends AbstractC52503b<AbstractC52517a.AbstractC52518a, AbstractC52517a.AbstractC52520b, AbstractC52517a.AbstractC52520b.AbstractC52521a>.C52508b implements AbstractC52517a.AbstractC52520b.AbstractC52521a {
        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a.AbstractC52520b.AbstractC52521a
        /* renamed from: a */
        public void mo179531a() {
            ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179514c();
            ((AbstractC52517a.AbstractC52518a) C52527c.this.getModel()).mo179529d(new UIGetDataCallback(new IGetDataCallback<Bitmap>() {
                /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52527c.C52531c.C525321 */

                /* renamed from: a */
                public void onSuccess(Bitmap bitmap) {
                    ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179515d();
                    ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179508a(bitmap);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String str;
                    ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179515d();
                    if (errorResult.getErrorCode() == 4036) {
                        str = UIHelper.getString(R.string.Lark_Legacy_PersoncardResetErrorQuick);
                    } else {
                        str = UIHelper.getString(R.string.Lark_Legacy_ProfileResetShareQrcodeFailed);
                    }
                    ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179510a(errorResult.getDisplayMsg(str));
                }
            }));
        }

        private C52531c() {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.c$a */
    public class C52529a implements AbstractC52517a.AbstractC52518a.AbstractC52519a {
        private C52529a() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a.AbstractC52518a.AbstractC52519a
        /* renamed from: a */
        public void mo179530a(Bitmap bitmap) {
            UICallbackExecutor.execute(new Runnable(bitmap) {
                /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.$$Lambda$c$a$C5MP0fnAMplTpgIUC2PLimDADBI */
                public final /* synthetic */ Bitmap f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C52527c.C52529a.this.m203401b(this.f$1);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m203401b(Bitmap bitmap) {
            ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179515d();
            ((AbstractC52517a.AbstractC52520b) C52527c.this.getView()).mo179508a(bitmap);
        }
    }

    public C52527c(AbstractC52517a.AbstractC52518a aVar, AbstractC52517a.AbstractC52520b bVar, AbstractC52530b bVar2) {
        super(aVar, bVar, bVar2);
        this.f129999a = bVar2;
        ((AbstractC52517a.AbstractC52518a) getModel()).mo179528a(new C52529a());
    }
}
