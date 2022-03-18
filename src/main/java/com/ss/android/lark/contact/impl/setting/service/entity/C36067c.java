package com.ss.android.lark.contact.impl.setting.service.entity;

import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.setting.service.entity.c */
public class C36067c {

    /* renamed from: a */
    private C36068d f93216a;

    /* renamed from: b */
    private C36070f f93217b;

    /* renamed from: b */
    public C36068d mo132621b() {
        return this.f93216a;
    }

    /* renamed from: c */
    public C36070f mo132622c() {
        return this.f93217b;
    }

    /* renamed from: a */
    public List<WayToFindMeSettingItem> mo132620a() {
        C36070f fVar = this.f93217b;
        if (fVar == null) {
            return Collections.EMPTY_LIST;
        }
        return fVar.mo132627a();
    }

    public C36067c(C36070f fVar, C36068d dVar) {
        this.f93217b = fVar;
        this.f93216a = dVar;
    }
}
