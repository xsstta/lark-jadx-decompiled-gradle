package com.ss.android.lark.edu.creategroup.primarypage;

import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26317s;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.android.lark.edu.dto.ClassInfoResponse;
import com.ss.android.lark.edu.service.EduService;
import com.ss.android.lark.edu.util.CallBackBuilder;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.edu.creategroup.primarypage.f */
public final class EduClassesSource extends C1177w<ClassInfoResponse> {

    /* renamed from: f */
    public static final Companion f94971f = new Companion(null);

    /* renamed from: a */
    public boolean f94972a;

    /* renamed from: g */
    private boolean f94973g = true;

    /* renamed from: h */
    private final List<ClassInfo> f94974h = new ArrayList();

    /* renamed from: i */
    private final IGetDataCallback<ClassInfoResponse> f94975i = new CallBackBuilder().mo136379a((Function1) new C36944b(this)).mo136383b(new C36945c(this)).mo136378a((Function0<Unit>) new C36946d(this)).mo136380a(true).mo136377a();

    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.f$d */
    public static final class C36946d extends Lambda implements Function0<Unit> {
        final /* synthetic */ EduClassesSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36946d(EduClassesSource fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f94972a = false;
        }
    }

    /* renamed from: f */
    private final void m145837f() {
        ClassInfoResponse aVar = new ClassInfoResponse();
        aVar.mo136411b(false);
        aVar.mo136410b(1);
        mo5926a((Object) aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.f$b */
    public static final class C36944b extends Lambda implements Function1<ClassInfoResponse, Unit> {
        final /* synthetic */ EduClassesSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36944b(EduClassesSource fVar) {
            super(1);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ClassInfoResponse aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ClassInfoResponse aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.this$0.mo136357a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.edu.creategroup.primarypage.f$c */
    public static final class C36945c extends Lambda implements Function1<ErrorResult, Unit> {
        final /* synthetic */ EduClassesSource this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36945c(EduClassesSource fVar) {
            super(1);
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ErrorResult errorResult) {
            invoke(errorResult);
            return Unit.INSTANCE;
        }

        public final void invoke(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.this$0.mo136356a(errorResult);
        }
    }

    /* renamed from: a */
    public final void mo136356a(ErrorResult errorResult) {
        ClassInfoResponse aVar = new ClassInfoResponse();
        aVar.mo136411b(false);
        aVar.mo136407a(errorResult.getDisplayMsg());
        aVar.mo136410b(2);
        mo5926a((Object) aVar);
    }

    /* renamed from: a */
    public final void mo136357a(ClassInfoResponse aVar) {
        List<ClassInfo> c = aVar.mo136413c();
        Log.m165379d("EduClassesSource", "handle classInfo data , info size is " + aVar.mo136413c().size() + ", offset is " + aVar.mo136405a());
        this.f94973g = aVar.mo136412b();
        if (!this.f94974h.isEmpty() || !C26317s.m95316a(c)) {
            aVar.mo136408a(m145835a(c, aVar.mo136405a()));
            aVar.mo136411b(true);
            mo5926a((Object) aVar);
            return;
        }
        m145837f();
    }

    /* renamed from: b */
    public final void mo136358b(int i) {
        if (i >= (this.f94974h.size() - 1) - 8 && !this.f94972a && this.f94973g) {
            this.f94972a = true;
            Log.m165379d("EduClassesSource", "Fetch Class Info , current offset is " + this.f94974h.size());
            EduService.f94922a.mo136307a(this.f94974h.size(), this.f94975i);
        }
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.edu.dto.ClassInfo>, java.util.List<com.ss.android.lark.edu.dto.ClassInfo> */
    /* renamed from: a */
    private final List<ClassInfo> m145835a(List<? extends ClassInfo> list, int i) {
        int size = this.f94974h.size() - i;
        if (size < 0) {
            return new ArrayList();
        }
        List subList = list.subList(size, list.size());
        this.f94974h.addAll(subList);
        return subList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m145836a(EduClassesSource fVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        fVar.mo136358b(i);
    }
}
