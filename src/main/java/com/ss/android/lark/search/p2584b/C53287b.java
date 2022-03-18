package com.ss.android.lark.search.p2584b;

import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.search.slash.v1.SlashCommandParam;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.bytedance.lark.pb.search.v1.ChatterPermissionsRequest;
import com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryRequest;
import com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryResponse;
import com.bytedance.lark.pb.search.v1.EntityType;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.IntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.Scene;
import com.bytedance.lark.pb.search.v1.SearchFeedbackRequest;
import com.bytedance.lark.pb.search.v1.SearchHistoryInfo;
import com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryRequest;
import com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryResponse;
import com.bytedance.lark.pb.search.v2.BaseEnum;
import com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest;
import com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.NetworkUtils;
import com.ss.android.lark.pb.searches.ChatFilterParam;
import com.ss.android.lark.pb.searches.IntegrationSearchRequest;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.C53339b;
import com.ss.android.lark.search.p2584b.AbstractC53280a;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.p2634b.C53886b;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.C53953a;
import com.ss.android.lark.searchcommon.service.entity.request.MessageTag;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.service.p2638a.p2639a.C53904a;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53907b;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.LarkContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.search.b.b */
public class C53287b implements AbstractC53280a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.b.b$a */
    public static class C53297a {

        /* renamed from: a */
        public static final C53287b f131787a = new C53287b();
    }

    private C53287b() {
    }

    /* renamed from: a */
    public static C53287b m206193a() {
        return C53297a.f131787a;
    }

    /* renamed from: a */
    public void mo181881a(String str, String str2, int i, int i2, String str3, String str4, boolean z, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206205a(str2, str3, str4, str, i, i2, z), iGetDataCallback);
    }

    /* renamed from: a */
    private NetSearchRequest m206205a(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184543d(str3).mo184538a(str4).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_CHATTERS).mo184537a(NetSearchRequest.Filter.newBuilder().mo184525b(z).mo184522a()).mo184539a();
    }

    @Override // com.ss.android.lark.search.p2584b.AbstractC53280a
    /* renamed from: a */
    public void mo181835a(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, List<ActionType> list, IGetDataCallback<SearchResponse> iGetDataCallback) {
        IntegrationSearchRequest.SearchExtraParam searchExtraParam;
        if (!z3 || !CollectionUtils.isNotEmpty(list)) {
            searchExtraParam = null;
        } else {
            searchExtraParam = new IntegrationSearchRequest.SearchExtraParam.C18829a().mo64652a(new ChatterPermissionsRequest.C18817a().mo64609a(list).build()).build();
        }
        m206218b(NetSearchRequest.m209173a().mo184538a(str).mo184541b(str2).mo184533a(i).mo184540b(i2).mo184537a(NetSearchRequest.Filter.newBuilder().mo184525b(z).mo184528c(z2).mo184522a()).mo184536a(Scene.Type.SEARCH_USERS).mo184535a(searchExtraParam).mo184539a(), iGetDataCallback);
    }

    @Override // com.ss.android.lark.search.p2584b.AbstractC53280a
    /* renamed from: a */
    public void mo181834a(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206207a(NetSearchRequest.m209173a().mo184538a(str).mo184536a(Scene.Type.SEARCH_MESSAGES).mo184537a(NetSearchRequest.Filter.newBuilder().mo184520a(Collections.singletonList(str2)).mo184515a(i).mo184526c(j).mo184519a(str3).mo184531f(Collections.singletonList(MessageTag.PIN)).mo184522a()).mo184539a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181890a(String str, String str2, String str3, String str4, int i, int i2, NetSearchRequest.Filter filter, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206204a(str, str2, str3, str4, i, i2, filter), iGetDataCallback);
    }

    /* renamed from: a */
    private NetSearchRequest m206204a(String str, String str2, String str3, String str4, int i, int i2, NetSearchRequest.Filter filter) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184543d(str3).mo184538a(str4).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_CHATS_IN_ADVANCE_SCENE).mo184537a(filter).mo184539a();
    }

    /* renamed from: b */
    public void mo181897b(String str, String str2, String str3, String str4, int i, int i2, NetSearchRequest.Filter filter, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206216b(str, str2, str3, str4, i, i2, filter), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181886a(String str, String str2, String str3, int i, int i2, NetSearchRequest.Filter filter, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206202a(str, str2, str3, i, i2, filter), iGetDataCallback);
    }

    /* renamed from: a */
    private NetSearchRequest m206202a(String str, String str2, String str3, int i, int i2, NetSearchRequest.Filter filter) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184538a(str3).mo184533a(i).mo184540b(i2).mo184537a(filter).mo184536a(Scene.Type.SEARCH_LINK).mo184539a();
    }

    /* renamed from: b */
    public void mo181895b(String str, String str2, String str3, int i, int i2, NetSearchRequest.Filter filter, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206215b(str, str2, str3, i, i2, filter), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181889a(String str, String str2, String str3, String str4, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206203a(str, str2, str3, str4, i, i2), iGetDataCallback);
    }

    /* renamed from: a */
    private NetSearchRequest m206203a(String str, String str2, String str3, String str4, int i, int i2) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184543d(str3).mo184538a(str4).mo184533a(i).mo184540b(i2).mo184537a(NetSearchRequest.Filter.newBuilder().mo184518a(NetSearchRequest.ChatFilter.newBuilder().mo184514c(Collections.singletonList(ChatFilterParam.ChatMode.THREAD)).mo184512a()).mo184522a()).mo184536a(Scene.Type.SEARCH_THREAD).mo184539a();
    }

    /* renamed from: a */
    private NetSearchRequest m206201a(String str, String str2, String str3, int i, int i2) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184538a(str3).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_OPEN_APP_SCENE).mo184539a();
    }

    @Override // com.ss.android.lark.search.p2584b.AbstractC53280a
    /* renamed from: a */
    public void mo181832a(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206207a(NetSearchRequest.m209173a().mo184538a(str).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_SPACE).mo184539a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181883a(String str, String str2, int i, int i2, boolean z, boolean z2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        IntegrationSearchRequest.SearchExtraParam searchExtraParam;
        NetSearchRequest.Filter a = NetSearchRequest.Filter.newBuilder().mo184525b(z).mo184528c(true).mo184522a();
        if (z2) {
            searchExtraParam = new IntegrationSearchRequest.SearchExtraParam.C18829a().mo64652a(new ChatterPermissionsRequest.C18817a().mo64609a(Collections.singletonList(ActionType.INVITE_SAME_CHAT)).build()).build();
        } else {
            searchExtraParam = null;
        }
        m206218b(NetSearchRequest.m209173a().mo184541b(str).mo184538a(str2).mo184533a(i).mo184540b(i2).mo184537a(a).mo184536a(Scene.Type.SEARCH_IN_CALENDAR_SCENE).mo184535a(searchExtraParam).mo184539a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181893a(String str, String str2, boolean z, int i, int i2, boolean z2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        IntegrationSearchRequest.SearchExtraParam searchExtraParam;
        NetSearchRequest.Filter.C53951a b = NetSearchRequest.Filter.newBuilder().mo184525b(z);
        if (z2) {
            searchExtraParam = new IntegrationSearchRequest.SearchExtraParam.C18829a().mo64652a(new ChatterPermissionsRequest.C18817a().mo64609a(Collections.singletonList(ActionType.CREATE_P2P_CHAT)).build()).build();
        } else {
            searchExtraParam = null;
        }
        m206218b(NetSearchRequest.m209173a().mo184538a(str).mo184541b(str2).mo184533a(i).mo184540b(i2).mo184537a(b.mo184522a()).mo184536a(Scene.Type.TRANSMIT_MESSAGES).mo184535a(searchExtraParam).mo184539a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181892a(String str, String str2, boolean z, int i, int i2, List<ChatFilterParam.ChatMode> list, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(NetSearchRequest.m209173a().mo184538a(str2).mo184541b(str).mo184533a(i).mo184540b(i2).mo184537a(NetSearchRequest.Filter.newBuilder().mo184525b(z).mo184518a(NetSearchRequest.ChatFilter.newBuilder().mo184514c(list).mo184512a()).mo184522a()).mo184536a(Scene.Type.SEARCH_CHATS).mo184539a(), iGetDataCallback);
    }

    /* renamed from: b */
    public void mo181898b(String str, String str2, boolean z, int i, int i2, List<ChatFilterParam.ChatMode> list, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(NetSearchRequest.m209173a().mo184541b(str).mo184538a(str2).mo184533a(i).mo184540b(i2).mo184537a(NetSearchRequest.Filter.newBuilder().mo184525b(z).mo184518a(NetSearchRequest.ChatFilter.newBuilder().mo184514c(list).mo184512a()).mo184522a()).mo184536a(Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE).mo184539a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181882a(final String str, final String str2, final int i, final int i2, List<String> list, boolean z, AbstractC53280a.C53281a aVar, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        if (aVar.mo181840b()) {
            arrayList.add(ActionType.INVITE_SAME_CRYPTO_CHAT);
        } else if (aVar.mo181842c()) {
            arrayList.add(ActionType.INVITE_SAME_CROSS_TENANT_CHAT);
        } else if (aVar.mo181838a()) {
            arrayList.add(ActionType.INVITE_SAME_CHAT);
        }
        IntegrationSearchRequest.SearchExtraParam searchExtraParam = null;
        if (!arrayList.isEmpty()) {
            searchExtraParam = new IntegrationSearchRequest.SearchExtraParam.C18829a().mo64652a(new ChatterPermissionsRequest.C18817a().mo64609a(arrayList).build()).build();
        }
        m206218b(NetSearchRequest.m209173a().mo184538a(str).mo184541b(str2).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.ADD_CHAT_CHATTERS).mo184537a(NetSearchRequest.Filter.newBuilder().mo184520a(list).mo184525b(z).mo184522a()).mo184535a(searchExtraParam).mo184539a(), new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532881 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                if (i == 0 && searchResponse.isEmpty()) {
                    C53886b.m208806d(str);
                }
                iGetDataCallback.onSuccess(searchResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53886b.m208807e(str);
                C53287b.this.mo181879a(str, str2, i, i2, (UniformLocalSearchRequest.ChatterFilterParam) null, iGetDataCallback);
            }
        });
    }

    /* renamed from: a */
    public void mo181891a(String str, String str2, final String str3, final String str4, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        C53258a.m205939a().mo181765n().mo181822a(str, str2, new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532914 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                searchResponse.setImprId(str3);
                searchResponse.setSession(str4);
                iGetDataCallback.onSuccess(searchResponse);
            }
        });
    }

    /* renamed from: a */
    public void mo181888a(String str, String str2, String str3, String str4, int i, int i2, SlashCommandParam slashCommandParam, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(NetSearchRequest.m209173a().mo184536a(Scene.Type.SEARCH_OPEN_SEARCH_SCENE).mo184534a(slashCommandParam).mo184542c(str3).mo184543d(str4).mo184538a(str2).mo184541b(str).mo184533a(i).mo184540b(i2).mo184539a(), iGetDataCallback);
    }

    /* renamed from: b */
    public void mo181896b(String str, String str2, String str3, String str4, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206200a(str, str2, i, i2, str3, str4), iGetDataCallback);
    }

    /* renamed from: a */
    private NetSearchRequest m206200a(String str, String str2, int i, int i2, String str3, String str4) {
        return NetSearchRequest.m209173a().mo184536a(Scene.Type.SMART_SEARCH).mo184542c(str3).mo184543d(str4).mo184541b(str).mo184538a(str2).mo184537a(NetSearchRequest.Filter.newBuilder().mo184525b(true).mo184522a()).mo184533a(i).mo184540b(i2).mo184539a();
    }

    /* renamed from: a */
    private void m206207a(NetSearchRequest netSearchRequest, IGetDataCallback<SearchResponse> iGetDataCallback) {
        if (!NetworkUtils.m94915b(LarkContext.getApplication())) {
            SearchResponse searchResponse = new SearchResponse();
            searchResponse.setQuery(netSearchRequest.f133320a);
            searchResponse.setRequestId(netSearchRequest.f133321b);
            searchResponse.setFrom(1);
            iGetDataCallback.onSuccess(searchResponse);
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.INTEGRATION_SEARCH, m206186a(netSearchRequest), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.search.p2584b.$$Lambda$b$gV4SoYeWZ9Namh2DVoVLVsYERyI */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C53287b.m206213b(NetSearchRequest.this, bArr);
            }
        });
    }

    /* renamed from: b */
    private void m206218b(NetSearchRequest netSearchRequest, IGetDataCallback<SearchResponse> iGetDataCallback) {
        if (!NetworkUtils.m94915b(LarkContext.getApplication())) {
            SearchResponse searchResponse = new SearchResponse();
            searchResponse.setQuery(netSearchRequest.f133320a);
            searchResponse.setRequestId(netSearchRequest.f133321b);
            searchResponse.setFrom(1);
            iGetDataCallback.onSuccess(searchResponse);
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.INTEGRATION_SEARCH, m206186a(netSearchRequest), netSearchRequest.f133321b, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.search.p2584b.$$Lambda$b$A56rBmbVPvuJKFNFWuZg3N9MrE */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C53287b.m206194a(NetSearchRequest.this, bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo181878a(String str, String str2, int i, int i2, LocalIntegrationSearchRequest.FilterParam filterParam, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206208a(C53953a.m209208a().mo184551a(str).mo184554b(str2).mo184544a(i).mo184553b(i2).mo184550a(Scene.Type.SEARCH_CHATS).mo184545a(filterParam).mo184552a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181880a(String str, String str2, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206208a(C53953a.m209208a().mo184551a(str).mo184554b(str2).mo184544a(i).mo184553b(i2).mo184550a(Scene.Type.SEARCH_CHATTERS).mo184552a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181884a(String str, String str2, LocalIntegrationSearchRequest.FilterParam filterParam, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206208a(C53953a.m209208a().mo184551a(str).mo184554b(str2).mo184544a(i).mo184553b(i2).mo184550a(Scene.Type.SEARCH_MESSAGES).mo184545a(filterParam).mo184552a(), iGetDataCallback);
    }

    /* renamed from: a */
    private void m206208a(final C53953a aVar, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        LinkedHashMap<Integer, C53953a> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(Integer.valueOf(aVar.f133367b.getNumber()), aVar);
        m206210a(linkedHashMap, new IGetDataCallback<LinkedHashMap<Integer, SearchResponse>>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532925 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(LinkedHashMap<Integer, SearchResponse> linkedHashMap) {
                if (CollectionUtils.isEmpty(linkedHashMap)) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                SearchResponse searchResponse = linkedHashMap.get(Integer.valueOf(aVar.f133367b.getNumber()));
                if (searchResponse == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("local search failed: occurs in search: " + SearchCommonUtils.m209231b(aVar.f133366a)));
                        return;
                    }
                    return;
                }
                searchResponse.setQuery(aVar.f133366a);
                searchResponse.setRequestId(aVar.f133375j);
                searchResponse.setScene(aVar.f133367b);
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onSuccess(searchResponse);
                }
            }
        });
    }

    /* renamed from: a */
    private void m206210a(LinkedHashMap<Integer, C53953a> linkedHashMap, IGetDataCallback<LinkedHashMap<Integer, SearchResponse>> iGetDataCallback) {
        if (C53339b.m206441a()) {
            iGetDataCallback.onSuccess(new LinkedHashMap<>());
        } else if (!CollectionUtils.isEmpty(linkedHashMap)) {
            final ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
            Iterator<C53953a> it = linkedHashMap.values().iterator();
            final String str = it.hasNext() ? it.next().f133366a : "";
            SdkSender.asynSendRequestNonWrap(Command.MULTI_LOCAL_SEARCH, m206188a(linkedHashMap), iGetDataCallback, new SdkSender.IParser<LinkedHashMap<Integer, SearchResponse>>() {
                /* class com.ss.android.lark.search.p2584b.C53287b.C532936 */

                /* renamed from: a */
                public LinkedHashMap<Integer, SearchResponse> parse(byte[] bArr) throws IOException {
                    return C53907b.m208929a(str, arrayList, MultiLocalIntegrationSearchResponse.ADAPTER.decode(bArr));
                }
            });
        }
    }

    @Override // com.ss.android.lark.search.p2584b.AbstractC53280a
    /* renamed from: a */
    public void mo181833a(String str, Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback) {
        mo181887a(str, "", "", scene, list, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181887a(String str, String str2, String str3, Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback) {
        if (!CollectionUtils.isEmpty(list)) {
            SearchFeedbackRequest.C18877a a = new SearchFeedbackRequest.C18877a().mo64774a(str);
            if (scene != null) {
                a.mo64773a(new Scene.C18851a().mo64716a(Scene.Type.fromValue(scene.getType().getNumber())).mo64717a(scene.getSceneId()).build());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new SearchFeedbackRequest.Feedback.C18875a().mo64767a(Integer.valueOf(list.get(i).mo183888a())).mo64766a(EntityType.fromValue(list.get(i).mo183889b())).mo64768a(list.get(i).mo183890c()).build());
            }
            a.mo64775a(arrayList);
            if (!C57782ag.m224241a(str2)) {
                a.mo64777b(str2);
            }
            if (!C57782ag.m224241a(str3)) {
                a.mo64778c(str3);
            }
            SdkSender.asynSendRequestNonWrap(Command.SEARCH_FEEDBACK, a, iGetDataCallback, new SdkSender.IParser<Void>() {
                /* class com.ss.android.lark.search.p2584b.C53287b.C532947 */

                /* renamed from: a */
                public Void parse(byte[] bArr) throws IOException {
                    return null;
                }
            });
        }
    }

    /* renamed from: a */
    public static List<SearchInfoHistory> m206206a(List<SearchHistoryInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<SearchHistoryInfo, SearchInfoHistory>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532958 */

            /* renamed from: a */
            public SearchInfoHistory get(SearchHistoryInfo searchHistoryInfo) {
                SearchInfoHistory searchInfoHistory = new SearchInfoHistory();
                searchInfoHistory.setFilter(C53287b.m206198a(searchHistoryInfo.filter_param));
                if (searchHistoryInfo.filter_param != null) {
                    searchInfoHistory.setChatFilter(C53287b.m206196a(searchHistoryInfo.filter_param.chat_filter_param));
                }
                searchInfoHistory.setHistorySource(SearchCommonConstants.SearchHistorySource.forNumber(searchHistoryInfo.source.getValue()));
                if (searchHistoryInfo.message_sub_source == null) {
                    searchInfoHistory.setMessageSubSource(new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL));
                } else {
                    searchInfoHistory.setMessageSubSource(new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.forNumber(searchHistoryInfo.message_sub_source.type.getValue())));
                }
                searchInfoHistory.setId(searchHistoryInfo.id);
                searchInfoHistory.setQuery(searchHistoryInfo.query);
                return searchInfoHistory;
            }
        });
    }

    /* renamed from: a */
    public static NetSearchRequest.ChatFilter m206196a(ChatFilterParam chatFilterParam) {
        if (chatFilterParam == null) {
            return NetSearchRequest.ChatFilter.newBuilder().mo184512a();
        }
        return NetSearchRequest.ChatFilter.newBuilder().mo184510a(chatFilterParam.chat_message_key).mo184513b(new ArrayList(chatFilterParam.chat_member_ids)).mo184511a(m206217b(chatFilterParam.chat_types)).mo184514c(chatFilterParam.chat_modes).mo184512a();
    }

    /* renamed from: a */
    public static NetSearchRequest.Filter m206198a(IntegrationSearchRequest.FilterParam filterParam) {
        if (filterParam == null) {
            return NetSearchRequest.Filter.newBuilder().mo184522a();
        }
        return NetSearchRequest.Filter.newBuilder().mo184520a(filterParam.chat_ids).mo184524b(filterParam.email_ids).mo184527c(filterParam.doc_types).mo184530e(filterParam.doc_creator_ids).mo184529d(filterParam.message_creator_ids).mo184516a(filterParam.message_start_time.longValue()).mo184523b(filterParam.message_end_time.longValue()).mo184519a(filterParam.last_message_id).mo184526c(filterParam.last_create_time.longValue()).mo184515a(filterParam.count.intValue()).mo184521a(filterParam.reverse.booleanValue()).mo184518a(m206196a(filterParam.chat_filter_param)).mo184525b(filterParam.need_search_outer_tenant.booleanValue()).mo184532g(filterParam.message_to_ids).mo184522a();
    }

    /* renamed from: a */
    public void mo181876a(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_ALL_SEARCH_INFOS_HISTORY, new DeleteAllSearchInfosHistoryRequest.C18819a(), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532969 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                DeleteAllSearchInfosHistoryResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo181877a(SearchInfoHistory searchInfoHistory, IGetDataCallback<String> iGetDataCallback) {
        SetSearchInfoHistoryRequest.C18929a aVar = new SetSearchInfoHistoryRequest.C18929a();
        aVar.mo64889a(m206192a(searchInfoHistory));
        SdkSender.asynSendRequestNonWrap(Command.SET_SEARCH_INFO_HISTORY, aVar, iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.AnonymousClass10 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                SetSearchInfoHistoryResponse decode = SetSearchInfoHistoryResponse.ADAPTER.decode(bArr);
                if (!C57782ag.m224241a(decode.id)) {
                    return decode.id;
                }
                C53241h.m205894a("LarkSearch.Search.SearchService", "id is empty");
                return "";
            }
        });
    }

    /* renamed from: b */
    private void m206219b(C53953a aVar, IGetDataCallback<SearchResponse> iGetDataCallback) {
        if (C53339b.m206441a()) {
            SearchResponse searchResponse = new SearchResponse();
            searchResponse.setQuery(aVar.f133366a);
            searchResponse.setRequestId("");
            searchResponse.setFrom(0);
            searchResponse.setImprId("");
            iGetDataCallback.onSuccess(searchResponse);
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.UNIFORM_LOCAL_SEARCH, m206212b(aVar), aVar.f133375j, iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.search.p2584b.$$Lambda$b$ntOX9sCaeyGwWqjvFGfqYUg151s */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return C53287b.m206195a(C53953a.this, bArr);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SearchResponse m206195a(C53953a aVar, byte[] bArr) throws IOException {
        return C53907b.m208924a(aVar, UniformLocalSearchResponse.ADAPTER.decode(bArr));
    }

    /* renamed from: a */
    private void m206209a(String str, BaseEnum.LocalAbility localAbility, String str2, int i, int i2, UniformLocalSearchRequest.ChatterFilterParam chatterFilterParam, UniformLocalSearchRequest.ChatFilterParam chatFilterParam, UniformLocalSearchRequest.MessageFilterParam messageFilterParam, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206219b(C53953a.m209208a().mo184551a(str).mo184546a(localAbility).mo184554b(str2).mo184544a(i).mo184553b(i2).mo184548a(chatterFilterParam).mo184547a(chatFilterParam).mo184549a(messageFilterParam).mo184552a(), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo181879a(final String str, String str2, int i, int i2, UniformLocalSearchRequest.ChatterFilterParam chatterFilterParam, final IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206209a(str, BaseEnum.LocalAbility.CHATTER, str2, i, i2, chatterFilterParam, (UniformLocalSearchRequest.ChatFilterParam) null, (UniformLocalSearchRequest.MessageFilterParam) null, new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.AnonymousClass11 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                iGetDataCallback.onSuccess(searchResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53886b.m208808f(str);
                iGetDataCallback.onError(errorResult);
            }
        });
    }

    /* renamed from: a */
    public static NetSearchRequest.Filter m206199a(IntegrationSearchRequest.FilterParam filterParam) {
        if (filterParam == null) {
            return NetSearchRequest.Filter.newBuilder().mo184522a();
        }
        return NetSearchRequest.Filter.newBuilder().mo184520a(filterParam.mchat_ids).mo184524b(filterParam.memail_ids).mo184527c(filterParam.mdoc_types).mo184530e(filterParam.mdoc_creator_ids).mo184529d(filterParam.mmessage_creator_ids).mo184516a(filterParam.mmessage_start_time.longValue()).mo184523b(filterParam.mmessage_end_time.longValue()).mo184519a(filterParam.mlast_message_id).mo184526c(filterParam.mlast_create_time.longValue()).mo184515a(filterParam.mcount.intValue()).mo184521a(filterParam.mreverse.booleanValue()).mo184518a(m206197a(filterParam.mchat_filter_param)).mo184525b(filterParam.mneed_search_outer_tenant.booleanValue()).mo184532g(filterParam.mmessage_to_ids).mo184522a();
    }

    /* renamed from: a */
    public static NetSearchRequest.ChatFilter m206197a(com.ss.android.lark.pb.searches.ChatFilterParam chatFilterParam) {
        if (chatFilterParam == null) {
            return NetSearchRequest.ChatFilter.newBuilder().mo184512a();
        }
        return NetSearchRequest.ChatFilter.newBuilder().mo184510a(chatFilterParam.mchat_message_key).mo184513b(new ArrayList(chatFilterParam.mchat_member_ids)).mo184511a(m206221d(chatFilterParam.mchat_types)).mo184514c(m206222e(chatFilterParam.mchat_modes)).mo184512a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.search.b.b$3 */
    public static /* synthetic */ class C532903 {

        /* renamed from: a */
        static final /* synthetic */ int[] f131774a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.pb.searches.SearchHistoryInfo$TabType[] r0 = com.ss.android.lark.pb.searches.SearchHistoryInfo.TabType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.search.p2584b.C53287b.C532903.f131774a = r0
                com.ss.android.lark.pb.searches.SearchHistoryInfo$TabType r1 = com.ss.android.lark.pb.searches.SearchHistoryInfo.TabType.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.search.p2584b.C53287b.C532903.f131774a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.searches.SearchHistoryInfo$TabType r1 = com.ss.android.lark.pb.searches.SearchHistoryInfo.TabType.LINK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.search.p2584b.C53287b.C532903.f131774a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.pb.searches.SearchHistoryInfo$TabType r1 = com.ss.android.lark.pb.searches.SearchHistoryInfo.TabType.FILE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.p2584b.C53287b.C532903.<clinit>():void");
        }
    }

    /* renamed from: a */
    private SearchHistoryInfo.MainSubSource m206189a(SearchInfoHistory.MainSubSource mainSubSource) {
        if (mainSubSource == null) {
            return null;
        }
        return new SearchHistoryInfo.MainSubSource();
    }

    /* renamed from: a */
    private SearchHistoryInfo.MessageSubSource m206190a(SearchInfoHistory.MessageSubSource messageSubSource) {
        if (messageSubSource == null) {
            return null;
        }
        return new SearchHistoryInfo.MessageSubSource(SearchHistoryInfo.MessageSubSource.Type.fromValue(messageSubSource.getType().getNumber()));
    }

    /* renamed from: c */
    public static List<SearchInfoHistory> m206220c(List<com.ss.android.lark.pb.searches.SearchHistoryInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<com.ss.android.lark.pb.searches.SearchHistoryInfo, SearchInfoHistory>() {
            /* class com.ss.android.lark.search.p2584b.C53287b.C532892 */

            /* renamed from: a */
            public SearchInfoHistory get(com.ss.android.lark.pb.searches.SearchHistoryInfo searchHistoryInfo) {
                SearchInfoHistory searchInfoHistory = new SearchInfoHistory();
                if (searchHistoryInfo.mfilter_param != null) {
                    searchInfoHistory.setFilter(C53287b.m206199a(searchHistoryInfo.mfilter_param));
                    if (searchHistoryInfo.mfilter_param.mchat_filter_param != null) {
                        searchInfoHistory.setChatFilter(C53287b.m206197a(searchHistoryInfo.mfilter_param.mchat_filter_param));
                    }
                }
                searchInfoHistory.setHistorySource(SearchCommonConstants.SearchHistorySource.forNumber(searchHistoryInfo.msrc.getValue()));
                SearchInfoHistory.MessageSubSource messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
                if (searchHistoryInfo.mtab_type != null) {
                    int i = C532903.f131774a[searchHistoryInfo.mtab_type.ordinal()];
                    if (i == 1) {
                        messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL);
                    } else if (i == 2) {
                        messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.LINK);
                    } else if (i == 3) {
                        messageSubSource = new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.FILE);
                    }
                }
                searchInfoHistory.setMessageSubSource(messageSubSource);
                searchInfoHistory.setId(searchHistoryInfo.mid);
                searchInfoHistory.setQuery(searchHistoryInfo.mquery);
                return searchInfoHistory;
            }
        });
    }

    /* renamed from: a */
    private LocalIntegrationSearchRequest m206187a(C53953a aVar) {
        return new LocalIntegrationSearchRequest.C18837a().mo64684a(aVar.f133366a).mo64683a(Integer.valueOf(aVar.f133368c)).mo64686b(Integer.valueOf(aVar.f133369d)).mo64681a(aVar.f133370e).mo64682a(Scene.Type.fromValue(aVar.f133367b.getNumber())).build();
    }

    /* renamed from: b */
    private UniformLocalSearchRequest.C19055a m206212b(C53953a aVar) {
        UniformLocalSearchRequest.C19055a aVar2 = new UniformLocalSearchRequest.C19055a();
        aVar2.mo65208a(aVar.f133366a);
        aVar2.mo65207a(Integer.valueOf(aVar.f133368c));
        aVar2.mo65210b(Integer.valueOf(aVar.f133369d));
        aVar2.mo65203a(aVar.f133374i);
        aVar2.mo65204a(aVar.f133371f);
        aVar2.mo65205a(aVar.f133372g);
        aVar2.mo65206a(aVar.f133373h);
        return aVar2;
    }

    /* renamed from: d */
    public static List<ChatType> m206221d(List<ChatFilterParam.ChatType> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatFilterParam.ChatType chatType : list) {
            arrayList.add(ChatType.forNumber(chatType.getValue()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static List<ChatFilterParam.ChatMode> m206222e(List<ChatFilterParam.ChatMode> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatFilterParam.ChatMode chatMode : list) {
            arrayList.add(ChatFilterParam.ChatMode.fromValue(chatMode.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private MultiLocalIntegrationSearchRequest.C18847a m206188a(LinkedHashMap<Integer, C53953a> linkedHashMap) {
        MultiLocalIntegrationSearchRequest.C18847a aVar = new MultiLocalIntegrationSearchRequest.C18847a();
        ArrayList arrayList = new ArrayList();
        for (C53953a aVar2 : linkedHashMap.values()) {
            arrayList.add(m206187a(aVar2));
        }
        aVar.mo64707a(arrayList);
        return aVar;
    }

    /* renamed from: b */
    private IntegrationSearchRequest.FilterParam m206211b(SearchInfoHistory searchInfoHistory) {
        NetSearchRequest.Filter filter = searchInfoHistory.getFilter();
        if (filter == null) {
            return new IntegrationSearchRequest.FilterParam.C18827a().build();
        }
        IntegrationSearchRequest.FilterParam.C18827a aVar = new IntegrationSearchRequest.FilterParam.C18827a();
        NetSearchRequest.ChatFilter chatFilter = filter.chatFilter;
        if (chatFilter != null) {
            aVar.mo64631a(C53904a.m208914a(chatFilter));
        }
        return aVar.mo64636a(filter.chatIds).mo64640b(filter.emailIds).mo64645e(filter.docTypes).mo64644d(filter.docCreatorIds).mo64643c(filter.messageCreatorIds).mo64634a(Long.valueOf(filter.messageStartTime)).mo64639b(Long.valueOf(filter.messageEndTime)).mo64632a(Boolean.valueOf(filter.needSearchOuterTenant)).mo64647g(filter.msgReceiverIds).build();
    }

    /* renamed from: a */
    private SearchHistoryInfo.SpaceSubSource m206191a(SearchInfoHistory.SpaceSubSource spaceSubSource) {
        if (spaceSubSource == null) {
            return null;
        }
        return new SearchHistoryInfo.SpaceSubSource();
    }

    /* renamed from: a */
    private IntegrationSearchRequest.C18831a m206186a(NetSearchRequest netSearchRequest) {
        IntegrationSearchRequest.C18831a a = new IntegrationSearchRequest.C18831a().mo64662a(netSearchRequest.f133320a).mo64661a(Integer.valueOf(netSearchRequest.f133327h)).mo64664b(Integer.valueOf(netSearchRequest.f133328i)).mo64660a(Scene.Type.fromValue(netSearchRequest.f133323d.getNumber()));
        if (!C57782ag.m224241a(netSearchRequest.f133322c)) {
            a.mo64665b(netSearchRequest.f133322c);
        }
        if (!C57782ag.m224241a(netSearchRequest.f133326g)) {
            a.mo64666c(netSearchRequest.f133326g);
        }
        if (netSearchRequest.f133324e != null) {
            a.mo64659a(netSearchRequest.f133324e);
        }
        if (netSearchRequest.f133325f != null) {
            a.mo64657a(netSearchRequest.f133325f);
        }
        if (!C57782ag.m224241a(netSearchRequest.f133330k)) {
            a.mo64667d(netSearchRequest.f133330k);
        }
        C53241h.m205899c("LarkSearch.Search.SearchService", "getIntegrationSearchRequestBuilder, " + netSearchRequest.f133330k);
        if (netSearchRequest.f133329j == null) {
            return a;
        }
        return a.mo64658a(new IntegrationSearchRequest.FilterParam.C18827a().mo64636a(netSearchRequest.f133329j.chatIds).mo64640b(netSearchRequest.f133329j.emailIds).mo64645e(netSearchRequest.f133329j.docTypes).mo64644d(netSearchRequest.f133329j.docCreatorIds).mo64643c(netSearchRequest.f133329j.messageCreatorIds).mo64634a(Long.valueOf(netSearchRequest.f133329j.messageStartTime)).mo64639b(Long.valueOf(netSearchRequest.f133329j.messageEndTime)).mo64635a(netSearchRequest.f133329j.lastMessageId).mo64642c(Long.valueOf(netSearchRequest.f133329j.lastCreateTime)).mo64633a(Integer.valueOf(netSearchRequest.f133329j.count)).mo64638b(Boolean.valueOf(netSearchRequest.f133329j.reverse)).mo64632a(Boolean.valueOf(netSearchRequest.f133329j.needSearchOuterTenant)).mo64641c(Boolean.valueOf(netSearchRequest.f133329j.doNotSearchResignedUser)).mo64646f(netSearchRequest.f133329j.threadIds).mo64647g(netSearchRequest.f133329j.msgReceiverIds).mo64631a(C53904a.m208914a(netSearchRequest.f133329j.chatFilter)).mo64630a(C53904a.m208913a(netSearchRequest.f133329j.calendarFilter)).mo64648h(C53904a.m208915a(netSearchRequest.f133329j.messageTags)).build());
    }

    /* renamed from: a */
    private SearchHistoryInfo m206192a(SearchInfoHistory searchInfoHistory) {
        return new SearchHistoryInfo(searchInfoHistory.getQuery(), m206211b(searchInfoHistory), searchInfoHistory.getId(), SearchHistoryInfo.Source.fromValue(searchInfoHistory.getHistorySource().getNumber()), new ArrayList(), m206189a(searchInfoHistory.getMainSubSource()), m206190a(searchInfoHistory.getMessageSubSource()), m206191a(searchInfoHistory.getSpaceSubSource()), null);
    }

    /* renamed from: b */
    public static List<ChatType> m206217b(List<ChatFilterParam.ChatType> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatFilterParam.ChatType chatType : list) {
            arrayList.add(ChatType.forNumber(chatType.getValue()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ SearchResponse m206213b(NetSearchRequest netSearchRequest, byte[] bArr) throws IOException {
        return C53907b.m208923a(netSearchRequest, IntegrationSearchResponse.ADAPTER.decode(bArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SearchResponse m206194a(NetSearchRequest netSearchRequest, byte[] bArr) throws IOException {
        return C53907b.m208923a(netSearchRequest, IntegrationSearchResponse.ADAPTER.decode(bArr));
    }

    @Override // com.ss.android.lark.search.p2584b.AbstractC53280a
    /* renamed from: b */
    public void mo181836b(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206207a(m206214b("", "", str, i, i2), iGetDataCallback);
    }

    /* renamed from: b */
    private NetSearchRequest m206214b(String str, String str2, String str3, int i, int i2) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184538a(str3).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_HELP_DESK).mo184539a();
    }

    /* renamed from: a */
    public void mo181885a(String str, String str2, String str3, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206201a(str, str2, str3, i, i2), iGetDataCallback);
    }

    /* renamed from: b */
    public void mo181894b(String str, String str2, String str3, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        m206218b(m206214b(str, str2, str3, i, i2), iGetDataCallback);
    }

    /* renamed from: b */
    private NetSearchRequest m206215b(String str, String str2, String str3, int i, int i2, NetSearchRequest.Filter filter) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184538a(str3).mo184533a(i).mo184540b(i2).mo184537a(filter).mo184536a(Scene.Type.SEARCH_FILE).mo184539a();
    }

    /* renamed from: b */
    private NetSearchRequest m206216b(String str, String str2, String str3, String str4, int i, int i2, NetSearchRequest.Filter filter) {
        return NetSearchRequest.m209173a().mo184541b(str).mo184542c(str2).mo184543d(str3).mo184538a(str4).mo184533a(i).mo184540b(i2).mo184536a(Scene.Type.SEARCH_MESSAGES).mo184537a(filter).mo184539a();
    }
}
