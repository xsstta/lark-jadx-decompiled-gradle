package com.ss.android.lark.browser.impl.translate.mvp.view;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001d2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u001d\u001e\u001fB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog;", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "mInitData", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$InitData;", "(Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$InitData;)V", "mAutoTranslateItemView", "Landroid/view/View;", "mAutoTranslateRb", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "mChooseLangItemView", "Landroid/widget/TextView;", "mDialog", "mListener", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$OnSettingItemListener;", "mMoreSettingTV", "mNotTranslateThisLangItemView", "mNotTranslateThisLangRb", "mNotTranslateThisLangTextTV", "mNotTranslateThisSiteItemView", "mNotTranslateThisSiteRb", "closeDialog", "", "initData", "initListeners", "onCreated", "dialog", "setOnSettingItemListener", "listener", "Companion", "InitData", "OnSettingItemListener", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a */
public final class TranslateBarSettingDialog extends C25639g.AbstractC25641b<DialogC25637f> {

    /* renamed from: e */
    public static final Companion f74806e = new Companion(null);

    /* renamed from: a */
    public UDCheckBox f74807a;

    /* renamed from: b */
    public UDCheckBox f74808b;

    /* renamed from: c */
    public UDCheckBox f74809c;

    /* renamed from: d */
    public OnSettingItemListener f74810d;

    /* renamed from: f */
    private TextView f74811f;

    /* renamed from: g */
    private View f74812g;

    /* renamed from: h */
    private View f74813h;

    /* renamed from: i */
    private TextView f74814i;

    /* renamed from: j */
    private View f74815j;

    /* renamed from: k */
    private TextView f74816k;

    /* renamed from: l */
    private DialogC25637f f74817l;

    /* renamed from: m */
    private final InitData f74818m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$OnSettingItemListener;", "", "onAutoTranslateChanged", "", "checked", "", "onChooseLanguageClick", "onMoreSettingClick", "onNotTranslateThisLanguageChanged", "onNotTranslateThisSiteChanged", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$c */
    public interface OnSettingItemListener {
        /* renamed from: a */
        void mo108012a();

        /* renamed from: a */
        void mo108013a(boolean z);

        /* renamed from: b */
        void mo108014b();

        /* renamed from: b */
        void mo108015b(boolean z);

        /* renamed from: c */
        void mo108016c(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$Companion;", "", "()V", "show", "", "activity", "Landroid/app/Activity;", "initData", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$InitData;", "listener", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$OnSettingItemListener;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo108044a(Activity activity, InitData bVar, OnSettingItemListener cVar) {
            TranslateBarSettingDialog aVar = new TranslateBarSettingDialog(bVar);
            aVar.mo108043a(cVar);
            new C25639g(activity).mo89222a(1.0f).mo89261t(0).mo89257p(80).mo89260s(R.layout.web_translate_setting_dialog).mo89230a(aVar).mo89239c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$InitData;", "", "isAutoTranslate", "", "isNotTranslateThisLang", "isNotTranslateThisSite", "originLangName", "", "(ZZZLjava/lang/String;)V", "()Z", "getOriginLangName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$b */
    public static final class InitData {

        /* renamed from: a */
        private final boolean f74819a;

        /* renamed from: b */
        private final boolean f74820b;

        /* renamed from: c */
        private final boolean f74821c;

        /* renamed from: d */
        private final String f74822d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitData)) {
                return false;
            }
            InitData bVar = (InitData) obj;
            return this.f74819a == bVar.f74819a && this.f74820b == bVar.f74820b && this.f74821c == bVar.f74821c && Intrinsics.areEqual(this.f74822d, bVar.f74822d);
        }

        public int hashCode() {
            boolean z = this.f74819a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f74820b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.f74821c;
            if (!z3) {
                i = z3 ? 1 : 0;
            }
            int i10 = (i9 + i) * 31;
            String str = this.f74822d;
            return i10 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitData(isAutoTranslate=" + this.f74819a + ", isNotTranslateThisLang=" + this.f74820b + ", isNotTranslateThisSite=" + this.f74821c + ", originLangName=" + this.f74822d + ")";
        }

        /* renamed from: a */
        public final boolean mo108045a() {
            return this.f74819a;
        }

        /* renamed from: b */
        public final boolean mo108046b() {
            return this.f74820b;
        }

        /* renamed from: c */
        public final boolean mo108047c() {
            return this.f74821c;
        }

        /* renamed from: d */
        public final String mo108048d() {
            return this.f74822d;
        }

        public InitData(boolean z, boolean z2, boolean z3, String str) {
            Intrinsics.checkParameterIsNotNull(str, "originLangName");
            this.f74819a = z;
            this.f74820b = z2;
            this.f74821c = z3;
            this.f74822d = str;
        }
    }

