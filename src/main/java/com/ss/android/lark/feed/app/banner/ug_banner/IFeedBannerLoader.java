package com.ss.android.lark.feed.app.banner.ug_banner;

import android.content.Context;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0002\t\nJ\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader;", "", "loadBanner", "", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader$ILoadCompleteListener;", "unInit", "Companion", "ILoadCompleteListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.banner.c.d */
public interface IFeedBannerLoader {

    /* renamed from: c */
    public static final Companion f95887c = Companion.f95888a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader$ILoadCompleteListener;", "", "onUpdateBanner", "", "bannerPreview", "Lcom/ss/android/lark/feed/app/entity/UGBannerPreview;", "notify", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.d$b */
    public interface ILoadCompleteListener {
        /* renamed from: a */
        void mo137214a(UGBannerPreview uGBannerPreview, boolean z);
    }

    /* renamed from: a */
    void mo137171a();

    /* renamed from: a */
    void mo137173a(Context context, ILoadCompleteListener bVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/banner/ug_banner/IFeedBannerLoader$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.banner.c.d$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f95888a = new Companion();

        private Companion() {
        }
    }
}
