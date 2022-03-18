package kotlinx.coroutines;

import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C69026a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C69554aa;
import kotlinx.coroutines.internal.C69570n;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.p3475a.C69358a;
import kotlinx.coroutines.p3475a.C69359b;
import kotlinx.coroutines.selects.SelectInstance;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00030\u00012\u00030Å\u0001:\u0006Ô\u0001Õ\u0001Ö\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010\\\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0004\bZ\u0010[JF\u0010e\u001a\u00020d2\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u00012'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010fJ6\u0010e\u001a\u00020d2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010gJ\u0013\u0010h\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bh\u0010\u001dJ\u000f\u0010i\u001a\u00020\u0001H\u0002¢\u0006\u0004\bi\u0010jJ\u0013\u0010k\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bk\u0010\u001dJ&\u0010n\u001a\u00020m2\u0014\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110_H\b¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bp\u0010-J\u0019\u0010r\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bq\u0010(J\u001b\u0010t\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bs\u0010-JD\u0010u\u001a\u0006\u0012\u0002\b\u00030\t2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b2\u0006\u0010]\u001a\u00020\u0001H\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020/H\u0010¢\u0006\u0004\bw\u00101J\u001f\u0010y\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\by\u0010zJ2\u0010|\u001a\u00020\u0011\"\u000e\b\u0000\u0010{\u0018\u0001*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\b|\u0010zJ\u0019\u0010]\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b]\u0010+J\u0019\u0010}\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b}\u0010\u0016J\u0010\u0010\u0001\u001a\u00020\u0011H\u0010¢\u0006\u0004\b~\u0010J\u001a\u0010\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001JI\u0010\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010l\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050_ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0001\u0010jJ\u001d\u0010\u0001\u001a\u00030\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u0001\u00101J\u0011\u0010\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u0001\u00101J$\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\"\u0010¢\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J(\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J&\u0010¦\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J-\u0010¨\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\u0004\u0018\u000108*\u00030ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001f\u0010­\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b­\u0001\u0010zJ&\u0010®\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020X0°\u00018F@\u0006¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\r8D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010OR\u0018\u0010·\u0001\u001a\u00020\u00018D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010jR\u0018\u0010¹\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010jR\u0018\u0010º\u0001\u001a\u00020\u00018V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010jR\u0015\u0010»\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b»\u0001\u0010jR\u0015\u0010¼\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010jR\u0015\u0010½\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b½\u0001\u0010jR\u0018\u0010¾\u0001\u001a\u00020\u00018T@\u0014X\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010jR\u001b\u0010Â\u0001\u001a\u0007\u0012\u0002\b\u00030¿\u00018F@\u0006¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010jR\u0017\u0010È\u0001\u001a\u00030Å\u00018F@\u0006¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010Î\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058@@\u0000X\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010LR \u0010Ñ\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058B@\u0002X\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010>R\u001d\u0010Ò\u0001\u001a\u00020\u0001*\u0002038B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006×\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", ApiHandler.API_CALLBACK_EXCEPTION, "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJobInternal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)V", "initParentJobInternal", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStartInternal$kotlinx_coroutines_core", "()V", "onStartInternal", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.ca */
public class JobSupport implements Job, ParentJob, ChildJob {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f173466a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo242632b(Object obj) {
    }

    /* renamed from: b */
    public boolean mo242739b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo242740c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean cJ_() {
        return false;
    }

    /* renamed from: d */
    public void mo242636d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo242678d(Object obj) {
    }

    /* renamed from: e */
    public String mo242637e() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo242757e(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo242760f(Throwable th) {
        return false;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00038V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0013\u0010$\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001c\u0010\u0002\u001a\u00020\u00018\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", ApiHandler.API_CALLBACK_EXCEPTION, "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.ca$c */
    public static final class Finishing implements Incomplete {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a */
        private final NodeList f173472a;

        /* renamed from: g */
        private final Object m266498g() {
            return this._exceptionsHolder;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo242773c() {
            /*
                r1 = this;
                int r0 = r1._isCompleting
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.Finishing.mo242773c():boolean");
        }

        @Override // kotlinx.coroutines.Incomplete
        public NodeList cH_() {
            return this.f173472a;
        }

        /* renamed from: h */
        private final ArrayList<Throwable> m266499h() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Throwable mo242774d() {
            return (Throwable) this._rootCause;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: b */
        public boolean mo242691b() {
            if (mo242774d() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo242775e() {
            if (m266498g() == cb.f173480e) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean mo242776f() {
            if (mo242774d() != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo242776f() + ", completing=" + mo242773c() + ", rootCause=" + mo242774d() + ", exceptions=" + m266498g() + ", list=" + cH_() + ']';
        }

        /* renamed from: a */
        private final void m266497a(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo242769a(Throwable th) {
            this._rootCause = th;
        }

        /* renamed from: a */
        public final void mo242770a(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: b */
        public final List<Throwable> mo242771b(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object g = m266498g();
            if (g == null) {
                arrayList = m266499h();
            } else if (g instanceof Throwable) {
                ArrayList<Throwable> h = m266499h();
                h.add(g);
                arrayList = h;
            } else if (g instanceof ArrayList) {
                arrayList = (ArrayList) g;
            } else {
                throw new IllegalStateException(("State is " + g).toString());
            }
            Throwable d = mo242774d();
            if (d != null) {
                arrayList.add(0, d);
            }
            if (th != null && (!Intrinsics.areEqual(th, d))) {
                arrayList.add(th);
            }
            m266497a(cb.f173480e);
            return arrayList;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.ArrayList<java.lang.Throwable> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public final void mo242772c(Throwable th) {
            Throwable d = mo242774d();
            if (d == null) {
                mo242769a(th);
            } else if (th != d) {
                Object g = m266498g();
                if (g == null) {
                    m266497a((Object) th);
                } else if (g instanceof Throwable) {
                    if (th != g) {
                        ArrayList<Throwable> h = m266499h();
                        h.add(g);
                        h.add(th);
                        m266497a(h);
                    }
                } else if (g instanceof ArrayList) {
                    ((ArrayList) g).add(th);
                } else {
                    throw new IllegalStateException(("State is " + g).toString());
                }
            }
        }

        public Finishing(NodeList cfVar, boolean z, Throwable th) {
            this.f173472a = cfVar;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }
    }

    /* renamed from: a */
    public final void mo242748a(ChildHandle qVar) {
        this._parentHandle = qVar;
    }

    /* renamed from: a */
    public final void mo242744a(Job btVar) {
        if (ak.m266269a()) {
            if (!(mo242761l() == null)) {
                throw new AssertionError();
            }
        }
        if (btVar == null) {
            mo242748a((ChildHandle) NonDisposableHandle.f173485a);
            return;
        }
        btVar.mo242738k();
        ChildHandle a = btVar.mo242733a(this);
        mo242748a(a);
        if (mo242763n()) {
            a.mo242687a();
            mo242748a((ChildHandle) NonDisposableHandle.f173485a);
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo242631a() {
        Object m = mo242762m();
        return (m instanceof Incomplete) && ((Incomplete) m).mo242691b();
    }

    /* renamed from: a */
    private final void m266435a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable b = !ak.m266271c() ? th : C69554aa.m266961b(th);
            for (Throwable th2 : list) {
                if (ak.m266271c()) {
                    th2 = C69554aa.m266961b(th2);
                }
                if (th2 != th && th2 != b && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C69026a.m265651a(th, th2);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m266439a(Incomplete boVar, Object obj) {
        if (ak.m266269a()) {
            if (!((boVar instanceof Empty) || (boVar instanceof JobNode))) {
                throw new AssertionError();
            }
        }
        if (ak.m266269a() && !(!(obj instanceof CompletedExceptionally))) {
            throw new AssertionError();
        } else if (!f173466a.compareAndSet(this, boVar, cb.m266511a(obj))) {
            return false;
        } else {
            mo242757e((Throwable) null);
            mo242632b(obj);
            m266442b(boVar, obj);
            return true;
        }
    }

    /* renamed from: a */
    private final void m266437a(NodeList cfVar, Throwable th) {
        mo242757e(th);
        Throwable th2 = null;
        NodeList cfVar2 = cfVar;
        Object i = cfVar2.mo243016i();
        if (i != null) {
            for (LockFreeLinkedListNode oVar = (LockFreeLinkedListNode) i; !Intrinsics.areEqual(oVar, cfVar2); oVar = oVar.mo243017j()) {
                if (oVar instanceof JobCancellingNode) {
                    JobNode bzVar = (JobNode) oVar;
                    try {
                        bzVar.mo242730a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C69026a.m265651a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        th2 = new CompletionHandlerException("Exception in completion handler " + bzVar + " for " + this, th3);
                    }
                }
            }
            if (th2 != null) {
                mo242628a(th2);
            }
            m266449g(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo242742a(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = mo242637e();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public final DisposableHandle mo242732a(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        Throwable th = null;
        JobNode<?> bzVar = null;
        while (true) {
            Object m = mo242762m();
            if (m instanceof Empty) {
                Empty bbVar = (Empty) m;
                if (bbVar.mo242691b()) {
                    if (bzVar == null) {
                        bzVar = m266432a(function1, z);
                    }
                    if (f173466a.compareAndSet(this, m, bzVar)) {
                        return bzVar;
                    }
                } else {
                    m266436a(bbVar);
                }
            } else if (m instanceof Incomplete) {
                NodeList cH_ = ((Incomplete) m).cH_();
                if (cH_ != null) {
                    Throwable th2 = null;
                    JobNode<?> bzVar2 = NonDisposableHandle.f173485a;
                    if (z && (m instanceof Finishing)) {
                        synchronized (m) {
                            th2 = ((Finishing) m).mo242774d();
                            if (th2 == null || ((function1 instanceof ChildHandleNode) && !((Finishing) m).mo242773c())) {
                                if (bzVar == null) {
                                    bzVar = m266432a(function1, z);
                                }
                                if (m266438a(m, cH_, bzVar)) {
                                    if (th2 == null) {
                                        return bzVar;
                                    }
                                    bzVar2 = bzVar;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    if (th2 != null) {
                        if (z2) {
                            function1.invoke(th2);
                        }
                        return bzVar2;
                    }
                    if (bzVar == null) {
                        bzVar = m266432a(function1, z);
                    }
                    if (m266438a(m, cH_, bzVar)) {
                        return bzVar;
                    }
                } else if (m != null) {
                    m266443b((JobNode) m);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(m instanceof CompletedExceptionally)) {
                        m = null;
                    }
                    CompletedExceptionally vVar = (CompletedExceptionally) m;
                    if (vVar != null) {
                        th = vVar.f173971a;
                    }
                    function1.invoke(th);
                }
                return NonDisposableHandle.f173485a;
            }
        }
    }

    /* renamed from: a */
    private final boolean m266438a(Object obj, NodeList cfVar, JobNode<?> bzVar) {
        int a;
        NodeList cfVar2 = cfVar;
        JobNode<?> bzVar2 = bzVar;
        C69374d dVar = new C69374d(bzVar2, bzVar2, this, obj);
        do {
            a = cfVar2.mo243018k().mo243009a(bzVar2, cfVar2, dVar);
            if (a == 1) {
                return true;
            }
        } while (a != 2);
        return false;
    }

    /* renamed from: a */
    private final void m266436a(Empty bbVar) {
        NodeList cfVar = new NodeList();
        f173466a.compareAndSet(this, bbVar, bbVar.mo242691b() ? cfVar : new InactiveNodeList(cfVar));
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public void mo242734a(CancellationException cancellationException) {
        JobCancellationException jobCancellationException;
        if (cancellationException != null) {
            jobCancellationException = cancellationException;
        } else {
            jobCancellationException = new JobCancellationException(mo242637e(), null, this);
        }
        mo242749b(jobCancellationException);
    }

    /* renamed from: a */
    private final boolean m266440a(Incomplete boVar, Throwable th) {
        if (ak.m266269a() && !(!(boVar instanceof Finishing))) {
            throw new AssertionError();
        } else if (!ak.m266269a() || boVar.mo242691b()) {
            NodeList a = m266433a(boVar);
            if (a == null) {
                return false;
            }
            if (!f173466a.compareAndSet(this, boVar, new Finishing(a, false, th))) {
                return false;
            }
            m266437a(a, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void mo242746a(Finishing cVar, ChildHandleNode rVar, Object obj) {
        if (ak.m266269a()) {
            if (!(mo242762m() == cVar)) {
                throw new AssertionError();
            }
        }
        ChildHandleNode a = m266434a((LockFreeLinkedListNode) rVar);
        if (a == null || !m266445b(cVar, a, obj)) {
            mo242678d(m266429a(cVar, obj));
        }
    }

    /* renamed from: a */
    private final ChildHandleNode m266434a(LockFreeLinkedListNode oVar) {
        while (oVar.cK_()) {
            oVar = oVar.mo243018k();
        }
        while (true) {
            oVar = oVar.mo243017j();
            if (!oVar.cK_()) {
                if (oVar instanceof ChildHandleNode) {
                    return (ChildHandleNode) oVar;
                }
                if (oVar instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public final ChildHandle mo242733a(ChildJob sVar) {
        DisposableHandle a = Job.C69372a.m266399a(this, true, false, new ChildHandleNode(this, sVar), 2, null);
        if (a != null) {
            return (ChildHandle) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    public final void mo242745a(JobNode<?> bzVar) {
        Object m;
        do {
            m = mo242762m();
            if (m instanceof JobNode) {
                if (m != bzVar) {
                    return;
                }
            } else if ((m instanceof Incomplete) && ((Incomplete) m).cH_() != null) {
                bzVar.cL_();
                return;
            } else {
                return;
            }
        } while (!f173466a.compareAndSet(this, m, cb.f173482g));
    }

    /* renamed from: f */
    public String mo242638f() {
        return al.m266275b(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key<?> getKey() {
        return Job.f173460b;
    }

    /* renamed from: l */
    public final ChildHandle mo242761l() {
        return (ChildHandle) this._parentHandle;
    }

    /* renamed from: m */
    public final Object mo242762m() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo242987c(this);
        }
    }

    /* renamed from: n */
    public final boolean mo242763n() {
        return !(mo242762m() instanceof Incomplete);
    }

    /* renamed from: h */
    private final boolean mo242679h() {
        Object m;
        do {
            m = mo242762m();
            if (!(m instanceof Incomplete)) {
                return false;
            }
        } while (mo242627a(m) < 0);
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: i */
    public final boolean mo242736i() {
        Object m = mo242762m();
        if ((m instanceof CompletedExceptionally) || ((m instanceof Finishing) && ((Finishing) m).mo242776f())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: k */
    public final boolean mo242738k() {
        int a;
        do {
            a = mo242627a(mo242762m());
            if (a == 0) {
                return false;
            }
        } while (a != 1);
        return true;
    }

    public String toString() {
        return mo242765p() + '@' + al.m266273a(this);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.ca$b */
    public static final class ChildCompletion extends JobNode<Job> {

        /* renamed from: a */
        private final JobSupport f173468a;

        /* renamed from: c */
        private final Finishing f173469c;

        /* renamed from: d */
        private final ChildHandleNode f173470d;

        /* renamed from: g */
        private final Object f173471g;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public String toString() {
            return "ChildCompletion[" + this.f173470d + ", " + this.f173471g + ']';
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            mo242730a(th);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: a */
        public void mo242730a(Throwable th) {
            this.f173468a.mo242746a(this.f173469c, this.f173470d, this.f173471g);
        }

        public ChildCompletion(JobSupport caVar, Finishing cVar, ChildHandleNode rVar, Object obj) {
            super(rVar.f173875a);
            this.f173468a = caVar;
            this.f173469c = cVar;
            this.f173470d = rVar;
            this.f173471g = obj;
        }
    }

    /* renamed from: p */
    public final String mo242765p() {
        return mo242638f() + '{' + m266453j(mo242762m()) + '}';
    }

    @Override // kotlinx.coroutines.ParentJob
    /* renamed from: o */
    public CancellationException mo242764o() {
        Throwable th;
        Object m = mo242762m();
        CancellationException cancellationException = null;
        if (m instanceof Finishing) {
            th = ((Finishing) m).mo242774d();
        } else if (m instanceof CompletedExceptionally) {
            th = ((CompletedExceptionally) m).f173971a;
        } else if (!(m instanceof Incomplete)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + m266453j(m), th, this);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: j */
    public final CancellationException mo242737j() {
        Object m = mo242762m();
        if (m instanceof Finishing) {
            Throwable d = ((Finishing) m).mo242774d();
            if (d != null) {
                CancellationException a = mo242742a(d, al.m266275b(this) + " is cancelling");
                if (a != null) {
                    return a;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (m instanceof Incomplete) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (m instanceof CompletedExceptionally) {
            return m266431a(this, ((CompletedExceptionally) m).f173971a, null, 1, null);
        } else {
            return new JobCancellationException(al.m266275b(this) + " has completed normally", null, this);
        }
    }

    /* renamed from: a */
    public void mo242628a(Throwable th) {
        throw th;
    }

    /* renamed from: a */
    public final DisposableHandle mo242743a(Function1<? super Throwable, Unit> function1) {
        return mo242732a(false, true, function1);
    }

    /* renamed from: b */
    public void mo242749b(Throwable th) {
        mo242758e((Object) th);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> cVar) {
        return (E) Job.C69372a.m266397a(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> cVar) {
        return Job.C69372a.m266401b(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext fVar) {
        return Job.C69372a.m266398a(this, fVar);
    }

    public JobSupport(boolean z) {
        Empty bbVar;
        if (z) {
            bbVar = cb.f173482g;
        } else {
            bbVar = cb.f173481f;
        }
        this._state = bbVar;
        this._parentHandle = null;
    }

    /* renamed from: i */
    private final Throwable m266452i(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally vVar = (CompletedExceptionally) obj;
        if (vVar != null) {
            return vVar.f173971a;
        }
        return null;
    }

    @Override // kotlinx.coroutines.ChildJob
    /* renamed from: a */
    public final void mo242747a(ParentJob ciVar) {
        mo242758e(ciVar);
    }

    /* renamed from: d */
    public final boolean mo242755d(Throwable th) {
        return mo242758e((Object) th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.ca$d */
    public static final class C69374d extends LockFreeLinkedListNode.CondAddOp {

        /* renamed from: a */
        final /* synthetic */ LockFreeLinkedListNode f173473a;

        /* renamed from: b */
        final /* synthetic */ JobSupport f173474b;

        /* renamed from: c */
        final /* synthetic */ Object f173475c;

        /* renamed from: a */
        public Object mo242778a(LockFreeLinkedListNode oVar) {
            boolean z;
            if (this.f173474b.mo242762m() == this.f173475c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C69570n.m267043a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69374d(LockFreeLinkedListNode oVar, LockFreeLinkedListNode oVar2, JobSupport caVar, Object obj) {
            super(oVar2);
            this.f173473a = oVar;
            this.f173474b = caVar;
            this.f173475c = obj;
        }
    }

    /* renamed from: b */
    private final ChildHandleNode m266441b(Incomplete boVar) {
        Incomplete boVar2;
        if (!(boVar instanceof ChildHandleNode)) {
            boVar2 = null;
        } else {
            boVar2 = boVar;
        }
        ChildHandleNode rVar = (ChildHandleNode) boVar2;
        if (rVar != null) {
            return rVar;
        }
        NodeList cH_ = boVar.cH_();
        if (cH_ != null) {
            return m266434a((LockFreeLinkedListNode) cH_);
        }
        return null;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlinx.coroutines.ca$a */
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {

        /* renamed from: a */
        private final JobSupport f173467a;

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: i */
        public String mo242768i() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: a */
        public Throwable mo242767a(Job btVar) {
            Throwable d;
            Object m = this.f173467a.mo242762m();
            if ((m instanceof Finishing) && (d = ((Finishing) m).mo242774d()) != null) {
                return d;
            }
            if (m instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) m).f173971a;
            }
            return btVar.mo242737j();
        }

        public AwaitContinuation(Continuation<? super T> cVar, JobSupport caVar) {
            super(cVar, 1);
            this.f173467a = caVar;
        }
    }

    /* renamed from: a */
    private final int mo242627a(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).mo242691b()) {
                return 0;
            }
            if (!f173466a.compareAndSet(this, obj, cb.f173482g)) {
                return -1;
            }
            mo242636d();
            return 1;
        } else if (!(obj instanceof InactiveNodeList)) {
            return 0;
        } else {
            if (!f173466a.compareAndSet(this, obj, ((InactiveNodeList) obj).cH_())) {
                return -1;
            }
            mo242636d();
            return 1;
        }
    }

    /* renamed from: b */
    private final void m266443b(JobNode<?> bzVar) {
        bzVar.mo243011a(new NodeList());
        f173466a.compareAndSet(this, bzVar, bzVar.mo243017j());
    }

    /* renamed from: c */
    private final Object mo242633c(Object obj) {
        Object a;
        do {
            Object m = mo242762m();
            if (!(m instanceof Incomplete) || ((m instanceof Finishing) && ((Finishing) m).mo242773c())) {
                return cb.f173476a;
            }
            a = m266428a(m, new CompletedExceptionally(m266448g(obj), false, 2, null));
        } while (a == cb.f173478c);
        return a;
    }

    /* renamed from: g */
    private final Throwable m266448g(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new JobCancellationException(mo242637e(), null, this);
        } else if (obj != null) {
            return ((ParentJob) obj).mo242764o();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: j */
    private final String m266453j(Object obj) {
        if (obj instanceof Finishing) {
            Finishing cVar = (Finishing) obj;
            if (cVar.mo242776f()) {
                return "Cancelling";
            }
            if (cVar.mo242773c()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof Incomplete) {
            if (((Incomplete) obj).mo242691b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: d */
    public final Object mo242754d(Continuation<Object> cVar) {
        Object m;
        do {
            m = mo242762m();
            if (!(m instanceof Incomplete)) {
                if (!(m instanceof CompletedExceptionally)) {
                    return cb.m266512b(m);
                }
                Throwable th = ((CompletedExceptionally) m).f173971a;
                if (!ak.m266271c()) {
                    throw th;
                } else if (!(cVar instanceof CoroutineStackFrame)) {
                    throw th;
                } else {
                    throw C69554aa.m266956a(th, (CoroutineStackFrame) cVar);
                }
            }
        } while (mo242627a(m) < 0);
        return mo242756e(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo242756e(Continuation<Object> cVar) {
        AwaitContinuation aVar = new AwaitContinuation(C69086a.m265825a(cVar), this);
        C69575n.m267178a(aVar, mo242743a((Function1<? super Throwable, Unit>) new ResumeAwaitOnCompletion(this, aVar)));
        Object g = aVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: f */
    public final Object mo242759f(Object obj) {
        Object a;
        do {
            a = m266428a(mo242762m(), obj);
            if (a == cb.f173476a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, m266452i(obj));
            }
        } while (a == cb.f173478c);
        return a;
    }

    /* renamed from: g */
    private final boolean m266449g(Throwable th) {
        if (cJ_()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle l = mo242761l();
        if (l == null || l == NonDisposableHandle.f173485a) {
            return z;
        }
        if (l.mo242781b(th) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo242751c(Continuation<? super Unit> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        lVar.mo243071d();
        CancellableContinuationImpl lVar2 = lVar;
        C69575n.m267178a(lVar2, mo242743a((Function1<? super Throwable, Unit>) new ResumeOnCompletion(this, lVar2)));
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* renamed from: e */
    public final boolean mo242758e(Object obj) {
        Object obj2 = cb.f173476a;
        if (mo242739b() && (obj2 = mo242633c(obj)) == cb.f173477b) {
            return true;
        }
        if (obj2 == cb.f173476a) {
            obj2 = m266450h(obj);
        }
        if (obj2 == cb.f173476a || obj2 == cb.f173477b) {
            return true;
        }
        if (obj2 == cb.f173479d) {
            return false;
        }
        mo242678d(obj2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        m266437a(((kotlinx.coroutines.JobSupport.Finishing) r2).cH_(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return kotlinx.coroutines.cb.f173476a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m266450h(java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.m266450h(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public boolean mo242753c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo242758e((Object) th) || !mo242740c()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public final Object mo242735b(Continuation<? super Unit> cVar) {
        if (!mo242679h()) {
            C69387db.m266823a(cVar.getContext());
            return Unit.INSTANCE;
        }
        Object c = mo242751c(cVar);
        if (c == C69086a.m265828a()) {
            return c;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    private final NodeList m266433a(Incomplete boVar) {
        NodeList cH_ = boVar.cH_();
        if (cH_ != null) {
            return cH_;
        }
        if (boVar instanceof Empty) {
            return new NodeList();
        }
        if (boVar instanceof JobNode) {
            m266443b((JobNode) boVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + boVar).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> kVar) {
        return (R) Job.C69372a.m266396a(this, r, kVar);
    }

    /* renamed from: c */
    public final <T, R> void mo242752c(SelectInstance<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> kVar) {
        Object m = mo242762m();
        if (m instanceof CompletedExceptionally) {
            dVar.mo243117a(((CompletedExceptionally) m).f173971a);
        } else {
            C69358a.m266242a(kVar, cb.m266512b(m), dVar.mo243116a());
        }
    }

    /* renamed from: a */
    private final Object m266428a(Object obj, Object obj2) {
        if (!(obj instanceof Incomplete)) {
            return cb.f173476a;
        }
        if ((!(obj instanceof Empty) && !(obj instanceof JobNode)) || (obj instanceof ChildHandleNode) || (obj2 instanceof CompletedExceptionally)) {
            return m266447c((Incomplete) obj, obj2);
        }
        if (m266439a((Incomplete) obj, obj2)) {
            return obj2;
        }
        return cb.f173478c;
    }

    /* renamed from: b */
    private final void m266442b(Incomplete boVar, Object obj) {
        ChildHandle l = mo242761l();
        if (l != null) {
            l.mo242687a();
            mo242748a((ChildHandle) NonDisposableHandle.f173485a);
        }
        Throwable th = null;
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally vVar = (CompletedExceptionally) obj;
        if (vVar != null) {
            th = vVar.f173971a;
        }
        if (boVar instanceof JobNode) {
            try {
                ((JobNode) boVar).mo242730a(th);
            } catch (Throwable th2) {
                mo242628a((Throwable) new CompletionHandlerException("Exception in completion handler " + boVar + " for " + this, th2));
            }
        } else {
            NodeList cH_ = boVar.cH_();
            if (cH_ != null) {
                m266444b(cH_, th);
            }
        }
    }

    /* renamed from: a */
    private final Object m266429a(Finishing cVar, Object obj) {
        Object obj2;
        Throwable th;
        boolean f;
        Throwable a;
        boolean z;
        boolean z2 = true;
        if (ak.m266269a()) {
            if (mo242762m() == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        if (ak.m266269a() && !(!cVar.mo242775e())) {
            throw new AssertionError();
        } else if (!ak.m266269a() || cVar.mo242773c()) {
            if (!(obj instanceof CompletedExceptionally)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            CompletedExceptionally vVar = (CompletedExceptionally) obj2;
            if (vVar != null) {
                th = vVar.f173971a;
            } else {
                th = null;
            }
            synchronized (cVar) {
                f = cVar.mo242776f();
                List<Throwable> b = cVar.mo242771b(th);
                a = m266430a(cVar, (List<? extends Throwable>) b);
                if (a != null) {
                    m266435a(a, (List<? extends Throwable>) b);
                }
            }
            if (!(a == null || a == th)) {
                obj = new CompletedExceptionally(a, false, 2, null);
            }
            if (a != null) {
                if (!m266449g(a) && !mo242760f(a)) {
                    z2 = false;
                }
                if (z2) {
                    if (obj != null) {
                        ((CompletedExceptionally) obj).mo243139c();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!f) {
                mo242757e(a);
            }
            mo242632b(obj);
            boolean compareAndSet = f173466a.compareAndSet(this, cVar, cb.m266511a(obj));
            if (!ak.m266269a() || compareAndSet) {
                m266442b(cVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private final void m266444b(NodeList cfVar, Throwable th) {
        Throwable th2 = null;
        NodeList cfVar2 = cfVar;
        Object i = cfVar2.mo243016i();
        if (i != null) {
            for (LockFreeLinkedListNode oVar = (LockFreeLinkedListNode) i; !Intrinsics.areEqual(oVar, cfVar2); oVar = oVar.mo243017j()) {
                if (oVar instanceof JobNode) {
                    JobNode bzVar = (JobNode) oVar;
                    try {
                        bzVar.mo242730a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C69026a.m265651a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        th2 = new CompletionHandlerException("Exception in completion handler " + bzVar + " for " + this, th3);
                    }
                }
            }
            if (th2 != null) {
                mo242628a(th2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006e, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0070, code lost:
        m266437a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0073, code lost:
        r7 = m266441b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
        if (r7 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007d, code lost:
        if (m266445b(r1, r7, r8) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0081, code lost:
        return kotlinx.coroutines.cb.f173477b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        return m266429a(r1, r8);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m266447c(kotlinx.coroutines.Incomplete r7, java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.m266447c(kotlinx.coroutines.bo, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private final Throwable m266430a(Finishing cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            List<? extends Throwable> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(t instanceof CancellationException)) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                return t3;
            }
            Throwable th = (Throwable) list.get(0);
            if (th instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    T t4 = next;
                    if (t4 == th || !(t4 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                T t5 = t2;
                if (t5 != null) {
                    return t5;
                }
            }
            return th;
        } else if (!cVar.mo242776f()) {
            return null;
        } else {
            return new JobCancellationException(mo242637e(), null, this);
        }
    }

    /* renamed from: a */
    private final JobNode<?> m266432a(Function1<? super Throwable, Unit> function1, boolean z) {
        boolean z2 = true;
        JobCancellingNode buVar = null;
        if (z) {
            if (function1 instanceof JobCancellingNode) {
                buVar = function1;
            }
            JobCancellingNode buVar2 = buVar;
            if (buVar2 != null) {
                if (ak.m266269a()) {
                    if (buVar2.f173463b != this) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                if (buVar2 != null) {
                    return buVar2;
                }
            }
            return new InvokeOnCancelling(this, function1);
        }
        if (function1 instanceof JobNode) {
            buVar = function1;
        }
        JobNode<?> bzVar = buVar;
        if (bzVar != null) {
            if (ak.m266269a()) {
                if (bzVar.f173463b != this || (bzVar instanceof JobCancellingNode)) {
                    z2 = false;
                }
                if (!z2) {
                    throw new AssertionError();
                }
            }
            if (bzVar != null) {
                return bzVar;
            }
        }
        return new InvokeOnCompletion(this, function1);
    }

    /* renamed from: b */
    public final <T, R> void mo242750b(SelectInstance<? super R> dVar, Function2<? super T, ? super Continuation<? super R>, ? extends Object> kVar) {
        Object m;
        do {
            m = mo242762m();
            if (!dVar.mo243121e()) {
                if (!(m instanceof Incomplete)) {
                    if (!dVar.mo243123g()) {
                        return;
                    }
                    if (m instanceof CompletedExceptionally) {
                        dVar.mo243117a(((CompletedExceptionally) m).f173971a);
                        return;
                    } else {
                        C69359b.m266245a(kVar, cb.m266512b(m), dVar.mo243116a());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (mo242627a(m) != 0);
        dVar.mo243118a(mo242743a((Function1<? super Throwable, Unit>) new SelectAwaitOnCompletion(this, dVar, kVar)));
    }

    /* renamed from: b */
    private final boolean m266445b(Finishing cVar, ChildHandleNode rVar, Object obj) {
        while (Job.C69372a.m266399a(rVar.f173875a, false, false, new ChildCompletion(this, cVar, rVar, obj), 1, null) == NonDisposableHandle.f173485a) {
            rVar = m266434a((LockFreeLinkedListNode) rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m266431a(JobSupport caVar, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return caVar.mo242742a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }
}
