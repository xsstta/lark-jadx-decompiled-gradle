package com.ss.android.lark.contact.impl.contacts_group.join;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.a */
public interface AbstractC35606a {

    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.a$a */
    public interface AbstractC35607a extends IModel {
        /* renamed from: a */
        void mo131281a(IGetDataCallback<List<Chat>> iGetDataCallback);

        /* renamed from: a */
        boolean mo131282a();

        /* renamed from: b */
        void mo131283b(IGetDataCallback<List<Chat>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.a$b */
    public interface AbstractC35608b extends IView<AbstractC35609a> {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.a$b$a */
        public interface AbstractC35609a extends IView.IViewDelegate {
            /* renamed from: a */
            boolean mo131284a();

            /* renamed from: b */
            void mo131285b();
        }

        /* renamed from: a */
        void mo131276a();

        /* renamed from: a */
        void mo131278a(List<Chat> list);

        /* renamed from: b */
        void mo131279b(List<Chat> list);
    }
}
