package com.ss.android.lark.search.redesign.click.handler;

import android.app.Activity;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.p2584b.C53287b;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchCalendarEventInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMoreInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchWikiInfo;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.utils.SessionManager;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020(H\u0002J \u0010)\u001a\u00020!2\u0006\u0010%\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler;", "Lcom/ss/android/lark/search/redesign/click/handler/AbsItemClickHandler;", "contextProvider", "Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;", "historyProvider", "Lcom/ss/android/lark/search/redesign/click/handler/HistoryProvider;", "(Lcom/ss/android/lark/search/redesign/click/handler/IContextProvider;Lcom/ss/android/lark/search/redesign/click/handler/HistoryProvider;)V", "mCalendarDependency", "Lcom/ss/android/lark/search/dependency/ISearchModuleDependency$ICalendarDependency;", "kotlin.jvm.PlatformType", "mChatClickListener", "Lcom/ss/android/lark/search/redesign/click/handler/ChatClickHandler;", "mHelpDeskListener", "Lcom/ss/android/lark/search/redesign/click/handler/HelpDeskClickHandler;", "mMessageClickListener", "Lcom/ss/android/lark/search/redesign/click/handler/MessageClickHandler;", "mMoreClickListener", "Lcom/ss/android/lark/search/redesign/click/handler/IMoreItemClickListener;", "getMMoreClickListener", "()Lcom/ss/android/lark/search/redesign/click/handler/IMoreItemClickListener;", "setMMoreClickListener", "(Lcom/ss/android/lark/search/redesign/click/handler/IMoreItemClickListener;)V", "mOnItemClickAspect", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "getMOnItemClickAspect", "()Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "setMOnItemClickAspect", "(Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "mOpenAppClickListener", "Lcom/ss/android/lark/search/redesign/click/handler/OpenAppClickHandler;", "mSpaceClickListener", "Lcom/ss/android/lark/search/redesign/click/handler/SpaceClickHandler;", "addChatBoxHitPointIfNeeded", "", "chatId", "", "chatterClick", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatterInfo;", "onFileClick", "Lcom/ss/android/lark/searchcommon/dto/info/SearchFileInfo;", "onItemClick", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "isSelected", "", "position", "", "uploadHistory", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.a.a.i */
public class SearchItemClickHandler extends AbsItemClickHandler {

    /* renamed from: a */
    public static final Companion f132496a = new Companion(null);

    /* renamed from: b */
    private final ISearchModuleDependency.AbstractC53316d f132497b;

    /* renamed from: c */
    private final ChatClickHandler f132498c;

    /* renamed from: d */
    private final HelpDeskClickHandler f132499d;

    /* renamed from: e */
    private final MessageClickHandler f132500e;

    /* renamed from: f */
    private final OpenAppClickHandler f132501f;

    /* renamed from: g */
    private final SpaceClickHandler f132502g;

    /* renamed from: h */
    private SearchResultViewAdapter.IOnItemClickHandler f132503h;

    /* renamed from: i */
    private IMoreItemClickListener f132504i;

