package com.ss.android.lark.search.impl.func.detail.p2616b;

import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.detail.b.a */
public class C53561a {

    /* renamed from: a */
    public List<String> f132286a = new ArrayList();

    /* renamed from: b */
    public List<String> f132287b = new ArrayList();

    /* renamed from: c */
    public long f132288c;

    /* renamed from: d */
    public long f132289d;

    /* renamed from: e */
    public List<ChatFilterParam.ChatMode> f132290e = new ArrayList();

    /* renamed from: f */
    public List<ChatType> f132291f = new ArrayList();

    /* renamed from: g */
    public List<String> f132292g = new ArrayList();

    /* renamed from: a */
    public boolean mo182809a() {
        if (!m207403c() || !m207402b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m207402b() {
        if (!CollectionUtils.isEmpty(this.f132291f) || !CollectionUtils.isEmpty(this.f132290e) || !CollectionUtils.isEmpty(this.f132292g)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m207403c() {
        if (!CollectionUtils.isEmpty(this.f132286a) || !CollectionUtils.isEmpty(this.f132287b) || this.f132288c != 0 || this.f132289d != 0) {
            return false;
        }
        return true;
    }
}
