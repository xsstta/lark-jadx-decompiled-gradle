package com.ss.android.lark.chat.entity.chatter;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.ss.android.lark.chat.export.entity.chatter.IChatterCustomStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0004HÂ\u0003J\t\u0010\r\u001a\u00020\u0004HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÂ\u0003J=\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus;", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus;", "Ljava/io/Serializable;", "title", "", "iconKey", "isNotDisturbMode", "", "effectiveInterval", "Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$StatusEffectiveInterval;", "fsUnit", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$StatusEffectiveInterval;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getEffectiveInterval", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus$IStatusEffectiveInterval;", "getIconKey", "getTitle", "hashCode", "", "toString", "Companion", "StatusEffectiveInterval", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatterCustomStatus implements IChatterCustomStatus, Serializable {
    public static final Companion Companion = new Companion(null);
    public final StatusEffectiveInterval effectiveInterval;
    public final String fsUnit;
    public final String iconKey;
    public final boolean isNotDisturbMode;
    public final String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\u0004HÂ\u0003J\t\u0010\n\u001a\u00020\u0004HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÂ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$StatusEffectiveInterval;", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus$IStatusEffectiveInterval;", "Ljava/io/Serializable;", "startTime", "", "endTime", "isShowEndTime", "", "(JJZ)V", "component1", "component2", "component3", "copy", "equals", "other", "", "getEndTime", "getStartTime", "hashCode", "", "toString", "", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class StatusEffectiveInterval implements IChatterCustomStatus.IStatusEffectiveInterval, Serializable {
        public static final Companion Companion = new Companion(null);
        public final long endTime;
        public final boolean isShowEndTime;
        public final long startTime;

        private final long component1() {
            return this.startTime;
        }

        private final long component2() {
            return this.endTime;
        }

        private final boolean component3() {
            return this.isShowEndTime;
        }

        public static /* synthetic */ StatusEffectiveInterval copy$default(StatusEffectiveInterval statusEffectiveInterval, long j, long j2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = statusEffectiveInterval.startTime;
            }
            if ((i & 2) != 0) {
                j2 = statusEffectiveInterval.endTime;
            }
            if ((i & 4) != 0) {
                z = statusEffectiveInterval.isShowEndTime;
            }
            return statusEffectiveInterval.copy(j, j2, z);
        }

        public final StatusEffectiveInterval copy(long j, long j2, boolean z) {
            return new StatusEffectiveInterval(j, j2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusEffectiveInterval)) {
                return false;
            }
            StatusEffectiveInterval statusEffectiveInterval = (StatusEffectiveInterval) obj;
            return this.startTime == statusEffectiveInterval.startTime && this.endTime == statusEffectiveInterval.endTime && this.isShowEndTime == statusEffectiveInterval.isShowEndTime;
        }

        public int hashCode() {
            long j = this.startTime;
            long j2 = this.endTime;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.isShowEndTime;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            return "StatusEffectiveInterval(startTime=" + this.startTime + ", endTime=" + this.endTime + ", isShowEndTime=" + this.isShowEndTime + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007J\u0018\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$StatusEffectiveInterval$Companion;", "", "()V", "fromPB", "Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$StatusEffectiveInterval;", "pb", "Lcom/bytedance/lark/pb/basic/v1/StatusEffectiveInterval;", "Lcom/ss/android/lark/chat/entity/chatter/PBInterval;", "toPB", "obj", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus$StatusEffectiveInterval$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval mo124847a(StatusEffectiveInterval statusEffectiveInterval) {
                if (statusEffectiveInterval != null) {
                    return new StatusEffectiveInterval.C15294a().mo55638a(Long.valueOf(statusEffectiveInterval.startTime)).mo55640b(Long.valueOf(statusEffectiveInterval.endTime)).mo55637a(Boolean.valueOf(statusEffectiveInterval.isShowEndTime)).build();
                }
                return null;
            }

            /* renamed from: a */
            public final StatusEffectiveInterval mo124848a(com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval statusEffectiveInterval) {
                if (statusEffectiveInterval == null) {
                    return null;
                }
                Long l = statusEffectiveInterval.start_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "it.start_time");
                long longValue = l.longValue();
                Long l2 = statusEffectiveInterval.end_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "it.end_time");
                long longValue2 = l2.longValue();
                Boolean bool = statusEffectiveInterval.is_show_end_time;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_show_end_time");
                return new StatusEffectiveInterval(longValue, longValue2, bool.booleanValue());
            }
        }

        @Override // com.ss.android.lark.chat.export.entity.chatter.IChatterCustomStatus.IStatusEffectiveInterval
        public long getEndTime() {
            return this.endTime;
        }

        @Override // com.ss.android.lark.chat.export.entity.chatter.IChatterCustomStatus.IStatusEffectiveInterval
        public long getStartTime() {
            return this.startTime;
        }

        @Override // com.ss.android.lark.chat.export.entity.chatter.IChatterCustomStatus.IStatusEffectiveInterval
        public boolean isShowEndTime() {
            return this.isShowEndTime;
        }

        public StatusEffectiveInterval(long j, long j2, boolean z) {
            this.startTime = j;
            this.endTime = j2;
            this.isShowEndTime = z;
        }
    }

    private final String component1() {
        return this.title;
    }

    private final String component2() {
        return this.iconKey;
    }

    private final boolean component3() {
        return this.isNotDisturbMode;
    }

    private final StatusEffectiveInterval component4() {
        return this.effectiveInterval;
    }

    private final String component5() {
        return this.fsUnit;
    }

    public static /* synthetic */ ChatterCustomStatus copy$default(ChatterCustomStatus chatterCustomStatus, String str, String str2, boolean z, StatusEffectiveInterval statusEffectiveInterval, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatterCustomStatus.title;
        }
        if ((i & 2) != 0) {
            str2 = chatterCustomStatus.iconKey;
        }
        if ((i & 4) != 0) {
            z = chatterCustomStatus.isNotDisturbMode;
        }
        if ((i & 8) != 0) {
            statusEffectiveInterval = chatterCustomStatus.effectiveInterval;
        }
        if ((i & 16) != 0) {
            str3 = chatterCustomStatus.fsUnit;
        }
        return chatterCustomStatus.copy(str, str2, z, statusEffectiveInterval, str3);
    }

    @JvmStatic
    public static final ChatterCustomStatus fromPB(Chatter.ChatterCustomStatus chatterCustomStatus) {
        return Companion.mo124849a(chatterCustomStatus);
    }

    @JvmStatic
    public static final List<ChatterCustomStatus> fromPB(List<Chatter.ChatterCustomStatus> list) {
        return Companion.mo124850a(list);
    }

    @JvmStatic
    public static final List<Chatter.ChatterCustomStatus> toPB(List<ChatterCustomStatus> list) {
        return Companion.mo124851b(list);
    }

    public final ChatterCustomStatus copy(String str, String str2, boolean z, StatusEffectiveInterval statusEffectiveInterval, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "iconKey");
        Intrinsics.checkParameterIsNotNull(str3, "fsUnit");
        return new ChatterCustomStatus(str, str2, z, statusEffectiveInterval, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatterCustomStatus)) {
            return false;
        }
        ChatterCustomStatus chatterCustomStatus = (ChatterCustomStatus) obj;
        return Intrinsics.areEqual(this.title, chatterCustomStatus.title) && Intrinsics.areEqual(this.iconKey, chatterCustomStatus.iconKey) && this.isNotDisturbMode == chatterCustomStatus.isNotDisturbMode && Intrinsics.areEqual(this.effectiveInterval, chatterCustomStatus.effectiveInterval) && Intrinsics.areEqual(this.fsUnit, chatterCustomStatus.fsUnit);
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.iconKey;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isNotDisturbMode;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        StatusEffectiveInterval statusEffectiveInterval = this.effectiveInterval;
        int hashCode3 = (i5 + (statusEffectiveInterval != null ? statusEffectiveInterval.hashCode() : 0)) * 31;
        String str3 = this.fsUnit;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ChatterCustomStatus(title=" + this.title + ", iconKey=" + this.iconKey + ", isNotDisturbMode=" + this.isNotDisturbMode + ", effectiveInterval=" + this.effectiveInterval + ", fsUnit=" + this.fsUnit + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\tH\u0007J$\u0010\n\u001a\u000e\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus$Companion;", "", "()V", "fromNonNullPB", "Lcom/ss/android/lark/chat/entity/chatter/ChatterCustomStatus;", "pb", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "Lcom/ss/android/lark/chat/entity/chatter/PBStatus;", "fromPB", "", "toPB", "obj", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatterCustomStatus mo124849a(Chatter.ChatterCustomStatus chatterCustomStatus) {
            if (chatterCustomStatus != null) {
                return m131777b(chatterCustomStatus);
            }
            return null;
        }

        /* renamed from: b */
        private final ChatterCustomStatus m131777b(Chatter.ChatterCustomStatus chatterCustomStatus) {
            String str = chatterCustomStatus.title;
            Intrinsics.checkExpressionValueIsNotNull(str, "pb.title");
            String str2 = chatterCustomStatus.icon_key;
            Intrinsics.checkExpressionValueIsNotNull(str2, "pb.icon_key");
            Boolean bool = chatterCustomStatus.is_not_disturb_mode;
            Intrinsics.checkExpressionValueIsNotNull(bool, "pb.is_not_disturb_mode");
            boolean booleanValue = bool.booleanValue();
            StatusEffectiveInterval a = StatusEffectiveInterval.Companion.mo124848a(chatterCustomStatus.effective_interval);
            String str3 = chatterCustomStatus.fs_unit;
            Intrinsics.checkExpressionValueIsNotNull(str3, "pb.fs_unit");
            return new ChatterCustomStatus(str, str2, booleanValue, a, str3);
        }

        @JvmStatic
        /* renamed from: a */
        public final List<ChatterCustomStatus> mo124850a(List<Chatter.ChatterCustomStatus> list) {
            Intrinsics.checkParameterIsNotNull(list, "pb");
            List<Chatter.ChatterCustomStatus> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ChatterCustomStatus.Companion.m131777b((Chatter.ChatterCustomStatus) it.next()));
            }
            return arrayList;
        }

        @JvmStatic
        /* renamed from: b */
        public final List<Chatter.ChatterCustomStatus> mo124851b(List<ChatterCustomStatus> list) {
            if (list == null) {
                return null;
            }
            List<ChatterCustomStatus> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                arrayList.add(new Chatter.ChatterCustomStatus.C14817a().mo54400c(t.fsUnit).mo54397a(t.title).mo54399b(t.iconKey).mo54396a(Boolean.valueOf(t.isNotDisturbMode)).mo54395a(StatusEffectiveInterval.Companion.mo124847a(t.effectiveInterval)).build());
            }
            return arrayList;
        }
    }

    public String getIconKey() {
        return this.iconKey;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isNotDisturbMode() {
        return this.isNotDisturbMode;
    }

    public IChatterCustomStatus.IStatusEffectiveInterval getEffectiveInterval() {
        return this.effectiveInterval;
    }

    public ChatterCustomStatus(String str, String str2, boolean z, StatusEffectiveInterval statusEffectiveInterval, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "iconKey");
        Intrinsics.checkParameterIsNotNull(str3, "fsUnit");
        this.title = str;
        this.iconKey = str2;
        this.isNotDisturbMode = z;
        this.effectiveInterval = statusEffectiveInterval;
        this.fsUnit = str3;
    }
}
