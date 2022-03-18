package com.ss.android.lark.profile.func.share_profile.share_url.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.a */
public interface AbstractC52537a {

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.a$a */
    public interface AbstractC52538a extends IModel {

        /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.a$a$a */
        public interface AbstractC52539a {
            /* renamed from: a */
            void mo179549a(String str);
        }

        /* renamed from: a */
        void mo179546a(IGetDataCallback<ShareProfileUrlView.C52535a> iGetDataCallback);

        /* renamed from: a */
        void mo179547a(AbstractC52539a aVar);

        /* renamed from: b */
        void mo179548b(IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.a$b */
    public interface AbstractC52540b extends IView<AbstractC52541a> {

        /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.a$b$a */
        public interface AbstractC52541a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179550a(String str);
        }

        /* renamed from: a */
        void mo179542a(ShareProfileUrlView.C52535a aVar);

        /* renamed from: a */
        void mo179544a(String str);

        /* renamed from: b */
        void mo179545b(String str);
    }
}
