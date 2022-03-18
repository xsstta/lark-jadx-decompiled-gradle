package com.ss.android.lark.searchcommon.service.v2.passthrough;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.usearch.AppMeta;
import com.ss.android.lark.pb.usearch.DocMeta;
import com.ss.android.lark.pb.usearch.GroupChatMeta;
import com.ss.android.lark.pb.usearch.MessageMeta;
import com.ss.android.lark.pb.usearch.OncallMeta;
import com.ss.android.lark.pb.usearch.ResultMeta;
import com.ss.android.lark.pb.usearch.SearchEntityType;
import com.ss.android.lark.pb.usearch.SearchResult;
import com.ss.android.lark.pb.usearch.ThreadMeta;
import com.ss.android.lark.pb.usearch.UserMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.service.v2.TagInfo;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.AppMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.DocMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.GroupMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.MessageMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.OnCallMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.ThreadMetaParser;
import com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser.UserMetaParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/MetaParser;", "", "()V", "TAG", "", "TAG_PREFIX", "appMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/AppMetaParser;", "docMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/DocMetaParser;", "groupMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/GroupMetaParser;", "messageMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/MessageMetaParser;", "onCallMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/OnCallMetaParser;", "threadMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/ThreadMetaParser;", "userMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/UserMetaParser;", "parse", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/pb/usearch/SearchEntityType;", "result", "Lcom/ss/android/lark/pb/usearch/SearchResult;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a */
public final class MetaParser {

    /* renamed from: a */
    public static final MetaParser f133230a = new MetaParser();

    /* renamed from: b */
    private static final AppMetaParser f133231b = new AppMetaParser();

    /* renamed from: c */
    private static final UserMetaParser f133232c = new UserMetaParser();

    /* renamed from: d */
    private static final GroupMetaParser f133233d = new GroupMetaParser();

    /* renamed from: e */
    private static final DocMetaParser f133234e = new DocMetaParser();

    /* renamed from: f */
    private static final MessageMetaParser f133235f = new MessageMetaParser();

    /* renamed from: g */
    private static final ThreadMetaParser f133236g = new ThreadMetaParser();

    /* renamed from: h */
    private static final OnCallMetaParser f133237h = new OnCallMetaParser();

    private MetaParser() {
    }

    /* renamed from: a */
    public final SearchBaseInfo mo184340a(SearchEntityType searchEntityType, SearchResult searchResult) {
        SearchBaseInfo searchBaseInfo;
        String str;
        String str2;
        String str3;
        String str4;
        TagInfo b;
        String str5;
        TagInfo b2;
        AppMeta appMeta;
        ResultMeta resultMeta;
        UserMeta userMeta;
        ResultMeta resultMeta2;
        GroupChatMeta groupChatMeta;
        ResultMeta resultMeta3;
        DocMeta docMeta;
        ResultMeta resultMeta4;
        MessageMeta messageMeta;
        ResultMeta resultMeta5;
        ThreadMeta threadMeta;
        ResultMeta resultMeta6;
        OncallMeta oncallMeta;
        ResultMeta resultMeta7;
        Intrinsics.checkParameterIsNotNull(searchEntityType, ShareHitPoint.f121869d);
        String str6 = null;
        switch (C53922b.f133240a[searchEntityType.ordinal()]) {
            case 1:
                AppMetaParser aVar = f133231b;
                if (searchResult == null || (resultMeta = searchResult.mresult_meta) == null) {
                    appMeta = null;
                } else {
                    appMeta = resultMeta.mapp_meta;
                }
                searchBaseInfo = aVar.mo184341a(appMeta);
                break;
            case 2:
                UserMetaParser hVar = f133232c;
                if (searchResult == null || (resultMeta2 = searchResult.mresult_meta) == null) {
                    userMeta = null;
                } else {
                    userMeta = resultMeta2.muser_meta;
                }
                searchBaseInfo = hVar.mo184347a(userMeta);
                break;
            case 3:
                GroupMetaParser dVar = f133233d;
                if (searchResult == null || (resultMeta3 = searchResult.mresult_meta) == null) {
                    groupChatMeta = null;
                } else {
                    groupChatMeta = resultMeta3.mgroup_chat_meta;
                }
                searchBaseInfo = dVar.mo184343a(groupChatMeta);
                break;
            case 4:
                DocMetaParser cVar = f133234e;
                if (searchResult == null || (resultMeta4 = searchResult.mresult_meta) == null) {
                    docMeta = null;
                } else {
                    docMeta = resultMeta4.mdoc_meta;
                }
                searchBaseInfo = cVar.mo184342a(docMeta);
                break;
            case 5:
                MessageMetaParser eVar = f133235f;
                if (searchResult == null || (resultMeta5 = searchResult.mresult_meta) == null) {
                    messageMeta = null;
                } else {
                    messageMeta = resultMeta5.mmessage_meta;
                }
                searchBaseInfo = eVar.mo184344a(messageMeta);
                break;
            case 6:
                ThreadMetaParser gVar = f133236g;
                if (searchResult == null || (resultMeta6 = searchResult.mresult_meta) == null) {
                    threadMeta = null;
                } else {
                    threadMeta = resultMeta6.mthread_meta;
                }
                searchBaseInfo = gVar.mo184346a(threadMeta);
                break;
            case 7:
                OnCallMetaParser fVar = f133237h;
                if (searchResult == null || (resultMeta7 = searchResult.mresult_meta) == null) {
                    oncallMeta = null;
                } else {
                    oncallMeta = resultMeta7.moncall_meta;
                }
                searchBaseInfo = fVar.mo184345a(oncallMeta);
                break;
            default:
                searchBaseInfo = null;
                break;
        }
        if (searchBaseInfo == null) {
            return null;
        }
        if (searchResult != null) {
            str = searchResult.mid;
        } else {
            str = null;
        }
        searchBaseInfo.setId(str);
        if (searchResult != null) {
            str2 = searchResult.mavatar_key;
        } else {
            str2 = null;
        }
        searchBaseInfo.setAvatarKey(str2);
        if (searchResult != null) {
            str3 = searchResult.mtitle_highlighted;
        } else {
            str3 = null;
        }
        searchBaseInfo.setTitle(str3);
        if (searchResult != null) {
            str6 = searchResult.msummary_highlighted;
        }
        searchBaseInfo.setSubTitle(str6);
        if (!(searchResult == null || (str5 = searchResult.mtitle_highlighted) == null || (b2 = com.ss.android.lark.searchcommon.service.v2.MetaParser.f133213a.mo184339b(str5)) == null)) {
            searchBaseInfo.setTitle(com.ss.android.lark.searchcommon.service.v2.MetaParser.f133213a.mo184338a(b2.mo184354a()));
        }
        if (!(searchResult == null || (str4 = searchResult.msummary_highlighted) == null || (b = com.ss.android.lark.searchcommon.service.v2.MetaParser.f133213a.mo184339b(str4)) == null)) {
            searchBaseInfo.setSubTitle(com.ss.android.lark.searchcommon.service.v2.MetaParser.f133213a.mo184338a(b.mo184354a()));
        }
        return searchBaseInfo;
    }
}
