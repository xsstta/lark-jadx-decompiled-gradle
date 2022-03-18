package com.ss.android.lark.feed.app.menu;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.menu.e */
public interface AbstractC37663e {

    /* renamed from: com.ss.android.lark.feed.app.menu.e$a */
    public interface AbstractC37664a extends IModel {

        /* renamed from: com.ss.android.lark.feed.app.menu.e$a$a */
        public interface AbstractC37665a {
            /* renamed from: a */
            void mo138089a();

            /* renamed from: a */
            void mo138090a(Map<Integer, Integer> map);
        }

        /* renamed from: a */
        void mo138078a(IGetDataCallback<Map<Integer, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo138079a(AbstractC37665a aVar);
    }

    /* renamed from: com.ss.android.lark.feed.app.menu.e$b */
    public interface AbstractC37666b extends IView<AbstractC37667a> {

        /* renamed from: com.ss.android.lark.feed.app.menu.e$b$a */
        public interface AbstractC37667a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo138093a();
        }

        /* renamed from: a */
        void mo138065a();

        /* renamed from: a */
        void mo138068a(Map<Integer, Integer> map);
    }
}
