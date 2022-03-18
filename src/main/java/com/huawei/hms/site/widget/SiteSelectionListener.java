package com.huawei.hms.site.widget;

import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.api.model.Site;

public interface SiteSelectionListener {
    void onError(SearchStatus searchStatus);

    void onSiteSelected(Site site);
}
