package com.ss.android.lark.chatsetting.impl.group.announcement;

import java.io.Serializable;

public class AnnouncementViewData implements Serializable {
    private static final long serialVersionUID = 7392912308378035934L;
    public boolean canEditAnnouncement;
    public String content;
    public boolean isEmpty;
    public boolean isInit;
    public String lastEditorName;
    public long updateTime;
}
