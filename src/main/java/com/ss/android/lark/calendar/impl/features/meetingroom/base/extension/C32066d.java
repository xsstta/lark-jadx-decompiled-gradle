package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u0005¨\u0006\b"}, d2 = {"editNewFormData", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "newResourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "getResourceCustomizationData", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.d */
public final class C32066d {
    /* renamed from: a */
    public static final SchemaExtraData.ResourceCustomization m121953a(CalendarResource calendarResource) {
        List<SchemaExtraData.BizData> list;
        T t;
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$getResourceCustomizationData");
        SchemaExtraData schemaExtraData = calendarResource.schema_extra_data;
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
            if (t.type == SchemaExtraData.Type.RESOURCE_CUSTOMIZATION) {
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
        if (t2 != null) {
            return t2.resource_customization;
        }
        return null;
    }

    /* renamed from: a */
    public static final SchemaExtraData.ResourceCustomization m121954a(CalendarEventAttendee calendarEventAttendee) {
        List<SchemaExtraData.BizData> bizDataList;
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$getResourceCustomizationData");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
        if (schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null) {
            return null;
        }
        for (T t : bizDataList) {
            if (t.getType() == SchemaExtraData.Type.RESOURCE_CUSTOMIZATION) {
                return t.getResourceCustomization();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m121955a(CalendarEventAttendee calendarEventAttendee, SchemaExtraData.ResourceCustomization resourceCustomization) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$editNewFormData");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "newResourceCustomization");
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
        if (schemaExtraData != null) {
            m121956a(schemaExtraData, resourceCustomization);
        }
    }

    /* renamed from: a */
    public static final CalendarResource m121952a(CalendarResource calendarResource, SchemaExtraData.ResourceCustomization resourceCustomization) {
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$editNewFormData");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "newResourceCustomization");
        com.bytedance.lark.pb.calendar.v1.SchemaExtraData schemaExtraData = calendarResource.schema_extra_data;
        if (schemaExtraData == null) {
            return calendarResource;
        }
        Intrinsics.checkExpressionValueIsNotNull(schemaExtraData, "schema_extra_data ?: return this");
        List<SchemaExtraData.BizData> list = schemaExtraData.biz_data;
        if (list == null) {
            return calendarResource;
        }
        List<SchemaExtraData.BizData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            if (t.type == SchemaExtraData.Type.RESOURCE_CUSTOMIZATION) {
                t = t.newBuilder().mo57587a(resourceCustomization).build();
            }
            arrayList.add(t);
        }
        CalendarResource a = calendarResource.newBuilder().mo56431a(schemaExtraData.newBuilder().mo57623a(arrayList).build()).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "newBuilder().schema_extr…ataList).build()).build()");
        return a;
    }

    /* renamed from: a */
    public static final void m121956a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData, SchemaExtraData.ResourceCustomization resourceCustomization) {
        T t;
        boolean z;
        Intrinsics.checkParameterIsNotNull(schemaExtraData, "$this$editNewFormData");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "newResourceCustomization");
        Iterator<T> it = schemaExtraData.getBizDataList().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == SchemaExtraData.Type.RESOURCE_CUSTOMIZATION) {
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
        if (t2 != null) {
            t2.setResourceCustomization(resourceCustomization);
        }
    }
}
