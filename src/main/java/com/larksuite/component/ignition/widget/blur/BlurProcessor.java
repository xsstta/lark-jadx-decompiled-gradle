package com.larksuite.component.ignition.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/ignition/widget/blur/BlurProcessor;", "", "()V", "doBlur", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "bitmap", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "Landroid/graphics/drawable/Drawable;", "color", "", "(Landroid/content/Context;Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ignition-widget-blur_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.a.b */
public final class BlurProcessor {

    /* renamed from: a */
    public static final BlurProcessor f59990a = new BlurProcessor();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@"}, d2 = {"process", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "color", "", "continuation", "Lkotlin/coroutines/Continuation;", "Landroid/graphics/drawable/Drawable;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "com.larksuite.component.ignition.widget.blur.BlurProcessor", mo239173f = "BlurProcessor.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {22}, mo239176m = "process", mo239177n = {"this", "context", "bitmap", "color"}, mo239178s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: com.larksuite.component.ignition.widget.a.b$b */
    public static final class C24328b extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BlurProcessor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24328b(BlurProcessor bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo87029a(null, null, 0, this);
        }
    }

    private BlurProcessor() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/larksuite/component/ignition/widget/blur/BlurProcessor$doBlur$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.a.b$a */
    public static final class RunnableC24327a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f59991a;

        /* renamed from: b */
        final /* synthetic */ Context f59992b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f59993c;

        RunnableC24327a(CancellableContinuation kVar, Context context, Bitmap bitmap) {
            this.f59991a = kVar;
            this.f59992b = context;
            this.f59993c = bitmap;
        }

        public final void run() {
            Log.d("blur", "blur " + Thread.currentThread());
            RenderScript create = RenderScript.create(this.f59992b);
            Bitmap createBitmap = Bitmap.createBitmap(this.f59993c.getWidth() / 6, this.f59993c.getHeight() / 6, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f = 1.0f / ((float) 6);
            canvas.scale(f, f);
            canvas.drawBitmap(this.f59993c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint(2));
            Intrinsics.checkExpressionValueIsNotNull(createBitmap, "inputBitmap");
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap2);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap2);
            create.destroy();
            Result.Companion aVar = Result.Companion;
            this.f59991a.resumeWith(Result.m271569constructorimpl(createBitmap2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo87030a(Context context, Bitmap bitmap, Continuation<? super Bitmap> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC24327a(lVar, context, bitmap));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo87029a(android.content.Context r5, android.graphics.Bitmap r6, int r7, kotlin.coroutines.Continuation<? super android.graphics.drawable.Drawable> r8) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ignition.widget.blur.BlurProcessor.mo87029a(android.content.Context, android.graphics.Bitmap, int, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m88783a(BlurProcessor bVar, Context context, Bitmap bitmap, int i, Continuation cVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = context.getResources().getColor(R.color.blur_mask);
        }
        return bVar.mo87029a(context, bitmap, i, cVar);
    }
}
