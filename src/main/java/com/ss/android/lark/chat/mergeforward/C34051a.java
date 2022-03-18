package com.ss.android.lark.chat.mergeforward;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.mergeforward.a */
public class C34051a {

    /* renamed from: com.ss.android.lark.chat.mergeforward.a$a */
    public interface AbstractC34052a extends IModel {

        /* renamed from: com.ss.android.lark.chat.mergeforward.a$a$a */
        public interface AbstractC34053a {
            /* renamed from: a */
            void mo126211a(String str);
        }

        /* renamed from: a */
        String mo126199a();

        /* renamed from: a */
        List<PhotoItem> mo126200a(String str, boolean z);

        /* renamed from: a */
        void mo126201a(IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo126202a(String str);

        /* renamed from: a */
        void mo126203a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo126204a(String str, String str2);

        /* renamed from: a */
        void mo126205a(List<String> list);

        /* renamed from: b */
        FavoriteMessageInfo mo126206b();

        /* renamed from: b */
        MessageInfo mo126207b(String str);

        /* renamed from: b */
        void mo126208b(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback);

        /* renamed from: c */
        String mo126209c();

        /* renamed from: d */
        String mo126210d();
    }

    /* renamed from: com.ss.android.lark.chat.mergeforward.a$b */
    public interface AbstractC34054b extends IView<AbstractC34055a> {

        /* renamed from: com.ss.android.lark.chat.mergeforward.a$b$a */
        public interface AbstractC34055a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo126212a();

            /* renamed from: a */
            void mo126213a(View view, PhotoItem photoItem, boolean z);

            /* renamed from: a */
            void mo126214a(String str);

            /* renamed from: a */
            void mo126215a(String str, IGetDataCallback<MessageInfo> iGetDataCallback);

            /* renamed from: a */
            void mo126216a(String str, String str2);

            /* renamed from: a */
            void mo126217a(List<String> list);

            /* renamed from: b */
            void mo126218b();

            /* renamed from: b */
            void mo126219b(String str, IGetDataCallback<String> iGetDataCallback);

            /* renamed from: c */
            String mo126220c();

            /* renamed from: d */
            String mo126221d();
        }

        /* renamed from: a */
        void mo126182a(int i, List<PhotoItem> list, View view);

        /* renamed from: a */
        void mo126183a(FavoriteMessageInfo favoriteMessageInfo);

        /* renamed from: a */
        void mo126185a(String str);

        /* renamed from: a */
        void mo126186a(List<ChatMessageVO> list);

        /* renamed from: b */
        void mo126187b(String str);

        /* renamed from: c */
        void mo126188c(String str);
    }
}
