package com.bytedance.ee.bear.wiki.wikitree.tree.p586a;

import android.util.ArrayMap;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.a.g */
public final class C12138g {

    /* renamed from: a */
    public final int f32696a;

    /* renamed from: b */
    public final int f32697b;

    /* renamed from: c */
    public final int f32698c;

    /* renamed from: d */
    public ArrayMap<String, Object> f32699d;

    /* renamed from: e */
    public List<TreeNode> f32700e;

    public String toString() {
        return "WikiList{statusCode=" + this.f32696a + ", actionCode=" + this.f32697b + ", resultCode=" + this.f32698c + '}';
    }

    /* renamed from: a */
    static C12138g m50249a(int i) {
        return new C12138g(CommonCode.StatusCode.API_CLIENT_EXPIRED, i, -1, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12138g mo46433a(Map<String, Object> map) {
        if (map == null) {
            return this;
        }
        if (this.f32699d == null) {
            this.f32699d = new ArrayMap<>();
        }
        this.f32699d.putAll(map);
        return this;
    }

    /* renamed from: a */
    public <T> T mo46434a(String str) {
        ArrayMap<String, Object> arrayMap = this.f32699d;
        if (arrayMap != null && arrayMap.containsKey(str)) {
            try {
                return (T) this.f32699d.get(str);
            } catch (ClassCastException e) {
                C13479a.m54761a("Wiki_WikiList", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    static C12138g m50250a(int i, int i2) {
        return new C12138g(1003, i, i2, null);
    }

    /* renamed from: a */
    static C12138g m50251a(int i, List<TreeNode> list) {
        return new C12138g(1002, i, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12138g mo46432a(String str, Object obj) {
        if (this.f32699d == null) {
            this.f32699d = new ArrayMap<>();
        }
        this.f32699d.put(str, obj);
        return this;
    }

    /* renamed from: a */
    public boolean mo46435a(String str, boolean z) {
        Boolean bool = (Boolean) mo46434a(str);
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    private C12138g(int i, int i2, int i3, List<TreeNode> list) {
        this.f32696a = i;
        this.f32697b = i2;
        this.f32698c = i3;
        this.f32700e = list;
    }
}
