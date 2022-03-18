package com.ss.android.lark.feed.app.view.title;

import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.app.view.title.FeedListTitle;
import com.ss.android.lark.maincore.ITitleInfo;

/* renamed from: com.ss.android.lark.feed.app.view.title.b */
public interface AbstractC38026b {
    /* renamed from: a */
    int mo139094a(FeedCard.FeedType feedType);

    /* renamed from: a */
    void mo139096a(int i);

    /* renamed from: a */
    void mo139097a(View view);

    /* renamed from: a */
    void mo139098a(FeedListTitle.C38020b bVar);

    /* renamed from: a */
    void mo139099a(boolean z);

    /* renamed from: c */
    void mo139102c(int i);

    /* renamed from: c */
    boolean mo139103c();

    /* renamed from: d */
    void mo139104d();

    /* renamed from: e */
    void mo139105e();

    /* renamed from: f */
    void mo139106f();

    float getAlpha();

    int getCurrentHeight();

    int getOriginSearchLayoutHeight();

    int getTitleHeight();

    ITitleInfo getTitleInfo();

    Bitmap getTitleLayoutBitmap();

    /* renamed from: j */
    void mo139116j();

    /* renamed from: k */
    void mo139117k();

    void setOnTitleClickListener(FeedListTitle.AbstractC38019a aVar);
}
