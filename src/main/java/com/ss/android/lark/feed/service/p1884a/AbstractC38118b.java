package com.ss.android.lark.feed.service.p1884a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.p1872c.C38073d;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.FeedCursor;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.a.b */
public interface AbstractC38118b extends AbstractC38117a {

    /* renamed from: com.ss.android.lark.feed.service.a.b$a */
    public static class C38119a {

        /* renamed from: a */
        public long f97740a;

        /* renamed from: b */
        public FeedCursor f97741b;

        /* renamed from: c */
        public boolean f97742c;

        /* renamed from: d */
        public List<C38126b> f97743d;

        /* renamed from: e */
        public long f97744e;

        /* renamed from: f */
        public List<FeedPreviewInfo> f97745f;

        /* renamed from: g */
        public FeedFilter f97746g;

        /* renamed from: h */
        public String f97747h;
    }

    /* renamed from: com.ss.android.lark.feed.service.a.b$b */
    public static class C38120b {

        /* renamed from: a */
        public List<FeedPreviewInfo> f97748a;

        /* renamed from: b */
        public long f97749b;

        /* renamed from: c */
        public FeedCursor f97750c;

        /* renamed from: d */
        public String f97751d;

        /* renamed from: e */
        public List<C38126b> f97752e;

        /* renamed from: f */
        public FeedFilter f97753f;

        /* renamed from: g */
        public String f97754g;
    }

    /* renamed from: a */
    SdkSender.C53233d<C38119a> mo139439a(long j, FeedCursor dVar, int i, long j2, FeedFilter feedFilter, C38073d dVar2);

    /* renamed from: a */
    SdkSender.C53233d<C38119a> mo139440a(PullType pullType, long j, long j2, int i, String str, FeedFilter feedFilter, C38073d dVar);

    /* renamed from: a */
    void mo139441a(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo139442a(String str, FeedFilter feedFilter, int i, IGetDataCallback<C38120b> iGetDataCallback, C38073d dVar);

    /* renamed from: a */
    void mo139443a(String str, FeedCursor dVar, FeedFilter feedFilter, int i, IGetDataCallback<C38120b> iGetDataCallback, C38073d dVar2);

    /* renamed from: a */
    void mo139444a(List<FeedCard> list, FeedCard.FeedType feedType, UIGetDataCallback<List<FeedCard>> uIGetDataCallback);

    /* renamed from: a */
    void mo139445a(boolean z, String str, IGetDataCallback<FeedPreviewInfo> iGetDataCallback);

    /* renamed from: b */
    void mo139446b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    void mo139447c(IGetDataCallback<StrongGuideInfo> iGetDataCallback);
}
