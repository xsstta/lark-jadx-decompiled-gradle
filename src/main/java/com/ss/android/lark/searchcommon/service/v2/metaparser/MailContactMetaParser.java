package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.search.v2.MailContactMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/MailContactMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/MailContactMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.i */
public final class MailContactMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184328a(MailContactMeta mailContactMeta) {
        SearchMailContactInfo searchMailContactInfo;
        if (mailContactMeta != null) {
            String str = mailContactMeta.id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
            String str2 = mailContactMeta.email;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.email");
            MailContactMeta.ContactType contactType = mailContactMeta.type;
            Intrinsics.checkExpressionValueIsNotNull(contactType, "it.type");
            searchMailContactInfo = new SearchMailContactInfo(str, str2, contactType);
        } else {
            searchMailContactInfo = null;
        }
        return searchMailContactInfo;
    }
}
