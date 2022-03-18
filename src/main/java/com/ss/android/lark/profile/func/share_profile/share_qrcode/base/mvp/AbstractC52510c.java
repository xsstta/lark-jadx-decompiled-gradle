package com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.ShareProfileQRCodeView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.c */
public interface AbstractC52510c {

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.c$a */
    public interface AbstractC52511a extends IModel {
        /* renamed from: a */
        void mo179495a(Bitmap bitmap, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo179516b(IGetDataCallback<Bitmap> iGetDataCallback);

        /* renamed from: c */
        void mo179517c(IGetDataCallback<ShareProfileQRCodeView.C52515a> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.c$b */
    public interface AbstractC52512b<T extends AbstractC52513a> extends IView<T> {

        /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.c$b$a */
        public interface AbstractC52513a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179499a(Bitmap bitmap);
        }

        /* renamed from: a */
        void mo179489a();

        /* renamed from: a */
        void mo179508a(Bitmap bitmap);

        /* renamed from: a */
        void mo179509a(ShareProfileQRCodeView.C52515a aVar);

        /* renamed from: a */
        void mo179510a(String str);

        /* renamed from: a */
        boolean mo179492a(ErrorResult errorResult);

        /* renamed from: b */
        void mo179511b();

        /* renamed from: b */
        void mo179513b(String str);

        /* renamed from: c */
        void mo179514c();

        /* renamed from: d */
        void mo179515d();
    }
}
