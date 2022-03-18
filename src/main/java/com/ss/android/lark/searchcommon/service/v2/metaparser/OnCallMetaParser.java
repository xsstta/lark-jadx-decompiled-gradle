package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Tag;
import com.bytedance.lark.pb.search.v2.OncallMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/OnCallMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/OncallMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.k */
public final class OnCallMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184330a(OncallMeta oncallMeta) {
        SearchHelpDeskInfo searchHelpDeskInfo;
        if (oncallMeta != null) {
            searchHelpDeskInfo = new SearchHelpDeskInfo();
            searchHelpDeskInfo.setTags(new ArrayList());
            List<Tag> tags = searchHelpDeskInfo.getTags();
            if (tags != null) {
                List<Integer> list = oncallMeta.tags;
                Intrinsics.checkExpressionValueIsNotNull(list, "it.tags");
                for (T t : list) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    tags.add(Tag.fromValue(t.intValue()));
                }
            }
            searchHelpDeskInfo.setFaqId(oncallMeta.faq_identity);
            searchHelpDeskInfo.setFaqTitle(oncallMeta.faq_title);
        } else {
            searchHelpDeskInfo = null;
        }
        return searchHelpDeskInfo;
    }
}
