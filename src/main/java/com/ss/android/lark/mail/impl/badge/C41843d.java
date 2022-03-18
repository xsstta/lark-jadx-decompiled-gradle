package com.ss.android.lark.mail.impl.badge;

import com.ss.android.lark.mail.impl.badge.BadgeDecorator;

/* renamed from: com.ss.android.lark.mail.impl.badge.d */
public class C41843d implements BadgeDecorator.AbstractC41831b {

    /* renamed from: com.ss.android.lark.mail.impl.badge.d$a */
    private static class C41844a {

        /* renamed from: a */
        public static final BadgeDecorator.AbstractC41831b f106203a = new C41843d();
    }

    @Override // com.ss.android.lark.mail.impl.badge.BadgeDecorator.AbstractC41831b
    /* renamed from: c */
    public boolean mo150413c() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.badge.BadgeDecorator.AbstractC41831b
    /* renamed from: d */
    public int mo150414d() {
        return 0;
    }

    /* renamed from: e */
    public static BadgeDecorator.AbstractC41831b m166185e() {
        return C41844a.f106203a;
    }

    @Override // com.ss.android.lark.mail.impl.badge.BadgeDecorator.AbstractC41831b
    /* renamed from: a */
    public BadgeDecorator.ColorType mo150410a() {
        return BadgeDecorator.ColorType.COLOR_TYPE_ORANGE_INDEX;
    }

    @Override // com.ss.android.lark.mail.impl.badge.BadgeDecorator.AbstractC41831b
    /* renamed from: b */
    public BadgeDecorator.StrokeType mo150412b() {
        return BadgeDecorator.StrokeType.STROKE_TYPE_HAS_INDEX;
    }

    @Override // com.ss.android.lark.mail.impl.badge.BadgeDecorator.AbstractC41831b
    /* renamed from: a */
    public BadgeDecorator.CountType mo150411a(int i) {
        if (i == 0) {
            return BadgeDecorator.CountType.COUNT_TYPE_NO_COUNT_INDEX;
        }
        if (Math.abs(i) < 10) {
            return BadgeDecorator.CountType.COUNT_TYPE_SINGLE_COUNT_INDEX;
        }
        if (Math.abs(i) < 1000) {
            return BadgeDecorator.CountType.COUNT_TYPE_MULTI_COUNT_INDEX;
        }
        return BadgeDecorator.CountType.COUNT_TYPE_ETC_COUNT_INDEX;
    }
}
