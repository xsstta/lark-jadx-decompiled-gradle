package com.ss.android.lark.browser.impl.translate.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract;", "", "()V", "BarDisplayInfo", "BarDisplayOp", "BarSettingInfo", "BarSettingOp", "ITranslateBarModel", "ITranslateBarView", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ITranslateBarContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarDisplayOp;", "", "Companion", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BarDisplayOp {
        public static final Companion Companion = Companion.f74743a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarDisplayOp$Companion;", "", "()V", "LOADING", "", "ORIGIN", "TARGET", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$BarDisplayOp$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f74743a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingOp;", "", "Companion", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BarSettingOp {
        public static final Companion Companion = Companion.f74744a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingOp$Companion;", "", "()V", "AUTO_TRANSLATE", "", "NOT_TRANSLATE_THIS_LANG", "NOT_TRANSLATE_THIS_SITE", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$BarSettingOp$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f74744a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingInfo;", "", "()V", "originLangName", "", "value", "", "getOriginLangName", "isAutoTranslate", "", "isNotTranslateThisLang", "isNotTranslateThisSite", "Setter", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$b */
    public static final class BarSettingInfo {

        /* renamed from: a */
        public int f74748a;

        /* renamed from: b */
        public String f74749b = "";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingInfo$Setter;", "", "()V", "info", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingInfo;", "get", "setAutoTranslate", "enable", "", "setNotTranslateThisLang", "setNotTranslateThisSite", "setOriginLangName", "name", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$b$a */
        public static final class Setter {

            /* renamed from: a */
            private final BarSettingInfo f74750a = new BarSettingInfo();

            /* renamed from: a */
            public final BarSettingInfo mo107954a() {
                return this.f74750a;
            }

            /* renamed from: a */
            public final Setter mo107952a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "name");
                this.f74750a.f74749b = str;
                return this;
            }

            /* renamed from: b */
            public final Setter mo107955b(boolean z) {
                BarSettingInfo bVar = this.f74750a;
                if (z) {
                    bVar.f74748a |= 2;
                }
                return this;
            }

            /* renamed from: c */
            public final Setter mo107956c(boolean z) {
                BarSettingInfo bVar = this.f74750a;
                if (z) {
                    bVar.f74748a |= 4;
                }
                return this;
            }

            /* renamed from: a */
            public final Setter mo107953a(boolean z) {
                BarSettingInfo bVar = this.f74750a;
                if (z) {
                    bVar.f74748a |= 1;
                }
                return this;
            }
        }

        /* renamed from: d */
        public final String mo107951d() {
            return this.f74749b;
        }

        /* renamed from: a */
        public final boolean mo107948a() {
            if ((this.f74748a & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo107949b() {
            if ((this.f74748a & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo107950c() {
            if ((this.f74748a & 4) == 4) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH&¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\f0\bH&J(\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\bH&J\b\u0010\u0011\u001a\u00020\u0012H&JC\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\f0\bH&¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001a\u0010\u001c\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarModel;", "Lcom/larksuite/framework/mvp/IModel;", "fetchOriginLang", "", "sampleTextList", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "([Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "fetchTargetLangList", "", "fetchTranslateSetting", "originLangCode", "webUrl", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "getSampleTextMaxContentLength", "", "sendTranslateRequest", "targetLangCode", "words", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "setAutoTranslate", "enable", "", "setNotTranslateThisLang", "originLang", "setNotTranslateThisSite", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$c */
    public interface ITranslateBarModel extends IModel {
        /* renamed from: a */
        int mo107957a();

        /* renamed from: a */
        void mo107958a(IGetDataCallback<List<TranslateLanguage>> iGetDataCallback);

        /* renamed from: a */
        void mo107959a(TranslateLanguage translateLanguage, boolean z);

        /* renamed from: a */
        void mo107960a(String str, String str2, IGetDataCallback<C29953a> iGetDataCallback);

        /* renamed from: a */
        void mo107961a(String str, String str2, String[] strArr, IGetDataCallback<List<String>> iGetDataCallback);

        /* renamed from: a */
        void mo107962a(String str, boolean z);

        /* renamed from: a */
        void mo107963a(boolean z);

        /* renamed from: a */
        void mo107964a(String[] strArr, IGetDataCallback<TranslateLanguage> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarDisplayInfo;", "", "originLang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "barOp", "", "(Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;I)V", "getBarOp", "()I", "getOriginLang", "()Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "getTargetLang", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$a */
    public static final class BarDisplayInfo {

        /* renamed from: a */
        private final TranslateLanguage f74745a;

        /* renamed from: b */
        private final TranslateLanguage f74746b;

        /* renamed from: c */
        private final int f74747c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarDisplayInfo)) {
                return false;
            }
            BarDisplayInfo aVar = (BarDisplayInfo) obj;
            return Intrinsics.areEqual(this.f74745a, aVar.f74745a) && Intrinsics.areEqual(this.f74746b, aVar.f74746b) && this.f74747c == aVar.f74747c;
        }

        public int hashCode() {
            TranslateLanguage translateLanguage = this.f74745a;
            int i = 0;
            int hashCode = (translateLanguage != null ? translateLanguage.hashCode() : 0) * 31;
            TranslateLanguage translateLanguage2 = this.f74746b;
            if (translateLanguage2 != null) {
                i = translateLanguage2.hashCode();
            }
            return ((hashCode + i) * 31) + this.f74747c;
        }

        public String toString() {
            return "BarDisplayInfo(originLang=" + this.f74745a + ", targetLang=" + this.f74746b + ", barOp=" + this.f74747c + ")";
        }

        /* renamed from: a */
        public final TranslateLanguage mo107942a() {
            return this.f74745a;
        }

        /* renamed from: b */
        public final TranslateLanguage mo107943b() {
            return this.f74746b;
        }

        /* renamed from: c */
        public final int mo107944c() {
            return this.f74747c;
        }

        public BarDisplayInfo(TranslateLanguage translateLanguage, TranslateLanguage translateLanguage2, int i) {
            Intrinsics.checkParameterIsNotNull(translateLanguage, "originLang");
            Intrinsics.checkParameterIsNotNull(translateLanguage2, "targetLang");
            this.f74745a = translateLanguage;
            this.f74746b = translateLanguage2;
            this.f74747c = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015J\b\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView$IViewDelegate;", "closeBar", "", "hide", "anim", "", "show", "showChooseLanguageDialog", "list", "", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "showSettingDialog", "barSettingInfo", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingInfo;", "showTip", "updateDisplay", "displayInfo", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarDisplayInfo;", "IViewDelegate", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$d */
    public interface ITranslateBarView extends IView<IViewDelegate> {
        /* renamed from: a */
        void mo107965a();

        /* renamed from: a */
        void mo107966a(BarDisplayInfo aVar);

        /* renamed from: a */
        void mo107967a(BarSettingInfo bVar);

        /* renamed from: a */
        void mo107968a(List<? extends TranslateLanguage> list, TranslateLanguage translateLanguage);

        /* renamed from: a */
        void mo107969a(boolean z);

        /* renamed from: b */
        void mo107970b(boolean z);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView$IViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "doRevertToOriginLang", "", "doTranslateToTargetLang", "needChoose", "", "isOriginState", "onBarClose", "onBarSettingChanged", "barSettingOp", "", "enable", "openBarSettingDialog", "openChooseLanguageDialog", "openTranslateSettingPage", "setTargetLangAndTranslate", "lang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$d$b */
        public interface IViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo107971a();

            /* renamed from: a */
            void mo107972a(int i, boolean z);

            /* renamed from: a */
            void mo107973a(TranslateLanguage translateLanguage);

            /* renamed from: a */
            void mo107974a(boolean z);

            /* renamed from: b */
            void mo107975b();

            /* renamed from: c */
            void mo107976c();

            /* renamed from: d */
            void mo107977d();

            /* renamed from: e */
            void mo107978e();

            /* renamed from: f */
            boolean mo107979f();

            @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$d$b$a */
            public static final class C29962a {
                /* renamed from: a */
                public static /* synthetic */ void m110823a(IViewDelegate bVar, boolean z, int i, Object obj) {
                    if (obj == null) {
                        if ((i & 1) != 0) {
                            z = true;
                        }
                        bVar.mo107974a(z);
                        return;
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doTranslateToTargetLang");
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract$d$a */
        public static final class C29961a {
            /* renamed from: a */
            public static /* synthetic */ void m110813a(ITranslateBarView dVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    dVar.mo107970b(z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
            }
        }
    }
}
