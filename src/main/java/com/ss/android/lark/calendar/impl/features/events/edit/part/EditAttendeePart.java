package com.ss.android.lark.calendar.impl.features.events.edit.part;

import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditAttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.model.IAttendeePartListener;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventAttendeeUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32662o;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010J\u001a\u00020K2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\u0006\u0010M\u001a\u00020\u00122\b\b\u0002\u0010N\u001a\u00020\u001fH\u0002J\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u0010\u0010Q\u001a\u00020K2\b\u0010R\u001a\u0004\u0018\u00010SJ\u0016\u0010T\u001a\u00020K2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005J4\u0010W\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00122\"\u0010X\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Z0Yj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Z`[H\u0002J$\u0010\\\u001a\u00020K2\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006H\u0002J \u0010^\u001a\u00020K2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006H\u0002J2\u0010_\u001a\u00020K2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\b\u0010`\u001a\u0004\u0018\u00010\u00122\u0006\u0010a\u001a\u00020\u001fH\u0002J\u0016\u0010b\u001a\u00020\u001f2\u0006\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\u001fJ\u001e\u0010e\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120@2\u0006\u0010f\u001a\u00020\u001fH\u0002J\u0006\u0010g\u001a\u00020KJ\b\u0010h\u001a\u00020KH\u0002J\u001e\u0010i\u001a\u00020K2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006J\u0016\u0010j\u001a\u0012\u0012\u0004\u0012\u00020Z0\u0004j\b\u0012\u0004\u0012\u00020Z`\u0006J\u0016\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006J\u000e\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00120@H\u0002J\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@J&\u0010n\u001a\u00020-2\u0006\u0010c\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\u001f2\u0006\u0010o\u001a\u00020-2\u0006\u0010p\u001a\u00020\u001fJ\u001a\u0010q\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@\u0018\u00010GJ\u0006\u0010r\u001a\u00020\u0005J\u0006\u0010s\u001a\u00020\u0005J.\u0010t\u001a\u0012\u0012\u0004\u0012\u00020u0\u0004j\b\u0012\u0004\u0012\u00020u`\u00062\u0006\u0010v\u001a\u00020\u001f2\u0006\u0010w\u001a\u00020\u001f2\u0006\u0010x\u001a\u00020\u0005JF\u0010y\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\u0016\u0010z\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0016\u0010{\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0016\u0010|\u001a\u0012\u0012\u0004\u0012\u00020:0\u0004j\b\u0012\u0004\u0012\u00020:`\u0006JA\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\u0016\u0010~\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\b\u0010\u001a\u0004\u0018\u00010S2\u0007\u0010\u0001\u001a\u00020\u001fJ \u0010\u0001\u001a\u00020\u001f2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006Je\u0010\u0001\u001a\u00020\u001f2#\u0010\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120Yj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012`[2\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\u001f2\u0006\u0010p\u001a\u00020\u001fJ\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006J\u0007\u0010\u0001\u001a\u00020\u001fJ\u0019\u0010\u0001\u001a\u00020\u001f2\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u001fH\u0002J\u001d\u0010\u0001\u001a\u00020\u001f2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120@2\u0006\u0010p\u001a\u00020\u001fJ)\u0010\u0001\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u00122\u0006\u0010w\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020\u001f2\u0006\u0010x\u001a\u00020\u0005H\u0002J!\u0010\u0001\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u00122\u0006\u0010v\u001a\u00020\u001f2\u0006\u0010x\u001a\u00020\u0005H\u0002J\u0011\u0010\u0001\u001a\u00020K2\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0017\u0010\u0001\u001a\u00020K2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@J\u001f\u0010\u0001\u001a\u00020K2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006J7\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020\u00122#\u0010\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:0Yj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:`[H\u0002J\u0007\u0010\u0001\u001a\u00020KJ\u0019\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020\u00052\u0007\u0010\u0001\u001a\u00020\u0005J]\u0010\u0001\u001a\u00020K2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u00062\u001a\u0010]\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\u0006\u0010f\u001a\u00020\u001fH\u0002J\t\u0010\u0001\u001a\u00020KH\u0002J\t\u0010\u0001\u001a\u00020KH\u0002J\u001f\u0010\u0001\u001a\u00020K2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006J\u001a\u0010\u0001\u001a\u00020K2\u0006\u0010M\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020SH\u0002J\u0007\u0010\u0001\u001a\u00020KJ\u001d\u0010\u0001\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120@2\u0006\u0010f\u001a\u00020\u001fR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u000e¢\u0006\u0002\n\u0000R*\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0004j\b\u0012\u0004\u0012\u00020\u0012`\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001a\u00105\u001a\u00020-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010F\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@\u0018\u00010GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>¨\u0006¡\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditAttendeePart;", "", "()V", "attendeeIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAttendeeIds$calendar_impl_release", "()Ljava/util/ArrayList;", "setAttendeeIds$calendar_impl_release", "(Ljava/util/ArrayList;)V", "attendeePartListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/IAttendeePartListener;", "getAttendeePartListener$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/IAttendeePartListener;", "setAttendeePartListener$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/IAttendeePartListener;)V", "chosenCalendarAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getChosenCalendarAttendee$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "setChosenCalendarAttendee$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;)V", "displayAttendees", "getDisplayAttendees$calendar_impl_release", "setDisplayAttendees$calendar_impl_release", "editorAttendee", "getEditorAttendee$calendar_impl_release", "setEditorAttendee$calendar_impl_release", "exceedLimitMeetingGroup", "hasLoadedIndividualAttendeeError", "", "getHasLoadedIndividualAttendeeError", "()Z", "setHasLoadedIndividualAttendeeError", "(Z)V", "hasLoadedIndividualAttendeeSuccess", "getHasLoadedIndividualAttendeeSuccess", "setHasLoadedIndividualAttendeeSuccess", "mAttendees", "mOriginalAllAttendees", "getMOriginalAllAttendees", "setMOriginalAllAttendees", "mOriginalAttendees", "maxAttendeeNum", "", "getMaxAttendeeNum$calendar_impl_release", "()I", "setMaxAttendeeNum$calendar_impl_release", "(I)V", "maxDepartmentAttendeeNum", "getMaxDepartmentAttendeeNum$calendar_impl_release", "setMaxDepartmentAttendeeNum$calendar_impl_release", "maxTimeZoneAttendeeNum", "getMaxTimeZoneAttendeeNum", "setMaxTimeZoneAttendeeNum", "originalGroupMemberAttendeeData", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "getOriginalGroupMemberAttendeeData", "()Ljava/util/Map;", "setOriginalGroupMemberAttendeeData", "(Ljava/util/Map;)V", "simpleAttendeeList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "getSimpleAttendeeList", "()Ljava/util/List;", "setSimpleAttendeeList", "(Ljava/util/List;)V", "simpleAttendeeMap", "", "getSimpleAttendeeMap", "setSimpleAttendeeMap", "addAttendeeToList", "", "attendees", "attendee", "addToFirst", "addChosenCalendarAttendeeWhenEmptyList", "addChosenCalendarAttendeeWhenNotEmpty", "addChosenExchangeCalendarAttendee", "externalCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "addExchangePrimaryCalendarId", "calendarExternalAccount", "exchangePrimaryId", "addGroupAttendeeBaseData", "attendeeListResult", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/HashMap;", "addMailAttendee", "emails", "addOrganizerOrCreatorWhenCreate", "addOrganizerWhenEdit", "organizer", "isShareCalendar", "canCorrectCalculateAttendeeNum", "isNeedLoadSimpleMember", "hasAllIndividualAttendees", "changeEditorOrOrganizerStatus", "isCreateEvent", "clearExchangeAttendeesCalendarId", "clearNewAddAndRemove", "createAttendeesForEdit", "getAttendeeBaseDataAfterBreakUp", "getAttendees", "getAttendeesAfterClearRemove", "getAttendeesWithoutEmail", "getCurrentAttendeeNum", "infoAttendeeNum", "isExternalEvent", "getEventCurrentSimpleMembers", "getExceedLimitMeetingGroupNameText", "getExceedLimitMeetingGroupTipText", "getExternalAttendeeDatas", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "isExchangeEvent", "isEventGuestCanInvite", "exchangeCalendarName", "getExternalDisplayAttendees", "addExternalEmails", "deleteExternalEmails", "getFilterShowAttendeesForTimeZone", "getGoogleAttendeeAfterMerge", "newAttendees", "googlePrimaryCalendar", "isAddInEmpty", "getIsAddEmptyAfterUpdateExternalAttendees", "externalDisplayAttendees", "getIsOutMaxNumAfterUpdateAttendee", "calendarEventAttendeeMap", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "isEditEvent", "getShowAttendees", "hasLoadedIndividualAttendeeResult", "isOrganizerEditorEqualWhenShareCalendar", "isOutnumberMaxAttended", "isShowDeleteButton", "judgeShowDeleteBtnByExchange", "orderlyAddAttendee", "pullAllIndividualAttendees", "putExceedLimitMeetingGroupText", "setTimeZoneGroupAttendeeBaseInfo", "groupAttendee", "attendeesMap", "updateAttendeeIds", "updateAttendeeStatusByCalendar", "originalName", "targetName", "updateAttendees", "updateAttendeesIfNotInAddList", "updateAttendeesInAddList", "updateDisplayAttendees", "updateExternalAttendeeDataByCalendar", "calendar", "updateExternalAttendeeIds", "updateGoogleAttendees", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.a */
public final class EditAttendeePart {

