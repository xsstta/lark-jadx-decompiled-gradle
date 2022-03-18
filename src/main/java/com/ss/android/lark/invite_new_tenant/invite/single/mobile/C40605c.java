package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.AbstractC26035c;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.c */
public class C40605c {

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.c$a */
    public interface AbstractC40606a extends IModel {
        /* renamed from: a */
        void mo146735a(IGetDataCallback<IInviteNewTenantService.C40630a> iGetDataCallback);

        /* renamed from: a */
        void mo146736a(IInviteNewTenantService.ContactType contactType, String str, IGetDataCallback<IInviteNewTenantService.C40631b> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.c$b */
    public interface AbstractC40607b extends AbstractC26035c<AbstractC40606a, AbstractC40608c> {
        /* renamed from: a */
        void mo146737a(MobileCode mobileCode);
    }

    /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.c$c */
    public interface AbstractC40608c extends IView<AbstractC40609a> {

        /* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.c$c$a */
        public interface AbstractC40609a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146738a();

            /* renamed from: a */
            void mo146739a(String str);
        }

        /* renamed from: a */
        void mo146717a();

        /* renamed from: a */
        void mo146719a(IInviteNewTenantService.C40630a aVar);

        /* renamed from: a */
        void mo146720a(String str);

        /* renamed from: b */
        void mo146721b();

        /* renamed from: b */
        void mo146722b(String str);

        /* renamed from: c */
        void mo146723c();

        /* renamed from: d */
        boolean mo146724d();
    }
}
