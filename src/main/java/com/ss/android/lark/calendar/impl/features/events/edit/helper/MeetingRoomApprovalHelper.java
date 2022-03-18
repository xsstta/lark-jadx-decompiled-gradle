package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\"\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\u0004\u0018\u00010\n*\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/MeetingRoomApprovalHelper;", "", "()V", "getApprovalRequest", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData$BizData;", "schemaExtraData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SchemaExtraData;", "getTriggerHourNumStr", "", "trigger", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "hasApprovalRequest", "", "isNeedTriggerApproval", "schemaCollection", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;", "eventDuration", "", "getApprovalTrigger", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.e */
public final class MeetingRoomApprovalHelper {

    /* renamed from: a */
    public static final MeetingRoomApprovalHelper f79933a = new MeetingRoomApprovalHelper();

    private MeetingRoomApprovalHelper() {
    }

    /* renamed from: b */
    public final boolean mo114618b(SchemaExtraData schemaExtraData) {
        if (mo114619c(schemaExtraData) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo114617a(SchemaExtraData.ApprovalTrigger approvalTrigger) {
        Long l;
        String valueOf;
        if (approvalTrigger == null || (l = approvalTrigger.duration_trigger) == null || (valueOf = String.valueOf(l.longValue() / ((long) 3600))) == null) {
            return "";
        }
        return valueOf;
    }

    /* renamed from: a */
    public final SchemaExtraData.ApprovalTrigger mo114616a(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        T t;
        SchemaExtraData.ResourceApprovalInfo approvalInfo;
        boolean z;
        Intrinsics.checkParameterIsNotNull(schemaExtraData, "$this$getApprovalTrigger");
        Iterator<T> it = schemaExtraData.getBizDataList().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == SchemaExtraData.Type.RESOURCE_APPROVAL_INFO) {
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
        if (t2 == null || (approvalInfo = t2.getApprovalInfo()) == null) {
            return null;
        }
        return approvalInfo.trigger;
    }

    /* renamed from: c */
    public final SchemaExtraData.BizData mo114619c(com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData) {
        List<SchemaExtraData.BizData> bizDataList;
        boolean z;
        T t = null;
        if (schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null) {
            return null;
        }
        Iterator<T> it = bizDataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getType() == SchemaExtraData.Type.APPROVAL_REQUEST) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return t;
    }
}
