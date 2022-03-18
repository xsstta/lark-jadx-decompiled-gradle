package com.ss.android.lark.featuregating.service.util;

import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/featuregating/service/util/FeedFgSyncUtil;", "", "()V", "enableFeedProtocolV4", "", "getEnableFeedProtocolV4", "()Z", "enableFeedProtocolV4$delegate", "Lkotlin/Lazy;", "enableMuteFeedFilter", "getEnableMuteFeedFilter", "enableMuteFeedFilter$delegate", "getFeatureGatingValue", "getMuteFilterFgValue", "reset", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.featuregating.service.util.a */
public final class FeedFgSyncUtil {

    /* renamed from: a */
    public static final FeedFgSyncUtil f95664a = new FeedFgSyncUtil();

    /* renamed from: b */
    private static final Lazy f95665b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C37260a.INSTANCE);

    /* renamed from: c */
    private static final Lazy f95666c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C37261b.INSTANCE);

    /* renamed from: d */
    private final boolean m146724d() {
        return ((Boolean) f95665b.getValue()).booleanValue();
    }

    /* renamed from: e */
    private final boolean m146725e() {
        return ((Boolean) f95666c.getValue()).booleanValue();
    }

    private FeedFgSyncUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m146721a() {
        return f95664a.m146724d();
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m146722b() {
        return f95664a.m146725e();
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m146723c() {
        Log.m165389i("FeedModule_FeedFgSyncUtil", "on account changed,  enableFeedProtocolV4 -> " + f95664a.m146724d());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.featuregating.service.util.a$a */
    static final class C37260a extends Lambda implements Function0<Boolean> {
        public static final C37260a INSTANCE = new C37260a();

        C37260a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean a = C37239a.m146648b().mo136951a("lark.feed.client_protocol_opt");
            Log.m165389i("FeedModule_FeedFgSyncUtil", "get feed protocol from fg module, value is -> " + a);
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.featuregating.service.util.a$b */
    static final class C37261b extends Lambda implements Function0<Boolean> {
        public static final C37261b INSTANCE = new C37261b();

        C37261b() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean a = C37239a.m146648b().mo136951a("lark.feed.add_mute_group_android");
            Log.m165389i("FeedModule_FeedFgSyncUtil", "get mute feed filter fg from fg module, value is -> " + a);
            return a;
        }
    }
}
