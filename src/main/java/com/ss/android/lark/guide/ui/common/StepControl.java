package com.ss.android.lark.guide.ui.common;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\r\u0010\u001a\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\u0001J\b\u0010\"\u001a\u00020\u0014H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/StepControl;", "Lcom/ss/android/lark/guide/ui/common/StepControlDelegate;", "listener", "Lcom/ss/android/lark/guide/ui/common/StepControl$ControllerListener;", "(Lcom/ss/android/lark/guide/ui/common/StepControl$ControllerListener;)V", "cacheObj", "", "currentStepChain", "Lcom/ss/android/lark/guide/ui/common/StepChain;", "stepList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/guide/ui/common/Step;", "Lkotlin/collections/ArrayList;", "addStep", "step", "cache", "", "obj", "close", "curIndex", "", "curStep", "getCache", "isFirst", "", "isLast", "onDone", "onDone$guide_ui_release", "onStep", "stepChain", "onStep$guide_ui_release", "setListener", "start", "start2", "total", "ControllerListener", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.c */
public final class StepControl implements StepControlDelegate {

    /* renamed from: a */
    private final ArrayList<Step> f99433a;

    /* renamed from: b */
    private Object f99434b;

    /* renamed from: c */
    private StepChain f99435c;

    /* renamed from: d */
    private ControllerListener f99436d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/StepControl$ControllerListener;", "", "onDone", "", "onStep", "index", "", "total", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guide.ui.common.c$a */
    public interface ControllerListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.guide.ui.common.c$a$a */
        public static final class C38688a {
            /* renamed from: a */
            public static void m152704a(ControllerListener aVar, int i, int i2) {
            }
        }

        /* renamed from: a */
        void mo141646a();

        /* renamed from: a */
        void mo141647a(int i, int i2);
    }

    public StepControl() {
        this(null, 1, null);
    }

    /* renamed from: c */
    public final Object mo141685c() {
        return this.f99434b;
    }

    /* renamed from: b */
    public final StepControlDelegate mo141684b() {
        mo141683a();
        return this;
    }

    /* renamed from: f */
    public final void mo141688f() {
        ControllerListener aVar = this.f99436d;
        if (aVar != null) {
            aVar.mo141646a();
        }
    }

    /* renamed from: d */
    public int mo141686d() {
        StepChain bVar = this.f99435c;
        if (bVar != null) {
            return bVar.mo141676c();
        }
        return 0;
    }

    @Override // com.ss.android.lark.guide.ui.common.StepControlDelegate
    /* renamed from: e */
    public void mo141687e() {
        Step g = m152692g();
        if (g != null) {
            g.aD_();
        }
    }

    /* renamed from: g */
    private final Step m152692g() {
        int d = mo141686d();
        if (d >= this.f99433a.size() || d < 0) {
            return null;
        }
        return this.f99433a.get(d);
    }

    /* renamed from: a */
    public final boolean mo141683a() {
        return new StepChain(this, this.f99433a, -1).mo141674a();
    }

    /* renamed from: a */
    public final void mo141682a(Object obj) {
        this.f99434b = obj;
    }

    public StepControl(ControllerListener aVar) {
        this.f99436d = aVar;
        this.f99433a = new ArrayList<>();
    }

    /* renamed from: a */
    public final StepControl mo141680a(Step aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "step");
        this.f99433a.add(aVar);
        return this;
    }

    /* renamed from: a */
    public final void mo141681a(StepChain bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "stepChain");
        this.f99435c = bVar;
        ControllerListener aVar = this.f99436d;
        if (aVar != null) {
            aVar.mo141647a(bVar.mo141676c(), bVar.mo141678e());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepControl(ControllerListener aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
