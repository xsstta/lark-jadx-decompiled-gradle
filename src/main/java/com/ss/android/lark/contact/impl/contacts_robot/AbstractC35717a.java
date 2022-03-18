package com.ss.android.lark.contact.impl.contacts_robot;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a */
public interface AbstractC35717a {

    /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a$a */
    public interface AbstractC35718a extends IModel {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a$a$a */
        public interface AbstractC35719a {
            /* renamed from: a */
            void mo131520a();
        }

        /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a$a$b */
        public interface AbstractC35720b {
            /* renamed from: a */
            void mo131521a();

            /* renamed from: a */
            void mo131522a(List<Chatter> list);

            /* renamed from: b */
            void mo131523b(List<Chatter> list);
        }

        /* renamed from: a */
        void mo131516a(AbstractC35719a aVar);

        /* renamed from: a */
        void mo131517a(AbstractC35720b bVar);

        /* renamed from: a */
        boolean mo131518a();

        /* renamed from: b */
        void mo131519b();
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a$b */
    public interface AbstractC35721b extends IView<AbstractC35722a> {

        /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.a$b$a */
        public interface AbstractC35722a extends IView.IViewDelegate {
            /* renamed from: a */
            boolean mo131524a();

            /* renamed from: b */
            void mo131525b();
        }

        /* renamed from: a */
        void mo131509a();

        /* renamed from: a */
        void mo131511a(List<Chatter> list);

        /* renamed from: b */
        void mo131513b();

        /* renamed from: b */
        void mo131514b(List<Chatter> list);
    }
}
