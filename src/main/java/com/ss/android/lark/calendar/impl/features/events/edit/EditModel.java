package com.ss.android.lark.calendar.impl.features.events.edit;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.events.edit.EditView;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.AttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.CalendarFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionSaveData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionShowData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatEndFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ResourceExpandFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.CalendarEventHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditAttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditDateHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomStrategyHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.model.IAttendeePartListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.model.ICalendarPartListener;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditAttendeePart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditEventUIVisible;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditMeetingRoomPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditReminderPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditRepeatPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditSchemaUIVisible;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditTimePart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditViewPartVisible;
import com.ss.android.lark.calendar.impl.features.events.edit.part.MeetingRoomLimitData;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventTimeZoneUtils;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCompatibility;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32662o;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ¸\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004¸\u0002¹\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020\tH\u0002J\u0018\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020%H\u0002J\b\u0010E\u001a\u00020@H\u0016J\b\u0010F\u001a\u00020\tH\u0016J\b\u0010G\u001a\u00020@H\u0002J\u000e\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\tJ\b\u0010J\u001a\u00020@H\u0002J\b\u0010K\u001a\u00020@H\u0016J\b\u0010L\u001a\u00020@H\u0002J\b\u0010M\u001a\u00020@H\u0016J\b\u0010N\u001a\u00020@H\u0002J\b\u0010O\u001a\u00020@H\u0002J\b\u0010P\u001a\u00020\tH\u0016J\u0006\u0010Q\u001a\u00020\tJ\b\u0010R\u001a\u00020\tH\u0016J\b\u0010S\u001a\u00020\tH\u0016J\u0018\u0010T\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0018\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u0011H\u0016J\u0018\u0010V\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0018\u0010W\u001a\u0012\u0012\u0004\u0012\u00020X0\u000fj\b\u0012\u0004\u0012\u00020X`\u0011H\u0016J \u0010Y\u001a\u00020\t2\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0010\u0010[\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\\H\u0016J\u0010\u0010]\u001a\u00020^2\u0006\u0010D\u001a\u00020%H\u0016J\u0018\u0010_\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\n\u0010`\u001a\u0004\u0018\u00010aH\u0016J\b\u0010b\u001a\u00020%H\u0016J\n\u0010c\u001a\u0004\u0018\u00010aH\u0016J\n\u0010d\u001a\u0004\u0018\u00010eH\u0016J\b\u0010f\u001a\u00020\u0013H\u0016J\u0010\u0010g\u001a\n h*\u0004\u0018\u00010\u00130\u0013H\u0002J\u0018\u0010i\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0006\u0010j\u001a\u00020%J\b\u0010k\u001a\u00020lH\u0016J\b\u0010m\u001a\u00020\"H\u0016J\u0010\u0010n\u001a\n h*\u0004\u0018\u00010\u00130\u0013H\u0016J\u001c\u0010o\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\\\u0018\u00010pH\u0016J\u001c\u0010r\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0011H\u0016J\u001c\u0010s\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0011H\u0016J\u0018\u0010t\u001a\u0012\u0012\u0004\u0012\u00020u0\u000fj\b\u0012\u0004\u0012\u00020u`\u0011H\u0016J \u0010v\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u00112\u0006\u0010w\u001a\u00020\tH\u0016JH\u0010x\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u00112\u0016\u0010y\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u00112\u0016\u0010z\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u0011H\u0016J\b\u0010{\u001a\u00020\u0013H\u0016J\n\u0010|\u001a\u0004\u0018\u000103H\u0016J\u0014\u0010}\u001a\u0004\u0018\u00010\u00052\b\u0010~\u001a\u0004\u0018\u00010\u0005H\u0016J!\u0010\u001a\u00020\t2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\t\u0010\u0001\u001a\u00020%H\u0016J\t\u0010\u0001\u001a\u00020%H\u0016J\u0019\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\t\u0010\u0001\u001a\u0004\u0018\u00010eJ\t\u0010\u0001\u001a\u00020\u0013H\u0016J\u000b\u0010\u0001\u001a\u0004\u0018\u00010\"H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\u0011\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010\\H\u0016J\t\u0010\u0001\u001a\u00020lH\u0016J\t\u0010\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u0001\u001a\u00020\tH\u0002J\u0011\u0010\u0001\u001a\u00020@2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0011\u0010\u0001\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0002J\t\u0010\u0001\u001a\u00020@H\u0016J\t\u0010\u0001\u001a\u00020@H\u0016J\t\u0010\u0001\u001a\u00020@H\u0016J\t\u0010\u0001\u001a\u00020\tH\u0016J\t\u0010\u0001\u001a\u00020\tH\u0016J\t\u0010\u0001\u001a\u00020\tH\u0016J\t\u0010\u0001\u001a\u00020\tH\u0016J\t\u0010 \u0001\u001a\u00020\tH\u0016J\t\u0010¡\u0001\u001a\u00020\tH\u0016J\t\u0010¢\u0001\u001a\u00020\tH\u0016J\t\u0010£\u0001\u001a\u00020\tH\u0016J\u0012\u0010¤\u0001\u001a\u00020\t2\u0007\u0010¥\u0001\u001a\u00020%H\u0016J\t\u0010¦\u0001\u001a\u00020\tH\u0016J\t\u0010§\u0001\u001a\u00020\tH\u0016J\t\u0010¨\u0001\u001a\u00020\tH\u0016J\t\u0010©\u0001\u001a\u00020\tH\u0016J\u0012\u0010ª\u0001\u001a\u00020\t2\u0007\u0010¥\u0001\u001a\u00020%H\u0016J\t\u0010«\u0001\u001a\u00020\tH\u0016J\t\u0010¬\u0001\u001a\u00020\tH\u0016J\t\u0010­\u0001\u001a\u00020\tH\u0016J\t\u0010®\u0001\u001a\u00020\tH\u0016J\t\u0010¯\u0001\u001a\u00020\tH\u0016J\t\u0010°\u0001\u001a\u00020\tH\u0016J\t\u0010±\u0001\u001a\u00020\tH\u0016J\t\u0010²\u0001\u001a\u00020\tH\u0016J\t\u0010³\u0001\u001a\u00020\tH\u0016J\t\u0010´\u0001\u001a\u00020\tH\u0002J\t\u0010µ\u0001\u001a\u00020\tH\u0016J\t\u0010¶\u0001\u001a\u00020\tH\u0016J\t\u0010·\u0001\u001a\u00020@H\u0002J\t\u0010¸\u0001\u001a\u00020@H\u0002J\t\u0010¹\u0001\u001a\u00020\tH\u0016J+\u0010º\u0001\u001a\u00020@2\u0017\u0010»\u0001\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u00112\u0007\u0010¼\u0001\u001a\u00020\tH\u0016J\t\u0010½\u0001\u001a\u00020@H\u0016J$\u0010¾\u0001\u001a\u00020@2\u0019\u0010¿\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\\0pH\u0016J\u0012\u0010À\u0001\u001a\u00020@2\u0007\u0010Á\u0001\u001a\u00020\tH\u0016J \u0010Â\u0001\u001a\u00020@2\u0015\u0010Ã\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0005\u0012\u00030Å\u00010Ä\u0001H\u0016J\t\u0010Æ\u0001\u001a\u00020@H\u0002J\"\u0010Ç\u0001\u001a\u00020@2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\t\u0010È\u0001\u001a\u00020@H\u0002J\t\u0010É\u0001\u001a\u00020@H\u0002J\u0001\u0010Ê\u0001\u001a\u00020\t2\u001b\u0010Ë\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00112\u001b\u0010Ì\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00112\u001b\u0010Í\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00112%\u0010Î\u0001\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020*0Ï\u0001j\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020*`Ð\u0001H\u0016J\t\u0010Ñ\u0001\u001a\u00020@H\u0002J\t\u0010Ò\u0001\u001a\u00020@H\u0016J\t\u0010Ó\u0001\u001a\u00020@H\u0016J\u001a\u0010Ô\u0001\u001a\u00020@2\u0006\u0010D\u001a\u00020%2\u0007\u0010Õ\u0001\u001a\u00020^H\u0016J\u0014\u0010Ö\u0001\u001a\u00020@2\t\u0010×\u0001\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010Ø\u0001\u001a\u00020@2\u0007\u0010Ù\u0001\u001a\u00020%H\u0016JI\u0010Ú\u0001\u001a\u00020@2\u0017\u0010Û\u0001\u001a\u0012\u0012\u0004\u0012\u00020a0\u000fj\b\u0012\u0004\u0012\u00020a`\u00112%\u0010Ü\u0001\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0Ï\u0001j\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t`Ð\u0001H\u0016J\u0013\u0010Ý\u0001\u001a\u00020@2\b\u0010Þ\u0001\u001a\u00030ß\u0001H\u0016J\u0013\u0010à\u0001\u001a\u00020@2\b\u0010á\u0001\u001a\u00030â\u0001H\u0002J\u0012\u0010ã\u0001\u001a\u00020@2\u0007\u0010ä\u0001\u001a\u00020%H\u0016J\u0013\u0010å\u0001\u001a\u00020@2\b\u0010æ\u0001\u001a\u00030ç\u0001H\u0016J\"\u0010è\u0001\u001a\u00020@2\u0017\u0010Û\u0001\u001a\u0012\u0012\u0004\u0012\u00020a0\u000fj\b\u0012\u0004\u0012\u00020a`\u0011H\u0016J\u0014\u0010é\u0001\u001a\u00020@2\t\u0010ê\u0001\u001a\u0004\u0018\u00010*H\u0016J$\u0010ë\u0001\u001a\u00020@2\u0007\u0010ì\u0001\u001a\u00020\"2\u0007\u0010í\u0001\u001a\u00020\"2\u0007\u0010î\u0001\u001a\u000203H\u0016J\t\u0010ï\u0001\u001a\u00020@H\u0002J\t\u0010ð\u0001\u001a\u00020@H\u0002J\t\u0010ñ\u0001\u001a\u00020@H\u0002J\t\u0010ò\u0001\u001a\u00020@H\u0002J\t\u0010ó\u0001\u001a\u00020@H\u0002J\t\u0010ô\u0001\u001a\u00020@H\u0002J\u0012\u0010õ\u0001\u001a\u00020@2\u0007\u0010ö\u0001\u001a\u00020\u0013H\u0016J\u0014\u0010÷\u0001\u001a\u00020@2\t\b\u0002\u0010\u0001\u001a\u00020\tH\u0002J\u0012\u0010ø\u0001\u001a\u00020@2\u0007\u0010Õ\u0001\u001a\u00020^H\u0002J\"\u0010ù\u0001\u001a\u00020@2\u0017\u0010ú\u0001\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0012\u0010û\u0001\u001a\u00020@2\u0007\u0010ü\u0001\u001a\u00020%H\u0016J\u0012\u0010ý\u0001\u001a\u00020@2\u0007\u0010þ\u0001\u001a\u00020\tH\u0016J\t\u0010ÿ\u0001\u001a\u00020@H\u0016J\t\u0010\u0002\u001a\u00020@H\u0016J\"\u0010\u0002\u001a\u00020@2\u0017\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\t\u0010\u0002\u001a\u00020@H\u0016J;\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020\u00132\t\u0010\u0002\u001a\u0004\u0018\u00010\u00132\n\u0010\u0002\u001a\u0005\u0018\u00010\u00022\n\u0010\u0002\u001a\u0005\u0018\u00010\u0002H\u0016¢\u0006\u0003\u0010\u0002J\u0012\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020%H\u0016J\u0012\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020%H\u0016J\u0012\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020%H\u0016J\"\u0010\u0002\u001a\u00020@2\u0017\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u0012\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020*H\u0016J\"\u0010\u0002\u001a\u00020@2\u0017\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0011H\u0016J\u001c\u0010\u0002\u001a\u00020@2\u0007\u0010\u0002\u001a\u00020\u00132\b\u0010\u0002\u001a\u00030\u0002H\u0016J.\u0010\u0002\u001a\u00020@2\b\u0010\u0002\u001a\u00030\u00022\u0019\u0010\u0002\u001a\u0014\u0012\u0005\u0012\u00030\u00020\u000fj\t\u0012\u0005\u0012\u00030\u0002`\u0011H\u0016J\u001f\u0010\u0002\u001a\u00020@2\u000e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020%0 \u0002H\u0016¢\u0006\u0003\u0010¡\u0002J\u0012\u0010¢\u0002\u001a\u00020@2\u0007\u0010£\u0002\u001a\u00020%H\u0016J-\u0010¤\u0002\u001a\u00020@2\u0007\u0010¥\u0002\u001a\u00020\t2\u0007\u0010¦\u0002\u001a\u00020%2\u0007\u0010§\u0002\u001a\u00020%2\u0007\u0010¨\u0002\u001a\u00020%H\u0016J\u0012\u0010©\u0002\u001a\u00020@2\u0007\u0010ª\u0002\u001a\u00020\tH\u0016J-\u0010«\u0002\u001a\u00020@2\u0007\u0010¬\u0002\u001a\u00020l2\u0007\u0010­\u0002\u001a\u00020l2\u0007\u0010®\u0002\u001a\u00020\t2\u0007\u0010¯\u0002\u001a\u00020\u0013H\u0016J\u0012\u0010°\u0002\u001a\u00020@2\u0007\u0010¯\u0002\u001a\u00020\u0013H\u0016J\u001c\u0010±\u0002\u001a\u00020@2\b\u0010²\u0002\u001a\u00030³\u00022\u0007\u0010´\u0002\u001a\u00020\tH\u0016J\u0013\u0010µ\u0002\u001a\u00020@2\b\u0010¶\u0002\u001a\u00030·\u0002H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\"\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020*\u0018\u0001`\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006º\u0002"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditModelApi;", "extras", "Landroid/os/Bundle;", "saveStates", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "attendeeUpdating", "", "getAttendeeUpdating", "()Z", "setAttendeeUpdating", "(Z)V", "mAttachmentItemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "Lkotlin/collections/ArrayList;", "mDefaultCalendarId", "", "mDocsDescription", "mEditAttendeePart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditAttendeePart;", "mEditCalendarPart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart;", "mEditMeetingRoomPart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditMeetingRoomPart;", "mEditReminderPart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditReminderPart;", "mEditRepeatPart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditRepeatPart;", "mEditTimePart", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditTimePart;", "mEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "mExceptionalEvent", "mExceptionalEventNum", "", "mExtraAttendeeChatIds", "mExtraAttendeeChatterIds", "mExtraAttendeeRelatedChatterIds", "mExtraAttendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "mFromChatType", "mFromMulti", "mFromProfile", "mHasChangeVideoMeetingType", "mHasRepeatEvent", "mHitActionSource", "mHtmlDescription", "mInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "mIsDefaultOpenVc", "mIsEditEvent", "mIsFromAppendView", "mIsFromDetailPage", "mIsRecover", "mOriginalEvent", "mShareToChatId", "mSummary", "mTextDescription", "mUserHasEdited", "switchCalendarSuccess", "bindListener", "", "canEditAttendeeWhenEdit", "changeExchangeStatusByCalendar", "originalIndex", "currentIndex", "changeRepeatEndToLimitDate", "checkInterceptSaveProcess", "checkUpdateInvalidVCConfig", "checkUpdateVideoBeforeSetAttendee", "newAttendeeIsNullOrEmpty", "clearAttachment", "clearCustomRepeat", "clearRepeatAndReminderIfNeed", "create", "createEventReminderData", "createEventTimeData", "didSwitchCalendarSuccessful", "editAffectReverseRoom", "editInterceptEditAttendee", "enableSwitchCalendar", "getAllOriginalAttendees", "getAttendeeIds", "getAttendees", "getAttendeesAfterBreakUp", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeesIsOutMaxNum", "attendees", "getAttendeesWithoutEmail", "", "getCalendarChangeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "getChosenApprovalMeetingRooms", "getChosenCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getChosenMeetingRoomSize", "getChosenPrimaryCalendar", "getCurrentRepeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getCurrentTimeZoneId", "getDefaultTimeZoneId", "kotlin.jvm.PlatformType", "getDisplayAttendees", "getDisplayEventColor", "getEndTime", "", "getEvent", "getEventCalendarId", "getEventCurrentSimpleMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "getExternalAttendeeChatIds", "getExternalAttendeeChatterIds", "getExternalAttendeeDatas", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "getExternalAttendeesAfterMerge", "isAddInEmpty", "getExternalDisplayAttendees", "addExternalEmails", "deleteExternalEmails", "getFromChatType", "getInstance", "getInstanceState", "outState", "getIsAddEmptyAfterUpdateExternalAttendees", "displayAttendees", "getMaxAttendeeNum", "getMaxDepartmentAttendeeNum", "getMeetingRoomContainerList", "getMeetingRoomLimitData", "getOrganizerCalendarId", "getOriginalEvent", "getSaveHitPointSource", "getShareToChatId", "getSimpleGroupAttendeeList", "getStartTime", "getSummary", "getViewData", "hasAllIndividualAttendees", "initDataByExtra", "initDataFromRecover", "initEditAttachment", "initEditAttendeeAndMeetingRoomData", "initEditCalendarData", "initEditDescriptionData", "initEditReminderData", "initEditRepeatEndData", "initEditTimeData", "initEventForCreate", "initRecoverAttendeeAndMtRoomData", "initViewDataForCreate", "initViewDataForEdit", "initViewDataForRecover", "isChangedEventSummary", "isCreateOrEditable", "isCurrentExchangeCalendar", "isCurrentGoogleCalendar", "isEditEvent", "isEditLocalSystemEvent", "isEditable", "isEditableWhenEdit", "isExchangeCalendarOnIndex", "index", "isExchangeEvent", "isExternalEvent", "isFromDetailPage", "isFromProfile", "isGoogleCalendarOnIndex", "isGoogleEvent", "isGuestCanInvite", "isGuestsCanSeeOtherGuests", "isHasEdited", "isHaveChosenAttendee", "isHaveChosenMeetingRoom", "isHaveChosenMultiMonthRepeat", "isHaveChosenMultiReminder", "isNeedLoadSimpleMember", "isOriginEventHasValidGroupAttendee", "isRecover", "isRepeatEndDateValidate", "judgeCreateOrEditEvent", "loadingSettingItems", "needLoadAllAttendees", "pullAllOriginalAttendees", "individualAttendees", "isSuccess", "refreshReminder", "setSimpleGroupAttendee", "simpleAttendeeMap", "setSwitchCalendarSuccessful", "success", "setUserAttendeeBaseInfo", "attendeeBaseInfos", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "updateAttendeeAndMtRoomParams", "updateAttendeeDataAfterEdit", "updateAttendeeDataForCreate", "updateAttendeeDataForEdit", "updateAttendeeDataForSelect", "attendeeIds", "groupIds", "emails", "calendarEventAttendeeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "updateAttendeeNum", "updateAttendeeWhenAddMtRoom", "updateAttendeeWhenSwitchCalendar", "updateCalendarChosenIndex", "changeType", "updateChosenCalendarAttendee", "chosenCalendarAttendee", "updateColor", "chosenColor", "updateCreateCalendarList", "calendarList", "googleAccountSetting", "updateCustomRepeat", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "updateCustomRepeatByStartTime", "lastStartCalendarDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "updateDataWithFeatureGone", "featureId", "updateDescription", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "updateEditCalendarList", "updateEditorAttendee", "editorAttendee", "updateEventAndInstance", "event", "originalEvent", "instance", "updateEventAttachmentParams", "updateEventCalendarParams", "updateEventDescriptionParams", "updateEventReminderParams", "updateEventRepeatParams", "updateEventSchema", "updateEventSummary", "summary", "updateEventTimeParams", "updateEventVideo", "updateExceedLimitMeetingGroup", "exceedLimitMeetingGroup", "updateExceptionalEventNum", "exceptionalEventNum", "updateExceptionalHasOriginalEvent", "hasOriginalEvent", "updateExternalAttendeeIds", "updateExtraAttendee", "updateGoogleAttendees", "newAttendees", "updateHasEdited", "updateLocation", "name", "address", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "updateMaxAttendeeNum", "maxAttendeeNum", "updateMaxDepartmentAttendeeNum", "maxDepartmentAttendeeNum", "updateMaxTimeZoneAttendeeNum", "updateMeetingRoomAfterAdd", "meetingRoom", "updateMeetingRoomAfterDelete", "updateMeetingRoomAfterEdit", "chosenMeetingRoomList", "updateMtroomScheduleData", "calendarId", "mtRoomSchedule", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "updatePreLoadBuildings", "requestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "calendarBuildings", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "updateReminder", "chosenIndexArray", "", "([Ljava/lang/Integer;)V", "updateRepeat", "chosenIndex", "updateRepeatEnd", "isNeverEnd", "year", "month", "day", "updateStatus", "isFree", "updateTimeData", "startTime", "endTime", "allDay", "timeZoneId", "updateTimeZoneData", "updateVideoMeeting", "doVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "hasChangeVideoMeetingType", "updateVisibility", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "Companion", "editViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e */
public final class EditModel extends BaseModelCalendar<IEditContract.IEditViewData> implements IEditContract.IEditModelApi {

