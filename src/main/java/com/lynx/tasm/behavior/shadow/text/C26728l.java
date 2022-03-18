package com.lynx.tasm.behavior.shadow.text;

import android.util.LruCache;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.shadow.text.TextRenderer;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.lynx.tasm.behavior.shadow.text.l */
public class C26728l {

    /* renamed from: a */
    private LruCache<C26731m, TextRenderer> f66161a;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.l$a */
    public static class C26730a {

        /* renamed from: a */
        public static C26728l f66162a = new C26728l();
    }

    /* renamed from: a */
    public static C26728l m96865a() {
        return C26730a.f66162a;
    }

    private C26728l() {
        this.f66161a = new LruCache<>(ParticipantRepo.f117150c);
    }

    /* renamed from: a */
    public TextRenderer mo94903a(AbstractC26684l lVar, C26731m mVar) throws TextRenderer.TypefaceNotFoundException {
        TextRenderer textRenderer = this.f66161a.get(mVar);
        if (textRenderer != null) {
            return textRenderer;
        }
        TextRenderer textRenderer2 = new TextRenderer(lVar, mVar);
        this.f66161a.put(mVar, textRenderer2);
        HandlerThreadC26724k.m96863a().mo94900a(textRenderer2.mo94872a());
        return textRenderer2;
    }
}
