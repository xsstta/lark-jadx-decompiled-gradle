package com.ss.android.lark.readstate.impl.detail;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.readstate.impl.detail.vo.SearchReadStateResult;
import com.ss.android.lark.readstate.impl.detail.vo.ShowReadStateResult;

/* renamed from: com.ss.android.lark.readstate.impl.detail.a */
public class C53111a {

    /* renamed from: com.ss.android.lark.readstate.impl.detail.a$a */
    interface AbstractC53112a extends IModel {
        /* renamed from: a */
        void mo181417a(C53117c cVar, IGetDataCallback<ShowReadStateResult> iGetDataCallback);

        /* renamed from: a */
        void mo181418a(String str, IGetDataCallback<SearchReadStateResult> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.readstate.impl.detail.a$b */
    interface AbstractC53113b extends IView<AbstractC53114a> {

        /* renamed from: com.ss.android.lark.readstate.impl.detail.a$b$a */
        public interface AbstractC53114a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo181419a(String str);
        }

        /* renamed from: a */
        void mo181405a();

        /* renamed from: a */
        void mo181407a(SearchReadStateResult aVar);

        /* renamed from: a */
        void mo181408a(ShowReadStateResult bVar);

        /* renamed from: a */
        void mo181409a(String str);
    }
}
