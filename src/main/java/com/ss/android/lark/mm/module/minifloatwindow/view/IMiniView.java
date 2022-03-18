package com.ss.android.lark.mm.module.minifloatwindow.view;

import android.view.View;
import com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MiniAudioRecordClickEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH\u0016J$\u0010\r\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/view/IMiniView;", "Lcom/ss/android/lark/mm/module/minifloatwindow/control/IMiniListener;", "setOnClickAction", "", "trackContextGetter", "Lkotlin/Function0;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onAction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isRecording", "setOnDismissAction", "onDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.minifloatwindow.view.a */
public interface IMiniView extends IMiniListener {
    /* renamed from: a */
    void mo163458a(Function0<? extends C47084f> function0, Function0<Unit> function02);

    /* renamed from: a */
    void mo163459a(Function0<? extends C47084f> function0, Function1<? super Boolean, Unit> function1);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.view.a$a */
    public static final class C46541a {
        /* renamed from: a */
        public static void m184079a(IMiniView aVar) {
            IMiniListener.C46491a.m183877a(aVar);
        }

        /* renamed from: a */
        public static void m184080a(IMiniView aVar, long j) {
            IMiniListener.C46491a.m183878a(aVar, j);
        }

        /* renamed from: a */
        public static void m184081a(IMiniView aVar, long j, long j2) {
            IMiniListener.C46491a.m183879a(aVar, j, j2);
        }

        /* renamed from: a */
        public static void m184082a(IMiniView aVar, String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            IMiniListener.C46491a.m183880a(aVar, str, i);
        }

        /* renamed from: a */
        public static void m184084a(IMiniView aVar, Function0<? extends C47084f> function0, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
            Intrinsics.checkParameterIsNotNull(function1, "onAction");
        }

        /* renamed from: b */
        public static void m184085b(IMiniView aVar) {
            IMiniListener.C46491a.m183882b(aVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.view.a$a$a */
        static final class View$OnClickListenerC46542a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ IMiniView f117142a;

            /* renamed from: b */
            final /* synthetic */ Function0 f117143b;

            /* renamed from: c */
            final /* synthetic */ Function0 f117144c;

            View$OnClickListenerC46542a(IMiniView aVar, Function0 function0, Function0 function02) {
                this.f117142a = aVar;
                this.f117143b = function0;
                this.f117144c = function02;
            }

            public final void onClick(View view) {
                if (this.f117142a instanceof MiniPodCast) {
                    C47083e.m186425a((C47084f) this.f117143b.invoke(), "vc_mm_mini_podcast", C47086i.m186432a().mo165409a("podcast_enter").mo165421c());
                    C47083e.m186425a((C47084f) this.f117143b.invoke(), "vc_minutes_podcast_mini_click", C47086i.m186432a().mo165422d("podcast_enter").mo165423e("vc_minutes_podcast_view").mo165421c());
                } else {
                    new MiniAudioRecordClickEvent("expand_miniview", null, 2, null).mo165435a((C47084f) this.f117143b.invoke()).mo165437a();
                    C47083e.m186425a((C47084f) this.f117143b.invoke(), "vc_minutes_recording_mini_click", C47086i.m186432a().mo165422d("expand_miniview").mo165423e("vc_minutes_recording_view").mo165421c());
                }
                this.f117144c.invoke();
            }
        }

        /* renamed from: a */
        public static void m184083a(IMiniView aVar, Function0<? extends C47084f> function0, Function0<Unit> function02) {
            IMiniView aVar2;
            Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
            Intrinsics.checkParameterIsNotNull(function02, "onDismiss");
            if (!(aVar instanceof View)) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            View view = (View) aVar2;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC46542a(aVar, function0, function02));
            }
        }
    }
}
