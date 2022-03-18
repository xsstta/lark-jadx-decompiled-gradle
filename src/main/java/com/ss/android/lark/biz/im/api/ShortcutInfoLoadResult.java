package com.ss.android.lark.biz.im.api;

import java.io.Serializable;
import java.util.List;

public class ShortcutInfoLoadResult implements Serializable {
    public List<FeedPreviewInfo> feedInfos;
    public List<Shortcut> shortcuts;

    public ShortcutInfoLoadResult(List<Shortcut> list, List<FeedPreviewInfo> list2) {
        this.shortcuts = list;
        this.feedInfos = list2;
    }
}
