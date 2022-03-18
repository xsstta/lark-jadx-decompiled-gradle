package com.ss.android.lark.widget.tab;

import android.graphics.drawable.Drawable;

/* renamed from: com.ss.android.lark.widget.tab.c */
public abstract class AbstractC59207c implements AbstractC59206b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.tab.c$a */
    public static class C59208a extends AbstractC59207c {

        /* renamed from: a */
        private final AbstractC59206b f147020a;

        @Override // com.ss.android.lark.widget.tab.AbstractC59206b
        /* renamed from: a */
        public Drawable mo149226a() {
            return this.f147020a.mo149226a();
        }

        @Override // com.ss.android.lark.widget.tab.AbstractC59206b
        /* renamed from: b */
        public String mo149227b() {
            return this.f147020a.mo149227b();
        }

        C59208a(AbstractC59206b bVar) {
            this.f147020a = bVar;
        }
    }

    public String toString() {
        return mo149227b();
    }

    /* renamed from: a */
    public static AbstractC59206b m229970a(AbstractC59206b bVar) {
        if (bVar instanceof AbstractC59207c) {
            return bVar;
        }
        return new C59208a(bVar);
    }
}
