package com.ss.android.lark.todo.impl.features.detail.helper.richtext;

import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.bytedance.lark.pb.basic.v1.URL;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.Url;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007J.\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\nj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J:\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\nj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e`\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006H\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/helper/richtext/ParserUrlPreviewHelper;", "", "()V", "parsePreviewEntityPair", "Lcom/bytedance/lark/pb/basic/v1/PreviewEntityPair;", "map", "", "", "Lcom/ss/android/lark/chat/entity/preview/NetUrlPreviewEntity;", "parsePreviewEntityPairFromPb", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "previewEntityPair", "parseUrlPreviewHangPointFromPb", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "pbMap", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.a.d */
public final class ParserUrlPreviewHelper {

    /* renamed from: a */
    public static final ParserUrlPreviewHelper f139697a = new ParserUrlPreviewHelper();

    private ParserUrlPreviewHelper() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final HashMap<String, UrlPreviewHangPoint> m220167b(Map<String, UrlPreviewHangPoint> map) {
        HashMap<String, UrlPreviewHangPoint> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        hashMap.putAll(map);
        return hashMap;
    }

    @JvmStatic
    /* renamed from: a */
    public static final PreviewEntityPair m220165a(Map<String, NetUrlPreviewEntity> map) {
        String str;
        PreviewEntityPair.C15119a aVar = new PreviewEntityPair.C15119a();
        if (map == null) {
            PreviewEntityPair a = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            return a;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, NetUrlPreviewEntity> entry : map.entrySet()) {
            NetUrlPreviewEntity value = entry.getValue();
            if (value != null) {
                HashMap hashMap2 = hashMap;
                String key = entry.getKey();
                UrlPreviewEntity.C15428a b = new UrlPreviewEntity.C15428a().mo55949b(value.getPreviewId());
                URL.C15366a aVar2 = new URL.C15366a();
                Url url = value.getUrl();
                if (url != null) {
                    str = url.getUrl();
                } else {
                    str = null;
                }
                UrlPreviewEntity a2 = b.mo55945a(aVar2.mo55800a(str).build()).mo55950c(value.getNetIconKey()).mo55951d(value.getNetTitle()).mo55952e(value.getNetUrlTag()).mo55946a(Integer.valueOf(value.getVersion())).mo55947a(value.getSourceId()).build();
                Intrinsics.checkExpressionValueIsNotNull(a2, "UrlPreviewEntity.Builder…                 .build()");
                hashMap2.put(key, a2);
            }
        }
        PreviewEntityPair a3 = aVar.mo55135a(hashMap).build();
        Intrinsics.checkExpressionValueIsNotNull(a3, "builder.preview_entity(pbMap).build()");
        return a3;
    }

    @JvmStatic
    /* renamed from: a */
    public static final HashMap<String, NetUrlPreviewEntity> m220166a(PreviewEntityPair previewEntityPair) {
        HashMap<String, NetUrlPreviewEntity> hashMap = new HashMap<>();
        if (previewEntityPair == null) {
            return hashMap;
        }
        Map<String, UrlPreviewEntity> map = previewEntityPair.preview_entity;
        Intrinsics.checkExpressionValueIsNotNull(map, "pbMap");
        for (Map.Entry<String, UrlPreviewEntity> entry : map.entrySet()) {
            UrlPreviewEntity value = entry.getValue();
            if (value != null) {
                HashMap<String, NetUrlPreviewEntity> hashMap2 = hashMap;
                String key = entry.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "entry.key");
                String str = value.server_icon_key;
                String str2 = value.server_title;
                String str3 = value.server_tag;
                Integer num = value.version;
                Intrinsics.checkExpressionValueIsNotNull(num, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                int intValue = num.intValue();
                String str4 = value.source_id;
                Intrinsics.checkExpressionValueIsNotNull(str4, "source_id");
                String str5 = value.preview_id;
                Intrinsics.checkExpressionValueIsNotNull(str5, "preview_id");
                URL url = value.url;
                String str6 = url != null ? url.url : null;
                URL url2 = value.url;
                String str7 = url2 != null ? url2.ios : null;
                URL url3 = value.url;
                String str8 = url3 != null ? url3.f175430android : null;
                URL url4 = value.url;
                String str9 = url4 != null ? url4.pc : null;
                URL url5 = value.url;
                hashMap2.put(key, new NetUrlPreviewEntity(str, str2, str3, intValue, null, str4, str5, new Url(str6, str7, str8, str9, url5 != null ? url5.web : null), MapsKt.emptyMap()));
            }
        }
        return hashMap;
    }
}
