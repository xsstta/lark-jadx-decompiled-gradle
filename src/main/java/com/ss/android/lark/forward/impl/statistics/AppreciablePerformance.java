package com.ss.android.lark.forward.impl.statistics;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.message.Message;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance;", "", "()V", "Companion", "ForwardType", "FromType", "TransmitType", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppreciablePerformance {

    /* renamed from: a */
    public static String f98813a;

    /* renamed from: b */
    public static int f98814b;

    /* renamed from: c */
    public static final Companion f98815c = new Companion(null);

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$ForwardType;", "", "Companion", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface ForwardType {
        public static final Companion Companion = Companion.f98816a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$ForwardType$Companion;", "", "()V", "BATCH_TRANSMIT", "", "MERGE_FORWARD", "SINGLE", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.impl.statistics.AppreciablePerformance$ForwardType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f98816a = new Companion();

            private Companion() {
            }
        }
    }

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$FromType;", "", "Companion", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface FromType {
        public static final Companion Companion = Companion.f98817a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$FromType$Companion;", "", "()V", "GROUP_CARD", "", "H5_APP", "TOPIC", "USER_CARD", "WEB", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.impl.statistics.AppreciablePerformance$FromType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f98817a = new Companion();

            private Companion() {
            }
        }
    }

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$TransmitType;", "", "Companion", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface TransmitType {
        public static final Companion Companion = Companion.f98818a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$TransmitType$Companion;", "", "()V", "FAVORITE", "", "MESSAGE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.impl.statistics.AppreciablePerformance$TransmitType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f98818a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004JJ\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007J(\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007J\u001e\u0010$\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/forward/impl/statistics/AppreciablePerformance$Companion;", "", "()V", "SDK_COST", "", "mForwardKey", "mForwardType", "", "endForward", "", "endForwardSpan", "spanKey", "errorForward", "errorCode", "errorMessage", "isCrypto", "", "messageType", "chatType", "transmitType", "chatCount", "originMsgId", "getForwardExtraCategory", "", "getForwardExtraMetric", "getForwardType", "Lcom/ss/android/lark/appreciablelib/Event;", "getKey", "page", "fromType", "includeStaticResource", "recordForwardType", "forwardType", "shareEnd", "shareKey", "shareError", "startForward", "startForwardSpan", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.impl.statistics.AppreciablePerformance$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo140994a(boolean z, int i, int i2) {
            AppreciablePerformance.f98813a = AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Chat, Event.forward_message, "ForwardPickFragment", true, null, null, MapsKt.mapOf(TuplesKt.to("message_type", Integer.valueOf(i)), TuplesKt.to("chat_type", Integer.valueOf(i2)), TuplesKt.to("is_crypto", Boolean.valueOf(z))), null, DynamicModule.f58006b, null);
        }

        /* renamed from: b */
        private final Event m151573b() {
            if (AppreciablePerformance.f98814b == 1) {
                return Event.merge_forward_message;
            }
            if (AppreciablePerformance.f98814b == 2) {
                return Event.batch_transmit_message;
            }
            return Event.forward_message;
        }

        /* renamed from: a */
        public final void mo140989a() {
            String str = AppreciablePerformance.f98813a;
            if (str != null) {
                AppreciableKit.f73094h.mo103524a().mo103518a(str, "ForwardPickFragment", (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
            }
            AppreciablePerformance.f98813a = null;
            AppreciablePerformance.f98814b = 0;
        }

        /* renamed from: a */
        public final void mo140990a(int i) {
            AppreciablePerformance.f98814b = i;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m151574b(int i) {
            if (i == Message.Type.IMAGE.getNumber() || i == Message.Type.MEDIA.getNumber() || i == Message.Type.AUDIO.getNumber()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo140995b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "spanKey");
            String str2 = AppreciablePerformance.f98813a;
            if (str2 != null) {
                AppreciableKit.f73094h.mo103524a().mo103521b(str2, str);
            }
        }

        /* renamed from: a */
        public final void mo140993a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "spanKey");
            String str2 = AppreciablePerformance.f98813a;
            if (str2 != null) {
                AppreciableKit.f73094h.mo103524a().mo103517a(str2, str);
            }
        }

        /* renamed from: a */
        public final String mo140988a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "page");
            return AppreciableKit.m107388a(AppreciableKit.f73094h.mo103524a(), Biz.Messenger, Scene.Chat, Event.share_operation, str, true, null, null, MapsKt.mapOf(TuplesKt.to("from_type", Integer.valueOf(i))), null, DynamicModule.f58006b, null);
        }

        /* renamed from: b */
        public final void mo140996b(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "shareKey");
            AppreciableKit.m107396c(AppreciableKit.f73094h.mo103524a(), str, null, null, null, MapsKt.mapOf(TuplesKt.to("fromType", Integer.valueOf(i))), 14, null);
        }

        /* renamed from: a */
        private final Map<String, Object> m151571a(int i, int i2, int i3) {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_type", Integer.valueOf(i2));
            if (AppreciablePerformance.f98814b == 0) {
                hashMap.put("message_type", Integer.valueOf(i));
                hashMap.put("transmit_type", Integer.valueOf(i3));
            }
            return hashMap;
        }

        /* renamed from: a */
        private final Map<String, Object> m151572a(int i, String str, int i2) {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_count", Integer.valueOf(i));
            if (AppreciablePerformance.f98814b == 0) {
                if (str != null) {
                    hashMap.put("origin_id", str);
                }
                hashMap.put("include_static_resource", Boolean.valueOf(m151574b(i2)));
            }
            return hashMap;
        }

        /* renamed from: a */
        public final void mo140991a(int i, String str, String str2, int i2) {
            Intrinsics.checkParameterIsNotNull(str2, "page");
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.share_operation, ErrorType.SDK, ErrorLevel.Fatal, i, null, str2, str, true, null, null, MapsKt.mapOf(TuplesKt.to("from_type", Integer.valueOf(i2)))));
        }

        /* renamed from: a */
        public final void mo140992a(int i, String str, boolean z, int i2, int i3, int i4, int i5, String str2) {
            Companion aVar = this;
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, aVar.m151573b(), ErrorType.SDK, ErrorLevel.Fatal, i, null, null, str, true, null, aVar.m151572a(i5, str2, i2), aVar.m151571a(i2, i3, i4)));
            AppreciablePerformance.f98813a = null;
            AppreciablePerformance.f98814b = 0;
        }
    }
}
