package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.io.Serializable;
import java.util.List;

public class CalendarEventInstance implements Serializable {
    private static final long serialVersionUID = 1;
    private CalendarLocation calendarLocation;
    private Calendar.AccessRole mCalAccessRole = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
    private int mCalBackgroundColor = -1;
    private MappingColor mCalColor;
    private int mCalForegroundColor = -1;
    private SkinColor mCalSkin;
    private String mCalendarId;
    private CalendarEvent.Category mCategory = CalendarEvent.Category.DEFAULT_CATEGORY;
    private int mColor = -1;
    private CalendarEvent.DisplayType mDisplayType = CalendarEvent.DisplayType.INVISIBLE;
    private int mEndDay;
    private int mEndMinute;
    private long mEndTime;
    private String mEndTimezone;
    private MappingColor mEventColor;
    private CalendarEventCreator mEventCreator;
    private String mEventId;
    private String mEventServerId;
    private SkinColor mEventSkin;
    private CalendarEvent.Type mEventType;
    private String mId;
    private String mImportanceScore = "";
    private boolean mIsAllDay;
    private boolean mIsEditable;
    private boolean mIsFree;
    private boolean mIsSubscriber = true;
    private String mKey;
    private List<String> mMeetingRooms;
    private String mOrganizerId;
    private CalendarEventCreator mOriginalEventCreator;
    private long mOriginalTime;
    private CalendarEventAttendee.Status mSelfAttendeeStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
    private CalendarEvent.Source mSource = CalendarEvent.Source.UNKNOWN_SOURCE;
    private int mStartDay;
    private int mStartMinute;
    private long mStartTime;
    private String mStartTimezone;
    private CalendarEvent.Status mStatus = CalendarEvent.Status.TENTATIVE;
    private String mSummary;
    private CalendarEvent.Visibility mVisibility = CalendarEvent.Visibility.DEFAULT;

    public Calendar.AccessRole getCalAccessRole() {
        return this.mCalAccessRole;
    }

    public int getCalBackgroundColor() {
        return this.mCalBackgroundColor;
    }