    /* renamed from: p */
    public static final Companion f80223p = new Companion(null);

    /* renamed from: A */
    private int f80224A;

    /* renamed from: B */
    private boolean f80225B;

    /* renamed from: C */
    private boolean f80226C;

    /* renamed from: D */
    private boolean f80227D;

    /* renamed from: E */
    private String f80228E = "";

    /* renamed from: F */
    private String f80229F = "";

    /* renamed from: G */
    private boolean f80230G;

    /* renamed from: H */
    private String f80231H = "";

    /* renamed from: I */
    private boolean f80232I;

    /* renamed from: J */
    private boolean f80233J;

    /* renamed from: a */
    public CalendarEventInstance f80234a;

    /* renamed from: b */
    public boolean f80235b = true;

    /* renamed from: c */
    public CalendarEvent f80236c;

    /* renamed from: d */
    public CalendarEvent f80237d = new CalendarEvent();

    /* renamed from: e */
    public boolean f80238e;

    /* renamed from: f */
    public EditReminderPart f80239f = new EditReminderPart();

    /* renamed from: g */
    public EditAttendeePart f80240g = new EditAttendeePart();

    /* renamed from: h */
    public EditTimePart f80241h = new EditTimePart();

    /* renamed from: i */
    public EditMeetingRoomPart f80242i = new EditMeetingRoomPart();

    /* renamed from: j */
    public EditCalendarPart f80243j = new EditCalendarPart();

    /* renamed from: k */
    public String f80244k = "";

    /* renamed from: l */
    public String f80245l = "";

    /* renamed from: m */
    public String f80246m = "";

