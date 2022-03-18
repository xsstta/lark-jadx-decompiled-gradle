package com.ss.android.vc.entity.response;

import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import java.io.Serializable;
import java.util.List;

public class SearchUsersAndChatsEntity implements Serializable {
    public boolean has_more;
    public List<VideoChatShareItem> items;
    public String search_key;
    public long total_count;
}
