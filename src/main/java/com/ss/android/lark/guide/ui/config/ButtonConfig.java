package com.ss.android.lark.guide.ui.config;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "", "name", "", "buttonAction", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "(Ljava/lang/String;Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;)V", "getButtonAction", "()Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "getName", "()Ljava/lang/String;", "ButtonAction", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.e */
public class ButtonConfig {

    /* renamed from: a */
    private final String f99520a;

    /* renamed from: b */
    private final ButtonAction f99521b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.config.e$a */
    public interface ButtonAction {
        void onClick(View view, GuideDelegate gVar);
    }

    /* renamed from: a */
    public final String mo141768a() {
        return this.f99520a;
    }

    /* renamed from: b */
    public final ButtonAction mo141769b() {
        return this.f99521b;
    }

    public ButtonConfig(String str, ButtonAction aVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(aVar, "buttonAction");
        this.f99520a = str;
        this.f99521b = aVar;
    }
}
