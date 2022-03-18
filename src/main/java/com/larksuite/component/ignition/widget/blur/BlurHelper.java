package com.larksuite.component.ignition.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001e\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ignition/widget/blur/BlurHelper;", "", "()V", "blur", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Lcom/larksuite/component/ignition/widget/blur/BlurResultCallback;", "color", "", "(Landroid/content/Context;Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ignition-widget-blur_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.a.a */
public final class BlurHelper {

    /* renamed from: a */
    public static final Companion f59989a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/ignition/widget/blur/BlurHelper$Companion;", "", "()V", "getInstance", "Lcom/larksuite/component/ignition/widget/blur/BlurHelper;", "ignition-widget-blur_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.component.ignition.widget.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final BlurHelper mo87028a() {
            return new BlurHelper(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BlurHelper() {
    }

    public /* synthetic */ BlurHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 15})
    @DebugMetadata(mo239172c = "com.larksuite.component.ignition.widget.blur.BlurHelper$blur$3", mo239173f = "BlurHelper.kt", mo239174i = {0}, mo239175l = {49}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.component.ignition.widget.a.a$b */
    static final class C24326b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ BlurResultCallback $callback;
        final /* synthetic */ Context $context;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ BlurHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24326b(BlurHelper aVar, Context context, Bitmap bitmap, BlurResultCallback cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = aVar;
            this.$context = context;
            this.$bitmap = bitmap;
            this.$callback = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C24326b bVar = new C24326b(this.this$0, this.$context, this.$bitmap, this.$callback, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C24326b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                BlurHelper aVar = this.this$0;
                Context context = this.$context;
                Bitmap bitmap = this.$bitmap;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo87026a(context, bitmap, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.$callback.mo87032a((Drawable) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final Object mo87026a(Context context, Bitmap bitmap, Continuation<? super Drawable> cVar) {
        return BlurProcessor.m88783a(BlurProcessor.f59990a, context, bitmap, 0, cVar, 4, null);
    }

    /* renamed from: a */
    public final void mo87027a(Context context, Bitmap bitmap, BlurResultCallback cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        Job unused = C69553g.m266944a(GlobalScope.f173453a, Dispatchers.m266324b(), null, new C24326b(this, context, bitmap, cVar, null), 2, null);
    }

    /* renamed from: a */
    public final Object mo87025a(Context context, Bitmap bitmap, int i, Continuation<? super Drawable> cVar) {
        return BlurProcessor.f59990a.mo87029a(context, bitmap, i, cVar);
    }
}
