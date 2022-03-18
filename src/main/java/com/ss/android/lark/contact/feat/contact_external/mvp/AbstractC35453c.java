package com.ss.android.lark.contact.feat.contact_external.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.feat.contact_external.data.ExternalContactViewData;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.c */
public interface AbstractC35453c {

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.c$a */
    public interface AbstractC35454a extends IModel {

        /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.c$a$a */
        public interface AbstractC35455a {
            /* renamed from: a */
            void mo130834a(ExternalContactViewData aVar);
        }

        /* renamed from: a */
        void mo130816a(AbstractC35455a aVar);

        /* renamed from: a */
        void mo130817a(Boolean bool, IGetDataCallback<List<ExternalContactViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo130818a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo130819a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.c$b */
    public interface AbstractC35456b extends IView<AbstractC35457a> {

        /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.c$b$a */
        public interface AbstractC35457a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo130835a(ExternalContactViewData aVar);

            /* renamed from: a */
            void mo130836a(String str);
        }

        /* renamed from: a */
        void mo130792a();

        /* renamed from: a */
        void mo130793a(int i);

        /* renamed from: a */
        void mo130794a(Chatter chatter);

        /* renamed from: a */
        void mo130797a(List<ExternalContactViewData> list);

        /* renamed from: b */
        void mo130798b();

        /* renamed from: b */
        void mo130799b(ExternalContactViewData aVar);

        /* renamed from: c */
        void mo130800c();

        /* renamed from: c */
        void mo130801c(ExternalContactViewData aVar);
    }
}
