package com.ss.android.lark.feed.app.team.entity;

import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.team.entity.e */
public class C37875e {

    /* renamed from: a */
    private Item f97143a;

    /* renamed from: b */
    private Team f97144b;

    /* renamed from: c */
    private final Map<String, C37874d> f97145c = new HashMap();

    /* renamed from: d */
    private boolean f97146d = true;

    /* renamed from: a */
    public Item mo138756a() {
        return this.f97143a;
    }

    /* renamed from: d */
    public Team mo138766d() {
        return this.f97144b;
    }

    /* renamed from: c */
    public long mo138764c() {
        return this.f97144b.getId();
    }

    /* renamed from: b */
    public long mo138762b() {
        Item item = this.f97143a;
        if (item == null) {
            return 0;
        }
        return item.getId();
    }

    /* renamed from: a */
    public void mo138757a(Item item) {
        this.f97143a = item;
    }

    /* renamed from: b */
    public void mo138763b(String str) {
        this.f97145c.remove(str);
    }

    /* renamed from: a */
    public void mo138758a(Team team) {
        this.f97144b = team;
    }

    /* renamed from: c */
    public C37874d mo138765c(String str) {
        return this.f97145c.get(str);
    }

    /* renamed from: a */
    public void mo138759a(List<C37874d> list) {
        this.f97145c.clear();
        for (C37874d dVar : list) {
            this.f97145c.put(dVar.mo138742b(), dVar);
        }
    }

    /* renamed from: a */
    public void mo138760a(boolean z) {
        this.f97146d = z;
    }

    /* renamed from: a */
    public boolean mo138761a(String str) {
        return this.f97145c.containsKey(str);
    }

    public C37875e(Item item, Team team) {
        this.f97143a = item;
        this.f97144b = team;
    }
}
