package com.bytedance.ee.bear.templates;

import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/LayoutType;", "", "layId", "", "layBlankId", "coverSkeletonLayId", "thumbnailSkeletonLayId", "(Ljava/lang/String;IIIII)V", "getCoverSkeletonLayId", "()I", "getLayBlankId", "getLayId", "getThumbnailSkeletonLayId", "isV5", "", "TYPE_RECOMMEND", "TYPE_CENTER", "TYPE_RECOMMEND2", "TYPE_CENTER2", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum LayoutType {
    TYPE_RECOMMEND(R.layout.template_v4_item_recommand, R.layout.template_v4_item_recommand_blank, R.layout.template_v4_item_recommend_cover_skeleton, R.layout.template_v4_item_recommend_cover_skeleton),
    TYPE_CENTER(R.layout.template_v4_item_center, R.layout.template_v4_item_center_blank, R.layout.template_v4_item_center_cover_skeleton, R.layout.template_v4_item_center_cover_skeleton),
    TYPE_RECOMMEND2(R.layout.template_v4_item_recommend2, R.layout.template_v4_item_recommend2_blank, R.layout.template_v4_item_recommend_cover_skeleton2, R.layout.template_v4_item_recommend_cover_skeleton2),
    TYPE_CENTER2(R.layout.template_v4_item_center2, R.layout.template_v4_item_center_blank, R.layout.template_v4_item_center_cover_skeleton2, R.layout.template_v4_item_center_cover_skeleton2);
    
    private final int coverSkeletonLayId;
    private final int layBlankId;
    private final int layId;
    private final int thumbnailSkeletonLayId;

    public final int getCoverSkeletonLayId() {
        return this.coverSkeletonLayId;
    }

    public final int getLayBlankId() {
        return this.layBlankId;
    }

    public final int getLayId() {
        return this.layId;
    }

    public final int getThumbnailSkeletonLayId() {
        return this.thumbnailSkeletonLayId;
    }

    public final boolean isV5() {
        LayoutType layoutType = this;
        if (layoutType == TYPE_CENTER2 || layoutType == TYPE_RECOMMEND2) {
            return true;
        }
        return false;
    }

    private LayoutType(int i, int i2, int i3, int i4) {
        this.layId = i;
        this.layBlankId = i2;
        this.coverSkeletonLayId = i3;
        this.thumbnailSkeletonLayId = i4;
    }
}
