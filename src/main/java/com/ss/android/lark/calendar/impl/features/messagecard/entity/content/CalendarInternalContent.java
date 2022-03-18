package com.ss.android.lark.calendar.impl.features.messagecard.entity.content;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.calendar.impl.features.messagecard.InternalContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarEventCardDiff;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class CalendarInternalContent implements InternalContent {
    private ArrayList<AbstractC30026d> attendeeList;
    private AbstractC30026d botMessageSender;
    private Map<String, String> chatNames;
    private long conflictTime;
    private ConflictType conflictType = ConflictType.NONE;
    private long endTime;
    private CalendarEvent.Type eventType = CalendarEvent.Type.DEFAULT_TYPE;
    private boolean isAllDay;
    private boolean isCrossExternal;
    private boolean isOptional;
    private String mAcceptColor;
    private String mAcceptContent;
    private int mAttendeeCount;
    private String mAttendees;
    private String mCalendarId;
    private String mDeclineColor;
    private String mDeclineContent;
    private String mDescription;
    private CalendarEventCardDiff mEventCardDiffInfo;
    private CalendarEventCardStatus mEventCardStatus = CalendarEventCardStatus.NORMAL;
    private String mEventKey;
    private String mEventServiceId;
    private boolean mIsNeedShowAction;
    private String mLocation;
    private String mMeetingRoom;
    private List<String> mMeetingRoomList;
    private long mOriginalTime;
    private String mRepeat;
    private boolean mShowReplyInviterEntry;
    private CalendarEventAttendee.Status mStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
    private String mSummary;
    private String mTentativeColor;
    private String mTentativeContent;
    private String mTime;
    private String mTitleContent;
    private String mUserInviteOperatorId;
    private CalendarMessageType meesageType = CalendarMessageType.UNKNOWN;
    private CalendarMessageVersion messageVersion = CalendarMessageVersion.V1;
    private String rRule;
    private long startTime;
    private String startTimeZone;

    public enum CalendarEventCardStatus {
        NORMAL(0),
        INVALID(1);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static CalendarEventCardStatus forNumber(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i != 1) {
                return NORMAL;
            }
            return INVALID;
        }

        private CalendarEventCardStatus(int i) {
            this.value = i;
        }
    }

    public enum CalendarMessageType {
        UNKNOWN(0),
        REPLY_ACCEPT(1),
        REPLY_DECLINE(2),
        REPLY_TENTATIVE(3),
        EVENT_INVITE(4),
        EVENT_DELETE(5),
        EVENT_UPDATE(6),
        EVENT_RESCHEDULE(7),
        CALENDAR_UPDATE(8),
        EVENT_UPDATE_LOCATION(9),
        SELF_ATTENDEE_STATUS_CHANGE(10),
        ADJUST_SHARE_CALENDAR_MEMBER(11),
        REMOVE_SHARE_CALENDAR_MEMBER(12),
        DELETE_SHARE_CALENDAR(13),
        EVENT_UPDATE_DESCRIPTION(14),
        REPLY_ACCEPT_AFTER_DECLINE(15);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static CalendarMessageType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return REPLY_ACCEPT;
                case 2:
                    return REPLY_DECLINE;
                case 3:
                    return REPLY_TENTATIVE;
                case 4:
                    return EVENT_INVITE;
                case 5:
                    return EVENT_DELETE;
                case 6:
                    return EVENT_UPDATE;
                case 7:
                    return EVENT_RESCHEDULE;
                case 8:
                    return CALENDAR_UPDATE;
                case 9:
                    return EVENT_UPDATE_LOCATION;
                case 10:
                    return SELF_ATTENDEE_STATUS_CHANGE;
                case 11:
                    return ADJUST_SHARE_CALENDAR_MEMBER;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return REMOVE_SHARE_CALENDAR_MEMBER;
                case 13:
                    return DELETE_SHARE_CALENDAR;
                case 14:
                    return EVENT_UPDATE_DESCRIPTION;
                case 15:
                    return REPLY_ACCEPT_AFTER_DECLINE;
                default:
                    return null;
            }
        }

        private CalendarMessageType(int i) {
            this.value = i;
        }
    }

    public enum CalendarMessageVersion {
        V1(1),
        V2(2),
        V3(3);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static CalendarMessageVersion forNumber(int i) {
            if (i == 1) {
                return V1;
            }
            if (i == 2) {
                return V2;
            }
            if (i != 3) {
                return null;
            }
            return V3;
        }

        private CalendarMessageVersion(int i) {
            this.value = i;
        }
    }

    public enum ConflictType {
        NONE(1),
        NORMAL(2),
        RECURRENCE(3);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static ConflictType forNumber(int i) {
            if (i == 1) {
                return NONE;
            }
            if (i == 2) {
                return NORMAL;
            }
            if (i != 3) {
                return null;
            }
            return RECURRENCE;
        }

        private ConflictType(int i) {
            this.value = i;
        }
    }

    public String getAcceptColor() {
        return this.mAcceptColor;
    }

    public String getAcceptContent() {
        return this.mAcceptContent;
    }

    public int getAttendeeCount() {
        return this.mAttendeeCount;
    }

    public ArrayList<AbstractC30026d> getAttendeeList() {
        return this.attendeeList;
    }

    public String getAttendees() {
        return this.mAttendees;
    }

    public AbstractC30026d getBotMessageSender() {
        return this.botMessageSender;
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public Map<String, String> getChatNames() {
        return this.chatNames;
    }

    public long getConflictTime() {
        return this.conflictTime;
    }

    public ConflictType getConflictType() {
        return this.conflictType;
    }

    public String getContent() {
        return this.mTitleContent;
    }

    public String getDeclineColor() {
        return this.mDeclineColor;
    }

    public String getDeclineContent() {
        return this.mDeclineContent;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public CalendarEventCardDiff getEventCardDiffInfo() {
        return this.mEventCardDiffInfo;
    }

    public CalendarEventCardStatus getEventCardStatus() {
        return this.mEventCardStatus;
    }

    public String getEventKey() {
        return this.mEventKey;
    }

    public String getEventServiceId() {
        return this.mEventServiceId;
    }

    public CalendarEvent.Type getEventType() {
        return this.eventType;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public CalendarMessageType getMeesageType() {
        return this.meesageType;
    }

    public String getMeetingRoom() {
        return this.mMeetingRoom;
    }

    public List<String> getMeetingRoomList() {
        return this.mMeetingRoomList;
    }

    public CalendarMessageVersion getMessageVersion() {
        return this.messageVersion;
    }

    public long getOriginalTime() {
        return this.mOriginalTime;
    }

    public String getRepeat() {
        return this.mRepeat;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getSummary() {
        return this.mSummary;
    }

    public String getTentativeColor() {
        return this.mTentativeColor;
    }

    public String getTentativeContent() {
        return this.mTentativeContent;
    }

    public String getTitle() {
        return this.mTitleContent;
    }

    public String getUserInviteOperatorId() {
        return this.mUserInviteOperatorId;
    }

    public CalendarEventAttendee.Status getmStatus() {
        return this.mStatus;
    }

    public String getrRule() {
        return this.rRule;
    }

    public boolean isAllDay() {
        return this.isAllDay;
    }

    public boolean isCrossExternal() {
        return this.isCrossExternal;
    }

    public boolean isNeedShowAction() {
        return this.mIsNeedShowAction;
    }

    public boolean isOptional() {
        return this.isOptional;
    }

    public boolean isShowReplyInviterEntry() {
        return this.mShowReplyInviterEntry;
    }

    public boolean isOldVersion() {
        if (getMessageVersion().compareTo((Enum) CalendarMessageVersion.V3) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent$1 */
    static /* synthetic */ class C321971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f82336a;

        static {
            int[] iArr = new int[CalendarMessageType.values().length];
            f82336a = iArr;
            try {
                iArr[CalendarMessageType.EVENT_DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public void setAcceptColor(String str) {
        this.mAcceptColor = str;
    }

    public void setAcceptContent(String str) {
        this.mAcceptContent = str;
    }

    public void setAllDay(boolean z) {
        this.isAllDay = z;
    }

    public void setAttendeeCount(int i) {
        this.mAttendeeCount = i;
    }

    public void setAttendeeList(ArrayList<AbstractC30026d> arrayList) {
        this.attendeeList = arrayList;
    }

    public void setAttendees(String str) {
        this.mAttendees = str;
    }

    public void setBotMessageSender(AbstractC30026d dVar) {
        this.botMessageSender = dVar;
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setChatNames(Map<String, String> map) {
        this.chatNames = map;
    }

    public void setConflictTime(long j) {
        this.conflictTime = j;
    }

    public void setConflictType(ConflictType conflictType2) {
        this.conflictType = conflictType2;
    }

    public void setCrossExternal(boolean z) {
        this.isCrossExternal = z;
    }

    public void setDeclineColor(String str) {
        this.mDeclineColor = str;
    }

    public void setDeclineContent(String str) {
        this.mDeclineContent = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setEventCardDiffInfo(CalendarEventCardDiff calendarEventCardDiff) {
        this.mEventCardDiffInfo = calendarEventCardDiff;
    }

    public void setEventCardStatus(CalendarEventCardStatus calendarEventCardStatus) {
        this.mEventCardStatus = calendarEventCardStatus;
    }

    public void setEventKey(String str) {
        this.mEventKey = str;
    }

    public void setEventServiceId(String str) {
        this.mEventServiceId = str;
    }

    public void setEventType(CalendarEvent.Type type) {
        this.eventType = type;
    }

    public void setIsNeedShowAction(boolean z) {
        this.mIsNeedShowAction = z;
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public void setMeetingRoom(String str) {
        this.mMeetingRoom = str;
    }

    public void setMeetingRoomList(List<String> list) {
        this.mMeetingRoomList = list;
    }

    public void setMessageVersion(CalendarMessageVersion calendarMessageVersion) {
        this.messageVersion = calendarMessageVersion;
    }

    public void setOptional(boolean z) {
        this.isOptional = z;
    }

    public void setOriginalTime(long j) {
        this.mOriginalTime = j;
    }

    public void setRepeat(String str) {
        this.mRepeat = str;
    }

    public void setShowReplyInviterEntry(boolean z) {
        this.mShowReplyInviterEntry = z;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStartTimeZone(String str) {
        this.startTimeZone = str;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public void setTentativeColor(String str) {
        this.mTentativeColor = str;
    }

    public void setTentativeContent(String str) {
        this.mTentativeContent = str;
    }

    public void setTime(String str) {
        this.mTime = str;
    }

    public void setTitleContent(String str) {
        this.mTitleContent = str;
    }

    public void setUserInviteOperatorId(String str) {
        this.mUserInviteOperatorId = str;
    }

    public void setmStatus(CalendarEventAttendee.Status status) {
        this.mStatus = status;
    }

    public void setrRule(String str) {
        this.rRule = str;
    }

    public String getTime(Locale locale) {
        if (this.startTime == 0) {
            return this.mTime;
        }
        return getMeetingTimeStr(locale);
    }

    public void setMeesageType(CalendarMessageType calendarMessageType) {
        this.meesageType = calendarMessageType;
        if (C321971.f82336a[calendarMessageType.ordinal()] != 1) {
            setIsNeedShowAction(true);
        } else {
            setIsNeedShowAction(false);
        }
    }

    /* access modifiers changed from: package-private */
    public String getMeetingTimeStr(Locale locale) {
        String str;
        long j = this.endTime;
        TimeZone timeZone = TimeZone.getDefault();
        StringBuilder sb = new StringBuilder();
        if (locale.getLanguage().equals(Locale.CHINESE.getLanguage())) {
            sb.append("yyyy年MM月dd日(EEE)");
        } else {
            sb.append("MMM d, yyyy EEE");
        }
        if (this.isAllDay) {
            j -= 1000;
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            sb.append(" HH:mm");
        }
        String utc2Gmt = utc2Gmt(this.startTime, locale, timeZone, sb.toString());
        if (!C26279i.m95157a(this.startTime, j, timeZone)) {
            str = " - " + utc2Gmt(j, locale, timeZone, sb.toString());
        } else if (this.isAllDay) {
            return utc2Gmt;
        } else {
            str = " - " + utc2Gmt(j, locale, timeZone, "HH:mm");
        }
        String str2 = utc2Gmt + str;
        if (this.isAllDay) {
            return str2;
        }
        return str2 + getTimeZoneStr(timeZone, this.startTime);
    }

    static String getTimeZoneStr(TimeZone timeZone, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("(z)", Locale.CHINA);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    static String utc2Gmt(long j, Locale locale, TimeZone timeZone, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }
}
