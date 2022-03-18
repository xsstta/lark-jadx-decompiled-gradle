package com.ss.android.lark.mine.impl.info.mvp;

import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;

/* renamed from: com.ss.android.lark.mine.impl.info.mvp.a */
public class C45778a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.a$a */
    public interface AbstractC45779a extends IModel {

        /* renamed from: com.ss.android.lark.mine.impl.info.mvp.a$a$a */
        public interface AbstractC45780a {
            /* renamed from: a */
            void mo160997a(Chatter chatter);

            /* renamed from: b */
            void mo160998b(Chatter chatter);
        }

        /* renamed from: a */
        Chatter mo160990a();

        /* renamed from: a */
        void mo160991a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo160992a(UIGetDataCallback<Chatter> uIGetDataCallback);

        /* renamed from: a */
        void mo160993a(C25975i<C45427e> iVar);

        /* renamed from: b */
        void mo160994b(IGetDataCallback<TenantCertificationInfo> iGetDataCallback);

        /* renamed from: b */
        boolean mo160995b();

        /* renamed from: c */
        String mo160996c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mine.impl.info.mvp.a$b */
    public interface AbstractC45781b extends IView<AbstractC45782a> {

        /* renamed from: com.ss.android.lark.mine.impl.info.mvp.a$b$a */
        public interface AbstractC45782a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo160999a();

            /* renamed from: b */
            String mo161000b();
        }

        /* renamed from: a */
        void mo160980a(Chatter chatter);

        /* renamed from: a */
        void mo160981a(TenantCertificationInfo gVar);

        /* renamed from: a */
        void mo160983a(String str);

        /* renamed from: a */
        void mo160984a(boolean z);

        /* renamed from: b */
        void mo160986b(Chatter chatter);

        /* renamed from: b */
        void mo160987b(String str);

        /* renamed from: c */
        void mo160988c(Chatter chatter);

        /* renamed from: c */
        void mo160989c(String str);
    }
}
