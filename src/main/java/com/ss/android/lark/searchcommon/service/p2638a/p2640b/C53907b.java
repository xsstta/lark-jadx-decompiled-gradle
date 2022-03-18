package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import android.util.SparseArray;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.search.v1.IntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchResponse;
import com.bytedance.lark.pb.search.v1.MultiLocalIntegrationSearchResponse;
import com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53947b;
import com.ss.android.lark.searchcommon.service.entity.request.C53953a;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.service.p2645c.AbstractC53928d;
import com.ss.android.lark.searchcommon.service.p2645c.C53926b;
import com.ss.android.lark.searchcommon.service.p2645c.C53927c;
import com.ss.android.lark.searchcommon.service.p2645c.C53930e;
import com.ss.android.lark.searchcommon.service.p2645c.C53931f;
import com.ss.android.lark.searchcommon.service.p2645c.C53932g;
import com.ss.android.lark.searchcommon.service.p2645c.C53933h;
import com.ss.android.lark.searchcommon.service.p2645c.C53934i;
import com.ss.android.lark.searchcommon.service.p2645c.C53935j;
import com.ss.android.lark.searchcommon.service.p2645c.C53936k;
import com.ss.android.lark.searchcommon.service.p2645c.C53937l;
import com.ss.android.lark.searchcommon.service.p2645c.C53938m;
import com.ss.android.lark.searchcommon.service.p2645c.C53939n;
import com.ss.android.lark.searchcommon.service.p2645c.C53940o;
import com.ss.android.lark.searchcommon.service.p2645c.C53941p;
import com.ss.android.lark.searchcommon.service.p2645c.C53942q;
import com.ss.android.lark.searchcommon.service.p2645c.C53943r;
import com.ss.android.lark.searchcommon.service.p2645c.C53944s;
import com.ss.android.lark.searchcommon.service.p2645c.C53945t;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.b */
public class C53907b {

    /* renamed from: a */
    private static SparseArray<AbstractC53928d> f133207a = new SparseArray<>();

    static {
        m208931b();
    }

    /* renamed from: a */
    public static C53940o m208925a() {
        return (C53940o) f133207a.get(Scene.Type.SMART_SEARCH.getNumber());
    }

    /* renamed from: b */
    private static void m208931b() {
        f133207a.put(Scene.Type.SEARCH_CHATTERS.getNumber(), new C53933h());
        f133207a.put(Scene.Type.SEARCH_CHATS.getNumber(), new C53932g());
        f133207a.put(Scene.Type.SEARCH_MESSAGES.getNumber(), new C53937l());
        f133207a.put(Scene.Type.SEARCH_SPACE.getNumber(), new C53941p());
        f133207a.put(Scene.Type.ADD_CHAT_CHATTERS.getNumber(), new C53926b());
        f133207a.put(Scene.Type.TRANSMIT_MESSAGES.getNumber(), new C53943r());
        f133207a.put(Scene.Type.SEARCH_USERS.getNumber(), new C53944s());
        f133207a.put(Scene.Type.SMART_SEARCH.getNumber(), new C53940o());
        f133207a.put(Scene.Type.SEARCH_IN_CALENDAR_SCENE.getNumber(), new C53927c());
        f133207a.put(Scene.Type.SEARCH_HELP_DESK.getNumber(), new C53935j());
        f133207a.put(Scene.Type.SEARCH_THREAD.getNumber(), new C53942q());
        f133207a.put(Scene.Type.SEARCH_OPEN_APP_SCENE.getNumber(), new C53938m());
        f133207a.put(Scene.Type.SEARCH_LINK.getNumber(), new C53936k());
        f133207a.put(Scene.Type.SEARCH_FILE.getNumber(), new C53934i());
        f133207a.put(Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE.getNumber(), new C53930e());
        f133207a.put(Scene.Type.SEARCH_CHATS_IN_ADVANCE_SCENE.getNumber(), new C53931f());
        f133207a.put(Scene.Type.SEARCH_OPEN_SEARCH_SCENE.getNumber(), new C53939n());
    }

    /* renamed from: a */
    public static FileContent m208922a(File file) {
        FileContent fileContent = new FileContent();
        fileContent.setFilePath(file.path);
        fileContent.setKey(file.key);
        fileContent.setName(file.name);
        fileContent.setMime(file.mime);
        fileContent.setSize(file.size.longValue());
        if (!(file.extra == null || file.extra.source == null)) {
            fileContent.setSource(file.extra.source.getValue());
        }
        return fileContent;
    }

    /* renamed from: b */
    public static FolderContent m208930b(File file) {
        FolderContent folderContent = new FolderContent();
        folderContent.setKey(file.key);
        folderContent.setName(file.name);
        folderContent.setSize(file.size.longValue());
        if (!(file.extra == null || file.extra.source == null)) {
            folderContent.setSource(file.extra.source.getValue());
        }
        return folderContent;
    }

