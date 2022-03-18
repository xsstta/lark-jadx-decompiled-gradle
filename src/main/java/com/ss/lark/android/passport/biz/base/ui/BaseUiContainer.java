package com.ss.lark.android.passport.biz.base.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.p2441c.C49170e;
import com.ss.android.lark.passport.infra.util.p2441c.C49175g;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.lark.android.passport.biz.widget.layout.BaseContainerLayout;
import com.ss.lark.android.passport.biz.widget.layout.CommonLayoutUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C69294l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/BaseUiContainer;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "rootLayout", "Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;", "params", "Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/lark/android/passport/biz/widget/layout/BaseContainerLayout;Lcom/ss/lark/android/passport/biz/base/ui/UiParams;)V", "getParams", "()Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "bind", "", "target", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.base.ui.a */
public class BaseUiContainer {

    /* renamed from: c */
    public static final Companion f162611c = new Companion(null);

    /* renamed from: a */
    public final FragmentActivity f162612a;

    /* renamed from: b */
    public final BaseContainerLayout f162613b;

    /* renamed from: d */
    private final UiParams f162614d;

    @JvmStatic
    /* renamed from: a */
    public static final BaseUiContainer m252995a(FragmentActivity fragmentActivity, int i) {
        return Companion.m252998a(f162611c, fragmentActivity, i, null, 4, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final BaseUiContainer m252996a(FragmentActivity fragmentActivity, int i, UiParams cVar) {
        return f162611c.mo222890a(fragmentActivity, i, cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/base/ui/BaseUiContainer$Companion;", "", "()V", "inflateFullLayout", "Lcom/ss/lark/android/passport/biz/base/ui/BaseUiContainer;", "activity", "Landroidx/fragment/app/FragmentActivity;", "container", "Landroid/view/ViewGroup;", "attachToRoot", "", "res", "", "params", "Lcom/ss/lark/android/passport/biz/base/ui/UiParams;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.base.ui.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final BaseUiContainer mo222890a(FragmentActivity fragmentActivity, int i, UiParams cVar) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(cVar, "params");
            return new BaseUiContainer(fragmentActivity, CommonLayoutUtils.m256248a(fragmentActivity, i), cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ BaseUiContainer m252998a(Companion aVar, FragmentActivity fragmentActivity, int i, UiParams cVar, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                cVar = UiParams.f162619e.mo222894a();
            }
            return aVar.mo222890a(fragmentActivity, i, cVar);
        }
    }

    /* renamed from: a */
    public void mo222875a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "target");
        ButterKnife.bind(obj, this.f162613b);
    }

    public BaseUiContainer(FragmentActivity fragmentActivity, BaseContainerLayout baseContainerLayout, UiParams cVar) {
        View view;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(baseContainerLayout, "rootLayout");
        Intrinsics.checkParameterIsNotNull(cVar, "params");
        this.f162612a = fragmentActivity;
        this.f162613b = baseContainerLayout;
        this.f162614d = cVar;
        if (cVar.f162620a) {
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            if (!C49175g.m193894a(window)) {
                StatusBarUtil.setTransparent(fragmentActivity);
                baseContainerLayout.setFitsSystemWindows(false);
            }
            if (cVar.f162621b && (view = (View) C69294l.m266137d(C49170e.m193882b(baseContainerLayout))) != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = StatusBarUtil.getStatusBarHeight(fragmentActivity);
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            Window window2 = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window2, "activity.window");
            final WindowManager.LayoutParams attributes = window2.getAttributes();
            if ((attributes.softInputMode & 16) == 0) {
                Window window3 = fragmentActivity.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window3, "activity.window");
                C49175g.m193893a(window3, new Function1<WindowManager.LayoutParams, Unit>() {
                    /* class com.ss.lark.android.passport.biz.base.ui.BaseUiContainer.C643531 */

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowManager.LayoutParams layoutParams) {
                        invoke(layoutParams);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(WindowManager.LayoutParams layoutParams) {
                        Intrinsics.checkParameterIsNotNull(layoutParams, "it");
                        layoutParams.softInputMode = attributes.softInputMode | 16;
                    }
                });
            }
        }
        baseContainerLayout.setFocusable(true);
        baseContainerLayout.setFocusableInTouchMode(true);
        baseContainerLayout.setClickable(true);
        baseContainerLayout.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            /* class com.ss.lark.android.passport.biz.base.ui.BaseUiContainer.View$OnFocusChangeListenerC643542 */

            /* renamed from: a */
            final /* synthetic */ BaseUiContainer f162615a;

            {
                this.f162615a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (z && C49203q.m193977c(this.f162615a.f162612a)) {
                    C49203q.m193973a((Context) this.f162615a.f162612a);
                }
            }
        });
    }
}
