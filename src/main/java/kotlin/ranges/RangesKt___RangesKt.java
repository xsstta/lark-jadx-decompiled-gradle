package kotlin.ranges;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3469d.C69094e;
import kotlin.random.Random;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\r\u0010*\u001a\u00020\u0018*\u00020\u0016H\b\u001a\u0014\u0010*\u001a\u00020\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\b*\u00020!H\b\u001a\u0014\u0010*\u001a\u00020\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\t*\u00020#H\b\u001a\u0014\u0010*\u001a\u00020\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u0016H\b¢\u0006\u0002\u0010-\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\b*\u00020!H\b¢\u0006\u0002\u0010/\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0014\u0010,\u001a\u0004\u0018\u00010\t*\u00020#H\b¢\u0006\u0002\u00101\u001a\u001b\u0010,\u001a\u0004\u0018\u00010\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00102\u001a\n\u00103\u001a\u00020)*\u00020)\u001a\n\u00103\u001a\u00020&*\u00020&\u001a\n\u00103\u001a\u00020(*\u00020(\u001a\u0015\u00104\u001a\u00020)*\u00020)2\u0006\u00104\u001a\u00020\bH\u0004\u001a\u0015\u00104\u001a\u00020&*\u00020&2\u0006\u00104\u001a\u00020\bH\u0004\u001a\u0015\u00104\u001a\u00020(*\u00020(2\u0006\u00104\u001a\u00020\tH\u0004\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u00106\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u00107\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u00108\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u00109\u001a\u0013\u00105\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u0010:\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u0010@\u001a\u0013\u0010?\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010A\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010C\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010D\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010E\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010G\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010G\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010G\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0004¨\u0006H"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "randomOrNull", "(Lkotlin/ranges/CharRange;)Ljava/lang/Character;", "(Lkotlin/ranges/CharRange;Lkotlin/random/Random;)Ljava/lang/Character;", "(Lkotlin/ranges/IntRange;)Ljava/lang/Integer;", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)Ljava/lang/Integer;", "(Lkotlin/ranges/LongRange;)Ljava/lang/Long;", "(Lkotlin/ranges/LongRange;Lkotlin/random/Random;)Ljava/lang/Long;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/ranges/RangesKt")
class RangesKt___RangesKt extends C69125o {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final LongProgression downTo(long j, byte b) {
        return LongProgression.f173249a.mo239423a(j, (long) b, -1);
    }

    public static final LongProgression downTo(long j, int i) {
        return LongProgression.f173249a.mo239423a(j, (long) i, -1);
    }

    public static final LongProgression downTo(int i, long j) {
        return LongProgression.f173249a.mo239423a((long) i, j, -1);
    }

    public static final LongProgression downTo(long j, long j2) {
        return LongProgression.f173249a.mo239423a(j, j2, -1);
    }

    public static final LongProgression downTo(byte b, long j) {
        return LongProgression.f173249a.mo239423a((long) b, j, -1);
    }

    public static final LongProgression downTo(short s, long j) {
        return LongProgression.f173249a.mo239423a((long) s, j, -1);
    }

