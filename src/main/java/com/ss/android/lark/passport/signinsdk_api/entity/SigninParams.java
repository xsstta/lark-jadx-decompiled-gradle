package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class SigninParams implements Serializable {
    public static final SigninParams DEFAULT = new SigninParams();
    public boolean clearTask;
    public int[] enterAnimation;
    public int[] exitAnimation;
    public boolean fromGuide;
    public boolean isRegister;
    public boolean showCloseIcon;
    public boolean showDefaultAnimation;
    public boolean showLanguageSwitcher = true;
    public boolean showLoginBackIcon;
    public boolean skipOneKeyAuth;

    public int[] getEnterAnimation() {
        return this.enterAnimation;
    }

    public int[] getExitAnimation() {
        return this.exitAnimation;
    }

    public boolean isClearTask() {
        return this.clearTask;
    }

    public boolean isFromGuide() {
        return this.fromGuide;
    }

    public boolean isRegister() {
        return this.isRegister;
    }

    public boolean isShowCloseIcon() {
        return this.showCloseIcon;
    }

    public boolean isShowDefaultAnimation() {
        return this.showDefaultAnimation;
    }

    public boolean isShowLanguageSwitcher() {
        return this.showLanguageSwitcher;
    }

    public boolean isShowLoginBackIcon() {
        return this.showLoginBackIcon;
    }

    public boolean isSkipOneKeyAuth() {
        return this.skipOneKeyAuth;
    }

    public static C49365a newBuilder() {
        return new C49365a();
    }

    /* renamed from: com.ss.android.lark.passport.signinsdk_api.entity.SigninParams$a */
    public static class C49365a {

        /* renamed from: a */
        private SigninParams f123889a = new SigninParams();

        /* renamed from: a */
        public SigninParams mo172350a() {
            return SigninParams.clone(this.f123889a);
        }

        /* renamed from: a */
        public C49365a mo172348a(boolean z) {
            this.f123889a.isRegister = z;
            return this;
        }

        /* renamed from: b */
        public C49365a mo172351b(boolean z) {
            this.f123889a.clearTask = z;
            return this;
        }

        /* renamed from: c */
        public C49365a mo172353c(boolean z) {
            this.f123889a.fromGuide = z;
            return this;
        }

        /* renamed from: d */
        public C49365a mo172354d(boolean z) {
            this.f123889a.showLoginBackIcon = z;
            return this;
        }

        /* renamed from: e */
        public C49365a mo172355e(boolean z) {
            this.f123889a.skipOneKeyAuth = z;
            return this;
        }

        /* renamed from: f */
        public C49365a mo172356f(boolean z) {
            this.f123889a.showDefaultAnimation = z;
            return this;
        }

        /* renamed from: g */
        public C49365a mo172357g(boolean z) {
            this.f123889a.showLanguageSwitcher = z;
            return this;
        }

        /* renamed from: h */
        public C49365a mo172358h(boolean z) {
            this.f123889a.showCloseIcon = z;
            return this;
        }

        /* renamed from: a */
        public C49365a mo172349a(int[] iArr) {
            this.f123889a.enterAnimation = iArr;
            return this;
        }

        /* renamed from: b */
        public C49365a mo172352b(int[] iArr) {
            this.f123889a.exitAnimation = iArr;
            return this;
        }
    }

    public C49365a buildUpon() {
        return newBuilder().mo172348a(this.isRegister).mo172351b(this.clearTask).mo172354d(this.showLoginBackIcon);
    }

    public static SigninParams clone(SigninParams signinParams) {
        if (signinParams == null) {
            return signinParams;
        }
        SigninParams signinParams2 = new SigninParams();
        signinParams2.isRegister = signinParams.isRegister();
        signinParams2.clearTask = signinParams.isClearTask();
        signinParams2.fromGuide = signinParams.isFromGuide();
        signinParams2.skipOneKeyAuth = signinParams.isSkipOneKeyAuth();
        signinParams2.showLoginBackIcon = signinParams.isShowLoginBackIcon();
        signinParams2.showDefaultAnimation = signinParams.isShowDefaultAnimation();
        signinParams2.showLanguageSwitcher = signinParams.isShowLanguageSwitcher();
        signinParams2.enterAnimation = signinParams.getEnterAnimation();
        signinParams2.exitAnimation = signinParams.getExitAnimation();
        signinParams2.showCloseIcon = signinParams.isShowCloseIcon();
        return signinParams2;
    }
}
