package com.ss.android.lark.feed.app.guide;

import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FeedTipGuideHelper {

    /* renamed from: a */
    public int f96428a;

    /* renamed from: b */
    private boolean f96429b;

    /* renamed from: c */
    private AbstractC38037a.AbstractC38062v f96430c;

    /* renamed from: d */
    private volatile boolean f96431d;

    /* renamed from: e */
    private volatile GuideType[] f96432e = {GuideType.AT_ALL, GuideType.AT_USER, GuideType.BADGE_STYLE};

    /* renamed from: f */
    private volatile Map<GuideType, Boolean> f96433f = new ConcurrentHashMap();

    /* renamed from: g */
    private volatile Map<GuideType, Boolean> f96434g = new ConcurrentHashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.guide.FeedTipGuideHelper$a */
    public static class C37604a {

        /* renamed from: a */
        static FeedTipGuideHelper f96435a = new FeedTipGuideHelper();
    }

    /* renamed from: b */
    public void mo137986b() {
        this.f96429b = false;
    }

    /* renamed from: c */
    public void mo137987c() {
        this.f96429b = true;
    }

    /* renamed from: d */
    public void mo137988d() {
        this.f96431d = true;
    }

    public enum GuideType {
        AT_USER(0),
        AT_ALL(1),
        BADGE_STYLE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static GuideType valueOf(int i) {
            return forNumber(i);
        }

        public static GuideType forNumber(int i) {
            if (i == 0) {
                return AT_USER;
            }
            if (i == 1) {
                return AT_ALL;
            }
            if (i != 2) {
                return null;
            }
            return BADGE_STYLE;
        }

        private GuideType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static FeedTipGuideHelper m147851a() {
        return C37604a.f96435a;
    }

    public FeedTipGuideHelper() {
        m147852e();
        this.f96430c = C37268c.m146766b().mo139203v();
    }

    /* renamed from: e */
    private void m147852e() {
        for (GuideType guideType : this.f96432e) {
            this.f96433f.put(guideType, false);
        }
        this.f96428a = 0;
        AbstractC38037a.AbstractC38053m b = C37268c.m146766b().mo139181b();
        this.f96434g.put(GuideType.AT_ALL, Boolean.valueOf(b.mo139260a("all_feed_mention_all")));
        this.f96434g.put(GuideType.AT_USER, Boolean.valueOf(b.mo139260a("all_feed_mention_you")));
        this.f96434g.put(GuideType.BADGE_STYLE, Boolean.valueOf(b.mo139260a("all_badge_change_setting")));
    }
}
