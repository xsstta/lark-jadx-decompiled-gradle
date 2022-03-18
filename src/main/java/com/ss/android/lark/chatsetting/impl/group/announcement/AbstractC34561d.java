package com.ss.android.lark.chatsetting.impl.group.announcement;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.d */
public interface AbstractC34561d {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.d$a */
    public interface AbstractC34562a extends IModel {
        /* renamed from: a */
        Chat mo127706a();

        /* renamed from: a */
        void mo127707a(IGetDataCallback<AnnouncementViewData> iGetDataCallback);

        /* renamed from: a */
        void mo127708a(String str);

        /* renamed from: a */
        void mo127709a(String str, IGetDataCallback<C34549a> iGetDataCallback);

        /* renamed from: b */
        ChatChatter mo127710b();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.d$b */
    public interface AbstractC34563b extends IView<AbstractC34564a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.announcement.d$b$a */
        public interface AbstractC34564a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo127720a();

            /* renamed from: a */
            void mo127721a(String str);
        }

        /* renamed from: a */
        void mo127685a(AnnouncementViewData announcementViewData);

        /* renamed from: a */
        void mo127687a(String str);

        /* renamed from: a */
        void mo127688a(boolean z);

        /* renamed from: b */
        void mo127689b(String str);
    }
}
