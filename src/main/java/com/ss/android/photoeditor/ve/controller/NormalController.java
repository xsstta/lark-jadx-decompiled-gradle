package com.ss.android.photoeditor.ve.controller;

import android.content.Context;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.p3018e.C59902f;
import com.ss.android.photoeditor.ve.p3018e.C59904g;
import com.ss.android.photoeditor.ve.p3018e.C59905h;
import com.ss.android.photoeditor.ve.utils.VEStorageUtils;
import com.ss.android.vesdk.VEImage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/photoeditor/ve/controller/NormalController;", "Lcom/ss/android/photoeditor/ve/base/VEBaseController;", "context", "Landroid/content/Context;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VEImage;)V", "adjust", "", "onClickAtPosition", "rawX", "", "rawY", "onMove", "dx", "dy", "saveBitmapToDisk", "listener", "Lcom/ss/android/photoeditor/ve/controller/NormalController$OnBitmapToDiskListener;", "updateActiveRect", "OnBitmapToDiskListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.a.b */
public final class NormalController extends VEBaseController {
    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: b */
    public void mo203589b(float f, float f2) {
    }

    /* renamed from: s */
    public final void mo203591s() {
        mo203688b(new C59809b(this));
    }

    /* renamed from: t */
    public final void mo203592t() {
        mo203687b(mo203695f());
        mo203681a(mo203686b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.a.b$c */
    public static final class C59810c extends Lambda implements Function0<Unit> {
        final /* synthetic */ OnBitmapToDiskListener $listener;
        final /* synthetic */ NormalController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59810c(NormalController bVar, OnBitmapToDiskListener aVar) {
            super(0);
            this.this$0 = bVar;
            this.$listener = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            boolean z;
            final String d = VEStorageUtils.f149211a.mo203988d(this.this$0.mo203706q());
            String str = d;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C59905h.m232490b(new Function0<Unit>(this) {
                    /* class com.ss.android.photoeditor.ve.controller.NormalController.C59810c.C598111 */
                    final /* synthetic */ C59810c this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        OnBitmapToDiskListener.C59808a.m232016a(this.this$0.$listener, false, null, 0, 0, null, 28, null);
                    }
                });
                return;
            }
            try {
                VEImage.m250733a(this.this$0.mo203707r(), d, false, false, 4, (Object) null);
            } catch (Throwable unused) {
            }
            C59902f.m232486d(C59902f.m232481b(this.this$0.mo203706q()));
            if (C59902f.m232485c(d)) {
                int[] b = C59904g.m232488b(d);
                final int i = b[0];
                final int i2 = b[1];
                C59905h.m232490b(new Function0<Unit>(this) {
                    /* class com.ss.android.photoeditor.ve.controller.NormalController.C59810c.C598122 */
                    final /* synthetic */ C59810c this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        OnBitmapToDiskListener.C59808a.m232016a(this.this$0.$listener, true, d, i, i2, null, 16, null);
                    }
                });
                return;
            }
            C59905h.m232490b(new Function0<Unit>(this) {
                /* class com.ss.android.photoeditor.ve.controller.NormalController.C59810c.C598133 */
                final /* synthetic */ C59810c this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    OnBitmapToDiskListener.C59808a.m232016a(this.this$0.$listener, false, d, 0, 0, null, 28, null);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.a.b$b */
    public static final class C59809b extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ NormalController this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59809b(NormalController bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            NormalController bVar = this.this$0;
            bVar.mo203687b(bVar.mo203695f());
            NormalController bVar2 = this.this$0;
            bVar2.mo203681a(bVar2.mo203686b());
            this.this$0.mo203707r().mo220805m();
        }
    }

    /* renamed from: a */
    public final void mo203588a(OnBitmapToDiskListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C59905h.m232489a(new C59810c(this, aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NormalController(Context context, VEImage vEImage) {
        super(context, vEImage);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(vEImage, "veImage");
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseController
    /* renamed from: d */
    public void mo203590d(float f, float f2) {
        VEBaseController.OnSurfaceClickedListener c = mo203689c();
        if (c != null) {
            c.mo203632a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/ss/android/photoeditor/ve/controller/NormalController$OnBitmapToDiskListener;", "", "onSaved", "", "success", "", "path", "", "width", "", "height", ShareHitPoint.f121869d, "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.a.b$a */
    public interface OnBitmapToDiskListener {
        /* renamed from: a */
        void mo203593a(boolean z, String str, int i, int i2, String str2);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.photoeditor.ve.a.b$a$a */
        public static final class C59808a {
            /* renamed from: a */
            public static /* synthetic */ void m232016a(OnBitmapToDiskListener aVar, boolean z, String str, int i, int i2, String str2, int i3, Object obj) {
                int i4;
                int i5;
                if (obj == null) {
                    if ((i3 & 4) != 0) {
                        i4 = 0;
                    } else {
                        i4 = i;
                    }
                    if ((i3 & 8) != 0) {
                        i5 = 0;
                    } else {
                        i5 = i2;
                    }
                    if ((i3 & 16) != 0) {
                        str2 = "jpg";
                    }
                    aVar.mo203593a(z, str, i4, i5, str2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSaved");
            }
        }
    }
}
