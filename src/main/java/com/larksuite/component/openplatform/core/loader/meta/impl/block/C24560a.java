package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.annotations.SerializedName;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta;
import com.larksuite.component.openplatform.core.loader.meta.base.C24555d;
import com.tt.refer.common.meta.base.AbsAppMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.a */
public class C24560a extends AbsAppMeta {

    /* renamed from: a */
    private String f60542a;

    /* renamed from: b */
    private int f60543b;

    /* renamed from: c */
    private String f60544c;

    /* renamed from: d */
    private String f60545d;
    @SerializedName("useOpenSchemaWhiteList")

    /* renamed from: e */
    private boolean f60546e;
    @SerializedName("openSchemaWhiteList")

    /* renamed from: f */
    private List<ApplicationMeta.C24550b> f60547f;

    /* renamed from: g */
    private C24561a f60548g = new C24561a();

    /* renamed from: a */
    public String mo87507a() {
        return this.f60545d;
    }

    /* renamed from: b */
    public List<ApplicationMeta.C24550b> mo87512b() {
        return this.f60547f;
    }

    /* renamed from: e */
    public String mo87517e() {
        return this.f60542a;
    }

    /* renamed from: f */
    public String mo87518f() {
        return this.f60544c;
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public int getMetaSource() {
        return this.f60543b;
    }

    /* renamed from: c */
    public boolean mo87515c() {
        return this.f60546e;
    }

    /* renamed from: d */
    public C24555d mo87516d() {
        return this.f60548g.f60549a;
    }

    @Nullable
    /* renamed from: g */
    public List<String> mo87519g() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.f60548g.f60549a.mo87501d())) {
            arrayList.add(this.f60548g.f60549a.mo87501d());
        }
        C24561a aVar = this.f60548g;
        if (!(aVar == null || aVar.f60549a == null)) {
            arrayList.addAll(this.f60548g.f60549a.mo87494a());
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo87520h() {
        C24561a aVar = this.f60548g;
        if (aVar != null && aVar.f60549a != null) {
            return this.f60548g.f60549a.mo87498b();
        }
        AppBrandLogger.m52829e("app_start_load_meta_block", "bizAppMeta is null or CodeInfo is null!");
        return "";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BlockAppInfo:");
        stringBuffer.append(" appId:");
        stringBuffer.append(getAppId());
        stringBuffer.append(" identifyId:");
        stringBuffer.append(getIdentifier());
        stringBuffer.append(" versionType:");
        stringBuffer.append(getVersionType());
        stringBuffer.append(" version:");
        stringBuffer.append(this.appVersion);
        stringBuffer.append(" lang:");
        stringBuffer.append(this.f60544c);
        stringBuffer.append(" codeInfo:");
        stringBuffer.append(this.f60548g.f60549a);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public void mo87514c(String str) {
        this.f60544c = str;
    }

    @Override // com.tt.refer.common.meta.base.AbsAppMeta
    public void setMetaSource(int i) {
        this.f60543b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.a$a */
    public class C24561a {

        /* renamed from: a */
        public C24555d f60549a;

        C24561a() {
        }
    }

    /* renamed from: a */
    public void mo87508a(@Nonnull C24555d dVar) {
        this.f60548g.f60549a = dVar;
    }

    /* renamed from: b */
    public void mo87513b(String str) {
        this.f60542a = str;
    }

    /* renamed from: a */
    public void mo87509a(String str) {
        this.f60545d = str;
    }

    /* renamed from: a */
    public void mo87510a(List<ApplicationMeta.C24550b> list) {
        this.f60547f = list;
    }

    /* renamed from: a */
    public void mo87511a(boolean z) {
        this.f60546e = z;
    }

    /* renamed from: a */
    public static List<C24560a> m89577a(@Nonnull ApplicationMeta applicationMeta) {
        JSONObject optJSONObject;
        if (applicationMeta == null || applicationMeta.mo87479e() == null) {
            AppBrandLogger.m52829e("app_start_load_meta_block", "fromApplicationMeta ->applicationMeta is null or extensionMetas i snull!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map<String, ApplicationMeta.C24549a> e = applicationMeta.mo87479e();
        if (e == null) {
            AppBrandLogger.m52829e("app_start_load_meta_block", "fromApplicationMeta->extensionMeta is null!");
            return arrayList;
        }
        for (Map.Entry<String, ApplicationMeta.C24549a> entry : e.entrySet()) {
            if (entry != null) {
                ApplicationMeta.C24549a value = entry.getValue();
                if (!"block".equals(value.mo87486e())) {
                    AppBrandLogger.m52829e("app_start_load_meta_block", "fromApplicationMeta ->applicationMeta-> not block type!");
                } else {
                    C24560a aVar = new C24560a();
                    aVar.setAppId(applicationMeta.mo87468a());
                    aVar.setName(applicationMeta.mo87475c());
                    aVar.setAppVersion(applicationMeta.mo87477d());
                    aVar.setIcon(applicationMeta.mo87473b());
                    aVar.mo87513b(value.mo87483b());
                    aVar.setIdentifier(value.mo87484c());
                    aVar.mo87511a(applicationMeta.mo87481g());
                    if (aVar.mo87515c()) {
                        aVar.mo87510a(applicationMeta.mo87480f());
                    }
                    aVar.mo87509a(value.mo87482a());
                    String d = value.mo87485d();
                    if (TextUtils.isEmpty(d)) {
                        AppBrandLogger.m52829e("app_start_load_meta_block", "fromApplicationMeta ->applicationMeta->meta json is null!");
                    } else {
                        try {
                            JSONObject optJSONObject2 = new JSONObject(d).optJSONObject("pkg");
                            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("block_mobile_lynx_pkg")) == null)) {
                                aVar.mo87508a((C24555d) C24548a.m89535a().fromJson(optJSONObject.toString(), C24555d.class));
                                arrayList.add(aVar);
                            }
                        } catch (JSONException unused) {
                            AppBrandLogger.m52829e("app_start_load_meta_block", "meta json exception:", d);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
