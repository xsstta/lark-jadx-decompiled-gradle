package com.ss.android.lark.searchcommon.dto.info;

import java.util.Objects;

public class SearchCalendarEventInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -7929879512142632334L;
    private String mCalendarId;
    private Long mEndTime;
    private String mEventExactData;
    private String mEventKey;
    private boolean mIsGoogleEvent;
    private Long mOriginalTime;
    private Long mStartTime;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "calendar";
    }

    public String getCalendarId() {
        return this.mCalendarId;
    }

    public Long getEndTime() {
        return this.mEndTime;
    }

    public String getEventExactData() {
        return this.mEventExactData;
    }

    public String getEventKey() {
        return this.mEventKey;
    }

    public boolean getIsGoogleEvent() {
        return this.mIsGoogleEvent;
    }

    public Long getOriginalTime() {
        return this.mOriginalTime;
    }

    public Long getStartTime() {
        return this.mStartTime;
    }

    public SearchCalendarEventInfo() {
        this.type = 10000004;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mCalendarId, this.mEventKey, this.mOriginalTime, Boolean.valueOf(this.mIsGoogleEvent), this.mStartTime, this.mEndTime, this.mEventExactData);
    }

    public void setCalendarId(String str) {
        this.mCalendarId = str;
    }

    public void setEndTime(Long l) {
        this.mEndTime = l;
    }

    public void setEventExactData(String str) {
        this.mEventExactData = str;
    }

    public void setEventKey(String str) {
        this.mEventKey = str;
    }

    public void setIsGoogleEvent(boolean z) {
        this.mIsGoogleEvent = z;
    }

    public void setOriginalTime(Long l) {
        this.mOriginalTime = l;
    }

    public void setStartTime(Long l) {
        this.mStartTime = l;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCalendarEventInfo) || !super.equals(obj)) {
            return false;
        }
        SearchCalendarEventInfo searchCalendarEventInfo = (SearchCalendarEventInfo) obj;
        if (this.mIsGoogleEvent != searchCalendarEventInfo.mIsGoogleEvent || !Objects.equals(this.mCalendarId, searchCalendarEventInfo.mCalendarId) || !Objects.equals(this.mEventKey, searchCalendarEventInfo.mEventKey) || !Objects.equals(this.mOriginalTime, searchCalendarEventInfo.mOriginalTime) || !Objects.equals(this.mStartTime, searchCalendarEventInfo.mStartTime) || !Objects.equals(this.mEndTime, searchCalendarEventInfo.mEndTime) || !Objects.equals(this.mEventExactData, searchCalendarEventInfo.mEventExactData)) {
            return false;
        }
        return true;
    }
}
