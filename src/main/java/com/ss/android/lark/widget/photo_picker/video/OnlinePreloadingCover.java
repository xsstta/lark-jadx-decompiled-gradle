package com.ss.android.lark.widget.photo_picker.video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.suite.R;
import com.ss.android.lark.player.entity.DataSource;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/video/OnlinePreloadingCover;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSource", "Lcom/ss/android/lark/player/entity/DataSource;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/player/entity/DataSource;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "createView", "Landroid/view/View;", "Companion", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.video.e */
public final class OnlinePreloadingCover {

    /* renamed from: a */
    public static final Companion f145650a = new Companion(null);

    /* renamed from: b */
    private final FragmentActivity f145651b;

    /* renamed from: c */
    private final DataSource f145652c;

    @JvmStatic
    /* renamed from: a */
    public static final void m228385a(FragmentActivity fragmentActivity, DataSource dataSource) {
        f145650a.mo199493a(fragmentActivity, dataSource);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/video/OnlinePreloadingCover$Companion;", "", "()V", "init", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dataSource", "Lcom/ss/android/lark/player/entity/DataSource;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.video.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo199493a(FragmentActivity fragmentActivity, DataSource dataSource) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            View a = new OnlinePreloadingCover(fragmentActivity, dataSource).mo199491a();
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                ((ViewGroup) decorView).addView(a, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: b */
    public final FragmentActivity mo199492b() {
        return this.f145651b;
    }

    /* renamed from: a */
    public final View mo199491a() {
        View inflate = LayoutInflater.from(this.f145651b).inflate(R.layout.online_preloading_cover, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "preloadLayout");
        inflate.setVisibility(8);
        inflate.findViewById(R.id.ctrl_close).setOnClickListener(new View$OnClickListenerC58875b(this));
        this.f145652c.getShowPreloading().mo5922a(this.f145651b);
        this.f145652c.getShowPreloading().mo5923a(this.f145651b, new C58876c(inflate));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.video.e$b */
    public static final class View$OnClickListenerC58875b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnlinePreloadingCover f145653a;

        View$OnClickListenerC58875b(OnlinePreloadingCover eVar) {
            this.f145653a = eVar;
        }

        public final void onClick(View view) {
            this.f145653a.mo199492b().finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.video.e$c */
    public static final class C58876c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View f145654a;

        C58876c(View view) {
            this.f145654a = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1178x
        public /* synthetic */ void onChanged(Boolean bool) {
            mo199495a(bool.booleanValue());
        }

        /* renamed from: a */
        public final void mo199495a(boolean z) {
            int i;
            View view = this.f145654a;
            Intrinsics.checkExpressionValueIsNotNull(view, "preloadLayout");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public OnlinePreloadingCover(FragmentActivity fragmentActivity, DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
        this.f145651b = fragmentActivity;
        this.f145652c = dataSource;
    }
}
