package com.ss.android.lark.member_manage.dto;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.dto.d */
public class C44895d {

    /* renamed from: a */
    public List<ChatChatter> f113668a;

    /* renamed from: b */
    public List<ChatChatter> f113669b;

    /* renamed from: c */
    public List<ChatChatter> f113670c;

    /* renamed from: d */
    public Map<String, String> f113671d;

    /* renamed from: e */
    public boolean f113672e;

    /* renamed from: f */
    public String f113673f;

    public C44895d() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new HashMap(), false, "");
    }

    public C44895d(List<ChatChatter> list, List<ChatChatter> list2, List<ChatChatter> list3, Map<String, String> map, boolean z, String str) {
        this.f113668a = new ArrayList();
        this.f113669b = new ArrayList();
        this.f113670c = new ArrayList();
        this.f113671d = new HashMap();
        CollectionUtils.resetToList(this.f113668a, list);
        CollectionUtils.resetToList(this.f113669b, list2);
        CollectionUtils.resetToList(this.f113670c, list3);
        if (CollectionUtils.isNotEmpty(map)) {
            this.f113671d.putAll(map);
        }
        this.f113672e = z;
        this.f113673f = str;
    }
}
