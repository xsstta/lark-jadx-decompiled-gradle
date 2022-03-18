package com.bytedance.ee.bear.middleground.like;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.like.f */
public class C9532f {

    /* renamed from: a */
    private C10917c f25589a;

    /* renamed from: b */
    private String f25590b;

    /* renamed from: c */
    private int f25591c;

    /* renamed from: com.bytedance.ee.bear.middleground.like.f$c */
    public static class C9535c {

        /* renamed from: a */
        public String f25592a;

        /* renamed from: b */
        public String f25593b;

        /* renamed from: c */
        public String f25594c;

        /* renamed from: d */
        public String f25595d;

        /* renamed from: e */
        public String f25596e;

        /* renamed from: f */
        public String f25597f;

        /* renamed from: g */
        public long f25598g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.like.f$a */
    public static class C9533a extends NetService.Result {
        int count;

        C9533a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.like.f$b */
    public static class C9534b extends NetService.Result {
        boolean hasMore;
        List<C9535c> likeUsers = new ArrayList();

        /* access modifiers changed from: package-private */
        public List<C9535c> getLikeUsers() {
            return this.likeUsers;
        }

        /* access modifiers changed from: package-private */
        public boolean hasMore() {
            return this.hasMore;
        }

        C9534b() {
        }

        /* access modifiers changed from: package-private */
        public void addLikeUser(C9535c cVar) {
            this.likeUsers.add(cVar);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<C9533a> mo36509a() {
        NetService.C5077f fVar = new NetService.C5077f("api/like/count/");
        fVar.mo20143a(2);
        fVar.mo20145a("token", this.f25590b);
        fVar.mo20145a("refer_type", String.valueOf(this.f25591c));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$f$ZVtqcgW_WXwda7TgSh4rkUDr5EE.INSTANCE).mo20141a(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C9533a m39371a(String str) throws NetService.ParseException {
        C9533a aVar = new C9533a();
        try {
            aVar.count = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getInt("count");
        } catch (JSONException e) {
            C13479a.m54759a("LikeListPuller", "parse: pull count error", e);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ C9534b m39372b(String str) throws NetService.ParseException {
        C9534b bVar = new C9534b();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            JSONArray optJSONArray = optJSONObject.optJSONArray("ids");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("likes");
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("users");
            for (int i = 0; i < optJSONArray.length(); i++) {
                C9535c cVar = new C9535c();
                cVar.f25592a = optJSONArray.getString(i);
                JSONObject optJSONObject4 = optJSONObject2.optJSONObject(cVar.f25592a);
                cVar.f25593b = optJSONObject4.optString("user_id");
                cVar.f25598g = optJSONObject4.optLong("update_time");
                JSONObject optJSONObject5 = optJSONObject3.optJSONObject(cVar.f25593b);
                if (optJSONObject5 != null) {
                    cVar.f25595d = optJSONObject5.optString("name");
                    cVar.f25596e = optJSONObject5.optString("en_name");
                    cVar.f25597f = optJSONObject5.optString("avatar_url");
                    cVar.f25594c = optJSONObject5.optString("tenant_id");
                }
                bVar.addLikeUser(cVar);
            }
            bVar.hasMore = optJSONObject.optBoolean("has_more");
        } catch (JSONException e) {
            C13479a.m54759a("LikeListPuller", "parse: ", e);
        }
        return bVar;
    }

    /* renamed from: a */
    public AbstractC68307f<C9534b> mo36510a(String str, int i) {
        NetService.C5077f fVar = new NetService.C5077f("/api/like/data/");
        fVar.mo20143a(2);
        fVar.mo20145a("token", this.f25590b);
        fVar.mo20145a("refer_type", String.valueOf(this.f25591c));
        fVar.mo20145a("last_like_id", str);
        fVar.mo20145a("page_size", String.valueOf(i));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$f$rxRNsvDiNsMM5R2djpELvtUGRv0.INSTANCE).mo20141a(fVar);
    }

    public C9532f(C10917c cVar, String str, int i) {
        this.f25589a = cVar;
        this.f25590b = str;
        this.f25591c = i;
    }
}
