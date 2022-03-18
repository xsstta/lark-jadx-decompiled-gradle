package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.bytedance.lark.pb.search.v2.SlashCommandMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/OpenSearchMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/SlashCommandMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.l */
public final class OpenSearchMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184331a(SlashCommandMeta slashCommandMeta) {
        SearchOpenSearchInfo searchOpenSearchInfo;
        if (slashCommandMeta != null) {
            searchOpenSearchInfo = new SearchOpenSearchInfo();
            searchOpenSearchInfo.setImageUrl(slashCommandMeta.image_url);
            searchOpenSearchInfo.setApp_link(slashCommandMeta.app_link);
            searchOpenSearchInfo.setExtraTitle(slashCommandMeta.description);
            searchOpenSearchInfo.setExtra(slashCommandMeta.extra);
            SlashCommandMeta.SlashCommandType slashCommandType = slashCommandMeta.slash_command_type;
            Intrinsics.checkExpressionValueIsNotNull(slashCommandType, "meta.slash_command_type");
            searchOpenSearchInfo.setSlash_command_type(SlashCommandMeta.SlashCommandType.fromValue(slashCommandType.getValue()));
            ArrayList arrayList = new ArrayList();
            List<SlashCommandMeta.SlashCommandTag> list = slashCommandMeta.tag;
            Intrinsics.checkExpressionValueIsNotNull(list, "meta.tag");
            for (T t : list) {
                new SlashCommandMeta.SlashCommandTag(t.type, t.text);
            }
            searchOpenSearchInfo.setTag(arrayList);
        } else {
            searchOpenSearchInfo = null;
        }
        return searchOpenSearchInfo;
    }
}
