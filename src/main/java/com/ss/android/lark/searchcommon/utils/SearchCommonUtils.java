package com.ss.android.lark.searchcommon.utils;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TimeZone;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHistoryListInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchPlaceholderInfo;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007J \u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0007J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u000e\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0007J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0007J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0007J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0007J\u0016\u00109\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001`\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/SearchCommonUtils;", "", "()V", "MAX_LENGTH", "", "RECOMMEND_APP_CACHE_KEY", "", "RECOMMEND_CONTACT_CACHE_KEY", "RECOMMEND_DOC_CACHE_KEY", "RECOMMEND_GROUP_CACHE_KEY", "RECOMMEND_MESSAGE_CACHE_KEY", "RECOMMEND_ONCALL_CACHE_KEY", "TAG", "TOP_RESULT_RECOMMEND_LIST_CACHE_KEY", "searchCacheMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "clearCache", "", "cacheKey", "clearSearchHistoryCache", "desensitizationStr", "originStr", "generateStackTraceString", "getCountString", "count", "getFromCache", "key", "getResultTypeString", "resultType", "getSearchResultTime", "context", "Landroid/content/Context;", "timeSec", "", "is24HourTime", "", "getSearchSignature", SearchIntents.EXTRA_QUERY, "getUserCacheKey", "isDarkMode", "isPunctuation", "ch", "", "md5HexWithDesensitization", "searchKey", "parseFromChatEntity", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "parseFromChatterEntity", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "parseFromDepartmentId", "Lcom/ss/android/lark/searchcommon/dto/info/SearchDepartmentInfo;", "departmentId", "putToCache", "value", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.utils.b */
public final class SearchCommonUtils {

    /* renamed from: a */
    public static final SearchCommonUtils f133387a = new SearchCommonUtils();

    /* renamed from: b */
    private static final HashMap<String, Object> f133388b = new HashMap<>();

    @JvmStatic
    /* renamed from: a */
    public static final String m209226a(int i) {
        switch (i) {
            case 0:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 1:
                return "CHATTER";
            case 2:
                return "CHAT";
            case 3:
                return "MESSAGE";
            case 4:
                return "DOC_FEED";
            case 5:
                return "EMAIL";
            case 6:
                return "SPACE";
            case 7:
                return "EMAIL_MESSAGE";
            case 8:
                return "THREAD";
            case 9:
                return "BOX";
            case 10:
                return "HELPDESK";
            case 11:
                return "CRYPTO_P2P_CHAT";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "OPEN_APP";
            case 13:
                return "LINK";
            case 14:
                return "EXTERNAL";
            case 15:
                return "WIKI";
            case 16:
                return "MAIL_CONTACT";
            default:
                switch (i) {
                    case 10000001:
                        return "FILE";
                    case 10000002:
                        return "SHOW_MORE";
                    case SearchCommonConstants.SearchResultType.SPACE_HOLDER:
                        return "SPACE_HOLDER";
                    case 10000004:
                        return "CALENDAR_EVENT";
                    case 10000005:
                        return "NO_RESULT";
                    case 10000006:
                        return "QUICK_SEARCH_HEADER";
                    case 10000007:
                        return "QUICK_SEARCH_FEED_RECOMMEND";
                    case 10000008:
                        return "QUICK_SEARCH_URGENT_RECOMMEND";
                    case SearchCommonConstants.SearchResultType.THREAD_GROUP:
                        return "THREAD_GROUP";
                    default:
                        switch (i) {
                            case 100000010:
                                return "USER";
                            case 100000011:
                                return "THREAD_FROM_MESSAGE";
                            default:
                                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        }
                }
        }
    }

    /* renamed from: a */
    private final boolean m209229a(char c) {
        if (8216 <= c && 8223 >= c) {
            return true;
        }
        if (12289 <= c && 12291 >= c) {
            return true;
        }
        return (12317 <= c && 12319 >= c) || c == 65281 || c == 65282 || c == 65287 || c == 65292 || c == 65306 || c == 65307 || c == 65311 || c == 65377 || c == 65294 || c == 65381;
    }

    private SearchCommonUtils() {
    }

    /* renamed from: a */
    public final void mo184561a(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(obj, "value");
        String h = m209234h(str);
        if (!StringsKt.isBlank(h)) {
            HashMap<String, Object> hashMap = f133388b;
            hashMap.put(h, obj);
            if (hashMap.size() > 10) {
                hashMap.clear();
            }
        }
    }

    static {
        SearchCommonModuleDependency.m208732b().mo102895a(new SearchCommonModuleDependency.ISearchCommonModuleDependency.IOnLanguageChangeListener() {
            /* class com.ss.android.lark.searchcommon.utils.SearchCommonUtils.C539561 */

            @Override // com.ss.android.lark.searchcommon.SearchCommonModuleDependency.ISearchCommonModuleDependency.IOnLanguageChangeListener
            /* renamed from: a */
            public void mo183786a() {
                SearchCommonUtils.f133387a.mo184564e("");
            }
        });
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m209225a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "traceString.toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: c */
    public static final SearchDepartmentInfo m209232c(String str) {
        SearchDepartmentInfo searchDepartmentInfo = new SearchDepartmentInfo();
        searchDepartmentInfo.setId(str);
        searchDepartmentInfo.setType(17);
        return searchDepartmentInfo;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m209230b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo184562a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m209231b(String str) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        StringBuilder sb = new StringBuilder();
        sb.append("query: ");
        sb.append(m209228a(str));
        sb.append(", session: ");
        C53883a a = C53883a.m208794a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NetSearchSessionManager.getInstance()");
        sb.append(a.mo183799b());
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo184564e(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f133388b.clear();
        } else {
            mo184561a(str, new ArrayList());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final SearchChatInfo m209223a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        SearchChatInfo searchChatInfo = new SearchChatInfo();
        searchChatInfo.setId(chat.getId());
        searchChatInfo.setType(2);
        searchChatInfo.setAvatarKey(chat.getAvatarKey());
        searchChatInfo.setTitle(chat.getName());
        searchChatInfo.setSubTitle("");
        searchChatInfo.setChatType(chat.getType());
        searchChatInfo.setChatMode(chat.getChatMode());
        searchChatInfo.setCrossTenant(chat.isCrossTenant());
        searchChatInfo.setDelayed(chat.isDeleted());
        searchChatInfo.setDepartment(chat.is_department());
        searchChatInfo.setMemberCount(chat.getMemberCount());
        searchChatInfo.setUserCount(chat.getUserCount());
        searchChatInfo.setRemind(chat.isRemind());
        searchChatInfo.setSecretChat(chat.isSecret());
        searchChatInfo.setPublic(chat.isPublic());
        searchChatInfo.setOfficialOnCall(chat.isOfficialOncall());
        searchChatInfo.setIsMeeting(chat.isMeeting());
        return searchChatInfo;
    }

    /* renamed from: h */
    private final String m209234h(String str) {
        String j = SearchCommonModuleDependency.m208732b().mo102920j();
        if (j == null) {
            j = "";
        }
        String k = SearchCommonModuleDependency.m208732b().mo102921k();
        if (k == null) {
            k = "";
        }
        if (StringsKt.isBlank(j) || StringsKt.isBlank(k)) {
            return "";
        }
        return j + '_' + k + '_' + str;
    }

    /* renamed from: d */
    public final Object mo184563d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String h = m209234h(str);
        if (StringsKt.isBlank(h)) {
            return new Object();
        }
        Object obj = f133388b.get(h);
        List list = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            list = obj;
        }
        List<SearchBaseInfo> list2 = list;
        if (list2 == null) {
            return obj;
        }
        for (SearchBaseInfo searchBaseInfo : list2) {
            searchBaseInfo.resetDefaultValue();
        }
        return obj;
    }

    @JvmStatic
    /* renamed from: a */
    public static final SearchChatterInfo m209224a(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
        searchChatterInfo.setId(chatter.getId());
        searchChatterInfo.setType(1);
        searchChatterInfo.setAvatarKey(chatter.getAvatarKey());
        searchChatterInfo.setTitle(SearchCommonModuleDependency.m208732b().mo102886a(chatter));
        searchChatterInfo.setSubTitle("");
        searchChatterInfo.setChatterType(chatter.getType());
        searchChatterInfo.setChatterDescription(chatter.getDescription());
        searchChatterInfo.setRegistered(chatter.getRegistered());
        searchChatterInfo.setInContacts(chatter.isInContacts());
        searchChatterInfo.setCanJoinGroup(chatter.isCanJoinGroup());
        searchChatterInfo.setTenantId(chatter.getTenantId());
        searchChatterInfo.setWorkStatus(chatter.getWorkStatus());
        searchChatterInfo.setZenModeEndTime(chatter.getZenModeEndTime());
        TimeZone timeZone = chatter.getTimeZone();
        if (timeZone != null) {
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "this");
            timeZone.setTimeZoneId(timeZone.getTimeZoneId());
        }
        String j = SearchCommonModuleDependency.m208732b().mo102920j();
        searchChatterInfo.setCrossTenant(!Intrinsics.areEqual(j, chatter.getTenantId()));
        searchChatterInfo.customer(Intrinsics.areEqual("0", j));
        return searchChatterInfo;
    }

    /* renamed from: g */
    private final String m209233g(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                if ('0' <= charAt && '9' >= charAt) {
                    sb.append(0);
                } else if ('a' <= charAt && 'z' >= charAt) {
                    sb.append('a');
                } else if ('A' <= charAt && 'Z' >= charAt) {
                    sb.append('A');
                } else if (Character.isWhitespace(charAt) || Pattern.matches("\\p{Punct}", String.valueOf(charAt))) {
                    sb.append(charAt);
                } else {
                    sb.append('x');
                }
            } else if (19968 <= charAt && 40959 >= charAt) {
                sb.append('C');
            } else if (12352 <= charAt && 12543 >= charAt) {
                sb.append('J');
            } else if (44032 <= charAt && 55203 >= charAt) {
                sb.append('K');
            } else if (Character.isWhitespace(charAt) || m209229a(charAt)) {
                sb.append(charAt);
            } else {
                sb.append('X');
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "strBuilder.toString()");
        return sb2;
    }

    /* renamed from: f */
    public final void mo184565f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cacheKey");
        try {
            ArrayList arrayList = new ArrayList();
            Object obj = null;
            SearchPlaceholderInfo searchPlaceholderInfo = null;
            SearchPlaceholderInfo searchPlaceholderInfo2 = null;
            Object d = mo184563d(str);
            if (!(d instanceof List)) {
                d = null;
            }
            List list = (List) d;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SearchBaseInfo searchBaseInfo = (SearchBaseInfo) it.next();
                    if (searchBaseInfo instanceof SearchHistoryListInfo) {
                        int indexOf = arrayList.indexOf(searchBaseInfo);
                        SearchBaseInfo searchBaseInfo2 = (SearchBaseInfo) arrayList.get(indexOf - 1);
                        if ((searchBaseInfo2 instanceof SearchPlaceholderInfo) && ((SearchPlaceholderInfo) searchBaseInfo2).getPlaceholderType() == SearchPlaceholderInfo.Type.RECOMMEND_HISTORY_HEADER) {
                            searchPlaceholderInfo = (SearchPlaceholderInfo) searchBaseInfo2;
                        }
                        SearchBaseInfo searchBaseInfo3 = (SearchBaseInfo) arrayList.get(indexOf + 1);
                        if ((searchBaseInfo3 instanceof SearchPlaceholderInfo) && ((SearchPlaceholderInfo) searchBaseInfo3).getPlaceholderType() == SearchPlaceholderInfo.Type.CARD_FOOTER) {
                            searchPlaceholderInfo2 = (SearchPlaceholderInfo) searchBaseInfo3;
                        }
                    }
                }
            }
            Object d2 = mo184563d(str);
            if (d2 instanceof List) {
                obj = d2;
            }
            List<SearchBaseInfo> list2 = (List) obj;
            if (list2 != null) {
                for (SearchBaseInfo searchBaseInfo4 : list2) {
                    if (!(searchBaseInfo4 instanceof SearchHistoryListInfo) && (!Intrinsics.areEqual(searchBaseInfo4, searchPlaceholderInfo)) && (!Intrinsics.areEqual(searchBaseInfo4, searchPlaceholderInfo2))) {
                        arrayList.add(searchBaseInfo4);
                    }
                }
            }
            mo184561a(str, arrayList);
        } catch (Exception unused) {
            mo184564e(str);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m209228a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        String a = C26320t.m95318a(str);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        if (a.length() > 8) {
            Intrinsics.checkExpressionValueIsNotNull(a, "md5");
            if (a != null) {
                a = a.substring(0, 8);
                Intrinsics.checkExpressionValueIsNotNull(a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return a + "_" + f133387a.m209233g(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m209227a(Context context, long j, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191593a(LengthType.SHORT);
        aVar.mo191599b(!z);
        aVar.mo191594a(TimePreciseness.MINUTE);
        return TimeFormatUtils.m219292g(context, new Date(((long) 1000) * j), aVar);
    }
}
