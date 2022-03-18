package com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52511a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b.AbstractC52513a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.b */
public abstract class AbstractC52503b<M extends AbstractC52510c.AbstractC52511a, V extends AbstractC52510c.AbstractC52512b<D>, D extends AbstractC52510c.AbstractC52512b.AbstractC52513a> extends BasePresenter<M, V, D> {

    /* renamed from: a */
    private IProfileModuleDependency.AbstractC52246c f129974a = C52239a.m202617d().mo133586p();

    /* renamed from: b */
    public AbstractC52507a f129975b;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.b$a */
    public interface AbstractC52507a {
        /* renamed from: a */
        void mo179504a(AbstractC51324c cVar);
    }

    /* renamed from: a */
    private void mo179498a() {
        m203357c();
        mo179520b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo179498a();
    }

    /* renamed from: c */
    private void m203357c() {
        ((AbstractC52510c.AbstractC52511a) getModel()).mo179517c(new UIGetDataCallback(new IGetDataCallback<ShareProfileQRCodeView.C52515a>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.C525052 */

            /* renamed from: a */
            public void onSuccess(ShareProfileQRCodeView.C52515a aVar) {
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179509a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("getLoginProfileQrCodeViewData failed: " + errorResult.getDebugMsg());
            }
        }));
    }

    /* renamed from: b */
    public void mo179520b() {
        ((AbstractC52510c.AbstractC52512b) getView()).mo179514c();
        ((AbstractC52510c.AbstractC52511a) getModel()).mo179516b(new UIGetDataCallback(new IGetDataCallback<Bitmap>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.C525041 */

            /* renamed from: a */
            public void onSuccess(Bitmap bitmap) {
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179515d();
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179508a(bitmap);
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179489a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("get login contact qrcode image failed: " + errorResult.toString());
                if (!((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179492a(errorResult)) {
                    ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179515d();
                    ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179510a(UIHelper.getString(R.string.Lark_Legacy_PersoncardResetError));
                }
            }
        }));
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.b$b */
    public class C52508b implements AbstractC52510c.AbstractC52512b.AbstractC52513a {
        public C52508b() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52512b.AbstractC52513a
        /* renamed from: a */
        public void mo179499a(final Bitmap bitmap) {
            AbstractC52503b.this.f129975b.mo179504a(new AbstractC51324c() {
                /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.C52508b.C525091 */

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: b */
                public void mo49824b() {
                }

                @Override // com.ss.android.lark.permission.AbstractC51324c
                /* renamed from: a */
                public void mo49823a() {
                    AbstractC52503b.this.mo179519a(bitmap);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo179519a(Bitmap bitmap) {
        ((AbstractC52510c.AbstractC52511a) getModel()).mo179495a(bitmap, new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.C525063 */

            /* renamed from: a */
            public void onSuccess(String str) {
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179511b();
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179513b(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC52510c.AbstractC52512b) AbstractC52503b.this.getView()).mo179510a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveFail)));
            }
        }));
    }

    public AbstractC52503b(M m, V v, AbstractC52507a aVar) {
        super(m, v);
        this.f129975b = aVar;
    }
}
