package com.ss.android.lark.feed.app;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.j */
public class C37623j {

    /* renamed from: com.ss.android.lark.feed.app.j$a */
    public interface AbstractC37624a extends IModel {

        /* renamed from: com.ss.android.lark.feed.app.j$a$a */
        public interface AbstractC37625a {
            /* renamed from: a */
            void mo137925a();

            /* renamed from: a */
            void mo137926a(int i);

            /* renamed from: a */
            void mo137927a(FeedCard.FeedType feedType, LoadState.LoadType loadType);

            /* renamed from: a */
            void mo137928a(LoadState loadState, FeedCard.FeedType feedType);

            /* renamed from: a */
            void mo137929a(UpdateRecord updateRecord);

            /* renamed from: a */
            void mo137930a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2);

            /* renamed from: a */
            void mo137931a(Map<Integer, Integer> map);

            /* renamed from: a */
            void mo137932a(boolean z);

            /* renamed from: b */
            void mo137933b();

            /* renamed from: b */
            void mo137934b(int i);

            /* renamed from: b */
            void mo137935b(UpdateRecord updateRecord);

            /* renamed from: b */
            void mo137936b(boolean z);

            /* renamed from: c */
            void mo137937c();

            /* renamed from: c */
            void mo137938c(UpdateRecord updateRecord);

            /* renamed from: d */
            void mo137939d(UpdateRecord updateRecord);
        }

        /* renamed from: a */
        LoadState mo138012a(FeedCard.FeedType feedType);

        /* renamed from: a */
        void mo138013a();

        /* renamed from: a */
        void mo138014a(IGetDataCallback<Map<Integer, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo138015a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview);

        /* renamed from: a */
        void mo138016a(FeedFilter feedFilter);

        /* renamed from: a */
        void mo138017a(FeedPreview feedPreview, boolean z, IGetDataCallback<FeedPreviewInfo> iGetDataCallback);

        /* renamed from: a */
        void mo138018a(UIFeedCard uIFeedCard);

        /* renamed from: a */
        void mo138019a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, IGetDataCallback<List<FeedCard>> iGetDataCallback);

        /* renamed from: a */
        void mo138020a(AbstractC37625a aVar);

        /* renamed from: a */
        void mo138021a(String str);

        /* renamed from: a */
        void mo138022a(List<UIFeedCard> list);

        /* renamed from: a */
        void mo138023a(boolean z);

        /* renamed from: a */
        void mo138024a(boolean z, FeedPreview feedPreview, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: b */
        void mo138025b();

        /* renamed from: b */
        void mo138026b(IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: b */
        void mo138027b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback);

        /* renamed from: b */
        void mo138028b(String str);

        /* renamed from: b */
        boolean mo138029b(FeedCard.FeedType feedType);

        /* renamed from: c */
        void mo138030c(IGetDataCallback<StrongGuideInfo> iGetDataCallback);

        /* renamed from: c */
        void mo138031c(FeedCard.FeedType feedType);

        /* renamed from: c */
        boolean mo138032c();

        /* renamed from: d */
        void mo138033d(FeedCard.FeedType feedType);
    }

    /* renamed from: com.ss.android.lark.feed.app.j$b */
    public interface AbstractC37626b extends IView<AbstractC37627a> {

        /* renamed from: com.ss.android.lark.feed.app.j$b$a */
        public interface AbstractC37627a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo137951a();

            /* renamed from: a */
            void mo137952a(View view, ChatFeedPreview chatFeedPreview, boolean z);

            /* renamed from: a */
            void mo137953a(FeedCard.FeedType feedType, int i, FeedPreview feedPreview);

            /* renamed from: a */
            void mo137954a(BannerPreview bannerPreview);

            /* renamed from: a */
            void mo137955a(DocFeedPreview docFeedPreview);

            /* renamed from: a */
            void mo137956a(FeedFilter feedFilter);

            /* renamed from: a */
            void mo137957a(FeedPreview feedPreview);

            /* renamed from: a */
            void mo137958a(FeedPreview feedPreview, boolean z);

            /* renamed from: a */
            void mo137959a(UIFeedCard uIFeedCard);

            /* renamed from: a */
            void mo137960a(UIFeedCard uIFeedCard, int i);

            /* renamed from: a */
            void mo137961a(List<UIFeedCard> list);

            /* renamed from: b */
            void mo137962b();

            /* renamed from: b */
            void mo137963b(FeedPreview feedPreview, boolean z);

            /* renamed from: c */
            void mo137964c();

            /* renamed from: c */
            void mo137965c(FeedPreview feedPreview, boolean z);

            /* renamed from: d */
            void mo137966d();

            /* renamed from: e */
            void mo137967e();

            /* renamed from: f */
            void mo137968f();

            /* renamed from: g */
            void mo137969g();

            /* renamed from: h */
            void mo137970h();

            /* renamed from: i */
            void mo137971i();

            /* renamed from: j */
            void mo137972j();

            /* renamed from: k */
            boolean mo137973k();

            /* renamed from: l */
            void mo137974l();
        }

        /* renamed from: a */
        void mo136998a();

        /* renamed from: a */
        void mo136999a(int i);

        /* renamed from: a */
        void mo137003a(FeedCard.FeedType feedType);

        /* renamed from: a */
        void mo137004a(FeedCard.FeedType feedType, boolean z);

        /* renamed from: a */
        void mo137005a(FeedCard.FeedType feedType, boolean z, boolean z2);

        /* renamed from: a */
        void mo137006a(FeedPreview feedPreview);

        /* renamed from: a */
        void mo137009a(UpdateRecord updateRecord);

        /* renamed from: a */
        void mo137010a(StrongGuideInfo dVar);

        /* renamed from: a */
        void mo137011a(String str);

        /* renamed from: a */
        void mo137012a(String str, ChatFeedPreview chatFeedPreview, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo137013a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2);

        /* renamed from: a */
        void mo137014a(boolean z);

        /* renamed from: b */
        UIFeedCard mo137015b();

        /* renamed from: b */
        void mo137016b(int i);

        /* renamed from: b */
        void mo137017b(FeedCard.FeedType feedType);

        /* renamed from: b */
        void mo137018b(FeedPreview feedPreview);

        /* renamed from: b */
        void mo137019b(UpdateRecord updateRecord);

        /* renamed from: b */
        void mo137020b(boolean z);

        /* renamed from: c */
        void mo137022c(int i);

        /* renamed from: c */
        void mo137024c(UpdateRecord updateRecord);

        /* renamed from: d */
        void mo137027d(UpdateRecord updateRecord);

        /* renamed from: d */
        void mo137028d(boolean z);

        /* renamed from: g */
        void mo137031g();

        /* renamed from: h */
        void mo137032h();

        /* renamed from: i */
        void mo137033i();

        /* renamed from: j */
        void mo137034j();

        /* renamed from: k */
        void mo137035k();

        /* renamed from: l */
        void mo137036l();

        /* renamed from: m */
        void mo137037m();

        /* renamed from: n */
        void mo137038n();

        /* renamed from: o */
        void mo137039o();

        /* renamed from: p */
        void mo137040p();

        /* renamed from: q */
        ITitleInfo mo137041q();
    }
}
