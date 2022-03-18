package com.bytedance.ee.bear.list;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.list.create.C8228a;
import com.bytedance.ee.bear.list.create.C8255o;
import com.bytedance.ee.bear.list.create.DocumentCreateInfoAdapter;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class DocumentCreateHelper {

    /* renamed from: a */
    private final NetService f21719a = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: b */
    private final AbstractC5233x f21720b = C5234y.m21391b();

    /* renamed from: c */
    private final an f21721c = ((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: d */
    private final al f21722d = C4511g.m18594d();

    public static class DocumentCreateEntity extends NetService.Result implements Parcelable {
        public static final Parcelable.Creator<DocumentCreateEntity> CREATOR = new Parcelable.Creator<DocumentCreateEntity>() {
            /* class com.bytedance.ee.bear.list.DocumentCreateHelper.DocumentCreateEntity.C81381 */

            /* renamed from: a */
            public DocumentCreateEntity[] newArray(int i) {
                return new DocumentCreateEntity[i];
            }

            /* renamed from: a */
            public DocumentCreateEntity createFromParcel(Parcel parcel) {
                return new DocumentCreateEntity(parcel);
            }
        };
        public boolean isShareFolder;
        public String objToken;
        public int objType;
        public int ownerType;
        public String templateToken;
        public String title;
        public String token;
        public int type;
        public String url;

        public int describeContents() {
            return 0;
        }

        public DocumentCreateEntity() {
        }

        public String getObjToken() {
            return this.objToken;
        }

        public int getOwnerType() {
            return this.ownerType;
        }

        public String getTemplateToken() {
            return this.templateToken;
        }

        public String getTitle() {
            return this.title;
        }

        public String getToken() {
            return this.token;
        }

        public int getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public boolean isShareFolder() {
            return this.isShareFolder;
        }

        public String toString() {
            return "DocumentCreateInfo{token='" + C13598b.m55197d(this.token) + '\'' + ", objToken='" + C13598b.m55197d(this.objToken) + '\'' + ", templateToken='" + C13598b.m55197d(this.templateToken) + '\'' + ", code=" + this.code + ", msg='" + this.msg + '\'' + ", data=" + this.data + '}';
        }

        public void setObjToken(String str) {
            this.objToken = str;
        }

        public void setOwnerType(int i) {
            this.ownerType = i;
        }

        public void setShareFolder(boolean z) {
            this.isShareFolder = z;
        }

        public void setTemplateToken(String str) {
            this.templateToken = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        protected DocumentCreateEntity(Parcel parcel) {
            boolean z;
            this.token = parcel.readString();
            this.objToken = parcel.readString();
            this.templateToken = parcel.readString();
            this.url = parcel.readString();
            this.title = parcel.readString();
            this.type = parcel.readInt();
            this.objType = parcel.readInt();
            this.ownerType = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isShareFolder = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.token);
            parcel.writeString(this.objToken);
            parcel.writeString(this.templateToken);
            parcel.writeString(this.url);
            parcel.writeString(this.title);
            parcel.writeInt(this.type);
            parcel.writeInt(this.objType);
            parcel.writeInt(this.ownerType);
            parcel.writeInt(this.isShareFolder ? 1 : 0);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo31350a(int i, String str, String str2, String str3, String str4, boolean z) {
        return this.f21719a.mo20117a(new C8139a(z)).mo20141a(m32481b(str3, i, str, str2, z)).mo237985a(C11678b.m48479c()).mo238020d(new C8255o(this.f21721c, i, str, str3, str4)).mo237985a(C11678b.m48481e()).mo238020d($$Lambda$DocumentCreateHelper$K0JCHz5AoUAT6egyhFnnjLODzI.INSTANCE).mo238020d(new Function(i, str3, str4) {
            /* class com.bytedance.ee.bear.list.$$Lambda$DocumentCreateHelper$I2Dhyt3nIRxpoIBBnatVvpHp9I */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DocumentCreateHelper.this.m32473a(this.f$1, this.f$2, this.f$3, (DocumentCreateInfo) obj);
            }
        });
    }

    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo31352a(String str, int i, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5) {
        return mo31353a(str, i, str2, z, false, false, str3, z2, str4, z3, str5);
    }

    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo31351a(String str, int i, String str2, boolean z, String str3, boolean z2, String str4) {
        return mo31353a(str, i, str2, z, false, false, str3, z2, str4, false, "");
    }

    /* renamed from: a */
    public AbstractC68307f<DocumentCreateInfo> mo31353a(String str, int i, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4, String str4, boolean z5, String str5) {
        C13479a.m54772d("DocumentCreateHelper", "startCreateFromTemplate()...token = " + str + ", documentType = " + i + ", module = " + str3);
        return this.f21719a.mo20117a($$Lambda$DocumentCreateHelper$mVwj0yKIlALl6xGh4f8tVsbCF6I.INSTANCE).mo20141a(m32472a(str, i, str2, z5, str5)).mo238020d($$Lambda$86TVNkgoyn5KFtGikcKhPnwQC0.INSTANCE).mo237985a(C11678b.m48479c()).mo238020d(new C8255o(this.f21721c, i, "", str2, str3)).mo238020d($$Lambda$DocumentCreateHelper$VYkJXeuEyygXPPfN0tvF0eiiqYo.INSTANCE).mo237985a(C11678b.m48481e()).mo238020d(new Function(i, z2, z, z3, str2, str3, str, z5, str5, z4, str4) {
            /* class com.bytedance.ee.bear.list.$$Lambda$DocumentCreateHelper$WAKD_U7cBLXhWqaZR48SOXXoER4 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ boolean f$10;
            public final /* synthetic */ String f$11;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ boolean f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ boolean f$8;
            public final /* synthetic */ String f$9;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
                this.f$10 = r11;
                this.f$11 = r12;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DocumentCreateHelper.this.m32474a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (DocumentCreateInfo) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo31354a(DocumentCreateEntity documentCreateEntity, JSONObject jSONObject) {
        try {
            documentCreateEntity.objToken = jSONObject.optString("obj_token");
            documentCreateEntity.token = jSONObject.optString("token");
            documentCreateEntity.ownerType = jSONObject.optInt("owner_type");
            documentCreateEntity.url = jSONObject.optString("url");
            documentCreateEntity.title = jSONObject.optString("name");
            documentCreateEntity.type = jSONObject.optInt(ShareHitPoint.f121869d);
            documentCreateEntity.isShareFolder = jSONObject.optJSONObject("extra").optBoolean("is_share_folder");
        } catch (Exception e) {
            e.printStackTrace();
            C13479a.m54759a("DocumentCreateHelper", "json exception", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentCreateInfoAdapter m32476a(String str) throws NetService.ParseException {
        return (DocumentCreateInfoAdapter) JSON.parseObject(str, DocumentCreateInfoAdapter.class);
    }

    public DocumentCreateHelper(C10917c cVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentCreateInfo m32475a(DocumentCreateEntity documentCreateEntity) throws Exception {
        return new DocumentCreateInfo(documentCreateEntity.token, documentCreateEntity.objToken, documentCreateEntity.templateToken, documentCreateEntity.url, documentCreateEntity.title, documentCreateEntity.ownerType);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ DocumentCreateInfo m32482b(DocumentCreateEntity documentCreateEntity) throws Exception {
        return new DocumentCreateInfo(documentCreateEntity.token, documentCreateEntity.objToken, documentCreateEntity.templateToken, documentCreateEntity.url, documentCreateEntity.title, documentCreateEntity.ownerType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.DocumentCreateHelper$a */
    public class C8139a implements NetService.AbstractC5074c<DocumentCreateEntity> {

        /* renamed from: b */
        private final boolean f21724b;

        /* renamed from: a */
        public DocumentCreateEntity parse(String str) {
            DocumentCreateEntity documentCreateEntity = new DocumentCreateEntity();
            try {
                JSONObject jSONObject = new JSONObject(str);
                documentCreateEntity.code = jSONObject.optInt("code");
                documentCreateEntity.msg = jSONObject.optString("msg");
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f21724b) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("node_list");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("entities").optJSONObject("nodes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        DocumentCreateHelper.this.mo31354a(documentCreateEntity, optJSONObject2.optJSONObject(jSONArray.getString(i)));
                    }
                } else {
                    documentCreateEntity.objToken = optJSONObject.optString("obj_token");
                    documentCreateEntity.token = optJSONObject.optString("token");
                    documentCreateEntity.url = optJSONObject.optString("url");
                }
                C13479a.m54772d("DocumentCreateHelper", "parse data : " + documentCreateEntity);
            } catch (JSONException e) {
                C13479a.m54759a("DocumentCreateHelper", "json exception", e);
            } catch (NullPointerException e2) {
                C13479a.m54759a("DocumentCreateHelper", "null pointer while parsing JSON", e2);
            }
            return documentCreateEntity;
        }

        public C8139a(boolean z) {
            this.f21724b = z;
        }
    }

    /* renamed from: a */
    private String m32477a(int i, boolean z) {
        C13479a.m54764b("DocumentCreateHelper", "generateUrlFromFG called");
        if (!z) {
            return "/api/explorer/create/";
        }
        if (i == C8275a.f22370c.mo32555b()) {
            return "/space/api/explorer/v2/create/folder/";
        }
        return "/space/api/explorer/v2/create/object/";
    }

    /* renamed from: a */
    private String m32478a(DocumentCreateInfo documentCreateInfo, int i) {
        if (i == C8275a.f22371d.mo32555b() || i == C8275a.f22372e.mo32555b() || i == C8275a.f22374g.mo32555b()) {
            return C13598b.m55197d(documentCreateInfo.mo20274b());
        }
        if (i == C8275a.f22370c.mo32555b()) {
            return C13598b.m55197d(documentCreateInfo.mo20273a());
        }
        return "";
    }

    /* renamed from: a */
    private HashMap<String, String> m32480a(boolean z, HashMap<String, String> hashMap, String str) {
        if (z) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("content", str);
            }
        } else if (!TextUtils.isEmpty(str)) {
            hashMap.put("origin_content", str);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DocumentCreateInfo m32473a(int i, String str, String str2, DocumentCreateInfo documentCreateInfo) throws Exception {
        C8228a.m33793a(this.f21720b, C8275a.m34050a(i), m32478a(documentCreateInfo, i), C5174a.m21161a(this.f21722d.mo17344E()), str, str2);
        return documentCreateInfo;
    }

    /* renamed from: b */
    private NetService.C5076e m32481b(String str, int i, String str2, String str3, boolean z) {
        C13479a.m54764b("DocumentCreateHelper", "buildRequest called");
        NetService.C5077f fVar = new NetService.C5077f(m32477a(i, z));
        fVar.mo20143a(1);
        fVar.mo20147a(m32479a(str, i, str2, str3, z));
        return fVar;
    }

    /* renamed from: a */
    private NetService.C5076e m32472a(String str, int i, String str2, boolean z, String str3) {
        NetService.C5077f fVar;
        if (z) {
            fVar = new NetService.C5077f("/space/api/platform/template/create_i18n_obj/");
        } else {
            fVar = new NetService.C5077f("/api/obj_template/create_obj/");
        }
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("parent_token", str2);
        }
        if (z) {
            hashMap.put("template_i18n_id", str3);
        } else {
            hashMap.put("token", str);
            hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        }
        fVar.mo20147a(hashMap);
        fVar.mo20154c(hashMap);
        return fVar;
    }

    /* renamed from: a */
    private HashMap<String, String> m32479a(String str, int i, String str2, String str3, boolean z) {
        HashMap<String, String> hashMap = new HashMap<>();
        C13479a.m54764b("DocumentCreateHelper", "generateRequestParamFromFG called");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("parent_token", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("name", str2);
        }
        hashMap.put(ShareHitPoint.f121868c, "0");
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        if (i == C8275a.f22370c.mo32555b()) {
            return hashMap;
        }
        return m32480a(z, hashMap, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ DocumentCreateInfo m32474a(int i, boolean z, boolean z2, boolean z3, String str, String str2, String str3, boolean z4, String str4, boolean z5, String str5, DocumentCreateInfo documentCreateInfo) throws Exception {
        String str6;
        String str7;
        String str8;
        String a = C8275a.m34050a(i);
        if (z) {
            str6 = "from_onboarding_banner";
        } else if (z2) {
            str6 = "space_template";
        } else {
            str6 = "new_template";
        }
        if (z3) {
            str6 = "from_spacehometemplate";
        }
        AbstractC5233x xVar = this.f21720b;
        String str9 = documentCreateInfo.f14843b;
        String a2 = C5174a.m21161a(this.f21722d.mo17344E());
        if (TextUtils.isEmpty(documentCreateInfo.f14844c)) {
            str7 = str3;
        } else {
            str7 = documentCreateInfo.f14844c;
        }
        if (z4) {
            str8 = str4;
        } else {
            str8 = "";
        }
        C8228a.m33794a(xVar, a, str9, a2, str, str2, str6, "PGC", str7, str8, z5, str5);
        return documentCreateInfo;
    }
}
