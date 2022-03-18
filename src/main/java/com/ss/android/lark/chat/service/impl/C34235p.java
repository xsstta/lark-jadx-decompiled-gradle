package com.ss.android.lark.chat.service.impl;

import android.content.Context;
import com.ss.android.lark.chat.api.service.AbstractC32903f;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34349o;
import com.ss.android.lark.chat.utils.C34350p;

/* renamed from: com.ss.android.lark.chat.service.impl.p */
public class C34235p implements AbstractC32903f {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.p$a */
    public static final class C34237a {

        /* renamed from: a */
        public static final C34235p f88542a = new C34235p();
    }

    private C34235p() {
    }

    /* renamed from: a */
    public static C34235p m132853a() {
        return C34237a.f88542a;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32903f
    /* renamed from: a */
    public String mo121392a(Message message) {
        return C34350p.m133213a(message);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32903f
    /* renamed from: a */
    public String mo121391a(Chatter chatter, boolean z) {
        return C34350p.m133212a(chatter, z);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32903f
    /* renamed from: a */
    public CharSequence mo121389a(Context context, Message message, int i) {
        return C34349o.m133200a(context, message, i);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32903f
    /* renamed from: a */
    public CharSequence mo121390a(Context context, Message message, boolean z, int i) {
        return C34349o.m133204a(context, message, false, false, z, false, i);
    }
}