    /* renamed from: a */
    public static final Companion f81274a = new Companion(null);

    /* renamed from: b */
    private ArrayList<CalendarEventAttendee> f81275b = new ArrayList<>();

    /* renamed from: c */
    private CalendarEventAttendee f81276c;

    /* renamed from: d */
    private CalendarEventAttendee f81277d;

    /* renamed from: e */
    private ArrayList<String> f81278e = new ArrayList<>();

    /* renamed from: f */
    private int f81279f = 2000;

    /* renamed from: g */
    private int f81280g = 1000;

    /* renamed from: h */
    private IAttendeePartListener f81281h;

    /* renamed from: i */
    private ArrayList<CalendarEventAttendee> f81282i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<CalendarEventAttendee> f81283j = new ArrayList<>();

    /* renamed from: k */
    private final ArrayList<CalendarEventAttendee> f81284k = new ArrayList<>();

    /* renamed from: l */
    private Map<String, ? extends List<SimpleMember>> f81285l;

    /* renamed from: m */
    private List<SimpleMember> f81286m;

    /* renamed from: n */
    private Map<String, UserAttendeeBaseInfo> f81287n;

    /* renamed from: o */
    private int f81288o = LocationRequest.PRIORITY_INDOOR;

    /* renamed from: p */
    private ArrayList<CalendarEventAttendee> f81289p = new ArrayList<>();

    /* renamed from: q */
    private boolean f81290q;

