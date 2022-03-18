package com.ss.android.lark.dto.chat;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.dto.chat.f */
public class C36870f {

    /* renamed from: a */
    public List<ChatChatter> f94773a;

    /* renamed from: b */
    public List<ChatChatter> f94774b;

    /* renamed from: c */
    public List<ChatChatter> f94775c;

    /* renamed from: d */
    public Map<String, String> f94776d;

    /* renamed from: e */
    public boolean f94777e;

    /* renamed from: f */
    public String f94778f;

    public C36870f() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new HashMap(), false, "");
    }

    public C36870f(List<ChatChatter> list, List<ChatChatter> list2, List<ChatChatter> list3, Map<String, String> map, boolean z, String str) {
        this.f94773a = new ArrayList();
        this.f94774b = new ArrayList();
        this.f94775c = new ArrayList();
        this.f94776d = new HashMap();
        CollectionUtils.resetToList(this.f94773a, list);
        CollectionUtils.resetToList(this.f94774b, list2);
        CollectionUtils.resetToList(this.f94775c, list3);
        if (CollectionUtils.isNotEmpty(map)) {
            this.f94776d.putAll(map);
        }
        this.f94777e = z;
        this.f94778f = str;
    }
}
