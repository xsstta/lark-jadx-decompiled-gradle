package com.ss.android.lark.passport.device.manage;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IDevicesManageContract {

    @Retention(RetentionPolicy.SOURCE)
    public @interface TimeFormat {
    }

    /* renamed from: com.ss.android.lark.passport.device.manage.IDevicesManageContract$a */
    public interface AbstractC48962a extends IModel {

        /* renamed from: com.ss.android.lark.passport.device.manage.IDevicesManageContract$a$a */
        public interface AbstractC48963a {
        }

        /* renamed from: a */
        int mo170985a();

        /* renamed from: a */
        void mo170986a(IGetDataCallback<List<Devices.Device>> iGetDataCallback);

        /* renamed from: a */
        void mo170987a(AbstractC48963a aVar);

        /* renamed from: a */
        void mo170988a(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.passport.device.manage.IDevicesManageContract$b */
    public interface AbstractC48964b extends IView<AbstractC48965a> {

        /* renamed from: com.ss.android.lark.passport.device.manage.IDevicesManageContract$b$a */
        public interface AbstractC48965a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo170989a(View view, String str);
        }

        /* renamed from: a */
        void mo170973a(int i);

        /* renamed from: a */
        void mo170974a(View view);

        /* renamed from: a */
        void mo170977a(List<Devices.Device> list, int i);
    }
}
