package com.bytedance.ee.bear.more.p501b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.more.AbstractC10213g;
import com.bytedance.ee.bear.more.PageViewResult;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.b.b */
public class C10201b {

    /* renamed from: a */
    private NetService.AbstractC5075d<PageViewResult> f27537a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C10202a());

    /* renamed from: com.bytedance.ee.bear.more.b.b$a */
    static class C10202a implements NetService.AbstractC5074c<PageViewResult> {
        C10202a() {
        }

        /* renamed from: a */
        public PageViewResult parse(String str) {
            PageViewResult pageViewResult = new PageViewResult();
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    pageViewResult.pv = optJSONObject.getInt("pv");
                    pageViewResult.uv = optJSONObject.getInt("uv");
                    pageViewResult.likeCount = optJSONObject.getInt("like_count");
                    pageViewResult.ownerId = optJSONObject.getString("owner_user_id");
                    pageViewResult.creationTime = optJSONObject.getLong("create_timestamp");
                    JSONObject jSONObject = optJSONObject.getJSONObject("entities").getJSONObject("users").getJSONObject(pageViewResult.ownerId);
                    pageViewResult.ownerAvatarUrl = jSONObject.getString("avatar_url");
                    pageViewResult.ownerEnName = jSONObject.getString("en_name");
                    pageViewResult.ownerName = jSONObject.getString("name");
                    pageViewResult.pvToday = optJSONObject.getInt("pv_today");
                    pageViewResult.uvToday = optJSONObject.getInt("uv_today");
                    pageViewResult.likeCountToday = optJSONObject.getInt("like_count_today");
                    pageViewResult.commentsCount = optJSONObject.getInt("comments_count");
                    pageViewResult.commentsCountToday = optJSONObject.getInt("comments_count_today");
                }
            } catch (JSONException e) {
                C13479a.m54759a("PageViewServiceExecutor", "parse fail", e);
            }
            return pageViewResult;
        }
    }

    /* renamed from: a */
    private NetService.C5076e m42491a(String str, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/api/obj_stats/get/");
        fVar.mo20145a("obj_type", str);
        fVar.mo20145a("token", str2);
        return fVar;
    }

    /* renamed from: a */
    public void mo38995a(int i, String str, AbstractC10213g gVar) {
        AbstractC68307f<PageViewResult> a = this.f27537a.mo20141a(m42491a(String.valueOf(i), str));
        gVar.getClass();
        a.mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.more.p501b.$$Lambda$7L4PyXFP8iaTQxP5vKBDujpKL4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC10213g.this.onGetPageViewSuccess((PageViewResult) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.more.p501b.$$Lambda$b$kvzg_wwHyn5LmbGYtj8OiASUxf4 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                AbstractC10213g.this.onGetPageViewError();
            }
        });
    }
}
