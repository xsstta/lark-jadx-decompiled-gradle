package com.ss.android.lark.main.app.drawer;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.drawer.c */
public class C44232c {

    /* renamed from: com.ss.android.lark.main.app.drawer.c$a */
    public interface AbstractC44233a extends IModel {

        /* renamed from: com.ss.android.lark.main.app.drawer.c$a$a */
        public interface AbstractC44234a {
            /* renamed from: a */
            void mo157263a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2);
        }

        /* renamed from: a */
        void mo157225a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo157226a(AbstractC44234a aVar);

        /* renamed from: a */
        void mo157228a(boolean z);

        /* renamed from: a */
        boolean mo157229a();

        /* renamed from: b */
        boolean mo157230b();

        /* renamed from: c */
        boolean mo157231c();

        /* renamed from: d */
        boolean mo157232d();

        /* renamed from: e */
        TenantInfo mo157233e();
    }

    /* renamed from: com.ss.android.lark.main.app.drawer.c$b */
    public interface AbstractC44235b extends IView<AbstractC44236a> {

        /* renamed from: com.ss.android.lark.main.app.drawer.c$b$a */
        public interface AbstractC44236a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo157256a();

            /* renamed from: a */
            void mo157257a(Context context, String str, IGetDataCallback<Boolean> iGetDataCallback);

            /* renamed from: a */
            void mo157258a(boolean z);

            /* renamed from: b */
            boolean mo157259b();

            /* renamed from: c */
            boolean mo157260c();

            /* renamed from: d */
            String mo157261d();
        }

        /* renamed from: a */
        void mo157192a(int i);

        /* renamed from: a */
        void mo157196a(List<TenantInfo> list);

        /* renamed from: a */
        void mo157197a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2);

        /* renamed from: a */
        void mo157198a(boolean z);

        /* renamed from: b */
        void mo157199b();

        /* renamed from: c */
        void mo157200c();

        /* renamed from: d */
        void mo157201d();

        /* renamed from: e */
        void mo157202e();
    }
}
