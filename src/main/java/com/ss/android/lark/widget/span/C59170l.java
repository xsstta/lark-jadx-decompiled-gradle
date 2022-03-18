package com.ss.android.lark.widget.span;

import android.text.TextUtils;
import androidx.collection.C0517d;
import com.larksuite.framework.utils.CollectionUtils;

/* renamed from: com.ss.android.lark.widget.span.l */
public class C59170l {

    /* renamed from: a */
    private C0517d<Integer, RecogniseSpansResult> f146863a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.span.l$a */
    public static final class C59172a {

        /* renamed from: a */
        public static final C59170l f146864a = new C59170l();
    }

    /* renamed from: a */
    public static C59170l m229843a() {
        return C59172a.f146864a;
    }

    private C59170l() {
        this.f146863a = new C0517d<>(100);
    }

    /* renamed from: a */
    public static boolean m229844a(RecogniseSpansResult recogniseSpansResult) {
        if (recogniseSpansResult != null && !CollectionUtils.isEmpty(recogniseSpansResult.getAllSpanInfos())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized RecogniseSpansResult mo201118a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f146863a.mo2974a(Integer.valueOf(str.hashCode()));
    }

    /* renamed from: a */
    public synchronized boolean mo201119a(String str, RecogniseSpansResult recogniseSpansResult) {
        if (!TextUtils.isEmpty(str)) {
            if (recogniseSpansResult != null) {
                this.f146863a.mo2975a(Integer.valueOf(str.hashCode()), recogniseSpansResult);
                return true;
            }
        }
        return false;
    }
}
