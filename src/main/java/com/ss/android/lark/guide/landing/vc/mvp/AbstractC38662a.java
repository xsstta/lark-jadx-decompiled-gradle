package com.ss.android.lark.guide.landing.vc.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.ss.android.lark.guide.landing.vc.mvp.a */
public interface AbstractC38662a {

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.a$a */
    public interface AbstractC38663a extends IModel {
    }

    /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.a$b */
    public interface AbstractC38664b extends IView<AbstractC38665a> {

        /* renamed from: com.ss.android.lark.guide.landing.vc.mvp.a$b$a */
        public interface AbstractC38665a extends IView.IViewDelegate {
            /* renamed from: a */
            String mo141585a();

            /* renamed from: b */
            int mo141586b();

            /* renamed from: c */
            String mo141587c();

            /* renamed from: d */
            String mo141588d();

            /* renamed from: e */
            String mo141589e();

            /* renamed from: f */
            void mo141590f();

            /* renamed from: g */
            void mo141591g();
        }

        /* renamed from: a */
        void mo141584a(Bitmap bitmap);
    }
}
