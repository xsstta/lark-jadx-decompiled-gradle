package com.ss.android.lark.feed.service.p1884a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.a.a */
public interface AbstractC38117a {
    /* renamed from: a */
    void mo139432a(Channel channel);

    /* renamed from: a */
    void mo139433a(Channel channel, int i);

    /* renamed from: a */
    void mo139434a(FeedFilter feedFilter);

    /* renamed from: a */
    void mo139435a(String str);

    /* renamed from: a */
    void mo139436a(String str, FeedCard.Type type);

    /* renamed from: b */
    void mo139437b(IGetDataCallback<List<FeedPreviewInfo>> iGetDataCallback);

    /* renamed from: b */
    void mo139438b(String str);
}
