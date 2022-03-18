package com.ss.android.lark.contact.impl.contacts_group.manage;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.a */
public interface AbstractC35623a {

    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.a$a */
    public interface AbstractC35624a extends IModel {
        /* renamed from: a */
        void mo131305a(IGetDataCallback<List<Chat>> iGetDataCallback);

        /* renamed from: a */
        boolean mo131306a();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.a$b */
    public interface AbstractC35625b extends IView<AbstractC35626a> {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.a$b$a */
        public interface AbstractC35626a extends IView.IViewDelegate {
            /* renamed from: a */
            boolean mo131307a();

            /* renamed from: b */
            void mo131308b();
        }

        /* renamed from: a */
        void mo131298a();

        /* renamed from: a */
        void mo131299a(PickType pickType);

        /* renamed from: a */
        void mo131301a(List<Chat> list);

        /* renamed from: b */
        void mo131302b(List<Chat> list);

        /* renamed from: c */
        void mo131303c(List<String> list);

        /* renamed from: d */
        void mo131304d(List<String> list);
    }
}
