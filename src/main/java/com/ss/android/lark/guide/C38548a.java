package com.ss.android.lark.guide;

import android.app.Activity;
import android.net.Uri;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.guide.biz.AbstractC38592d;
import com.ss.android.lark.guide.biz.IBubbleFacade;
import com.ss.android.lark.guide.biz.IGuideFG;
import com.ss.android.lark.guide.biz.bubble.BubbleFacade;
import com.ss.android.lark.guide.biz.fg.GuideFG;
import com.ss.android.lark.guide.biz.onboarding.C38593a;
import com.ss.android.lark.guide.biz.onboarding.PageOpener;
import com.ss.android.lark.guide.biz.onboarding.p1924a.C38595a;
import com.ss.android.lark.guide.biz.onboarding.tour.page.UpdateTeamStack;
import com.ss.android.lark.guide.biz.p1923c.C38590b;
import com.ss.android.lark.guide.landing.AbstractC38627a;
import com.ss.android.lark.guide.landing.C38628b;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.p1912b.p1913a.C38557a;
import com.ss.android.lark.guide.p1912b.p1914b.C38560a;
import java.util.List;

/* renamed from: com.ss.android.lark.guide.a */
public class C38548a {

    /* renamed from: a */
    private static volatile AbstractC38549a f99072a;

    /* renamed from: a */
    public static AbstractC38549a m152027a() {
        return f99072a;
    }

    /* renamed from: d */
    public static List<AbstractC28490a> m152028d() {
        return C38595a.f99147a;
    }

    /* renamed from: c */
    public AbstractC38592d mo141240c() {
        return C38593a.m152193a();
    }

    /* renamed from: e */
    public IBubbleFacade mo141241e() {
        return BubbleFacade.m152093a();
    }

    /* renamed from: f */
    public AbstractC38627a mo141242f() {
        return C38628b.m152454a();
    }

    /* renamed from: g */
    public IGuideFG mo141243g() {
        return GuideFG.m152181d();
    }

    /* renamed from: b */
    public void mo141239b() {
        C38557a.m152072a().mo141281b();
        C38560a.m152076a().mo141285b();
    }

    public C38548a(AbstractC38549a aVar) {
        f99072a = aVar;
    }

    /* renamed from: a */
    public boolean mo141238a(Uri uri) {
        return C38590b.m152191a(uri);
    }

    /* renamed from: a */
    public void mo141237a(Activity activity, String str, String str2) {
        PageOpener.f99148a.mo141347a(activity, "in_app_upgrade", str, str2);
        UpdateTeamStack.f99189a.mo141389a().mo141386a("team_use", activity);
    }
}
