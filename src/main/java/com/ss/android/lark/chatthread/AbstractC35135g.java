package com.ss.android.lark.chatthread;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatthread.p1716c.AbstractC35115b;
import com.ss.android.lark.chatthread.view.AbstractC35205g;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;

/* renamed from: com.ss.android.lark.chatthread.g */
public interface AbstractC35135g {

    /* renamed from: com.ss.android.lark.chatthread.g$a */
    public interface AbstractC35136a extends AbstractC35115b<MessageInfo, AbstractC35137a> {

        /* renamed from: com.ss.android.lark.chatthread.g$a$a */
        public interface AbstractC35137a extends AbstractC35115b.AbstractC35116a {
            /* renamed from: a */
            void mo129505a(int i);

            /* renamed from: a */
            void mo129506a(Chat chat);

            /* renamed from: a */
            void mo129507a(TranslateState translateState);

            /* renamed from: a */
            void mo129508a(String str, UserRelationResponse userRelationResponse);

            /* renamed from: a */
            void mo129509a(List<ChatMessageVO> list);

            /* renamed from: a */
            void mo129510a(boolean z);

            /* renamed from: b */
            void mo129511b();

            /* renamed from: c */
            void mo129512c();

            /* renamed from: d */
            void mo129513d();

            /* renamed from: e */
            void mo129514e();
        }

        /* renamed from: a */
        List<MessageInfo> mo129417a();

        /* renamed from: a */
        void mo129419a(IGetDataCallback<C35095c> iGetDataCallback);

        /* renamed from: a */
        void mo129422a(MessageInfo messageInfo);

        /* renamed from: a */
        void mo129428a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

        /* renamed from: a */
        void mo129430a(String str, DingStatus dingStatus, boolean z);

        /* renamed from: a */
        void mo129433a(String str, String str2);

        /* renamed from: a */
        void mo129438a(List<ChatMessageVO> list);

        /* renamed from: b */
        Chat mo129442b();

        /* renamed from: b */
        MessageInfo mo129443b(String str);

        /* renamed from: b */
        void mo129448b(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        Chatter mo129449c();

        /* renamed from: c */
        void mo129451c(String str);

        /* renamed from: d */
        OpenApp mo129453d();

        /* renamed from: d */
        void mo129454d(String str);

        /* renamed from: e */
        Chatter mo129455e();
    }

    /* renamed from: com.ss.android.lark.chatthread.g$b */
    public interface AbstractC35138b extends AbstractC35205g<AbstractC35139a> {

        /* renamed from: com.ss.android.lark.chatthread.g$b$a */
        public interface AbstractC35139a extends AbstractC35205g.AbstractC35206a {
            /* renamed from: a */
            Chatter mo129515a();

            /* renamed from: a */
            void mo129520a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z);

            /* renamed from: a */
            void mo129521a(ChatMessageVO<?> cVar, boolean z, String str, String str2);

            /* renamed from: a */
            void mo129531a(String str, String str2);

            /* renamed from: b */
            OpenApp mo129538b();

            /* renamed from: b */
            void mo129539b(String str);

            /* renamed from: b */
            void mo129540b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

            /* renamed from: b */
            void mo129541b(List<ChatMessageVO> list);

            /* renamed from: c */
            List<MessageInfo> mo129542c();

            /* renamed from: e */
            MessageInfo mo129547e(String str);

            /* renamed from: f */
            void mo129548f(String str);

            /* renamed from: g */
            void mo129549g(String str);
        }

        /* renamed from: com.ss.android.lark.chatthread.g$b$b */
        public interface AbstractC35140b extends AbstractC35205g.AbstractC35207b<AbstractC35138b> {
            /* renamed from: a */
            void mo129330a(Context context, String str, int i);

            /* renamed from: b */
            Activity mo129337b();

            /* renamed from: c */
            FragmentManager mo129338c();

            /* renamed from: d */
            void mo129339d();

            /* renamed from: e */
            void mo129340e();
        }

        /* renamed from: a */
        Activity mo129558a();

        /* renamed from: a */
        void mo129559a(int i, List<PhotoItem> list, View view, boolean z);

        /* renamed from: a */
        void mo129560a(Chat chat);

        /* renamed from: a */
        void mo129561a(C35095c cVar);

        /* renamed from: a */
        void mo129562a(TranslateState translateState);

        /* renamed from: a */
        void mo129563a(RichText richText, String str, RichText richText2);

        /* renamed from: a */
        void mo129564a(String str, UserRelationResponse userRelationResponse);

        /* renamed from: a */
        void mo129565a(List<ChatMessageVO> list);

        /* renamed from: c */
        void mo129566c(int i);

        /* renamed from: f */
        void mo129567f();

        /* renamed from: g */
        void mo129568g();

        /* renamed from: h */
        void mo129569h();

        /* renamed from: i */
        void mo129570i();

        /* renamed from: j */
        void mo129571j();
    }
}
