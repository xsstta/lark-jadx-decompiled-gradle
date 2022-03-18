package com.ss.android.lark.notification.setting.impl.setting.mvp;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.p2379c.C48432a;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.a */
public class C48616a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.a$a */
    public interface AbstractC48617a extends IModel {

        /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.a$a$a */
        public interface AbstractC48618a {
            /* renamed from: a */
            void mo169775a(NotificationSettingV2 notificationSettingV2);

            /* renamed from: a */
            void mo169776a(boolean z);
        }

        /* renamed from: a */
        void mo169762a(IGetDataCallback<NotificationSettingV2> iGetDataCallback);

        /* renamed from: a */
        void mo169763a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169764a(AbstractC48618a aVar);

        /* renamed from: a */
        void mo169765a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169766a(boolean z, UIGetDataCallback<String> uIGetDataCallback);

        /* renamed from: a */
        boolean mo169767a();

        /* renamed from: a */
        boolean mo169768a(Context context);

        /* renamed from: b */
        void mo169769b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo169770b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo169771b(boolean z, UIGetDataCallback<String> uIGetDataCallback);

        /* renamed from: b */
        boolean mo169772b();

        /* renamed from: c */
        C48432a mo169773c();

        /* renamed from: c */
        void mo169774c(IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.a$b */
    public interface AbstractC48619b extends IView<AbstractC48620a> {

        /* renamed from: com.ss.android.lark.notification.setting.impl.setting.mvp.a$b$a */
        public interface AbstractC48620a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo169777a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback);

            /* renamed from: a */
            void mo169778a(String str);

            /* renamed from: a */
            void mo169779a(boolean z);

            /* renamed from: b */
            void mo169780b(boolean z);

            /* renamed from: c */
            void mo169781c(boolean z);

            /* renamed from: d */
            void mo169782d(boolean z);
        }

        /* renamed from: a */
        void mo169728a();

        /* renamed from: a */
        void mo169729a(Context context);

        /* renamed from: a */
        void mo169730a(C48432a aVar);

        /* renamed from: a */
        void mo169731a(NotificationSettingV2 notificationSettingV2);

        /* renamed from: a */
        void mo169733a(String str);

        /* renamed from: a */
        void mo169734a(boolean z);

        /* renamed from: b */
        void mo169735b();

        /* renamed from: b */
        void mo169736b(NotificationSettingV2 notificationSettingV2);

        /* renamed from: b */
        void mo169737b(String str);

        /* renamed from: b */
        void mo169738b(boolean z);

        /* renamed from: c */
        void mo169740c(boolean z);

        /* renamed from: d */
        void mo169741d(boolean z);

        /* renamed from: e */
        void mo169742e(boolean z);

        /* renamed from: f */
        void mo169743f(boolean z);

        /* renamed from: g */
        void mo169744g(boolean z);

        /* renamed from: h */
        void mo169745h(boolean z);

        /* renamed from: i */
        void mo169746i(boolean z);
    }
}
