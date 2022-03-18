package com.ss.android.lark.notification.setting.impl.badgestyle.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.c */
public class C48592c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.c$a */
    public interface AbstractC48593a extends IModel {

        /* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.c$a$a */
        public interface AbstractC48594a {
            void onBadgeStyleChanged(boolean z);
        }

        /* renamed from: a */
        void mo169690a(AbstractC48594a aVar);

        /* renamed from: a */
        void mo169691a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo169692a();

        /* renamed from: b */
        void mo169693b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        boolean mo169694b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.c$b */
    public interface AbstractC48595b extends IView<AbstractC48596a> {

        /* renamed from: com.ss.android.lark.notification.setting.impl.badgestyle.mvp.c$b$a */
        public interface AbstractC48596a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo169697a(boolean z);

            /* renamed from: b */
            void mo169698b(boolean z);
        }

        /* renamed from: a */
        void mo169687a(String str);

        /* renamed from: a */
        void mo169688a(boolean z);

        /* renamed from: b */
        void mo169689b(boolean z);
    }
}