    /* renamed from: n */
    public EditRepeatPart f80247n = new EditRepeatPart();

    /* renamed from: o */
    public ArrayList<AttachmentItemData> f80248o = new ArrayList<>();

    /* renamed from: q */
    private boolean f80249q;

    /* renamed from: r */
    private boolean f80250r;

    /* renamed from: s */
    private boolean f80251s;

    /* renamed from: t */
    private CalendarEvent f80252t;

    /* renamed from: u */
    private String f80253u = "";

    /* renamed from: v */
    private String f80254v = "";

    /* renamed from: w */
    private ArrayList<CalendarEventAttendee> f80255w;

    /* renamed from: x */
    private ArrayList<String> f80256x;

    /* renamed from: y */
    private ArrayList<String> f80257y;

    /* renamed from: z */
    private ArrayList<String> f80258z;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public void ac() {
        this.f80238e = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel$Companion;", "", "()V", "DESCRIPTION_BLANK", "", "EVENT_CREATE_DEFAULT_ID", "EVENT_FREE_BUSY_MAX_NUM", "", "EVENT_FREE_BUSY_MIN_NUM", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: A */
    public String mo114408A() {
        return this.f80228E;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: B */
    public boolean mo114409B() {
        return this.f80250r;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: G */
    public boolean mo114414G() {
        return this.f80238e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: S */
    public boolean mo114425S() {
        return this.f80233J;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public String al() {
        return this.f80253u;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public ArrayList<String> am() {
        return this.f80257y;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public ArrayList<String> an() {
        return this.f80258z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: c */
    public CalendarEvent mo114478c() {
        return this.f80236c;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: d */
    public CalendarEvent mo114483d() {
        return this.f80237d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: e */
    public CalendarEventInstance mo114487e() {
        return this.f80234a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: n */
    public boolean mo114503n() {
        return this.f80235b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: y */
    public boolean mo114509y() {
        return this.f80226C;
    }

    /* renamed from: a */
    public boolean mo115133a() {
        return this.f80232I;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114446a(ArrayList<CalendarEventAttendee> arrayList, boolean z) {
        List<CalendarEventAttendee> attendees;
        Intrinsics.checkParameterIsNotNull(arrayList, "individualAttendees");
        if (!z) {
            this.f80240g.mo116236a(true);
            return;
        }
        this.f80240g.mo116246b(true);
        this.f80240g.mo116258i().clear();
        this.f80240g.mo116258i().addAll(arrayList);
        CalendarEvent calendarEvent = this.f80236c;
        if (!(calendarEvent == null || (attendees = calendarEvent.getAttendees()) == null)) {
            for (T t : attendees) {
                if (!this.f80240g.mo116258i().contains(t)) {
                    this.f80240g.mo116258i().add(t);
                }
            }
        }
        this.f80240g.mo116244b((List<? extends CalendarEventAttendee>) arrayList);
        aS();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114438a(CalendarEventAttendee calendarEventAttendee) {
        this.f80240g.mo116230a(calendarEventAttendee);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114445a(ArrayList<Calendar> arrayList, HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(hashMap, "googleAccountSetting");
        if (!this.f80235b) {
            this.f80243j.mo116188a(arrayList, hashMap, !TextUtils.isEmpty(this.f80253u) || this.f80226C, this.f80231H);
            aM();
        } else if (mo114424R()) {
            this.f80243j.mo116187a(arrayList, hashMap);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114437a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
        Intrinsics.checkParameterIsNotNull(calendarEvent2, "originalEvent");
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        this.f80237d = calendarEvent;
        this.f80236c = calendarEvent2;
        this.f80234a = calendarEventInstance;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114444a(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.f80243j.mo116186a(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114441a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        if (mo115140q()) {
            this.f80237d.setSummary(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114436a(CalendarEvent.Visibility visibility) {
        Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        if (!mo114477b()) {
            this.f80237d.setVisibility(visibility);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public boolean mo114451a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, HashMap<String, CalendarEventAttendee> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "calendarEventAttendeeMap");
        EditAttendeePart aVar = this.f80240g;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        aVar.mo116232a(arrayList);
        boolean a = this.f80240g.mo116237a(hashMap, arrayList3, this.f80236c, mo114503n(), mo115141v());
        if (!a) {
            aQ();
        }
        return a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114450a(Integer[] numArr) {
        Intrinsics.checkParameterIsNotNull(numArr, "chosenIndexArray");
        this.f80239f.mo116300a(numArr);
        aP();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114443a(String str, String str2, Double d, Double d2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (mo115140q()) {
            CalendarLocation calendarLocation = new CalendarLocation();
            calendarLocation.setLocation(str);
            calendarLocation.setAddress(str2);
            if (d != null) {
                calendarLocation.setLatitude((float) d.doubleValue());
            }
            if (d2 != null) {
                calendarLocation.setLongitude((float) d2.doubleValue());
            }
            this.f80237d.setLocation(calendarLocation);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114440a(EventRecurrence eventRecurrence) {
        Intrinsics.checkParameterIsNotNull(eventRecurrence, "customRRule");
        this.f80247n.mo116309a(eventRecurrence);
        aV();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114449a(boolean z, int i, int i2, int i3) {
        this.f80247n.mo116311a(z);
        this.f80247n.mo116315b(i);
        this.f80247n.mo116319c(i2);
        this.f80247n.mo116322d(i3);
        aV();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114435a(DescriptionSaveData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (TextUtils.isEmpty(aVar.mo115067a())) {
            this.f80244k = "";
            this.f80245l = "";
            this.f80246m = "";
        } else {
            this.f80244k = aVar.mo115067a();
            this.f80245l = aVar.mo115068b();
            this.f80246m = aVar.mo115069c();
        }
        aW();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114447a(Map<String, ? extends List<SimpleMember>> map) {
        Intrinsics.checkParameterIsNotNull(map, "simpleAttendeeMap");
        this.f80240g.mo116235a(map);
        HashSet hashSet = new HashSet();
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            for (SimpleMember yVar : it.next()) {
                if (yVar.mo120252b() != CalendarEventAttendee.Status.REMOVED) {
                    hashSet.add(yVar);
                }
            }
        }
        this.f80240g.mo116233a(CollectionsKt.toList(hashSet));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114439a(DoVideoMeeting doVideoMeeting, boolean z) {
        Intrinsics.checkParameterIsNotNull(doVideoMeeting, "doVideoMeeting");
        this.f80237d.setVideoMeeting(doVideoMeeting);
        if (z) {
            this.f80227D = true;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114442a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "mtRoomSchedule");
        this.f80242i.mo116281a(str, resourceCustomization);
        aQ();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditModel$bindListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/IAttendeePartListener;", "onHasEdited", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e$b */
    public static final class C31620b implements IAttendeePartListener {

        /* renamed from: a */
        final /* synthetic */ EditModel f80259a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.model.IAttendeePartListener
        /* renamed from: a */
        public void mo114632a() {
            this.f80259a.f80238e = true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31620b(EditModel eVar) {
            this.f80259a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020\u0012H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\u0018\u0010,\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0006\u0012\u0004\u0018\u00010)0-H\u0016J\u0018\u0010/\u001a\u0012\u0012\u0004\u0012\u0002000\bj\b\u0012\u0004\u0012\u000200`\nH\u0016J\b\u00101\u001a\u00020\u001bH\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00104\u001a\u00020\u001bH\u0016J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0012H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\b\u00109\u001a\u00020\u0012H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020<H\u0016J\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\u0004H\u0016J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020\u0004H\u0016J\b\u0010E\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\u0016\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020I\u0018\u00010!H\u0016J\u000f\u0010J\u001a\t\u0018\u00010K¢\u0006\u0002\bLH\u0016J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020\u0004H\u0016J\b\u0010R\u001a\u00020\u0004H\u0016J\b\u0010S\u001a\u00020\u0004H\u0002J\b\u0010T\u001a\u00020\u0004H\u0016J\b\u0010U\u001a\u00020\u0004H\u0002J\b\u0010V\u001a\u00020\u0004H\u0016J\b\u0010W\u001a\u00020\u0004H\u0016J\b\u0010X\u001a\u00020\u0004H\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020]H\u0016J(\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020)2\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010b\u001a\u00020\u0012H\u0016J\u001c\u0010c\u001a\u00020]2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020e0!H\u0016¨\u0006f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel$editViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel;)V", "editInterceptEditAttendee", "", "getAppendResourceFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "getAttachmentData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "Lkotlin/collections/ArrayList;", "getAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventAttendeeData;", "getBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "getContainerCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "getContainerStatus", "", "getContainerVisibility", "getCustomRepeatRule", "Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "getCustomRepeatStartTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getDescriptionShowData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "getDisplayColor", "", "getEditAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;", "getEditEventUIVisible", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditEventUIVisible;", "getEventSimpleMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "getExceedLimitMeetingGroupNameText", "getExceedLimitMeetingGroupTipText", "getFragmentCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;", "getInstanceEndTime", "", "getIsSingleInMonth", "getLocationContainerStr", "getMeetingRoomApprovalType", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "getMeetingRoomContainerList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getMeetingRoomSize", "getReminderContainerStr", "getReminderContainerVisible", "getReminderDefaultRemindTimeIndex", "getReminderFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "getRepeatContainerStr", "getRepeatContainerVisible", "getRepeatEndContainerStr", "getRepeatEndDateValidate", "getRepeatEndFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatEndFragmentData;", "getRepeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getRepeatFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatFragmentData;", "getRepeatHasGoogleRRule", "getResourceExpandFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ResourceExpandFragmentData;", "getStatusFragmentIsFree", "getSummary", "getTimeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "getUnusableMeetingRoom", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "Lorg/jetbrains/annotations/Nullable;", "getViewPartVisible", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditViewPartVisible;", "getVisibilityForFragment", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "guestCanEditAllDayEvent", "hasThirdPartCalendar", "isEventAttendeeEmpty", "isEventCreateOrEditable", "isExceptionalEvent", "isExternalEvent", "isFreeBusyVisible", "isRepeatLimitEndBeforeStart", "needShowDisableFrom", "saveType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$SaveType;", "updateEventHasEdited", "", "updateEventTimeData", "startTime", "endTime", "allDay", "timeZoneId", "updatePbMultiLevelData", "pbMultiLevelData", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e$d */
    public final class editViewData implements IEditContract.IEditViewData {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: C */
        public boolean mo114548C() {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: G */
        public boolean mo114552G() {
            return EditModel.this.mo115140q();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: M */
        public MeetingRoomLimitData mo114558M() {
            return EditModel.this.mo115128J();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: Q */
        public boolean mo114562Q() {
            return EditModel.this.mo115141v();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: T */
        public boolean mo114565T() {
            return EditModel.this.aw();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: k */
        public int mo114580k() {
            return EditModel.this.ad();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: A */
        public String mo114546A() {
            return EditModel.this.f80247n.mo116324f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: B */
        public boolean mo114547B() {
            return EditModel.this.f80247n.mo116320c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: E */
        public String mo114550E() {
            return EditModel.this.f80247n.mo116327i();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: I */
        public ArrayList<AttachmentItemData> mo114554I() {
            return new ArrayList<>(EditModel.this.f80248o);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: L */
        public Map<String, List<SimpleMember>> mo114557L() {
            return EditModel.this.f80240g.mo116255f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: O */
        public int mo114560O() {
            return EditModel.this.f80242i.mo116277a().size();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: P */
        public DoVideoMeeting mo114561P() {
            return EditModel.this.f80237d.getVideoMeeting();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: R */
        public boolean mo114563R() {
            return EditModel.this.f80242i.mo116289b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: U */
        public String mo114566U() {
            return EditModel.this.f80240g.mo116273x();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: V */
        public String mo114567V() {
            return EditModel.this.f80240g.mo116274y();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: W */
        public long mo114568W() {
            CalendarEventInstance calendarEventInstance = EditModel.this.f80234a;
            if (calendarEventInstance != null) {
                return calendarEventInstance.getEndTime();
            }
            return 0;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: a */
        public String mo114569a() {
            String summary = EditModel.this.f80237d.getSummary();
            Intrinsics.checkExpressionValueIsNotNull(summary, "mEvent.summary");
            return summary;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: e */
        public EventCalendarData mo114574e() {
            return EditModel.this.f80243j.mo116196e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: f */
        public boolean mo114575f() {
            return EditModel.this.f80243j.mo116199f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: g */
        public CalendarFragmentData mo114576g() {
            return EditModel.this.f80243j.mo116200g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: l */
        public boolean mo114581l() {
            return EditModel.this.f80237d.isFree();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: m */
        public CalendarEvent.Visibility mo114582m() {
            CalendarEvent.Visibility visibility = EditModel.this.f80237d.getVisibility();
            Intrinsics.checkExpressionValueIsNotNull(visibility, "mEvent.visibility");
            return visibility;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: p */
        public boolean mo114585p() {
            return EditModel.this.f80239f.mo116302b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: v */
        public ArrayList<CalendarEventAttendee> mo114591v() {
            return EditModel.this.f80242i.mo116292d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: y */
        public CalendarDate mo114594y() {
            return EditModel.this.f80241h.mo116376j();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: z */
        public RepeatMode mo114595z() {
            return EditModel.this.f80247n.mo116321d();
        }

        /* renamed from: Z */
        private final boolean m119377Z() {
            if (EditModel.this.f80237d.getOriginalTime() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: F */
        public boolean mo114551F() {
            CalendarDate calendarDate;
            EditRepeatPart eVar = EditModel.this.f80247n;
            MeetingRoomLimitData J = EditModel.this.mo115128J();
            if (J != null) {
                calendarDate = J.mo116397a();
            } else {
                calendarDate = null;
            }
            return eVar.mo116312a(calendarDate);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: d */
        public EditViewPartVisible mo114573d() {
            return new EditViewPartVisible(new EditSchemaUIVisible(EditModel.this.f80237d.getCalendarSchemaCollection()), m119375X());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: o */
        public String mo114584o() {
            return EditModel.this.f80239f.mo116301b(EditModel.this.f80237d.isAllDay());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: q */
        public ReminderFragmentData mo114586q() {
            return EditModel.this.f80239f.mo116294a(EditModel.this.f80237d.isAllDay(), EditModel.this.mo114413F());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: r */
        public int mo114587r() {
            return EditModel.this.f80239f.mo116303c(EditModel.this.f80237d.isAllDay());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: s */
        public String mo114588s() {
            CalendarLocation location = EditModel.this.f80237d.getLocation();
            if (location == null) {
                return "";
            }
            String location2 = location.getLocation();
            Intrinsics.checkExpressionValueIsNotNull(location2, "it.location");
            return location2;
        }

        /* renamed from: Y */
        private final boolean m119376Y() {
            Iterator<CalendarEventAttendee> it = EditModel.this.f80240g.mo116223a().iterator();
            while (it.hasNext()) {
                CalendarEventAttendee next = it.next();
                Intrinsics.checkExpressionValueIsNotNull(next, "attendee");
                if (next.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: D */
        public RepeatEndFragmentData mo114549D() {
            return EditModel.this.f80247n.mo116306a(EditDateHelper.f79932a.mo114613a(EditModel.this.f80237d.getStartTime()), EditModel.this.f80242i.mo116292d().size(), EditModel.this.mo115128J());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: J */
        public boolean mo114555J() {
            if (!EditModel.this.f80237d.isAllDay() || !EditModel.this.mo114503n() || EditModel.this.mo114477b() || EditModel.this.mo115139o() || !EditModel.this.mo115142w()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: K */
        public EditView.SaveType mo114556K() {
            CalendarSchemaCompatibility compatibility;
            CalendarSchemaCollection calendarSchemaCollection = EditModel.this.f80237d.getCalendarSchemaCollection();
            if (calendarSchemaCollection != null && (compatibility = calendarSchemaCollection.getCompatibility()) != null && compatibility.disableEdit()) {
                return EditView.SaveType.DISABLE_SAVE_WITH_TOAST;
            }
            if (EditModel.this.mo115133a() || (EditModel.this.mo115140q() && !mo114551F())) {
                return EditView.SaveType.DISABLE_SAVE_TOTALLY;
            }
            return EditView.SaveType.ENABLE_SAVE;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: N */
        public boolean mo114559N() {
            CalendarDate calendarDate;
            EditRepeatPart eVar = EditModel.this.f80247n;
            CalendarDate a = EditDateHelper.f79932a.mo114613a(EditModel.this.f80237d.getStartTime());
            MeetingRoomLimitData J = EditModel.this.mo115128J();
            if (J != null) {
                calendarDate = J.mo116397a();
            } else {
                calendarDate = null;
            }
            return eVar.mo116318b(a, calendarDate);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: S */
        public ResourceExpandFragmentData mo114564S() {
            return new ResourceExpandFragmentData(mo114591v(), mo114592w(), mo114563R(), mo114573d().mo116387j(), mo114562Q(), mo114568W());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: b */
        public EventAttendeeData mo114571b() {
            ArrayList arrayList = new ArrayList(EditModel.this.f80240g.mo116223a());
            boolean Q = mo114562Q();
            return new EventAttendeeData(EditModel.this.f80240g.mo116222a(EditModel.this.ar(), EditModel.this.mo115131Y(), EditModel.this.f80237d.getAttendeeNum(), Q), arrayList, Q, EditModel.this.mo114503n());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: h */
        public String mo114577h() {
            if (EditModel.this.f80237d.isFree()) {
                String b = C32634ae.m125182b(R.string.Calendar_Detail_Free);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Detail_Free)");
                return b;
            }
            String b2 = C32634ae.m125182b(R.string.Calendar_Detail_Busy);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Detail_Busy)");
            return b2;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: t */
        public BuildingFragmentData mo114589t() {
            EditMeetingRoomPart cVar = EditModel.this.f80242i;
            long a = EditModel.this.f80241h.mo116356a();
            long b = EditModel.this.f80241h.mo116365b();
            String rRule = EditModel.this.f80237d.getRRule();
            if (rRule == null) {
                rRule = "";
            }
            return cVar.mo116276a(a, b, rRule, EditModel.this.f80237d.getOriginalTime(), EditModel.this.f80235b);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: u */
        public ResourceAppendFragmentData mo114590u() {
            EditMeetingRoomPart cVar = EditModel.this.f80242i;
            long a = EditModel.this.f80241h.mo116356a();
            long b = EditModel.this.f80241h.mo116365b();
            String rRule = EditModel.this.f80237d.getRRule();
            if (rRule == null) {
                rRule = "";
            }
            return cVar.mo116287b(a, b, rRule, EditModel.this.f80237d.getOriginalTime(), EditModel.this.f80235b);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: w */
        public Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114592w() {
            MeetingRoomStrategyHelper fVar = MeetingRoomStrategyHelper.f79934a;
            long a = EditModel.this.f80241h.mo116356a();
            long b = EditModel.this.f80241h.mo116365b();
            String rRule = EditModel.this.f80237d.getRRule();
            if (rRule == null) {
                rRule = "";
            }
            return fVar.mo114628a(a, b, rRule, EditModel.this.f80237d.getOriginalTime(), EditModel.this.f80242i.mo116278a(EditModel.this.mo114503n(), EditModel.this.ae()));
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: x */
        public RepeatFragmentData mo114593x() {
            return new RepeatFragmentData(EditModel.this.f80247n.mo116314b(), new ArrayList(EditModel.this.f80247n.mo116307a()), null, 4, null);
        }

        /* renamed from: X */
        private final EditEventUIVisible m119375X() {
            int c;
            if (!EditModel.this.mo114503n()) {
                c = IEditContract.EditType.f79921a.mo114405a();
            } else if (EditModel.this.mo114504p()) {
                c = IEditContract.EditType.f79921a.mo114406b();
            } else {
                c = IEditContract.EditType.f79921a.mo114407c();
            }
            return new EditEventUIVisible(c, EditModel.this.mo114477b(), EditModel.this.mo114507t(), EditModel.this.mo114508u(), m119377Z(), EditModel.this.mo115142w(), EditModel.this.mo115143x(), m119376Y(), EditModel.this.f80241h.mo116370d(), EditModel.this.f80242i.mo116279a(CalendarEventHelper.f79926a.mo114597a(EditModel.this.f80237d)), EditModel.this.f80237d.getIsDeletable());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: H */
        public DescriptionShowData mo114553H() {
            IEditContract.DescriptionShowType descriptionShowType = IEditContract.DescriptionShowType.SHOW_NULL;
            String str = "";
            if (mo114562Q() && !TextUtils.isEmpty(EditModel.this.f80246m)) {
                descriptionShowType = IEditContract.DescriptionShowType.SHOW_DATA;
                String str2 = EditModel.this.f80246m;
                if (EditModel.this.mo114508u()) {
                    str = Pattern.compile("<div></div>").matcher(str2).replaceAll(str);
                    Intrinsics.checkExpressionValueIsNotNull(str, "divMatcher.replaceAll(\"\")");
                } else {
                    str = str2;
                }
            } else if (!mo114562Q() && !TextUtils.isEmpty(EditModel.this.f80244k)) {
                if (!TextUtils.isEmpty(EditModel.this.f80245l)) {
                    descriptionShowType = IEditContract.DescriptionShowType.SHOW_DATA;
                    str = EditModel.this.f80245l;
                } else {
                    descriptionShowType = IEditContract.DescriptionShowType.SHOW_CONTENT;
                    str = EditModel.this.f80244k;
                }
            }
            return new DescriptionShowData(descriptionShowType, str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: c */
        public boolean mo114572c() {
            if (mo114562Q()) {
                return false;
            }
            int a = EditModel.this.f80240g.mo116222a(EditModel.this.ar(), EditModel.this.mo115131Y(), EditModel.this.f80237d.getAttendeeNum(), mo114562Q());
            TimeZone h = EditModel.this.f80241h.mo116374h();
            long j = (long) 1000;
            CalendarDate calendarDate = new CalendarDate(new Date(EditModel.this.f80241h.mo116356a() * j), h);
            CalendarDate calendarDate2 = new CalendarDate(new Date(EditModel.this.f80241h.mo116365b() * j), h);
            if (!EditModel.this.mo115140q() || a < 2 || a > 30 || EditModel.this.f80241h.mo116370d() || !calendarDate.sameDayWithZeroPoint(calendarDate2)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: i */
        public String mo114578i() {
            CalendarEvent.Visibility visibility = EditModel.this.f80237d.getVisibility();
            if (visibility != null) {
                int i = C31839g.f81106a[visibility.ordinal()];
                if (i == 1) {
                    String b = C32634ae.m125182b(R.string.Calendar_Edit_DefalutVisibility);
                    Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…r_Edit_DefalutVisibility)");
                    return b;
                } else if (i == 2) {
                    String b2 = C32634ae.m125182b(R.string.Calendar_Edit_Public);
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_Public)");
                    return b2;
                } else if (i == 3) {
                    String b3 = C32634ae.m125182b(R.string.Calendar_Edit_Private);
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ResUtil.getString(R.string.Calendar_Edit_Private)");
                    return b3;
                }
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: j */
        public AttendeeFragmentData mo114579j() {
            boolean z;
            boolean z2;
            Calendar.AccessRole accessRole;
            ArrayList<CalendarEventAttendee> m = EditModel.this.f80240g.mo116262m();
            CalendarEventAttendee b = EditModel.this.f80240g.mo116239b();
            boolean w = EditModel.this.mo115142w();
            if (EditModel.this.mo115140q() || !w) {
                z = false;
            } else {
                z = true;
            }
            if (EditModel.this.f80235b) {
                CalendarEventInstance calendarEventInstance = EditModel.this.f80234a;
                Calendar.AccessRole accessRole2 = null;
                if (calendarEventInstance != null) {
                    accessRole = calendarEventInstance.getCalAccessRole();
                } else {
                    accessRole = null;
                }
                if (accessRole != Calendar.AccessRole.WRITER) {
                    CalendarEventInstance calendarEventInstance2 = EditModel.this.f80234a;
                    if (calendarEventInstance2 != null) {
                        accessRole2 = calendarEventInstance2.getCalAccessRole();
                    }
                    if (accessRole2 != Calendar.AccessRole.OWNER && !EditModel.this.f80237d.isGuestsCanInvite() && !EditModel.this.f80237d.isGuestsCanModify()) {
                        z2 = false;
                        return new AttendeeFragmentData(new CalendarEventUniqueField(EditModel.this.f80237d.getCalendarId(), EditModel.this.f80237d.getKey(), Long.valueOf(EditModel.this.f80237d.getOriginalTime())), EditModel.this.f80237d.getAttendeeNum(), z2, m, b, EditModel.this.mo114507t(), EditModel.this.mo114508u(), z, EditModel.this.f80243j.mo116207m(), EditModel.this.ar());
                    }
                }
            }
            z2 = true;
            return new AttendeeFragmentData(new CalendarEventUniqueField(EditModel.this.f80237d.getCalendarId(), EditModel.this.f80237d.getKey(), Long.valueOf(EditModel.this.f80237d.getOriginalTime())), EditModel.this.f80237d.getAttendeeNum(), z2, m, b, EditModel.this.mo114507t(), EditModel.this.mo114508u(), z, EditModel.this.f80243j.mo116207m(), EditModel.this.ar());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: n */
        public TimeData mo114583n() {
            long a = EditModel.this.f80241h.mo116356a();
            long b = EditModel.this.f80241h.mo116365b();
            boolean d = EditModel.this.f80241h.mo116370d();
            long originalTime = EditModel.this.f80237d.getOriginalTime();
            String rRule = EditModel.this.f80237d.getRRule();
            if (rRule == null) {
                rRule = "";
            }
            TimeData timeData = new TimeData(a, b, d, originalTime, rRule, null, null, false, EditModel.this.f80242i.mo116292d(), EditModel.this.f80236c, 224, null);
            timeData.setTimeZoneId(EditModel.this.f80241h.mo116373g());
            if (C30022a.f74883b.mo112695c() && C32662o.m125345a(EditModel.this.f80240g.mo116223a(), EditModel.this.f80240g.mo116255f(), mo114562Q()) <= EditModel.this.f80240g.mo116257h()) {
                timeData.setFilterDisplayAttendeeList(EditModel.this.f80240g.mo116263n());
                timeData.setGuestInDifferentLocalTime(EventTimeZoneUtils.f80188a.mo114873b(timeData.getFilterDisplayAttendeeList(), timeData.getStartTime()));
            }
            return timeData;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public editViewData() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditViewData
        /* renamed from: a */
        public void mo114570a(Map<String, LevelRelatedInfo> map) {
            Intrinsics.checkParameterIsNotNull(map, "pbMultiLevelData");
            EditModel.this.f80242i.mo116283a(map);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: E */
    public boolean mo114412E() {
        return this.f80243j.mo116202h();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: F */
    public boolean mo114413F() {
        return this.f80243j.mo116203i();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: M */
    public ArrayList<CalendarEventAttendee> mo114419M() {
        return this.f80240g.mo116258i();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: N */
    public void mo114420N() {
        aB();
        aC();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: U */
    public ArrayList<String> mo114426U() {
        return this.f80240g.mo116248c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: W */
    public ArrayList<CalendarEventAttendee> mo114428W() {
        return this.f80240g.mo116223a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean aa() {
        return this.f80239f.mo116305d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean ab() {
        return this.f80247n.mo116330l();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public int af() {
        return this.f80240g.mo116251d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public int ag() {
        return this.f80240g.mo116253e();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public void ah() {
        this.f80240g.mo116266q();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public ArrayList<AbstractC30095b> ai() {
        return this.f80240g.mo116267r();
    }

    /* renamed from: ao */
    public IEditContract.IEditViewData mo109793f() {
        return new editViewData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public List<SimpleMember> ap() {
        return this.f80240g.mo116256g();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public Map<String, List<SimpleMember>> aq() {
        return this.f80240g.mo116271v();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public ArrayList<CalendarEventAttendee> as() {
        return this.f80242i.mo116292d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public MeetingRoomLimitData at() {
        return mo115128J();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: g */
    public long mo114493g() {
        return this.f80241h.mo116356a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: h */
    public long mo114496h() {
        return this.f80241h.mo116365b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: i */
    public String mo114498i() {
        return this.f80241h.mo116373g();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: k */
    public Calendar mo114500k() {
        return this.f80243j.mo116194d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: l */
    public Calendar mo114501l() {
        return this.f80243j.mo116192c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: m */
    public String mo114502m() {
        return this.f80237d.getCalendarId();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: s */
    public List<CalendarEventAttendee> mo114506s() {
        return this.f80240g.mo116265p();
    }

    /* renamed from: w */
    public boolean mo115142w() {
        return this.f80237d.isGuestsCanInvite();
    }

    /* renamed from: x */
    public boolean mo115143x() {
        return this.f80237d.isGuestsCanSeeOtherGuests();
    }

    private final void aA() {
        C30022a.f74884c.mo108450a(new C31622e(this));
    }

    private final void aB() {
        this.f80241h.mo116375i();
        m119271a(this, false, 1, (Object) null);
    }

    private final void aC() {
        this.f80239f.mo116299a(this.f80237d.isAllDay());
        aP();
    }

    private final String aE() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        return timeZone.getID();
    }

    private final void aM() {
        if (mo115141v()) {
            this.f80237d.setVideoMeeting(null);
        }
    }

    private final void aQ() {
        if (!mo114503n()) {
            aR();
        } else {
            aS();
        }
    }

    private final void aU() {
        this.f80248o.clear();
        aX();
    }

    private final void az() {
        boolean z;
        if (this.f80236c == null || this.f80234a == null) {
            z = false;
        } else {
            z = true;
        }
        this.f80235b = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: C */
    public boolean mo114410C() {
        if (this.f80242i.mo116277a().size() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: D */
    public boolean mo114411D() {
        return !this.f80240g.mo116264o().isEmpty();
    }

    /* renamed from: J */
    public final MeetingRoomLimitData mo115128J() {
        return this.f80242i.mo116286b(mo114503n(), ae());
    }

    /* renamed from: X */
    public void mo115130X() {
        this.f80239f.mo116304c();
        aP();
    }

    /* renamed from: Z */
    public void mo115132Z() {
        this.f80247n = new EditRepeatPart();
        aV();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: j */
    public String mo114499j() {
        String summary = this.f80237d.getSummary();
        Intrinsics.checkExpressionValueIsNotNull(summary, "mEvent.summary");
        return summary;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: p */
    public boolean mo114504p() {
        if (!mo114503n() || !mo115139o()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: r */
    public int mo114505r() {
        return this.f80242i.mo116277a().size();
    }

    private final void aF() {
        String str;
        this.f80243j.mo116185a(this.f80237d.getCalendarId());
        EditCalendarPart editCalendarPart = this.f80243j;
        CalendarEvent calendarEvent = this.f80236c;
        if (calendarEvent != null) {
            str = calendarEvent.getCalendarId();
        } else {
            str = null;
        }
        editCalendarPart.mo116191b(str);
    }

    private final void aN() {
        if (this.f80247n.mo116330l()) {
            mo115132Z();
        }
        if (this.f80239f.mo116305d()) {
            mo115130X();
        }
    }

    private final void aT() {
        this.f80237d.setAttendeeNum(C32662o.m125345a(this.f80240g.mo116223a(), this.f80240g.mo116255f(), mo115141v()));
    }

    private final void ax() {
        this.f80240g.mo116228a(new C31620b(this));
        this.f80243j.mo116184a(new C31621c(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: I */
    public boolean mo114416I() {
        CalendarDate calendarDate;
        EditRepeatPart eVar = this.f80247n;
        MeetingRoomLimitData J = mo115128J();
        if (J != null) {
            calendarDate = J.mo116397a();
        } else {
            calendarDate = null;
        }
        return eVar.mo116312a(calendarDate);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: K */
    public void mo114417K() {
        if (!mo114503n() || aZ()) {
            this.f80240g.mo116268s();
        }
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: L */
    public void mo114418L() {
        if (this.f80237d.getAttendees().size() != 0) {
            this.f80240g.mo116269t();
        }
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: O */
    public void mo114421O() {
        aD();
        aH();
        aF();
        aG();
        aJ();
        aK();
        aL();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: P */
    public void mo114422P() {
        aI();
        aF();
        aG();
        aJ();
        aK();
        aL();
    }

    /* renamed from: T */
    public final void mo115129T() {
        Calendar c = this.f80243j.mo116192c();
        if (c != null) {
            this.f80237d.setCalendarSchemaCollection(c.getCalendarEventSchema());
        }
    }

    /* renamed from: Y */
    public final boolean mo115131Y() {
        if (!av() || this.f80240g.mo116260k()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public void ak() {
        CalendarDate calendarDate;
        if (mo115140q()) {
            EditRepeatPart eVar = this.f80247n;
            MeetingRoomLimitData J = mo115128J();
            if (J != null) {
                calendarDate = J.mo116397a();
            } else {
                calendarDate = null;
            }
            eVar.mo116316b(calendarDate);
            aV();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean ar() {
        if (!mo114503n() || !aZ() || !aY()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean aw() {
        if (!mo114503n() || !av() || this.f80240g.mo116272w()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo115139o() {
        boolean z;
        Boolean isEditable;
        CalendarEvent calendarEvent = this.f80236c;
        if (calendarEvent == null) {
            return false;
        }
        if (calendarEvent == null || (isEditable = calendarEvent.getIsEditable()) == null) {
            z = false;
        } else {
            z = isEditable.booleanValue();
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo115140q() {
        if (!mo114503n() || mo114504p()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo115141v() {
        if (mo114507t() || mo114508u()) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditModel$bindListener$2", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/ICalendarPartListener;", "onCreateCalendarListFinished", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e$c */
    public static final class C31621c implements ICalendarPartListener {

        /* renamed from: a */
        final /* synthetic */ EditModel f80260a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.listener.model.ICalendarPartListener
        /* renamed from: a */
        public void mo114633a() {
            if (!this.f80260a.mo114503n()) {
                this.f80260a.f80237d.setCreatorCalendarId("");
                this.f80260a.f80237d.setOrganizerCalendarId("");
                this.f80260a.f80237d.setCalendarId(this.f80260a.f80243j.mo116204j());
                this.f80260a.mo115129T();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31621c(EditModel eVar) {
            this.f80260a = eVar;
        }
    }

    private final void aD() {
        CalendarEventInstance calendarEventInstance = this.f80234a;
        if (calendarEventInstance != null) {
            this.f80241h.mo116360a(calendarEventInstance);
            this.f80241h.mo116362a(this.f80237d.getStartTimeZone(), this.f80237d.getEndTimeZone(), mo114504p());
            m119275g(true);
        }
    }

    private final void aG() {
        if (CollectionUtils.isNotEmpty(this.f80237d.getReminders())) {
            EditReminderPart dVar = this.f80239f;
            List<CalendarEventReminder> reminders = this.f80237d.getReminders();
            Intrinsics.checkExpressionValueIsNotNull(reminders, "mEvent.reminders");
            dVar.mo116298a(reminders, this.f80237d.isAllDay());
        }
    }

    private final void aJ() {
        if (!TextUtils.isEmpty(this.f80237d.getRRule())) {
            EditRepeatPart eVar = this.f80247n;
            String rRule = this.f80237d.getRRule();
            Intrinsics.checkExpressionValueIsNotNull(rRule, "mEvent.rRule");
            eVar.mo116310a(rRule);
            EditRepeatPart eVar2 = this.f80247n;
            String rRule2 = this.f80237d.getRRule();
            Intrinsics.checkExpressionValueIsNotNull(rRule2, "mEvent.rRule");
            eVar2.mo116317b(rRule2);
        }
    }

    private final void aV() {
        if (!mo115140q()) {
            return;
        }
        if (this.f80247n.mo116326h()) {
            CalendarEvent calendarEvent = this.f80237d;
            calendarEvent.setRRule(this.f80247n.mo116325g() + this.f80247n.mo116328j());
            return;
        }
        this.f80237d.setRRule("");
    }

    private final boolean aY() {
        List<CalendarEventAttendee> attendees;
        CalendarEvent calendarEvent = this.f80236c;
        if (calendarEvent == null || (attendees = calendarEvent.getAttendees()) == null) {
            return false;
        }
        for (T t : attendees) {
            Intrinsics.checkExpressionValueIsNotNull(t, "attendee");
            if (t.isGroup() && t.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                return true;
            }
        }
        return false;
    }

    private final boolean aZ() {
        String str;
        CalendarEvent c = mo114478c();
        if (c != null && c.isGuestsCanInvite()) {
            return true;
        }
        CalendarEvent c2 = mo114478c();
        String str2 = null;
        if (c2 != null) {
            str = c2.getCalendarId();
        } else {
            str = null;
        }
        CalendarEvent c3 = mo114478c();
        if (c3 != null) {
            str2 = c3.getOrganizerCalendarId();
        }
        if (Intrinsics.areEqual(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: R */
    public boolean mo114424R() {
        CalendarEvent calendarEvent;
        if (!C30022a.f74883b.mo112703k() || mo114507t() || mo114508u() || (calendarEvent = this.f80236c) == null) {
            return false;
        }
        return Intrinsics.areEqual(calendarEvent.getCalendarId(), calendarEvent.getOrganizerCalendarId());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: V */
    public ArrayList<AddMailAttendeeData> mo114427V() {
        boolean z;
        EditAttendeePart aVar = this.f80240g;
        boolean u = mo114508u();
        if (mo115142w() || this.f80237d.isGuestsCanModify()) {
            z = true;
        } else {
            z = false;
        }
        return aVar.mo116226a(u, z, this.f80243j.mo116207m());
    }

    public final int ad() {
        int color = this.f80237d.getColor();
        ArrayList<Calendar> a = this.f80243j.mo116182a();
        int b = this.f80243j.mo116189b();
        if (color != -1 || !CollectionUtils.isNotEmpty(a) || b >= a.size()) {
            return color;
        }
        Calendar calendar = a.get(b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenIndex]");
        return calendar.getBackgroundColor();
    }

    public final boolean ae() {
        CalendarEvent c = mo114478c();
        if (c == null || this.f80241h.mo116377k() || (!Intrinsics.areEqual(c.getRRule(), this.f80237d.getRRule()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public String aj() {
        if (this.f80237d.getUIOrganizer() == null) {
            return this.f80243j.mo116204j();
        }
        CalendarEventAttendee uIOrganizer = this.f80237d.getUIOrganizer();
        Intrinsics.checkExpressionValueIsNotNull(uIOrganizer, "mEvent.uiOrganizer");
        String attendeeCalendarId = uIOrganizer.getAttendeeCalendarId();
        Intrinsics.checkExpressionValueIsNotNull(attendeeCalendarId, "mEvent.uiOrganizer.attendeeCalendarId");
        return attendeeCalendarId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean au() {
        boolean z = false;
        this.f80242i.mo116284a(false);
        Iterator<T> it = this.f80242i.mo116277a().iterator();
        while (it.hasNext()) {
            if (MeetingRoomFormHelper.f82028a.mo117088b(C32066d.m121954a((CalendarEventAttendee) it.next()))) {
                this.f80242i.mo116284a(true);
                z = true;
            }
        }
        return z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: t */
    public boolean mo114507t() {
        EditCalendarPart editCalendarPart = this.f80243j;
        if (editCalendarPart.mo116193c(editCalendarPart.mo116189b()) || (mo114503n() && this.f80237d.getSource() == CalendarEvent.Source.GOOGLE)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: u */
    public boolean mo114508u() {
        EditCalendarPart editCalendarPart = this.f80243j;
        if (editCalendarPart.mo116195d(editCalendarPart.mo116189b()) || (mo114503n() && this.f80237d.getSource() == CalendarEvent.Source.EXCHANGE)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: z */
    public String mo114510z() {
        boolean z;
        if (this.f80229F.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f80229F;
        }
        if (this.f80251s) {
            return "create_event_btn";
        }
        if (!TextUtils.isEmpty(this.f80253u)) {
            return "chat_findtime";
        }
        if (this.f80226C) {
            return "cal_profile";
        }
        return "full_calendar_editor";
    }

    private final void aH() {
        List<CalendarEventAttendee> attendees = this.f80237d.getAttendees();
        if (attendees != null) {
            ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
            ArrayList<CalendarEventAttendee> arrayList2 = new ArrayList<>();
            for (CalendarEventAttendee calendarEventAttendee : attendees) {
                if (calendarEventAttendee.isResource()) {
                    if (mo114477b() || !mo115139o()) {
                        calendarEventAttendee.setDeletable(false);
                    }
                    arrayList2.add(calendarEventAttendee);
                } else if (mo115139o() || mo115142w() || mo115143x()) {
                    arrayList.add(calendarEventAttendee);
                }
            }
            this.f80240g.mo116252d(arrayList);
            this.f80242i.mo116293d(arrayList2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>");
    }

    private final void aI() {
        List<CalendarEventAttendee> attendees = this.f80237d.getAttendees();
        if (attendees != null) {
            ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>();
            ArrayList<CalendarEventAttendee> arrayList2 = new ArrayList<>();
            for (CalendarEventAttendee calendarEventAttendee : attendees) {
                if (calendarEventAttendee.isResource()) {
                    arrayList2.add(calendarEventAttendee);
                } else if (mo115139o() || mo115142w() || mo115143x()) {
                    arrayList.add(calendarEventAttendee);
                }
            }
            this.f80240g.mo116252d(arrayList);
            this.f80242i.mo116293d(arrayList2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee>");
    }

    private final void aK() {
        if (!TextUtils.isEmpty(this.f80237d.getDescription()) || !TextUtils.isEmpty(this.f80237d.getDocsDescription())) {
            CalendarEvent.Source source = this.f80237d.getSource();
            String str = "";
            if (source != null) {
                int i = C31623f.f80263a[source.ordinal()];
                if (i == 1) {
                    String description = this.f80237d.getDescription();
                    if (description != null) {
                        str = description;
                    }
                    this.f80246m = str;
                    return;
                } else if (i == 2) {
                    String description2 = this.f80237d.getDescription();
                    if (description2 != null) {
                        str = description2;
                    }
                    this.f80246m = str;
                    return;
                } else if (i == 3) {
                    String description3 = this.f80237d.getDescription();
                    if (description3 != null) {
                        str = description3;
                    }
                    this.f80244k = str;
                    return;
                }
            }
            String description4 = this.f80237d.getDescription();
            if (description4 == null) {
                description4 = str;
            }
            this.f80244k = description4;
            String docsDescription = this.f80237d.getDocsDescription();
            if (docsDescription != null) {
                str = docsDescription;
            }
            this.f80245l = str;
        }
    }

    private final void aL() {
        if (!CollectionUtils.isEmpty(this.f80237d.getAttachment())) {
            this.f80248o.clear();
            List<CalendarEventAttachment> attachment = this.f80237d.getAttachment();
            Intrinsics.checkExpressionValueIsNotNull(attachment, "mEvent.attachment");
            for (T t : attachment) {
                if (!t.isDeleted()) {
                    this.f80248o.add(new AttachmentItemData(t.getFileToken(), t.getFileSize(), t.getName(), t.getType(), t.getLocalPath(), t.getUploaderUserId()));
                }
            }
        }
    }

    private final void aO() {
        if (!mo114503n()) {
            this.f80237d.setCalendarId(this.f80243j.mo116204j());
            if (this.f80243j.mo116202h()) {
                this.f80237d.setSource(CalendarEvent.Source.GOOGLE);
            } else if (this.f80243j.mo116203i()) {
                this.f80237d.setSource(CalendarEvent.Source.EXCHANGE);
            } else {
                this.f80237d.setSource(CalendarEvent.Source.ANDROID_APP);
            }
            mo115129T();
        } else if (!mo114477b() && mo115139o()) {
            this.f80237d.setCalendarId(this.f80243j.mo116204j());
        }
    }

    private final void aP() {
        List<CalendarEventReminder> list;
        boolean z;
        String str;
        List<CalendarEventReminder> list2 = null;
        if (!mo114503n()) {
            list = this.f80239f.mo116295a("", null, this.f80237d.isAllDay());
        } else {
            EditReminderPart dVar = this.f80239f;
            CalendarEvent calendarEvent = this.f80236c;
            if (calendarEvent != null) {
                str = calendarEvent.getId();
            } else {
                str = null;
            }
            CalendarEvent calendarEvent2 = this.f80236c;
            if (calendarEvent2 != null) {
                list2 = calendarEvent2.getReminders();
            }
            list = dVar.mo116295a(str, list2, this.f80237d.isAllDay());
        }
        this.f80237d.setReminders(list);
        CalendarEvent calendarEvent3 = this.f80237d;
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        calendarEvent3.setHasAlarm(z);
    }

    private final void aR() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f80240g.mo116264o());
        int i = 0;
        while (i < arrayList.size()) {
            Object obj = arrayList.get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "eventAttendees[i]");
            if (((CalendarEventAttendee) obj).getStatus() == CalendarEventAttendee.Status.REMOVED) {
                Intrinsics.checkExpressionValueIsNotNull(arrayList.remove(i), "eventAttendees.removeAt(i)");
            } else {
                i++;
            }
        }
        arrayList.addAll(this.f80242i.mo116290c());
        mo115138f(arrayList.isEmpty());
        this.f80237d.setAttendees(arrayList);
        CalendarEvent calendarEvent = this.f80237d;
        calendarEvent.setHasAttendee(CollectionUtils.isNotEmpty(calendarEvent.getAttendees()));
        aT();
    }

    private final void aW() {
        if (mo115140q()) {
            CalendarEvent.Source source = this.f80237d.getSource();
            if (source != null) {
                int i = C31623f.f80265c[source.ordinal()];
                if (i == 1 || i == 2) {
                    this.f80237d.setDescription(this.f80246m);
                    this.f80237d.setDocsDescription("");
                    return;
                } else if (i == 3) {
                    this.f80237d.setDescription(this.f80244k);
                    return;
                }
            }
            this.f80237d.setDescription(this.f80244k);
            this.f80237d.setDocsDescription(this.f80245l);
        }
    }

    private final void aX() {
        if (mo114504p()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f80248o.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo112888a());
            }
            List<CalendarEventAttachment> attachment = this.f80237d.getAttachment();
            Intrinsics.checkExpressionValueIsNotNull(attachment, "mEvent.attachment");
            ArrayList<CalendarEventAttachment> arrayList2 = new ArrayList();
            Iterator<T> it2 = attachment.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                T t = next;
                if (t.isDeleted() || arrayList.contains(t.getFileToken())) {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            for (CalendarEventAttachment calendarEventAttachment : arrayList2) {
                calendarEventAttachment.setDeleted(true);
            }
        }
    }

    private final void ay() {
        this.f80237d.setSummary(this.f80254v);
        this.f80237d.setId("0");
        this.f80237d.setKey("");
        this.f80237d.setOriginalTime(0);
        this.f80237d.setDisplayType(CalendarEvent.DisplayType.FULL);
        this.f80237d.setType(CalendarEvent.Type.DEFAULT_TYPE);
        this.f80237d.setIsEditable(true);
        this.f80237d.setColor(-1);
        this.f80237d.setVisibility(CalendarEvent.Visibility.DEFAULT);
        this.f80237d.setLocation(new CalendarLocation());
        VideoMeeting.C16118a aVar = new VideoMeeting.C16118a();
        aVar.f42223e = VideoMeeting.VideoMeetingType.VCHAT;
        CalendarEvent calendarEvent = this.f80237d;
        VideoMeeting a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "videoMeetingBuilder.build()");
        calendarEvent.setVideoMeeting(new DoVideoMeeting(a));
        this.f80235b = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo114415H() {
        /*
            r5 = this;
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r0 = r5.f80237d
            java.lang.String r0 = r0.getSummary()
            boolean r1 = r5.mo114503n()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0039
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r1 = r5.f80236c
            r4 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.getSummary()
            goto L_0x0019
        L_0x0018:
            r1 = r4
        L_0x0019:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x002a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x0041
        L_0x002a:
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r1 = r5.f80236c
            if (r1 == 0) goto L_0x0032
            java.lang.String r4 = r1.getSummary()
        L_0x0032:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            r2 = r0 ^ 1
            goto L_0x0042
        L_0x0039:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.EditModel.mo114415H():boolean");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    public boolean av() {
        Boolean bool;
        if (!mo114503n()) {
            return false;
        }
        EventAttendeeInfo eventAttendeeInfo = this.f80237d.getEventAttendeeInfo();
        if (eventAttendeeInfo != null) {
            bool = eventAttendeeInfo.all_individual_attendee;
        } else {
            bool = null;
        }
        if (!Intrinsics.areEqual((Object) bool, (Object) false) || this.f80237d.getDisplayType() != CalendarEvent.DisplayType.FULL) {
            return false;
        }
        if (this.f80237d.isGuestsCanSeeOtherGuests() || Intrinsics.areEqual(this.f80237d.getCalendarId(), this.f80237d.getOrganizerCalendarId())) {
            return true;
        }
        return false;
    }

    private final void aS() {
        ArrayList arrayList = new ArrayList(this.f80237d.getAttendees());
        ArrayList arrayList2 = new ArrayList();
        if (mo115139o() || mo115142w()) {
            arrayList2.addAll(this.f80240g.mo116264o());
        } else {
            arrayList2.addAll(this.f80237d.getAttendees());
        }
        if (CollectionUtils.isNotEmpty(this.f80242i.mo116277a())) {
            arrayList2.addAll(this.f80242i.mo116290c());
        } else if (CollectionUtils.isNotEmpty(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) it.next();
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "attendee");
                if (calendarEventAttendee.isResource()) {
                    calendarEventAttendee.setStatus(CalendarEventAttendee.Status.REMOVED);
                    arrayList2.add(calendarEventAttendee);
                }
            }
        }
        mo115138f(arrayList2.isEmpty());
        this.f80237d.setAttendees(arrayList2);
        if (this.f80240g.mo116238a(ar(), mo115131Y())) {
            aT();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: Q */
    public void mo114423Q() {
        if (!(CollectionUtils.isEmpty(this.f80255w) || CollectionUtils.isEmpty(this.f80256x))) {
            ArrayList<CalendarEventAttendee> arrayList = this.f80255w;
            Integer num = null;
            Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
            ArrayList<String> arrayList2 = this.f80256x;
            if (arrayList2 != null) {
                num = Integer.valueOf(arrayList2.size());
            }
            if (!(!Intrinsics.areEqual(valueOf, num))) {
                HashMap<String, CalendarEventAttendee> hashMap = new HashMap<>();
                ArrayList<CalendarEventAttendee> arrayList3 = this.f80255w;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        CalendarEventAttendee calendarEventAttendee = arrayList3.get(i);
                        Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "extraAttendees[i]");
                        CalendarEventAttendee calendarEventAttendee2 = calendarEventAttendee;
                        ArrayList<String> arrayList4 = this.f80256x;
                        if (arrayList4 != null) {
                            String str = arrayList4.get(i);
                            Intrinsics.checkExpressionValueIsNotNull(str, "extraChatterIds[i]");
                            hashMap.put(str, calendarEventAttendee2);
                        }
                    }
                }
                this.f80226C = true;
                this.f80240g.mo116237a(hashMap, null, this.f80236c, mo114503n(), mo115141v());
                aQ();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public boolean mo114477b() {
        if (!mo114503n() || this.f80237d.getSource() != CalendarEvent.Source.ANDROID) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114448a(boolean z) {
        this.f80232I = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public void mo114472b(int i) {
        this.f80224A = i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public EditCalendarPart.CHANGE_TYPE mo114430a(int i) {
        return this.f80243j.mo116190b(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public void mo114473b(CalendarEventAttendee calendarEventAttendee) {
        this.f80240g.mo116241b(calendarEventAttendee);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: c */
    public void mo114479c(int i) {
        this.f80240g.mo116227a(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public void mo114475b(Map<String, UserAttendeeBaseInfo> map) {
        Intrinsics.checkParameterIsNotNull(map, "attendeeBaseInfos");
        this.f80240g.mo116245b(map);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: c */
    public void mo114480c(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
        this.f80242i.mo116285a(calendarEventAttendee);
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: d */
    public void mo114485d(int i) {
        if (!mo114477b()) {
            this.f80237d.setColor(i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: e */
    public void mo114488e(int i) {
        this.f80247n.mo116308a(i);
        this.f80247n.mo116323e();
        aV();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: f */
    public boolean mo114492f(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "displayAttendees");
        return this.f80240g.mo116250c(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: g */
    public void mo114494g(int i) {
        this.f80240g.mo116249c(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: h */
    public void mo114497h(int i) {
        this.f80240g.mo116240b(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "calendarSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.e$e */
    public static final class C31622e implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ EditModel f80262a;

        C31622e(EditModel eVar) {
            this.f80262a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            EditReminderPart dVar = this.f80262a.f80239f;
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "calendarSetting");
            dVar.mo116297a(calendarSetting);
            this.f80262a.f80241h.mo116357a(calendarSetting.getDefaultEventDuration());
        }
    }

    /* renamed from: a */
    private final void m119270a(CalendarDate calendarDate) {
        if (this.f80247n.mo116331m() && this.f80247n.mo116313a(this.f80241h.mo116376j(), calendarDate)) {
            aV();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public void mo114474b(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "displayAttendees");
        this.f80240g.mo116243b(arrayList);
        this.f80240g.mo116261l();
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: c */
    public void mo114481c(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoom");
        this.f80242i.mo116291c(arrayList);
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: d */
    public ArrayList<CalendarEventAttendee> mo114484d(boolean z) {
        ArrayList<CalendarEventAttendee> arrayList = new ArrayList<>(this.f80240g.mo116264o());
        if (mo114412E()) {
            return this.f80240g.mo116224a(arrayList, this.f80243j.mo116205k(), z);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: e */
    public void mo114489e(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "newAttendees");
        this.f80240g.mo116234a(arrayList, !mo114503n());
        aQ();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: g */
    public void mo114495g(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "exceedLimitMeetingGroup");
        this.f80240g.mo116254e(arrayList);
    }

    /* renamed from: b */
    public void mo115137b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (!TextUtils.isEmpty(str)) {
            this.f80241h.mo116361a(str);
            this.f80241h.mo116367b(str);
            this.f80241h.mo116369c(str);
            EditTimePart gVar = this.f80241h;
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            gVar.mo116363a(timeZone);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: c */
    public void mo114482c(boolean z) {
        this.f80233J = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: d */
    public boolean mo114486d(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendees");
        return this.f80240g.mo116247b(arrayList, mo115141v());
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: e */
    public void mo114490e(boolean z) {
        if (!mo114477b()) {
            this.f80237d.setIsFree(z);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: f */
    public void mo114491f(int i) {
        if (i != 17) {
            switch (i) {
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    this.f80237d.setLocation(new CalendarLocation());
                    return;
                case 13:
                    this.f80239f.mo116296a();
                    aP();
                    return;
                case 14:
                    this.f80247n = new EditRepeatPart();
                    aV();
                    return;
                default:
                    return;
            }
        } else {
            this.f80244k = "";
            this.f80245l = "";
            this.f80246m = "";
            aW();
        }
    }

    /* renamed from: a */
    private final void m119272a(EditCalendarPart.CHANGE_TYPE change_type) {
        int i = C31623f.f80264b[change_type.ordinal()];
        if (i == 1 || i == 2) {
            this.f80237d.setVideoMeeting(null);
        } else if (i == 3 || i == 4) {
            VideoMeeting.C16118a aVar = new VideoMeeting.C16118a();
            aVar.f42223e = VideoMeeting.VideoMeetingType.VCHAT;
            CalendarEvent calendarEvent = this.f80237d;
            VideoMeeting a = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "videoMeetingBuilder.build()");
            calendarEvent.setVideoMeeting(new DoVideoMeeting(a));
        }
    }

    /* renamed from: g */
    private final void m119275g(boolean z) {
        if (mo115140q()) {
            this.f80237d.setIsAllDay(this.f80241h.mo116370d());
            this.f80237d.setStartTime(this.f80241h.mo116356a());
            this.f80237d.setStartTimeZone(this.f80241h.mo116371e());
            this.f80237d.setEndTime(this.f80241h.mo116365b());
            this.f80237d.setEndTimeZone(this.f80241h.mo116372f());
            if (!mo114477b() && !z) {
                CalendarEvent calendarEvent = this.f80237d;
                calendarEvent.setIsFree(calendarEvent.isAllDay());
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: b */
    public void mo114476b(boolean z) {
        this.f80225B = z;
    }

    /* renamed from: f */
    public final void mo115138f(boolean z) {
        boolean z2;
        DoVideoMeeting videoMeeting;
        VideoMeeting.C16118a newBuilder;
        List<CalendarEventAttendee> attendees = this.f80237d.getAttendees();
        if (attendees == null || attendees.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f80227D && this.f80237d.getIsEditable().booleanValue() && z2 && !z && (videoMeeting = this.f80237d.getVideoMeeting()) != null && videoMeeting.getVchat().video_meeting_type == VideoMeeting.VideoMeetingType.NO_VIDEO_MEETING && (newBuilder = videoMeeting.getVchat().newBuilder()) != null) {
            newBuilder.mo57891a(VideoMeeting.VideoMeetingType.VCHAT);
            CalendarEvent calendarEvent = this.f80237d;
            VideoMeeting a = newBuilder.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "it.build()");
            calendarEvent.setVideoMeeting(new DoVideoMeeting(a));
        }
    }

    /* renamed from: b */
    private final void m119273b(Bundle bundle) {
        this.f80250r = true;
        this.f80241h.mo116358a(bundle.getLong("event_start_time", 0));
        this.f80241h.mo116366b(bundle.getLong("event_end_time", 0));
        EditTimePart gVar = this.f80241h;
        Serializable serializable = bundle.getSerializable("event_start_date");
        CalendarEvent calendarEvent = null;
        if (!(serializable instanceof CalendarDate)) {
            serializable = null;
        }
        gVar.mo116359a((CalendarDate) serializable);
        EditTimePart gVar2 = this.f80241h;
        String string = bundle.getString("event_start_time_zone_id", aE());
        Intrinsics.checkExpressionValueIsNotNull(string, "saveStates.getString(\n  …, getDefaultTimeZoneId())");
        gVar2.mo116361a(string);
        EditTimePart gVar3 = this.f80241h;
        String string2 = bundle.getString("event_end_time_zone_id", aE());
        Intrinsics.checkExpressionValueIsNotNull(string2, "saveStates.getString(\n  …, getDefaultTimeZoneId())");
        gVar3.mo116367b(string2);
        Serializable serializable2 = bundle.getSerializable("calendarInstance");
        if (!(serializable2 instanceof CalendarEventInstance)) {
            serializable2 = null;
        }
        this.f80234a = (CalendarEventInstance) serializable2;
        this.f80236c = LargeCalendarTransmitHelper.m116179a(bundle);
        Serializable serializable3 = bundle.getSerializable("originCalendarEvent");
        if (serializable3 instanceof CalendarEvent) {
            calendarEvent = serializable3;
        }
        CalendarEvent calendarEvent2 = calendarEvent;
        if (calendarEvent2 == null) {
            CalendarEvent calendarEvent3 = this.f80236c;
            if (calendarEvent3 != null) {
                calendarEvent2 = new CalendarEvent(calendarEvent3);
            } else {
                calendarEvent2 = new CalendarEvent();
            }
        }
        this.f80237d = calendarEvent2;
        CalendarEvent calendarEvent4 = this.f80236c;
        if (calendarEvent4 != null) {
            this.f80252t = new CalendarEvent(calendarEvent4);
        }
        az();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public Bundle mo114429a(Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Exception e) {
                C3474b.m14692a(e);
                Log.m165383e("EditModel", C32673y.m125377c("save state error"));
            }
        }
        bundle.putLong("event_start_time", this.f80241h.mo116356a());
        bundle.putLong("event_end_time", this.f80241h.mo116365b());
        bundle.putSerializable("event_start_date", this.f80241h.mo116368c());
        bundle.putSerializable("calendarInstance", this.f80234a);
        bundle.putString("event_start_time_zone_id", this.f80241h.mo116371e());
        bundle.putString("event_end_time_zone_id", this.f80241h.mo116372f());
        LargeCalendarTransmitHelper.m116182a(bundle, this.f80236c);
        if (LargeCalendarTransmitHelper.m116186a(this.f80237d)) {
            bundle.putSerializable("originCalendarEvent", this.f80237d);
        }
        bundle.putBoolean("recover_append", true);
        return bundle;
    }

    /* renamed from: c */
    private final void m119274c(Bundle bundle) {
        String string = bundle.getString("event_summary", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "extras.getString(\n      …ig.KEY_EVENT_SUMMARY, \"\")");
        this.f80254v = string;
        this.f80241h.mo116358a(bundle.getLong("event_start_time", 0));
        this.f80241h.mo116366b(bundle.getLong("event_end_time", 0));
        EditTimePart gVar = this.f80241h;
        Serializable serializable = bundle.getSerializable("event_start_date");
        if (!(serializable instanceof CalendarDate)) {
            serializable = null;
        }
        gVar.mo116359a((CalendarDate) serializable);
        Serializable serializable2 = bundle.getSerializable("calendarInstance");
        if (!(serializable2 instanceof CalendarEventInstance)) {
            serializable2 = null;
        }
        this.f80234a = (CalendarEventInstance) serializable2;
        this.f80236c = LargeCalendarTransmitHelper.m116179a(bundle);
        this.f80249q = bundle.getBoolean("append_from_detail_page", false);
        this.f80251s = bundle.getBoolean("append_from_calendar_append_view", false);
        String string2 = bundle.getString("append_chat_type", "");
        Intrinsics.checkExpressionValueIsNotNull(string2, "extras.getString(\n      …AMS_APPEND_CHAT_TYPE, \"\")");
        this.f80228E = string2;
        this.f80230G = bundle.getBoolean("append_event_is_open_video", false);
        String string3 = bundle.getString("key_param_default_calendar_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string3, "extras.getString(EditCon…_DEFAULT_CALENDAR_ID, \"\")");
        this.f80231H = string3;
        if (!this.f80249q) {
            ay();
        } else {
            CalendarEvent calendarEvent = this.f80236c;
            if (calendarEvent != null) {
                this.f80237d = new CalendarEvent(calendarEvent);
                this.f80252t = new CalendarEvent(this.f80236c);
                this.f80235b = true;
            } else {
                ay();
            }
        }
        String string4 = bundle.getString("chat_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string4, "extras.getString(\n      …g.KEY_PARAMS_CHAT_ID, \"\")");
        this.f80253u = string4;
        Serializable serializable3 = bundle.getSerializable("calendar_attendees");
        if (!(serializable3 instanceof ArrayList)) {
            serializable3 = null;
        }
        ArrayList<CalendarEventAttendee> arrayList = (ArrayList) serializable3;
        this.f80255w = arrayList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setIsEditable(true);
            }
        }
        Serializable serializable4 = bundle.getSerializable("calendar_attendee_related_chatter_ids");
        if (!(serializable4 instanceof ArrayList)) {
            serializable4 = null;
        }
        this.f80256x = (ArrayList) serializable4;
        ArrayList<String> stringArrayList = bundle.getStringArrayList("calendar_attendee_chatter_ids");
        if (stringArrayList != null) {
            this.f80257y = stringArrayList;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("calendar_attendee_chat_ids");
        if (stringArrayList2 != null) {
            this.f80258z = stringArrayList2;
        }
        Object obj = bundle.get("key_params_resource_list");
        if (!(obj instanceof ArrayList)) {
            obj = null;
        }
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2 != null) {
            for (Object obj2 : arrayList2) {
                if (!(obj2 instanceof EventMeetingRoomData)) {
                    obj2 = null;
                }
                EventMeetingRoomData eventMeetingRoomData = (EventMeetingRoomData) obj2;
                if (eventMeetingRoomData != null) {
                    ArrayList<CalendarEventAttendee> arrayList3 = new ArrayList<>();
                    arrayList3.add(EditAttendeeHelper.f79930a.mo114607a(eventMeetingRoomData));
                    mo114481c(arrayList3);
                }
            }
        }
        String string5 = bundle.getString("edit_hitpoint_action_source", "");
        Intrinsics.checkExpressionValueIsNotNull(string5, "extras.getString(EditAtt…M_EDIT_ACTION_SOURCE, \"\")");
        this.f80229F = string5;
    }

    /* renamed from: a */
    private final void m119269a(int i, int i2) {
        this.f80240g.mo116270u();
        this.f80240g.mo116231a(this.f80243j.mo116197e(i), this.f80243j.mo116197e(i2));
        this.f80240g.mo116242b(this.f80243j.mo116198f(i2), this.f80243j.mo116201g(i2));
    }

    public EditModel(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle.getBoolean("append_from_detail_page", false)) {
            this.f80249q = true;
        }
        if (bundle2 != null && bundle2.getBoolean("recover_append", false)) {
            m119273b(bundle2);
        } else if (bundle != null) {
            m119274c(bundle);
        }
        aA();
        ax();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public ArrayList<CalendarEventAttendee> mo114431a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "addExternalEmails");
        Intrinsics.checkParameterIsNotNull(arrayList2, "deleteExternalEmails");
        return this.f80240g.mo116225a(arrayList, arrayList2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114432a(int i, EditCalendarPart.CHANGE_TYPE change_type) {
        Intrinsics.checkParameterIsNotNull(change_type, "changeType");
        int b = this.f80243j.mo116189b();
        this.f80243j.mo116183a(i);
        aO();
        if (change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE || change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_GOOGLE || change_type == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_LARK || change_type == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_LARK) {
            this.f80237d.setColor(-1);
            this.f80242i = new EditMeetingRoomPart();
            this.f80240g = EditAttendeePart.f81274a.mo116275a(this.f80240g);
            aQ();
            if (mo115141v()) {
                this.f80237d.setDescription(this.f80246m);
                this.f80237d.setDocsDescription("");
            } else {
                this.f80237d.setDescription(this.f80244k);
                this.f80237d.setDocsDescription(this.f80245l);
            }
            aU();
            if (change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE) {
                aN();
            }
            m119272a(change_type);
        }
        if (change_type == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_EXCHANGE || change_type == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_GOOGLE) {
            this.f80240g = EditAttendeePart.f81274a.mo116275a(this.f80240g);
            aQ();
            if (change_type == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_EXCHANGE) {
                aN();
            }
        }
        if (change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE || change_type == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_EXCHANGE || change_type == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_EXCHANGE) {
            this.f80240g.mo116229a(this.f80243j.mo116206l());
            m119269a(b, i);
            aQ();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114434a(IEditContract.RequestBuildingResultType requestBuildingResultType, ArrayList<CalendarBuilding> arrayList) {
        Intrinsics.checkParameterIsNotNull(requestBuildingResultType, "requestResultType");
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarBuildings");
        this.f80242i.mo116280a(requestBuildingResultType);
        EditMeetingRoomPart cVar = this.f80242i;
        ArrayList<CalendarBuilding> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C32514b.m124511a((CalendarBuilding) it.next()));
        }
        cVar.mo116282a(new ArrayList<>(arrayList3));
        this.f80242i.mo116288b(arrayList);
    }

    /* renamed from: a */
    static /* synthetic */ void m119271a(EditModel eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eVar.m119275g(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.IEditContract.IEditModelApi
    /* renamed from: a */
    public void mo114433a(long j, long j2, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        CalendarDate j3 = this.f80241h.mo116376j();
        mo115137b(str);
        if (z != this.f80241h.mo116370d()) {
            this.f80239f.mo116299a(z);
        }
        this.f80241h.mo116358a(j);
        this.f80241h.mo116366b(j2);
        this.f80241h.mo116364a(z);
        m119271a(this, false, 1, (Object) null);
        aP();
        m119270a(j3);
    }
}
