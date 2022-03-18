package com.bytedance.ee.bear.list.listsync;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.facade.glide.p383a.p384a.C7745a;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.cache.C8153a;
import com.bytedance.ee.bear.list.cache.C8200i;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.listsync.AbstractC8562b;
import com.bytedance.ee.bear.list.listsync.entity.SyncPushConfig;
import com.bytedance.ee.bear.list.sort.FilterType;
import com.bytedance.ee.bear.middleground.drive.export.PushPayload;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.listsync.a */
public abstract class AbstractC8561a implements AbstractC8562b {

    /* renamed from: a */
    protected C10917c f23229a;

    /* renamed from: b */
    protected int f23230b;

    /* renamed from: c */
    protected FolderSortStrategy f23231c;

    /* renamed from: d */
    protected AbstractC8564c f23232d;

    /* renamed from: e */
    protected AbstractC8562b.AbstractC8563a f23233e;

    /* renamed from: f */
    private final C68289a f23234f = new C68289a();

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35713a(String str) throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33414a(JSONObject jSONObject, Document document);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo33415a(Document document, Document document2);

    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b
    /* renamed from: b */
    public void mo33416b() {
        this.f23234f.mo237935a();
    }

    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b
    /* renamed from: a */
    public void mo33410a() {
        if (SyncPushConfig.instance().isShow_refresh_tips_ui()) {
            C13479a.m54764b("BasePushHandler_ListSync", "handleMessageLoss() isShow_refresh_tips_ui true, toast tips ui start");
            this.f23232d.mo33420b();
        }
    }

    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b
    /* renamed from: a */
    public void mo33411a(FolderSortStrategy folderSortStrategy) {
        this.f23231c = folderSortStrategy;
    }

    /* renamed from: a */
    private void m35711a(Document document) {
        if (document != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(document);
            C8292f.m34158a(this.f23229a, (List<Document>) arrayList, true, "");
            C8292f.m34157a(this.f23229a, (List<Document>) arrayList, true);
        }
    }

