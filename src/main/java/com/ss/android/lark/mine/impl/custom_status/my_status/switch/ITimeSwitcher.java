package com.ss.android.lark.mine.impl.custom_status.my_status.switch;

import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher;", "", "getEndTime", "", "currentTime", "getId", "getInterval", "Lcom/bytedance/lark/pb/basic/v1/StatusEffectiveInterval;", "getOpenId", "getStartTime", "getUpdateField", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "getUpdateMeta", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "updateBuilder", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.b */
public interface ITimeSwitcher {

    /* renamed from: a */
    public static final Companion f115155a = Companion.f115156a;

    /* renamed from: a */
    long mo160620a();

    /* renamed from: a */
    long mo160621a(long j);

    /* renamed from: b */
    List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160622b();

    /* renamed from: c */
    Function1<UpdateUserCustomStatusMeta.C16414a, Unit> mo160623c();

    /* renamed from: d */
    long mo160624d();

    /* renamed from: e */
    long mo160625e();

    /* renamed from: f */
    UpdateUserCustomStatusMeta mo160626f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\t\u001a\u00020\u0006*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher$Companion;", "", "()V", "getStatusEffectiveInterval", "Lcom/bytedance/lark/pb/basic/v1/StatusEffectiveInterval;", "start", "", "end", "getTonightTime", "calEndTime", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "currentTime", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.b$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f115156a = new Companion();

        private Companion() {
        }

        /* renamed from: a */
        private final long m180763a() {
            long b = C45616s.m180945b();
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
            instance.setTimeInMillis(b);
            instance.set(instance.get(1), instance.get(2), instance.get(5), 23, 59);
            return instance.getTimeInMillis() / 1000;
        }

        /* renamed from: a */
        public final long mo160627a(UserCustomStatusDuration userCustomStatusDuration, long j) {
            long j2;
            Intrinsics.checkParameterIsNotNull(userCustomStatusDuration, "$this$calEndTime");
            int i = C45568c.f115157a[userCustomStatusDuration.ordinal()];
            if (i == 1) {
                j2 = TimeUnit.MINUTES.toSeconds(30);
            } else if (i == 2) {
                j2 = TimeUnit.HOURS.toSeconds(1);
            } else if (i == 3) {
                j2 = TimeUnit.HOURS.toSeconds(2);
            } else if (i == 4) {
                j2 = TimeUnit.HOURS.toSeconds(4);
            } else if (i == 5) {
                return m180763a();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return j2 + j;
        }

        /* renamed from: a */
        public final StatusEffectiveInterval mo160628a(long j, long j2) {
            StatusEffectiveInterval a = new StatusEffectiveInterval.C15294a().mo55638a(Long.valueOf(j)).mo55640b(Long.valueOf(j2)).mo55637a((Boolean) true).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "StatusEffectiveInterval.…ow_end_time(true).build()");
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.b$b */
    public static final class C45567b {
        /* renamed from: a */
        public static long m180766a(ITimeSwitcher bVar) {
            return C45616s.m180945b() / 1000;
        }

        /* renamed from: b */
        public static long m180767b(ITimeSwitcher bVar) {
            return bVar.mo160624d();
        }

        /* renamed from: d */
        private static StatusEffectiveInterval m180769d(ITimeSwitcher bVar) {
            long a = bVar.mo160620a();
            return ITimeSwitcher.f115155a.mo160628a(a, bVar.mo160621a(a));
        }

        /* renamed from: c */
        public static UpdateUserCustomStatusMeta m180768c(ITimeSwitcher bVar) {
            UpdateUserCustomStatusMeta.C16414a aVar = new UpdateUserCustomStatusMeta.C16414a();
            aVar.mo58588a(Long.valueOf(bVar.mo160624d()));
            aVar.mo58585a(m180769d(bVar));
            bVar.mo160623c().invoke(aVar);
            aVar.mo58590a(CollectionsKt.plus((Collection) bVar.mo160622b(), (Iterable) CollectionsKt.listOf(UpdateUserCustomStatusMeta.UserCustomStatusField.EFFECTIVE_INTERVAL)));
            UpdateUserCustomStatusMeta a = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            return a;
        }
    }
}
