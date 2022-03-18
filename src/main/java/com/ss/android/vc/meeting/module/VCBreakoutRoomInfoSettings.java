package com.ss.android.vc.meeting.module;

import com.ss.android.vc.entity.ByteviewUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VCBreakoutRoomInfoSettings implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean articipantUnmuteDeny;
    private boolean muteOnEntry;
    private boolean onlyPresenterCanAnnote;
    private List<ByteviewUser> snapShotUsers = new ArrayList();

    public List<ByteviewUser> getSnapShotUsers() {
        return this.snapShotUsers;
    }

    public boolean isArticipantUnmuteDeny() {
        return this.articipantUnmuteDeny;
    }

    public boolean isMuteOnEntry() {
        return this.muteOnEntry;
    }

    public boolean isOnlyPresenterCanAnnote() {
        return this.onlyPresenterCanAnnote;
    }

    public void setArticipantUnmuteDeny(boolean z) {
        this.articipantUnmuteDeny = z;
    }

    public void setMuteOnEntry(boolean z) {
        this.muteOnEntry = z;
    }

    public void setOnlyPresenterCanAnnote(boolean z) {
        this.onlyPresenterCanAnnote = z;
    }

    public void setSnapShotUsers(List<ByteviewUser> list) {
        this.snapShotUsers = list;
    }
}
