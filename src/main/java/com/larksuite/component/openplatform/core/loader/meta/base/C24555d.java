package com.larksuite.component.openplatform.core.loader.meta.base;

import com.tt.refer.impl.business.meta.DependComponent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.d */
public class C24555d {

    /* renamed from: a */
    private String f60535a;

    /* renamed from: b */
    private List<String> f60536b;

    /* renamed from: c */
    private String f60537c;

    /* renamed from: d */
    private Map<String, DependComponent> f60538d;

    /* renamed from: a */
    public List<String> mo87494a() {
        return this.f60536b;
    }

    /* renamed from: b */
    public String mo87498b() {
        return this.f60537c;
    }

    /* renamed from: d */
    public String mo87501d() {
        return this.f60535a;
    }

    /* renamed from: c */
    public Map<String, DependComponent> mo87500c() {
        Map<String, DependComponent> map = this.f60538d;
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CodeInfo: {");
        stringBuffer.append(" url:");
        stringBuffer.append(this.f60535a);
        stringBuffer.append(" mBackUpUrls:");
        stringBuffer.append(Arrays.toString(this.f60536b.toArray()));
        stringBuffer.append(" md5:");
        stringBuffer.append(this.f60537c);
        stringBuffer.append(" }");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo87495a(String str) {
        this.f60537c = str;
    }

    /* renamed from: b */
    public void mo87499b(String str) {
        this.f60535a = str;
    }

    /* renamed from: a */
    public void mo87496a(List<String> list) {
        this.f60536b = list;
    }

    /* renamed from: a */
    public void mo87497a(Map<String, DependComponent> map) {
        this.f60538d = map;
    }
}
