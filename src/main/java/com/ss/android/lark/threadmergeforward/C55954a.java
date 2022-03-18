package com.ss.android.lark.threadmergeforward;

import android.view.View;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.List;

/* renamed from: com.ss.android.lark.threadmergeforward.a */
public class C55954a {

    /* renamed from: com.ss.android.lark.threadmergeforward.a$a */
    public interface AbstractC55955a extends IModel {

        /* renamed from: com.ss.android.lark.threadmergeforward.a$a$a */
        public interface AbstractC55956a {
            /* renamed from: a */
            void mo190732a();
        }

        /* renamed from: a */
        Chat mo190722a();

        /* renamed from: a */
        void mo190723a(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo190724a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

        /* renamed from: a */
        void mo190725a(String str, String str2);

        /* renamed from: a */
        void mo190726a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: b */
        String mo190727b();

        /* renamed from: b */
        void mo190728b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        Thread mo190729c();

        /* renamed from: d */
        String mo190730d();

        /* renamed from: e */
        int mo190731e();
    }

    /* renamed from: com.ss.android.lark.threadmergeforward.a$b */
    public interface AbstractC55957b extends IView<AbstractC55958a> {

        /* renamed from: com.ss.android.lark.threadmergeforward.a$b$a */
        public interface AbstractC55958a extends IView.IViewDelegate {
            /* renamed from: a */
            String mo190733a();

            /* renamed from: a */
            void mo190734a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z);

            /* renamed from: a */
            void mo190735a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

            /* renamed from: a */
            void mo190736a(String str, String str2);

            /* renamed from: a */
            void mo190737a(List<String> list);

            /* renamed from: b */
            Chat mo190738b();

            /* renamed from: b */
            void mo190739b(List<String> list);

            /* renamed from: c */
            String mo190740c();

            /* renamed from: d */
            String mo190741d();

            /* renamed from: e */
            Message mo190742e();
        }

        /* renamed from: a */
        void mo190706a();

        /* renamed from: a */
        void mo190708a(int i, List<PhotoItem> list, View view, boolean z);

        /* renamed from: a */
        void mo190710a(String str);

        /* renamed from: a */
        void mo190711a(List<C55905a> list);

        /* renamed from: b */
        void mo190713b();

        /* renamed from: c */
        void mo190714c();
    }
}