    /* renamed from: j */
    private final HistoryProvider f132505j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler$Companion;", "", "()V", "TAG_V2", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler$addChatBoxHitPointIfNeeded$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.i$b */
    public static final class C53689b implements IGetDataCallback<Chat> {
        C53689b() {
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            if (chat.isInBox()) {
                ISearchModuleDependency a = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
                a.mo181760i().mo181813a(chat, "search");
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.SearchItemClickListener", "getChatById failed: " + errorResult.getDebugMsg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler$uploadHistory$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.i$d */
    public static final class C53691d implements IGetDataCallback<String> {
        /* renamed from: a */
        public void onSuccess(String str) {
        }

        C53691d() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LarkSearch.Search.V2.SearchItemClickListener", "set search history failed: " + errorResult);
        }
    }

    /* renamed from: c */
    private final void m207850c() {
        SearchInfoHistory B;
        HistoryProvider dVar = this.f132505j;
        if (dVar != null && (B = dVar.mo183098B()) != null) {
            C53287b.m206193a().mo181877a(B, new C53691d());
        }
    }

    /* renamed from: a */
    public final void mo183105a(IMoreItemClickListener fVar) {
        this.f132504i = fVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/redesign/click/handler/SearchItemClickHandler$chatterClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.a.a.i$c */
    public static final class C53690c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ SearchItemClickHandler f132506a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53690c(SearchItemClickHandler iVar) {
            this.f132506a = iVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat == null) {
                Log.m165383e("LarkSearch.Search.V2.SearchItemClickListener", "getP2pChatByChatterId failed: chat is null");
                return;
            }
            this.f132506a.mo183087a(chat.getId(), SearchCommonConstants.FeedType.CHAT);
            this.f132506a.mo183085a().mo181793b(chat.getId(), -1);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e("LarkSearch.Search.V2.SearchItemClickListener", "getP2pChatByChatterId failed: " + errorResult.getDebugMsg());
            if (errorResult.getErrorCode() == 4051) {
                ISearchModuleDependency a = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
                a.mo181756f().mo181800d(errorResult.getDisplayMsg());
                return;
            }
            this.f132506a.mo183086a(UIHelper.getString(R.string.Lark_Search_EnterChatFailedError));
        }
    }

    /* renamed from: a */
    public final void mo183106a(SearchResultViewAdapter.IOnItemClickHandler bVar) {
        this.f132503h = bVar;
    }

    /* renamed from: a */
    private final void m207848a(SearchFileInfo searchFileInfo) {
        mo183087a(searchFileInfo.getChatId(), SearchCommonConstants.FeedType.CHAT);
        mo183085a().mo181793b(searchFileInfo.getChatId(), searchFileInfo.getPosition());
    }

    /* renamed from: b */
    private final void m207849b(String str) {
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        a.mo181756f().mo181783a(str, new C53689b());
    }

