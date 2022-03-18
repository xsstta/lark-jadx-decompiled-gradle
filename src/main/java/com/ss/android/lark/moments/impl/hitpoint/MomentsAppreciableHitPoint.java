package com.ss.android.lark.moments.impl.hitpoint;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0001\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\tH\u0002J(\u00109\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020=J\u0018\u0010>\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010?\u001a\u000207J\u0006\u0010@\u001a\u000207J\u0006\u0010A\u001a\u000207J\u0006\u0010B\u001a\u000207J\u0006\u0010C\u001a\u000207J\u0006\u0010D\u001a\u000207J\u0006\u0010E\u001a\u000207J\u000e\u0010F\u001a\u0002072\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010G\u001a\u0002072\u0006\u0010H\u001a\u00020=J\u001e\u0010I\u001a\u0002072\u0006\u00108\u001a\u00020\t2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040KH\u0002J\u0006\u0010L\u001a\u000207J\u0006\u0010M\u001a\u000207J\u0018\u0010N\u001a\u00020\u00172\u0006\u00108\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u0006\u0010P\u001a\u000207J\u0006\u0010Q\u001a\u000207J\u0006\u0010R\u001a\u000207J\u0006\u0010S\u001a\u000207J\u000e\u0010T\u001a\u0002072\u0006\u0010H\u001a\u00020=J\u0006\u0010U\u001a\u000207J\u0006\u0010V\u001a\u000207J\u0006\u0010W\u001a\u000207J\u0006\u0010X\u001a\u000207J\u000e\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0017J\u000e\u0010[\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0017J\u000e\u0010\\\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0017J\u000e\u0010]\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0017J\u000e\u0010^\u001a\u0002072\u0006\u0010Z\u001a\u00020\u0017J\u0006\u0010_\u001a\u000207J\u0006\u0010`\u001a\u000207J\u0006\u0010a\u001a\u000207J\u0006\u0010b\u001a\u000207J\u0006\u0010c\u001a\u000207J\u0006\u0010d\u001a\u000207J\u0006\u0010e\u001a\u000207J\u0006\u0010f\u001a\u000207J\u0006\u0010g\u001a\u000207J\u0006\u0010h\u001a\u000207J\u0006\u0010i\u001a\u000207J\u0006\u0010j\u001a\u000207J \u0010k\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u0001H\u0002J \u0010m\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u0001H\u0002J\u0018\u0010n\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u0018\u0010o\u001a\u0002072\u0006\u00108\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u000e\u0010p\u001a\u0002072\u0006\u0010H\u001a\u00020=J\u0006\u0010q\u001a\u000207J\u0006\u0010r\u001a\u000207J\u0006\u0010s\u001a\u000207J\u0006\u0010t\u001a\u000207J\u0006\u0010u\u001a\u000207J\u0006\u0010v\u001a\u000207J\u0006\u0010w\u001a\u000207J\u0006\u0010x\u001a\u000207J\u0006\u0010y\u001a\u000207J\u0006\u0010z\u001a\u000207J\u0006\u0010{\u001a\u000207J\u0006\u0010|\u001a\u000207J\u0006\u0010}\u001a\u000207J\u0006\u0010~\u001a\u000207R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001e\u0010\u000bR\u001b\u0010 \u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b!\u0010\u000bR*\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020%0$j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020%`&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b*\u0010\u000bR\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b2\u0010\u000bR\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint;", "", "()V", "PAGE_DETAIL", "", "PAGE_HOME", "PAGE_NOTIFICATION", "PAGE_PROFILE", "enterMomentsKey", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "getEnterMomentsKey", "()Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "enterMomentsKey$delegate", "Lkotlin/Lazy;", "feed_sdk_cost", "feeds_count", "feeds_render", "init_view_cost", "loadMorePostKey", "getLoadMorePostKey", "loadMorePostKey$delegate", "local_data_render", "needNet", "", "getNeedNet", "()Z", "setNeedNet", "(Z)V", "notification_type", "openNotificationKey", "getOpenNotificationKey", "openNotificationKey$delegate", "openProfileKey", "getOpenProfileKey", "openProfileKey$delegate", "pointMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableValue;", "Lkotlin/collections/HashMap;", "profile_render", "profile_sdk_cost", "refreshPostKey", "getRefreshPostKey", "refreshPostKey$delegate", "remote_data_render", "render", "sdk_cost", "sdk_local_cost", "sdk_remote_cost", "showPostDetailKey", "getShowPostDetailKey", "showPostDetailKey$delegate", "suffix_message", "suffix_reaction", "appreciableEnd", "", "point", "appreciableError", "errorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorCode", "", "appreciableStart", "detailLocalRenderEnd", "detailLocalRenderStart", "detailRemoteRenderEnd", "detailRemoteRenderStart", "detailSdkCostEnd", "detailSdkCostStart", "enterMomentsEnd", "enterMomentsStart", "feedsCount", "count", "fillInEmptyLatency", "keys", "", "initViewCostEnd", "initViewCostStart", "latencyAvailable", "key", "loadMorePostEnd", "loadMorePostStart", "localDataRenderEnd", "localDataRenderStart", "moreRefreshFeedsCount", "moreRenderEnd", "moreRenderStart", "moreSdkCostEnd", "moreSdkCostStart", "notificationRenderEnd", "isMessage", "notificationRenderStart", "notificationSdkCostEnd", "notificationSdkCostStart", "notificationType", "openNotificationEnd", "openNotificationStart", "openProfileEnd", "openProfileStart", "profileFeedRenderEnd", "profileFeedRenderStart", "profileFeedSdkCostEnd", "profileFeedSdkCostStart", "profileRenderEnd", "profileRenderStart", "profileSdkCostEnd", "profileSdkCostStart", "putExtraCategory", "value", "putExtraMetric", "putLatencyDetailEnd", "putLatencyDetailStart", "refreshFeedsCount", "refreshPostEnd", "refreshPostStart", "remoteDataRenderEnd", "remoteDataRenderStart", "renderEnd", "renderStart", "sdkCostEnd", "sdkCostStart", "sdkLocalCostEnd", "sdkLocalCostStart", "sdkRemoteCostEnd", "sdkRemoteCostStart", "showPostDetailEnd", "showPostDetailStart", "AppreciableKey", "AppreciableValue", "TimePair", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.e.a */
public final class MomentsAppreciableHitPoint {

    /* renamed from: a */
    public static final MomentsAppreciableHitPoint f119684a = new MomentsAppreciableHitPoint();

    /* renamed from: b */
    private static final HashMap<AppreciableKey, AppreciableValue> f119685b = new HashMap<>();

    /* renamed from: c */
    private static final Lazy f119686c = LazyKt.lazy(C47446d.INSTANCE);

    /* renamed from: d */
    private static final Lazy f119687d = LazyKt.lazy(C47450h.INSTANCE);

    /* renamed from: e */
    private static final Lazy f119688e = LazyKt.lazy(C47447e.INSTANCE);

    /* renamed from: f */
    private static final Lazy f119689f = LazyKt.lazy(C47451i.INSTANCE);

    /* renamed from: g */
    private static final Lazy f119690g = LazyKt.lazy(C47449g.INSTANCE);

    /* renamed from: h */
    private static final Lazy f119691h = LazyKt.lazy(C47448f.INSTANCE);

    /* renamed from: i */
    private static volatile boolean f119692i = true;

    /* renamed from: a */
    public final AppreciableKey mo166739a() {
        return (AppreciableKey) f119686c.getValue();
    }

    /* renamed from: b */
    public final AppreciableKey mo166743b() {
        return (AppreciableKey) f119687d.getValue();
    }

    /* renamed from: c */
    public final AppreciableKey mo166746c() {
        return (AppreciableKey) f119688e.getValue();
    }

    /* renamed from: d */
    public final AppreciableKey mo166749d() {
        return (AppreciableKey) f119689f.getValue();
    }

    /* renamed from: e */
    public final AppreciableKey mo166751e() {
        return (AppreciableKey) f119690g.getValue();
    }

    /* renamed from: f */
    public final AppreciableKey mo166753f() {
        return (AppreciableKey) f119691h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "page", "", "(Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/Event;Ljava/lang/String;)V", "getEvent", "()Lcom/ss/android/lark/appreciablelib/Event;", "getPage", "()Ljava/lang/String;", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "equals", "", "other", "hashCode", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$a */
    public static final class AppreciableKey {

        /* renamed from: a */
        private final Scene f119693a;

        /* renamed from: b */
        private final Event f119694b;

        /* renamed from: c */
        private final String f119695c;

        /* renamed from: a */
        public final Scene mo166775a() {
            return this.f119693a;
        }

        /* renamed from: b */
        public final Event mo166776b() {
            return this.f119694b;
        }

        /* renamed from: c */
        public final String mo166777c() {
            return this.f119695c;
        }

        public int hashCode() {
            return Objects.hash(this.f119693a, this.f119694b, this.f119695c);
        }

        public boolean equals(Object obj) {
            if (obj instanceof AppreciableKey) {
                AppreciableKey aVar = (AppreciableKey) obj;
                if (this.f119693a == aVar.f119693a && this.f119694b == aVar.f119694b && Intrinsics.areEqual(this.f119695c, aVar.f119695c)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public AppreciableKey(Scene scene, Event event, String str) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Intrinsics.checkParameterIsNotNull(event, "event");
            Intrinsics.checkParameterIsNotNull(str, "page");
            this.f119693a = scene;
            this.f119694b = event;
            this.f119695c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableValue;", "", "key", "", "(Ljava/lang/String;)V", "extraCategory", "Ljava/util/concurrent/ConcurrentHashMap;", "getExtraCategory", "()Ljava/util/concurrent/ConcurrentHashMap;", "extraMetric", "getExtraMetric", "getKey", "()Ljava/lang/String;", "latencyDetail", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$TimePair;", "getLatencyDetail", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$b */
    public static final class AppreciableValue {

        /* renamed from: a */
        private final ConcurrentHashMap<String, TimePair> f119696a = new ConcurrentHashMap<>();

        /* renamed from: b */
        private final ConcurrentHashMap<String, Object> f119697b = new ConcurrentHashMap<>();

        /* renamed from: c */
        private final ConcurrentHashMap<String, Object> f119698c = new ConcurrentHashMap<>();

        /* renamed from: d */
        private final String f119699d;

        /* renamed from: a */
        public final ConcurrentHashMap<String, TimePair> mo166780a() {
            return this.f119696a;
        }

        /* renamed from: b */
        public final ConcurrentHashMap<String, Object> mo166781b() {
            return this.f119697b;
        }

        /* renamed from: c */
        public final ConcurrentHashMap<String, Object> mo166782c() {
            return this.f119698c;
        }

        /* renamed from: d */
        public final String mo166783d() {
            return this.f119699d;
        }

        public AppreciableValue(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            this.f119699d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$TimePair;", "", "()V", "end", "", "getEnd", "()J", "setEnd", "(J)V", "start", "getStart", "setStart", "isAvailable", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$c */
    public static final class TimePair {

        /* renamed from: a */
        private long f119700a = -1;

        /* renamed from: b */
        private long f119701b = -1;

        /* renamed from: a */
        public final long mo166784a() {
            return this.f119700a;
        }

        /* renamed from: b */
        public final long mo166786b() {
            return this.f119701b;
        }

        /* renamed from: c */
        public final boolean mo166788c() {
            long j = this.f119700a;
            if (j != -1) {
                long j2 = this.f119701b;
                if (j2 == -1 || j2 < j) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo166785a(long j) {
            this.f119700a = j;
        }

        /* renamed from: b */
        public final void mo166787b(long j) {
            this.f119701b = j;
        }
    }

    private MomentsAppreciableHitPoint() {
    }

    /* renamed from: a */
    public final void mo166742a(boolean z) {
        f119692i = z;
        m187966a(mo166739a(), z);
    }

    /* renamed from: a */
    public final void mo166741a(AppreciableKey aVar, boolean z, ErrorType errorType, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "point");
        Intrinsics.checkParameterIsNotNull(errorType, "errorType");
        ErrorType errorType2 = i == 10008 ? ErrorType.Network : errorType;
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Moments, aVar.mo166775a(), aVar.mo166776b(), errorType2, errorType2 == ErrorType.Network ? ErrorLevel.Exception : ErrorLevel.Fatal, i, null, aVar.mo166777c(), null, Boolean.valueOf(z), null, null, null, 7488, null));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$d */
    static final class C47446d extends Lambda implements Function0<AppreciableKey> {
        public static final C47446d INSTANCE = new C47446d();

        C47446d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoHome, Event.show_feeds, "home");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$e */
    static final class C47447e extends Lambda implements Function0<AppreciableKey> {
        public static final C47447e INSTANCE = new C47447e();

        C47447e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoHome, Event.load_more_feeds, "home");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$f */
    static final class C47448f extends Lambda implements Function0<AppreciableKey> {
        public static final C47448f INSTANCE = new C47448f();

        C47448f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoNotification, Event.show_notification, "notification");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$g */
    static final class C47449g extends Lambda implements Function0<AppreciableKey> {
        public static final C47449g INSTANCE = new C47449g();

        C47449g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoPost, Event.show_profile, "profile");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$h */
    static final class C47450h extends Lambda implements Function0<AppreciableKey> {
        public static final C47450h INSTANCE = new C47450h();

        C47450h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoHome, Event.refresh_feeds, "home");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/impl/hitpoint/MomentsAppreciableHitPoint$AppreciableKey;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.e.a$i */
    static final class C47451i extends Lambda implements Function0<AppreciableKey> {
        public static final C47451i INSTANCE = new C47451i();

        C47451i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppreciableKey invoke() {
            return new AppreciableKey(Scene.MoPost, Event.show_detail, "detail");
        }
    }

    /* renamed from: A */
    public final void mo166716A() {
        m187963a(mo166746c(), "render");
    }

    /* renamed from: B */
    public final void mo166717B() {
        m187968b(mo166746c(), "render");
    }

    /* renamed from: D */
    public final void mo166719D() {
        m187966a(mo166749d(), true);
    }

    /* renamed from: E */
    public final void mo166720E() {
        m187963a(mo166749d(), "sdk_cost");
    }

    /* renamed from: F */
    public final void mo166721F() {
        m187968b(mo166749d(), "sdk_cost");
    }

    /* renamed from: G */
    public final void mo166722G() {
        m187963a(mo166749d(), "local_data_render");
    }

    /* renamed from: H */
    public final void mo166723H() {
        m187968b(mo166749d(), "local_data_render");
    }

    /* renamed from: I */
    public final void mo166724I() {
        m187963a(mo166749d(), "remote_data_render");
    }

    /* renamed from: J */
    public final void mo166725J() {
        m187968b(mo166749d(), "remote_data_render");
    }

    /* renamed from: L */
    public final void mo166727L() {
        m187966a(mo166751e(), true);
    }

    /* renamed from: M */
    public final void mo166728M() {
        m187963a(mo166751e(), "profile_sdk_cost");
    }

    /* renamed from: N */
    public final void mo166729N() {
        m187968b(mo166751e(), "profile_sdk_cost");
    }

    /* renamed from: O */
    public final void mo166730O() {
        m187963a(mo166751e(), "feed_sdk_cost");
    }

    /* renamed from: P */
    public final void mo166731P() {
        m187968b(mo166751e(), "feed_sdk_cost");
    }

    /* renamed from: Q */
    public final void mo166732Q() {
        m187963a(mo166751e(), "profile_render");
    }

    /* renamed from: R */
    public final void mo166733R() {
        m187968b(mo166751e(), "profile_render");
    }

    /* renamed from: S */
    public final void mo166734S() {
        m187963a(mo166751e(), "feeds_render");
    }

    /* renamed from: T */
    public final void mo166735T() {
        m187968b(mo166751e(), "feeds_render");
    }

    /* renamed from: V */
    public final void mo166737V() {
        m187966a(mo166753f(), true);
    }

    /* renamed from: g */
    public final void mo166755g() {
        m187963a(mo166739a(), "sdk_local_cost");
    }

    /* renamed from: h */
    public final void mo166756h() {
        m187968b(mo166739a(), "sdk_local_cost");
    }

    /* renamed from: i */
    public final void mo166757i() {
        m187963a(mo166739a(), "sdk_remote_cost");
    }

    /* renamed from: j */
    public final void mo166758j() {
        m187968b(mo166739a(), "sdk_remote_cost");
    }

    /* renamed from: k */
    public final void mo166759k() {
        m187963a(mo166739a(), "init_view_cost");
    }

    /* renamed from: l */
    public final void mo166760l() {
        m187968b(mo166739a(), "init_view_cost");
    }

    /* renamed from: m */
    public final void mo166761m() {
        m187963a(mo166739a(), "local_data_render");
    }

    /* renamed from: n */
    public final void mo166762n() {
        m187968b(mo166739a(), "local_data_render");
    }

    /* renamed from: o */
    public final void mo166763o() {
        m187963a(mo166739a(), "remote_data_render");
    }

    /* renamed from: p */
    public final void mo166764p() {
        m187968b(mo166739a(), "remote_data_render");
    }

    /* renamed from: r */
    public final void mo166766r() {
        m187966a(mo166743b(), true);
    }

    /* renamed from: s */
    public final void mo166767s() {
        m187963a(mo166743b(), "sdk_cost");
    }

    /* renamed from: t */
    public final void mo166768t() {
        m187968b(mo166743b(), "sdk_cost");
    }

    /* renamed from: u */
    public final void mo166769u() {
        m187963a(mo166743b(), "render");
    }

    /* renamed from: v */
    public final void mo166770v() {
        m187968b(mo166743b(), "render");
    }

    /* renamed from: x */
    public final void mo166772x() {
        m187966a(mo166746c(), true);
    }

    /* renamed from: y */
    public final void mo166773y() {
        m187963a(mo166746c(), "sdk_cost");
    }

    /* renamed from: z */
    public final void mo166774z() {
        m187968b(mo166746c(), "sdk_cost");
    }

    /* renamed from: C */
    public final void mo166718C() {
        if (m187970c(mo166746c(), "render")) {
            m187965a(mo166746c(), CollectionsKt.arrayListOf("sdk_cost", "render"));
            m187962a(mo166746c());
        }
    }

    /* renamed from: K */
    public final void mo166726K() {
        if (m187970c(mo166749d(), "local_data_render") && m187970c(mo166749d(), "remote_data_render")) {
            m187965a(mo166749d(), CollectionsKt.arrayListOf("sdk_cost", "local_data_render", "remote_data_render"));
            m187962a(mo166749d());
        }
    }

    /* renamed from: U */
    public final void mo166736U() {
        if (m187970c(mo166751e(), "profile_render") && m187970c(mo166751e(), "feeds_render")) {
            m187965a(mo166751e(), CollectionsKt.arrayListOf("profile_sdk_cost", "feed_sdk_cost", "profile_render", "feeds_render"));
            m187962a(mo166751e());
        }
    }

    /* renamed from: q */
    public final void mo166765q() {
        if (!f119692i || (m187970c(mo166739a(), "local_data_render") && m187970c(mo166739a(), "remote_data_render"))) {
            m187965a(mo166739a(), CollectionsKt.arrayListOf("sdk_local_cost", "sdk_remote_cost", "init_view_cost", "local_data_render", "remote_data_render"));
            m187962a(mo166739a());
        }
    }

    /* renamed from: w */
    public final void mo166771w() {
        if (m187970c(mo166743b(), "render")) {
            m187965a(mo166743b(), CollectionsKt.arrayListOf("sdk_cost", "render"));
            m187962a(mo166743b());
        }
    }

    /* renamed from: W */
    public final void mo166738W() {
        ConcurrentHashMap<String, TimePair> a;
        Object obj;
        ConcurrentHashMap<String, Object> c;
        HashMap<AppreciableKey, AppreciableValue> hashMap = f119685b;
        AppreciableValue bVar = hashMap.get(mo166753f());
        if (bVar != null && (a = bVar.mo166780a()) != null) {
            AppreciableValue bVar2 = hashMap.get(mo166753f());
            if (bVar2 == null || (c = bVar2.mo166782c()) == null) {
                obj = null;
            } else {
                obj = c.get("notification_type");
            }
            if (Intrinsics.areEqual(obj, "message")) {
                ConcurrentHashMap<String, TimePair> concurrentHashMap = a;
                TimePair cVar = a.get("sdk_costmessage");
                if (cVar != null) {
                    concurrentHashMap.put("sdk_cost", cVar);
                    TimePair cVar2 = a.get("rendermessage");
                    if (cVar2 != null) {
                        concurrentHashMap.put("render", cVar2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                ConcurrentHashMap<String, TimePair> concurrentHashMap2 = a;
                TimePair cVar3 = a.get("sdk_costreaction");
                if (cVar3 != null) {
                    concurrentHashMap2.put("sdk_cost", cVar3);
                    TimePair cVar4 = a.get("renderreaction");
                    if (cVar4 != null) {
                        concurrentHashMap2.put("render", cVar4);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            a.remove("sdk_costmessage");
            a.remove("sdk_costreaction");
            a.remove("rendermessage");
            a.remove("renderreaction");
            m187965a(mo166753f(), CollectionsKt.arrayListOf("sdk_cost", "render"));
            m187962a(mo166753f());
        }
    }

    /* renamed from: c */
    public final void mo166747c(int i) {
        m187964a(mo166746c(), "feeds_count", Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo166750d(boolean z) {
        String str;
        AppreciableKey f = mo166753f();
        StringBuilder sb = new StringBuilder();
        sb.append("render");
        if (z) {
            str = "message";
        } else {
            str = "reaction";
        }
        sb.append(str);
        m187963a(f, sb.toString());
    }

    /* renamed from: e */
    public final void mo166752e(boolean z) {
        String str;
        AppreciableKey f = mo166753f();
        StringBuilder sb = new StringBuilder();
        sb.append("render");
        if (z) {
            str = "message";
        } else {
            str = "reaction";
        }
        sb.append(str);
        m187968b(f, sb.toString());
    }

    /* renamed from: f */
    public final void mo166754f(boolean z) {
        String str;
        if (z) {
            str = "message";
        } else {
            str = "reaction";
        }
        m187969b(mo166753f(), "notification_type", str);
    }

    /* renamed from: b */
    public final void mo166744b(int i) {
        m187964a(mo166743b(), "feeds_count", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo166748c(boolean z) {
        String str;
        AppreciableKey f = mo166753f();
        StringBuilder sb = new StringBuilder();
        sb.append("sdk_cost");
        if (z) {
            str = "message";
        } else {
            str = "reaction";
        }
        sb.append(str);
        m187968b(f, sb.toString());
    }

    /* renamed from: a */
    private final void m187962a(AppreciableKey aVar) {
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, TimePair> entry : bVar.mo166780a().entrySet()) {
                hashMap.put(entry.getKey(), Long.valueOf(Math.max(entry.getValue().mo166786b() - entry.getValue().mo166784a(), 0L)));
            }
            AppreciableKit.m107390a(AppreciableKit.f73094h.mo103524a(), bVar.mo166783d(), aVar.mo166777c(), hashMap, (Map) null, bVar.mo166781b(), bVar.mo166782c(), 8, (Object) null);
            f119685b.remove(aVar);
        }
    }

    /* renamed from: b */
    public final void mo166745b(boolean z) {
        String str;
        AppreciableKey f = mo166753f();
        StringBuilder sb = new StringBuilder();
        sb.append("sdk_cost");
        if (z) {
            str = "message";
        } else {
            str = "reaction";
        }
        sb.append(str);
        m187963a(f, sb.toString());
    }

    /* renamed from: a */
    public final void mo166740a(int i) {
        m187964a(mo166739a(), "feeds_count", Integer.valueOf(i));
    }

    /* renamed from: a */
    private final void m187963a(AppreciableKey aVar, String str) {
        ConcurrentHashMap<String, TimePair> a;
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar != null && (a = bVar.mo166780a()) != null && a.get(str) == null) {
            TimePair cVar = new TimePair();
            cVar.mo166785a(System.currentTimeMillis());
            a.put(str, cVar);
        }
    }

    /* renamed from: b */
    private final void m187968b(AppreciableKey aVar, String str) {
        ConcurrentHashMap<String, TimePair> a;
        TimePair cVar;
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar != null && (a = bVar.mo166780a()) != null && (cVar = a.get(str)) != null) {
            Intrinsics.checkExpressionValueIsNotNull(cVar, "pointMap[point]?.latencyDetail?.get(key) ?: return");
            if (!cVar.mo166788c()) {
                cVar.mo166787b(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: c */
    private final boolean m187970c(AppreciableKey aVar, String str) {
        ConcurrentHashMap<String, TimePair> a;
        TimePair cVar;
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar == null || (a = bVar.mo166780a()) == null || (cVar = a.get(str)) == null || !cVar.mo166788c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m187965a(AppreciableKey aVar, List<String> list) {
        ConcurrentHashMap<String, TimePair> a;
        AppreciableValue bVar = f119685b.get(aVar);
        if (!(bVar == null || (a = bVar.mo166780a()) == null)) {
            for (T t : list) {
                if (!a.containsKey(t)) {
                    a.put(t, new TimePair());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m187966a(AppreciableKey aVar, boolean z) {
        String a = AppreciableKit.f73094h.mo103524a().mo103508a(Biz.Moments, aVar.mo166775a(), aVar.mo166776b(), aVar.mo166777c(), z);
        HashMap<AppreciableKey, AppreciableValue> hashMap = f119685b;
        if (hashMap.get(aVar) != null) {
            hashMap.remove(aVar);
        }
        hashMap.put(aVar, new AppreciableValue(a));
    }

    /* renamed from: a */
    private final void m187964a(AppreciableKey aVar, String str, Object obj) {
        ConcurrentHashMap<String, Object> b;
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar != null && (b = bVar.mo166781b()) != null) {
            b.put(str, obj);
        }
    }

    /* renamed from: b */
    private final void m187969b(AppreciableKey aVar, String str, Object obj) {
        ConcurrentHashMap<String, Object> c;
        AppreciableValue bVar = f119685b.get(aVar);
        if (bVar != null && (c = bVar.mo166782c()) != null) {
            c.put(str, obj);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m187967a(MomentsAppreciableHitPoint aVar, AppreciableKey aVar2, boolean z, ErrorType errorType, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = -1;
        }
        aVar.mo166741a(aVar2, z, errorType, i);
    }
}
