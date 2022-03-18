package com.ss.android.appcenter.business.tab.fragmentv2.adapter.model;

import com.ss.android.appcenter.business.net.dto.ItemInfo;

public class AddAppItem extends ItemInfo {
    @Override // com.ss.android.appcenter.business.net.dto.ItemInfo
    public boolean isBookmark() {
        return false;
    }

    @Override // com.ss.android.appcenter.business.net.dto.ItemInfo
    public boolean isNative() {
        return false;
    }

    @Override // com.ss.android.appcenter.business.net.dto.ItemInfo
    public boolean isSingleBot() {
        return false;
    }

    @Override // com.ss.android.appcenter.business.net.dto.ItemInfo
    public boolean isWidget() {
        return false;
    }
}
