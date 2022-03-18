package com.ss.android.lark.feed.app.conversationbox.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.c */
public interface AbstractC37475c {

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.c$a */
    public interface AbstractC37476a extends IModel {

        /* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.c$a$a */
        public interface AbstractC37477a {
            /* renamed from: a */
            void mo137431a();

            /* renamed from: a */
            void mo137432a(int i);

            /* renamed from: a */
            void mo137433a(UpdateRecord updateRecord);

            /* renamed from: a */
            void mo137434a(Map<Integer, Integer> map);

            /* renamed from: b */
            void mo137435b();
        }

        /* renamed from: a */
        void mo137388a(IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        void mo137389a(AbstractC37477a aVar);

        /* renamed from: a */
        void mo137390a(FeedPreview feedPreview);

        /* renamed from: a */
        void mo137391a(FeedPreview feedPreview, boolean z, IGetDataCallback<FeedPreviewInfo> iGetDataCallback);

        /* renamed from: a */
        void mo137392a(String str);

        /* renamed from: a */
        boolean mo137394a();

        /* renamed from: b */
        void mo137396b();

        /* renamed from: b */
        void mo137398b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback);

        /* renamed from: c */
        boolean mo137400c();
    }

    /* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.c$b */
    public interface AbstractC37478b extends IView<AbstractC37479a> {

        /* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.c$b$a */
        public interface AbstractC37479a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo137421a(ChatFeedPreview chatFeedPreview);

            /* renamed from: a */
            void mo137422a(FeedPreview feedPreview);

            /* renamed from: a */
            void mo137423a(FeedPreview feedPreview, boolean z);

            /* renamed from: a */
            boolean mo137424a();

            /* renamed from: b */
            void mo137425b();

            /* renamed from: b */
            void mo137426b(FeedPreview feedPreview, boolean z);
        }

        /* renamed from: a */
        void mo137358a(int i);

        /* renamed from: a */
        void mo137360a(FeedPreview feedPreview);

        /* renamed from: a */
        void mo137361a(UpdateRecord updateRecord);

        /* renamed from: a */
        void mo137362a(String str);

        /* renamed from: a */
        void mo137363a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo137364a(Map<Integer, Integer> map);

        /* renamed from: b */
        void mo137365b();

        /* renamed from: c */
        void mo137366c();

        /* renamed from: d */
        void mo137367d();

        /* renamed from: e */
        void mo137368e();

        /* renamed from: f */
        void mo137369f();

        /* renamed from: g */
        void mo137370g();
    }
}
