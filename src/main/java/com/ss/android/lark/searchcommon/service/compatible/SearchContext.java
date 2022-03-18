package com.ss.android.lark.searchcommon.service.compatible;

import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 ©\u00012\u00020\u0001:\u0006©\u0001ª\u0001«\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR*\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001a\u0010,\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001a\u00102\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%R\u001c\u00105\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\"\u0010@\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u000fR \u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR \u0010F\u001a\b\u0012\u0004\u0012\u00020G0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u000fR \u0010J\u001a\b\u0012\u0004\u0012\u00020K0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\r\"\u0004\bM\u0010\u000fR\"\u0010N\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\r\"\u0004\bP\u0010\u000fR\u001a\u0010Q\u001a\u00020RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010#\"\u0004\bY\u0010%R\"\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\r\"\u0004\b\\\u0010\u000fR\"\u0010]\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\r\"\u0004\b`\u0010\u000fR\u001c\u0010a\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u001a\u0010d\u001a\u00020RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010T\"\u0004\bf\u0010VR\u001a\u0010g\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010#\"\u0004\bi\u0010%R\u001a\u0010j\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010#\"\u0004\bl\u0010%R\u001a\u0010m\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010#\"\u0004\bo\u0010%R\u001a\u0010p\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010#\"\u0004\br\u0010%R\u001a\u0010s\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010#\"\u0004\bu\u0010%R\u001a\u0010v\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010#\"\u0004\bx\u0010%R\u001a\u0010y\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010#\"\u0004\b{\u0010%R\u001a\u0010|\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010#\"\u0004\b~\u0010%R\u001c\u0010\u001a\u00020!X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010#\"\u0005\b\u0001\u0010%R\u001d\u0010\u0001\u001a\u00020!X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010#\"\u0005\b\u0001\u0010%R \u0010\u0001\u001a\u00030\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R\u001d\u0010\u0001\u001a\u00020!X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010#\"\u0005\b\u0001\u0010%R\u001d\u0010\u0001\u001a\u00020\u000bX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00107\"\u0005\b\u0001\u00109R \u0010\u0001\u001a\u00030\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020!X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010#\"\u0005\b\u0001\u0010%R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R-\u0010 \u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010\u001d\"\u0005\b¢\u0001\u0010\u001fR\u001d\u0010£\u0001\u001a\u00020!X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010#\"\u0005\b¥\u0001\u0010%R\u001f\u0010¦\u0001\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u00107\"\u0005\b¨\u0001\u00109¨\u0006¬\u0001"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "", "()V", "docCategory", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "getDocCategory", "()Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "setDocCategory", "(Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;)V", "docChats", "", "", "getDocChats", "()Ljava/util/List;", "setDocChats", "(Ljava/util/List;)V", "docSearchContentType", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "getDocSearchContentType", "()Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "setDocSearchContentType", "(Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;)V", "docSharers", "getDocSharers", "setDocSharers", "docTimePair", "Landroid/util/Pair;", "Ljava/util/Date;", "getDocTimePair", "()Landroid/util/Pair;", "setDocTimePair", "(Landroid/util/Pair;)V", "excludeResignedUser", "", "getExcludeResignedUser", "()Z", "setExcludeResignedUser", "(Z)V", "excludeWithoutChatUser", "getExcludeWithoutChatUser", "setExcludeWithoutChatUser", "includeThread", "getIncludeThread", "setIncludeThread", "mAddChatterFromChat", "getMAddChatterFromChat", "setMAddChatterFromChat", "mAddChatterFromDepartment", "getMAddChatterFromDepartment", "setMAddChatterFromDepartment", "mAddChatterFromDepartmentSearchableWhenVisible", "getMAddChatterFromDepartmentSearchableWhenVisible", "setMAddChatterFromDepartmentSearchableWhenVisible", "mAppId", "getMAppId", "()Ljava/lang/String;", "setMAppId", "(Ljava/lang/String;)V", "mChatId", "getMChatId", "setMChatId", "mChatIds", "getMChatIds", "setMChatIds", "mChatList", "getMChatList", "setMChatList", "mChatMemberList", "getMChatMemberList", "setMChatMemberList", "mChatModeList", "Lcom/bytedance/lark/pb/search/v1/ChatFilterParam$ChatMode;", "getMChatModeList", "setMChatModeList", "mChatTypeList", "Lcom/ss/android/lark/searchcommon/service/entity/ChatType;", "getMChatTypeList", "setMChatTypeList", "mChatterList", "getMChatterList", "setMChatterList", "mCount", "", "getMCount", "()I", "setMCount", "(I)V", "mDisableSearchChatter", "getMDisableSearchChatter", "setMDisableSearchChatter", "mDocOwners", "getMDocOwners", "setMDocOwners", "mDocTypes", "Lcom/bytedance/lark/pb/basic/v1/Doc$Type;", "getMDocTypes", "setMDocTypes", "mExtra", "getMExtra", "setMExtra", "mFromTab", "getMFromTab", "setMFromTab", "mHideBot", "getMHideBot", "setMHideBot", "mIncludeBotInApp", "getMIncludeBotInApp", "setMIncludeBotInApp", "mIncludeBotInChatter", "getMIncludeBotInChatter", "setMIncludeBotInChatter", "mIncludeMailContact", "getMIncludeMailContact", "setMIncludeMailContact", "mIncludeSecretP2pChat", "getMIncludeSecretP2pChat", "setMIncludeSecretP2pChat", "mIsCheckCrossTenantAdminPermission", "getMIsCheckCrossTenantAdminPermission", "setMIsCheckCrossTenantAdminPermission", "mIsCheckOUPermission", "getMIsCheckOUPermission", "setMIsCheckOUPermission", "mIsCheckPermission", "getMIsCheckPermission", "setMIsCheckPermission", "mIsCheckSecretPermission", "getMIsCheckSecretPermission", "setMIsCheckSecretPermission", "mIsNeedSearchOuterUser", "getMIsNeedSearchOuterUser", "setMIsNeedSearchOuterUser", "mLastCreateTime", "", "getMLastCreateTime", "()J", "setMLastCreateTime", "(J)V", "mLastMsgId", "getMLastMsgId", "setMLastMsgId", "mNotSearchResignedUser", "getMNotSearchResignedUser", "setMNotSearchResignedUser", "mQueryKey", "getMQueryKey", "setMQueryKey", "mSceneType", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "getMSceneType", "()Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "setMSceneType", "(Lcom/ss/android/lark/searchcommon/dto/Scene$Type;)V", "mSearchOuterGroupChat", "getMSearchOuterGroupChat", "setMSearchOuterGroupChat", "mSearchSceneType", "getMSearchSceneType", "setMSearchSceneType", "mTimePair", "getMTimePair", "setMTimePair", "myOwnDoc", "getMyOwnDoc", "setMyOwnDoc", "pageToken", "getPageToken", "setPageToken", "Companion", "DocCategory", "DocSearchContentType", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchContext {

    /* renamed from: a */
    public static final Companion f133251a = new Companion(null);

    /* renamed from: A */
    private Pair<Date, Date> f133252A;

    /* renamed from: B */
    private boolean f133253B;

    /* renamed from: C */
    private int f133254C = 20;

    /* renamed from: D */
    private String f133255D = "0";

    /* renamed from: E */
    private long f133256E = C26279i.m95159b();

    /* renamed from: F */
    private String f133257F;

    /* renamed from: G */
    private String f133258G;

    /* renamed from: H */
    private String f133259H;

    /* renamed from: I */
    private List<String> f133260I = new ArrayList();

    /* renamed from: J */
    private List<Doc.Type> f133261J = new ArrayList();

    /* renamed from: K */
    private boolean f133262K;

    /* renamed from: L */
    private DocCategory f133263L = DocCategory.ALL;

    /* renamed from: M */
    private List<String> f133264M = new ArrayList();

    /* renamed from: N */
    private List<String> f133265N = new ArrayList();

    /* renamed from: O */
    private Pair<Date, Date> f133266O;

    /* renamed from: P */
    private DocSearchContentType f133267P = DocSearchContentType.ALL;

    /* renamed from: Q */
    private boolean f133268Q = true;

    /* renamed from: R */
    private boolean f133269R = true;

    /* renamed from: S */
    private boolean f133270S;

    /* renamed from: T */
    private String f133271T = "";

    /* renamed from: b */
    private Scene.Type f133272b = Scene.Type.UNKNOWN;

    /* renamed from: c */
    private String f133273c = "";

    /* renamed from: d */
    private List<String> f133274d = new ArrayList();

    /* renamed from: e */
    private boolean f133275e;

    /* renamed from: f */
    private boolean f133276f;

    /* renamed from: g */
    private boolean f133277g;

    /* renamed from: h */
    private boolean f133278h;

    /* renamed from: i */
    private boolean f133279i;

    /* renamed from: j */
    private boolean f133280j;

    /* renamed from: k */
    private boolean f133281k;

    /* renamed from: l */
    private boolean f133282l;

    /* renamed from: m */
    private boolean f133283m;

    /* renamed from: n */
    private boolean f133284n;

    /* renamed from: o */
    private boolean f133285o;

    /* renamed from: p */
    private int f133286p;

    /* renamed from: q */
    private boolean f133287q;

    /* renamed from: r */
    private boolean f133288r;

    /* renamed from: s */
    private boolean f133289s;

    /* renamed from: t */
    private boolean f133290t = true;

    /* renamed from: u */
    private List<ChatFilterParam.ChatMode> f133291u = new ArrayList();

    /* renamed from: v */
    private List<ChatType> f133292v = new ArrayList();

    /* renamed from: w */
    private List<String> f133293w = new ArrayList();

    /* renamed from: x */
    private List<String> f133294x = new ArrayList();

    /* renamed from: y */
    private List<String> f133295y = new ArrayList();

    /* renamed from: z */
    private Scene.Type f133296z = Scene.Type.SEARCH_MESSAGES;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "", "(Ljava/lang/String;I)V", "DOC", "WIKI", "ALL", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DocCategory {
        DOC,
        WIKI,
        ALL;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocCategory;", "ordinal", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.service.compatible.SearchContext$DocCategory$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final DocCategory mo184451a(int i) {
                if (i == 0) {
                    return DocCategory.DOC;
                }
                if (i == 1) {
                    return DocCategory.WIKI;
                }
                if (i != 2) {
                    return DocCategory.ALL;
                }
                return DocCategory.ALL;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "", "(Ljava/lang/String;I)V", "ONLY_MATCH_TITLE", "ONLY_MATCH_COMMENT", "ALL", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DocSearchContentType {
        ONLY_MATCH_TITLE,
        ONLY_MATCH_COMMENT,
        ALL;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$DocSearchContentType;", "ordinal", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.service.compatible.SearchContext$DocSearchContentType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final DocSearchContentType mo184452a(int i) {
                if (i == 0) {
                    return DocSearchContentType.ONLY_MATCH_TITLE;
                }
                if (i == 1) {
                    return DocSearchContentType.ONLY_MATCH_COMMENT;
                }
                if (i != 2) {
                    return DocSearchContentType.ALL;
                }
                return DocSearchContentType.ALL;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext$Companion;", "", "()V", "SEARCH_MSG_IN_CHAT_INIT_LAST_MESSAGE_ID", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.service.compatible.SearchContext$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: A */
    public final boolean mo184368A() {
        return this.f133253B;
    }

    /* renamed from: B */
    public final int mo184369B() {
        return this.f133254C;
    }

    /* renamed from: C */
    public final String mo184370C() {
        return this.f133255D;
    }

    /* renamed from: D */
    public final long mo184371D() {
        return this.f133256E;
    }

    /* renamed from: E */
    public final String mo184372E() {
        return this.f133257F;
    }

    /* renamed from: F */
    public final String mo184373F() {
        return this.f133258G;
    }

    /* renamed from: G */
    public final String mo184374G() {
        return this.f133259H;
    }

    /* renamed from: H */
    public final List<String> mo184375H() {
        return this.f133260I;
    }

    /* renamed from: I */
    public final List<Doc.Type> mo184376I() {
        return this.f133261J;
    }

    /* renamed from: J */
    public final boolean mo184377J() {
        return this.f133262K;
    }

    /* renamed from: K */
    public final DocCategory mo184378K() {
        return this.f133263L;
    }

    /* renamed from: L */
    public final List<String> mo184379L() {
        return this.f133264M;
    }

    /* renamed from: M */
    public final List<String> mo184380M() {
        return this.f133265N;
    }

    /* renamed from: N */
    public final Pair<Date, Date> mo184381N() {
        return this.f133266O;
    }

    /* renamed from: O */
    public final DocSearchContentType mo184382O() {
        return this.f133267P;
    }

    /* renamed from: P */
    public final boolean mo184383P() {
        return this.f133268Q;
    }

    /* renamed from: Q */
    public final boolean mo184384Q() {
        return this.f133269R;
    }

    /* renamed from: R */
    public final boolean mo184385R() {
        return this.f133270S;
    }

    /* renamed from: S */
    public final String mo184386S() {
        return this.f133271T;
    }

    /* renamed from: a */
    public final Scene.Type mo184387a() {
        return this.f133272b;
    }

    /* renamed from: b */
    public final String mo184397b() {
        return this.f133273c;
    }

    /* renamed from: c */
    public final List<String> mo184404c() {
        return this.f133274d;
    }

    /* renamed from: o */
    public final int mo184434o() {
        return this.f133286p;
    }

    /* renamed from: t */
    public final List<ChatFilterParam.ChatMode> mo184444t() {
        return this.f133291u;
    }

    /* renamed from: u */
    public final List<ChatType> mo184445u() {
        return this.f133292v;
    }

    /* renamed from: v */
    public final List<String> mo184446v() {
        return this.f133293w;
    }

    /* renamed from: w */
    public final List<String> mo184447w() {
        return this.f133294x;
    }

    /* renamed from: x */
    public final List<String> mo184448x() {
        return this.f133295y;
    }

    /* renamed from: y */
    public final Scene.Type mo184449y() {
        return this.f133296z;
    }

    /* renamed from: z */
    public final Pair<Date, Date> mo184450z() {
        return this.f133252A;
    }

    /* renamed from: g */
    public final boolean mo184419g() {
        return this.f133278h;
    }

    /* renamed from: h */
    public final boolean mo184421h() {
        return this.f133279i;
    }

    /* renamed from: i */
    public final boolean mo184423i() {
        return this.f133280j;
    }

    /* renamed from: j */
    public final boolean mo184425j() {
        return this.f133281k;
    }

    /* renamed from: k */
    public final boolean mo184427k() {
        return this.f133282l;
    }

    /* renamed from: l */
    public final boolean mo184429l() {
        return this.f133283m;
    }

    /* renamed from: m */
    public final boolean mo184431m() {
        return this.f133284n;
    }

    /* renamed from: n */
    public final boolean mo184433n() {
        return this.f133285o;
    }

    /* renamed from: p */
    public final boolean mo184437p() {
        return this.f133287q;
    }

    /* renamed from: q */
    public final boolean mo184439q() {
        return this.f133288r;
    }

    /* renamed from: r */
    public final boolean mo184441r() {
        return this.f133289s;
    }

    /* renamed from: s */
    public final boolean mo184443s() {
        return this.f133290t;
    }

    /* renamed from: e */
    public final boolean mo184414e() {
        return this.f133276f;
    }

    /* renamed from: f */
    public final boolean mo184417f() {
        return this.f133277g;
    }

    /* renamed from: d */
    public final boolean mo184411d() {
        return this.f133275e;
    }

    /* renamed from: d */
    public final void mo184408d(String str) {
        this.f133258G = str;
    }

    /* renamed from: e */
    public final void mo184412e(String str) {
        this.f133259H = str;
    }

    /* renamed from: f */
    public final void mo184415f(String str) {
        this.f133271T = str;
    }

    /* renamed from: g */
    public final void mo184418g(boolean z) {
        this.f133281k = z;
    }

    /* renamed from: h */
    public final void mo184420h(boolean z) {
        this.f133282l = z;
    }

    /* renamed from: i */
    public final void mo184422i(boolean z) {
        this.f133283m = z;
    }

    /* renamed from: j */
    public final void mo184424j(boolean z) {
        this.f133284n = z;
    }

    /* renamed from: k */
    public final void mo184426k(boolean z) {
        this.f133285o = z;
    }

    /* renamed from: l */
    public final void mo184428l(boolean z) {
        this.f133287q = z;
    }

    /* renamed from: m */
    public final void mo184430m(boolean z) {
        this.f133288r = z;
    }

    /* renamed from: n */
    public final void mo184432n(boolean z) {
        this.f133289s = z;
    }

    /* renamed from: p */
    public final void mo184436p(boolean z) {
        this.f133262K = z;
    }

    /* renamed from: q */
    public final void mo184438q(boolean z) {
        this.f133268Q = z;
    }

    /* renamed from: r */
    public final void mo184440r(boolean z) {
        this.f133269R = z;
    }

    /* renamed from: s */
    public final void mo184442s(boolean z) {
        this.f133270S = z;
    }

    /* renamed from: a */
    public final void mo184388a(int i) {
        this.f133286p = i;
    }

    /* renamed from: b */
    public final void mo184398b(int i) {
        this.f133254C = i;
    }

    /* renamed from: c */
    public final void mo184405c(String str) {
        this.f133257F = str;
    }

    /* renamed from: d */
    public final void mo184409d(List<Doc.Type> list) {
        this.f133261J = list;
    }

    /* renamed from: e */
    public final void mo184413e(boolean z) {
        this.f133279i = z;
    }

    /* renamed from: f */
    public final void mo184416f(boolean z) {
        this.f133280j = z;
    }

    /* renamed from: o */
    public final void mo184435o(boolean z) {
        this.f133253B = z;
    }

    /* renamed from: a */
    public final void mo184389a(long j) {
        this.f133256E = j;
    }

    /* renamed from: b */
    public final void mo184399b(Pair<Date, Date> pair) {
        this.f133266O = pair;
    }

    /* renamed from: c */
    public final void mo184406c(List<String> list) {
        this.f133260I = list;
    }

    /* renamed from: d */
    public final void mo184410d(boolean z) {
        this.f133278h = z;
    }

    /* renamed from: a */
    public final void mo184390a(Pair<Date, Date> pair) {
        this.f133252A = pair;
    }

    /* renamed from: b */
    public final void mo184400b(Scene.Type type) {
        this.f133296z = type;
    }

    /* renamed from: c */
    public final void mo184407c(boolean z) {
        this.f133277g = z;
    }

    /* renamed from: a */
    public final void mo184391a(Scene.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "<set-?>");
        this.f133272b = type;
    }

    /* renamed from: b */
    public final void mo184401b(String str) {
        this.f133255D = str;
    }

    /* renamed from: a */
    public final void mo184392a(DocCategory docCategory) {
        Intrinsics.checkParameterIsNotNull(docCategory, "<set-?>");
        this.f133263L = docCategory;
    }

    /* renamed from: b */
    public final void mo184402b(List<String> list) {
        this.f133295y = list;
    }

    /* renamed from: a */
    public final void mo184393a(DocSearchContentType docSearchContentType) {
        Intrinsics.checkParameterIsNotNull(docSearchContentType, "<set-?>");
        this.f133267P = docSearchContentType;
    }

    /* renamed from: b */
    public final void mo184403b(boolean z) {
        this.f133276f = z;
    }

    /* renamed from: a */
    public final void mo184394a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f133273c = str;
    }

    /* renamed from: a */
    public final void mo184395a(List<String> list) {
        this.f133294x = list;
    }

    /* renamed from: a */
    public final void mo184396a(boolean z) {
        this.f133275e = z;
    }
}