    public static final LongProgression downTo(long j, short s) {
        return LongProgression.f173249a.mo239423a(j, (long) s, -1);
    }

    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.f173239a.mo239408a(s, s2, -1);
    }

    public static final LongRange until(long j, byte b) {
        return new LongRange(j, ((long) b) - 1);
    }

    public static final LongRange until(long j, int i) {
        return new LongRange(j, ((long) i) - 1);
    }

    public static final LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.f173258c.mo239428a();
        }
        return new LongRange((long) i, j - 1);
    }

    public static final LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.f173258c.mo239428a();
        }
        return new LongRange(j, j2 - 1);
    }

    public static final LongRange until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.f173258c.mo239428a();
        }
        return new LongRange((long) b, j - 1);
    }

    public static final LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.f173258c.mo239428a();
        }
        return new LongRange((long) s, j - 1);
    }

    public static final LongRange until(long j, short s) {
        return new LongRange(j, ((long) s) - 1);
    }

    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t, T t2, T t3) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        if (t2 == null || t3 == null) {
            if (t2 == null || t.compareTo(t2) >= 0) {
                return (t3 == null || t.compareTo(t3) <= 0) ? t : t3;
            }
            return t2;
        } else if (t2.compareTo(t3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 > s3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
        } else if (s < s2) {
            return s2;
        } else {
            return s > s3 ? s3 : s;
        }
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t, ClosedFloatingPointRange<T> fVar) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(fVar, "range");
        if (fVar.mo239367e()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        } else if (!fVar.mo239384a(t, fVar.mo239377g()) || fVar.mo239384a(fVar.mo239377g(), t)) {
            return (!fVar.mo239384a(fVar.mo239379i(), t) || fVar.mo239384a(t, fVar.mo239379i())) ? t : fVar.mo239379i();
        } else {
            return fVar.mo239377g();
        }
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t, ClosedRange<T> gVar) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof ClosedFloatingPointRange) {
            return (T) RangesKt.coerceIn((Comparable) t, (ClosedFloatingPointRange) gVar);
        }
        if (gVar.mo239367e()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (t.compareTo(gVar.mo239377g()) < 0) {
            return gVar.mo239377g();
        } else {
            return t.compareTo(gVar.mo239379i()) > 0 ? gVar.mo239379i() : t;
        }
    }

    public static final long coerceIn(long j, ClosedRange<Long> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn((Comparable) Long.valueOf(j), (ClosedFloatingPointRange) gVar)).longValue();
        }
        if (gVar.mo239367e()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (j < gVar.mo239377g().longValue()) {
            return gVar.mo239377g().longValue();
        } else {
            return j > gVar.mo239379i().longValue() ? gVar.mo239379i().longValue() : j;
        }
    }

    private static final char random(CharRange cVar) {
        return RangesKt.random(cVar, Random.f173148c);
    }

    private static final Character randomOrNull(CharRange cVar) {
        return RangesKt.randomOrNull(cVar, Random.f173148c);
    }

    private static final int random(IntRange kVar) {
        return RangesKt.random(kVar, Random.f173148c);
    }

    private static final Integer randomOrNull(IntRange kVar) {
        return RangesKt.randomOrNull(kVar, Random.f173148c);
    }

    public static final CharProgression reversed(CharProgression aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$reversed");
        return CharProgression.f173223a.mo239372a(aVar.mo239364b(), aVar.mo239363a(), -aVar.mo239365c());
    }

    public static final Byte toByteExactOrNull(double d) {
        double d2 = (double) SmActions.ACTION_ONTHECALL_ENTRY;
        if (d < ((double) -128) || d > d2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) d));
    }

    public static final Integer toIntExactOrNull(double d) {
        double d2 = (double) Integer.MAX_VALUE;
        if (d < ((double) Integer.MIN_VALUE) || d > d2) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    public static final Long toLongExactOrNull(double d) {
        double d2 = (double) Long.MAX_VALUE;
        if (d < ((double) Long.MIN_VALUE) || d > d2) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    public static final Short toShortExactOrNull(double d) {
        double d2 = (double) 32767;
        if (d < ((double) -32768) || d > d2) {
            return null;
        }
        return Short.valueOf((short) ((int) d));
    }

    public static final IntProgression reversed(IntProgression iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "$this$reversed");
        return IntProgression.f173239a.mo239408a(iVar.mo239400b(), iVar.mo239399a(), -iVar.mo239401c());
    }

    public static final Byte toByteExactOrNull(float f) {
        float f2 = (float) SmActions.ACTION_ONTHECALL_ENTRY;
        if (f < ((float) -128) || f > f2) {
            return null;
        }
        return Byte.valueOf((byte) ((int) f));
    }

    public static final Integer toIntExactOrNull(float f) {
        float f2 = (float) Integer.MAX_VALUE;
        if (f < ((float) Integer.MIN_VALUE) || f > f2) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    public static final Long toLongExactOrNull(float f) {
        float f2 = (float) Long.MAX_VALUE;
        if (f < ((float) Long.MIN_VALUE) || f > f2) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    public static final Short toShortExactOrNull(float f) {
        float f2 = (float) 32767;
        if (f < ((float) -32768) || f > f2) {
            return null;
        }
        return Short.valueOf((short) ((int) f));
    }

    public static final LongProgression reversed(LongProgression lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$reversed");
        return LongProgression.f173249a.mo239423a(lVar.mo239415b(), lVar.mo239414a(), -lVar.mo239416c());
    }

    public static final Byte toByteExactOrNull(int i) {
        if (-128 <= i && 127 >= i) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j) {
        long j2 = (long) Integer.MAX_VALUE;
        if (((long) Integer.MIN_VALUE) <= j && j2 >= j) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    public static final Short toShortExactOrNull(int i) {
        if (-32768 <= i && 32767 >= i) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    private static final long random(LongRange nVar) {
        return RangesKt.random(nVar, Random.f173148c);
    }

    private static final Long randomOrNull(LongRange nVar) {
        return RangesKt.randomOrNull(nVar, Random.f173148c);
    }

    public static final Byte toByteExactOrNull(long j) {
        long j2 = (long) SmActions.ACTION_ONTHECALL_ENTRY;
        if (((long) -128) <= j && j2 >= j) {
            return Byte.valueOf((byte) ((int) j));
        }
        return null;
    }

    public static final Short toShortExactOrNull(long j) {
        long j2 = (long) 32767;
        if (((long) -32768) <= j && j2 >= j) {
            return Short.valueOf((short) ((int) j));
        }
        return null;
    }

    public static final Byte toByteExactOrNull(short s) {
        short s2 = (short) -128;
        short s3 = (short) SmActions.ACTION_ONTHECALL_ENTRY;
        if (s2 <= s && s3 >= s) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    public static final CharProgression downTo(char c, char c2) {
        return CharProgression.f173223a.mo239372a(c, c2, -1);
    }

    public static final IntRange until(byte b, byte b2) {
        return new IntRange(b, b2 - 1);
    }

    public static final IntProgression downTo(byte b, byte b2) {
        return IntProgression.f173239a.mo239408a(b, b2, -1);
    }

    public static final boolean intRangeContains(ClosedRange<Integer> gVar, byte b) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Integer.valueOf(b));
    }

    public static final IntRange until(byte b, short s) {
        return new IntRange(b, s - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean byteRangeContains(ClosedRange<Byte> gVar, double d) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return gVar.mo239375a(byteExactOrNull);
        }
        return false;
    }

    private static final boolean contains(CharRange cVar, Character ch) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$contains");
        if (ch == null || !cVar.mo239374a(ch.charValue())) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean doubleRangeContains(ClosedRange<Double> gVar, byte b) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Double.valueOf((double) b));
    }

    public static final IntProgression downTo(byte b, int i) {
        return IntProgression.f173239a.mo239408a(b, i, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean floatRangeContains(ClosedRange<Float> gVar, byte b) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Float.valueOf((float) b));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean intRangeContains(ClosedRange<Integer> gVar, double d) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return gVar.mo239375a(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(ClosedRange<Long> gVar, byte b) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Long.valueOf((long) b));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> gVar, byte b) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Short.valueOf((short) b));
    }

    public static final CharRange until(char c, char c2) {
        if (c2 <= 0) {
            return CharRange.f173232c.mo239380a();
        }
        return new CharRange(c, (char) (c2 - 1));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean byteRangeContains(ClosedRange<Byte> gVar, float f) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return gVar.mo239375a(byteExactOrNull);
        }
        return false;
    }

    private static final boolean contains(IntRange kVar, Integer num) {
        Intrinsics.checkParameterIsNotNull(kVar, "$this$contains");
        if (num == null || !kVar.mo239410a(num.intValue())) {
            return false;
        }
        return true;
    }

    public static final boolean doubleRangeContains(ClosedRange<Double> gVar, float f) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Double.valueOf((double) f));
    }

    public static final IntProgression downTo(byte b, short s) {
        return IntProgression.f173239a.mo239408a(b, s, -1);
    }

    public static final boolean floatRangeContains(ClosedRange<Float> gVar, double d) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Float.valueOf((float) d));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean intRangeContains(ClosedRange<Integer> gVar, float f) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return gVar.mo239375a(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean longRangeContains(ClosedRange<Long> gVar, double d) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return gVar.mo239375a(longExactOrNull);
        }
        return false;
    }

    public static final char random(CharRange cVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$random");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        try {
            return (char) dVar.mo239195a((int) cVar.mo239363a(), cVar.mo239364b() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final Character randomOrNull(CharRange cVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        if (cVar.mo239367e()) {
            return null;
        }
        return Character.valueOf((char) dVar.mo239195a((int) cVar.mo239363a(), cVar.mo239364b() + 1));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean shortRangeContains(ClosedRange<Short> gVar, double d) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return gVar.mo239375a(shortExactOrNull);
        }
        return false;
    }

    public static final CharProgression step(CharProgression aVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "$this$step");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Integer.valueOf(i));
        CharProgression.Companion aVar2 = CharProgression.f173223a;
        char a = aVar.mo239363a();
        char b = aVar.mo239364b();
        if (aVar.mo239365c() <= 0) {
            i = -i;
        }
        return aVar2.mo239372a(a, b, i);
    }

    public static final IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.f173248c.mo239413a();
        }
        return new IntRange(b, i - 1);
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return gVar.mo239375a(byteExactOrNull);
        }
        return false;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t, T t2) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceAtLeast");
        Intrinsics.checkParameterIsNotNull(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t, T t2) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceAtMost");
        Intrinsics.checkParameterIsNotNull(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    private static final boolean contains(LongRange nVar, Long l) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$contains");
        if (l == null || !nVar.mo239425a(l.longValue())) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean doubleRangeContains(ClosedRange<Double> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Double.valueOf((double) i));
    }

    public static final IntProgression downTo(int i, byte b) {
        return IntProgression.f173239a.mo239408a(i, b, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean floatRangeContains(ClosedRange<Float> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Float.valueOf((float) i));
    }

    public static final boolean intRangeContains(ClosedRange<Integer> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return gVar.mo239375a(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean longRangeContains(ClosedRange<Long> gVar, float f) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return gVar.mo239375a(longExactOrNull);
        }
        return false;
    }

    public static final int random(IntRange kVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "$this$random");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        try {
            return C69094e.m265882a(dVar, kVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final Integer randomOrNull(IntRange kVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        if (kVar.mo239403e()) {
            return null;
        }
        return Integer.valueOf(C69094e.m265882a(dVar, kVar));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean shortRangeContains(ClosedRange<Short> gVar, float f) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return gVar.mo239375a(shortExactOrNull);
        }
        return false;
    }

    public static final IntProgression step(IntProgression iVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(iVar, "$this$step");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Integer.valueOf(i));
        IntProgression.Companion aVar = IntProgression.f173239a;
        int a = iVar.mo239399a();
        int b = iVar.mo239400b();
        if (iVar.mo239401c() <= 0) {
            i = -i;
        }
        return aVar.mo239408a(a, b, i);
    }

    public static final IntRange until(int i, byte b) {
        return new IntRange(i, b - 1);
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return gVar.mo239375a(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean doubleRangeContains(ClosedRange<Double> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Double.valueOf((double) j));
    }

    public static final IntProgression downTo(int i, int i2) {
        return IntProgression.f173239a.mo239408a(i, i2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean floatRangeContains(ClosedRange<Float> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Float.valueOf((float) j));
    }

    public static final boolean intRangeContains(ClosedRange<Integer> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Integer.valueOf(s));
    }

    public static final boolean longRangeContains(ClosedRange<Long> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Long.valueOf((long) i));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return gVar.mo239375a(shortExactOrNull);
        }
        return false;
    }

    public static final LongProgression step(LongProgression lVar, long j) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(lVar, "$this$step");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Long.valueOf(j));
        LongProgression.Companion aVar = LongProgression.f173249a;
        long a = lVar.mo239414a();
        long b = lVar.mo239415b();
        if (lVar.mo239416c() <= 0) {
            j = -j;
        }
        return aVar.mo239423a(a, b, j);
    }

    public static final IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.f173248c.mo239413a();
        }
        return new IntRange(i, i2 - 1);
    }

    public static final boolean byteRangeContains(ClosedRange<Byte> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return gVar.mo239375a(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean doubleRangeContains(ClosedRange<Double> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Double.valueOf((double) s));
    }

    public static final IntProgression downTo(int i, short s) {
        return IntProgression.f173239a.mo239408a(i, s, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final boolean floatRangeContains(ClosedRange<Float> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Float.valueOf((float) s));
    }

    public static final boolean longRangeContains(ClosedRange<Long> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.mo239375a(Long.valueOf((long) s));
    }

    public static final long random(LongRange nVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$random");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        try {
            return C69094e.m265883a(dVar, nVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final Long randomOrNull(LongRange nVar, Random dVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        if (nVar.mo239418e()) {
            return null;
        }
        return Long.valueOf(C69094e.m265883a(dVar, nVar));
    }

    public static final boolean shortRangeContains(ClosedRange<Short> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return gVar.mo239375a(shortExactOrNull);
        }
        return false;
    }

    public static final IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    public static final int coerceIn(int i, ClosedRange<Integer> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.coerceIn((Comparable) Integer.valueOf(i), (ClosedFloatingPointRange) gVar)).intValue();
        }
        if (gVar.mo239367e()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (i < gVar.mo239377g().intValue()) {
            return gVar.mo239377g().intValue();
        } else {
            if (i > gVar.mo239379i().intValue()) {
                return gVar.mo239379i().intValue();
            }
            return i;
        }
    }

    public static final IntProgression downTo(short s, byte b) {
        return IntProgression.f173239a.mo239408a(s, b, -1);
    }

    public static final IntRange until(short s, byte b) {
        return new IntRange(s, b - 1);
    }

    public static final IntProgression downTo(short s, int i) {
        return IntProgression.f173239a.mo239408a(s, i, -1);
    }

    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.f173248c.mo239413a();
        }
        return new IntRange(s, i - 1);
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 > b3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
        } else if (b < b2) {
            return b2;
        } else {
            if (b > b3) {
                return b3;
            }
            return b;
        }
    }

    public static final double coerceIn(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static final float coerceIn(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }
}