    /* renamed from: r */
    private boolean f81291r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditAttendeePart$Companion;", "", "()V", "PLACEHOLDER_NAME", "", "PLACEHOLDER_NUMBER", "getClearAttendeeNewAttendeePart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditAttendeePart;", "oldEditAttendeePart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EditAttendeePart mo116275a(EditAttendeePart aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "oldEditAttendeePart");
            EditAttendeePart aVar2 = new EditAttendeePart();
            aVar2.mo116236a(aVar.mo116259j());
            aVar2.mo116246b(aVar.mo116260k());
            return aVar2;
        }
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo116223a() {
        return this.f81275b;
    }

    /* renamed from: b */
    public final CalendarEventAttendee mo116239b() {
        return this.f81276c;
    }

    /* renamed from: c */
    public final ArrayList<String> mo116248c() {
        return this.f81278e;
    }

    /* renamed from: d */
    public final int mo116251d() {
        return this.f81279f;
    }

    /* renamed from: e */
    public final int mo116253e() {
        return this.f81280g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.y>>, java.util.Map<java.lang.String, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.y>> */
    /* renamed from: f */
    public final Map<String, List<SimpleMember>> mo116255f() {
        return this.f81285l;
    }

    /* renamed from: g */
    public final List<SimpleMember> mo116256g() {
        return this.f81286m;
    }

    /* renamed from: h */
    public final int mo116257h() {
        return this.f81288o;
    }

    /* renamed from: i */
    public final ArrayList<CalendarEventAttendee> mo116258i() {
        return this.f81289p;
    }

    /* renamed from: j */
    public final boolean mo116259j() {
        return this.f81290q;
    }

    /* renamed from: k */
    public final boolean mo116260k() {
        return this.f81291r;
    }

    /* renamed from: a */
    public final void mo116230a(CalendarEventAttendee calendarEventAttendee) {
        this.f81276c = calendarEventAttendee;
    }

    /* renamed from: a */
    public final void mo116232a(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f81278e = arrayList;
    }

    /* renamed from: a */
    public final void mo116228a(IAttendeePartListener aVar) {
        this.f81281h = aVar;
    }

    /* renamed from: a */
    public final void mo116235a(Map<String, ? extends List<SimpleMember>> map) {
        this.f81285l = map;
    }

    /* renamed from: a */
    public final void mo116233a(List<SimpleMember> list) {
        this.f81286m = list;
    }

    /* renamed from: a */
    public final void mo116236a(boolean z) {
        this.f81290q = z;
    }

    /* renamed from: a */
    public final boolean mo116237a(HashMap<String, CalendarEventAttendee> hashMap, ArrayList<String> arrayList, CalendarEvent calendarEvent, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(hashMap, "calendarEventAttendeeMap");
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.keySet());
        ArrayList<CalendarEventAttendee> arrayList3 = new ArrayList<>(hashMap.values());
        if (!z) {
            m121114g(arrayList3);
        } else {
            m121104a(arrayList3, calendarEvent != null ? calendarEvent.getUIOrganizer() : null, calendarEvent != null ? calendarEvent.isShareCalendar() : false);
        }
        if (mo116247b(arrayList3, z2)) {
            mo116261l();
            return true;
        }
        IAttendeePartListener aVar = this.f81281h;
        if (aVar != null) {
            aVar.mo114632a();
        }
        m121105a(arrayList2, arrayList3, arrayList, !z);
        mo116261l();
        return false;
    }

    /* renamed from: a */
    public final void mo116234a(List<? extends CalendarEventAttendee> list, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        m121112c(list, z);
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) list.get(i);
            int size2 = this.f81283j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                CalendarEventAttendee calendarEventAttendee2 = this.f81283j.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "mAttendees[j]");
                CalendarEventAttendee calendarEventAttendee3 = calendarEventAttendee2;
                if (Intrinsics.areEqual(calendarEventAttendee3.getEmail(), calendarEventAttendee.getEmail())) {
                    String email = calendarEventAttendee.getEmail();
                    CalendarEventAttendee calendarEventAttendee4 = this.f81277d;
                    if (!Intrinsics.areEqual(email, calendarEventAttendee4 != null ? calendarEventAttendee4.getEmail() : null) || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                        calendarEventAttendee3.setStatus(calendarEventAttendee.getStatus());
                    } else {
                        calendarEventAttendee3.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    }
                }
            }
            Iterator<CalendarEventAttendee> it = this.f81283j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                CalendarEventAttendee next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, AbstractC60044a.f149675a);
                if (next.getEmail() != null && Intrinsics.areEqual(next.getEmail(), calendarEventAttendee.getEmail())) {
                    break;
                }
            }
            if (!z3) {
                this.f81283j.add(calendarEventAttendee);
            }
            i++;
        }
        Iterator<CalendarEventAttendee> it2 = this.f81283j.iterator();
        while (it2.hasNext()) {
            CalendarEventAttendee next2 = it2.next();
            Iterator<? extends CalendarEventAttendee> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                Intrinsics.checkExpressionValueIsNotNull(next2, "attendee");
                if (Intrinsics.areEqual(next2.getEmail(), ((CalendarEventAttendee) it3.next()).getEmail())) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                Intrinsics.checkExpressionValueIsNotNull(next2, "attendee");
                next2.setStatus(CalendarEventAttendee.Status.REMOVED);
            }
        }
        this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo116224a(ArrayList<CalendarEventAttendee> arrayList, Calendar calendar, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(arrayList, "newAttendees");
        boolean z3 = true;
        if (calendar != null) {
            Iterator<CalendarEventAttendee> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                CalendarEventAttendee next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (Intrinsics.areEqual(next.getEmail(), calendar.getExternalAccount())) {
                    if (next.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION) {
                        this.f81277d = next;
                        next.setAttendeeCalendarId(calendar.getServerId());
                        next.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    }
                    z2 = true;
                }
            }
            if (!z2 && this.f81277d == null) {
                CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
                this.f81277d = calendarEventAttendee;
                m121102a(calendarEventAttendee, calendar);
            }
        }
        if (CollectionUtils.isNotEmpty(arrayList)) {
            ArrayList<CalendarEventAttendee> o = mo116264o();
            CalendarEventAttendee calendarEventAttendee2 = this.f81277d;
            if (calendarEventAttendee2 != null && z && !EventAttendeeUtils.f80183a.mo114853a(o, calendarEventAttendee2)) {
                CalendarEventAttendee calendarEventAttendee3 = null;
                Iterator<CalendarEventAttendee> it2 = o.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CalendarEventAttendee next2 = it2.next();
                    Intrinsics.checkExpressionValueIsNotNull(next2, AbstractC60044a.f149675a);
                    if (Intrinsics.areEqual(next2.getEmail(), calendarEventAttendee2.getEmail())) {
                        calendarEventAttendee3 = next2;
                        break;
                    }
                }
                if (calendarEventAttendee3 == null) {
                    calendarEventAttendee2.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    Iterator<CalendarEventAttendee> it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z3 = false;
                            break;
                        }
                        CalendarEventAttendee next3 = it3.next();
                        Intrinsics.checkExpressionValueIsNotNull(next3, "attendee");
                        if (Intrinsics.areEqual(next3.getEmail(), calendarEventAttendee2.getEmail())) {
                            break;
                        }
                    }
                    if (!z3) {
                        arrayList.add(calendarEventAttendee2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo116229a(Calendar calendar) {
        if (calendar != null) {
            boolean z = false;
            for (T t : this.f81283j) {
                if (t.isThirdParty() && Intrinsics.areEqual(t.getLocalizedDisplayName(), calendar.getExternalAccount())) {
                    z = true;
                }
            }
            if (!z) {
                CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
                this.f81277d = calendarEventAttendee;
                m121102a(calendarEventAttendee, calendar);
                this.f81283j.add(calendarEventAttendee);
                this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
            }
        }
    }

    /* renamed from: a */
    public final void mo116231a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "originalName");
        Intrinsics.checkParameterIsNotNull(str2, "targetName");
        for (T t : this.f81283j) {
            if (Intrinsics.areEqual(t.getLocalizedDisplayName(), str) && t.getStatus() == CalendarEventAttendee.Status.ACCEPT) {
                t.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
            }
            if (Intrinsics.areEqual(t.getLocalizedDisplayName(), str2) && t.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION) {
                t.setStatus(CalendarEventAttendee.Status.ACCEPT);
            }
        }
    }

    /* renamed from: a */
    public final ArrayList<AddMailAttendeeData> mo116226a(boolean z, boolean z2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "exchangeCalendarName");
        ArrayList<AddMailAttendeeData> arrayList = new ArrayList<>();
        ArrayList<CalendarEventAttendee> arrayList2 = new ArrayList();
        for (T t : this.f81275b) {
            if (t.isThirdParty()) {
                arrayList2.add(t);
            }
        }
        for (CalendarEventAttendee calendarEventAttendee : arrayList2) {
            boolean a = m121108a(calendarEventAttendee, z2, z, str);
            String localizedDisplayName = calendarEventAttendee.getLocalizedDisplayName();
            Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName, "attendee.localizedDisplayName");
            arrayList.add(new AddMailAttendeeData(localizedDisplayName, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo116225a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "addExternalEmails");
        Intrinsics.checkParameterIsNotNull(arrayList2, "deleteExternalEmails");
        ArrayList<CalendarEventAttendee> arrayList3 = new ArrayList<>(this.f81275b);
        for (T t : arrayList) {
            CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
            calendarEventAttendee.setLocalizedDisplayName(t);
            calendarEventAttendee.setAttendeeCalendarId("");
            calendarEventAttendee.setDisplayName(t);
            calendarEventAttendee.setEmail(t);
            calendarEventAttendee.setThirdParty(true);
            calendarEventAttendee.setId("");
            calendarEventAttendee.setLarkId("");
            arrayList3.add(calendarEventAttendee);
        }
        for (T t2 : arrayList2) {
            ArrayList<CalendarEventAttendee> arrayList4 = new ArrayList();
            for (T t3 : arrayList3) {
                T t4 = t3;
                Intrinsics.checkExpressionValueIsNotNull(t4, "it");
                if (Intrinsics.areEqual(t4.getLocalizedDisplayName(), t2)) {
                    arrayList4.add(t3);
                }
            }
            for (CalendarEventAttendee calendarEventAttendee2 : arrayList4) {
                arrayList3.remove(calendarEventAttendee2);
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    public final boolean mo116238a(boolean z, boolean z2) {
        if (z2) {
            if (!z) {
                return true;
            }
            Map<String, ? extends List<SimpleMember>> map = this.f81285l;
            if (!(map == null || map.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final ArrayList<CalendarEventAttendee> mo116264o() {
        m121098A();
        return this.f81283j;
    }

    /* renamed from: m */
    public final ArrayList<CalendarEventAttendee> mo116262m() {
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
        arrayList.addAll(this.f81275b);
        return arrayList;
    }

    /* renamed from: w */
    public final boolean mo116272w() {
        if (this.f81290q || this.f81291r) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void mo116270u() {
        Iterator<T> it = this.f81283j.iterator();
        while (it.hasNext()) {
            it.next().setAttendeeCalendarId("");
        }
    }

    /* renamed from: A */
    private final void m121098A() {
        int i = 0;
        while (i < this.f81283j.size()) {
            CalendarEventAttendee calendarEventAttendee = this.f81283j.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "mAttendees[i]");
            CalendarEventAttendee calendarEventAttendee2 = calendarEventAttendee;
            if (!this.f81282i.contains(calendarEventAttendee2) && calendarEventAttendee2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                this.f81283j.remove(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: z */
    private final List<CalendarEventAttendee> m121115z() {
        int i = 0;
        while (i < this.f81283j.size()) {
            CalendarEventAttendee calendarEventAttendee = this.f81283j.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "mAttendees[i]");
            CalendarEventAttendee calendarEventAttendee2 = calendarEventAttendee;
            if (!this.f81282i.contains(calendarEventAttendee2) && calendarEventAttendee2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                this.f81283j.remove(i);
                i--;
            }
            i++;
        }
        return this.f81283j;
    }

    /* renamed from: p */
    public final List<CalendarEventAttendee> mo116265p() {
        ArrayList arrayList = new ArrayList();
        for (T t : mo116264o()) {
            if (!t.isThirdParty()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void mo116266q() {
        this.f81278e.clear();
        Iterator<CalendarEventAttendee> it = this.f81275b.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            ArrayList<String> arrayList = this.f81278e;
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            arrayList.add(next.getLarkId());
        }
    }

    /* renamed from: s */
    public final void mo116268s() {
        CalendarEventAttendee calendarEventAttendee = this.f81277d;
        if (calendarEventAttendee != null && CollectionUtils.isEmpty(this.f81283j)) {
            calendarEventAttendee.setStatus(CalendarEventAttendee.Status.ACCEPT);
            this.f81283j.add(calendarEventAttendee);
            this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
            mo116261l();
        }
    }

    /* renamed from: t */
    public final void mo116269t() {
        CalendarEventAttendee calendarEventAttendee = this.f81277d;
        if (calendarEventAttendee != null && !this.f81283j.contains(calendarEventAttendee)) {
            calendarEventAttendee.setStatus(CalendarEventAttendee.Status.ACCEPT);
            this.f81283j.add(calendarEventAttendee);
            this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
            mo116261l();
        }
    }

    /* renamed from: B */
    private final void m121099B() {
        Iterator<CalendarEventAttendee> it = this.f81283j.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            boolean z = false;
            Iterator<CalendarEventAttendee> it2 = this.f81275b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CalendarEventAttendee next2 = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next2, AbstractC60044a.f149675a);
                String email = next2.getEmail();
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (Intrinsics.areEqual(email, next.getEmail())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (next.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                    next.setStatus(CalendarEventAttendee.Status.REMOVED);
                }
            }
        }
    }

    /* renamed from: C */
    private final void m121100C() {
        Iterator<CalendarEventAttendee> it = this.f81275b.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            boolean z = false;
            Iterator<CalendarEventAttendee> it2 = this.f81283j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CalendarEventAttendee next2 = it2.next();
                Intrinsics.checkExpressionValueIsNotNull(next2, "calendarEventAttendee");
                String email = next2.getEmail();
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (Intrinsics.areEqual(email, next.getEmail())) {
                    if (next2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                        next2.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
                    }
                    z = true;
                }
            }
            if (!z) {
                this.f81283j.add(next);
            }
        }
    }

    /* renamed from: l */
    public final void mo116261l() {
        if (CollectionUtils.isEmpty(this.f81278e)) {
            this.f81278e = new ArrayList<>();
        }
        this.f81278e.clear();
        Iterator<CalendarEventAttendee> it = this.f81275b.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            if (!TextUtils.isEmpty(next.getLarkId())) {
                this.f81278e.add(next.getLarkId());
            }
        }
    }

    /* renamed from: n */
    public final ArrayList<UserAttendeeBaseInfo> mo116263n() {
        ArrayList<UserAttendeeBaseInfo> arrayList = new ArrayList<>();
        if (CollectionUtils.isEmpty(this.f81275b)) {
            return arrayList;
        }
        HashMap<String, UserAttendeeBaseInfo> hashMap = new HashMap<>();
        Iterator<CalendarEventAttendee> it = this.f81275b.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
            if (next.isGroup() || !TextUtils.isEmpty(next.getTimeZoneId())) {
                if (CalendarEventAttendee.Category.USER == next.getCategory()) {
                    String attendeeCalendarId = next.getAttendeeCalendarId();
                    Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "attendee.attendeeCalendarId");
                    hashMap.put(attendeeCalendarId, EventAttendeeUtils.f80183a.mo114849a(next));
                } else if (next.isGroup() && next.isSelfInGroup()) {
                    m121103a(next, hashMap);
                }
            }
        }
        arrayList.addAll(hashMap.values());
        return arrayList;
    }

    /* renamed from: r */
    public final ArrayList<AbstractC30095b> mo116267r() {
        HashMap<String, AbstractC30095b> hashMap = new HashMap<>();
        Iterator<CalendarEventAttendee> it = this.f81275b.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            if (C32662o.m125351b(next)) {
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                m121109b(next, hashMap);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (!hashMap.containsKey(next.getAttendeeCalendarId())) {
                    String attendeeCalendarId = next.getAttendeeCalendarId();
                    Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "attendee.attendeeCalendarId");
                    hashMap.put(attendeeCalendarId, next);
                }
            }
        }
        return new ArrayList<>(hashMap.values());
    }

    /* renamed from: v */
    public final Map<String, List<SimpleMember>> mo116271v() {
        boolean z;
        HashMap hashMap = new HashMap();
        for (T t : this.f81275b) {
            if (t.isGroup()) {
                List<SimpleMember> a = EventAttendeeUtils.f80183a.mo114851a(t, this.f81285l);
                List<SimpleMember> list = a;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !hashMap.containsKey(t.getGroupId())) {
                    String groupId = t.getGroupId();
                    Intrinsics.checkExpressionValueIsNotNull(groupId, "it.groupId");
                    hashMap.put(groupId, a);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: x */
    public final String mo116273x() {
        int i = Integer.MAX_VALUE;
        for (T t : this.f81284k) {
            if (i > t.getShowMemberLimit()) {
                i = t.getShowMemberLimit();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("number", String.valueOf(i));
        hashMap.put("GroupName", "");
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_Edit_AddMeetingGroupMaxNum, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…ngGroupMaxNum, formatMap)");
        return mustacheFormat;
    }

    /* renamed from: y */
    public final String mo116274y() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (T t : this.f81284k) {
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(C32634ae.m125182b(R.string.Calendar_Common_DivideSymbol));
            }
            sb.append(t.getLocalizedDisplayName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "namesSb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final void mo116227a(int i) {
        this.f81279f = i;
    }

    /* renamed from: b */
    public final void mo116240b(int i) {
        this.f81280g = i;
    }

    /* renamed from: c */
    public final void mo116249c(int i) {
        this.f81288o = i;
    }

    /* renamed from: b */
    public final void mo116241b(CalendarEventAttendee calendarEventAttendee) {
        this.f81277d = calendarEventAttendee;
    }

    /* renamed from: c */
    public final boolean mo116250c(ArrayList<CalendarEventAttendee> arrayList) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(arrayList, "externalDisplayAttendees");
        this.f81275b = arrayList;
        if (EventAttendeeUtils.f80183a.mo114854b(this.f81283j) == 0) {
            z = true;
        } else {
            z = false;
        }
        m121099B();
        m121100C();
        return z;
    }

    /* renamed from: e */
    public final void mo116254e(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "exceedLimitMeetingGroup");
        this.f81284k.clear();
        this.f81284k.addAll(arrayList);
    }

    /* renamed from: c */
    private final void m121111c(CalendarEventAttendee calendarEventAttendee) {
        if (!calendarEventAttendee.isGroup()) {
            this.f81283j.add(calendarEventAttendee);
            return;
        }
        int size = this.f81283j.size();
        for (int i = 0; i < size; i++) {
            CalendarEventAttendee calendarEventAttendee2 = this.f81283j.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "mAttendees[index]");
            if (!calendarEventAttendee2.isGroup()) {
                this.f81283j.add(i, calendarEventAttendee);
                return;
            }
        }
        this.f81283j.add(calendarEventAttendee);
    }

    /* renamed from: g */
    private final void m121114g(ArrayList<CalendarEventAttendee> arrayList) {
        List<CalendarEventAttendee> z = m121115z();
        if (EventAttendeeUtils.f80183a.mo114854b(z) == 0) {
            CalendarEventAttendee calendarEventAttendee = this.f81277d;
            if (calendarEventAttendee == null || EventAttendeeUtils.f80183a.mo114855b(z, calendarEventAttendee)) {
                CalendarEventAttendee calendarEventAttendee2 = this.f81276c;
                if (calendarEventAttendee2 != null && this.f81277d == null && !EventAttendeeUtils.f80183a.mo114855b(z, calendarEventAttendee2)) {
                    m121101a(this, arrayList, calendarEventAttendee2, false, 4, null);
                    return;
                }
                return;
            }
            m121101a(this, arrayList, calendarEventAttendee, false, 4, null);
        }
    }

    /* renamed from: b */
    public final void mo116244b(List<? extends CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                if (!this.f81283j.contains(t)) {
                    arrayList.add(t);
                }
            }
        }
        this.f81283j.addAll(arrayList);
        mo116252d(this.f81283j);
    }

    /* renamed from: d */
    public final void mo116252d(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendees");
        this.f81283j = EditAttendeeHelper.f79930a.mo114608a(arrayList);
        this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
        this.f81282i = new ArrayList<>(arrayList.size());
        Iterator<CalendarEventAttendee> it = this.f81283j.iterator();
        while (it.hasNext()) {
            this.f81282i.add(new CalendarEventAttendee(it.next()));
        }
    }

    /* renamed from: f */
    private final void m121113f(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (T t : this.f81283j) {
            if (t.isThirdParty() && t.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                String localizedDisplayName = t.getLocalizedDisplayName();
                Intrinsics.checkExpressionValueIsNotNull(localizedDisplayName, "addedAttendee.localizedDisplayName");
                if (localizedDisplayName != null) {
                    String lowerCase = localizedDisplayName.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        if (arrayList != null) {
            for (T t2 : arrayList) {
                if (t2 != null) {
                    String lowerCase2 = t2.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (!arrayList2.contains(lowerCase2)) {
                        CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
                        calendarEventAttendee.setLocalizedDisplayName(t2);
                        calendarEventAttendee.setDisplayName(t2);
                        calendarEventAttendee.setEmail(t2);
                        calendarEventAttendee.setAttendeeCalendarId("");
                        calendarEventAttendee.setThirdParty(true);
                        calendarEventAttendee.setId("");
                        calendarEventAttendee.setLarkId("");
                        this.f81283j.add(calendarEventAttendee);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo116243b(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "displayAttendees");
        this.f81275b = arrayList;
        Iterator<CalendarEventAttendee> it = this.f81283j.iterator();
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            if (!this.f81275b.contains(next)) {
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                next.setStatus(CalendarEventAttendee.Status.REMOVED);
            }
        }
        Iterator<CalendarEventAttendee> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CalendarEventAttendee next2 = it2.next();
            boolean z = false;
            Iterator<CalendarEventAttendee> it3 = this.f81283j.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                CalendarEventAttendee next3 = it3.next();
                if (Intrinsics.areEqual(next3, next2)) {
                    Intrinsics.checkExpressionValueIsNotNull(next3, "calendarEventAttendee");
                    if (next3.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                        next3.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
                    }
                    z = true;
                }
            }
            if (!z) {
                this.f81283j.add(next2);
            }
        }
    }

    /* renamed from: b */
    public final void mo116245b(Map<String, UserAttendeeBaseInfo> map) {
        this.f81287n = map;
    }

    /* renamed from: b */
    public final void mo116246b(boolean z) {
        this.f81291r = z;
    }

    /* renamed from: a */
    private final boolean m121106a(CalendarEventAttendee calendarEventAttendee, boolean z) {
        String str;
        if (!z) {
            return true;
        }
        String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
        CalendarEventAttendee calendarEventAttendee2 = this.f81276c;
        if (calendarEventAttendee2 != null) {
            str = calendarEventAttendee2.getAttendeeCalendarId();
        } else {
            str = null;
        }
        return Intrinsics.areEqual(attendeeCalendarId, str);
    }

    /* renamed from: a */
    private final void m121102a(CalendarEventAttendee calendarEventAttendee, Calendar calendar) {
        calendarEventAttendee.setLocalizedDisplayName(calendar.getExternalAccount());
        calendarEventAttendee.setDisplayName(calendar.getExternalAccount());
        calendarEventAttendee.setAttendeeCalendarId(calendar.getServerId());
        calendarEventAttendee.setEmail(calendar.getExternalAccount());
        calendarEventAttendee.setThirdParty(true);
        calendarEventAttendee.setId("");
        calendarEventAttendee.setLarkId("");
        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.ACCEPT);
    }

    /* renamed from: a */
    private final void m121103a(CalendarEventAttendee calendarEventAttendee, HashMap<String, UserAttendeeBaseInfo> hashMap) {
        List<SimpleMember> list;
        UserAttendeeBaseInfo userAttendeeBaseInfo;
        boolean z;
        if (CollectionUtils.isNotEmpty(calendarEventAttendee.getGroupMembers())) {
            EventAttendeeUtils aVar = EventAttendeeUtils.f80183a;
            List<CalendarEventAttendee> groupMembers = calendarEventAttendee.getGroupMembers();
            Intrinsics.checkExpressionValueIsNotNull(groupMembers, "groupAttendee.groupMembers");
            aVar.mo114852a(groupMembers, hashMap);
            return;
        }
        Map<String, ? extends List<SimpleMember>> map = this.f81285l;
        if (!(map == null || (list = (List) map.get(calendarEventAttendee.getGroupId())) == null)) {
            for (SimpleMember yVar : list) {
                Map<String, UserAttendeeBaseInfo> map2 = this.f81287n;
                if (!(map2 == null || (userAttendeeBaseInfo = map2.get(yVar.mo120249a())) == null)) {
                    String timeZoneId = userAttendeeBaseInfo.getTimeZoneId();
                    if (timeZoneId == null || timeZoneId.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !hashMap.containsKey(userAttendeeBaseInfo.getBaseAttendeeCalendarId())) {
                        hashMap.put(userAttendeeBaseInfo.getBaseAttendeeCalendarId(), userAttendeeBaseInfo);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private final void m121112c(List<? extends CalendarEventAttendee> list, boolean z) {
        for (CalendarEventAttendee calendarEventAttendee : list) {
            if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                String str = null;
                if (this.f81276c != null) {
                    String attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId();
                    CalendarEventAttendee calendarEventAttendee2 = this.f81276c;
                    if (Intrinsics.areEqual(attendeeCalendarId, calendarEventAttendee2 != null ? calendarEventAttendee2.getAttendeeCalendarId() : null)) {
                        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    }
                }
                if (z) {
                    String attendeeCalendarId2 = calendarEventAttendee.getAttendeeCalendarId();
                    CalendarEventAttendee calendarEventAttendee3 = this.f81277d;
                    if (calendarEventAttendee3 != null) {
                        str = calendarEventAttendee3.getAttendeeCalendarId();
                    }
                    if (Intrinsics.areEqual(attendeeCalendarId2, str)) {
                        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo116242b(String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "calendarExternalAccount");
        Intrinsics.checkParameterIsNotNull(str2, "exchangePrimaryId");
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList();
        for (T t : this.f81283j) {
            T t2 = t;
            if (!t2.isThirdParty() || !Intrinsics.areEqual(t2.getLocalizedDisplayName(), str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        for (CalendarEventAttendee calendarEventAttendee : arrayList) {
            calendarEventAttendee.setAttendeeCalendarId(str2);
        }
    }

    /* renamed from: b */
    private final void m121109b(CalendarEventAttendee calendarEventAttendee, HashMap<String, AbstractC30095b> hashMap) {
        boolean z;
        Map<String, ? extends List<SimpleMember>> map = this.f81285l;
        List<SimpleMember> list = map != null ? (List) map.get(calendarEventAttendee.getGroupId()) : null;
        List list2 = list;
        boolean z2 = false;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Map<String, UserAttendeeBaseInfo> map2 = this.f81287n;
            if (map2 == null || map2.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                for (SimpleMember yVar : list) {
                    Map<String, UserAttendeeBaseInfo> map3 = this.f81287n;
                    UserAttendeeBaseInfo userAttendeeBaseInfo = map3 != null ? map3.get(yVar.mo120249a()) : null;
                    if (userAttendeeBaseInfo != null && !hashMap.containsKey(userAttendeeBaseInfo.getAttendeeCalendarId())) {
                        hashMap.put(userAttendeeBaseInfo.getAttendeeCalendarId(), userAttendeeBaseInfo);
                    }
                }
                return;
            }
        }
        List<CalendarEventAttendee> groupMembers = calendarEventAttendee.getGroupMembers();
        if (groupMembers != null) {
            for (CalendarEventAttendee calendarEventAttendee2 : groupMembers) {
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "groupMember");
                if (!hashMap.containsKey(calendarEventAttendee2.getAttendeeCalendarId())) {
                    String attendeeCalendarId = calendarEventAttendee2.getAttendeeCalendarId();
                    Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "groupMember.attendeeCalendarId");
                    hashMap.put(attendeeCalendarId, calendarEventAttendee2);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo116247b(List<? extends CalendarEventAttendee> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(m121115z());
        if (C32662o.m125345a((List<CalendarEventAttendee>) arrayList, (Map<String, List<SimpleMember>>) this.f81285l, z) > this.f81279f - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final void m121110b(ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        if (!arrayList.contains(calendarEventAttendee)) {
            calendarEventAttendee.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
            arrayList.add(i, calendarEventAttendee);
        }
    }

    /* renamed from: a */
    private final void m121104a(ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, boolean z) {
        List<CalendarEventAttendee> z2 = m121115z();
        if (calendarEventAttendee != null && EventAttendeeUtils.f80183a.mo114854b(z2) == 0 && !EventAttendeeUtils.f80183a.mo114855b(z2, calendarEventAttendee) && m121106a(calendarEventAttendee, z)) {
            calendarEventAttendee.setIsEditable(true);
            m121101a(this, arrayList, calendarEventAttendee, false, 4, null);
        }
    }

    /* renamed from: a */
    private final boolean m121107a(CalendarEventAttendee calendarEventAttendee, boolean z, String str) {
        if (!z || TextUtils.isEmpty(str) || !Intrinsics.areEqual(calendarEventAttendee.getLocalizedDisplayName(), str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m121105a(ArrayList<String> arrayList, ArrayList<CalendarEventAttendee> arrayList2, ArrayList<String> arrayList3, boolean z) {
        String str;
        m121112c(arrayList2, z);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            CalendarEventAttendee calendarEventAttendee = arrayList2.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "attendees[i]");
            CalendarEventAttendee calendarEventAttendee2 = calendarEventAttendee;
            if (i < arrayList.size()) {
                calendarEventAttendee2.setLarkId(arrayList.get(i));
            }
            int size2 = this.f81283j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                CalendarEventAttendee calendarEventAttendee3 = this.f81283j.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee3, "mAttendees[j]");
                CalendarEventAttendee calendarEventAttendee4 = calendarEventAttendee3;
                if (!calendarEventAttendee4.isGroup() && Intrinsics.areEqual(calendarEventAttendee4.getAttendeeCalendarId(), calendarEventAttendee2.getAttendeeCalendarId())) {
                    String attendeeCalendarId = calendarEventAttendee2.getAttendeeCalendarId();
                    CalendarEventAttendee calendarEventAttendee5 = this.f81277d;
                    if (calendarEventAttendee5 != null) {
                        str = calendarEventAttendee5.getAttendeeCalendarId();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(attendeeCalendarId, str)) {
                        calendarEventAttendee4.setStatus(CalendarEventAttendee.Status.ACCEPT);
                    } else {
                        calendarEventAttendee4.setStatus(CalendarEventAttendee.Status.NEEDS_ACTION);
                    }
                }
            }
            if (!this.f81283j.contains(calendarEventAttendee2)) {
                m121111c(calendarEventAttendee2);
            } else {
                int indexOf = this.f81283j.indexOf(calendarEventAttendee2);
                if (!calendarEventAttendee2.isGroup()) {
                    CalendarEventAttendee calendarEventAttendee6 = this.f81283j.get(indexOf);
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee6, "mAttendees[index]");
                    calendarEventAttendee6.setStatus(calendarEventAttendee2.getStatus());
                } else {
                    this.f81283j.remove(calendarEventAttendee2);
                    this.f81283j.add(indexOf, calendarEventAttendee2);
                }
            }
        }
        m121113f(arrayList3);
        this.f81275b = EventAttendeeUtils.f80183a.mo114850a(this.f81283j);
    }

    /* renamed from: a */
    private final boolean m121108a(CalendarEventAttendee calendarEventAttendee, boolean z, boolean z2, String str) {
        if (!z || !calendarEventAttendee.isEditable()) {
            return false;
        }
        return m121107a(calendarEventAttendee, z2, str);
    }

    /* renamed from: a */
    public final int mo116222a(boolean z, boolean z2, int i, boolean z3) {
        if (!mo116238a(z, z2)) {
            return i;
        }
        return C32662o.m125345a((List<CalendarEventAttendee>) this.f81275b, (Map<String, List<SimpleMember>>) this.f81285l, z3);
    }

    /* renamed from: a */
    static /* synthetic */ void m121101a(EditAttendeePart aVar, ArrayList arrayList, CalendarEventAttendee calendarEventAttendee, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        aVar.m121110b(arrayList, calendarEventAttendee, z);
    }
}
