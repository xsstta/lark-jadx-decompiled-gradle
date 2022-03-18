package com.ss.android.lark.searchcommon.service.v2;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.bytedance.lark.pb.search.v2.SearchEntityType;
import com.bytedance.lark.pb.search.v2.SearchResult;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.service.v2.metaparser.AppMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.BotMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.ChatMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.CryptoP2pChatMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.CustomizationMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.DepartmentMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.DocMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.MailContactMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.MessageMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.OnCallMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.OpenSearchMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.QaCardMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.ThreadMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.URLMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.UserMetaParser;
import com.ss.android.lark.searchcommon.service.v2.metaparser.WikiMetaParser;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\n\u00103\u001a\u00020\u0004*\u00020\u0004J\n\u00104\u001a\u000205*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/MetaParser;", "", "()V", "END_TAG", "", "MAX_LEN", "", "START_END_TAG", "START_TAG", "TAG", "TAG_WRAPPER_END", "TAG_WRAPPER_START", "WRAPPER_TAG", "appMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/AppMetaParser;", "botMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/BotMetaParser;", "chatMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/ChatMetaParser;", "cryptoP2pChatMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/CryptoP2pChatMetaParser;", "customizationMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/CustomizationMetaParser;", "departmentMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/DepartmentMetaParser;", "docMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/DocMetaParser;", "mailContactMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/MailContactMetaParser;", "messageMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/MessageMetaParser;", "onCallMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/OnCallMetaParser;", "openSearchMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/OpenSearchMetaParser;", "qaCardMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/QaCardMetaParser;", "threadMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/ThreadMetaParser;", "urlMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/URLMetaParser;", "userMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/UserMetaParser;", "wikiMetaParser", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/WikiMetaParser;", "parse", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/search/v2/SearchEntityType;", "result", "Lcom/bytedance/lark/pb/search/v2/SearchResult;", "eraseInvisibleChar", "parseTagInfo", "Lcom/ss/android/lark/searchcommon/service/v2/TagInfo;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b */
public final class MetaParser {

    /* renamed from: a */
    public static final MetaParser f133213a = new MetaParser();

    /* renamed from: b */
    private static final UserMetaParser f133214b = new UserMetaParser();

    /* renamed from: c */
    private static final ChatMetaParser f133215c = new ChatMetaParser();

    /* renamed from: d */
    private static final DepartmentMetaParser f133216d = new DepartmentMetaParser();

    /* renamed from: e */
    private static final MessageMetaParser f133217e = new MessageMetaParser();

    /* renamed from: f */
    private static final AppMetaParser f133218f = new AppMetaParser();

    /* renamed from: g */
    private static final OnCallMetaParser f133219g = new OnCallMetaParser();

    /* renamed from: h */
    private static final ThreadMetaParser f133220h = new ThreadMetaParser();

    /* renamed from: i */
    private static final QaCardMetaParser f133221i = new QaCardMetaParser();

    /* renamed from: j */
    private static final DocMetaParser f133222j = new DocMetaParser();

    /* renamed from: k */
    private static final WikiMetaParser f133223k = new WikiMetaParser();

    /* renamed from: l */
    private static final CryptoP2pChatMetaParser f133224l = new CryptoP2pChatMetaParser();

    /* renamed from: m */
    private static final BotMetaParser f133225m = new BotMetaParser();

    /* renamed from: n */
    private static final URLMetaParser f133226n = new URLMetaParser();

    /* renamed from: o */
    private static final OpenSearchMetaParser f133227o = new OpenSearchMetaParser();

    /* renamed from: p */
    private static final CustomizationMetaParser f133228p = new CustomizationMetaParser();

    /* renamed from: q */
    private static final MailContactMetaParser f133229q = new MailContactMetaParser();

    private MetaParser() {
    }

