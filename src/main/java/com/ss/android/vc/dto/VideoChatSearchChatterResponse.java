package com.ss.android.vc.dto;

import com.ss.android.lark.chat.entity.chatter.AccessInfo;
import com.ss.android.vc.entity.ChatterMeetingStatus;
import java.io.Serializable;
import java.util.Map;

public class VideoChatSearchChatterResponse implements Serializable {
    private Map<String, ChatterMeetingStatus> chatterStatus;
    private Map<String, AccessInfo> executiveModeMap;
    private SearchResponse searchResponse;
    private Map<String, Boolean> versionSupport;

    public Map<String, ChatterMeetingStatus> getChatterStatus() {
        return this.chatterStatus;
    }

    public Map<String, AccessInfo> getExecutive_mode() {
        return this.executiveModeMap;
    }

    public SearchResponse getSearchResponse() {
        return this.searchResponse;
    }

    public Map<String, Boolean> getVersionSupport() {
        return this.versionSupport;
    }

    public void setChatterStatus(Map<String, ChatterMeetingStatus> map) {
        this.chatterStatus = map;
    }

    public void setExecutive_mode(Map<String, AccessInfo> map) {
        this.executiveModeMap = map;
    }

    public void setSearchResponse(SearchResponse searchResponse2) {
        this.searchResponse = searchResponse2;
    }

    public void setVersionSupport(Map<String, Boolean> map) {
        this.versionSupport = map;
    }
}
