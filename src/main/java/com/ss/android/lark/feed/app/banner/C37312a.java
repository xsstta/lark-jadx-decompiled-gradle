package com.ss.android.lark.feed.app.banner;

import android.content.Context;
import com.ss.android.lark.feed.app.banner.base.IBanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.banner.a */
public class C37312a {

    /* renamed from: a */
    private Map<IBanner.BannerStyle, IBanner> f95810a;

    /* renamed from: com.ss.android.lark.feed.app.banner.a$a */
    private static class C37314a {

        /* renamed from: a */
        static C37312a f95812a = new C37312a();
    }

    /* renamed from: a */
    public static C37312a m146962a() {
        return C37314a.f95812a;
    }

    private C37312a() {
        this.f95810a = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public IBanner mo137151b() {
        ArrayList<IBanner> arrayList = new ArrayList(this.f95810a.values());
        Collections.sort(arrayList, new Comparator<IBanner>() {
            /* class com.ss.android.lark.feed.app.banner.C37312a.C373131 */

            /* renamed from: a */
            public int compare(IBanner iBanner, IBanner iBanner2) {
                return Integer.compare(iBanner.mo137155a().getPriority(), iBanner2.mo137155a().getPriority());
            }
        });
        for (IBanner iBanner : arrayList) {
            if (iBanner.mo137156b()) {
                return iBanner;
            }
        }
        return new C37315b();
    }

    /* renamed from: a */
    public IBanner mo137149a(IBanner.BannerStyle bannerStyle) {
        return this.f95810a.get(bannerStyle);
    }

    /* renamed from: a */
    public void mo137150a(Context context) {
        this.f95810a.put(IBanner.BannerStyle.NOTIFICATION_OPEN_TIP, new C37320c(context));
    }
}
