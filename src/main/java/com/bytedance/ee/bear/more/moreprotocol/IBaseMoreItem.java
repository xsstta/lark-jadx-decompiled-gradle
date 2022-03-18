package com.bytedance.ee.bear.more.moreprotocol;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "Lcom/bytedance/ee/util/io/NonProguard;", "getHost", "Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "getId", "", "isVisible", "", "onRelease", "", "setHost", "host", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IBaseMoreItem extends NonProguard {
    IMoreHost getHost();

    String getId();

    boolean isVisible();

    void onRelease();

    void setHost(IMoreHost aVar);
}
