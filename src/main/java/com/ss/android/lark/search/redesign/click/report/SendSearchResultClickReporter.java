package com.ss.android.lark.search.redesign.click.report;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.global.p2619a.C53626a;
import com.ss.android.lark.search.impl.hitpoint.SearchHitPoint;
import com.ss.android.lark.search.redesign.dto.TabInfo;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J:\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J \u0010!\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J \u0010#\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J \u0010%\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J \u0010&\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J \u0010(\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J0\u0010*\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u000bH\u0002R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter;", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "tabInfo", "Lcom/ss/android/lark/search/redesign/dto/TabInfo;", "subPositionCalculator", "Lcom/ss/android/lark/search/redesign/click/report/SubPositionCalculator;", "(Lcom/ss/android/lark/search/redesign/dto/TabInfo;Lcom/ss/android/lark/search/redesign/click/report/SubPositionCalculator;)V", "mChatDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "mPage", "", "docHitPointPair", "Lkotlin/Pair;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/doc/entity/DocType;", "hasH5OrMicroAppAbility", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenAppInfo;", "onItemClick", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "position", "", "report", "resultType", "subPagePosition", "absPosition", "id", "jsonObject", "Lorg/json/JSONObject;", "reportChatter", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "reportMessage", "Lcom/ss/android/lark/searchcommon/dto/info/SearchMessageInfo;", "reportOpenApp", "reportOpenSearch", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "reportSpace", "Lcom/ss/android/lark/searchcommon/dto/info/SearchSpaceInfo;", "reportWithChatId", "chatId", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.b.a */
public final class SendSearchResultClickReporter implements SearchResultViewAdapter.IOnItemClickHandler {

    /* renamed from: a */
    public static final Companion f132512a = new Companion(null);

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53317e f132513b;

    /* renamed from: c */
    private final String f132514c;

    /* renamed from: d */
    private final TabInfo f132515d;

