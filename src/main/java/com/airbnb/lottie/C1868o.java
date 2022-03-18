package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.o */
public class C1868o {

    /* renamed from: a */
    private final Map<String, String> f6475a;

    /* renamed from: b */
    private final LottieAnimationView f6476b;

    /* renamed from: c */
    private final LottieDrawable f6477c;

    /* renamed from: d */
    private boolean f6478d;

    /* renamed from: b */
    private String m8403b(String str) {
        return str;
    }

    /* renamed from: a */
    private void m8402a() {
        LottieAnimationView lottieAnimationView = this.f6476b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.f6477c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    C1868o() {
        this.f6475a = new HashMap();
        this.f6478d = true;
        this.f6476b = null;
        this.f6477c = null;
    }

    public C1868o(LottieAnimationView lottieAnimationView) {
        this.f6475a = new HashMap();
        this.f6478d = true;
        this.f6476b = lottieAnimationView;
        this.f6477c = null;
    }

    /* renamed from: a */
    public final String mo9312a(String str) {
        if (this.f6478d && this.f6475a.containsKey(str)) {
            return this.f6475a.get(str);
        }
        String b = m8403b(str);
        if (this.f6478d) {
            this.f6475a.put(str, b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo9313a(String str, String str2) {
        this.f6475a.put(str, str2);
        m8402a();
    }
}
