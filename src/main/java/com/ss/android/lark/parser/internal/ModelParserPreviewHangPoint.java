package com.ss.android.lark.parser.internal;

import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002JH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/parser/internal/ModelParserPreviewHangPoint;", "", "()V", "TAG", "", "parseUrlPreviewEntityFromPbEntity", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "messageId", "previewId", "pbPreviewEntities", "", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "parseUrlPreviewHangPointFromPb", "", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "hangPointMap", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.u.a.o */
public final class ModelParserPreviewHangPoint {

    /* renamed from: a */
    public static final ModelParserPreviewHangPoint f141185a = new ModelParserPreviewHangPoint();

    private ModelParserPreviewHangPoint() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Map<String, PreviewHangPoint> m222178a(String str, Map<String, UrlPreviewHangPoint> map, Map<String, PreviewEntityPair> map2) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, UrlPreviewHangPoint> entry : map.entrySet()) {
                UrlPreviewHangPoint value = entry.getValue();
                String str2 = value.url;
                String key = entry.getKey();
                String str3 = value.preview_id;
                Boolean bool = value.need_local_preview;
                Intrinsics.checkExpressionValueIsNotNull(bool, "pbUrlPreviewHangPoint.need_local_preview");
                boolean booleanValue = bool.booleanValue();
                ModelParserPreviewHangPoint oVar = f141185a;
                String str4 = value.preview_id;
                Intrinsics.checkExpressionValueIsNotNull(str4, "pbUrlPreviewHangPoint.preview_id");
                linkedHashMap.put(entry.getKey(), new PreviewHangPoint(str2, key, str, str3, booleanValue, oVar.m222177a(str, str4, map2)));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private final UrlPreviewEntity m222177a(String str, String str2, Map<String, PreviewEntityPair> map) {
        com.bytedance.lark.pb.basic.v1.UrlPreviewEntity urlPreviewEntity;
        UrlPreviewEntity urlPreviewEntity2;
        UrlPreviewEntity urlPreviewEntity3;
        PreviewEntityPair previewEntityPair;
        Map<String, com.bytedance.lark.pb.basic.v1.UrlPreviewEntity> map2;
        if (map == null || (previewEntityPair = map.get(str)) == null || (map2 = previewEntityPair.preview_entity) == null) {
            urlPreviewEntity = null;
        } else {
            urlPreviewEntity = map2.get(str2);
        }
        if (urlPreviewEntity != null) {
            urlPreviewEntity2 = ModelParserPreview.m222175a(urlPreviewEntity);
        } else {
            urlPreviewEntity2 = null;
        }
        Map<String, UrlPreviewEntity> a = PreviewCache.f84447c.mo121325a().mo121319a(str, new ArrayList(Collections.singleton(str2)));
        if (a != null) {
            urlPreviewEntity3 = a.get(str2);
        } else {
            urlPreviewEntity3 = null;
        }
        if (urlPreviewEntity3 == null && urlPreviewEntity2 == null) {
            Log.m165379d("ModelParserPreview", "preview entity is null");
            return null;
        } else if (urlPreviewEntity3 == null && urlPreviewEntity2 != null) {
            Log.m165379d("ModelParserPreview", "preview entity from pb " + urlPreviewEntity2.toString());
            return urlPreviewEntity2;
        } else if (urlPreviewEntity3 == null || urlPreviewEntity2 != null) {
            if (urlPreviewEntity2 == null) {
                Intrinsics.throwNpe();
            }
            if (urlPreviewEntity3 == null) {
                Intrinsics.throwNpe();
            }
            if (urlPreviewEntity2.compareTo(urlPreviewEntity3) >= 0) {
                Log.m165379d("ModelParserPreview", "preview entity from pb " + urlPreviewEntity2.toString());
                return urlPreviewEntity2;
            }
            Log.m165379d("ModelParserPreview", "preview entity from cache " + urlPreviewEntity3.toString());
            return urlPreviewEntity3;
        } else {
            Log.m165379d("ModelParserPreview", "preview entity from cache " + urlPreviewEntity3.toString());
            return urlPreviewEntity3;
        }
    }
}
