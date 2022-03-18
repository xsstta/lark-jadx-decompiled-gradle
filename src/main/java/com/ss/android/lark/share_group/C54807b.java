package com.ss.android.lark.share_group;

import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;

/* renamed from: com.ss.android.lark.share_group.b */
public class C54807b {

    /* renamed from: com.ss.android.lark.share_group.b$a */
    public interface AbstractC54808a extends IModel {
        /* renamed from: a */
        GroupProfileData mo187018a();

        /* renamed from: a */
        void mo187019a(Bundle bundle, IGetDataCallback<GroupProfileData> iGetDataCallback);

        /* renamed from: b */
        void mo187020b(Bundle bundle, IGetDataCallback<GroupProfileData> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.share_group.b$b */
    public interface AbstractC54809b extends IView<AbstractC54810a> {

        /* renamed from: com.ss.android.lark.share_group.b$b$a */
        public interface AbstractC54810a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo187021a();

            /* renamed from: b */
            void mo187022b();
        }

        /* renamed from: a */
        void mo187009a(Chat chat);

        /* renamed from: a */
        void mo187010a(Chat chat, Chatter chatter);

        /* renamed from: a */
        void mo187011a(GroupProfileData groupProfileData, boolean z);
    }
}
