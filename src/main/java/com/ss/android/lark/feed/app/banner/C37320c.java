package com.ss.android.lark.feed.app.banner;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.banner.base.AbstractC37317b;
import com.ss.android.lark.feed.app.banner.base.AbstractC37318c;
import com.ss.android.lark.feed.app.banner.base.C37316a;
import com.ss.android.lark.feed.app.banner.base.IBanner;
import com.ss.android.lark.feed.app.banner.statistics.BannerHitPoint;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38123a;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.feed.app.banner.c */
public class C37320c implements IBanner<C37316a> {

    /* renamed from: a */
    private Context f95815a;

    /* renamed from: b */
    private AbstractC38037a.AbstractC38042b f95816b = C37262a.m146726a().mo139160G();

    /* renamed from: c */
    private AbstractC37318c<C37316a> f95817c;

    /* renamed from: d */
    private AbstractC37317b<C37316a> f95818d;

    /* renamed from: e */
    private C37731d f95819e = C37731d.m148488a();

    /* renamed from: f */
    private AbstractC38037a.AbstractC38052l f95820f = C37262a.m146726a().mo139198q();

    @Override // com.ss.android.lark.feed.app.banner.base.IBanner
    /* renamed from: a */
    public IBanner.BannerStyle mo137155a() {
        return IBanner.BannerStyle.NOTIFICATION_OPEN_TIP;
    }

    @Override // com.ss.android.lark.feed.app.banner.base.IBanner
    /* renamed from: c */
    public AbstractC37317b<C37316a> mo137157c() {
        if (this.f95818d == null) {
            this.f95818d = new AbstractC37317b<C37316a>() {
                /* class com.ss.android.lark.feed.app.banner.C37320c.C373211 */

                @Override // com.ss.android.lark.feed.app.banner.base.AbstractC37317b
                /* renamed from: a */
                public void mo137168a(IGetDataCallback<BannerPreview<C37316a>> iGetDataCallback) {
                    BannerPreview<C37316a> bannerPreview = new BannerPreview<>();
                    bannerPreview.setBannerStyle(C37320c.this.mo137155a());
                    iGetDataCallback.onSuccess(bannerPreview);
                }
            };
        }
        return this.f95818d;
    }

    @Override // com.ss.android.lark.feed.app.banner.base.IBanner
    /* renamed from: d */
    public AbstractC37318c<C37316a> mo137158d() {
        if (this.f95817c == null) {
            this.f95817c = new NotificationTipBannerView(this.f95815a);
        }
        return this.f95817c;
    }

    @Override // com.ss.android.lark.feed.app.banner.base.IBanner
    /* renamed from: b */
    public boolean mo137156b() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f95819e.mo138422m()) {
            return false;
        }
        boolean f = C38123a.m149931a().mo139463f();
        long e = C38123a.m149931a().mo139462e();
        C53241h.m205898b("NotificationTipBanner", "last invite Banner dismiss Time = " + e);
        long c = C38123a.m149931a().mo139460c();
        C53241h.m205898b("NotificationTipBanner", "last close notification Time = " + c);
        long a = this.f95816b.mo139221a() * 60000;
        C53241h.m205898b("NotificationTipBanner", "default show time interval = " + (a / 60000) + " minutes");
        if (System.currentTimeMillis() - e > a) {
            z = true;
        } else {
            z = false;
        }
        if (System.currentTimeMillis() - c > a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C38123a.m149931a().mo139458a(this.f95815a) && z && z2) {
            z3 = true;
        }
        C53241h.m205898b("NotificationTipBanner", "system notification setting open? " + C38123a.m149931a().mo139458a(this.f95815a) + "  is Time up for invite banner？ " + z + "  is time up for notification close?  " + z2);
        if (z3 && !f) {
            BannerHitPoint.f95814a.mo137161b();
        } else if (!z3 && f) {
            if (!z2) {
                BannerHitPoint.f95814a.mo137160a("click_close");
            } else if (C38123a.m149931a().mo139458a(this.f95815a)) {
                BannerHitPoint.f95814a.mo137160a("open_notification");
            }
        }
        C38123a.m149931a().mo139457a(z3);
        return z3;
    }

    public C37320c(Context context) {
        this.f95815a = context;
    }
}
