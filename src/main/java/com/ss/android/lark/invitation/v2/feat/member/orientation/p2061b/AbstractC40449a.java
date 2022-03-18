package com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.a */
public interface AbstractC40449a {

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.a$a */
    public interface AbstractC40450a extends IModel {
        /* renamed from: a */
        void mo146459a(InvitationServiceApi.C40083b bVar, String str, IGetDataCallback<InvitationServiceApi.C40084c> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.a$b */
    public interface AbstractC40451b extends IView<AbstractC40452a> {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.a$b$a */
        public interface AbstractC40452a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146466a(String str, String str2);
        }

        /* renamed from: a */
        void mo146460a();

        /* renamed from: a */
        void mo146461a(String str);

        /* renamed from: a */
        void mo146462a(boolean z);

        /* renamed from: b */
        void mo146463b();

        /* renamed from: b */
        void mo146464b(String str);

        /* renamed from: c */
        void mo146465c(String str);
    }
}
