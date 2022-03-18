package com.ss.android.lark.phone.impl.phoneamountedit.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryDailyAmountInfo;

/* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.a */
public interface AbstractC51372a {

    /* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.a$a */
    public interface AbstractC51373a extends IModel {
        /* renamed from: a */
        int mo176985a();

        /* renamed from: a */
        void mo176986a(IGetDataCallback<PhoneQueryDailyAmountInfo> iGetDataCallback);

        /* renamed from: a */
        void mo176987a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.a$b */
    public interface AbstractC51374b extends IView<AbstractC51375a> {

        /* renamed from: com.ss.android.lark.phone.impl.phoneamountedit.mvp.a$b$a */
        public interface AbstractC51375a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo176988a(String str);

            /* renamed from: b */
            void mo176989b(String str);
        }

        /* renamed from: a */
        void mo176975a();

        /* renamed from: a */
        void mo176976a(int i, int i2);

        /* renamed from: a */
        void mo176978a(String str);

        /* renamed from: a */
        void mo176979a(String str, String str2);
    }
}
