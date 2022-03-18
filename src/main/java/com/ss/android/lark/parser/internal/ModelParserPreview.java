package com.ss.android.lark.parser.internal;

import com.bytedance.lark.pb.basic.v1.URL;
import com.bytedance.lark.pb.basic.v1.URLPreviewBody;
import com.bytedance.lark.pb.basic.v1.UrlPreviewAction;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.bytedance.lark.pb.url.v1.GetUrlPreviewResponse;
import com.bytedance.lark.pb.url.v1.UrlPreviewEntry;
import com.bytedance.lark.pb.url.v1.UrlPreviewSourceType;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.chat.entity.preview.Url;
import com.ss.android.lark.chat.entity.preview.UrlPreviewBody;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntry;
import com.ss.android.lark.chat.preview.parser.ModelParserUrlPreviewAction;
import com.ss.android.lark.chat.preview.parser.ModelParserUrlPreviewBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/parser/internal/ModelParserPreview;", "", "()V", "parseURLFromPb", "Lcom/ss/android/lark/chat/entity/preview/Url;", "pbURL", "Lcom/bytedance/lark/pb/basic/v1/URL;", "parseUrlPreviewEntityFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "pbUrlPreviewEntity", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "parseUrlPreviewEntryFromPb", "Lcom/ss/android/lark/chat/preview/entity/UrlPreViewEntries;", "getUrlPreviewResponse", "Lcom/bytedance/lark/pb/url/v1/GetUrlPreviewResponse;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.u.a.n */
public final class ModelParserPreview {

    /* renamed from: a */
    public static final ModelParserPreview f141184a = new ModelParserPreview();

    private ModelParserPreview() {
    }

    /* renamed from: a */
    private final Url m222174a(URL url) {
        if (url == null) {
            return null;
        }
        return new Url(url.url, url.ios, url.f175430android, url.pc, url.web);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UrlPreViewEntries m222176a(GetUrlPreviewResponse getUrlPreviewResponse) {
        Intrinsics.checkParameterIsNotNull(getUrlPreviewResponse, "getUrlPreviewResponse");
        ArrayList arrayList = new ArrayList(getUrlPreviewResponse.preview_entries.size());
        List<UrlPreviewEntry> list = getUrlPreviewResponse.preview_entries;
        Intrinsics.checkExpressionValueIsNotNull(list, "getUrlPreviewResponse.preview_entries");
        for (T t : list) {
            UrlPreviewEntity urlPreviewEntity = t.preview_entity;
            if (urlPreviewEntity != null) {
                Integer num = t.offset;
                Intrinsics.checkExpressionValueIsNotNull(num, "urlPreviewEntry.offset");
                int intValue = num.intValue();
                Integer num2 = t.length;
                Intrinsics.checkExpressionValueIsNotNull(num2, "urlPreviewEntry.length");
                int intValue2 = num2.intValue();
                String str = t.preview_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "urlPreviewEntry.preview_id");
                Intrinsics.checkExpressionValueIsNotNull(urlPreviewEntity, "previewEntity");
                arrayList.add(new UrlPreViewEntry(intValue, intValue2, str, m222175a(urlPreviewEntity)));
            }
        }
        String str2 = getUrlPreviewResponse.source_id;
        String str3 = getUrlPreviewResponse.source_text_md5;
        Intrinsics.checkExpressionValueIsNotNull(str3, "getUrlPreviewResponse.source_text_md5");
        UrlPreViewEntries.UrlPreViewSourceType.Companion aVar = UrlPreViewEntries.UrlPreViewSourceType.Companion;
        UrlPreviewSourceType urlPreviewSourceType = getUrlPreviewResponse.source_type;
        Intrinsics.checkExpressionValueIsNotNull(urlPreviewSourceType, "getUrlPreviewResponse.source_type");
        return new UrlPreViewEntries(str2, str3, aVar.mo126374a(urlPreviewSourceType.getValue()), arrayList);
    }

    @JvmStatic
    /* renamed from: a */
    public static final com.ss.android.lark.chat.entity.preview.UrlPreviewEntity m222175a(UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(urlPreviewEntity, "pbUrlPreviewEntity");
        Boolean bool = urlPreviewEntity.is_sdk_preview;
        Intrinsics.checkExpressionValueIsNotNull(bool, "pbUrlPreviewEntity.is_sdk_preview");
        Map<String, UrlPreviewAction> map = null;
        if (bool.booleanValue()) {
            String str = urlPreviewEntity.sdk_title;
            Integer num = urlPreviewEntity.version;
            Intrinsics.checkExpressionValueIsNotNull(num, "pbUrlPreviewEntity.version");
            int intValue = num.intValue();
            UrlPreviewBody a = ModelParserUrlPreviewBody.m132273a(urlPreviewEntity);
            String str2 = urlPreviewEntity.source_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "pbUrlPreviewEntity.source_id");
            String str3 = urlPreviewEntity.preview_id;
            Intrinsics.checkExpressionValueIsNotNull(str3, "pbUrlPreviewEntity.preview_id");
            return new NetUrlPreviewEntity(null, str, null, intValue, a, str2, str3, f141184a.m222174a(urlPreviewEntity.url), ModelParserUrlPreviewAction.m132271a((Map<String, UrlPreviewAction>) null));
        }
        String str4 = urlPreviewEntity.server_icon_key;
        String str5 = urlPreviewEntity.server_title;
        String str6 = urlPreviewEntity.server_tag;
        Integer num2 = urlPreviewEntity.version;
        Intrinsics.checkExpressionValueIsNotNull(num2, "pbUrlPreviewEntity.version");
        int intValue2 = num2.intValue();
        UrlPreviewBody a2 = ModelParserUrlPreviewBody.m132272a(urlPreviewEntity.preview_body);
        String str7 = urlPreviewEntity.source_id;
        Intrinsics.checkExpressionValueIsNotNull(str7, "pbUrlPreviewEntity.source_id");
        String str8 = urlPreviewEntity.preview_id;
        Intrinsics.checkExpressionValueIsNotNull(str8, "pbUrlPreviewEntity.preview_id");
        Url a3 = f141184a.m222174a(urlPreviewEntity.url);
        URLPreviewBody uRLPreviewBody = urlPreviewEntity.preview_body;
        if (uRLPreviewBody != null) {
            map = uRLPreviewBody.actions;
        }
        return new NetUrlPreviewEntity(str4, str5, str6, intValue2, a2, str7, str8, a3, ModelParserUrlPreviewAction.m132271a(map));
    }
}
