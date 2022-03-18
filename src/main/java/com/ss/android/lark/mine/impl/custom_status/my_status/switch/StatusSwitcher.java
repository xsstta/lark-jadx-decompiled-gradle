package com.ss.android.lark.mine.impl.custom_status.my_status.switch;

import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J6\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/StatusSwitcher;", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/IStatusSwitcher;", "open", "Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher;", "close", "(Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher;Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/ITimeSwitcher;)V", "getModifiedItemMap", "", "", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "map", "metas", "", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "getOpenId", "getUpdateStatusMetas", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.d */
public final class StatusSwitcher implements IStatusSwitcher {

    /* renamed from: a */
    public static final Companion f115158a = new Companion(null);

    /* renamed from: b */
    private final ITimeSwitcher f115159b;

    /* renamed from: c */
    private final ITimeSwitcher f115160c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/my_status/switch/StatusSwitcher$Companion;", "", "()V", "commitMeta", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "meta", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.my_status.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UserCustomStatus mo160629a(UserCustomStatus userCustomStatus, UpdateUserCustomStatusMeta updateUserCustomStatusMeta) {
            UserCustomStatus.C16422a newBuilder = userCustomStatus.newBuilder();
            List<UpdateUserCustomStatusMeta.UserCustomStatusField> list = updateUserCustomStatusMeta.fields;
            Intrinsics.checkExpressionValueIsNotNull(list, "meta.fields");
            for (T t : list) {
                if (t != null) {
                    int i = C45569e.f115161a[t.ordinal()];
                    if (i == 1) {
                        newBuilder.mo58611a(updateUserCustomStatusMeta.effective_interval);
                    } else if (i == 2) {
                        newBuilder.mo58612a(updateUserCustomStatusMeta.last_selected_duration);
                    } else if (i == 3) {
                        newBuilder.mo58613a(updateUserCustomStatusMeta.last_customized_end_time);
                    }
                }
            }
            UserCustomStatus a = newBuilder.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            return a;
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.IStatusSwitcher
    /* renamed from: b */
    public long mo160619b() {
        return this.f115159b.mo160625e();
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.IStatusSwitcher
    /* renamed from: a */
    public List<UpdateUserCustomStatusMeta> mo160617a() {
        ITimeSwitcher bVar = this.f115160c;
        if (bVar == null) {
            return CollectionsKt.listOf(this.f115159b.mo160626f());
        }
        return CollectionsKt.listOf((Object[]) new UpdateUserCustomStatusMeta[]{this.f115159b.mo160626f(), bVar.mo160626f()});
    }

    public StatusSwitcher(ITimeSwitcher bVar, ITimeSwitcher bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "open");
        this.f115159b = bVar;
        this.f115160c = bVar2;
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.my_status.switch.IStatusSwitcher
    /* renamed from: a */
    public Map<Long, UserCustomStatus> mo160618a(Map<Long, UserCustomStatus> map, List<UpdateUserCustomStatusMeta> list) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(list, "metas");
        Map<Long, UserCustomStatus> mutableMap = MapsKt.toMutableMap(map);
        for (T t : list) {
            Long l = t.id;
            UserCustomStatus userCustomStatus = mutableMap.get(l);
            if (userCustomStatus != null) {
                Intrinsics.checkExpressionValueIsNotNull(l, "id");
                mutableMap.put(l, f115158a.mo160629a(userCustomStatus, t));
            }
        }
        return mutableMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusSwitcher(ITimeSwitcher bVar, ITimeSwitcher bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : bVar2);
    }
}
