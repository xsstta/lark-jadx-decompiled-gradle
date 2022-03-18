package com.ss.android.lark.calendar.impl.utils;

import com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection;
import com.bytedance.lark.pb.calendar.v1.EntitySchema;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.android.gms.stats.CodePackage;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/SchemaHelper;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.ah */
public final class SchemaHelper {

    /* renamed from: a */
    public static final Companion f83746a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010'\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!J=\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0)2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020%¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u00101\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u000102R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/SchemaHelper$Companion;", "", "()V", "ATTACHMENT", "", "ATTENDEE", "CALENDAR", "COLOR", "DELETE", "DESCRIPTION", "EDIT_ICON", "EXTERNAL_APP_CONDITIONAL_APPROVAL", "EXTERNAl_APP_APPROVAL", "FORWARD", "FREE_BUSY", CodePackage.LOCATION, "MEETING_CHAT", "MEETING_MINUTES", "MEETING_ROOM", "MEETING_VIDEO", "ORGANIZER_OR_CREATOR", "REMINDER", "REPORT", "RRULE", "RSVP", "RSVP_REPLY", "SCOPE", "TIME", "TITLE", "TRANSFER", "getItemAppLink", "uniqueName", "schemaCollection", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;", "getMeetingRoomApprovalType", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "isItemEditable", "", "isItemVisible", "isMeetingRoomApproval", "isMeetingRoomNeedApprovalRequest", "Lkotlin/Pair;", "approvalTrigger", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;", "eventDuration", "", "isRepeatOrExceptionEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSchemaCollection;Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ApprovalTrigger;Ljava/lang/Long;Z)Lkotlin/Pair;", "isShowApprovalLabel", "isShowApprovalLabelPb", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSchemaCollection;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.ah$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo120311a(CalendarSchemaCollection calendarSchemaCollection) {
            List<EntitySchema> list;
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

        /* renamed from: b */
        public final boolean mo120314b(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection calendarSchemaCollection) {
            List<com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema> list;
            if (calendarSchemaCollection != null) {
                list = calendarSchemaCollection.getUiItems();
            } else {
                list = null;
            }
            if (list != null && !calendarSchemaCollection.getUiItems().isEmpty()) {
                for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                    if (Intrinsics.areEqual("ExternalAppApproval", entitySchema.getUniqueName())) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo120312a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x0007
                java.util.List r0 = r5.getUiItems()
                goto L_0x0008
            L_0x0007:
                r0 = 0
            L_0x0008:
                r1 = 0
                if (r0 == 0) goto L_0x0044
                java.util.List r0 = r5.getUiItems()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0016
                goto L_0x0044
            L_0x0016:
                java.util.List r5 = r5.getUiItems()
                java.util.Iterator r5 = r5.iterator()
            L_0x001e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0044
                java.lang.Object r0 = r5.next()
                com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema r0 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema) r0
                java.lang.String r2 = r0.getUniqueName()
                java.lang.String r3 = "ExternalAppApproval"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
                if (r2 != 0) goto L_0x0042
                java.lang.String r0 = r0.getUniqueName()
                java.lang.String r2 = "ExternalAppConditionalApproval"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 == 0) goto L_0x001e
            L_0x0042:
                r5 = 1
                return r5
            L_0x0044:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.utils.SchemaHelper.Companion.mo120312a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection):boolean");
        }

        /* renamed from: c */
        public final String mo120316c(String str, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection calendarSchemaCollection) {
            List<com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema> list;
            Intrinsics.checkParameterIsNotNull(str, "uniqueName");
            if (calendarSchemaCollection != null) {
                list = calendarSchemaCollection.getUiItems();
            } else {
                list = null;
            }
            if (list != null && !calendarSchemaCollection.getUiItems().isEmpty()) {
                for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                    if (Intrinsics.areEqual(str, entitySchema.getUniqueName())) {
                        return entitySchema.getAppLink();
                    }
                }
            }
            return "";
        }

        /* renamed from: b */
        public final boolean mo120315b(String str, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection calendarSchemaCollection) {
            List<com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema> list;
            Intrinsics.checkParameterIsNotNull(str, "uniqueName");
            if (calendarSchemaCollection != null) {
                list = calendarSchemaCollection.getUiItems();
            } else {
                list = null;
            }
            if (list == null || calendarSchemaCollection.getUiItems().isEmpty()) {
                return true;
            }
            for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                if (Intrinsics.areEqual(str, entitySchema.getUniqueName())) {
                    if (entitySchema.getUiLevel() == EntitySchema.ItemUILevel.EDITABLE) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo120313a(String str, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection calendarSchemaCollection) {
            List<com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema> list;
            Intrinsics.checkParameterIsNotNull(str, "uniqueName");
            if (calendarSchemaCollection != null) {
                list = calendarSchemaCollection.getUiItems();
            } else {
                list = null;
            }
            if (list == null || calendarSchemaCollection.getUiItems().isEmpty()) {
                return true;
            }
            for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                if (Intrinsics.areEqual(str, entitySchema.getUniqueName())) {
                    if (entitySchema.getUiLevel() != EntitySchema.ItemUILevel.HIDE) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final Pair<Boolean, NeedApprovalType> mo120310a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection calendarSchemaCollection, SchemaExtraData.ApprovalTrigger approvalTrigger, Long l, boolean z) {
            List<com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema> list;
            if (calendarSchemaCollection != null) {
                list = calendarSchemaCollection.getUiItems();
            } else {
                list = null;
            }
            if (list == null || calendarSchemaCollection.getUiItems().isEmpty()) {
                return TuplesKt.to(false, NeedApprovalType.TOTAL);
            }
            for (com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema entitySchema : calendarSchemaCollection.getUiItems()) {
                if (Intrinsics.areEqual("ExternalAppApproval", entitySchema.getUniqueName())) {
                    return TuplesKt.to(true, NeedApprovalType.TOTAL);
                }
                if (Intrinsics.areEqual("ExternalAppConditionalApproval", entitySchema.getUniqueName()) && !z && approvalTrigger != null && l != null) {
                    long longValue = l.longValue();
                    Long l2 = approvalTrigger.duration_trigger;
                    Intrinsics.checkExpressionValueIsNotNull(l2, "approvalTrigger.duration_trigger");
                    if (longValue >= l2.longValue()) {
                        return TuplesKt.to(true, NeedApprovalType.TIME_LIMITED);
                    }
                }
            }
            return TuplesKt.to(false, NeedApprovalType.TOTAL);
        }
    }
}
