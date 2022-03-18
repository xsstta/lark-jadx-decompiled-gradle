package com.ss.android.lark.calendar.impl.features.messagecard.entity;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalendarCardContent implements Serializable {
    private int mAttendeeCount;
    private ArrayList<AbstractC30026d> mAttendeeList;
    private String mCalendarId;
    private List<String> mChatIds;
    private Map<String, String> mChatNames;
    private long mConflictTime;
    private CalendarInternalContent.ConflictType mConflictType = CalendarInternalContent.ConflictType.NONE;
    private String mDescription;
    private long mEndTime;
    private String mEndTimezone;
    private CalendarEvent.Type mEventType = CalendarEvent.Type.DEFAULT_TYPE;
    private String mId;
    private List<String> mIndividualChatterIds;
    private boolean mIsAllDay;
    private boolean mIsCrossTenant;
    private boolean mIsOptional;
    private String mKey;
    private String mLocation;
    private List<String> mMeetingRooms;
    private List<Boolean> mMeetingRoomsIsDisabled;
    private long mOriginalTime;
    private String mRRule;
    private CalendarEventAttendee.Status mSelfAttendeeStatus = CalendarEventAttendee.Status.NEEDS_ACTION;
    private AbstractC30026d mSender;
    private long mStartTime;
    private String mStartTimezone;
    private String mSummary;
    private int mType;
    private long mVersion;

    public int getAttendeeCount() {
        return this.mAttendeeCount;
    }

    public ArrayList<AbstractC30026d> getAttendeeList() {
        return this.mAttendeeList;
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public List<String> getChatIds() {
        return this.mChatIds;
    }

    public Map<String, String> getChatNames() {
        return this.mChatNames;
    }

    public long getConflictTime() {
        return this.mConflictTime;
    }

    public CalendarInternalContent.ConflictType getConflictType() {
        return this.mConflictType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public String getEndTimezone() {
        return this.mEndTimezone;
    }

    public CalendarEvent.Type getEventType() {
        return this.mEventType;
    }

    public String getId() {
        return this.mId;
    }

    public List<String> getIndividualChatterIds() {
        return this.mIndividualChatterIds;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public List<String> getMeetingRooms() {
        return this.mMeetingRooms;
    }

    public List<Boolean> getMeetingRoomsIsDisabled() {
        return this.mMeetingRoomsIsDisabled;
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

    public AbstractC30026d getSender() {
        return this.mSender;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public String getStartTimezone() {
        return this.mStartTimezone;
    }

    public String getSummary() {
        return this.mSummary;
    }

    public int getType() {
        return this.mType;
    }

    public long getVersion() {
        return this.mVersion;
    }

    public boolean isAllDay() {
        return this.mIsAllDay;
    }

    public boolean isCrossTenant() {
        return this.mIsCrossTenant;
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public void setAttendeeCount(int i) {
        this.mAttendeeCount = i;
    }

    public void setAttendeeList(ArrayList<AbstractC30026d> arrayList) {
        this.mAttendeeList = arrayList;
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setChatIds(List<String> list) {
        this.mChatIds = list;
    }

    public void setChatNames(Map<String, String> map) {
        this.mChatNames = map;
    }

    public void setConflictTime(long j) {
        this.mConflictTime = j;
    }

    public void setConflictType(CalendarInternalContent.ConflictType conflictType) {
        this.mConflictType = conflictType;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    public void setEndTimezone(String str) {
        this.mEndTimezone = str;
    }

    public void setEventType(CalendarEvent.Type type) {
        this.mEventType = type;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setIndividualChatterIds(List<String> list) {
        this.mIndividualChatterIds = list;
    }

    public void setIsAllDay(boolean z) {
        this.mIsAllDay = z;
    }

    public void setIsCrossTenant(boolean z) {
        this.mIsCrossTenant = z;
    }

    public void setIsOptional(boolean z) {
        this.mIsOptional = z;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public void setMeetingRooms(List<String> list) {
        this.mMeetingRooms = list;
    }

    public void setMeetingRoomsIsDisabled(List<Boolean> list) {
        this.mMeetingRoomsIsDisabled = list;
    }

    public void setOriginalTime(long j) {
        this.mOriginalTime = j;
    }

    public void setRRule(String str) {
        this.mRRule = str;
    }

    public void setSelfAttendeeStatus(CalendarEventAttendee.Status status) {
        this.mSelfAttendeeStatus = status;
    }

    public void setSender(AbstractC30026d dVar) {
        this.mSender = dVar;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setStartTimezone(String str) {
        this.mStartTimezone = str;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void setVersion(long j) {
        this.mVersion = j;
    }
}
