package com.ss.android.lark.feed.app.team.entity;

import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.team.entity.Team;

/* renamed from: com.ss.android.lark.feed.app.team.entity.g */
public class C37878g implements IBadgeable {

    /* renamed from: a */
    long f97150a;

    /* renamed from: b */
    Team f97151b;

    /* renamed from: c */
    boolean f97152c = true;

    /* renamed from: d */
    int f97153d;

    /* renamed from: e */
    int f97154e;

    /* renamed from: a */
    public Team mo138771a() {
        return this.f97151b;
    }

    /* renamed from: b */
    public long mo138774b() {
        return this.f97150a;
    }

    /* renamed from: d */
    public boolean mo138777d() {
        return this.f97152c;
    }

    /* renamed from: c */
    public long mo138776c() {
        return this.f97151b.getId();
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public boolean isRemind() {
        if (this.f97153d > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public int getBadgeCount() {
        int i = this.f97153d;
        if (i > 0) {
            return i;
        }
        int i2 = this.f97154e;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo138772a(int i) {
        this.f97153d = i;
    }

    /* renamed from: b */
    public void mo138775b(int i) {
        this.f97154e = i;
    }

    /* renamed from: a */
    public void mo138773a(boolean z) {
        this.f97152c = z;
    }

    public C37878g(long j, Team team, boolean z) {
        this.f97150a = j;
        this.f97151b = team;
        this.f97152c = z;
    }
}