    /* renamed from: a */
    public static C53947b m208926a(IntegrationSearchResponse integrationSearchResponse) {
        C53947b bVar = new C53947b();
        bVar.mo184465a(integrationSearchResponse.chatters);
        bVar.mo184467b(integrationSearchResponse.chats);
        bVar.mo184469c(integrationSearchResponse.messages);
        bVar.mo184471d(integrationSearchResponse.docs);
        bVar.mo184473e(integrationSearchResponse.threads);
        bVar.mo184475f(integrationSearchResponse.oncalls);
        bVar.mo184477g(integrationSearchResponse.doc_feeds);
        bVar.mo184479h(integrationSearchResponse.crypto_p2p_chats);
        bVar.mo184481i(integrationSearchResponse.open_apps);
        bVar.mo184483j(integrationSearchResponse.links);
        bVar.mo184485k(integrationSearchResponse.wikis);
        bVar.mo184486l(integrationSearchResponse.mails);
        bVar.mo184487m(integrationSearchResponse.slash_commands);
        return bVar;
    }

    /* renamed from: a */
    public static C53947b m208927a(LocalIntegrationSearchResponse localIntegrationSearchResponse) {
        C53947b bVar = new C53947b();
        bVar.mo184465a(localIntegrationSearchResponse.chatters);
        bVar.mo184467b(localIntegrationSearchResponse.chats);
        bVar.mo184469c(localIntegrationSearchResponse.messages);
        bVar.mo184471d(localIntegrationSearchResponse.docs);
        bVar.mo184473e(localIntegrationSearchResponse.threads);
        bVar.mo184477g(localIntegrationSearchResponse.doc_feeds);
        return bVar;
    }

    /* renamed from: a */
    public static C53947b m208928a(UniformLocalSearchResponse uniformLocalSearchResponse) {
        C53947b bVar = new C53947b();
        bVar.mo184465a(uniformLocalSearchResponse.chatters);
        bVar.mo184467b(uniformLocalSearchResponse.chats);
        bVar.mo184469c(uniformLocalSearchResponse.messages);
        bVar.mo184473e(uniformLocalSearchResponse.threads);
        return bVar;
    }

    /* renamed from: a */
    public static SearchResponse m208924a(C53953a aVar, UniformLocalSearchResponse uniformLocalSearchResponse) {
        SearchResponse a = new C53945t().mo184360a(uniformLocalSearchResponse);
        a.setQuery(aVar.f133366a);
        a.setRequestId(aVar.f133375j);
        a.setFrom(0);
        return a;
    }

    /* renamed from: a */
    public static SearchResponse m208923a(NetSearchRequest netSearchRequest, IntegrationSearchResponse integrationSearchResponse) {
        SearchResponse a = f133207a.get(netSearchRequest.f133323d.getNumber()).mo184363a(integrationSearchResponse);
        a.setQuery(netSearchRequest.f133320a);
        a.setSession(netSearchRequest.f133322c);
        Log.m165379d("LarkSearch.Common.ModelParserSearch", "getIntegrationSearchResponse, set req id: " + netSearchRequest.f133321b + " from: " + netSearchRequest);
        a.setRequestId(netSearchRequest.f133321b);
        a.setFrom(1);
        a.setScene(netSearchRequest.f133323d);
        a.setImprId(netSearchRequest.f133330k);
        for (SearchBaseInfo searchBaseInfo : a.getInfoList()) {
            searchBaseInfo.setSession(a.getSession());
            searchBaseInfo.setImprId(a.getImprId());
            searchBaseInfo.setScene(a.getScene());
            searchBaseInfo.setRequestId(a.getRequestId());
            if ((searchBaseInfo instanceof SearchOpenSearchInfo) && netSearchRequest.f133325f != null) {
                ((SearchOpenSearchInfo) searchBaseInfo).setSlashId(netSearchRequest.f133325f.command_id);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static LinkedHashMap<Integer, SearchResponse> m208929a(String str, List<Integer> list, MultiLocalIntegrationSearchResponse multiLocalIntegrationSearchResponse) {
        LinkedHashMap<Integer, SearchResponse> linkedHashMap = new LinkedHashMap<>();
        List<LocalIntegrationSearchResponse> list2 = multiLocalIntegrationSearchResponse.responses;
        if (CollectionUtils.isEmpty(list2)) {
            return linkedHashMap;
        }
        for (int i = 0; i < list2.size(); i++) {
            SearchResponse a = f133207a.get(list.get(i).intValue()).mo184364a(list2.get(i));
            a.setQuery(str);
            a.setFrom(0);
            linkedHashMap.put(list.get(i), a);
        }
        return linkedHashMap;
    }
}
