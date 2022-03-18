package com.ss.android.lark.chatsetting.impl.group.share;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.i */
public class C35006i {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.i$a */
    public interface AbstractC35007a extends IModel {
        /* renamed from: a */
        Chat mo128969a();

        /* renamed from: a */
        void mo128970a(IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback);

        /* renamed from: a */
        boolean mo128971a(int i);

        /* renamed from: b */
        void mo128972b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        boolean mo128973b();

        /* renamed from: c */
        void mo128974c();

        /* renamed from: d */
        int mo128975d();

        /* renamed from: e */
        int mo128976e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.i$b */
    public interface AbstractC35008b extends IView<AbstractC35009a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.i$b$a */
        public interface AbstractC35009a extends IView.IViewDelegate {
            /* renamed from: a */
            String mo128982a();

            /* renamed from: b */
            boolean mo128983b();

            /* renamed from: c */
            void mo128984c();

            /* renamed from: d */
            Chat mo128985d();

            /* renamed from: e */
            int mo128986e();

            /* renamed from: f */
            int mo128987f();
        }

        /* renamed from: a */
        void mo128944a(Chat chat);

        /* renamed from: a */
        void mo128945a(ChatLinkTokenResponse chatLinkTokenResponse, int i);

        /* renamed from: a */
        void mo128947a(String str);

        /* renamed from: a */
        void mo128948a(boolean z, boolean z2);

        /* renamed from: b */
        void mo128949b(String str);
    }
}
