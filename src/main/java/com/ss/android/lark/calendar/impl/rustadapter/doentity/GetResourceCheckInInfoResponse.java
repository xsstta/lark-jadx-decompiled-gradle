package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse;
import com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0002\u0010\u0013J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003Jm\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006>"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "building", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "currentTimestampSecond", "", "authCreateEvent", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$CreateEventAuth;", "instanceInfos", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "resourceCheckInStrategy", "Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;", "chatters", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;JLcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$CreateEventAuth;Ljava/util/List;Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;Ljava/util/Map;)V", "getAuthCreateEvent", "()Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$CreateEventAuth;", "setAuthCreateEvent", "(Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$CreateEventAuth;)V", "getBuilding", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "setBuilding", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;)V", "getCalendarResource", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "setCalendarResource", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;)V", "getChatters", "()Ljava/util/Map;", "setChatters", "(Ljava/util/Map;)V", "getCurrentTimestampSecond", "()J", "setCurrentTimestampSecond", "(J)V", "getInstanceInfos", "()Ljava/util/List;", "setInstanceInfos", "(Ljava/util/List;)V", "getResourceCheckInStrategy", "()Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;", "setResourceCheckInStrategy", "(Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.j */
public final class GetResourceCheckInInfoResponse {

    /* renamed from: a */
    private CalendarResource f83610a;

    /* renamed from: b */
    private CalendarBuilding f83611b;

    /* renamed from: c */
    private long f83612c;

    /* renamed from: d */
    private GetResourceCheckInInfoResponse.CreateEventAuth f83613d;

    /* renamed from: e */
    private List<InstanceInfo> f83614e;

    /* renamed from: f */
    private ResourceCheckInStrategy f83615f;

    /* renamed from: g */
    private Map<String, CalendarEventCreator> f83616g;

    public GetResourceCheckInInfoResponse() {
        this(null, null, 0, null, null, null, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetResourceCheckInInfoResponse)) {
            return false;
        }
        GetResourceCheckInInfoResponse jVar = (GetResourceCheckInInfoResponse) obj;
        return Intrinsics.areEqual(this.f83610a, jVar.f83610a) && Intrinsics.areEqual(this.f83611b, jVar.f83611b) && this.f83612c == jVar.f83612c && Intrinsics.areEqual(this.f83613d, jVar.f83613d) && Intrinsics.areEqual(this.f83614e, jVar.f83614e) && Intrinsics.areEqual(this.f83615f, jVar.f83615f) && Intrinsics.areEqual(this.f83616g, jVar.f83616g);
    }

    public int hashCode() {
        CalendarResource calendarResource = this.f83610a;
        int i = 0;
        int hashCode = (calendarResource != null ? calendarResource.hashCode() : 0) * 31;
        CalendarBuilding calendarBuilding = this.f83611b;
        int hashCode2 = calendarBuilding != null ? calendarBuilding.hashCode() : 0;
        long j = this.f83612c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        GetResourceCheckInInfoResponse.CreateEventAuth createEventAuth = this.f83613d;
        int hashCode3 = (i2 + (createEventAuth != null ? createEventAuth.hashCode() : 0)) * 31;
        List<InstanceInfo> list = this.f83614e;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f83615f;
        int hashCode5 = (hashCode4 + (resourceCheckInStrategy != null ? resourceCheckInStrategy.hashCode() : 0)) * 31;
        Map<String, CalendarEventCreator> map = this.f83616g;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "GetResourceCheckInInfoResponse(calendarResource=" + this.f83610a + ", building=" + this.f83611b + ", currentTimestampSecond=" + this.f83612c + ", authCreateEvent=" + this.f83613d + ", instanceInfos=" + this.f83614e + ", resourceCheckInStrategy=" + this.f83615f + ", chatters=" + this.f83616g + ")";
    }

    /* renamed from: a */
    public final CalendarResource mo120095a() {
        return this.f83610a;
    }

    /* renamed from: b */
    public final CalendarBuilding mo120103b() {
        return this.f83611b;
    }

    /* renamed from: c */
    public final long mo120104c() {
        return this.f83612c;
    }

    /* renamed from: d */
    public final GetResourceCheckInInfoResponse.CreateEventAuth mo120105d() {
        return this.f83613d;
    }

    /* renamed from: e */
    public final List<InstanceInfo> mo120106e() {
        return this.f83614e;
    }

    /* renamed from: f */
    public final ResourceCheckInStrategy mo120108f() {
        return this.f83615f;
    }

    /* renamed from: g */
    public final Map<String, CalendarEventCreator> mo120109g() {
        return this.f83616g;
    }

    /* renamed from: a */
    public final void mo120096a(long j) {
        this.f83612c = j;
    }

    /* renamed from: a */
    public final void mo120097a(GetResourceCheckInInfoResponse.CreateEventAuth createEventAuth) {
        this.f83613d = createEventAuth;
    }

    /* renamed from: a */
    public final void mo120098a(ResourceCheckInStrategy resourceCheckInStrategy) {
        this.f83615f = resourceCheckInStrategy;
    }

    /* renamed from: a */
    public final void mo120099a(CalendarBuilding calendarBuilding) {
        this.f83611b = calendarBuilding;
    }

    /* renamed from: a */
    public final void mo120100a(CalendarResource calendarResource) {
        this.f83610a = calendarResource;
    }

    /* renamed from: a */
    public final void mo120101a(List<InstanceInfo> list) {
        this.f83614e = list;
    }

    /* renamed from: a */
    public final void mo120102a(Map<String, CalendarEventCreator> map) {
        this.f83616g = map;
    }

    public GetResourceCheckInInfoResponse(CalendarResource calendarResource, CalendarBuilding calendarBuilding, long j, GetResourceCheckInInfoResponse.CreateEventAuth createEventAuth, List<InstanceInfo> list, ResourceCheckInStrategy resourceCheckInStrategy, Map<String, CalendarEventCreator> map) {
        this.f83610a = calendarResource;
        this.f83611b = calendarBuilding;
        this.f83612c = j;
        this.f83613d = createEventAuth;
        this.f83614e = list;
        this.f83615f = resourceCheckInStrategy;
        this.f83616g = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GetResourceCheckInInfoResponse(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource r10, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding r11, long r12, com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse.CreateEventAuth r14, java.util.List r15, com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource r0 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource) r0
            goto L_0x000a
        L_0x0009:
            r0 = r10
        L_0x000a:
            r2 = r18 & 2
            if (r2 == 0) goto L_0x0012
            r2 = r1
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding r2 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding) r2
            goto L_0x0013
        L_0x0012:
            r2 = r11
        L_0x0013:
            r3 = r18 & 4
            if (r3 == 0) goto L_0x001a
            r3 = 0
            goto L_0x001b
        L_0x001a:
            r3 = r12
        L_0x001b:
            r5 = r18 & 8
            if (r5 == 0) goto L_0x0023
            r5 = r1
            com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$CreateEventAuth r5 = (com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse.CreateEventAuth) r5
            goto L_0x0024
        L_0x0023:
            r5 = r14
        L_0x0024:
            r6 = r18 & 16
            if (r6 == 0) goto L_0x002c
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            goto L_0x002d
        L_0x002c:
            r6 = r15
        L_0x002d:
            r7 = r18 & 32
            if (r7 == 0) goto L_0x0035
            r7 = r1
            com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy r7 = (com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy) r7
            goto L_0x0037
        L_0x0035:
            r7 = r16
        L_0x0037:
            r8 = r18 & 64
            if (r8 == 0) goto L_0x003e
            java.util.Map r1 = (java.util.Map) r1
            goto L_0x0040
        L_0x003e:
            r1 = r17
        L_0x0040:
            r10 = r9
            r11 = r0
            r12 = r2
            r13 = r3
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r1
            r10.<init>(r11, r12, r13, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse.<init>(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding, long, com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$CreateEventAuth, java.util.List, com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
