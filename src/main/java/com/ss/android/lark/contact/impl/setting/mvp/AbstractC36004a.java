package com.ss.android.lark.contact.impl.setting.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.impl.setting.service.entity.C36064a;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.C36069e;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToAddMeSettingItem;

/* renamed from: com.ss.android.lark.contact.impl.setting.mvp.a */
public interface AbstractC36004a {

    /* renamed from: com.ss.android.lark.contact.impl.setting.mvp.a$a */
    public interface AbstractC36005a extends IModel {
        /* renamed from: a */
        void mo132435a(IGetDataCallback<C36067c> iGetDataCallback);

        /* renamed from: a */
        void mo132436a(WayToAddMeSettingItem wayToAddMeSettingItem, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo132437a(String str, String str2, boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo132438a(boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: b */
        void mo132439b(IGetDataCallback<C36067c> iGetDataCallback);

        /* renamed from: c */
        void mo132440c(IGetDataCallback<C36064a> iGetDataCallback);

        /* renamed from: d */
        void mo132441d(IGetDataCallback<C36064a> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.contact.impl.setting.mvp.a$b */
    public interface AbstractC36006b extends IView<AbstractC36007a> {

        /* renamed from: com.ss.android.lark.contact.impl.setting.mvp.a$b$a */
        public interface AbstractC36007a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132442a(String str, boolean z, String str2);

            /* renamed from: a */
            void mo132443a(boolean z);

            /* renamed from: b */
            void mo132444b(boolean z);

            /* renamed from: c */
            void mo132445c(boolean z);

            /* renamed from: d */
            void mo132446d(boolean z);

            /* renamed from: e */
            void mo132447e(boolean z);

            /* renamed from: f */
            void mo132448f(boolean z);

            /* renamed from: g */
            void mo132449g(boolean z);

            /* renamed from: h */
            void mo132450h(boolean z);
        }

        /* renamed from: a */
        void mo132407a();

        /* renamed from: a */
        void mo132410a(C36067c cVar);

        /* renamed from: a */
        void mo132411a(C36069e eVar);

        /* renamed from: a */
        void mo132412a(String str);

        /* renamed from: a */
        void mo132413a(String str, boolean z);

        /* renamed from: a */
        void mo132415a(boolean z);

        /* renamed from: b */
        void mo132416b();

        /* renamed from: b */
        void mo132417b(boolean z);

        /* renamed from: c */
        void mo132419c(boolean z);

        /* renamed from: d */
        void mo132420d(boolean z);

        /* renamed from: e */
        void mo132421e(boolean z);

        /* renamed from: f */
        void mo132422f(boolean z);

        /* renamed from: g */
        void mo132423g(boolean z);

        /* renamed from: h */
        void mo132424h(boolean z);
    }
}
