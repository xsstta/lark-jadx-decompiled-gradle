package com.ss.android.lark.keyboard.utils;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.view.C36592a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/keyboard/utils/KBHoverUtil;", "", "()V", "mHoverTipsWindow", "Lcom/ss/android/lark/desktopmode/view/HoverTipsWindow;", "handleHoverEvent", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "tips", "", "hideTipsWindow", "", "onClick", "task", "Lkotlin/Function0;", "showTipsWindow", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.c.b */
public final class KBHoverUtil {

    /* renamed from: a */
    public static final KBHoverUtil f103302a = new KBHoverUtil();

    /* renamed from: b */
    private static C36592a f103303b;

    private KBHoverUtil() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.c.b$a */
    public static final class RunnableC40678a implements Runnable {

        /* renamed from: a */
        public static final RunnableC40678a f103304a = new RunnableC40678a();

        RunnableC40678a() {
        }

        public final void run() {
            KBHoverUtil.f103302a.mo146862a();
        }
    }

    /* renamed from: a */
    public final void mo146862a() {
        C36592a aVar = f103303b;
        if (aVar != null) {
            aVar.dismiss();
        }
        f103303b = null;
    }

    /* renamed from: a */
    public final void mo146863a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "task");
        UICallbackExecutor.executeDelayed(RunnableC40678a.f103304a, 200);
        function0.invoke();
    }

    /* renamed from: a */
    private final void m160778a(View view, String str) {
        C36592a aVar = f103303b;
        if (aVar == null) {
            aVar = new C36592a.C36593a().mo135002a(str).mo135003a(view.getContext());
        }
        f103303b = aVar;
        if (aVar != null) {
            aVar.mo134996a(view);
        }
    }

    /* renamed from: a */
    public final boolean mo146864a(View view, MotionEvent motionEvent, String str) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!(view instanceof ImageView)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 9) {
            ImageView imageView = (ImageView) view;
            imageView.setColorFilter(ContextCompat.getColor(imageView.getContext(), R.color.lkui_B500), PorterDuff.Mode.SRC_ATOP);
            if (str == null) {
                return true;
            }
            KBHoverUtil bVar = f103302a;
            bVar.mo146862a();
            bVar.m160778a(view, str);
            return true;
        } else if (action != 10) {
            return true;
        } else {
            ((ImageView) view).setColorFilter((ColorFilter) null);
            if (str == null) {
                return true;
            }
            f103302a.mo146862a();
            return true;
        }
    }
}