    /* renamed from: b */
    private void m35715b(Document document) {
        C8153a.m32844b().mo31600b(C8200i.m33446a(document), C8200i.m33447a(document, this.f23230b));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35712a(Integer num) throws Exception {
        C13479a.m54764b("BasePushHandler_ListSync", "deleteListDocRecordByObjToken()...ret = " + num);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m35714a(Throwable th) throws Exception {
        C13479a.m54764b("BasePushHandler_ListSync", "deleteListDocRecordByObjToken()...error = " + th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33417b(PushPayload pushPayload) throws Exception {
        C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd()...payload = " + pushPayload);
        this.f23234f.mo237937a(AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238020d(new Function(pushPayload, new JSONObject(pushPayload.data)) {
            /* class com.bytedance.ee.bear.list.listsync.$$Lambda$a$aaqhnT4bUYEZRabexC9r_Y07_s */
            public final /* synthetic */ PushPayload f$1;
            public final /* synthetic */ JSONObject f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC8561a.this.m35710a(this.f$1, this.f$2, (String) obj);
            }
        }).mo238001b($$Lambda$a$2Ys6D4M_qgflyowcQ6fH2IS3U.INSTANCE, $$Lambda$a$pb3WMEtZhWJTmZ_SCF5Gw_hXIfQ.INSTANCE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo33418c(PushPayload pushPayload) {
        C13479a.m54764b("BasePushHandler_ListSync", "handleRecordDelete() start");
        this.f23234f.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(pushPayload.node_token) {
            /* class com.bytedance.ee.bear.list.listsync.$$Lambda$a$ABedHMQWKeklTBhticxuIH9rRdA */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC8561a.m35709a(this.f$0, (Boolean) obj);
            }
        }).mo238001b($$Lambda$a$9G4uoL_430TdI78PN1QaXhZFT4.INSTANCE, $$Lambda$a$70CjQENNz3RRcMUjmSkYiZQs5pk.INSTANCE));
        if (SyncPushConfig.instance().isShow_refresh_tips_ui() && !this.f23232d.mo33419a()) {
            C13479a.m54764b("BasePushHandler_ListSync", "handleRecordDelete() delete record sort change, toast tips ui start");
            this.f23232d.mo33420b();
        }
        AbstractC8562b.AbstractC8563a aVar = this.f23233e;
        if (aVar != null) {
            aVar.mo33398a(pushPayload.node_token);
        }
    }

    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b
    /* renamed from: a */
    public void mo33412a(AbstractC8562b.AbstractC8563a aVar) {
        this.f23233e = aVar;
    }

    @Override // com.bytedance.ee.bear.list.listsync.AbstractC8562b
    /* renamed from: a */
    public void mo33413a(PushPayload pushPayload) {
        try {
            C13479a.m54764b("BasePushHandler_ListSync", "handlePush()...payload = " + pushPayload);
            int i = pushPayload.event_type;
            if (i != 7) {
                if (i == 8 || i == 10001) {
                    mo33417b(pushPayload);
                    return;
                } else if (i != 10002) {
                    return;
                }
            }
            mo33418c(pushPayload);
        } catch (Exception e) {
            C13479a.m54761a("BasePushHandler_ListSync", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Integer m35709a(String str, Boolean bool) throws Exception {
        return Integer.valueOf(C8153a.m32844b().mo31594b(1, str));
    }

    public AbstractC8561a(C10917c cVar, int i, AbstractC8564c cVar2) {
        this.f23229a = cVar;
        this.f23230b = i;
        this.f23232d = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m35710a(PushPayload pushPayload, JSONObject jSONObject, String str) throws Exception {
        Document document;
        Document document2;
        AbstractC8562b.AbstractC8563a aVar;
        C8200i a = C8153a.m32844b().mo31577a(this.f23230b, pushPayload.node_token);
        if (a == null) {
            C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd() change doc not exist.");
            document2 = new Document();
            document = new Document();
            document2.mo32451i(pushPayload.node_token);
            document2.mo32433d(pushPayload.file_type);
        } else {
            C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd() change doc exist.");
            document2 = C8200i.m33449a(a);
            document = C8200i.m33449a(a);
        }
        if (jSONObject.has("name")) {
            document2.mo32443g(jSONObject.optString("name"));
        }
        if (jSONObject.has("edit_time")) {
            document2.mo32462l(jSONObject.optString("edit_time"));
        }
        if (jSONObject.has("edit_uid")) {
            document2.mo32459k(jSONObject.optString("edit_uid"));
        }
        if (jSONObject.has("owner_type")) {
            document2.mo32461l(jSONObject.optInt("owner_type"));
        }
        if (jSONObject.has("owner_id")) {
            String optString = jSONObject.optString("owner_id");
            document2.mo32434d(optString);
            JSONObject optJSONObject = jSONObject.optJSONObject("users");
            if (!(optJSONObject == null || TextUtils.isEmpty(optString) || optJSONObject.optJSONObject(optString) == null)) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(optString);
                document2.mo32470n(optJSONObject2.optString("cn_name"));
                document2.mo32473o(optJSONObject2.optString("en_name"));
                document2.mo32378C(optJSONObject2.optString("tenant_id"));
            }
        }
        if (jSONObject.has("url")) {
            document2.mo32467m(jSONObject.optString("url"));
        }
        if (jSONObject.has("is_stared")) {
            document2.mo32412a(jSONObject.optBoolean("is_stared"));
        }
        if (jSONObject.has("is_pined")) {
            document2.mo32412a(jSONObject.optBoolean("is_pined"));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("is_external")) {
                document2.mo32432c(optJSONObject3.optBoolean("is_external"));
            }
            if (optJSONObject3.has("subtype")) {
                document2.mo32487u(optJSONObject3.optString("subtype"));
            }
            if (optJSONObject3.has("space_id")) {
                document2.mo32376B(optJSONObject3.optString("space_id"));
            }
            if (optJSONObject3.has("is_share_root")) {
                document2.mo32435d(optJSONObject3.optBoolean("is_share_root"));
            }
            if (optJSONObject3.has("icon")) {
                document2.mo32489v(optJSONObject3.optString("icon"));
            }
            if (optJSONObject3.has("icon_nonce")) {
                document2.mo32493x(optJSONObject3.optString("icon_nonce"));
            }
            if (optJSONObject3.has("icon_encrypted_type")) {
                document2.mo32439f(optJSONObject3.optInt("icon_encrypted_type"));
            }
            if (optJSONObject3.has("copiable")) {
                document2.mo32441f(optJSONObject3.optBoolean("copiable"));
            }
            if (optJSONObject3.has("is_visited")) {
                document2.mo32452i(optJSONObject3.optBoolean("is_visited"));
            }
            if (optJSONObject3.has("has_perm")) {
                document2.mo32460k(optJSONObject3.optBoolean("has_perm", true));
            }
            if (optJSONObject3.has("app_id")) {
                document2.mo32392J(optJSONObject3.optString("app_id"));
            }
            if (optJSONObject3.has("wiki_subtype")) {
                document2.mo32458k(optJSONObject3.optInt("wiki_subtype"));
            }
        }
        Document.DocumentIcon ag = document2.ag();
        if (ag == null) {
            ag = new Document.DocumentIcon();
        }
        if (jSONObject.has("icon_type")) {
            ag.mo32503a(jSONObject.optInt("icon_type"));
        }
        if (jSONObject.has("icon_key")) {
            ag.mo32504a(jSONObject.optString("icon_key"));
        }
        if (jSONObject.has("icon_fsunit")) {
            ag.mo32506b(jSONObject.optString("icon_fsunit"));
        }
        document2.mo32411a(ag);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("thumbnail_extra");
        if (optJSONObject4 != null) {
            document2.mo32386G(optJSONObject4.optString("url"));
            document2.mo32453j(optJSONObject4.optInt(ShareHitPoint.f121869d));
            document2.mo32390I(optJSONObject4.optString("nonce"));
            document2.mo32388H(optJSONObject4.optString("secret"));
        }
        if (jSONObject.has("create_time")) {
            document2.mo32482s(jSONObject.optString("create_time"));
        }
        if (jSONObject.has("share_time")) {
            document2.mo32478q(jSONObject.optString("share_time"));
        }
        if (jSONObject.has("share_version")) {
            document2.mo32442g(jSONObject.optInt("share_version"));
        }
        if (jSONObject.has("thumbnail")) {
            document2.mo32380D(jSONObject.optString("thumbnail"));
        }
        mo33414a(jSONObject, document2);
        if (document2.mo32483t() != C8275a.f22375h.mo32555b()) {
            if (!TextUtils.isEmpty(document2.mo32403S())) {
                C7745a.m31019a().mo30369b(Uri.parse(document2.mo32403S()).buildUpon().clearQuery().toString(), "");
            }
            if (!TextUtils.isEmpty(document2.ac())) {
                C7745a.m31019a().mo30369b(Uri.parse(document2.ac()).buildUpon().clearQuery().toString(), "");
            }
        }
        boolean isShow_refresh_tips_ui = SyncPushConfig.instance().isShow_refresh_tips_ui();
        boolean z = true;
        FolderSortStrategy folderSortStrategy = this.f23231c;
        if (folderSortStrategy != null) {
            z = FilterType.getFilterByType(folderSortStrategy.mo31554d(), this.f23231c.mo31560f(), this.f23231c.mo31561g()).isInFilterType(pushPayload.file_type, document2.mo32377C());
        } else {
            C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd() mSortStrategy is null");
        }
        boolean a2 = this.f23232d.mo33419a();
        if (!isShow_refresh_tips_ui || a2 || !z || !mo33415a(document2, document)) {
            C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd() insert it directly, showTipsFg=" + isShow_refresh_tips_ui + " isInFilter=" + z + " isFirstScreen=" + a2);
            m35715b(document2);
        } else {
            C13479a.m54764b("BasePushHandler_ListSync", "handleUpdateOrAdd() sort change, toast refresh ui");
            this.f23232d.mo33420b();
        }
        if (a == null && (aVar = this.f23233e) != null) {
            aVar.mo33397a(document2);
        }
        m35711a(document2);
        return "";
    }
}
