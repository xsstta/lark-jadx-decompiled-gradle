package com.ss.android.lark.feed.app.banner.ug_banner;

import android.content.Context;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/FeedBannerLoaderProxy;", "Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader;", "()V", "base", "loadBanner", "", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader$ILoadCompleteListener;", "unInit", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.c.c */
public final class FeedBannerLoaderProxy implements IFeedBannerLoader {

    /* renamed from: a */
    private final IFeedBannerLoader f95884a;

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public void mo137171a() {
        this.f95884a.mo137171a();
    }

    public FeedBannerLoaderProxy() {
        C37322a aVar;
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        boolean a2 = a.mo139198q().mo139256a("lark.ug.reach.feed.banner");
        Log.m165389i("IFeedBannerLoader", "fgEnable=" + a2);
        if (a2) {
            aVar = new FeedBannerLoader2();
        } else {
            aVar = new C37322a();
        }
        this.f95884a = aVar;
    }

    @Override // com.ss.android.lark.feed.app.banner.ug_banner.IFeedBannerLoader
    /* renamed from: a */
    public void mo137173a(Context context, IFeedBannerLoader.ILoadCompleteListener bVar) {
        this.f95884a.mo137173a(context, bVar);
    }
}
