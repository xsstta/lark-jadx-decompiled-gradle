package com.bytedance.ee.bear.more;

import com.bytedance.ee.bear.contract.NetService;

public class PageViewResult extends NetService.Result {
    public int commentsCount;
    public int commentsCountToday;
    public long creationTime;
    public int likeCount;
    public int likeCountToday;
    public String ownerAvatarUrl;
    public String ownerEnName;
    public String ownerId;
    public String ownerName;
    public int pv;
    public int pvToday;
    public int uv;
    public int uvToday;
}
