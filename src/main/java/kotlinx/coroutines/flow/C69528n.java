package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.flow.internal.C69470f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a»\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\t\"\u0004\b\u0005\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u00032<\b\u0004\u0010\u000e\u001a6\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a¡\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u000326\b\u0004\u0010\u000e\u001a0\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013H\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0007\"\u0004\b\u0003\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000320\b\u0004\u0010\u000e\u001a*\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015H\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aj\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001aI\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u001a0\u00032#\u0010\u001b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u001c¢\u0006\u0002\b\u001dH\u0007\u001a>\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u001cH\u0007\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010!\u001a\u0002H\u001aH\u0007¢\u0006\u0002\u0010\"\u001a,\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003H\u0007\u001a&\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010$\u001a\u00020%H\u0007\u001a&\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010$\u001a\u00020%H\u0007\u001aV\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u001a0\u00032(\u0010\u001f\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(H\u0007ø\u0001\u0000¢\u0006\u0002\u0010)\u001a$\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00030\u0003H\u0007\u001aS\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u000321\u0010-\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(H\u0007ø\u0001\u0000¢\u0006\u0002\u00100\u001a$\u00101\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00030\u0003H\u0007\u001a&\u00102\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u00103\u001a\u000204H\u0007\u001a,\u00105\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\f\u00106\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003H\u0007\u001a,\u00107\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\f\u00106\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003H\u0007\u001a+\u00108\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u00106\u001a\u0002H\u001aH\u0007¢\u0006\u0002\u0010\"\u001aA\u00108\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u00106\u001a\u0002H\u001a2\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0\u001cH\u0007¢\u0006\u0002\u0010<\u001a&\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u00103\u001a\u000204H\u0007\u001a~\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010?\u001a\u0002H\u00042H\b\u0001\u0010@\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(A\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010B\u001a&\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010D\u001a\u00020EH\u0007\u001a+\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u0010!\u001a\u0002H\u001aH\u0007¢\u0006\u0002\u0010\"\u001a,\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003H\u0007\u001a\u0018\u0010G\u001a\u00020,\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u0003H\u0007\u001aD\u0010G\u001a\u00020,\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\"\u0010H\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(H\u0007ø\u0001\u0000¢\u0006\u0002\u00100\u001ah\u0010G\u001a\u00020,\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\"\u0010H\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(2\"\u0010I\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(H\u0007ø\u0001\u0000¢\u0006\u0002\u0010J\u001a&\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0003\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u00032\u0006\u00103\u001a\u000204H\u0007\u001ae\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u001a\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u001a0\u000327\u0010\u000e\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u001a¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(!\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110(H\u0007ø\u0001\u0000¢\u0006\u0002\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"noImpl", "", "combineLatest", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "T3", "T4", "T5", "other", "other2", "other3", "other4", "transform", "Lkotlin/Function6;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "compose", "T", "transformer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "concatMap", "mapper", "concatWith", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "delayEach", "timeMillis", "", "delayFlow", "flatMap", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatten", "forEach", "", "action", "Lkotlin/ParameterName;", "name", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "merge", "observeOn", "context", "Lkotlin/coroutines/CoroutineContext;", "onErrorResume", "fallback", "onErrorResumeNext", "onErrorReturn", "predicate", "", "", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "publishOn", "scanFold", "initial", "operation", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "skip", "count", "", "startWith", "subscribe", "onEach", "onError", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "subscribeOn", "switchMap", "kotlinx-coroutines-core"}, mo238835k = 5, mv = {1, 1, 16}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.n */
final /* synthetic */ class C69528n {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$combine$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.n$a */
    public static final class C69529a implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow[] f173756a;

        /* renamed from: b */
        final /* synthetic */ Function4 f173757b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Object a = C69470f.m266891a(bVar, this.f173756a, new FlowKt__MigrationKt$combineLatest$$inlined$combine$1$2(this), new FlowKt__MigrationKt$combineLatest$$inlined$combine$1$3(null, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$unsafeFlow$2", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$combine$2"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.n$b */
    public static final class C69530b implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow[] f173758a;

        /* renamed from: b */
        final /* synthetic */ Function5 f173759b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Object a = C69470f.m266891a(bVar, this.f173758a, new FlowKt__MigrationKt$combineLatest$$inlined$combine$2$2(this), new FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3(null, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$unsafeFlow$3", "kotlinx/coroutines/flow/FlowKt__MigrationKt$combine$$inlined$combine$3"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.flow.n$c */
    public static final class C69531c implements Flow<R> {

        /* renamed from: a */
        final /* synthetic */ Flow[] f173760a;

        /* renamed from: b */
        final /* synthetic */ Function6 f173761b;

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo242938a(FlowCollector bVar, Continuation cVar) {
            Object a = C69470f.m266891a(bVar, this.f173760a, new FlowKt__MigrationKt$combineLatest$$inlined$combine$3$2(this), new FlowKt__MigrationKt$combineLatest$$inlined$combine$3$3(null, this), cVar);
            if (a == C69086a.m265828a()) {
                return a;
            }
            return Unit.INSTANCE;
        }
    }
}