    /* renamed from: a */
    private final void m207847a(SearchChatterInfo searchChatterInfo) {
        if (searchChatterInfo.isP2pCryptoChat()) {
            mo183087a(searchChatterInfo.getId(), SearchCommonConstants.FeedType.CHAT);
            mo183085a().mo181793b(searchChatterInfo.getId(), -1);
        } else if (!C53258a.m205939a().mo181745a("lark.feed.openapp.v2") || searchChatterInfo.getChatterType() != Chatter.ChatterType.BOT) {
            mo183085a().mo181794b(searchChatterInfo.getId(), new UIGetDataCallback(new C53690c(this)));
        } else {
            C53258a.m205939a().mo181748b(searchChatterInfo.getId(), true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchItemClickHandler(IContextProvider eVar, HistoryProvider dVar) {
        super(eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "contextProvider");
        this.f132505j = dVar;
        ISearchModuleDependency a = C53258a.m205939a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
        this.f132497b = a.mo181765n();
        this.f132498c = new ChatClickHandler(eVar);
        this.f132499d = new HelpDeskClickHandler(eVar);
        this.f132500e = new MessageClickHandler(eVar);
        this.f132501f = new OpenAppClickHandler(eVar);
        this.f132502g = new SpaceClickHandler(eVar);
    }

    @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
    /* renamed from: a */
    public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
        Activity C;
        SearchOpenSearchInfo searchOpenSearchInfo;
        String app_link;
        boolean z2;
        Activity C2;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IContextProvider b = mo183088b();
        if (b != null && (C = b.mo183099C()) != null) {
            m207850c();
            SearchResultViewAdapter.IOnItemClickHandler bVar = this.f132503h;
            if (bVar != null) {
                bVar.mo182499a(searchBaseInfo, z, i);
            }
            SessionManager.m209247c();
            if (searchBaseInfo instanceof SearchMoreInfo) {
                IMoreItemClickListener fVar = this.f132504i;
                if (fVar != null) {
                    fVar.mo183100a((SearchMoreInfo) searchBaseInfo);
                }
            } else if (searchBaseInfo instanceof SearchCalendarEventInfo) {
                SearchCalendarEventInfo searchCalendarEventInfo = (SearchCalendarEventInfo) searchBaseInfo;
                this.f132497b.mo181823a(searchCalendarEventInfo.getCalendarId(), searchCalendarEventInfo.getEventKey(), searchCalendarEventInfo.getOriginalTime(), C, searchCalendarEventInfo.getStartTime(), searchCalendarEventInfo.getEndTime());
            } else if (searchBaseInfo instanceof SearchChatterInfo) {
                ISearchModuleDependency a = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
                a.mo181752d().mo181830a();
                m207847a((SearchChatterInfo) searchBaseInfo);
            } else if (searchBaseInfo instanceof SearchThreadInfo) {
                ISearchModuleDependency a2 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "SearchModule.getDependency()");
                a2.mo181752d().mo181830a();
                SearchThreadInfo searchThreadInfo = (SearchThreadInfo) searchBaseInfo;
                mo183087a(searchThreadInfo.getId(), SearchCommonConstants.FeedType.THREAD);
                mo183085a().mo181792b(searchThreadInfo.getId());
            } else if (searchBaseInfo instanceof SearchLinkInfo) {
                String originalUrl = ((SearchLinkInfo) searchBaseInfo).getOriginalUrl();
                Intrinsics.checkExpressionValueIsNotNull(originalUrl, "data.originalUrl");
                if (!TextUtils.isEmpty(originalUrl)) {
                    ISearchModuleDependency a3 = C53258a.m205939a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "SearchModule.getDependency()");
                    a3.mo181754e().mo181774a(C, originalUrl);
                    return;
                }
                LKUIToast.show(C, UIHelper.getString(R.string.Lark_Search_EnterChatFailedError));
            } else if (searchBaseInfo instanceof SearchChatInfo) {
                ISearchModuleDependency a4 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "SearchModule.getDependency()");
                a4.mo181752d().mo181830a();
                String id = ((SearchChatInfo) searchBaseInfo).getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                m207849b(id);
                this.f132498c.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchMessageInfo) {
                ISearchModuleDependency a5 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "SearchModule.getDependency()");
                a5.mo181752d().mo181830a();
                this.f132500e.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchHelpDeskInfo) {
                ISearchModuleDependency a6 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a6, "SearchModule.getDependency()");
                a6.mo181752d().mo181830a();
                this.f132499d.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchOpenAppInfo) {
                ISearchModuleDependency a7 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a7, "SearchModule.getDependency()");
                a7.mo181752d().mo181830a();
                this.f132501f.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchWikiInfo) {
                this.f132502g.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchSpaceInfo) {
                ISearchModuleDependency a8 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a8, "SearchModule.getDependency()");
                a8.mo181752d().mo181831b();
                this.f132502g.mo182499a(searchBaseInfo, z, i);
            } else if (searchBaseInfo instanceof SearchFileInfo) {
                ISearchModuleDependency a9 = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a9, "SearchModule.getDependency()");
                a9.mo181752d().mo181830a();
                m207848a((SearchFileInfo) searchBaseInfo);
            } else if ((searchBaseInfo instanceof SearchOpenSearchInfo) && (app_link = (searchOpenSearchInfo = (SearchOpenSearchInfo) searchBaseInfo).getApp_link()) != null) {
                if (app_link.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (C2 = mo183088b().mo183099C()) != null) {
                    Activity activity = C2;
                    if (C53258a.m205939a().mo181755e(activity, searchOpenSearchInfo.getApp_link())) {
                        C53258a.m205939a().mo181757f(activity, searchOpenSearchInfo.getApp_link());
                        return;
                    }
                    ISearchModuleDependency a10 = C53258a.m205939a();
                    Intrinsics.checkExpressionValueIsNotNull(a10, "SearchModule.getDependency()");
                    a10.mo181754e().mo181776c(activity, searchOpenSearchInfo.getApp_link());
                }
            }
        }
    }
}
