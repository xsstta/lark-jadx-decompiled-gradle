package com.ss.android.lark.mm.net.p2332a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummary;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.list.data.MmListSpaceType;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.module.player.speed.repo.SilenceResponse;
import com.ss.android.lark.mm.module.podcast.model.MmPodcastBg;
import com.ss.android.lark.mm.module.record.model.MmUpdateStatus;
import com.ss.android.lark.mm.net.C47056a;
import com.ss.android.lark.mm.net.C47066b;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.error.MmCommonLocalErrorHandler;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.task.MmBizTask;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mm.net.a.a */
public final class C47057a {
    /* renamed from: a */
    public static void m186251a(String str, String str2, AbstractC47070c cVar) {
        m186262a(str, "/minutes/api/base-info?object_token=" + str2, Collections.emptyMap(), cVar);
    }

    /* renamed from: a */
    public static void m186246a(String str, String str2, int i, int i2, AbstractC47070c cVar) {
        m186262a(str, "/minutes/api/participants?offset=" + i + "&size=" + i2 + "&object_token=" + str2, Collections.emptyMap(), cVar);
    }

    /* renamed from: a */
    public static void m186250a(String str, String str2, AddCommentReq addCommentReq, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put(Comment.f24093e, JSON.toJSONString(addCommentReq));
        m186264a(str, "/minutes/api/comment/add", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186255a(String str, String str2, String str3, AbstractC47070c cVar) {
        m186262a(str, "/minutes/api/comment?object_token=" + str2 + "&translate_lang=" + str3, Collections.emptyMap(), cVar);
    }

    /* renamed from: b */
    public static void m186274b(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("content_id", str3);
        m186264a(str, "/minutes/api/comment/delete", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186257a(String str, String str2, String str3, String str4, AbstractC47070c cVar) {
        m186262a(str, "/minutes/api/subtitles?object_token=" + str2 + "&paragraph_id=" + str3 + "&translate_lang=" + str4 + "&size=3000", Collections.emptyMap(), cVar);
    }

    /* renamed from: a */
    public static void m186259a(String str, String str2, String str3, String str4, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("translate_lang", str4);
        hashMap.put(ShareHitPoint.f121869d, z ? "1" : "0");
        hashMap.put(SearchIntents.EXTRA_QUERY, str3);
        m186262a(str, "/minutes/api/find", hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186265a(String str, String str2, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_tokens", str2);
        hashMap.put("is_destroyed", z + "");
        m186264a(str, "/minutes/api/space/delete", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186249a(String str, String str2, int i, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_tokens", str2);
        hashMap.put("space_name", i + "");
        m186264a(str, "/minutes/api/space/remove", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186254a(String str, String str2, String str3, int i, String str4, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("action_id", str3);
        hashMap.put("user_type", "" + i);
        hashMap.put("user_id", str4);
        m186264a(str, "/minutes/api/participants/delete", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186245a(String str, String str2, int i, int i2, int i3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put(UpdateKey.STATUS, "" + i);
        hashMap.put("share_type", "" + i2);
        hashMap.put("permissions", "" + i3);
        m186264a(str, "/minutes/api/permission/link-share/edit", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186252a(String str, String str2, String str3, int i, int i2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("user_id", "" + str3);
        hashMap.put("user_type", "" + i);
        hashMap.put("permissions", "" + i2);
        m186264a(str, "/minutes/api/permission/update", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186253a(String str, String str2, String str3, int i, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("user_id", "" + str3);
        hashMap.put("user_type", "" + i);
        m186264a(str, "/minutes/api/permission/delete", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: a */
    public static void m186248a(String str, String str2, int i, int i2, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", str2);
        hashMap.put("size", "" + i);
        hashMap.put("rank", "" + i2);
        hashMap.put("asc", "" + z);
        hashMap.put("space_name", MmListSpaceType.MINE.getValue() + "");
        m186263a(str, "/minutes/api/space/list", hashMap, cVar, (IHttpLocalErrorHandler) null);
    }

    /* renamed from: a */
    public static void m186266a(String str, List<String> list, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append("&object_token[]=");
            sb.append(list.get(i));
        }
        m186263a(str, "/minutes/api/batch-status?" + sb.substring(1), hashMap, cVar, (IHttpLocalErrorHandler) null);
    }

    /* renamed from: b */
    public static void m186277b(String str, String str2, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("recording_lang", str);
        hashMap.put(ChatTypeStateKeeper.f135670e, str2);
        hashMap.put("is_forced", z + "");
        C47056a.m186233b(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/audio/create").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186242a(String str, int i, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, i + "");
        hashMap.put("object_token", str);
        hashMap.put("language", C45899c.m181859a().getHostDepend().mo144635c());
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/audio/language-list").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186241a(AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("language", C45899c.m181859a().getHostDepend().mo144635c());
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/audio/language").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186247a(String str, String str2, int i, int i2, File file, String str3, AbstractC47070c<String> cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str);
        hashMap.put("start_ms", str2);
        hashMap.put("duration", i + "");
        hashMap.put("seg_id", i2 + "");
        hashMap.put("recording_lang", str3);
        if (file.getName().contains(".aac")) {
            hashMap.put("recording_format", "2");
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("payload", new Pair(file.getName(), file));
        m186243a("/minutes/api/audio/upload", m186234a(), hashMap, hashMap2, cVar);
    }

    /* renamed from: a */
    public static void m186244a(String str, MmUpdateStatus mmUpdateStatus, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str);
        hashMap.put(UpdateKey.STATUS, mmUpdateStatus.getValue() + "");
        C47056a.m186233b(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/audio/status").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186262a(String str, String str2, Map<String, String> map, AbstractC47070c cVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144625a(str, str2, map, m186234a(), cVar);
    }

    /* renamed from: a */
    public static void m186264a(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC47070c cVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144627a(str, str2, map, map2, m186234a(), cVar);
    }

    /* renamed from: a */
    public static void m186263a(String str, String str2, Map<String, String> map, AbstractC47070c cVar, IHttpLocalErrorHandler aVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144626a(str, str2, map, m186234a(), cVar, aVar);
    }

    /* renamed from: a */
    public static void m186243a(String str, HttpHeaders httpHeaders, Map<String, String> map, Map<String, Pair<String, File>> map2, AbstractC47070c cVar) {
        C45899c.m181859a().getHttpExecutorDepend().mo144624a(str, httpHeaders, map, map2, cVar);
    }

    /* renamed from: b */
    public static void m186276b(String str, String str2, String str3, String str4, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("translate_lang", str3);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/summaries").mo165299a(hashMap).mo165304c(str4).mo165300a(z).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186260a(String str, String str2, String str3, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("content_id", str3);
        hashMap.put("checked", z + "");
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/summaries/checkbox").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186258a(String str, String str2, String str3, String str4, String str5, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("edit_status", str4);
        hashMap.put("now_version", str3);
        hashMap.put("edit_session", str5);
        C47056a.m186233b(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/subtitles/edit/entry").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186256a(String str, String str2, String str3, String str4, MmParticipants.MmParticipantInfo mmParticipantInfo, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("paragraph_id", str3);
        hashMap.put("edit_session", str4);
        hashMap.put("user_type", mmParticipantInfo.getUserType() + "");
        if (!TextUtils.isEmpty(mmParticipantInfo.getUserId())) {
            hashMap.put("user_id", mmParticipantInfo.getUserId());
        }
        hashMap.put("user_name", mmParticipantInfo.getUserName());
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/subtitles/speaker/update").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: b */
    public static void m186275b(String str, String str2, String str3, String str4, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put(SearchIntents.EXTRA_QUERY, str3);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("uuid", str4);
        }
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/participants/search").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static void m186261a(String str, String str2, List<MmParticipants.MmParticipantInfo> list, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("uuid", str3);
        if (!CollectionUtils.isEmpty(list)) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (MmParticipants.MmParticipantInfo mmParticipantInfo : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("user_id", (Object) mmParticipantInfo.getUserId());
                    jSONObject.put("user_type", (Object) Integer.valueOf(mmParticipantInfo.getUserType()));
                    jSONObject.put("user_name", (Object) mmParticipantInfo.getUserName());
                    jSONArray.add(jSONObject);
                }
                hashMap.put("users", jSONArray.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/multi-participants/add").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static HttpHeaders m186234a() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put("app-id", C45899c.m181859a().getHostDepend().mo144634b());
        httpHeaders.put("m-version", C45899c.m181859a().getHostDepend().mo144637e());
        httpHeaders.put("m-locale", C45899c.m181859a().getHostDepend().mo144635c());
        httpHeaders.put("device-id", C45899c.m181859a().getHostDepend().mo144630a());
        httpHeaders.put(ConvertOfficeToSpaceService.f88309g, "session=" + C45899c.m181859a().getLoginDepend().mo144652d());
        httpHeaders.put("user-agent", C45899c.m181859a().getHostDepend().mo144638f());
        httpHeaders.put("request-id", C45899c.m181859a().getHostDepend().mo144631a("pro"));
        httpHeaders.put("platform", "android");
        httpHeaders.put("Referer", "https://meetings.feishu.cn/minutes/me");
        C45855f.m181663b("MmApiService", "buildHeaders " + httpHeaders);
        return httpHeaders;
    }

    /* renamed from: a */
    public static MmBizTask<MmPodcastBg> m186235a(String str) {
        return new MmBizTask<>(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/podcast-bgs"));
    }

    /* renamed from: a */
    public static MmBizTask m186236a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        return new MmBizTask(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165299a(hashMap).mo165298a(str).mo165302b("/minutes/api/status"));
    }

    /* renamed from: b */
    public static MmBizTask<MmSubtitles> m186267b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("language", C45899c.m181859a().getHostDepend().mo144635c());
        return new MmBizTask<>(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/subtitles/mobile-sub").mo165299a(hashMap));
    }

    /* renamed from: c */
    public static MmBizTask<MmSubtitles> m186278c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("language", C45899c.m181859a().getHostDepend().mo144635c());
        return new MmBizTask<>(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/subtitles/podcast").mo165299a(hashMap));
    }

    /* renamed from: c */
    public static void m186280c(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        m186262a(str, "/minutes/api/permission/apply/info", hashMap, cVar);
    }

    /* renamed from: e */
    public static void m186285e(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        m186262a(str, "/minutes/api/permission/list", hashMap, cVar);
    }

    /* renamed from: f */
    public static void m186287f(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        m186262a(str, "/minutes/api/permission/lark-feed", hashMap, cVar);
    }

    /* renamed from: b */
    public static void m186272b(String str, String str2, AbstractC47070c cVar) {
        m186262a(str, "/minutes/api/files?offset=0&size=100&object_token=" + str2, Collections.emptyMap(), cVar);
    }

    /* renamed from: d */
    public static void m186283d(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_tokens", str2);
        m186264a(str, "/minutes/api/space/delete/restore", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: g */
    public static void m186289g(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        m186264a(str, "/minutes/api/review/appeal", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: i */
    public static void m186293i(String str, String str2, AbstractC47070c<SilenceResponse> cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str);
        hashMap.put("language", str2);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/silence").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: j */
    public static void m186295j(String str, String str2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/statistics").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static MmBizTask<HightlightTimeLine.MmHightlightTimeLineResp> m186237a(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("language", C45899c.m181859a().getHostDepend().mo144635c());
        return new MmBizTask<>(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/highlight/timeline").mo165299a(hashMap));
    }

    /* renamed from: h */
    public static void m186291h(String str, String str2, AbstractC47070c<String> cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str);
        hashMap.put(ChatTypeStateKeeper.f135670e, Uri.encode(str2));
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/object/edit").mo165303b(hashMap).mo165297a(new MmCommonLocalErrorHandler()).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static MmBizTask<MmBaseInfo.MmBaseInfoResp> m186238a(String str, String str2, String str3) {
        C47066b.C47067a c = new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165304c(str3);
        return new MmBizTask<>(c.mo165302b("/minutes/api/base-info?object_token=" + str2));
    }

    /* renamed from: c */
    public static void m186281c(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("remark", str3);
        hashMap.put("object_token", str2);
        m186264a(str, "/minutes/api/permission/apply/action", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: e */
    public static void m186286e(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put(SearchIntents.EXTRA_QUERY, str3);
        m186262a(str, "/minutes/api/permission/search", hashMap, cVar);
    }

    /* renamed from: d */
    public static void m186284d(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("users", "" + str3);
        m186264a(str, "/minutes/api/permission/create", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: f */
    public static void m186288f(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("reaction", str3);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/reaction/add").mo165297a(new MmCommonLocalErrorHandler()).mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: h */
    public static void m186292h(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("paragraph_id", str3);
        hashMap.put("size", "1000");
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/subtitles/speaker/suggestion").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: b */
    public static MmBizTask<MmSummary.MmSummaryResp> m186268b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("translate_lang", str3);
        return new MmBizTask<>(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/summaries").mo165299a(hashMap).mo165304c(str4));
    }

    /* renamed from: g */
    public static void m186290g(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("translate_lang", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("recording_lang", str3);
        }
        hashMap.put("object_token", str);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(C45899c.m181859a().getDomainDepend().mo144616a()).mo165302b("/minutes/api/audio/language").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: i */
    public static void m186294i(String str, String str2, String str3, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("edit_session", str3);
        C47056a.m186233b(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/subtitles/edit/keep").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static MmBizTask m186239a(String str, String str2, String str3, String str4) {
        C47066b.C47067a c = new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165304c(str4);
        return new MmBizTask(c.mo165302b("/minutes/api/keywords?object_token=" + str2 + "&translate_lang=" + str3));
    }

    /* renamed from: b */
    public static void m186271b(String str, String str2, int i, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", "" + str2);
        hashMap.put("size", "" + i);
        hashMap.put("space_name", MmListSpaceType.TRASH.getValue() + "");
        m186262a(str, "/minutes/api/space/list", hashMap, cVar);
    }

    /* renamed from: c */
    public static void m186279c(String str, String str2, int i, int i2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("offset", i + "");
        hashMap.put("size", i2 + "");
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165302b("/minutes/api/participants/suggestion").mo165299a(hashMap).mo165301a(), cVar);
    }

    /* renamed from: b */
    public static void m186269b(String str, String str2, int i, int i2, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", "" + str2);
        hashMap.put("size", "" + i);
        hashMap.put("owner_type", "" + i2);
        hashMap.put("space_name", MmListSpaceType.HOME.getValue() + "");
        m186263a(str, "/minutes/api/space/list", hashMap, cVar, (IHttpLocalErrorHandler) null);
    }

    /* renamed from: c */
    public static void m186282c(String str, String str2, String str3, String str4, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("uuid", str3);
        hashMap.put("user_name", str4);
        C47056a.m186229a(new C47066b.C47067a().mo165296a(HttpMethod.POST).mo165298a(str).mo165302b("/minutes/api/participants/search-users/add").mo165303b(hashMap).mo165301a(), cVar);
    }

    /* renamed from: a */
    public static MmBizTask<MmMeetingSubtitles.MmMeetingSubtitlesResp> m186240a(String str, String str2, String str3, String str4, IHttpLocalErrorHandler aVar) {
        C47066b.C47067a a = new C47066b.C47067a().mo165296a(HttpMethod.GET).mo165298a(str).mo165304c(str4).mo165297a(aVar);
        return new MmBizTask<>(a.mo165302b("/minutes/api/subtitles?object_token=" + str2 + "&size=3000&translate_lang=" + str3));
    }

    /* renamed from: b */
    public static void m186273b(String str, String str2, String str3, int i, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("object_token", str2);
        hashMap.put("user_id", "" + str3);
        hashMap.put("user_type", "" + i);
        m186264a(str, "/minutes/api/permission/transfer", Collections.emptyMap(), hashMap, cVar);
    }

    /* renamed from: b */
    public static void m186270b(String str, String str2, int i, int i2, boolean z, AbstractC47070c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", str2);
        hashMap.put("size", "" + i);
        hashMap.put("rank", "" + i2);
        hashMap.put("asc", "" + z);
        hashMap.put("space_name", MmListSpaceType.SHRED.getValue() + "");
        m186262a(str, "/minutes/api/space/list", hashMap, cVar);
    }
}
