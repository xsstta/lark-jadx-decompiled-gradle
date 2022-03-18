package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.a */
public class C40564a {

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.a$a */
    public interface AbstractC40565a extends IModel {
        /* renamed from: a */
        void mo146688a(Bitmap bitmap, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo146689a(IGetDataCallback<Bitmap> iGetDataCallback);

        /* renamed from: b */
        void mo146690b(IGetDataCallback<C40534a> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.a$b */
    public interface AbstractC40566b extends IView<AbstractC40567a> {

        /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.a$b$a */
        public interface AbstractC40567a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146691a(Bitmap bitmap);
        }

        /* renamed from: a */
        void mo146678a();

        /* renamed from: a */
        void mo146679a(Bitmap bitmap);

        /* renamed from: a */
        void mo146680a(C40534a aVar);

        /* renamed from: a */
        void mo146682a(String str);

        /* renamed from: b */
        void mo146683b();

        /* renamed from: b */
        void mo146684b(String str);

        /* renamed from: c */
        void mo146685c();
    }
}
