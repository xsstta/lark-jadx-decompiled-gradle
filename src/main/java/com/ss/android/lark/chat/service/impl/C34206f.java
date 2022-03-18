package com.ss.android.lark.chat.service.impl;

import androidx.collection.C0517d;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.AbstractC34122c;
import com.ss.android.lark.chat.service.AbstractC34297l;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.f */
public class C34206f implements AbstractC34122c {

    /* renamed from: a */
    private C0517d<String, Chatter> f88502a;

    /* renamed from: b */
    private AbstractC34297l f88503b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.f$a */
    public static final class C34208a {

        /* renamed from: a */
        public static final C34206f f88504a = new C34206f();
    }

    /* renamed from: a */
    public static C34206f m132767a() {
        return C34208a.f88504a;
    }

    private C34206f() {
        this.f88503b = C32835d.m126323c();
        mo126755b();
    }

    /* renamed from: b */
    public void mo126755b() {
        this.f88502a = new C0517d<>(ParticipantRepo.f117150c);
    }

    @Override // com.ss.android.lark.chat.service.AbstractC34122c
    /* renamed from: a */
    public void mo126550a(String str) {
        mo126754a(Collections.singletonList(str));
    }

    /* renamed from: a */
    public void mo126754a(List<String> list) {
        for (String str : list) {
            this.f88502a.mo2980b(str);
        }
    }
}
