package com.ss.android.lark.image.impl;

import android.app.Fragment;
import android.content.Context;
import com.ss.android.lark.image.api.AbstractC38812c;

/* renamed from: com.ss.android.lark.image.impl.i */
public class C38910i extends C38899h {
    @Override // com.ss.android.lark.image.impl.C38899h
    /* renamed from: a */
    public C38899h load(Object obj) {
        C38899h hVar;
        if (this.f99949b != null) {
            hVar = new C38899h(this.f99948a, this.f99949b);
        } else if (this.f99950c != null) {
            hVar = new C38899h(this.f99948a, this.f99950c);
        } else if (this.f99951d != null) {
            hVar = new C38899h(this.f99948a, this.f99951d);
        } else {
            hVar = null;
        }
        return hVar.load(obj);
    }

    public C38910i(AbstractC38812c cVar, Fragment fragment) {
        super(cVar, fragment);
    }

    public C38910i(AbstractC38812c cVar, Context context) {
        super(cVar, context);
    }

    public C38910i(AbstractC38812c cVar, androidx.fragment.app.Fragment fragment) {
        super(cVar, fragment);
    }
}
