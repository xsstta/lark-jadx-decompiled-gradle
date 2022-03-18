package com.ss.android.lark.feed.dto;

import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.feed.app.entity.IJumpInfo;
import java.util.UUID;

public class ShortcutBtnPreView extends FeedPreview implements IBadgeable, IJumpInfo {
    public ShortcutBtnPreView() {
        setId(String.valueOf(UUID.randomUUID().toString().hashCode()));
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if (obj instanceof ShortcutBtnPreView) {
            return true;
        }
        return super.exactlyCompare(obj);
    }
}
