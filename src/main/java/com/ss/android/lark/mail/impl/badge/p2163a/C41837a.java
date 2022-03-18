package com.ss.android.lark.mail.impl.badge.p2163a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadge;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.badge.BadgeDecorator;
import com.ss.android.lark.mail.impl.badge.C41841c;
import com.ss.android.lark.mail.impl.badge.C41843d;
import com.ss.android.lark.mail.impl.badge.C41845e;
import com.ss.android.lark.mail.impl.badge.C41847f;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;

/* renamed from: com.ss.android.lark.mail.impl.badge.a.a */
public class C41837a extends C59204a<UDBadgeView, Integer> {

    /* renamed from: a */
    private BadgeCountState f106199a = BadgeCountState.RED;

    /* renamed from: d */
    private int m166167d() {
        int i = C418381.f106200a[this.f106199a.ordinal()];
        if (i == 1 || i == 3) {
            return R.color.icon_disable;
        }
        return R.color.function_danger_500;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.badge.a.a$1 */
    public static /* synthetic */ class C418381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.BadgeCountState[] r0 = com.ss.android.lark.mail.impl.entity.BadgeCountState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.badge.p2163a.C41837a.C418381.f106200a = r0
                com.ss.android.lark.mail.impl.entity.BadgeCountState r1 = com.ss.android.lark.mail.impl.entity.BadgeCountState.WARNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.badge.p2163a.C41837a.C418381.f106200a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.BadgeCountState r1 = com.ss.android.lark.mail.impl.entity.BadgeCountState.RED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.badge.p2163a.C41837a.C418381.f106200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.entity.BadgeCountState r1 = com.ss.android.lark.mail.impl.entity.BadgeCountState.GRAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.badge.p2163a.C41837a.C418381.f106200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.entity.BadgeCountState r1 = com.ss.android.lark.mail.impl.entity.BadgeCountState.RED_DOT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.badge.p2163a.C41837a.C418381.<clinit>():void");
        }
    }

    /* renamed from: e */
    private boolean m166168e() {
        Log.m165389i("MailNavigationTabItemView", "isRemind badgeCountState:" + this.f106199a);
        int i = C418381.f106200a[this.f106199a.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private BadgeDecorator.AbstractC41831b m166166a() {
        int i = C418381.f106200a[this.f106199a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C41843d.m166185e();
            }
            if (i == 3) {
                return C41845e.m166191e();
            }
            if (i != 4) {
                return C41843d.m166185e();
            }
            return C41841c.m166179e();
        } else if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.alerttabicon")) {
            return C41847f.m166197e();
        } else {
            return C41845e.m166191e();
        }
    }

    /* renamed from: a */
    public void mo150423a(BadgeCountState badgeCountState) {
        this.f106199a = badgeCountState;
    }

    public C41837a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private int m166165a(int i) {
        if (C418381.f106200a[this.f106199a.ordinal()] != 1) {
            return i;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.tab.C59204a
    /* renamed from: a */
    public void mo31305a(Context context) {
        super.mo31305a(context);
        this.f147019e = new UDBadgeView.Builder().mo90261a(2131887091).mo90262a(context);
    }

    /* renamed from: a */
    public void mo31307a(Integer num) {
        float f;
        mo201283b(m166168e());
        super.mo31307a((Object) num);
        Log.m165389i("BadgeRedDotView", "show count:" + num);
        BadgeDecorator.C41830a a = BadgeDecorator.m166140a(m166165a(num.intValue()), true, m166166a());
        UDBadgeView uDBadgeView = (UDBadgeView) mo201282b();
        uDBadgeView.setVisibility(a.mo150405c());
        uDBadgeView.setOuterBorderWidth(BitmapDescriptorFactory.HUE_RED);
        uDBadgeView.setInnerBorderWidth(BitmapDescriptorFactory.HUE_RED);
        String b = a.mo150403b();
        if (TextUtils.equals(b, "...")) {
            b = String.valueOf(Integer.MAX_VALUE);
        }
        uDBadgeView.setText(b);
        uDBadgeView.setTextColor(a.mo150399a());
        uDBadgeView.setBadgeColorRes(m166167d());
        if (a.mo150407d() != 0) {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.ICON);
            uDBadgeView.setIcon(a.mo150407d());
        } else if (this.f106199a == BadgeCountState.RED_DOT) {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.DOT);
        } else {
            uDBadgeView.setBadgeType(UDBadge.BadgeType.TEXT);
        }
        if (this.f106199a == BadgeCountState.RED_DOT) {
            f = 10.0f;
        } else {
            f = 16.0f;
        }
        uDBadgeView.setBadgeSize((float) UIHelper.dp2px(f));
        uDBadgeView.mo90238b();
    }
}
