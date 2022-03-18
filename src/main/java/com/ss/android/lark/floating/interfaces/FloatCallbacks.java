package com.ss.android.lark.floating.interfaces;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J#\u0010\t\u001a\u00020\n2\u001b\u0010\u0003\u001a\u0017\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020\n0\u000b¢\u0006\u0002\b\fR\u001e\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;", "", "()V", "builder", "Lcom/ss/android/lark/floating/interfaces/FloatCallbacks$Builder;", "getBuilder", "()Lcom/ss/android/lark/floating/interfaces/FloatCallbacks$Builder;", "setBuilder", "(Lcom/ss/android/lark/floating/interfaces/FloatCallbacks$Builder;)V", "registerListener", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Builder", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.c.a */
public final class FloatCallbacks {

    /* renamed from: a */
    public Builder f98483a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010)\u001a\u00020\b2\"\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004J\u0014\u0010\r\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ \u0010\u0013\u001a\u00020\b2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014J\u001a\u0010\u001a\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u001bJ\u001a\u0010 \u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u001bJ\u001a\u0010#\u001a\u00020\b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u001bJ \u0010&\u001a\u00020\b2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014R8\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR.\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/ss/android/lark/floating/interfaces/FloatCallbacks$Builder;", "", "(Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;)V", "createdResult", "Lkotlin/Function3;", "", "", "Landroid/view/View;", "", "getCreatedResult$float_release", "()Lkotlin/jvm/functions/Function3;", "setCreatedResult$float_release", "(Lkotlin/jvm/functions/Function3;)V", "dismiss", "Lkotlin/Function0;", "getDismiss$float_release", "()Lkotlin/jvm/functions/Function0;", "setDismiss$float_release", "(Lkotlin/jvm/functions/Function0;)V", "drag", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "getDrag$float_release", "()Lkotlin/jvm/functions/Function2;", "setDrag$float_release", "(Lkotlin/jvm/functions/Function2;)V", "dragEnd", "Lkotlin/Function1;", "getDragEnd$float_release", "()Lkotlin/jvm/functions/Function1;", "setDragEnd$float_release", "(Lkotlin/jvm/functions/Function1;)V", "hide", "getHide$float_release", "setHide$float_release", "show", "getShow$float_release", "setShow$float_release", "touchEvent", "getTouchEvent$float_release", "setTouchEvent$float_release", "createResult", "action", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.c.a$a */
    public final class Builder {

        /* renamed from: b */
        private Function3<? super Boolean, ? super String, ? super View, Unit> f98485b;

        /* renamed from: c */
        private Function1<? super View, Unit> f98486c;

        /* renamed from: d */
        private Function1<? super View, Unit> f98487d;

        /* renamed from: e */
        private Function0<Unit> f98488e;

        /* renamed from: f */
        private Function2<? super View, ? super MotionEvent, Unit> f98489f;

        /* renamed from: g */
        private Function2<? super View, ? super MotionEvent, Unit> f98490g;

        /* renamed from: h */
        private Function1<? super View, Unit> f98491h;

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.o<? super java.lang.Boolean, ? super java.lang.String, ? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.o<java.lang.Boolean, java.lang.String, android.view.View, kotlin.Unit> */
        /* renamed from: a */
        public final Function3<Boolean, String, View, Unit> mo140227a() {
            return this.f98485b;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        /* renamed from: b */
        public final Function1<View, Unit> mo140232b() {
            return this.f98486c;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        /* renamed from: c */
        public final Function1<View, Unit> mo140234c() {
            return this.f98487d;
        }

        /* renamed from: d */
        public final Function0<Unit> mo140236d() {
            return this.f98488e;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super android.view.View, ? super android.view.MotionEvent, kotlin.Unit>, kotlin.jvm.functions.k<android.view.View, android.view.MotionEvent, kotlin.Unit> */
        /* renamed from: e */
        public final Function2<View, MotionEvent, Unit> mo140237e() {
            return this.f98489f;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super android.view.View, ? super android.view.MotionEvent, kotlin.Unit>, kotlin.jvm.functions.k<android.view.View, android.view.MotionEvent, kotlin.Unit> */
        /* renamed from: f */
        public final Function2<View, MotionEvent, Unit> mo140238f() {
            return this.f98490g;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
        /* renamed from: g */
        public final Function1<View, Unit> mo140239g() {
            return this.f98491h;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public Builder() {
        }

        /* renamed from: a */
        public final void mo140228a(Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(function0, "action");
            this.f98488e = function0;
        }

        /* renamed from: b */
        public final void mo140233b(Function1<? super View, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "action");
            this.f98487d = function1;
        }

        /* renamed from: c */
        public final void mo140235c(Function1<? super View, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "action");
            this.f98491h = function1;
        }

        /* renamed from: a */
        public final void mo140229a(Function1<? super View, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "action");
            this.f98486c = function1;
        }

        /* renamed from: a */
        public final void mo140230a(Function2<? super View, ? super MotionEvent, Unit> kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "action");
            this.f98490g = kVar;
        }

        /* renamed from: a */
        public final void mo140231a(Function3<? super Boolean, ? super String, ? super View, Unit> oVar) {
            Intrinsics.checkParameterIsNotNull(oVar, "action");
            this.f98485b = oVar;
        }
    }

    /* renamed from: a */
    public final Builder mo140225a() {
        Builder aVar = this.f98483a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("builder");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo140226a(Function1<? super Builder, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "builder");
        Builder aVar = new Builder();
        function1.invoke(aVar);
        this.f98483a = aVar;
    }
}
