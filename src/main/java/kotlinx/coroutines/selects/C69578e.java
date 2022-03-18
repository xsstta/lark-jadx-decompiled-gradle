package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u001f\b\u0004\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016HHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0017\u001aK\u0010\u0018\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0007ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u000e8\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"ALREADY_SELECTED", "", "ALREADY_SELECTED$annotations", "()V", "getALREADY_SELECTED", "()Ljava/lang/Object;", "NOT_SELECTED", "NOT_SELECTED$annotations", "getNOT_SELECTED", "RESUMED", "RESUMED$annotations", "UNDECIDED", "UNDECIDED$annotations", "selectOpSequenceNumber", "Lkotlinx/coroutines/selects/SeqNumber;", "selectOpSequenceNumber$annotations", "select", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTimeout", "timeout", "Lkotlin/time/Duration;", "block", "Lkotlin/coroutines/Continuation;", "onTimeout-0lHKgQg", "(Lkotlinx/coroutines/selects/SelectBuilder;DLkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.selects.e */
public final class C69578e {

    /* renamed from: a */
    public static final Object f173935a = new Symbol("UNDECIDED");

    /* renamed from: b */
    public static final Object f173936b = new Symbol("RESUMED");

    /* renamed from: c */
    public static final SeqNumber f173937c = new SeqNumber();

    /* renamed from: d */
    private static final Object f173938d = new Symbol("NOT_SELECTED");

    /* renamed from: e */
    private static final Object f173939e = new Symbol("ALREADY_SELECTED");

    /* renamed from: a */
    public static final Object m267290a() {
        return f173938d;
    }

    /* renamed from: b */
    public static final Object m267291b() {
        return f173939e;
    }
}
