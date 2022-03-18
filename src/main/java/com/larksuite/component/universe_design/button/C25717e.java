package com.larksuite.component.universe_design.button;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\t\u001a(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u001a*\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a\f\u0010\u001f\u001a\u00020\u001d*\u00020\u0004H\u0002\u001a\f\u0010 \u001a\u00020\u001d*\u00020\u0004H\u0002\u001a\u0014\u0010!\u001a\u00020\u001d*\u00020\u00042\b\b\u0001\u0010\"\u001a\u00020\u0012\u001a\u0018\u0010!\u001a\u00020\u001d*\u00020\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007\u001a\u0014\u0010%\u001a\u00020\u001d*\u00020\u00042\b\b\u0001\u0010\"\u001a\u00020\u0012\u001a\u0014\u0010%\u001a\u00020\u001d*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010$\u001a\f\u0010&\u001a\u00020'*\u00020\u0004H\u0002\u001a\u001a\u0010(\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*\u001a/\u0010(\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0019\b\u0002\u0010+\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001d0,¢\u0006\u0002\b-H\u0007\u001a.\u0010(\u001a\u00020\u001d*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0002\u001a\u0012\u0010/\u001a\u00020\u001d*\u00020\u00042\u0006\u0010+\u001a\u000200\u001a'\u0010/\u001a\u00020\u001d*\u00020\u00042\u0019\b\u0002\u0010+\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0,¢\u0006\u0002\b-H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\" \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u00061"}, d2 = {"DEFAULT_DRAWABLE_MARGIN_DP", "", "activeViews", "Ljava/util/WeakHashMap;", "Lcom/larksuite/component/universe_design/button/UDButton;", "Lcom/larksuite/component/universe_design/button/DrawableViewData;", "getActiveViews", "()Ljava/util/WeakHashMap;", "drawablesAttachListener", "com/larksuite/component/universe_design/button/UDButtonExtensionsKt$drawablesAttachListener$1", "Lcom/larksuite/component/universe_design/button/UDButtonExtensionsKt$drawablesAttachListener$1;", "generateProgressDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "context", "Landroid/content/Context;", "progressColors", "", "progressRadiusPx", "", "progressStrokePx", "getDrawableSpannable", "Landroid/text/SpannableString;", "drawable", "Landroid/graphics/drawable/Drawable;", "text", "", "gravity", "drawableMarginPx", "setupDrawableCallback", "", "button", "addDrawableAttachViewListener", "cleanUpDrawable", "hideDrawable", "newTextRes", "newText", "", "hideProgress", "isDrawableActive", "", "showDrawable", "paramValues", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "params", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "textMarginPx", "showProgress", "Lcom/larksuite/component/universe_design/button/ProgressParams;", "universe-ui-button_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.button.e */
public final class C25717e {

    /* renamed from: a */
    private static final WeakHashMap<UDButton, DrawableViewData> f63114a = new WeakHashMap<>();

    /* renamed from: b */
    private static final View$OnAttachStateChangeListenerC25718a f63115b = new View$OnAttachStateChangeListenerC25718a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/component/universe_design/button/UDButtonExtensionsKt$drawablesAttachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.button.e$a */
    public static final class View$OnAttachStateChangeListenerC25718a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC25718a() {
        }

        public void onViewAttachedToWindow(View view) {
            DrawableViewData cVar;
            Drawable a;
            WeakHashMap<UDButton, DrawableViewData> a2 = C25717e.m92483a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            } else if (a2.containsKey(view) && (cVar = C25717e.m92483a().get(view)) != null && (a = cVar.mo90332a()) != null && (a instanceof Animatable)) {
                ((Animatable) a).start();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            DrawableViewData cVar;
            Drawable a;
            WeakHashMap<UDButton, DrawableViewData> a2 = C25717e.m92483a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            } else if (a2.containsKey(view) && (cVar = C25717e.m92483a().get(view)) != null && (a = cVar.mo90332a()) != null && (a instanceof Animatable)) {
                ((Animatable) a).stop();
            }
        }
    }

    /* renamed from: a */
    public static final WeakHashMap<UDButton, DrawableViewData> m92483a() {
        return f63114a;
    }

    /* renamed from: a */
    public static final void m92492a(UDButton uDButton, Function1<? super ProgressParams, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$showProgress");
        Intrinsics.checkParameterIsNotNull(function1, "params");
        ProgressParams dVar = new ProgressParams();
        function1.invoke(dVar);
        m92489a(uDButton, dVar);
    }

    /* renamed from: a */
    public static final void m92490a(UDButton uDButton, String str) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$hideProgress");
        m92496b(uDButton, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m92491a(UDButton uDButton, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m92496b(uDButton, str);
    }

    /* renamed from: a */
    private static final boolean m92493a(UDButton uDButton) {
        return f63114a.containsKey(uDButton);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/larksuite/component/universe_design/button/UDButtonExtensionsKt$setupDrawableCallback$callback$1", "Landroid/graphics/drawable/Drawable$Callback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "scheduleDrawable", "what", "Ljava/lang/Runnable;", "when", "", "unscheduleDrawable", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.button.e$b */
    public static final class C25719b implements Drawable.Callback {

        /* renamed from: a */
        final /* synthetic */ UDButton f63116a;

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            Intrinsics.checkParameterIsNotNull(runnable, "what");
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            Intrinsics.checkParameterIsNotNull(runnable, "what");
        }

        C25719b(UDButton uDButton) {
            this.f63116a = uDButton;
        }

        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            this.f63116a.invalidate();
        }
    }

    /* renamed from: c */
    private static final void m92497c(UDButton uDButton) {
        uDButton.addOnAttachStateChangeListener(f63115b);
    }

    /* renamed from: b */
    private static final void m92494b(UDButton uDButton) {
        Drawable a;
        WeakHashMap<UDButton, DrawableViewData> weakHashMap = f63114a;
        if (weakHashMap.containsKey(uDButton)) {
            DrawableViewData cVar = weakHashMap.get(uDButton);
            if (!(cVar == null || (a = cVar.mo90332a()) == null)) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                a.setCallback(null);
            }
            weakHashMap.remove(uDButton);
        }
    }

    /* renamed from: a */
    public static final void m92484a(UDButton uDButton, int i) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$hideProgress");
        m92495b(uDButton, i);
    }

    /* renamed from: b */
    public static final void m92496b(UDButton uDButton, String str) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$hideDrawable");
        m92494b(uDButton);
        uDButton.setText(str);
    }

    /* renamed from: a */
    private static final void m92485a(UDButton uDButton, Drawable drawable) {
        C25719b bVar = new C25719b(uDButton);
        f63114a.put(uDButton, new DrawableViewData(drawable, bVar));
        drawable.setCallback(bVar);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* renamed from: b */
    public static final void m92495b(UDButton uDButton, int i) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$hideDrawable");
        m92496b(uDButton, uDButton.getContext().getString(i));
    }

    /* renamed from: a */
    public static final void m92489a(UDButton uDButton, ProgressParams dVar) {
        int i;
        int i2;
        int[] iArr;
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$showProgress");
        Intrinsics.checkParameterIsNotNull(dVar, "params");
        Context context = uDButton.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Integer h = dVar.mo90342h();
        if (h != null) {
            i = resources.getDimensionPixelSize(h.intValue());
        } else {
            i = dVar.mo90343i();
        }
        Integer f = dVar.mo90340f();
        if (f != null) {
            i2 = resources.getDimensionPixelSize(f.intValue());
        } else {
            i2 = dVar.mo90341g();
        }
        if (dVar.mo90345k() != null) {
            iArr = new int[1];
            Context context2 = uDButton.getContext();
            Integer k = dVar.mo90345k();
            if (k == null) {
                Intrinsics.throwNpe();
            }
            iArr[0] = ContextCompat.getColor(context2, k.intValue());
        } else if (dVar.mo90344j() != null) {
            iArr = new int[1];
            Integer j = dVar.mo90344j();
            if (j == null) {
                Intrinsics.throwNpe();
            }
            iArr[0] = j.intValue();
        } else if (dVar.mo90346l() != null) {
            iArr = dVar.mo90346l();
            if (iArr == null) {
                Intrinsics.throwNpe();
            }
        } else {
            iArr = new int[0];
        }
        Context context3 = uDButton.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        m92486a(uDButton, m92482a(context3, iArr, i2, i), dVar);
    }

    /* renamed from: a */
    public static final void m92486a(UDButton uDButton, Drawable drawable, ButtonDrawableParams aVar) {
        String str;
        int i;
        String string;
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$showDrawable");
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        Intrinsics.checkParameterIsNotNull(aVar, "paramValues");
        Context context = uDButton.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Integer a = aVar.mo90318a();
        if (a == null || (string = uDButton.getContext().getString(a.intValue())) == null) {
            str = aVar.mo90322b();
        } else {
            str = string;
        }
        Integer d = aVar.mo90326d();
        if (d != null) {
            i = resources.getDimensionPixelSize(d.intValue());
        } else {
            i = aVar.mo90327e();
        }
        m92487a(uDButton, drawable, str, aVar.mo90325c(), i);
    }

    /* renamed from: a */
    public static final void m92488a(UDButton uDButton, Drawable drawable, Function1<? super ButtonDrawableParams, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(uDButton, "$this$showDrawable");
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        Intrinsics.checkParameterIsNotNull(function1, "params");
        ButtonDrawableParams aVar = new ButtonDrawableParams();
        function1.invoke(aVar);
        m92486a(uDButton, drawable, aVar);
    }

    /* renamed from: a */
    private static final CircularProgressDrawable m92482a(Context context, int[] iArr, int i, int i2) {
        boolean z;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        circularProgressDrawable.mo7698a(1);
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (true ^ z) {
            circularProgressDrawable.mo7701a(Arrays.copyOf(iArr, iArr.length));
        }
        if (i != -1) {
            circularProgressDrawable.mo7703b((float) i);
        }
        if (i2 != -1) {
            circularProgressDrawable.mo7694a((float) i2);
        }
        int b = ((int) (circularProgressDrawable.mo7702b() + circularProgressDrawable.mo7693a())) * 2;
        circularProgressDrawable.setBounds(0, 0, b, b);
        return circularProgressDrawable;
    }

    /* renamed from: a */
    private static final SpannableString m92481a(Drawable drawable, CharSequence charSequence, int i, int i2) {
        SpannableString spannableString;
        DrawableSpan bVar = new DrawableSpan(drawable, 0, 0, 6, null);
        if (i == 0) {
            bVar.mo90329b(i2);
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            if (charSequence == null) {
            }
            sb.append(charSequence);
            spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(bVar, 0, 1, 33);
        } else if (i == 1) {
            bVar.mo90328a(i2);
            StringBuilder sb2 = new StringBuilder();
            if (charSequence == null) {
            }
            sb2.append(charSequence);
            sb2.append(' ');
            spannableString = new SpannableString(sb2.toString());
            spannableString.setSpan(bVar, spannableString.length() - 1, spannableString.length(), 33);
        } else if (i == 2) {
            SpannableString spannableString2 = new SpannableString(" ");
            spannableString2.setSpan(bVar, 0, 1, 33);
            return spannableString2;
        } else {
            throw new IllegalArgumentException("Please set the correct gravity");
        }
        return spannableString;
    }

    /* renamed from: a */
    private static final void m92487a(UDButton uDButton, Drawable drawable, CharSequence charSequence, int i, int i2) {
        if (m92493a(uDButton)) {
            m92494b(uDButton);
        }
        if (i2 == -1) {
            Context context = uDButton.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i2 = (int) UDDimenUtils.m93307a(context, 4.0f);
        }
        uDButton.setText(m92481a(drawable, charSequence, i, i2));
        m92497c(uDButton);
        m92485a(uDButton, drawable);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