    /* renamed from: e */
    private final SubPositionCalculator f132516e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter$Companion;", "", "()V", "ERR", "", "TAG_V2", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int a = this.f132516e.mo183116a(i);
        int b = this.f132516e.mo183117b(i);
        if (searchBaseInfo instanceof SearchHelpDeskInfo) {
            String id = ((SearchHelpDeskInfo) searchBaseInfo).getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            m207862a(this, "helpdesk", searchBaseInfo, a, b, id, null, 32, null);
        } else if (searchBaseInfo instanceof SearchCalendarEventInfo) {
            String id2 = ((SearchCalendarEventInfo) searchBaseInfo).getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "data.id");
            m207862a(this, "calendar_event", searchBaseInfo, a, b, id2, null, 32, null);
        } else if (searchBaseInfo instanceof SearchThreadInfo) {
            String id3 = ((SearchThreadInfo) searchBaseInfo).getId();
            Intrinsics.checkExpressionValueIsNotNull(id3, "data.id");
            m207862a(this, "thread", searchBaseInfo, a, b, id3, null, 32, null);
        } else if (searchBaseInfo instanceof SearchWikiInfo) {
            String a2 = C57859q.m224565a(((SearchWikiInfo) searchBaseInfo).getId());
            Intrinsics.checkExpressionValueIsNotNull(a2, "EncryptUtils.uidEncryptor(data.id)");
            m207862a(this, "wiki", searchBaseInfo, a, b, a2, null, 32, null);
        } else if (searchBaseInfo instanceof SearchChatInfo) {
            SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
            String str = searchChatInfo.isSecretChat() ? "secret_group_chat" : "group";
            String id4 = searchChatInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id4, "data.id");
            m207862a(this, str, searchBaseInfo, a, b, id4, null, 32, null);
        } else if (searchBaseInfo instanceof SearchChatterInfo) {
            m207863a((SearchChatterInfo) searchBaseInfo, a, b);
        } else if (searchBaseInfo instanceof SearchMessageInfo) {
            m207864a((SearchMessageInfo) searchBaseInfo, a, b);
        } else if (searchBaseInfo instanceof SearchOpenAppInfo) {
            m207865a((SearchOpenAppInfo) searchBaseInfo, a, b);
        } else if (searchBaseInfo instanceof SearchSpaceInfo) {
            m207867a((SearchSpaceInfo) searchBaseInfo, a, b);
        } else if (searchBaseInfo instanceof SearchOpenSearchInfo) {
            m207866a((SearchOpenSearchInfo) searchBaseInfo, a, b);
        }
        SearchClickReporter.f133152a.mo183816a(searchBaseInfo, "main", this.f132515d.reporterLocation(), Integer.valueOf(b + 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m207869a(com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo r4) {
        /*
            r3 = this;
            java.util.List r4 = r4.getAbilities()
            java.util.Iterator r4 = r4.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r4.next()
            com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo$SearchOpenAppAbility r0 = (com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo.SearchOpenAppAbility) r0
            java.lang.String r1 = "ability"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r0.getType()
            r2 = 2
            if (r1 == r2) goto L_0x0027
            int r0 = r0.getType()
            r1 = 3
            if (r0 != r1) goto L_0x0008
        L_0x0027:
            r4 = 1
            return r4
        L_0x0029:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.click.report.SendSearchResultClickReporter.m207869a(com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo):boolean");
    }

    /* renamed from: a */
    private final void m207868a(String str, SearchBaseInfo searchBaseInfo, int i, int i2, String str2, JSONObject jSONObject) {
        if (this.f132516e.mo183115A() != null) {
            jSONObject.put("entry_source", this.f132516e.mo183115A());
        }
        SearchHitPoint.Companion aVar = SearchHitPoint.f131886a;
        String str3 = this.f132514c;
        int i3 = i + 1;
        String session = searchBaseInfo.getSession();
        String str4 = session != null ? session : "";
        String imprId = searchBaseInfo.getImprId();
        String str5 = imprId != null ? imprId : "";
        Scene.Type scene = searchBaseInfo.getScene();
        aVar.mo182017a(str, str3, i3, jSONObject, str4, str5, scene != null ? Integer.valueOf(scene.getNumber()) : null, str2, i2 + 1);
    }

    /* renamed from: a */
    public final void mo183112a(String str, SearchBaseInfo searchBaseInfo, int i, int i2, String str2) {
        JSONObject put = new JSONObject().put("chat_id", str2);
        String id = searchBaseInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
        Intrinsics.checkExpressionValueIsNotNull(put, "jsonObject");
        m207868a(str, searchBaseInfo, i, i2, id, put);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter$reportMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.b.a$c */
    public static final class C53694c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ SendSearchResultClickReporter f132522a;

        /* renamed from: b */
        final /* synthetic */ SearchMessageInfo f132523b;

        /* renamed from: c */
        final /* synthetic */ int f132524c;

        /* renamed from: d */
        final /* synthetic */ int f132525d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("LarkSearch.Search.V2.SendSearchResultClickReporter", "getChatById failed: " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null || !chat.isMeeting()) {
                SendSearchResultClickReporter aVar = this.f132522a;
                SearchMessageInfo searchMessageInfo = this.f132523b;
                int i = this.f132524c;
                int i2 = this.f132525d;
                String chatId = searchMessageInfo.getChatId();
                Intrinsics.checkExpressionValueIsNotNull(chatId, "data.chatId");
                aVar.mo183112a("msg", searchMessageInfo, i, i2, chatId);
                return;
            }
            SendSearchResultClickReporter aVar2 = this.f132522a;
            SearchMessageInfo searchMessageInfo2 = this.f132523b;
            int i3 = this.f132524c;
            int i4 = this.f132525d;
            String chatId2 = searchMessageInfo2.getChatId();
            Intrinsics.checkExpressionValueIsNotNull(chatId2, "data.chatId");
            aVar2.mo183112a("meeting", searchMessageInfo2, i3, i4, chatId2);
        }

        C53694c(SendSearchResultClickReporter aVar, SearchMessageInfo searchMessageInfo, int i, int i2) {
            this.f132522a = aVar;
            this.f132523b = searchMessageInfo;
            this.f132524c = i;
            this.f132525d = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/report/SendSearchResultClickReporter$reportChatter$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.b.a$b */
    public static final class C53693b implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ SendSearchResultClickReporter f132517a;

        /* renamed from: b */
        final /* synthetic */ String f132518b;

        /* renamed from: c */
        final /* synthetic */ SearchChatterInfo f132519c;

        /* renamed from: d */
        final /* synthetic */ int f132520d;

        /* renamed from: e */
        final /* synthetic */ int f132521e;

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat != null) {
                int i = this.f132520d;
                int i2 = this.f132521e;
                String id = chat.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                this.f132517a.mo183112a(this.f132518b, this.f132519c, i, i2, id);
                Log.m165389i("LarkSearch.Search.V2.SendSearchResultClickReporter", "sendSearchResultClickWithChatId success, ChatterId: " + this.f132519c.getId());
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e("LarkSearch.Search.V2.SendSearchResultClickReporter", "sendSearchResultClickWithChatId failed, ChatterId: " + this.f132519c.getId());
        }

        C53693b(SendSearchResultClickReporter aVar, String str, SearchChatterInfo searchChatterInfo, int i, int i2) {
            this.f132517a = aVar;
            this.f132518b = str;
            this.f132519c = searchChatterInfo;
            this.f132520d = i;
            this.f132521e = i2;
        }
    }

    /* renamed from: a */
    private final Pair<String, String> m207861a(DocType docType) {
        switch (C53695b.f132527b[docType.ordinal()]) {
            case 1:
                return new Pair<>("doc", "doc");
            case 2:
                return new Pair<>("sheet", "sheet");
            case 3:
                return new Pair<>("bitable", "bitable");
            case 4:
                return new Pair<>("mindnote", "mindnote");
            case 5:
                return new Pair<>("file", "file");
            case 6:
                return new Pair<>("slide", "slide");
            default:
                return null;
        }
    }

    public SendSearchResultClickReporter(TabInfo tabInfo, SubPositionCalculator cVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(tabInfo, "tabInfo");
        Intrinsics.checkParameterIsNotNull(cVar, "subPositionCalculator");
        this.f132515d = tabInfo;
        this.f132516e = cVar;
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132513b = a.mo181756f();
        switch (C53695b.f132526a[tabInfo.getType().ordinal()]) {
            case 1:
                str = "mobile_all";
                break;
            case 2:
                str = "mobile_helpdesk";
                break;
            case 3:
                str = "mobile_contact";
                break;
            case 4:
                str = "mobile_apps";
                break;
            case 5:
                str = "mobile_group";
                break;
            case 6:
                str = "mobile_msg";
                break;
            case 7:
                str = "mobile_open_search";
                break;
            default:
                str = "";
                break;
        }
        this.f132514c = str;
    }

    /* renamed from: a */
    private final void m207864a(SearchMessageInfo searchMessageInfo, int i, int i2) {
        if (!TextUtils.isEmpty(searchMessageInfo.getThreadId())) {
            String threadId = searchMessageInfo.getThreadId();
            Intrinsics.checkExpressionValueIsNotNull(threadId, "data.threadId");
            mo183112a("msg", searchMessageInfo, i, i2, threadId);
            return;
        }
        this.f132513b.mo181783a(searchMessageInfo.getChatId(), new C53694c(this, searchMessageInfo, i, i2));
    }

    /* renamed from: a */
    private final void m207863a(SearchChatterInfo searchChatterInfo, int i, int i2) {
        boolean z;
        String str;
        if (searchChatterInfo.isP2pCryptoChat()) {
            String id = searchChatterInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            mo183112a("secret_p2p_chat", searchChatterInfo, i, i2, id);
            return;
        }
        if (searchChatterInfo.getChatterType() == Chatter.ChatterType.BOT) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "contact";
        } else {
            str = "bot";
        }
        this.f132513b.mo181794b(searchChatterInfo.getId(), new C53693b(this, str, searchChatterInfo, i, i2));
    }

    /* renamed from: a */
    private final void m207865a(SearchOpenAppInfo searchOpenAppInfo, int i, int i2) {
        boolean z;
        String str = "app";
        if (searchOpenAppInfo.isAvailable() && !m207869a(searchOpenAppInfo)) {
            str = "bot";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!searchOpenAppInfo.isAvailable()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("click_uninstalled_app", z);
            if (this.f132516e.mo183115A() != null) {
                jSONObject.put("entry_source", this.f132516e.mo183115A());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            String id = searchOpenAppInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            m207868a(str, searchOpenAppInfo, i, i2, id, jSONObject);
            throw th;
        }
        String id2 = searchOpenAppInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "data.id");
        m207868a(str, searchOpenAppInfo, i, i2, id2, jSONObject);
    }

    /* renamed from: a */
    private final void m207866a(SearchOpenSearchInfo searchOpenSearchInfo, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("open_search_tab_id", this.f132515d.getMapp_id());
            if (this.f132516e.mo183115A() != null) {
                jSONObject.put("entry_source", this.f132516e.mo183115A());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            String id = searchOpenSearchInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
            m207868a("open_search", searchOpenSearchInfo, i, i2, id, jSONObject);
            throw th;
        }
        String id2 = searchOpenSearchInfo.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "data.id");
        m207868a("open_search", searchOpenSearchInfo, i, i2, id2, jSONObject);
    }

    /* renamed from: a */
    private final void m207867a(SearchSpaceInfo searchSpaceInfo, int i, int i2) {
        String str;
        String str2;
        String str3;
        int i3;
        DocType docType = searchSpaceInfo.getDocType();
        Intrinsics.checkExpressionValueIsNotNull(docType, "data.docType");
        Pair<String, String> a = m207861a(docType);
        if (a != null) {
            a.getSecond();
        }
        if (a == null) {
            Log.m165383e("LarkSearch.Search.V2.SendSearchResultClickReporter", "doc type is unknown");
            return;
        }
        String first = a.getFirst();
        String a2 = C57859q.m224565a(searchSpaceInfo.getId());
        String second = a.getSecond();
        String requestId = searchSpaceInfo.getRequestId();
        if (requestId != null) {
            str = requestId;
        } else {
            str = "";
        }
        String session = searchSpaceInfo.getSession();
        if (session != null) {
            str2 = session;
        } else {
            str2 = "";
        }
        String imprId = searchSpaceInfo.getImprId();
        if (imprId != null) {
            str3 = imprId;
        } else {
            str3 = "";
        }
        Scene.Type scene = searchSpaceInfo.getScene();
        if (scene != null) {
            i3 = scene.getNumber();
        } else {
            i3 = 0;
        }
        C53626a.m207597a(first, i, a2, second, str, str2, str3, i3, C57859q.m224565a(searchSpaceInfo.getId()), i2);
    }

    /* renamed from: a */
    static /* synthetic */ void m207862a(SendSearchResultClickReporter aVar, String str, SearchBaseInfo searchBaseInfo, int i, int i2, String str2, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            jSONObject = new JSONObject();
        }
        aVar.m207868a(str, searchBaseInfo, i, i2, str2, jSONObject);
    }
}
