package com.ss.android.lark.mine.impl.status.mvp;

import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.dto.C45423a;

/* renamed from: com.ss.android.lark.mine.impl.status.mvp.a */
public interface AbstractC45819a {

    /* renamed from: com.ss.android.lark.mine.impl.status.mvp.a$a */
    public interface AbstractC45820a extends IModel {
        /* renamed from: a */
        void mo161062a(int i, int i2, IGetDataCallback<C45423a> iGetDataCallback);

        /* renamed from: a */
        void mo161063a(Intent intent);

        /* renamed from: a */
        void mo161064a(ChatterDescription chatterDescription, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo161065a(String str, ChatterDescription.Type type, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.mine.impl.status.mvp.a$b */
    public interface AbstractC45821b extends IView<AbstractC45822a> {

        /* renamed from: com.ss.android.lark.mine.impl.status.mvp.a$b$a */
        public interface AbstractC45822a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo161066a();

            /* renamed from: a */
            void mo161067a(ChatterDescription chatterDescription);

            /* renamed from: a */
            void mo161068a(String str, ChatterDescription.Type type);
        }

        /* renamed from: a */
        void mo161053a();

        /* renamed from: a */
        void mo161054a(C45423a aVar);

        /* renamed from: a */
        void mo161056a(String str);
    }
}
