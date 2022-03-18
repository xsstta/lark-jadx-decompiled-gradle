package com.ss.android.lark.contact.impl.contacts_new;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.impl.contacts_new.NewContactView;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_new.a */
public interface AbstractC35695a {

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.a$a */
    public interface AbstractC35696a extends IModel {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_new.a$a$a */
        public interface AbstractC35697a {
            /* renamed from: a */
            void mo131485a(List<ChatApplication> list);
        }

        /* renamed from: a */
        void mo131479a(IGetDataCallback<AbstractC35936a.C35940d> iGetDataCallback);

        /* renamed from: a */
        void mo131480a(AbstractC35697a aVar);

        /* renamed from: a */
        void mo131481a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo131482a(boolean z);

        /* renamed from: a */
        boolean mo131483a();

        /* renamed from: b */
        String mo131484b();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_new.a$b */
    public interface AbstractC35698b extends IView<AbstractC35699a> {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_new.a$b$a */
        public interface AbstractC35699a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131486a(NewContactView.C35693a aVar);

            /* renamed from: a */
            void mo131487a(String str, String str2);

            /* renamed from: a */
            boolean mo131488a();

            /* renamed from: b */
            void mo131489b();
        }

        /* renamed from: a */
        void mo131464a();

        /* renamed from: a */
        void mo131465a(int i);

        /* renamed from: a */
        void mo131466a(NewContactView.C35693a aVar);

        /* renamed from: a */
        void mo131468a(String str, String str2);

        /* renamed from: a */
        void mo131469a(List<NewContactView.C35693a> list);

        /* renamed from: b */
        void mo131470b();

        /* renamed from: b */
        void mo131472b(List<NewContactView.C35693a> list);

        /* renamed from: c */
        void mo131473c();

        /* renamed from: d */
        void mo131474d();
    }
}
