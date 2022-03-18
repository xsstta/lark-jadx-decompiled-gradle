package com.ss.android.lark.qrcode.ui;

import com.google.zxing.BarcodeFormat;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.ss.android.lark.qrcode.ui.b */
public class C52945b {

    /* renamed from: com.ss.android.lark.qrcode.ui.b$a */
    public interface AbstractC52946a extends IModel {
        /* renamed from: a */
        BarcodeFormat[] mo180906a();
    }

    /* renamed from: com.ss.android.lark.qrcode.ui.b$b */
    public interface AbstractC52947b extends IView<AbstractC52948a> {

        /* renamed from: com.ss.android.lark.qrcode.ui.b$b$a */
        public interface AbstractC52948a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo180907a(String str);

            /* renamed from: a */
            BarcodeFormat[] mo180908a();
        }

        /* renamed from: a */
        void mo180880a();

        /* renamed from: a */
        void mo180882a(String str);

        /* renamed from: b */
        void mo180883b();

        /* renamed from: c */
        void mo180884c();

        /* renamed from: d */
        void mo180885d();

        /* renamed from: e */
        void mo180886e();

        /* renamed from: f */
        void mo180887f();
    }
}
