package com.ss.android.lark.invitation.v2.feat.external.search;

import android.app.Activity;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.profile.dto.ProfileFinishResult;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.a */
public interface AbstractC40294a {

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.a$a */
    public interface AbstractC40295a extends IModel {
        /* renamed from: a */
        void mo146126a(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback);

        /* renamed from: a */
        void mo146127a(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.a$b */
    public interface AbstractC40296b extends IView<AbstractC40297a> {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.a$b$a */
        public interface AbstractC40297a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146138a();

            /* renamed from: a */
            void mo146139a(String str);

            /* renamed from: a */
            void mo146140a(String str, boolean z);

            /* renamed from: b */
            String mo146141b();
        }

        /* renamed from: a */
        Activity mo146128a();

        /* renamed from: a */
        void mo146129a(ProfileFinishResult profileFinishResult);

        /* renamed from: a */
        void mo146130a(String str);

        /* renamed from: a */
        void mo146131a(String str, String str2);

        /* renamed from: a */
        void mo146132a(List<C40303e> list);

        /* renamed from: b */
        void mo146133b();

        /* renamed from: c */
        void mo146134c();

        /* renamed from: d */
        void mo146135d();

        /* renamed from: e */
        void mo146136e();

        /* renamed from: f */
        void mo146137f();
    }
}
