package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection;
import com.bytedance.lark.pb.calendar.v1.EntitySchema;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0007\u001a\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0006\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\f\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\r\u001a-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0016\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"ONE_HOUR_SECOND", "", "getApprovalRequest", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$BizData;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "getApprovalTrigger", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "getTriggerHourNumStr", "", "isMeetingRoomApproval", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;", "isNeedApprovalRequest", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "eventDuration", "", "isRepeatOrExceptionEvent", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;Ljava/lang/Long;Z)Lkotlin/Pair;", "isNeedApprovalRequestWithOutRRule", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;Ljava/lang/Long;)Lkotlin/Pair;", "isShowApprovalLabel", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.c */
public final class C32065c {
    /* renamed from: a */
    public static final String m121946a(SchemaExtraData.ApprovalTrigger approvalTrigger) {
        Long l;
        String valueOf;
        if (approvalTrigger == null || (l = approvalTrigger.duration_trigger) == null || (valueOf = String.valueOf(l.longValue() / ((long) 3600))) == null) {
            return "";
        }
        return valueOf;
    }

    /* renamed from: a */
    public static final SchemaExtraData.BizData m121945a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        T t;
        boolean z;
        Intrinsics.checkParameterIsNotNull(schemaExtraData, "$this$getApprovalRequest");
        Iterator<T> it = schemaExtraData.getBizDataList().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == SchemaExtraData.Type.APPROVAL_REQUEST) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t;
    }

    /* renamed from: b */
    public static final SchemaExtraData.ApprovalTrigger m121951b(CalendarResource calendarResource) {
        List<SchemaExtraData.BizData> list;
        T t;
        SchemaExtraData.ResourceApprovalInfo resourceApprovalInfo;
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$getApprovalTrigger");
        com.bytedance.lark.pb.calendar.v1.SchemaExtraData schemaExtraData = calendarResource.schema_extra_data;
        if (schemaExtraData == null || (list = schemaExtraData.biz_data) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.type == SchemaExtraData.Type.RESOURCE_APPROVAL_INFO) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (resourceApprovalInfo = t2.resource_approval_info) == null) {
            return null;
        }
        return resourceApprovalInfo.trigger;
    }

    /* renamed from: a */
    public static final boolean m121948a(CalendarResource calendarResource) {
        List<EntitySchema> list;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$isShowApprovalLabel");
        CalendarSchemaCollection calendarSchemaCollection = calendarResource.resource_schema;
        EntitySchema entitySchema = null;
        if (!(calendarSchemaCollection == null || (list = calendarSchemaCollection.entity_schemas) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (Intrinsics.areEqual(next.unique_name, "ExternalAppApproval")) {
                    entitySchema = next;
                    break;
                }
            }
            entitySchema = entitySchema;
        }
        if (entitySchema != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m121949a(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$isMeetingRoomApproval");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection schemaCollection = calendarEventAttendee.getSchemaCollection();
        if (schemaCollection == null || !m121950a(schemaCollection)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m121950a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection r3) {
        /*
            if (r3 == 0) goto L_0x0034
            java.util.List r3 = r3.getUiItems()
            if (r3 == 0) goto L_0x0034
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.next()
            com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema r0 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema) r0
            java.lang.String r1 = r0.getUniqueName()
            java.lang.String r2 = "ExternalAppApproval"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r1 != 0) goto L_0x0032
            java.lang.String r0 = r0.getUniqueName()
            java.lang.String r1 = "ExternalAppConditionalApproval"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L_0x000e
        L_0x0032:
            r3 = 1
            return r3
        L_0x0034:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c.m121950a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection):boolean");
    }

    /* renamed from: a */
    public static final Pair<Boolean, NeedApprovalType> m121947a(CalendarResource calendarResource, Long l) {
        List<EntitySchema> list;
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$isNeedApprovalRequestWithOutRRule");
        CalendarSchemaCollection calendarSchemaCollection = calendarResource.resource_schema;
        if (calendarSchemaCollection != null) {
            list = calendarSchemaCollection.entity_schemas;
        } else {
            list = null;
        }
        List<EntitySchema> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return TuplesKt.to(false, NeedApprovalType.TOTAL);
        }
        SchemaExtraData.ApprovalTrigger b = m121951b(calendarResource);
        for (EntitySchema entitySchema : list) {
            if (Intrinsics.areEqual("ExternalAppApproval", entitySchema.unique_name)) {
                return TuplesKt.to(true, NeedApprovalType.TOTAL);
            }
            if (!(!Intrinsics.areEqual("ExternalAppConditionalApproval", entitySchema.unique_name) || b == null || l == null)) {
                long longValue = l.longValue();
                Long l2 = b.duration_trigger;
                Intrinsics.checkExpressionValueIsNotNull(l2, "approvalTrigger.duration_trigger");
                if (longValue >= l2.longValue()) {
                    return TuplesKt.to(true, NeedApprovalType.TIME_LIMITED);
                }
            }
        }
        return TuplesKt.to(false, NeedApprovalType.TOTAL);
    }
}
