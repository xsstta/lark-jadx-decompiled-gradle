package com.ss.android.lark.contact.impl.contacts_home;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.impl.viewdata.C36077a;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.contacts_home.f */
public interface AbstractC35680f {

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.f$a */
    public interface AbstractC35681a extends IModel {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_home.f$a$a */
        public interface AbstractC35682a {
            /* renamed from: a */
            void mo131432a(int i);

            /* renamed from: a */
            void mo131433a(Chatter chatter, String str, boolean z);
        }

        /* renamed from: a */
        void mo131405a();

        /* renamed from: a */
        void mo131406a(IGetDataCallback<GetAdminPermissionInfoResponse> iGetDataCallback);

        /* renamed from: a */
        void mo131408a(AbstractC35682a aVar);

        /* renamed from: a */
        void mo131409a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo131410a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        String mo131412b();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.f$b */
    public interface AbstractC35683b extends IView<AbstractC35684a> {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_home.f$b$a */
        public interface AbstractC35684a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131436a(C36077a aVar);

            /* renamed from: a */
            void mo131437a(String str);

            /* renamed from: a */
            void mo131438a(String str, boolean z);
        }

        /* renamed from: a */
        void mo131354a();

        /* renamed from: a */
        void mo131355a(int i);

        /* renamed from: a */
        void mo131357a(Chatter chatter);

        /* renamed from: a */
        void mo131359a(C36077a aVar);

        /* renamed from: a */
        void mo131360a(String str);

        /* renamed from: a */
        void mo131361a(List<C36077a> list);

        /* renamed from: a */
        void mo131362a(Set<String> set);

        /* renamed from: a */
        void mo131363a(boolean z);

        /* renamed from: b */
        void mo131364b();

        /* renamed from: b */
        void mo131365b(C36077a aVar);

        /* renamed from: b */
        void mo131366b(List<String> list);

        /* renamed from: b */
        void mo131367b(boolean z);

        /* renamed from: c */
        void mo131369c(boolean z);

        /* renamed from: d */
        void mo131370d();

        /* renamed from: e */
        void mo131371e();

        /* renamed from: f */
        ITitleInfo mo131372f();
    }
}
