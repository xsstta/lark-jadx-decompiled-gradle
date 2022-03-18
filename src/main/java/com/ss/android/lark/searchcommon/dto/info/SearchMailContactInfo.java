package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.search.v2.MailContactMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/searchcommon/dto/info/SearchMailContactInfo;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "mailId", "", "email", "contactType", "Lcom/bytedance/lark/pb/search/v2/MailContactMeta$ContactType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/search/v2/MailContactMeta$ContactType;)V", "getContactType", "()Lcom/bytedance/lark/pb/search/v2/MailContactMeta$ContactType;", "getEmail", "()Ljava/lang/String;", "getMailId", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchMailContactInfo extends SearchBaseInfo {
    private final MailContactMeta.ContactType contactType;
    private final String email;
    private final String mailId;

    public final MailContactMeta.ContactType getContactType() {
        return this.contactType;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMailId() {
        return this.mailId;
    }

    public SearchMailContactInfo(String str, String str2, MailContactMeta.ContactType contactType2) {
        Intrinsics.checkParameterIsNotNull(str, "mailId");
        Intrinsics.checkParameterIsNotNull(str2, "email");
        Intrinsics.checkParameterIsNotNull(contactType2, "contactType");
        this.mailId = str;
        this.email = str2;
        this.contactType = contactType2;
        this.type = 16;
    }
}
