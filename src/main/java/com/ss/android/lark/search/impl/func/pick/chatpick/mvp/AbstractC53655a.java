package com.ss.android.lark.search.impl.func.pick.chatpick.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.a */
public interface AbstractC53655a {

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.a$a */
    public interface AbstractC53656a extends IModel {
        /* renamed from: a */
        List<BasePickViewData> mo182980a();

        /* renamed from: a */
        void mo182981a(IGetDataCallback<List<BasePickViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo182982a(BasePickViewData basePickViewData, boolean z);

        /* renamed from: b */
        int mo182983b();
    }

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.a$b */
    public interface AbstractC53657b extends IView<AbstractC53658a> {

        /* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.a$b$a */
        public interface AbstractC53658a extends IView.IViewDelegate {
            /* renamed from: a */
            int mo182984a();

            /* renamed from: a */
            void mo182985a(int i);

            /* renamed from: a */
            void mo182986a(IGetDataCallback<List<BasePickViewData>> iGetDataCallback);

            /* renamed from: a */
            void mo182987a(BasePickViewData basePickViewData);

            /* renamed from: a */
            void mo182988a(BasePickViewData basePickViewData, boolean z);

            /* renamed from: b */
            List<BasePickViewData> mo182989b();
        }

        /* renamed from: a */
        void mo182970a();

        /* renamed from: a */
        void mo182972a(List<BasePickViewData> list);

        /* renamed from: a */
        void mo182973a(boolean z);

        /* renamed from: b */
        void mo182974b(List<BasePickViewData> list);
    }
}
