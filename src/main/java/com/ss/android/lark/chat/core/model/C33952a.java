package com.ss.android.lark.chat.core.model;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.core.model.a */
public class C33952a<T extends AbstractC34006a> {

    /* renamed from: a */
    private List<T> f87535a = new ArrayList();

    /* renamed from: b */
    private List<Integer> f87536b = new ArrayList();

    /* renamed from: c */
    private List<Integer> f87537c = new ArrayList();

    /* renamed from: b */
    public List<T> mo124058b() {
        return this.f87535a;
    }

    /* renamed from: c */
    public List<Integer> mo124060c() {
        return this.f87536b;
    }

    /* renamed from: d */
    public List<Integer> mo124062d() {
        return this.f87537c;
    }

    public C33952a() {
    }

    /* renamed from: a */
    public void mo124057a(List<T> list) {
        CollectionUtils.resetToList(this.f87535a, list);
    }

    /* renamed from: b */
    public void mo124059b(List<Integer> list) {
        CollectionUtils.resetToList(this.f87536b, list);
    }

    /* renamed from: c */
    public void mo124061c(List<Integer> list) {
        CollectionUtils.resetToList(this.f87537c, list);
    }

    public C33952a(List<T> list, List<Integer> list2, List<Integer> list3) {
        mo124057a(list);
        mo124059b(list2);
        mo124061c(list3);
    }
}
