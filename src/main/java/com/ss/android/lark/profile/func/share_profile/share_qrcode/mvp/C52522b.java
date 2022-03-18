package com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a;
import com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.b */
public class C52522b extends AbstractC52501a implements AbstractC52517a.AbstractC52518a {

    /* renamed from: a */
    public static final int f129988a = UIHelper.dp2px(230.0f);

    /* renamed from: b */
    public static final int f129989b = UIHelper.dp2px(230.0f);

    /* renamed from: c */
    public static final int f129990c = UIHelper.dp2px(2.0f);

    /* renamed from: d */
    private AbstractC52517a.AbstractC52518a.AbstractC52519a f129991d;

    /* renamed from: e */
    private IProfileModuleDependency.AbstractC52250e f129992e = C52239a.m202617d().mo133582l();

    /* renamed from: f */
    private AbstractC52240a f129993f = new AbstractC52240a() {
        /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52522b.C525231 */

        @Override // com.ss.android.lark.profile.p2520a.p2521a.AbstractC52240a
        /* renamed from: a */
        public void mo178826a(String str) {
            C52522b.this.mo179532a(str);
        }
    };

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m203389a();
    }

    /* renamed from: a */
    private void m203389a() {
        C52239a.m202617d().mo133588r().mo133630a(this.f129993f);
    }

    /* renamed from: b */
    private void m203390b() {
        C52239a.m202617d().mo133588r().mo133633b(this.f129993f);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m203390b();
        this.f129991d = null;
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a.AbstractC52518a
    /* renamed from: a */
    public void mo179528a(AbstractC52517a.AbstractC52518a.AbstractC52519a aVar) {
        this.f129991d = aVar;
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.b$a */
    public static abstract class AbstractC52526a implements IGetDataCallback<String> {

        /* renamed from: a */
        private IGetDataCallback<Bitmap> f129998a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract String mo179533a(String str);

        public AbstractC52526a(IGetDataCallback<Bitmap> iGetDataCallback) {
            this.f129998a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback<Bitmap> iGetDataCallback = this.f129998a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: b */
        public void onSuccess(String str) {
            if (this.f129998a != null) {
                Bitmap a = C52239a.m202617d().mo133544a(mo179533a(str), C52522b.f129988a, C52522b.f129989b, C52522b.f129990c);
                if (a == null) {
                    this.f129998a.onError(new ErrorResult("this 2D code bitmap is null"));
                } else {
                    this.f129998a.onSuccess(a);
                }
            }
        }
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a
    /* renamed from: a */
    public void mo179496a(IGetDataCallback<Bitmap> iGetDataCallback) {
        this.f129992e.mo133654a(new AbstractC52526a(iGetDataCallback) {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52522b.C525242 */

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52522b.AbstractC52526a
            /* renamed from: a */
            public String mo179533a(String str) {
                return str;
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.AbstractC52517a.AbstractC52518a
    /* renamed from: d */
    public void mo179529d(final IGetDataCallback<Bitmap> iGetDataCallback) {
        this.f129992e.mo133658b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.C52522b.C525253 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C52522b.this.mo179496a(iGetDataCallback);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo179532a(String str) {
        if (str != null) {
            Bitmap a = C52239a.m202617d().mo133544a(C52239a.m202617d().mo133563b(str), f129988a, f129989b, f129990c);
            AbstractC52517a.AbstractC52518a.AbstractC52519a aVar = this.f129991d;
            if (aVar != null) {
                aVar.mo179530a(a);
            }
        }
    }
}
