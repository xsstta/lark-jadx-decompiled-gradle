package com.ss.android.lark.location.p2145a;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.location.listener.AbstractC41582a;

/* renamed from: com.ss.android.lark.location.a.b */
public interface AbstractC41553b {

    /* renamed from: com.ss.android.lark.location.a.b$a */
    public interface AbstractC41554a {
        /* renamed from: a */
        void mo149518a(AbstractC41582a aVar);

        /* renamed from: a */
        boolean mo149519a();

        /* renamed from: b */
        void mo149520b(AbstractC41582a aVar);
    }

    /* renamed from: com.ss.android.lark.location.a.b$b */
    public interface AbstractC41555b {
        /* renamed from: a */
        boolean mo149521a();
    }

    AbstractC41554a getAppStateDependency();

    Context getContext();

    AbstractC41555b getLanguageDependency();

    Activity getTopActivity();

    boolean isFeatureGatingOn(String str);
}
