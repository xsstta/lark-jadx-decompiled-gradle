package com.ss.android.lark.feed.app.delayed.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.delayed.mvp.c */
public interface AbstractC37532c {

    /* renamed from: com.ss.android.lark.feed.app.delayed.mvp.c$a */
    public interface AbstractC37533a extends IModel {

        /* renamed from: com.ss.android.lark.feed.app.delayed.mvp.c$a$a */
        public interface AbstractC37534a {
            /* renamed from: a */
            void mo137538a();

            /* renamed from: a */
            void mo137539a(int i);

            /* renamed from: a */
            void mo137540a(UpdateRecord updateRecord);

            /* renamed from: a */
            void mo137541a(Map<Integer, Integer> map);
        }

        /* renamed from: a */
        void mo137509a(IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        void mo137511a(FeedPreview feedPreview, boolean z, IGetDataCallback<FeedPreviewInfo> iGetDataCallback);

        /* renamed from: a */
        void mo137512a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, IGetDataCallback<List<FeedCard>> iGetDataCallback);

        /* renamed from: a */
        void mo137513a(String str);

        /* renamed from: a */
        void mo137514a(boolean z, FeedPreview feedPreview, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: b */
        void mo137516b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.feed.app.delayed.mvp.c$b */
    public interface AbstractC37535b extends IView<AbstractC37536a> {

        /* renamed from: com.ss.android.lark.feed.app.delayed.mvp.c$b$a */
        public interface AbstractC37536a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo137529a(ChatFeedPreview chatFeedPreview);

            /* renamed from: a */
            void mo137530a(FeedPreview feedPreview, boolean z);

            /* renamed from: a */
            void mo137531a(UIFeedCard uIFeedCard);

            /* renamed from: b */
            void mo137532b(FeedPreview feedPreview, boolean z);

            /* renamed from: c */
            void mo137533c(FeedPreview feedPreview, boolean z);
        }

        /* renamed from: a */
        void mo137488a();

        /* renamed from: a */
        void mo137489a(int i);

        /* renamed from: a */
        void mo137491a(FeedPreview feedPreview);

        /* renamed from: a */
        void mo137492a(UpdateRecord updateRecord);

        /* renamed from: a */
        void mo137493a(String str, ChatFeedPreview chatFeedPreview, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo137494a(Map<Integer, Integer> map);

        /* renamed from: b */
        void mo137495b();

        /* renamed from: b */
        void mo137496b(int i);

        /* renamed from: c */
        void mo137497c();
    }
}
