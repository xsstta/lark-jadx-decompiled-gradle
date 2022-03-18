package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.info.edit.C34637b;
import com.ss.android.lark.chatsetting.impl.group.info.edit.GroupInfoEditView;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.d */
public interface AbstractC34647d {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.d$a */
    public interface AbstractC34648a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.d$a$a */
        public interface AbstractC34649a {
        }

        /* renamed from: a */
        Chat mo127939a();

        /* renamed from: a */
        void mo127940a(IGetDataCallback<C34637b.C34639a> iGetDataCallback);

        /* renamed from: a */
        void mo127942a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        String mo127943b();

        /* renamed from: b */
        void mo127944b(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        void mo127945c(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.d$b */
    public interface AbstractC34650b extends IView<AbstractC34651a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.edit.d$b$a */
        public interface AbstractC34651a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo127950a(GroupInfoEditView.DescEditStatus descEditStatus);

            /* renamed from: a */
            void mo127951a(String str);

            /* renamed from: a */
            void mo127952a(String str, GroupInfoEditView.DescEditStatus descEditStatus);

            /* renamed from: b */
            void mo127953b(String str);
        }

        /* renamed from: a */
        void mo127909a();

        /* renamed from: a */
        void mo127912a(Intent intent);

        /* renamed from: a */
        void mo127913a(Chat chat, int i, boolean z, String str);

        /* renamed from: a */
        void mo127915a(String str);

        /* renamed from: a */
        void mo127916a(String str, GroupInfoEditView.DescEditStatus descEditStatus);

        /* renamed from: b */
        void mo127917b();
    }
}
