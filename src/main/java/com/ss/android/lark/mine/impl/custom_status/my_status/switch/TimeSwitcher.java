package com.ss.android.lark.mine.impl.custom_status.my_status.switch;

import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.bytedance.lark.pb.contact.v1.UserCustomStatusDuration;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8DX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8DX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8DX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0001\u0004\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;)V", "hasEndTime", "", "getHasEndTime", "()Z", "modifyBoth", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "getModifyBoth", "()Ljava/util/List;", "modifyBoth$delegate", "Lkotlin/Lazy;", "modifyCustomTime", "getModifyCustomTime", "modifyCustomTime$delegate", "modifyDuration", "getModifyDuration", "modifyDuration$delegate", "getStatus", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getId", "", "CloseTimeSwitcher", "CustomTimeSwitcher", "DefaultTimeSwitcher", "DurationTimeSwitcher", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$DefaultTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$DurationTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$CustomTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$CloseTimeSwitcher;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f */
public abstract class TimeSwitcher implements ITimeSwitcher {

    /* renamed from: b */
    private final boolean f115162b;

    /* renamed from: c */
    private final Lazy f115163c;

    /* renamed from: d */
    private final Lazy f115164d;

    /* renamed from: e */
    private final Lazy f115165e;

    /* renamed from: f */
    private final UserCustomStatus f115166f;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160631h() {
        return (List) this.f115163c.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160632i() {
        return (List) this.f115164d.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160633j() {
        return (List) this.f115165e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo160630g() {
        return this.f115162b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final UserCustomStatus mo160634k() {
        return this.f115166f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$CloseTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;)V", "getEndTime", "", "currentTime", "getOpenId", "getStartTime", "getUpdateField", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ModifiedField;", "updateBuilder", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$a */
    public static final class CloseTimeSwitcher extends TimeSwitcher {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher, com.ss.android.lark.mine.impl.custom_status.my_status.switch.TimeSwitcher
        /* renamed from: a */
        public long mo160620a() {
            return 0;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: a */
        public long mo160621a(long j) {
            return 0;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher, com.ss.android.lark.mine.impl.custom_status.my_status.switch.TimeSwitcher
        /* renamed from: e */
        public long mo160625e() {
            return -1;
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: c */
        public Function1<UpdateUserCustomStatusMeta.C16414a, Unit> mo160623c() {
            return new C45570a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: b */
        public List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160622b() {
            if (mo160630g()) {
                return mo160632i();
            }
            return CollectionsKt.emptyList();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$a$a */
        static final class C45570a extends Lambda implements Function1<UpdateUserCustomStatusMeta.C16414a, Unit> {
            final /* synthetic */ CloseTimeSwitcher this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45570a(CloseTimeSwitcher aVar) {
                super(1);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
                if (this.this$0.mo160630g()) {
                    aVar.mo58593b((Long) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CloseTimeSwitcher(UserCustomStatus userCustomStatus) {
            super(userCustomStatus, null);
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$CustomTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "customTime", "", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;J)V", "getEndTime", "currentTime", "getUpdateField", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ModifiedField;", "updateBuilder", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$b */
    public static final class CustomTimeSwitcher extends TimeSwitcher {

        /* renamed from: b */
        public final long f115167b;

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: b */
        public List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160622b() {
            return mo160632i();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: c */
        public Function1<UpdateUserCustomStatusMeta.C16414a, Unit> mo160623c() {
            return new C45571a(this);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$b$a */
        static final class C45571a extends Lambda implements Function1<UpdateUserCustomStatusMeta.C16414a, Unit> {
            final /* synthetic */ CustomTimeSwitcher this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45571a(CustomTimeSwitcher bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
                aVar.mo58593b(Long.valueOf(this.this$0.f115167b));
            }
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: a */
        public long mo160621a(long j) {
            long j2 = this.f115167b;
            if (j2 > j) {
                return j2;
            }
            ITimeSwitcher.Companion aVar = ITimeSwitcher.f115155a;
            UserCustomStatusDuration userCustomStatusDuration = mo160634k().last_selected_duration;
            Intrinsics.checkExpressionValueIsNotNull(userCustomStatusDuration, "status.last_selected_duration");
            return aVar.mo160627a(userCustomStatusDuration, j);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CustomTimeSwitcher(UserCustomStatus userCustomStatus, long j) {
            super(userCustomStatus, null);
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
            this.f115167b = j;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\tH\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$DefaultTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;)V", "getEndTime", "", "currentTime", "getUpdateField", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ModifiedField;", "updateBuilder", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$c */
    public static final class DefaultTimeSwitcher extends TimeSwitcher {
        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: b */
        public List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160622b() {
            return CollectionsKt.emptyList();
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: c */
        public Function1<UpdateUserCustomStatusMeta.C16414a, Unit> mo160623c() {
            return C45572a.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$c$a */
        static final class C45572a extends Lambda implements Function1<UpdateUserCustomStatusMeta.C16414a, Unit> {
            public static final C45572a INSTANCE = new C45572a();

            C45572a() {
                super(1);
            }

            public final void invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DefaultTimeSwitcher(UserCustomStatus userCustomStatus) {
            super(userCustomStatus, null);
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: a */
        public long mo160621a(long j) {
            Long l = mo160634k().last_customized_end_time;
            if (l != null && l.longValue() > j) {
                return l.longValue();
            }
            ITimeSwitcher.Companion aVar = ITimeSwitcher.f115155a;
            UserCustomStatusDuration userCustomStatusDuration = mo160634k().last_selected_duration;
            Intrinsics.checkExpressionValueIsNotNull(userCustomStatusDuration, "status.last_selected_duration");
            return aVar.mo160627a(userCustomStatusDuration, j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher$DurationTimeSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/TimeSwitcher;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "duration", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Lcom/bytedance/lark/pb/contact/v1/UserCustomStatusDuration;)V", "getEndTime", "", "currentTime", "getUpdateField", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ModifiedField;", "updateBuilder", "Lkotlin/Function1;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$d */
    public static final class DurationTimeSwitcher extends TimeSwitcher {

        /* renamed from: b */
        public final UserCustomStatusDuration f115168b;

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: c */
        public Function1<UpdateUserCustomStatusMeta.C16414a, Unit> mo160623c() {
            return new C45573a(this);
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: b */
        public List<UpdateUserCustomStatusMeta.UserCustomStatusField> mo160622b() {
            if (mo160630g()) {
                return mo160633j();
            }
            return mo160631h();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$d$a */
        static final class C45573a extends Lambda implements Function1<UpdateUserCustomStatusMeta.C16414a, Unit> {
            final /* synthetic */ DurationTimeSwitcher this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45573a(DurationTimeSwitcher dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UpdateUserCustomStatusMeta.C16414a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "it");
                aVar.mo58586a(this.this$0.f115168b);
            }
        }

        @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
        /* renamed from: a */
        public long mo160621a(long j) {
            return ITimeSwitcher.f115155a.mo160627a(this.f115168b, j);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DurationTimeSwitcher(UserCustomStatus userCustomStatus, UserCustomStatusDuration userCustomStatusDuration) {
            super(userCustomStatus, null);
            Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
            Intrinsics.checkParameterIsNotNull(userCustomStatusDuration, "duration");
            this.f115168b = userCustomStatusDuration;
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
    /* renamed from: a */
    public long mo160620a() {
        return ITimeSwitcher.C45567b.m180766a(this);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
    /* renamed from: e */
    public long mo160625e() {
        return ITimeSwitcher.C45567b.m180767b(this);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
    /* renamed from: f */
    public UpdateUserCustomStatusMeta mo160626f() {
        return ITimeSwitcher.C45567b.m180768c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$f */
    static final class C45575f extends Lambda implements Function0<List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField>> {
        public static final C45575f INSTANCE = new C45575f();

        C45575f() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta$UserCustomStatusField>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField> invoke() {
            return CollectionsKt.listOf(UpdateUserCustomStatusMeta.UserCustomStatusField.LAST_CUSTOMIZED_END_TIME);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$g */
    static final class C45576g extends Lambda implements Function0<List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField>> {
        public static final C45576g INSTANCE = new C45576g();

        C45576g() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta$UserCustomStatusField>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField> invoke() {
            return CollectionsKt.listOf(UpdateUserCustomStatusMeta.UserCustomStatusField.LAST_SELECTED_DEFAULT_DURATION);
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.ITimeSwitcher
    /* renamed from: d */
    public long mo160624d() {
        Long l = this.f115166f.id;
        Intrinsics.checkExpressionValueIsNotNull(l, "status.id");
        return l.longValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta$UserCustomStatusField;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.f$e */
    static final class C45574e extends Lambda implements Function0<List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField>> {
        public static final C45574e INSTANCE = new C45574e();

        C45574e() {
            super(0);
        }

        /* Return type fixed from 'java.util.List<com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta$UserCustomStatusField>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends UpdateUserCustomStatusMeta.UserCustomStatusField> invoke() {
            return CollectionsKt.listOf((Object[]) new UpdateUserCustomStatusMeta.UserCustomStatusField[]{UpdateUserCustomStatusMeta.UserCustomStatusField.LAST_SELECTED_DEFAULT_DURATION, UpdateUserCustomStatusMeta.UserCustomStatusField.LAST_CUSTOMIZED_END_TIME});
        }
    }

    private TimeSwitcher(UserCustomStatus userCustomStatus) {
        boolean z;
        this.f115166f = userCustomStatus;
        if (userCustomStatus.last_customized_end_time != null) {
            z = true;
        } else {
            z = false;
        }
        this.f115162b = z;
        this.f115163c = LazyKt.lazy(C45576g.INSTANCE);
        this.f115164d = LazyKt.lazy(C45575f.INSTANCE);
        this.f115165e = LazyKt.lazy(C45574e.INSTANCE);
    }

    public /* synthetic */ TimeSwitcher(UserCustomStatus userCustomStatus, DefaultConstructorMarker defaultConstructorMarker) {
        this(userCustomStatus);
    }
}
