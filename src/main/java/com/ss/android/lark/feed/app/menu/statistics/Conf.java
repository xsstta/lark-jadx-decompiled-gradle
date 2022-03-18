package com.ss.android.lark.feed.app.menu.statistics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/menu/statistics/Conf;", "", "()V", "Companion", "Param", "Value", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.menu.a.a */
public final class Conf {

    /* renamed from: a */
    public static final Map<String, String> f96541a = MapsKt.hashMapOf(TuplesKt.to("INBOX", "inbox"), TuplesKt.to("DONE", "done"), TuplesKt.to("FILTER_ALL", "all"), TuplesKt.to("FILTER_MESSAGE", "message"), TuplesKt.to("FILTER_DOC", "docs"));

    /* renamed from: b */
    public static final Companion f96542b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/menu/statistics/Conf$Companion;", "", "()V", "EVENT_MAP", "", "", "toEventString", "originString", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.menu.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo138081a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originString");
            return Conf.f96541a.get(str);
        }
    }
}
