package com.ss.android.vc.entity;

import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.follow.ThumbnailDetail;
import java.io.Serializable;

public class UrlBrief implements Serializable {
    public Boolean isDirty;
    public boolean openInBrowser;
    public FollowInfo.ShareSubType subtype;
    public ThumbnailDetail thumbnail;
    public String title;
    public FollowInfo.ShareType type;
    public String url;
}
