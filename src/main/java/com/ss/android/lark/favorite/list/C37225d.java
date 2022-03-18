package com.ss.android.lark.favorite.list;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.favorite.list.FavoriteListModel;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.list.d */
public class C37225d {

    /* renamed from: com.ss.android.lark.favorite.list.d$a */
    public interface AbstractC37226a extends IModel {

        /* renamed from: com.ss.android.lark.favorite.list.d$a$a */
        public interface AbstractC37227a {
            /* renamed from: a */
            void mo136906a(List<FavoriteMessageInfo> list);

            /* renamed from: b */
            void mo136907b(List<FavoriteMessageInfo> list);
        }

        /* renamed from: a */
        List<FavoriteMessageInfo> mo136872a(String str);

        /* renamed from: a */
        void mo136873a(FavoriteMessageInfo favoriteMessageInfo, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo136874a(FavoriteListModel.AbstractC37207a<FavoriteMessageInfo> aVar);

        /* renamed from: a */
        boolean mo136876a();

        /* renamed from: b */
        void mo136877b();
    }

    /* renamed from: com.ss.android.lark.favorite.list.d$b */
    public interface AbstractC37228b extends IView<AbstractC37229a> {

        /* renamed from: com.ss.android.lark.favorite.list.d$b$a */
        public interface AbstractC37229a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo136908a(FavoriteMessageInfo favoriteMessageInfo);

            /* renamed from: a */
            boolean mo136909a();

            /* renamed from: b */
            void mo136910b();

            /* renamed from: b */
            void mo136911b(FavoriteMessageInfo favoriteMessageInfo);

            /* renamed from: c */
            void mo136912c(FavoriteMessageInfo favoriteMessageInfo);
        }

        /* renamed from: a */
        void mo136886a();

        /* renamed from: a */
        void mo136890a(String str);

        /* renamed from: a */
        void mo136891a(List<FavoriteMessageInfo> list);

        /* renamed from: b */
        void mo136892b();

        /* renamed from: b */
        void mo136895b(List<FavoriteMessageInfo> list);
    }
}
