package com.ss.android.lark.chat.api.service.p1600b;

import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.AbstractC32819b;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.utils.C34340h;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.chat.api.service.b.c */
public class C32832c implements AbstractC32819b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.api.service.b.c$a */
    public static final class C32834a {

        /* renamed from: a */
        public static final C32832c f84319a = new C32832c();
    }

    private C32832c() {
    }

    /* renamed from: a */
    public static C32832c m126312a() {
        return C32834a.f84319a;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: b */
    public void mo121125b(List<ChatChatter> list) {
        Collections.sort(list, C34340h.m133177a());
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: a */
    public void mo121124a(List<Chatter> list) {
        Collections.sort(list, C34340h.m133177a());
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: a */
    public char mo121120a(OpenChatter openChatter, Locale locale) {
        return C34340h.m133172a(openChatter, locale);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: a */
    public String mo121121a(OpenChatter openChatter, ChatterNameDisplayRule chatterNameDisplayRule) {
        return C34340h.m133174a(openChatter, chatterNameDisplayRule);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: a */
    public String mo121122a(String str, String str2) {
        return C34340h.m133175a(str, str2);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32819b
    /* renamed from: a */
    public String mo121123a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule) {
        return C34340h.m133176a(str, str2, str3, str4, str5, chatterNameDisplayRule);
    }
}
