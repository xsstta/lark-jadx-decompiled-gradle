package com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.a */
public interface AbstractC40429a {

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.a$a */
    public interface AbstractC40430a extends IModel {
        /* renamed from: a */
        void mo146427a(InvitationServiceApi.C40083b bVar, String str, IGetDataCallback<InvitationServiceApi.C40084c> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.a$b */
    public interface AbstractC40431b extends IView<AbstractC40432a> {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.a$b$a */
        public interface AbstractC40432a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146434a(String str, String str2);
        }

        /* renamed from: a */
        void mo146428a();

        /* renamed from: a */
        void mo146429a(String str);

        /* renamed from: a */
        void mo146430a(boolean z);

        /* renamed from: b */
        void mo146431b();

        /* renamed from: b */
        void mo146432b(String str);

        /* renamed from: c */
        void mo146433c(String str);
    }
}
