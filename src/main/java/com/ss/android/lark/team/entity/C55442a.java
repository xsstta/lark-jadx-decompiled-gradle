package com.ss.android.lark.team.entity;

import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Team;
import com.bytedance.lark.pb.im.v1.PushItems;
import com.ss.android.lark.team.p2733c.C55366b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.team.entity.a */
public class C55442a {

    /* renamed from: a */
    PushItems.Action f136856a = PushItems.Action.UNKNOWN;

    /* renamed from: b */
    List<Item> f136857b = new ArrayList();

    /* renamed from: c */
    Map<Long, Team> f136858c = new HashMap();

    /* renamed from: a */
    public PushItems.Action mo189193a() {
        return this.f136856a;
    }

    /* renamed from: b */
    public List<Item> mo189194b() {
        return this.f136857b;
    }

    /* renamed from: c */
    public Map<Long, Team> mo189195c() {
        return this.f136858c;
    }

    private C55442a() {
    }

    public String toString() {
        return "PushChangeItem{pushAction=" + this.f136856a + ", itemList=" + m215096d() + ", teamMap=" + m215097e() + '}';
    }

    /* renamed from: d */
    private String m215096d() {
        StringBuilder sb = new StringBuilder("{ ");
        for (Item item : this.f136857b) {
            sb.append(item.getId());
            sb.append("|");
            sb.append(item.getEntityType());
            sb.append("|");
            sb.append(item.getEntityId());
            sb.append("|");
            sb.append(item.getParentId());
            sb.append(", ");
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: e */
    private String m215097e() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<Long, Team> entry : this.f136858c.entrySet()) {
            sb.append(entry.getValue().getName());
            sb.append("|");
            sb.append(entry.getValue().getStatus());
            sb.append("|");
            sb.append(entry.getValue().getMemberCount());
            sb.append(", ");
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public static C55442a m215095a(PushItems pushItems) {
        if (pushItems == null) {
            return null;
        }
        C55442a aVar = new C55442a();
        aVar.f136856a = pushItems.action;
        ArrayList arrayList = new ArrayList();
        for (Item item : pushItems.items) {
            if (item != null) {
                arrayList.add(C55366b.m214900a(item));
            }
        }
        aVar.f136857b = arrayList;
        HashMap hashMap = new HashMap();
        for (Map.Entry<Long, Team> entry : pushItems.teams.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), C55366b.m214901a(entry.getValue()));
            }
        }
        aVar.f136858c = hashMap;
        return aVar;
    }
}
