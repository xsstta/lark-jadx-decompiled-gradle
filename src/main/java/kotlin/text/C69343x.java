package kotlin.text;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.C64034n;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.am;
import kotlin.collections.aq;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.C69294l;
import kotlin.sequences.Sequence;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0002\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u0002\u001aE\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\b\u001a3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00050\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001aM\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aN\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u00020\u00050\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b¢\u0006\u0002\u0010\u0018\u001ah\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0019\u001a`\u0010\u001a\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0018\b\u0002\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00100\u0004H\b¢\u0006\u0002\u0010\u0018\u001a3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aN\u0010\u001d\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u000e\"\u0018\b\u0001\u0010\u0015*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0005\u0012\u0006\b\u0000\u0012\u0002H\u000e0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0018\u001a\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"H\u0007\u001a4\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\r\u0010%\u001a\u00020\"*\u00020\u0002H\b\u001a!\u0010%\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010&\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0012\u0010(\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a!\u0010)\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010)\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010*\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010*\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a)\u0010+\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"H\b¢\u0006\u0002\u0010/\u001a!\u00100\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u00100\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a6\u00101\u001a\u00020\u0002*\u00020\u00022'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\b\u001a6\u00101\u001a\u00020 *\u00020 2'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\b\u001aQ\u00105\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62'\u0010\u0003\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000102H\b¢\u0006\u0002\u00109\u001a!\u0010:\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010:\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a<\u0010;\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010<\u001a<\u0010=\u001a\u0002H6\"\f\b\u0000\u00106*\u000607j\u0002`8*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010<\u001a(\u0010>\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010?\u001a(\u0010@\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010?\u001a\n\u0010A\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010A\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0011\u0010B\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a(\u0010B\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010?\u001a3\u0010D\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\b\u001aL\u0010E\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\b0\u0004H\b¢\u0006\u0002\u0010G\u001aI\u0010H\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2'\u0010J\u001a#\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\b¢\u0006\u0002\u0010L\u001a^\u0010M\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0NH\b¢\u0006\u0002\u0010O\u001aI\u0010P\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2'\u0010J\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002H#02H\b¢\u0006\u0002\u0010L\u001a^\u0010Q\u001a\u0002H#\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u0002H#0NH\b¢\u0006\u0002\u0010O\u001a!\u0010R\u001a\u00020S*\u00020\u00022\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0\u0004H\b\u001a6\u0010U\u001a\u00020S*\u00020\u00022'\u0010T\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S02H\b\u001a)\u0010V\u001a\u00020\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0004H\b\u001a\u0019\u0010W\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010,\u001a\u00020\"¢\u0006\u0002\u0010/\u001a9\u0010X\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\f\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001aS\u0010X\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u001f0\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b\u001aR\u0010Y\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u001c\b\u0001\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050Z0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b¢\u0006\u0002\u0010\u0018\u001al\u0010Y\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u001c\b\u0002\u0010\u0015*\u0016\u0012\u0006\b\u0000\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0Z0\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u000e0\u0004H\b¢\u0006\u0002\u0010\u0019\u001a5\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\\\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0014\b\u0004\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\r0\u0004H\b\u001a!\u0010]\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a!\u0010^\u001a\u00020\"*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\n\u0010_\u001a\u00020\u0005*\u00020\u0002\u001a!\u0010_\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0011\u0010`\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a(\u0010`\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010?\u001a-\u0010a\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b\u001aB\u0010b\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\b\u001aH\u0010c\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020d*\u00020\u00022)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#02H\b\u001aa\u0010e\u001a\u0002H6\"\b\b\u0000\u0010#*\u00020d\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62)\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#02H\b¢\u0006\u0002\u0010f\u001a[\u0010g\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\b¢\u0006\u0002\u0010f\u001a3\u0010h\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\b\b\u0000\u0010#*\u00020d*\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\b\u001aL\u0010i\u001a\u0002H6\"\b\b\u0000\u0010#*\u00020d\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u0001H#0\u0004H\b¢\u0006\u0002\u0010G\u001aF\u0010j\u001a\u0002H6\"\u0004\b\u0000\u0010#\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u0002H#0F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H62\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010G\u001a\u0011\u0010k\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a8\u0010l\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0m*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010?\u001a-\u0010o\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010p\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050qj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`r¢\u0006\u0002\u0010s\u001a\u0011\u0010t\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a8\u0010u\u001a\u0004\u0018\u00010\u0005\"\u000e\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0m*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0\u0004H\b¢\u0006\u0002\u0010?\u001a-\u0010v\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u001a\u0010p\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00050qj\n\u0012\u0006\b\u0000\u0012\u00020\u0005`r¢\u0006\u0002\u0010s\u001a\n\u0010w\u001a\u00020\u0001*\u00020\u0002\u001a!\u0010w\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a0\u0010x\u001a\u0002Hy\"\b\b\u0000\u0010y*\u00020\u0002*\u0002Hy2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020S0\u0004H\b¢\u0006\u0002\u0010z\u001a-\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a-\u0010{\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u0010*\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\r\u0010|\u001a\u00020\u0005*\u00020\u0002H\b\u001a\u0014\u0010|\u001a\u00020\u0005*\u00020\u00022\u0006\u0010|\u001a\u00020}H\u0007\u001a\u0014\u0010~\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\b¢\u0006\u0002\u0010C\u001a\u001b\u0010~\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0006\u0010|\u001a\u00020}H\u0007¢\u0006\u0002\u0010\u001a7\u0010\u0001\u001a\u00020\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502H\b\u001aL\u0010\u0001\u001a\u00020\u0005*\u00020\u00022<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050NH\b\u001a?\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502H\b¢\u0006\u0003\u0010\u0001\u001a7\u0010\u0001\u001a\u00020\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u000502H\b\u001aL\u0010\u0001\u001a\u00020\u0005*\u00020\u00022<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u00050NH\b\u001a?\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u00022'\u0010J\u001a#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u000502H\b¢\u0006\u0003\u0010\u0001\u001a\u000b\u0010\u0001\u001a\u00020\u0002*\u00020\u0002\u001a\u000e\u0010\u0001\u001a\u00020 *\u00020 H\b\u001aQ\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2'\u0010J\u001a#\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#02H\b¢\u0006\u0003\u0010\u0001\u001af\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010I\u001a\u0002H#2<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u0011H#¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H#0NH\b¢\u0006\u0003\u0010\u0001\u001a=\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u00022'\u0010J\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502H\b\u001aR\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u00022<\u0010J\u001a8\u0012\u0013\u0012\u00110\"¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050NH\b\u001a\u000b\u0010\u0001\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010\u0001\u001a\u00020\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010C\u001a)\u0010\u0001\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b¢\u0006\u0002\u0010?\u001a\u001a\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\b\u001a\u0015\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0001\u001a\u00030\u0001\u001a\u001d\u0010\u0001\u001a\u00020 *\u00020 2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\bH\b\u001a\u0015\u0010\u0001\u001a\u00020 *\u00020 2\b\u0010\u0001\u001a\u00030\u0001\u001a\"\u0010\u0001\u001a\u00020\"*\u00020\u00022\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0\u0004H\b\u001a$\u0010\u0001\u001a\u00030\u0001*\u00020\u00022\u0013\u0010n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u00010\u0004H\b\u001a\u0013\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010'\u001a\u00020\"\u001a\u0013\u0010\u0001\u001a\u00020 *\u00020 2\u0006\u0010'\u001a\u00020\"\u001a\"\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a\"\u0010\u0001\u001a\u00020 *\u00020 2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\b\u001a+\u0010\u0001\u001a\u0002H6\"\u0010\b\u0000\u00106*\n\u0012\u0006\b\u0000\u0012\u00020\u00050F*\u00020\u00022\u0006\u0010\u0017\u001a\u0002H6¢\u0006\u0003\u0010\u0001\u001a\u001d\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00050\u0001j\t\u0012\u0004\u0012\u00020\u0005`\u0001*\u00020\u0002\u001a\u0011\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u0002\u001a\u0011\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00050Z*\u00020\u0002\u001a\u0012\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¢\u0001*\u00020\u0002\u001a1\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010¤\u0001\u001a\u00020\"2\t\b\u0002\u0010¥\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010£\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010¤\u0001\u001a\u00020\"2\t\b\u0002\u0010¥\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a1\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020 0\n*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010¤\u0001\u001a\u00020\"2\t\b\u0002\u0010¥\u0001\u001a\u00020\u0001H\u0007\u001aK\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\n\"\u0004\b\u0000\u0010#*\u00020\u00022\u0006\u0010!\u001a\u00020\"2\t\b\u0002\u0010¤\u0001\u001a\u00020\"2\t\b\u0002\u0010¥\u0001\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H#0\u0004H\u0007\u001a\u0018\u0010§\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00050¨\u00010\b*\u00020\u0002\u001a)\u0010©\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020\u0002H\u0004\u001a]\u0010©\u0001\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u001f\"\u0004\b\u0000\u0010\u000e*\u00020\u00022\u0007\u0010ª\u0001\u001a\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(«\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(¬\u0001\u0012\u0004\u0012\u0002H\u000e02H\b\u001a\u001f\u0010­\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u001f*\u00020\u0002H\u0007\u001aT\u0010­\u0001\u001a\b\u0012\u0004\u0012\u0002H#0\u001f\"\u0004\b\u0000\u0010#*\u00020\u000228\u0010\u000f\u001a4\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(«\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b3\u0012\t\b4\u0012\u0005\b\b(¬\u0001\u0012\u0004\u0012\u0002H#02H\b¨\u0006®\u0001"}, d2 = {"all", "", "", "predicate", "Lkotlin/Function1;", "", "any", "asIterable", "", "asSequence", "Lkotlin/sequences/Sequence;", "associate", "", "K", "V", "transform", "Lkotlin/Pair;", "associateBy", "keySelector", "valueTransform", "associateByTo", "M", "", "destination", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Ljava/lang/CharSequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "associateTo", "associateWith", "valueSelector", "associateWithTo", "chunked", "", "", "size", "", "R", "chunkedSequence", "count", "drop", C64034n.f161683a, "dropLast", "dropLastWhile", "dropWhile", "elementAtOrElse", "index", "defaultValue", "elementAtOrNull", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "filter", "filterIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "filterIndexedTo", "C", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function2;)Ljava/lang/Appendable;", "filterNot", "filterNotTo", "(Ljava/lang/CharSequence;Ljava/lang/Appendable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "filterTo", "find", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "findLast", "first", "firstOrNull", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "flatMap", "flatMapTo", "", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fold", "initial", "operation", "acc", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "action", "forEachIndexed", "getOrElse", "getOrNull", "groupBy", "groupByTo", "", "groupingBy", "Lkotlin/collections/Grouping;", "indexOfFirst", "indexOfLast", "last", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "", "mapIndexedNotNullTo", "(Ljava/lang/CharSequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "mapIndexedTo", "mapNotNull", "mapNotNullTo", "mapTo", "max", "maxBy", "", "selector", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "none", "onEach", "S", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;", "partition", "random", "Lkotlin/random/Random;", "randomOrNull", "(Ljava/lang/CharSequence;Lkotlin/random/Random;)Ljava/lang/Character;", "reduce", "reduceIndexed", "reduceOrNull", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/Character;", "reduceRight", "reduceRightIndexed", "reduceRightOrNull", "reversed", "scan", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "scanIndexed", "(Ljava/lang/CharSequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/util/List;", "scanReduce", "scanReduceIndexed", "single", "singleOrNull", "slice", "indices", "Lkotlin/ranges/IntRange;", "sumBy", "sumByDouble", "", "take", "takeLast", "takeLastWhile", "takeWhile", "toCollection", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "toHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toList", "toMutableList", "toSet", "", "windowed", "step", "partialWindows", "windowedSequence", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", AbstractC60044a.f149675a, C63954b.f161494a, "zipWithNext", "kotlin-stdlib"}, mo238835k = 5, mv = {1, 1, 16}, xi = 1, xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.x */
class C69343x extends C69342w {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$a */
    public static final class C69344a implements Iterable<Character>, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ CharSequence f173369a;

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return StringsKt.iterator(this.f173369a);
        }

        public C69344a(CharSequence charSequence) {
            this.f173369a = charSequence;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$b */
    public static final class C69345b implements Sequence<Character> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f173370a;

        @Override // kotlin.sequences.Sequence
        /* renamed from: a */
        public Iterator<Character> mo4717a() {
            return StringsKt.iterator(this.f173370a);
        }

        public C69345b(CharSequence charSequence) {
            this.f173370a = charSequence;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/collections/CharIterator;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$h */
    static final class C69351h extends Lambda implements Function0<CharIterator> {
        final /* synthetic */ CharSequence $this_withIndex;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69351h(CharSequence charSequence) {
            super(0);
            this.$this_withIndex = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharIterator invoke() {
            return StringsKt.iterator(this.$this_withIndex);
        }
    }

    private static final int count(CharSequence charSequence) {
        return charSequence.length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$c */
    static final class C69346c extends Lambda implements Function1<CharSequence, String> {
        public static final C69346c INSTANCE = new C69346c();

        C69346c() {
            super(1);
        }

        public final String invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "it");
            return charSequence.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$e */
    static final class C69348e extends Lambda implements Function1<CharSequence, String> {
        public static final C69348e INSTANCE = new C69348e();

        C69348e() {
            super(1);
        }

        public final String invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "it");
            return charSequence.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$f */
    static final class C69349f extends Lambda implements Function1<CharSequence, String> {
        public static final C69349f INSTANCE = new C69349f();

        C69349f() {
            super(1);
        }

        public final String invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static final boolean none(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$none");
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    private static final char random(CharSequence charSequence) {
        return StringsKt.random(charSequence, Random.f173148c);
    }

    private static final Character randomOrNull(CharSequence charSequence) {
        return StringsKt.randomOrNull(charSequence, Random.f173148c);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "index", "", "invoke", "(I)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$g */
    static final class C69350g extends Lambda implements Function1<Integer, R> {
        final /* synthetic */ int $size;
        final /* synthetic */ CharSequence $this_windowedSequence;
        final /* synthetic */ Function1 $transform;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69350g(CharSequence charSequence, int i, Function1 function1) {
            super(1);
            this.$this_windowedSequence = charSequence;
            this.$size = i;
            this.$transform = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final R invoke(int i) {
            int i2 = this.$size + i;
            if (i2 < 0 || i2 > this.$this_windowedSequence.length()) {
                i2 = this.$this_windowedSequence.length();
            }
            return (R) this.$transform.invoke(this.$this_windowedSequence.subSequence(i, i2));
        }
    }

    public static final boolean any(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$any");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final char first(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$first");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$firstOrNull");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reversed");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkExpressionValueIsNotNull(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$singleOrNull");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$toHashSet");
        return (HashSet) StringsKt.toCollection(charSequence, new HashSet(MapsKt.mapCapacity(charSequence.length())));
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$toMutableList");
        return (List) StringsKt.toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Iterable<IndexedValue<Character>> withIndex(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$withIndex");
        return new IndexingIterable(new C69351h(charSequence));
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$asIterable");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return CollectionsKt.emptyList();
            }
        }
        return new C69344a(charSequence);
    }

    public static final Sequence<Character> asSequence(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$asSequence");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C69294l.m266114a();
            }
        }
        return new C69345b(charSequence);
    }

    public static final char last(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$last");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastOrNull");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final Character max(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$max");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (charAt < charAt2) {
                    charAt = charAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final Character min(CharSequence charSequence) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$min");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (charAt > charAt2) {
                    charAt = charAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    private static final String reversed(String str) {
        if (str != null) {
            return StringsKt.reversed((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final char single(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$single");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static final List<Character> toList(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$toList");
        int length = charSequence.length();
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        if (length != 1) {
            return StringsKt.toMutableList(charSequence);
        }
        return CollectionsKt.listOf(Character.valueOf(charSequence.charAt(0)));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$toSet");
        int length = charSequence.length();
        if (length == 0) {
            return am.m265687a();
        }
        if (length != 1) {
            return (Set) StringsKt.toCollection(charSequence, new LinkedHashSet(MapsKt.mapCapacity(charSequence.length())));
        }
        return am.m265686a(Character.valueOf(charSequence.charAt(0)));
    }

    public static final List<Pair<Character, Character>> zipWithNext(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$zipWithNext");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            i++;
            arrayList.add(TuplesKt.to(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"kotlin/text/StringsKt___StringsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "keyOf", "element", "(C)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: kotlin.text.x$d */
    public static final class C69347d implements Grouping<Character, K> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f173371a;

        /* renamed from: b */
        final /* synthetic */ Function1 f173372b;

        public C69347d(CharSequence charSequence, Function1 function1) {
            this.f173371a = charSequence;
            this.f173372b = function1;
        }
    }

    private static final Character elementAtOrNull(CharSequence charSequence, int i) {
        return StringsKt.getOrNull(charSequence, i);
    }

    public static final List<String> chunked(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$chunked");
        return StringsKt.windowed(charSequence, i, i, true);
    }

    public static final Sequence<String> chunkedSequence(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$chunkedSequence");
        return StringsKt.chunkedSequence(charSequence, i, C69346c.INSTANCE);
    }

    public static final void forEach(CharSequence charSequence, Function1<? super Character, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$forEach");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        for (int i = 0; i < charSequence.length(); i++) {
            function1.invoke(Character.valueOf(charSequence.charAt(i)));
        }
    }

    public static final Character getOrNull(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$getOrNull");
        if (i < 0 || i > StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final <K> Grouping<Character, K> groupingBy(CharSequence charSequence, Function1<? super Character, ? extends K> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$groupingBy");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        return new C69347d(charSequence, function1);
    }

    public static final <S extends CharSequence> S onEach(S s, Function1<? super Character, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(s, "$this$onEach");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        for (int i = 0; i < s.length(); i++) {
            function1.invoke(Character.valueOf(s.charAt(i)));
        }
        return s;
    }

    public static final CharSequence slice(CharSequence charSequence, IntRange kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$slice");
        Intrinsics.checkParameterIsNotNull(kVar, "indices");
        if (kVar.mo239403e()) {
            return "";
        }
        return StringsKt.subSequence(charSequence, kVar);
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C c) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$toCollection");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    public static final boolean all(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$all");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$any");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateBy");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(function1.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, Function1<? super Character, ? extends V> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateWith");
        Intrinsics.checkParameterIsNotNull(function1, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(Character.valueOf(charAt), function1.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final int count(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$count");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (function1.invoke(Character.valueOf(charSequence.charAt(i2))).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public static final CharSequence drop(CharSequence charSequence, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence.subSequence(RangesKt.coerceAtMost(i, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StringsKt.take(charSequence, RangesKt.coerceAtLeast(charSequence.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$dropLastWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            if (!function1.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$dropWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence filter(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filter");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Boolean> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filterIndexed");
        Intrinsics.checkParameterIsNotNull(kVar, "predicate");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (kVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return sb;
    }

    public static final CharSequence filterNot(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filterNot");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        char charAt;
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return null;
            }
            charAt = charSequence.charAt(length);
        } while (!function1.invoke(Character.valueOf(charAt)).booleanValue());
        return Character.valueOf(charAt);
    }

    public static final char first(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$first");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character firstOrNull(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$firstOrNull");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$flatMap");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            CollectionsKt.addAll(arrayList, (Iterable) function1.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final void forEachIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$forEachIndexed");
        Intrinsics.checkParameterIsNotNull(kVar, "action");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            kVar.invoke(valueOf, Character.valueOf(charAt));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$groupBy");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = function1.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    public static final int indexOfFirst(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOfFirst");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOfLast");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (function1.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return length;
            }
        }
        return -1;
    }

    public static final <R> List<R> map(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$map");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            arrayList.add(function1.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapIndexed");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            arrayList.add(kVar.invoke(valueOf, Character.valueOf(charAt)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapIndexedNotNull");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = kVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapNotNull");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = function1.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final Character maxWith(CharSequence charSequence, Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$maxWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final Character minWith(CharSequence charSequence, Comparator<? super Character> comparator) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$minWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final boolean none(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$none");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            if (function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Pair<CharSequence, CharSequence> partition(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$partition");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    public static final char random(CharSequence charSequence, Random dVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$random");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(dVar.mo239192b(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character randomOrNull(CharSequence charSequence, Random dVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$randomOrNull");
        Intrinsics.checkParameterIsNotNull(dVar, "random");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(dVar.mo239192b(charSequence.length())));
    }

    public static final char reduceRight(CharSequence charSequence, Function2<? super Character, ? super Character, Character> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduceRight");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i = lastIndex - 1; i >= 0; i--) {
                charAt = kVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char reduceRightIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> oVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduceRightIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex >= 0) {
            char charAt = charSequence.charAt(lastIndex);
            for (int i = lastIndex - 1; i >= 0; i--) {
                charAt = oVar.invoke(Integer.valueOf(i), Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final Character reduceRightOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduceRightOrNull");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i = lastIndex - 1; i >= 0; i--) {
            charAt = kVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final Character singleOrNull(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$singleOrNull");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return ch;
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> iterable) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$slice");
        Intrinsics.checkParameterIsNotNull(iterable, "indices");
        int collectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(iterable, 10);
        if (collectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(collectionSizeOrDefault);
        for (Integer num : iterable) {
            sb.append(charSequence.charAt(num.intValue()));
        }
        return sb;
    }

    public static final int sumBy(CharSequence charSequence, Function1<? super Character, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$sumBy");
        Intrinsics.checkParameterIsNotNull(function1, "selector");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i += function1.invoke(Character.valueOf(charSequence.charAt(i2))).intValue();
        }
        return i;
    }

    public static final double sumByDouble(CharSequence charSequence, Function1<? super Character, Double> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$sumByDouble");
        Intrinsics.checkParameterIsNotNull(function1, "selector");
        double d = 0.0d;
        for (int i = 0; i < charSequence.length(); i++) {
            d += function1.invoke(Character.valueOf(charSequence.charAt(i))).doubleValue();
        }
        return d;
    }

    public static final CharSequence take(CharSequence charSequence, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence.subSequence(0, RangesKt.coerceAtMost(i, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = charSequence.length();
            return charSequence.subSequence(length - RangesKt.coerceAtMost(i, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$takeLastWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            if (!function1.invoke(Character.valueOf(charSequence.charAt(lastIndex))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence takeWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$takeWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!function1.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final List<Pair<Character, Character>> zip(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$zip");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(CharSequence charSequence, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associate");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) function1.invoke(Character.valueOf(charSequence.charAt(i)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final String drop(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "$this$drop");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(RangesKt.coerceAtMost(i, str.length()));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String dropLast(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "$this$dropLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return StringsKt.take(str, RangesKt.coerceAtLeast(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String dropLastWhile(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$dropLastWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(str); lastIndex >= 0; lastIndex--) {
            if (!function1.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(0, lastIndex + 1);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    public static final String dropWhile(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$dropWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(i);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    public static final String filter(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$filter");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final String filterIndexed(String str, Function2<? super Integer, ? super Character, Boolean> kVar) {
        Intrinsics.checkParameterIsNotNull(str, "$this$filterIndexed");
        Intrinsics.checkParameterIsNotNull(kVar, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            int i3 = i2 + 1;
            if (kVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i++;
            i2 = i3;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    public static final String filterNot(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$filterNot");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            if (!function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final char last(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        char charAt;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$last");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length >= 0) {
                charAt = charSequence.charAt(length);
            } else {
                throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
            }
        } while (!function1.invoke(Character.valueOf(charAt)).booleanValue());
        return charAt;
    }

    public static final Character lastOrNull(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        char charAt;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastOrNull");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return null;
            }
            charAt = charSequence.charAt(length);
        } while (!function1.invoke(Character.valueOf(charAt)).booleanValue());
        return Character.valueOf(charAt);
    }

    public static final <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$maxBy");
        Intrinsics.checkParameterIsNotNull(function1, "selector");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) function1.invoke(Character.valueOf(charAt));
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                Comparable comparable2 = (Comparable) function1.invoke(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$minBy");
        Intrinsics.checkParameterIsNotNull(function1, "selector");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) function1.invoke(Character.valueOf(charAt));
        if (1 <= lastIndex) {
            while (true) {
                char charAt2 = charSequence.charAt(i);
                Comparable comparable2 = (Comparable) function1.invoke(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final Pair<String, String> partition(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$partition");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    public static final char reduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduce");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            int lastIndex = StringsKt.getLastIndex(charSequence);
            if (1 <= lastIndex) {
                while (true) {
                    charAt = kVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final char reduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduceIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            char charAt = charSequence.charAt(0);
            int lastIndex = StringsKt.getLastIndex(charSequence);
            if (1 <= lastIndex) {
                while (true) {
                    charAt = oVar.invoke(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    public static final Character reduceOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$reduceOrNull");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        int i = 1;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt.getLastIndex(charSequence);
        if (1 <= lastIndex) {
            while (true) {
                charAt = kVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final List<Character> scanReduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$scanReduce");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            charAt = kVar.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    public static final List<Character> scanReduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$scanReduceIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i = 1; i < length; i++) {
            charAt = oVar.invoke(Integer.valueOf(i), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    public static final char single(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$single");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        Character ch = null;
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (!z) {
                    ch = Character.valueOf(charAt);
                    z = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (!z) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        } else if (ch != null) {
            return ch.charValue();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Char");
        }
    }

    private static final String slice(String str, Iterable<Integer> iterable) {
        if (str != null) {
            return StringsKt.slice((CharSequence) str, iterable).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final String take(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "$this$take");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, RangesKt.coerceAtMost(i, str.length()));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String takeLast(String str, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "$this$takeLast");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            String substring = str.substring(length - RangesKt.coerceAtMost(i, length));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final String takeLastWhile(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$takeLastWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int lastIndex = StringsKt.getLastIndex(str); lastIndex >= 0; lastIndex--) {
            if (!function1.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(lastIndex + 1);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final String takeWhile(String str, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, "$this$takeWhile");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                String substring = str.substring(0, i);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final <R> List<R> zipWithNext(CharSequence charSequence, Function2<? super Character, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$zipWithNext");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            i++;
            arrayList.add(kVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence.charAt(i))));
        }
        return arrayList;
    }

    public static final String slice(String str, IntRange kVar) {
        Intrinsics.checkParameterIsNotNull(str, "$this$slice");
        Intrinsics.checkParameterIsNotNull(kVar, "indices");
        if (kVar.mo239403e()) {
            return "";
        }
        return StringsKt.substring(str, kVar);
    }

    public static final <R> List<R> chunked(CharSequence charSequence, int i, Function1<? super CharSequence, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$chunked");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        return StringsKt.windowed(charSequence, i, i, true, function1);
    }

    public static final <R> Sequence<R> chunkedSequence(CharSequence charSequence, int i, Function1<? super CharSequence, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$chunkedSequence");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        return StringsKt.windowedSequence(charSequence, i, i, true, function1);
    }

    private static final char elementAtOrElse(CharSequence charSequence, int i, Function1<? super Integer, Character> function1) {
        if (i < 0 || i > StringsKt.getLastIndex(charSequence)) {
            return function1.invoke(Integer.valueOf(i)).charValue();
        }
        return charSequence.charAt(i);
    }

    private static final char getOrElse(CharSequence charSequence, int i, Function1<? super Integer, Character> function1) {
        if (i < 0 || i > StringsKt.getLastIndex(charSequence)) {
            return function1.invoke(Integer.valueOf(i)).charValue();
        }
        return charSequence.charAt(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super java.lang.Character> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M m, Function1<? super Character, ? extends K> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateByTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(function1.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M m, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            Pair pair = (Pair) function1.invoke(Character.valueOf(charSequence.charAt(i)));
            m.put(pair.getFirst(), pair.getSecond());
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super java.lang.Character, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M m, Function1<? super Character, ? extends V> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateWithTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "valueSelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(Character.valueOf(charAt), function1.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C c, Function2<? super Integer, ? super Character, Boolean> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filterIndexedTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(kVar, "predicate");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            int i3 = i2 + 1;
            if (kVar.invoke(Integer.valueOf(i2), Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C c, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filterNotTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (!function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C c, Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$filterTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (function1.invoke(Character.valueOf(charAt)).booleanValue()) {
                c.append(charAt);
            }
        }
        return c;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C c, Function1<? super Character, ? extends Iterable<? extends R>> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$flatMapTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            CollectionsKt.addAll(c, (Iterable) function1.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    public static final <R> R fold(CharSequence charSequence, R r, Function2<? super R, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$fold");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        for (int i = 0; i < charSequence.length(); i++) {
            r = (R) kVar.invoke(r, Character.valueOf(charSequence.charAt(i)));
        }
        return r;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r, Function3<? super Integer, ? super R, ? super Character, ? extends R> oVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$foldIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            r = (R) oVar.invoke(valueOf, r, Character.valueOf(charAt));
        }
        return r;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r, Function2<? super Character, ? super R, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$foldRight");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = (R) kVar.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r, Function3<? super Integer, ? super Character, ? super R, ? extends R> oVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$foldRightIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        for (int lastIndex = StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r = (R) oVar.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r);
        }
        return r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: M extends java.util.Map<? super K, java.util.List<java.lang.Character>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M m, Function1<? super Character, ? extends K> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$groupByTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = function1.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C c, Function2<? super Integer, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapIndexedNotNullTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i2 + 1;
            Object invoke = kVar.invoke(Integer.valueOf(i2), Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
            i++;
            i2 = i3;
        }
        return c;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C c, Function2<? super Integer, ? super Character, ? extends R> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapIndexedTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            Integer valueOf = Integer.valueOf(i);
            i++;
            c.add(kVar.invoke(valueOf, Character.valueOf(charAt)));
        }
        return c;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C c, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapNotNullTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            Object invoke = function1.invoke(Character.valueOf(charSequence.charAt(i)));
            if (invoke != null) {
                c.add(invoke);
            }
        }
        return c;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C c, Function1<? super Character, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$mapTo");
        Intrinsics.checkParameterIsNotNull(c, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(function1.invoke(Character.valueOf(charSequence.charAt(i))));
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> function1, Function1<? super Character, ? extends V> function12) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateBy");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        Intrinsics.checkParameterIsNotNull(function12, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            linkedHashMap.put(function1.invoke(Character.valueOf(charAt)), function12.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> function1, Function1<? super Character, ? extends V> function12) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$groupBy");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        Intrinsics.checkParameterIsNotNull(function12, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = function1.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(function12.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: ? super R */
    public static final <R> List<R> scan(CharSequence charSequence, R r, Function2<? super R, ? super Character, ? extends R> kVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$scan");
        Intrinsics.checkParameterIsNotNull(kVar, "operation");
        int i = 0;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        Object obj = r;
        while (i < charSequence.length()) {
            Object obj2 = (Object) kVar.invoke(obj, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(obj2);
            i++;
            obj = obj2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r6v2. Raw type applied. Possible types: ? super R */
    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r, Function3<? super Integer, ? super R, ? super Character, ? extends R> oVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$scanIndexed");
        Intrinsics.checkParameterIsNotNull(oVar, "operation");
        int i = 0;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return CollectionsKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r);
        int length = charSequence.length();
        Object obj = r;
        while (i < length) {
            Object obj2 = (Object) oVar.invoke(Integer.valueOf(i), obj, Character.valueOf(charSequence.charAt(i)));
            arrayList.add(obj2);
            i++;
            obj = obj2;
        }
        return arrayList;
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence charSequence2, Function2<? super Character, ? super Character, ? extends V> kVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$zip");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        Intrinsics.checkParameterIsNotNull(kVar, "transform");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(kVar.invoke(Character.valueOf(charSequence.charAt(i)), Character.valueOf(charSequence2.charAt(i))));
        }
        return arrayList;
    }

    public static final List<String> windowed(CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$windowed");
        return StringsKt.windowed(charSequence, i, i2, z, C69348e.INSTANCE);
    }

    public static final Sequence<String> windowedSequence(CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$windowedSequence");
        return StringsKt.windowedSequence(charSequence, i, i2, z, C69349f.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M m, Function1<? super Character, ? extends K> function1, Function1<? super Character, ? extends V> function12) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$associateByTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        Intrinsics.checkParameterIsNotNull(function12, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            m.put(function1.invoke(Character.valueOf(charAt)), function12.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: M extends java.util.Map<? super K, java.util.List<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M m, Function1<? super Character, ? extends K> function1, Function1<? super Character, ? extends V> function12) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$groupByTo");
        Intrinsics.checkParameterIsNotNull(m, "destination");
        Intrinsics.checkParameterIsNotNull(function1, "keySelector");
        Intrinsics.checkParameterIsNotNull(function12, "valueTransform");
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Object invoke = function1.invoke(Character.valueOf(charAt));
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(function12.invoke(Character.valueOf(charAt)));
        }
        return m;
    }

    public static final <R> List<R> windowed(CharSequence charSequence, int i, int i2, boolean z, Function1<? super CharSequence, ? extends R> function1) {
        int i3;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$windowed");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        aq.m265695a(i, i2);
        int length = charSequence.length();
        int i4 = length / i2;
        int i5 = 0;
        if (length % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList(i4 + i3);
        while (i5 >= 0 && length > i5) {
            int i6 = i5 + i;
            if (i6 < 0 || i6 > length) {
                if (!z) {
                    break;
                }
                i6 = length;
            }
            arrayList.add(function1.invoke(charSequence.subSequence(i5, i6)));
            i5 += i2;
        }
        return arrayList;
    }

    public static final <R> Sequence<R> windowedSequence(CharSequence charSequence, int i, int i2, boolean z, Function1<? super CharSequence, ? extends R> function1) {
        IntRange kVar;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$windowedSequence");
        Intrinsics.checkParameterIsNotNull(function1, "transform");
        aq.m265695a(i, i2);
        if (z) {
            kVar = StringsKt.getIndices(charSequence);
        } else {
            kVar = RangesKt.until(0, (charSequence.length() - i) + 1);
        }
        return C69294l.m266140e(CollectionsKt.asSequence(RangesKt.step(kVar, i2)), new C69350g(charSequence, i, function1));
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowed(charSequence, i, i2, z);
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowedSequence(charSequence, i, i2, z);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowed(charSequence, i, i2, z, function1);
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.windowedSequence(charSequence, i, i2, z, function1);
    }
}
