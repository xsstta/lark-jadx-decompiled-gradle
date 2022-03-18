package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

import android.app.Activity;
import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40201a;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.a */
public interface AbstractC40220a {

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.a$a */
    public interface AbstractC40221a extends IModel {
        /* renamed from: a */
        void mo145922a(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback);

        /* renamed from: a */
        void mo145923a(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.a$b */
    public interface AbstractC40222b extends IView<AbstractC40223a> {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.a$b$a */
        public interface AbstractC40223a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        Activity mo145924a();

        /* renamed from: a */
        void mo145925a(String str);

        /* renamed from: a */
        void mo145926a(String str, String str2, boolean z, C40205c.AbstractC40215a aVar);

        /* renamed from: a */
        void mo145927a(List<C40201a> list);

        /* renamed from: b */
        void mo145928b();

        /* renamed from: c */
        void mo145929c();

        /* renamed from: d */
        void mo145930d();
    }
}
