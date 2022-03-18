package com.ss.android.lark.favorite.detail;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.detail.e */
public class C37198e {

    /* renamed from: com.ss.android.lark.favorite.detail.e$a */
    interface AbstractC37199a extends IModel {

        /* renamed from: com.ss.android.lark.favorite.detail.e$a$a */
        public interface AbstractC37200a {
        }

        /* renamed from: a */
        List<FavoriteMessageInfo> mo136854a();

        /* renamed from: a */
        void mo136855a(IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: b */
        FavoriteMessageInfo mo136857b();
    }

    /* renamed from: com.ss.android.lark.favorite.detail.e$b */
    interface AbstractC37201b extends IView<AbstractC37202a> {

        /* renamed from: com.ss.android.lark.favorite.detail.e$b$a */
        public interface AbstractC37202a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo136860a();

            /* renamed from: b */
            void mo136861b();
        }

        /* renamed from: a */
        void mo136846a(FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo136848a(String str);

        /* renamed from: a */
        void mo136849a(List<FavoriteMessageInfo> list);

        /* renamed from: a */
        void mo136850a(boolean z);

        /* renamed from: b */
        void mo136853b(String str);
    }
}
