package com.ss.android.lark.chat.service.impl;

import com.ss.android.lark.chat.service.AbstractC34126g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.service.impl.u */
public class C34274u<Key, Source, Target> {

    /* renamed from: a */
    Map<Key, AbstractC34126g<Source, Target>> f88561a;

    /* renamed from: b */
    AbstractC34275a<Key, Source> f88562b;

    /* renamed from: com.ss.android.lark.chat.service.impl.u$a */
    public interface AbstractC34275a<Key, Source> {
        /* renamed from: a */
        Key mo126796a(Source source);
    }

    public C34274u() {
        this.f88561a = new HashMap();
    }

    public C34274u(AbstractC34275a<Key, Source> aVar) {
        this();
        this.f88562b = aVar;
    }

    /* renamed from: a */
    public AbstractC34126g<Source, Target> mo126821a(Key key) {
        return this.f88561a.get(key);
    }

    /* renamed from: b */
    public AbstractC34126g<Source, Target> mo126824b(Source source) {
        AbstractC34275a<Key, Source> aVar = this.f88562b;
        if (aVar != null) {
            return mo126821a(aVar.mo126796a(source));
        }
        return null;
    }

    /* renamed from: c */
    public Target mo126825c(Source source) {
        AbstractC34275a<Key, Source> aVar = this.f88562b;
        if (aVar != null) {
            return mo126822a((Object) aVar.mo126796a(source), (Object) source);
        }
        return null;
    }

    /* renamed from: a */
    public void mo126823a(Key key, AbstractC34126g gVar) {
        this.f88561a.put(key, gVar);
    }

    /* renamed from: a */
    public Target mo126822a(Key key, Source source) {
        AbstractC34126g<Source, Target> gVar = this.f88561a.get(key);
        if (gVar != null) {
            return gVar.mo126569a(source);
        }
        return null;
    }
}
