package com.bytedance.ee.bear.notification;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.notification.c */
public interface AbstractC10318c {

    /* renamed from: com.bytedance.ee.bear.notification.c$a */
    public interface AbstractC10319a {
        /* renamed from: a */
        void mo24913a(String str);

        /* renamed from: a */
        void mo24914a(String str, List<String> list, String str2);
    }

    /* renamed from: com.bytedance.ee.bear.notification.c$b */
    public interface AbstractC10320b {

        /* renamed from: com.bytedance.ee.bear.notification.c$b$a */
        public interface AbstractC10321a {
            void onUserClose(String str);
        }

        /* renamed from: com.bytedance.ee.bear.notification.c$b$b */
        public interface AbstractC10322b {
            void onLinkClick(String str);
        }

        /* renamed from: a */
        View mo39426a(Context context);

        /* renamed from: a */
        void mo39427a();

        /* renamed from: a */
        void mo39428a(AbstractC10321a aVar);

        /* renamed from: a */
        void mo39429a(AbstractC10322b bVar);

        /* renamed from: a */
        void mo39430a(String str, String str2);

        /* renamed from: b */
        String mo39431b();

        /* renamed from: c */
        String mo39432c();
    }

    /* renamed from: a */
    AbstractC10320b mo39422a();

    /* renamed from: a */
    void mo39423a(AbstractC10319a aVar);

    /* renamed from: a */
    void mo39424a(String str);

    /* renamed from: b */
    void mo39425b(AbstractC10319a aVar);
}