    /* renamed from: a */
    public final String mo184338a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$eraseInvisibleChar");
        if (SearchCommonModuleDependency.m208732b().mo102918h()) {
            return str;
        }
        return new Regex("\\p{C}").replace(str, "");
    }

    /* renamed from: b */
    public final TagInfo mo184339b(String str) {
        String str2;
        Exception e;
        String str3 = "";
        Intrinsics.checkParameterIsNotNull(str, "$this$parseTagInfo");
        ArrayList arrayList = new ArrayList();
        try {
            String str4 = "<wrapper>" + str + "</wrapper>";
            if (str.length() > 500) {
                StringBuilder sb = new StringBuilder();
                sb.append("<wrapper>");
                String substring = str.substring(0, ParticipantRepo.f117150c);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("</wrapper>");
                str4 = sb.toString();
            }
            Log.m165379d("LarkSearch.Common.V2.MetaParser", "origin: " + str4);
            int i = -1;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str4));
            Intrinsics.checkExpressionValueIsNotNull(newPullParser, "xpp");
            str2 = str3;
            String str5 = str2;
            String str6 = str5;
            boolean z = false;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 0) {
                    Log.m165379d("LarkSearch.Common.V2.MetaParser", "Start document");
                } else if (eventType == 2) {
                    Log.m165379d("LarkSearch.Common.V2.MetaParser", "Start tag " + newPullParser.getName());
                    String name = newPullParser.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, "xpp.name");
                    if (!C53924d.m209009a(name)) {
                        continue;
                    } else if (!z) {
                        i = str2.length();
                        Log.m165379d("LarkSearch.Common.V2.MetaParser", "start index: " + i);
                        str5 = newPullParser.getName();
                        Intrinsics.checkExpressionValueIsNotNull(str5, "xpp.name");
                        linkedHashMap.clear();
                        linkedHashMap.putAll(C53924d.m209008a(newPullParser));
                        z = true;
                    } else {
                        throw new RuntimeException(newPullParser.getName() + ", start status err!");
                    }
                } else if (eventType == 3) {
                    Log.m165379d("LarkSearch.Common.V2.MetaParser", "End tag " + newPullParser.getName());
                    String name2 = newPullParser.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name2, "xpp.name");
                    if (!C53924d.m209009a(name2)) {
                        continue;
                    } else if (z) {
                        if (Intrinsics.areEqual(str5, newPullParser.getName())) {
                            String name3 = newPullParser.getName();
                            Intrinsics.checkExpressionValueIsNotNull(name3, "xpp.name");
                            arrayList.add(new TagContent(name3, new Content(str6, i), MapsKt.toMutableMap(linkedHashMap)));
                            str6 = str3;
                        }
                        z = false;
                    } else {
                        throw new RuntimeException(newPullParser.getName() + ", start status err when end!");
                    }
                } else if (eventType == 4) {
                    try {
                        Log.m165379d("LarkSearch.Common.V2.MetaParser", "Text " + newPullParser.getText());
                        str2 = str2 + newPullParser.getText();
                        if (z) {
                            str6 = newPullParser.getText();
                            Intrinsics.checkExpressionValueIsNotNull(str6, "xpp.text");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str3 = str2;
                        Log.m165383e("LarkSearch.Common.V2.MetaParser", "parse err, " + e.getMessage());
                        str2 = str3;
                        Log.m165379d("LarkSearch.Common.V2.MetaParser", "End document");
                        Log.m165379d("LarkSearch.Common.V2.MetaParser", "contentWithoutTag: " + str2);
                        Log.m165379d("LarkSearch.Common.V2.MetaParser", "tagContentList: " + arrayList);
                        return new TagInfo(str2, arrayList);
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            Log.m165383e("LarkSearch.Common.V2.MetaParser", "parse err, " + e.getMessage());
            str2 = str3;
            Log.m165379d("LarkSearch.Common.V2.MetaParser", "End document");
            Log.m165379d("LarkSearch.Common.V2.MetaParser", "contentWithoutTag: " + str2);
            Log.m165379d("LarkSearch.Common.V2.MetaParser", "tagContentList: " + arrayList);
            return new TagInfo(str2, arrayList);
        }
        Log.m165379d("LarkSearch.Common.V2.MetaParser", "End document");
        Log.m165379d("LarkSearch.Common.V2.MetaParser", "contentWithoutTag: " + str2);
        Log.m165379d("LarkSearch.Common.V2.MetaParser", "tagContentList: " + arrayList);
        return new TagInfo(str2, arrayList);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final SearchBaseInfo mo184337a(SearchEntityType searchEntityType, SearchResult searchResult) {
        SearchBaseInfo searchBaseInfo;
        int i;
        int i2;
        Integer intOrNull;
        Intrinsics.checkParameterIsNotNull(searchEntityType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(searchResult, "result");
        switch (C53923c.f133241a[searchEntityType.ordinal()]) {
            case 1:
                UserMetaParser pVar = f133214b;
                SearchResult.ResultMeta resultMeta = searchResult.result_meta;
                searchBaseInfo = pVar.mo184335a(resultMeta != null ? resultMeta.user_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(1);
                    Unit unit = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 2:
                ChatMetaParser dVar = f133215c;
                SearchResult.ResultMeta resultMeta2 = searchResult.result_meta;
                searchBaseInfo = dVar.mo184323a(resultMeta2 != null ? resultMeta2.group_chat_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(2);
                    Unit unit2 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 3:
                DepartmentMetaParser gVar = f133216d;
                SearchResult.ResultMeta resultMeta3 = searchResult.result_meta;
                searchBaseInfo = gVar.mo184326a(resultMeta3 != null ? resultMeta3.department_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(17);
                    Unit unit3 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 4:
                MessageMetaParser jVar = f133217e;
                SearchResult.ResultMeta resultMeta4 = searchResult.result_meta;
                SearchBaseInfo a = jVar.mo184329a(resultMeta4 != null ? resultMeta4.message_meta : null);
                if (a != null) {
                    a.setType(3);
                    if (a instanceof SearchMessageInfo) {
                        MetaParser bVar = f133213a;
                        String str = searchResult.title_highlighted;
                        Intrinsics.checkExpressionValueIsNotNull(str, "result.title_highlighted");
                        SearchMessageInfo searchMessageInfo = (SearchMessageInfo) a;
                        searchMessageInfo.setFromName(bVar.mo184339b(str).mo184354a());
                        Unit unit4 = Unit.INSTANCE;
                        searchMessageInfo.setFromAvatarKey(searchResult.avatar_key);
                        String str2 = searchResult.summary_highlighted;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "result.summary_highlighted");
                        List<TagContent> b = bVar.mo184339b(str2).mo184355b();
                        if (!b.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList<TagContent> arrayList2 = new ArrayList();
                            for (T t : b) {
                                if (Intrinsics.areEqual(t.mo184348a(), "di")) {
                                    arrayList2.add(t);
                                }
                            }
                            for (TagContent eVar : arrayList2) {
                                String str3 = eVar.mo184350c().get(ShareHitPoint.f121869d);
                                if (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) {
                                    i2 = 0;
                                } else {
                                    i2 = intOrNull.intValue();
                                }
                                String str4 = eVar.mo184350c().get("color");
                                if (str4 == null) {
                                    str4 = "grey";
                                }
                                arrayList.add(new SearchMessageInfo.C53895a(i2, str4, eVar.mo184349b().mo184317b()));
                            }
                            if (!arrayList.isEmpty()) {
                                searchMessageInfo.setTypeInfoList(arrayList);
                            }
                        }
                        Unit unit5 = Unit.INSTANCE;
                        Unit unit6 = Unit.INSTANCE;
                    }
                    Unit unit7 = Unit.INSTANCE;
                    searchBaseInfo = a;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 5:
                AppMetaParser aVar = f133218f;
                SearchResult.ResultMeta resultMeta5 = searchResult.result_meta;
                searchBaseInfo = aVar.mo184321a(resultMeta5 != null ? resultMeta5.app_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(12);
                    Unit unit8 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 6:
                OnCallMetaParser kVar = f133219g;
                SearchResult.ResultMeta resultMeta6 = searchResult.result_meta;
                searchBaseInfo = kVar.mo184330a(resultMeta6 != null ? resultMeta6.oncall_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(10);
                    Unit unit9 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 7:
                ThreadMetaParser nVar = f133220h;
                SearchResult.ResultMeta resultMeta7 = searchResult.result_meta;
                searchBaseInfo = nVar.mo184333a(resultMeta7 != null ? resultMeta7.thread_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(8);
                    Unit unit10 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 8:
                QaCardMetaParser mVar = f133221i;
                SearchResult.ResultMeta resultMeta8 = searchResult.result_meta;
                searchBaseInfo = mVar.mo184332a(resultMeta8 != null ? resultMeta8.qa_card_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(100000015);
                    Unit unit11 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 9:
                DocMetaParser hVar = f133222j;
                SearchResult.ResultMeta resultMeta9 = searchResult.result_meta;
                searchBaseInfo = hVar.mo184327a(resultMeta9 != null ? resultMeta9.doc_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(6);
                    Unit unit12 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 10:
                WikiMetaParser qVar = f133223k;
                SearchResult.ResultMeta resultMeta10 = searchResult.result_meta;
                searchBaseInfo = qVar.mo184336a(resultMeta10 != null ? resultMeta10.wiki_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(15);
                    Unit unit13 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 11:
                CryptoP2pChatMetaParser eVar2 = f133224l;
                SearchResult.ResultMeta resultMeta11 = searchResult.result_meta;
                searchBaseInfo = eVar2.mo184324a(resultMeta11 != null ? resultMeta11.crypto_p2p_chat_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(11);
                    Unit unit14 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                BotMetaParser cVar = f133225m;
                SearchResult.ResultMeta resultMeta12 = searchResult.result_meta;
                searchBaseInfo = cVar.mo184322a(resultMeta12 != null ? resultMeta12.bot_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(1);
                    Unit unit15 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 13:
                URLMetaParser oVar = f133226n;
                SearchResult.ResultMeta resultMeta13 = searchResult.result_meta;
                searchBaseInfo = oVar.mo184334a(resultMeta13 != null ? resultMeta13.url_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(13);
                    Unit unit16 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 14:
                OpenSearchMetaParser lVar = f133227o;
                SearchResult.ResultMeta resultMeta14 = searchResult.result_meta;
                searchBaseInfo = lVar.mo184331a(resultMeta14 != null ? resultMeta14.slash_command_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(21);
                    Unit unit17 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 15:
                CustomizationMetaParser fVar = f133228p;
                SearchResult.ResultMeta resultMeta15 = searchResult.result_meta;
                searchBaseInfo = fVar.mo184325a(resultMeta15 != null ? resultMeta15.customization_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(100000016);
                    Unit unit18 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            case 16:
                MailContactMetaParser iVar = f133229q;
                SearchResult.ResultMeta resultMeta16 = searchResult.result_meta;
                searchBaseInfo = iVar.mo184328a(resultMeta16 != null ? resultMeta16.mail_contact_meta : null);
                if (searchBaseInfo != null) {
                    searchBaseInfo.setType(16);
                    Unit unit19 = Unit.INSTANCE;
                    break;
                }
                searchBaseInfo = null;
                break;
            default:
                searchBaseInfo = null;
                break;
        }
        if (searchBaseInfo == null) {
            return null;
        }
        searchBaseInfo.setId(searchResult.id);
        searchBaseInfo.setAvatarKey(searchResult.avatar_key);
        MetaParser bVar2 = f133213a;
        String str5 = searchResult.title_highlighted;
        Intrinsics.checkExpressionValueIsNotNull(str5, "result.title_highlighted");
        TagInfo b2 = bVar2.mo184339b(str5);
        searchBaseInfo.setTitle(bVar2.mo184338a(b2.mo184354a()));
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : b2.mo184355b()) {
            if (Intrinsics.areEqual(t2.mo184348a(), C14002h.f36692e)) {
                arrayList3.add(t2);
            }
        }
        ArrayList<TagContent> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (TagContent eVar3 : arrayList4) {
            arrayList5.add(eVar3.mo184349b().mo184316a());
        }
        searchBaseInfo.setTitleHitTerms(arrayList5);
        Unit unit20 = Unit.INSTANCE;
        MetaParser bVar3 = f133213a;
        String str6 = searchResult.summary_highlighted;
        Intrinsics.checkExpressionValueIsNotNull(str6, "result.summary_highlighted");
        TagInfo b3 = bVar3.mo184339b(str6);
        searchBaseInfo.setSubTitle(bVar3.mo184338a(b3.mo184354a()));
        ArrayList arrayList6 = new ArrayList();
        for (T t3 : b3.mo184355b()) {
            if (Intrinsics.areEqual(t3.mo184348a(), C14002h.f36692e)) {
                arrayList6.add(t3);
            }
        }
        ArrayList<TagContent> arrayList7 = arrayList6;
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        for (TagContent eVar4 : arrayList7) {
            arrayList8.add(eVar4.mo184349b().mo184316a());
        }
        searchBaseInfo.setSubTitleHitTerms(arrayList8);
        ArrayList arrayList9 = new ArrayList();
        for (T t4 : b3.mo184355b()) {
            if (Intrinsics.areEqual(t4.mo184348a(), "asl-style")) {
                arrayList9.add(t4);
            }
        }
        ArrayList<TagContent> arrayList10 = arrayList9;
        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList10, 10));
        for (TagContent eVar5 : arrayList10) {
            String a2 = eVar5.mo184349b().mo184316a();
            int b4 = eVar5.mo184349b().mo184317b();
            Integer num = C53924d.m209007a().get(eVar5.mo184350c().get("color"));
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.color.text_disable;
            }
            arrayList11.add(new SearchBaseInfo.C53894a(a2, b4, i));
        }
        searchBaseInfo.setSubTitleRenderInfo(arrayList11);
        Unit unit21 = Unit.INSTANCE;
        MetaParser bVar4 = f133213a;
        String str7 = searchResult.extras_highlighted;
        Intrinsics.checkExpressionValueIsNotNull(str7, "result.extras_highlighted");
        TagInfo b5 = bVar4.mo184339b(str7);
        searchBaseInfo.setExtraTitle(bVar4.mo184338a(b5.mo184354a()));
        ArrayList arrayList12 = new ArrayList();
        for (T t5 : b5.mo184355b()) {
            if (Intrinsics.areEqual(t5.mo184348a(), C14002h.f36692e)) {
                arrayList12.add(t5);
            }
        }
        ArrayList<TagContent> arrayList13 = arrayList12;
        ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList13, 10));
        for (TagContent eVar6 : arrayList13) {
            arrayList14.add(eVar6.mo184349b().mo184316a());
        }
        searchBaseInfo.setExtraTitleHitTerms(arrayList14);
        Unit unit22 = Unit.INSTANCE;
        searchBaseInfo.setExplanationTags(searchResult.explanation_tags);
        Unit unit23 = Unit.INSTANCE;
        return searchBaseInfo;
    }
}
