package com.ss.android.lark.contact.impl.department.detail.frame;

import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.a */
public class C35850a {

    /* renamed from: a */
    private Department f92712a;

    /* renamed from: b */
    private List<DepartmentRecyclerViewItem> f92713b;

    /* renamed from: c */
    private Set<String> f92714c = new HashSet();

    /* renamed from: d */
    private Set<String> f92715d = new HashSet();

    /* renamed from: e */
    private Map<String, DeniedReason> f92716e = new HashMap();

    /* renamed from: f */
    private Map<String, String> f92717f = new HashMap();

    /* renamed from: a */
    public Department mo131895a() {
        return this.f92712a;
    }

    /* renamed from: b */
    public List<DepartmentRecyclerViewItem> mo131900b() {
        return this.f92713b;
    }

    /* renamed from: c */
    public Set<String> mo131903c() {
        return this.f92714c;
    }

    /* renamed from: d */
    public Set<String> mo131904d() {
        return this.f92715d;
    }

    /* renamed from: e */
    public Map<String, DeniedReason> mo131905e() {
        return this.f92716e;
    }

    /* renamed from: f */
    public Map<String, String> mo131906f() {
        return this.f92717f;
    }

    /* renamed from: a */
    public void mo131896a(Department department) {
        this.f92712a = department;
    }

    /* renamed from: a */
    public void mo131897a(List<DepartmentRecyclerViewItem> list) {
        this.f92713b = list;
    }

    /* renamed from: b */
    public void mo131901b(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.f92717f.putAll(map);
        }
    }

    /* renamed from: a */
    public void mo131898a(Map<String, DeniedReason> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            this.f92716e.putAll(map);
        }
    }

    /* renamed from: b */
    public void mo131902b(Set<String> set) {
        if (CollectionUtils.isNotEmpty(set)) {
            this.f92715d.addAll(set);
        }
    }

    /* renamed from: a */
    public void mo131899a(Set<String> set) {
        if (CollectionUtils.isNotEmpty(set)) {
            this.f92714c.addAll(set);
        }
    }
}