    public MappingColor getCalMappingColor() {
        return this.mCalColor;
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public CalendarLocation getCalendarLocation() {
        return this.calendarLocation;
    }

    public CalendarEvent.Category getCategory() {
        return this.mCategory;
    }

    public int getColor() {
        return this.mColor;
    }

    public CalendarEvent.DisplayType getDisplayType() {
        return this.mDisplayType;
    }

    public int getEndDay() {
        return this.mEndDay;
    }

    public int getEndMinute() {
        return this.mEndMinute;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public String getEndTimezone() {
        return this.mEndTimezone;
    }

    public CalendarEventCreator getEventCreator() {
        return this.mEventCreator;
    }

    public String getEventId() {
        return this.mEventId;
    }

    public String getEventServerId() {
        return this.mEventServerId;
    }

    public CalendarEvent.Type getEventType() {
        return this.mEventType;
    }

    public String getId() {
        return this.mId;
    }

    public String getImportanceScore() {
        return this.mImportanceScore;
    }

    public String getKey() {
        return this.mKey;
    }

    public List<String> getMeetingRooms() {
        return this.mMeetingRooms;
    }

    public String getOrganizerId() {
        return this.mOrganizerId;
    }

    public CalendarEventCreator getOriginalEventCreator() {
        return this.mOriginalEventCreator;
    }

    public long getOriginalTime() {
        return this.mOriginalTime;
    }

    public CalendarEventAttendee.Status getSelfAttendeeStatus() {
        return this.mSelfAttendeeStatus;
    }

    public CalendarEvent.Source getSource() {
        return this.mSource;
    }

    public int getStartDay() {
        return this.mStartDay;
    }

    public int getStartMinute() {
        return this.mStartMinute;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public String getStartTimezone() {
        return this.mStartTimezone;
    }

    public CalendarEvent.Status getStatus() {
        return this.mStatus;
    }

    public String getSummary() {
        return this.mSummary;
    }

    public CalendarEvent.Visibility getVisibility() {
        return this.mVisibility;
    }

    public MappingColor getmEventColor() {
        return this.mEventColor;
    }

    public boolean isAllDay() {
        return this.mIsAllDay;
    }

    public boolean isEditable() {
        return this.mIsEditable;
    }

    public boolean isFree() {
        return this.mIsFree;
    }

    public boolean isSubscriber() {
        return this.mIsSubscriber;
    }

    public int getEventCardColor() {
        return getEventCardColorByAccessRole();
    }

    public int getEventColor() {
        return getEventColorByAccessRole();
    }

    public int getTitleColor() {
        return getTitleColorByAccessRole();
    }

    private int getCalForegroundColor() {
        MappingColor mappingColor = this.mCalColor;
        if (mappingColor != null) {
            return mappingColor.getForegroundColor();
        }
        return this.mCalForegroundColor;
    }

    public int getCalColor() {
        MappingColor mappingColor = this.mCalColor;
        if (mappingColor != null) {
            return mappingColor.getBackgroundColor();
        }
        return this.mCalBackgroundColor;
    }

    private int getEventCardColorByAccessRole() {
        if (isLimitAccessRole()) {
            MappingColor mappingColor = this.mCalColor;
            if (mappingColor != null) {
                return mappingColor.getEventCardColor();
            }
            return this.mCalBackgroundColor;
        }
        MappingColor mappingColor2 = this.mEventColor;
        if (mappingColor2 != null) {
            return mappingColor2.getEventCardColor();
        }
        return getCalColor();
    }

    private int getEventColorByAccessRole() {
        int i;
        if (isLimitAccessRole()) {
            return getCalColor();
        }
        MappingColor mappingColor = this.mEventColor;
        if (mappingColor != null) {
            i = mappingColor.getBackgroundColor();
        } else {
            i = -1;
        }
        if (i == -1) {
            return getCalColor();
        }
        return i;
    }

    private int getTitleColorByAccessRole() {
        int i;
        if (isLimitAccessRole()) {
            return getCalForegroundColor();
        }
        MappingColor mappingColor = this.mEventColor;
        if (mappingColor != null) {
            i = mappingColor.getForegroundColor();
        } else {
            i = -1;
        }
        if (i == -1) {
            return getCalForegroundColor();
        }
        return i;
    }

    public boolean isLimitAccessRole() {
        if (this.mDisplayType.equals(CalendarEvent.DisplayType.FULL)) {
            return false;
        }
        if (this.mCalAccessRole == Calendar.AccessRole.FREE_BUSY_READER || this.mCalAccessRole == Calendar.AccessRole.UNKNOWN_ACCESS_ROLE) {
            return true;
        }
        return false;
    }

    public void setCalAccessRole(Calendar.AccessRole accessRole) {
        this.mCalAccessRole = accessRole;
    }

    public void setCalBackgroundColor(int i) {
        this.mCalBackgroundColor = i;
    }

    public void setCalColor(MappingColor mappingColor) {
        this.mCalColor = mappingColor;
    }

    public void setCalForegroundColor(int i) {
        this.mCalForegroundColor = i;
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setCalendarLocation(CalendarLocation calendarLocation2) {
        this.calendarLocation = calendarLocation2;
    }

    public void setCategory(CalendarEvent.Category category) {
        this.mCategory = category;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void setDisplayType(CalendarEvent.DisplayType displayType) {
        this.mDisplayType = displayType;
    }

    public void setEndDay(int i) {
        this.mEndDay = i;
    }

    public void setEndMinute(int i) {
        this.mEndMinute = i;
    }

    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    public void setEndTimezone(String str) {
        this.mEndTimezone = str;
    }

    public void setEventColor(MappingColor mappingColor) {
        this.mEventColor = mappingColor;
    }

    public void setEventCreator(CalendarEventCreator calendarEventCreator) {
        this.mEventCreator = calendarEventCreator;
    }

    public void setEventId(String str) {
        this.mEventId = str;
    }

    public void setEventServerId(String str) {
        this.mEventServerId = str;
    }

    public void setEventType(CalendarEvent.Type type) {
        this.mEventType = type;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setImportanceScore(String str) {
        this.mImportanceScore = str;
    }

    public void setIsAllDay(boolean z) {
        this.mIsAllDay = z;
    }

    public void setIsEditable(boolean z) {
        this.mIsEditable = z;
    }

    public void setIsFree(boolean z) {
        this.mIsFree = z;
    }

    public void setIsSubscriber(boolean z) {
        this.mIsSubscriber = z;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setMeetingRooms(List<String> list) {
        this.mMeetingRooms = list;
    }

    public void setOrganizerId(String str) {
        this.mOrganizerId = str;
    }

    public void setOriginalEventCreator(CalendarEventCreator calendarEventCreator) {
        this.mOriginalEventCreator = calendarEventCreator;
    }

    public void setOriginalTime(long j) {
        this.mOriginalTime = j;
    }

    public void setSelfAttendeeStatus(CalendarEventAttendee.Status status) {
        this.mSelfAttendeeStatus = status;
    }

    public void setSource(CalendarEvent.Source source) {
        this.mSource = source;
    }

    public void setStartDay(int i) {
        this.mStartDay = i;
    }

    public void setStartMinute(int i) {
        this.mStartMinute = i;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setStartTimezone(String str) {
        this.mStartTimezone = str;
    }

    public void setStatus(CalendarEvent.Status status) {
        this.mStatus = status;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public void setVisibility(CalendarEvent.Visibility visibility) {
        this.mVisibility = visibility;
    }
}
