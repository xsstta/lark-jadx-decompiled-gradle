package com.ss.android.lark.invite_new_tenant.invite.all.link;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invite_new_tenant.invite.all.p2067a.C40547a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.a */
public class C40550a {

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.a$a */
    public interface AbstractC40551a extends IModel {
        /* renamed from: a */
        void mo146672a(IGetDataCallback<C40547a> iGetDataCallback);

        /* renamed from: b */
        void mo146673b(IGetDataCallback<C40534a> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.a$b */
    public interface AbstractC40552b extends IView<AbstractC40553a> {

        /* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.link.a$b$a */
        public interface AbstractC40553a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo146666a(C40534a aVar);

        /* renamed from: a */
        void mo146667a(C40547a aVar);

        /* renamed from: a */
        void mo146669a(String str);
    }
}
