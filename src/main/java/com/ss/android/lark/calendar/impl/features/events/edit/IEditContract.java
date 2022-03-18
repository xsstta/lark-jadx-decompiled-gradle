package com.ss.android.lark.calendar.impl.features.events.edit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.EditView;
import com.ss.android.lark.calendar.impl.features.events.edit.data.AttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.CalendarFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionSaveData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionShowData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatEndFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ResourceExpandFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.mail.AddMailAttendeeData;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditViewPartVisible;
import com.ss.android.lark.calendar.impl.features.events.edit.part.MeetingRoomLimitData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract;", "", "()V", "DescriptionShowType", "EditType", "EditViewParts", "EventType", "IEditModelApi", "IEditViewAction", "IEditViewApi", "IEditViewData", "RequestBuildingResultType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IEditContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "", "(Ljava/lang/String;I)V", "NO_RESULT", "SUCCESS_WITH_DATA", "SUCCESS_NO_DATA", "FAILURE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum RequestBuildingResultType {
        NO_RESULT,
        SUCCESS_WITH_DATA,
        SUCCESS_NO_DATA,
        FAILURE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$EditType;", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$a */
    public interface EditType {

        /* renamed from: a */
        public static final Companion f79921a = Companion.f79922a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$EditType$Companion;", "", "()V", "NEW_EVENT", "", "getNEW_EVENT", "()I", "setNEW_EVENT", "(I)V", "PART_EDIT", "getPART_EDIT", "setPART_EDIT", "WHOLE_EDIT", "getWHOLE_EDIT", "setWHOLE_EDIT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$a$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f79922a = new Companion();

            /* renamed from: b */
            private static int f79923b = 1;

            /* renamed from: c */
            private static int f79924c = 2;

            /* renamed from: d */
            private static int f79925d = 3;

            private Companion() {
            }

            /* renamed from: a */
            public final int mo114405a() {
                return f79923b;
            }

            /* renamed from: b */
            public final int mo114406b() {
                return f79924c;
            }

            /* renamed from: c */
            public final int mo114407c() {
                return f79925d;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u0018\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0011j\b\u0012\u0004\u0012\u00020\u0015`\u0013H&J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H&J\u0018\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0011j\b\u0012\u0004\u0012\u00020\u0019`\u0013H&J \u0010\u001a\u001a\u00020\u00042\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u0010\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H&J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H&J\u0018\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\n\u0010\"\u001a\u0004\u0018\u00010#H&J\b\u0010$\u001a\u00020 H&J\n\u0010%\u001a\u0004\u0018\u00010#H&J\n\u0010&\u001a\u0004\u0018\u00010'H&J\b\u0010(\u001a\u00020\u0015H&J\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020-H&J\b\u0010.\u001a\u00020\u0015H&J\u001c\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u0017\u0018\u000100H&J\u001c\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0013H&J\u001c\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0013H&J\u0018\u00104\u001a\u0012\u0012\u0004\u0012\u0002050\u0011j\b\u0012\u0004\u0012\u000205`\u0013H&J \u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u00107\u001a\u00020\u0004H&JH\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0011j\b\u0012\u0004\u0012\u00020\u0015`\u00132\u0016\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0011j\b\u0012\u0004\u0012\u00020\u0015`\u0013H&J\b\u0010;\u001a\u00020\u0015H&J\n\u0010<\u001a\u0004\u0018\u00010=H&J\u0014\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?H&J \u0010A\u001a\u00020\u00042\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\b\u0010C\u001a\u00020 H&J\b\u0010D\u001a\u00020 H&J\u0018\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\b\u0010F\u001a\u00020\u0015H&J\n\u0010G\u001a\u0004\u0018\u00010-H&J\b\u0010H\u001a\u00020\u0015H&J\b\u0010I\u001a\u00020\u0015H&J\u0010\u0010J\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0017H&J\b\u0010K\u001a\u00020+H&J\b\u0010L\u001a\u00020\u0015H&J\b\u0010M\u001a\u00020\nH&J\b\u0010N\u001a\u00020\nH&J\b\u0010O\u001a\u00020\nH&J\b\u0010P\u001a\u00020\u0004H&J\b\u0010Q\u001a\u00020\u0004H&J\b\u0010R\u001a\u00020\u0004H&J\b\u0010S\u001a\u00020\u0004H&J\b\u0010T\u001a\u00020\u0004H&J\b\u0010U\u001a\u00020\u0004H&J\b\u0010V\u001a\u00020\u0004H&J\b\u0010W\u001a\u00020\u0004H&J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020 H&J\b\u0010Z\u001a\u00020\u0004H&J\b\u0010[\u001a\u00020\u0004H&J\b\u0010\\\u001a\u00020\u0004H&J\b\u0010]\u001a\u00020\u0004H&J\u0010\u0010^\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020 H&J\b\u0010_\u001a\u00020\u0004H&J\b\u0010`\u001a\u00020\u0004H&J\b\u0010a\u001a\u00020\u0004H&J\b\u0010b\u001a\u00020\u0004H&J\b\u0010c\u001a\u00020\u0004H&J\b\u0010d\u001a\u00020\u0004H&J\b\u0010e\u001a\u00020\u0004H&J\b\u0010f\u001a\u00020\u0004H&J\b\u0010g\u001a\u00020\u0004H&J\b\u0010h\u001a\u00020\u0004H&J\b\u0010i\u001a\u00020\u0004H&J\b\u0010j\u001a\u00020\u0004H&J(\u0010k\u001a\u00020\n2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\u0006\u0010m\u001a\u00020\u0004H&J\b\u0010n\u001a\u00020\nH&J\"\u0010o\u001a\u00020\n2\u0018\u0010p\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001700H&J\u0010\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\u0004H&J\u001c\u0010s\u001a\u00020\n2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020v0uH&J \u0010w\u001a\u00020\n2\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u0001\u0010x\u001a\u00020\u00042\u001a\u0010y\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00132\u001a\u0010z\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00132\u001a\u0010{\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00132\"\u0010|\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120}j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012`~H&J\b\u0010\u001a\u00020\nH&J\t\u0010\u0001\u001a\u00020\nH&J\u001a\u0010\u0001\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0007\u0010\u0001\u001a\u00020\u001eH&J\u0014\u0010\u0001\u001a\u00020\n2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020 H&JG\u0010\u0001\u001a\u00020\n2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020#0\u0011j\b\u0012\u0004\u0012\u00020#`\u00132#\u0010\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040}j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004`~H&J\u0013\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u0001H&J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020 H&J\u0013\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u0001H&J\"\u0010\u0001\u001a\u00020\n2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020#0\u0011j\b\u0012\u0004\u0012\u00020#`\u0013H&J\u0014\u0010\u0001\u001a\u00020\n2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0012H&J$\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020-2\u0007\u0010\u0001\u001a\u00020-2\u0007\u0010\u0001\u001a\u00020=H&J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u0015H&J\"\u0010\u0001\u001a\u00020\n2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020 H&J\u0012\u0010\u0001\u001a\u00020\n2\u0007\u0010 \u0001\u001a\u00020\u0004H&J\t\u0010¡\u0001\u001a\u00020\nH&J\t\u0010¢\u0001\u001a\u00020\nH&J\"\u0010£\u0001\u001a\u00020\n2\u0017\u0010¤\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\t\u0010¥\u0001\u001a\u00020\nH&J;\u0010¦\u0001\u001a\u00020\n2\u0007\u0010§\u0001\u001a\u00020\u00152\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u00152\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001H&¢\u0006\u0003\u0010¬\u0001J\u0012\u0010­\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020 H&J\u0012\u0010¯\u0001\u001a\u00020\n2\u0007\u0010°\u0001\u001a\u00020 H&J\u0012\u0010±\u0001\u001a\u00020\n2\u0007\u0010®\u0001\u001a\u00020 H&J\"\u0010²\u0001\u001a\u00020\n2\u0017\u0010³\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u0012\u0010´\u0001\u001a\u00020\n2\u0007\u0010³\u0001\u001a\u00020\u0012H&J\"\u0010µ\u0001\u001a\u00020\n2\u0017\u0010¶\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\u001c\u0010·\u0001\u001a\u00020\n2\u0007\u0010¸\u0001\u001a\u00020\u00152\b\u0010¹\u0001\u001a\u00030º\u0001H&J.\u0010»\u0001\u001a\u00020\n2\b\u0010¼\u0001\u001a\u00030½\u00012\u0019\u0010¾\u0001\u001a\u0014\u0012\u0005\u0012\u00030¿\u00010\u0011j\t\u0012\u0005\u0012\u00030¿\u0001`\u0013H&J\u001f\u0010À\u0001\u001a\u00020\n2\u000e\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020 0Â\u0001H&¢\u0006\u0003\u0010Ã\u0001J\u0012\u0010Ä\u0001\u001a\u00020\n2\u0007\u0010Å\u0001\u001a\u00020 H&J-\u0010Æ\u0001\u001a\u00020\n2\u0007\u0010Ç\u0001\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020 2\u0007\u0010É\u0001\u001a\u00020 2\u0007\u0010Ê\u0001\u001a\u00020 H&J\u0012\u0010Ë\u0001\u001a\u00020\n2\u0007\u0010Ì\u0001\u001a\u00020\u0004H&J-\u0010Í\u0001\u001a\u00020\n2\u0007\u0010Î\u0001\u001a\u00020+2\u0007\u0010Ï\u0001\u001a\u00020+2\u0007\u0010Ð\u0001\u001a\u00020\u00042\u0007\u0010Ñ\u0001\u001a\u00020\u0015H&J\u0012\u0010Ò\u0001\u001a\u00020\n2\u0007\u0010Ñ\u0001\u001a\u00020\u0015H&J\u001e\u0010Ó\u0001\u001a\u00020\n2\b\u0010Ô\u0001\u001a\u00030Õ\u00012\t\b\u0002\u0010Ö\u0001\u001a\u00020\u0004H&J\u0013\u0010×\u0001\u001a\u00020\n2\b\u0010Ø\u0001\u001a\u00030Ù\u0001H&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006Ú\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "attendeeUpdating", "", "getAttendeeUpdating", "()Z", "setAttendeeUpdating", "(Z)V", "changeRepeatEndToLimitDate", "", "checkInterceptSaveProcess", "clearCustomRepeat", "didSwitchCalendarSuccessful", "editInterceptEditAttendee", "enableSwitchCalendar", "getAllOriginalAttendees", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "getAttendeeIds", "", "getAttendees", "", "getAttendeesAfterBreakUp", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeesIsOutMaxNum", "attendeeList", "getAttendeesWithoutEmail", "getCalendarChangeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "currentIndex", "", "getChosenApprovalMeetingRooms", "getChosenCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getChosenMeetingRoomSize", "getChosenPrimaryCalendar", "getCurrentRepeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getCurrentTimeZoneId", "getDisplayAttendees", "getEndTime", "", "getEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getEventCalendarId", "getEventCurrentSimpleMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "getExternalAttendeeChatIds", "getExternalAttendeeChatterIds", "getExternalAttendeeDatas", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "getExternalAttendeesAfterMerge", "isAddInEmpty", "getExternalDisplayAttendees", "addExternalEmails", "deleteExternalEmails", "getFromChatType", "getInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "getInstanceState", "Landroid/os/Bundle;", "outState", "getIsAddEmptyAfterUpdateExternalAttendees", "displayAttendees", "getMaxAttendeeNum", "getMaxDepartmentAttendeeNum", "getMeetingRoomContainerList", "getOrganizerCalendarId", "getOriginalEvent", "getSaveHitPointSource", "getShareToChatId", "getSimpleGroupAttendeeList", "getStartTime", "getSummary", "initViewDataForCreate", "initViewDataForEdit", "initViewDataForRecover", "isChangedEventSummary", "isCreateOrEditable", "isCurrentExchangeCalendar", "isCurrentGoogleCalendar", "isEditEvent", "isEditLocalSystemEvent", "isEditable", "isEditableWhenEdit", "isExchangeCalendarOnIndex", "index", "isExchangeEvent", "isExternalEvent", "isFromDetailPage", "isFromProfile", "isGoogleCalendarOnIndex", "isGoogleEvent", "isGuestCanInvite", "isGuestsCanSeeOtherGuests", "isHasEdited", "isHaveChosenAttendee", "isHaveChosenMeetingRoom", "isHaveChosenMultiMonthRepeat", "isHaveChosenMultiReminder", "isNeedLoadSimpleMember", "isRecover", "isRepeatEndDateValidate", "needLoadAllAttendees", "pullAllOriginalAttendees", "individualAttendees", "isSuccess", "refreshReminder", "setSimpleGroupAttendee", "simpleAttendeeMap", "setSwitchCalendarSuccessful", "success", "setUserAttendeeBaseInfo", "attendeeBaseInfos", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "updateAttendeeDataAfterEdit", "updateAttendeeDataForSelect", "attendeeIds", "groupIds", "emails", "calendarEventAttendeeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "updateAttendeeWhenAddMtRoom", "updateAttendeeWhenSwitchCalendar", "updateCalendarChosenIndex", "changeType", "updateChosenCalendarAttendee", "chosenCalendarAttendee", "updateColor", "chosenColor", "updateCreateCalendarList", "calendarList", "googleAccountSetting", "updateCustomRepeat", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "updateDataWithFeatureGone", "featureId", "updateDescription", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "updateEditCalendarList", "updateEditorAttendee", "calendarEventAttendee", "updateEventAndInstance", "event", "originalEvent", "instance", "updateEventSummary", "summary", "updateExceedLimitMeetingGroup", "exceedLimitMeetingGroup", "updateExceptionalEventNum", "exceptionalEventNum", "updateExceptionalHasOriginalEvent", "hasOriginalEvent", "updateExternalAttendeeIds", "updateExtraAttendee", "updateGoogleAttendees", "newAttendees", "updateHasEdited", "updateLocation", "name", "address", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "updateMaxAttendeeNum", "maxAttendeeNum", "updateMaxDepartmentAttendeeNum", "maxDepartmentAttendeeNum", "updateMaxTimeZoneAttendeeNum", "updateMeetingRoomAfterAdd", "meetingRoom", "updateMeetingRoomAfterDelete", "updateMeetingRoomAfterEdit", "chosenMeetingRoomList", "updateMtroomScheduleData", "calendarId", "mtRoomSchedule", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "updatePreLoadBuildings", "requestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "calendarBuildings", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "updateReminder", "chosenIndexArray", "", "([Ljava/lang/Integer;)V", "updateRepeat", "chosenIndex", "updateRepeatEnd", "isNeverEnd", "year", "month", "day", "updateStatus", "isFree", "updateTimeData", "startTime", "endTime", "allDay", "timeZoneId", "updateTimeZoneData", "updateVideoMeeting", "doVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "hasChangeVideoMeetingType", "updateVisibility", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$b */
    public interface IEditModelApi extends IModelCalendar<IEditViewData> {
        /* renamed from: A */
        String mo114408A();

        /* renamed from: B */
        boolean mo114409B();

        /* renamed from: C */
        boolean mo114410C();

        /* renamed from: D */
        boolean mo114411D();

        /* renamed from: E */
        boolean mo114412E();

        /* renamed from: F */
        boolean mo114413F();

        /* renamed from: G */
        boolean mo114414G();

        /* renamed from: H */
        boolean mo114415H();

        /* renamed from: I */
        boolean mo114416I();

        /* renamed from: K */
        void mo114417K();

        /* renamed from: L */
        void mo114418L();

        /* renamed from: M */
        ArrayList<CalendarEventAttendee> mo114419M();

        /* renamed from: N */
        void mo114420N();

        /* renamed from: O */
        void mo114421O();

        /* renamed from: P */
        void mo114422P();

        /* renamed from: Q */
        void mo114423Q();

        /* renamed from: R */
        boolean mo114424R();

        /* renamed from: S */
        boolean mo114425S();

        /* renamed from: U */
        ArrayList<String> mo114426U();

        /* renamed from: V */
        ArrayList<AddMailAttendeeData> mo114427V();

        /* renamed from: W */
        ArrayList<CalendarEventAttendee> mo114428W();

        /* renamed from: a */
        Bundle mo114429a(Bundle bundle);

        /* renamed from: a */
        EditCalendarPart.CHANGE_TYPE mo114430a(int i);

        /* renamed from: a */
        ArrayList<CalendarEventAttendee> mo114431a(ArrayList<String> arrayList, ArrayList<String> arrayList2);

        /* renamed from: a */
        void mo114432a(int i, EditCalendarPart.CHANGE_TYPE change_type);

        /* renamed from: a */
        void mo114433a(long j, long j2, boolean z, String str);

        /* renamed from: a */
        void mo114434a(RequestBuildingResultType requestBuildingResultType, ArrayList<CalendarBuilding> arrayList);

        /* renamed from: a */
        void mo114435a(DescriptionSaveData aVar);

        /* renamed from: a */
        void mo114436a(CalendarEvent.Visibility visibility);

        /* renamed from: a */
        void mo114437a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance);

        /* renamed from: a */
        void mo114438a(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: a */
        void mo114439a(DoVideoMeeting doVideoMeeting, boolean z);

        /* renamed from: a */
        void mo114440a(EventRecurrence eventRecurrence);

        /* renamed from: a */
        void mo114441a(String str);

        /* renamed from: a */
        void mo114442a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);

        /* renamed from: a */
        void mo114443a(String str, String str2, Double d, Double d2);

        /* renamed from: a */
        void mo114444a(ArrayList<Calendar> arrayList);

        /* renamed from: a */
        void mo114445a(ArrayList<Calendar> arrayList, HashMap<String, Boolean> hashMap);

        /* renamed from: a */
        void mo114446a(ArrayList<CalendarEventAttendee> arrayList, boolean z);

        /* renamed from: a */
        void mo114447a(Map<String, ? extends List<SimpleMember>> map);

        /* renamed from: a */
        void mo114448a(boolean z);

        /* renamed from: a */
        void mo114449a(boolean z, int i, int i2, int i3);

        /* renamed from: a */
        void mo114450a(Integer[] numArr);

        /* renamed from: a */
        boolean mo114451a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, HashMap<String, CalendarEventAttendee> hashMap);

        boolean aa();

        boolean ab();

        void ac();

        int af();

        int ag();

        void ah();

        ArrayList<AbstractC30095b> ai();

        String aj();

        void ak();

        String al();

        ArrayList<String> am();

        ArrayList<String> an();

        List<SimpleMember> ap();

        Map<String, List<SimpleMember>> aq();

        boolean ar();

        ArrayList<CalendarEventAttendee> as();

        MeetingRoomLimitData at();

        boolean au();

        boolean av();

        boolean aw();

        /* renamed from: b */
        void mo114472b(int i);

        /* renamed from: b */
        void mo114473b(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: b */
        void mo114474b(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: b */
        void mo114475b(Map<String, UserAttendeeBaseInfo> map);

        /* renamed from: b */
        void mo114476b(boolean z);

        /* renamed from: b */
        boolean mo114477b();

        /* renamed from: c */
        CalendarEvent mo114478c();

        /* renamed from: c */
        void mo114479c(int i);

        /* renamed from: c */
        void mo114480c(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: c */
        void mo114481c(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: c */
        void mo114482c(boolean z);

        /* renamed from: d */
        CalendarEvent mo114483d();

        /* renamed from: d */
        ArrayList<CalendarEventAttendee> mo114484d(boolean z);

        /* renamed from: d */
        void mo114485d(int i);

        /* renamed from: d */
        boolean mo114486d(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: e */
        CalendarEventInstance mo114487e();

        /* renamed from: e */
        void mo114488e(int i);

        /* renamed from: e */
        void mo114489e(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: e */
        void mo114490e(boolean z);

        /* renamed from: f */
        void mo114491f(int i);

        /* renamed from: f */
        boolean mo114492f(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: g */
        long mo114493g();

        /* renamed from: g */
        void mo114494g(int i);

        /* renamed from: g */
        void mo114495g(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: h */
        long mo114496h();

        /* renamed from: h */
        void mo114497h(int i);

        /* renamed from: i */
        String mo114498i();

        /* renamed from: j */
        String mo114499j();

        /* renamed from: k */
        Calendar mo114500k();

        /* renamed from: l */
        Calendar mo114501l();

        /* renamed from: m */
        String mo114502m();

        /* renamed from: n */
        boolean mo114503n();

        /* renamed from: p */
        boolean mo114504p();

        /* renamed from: r */
        int mo114505r();

        /* renamed from: s */
        List<CalendarEventAttendee> mo114506s();

        /* renamed from: t */
        boolean mo114507t();

        /* renamed from: u */
        boolean mo114508u();

        /* renamed from: y */
        boolean mo114509y();

        /* renamed from: z */
        String mo114510z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J \u0010\u0006\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\rH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0003H&J \u0010\u001e\u001a\u00020\u00032\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\rH&J\u0012\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010+H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\rH&J\b\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u000200H&J\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\tH&J\u0010\u00103\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J \u00104\u001a\u00020\u00032\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\"H&J\u001b\u0010=\u001a\u00020\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?H&¢\u0006\u0002\u0010@J(\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020;2\u0006\u0010C\u001a\u00020\r2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH&J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\rH&J\u0018\u0010H\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H&J\b\u0010I\u001a\u00020\u0003H&J\b\u0010J\u001a\u00020\u0003H&J\b\u0010K\u001a\u00020\u0003H&J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020;H&J\u0010\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\"H&J\b\u0010P\u001a\u00020\u0003H&J\u0010\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020SH&J\u0010\u0010T\u001a\u00020\u00032\u0006\u0010U\u001a\u00020VH&¨\u0006W"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onAddAttendeeClicked", "", "onAttendeeFreeBusyClicked", "onBackPressed", "onBuildingFragmentBackPressed", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "onCalendarFragmentSaveBtnPressed", "currentIndex", "", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "onCalendarFragmentSwitch", "position", "onChangeRepeatEndClicked", "onClickExpandResource", "onColorFragmentSaveBtnPressed", "chosenColor", "onCustomRepeatFragmentSaveBtnPressed", "customRRule", "Lcom/ss/android/lark/calendar/impl/utils/EventRecurrence;", "onDeleteEventBtnClicked", "onDescriptionFragmentSaveBtnPressed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "onDismissFragmentAnimationEnd", "onEditAttendeeFragmentSaveBtnPressed", "displayAttendees", "onEditResourceFromViewClicked", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onFinishActivity", "onHideEditTextKeyBoard", "onHideFeature", "featureId", "onHideFragment", "fragment", "Landroidx/fragment/app/Fragment;", "onItemClicked", "onLocationClicked", "onMeetingRoomBuildingClicked", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "onMeetingRoomContainerDeletePressed", "meetingRooms", "onMeetingRoomInfoIvClicked", "onMeetingRoomSavePressed", "meetingRoom", "onMultiTimeSaveClicked", "startTime", "", "endTime", "allDay", "", "timeZoneId", "onReminderFragmentSaveBtnPressed", "chosenIndexArray", "", "([Ljava/lang/Integer;)V", "onRepeatEndFragmentSaveBtnPressed", "isNeverEnd", "year", "month", "day", "onRepeatFragmentSaveBtnPressed", "chosenIndex", "onResourceFormSavePressed", "onResourceFragmentBackClicked", "onSaveBtnClicked", "onShowEditTextKeyBoard", "onStatusFragmentSaveBtnPressed", "isFree", "onSummaryChanged", "summary", "onUnsaveChangeClicked", "onVideoMeetingFragmentSavePressed", "doVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "onVisibilityFragmentSaveBtnPressed", "visibility", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$c */
    public interface IEditViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo114511a();

        /* renamed from: a */
        void mo114512a(int i);

        /* renamed from: a */
        void mo114513a(int i, EditCalendarPart.CHANGE_TYPE change_type);

        /* renamed from: a */
        void mo114514a(long j, long j2, boolean z, String str);

        /* renamed from: a */
        void mo114515a(Fragment fragment);

        /* renamed from: a */
        void mo114516a(MeetingRoomFragmentData meetingRoomFragmentData);

        /* renamed from: a */
        void mo114517a(DescriptionSaveData aVar);

        /* renamed from: a */
        void mo114518a(CalendarEvent.Visibility visibility);

        /* renamed from: a */
        void mo114519a(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: a */
        void mo114520a(DoVideoMeeting doVideoMeeting);

        /* renamed from: a */
        void mo114521a(EventRecurrence eventRecurrence);

        /* renamed from: a */
        void mo114522a(String str);

        /* renamed from: a */
        void mo114523a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);

        /* renamed from: a */
        void mo114524a(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: a */
        void mo114525a(boolean z);

        /* renamed from: a */
        void mo114526a(boolean z, int i, int i2, int i3);

        /* renamed from: a */
        void mo114527a(Integer[] numArr);

        /* renamed from: b */
        void mo114528b();

        /* renamed from: b */
        void mo114529b(int i);

        /* renamed from: b */
        void mo114530b(String str);

        /* renamed from: b */
        void mo114531b(String str, SchemaExtraData.ResourceCustomization resourceCustomization);

        /* renamed from: b */
        void mo114532b(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: c */
        void mo114533c();

        /* renamed from: c */
        void mo114534c(int i);

        /* renamed from: d */
        void mo114535d();

        /* renamed from: d */
        void mo114536d(int i);

        /* renamed from: e */
        void mo114537e();

        /* renamed from: e */
        void mo114538e(int i);

        /* renamed from: f */
        void mo114539f();

        /* renamed from: g */
        void mo114540g();

        /* renamed from: h */
        void mo114541h();

        /* renamed from: i */
        void mo114542i();

        /* renamed from: j */
        void mo114543j();

        /* renamed from: k */
        void mo114544k();

        /* renamed from: l */
        void mo114545l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0010H&J(\u0010$\u001a\u00020\u00052\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(2\u0006\u0010)\u001a\u00020\u0010H&J\b\u0010*\u001a\u00020\u0005H&J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020'H&J\u0018\u00105\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u00106\u001a\u000207H&J\u0010\u00108\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\rH&J \u00109\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020<H&J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020?H&J\u0010\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0010H&J\b\u0010B\u001a\u00020\u0005H&¨\u0006C"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewAction;", "closeSwitchSaveLoading", "", "isSuccess", "", "focusOnSummary", "getContext", "Landroid/content/Context;", "hideCurrentFragment", "mActivityDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditPresenter$ActivityDependency;", "hideFragment", "featureId", "", "hideResourceExpandFragment", "activityDependency", "pressBack", "refreshCalendarList", "refreshCurrentFragment", "refreshEditView", "refreshTimeFragment", "showCalendarSwitchDialog", "currentIndex", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "changedMeetingRoom", "changedAttendee", "changedReminder", "changedRepeat", "showErrorDialogWithMsg", "errorMsgId", "showEventAttendeeOutnumberAlert", "maxAttendeeNum", "showEventDepartmentAttendeeOutAlert", "departmentNames", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "maxDepartmentAttendeeNum", "showExceedLimitMeetingGroupDialog", "showFinishBtn", "saveType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$SaveType;", "showFragmentByFeatureId", "showMeetingRoomApprovalDialog", "startTime", "", "endTime", "allDay", "timeZoneId", "showMeetingRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "showResourceExpandFragment", "showResourceFormFragment", "calendarId", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "showSwitchSaveLoading", "activity", "Landroid/app/Activity;", "showToast", "stringId", "showUnSaveChangeDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$d */
    public interface IEditViewApi extends IViewCalender<IEditViewData, IEditViewAction> {
        /* renamed from: a */
        void mo114315a(int i);

        /* renamed from: a */
        void mo114316a(int i, EditCalendarPart.CHANGE_TYPE change_type, boolean z, boolean z2, boolean z3, boolean z4);

        /* renamed from: a */
        void mo114317a(Activity activity);

        /* renamed from: a */
        void mo114320a(EditPresenter.ActivityDependency aVar);

        /* renamed from: a */
        void mo114321a(EditPresenter.ActivityDependency aVar, int i);

        /* renamed from: a */
        void mo114322a(EditPresenter.ActivityDependency aVar, MeetingRoomFragmentData meetingRoomFragmentData);

        /* renamed from: a */
        void mo114323a(EditPresenter.ActivityDependency aVar, String str, SchemaExtraData.ResourceCustomization resourceCustomization);

        /* renamed from: a */
        void mo114324a(ArrayList<String> arrayList, int i);

        /* renamed from: a */
        void mo114325a(boolean z);

        /* renamed from: b */
        void mo114326b();

        /* renamed from: b */
        void mo114327b(int i);

        /* renamed from: b */
        void mo114328b(EditPresenter.ActivityDependency aVar);

        /* renamed from: c */
        void mo114329c();

        /* renamed from: c */
        void mo114330c(int i);

        /* renamed from: d */
        void mo114331d();

        /* renamed from: d */
        void mo114332d(int i);

        /* renamed from: e */
        Context mo114333e();

        /* renamed from: f */
        void mo114334f();

        /* renamed from: g */
        void mo114335g();

        /* renamed from: h */
        void mo114336h();

        /* renamed from: i */
        void mo114337i();

        /* renamed from: j */
        void mo114338j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\u001c\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u001eH&J\b\u0010!\u001a\u00020\u0011H&J\b\u0010\"\u001a\u00020\u0011H&J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0011H&J\u0018\u0010)\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0006\u0012\u0004\u0018\u00010&0*H&J\u0018\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0\u0007j\b\u0012\u0004\u0012\u00020-`\tH&J\b\u0010.\u001a\u00020\u001aH&J\b\u0010/\u001a\u00020\u0011H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u001aH&J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u00020\u0011H&J\b\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u0011H&J\b\u00107\u001a\u00020\u0003H&J\b\u00108\u001a\u000209H&J\n\u0010:\u001a\u0004\u0018\u00010;H&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020\u0003H&J\b\u0010?\u001a\u00020@H&J\b\u0010A\u001a\u00020\u0003H&J\b\u0010B\u001a\u00020\u0011H&J\b\u0010C\u001a\u00020DH&J\u0016\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020F\u0018\u00010\u001eH&J\n\u0010G\u001a\u0004\u0018\u00010HH&J\b\u0010I\u001a\u00020JH&J\b\u0010K\u001a\u00020LH&J\b\u0010M\u001a\u00020\u0003H&J\b\u0010N\u001a\u00020\u0003H&J\b\u0010O\u001a\u00020\u0003H&J\b\u0010P\u001a\u00020\u0003H&J\b\u0010Q\u001a\u00020\u0003H&J\b\u0010R\u001a\u00020\u0003H&J\b\u0010S\u001a\u00020\u0003H&J\b\u0010T\u001a\u00020UH&J\b\u0010V\u001a\u00020WH&J(\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020&2\u0006\u0010Z\u001a\u00020&2\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0011H&J\u001c\u0010]\u001a\u00020W2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020_0\u001eH&¨\u0006`"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$IEditViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "editInterceptEditAttendee", "", "getAppendResourceFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "getAttachmentData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "Lkotlin/collections/ArrayList;", "getAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventAttendeeData;", "getBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "getContainerCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "getContainerStatus", "", "getContainerVisibility", "getCustomRepeatRule", "Lcom/ss/android/lark/calendar/impl/utils/RepeatMode;", "getCustomRepeatStartTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getDescriptionShowData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "getDisplayColor", "", "getEditAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;", "getEventSimpleMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "getExceedLimitMeetingGroupNameText", "getExceedLimitMeetingGroupTipText", "getFragmentCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;", "getInstanceEndTime", "", "getIsSingleInMonth", "getLocationContainerStr", "getMeetingRoomApprovalType", "Lkotlin/Pair;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "getMeetingRoomContainerList", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getMeetingRoomSize", "getReminderContainerStr", "getReminderContainerVisible", "getReminderDefaultRemindTimeIndex", "getReminderFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "getRepeatContainerStr", "getRepeatContainerVisible", "getRepeatEndContainerStr", "getRepeatEndDateValidate", "getRepeatEndFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatEndFragmentData;", "getRepeatEndLimitDate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/MeetingRoomLimitData;", "getRepeatFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatFragmentData;", "getRepeatHasGoogleRRule", "getResourceExpandFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ResourceExpandFragmentData;", "getStatusFragmentIsFree", "getSummary", "getTimeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "getUnusableMeetingRoom", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "getVideoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "getViewPartVisible", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditViewPartVisible;", "getVisibilityForFragment", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Visibility;", "guestCanEditAllDayEvent", "hasThirdPartCalendar", "isEventCreateOrEditable", "isExternalEvent", "isFreeBusyVisible", "isRepeatLimitEndBeforeStart", "needShowDisableFrom", "saveType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView$SaveType;", "updateEventHasEdited", "", "updateEventTimeData", "startTime", "endTime", "allDay", "timeZoneId", "updatePbMultiLevelData", "pbMultiLevelData", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.IEditContract$e */
    public interface IEditViewData extends IViewCalender.IViewData {
        /* renamed from: A */
        String mo114546A();

        /* renamed from: B */
        boolean mo114547B();

        /* renamed from: C */
        boolean mo114548C();

        /* renamed from: D */
        RepeatEndFragmentData mo114549D();

        /* renamed from: E */
        String mo114550E();

        /* renamed from: F */
        boolean mo114551F();

        /* renamed from: G */
        boolean mo114552G();

        /* renamed from: H */
        DescriptionShowData mo114553H();

        /* renamed from: I */
        ArrayList<AttachmentItemData> mo114554I();

        /* renamed from: J */
        boolean mo114555J();

        /* renamed from: K */
        EditView.SaveType mo114556K();

        /* renamed from: L */
        Map<String, List<SimpleMember>> mo114557L();

        /* renamed from: M */
        MeetingRoomLimitData mo114558M();

        /* renamed from: N */
        boolean mo114559N();

        /* renamed from: O */
        int mo114560O();

        /* renamed from: P */
        DoVideoMeeting mo114561P();

        /* renamed from: Q */
        boolean mo114562Q();

        /* renamed from: R */
        boolean mo114563R();

        /* renamed from: S */
        ResourceExpandFragmentData mo114564S();

        /* renamed from: T */
        boolean mo114565T();

        /* renamed from: U */
        String mo114566U();

        /* renamed from: V */
        String mo114567V();

        /* renamed from: W */
        long mo114568W();

        /* renamed from: a */
        String mo114569a();

        /* renamed from: a */
        void mo114570a(Map<String, LevelRelatedInfo> map);

        /* renamed from: b */
        EventAttendeeData mo114571b();

        /* renamed from: c */
        boolean mo114572c();

        /* renamed from: d */
        EditViewPartVisible mo114573d();

        /* renamed from: e */
        EventCalendarData mo114574e();

        /* renamed from: f */
        boolean mo114575f();

        /* renamed from: g */
        CalendarFragmentData mo114576g();

        /* renamed from: h */
        String mo114577h();

        /* renamed from: i */
        String mo114578i();

        /* renamed from: j */
        AttendeeFragmentData mo114579j();

        /* renamed from: k */
        int mo114580k();

        /* renamed from: l */
        boolean mo114581l();

        /* renamed from: m */
        CalendarEvent.Visibility mo114582m();

        /* renamed from: n */
        TimeData mo114583n();

        /* renamed from: o */
        String mo114584o();

        /* renamed from: p */
        boolean mo114585p();

        /* renamed from: q */
        ReminderFragmentData mo114586q();

        /* renamed from: r */
        int mo114587r();

        /* renamed from: s */
        String mo114588s();

        /* renamed from: t */
        BuildingFragmentData mo114589t();

        /* renamed from: u */
        ResourceAppendFragmentData mo114590u();

        /* renamed from: v */
        ArrayList<CalendarEventAttendee> mo114591v();

        /* renamed from: w */
        Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114592w();

        /* renamed from: x */
        RepeatFragmentData mo114593x();

        /* renamed from: y */
        CalendarDate mo114594y();

        /* renamed from: z */
        RepeatMode mo114595z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$DescriptionShowType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "SHOW_NULL", "SHOW_DATA", "SHOW_CONTENT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DescriptionShowType {
        SHOW_NULL(1),
        SHOW_DATA(2),
        SHOW_CONTENT(3);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private DescriptionShowType(int i) {
            this.number = i;
        }
    }
}
