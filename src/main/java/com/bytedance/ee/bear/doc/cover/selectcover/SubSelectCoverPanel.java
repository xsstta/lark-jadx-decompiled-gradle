package com.bytedance.ee.bear.doc.cover.selectcover;

import com.bytedance.ee.bear.doc.cover.selectcover.local.LocalCoverSelectionFragment;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverSelectionFragment;
import com.larksuite.suite.R;

public enum SubSelectCoverPanel {
    Official(0, R.string.CreationMobile_Docs_DocCover_OfficialGallery_Tab, OfficialCoverSelectionFragment.class.getName()),
    Local(1, R.string.CreationMobile_Docs_DocCover_LocalUpload_Tab, LocalCoverSelectionFragment.class.getName());
    
    public String fragment;
    public int position;
    public int titleResId;

    private SubSelectCoverPanel(int i, int i2, String str) {
        this.titleResId = i2;
        this.position = i;
        this.fragment = str;
    }
}
