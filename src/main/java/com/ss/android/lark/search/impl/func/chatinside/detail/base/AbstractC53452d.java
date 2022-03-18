package com.ss.android.lark.search.impl.func.chatinside.detail.base;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53407b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.d */
public interface AbstractC53452d {

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.d$a */
    public interface AbstractC53453a extends IModel {

        /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.d$a$a */
        public interface AbstractC53454a {
        }

        /* renamed from: a */
        void mo182460a(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z);

        /* renamed from: a */
        void mo182511a(List<String> list, List<String> list2, int i, int i2, IGetDataCallback<List<Bitmap>> iGetDataCallback);

        /* renamed from: b */
        String mo182515b();

        /* renamed from: b */
        void mo182461b(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z);

        /* renamed from: h */
        C53407b mo182522h();

        /* renamed from: q */
        void mo182464q();
    }

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.d$b */
    public interface AbstractC53455b extends IView<AbstractC53456a> {

        /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.base.d$b$a */
        public interface AbstractC53456a<T extends SearchBaseInfo> extends IView.IViewDelegate {
            /* renamed from: a */
            void mo182533a();

            /* renamed from: a */
            void mo182534a(T t, int i);

            /* renamed from: a */
            void mo182535a(String str);

            /* renamed from: a */
            void mo182536a(String str, boolean z);

            /* renamed from: b */
            boolean mo182539b();

            /* renamed from: c */
            int mo182541c();

            /* renamed from: d */
            void mo182542d();

            /* renamed from: e */
            boolean mo182543e();

            /* renamed from: f */
            String mo182544f();

            /* renamed from: g */
            String mo182545g();

            /* renamed from: h */
            int mo182546h();
        }

        /* renamed from: g */
        void mo182491g();

        /* renamed from: h */
        void mo182492h();

        /* renamed from: i */
        String mo182493i();
    }
}
