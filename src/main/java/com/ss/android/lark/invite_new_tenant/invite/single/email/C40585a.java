package com.ss.android.lark.invite_new_tenant.invite.single.email;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.a */
public class C40585a {

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.a$a */
    public interface AbstractC40586a extends IModel {
        /* renamed from: a */
        void mo146713a(IInviteNewTenantService.ContactType contactType, String str, IGetDataCallback<IInviteNewTenantService.C40631b> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.a$b */
    public interface AbstractC40587b extends IView<AbstractC40588a> {

        /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.a$b$a */
        public interface AbstractC40588a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146714a(String str);
        }

        /* renamed from: a */
        void mo146706a();

        /* renamed from: a */
        void mo146708a(String str);

        /* renamed from: b */
        void mo146709b();

        /* renamed from: c */
        void mo146710c();

        /* renamed from: d */
        boolean mo146711d();
    }
}
