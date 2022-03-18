package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.a */
public class C10045a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.a$a */
    public interface AbstractC10046a extends IModel {

        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.a$a$a */
        public interface AbstractC10047a {
            /* renamed from: a */
            void mo38386a(Throwable th, boolean z, String str);

            /* renamed from: a */
            void mo38387a(boolean z, String str);
        }

        /* renamed from: a */
        String mo38380a();

        /* renamed from: a */
        void mo38381a(AbstractC10047a aVar);

        /* renamed from: a */
        void mo38382a(boolean z, String str);

        /* renamed from: b */
        void mo38383b(AbstractC10047a aVar);

        /* renamed from: b */
        boolean mo38384b();

        /* renamed from: c */
        void mo38385c(AbstractC10047a aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.a$b */
    public interface AbstractC10048b extends IView<AbstractC10049a> {

        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.a$b$a */
        public interface AbstractC10049a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo38392a();

            /* renamed from: a */
            void mo38393a(Context context);

            /* renamed from: a */
            void mo38394a(boolean z);
        }

        /* renamed from: a */
        void mo38388a();

        /* renamed from: a */
        void mo38389a(boolean z);

        /* renamed from: a */
        void mo38390a(boolean z, String str);

        /* renamed from: b */
        void mo38391b();
    }
}
