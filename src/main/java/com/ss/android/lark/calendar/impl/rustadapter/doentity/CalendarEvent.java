package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CalendarEvent implements Serializable, Cloneable {
    private DisplayType displayType;
    private EventAttendeeInfo eventAttendeeInfo;
    private CalendarLocation location;
    private List<CalendarEventAttachment> mAttachments;
    private int mAttendeeNum;
    private int mAttendeeSource;
    private List<CalendarEventAttendee> mAttendees;
    private String mAudioUrl;
    private MappingColor mCalColor;
    private CalendarEventDisplayInfo mCalendarEventDisplayInfo;
    private String mCalendarId;
    private CalendarSchemaCollection mCalendarSchemaCollection;
    private Category mCategory;
    private int mColor;
    private ConflictType mConflictType;
    private long mCreateTime;
    private CalendarEventAttendee mCreator;
    private String mCreatorCalendarId;
    private boolean mCreatorIsAttend;
    private String mDescription;
    private DirtyType mDirtyType;
    private String mDocsDescription;
    private long mEndTime;
    private String mEndTimeZone;
    private MappingColor mEventColor;
    private boolean mGuestsCanInvite;
    private boolean mGuestsCanModify;
    private boolean mGuestsCanSeeOtherGuests;
    private boolean mHasAlarm;
    private boolean mHasAttendee;
    private String mId;
    private int mImportance;
    private boolean mIsAllDay;
    private boolean mIsCrossTenant;
    private Deletable mIsDeletable;
    private Boolean mIsEditable;
    private boolean mIsFree;
    private boolean mIsNeedUpdate;
    private boolean mIsOrganizer;
    private boolean mIsScheduled;
    private String mKey;
    private long mLastDate;
    private String mMeetingId;
    private String mMeetingMinuteUrl;
    private NotificationType mNotificationType;
    private CalendarEventAttendee mOrganizer;
    private String mOrganizerCalendarId;
    private boolean mOrganizerIsAttend;
    private String mOriginalEventKey;
    private boolean mOriginalIsAllDay;
    private long mOriginalTime;
    private String mRRule;
    private List<CalendarEventReminder> mReminders;
    private CalendarEventAttendee.Status mSelfAttendeeStatus;
    private String mServerId;
    private Sharability mSharability;
    private Source mSource;
    private long mStartTime;
    private String mStartTimeZone;
    private Status mStatus;
    private CalendarEventAttendee mSuccessor;
    private boolean mSuccessorIsAttend;
    private String mSummary;
    private Type mType;
    private long mUpdateTime;
    private String mUrl;
    private EventInviteOperator mUserInviteOperator;
    private String mUserInviteOperatorId;
    private int mVersion;
    private Visibility mVisibility;
    private DoVideoMeeting videoMeeting;

    public enum Category {
        DEFAULT_CATEGORY(1),
        SAME_PAGE_MEETING(2),
        RESOURCE_STRATEGY(3),
        RESOURCE_REQUISITION(4);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static Category forNumber(int i) {
            if (i == 1) {
                return DEFAULT_CATEGORY;
            }
            if (i == 2) {
                return SAME_PAGE_MEETING;
            }
            if (i == 3) {
                return RESOURCE_STRATEGY;
            }
            if (i != 4) {
                return DEFAULT_CATEGORY;
            }
            return RESOURCE_REQUISITION;
        }

        private Category(int i) {
            this.value = i;
        }
    }

    public enum ConflictType {
        NONE(1),
        NORMAL(2),
        RECURRENCE(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ConflictType valueOf(int i) {
            return forNumber(i);
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

    public enum Deletable {
        NOT(1),
        SELF(2),
        ALL(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Deletable valueOf(int i) {
            return forNumber(i);
        }

        public static Deletable forNumber(int i) {
            if (i == 1) {
                return NOT;
            }
            if (i == 2) {
                return SELF;
            }
            if (i != 3) {
                return null;
            }
            return ALL;
        }

        private Deletable(int i) {
            this.value = i;
        }
    }

    public enum DisplayType {
        INVISIBLE(1),
        LIMITED(2),
        FULL(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static DisplayType valueOf(int i) {
            return forNumber(i);
        }

        public static DisplayType forNumber(int i) {
            if (i == 1) {
                return INVISIBLE;
            }
            if (i == 2) {
                return LIMITED;
            }
            if (i != 3) {
                return null;
            }
            return FULL;
        }

        private DisplayType(int i) {
            this.value = i;
        }
    }

    public enum NotificationType {
        DEFAULT_NOTIFICATION_TYPE(1),
        NO_NOTIFICATION(2),
        SEND_NOTIFICATION(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static NotificationType valueOf(int i) {
            return forNumber(i);
        }

        public static NotificationType forNumber(int i) {
            if (i == 1) {
                return DEFAULT_NOTIFICATION_TYPE;
            }
            if (i == 2) {
                return NO_NOTIFICATION;
            }
            if (i != 3) {
                return null;
            }
            return SEND_NOTIFICATION;
        }

        private NotificationType(int i) {
            this.value = i;
        }
    }

    public enum Sharability {
        FORBIDDEN_NOT_ACCESSIBLE(1),
        FORBIDDEN_PRIVATE(2),
        SHARABLE(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Sharability valueOf(int i) {
            return forNumber(i);
        }

        public static Sharability forNumber(int i) {
            if (i == 1) {
                return FORBIDDEN_NOT_ACCESSIBLE;
            }
            if (i == 2) {
                return FORBIDDEN_PRIVATE;
            }
            if (i != 3) {
                return null;
            }
            return SHARABLE;
        }

        private Sharability(int i) {
            this.value = i;
        }
    }

    public enum Source {
        UNKNOWN_SOURCE(0),
        WEB(1),
        IOS(2),
        IOS_APP(3),
        ANDROID(4),
        ANDROID_APP(5),
        PC_CLIENT(6),
        GOOGLE(7),
        PEOPLE(8),
        PLACE_HOLDER(9),
        OPEN_API(10),
        CALDAV(11),
        TIMEOFF(12),
        EMAIL(13),
        EXCHANGE(14);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Source valueOf(int i) {
            return forNumber(i);
        }

        public static Source forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_SOURCE;
                case 1:
                    return WEB;
                case 2:
                    return IOS;
                case 3:
                    return IOS_APP;
                case 4:
                    return ANDROID;
                case 5:
                    return ANDROID_APP;
                case 6:
                    return PC_CLIENT;
                case 7:
                    return GOOGLE;
                case 8:
                    return PEOPLE;
                case 9:
                    return PLACE_HOLDER;
                case 10:
                    return OPEN_API;
                case 11:
                    return CALDAV;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return TIMEOFF;
                case 13:
                    return EMAIL;
                case 14:
                    return EXCHANGE;
                default:
                    return UNKNOWN_SOURCE;
            }
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public enum Span {
        NONE_SPAN(0),
        THIS_EVENT(1),
        FUTURE_EVENTS(2),
        ALL_EVENTS(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Span valueOf(int i) {
            return forNumber(i);
        }

        public static Span forNumber(int i) {
            if (i == 0) {
                return NONE_SPAN;
            }
            if (i == 1) {
                return THIS_EVENT;
            }
            if (i == 2) {
                return FUTURE_EVENTS;
            }
            if (i != 3) {
                return null;
            }
            return ALL_EVENTS;
        }

        private Span(int i) {
            this.value = i;
        }
    }

    public enum Status {
        TENTATIVE(1),
        CONFIRMED(2),
        CANCELED(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 1) {
                return TENTATIVE;
            }
            if (i == 2) {
                return CONFIRMED;
            }
            if (i != 3) {
                return null;
            }
            return CANCELED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type {
        DEFAULT_TYPE(1),
        MEETING(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return DEFAULT_TYPE;
            }
            if (i != 2) {
                return DEFAULT_TYPE;
            }
            return MEETING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum Visibility {
        DEFAULT(1),
        PUBLIC(2),
        PRIVATE(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            return forNumber(i);
        }

        public static Visibility forNumber(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return PUBLIC;
            }
            if (i != 3) {
                return null;
            }
            return PRIVATE;
        }

        private Visibility(int i) {
            this.value = i;
        }
    }

    public boolean creatorIsAttend() {
        return this.mCreatorIsAttend;
    }

    public int getAttendeeNum() {
        return this.mAttendeeNum;
    }

    public int getAttendeeSource() {
        return this.mAttendeeSource;
    }

    public String getAudioUrl() {
        return this.mAudioUrl;
    }

    public MappingColor getCalColor() {
        return this.mCalColor;
    }

    public CalendarEventDisplayInfo getCalendarEventDisplayInfo() {
        return this.mCalendarEventDisplayInfo;
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public CalendarSchemaCollection getCalendarSchemaCollection() {
        return this.mCalendarSchemaCollection;
    }

    public Category getCategory() {
        return this.mCategory;
    }

    public int getColor() {
        return this.mColor;
    }

    public ConflictType getConflictType() {
        return this.mConflictType;
    }

    public long getCreateTime() {
        return this.mCreateTime;
    }

    public CalendarEventAttendee getCreator() {
        return this.mCreator;
    }

    public String getCreatorCalendarId() {
        return this.mCreatorCalendarId;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public DirtyType getDirtyType() {
        return this.mDirtyType;
    }

    public DisplayType getDisplayType() {
        return this.displayType;
    }

    public String getDocsDescription() {
        return this.mDocsDescription;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public String getEndTimeZone() {
        return this.mEndTimeZone;
    }

    public EventAttendeeInfo getEventAttendeeInfo() {
        return this.eventAttendeeInfo;
    }

    public MappingColor getEventColor() {
        return this.mEventColor;
    }

    public String getId() {
        return this.mId;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public Deletable getIsDeletable() {
        return this.mIsDeletable;
    }

    public Boolean getIsEditable() {
        return this.mIsEditable;
    }

    public String getKey() {
        return this.mKey;
    }

    public long getLastDate() {
        return this.mLastDate;
    }

    public CalendarLocation getLocation() {
        return this.location;
    }

    public String getMeetingId() {
        return this.mMeetingId;
    }

    public String getMeetingMinuteUrl() {
        return this.mMeetingMinuteUrl;
    }

    public NotificationType getNotificationType() {
        return this.mNotificationType;
    }

    public CalendarEventAttendee getOrganizer() {
        return this.mOrganizer;
    }

    public String getOrganizerCalendarId() {
        return this.mOrganizerCalendarId;
    }

    public String getOriginalEventKey() {
        return this.mOriginalEventKey;
    }

    public long getOriginalTime() {
        return this.mOriginalTime;
    }

    public String getRRule() {
        return this.mRRule;
    }

    public CalendarEventAttendee.Status getSelfAttendeeStatus() {
        return this.mSelfAttendeeStatus;
    }

    public String getServerId() {
        return this.mServerId;
    }

    public Sharability getSharability() {
        return this.mSharability;
    }

    public Source getSource() {
        return this.mSource;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public String getStartTimeZone() {
        return this.mStartTimeZone;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public CalendarEventAttendee getSuccessor() {
        return this.mSuccessor;
    }

    public Type getType() {
        return this.mType;
    }

    public long getUpdateTime() {
        return this.mUpdateTime;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public EventInviteOperator getUserInviteOperator() {
        return this.mUserInviteOperator;
    }

    public String getUserInviteOperatorId() {
        return this.mUserInviteOperatorId;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public DoVideoMeeting getVideoMeeting() {
        return this.videoMeeting;
    }

    public Visibility getVisibility() {
        return this.mVisibility;
    }

    public boolean hasAlarm() {
        return this.mHasAlarm;
    }

    public boolean hasAttendee() {
        return this.mHasAttendee;
    }

    public boolean isAllDay() {
        return this.mIsAllDay;
    }

    public boolean isCrossTenant() {
        return this.mIsCrossTenant;
    }

    public boolean isFree() {
        return this.mIsFree;
    }

    public boolean isGuestsCanInvite() {
        return this.mGuestsCanInvite;
    }

    public boolean isGuestsCanModify() {
        return this.mGuestsCanModify;
    }

    public boolean isGuestsCanSeeOtherGuests() {
        return this.mGuestsCanSeeOtherGuests;
    }

    public boolean isNeedUpdate() {
        return this.mIsNeedUpdate;
    }

    public boolean isOrganizer() {
        return this.mIsOrganizer;
    }

    public boolean isScheduled() {
        return this.mIsScheduled;
    }

    public boolean organizerIsAttend() {
        return this.mOrganizerIsAttend;
    }

    public boolean originalIsAllDay() {
        return this.mOriginalIsAllDay;
    }

    public boolean successorIsAttend() {
        return this.mSuccessorIsAttend;
    }

    public String getSummary() {
        String str = this.mSummary;
        if (str == null) {
            return "";
        }
        return str;
    }

    public CalendarEventAttendee getUIOrganizer() {
        CalendarEventAttendee calendarEventAttendee = this.mOrganizer;
        if (calendarEventAttendee == null) {
            return this.mCreator;
        }
        return calendarEventAttendee;
    }

    public boolean isShareCalendar() {
        if (this.mOrganizer == null) {
            return true;
        }
        return false;
    }

    public List<CalendarEventAttachment> getAttachment() {
        List<CalendarEventAttachment> list = this.mAttachments;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public List<CalendarEventAttendee> getAttendees() {
        List<CalendarEventAttendee> list = this.mAttendees;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public List<CalendarEventReminder> getReminders() {
        List<CalendarEventReminder> list = this.mReminders;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public boolean hasMeetingMinute() {
        return !TextUtils.isEmpty(this.mMeetingMinuteUrl);
    }

    public boolean isMeeting() {
        Type type = this.mType;
        if (type == null || type != Type.MEETING) {
            return false;
        }
        return true;
    }

    public CalendarEvent() {
        this.mSelfAttendeeStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
        this.mSource = Source.UNKNOWN_SOURCE;
        this.mVisibility = Visibility.DEFAULT;
        this.mDirtyType = DirtyType.NONE_DIRTY_TYPE;
        this.mStatus = Status.TENTATIVE;
        this.mGuestsCanInvite = true;
        this.mGuestsCanSeeOtherGuests = true;
        this.displayType = DisplayType.INVISIBLE;
        this.mCategory = Category.DEFAULT_CATEGORY;
    }

    public void setAttachments(List<CalendarEventAttachment> list) {
        this.mAttachments = list;
    }

    public void setAttendeeNum(int i) {
        this.mAttendeeNum = i;
    }

    public void setAttendeeSource(int i) {
        this.mAttendeeSource = i;
    }

    public void setAttendees(List<CalendarEventAttendee> list) {
        this.mAttendees = list;
    }

    public void setAudioUrl(String str) {
        this.mAudioUrl = str;
    }

    public void setCalColor(MappingColor mappingColor) {
        this.mCalColor = mappingColor;
    }

    public void setCalendarEventDisplayInfo(CalendarEventDisplayInfo calendarEventDisplayInfo) {
        this.mCalendarEventDisplayInfo = calendarEventDisplayInfo;
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setCalendarSchemaCollection(CalendarSchemaCollection calendarSchemaCollection) {
        this.mCalendarSchemaCollection = calendarSchemaCollection;
    }

    public void setCategory(Category category) {
        this.mCategory = category;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void setConflictType(ConflictType conflictType) {
        this.mConflictType = conflictType;
    }

    public void setCreateTime(long j) {
        this.mCreateTime = j;
    }

    public void setCreator(CalendarEventAttendee calendarEventAttendee) {
        this.mCreator = calendarEventAttendee;
    }

    public void setCreatorCalendarId(String str) {
        this.mCreatorCalendarId = str;
    }

    public void setCreatorIsAttend(boolean z) {
        this.mCreatorIsAttend = z;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDirtyType(DirtyType dirtyType) {
        this.mDirtyType = dirtyType;
    }

    public void setDisplayType(DisplayType displayType2) {
        this.displayType = displayType2;
    }

    public void setDocsDescription(String str) {
        this.mDocsDescription = str;
    }

    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    public void setEndTimeZone(String str) {
        this.mEndTimeZone = str;
    }

    public void setEventAttendeeInfo(EventAttendeeInfo eventAttendeeInfo2) {
        this.eventAttendeeInfo = eventAttendeeInfo2;
    }

    public void setEventColor(MappingColor mappingColor) {
        this.mEventColor = mappingColor;
    }

    public void setGuestsCanInvite(boolean z) {
        this.mGuestsCanInvite = z;
    }

    public void setGuestsCanModify(boolean z) {
        this.mGuestsCanModify = z;
    }

    public void setGuestsCanSeeOtherGuests(boolean z) {
        this.mGuestsCanSeeOtherGuests = z;
    }

    public void setHasAlarm(boolean z) {
        this.mHasAlarm = z;
    }

    public void setHasAttendee(boolean z) {
        this.mHasAttendee = z;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setImportance(int i) {
        this.mImportance = i;
    }

    public void setIsAllDay(boolean z) {
        this.mIsAllDay = z;
    }

    public void setIsCrossTenant(boolean z) {
        this.mIsCrossTenant = z;
    }

    public void setIsDeletable(Deletable deletable) {
        this.mIsDeletable = deletable;
    }

    public void setIsEditable(Boolean bool) {
        this.mIsEditable = bool;
    }

    public void setIsFree(boolean z) {
        this.mIsFree = z;
    }

    public void setIsNeedUpdate(boolean z) {
        this.mIsNeedUpdate = z;
    }

    public void setIsOrganizer(boolean z) {
        this.mIsOrganizer = z;
    }

    public void setIsScheduled(boolean z) {
        this.mIsScheduled = z;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setLastDate(long j) {
        this.mLastDate = j;
    }

    public void setLocation(CalendarLocation calendarLocation) {
        this.location = calendarLocation;
    }

    public void setMeetingId(String str) {
        this.mMeetingId = str;
    }

    public void setMeetingMinuteUrl(String str) {
        this.mMeetingMinuteUrl = str;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.mNotificationType = notificationType;
    }

    public void setOrganizer(CalendarEventAttendee calendarEventAttendee) {
        this.mOrganizer = calendarEventAttendee;
    }

    public void setOrganizerCalendarId(String str) {
        this.mOrganizerCalendarId = str;
    }

    public void setOrganizerIsAttend(boolean z) {
        this.mOrganizerIsAttend = z;
    }

    public void setOriginalEventKey(String str) {
        this.mOriginalEventKey = str;
    }

    public void setOriginalIsAllDay(boolean z) {
        this.mOriginalIsAllDay = z;
    }

    public void setOriginalTime(long j) {
        this.mOriginalTime = j;
    }

    public void setRRule(String str) {
        this.mRRule = str;
    }

    public void setReminders(List<CalendarEventReminder> list) {
        this.mReminders = list;
    }

    public void setSelfAttendeeStatus(CalendarEventAttendee.Status status) {
        this.mSelfAttendeeStatus = status;
    }

    public void setServerId(String str) {
        this.mServerId = str;
    }

    public void setSharability(Sharability sharability) {
        this.mSharability = sharability;
    }

    public void setSource(Source source) {
        this.mSource = source;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setStartTimeZone(String str) {
        this.mStartTimeZone = str;
    }

    public void setStatus(Status status) {
        this.mStatus = status;
    }

    public void setSuccessor(CalendarEventAttendee calendarEventAttendee) {
        this.mSuccessor = calendarEventAttendee;
    }

    public void setSuccessorIsAttend(boolean z) {
        this.mSuccessorIsAttend = z;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public void setType(Type type) {
        this.mType = type;
    }

    public void setUpdateTime(long j) {
        this.mUpdateTime = j;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setUserInviteOperator(EventInviteOperator eventInviteOperator) {
        this.mUserInviteOperator = eventInviteOperator;
    }

    public void setUserInviteOperatorId(String str) {
        this.mUserInviteOperatorId = str;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setVideoMeeting(DoVideoMeeting doVideoMeeting) {
        this.videoMeeting = doVideoMeeting;
    }

    public void setVisibility(Visibility visibility) {
        this.mVisibility = visibility;
    }

    public CalendarEvent(CalendarEvent calendarEvent) {
        this(calendarEvent, false);
    }

    public void updateAttachments(List<CalendarEventAttachment> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new CalendarEventAttachment(list.get(i)));
            }
            this.mAttachments = arrayList;
        }
    }

    public void updateAttendees(List<CalendarEventAttendee> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new CalendarEventAttendee(list.get(i)));
            }
            this.mAttendees = arrayList;
            if (arrayList.size() > 0) {
                z = true;
            }
            this.mHasAttendee = z;
        }
    }

    public void updateReminders(List<CalendarEventReminder> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new CalendarEventReminder(list.get(i)));
            }
            this.mReminders = arrayList;
            if (arrayList.size() > 0) {
                z = true;
            }
            this.mHasAlarm = z;
        }
    }

    public void addAttendees(List<CalendarEventAttendee> list) {
        if (list != null && list.size() != 0) {
            if (this.mAttendees == null) {
                this.mAttendees = new ArrayList();
            }
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= list.size()) {
                    break;
                }
                CalendarEventAttendee calendarEventAttendee = list.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= this.mAttendees.size()) {
                        break;
                    } else if (calendarEventAttendee.getAttendeeCalendarId().equals(this.mAttendees.get(i2).getAttendeeCalendarId())) {
                        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.TENTATIVE);
                        z2 = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    this.mAttendees.add(calendarEventAttendee);
                }
                i++;
            }
            if (this.mAttendees.size() > 0) {
                z = true;
            }
            this.mHasAttendee = z;
        }
    }

    public void removeAttendees(List<CalendarEventAttendee> list) {
        List<CalendarEventAttendee> list2;
        if (!(list == null || list.size() == 0 || (list2 = this.mAttendees) == null || list2.size() == 0)) {
            boolean z = false;
            for (int i = 0; i < this.mAttendees.size(); i++) {
                CalendarEventAttendee calendarEventAttendee = this.mAttendees.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (calendarEventAttendee.getAttendeeCalendarId().equals(list.get(i).getAttendeeCalendarId())) {
                        calendarEventAttendee.setStatus(CalendarEventAttendee.Status.REMOVED);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (this.mAttendees.size() > 0) {
                z = true;
            }
            this.mHasAttendee = z;
        }
    }

    public CalendarEvent(CalendarEvent calendarEvent, boolean z) {
        this.mSelfAttendeeStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
        this.mSource = Source.UNKNOWN_SOURCE;
        this.mVisibility = Visibility.DEFAULT;
        this.mDirtyType = DirtyType.NONE_DIRTY_TYPE;
        this.mStatus = Status.TENTATIVE;
        this.mGuestsCanInvite = true;
        this.mGuestsCanSeeOtherGuests = true;
        this.displayType = DisplayType.INVISIBLE;
        this.mCategory = Category.DEFAULT_CATEGORY;
        this.mId = calendarEvent.mId;
        this.mCreatorCalendarId = calendarEvent.mCreatorCalendarId;
        this.mCalendarId = calendarEvent.mCalendarId;
        this.mOrganizerCalendarId = calendarEvent.mOrganizerCalendarId;
        this.mServerId = calendarEvent.mServerId;
        this.mSelfAttendeeStatus = calendarEvent.mSelfAttendeeStatus;
        this.mKey = calendarEvent.mKey;
        this.mOriginalTime = calendarEvent.mOriginalTime;
        this.mOriginalEventKey = calendarEvent.mOriginalEventKey;
        this.mOriginalIsAllDay = calendarEvent.mOriginalIsAllDay;
        this.mIsFree = calendarEvent.mIsFree;
        this.mLastDate = calendarEvent.mLastDate;
        this.mCreateTime = calendarEvent.mCreateTime;
        this.mUpdateTime = calendarEvent.mUpdateTime;
        this.mColor = calendarEvent.mColor;
        this.mSource = calendarEvent.mSource;
        this.mVisibility = calendarEvent.mVisibility;
        this.mImportance = calendarEvent.mImportance;
        this.mDirtyType = calendarEvent.mDirtyType;
        this.mVersion = calendarEvent.mVersion;
        this.mIsNeedUpdate = calendarEvent.mIsNeedUpdate;
        this.mSummary = calendarEvent.mSummary;
        if (!z) {
            this.mDescription = calendarEvent.mDescription;
            this.mDocsDescription = calendarEvent.mDocsDescription;
        }
        this.mIsAllDay = calendarEvent.mIsAllDay;
        this.mStartTime = calendarEvent.mStartTime;
        this.mStartTimeZone = calendarEvent.mStartTimeZone;
        this.mEndTime = calendarEvent.mEndTime;
        this.mEndTimeZone = calendarEvent.mEndTimeZone;
        this.mStatus = calendarEvent.mStatus;
        this.mRRule = calendarEvent.mRRule;
        this.mGuestsCanInvite = calendarEvent.mGuestsCanInvite;
        this.mGuestsCanSeeOtherGuests = calendarEvent.mGuestsCanSeeOtherGuests;
        this.mGuestsCanModify = calendarEvent.mGuestsCanModify;
        this.mAudioUrl = calendarEvent.mAudioUrl;
        this.mUrl = calendarEvent.mUrl;
        this.mEventColor = calendarEvent.mEventColor;
        this.mCalColor = calendarEvent.mCalColor;
        this.mConflictType = calendarEvent.mConflictType;
        this.mType = calendarEvent.mType;
        this.mMeetingId = calendarEvent.mMeetingId;
        this.location = calendarEvent.location;
        this.mHasAlarm = calendarEvent.mHasAlarm;
        this.mHasAttendee = calendarEvent.mHasAttendee;
        this.mIsScheduled = calendarEvent.mIsScheduled;
        CalendarEventAttendee calendarEventAttendee = calendarEvent.mCreator;
        if (calendarEventAttendee != null) {
            this.mCreator = new CalendarEventAttendee(calendarEventAttendee);
        }
        CalendarEventAttendee calendarEventAttendee2 = calendarEvent.mOrganizer;
        if (calendarEventAttendee2 != null) {
            this.mOrganizer = new CalendarEventAttendee(calendarEventAttendee2);
        }
        CalendarEventAttendee calendarEventAttendee3 = calendarEvent.mSuccessor;
        if (calendarEventAttendee3 != null) {
            this.mSuccessor = new CalendarEventAttendee(calendarEventAttendee3);
        }
        this.mCreatorIsAttend = calendarEvent.mCreatorIsAttend;
        this.mOrganizerIsAttend = calendarEvent.mOrganizerIsAttend;
        this.mSuccessorIsAttend = calendarEvent.mSuccessorIsAttend;
        if (!z) {
            updateAttendees(calendarEvent.mAttendees);
        }
        updateReminders(calendarEvent.mReminders);
        updateAttachments(calendarEvent.mAttachments);
        this.displayType = calendarEvent.displayType;
        this.mIsEditable = calendarEvent.mIsEditable;
        this.mIsDeletable = calendarEvent.mIsDeletable;
        this.mSharability = calendarEvent.mSharability;
        this.mNotificationType = calendarEvent.mNotificationType;
        this.mIsOrganizer = calendarEvent.mIsOrganizer;
        this.mIsCrossTenant = calendarEvent.mIsCrossTenant;
        this.mMeetingMinuteUrl = calendarEvent.mMeetingMinuteUrl;
        this.videoMeeting = calendarEvent.videoMeeting;
        this.mUserInviteOperatorId = calendarEvent.mUserInviteOperatorId;
        this.mCalendarEventDisplayInfo = calendarEvent.mCalendarEventDisplayInfo;
        this.mUserInviteOperator = calendarEvent.mUserInviteOperator;
        this.mCalendarSchemaCollection = calendarEvent.mCalendarSchemaCollection;
        this.mAttendeeSource = calendarEvent.mAttendeeSource;
        this.mAttendeeNum = calendarEvent.mAttendeeNum;
        this.mCategory = calendarEvent.mCategory;
        this.eventAttendeeInfo = calendarEvent.eventAttendeeInfo;
    }
}
