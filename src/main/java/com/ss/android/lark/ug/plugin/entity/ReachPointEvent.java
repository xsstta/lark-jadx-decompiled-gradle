package com.ss.android.lark.ug.plugin.entity;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001!BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent;", "", "reachPointId", "", "reachPointType", "event", "Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent$Event;", "materialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "extra", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent$Event;Lcom/ss/android/lark/pb/ug_reach/MaterialBase;Ljava/util/Map;)V", "getEvent", "()Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent$Event;", "getExtra", "()Ljava/util/Map;", "getMaterialBase", "()Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "getReachPointId", "()Ljava/lang/String;", "getReachPointType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Event", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.b.a */
public final class ReachPointEvent {

    /* renamed from: a */
    private final String f141746a;

    /* renamed from: b */
    private final String f141747b;

    /* renamed from: c */
    private final Event f141748c;

    /* renamed from: d */
    private final MaterialBase f141749d;

    /* renamed from: e */
    private final Map<String, String> f141750e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent$Event;", "", "name", "", UpdateKey.STATUS, "", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getStatus", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.b.a$a */
    public static final class Event {

        /* renamed from: a */
        public static final Companion f141751a = new Companion(null);

        /* renamed from: b */
        private final String f141752b;

        /* renamed from: c */
        private final boolean f141753c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Event) {
                    Event aVar = (Event) obj;
                    if (Intrinsics.areEqual(this.f141752b, aVar.f141752b)) {
                        if (this.f141753c == aVar.f141753c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f141752b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f141753c;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public String toString() {
            return "Event(name=" + this.f141752b + ", status=" + this.f141753c + ")";
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent$Event$Companion;", "", "()V", "EVENT_CONSUME", "", "EVENT_DID_HIDE", "EVENT_DID_SHOW", "EVENT_ON_CLICK", "EVENT_ON_CREATE", "EVENT_ON_DESTROY", "EVENT_ON_READY", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.ug.plugin.b.a$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final String mo195244a() {
            return this.f141752b;
        }

        /* renamed from: b */
        public final boolean mo195245b() {
            return this.f141753c;
        }

        public Event(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.f141752b = str;
            this.f141753c = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Event(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReachPointEvent)) {
            return false;
        }
        ReachPointEvent aVar = (ReachPointEvent) obj;
        return Intrinsics.areEqual(this.f141746a, aVar.f141746a) && Intrinsics.areEqual(this.f141747b, aVar.f141747b) && Intrinsics.areEqual(this.f141748c, aVar.f141748c) && Intrinsics.areEqual(this.f141749d, aVar.f141749d) && Intrinsics.areEqual(this.f141750e, aVar.f141750e);
    }

    public int hashCode() {
        String str = this.f141746a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f141747b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Event aVar = this.f141748c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        MaterialBase materialBase = this.f141749d;
        int hashCode4 = (hashCode3 + (materialBase != null ? materialBase.hashCode() : 0)) * 31;
        Map<String, String> map = this.f141750e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "ReachPointEvent(reachPointId=" + this.f141746a + ", reachPointType=" + this.f141747b + ", event=" + this.f141748c + ", materialBase=" + this.f141749d + ", extra=" + this.f141750e + ")";
    }

    /* renamed from: a */
    public final String mo195237a() {
        return this.f141746a;
    }

    /* renamed from: b */
    public final Event mo195238b() {
        return this.f141748c;
    }

    /* renamed from: c */
    public final MaterialBase mo195239c() {
        return this.f141749d;
    }

    /* renamed from: d */
    public final Map<String, String> mo195240d() {
        return this.f141750e;
    }

    public ReachPointEvent(String str, String str2, Event aVar, MaterialBase materialBase, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(str2, "reachPointType");
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        this.f141746a = str;
        this.f141747b = str2;
        this.f141748c = aVar;
        this.f141749d = materialBase;
        this.f141750e = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReachPointEvent(String str, String str2, Event aVar, MaterialBase materialBase, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i & 8) != 0 ? null : materialBase, (i & 16) != 0 ? null : map);
    }
}
