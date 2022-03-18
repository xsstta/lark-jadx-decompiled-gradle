package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.dto.ChatQRCodeTokenResponse;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeView;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.c */
public interface AbstractC34675c {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.c$a */
    public interface AbstractC34676a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.c$a$a */
        public interface AbstractC34677a {
            /* renamed from: a */
            void mo128023a(Chat chat);
        }

        /* renamed from: a */
        Bitmap mo127996a();

        /* renamed from: a */
        String mo127997a(Context context);

        /* renamed from: a */
        void mo127998a(Context context, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo127999a(Bitmap bitmap);

        /* renamed from: a */
        void mo128000a(IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback);

        /* renamed from: a */
        void mo128001a(Chat chat);

        /* renamed from: a */
        void mo128002a(AbstractC34677a aVar);

        /* renamed from: a */
        boolean mo128003a(int i);

        /* renamed from: b */
        Chat mo128004b();

        /* renamed from: b */
        void mo128005b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: c */
        boolean mo128007c();

        /* renamed from: d */
        void mo128008d();

        /* renamed from: e */
        int mo128009e();

        /* renamed from: f */
        int mo128010f();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.c$b */
    public interface AbstractC34678b extends IView<AbstractC34679a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.qrcode.c$b$a */
        public interface AbstractC34679a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128024a();

            /* renamed from: a */
            void mo128025a(Bitmap bitmap);

            /* renamed from: a */
            void mo128026a(boolean z);

            /* renamed from: b */
            void mo128027b();

            /* renamed from: c */
            void mo128028c();

            /* renamed from: d */
            int mo128029d();
        }

        /* renamed from: a */
        void mo127978a();

        /* renamed from: a */
        void mo127979a(int i);

        /* renamed from: a */
        void mo127980a(GroupQRCodeView.C34660a aVar);

        /* renamed from: a */
        void mo127981a(GroupQRCodeView.C34661b bVar);

        /* renamed from: a */
        void mo127983a(String str);

        /* renamed from: a */
        void mo127984a(boolean z);

        /* renamed from: b */
        void mo127985b();

        /* renamed from: b */
        void mo127986b(GroupQRCodeView.C34660a aVar);

        /* renamed from: b */
        void mo127987b(String str);

        /* renamed from: c */
        void mo127988c();

        /* renamed from: c */
        void mo127989c(String str);
    }
}
