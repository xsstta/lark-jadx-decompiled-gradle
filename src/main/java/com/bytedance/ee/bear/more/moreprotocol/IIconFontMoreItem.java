package com.bytedance.ee.bear.more.moreprotocol;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/IIconFontMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "getIcon", "", "getIconTint", "getTitle", "", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IIconFontMoreItem extends IBaseMoreItem {
    int getIcon();

    int getIconTint();

    String getTitle();
}
