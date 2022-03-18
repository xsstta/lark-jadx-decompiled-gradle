package com.ss.android.lark.moments.impl.commonvo.item;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "getId", "()Ljava/lang/String;", "getItemType", "", "ItemType", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IMomentsItemBase extends AbstractC26248b<IMomentsItemBase> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase$ItemType;", "", "(Ljava/lang/String;I)V", "ITEM_TYPE_UNKNOWN", "ITEM_TYPE_POST", "ITEM_TYPE_DETAIL_COUNT_HEAD", "ITEM_TYPE_PROFILE_HEADER", "ITEM_TYPE_PROFILE_POST_EMPTY", "ITEM_TYPE_PROFILE_HEADER_LOADING", "ITEM_TYPE_PROFILE_POST_LOADING", "ITEM_TYPE_DETAIL_COMMENT", "ITEM_TYPE_FEED_NO_MORE", "ITEM_TYPE_FEED_NO_POST", "ITEM_TYPE_DETAIL_ROOT_LOADING", "ITEM_TYPE_DETAIL_COMMENT_LOADING", "ITEM_TYPE_DETAIL_NO_COMMENT", "ITEM_TYPE_FEED_BROADCAST", "ITEM_TYPE_PROFILE_INFO", "ITEM_TYPE_PROFILE_DISABLE_FOLLOW_INFO", "ITEM_TYPE_PROFILE_POST", "ITEM_TYPE_PROFILE_INFO_SKELETON", "ITEM_TYPE_PROFILE_POST_SKELETON", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ItemType {
        ITEM_TYPE_UNKNOWN,
        ITEM_TYPE_POST,
        ITEM_TYPE_DETAIL_COUNT_HEAD,
        ITEM_TYPE_PROFILE_HEADER,
        ITEM_TYPE_PROFILE_POST_EMPTY,
        ITEM_TYPE_PROFILE_HEADER_LOADING,
        ITEM_TYPE_PROFILE_POST_LOADING,
        ITEM_TYPE_DETAIL_COMMENT,
        ITEM_TYPE_FEED_NO_MORE,
        ITEM_TYPE_FEED_NO_POST,
        ITEM_TYPE_DETAIL_ROOT_LOADING,
        ITEM_TYPE_DETAIL_COMMENT_LOADING,
        ITEM_TYPE_DETAIL_NO_COMMENT,
        ITEM_TYPE_FEED_BROADCAST,
        ITEM_TYPE_PROFILE_INFO,
        ITEM_TYPE_PROFILE_DISABLE_FOLLOW_INFO,
        ITEM_TYPE_PROFILE_POST,
        ITEM_TYPE_PROFILE_INFO_SKELETON,
        ITEM_TYPE_PROFILE_POST_SKELETON
    }

    /* renamed from: a */
    String mo166379a();

    /* renamed from: t */
    int mo166408t();
}
