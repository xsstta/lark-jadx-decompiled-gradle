package com.ss.android.lark.searchcommon.dto;

import com.ss.android.lark.chat.entity.image.ImageSet;
import java.io.Serializable;
import java.util.List;

public class SearchImageHistory implements Serializable {
    private boolean hasMoreBefore;
    private List<ImageSet> imageSetList;

    public List<ImageSet> getImageSetList() {
        return this.imageSetList;
    }

    public boolean isHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public void setHasMoreBefore(boolean z) {
        this.hasMoreBefore = z;
    }

    public void setImageSetList(List<ImageSet> list) {
        this.imageSetList = list;
    }

    public SearchImageHistory(boolean z, List<ImageSet> list) {
        this.hasMoreBefore = z;
        this.imageSetList = list;
    }
}
