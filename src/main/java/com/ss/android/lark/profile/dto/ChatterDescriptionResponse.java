package com.ss.android.lark.profile.dto;

import com.ss.android.lark.profile.entity.ChatterDescription;
import java.io.Serializable;
import java.util.List;

public class ChatterDescriptionResponse {

    public static class ChatterDescriptionsResponse implements Serializable {
        public List<ChatterDescription> descriptions;
        public boolean hasMore;

        public ChatterDescriptionsResponse(List<ChatterDescription> list, boolean z) {
            this.descriptions = list;
            this.hasMore = z;
        }
    }
}
