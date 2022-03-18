package com.ss.android.lark.moments.impl.common.utils;

import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bJF\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/PreviewUtils;", "", "()V", "getUrlPreviewHangPoint", "", "", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "item", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "parseUrlPreview", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "entityId", "hangPointMap", "previews", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.g */
public final class PreviewUtils {

    /* renamed from: a */
    public static final PreviewUtils f119253a = new PreviewUtils();

    private PreviewUtils() {
    }

    /* renamed from: a */
    public final Map<String, UrlPreviewHangPoint> mo166210a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (iMomentsItemBase instanceof MomentsPostVM) {
            return ((MomentsPostVM) iMomentsItemBase).mo166421F().url_preview_hang_point_map;
        }
        if (iMomentsItemBase instanceof MomentsCommentVM) {
            return ((MomentsCommentVM) iMomentsItemBase).mo166412w().url_preview_hang_point_map;
        }
        return null;
    }

    /* renamed from: a */
    public final Map<String, PreviewHangPoint> mo166211a(String str, Map<String, UrlPreviewHangPoint> map, Map<String, ? extends UrlPreviewEntity> map2) {
        Intrinsics.checkParameterIsNotNull(str, "entityId");
        Intrinsics.checkParameterIsNotNull(map2, "previews");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, UrlPreviewHangPoint> entry : map.entrySet()) {
                UrlPreviewHangPoint value = entry.getValue();
                String str2 = value.url;
                String key = entry.getKey();
                String str3 = value.preview_id;
                Boolean bool = value.need_local_preview;
                Intrinsics.checkExpressionValueIsNotNull(bool, "pbUrlPreviewHangPoint.need_local_preview");
                linkedHashMap.put(entry.getKey(), new PreviewHangPoint(str2, key, str, str3, bool.booleanValue(), (UrlPreviewEntity) map2.get(value.preview_id)));
            }
        }
        return linkedHashMap;
    }
}
