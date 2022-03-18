package com.ss.android.lark.main.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.C0905g;
import com.facebook.yoga.android.YogaViewLayoutFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J,\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/main/app/AppCompatYogaViewLayoutFactory;", "Landroid/view/LayoutInflater$Factory2;", "delegate", "(Landroid/view/LayoutInflater$Factory2;)V", "yogaViewLayoutFactory", "Lcom/facebook/yoga/android/YogaViewLayoutFactory;", "kotlin.jvm.PlatformType", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.a */
public final class AppCompatYogaViewLayoutFactory implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public static final Companion f112113a = new Companion(null);

    /* renamed from: b */
    private final YogaViewLayoutFactory f112114b = YogaViewLayoutFactory.getInstance();

    /* renamed from: c */
    private final LayoutInflater.Factory2 f112115c;

    @JvmStatic
    /* renamed from: a */
    public static final void m175313a(AppCompatActivity appCompatActivity) {
        f112113a.mo157166a(appCompatActivity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/main/app/AppCompatYogaViewLayoutFactory$Companion;", "", "()V", "install", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo157166a(AppCompatActivity appCompatActivity) {
            Intrinsics.checkParameterIsNotNull(appCompatActivity, "appCompatActivity");
            AppCompatDelegate delegate = appCompatActivity.getDelegate();
            Intrinsics.checkExpressionValueIsNotNull(delegate, "appCompatActivity.delegate");
            if (delegate instanceof LayoutInflater.Factory2) {
                C0905g.m4353a(appCompatActivity.getLayoutInflater(), new AppCompatYogaViewLayoutFactory((LayoutInflater.Factory2) delegate));
                return;
            }
            LayoutInflater layoutInflater = appCompatActivity.getLayoutInflater();
            Intrinsics.checkExpressionValueIsNotNull(layoutInflater, "appCompatActivity.layoutInflater");
            layoutInflater.setFactory(YogaViewLayoutFactory.getInstance());
        }
    }

    public AppCompatYogaViewLayoutFactory(LayoutInflater.Factory2 factory2) {
        Intrinsics.checkParameterIsNotNull(factory2, "delegate");
        this.f112115c = factory2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        return onCreateView(null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        View onCreateView = this.f112114b.onCreateView(str, context, attributeSet);
        if (onCreateView != null) {
            return onCreateView;
        }
        return this.f112115c.onCreateView(view, str, context, attributeSet);
    }
}
