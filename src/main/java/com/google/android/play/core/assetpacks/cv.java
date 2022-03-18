package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cv implements OnSuccessListener {

    /* renamed from: a */
    private final C22614x f55888a;

    private cv(C22614x xVar) {
        this.f55888a = xVar;
    }

    /* renamed from: a */
    static OnSuccessListener m82104a(C22614x xVar) {
        return new cv(xVar);
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f55888a.mo78828a((List) obj);
    }
}
