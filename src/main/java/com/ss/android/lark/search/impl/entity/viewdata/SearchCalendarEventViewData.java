package com.ss.android.lark.search.impl.entity.viewdata;

public class SearchCalendarEventViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -4989513876952725543L;
    private String mCalendarId;
    private Long mEndTime;
    private String mEventExactData;
    private String mEventKey;
    private Boolean mIsGoogleEvent;
    private Long mOriginalTime;
    private Long mStartTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10000004;
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

    public Boolean getIsGoogleEvent() {
        return this.mIsGoogleEvent;
    }

    public Long getOriginalTime() {
        return this.mOriginalTime;
    }

    public Long getStartTime() {
        return this.mStartTime;
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

    public void setIsGoogleEvent(Boolean bool) {
        this.mIsGoogleEvent = bool;
    }

    public void setOriginalTime(Long l) {
        this.mOriginalTime = l;
    }

    public void setStartTime(Long l) {
        this.mStartTime = l;
    }
}
