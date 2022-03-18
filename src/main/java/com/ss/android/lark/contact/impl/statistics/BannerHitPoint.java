package com.ss.android.lark.contact.impl.statistics;

import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/statistics/BannerHitPoint;", "", "()V", "Companion", "NodePath", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.g.a */
public final class BannerHitPoint {

    /* renamed from: a */
    public static final Companion f92899a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/statistics/BannerHitPoint$Companion;", "", "()V", "sendAddressGuideBannerClick", "", "sendAddressGuideBannerShow", "sendBannerCloseEvent", "sendBannerShowEvent", "sendOpenTeamUsePageEvent", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo132198a() {
            Statistics.sendEvent("address_guide_banner_show");
        }

        /* renamed from: b */
        public final void mo132199b() {
            Statistics.sendEvent("address_guide_banner_click");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
