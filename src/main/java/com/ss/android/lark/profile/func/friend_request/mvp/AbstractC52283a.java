package com.ss.android.lark.profile.func.friend_request.mvp;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.core.api.ContactSource;

/* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.a */
public interface AbstractC52283a {

    /* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.a$a */
    public interface AbstractC52284a extends IModel {
        /* renamed from: a */
        void mo179111a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo179112a(ContactSource contactSource);

        /* renamed from: a */
        void mo179113a(String str);

        /* renamed from: a */
        void mo179114a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo179115b(String str);
    }

    /* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.a$b */
    public interface AbstractC52285b extends IView<AbstractC52286a> {

        /* renamed from: com.ss.android.lark.profile.func.friend_request.mvp.a$b$a */
        public interface AbstractC52286a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179116a(String str, Context context);
        }

        /* renamed from: a */
        void mo179100a();

        /* renamed from: a */
        void mo179102a(String str);

        /* renamed from: a */
        void mo179103a(boolean z);

        /* renamed from: b */
        void mo179104b();

        /* renamed from: b */
        void mo179105b(String str);

        /* renamed from: c */
        void mo179107c(String str);
    }
}