    /* renamed from: a */
    public final void mo108042a() {
        DialogC25637f fVar = this.f74817l;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: b */
    private final void m110914b() {
        InitData bVar = this.f74818m;
        if (bVar != null) {
            UDCheckBox uDCheckBox = this.f74807a;
            if (uDCheckBox != null) {
                uDCheckBox.setChecked(bVar.mo108045a());
            }
            UDCheckBox uDCheckBox2 = this.f74808b;
            if (uDCheckBox2 != null) {
                uDCheckBox2.setChecked(this.f74818m.mo108046b());
            }
            UDCheckBox uDCheckBox3 = this.f74809c;
            if (uDCheckBox3 != null) {
                uDCheckBox3.setChecked(this.f74818m.mo108047c());
            }
            TextView textView = this.f74814i;
            if (textView != null) {
                textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Chat_ChooseUntranslateLanguage, "language", this.f74818m.mo108048d()));
            }
        }
    }

    /* renamed from: c */
    private final void m110915c() {
        TextView textView = this.f74811f;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC29985d(this));
        }
        View view = this.f74812g;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC29986e(this));
        }
        View view2 = this.f74813h;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC29987f(this));
        }
        View view3 = this.f74815j;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC29988g(this));
        }
        TextView textView2 = this.f74816k;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC29989h(this));
        }
    }

    /* renamed from: a */
    public final void mo108043a(OnSettingItemListener cVar) {
        this.f74810d = cVar;
    }

    public TranslateBarSettingDialog(InitData bVar) {
        this.f74818m = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$d */
    public static final class View$OnClickListenerC29985d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarSettingDialog f74823a;

        View$OnClickListenerC29985d(TranslateBarSettingDialog aVar) {
            this.f74823a = aVar;
        }

        public final void onClick(View view) {
            OnSettingItemListener cVar = this.f74823a.f74810d;
            if (cVar != null) {
                cVar.mo108012a();
            }
            this.f74823a.mo108042a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$h */
    public static final class View$OnClickListenerC29989h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarSettingDialog f74827a;

        View$OnClickListenerC29989h(TranslateBarSettingDialog aVar) {
            this.f74827a = aVar;
        }

        public final void onClick(View view) {
            OnSettingItemListener cVar = this.f74827a.f74810d;
            if (cVar != null) {
                cVar.mo108014b();
            }
            this.f74827a.mo108042a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$e */
    public static final class View$OnClickListenerC29986e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarSettingDialog f74824a;

        View$OnClickListenerC29986e(TranslateBarSettingDialog aVar) {
            this.f74824a = aVar;
        }

        public final void onClick(View view) {
            UDCheckBox uDCheckBox = this.f74824a.f74807a;
            if (uDCheckBox != null) {
                boolean z = !uDCheckBox.isChecked();
                OnSettingItemListener cVar = this.f74824a.f74810d;
                if (cVar != null) {
                    cVar.mo108013a(z);
                }
                this.f74824a.mo108042a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$f */
    public static final class View$OnClickListenerC29987f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarSettingDialog f74825a;

        View$OnClickListenerC29987f(TranslateBarSettingDialog aVar) {
            this.f74825a = aVar;
        }

        public final void onClick(View view) {
            UDCheckBox uDCheckBox = this.f74825a.f74808b;
            if (uDCheckBox != null) {
                boolean z = !uDCheckBox.isChecked();
                OnSettingItemListener cVar = this.f74825a.f74810d;
                if (cVar != null) {
                    cVar.mo108015b(z);
                }
                this.f74825a.mo108042a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.a$g */
    public static final class View$OnClickListenerC29988g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarSettingDialog f74826a;

        View$OnClickListenerC29988g(TranslateBarSettingDialog aVar) {
            this.f74826a = aVar;
        }

        public final void onClick(View view) {
            UDCheckBox uDCheckBox = this.f74826a.f74809c;
            if (uDCheckBox != null) {
                boolean z = !uDCheckBox.isChecked();
                OnSettingItemListener cVar = this.f74826a.f74810d;
                if (cVar != null) {
                    cVar.mo108016c(z);
                }
                this.f74826a.mo108042a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
    /* renamed from: b */
    public void mo89274b(DialogC25637f fVar) {
        super.mo89274b(fVar);
        if (fVar != null && fVar.getWindow() != null) {
            this.f74817l = fVar;
            this.f74811f = (TextView) fVar.findViewById(R.id.choose_language);
            this.f74812g = fVar.findViewById(R.id.web_auto_translate);
            this.f74807a = (UDCheckBox) fVar.findViewById(R.id.web_auto_translate_radio_btn);
            this.f74813h = fVar.findViewById(R.id.not_translate_this_language);
            this.f74814i = (TextView) fVar.findViewById(R.id.not_translate_this_language_text);
            this.f74808b = (UDCheckBox) fVar.findViewById(R.id.not_translate_this_language_radio_btn);
            this.f74815j = fVar.findViewById(R.id.not_translate_this_site);
            this.f74809c = (UDCheckBox) fVar.findViewById(R.id.not_translate_this_site_radio_btn);
            this.f74816k = (TextView) fVar.findViewById(R.id.more_setting);
            UDCheckBox uDCheckBox = this.f74807a;
            if (uDCheckBox == null) {
                Intrinsics.throwNpe();
            }
            uDCheckBox.setClickable(false);
            UDCheckBox uDCheckBox2 = this.f74808b;
            if (uDCheckBox2 == null) {
                Intrinsics.throwNpe();
            }
            uDCheckBox2.setClickable(false);
            m110914b();
            m110915c();
        }
    }
}
