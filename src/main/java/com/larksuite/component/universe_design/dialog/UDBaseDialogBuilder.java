package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.drawable.UDRoundDrawable;
import com.larksuite.component.universe_design.radius.UDRadius;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b8\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002:\b\u0002\u0002\u0002\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010É\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0003\u0010Ë\u0001J\u0019\u0010Ì\u0001\u001a\u00028\u00002\b\u0010Í\u0001\u001a\u00030Î\u0001H\u0016¢\u0006\u0003\u0010Ï\u0001J/\u0010Ì\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ð\u0001\u001a\u00020\u00142\u0007\u0010Ñ\u0001\u001a\u00020h2\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0016¢\u0006\u0003\u0010Ó\u0001J1\u0010Ì\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ð\u0001\u001a\u00020\u00142\t\b\u0001\u0010Ô\u0001\u001a\u00020\u00142\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0016¢\u0006\u0003\u0010Õ\u0001J&\u0010Ö\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ð\u0001\u001a\u00020\u00142\n\u0010×\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0016¢\u0006\u0003\u0010Ø\u0001J\u001a\u0010Ù\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010Ü\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0003\u0010Ý\u0001J\u001a\u0010Þ\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u001a\u0010ß\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\b\u0010à\u0001\u001a\u00030á\u0001J\u0018\u0010â\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0003\u0010Ý\u0001J\u0018\u0010ã\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0003\u0010Ý\u0001J\u001a\u0010ä\u0001\u001a\u00028\u00002\t\u0010Ê\u0001\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0003\u0010å\u0001J\u001a\u0010æ\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0016\u0010ç\u0001\u001a\u00028\u00002\u0007\u0010ç\u0001\u001a\u000208¢\u0006\u0003\u0010è\u0001J\u001a\u0010é\u0001\u001a\u00028\u00002\t\u0010Ê\u0001\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0003\u0010å\u0001J\u0018\u0010ê\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010ë\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u001a\u0010ì\u0001\u001a\u00028\u00002\t\u0010Ê\u0001\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0003\u0010å\u0001J\u001a\u0010í\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010î\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020MH\u0016¢\u0006\u0003\u0010ï\u0001J\u001a\u0010ð\u0001\u001a\u00028\u00002\t\u0010ñ\u0001\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0003\u0010ò\u0001J\u0018\u0010ó\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u001a\u0010ô\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020MH\u0016¢\u0006\u0003\u0010ï\u0001J\u0018\u0010õ\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020MH\u0016¢\u0006\u0003\u0010ï\u0001J\u0018\u0010ö\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020bH\u0016¢\u0006\u0003\u0010÷\u0001J\u0018\u0010ø\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020hH\u0016¢\u0006\u0003\u0010ù\u0001J\u001a\u0010ø\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010ú\u0001\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J3\u0010û\u0001\u001a\u00028\u00002\u0007\u0010ü\u0001\u001a\u00020\u00142\u0007\u0010ý\u0001\u001a\u00020\u00142\u0007\u0010þ\u0001\u001a\u00020\u00142\u0007\u0010ÿ\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010\u0002J\u001a\u0010\u0002\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u001b\u0010\u0002\u001a\u00028\u00002\n\u0010Ê\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0003\u0010\u0002J\u001b\u0010\u0002\u001a\u00028\u00002\n\u0010Ê\u0001\u001a\u0005\u0018\u00010\u0001H\u0016¢\u0006\u0003\u0010\u0002J3\u0010\u0002\u001a\u00028\u00002\u0007\u0010ü\u0001\u001a\u00020\u00142\u0007\u0010ý\u0001\u001a\u00020\u00142\u0007\u0010þ\u0001\u001a\u00020\u00142\u0007\u0010ÿ\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010\u0002J\u001a\u0010\u0002\u001a\u00028\u00002\t\u0010Ê\u0001\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0003\u0010å\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\b\u0010\u0002\u001a\u00030á\u0001J\u001a\u0010Ú\u0001\u001a\u00028\u00002\t\b\u0001\u0010Ú\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020hH\u0016¢\u0006\u0003\u0010ù\u0001J\u001a\u0010\u0002\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010\u0002\u001a\u00020\u001aH\u0016¢\u0006\u0003\u0010Ý\u0001J\u001a\u0010\u0002\u001a\u00028\u00002\t\b\u0001\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J3\u0010\u0002\u001a\u00028\u00002\u0007\u0010ü\u0001\u001a\u00020\u00142\u0007\u0010ý\u0001\u001a\u00020\u00142\u0007\u0010þ\u0001\u001a\u00020\u00142\u0007\u0010ÿ\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010\u0002J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0003\u0010Û\u0001J\u0018\u0010\u0002\u001a\u00028\u00002\u0007\u0010Ê\u0001\u001a\u00020MH\u0016¢\u0006\u0003\u0010ï\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010+\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018R\u001c\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u001a\u0010@\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R\u001a\u0010C\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001c\u0010F\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00101\"\u0004\bH\u00103R\u001a\u0010I\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R\u001a\u0010L\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010R\u001a\u0004\u0018\u00010SX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0016\"\u0004\bZ\u0010\u0018R\u001a\u0010[\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR\u001a\u0010^\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010O\"\u0004\b`\u0010QR\u001a\u0010a\u001a\u00020bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010g\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0016\"\u0004\bo\u0010\u0018R\u001a\u0010p\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0016\"\u0004\br\u0010\u0018R\u001a\u0010s\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0016\"\u0004\bu\u0010\u0018R\u001a\u0010v\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0016\"\u0004\bx\u0010\u0018R\u001a\u0010y\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0016\"\u0004\b{\u0010\u0018R\u001a\u0010|\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0016\"\u0004\b~\u0010\u0018R \u0010\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\u001d\u0010\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\u001d\u0010\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\u001d\u0010\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\u001f\u0010\u0001\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00101\"\u0005\b\u0001\u00103R\u001d\u0010\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0016\"\u0005\b\u0001\u0010\u0018R\u000f\u0010 \u0001\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001f\u0010¡\u0001\u001a\u0004\u0018\u00010hX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010j\"\u0005\b£\u0001\u0010lR\u001d\u0010¤\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u0016\"\u0005\b¦\u0001\u0010\u0018R\u001d\u0010§\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\u0016\"\u0005\b©\u0001\u0010\u0018R\u001d\u0010ª\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010\u0016\"\u0005\b¬\u0001\u0010\u0018R\u001d\u0010­\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u0016\"\u0005\b¯\u0001\u0010\u0018R\u001d\u0010°\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010\u0016\"\u0005\b²\u0001\u0010\u0018R\u001d\u0010³\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010\u0016\"\u0005\bµ\u0001\u0010\u0018R\u001d\u0010¶\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010\u0016\"\u0005\b¸\u0001\u0010\u0018R!\u0010¹\u0001\u001a\u00020\u00148\u0000@\u0000X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010\u0016\"\u0005\b»\u0001\u0010\u0018R!\u0010¼\u0001\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0012\n\u0002\u0010*\u001a\u0005\b½\u0001\u0010'\"\u0005\b¾\u0001\u0010)R\u001d\u0010¿\u0001\u001a\u00020\u0014X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010\u0016\"\u0005\bÁ\u0001\u0010\u0018R*\u0010Â\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0005\u0012\u00030Ä\u00010Ã\u00010\tX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010\fR\u001d\u0010Æ\u0001\u001a\u00020MX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010O\"\u0005\bÈ\u0001\u0010Q¨\u0006\u0002"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "T", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mActionButtons", "", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionButtonInfo;", "getMActionButtons$universe_ui_dialog_release", "()Ljava/util/List;", "mActionButtonsOrientation", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;", "getMActionButtonsOrientation$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;", "setMActionButtonsOrientation$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;)V", "mAnimStyle", "", "getMAnimStyle$universe_ui_dialog_release", "()I", "setMAnimStyle$universe_ui_dialog_release", "(I)V", "mAutoDismiss", "", "getMAutoDismiss$universe_ui_dialog_release", "()Z", "setMAutoDismiss$universe_ui_dialog_release", "(Z)V", "mBackground", "Landroid/graphics/drawable/Drawable;", "getMBackground$universe_ui_dialog_release", "()Landroid/graphics/drawable/Drawable;", "setMBackground$universe_ui_dialog_release", "(Landroid/graphics/drawable/Drawable;)V", "mCancelable", "getMCancelable$universe_ui_dialog_release", "()Ljava/lang/Boolean;", "setMCancelable$universe_ui_dialog_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mCanceledOnTouchOutside", "getMCanceledOnTouchOutside$universe_ui_dialog_release", "setMCanceledOnTouchOutside$universe_ui_dialog_release", "mContentLayout", "Landroid/view/View;", "getMContentLayout$universe_ui_dialog_release", "()Landroid/view/View;", "setMContentLayout$universe_ui_dialog_release", "(Landroid/view/View;)V", "mContentLayoutRes", "getMContentLayoutRes$universe_ui_dialog_release", "setMContentLayoutRes$universe_ui_dialog_release", "mController", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "getMController$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "setMController$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDDialogController;)V", "mFooterLayout", "getMFooterLayout$universe_ui_dialog_release", "setMFooterLayout$universe_ui_dialog_release", "mFooterLayoutRes", "getMFooterLayoutRes$universe_ui_dialog_release", "setMFooterLayoutRes$universe_ui_dialog_release", "mGravity", "getMGravity$universe_ui_dialog_release", "setMGravity$universe_ui_dialog_release", "mHeaderLayout", "getMHeaderLayout$universe_ui_dialog_release", "setMHeaderLayout$universe_ui_dialog_release", "mHeaderLayoutRes", "getMHeaderLayoutRes$universe_ui_dialog_release", "setMHeaderLayoutRes$universe_ui_dialog_release", "mHeight", "", "getMHeight$universe_ui_dialog_release", "()F", "setMHeight$universe_ui_dialog_release", "(F)V", "mLifecycleCallback", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "getMLifecycleCallback$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "setMLifecycleCallback$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;)V", "mMarginInDp", "getMMarginInDp$universe_ui_dialog_release", "setMMarginInDp$universe_ui_dialog_release", "mMaskAlpha", "getMMaskAlpha$universe_ui_dialog_release", "setMMaskAlpha$universe_ui_dialog_release", "mMaxHeight", "getMMaxHeight$universe_ui_dialog_release", "setMMaxHeight$universe_ui_dialog_release", "mMaxWidth", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "getMMaxWidth$universe_ui_dialog_release", "()Lcom/larksuite/component/universe_design/dimension/UDDimension;", "setMMaxWidth$universe_ui_dialog_release", "(Lcom/larksuite/component/universe_design/dimension/UDDimension;)V", "mMessage", "", "getMMessage$universe_ui_dialog_release", "()Ljava/lang/CharSequence;", "setMMessage$universe_ui_dialog_release", "(Ljava/lang/CharSequence;)V", "mMessageGravity", "getMMessageGravity$universe_ui_dialog_release", "setMMessageGravity$universe_ui_dialog_release", "mMessagePaddingBottom", "getMMessagePaddingBottom$universe_ui_dialog_release", "setMMessagePaddingBottom$universe_ui_dialog_release", "mMessagePaddingLeft", "getMMessagePaddingLeft$universe_ui_dialog_release", "setMMessagePaddingLeft$universe_ui_dialog_release", "mMessagePaddingRight", "getMMessagePaddingRight$universe_ui_dialog_release", "setMMessagePaddingRight$universe_ui_dialog_release", "mMessagePaddingTop", "getMMessagePaddingTop$universe_ui_dialog_release", "setMMessagePaddingTop$universe_ui_dialog_release", "mMessageSize", "getMMessageSize$universe_ui_dialog_release", "setMMessageSize$universe_ui_dialog_release", "mMessageTextColor", "getMMessageTextColor$universe_ui_dialog_release", "setMMessageTextColor$universe_ui_dialog_release", "mOnCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "getMOnCancelListener$universe_ui_dialog_release", "()Landroid/content/DialogInterface$OnCancelListener;", "setMOnCancelListener$universe_ui_dialog_release", "(Landroid/content/DialogInterface$OnCancelListener;)V", "mOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getMOnDismissListener$universe_ui_dialog_release", "()Landroid/content/DialogInterface$OnDismissListener;", "setMOnDismissListener$universe_ui_dialog_release", "(Landroid/content/DialogInterface$OnDismissListener;)V", "mPaddingBottomInDp", "getMPaddingBottomInDp$universe_ui_dialog_release", "setMPaddingBottomInDp$universe_ui_dialog_release", "mPaddingLeftInDp", "getMPaddingLeftInDp$universe_ui_dialog_release", "setMPaddingLeftInDp$universe_ui_dialog_release", "mPaddingRightInDp", "getMPaddingRightInDp$universe_ui_dialog_release", "setMPaddingRightInDp$universe_ui_dialog_release", "mPaddingTopInDp", "getMPaddingTopInDp$universe_ui_dialog_release", "setMPaddingTopInDp$universe_ui_dialog_release", "mRootLayout", "getMRootLayout$universe_ui_dialog_release", "setMRootLayout$universe_ui_dialog_release", "mRootLayoutRes", "getMRootLayoutRes$universe_ui_dialog_release", "setMRootLayoutRes$universe_ui_dialog_release", "mStyle", "mTitle", "getMTitle$universe_ui_dialog_release", "setMTitle$universe_ui_dialog_release", "mTitleGravity", "getMTitleGravity$universe_ui_dialog_release", "setMTitleGravity$universe_ui_dialog_release", "mTitleLineCount", "getMTitleLineCount$universe_ui_dialog_release", "setMTitleLineCount$universe_ui_dialog_release", "mTitlePaddingBottom", "getMTitlePaddingBottom$universe_ui_dialog_release", "setMTitlePaddingBottom$universe_ui_dialog_release", "mTitlePaddingLeft", "getMTitlePaddingLeft$universe_ui_dialog_release", "setMTitlePaddingLeft$universe_ui_dialog_release", "mTitlePaddingRight", "getMTitlePaddingRight$universe_ui_dialog_release", "setMTitlePaddingRight$universe_ui_dialog_release", "mTitlePaddingTop", "getMTitlePaddingTop$universe_ui_dialog_release", "setMTitlePaddingTop$universe_ui_dialog_release", "mTitleSize", "getMTitleSize$universe_ui_dialog_release", "setMTitleSize$universe_ui_dialog_release", "mTitleTextColor", "getMTitleTextColor$universe_ui_dialog_release", "setMTitleTextColor$universe_ui_dialog_release", "mTitleTextStyleBold", "getMTitleTextStyleBold$universe_ui_dialog_release", "setMTitleTextStyleBold$universe_ui_dialog_release", "mTranslationOnY", "getMTranslationOnY$universe_ui_dialog_release", "setMTranslationOnY$universe_ui_dialog_release", "mViewClickInfos", "Landroid/util/Pair;", "Landroid/content/DialogInterface$OnClickListener;", "getMViewClickInfos$universe_ui_dialog_release", "mWidth", "getMWidth$universe_ui_dialog_release", "setMWidth$universe_ui_dialog_release", "actionButtonOrientation", "value", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "addActionButton", "actionBuilder", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "id", "text", "onClickListener", "(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "textRes", "(IILandroid/content/DialogInterface$OnClickListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "addViewClickListener", "listener", "(ILandroid/content/DialogInterface$OnClickListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "animStyle", "style", "(I)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "autoDismiss", "(Z)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "backgroundColor", "backgroundResource", "build", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "cancelOnTouchOutside", "cancelable", "contentLayout", "(Landroid/view/View;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "contentLayoutRes", "controller", "(Lcom/larksuite/component/universe_design/dialog/UDDialogController;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "footerLayout", "footerLayoutRes", "gravity", "headerLayout", "headerLayoutRes", "height", "(F)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "lifecycleCallback", "callback", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "marginInDp", "maskAlpha", "maxHeight", "maxWidth", "(Lcom/larksuite/component/universe_design/dimension/UDDimension;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "message", "(Ljava/lang/CharSequence;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "messageGravity", "messagePadding", "left", "top", "right", "bottom", "(IIII)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "messageTextColor", "messageTextSize", "onCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "onDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "paddingInDp", "rootLayout", "rootLayoutRes", "show", "title", "titleBold", "bold", "titleColor", "titleGravity", "titleLineCount", "titlePadding", "titleSize", "translationOnY", "width", "ActionBottomOrientation", "ActionBuilder", "ActionButtonInfo", "LifecycleCallback", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class UDBaseDialogBuilder<T extends UDBaseDialogBuilder<? extends T>> {
    private final Context context;
    private final List<ActionButtonInfo> mActionButtons = new ArrayList();
    private ActionBottomOrientation mActionButtonsOrientation = ActionBottomOrientation.HORIZONTAL;
    private int mAnimStyle;
    private boolean mAutoDismiss = true;
    private Drawable mBackground;
    private Boolean mCancelable;
    private Boolean mCanceledOnTouchOutside;
    private View mContentLayout;
    private int mContentLayoutRes;
    private UDDialogController mController;
    private View mFooterLayout;
    private int mFooterLayoutRes;
    private int mGravity = 17;
    private View mHeaderLayout;
    private int mHeaderLayoutRes;
    private float mHeight = ((float) -2);
    private LifecycleCallback mLifecycleCallback;
    private int mMarginInDp;
    private float mMaskAlpha = -1.0f;
    private float mMaxHeight = 1.0f;
    private UDDimension mMaxWidth = new UDDimension.Px(Integer.MAX_VALUE);
    private CharSequence mMessage;
    private int mMessageGravity = 17;
    private int mMessagePaddingBottom = -1;
    private int mMessagePaddingLeft = -1;
    private int mMessagePaddingRight = -1;
    private int mMessagePaddingTop = -1;
    private int mMessageSize = -1;
    private int mMessageTextColor = -1;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private int mPaddingBottomInDp;
    private int mPaddingLeftInDp;
    private int mPaddingRightInDp;
    private int mPaddingTopInDp;
    private View mRootLayout;
    private int mRootLayoutRes;
    private int mStyle;
    private CharSequence mTitle;
    private int mTitleGravity = 17;
    private int mTitleLineCount = 2;
    private int mTitlePaddingBottom = -1;
    private int mTitlePaddingLeft = -1;
    private int mTitlePaddingRight = -1;
    private int mTitlePaddingTop = -1;
    private int mTitleSize = -1;
    private int mTitleTextColor = -1;
    private Boolean mTitleTextStyleBold;
    private int mTranslationOnY;
    private final List<Pair<Integer, DialogInterface.OnClickListener>> mViewClickInfos = new ArrayList();
    private float mWidth = 1.0f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ActionBottomOrientation {
        HORIZONTAL,
        VERTICAL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "", "beforeCreate", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreated", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder$c */
    public interface LifecycleCallback {
        /* renamed from: a */
        void mo89291a(UDDialog uDDialog);

        /* renamed from: b */
        void mo89292b(UDDialog uDDialog);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020*J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006+"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;", "", "()V", "actionLayoutId", "", "getActionLayoutId", "()I", "setActionLayoutId", "(I)V", "actionTextRes", "getActionTextRes", "setActionTextRes", "bgColorRes", "getBgColorRes", "setBgColorRes", "bgDrawableRes", "getBgDrawableRes", "setBgDrawableRes", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "getOnClickListener", "()Landroid/content/DialogInterface$OnClickListener;", "setOnClickListener", "(Landroid/content/DialogInterface$OnClickListener;)V", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textColor", "getTextColor", "setTextColor", "textColorRes", "getTextColorRes", "setTextColorRes", "textSize", "getTextSize", "setTextSize", "actionResId", "value", "build", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionButtonInfo;", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder$a */
    public static class ActionBuilder {

        /* renamed from: a */
        private int f63262a;

        /* renamed from: b */
        private int f63263b;

        /* renamed from: c */
        private CharSequence f63264c;

        /* renamed from: d */
        private int f63265d;

        /* renamed from: e */
        private int f63266e;

        /* renamed from: f */
        private int f63267f;

        /* renamed from: g */
        private int f63268g;

        /* renamed from: h */
        private int f63269h;

        /* renamed from: i */
        private DialogInterface.OnClickListener f63270i;

        /* renamed from: a */
        public final int mo90701a() {
            return this.f63262a;
        }

        /* renamed from: b */
        public final int mo90705b() {
            return this.f63263b;
        }

        /* renamed from: c */
        public final CharSequence mo90708c() {
            return this.f63264c;
        }

        /* renamed from: d */
        public final int mo90709d() {
            return this.f63265d;
        }

        /* renamed from: e */
        public final int mo90711e() {
            return this.f63266e;
        }

        /* renamed from: f */
        public final int mo90713f() {
            return this.f63267f;
        }

        /* renamed from: g */
        public final int mo90715g() {
            return this.f63268g;
        }

        /* renamed from: h */
        public final int mo90717h() {
            return this.f63269h;
        }

        /* renamed from: i */
        public final DialogInterface.OnClickListener mo90718i() {
            return this.f63270i;
        }

        /* renamed from: j */
        public final ActionButtonInfo mo90719j() {
            return new ActionButtonInfo(this);
        }

        /* renamed from: a */
        public final ActionBuilder mo90702a(int i) {
            ActionBuilder aVar = this;
            aVar.f63262a = i;
            return aVar;
        }

        /* renamed from: b */
        public final ActionBuilder mo90706b(int i) {
            ActionBuilder aVar = this;
            aVar.f63263b = i;
            return aVar;
        }

        /* renamed from: c */
        public final ActionBuilder mo90707c(int i) {
            ActionBuilder aVar = this;
            aVar.f63265d = i;
            return aVar;
        }

        /* renamed from: d */
        public final ActionBuilder mo90710d(int i) {
            ActionBuilder aVar = this;
            aVar.f63266e = i;
            return aVar;
        }

        /* renamed from: e */
        public final ActionBuilder mo90712e(int i) {
            ActionBuilder aVar = this;
            aVar.f63267f = i;
            return aVar;
        }

        /* renamed from: f */
        public final ActionBuilder mo90714f(int i) {
            ActionBuilder aVar = this;
            aVar.f63268g = i;
            return aVar;
        }

        /* renamed from: g */
        public final ActionBuilder mo90716g(int i) {
            ActionBuilder aVar = this;
            aVar.f63269h = i;
            return aVar;
        }

        /* renamed from: a */
        public final ActionBuilder mo90703a(DialogInterface.OnClickListener onClickListener) {
            ActionBuilder aVar = this;
            aVar.f63270i = onClickListener;
            return aVar;
        }

        /* renamed from: a */
        public final ActionBuilder mo90704a(CharSequence charSequence) {
            ActionBuilder aVar = this;
            aVar.f63264c = charSequence;
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0016\u0010\u0019\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionButtonInfo;", "", "actionBuilder", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;)V", "bgColorRes", "", "getBgColorRes", "()I", "bgDrawableRes", "getBgDrawableRes", "id", "getId", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "getOnClickListener", "()Landroid/content/DialogInterface$OnClickListener;", "text", "", "getText", "()Ljava/lang/CharSequence;", "textColor", "getTextColor", "textColorRes", "getTextColorRes", "textRes", "getTextRes", "textSize", "getTextSize", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder$b */
    public static final class ActionButtonInfo {

        /* renamed from: a */
        private final int f63271a;

        /* renamed from: b */
        private final int f63272b;

        /* renamed from: c */
        private final CharSequence f63273c;

        /* renamed from: d */
        private final int f63274d;

        /* renamed from: e */
        private final int f63275e;

        /* renamed from: f */
        private final int f63276f;

        /* renamed from: g */
        private final int f63277g;

        /* renamed from: h */
        private final int f63278h;

        /* renamed from: i */
        private final DialogInterface.OnClickListener f63279i;

        /* renamed from: a */
        public final int mo90720a() {
            return this.f63271a;
        }

        /* renamed from: b */
        public final int mo90721b() {
            return this.f63272b;
        }

        /* renamed from: c */
        public final CharSequence mo90722c() {
            return this.f63273c;
        }

        /* renamed from: d */
        public final int mo90723d() {
            return this.f63274d;
        }

        /* renamed from: e */
        public final int mo90724e() {
            return this.f63275e;
        }

        /* renamed from: f */
        public final int mo90725f() {
            return this.f63276f;
        }

        /* renamed from: g */
        public final int mo90726g() {
            return this.f63277g;
        }

        /* renamed from: h */
        public final int mo90727h() {
            return this.f63278h;
        }

        /* renamed from: i */
        public final DialogInterface.OnClickListener mo90728i() {
            return this.f63279i;
        }

        public ActionButtonInfo(ActionBuilder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "actionBuilder");
            this.f63271a = aVar.mo90701a();
            this.f63272b = aVar.mo90705b();
            this.f63273c = aVar.mo90708c();
            this.f63274d = aVar.mo90709d();
            this.f63275e = aVar.mo90711e();
            this.f63276f = aVar.mo90713f();
            this.f63277g = aVar.mo90715g();
            this.f63278h = aVar.mo90717h();
            this.f63279i = aVar.mo90718i();
        }
    }

    /* access modifiers changed from: protected */
    public final Context getContext() {
        return this.context;
    }

    public final List<ActionButtonInfo> getMActionButtons$universe_ui_dialog_release() {
        return this.mActionButtons;
    }

    public final ActionBottomOrientation getMActionButtonsOrientation$universe_ui_dialog_release() {
        return this.mActionButtonsOrientation;
    }

    public final int getMAnimStyle$universe_ui_dialog_release() {
        return this.mAnimStyle;
    }

    public final boolean getMAutoDismiss$universe_ui_dialog_release() {
        return this.mAutoDismiss;
    }

    public final Drawable getMBackground$universe_ui_dialog_release() {
        return this.mBackground;
    }

    public final Boolean getMCancelable$universe_ui_dialog_release() {
        return this.mCancelable;
    }

    public final Boolean getMCanceledOnTouchOutside$universe_ui_dialog_release() {
        return this.mCanceledOnTouchOutside;
    }

    public final View getMContentLayout$universe_ui_dialog_release() {
        return this.mContentLayout;
    }

    public final int getMContentLayoutRes$universe_ui_dialog_release() {
        return this.mContentLayoutRes;
    }

    public final UDDialogController getMController$universe_ui_dialog_release() {
        return this.mController;
    }

    public final View getMFooterLayout$universe_ui_dialog_release() {
        return this.mFooterLayout;
    }

    public final int getMFooterLayoutRes$universe_ui_dialog_release() {
        return this.mFooterLayoutRes;
    }

    public final int getMGravity$universe_ui_dialog_release() {
        return this.mGravity;
    }

    public final View getMHeaderLayout$universe_ui_dialog_release() {
        return this.mHeaderLayout;
    }

    public final int getMHeaderLayoutRes$universe_ui_dialog_release() {
        return this.mHeaderLayoutRes;
    }

    public final float getMHeight$universe_ui_dialog_release() {
        return this.mHeight;
    }

    public final LifecycleCallback getMLifecycleCallback$universe_ui_dialog_release() {
        return this.mLifecycleCallback;
    }

    public final int getMMarginInDp$universe_ui_dialog_release() {
        return this.mMarginInDp;
    }

    public final float getMMaskAlpha$universe_ui_dialog_release() {
        return this.mMaskAlpha;
    }

    public final float getMMaxHeight$universe_ui_dialog_release() {
        return this.mMaxHeight;
    }

    public final UDDimension getMMaxWidth$universe_ui_dialog_release() {
        return this.mMaxWidth;
    }

    public final CharSequence getMMessage$universe_ui_dialog_release() {
        return this.mMessage;
    }

    public final int getMMessageGravity$universe_ui_dialog_release() {
        return this.mMessageGravity;
    }

    public final int getMMessagePaddingBottom$universe_ui_dialog_release() {
        return this.mMessagePaddingBottom;
    }

    public final int getMMessagePaddingLeft$universe_ui_dialog_release() {
        return this.mMessagePaddingLeft;
    }

    public final int getMMessagePaddingRight$universe_ui_dialog_release() {
        return this.mMessagePaddingRight;
    }

    public final int getMMessagePaddingTop$universe_ui_dialog_release() {
        return this.mMessagePaddingTop;
    }

    public final int getMMessageSize$universe_ui_dialog_release() {
        return this.mMessageSize;
    }

    public final int getMMessageTextColor$universe_ui_dialog_release() {
        return this.mMessageTextColor;
    }

    public final DialogInterface.OnCancelListener getMOnCancelListener$universe_ui_dialog_release() {
        return this.mOnCancelListener;
    }

    public final DialogInterface.OnDismissListener getMOnDismissListener$universe_ui_dialog_release() {
        return this.mOnDismissListener;
    }

    public final int getMPaddingBottomInDp$universe_ui_dialog_release() {
        return this.mPaddingBottomInDp;
    }

    public final int getMPaddingLeftInDp$universe_ui_dialog_release() {
        return this.mPaddingLeftInDp;
    }

    public final int getMPaddingRightInDp$universe_ui_dialog_release() {
        return this.mPaddingRightInDp;
    }

    public final int getMPaddingTopInDp$universe_ui_dialog_release() {
        return this.mPaddingTopInDp;
    }

    public final View getMRootLayout$universe_ui_dialog_release() {
        return this.mRootLayout;
    }

    public final int getMRootLayoutRes$universe_ui_dialog_release() {
        return this.mRootLayoutRes;
    }

    public final CharSequence getMTitle$universe_ui_dialog_release() {
        return this.mTitle;
    }

    public final int getMTitleGravity$universe_ui_dialog_release() {
        return this.mTitleGravity;
    }

    public final int getMTitleLineCount$universe_ui_dialog_release() {
        return this.mTitleLineCount;
    }

    public final int getMTitlePaddingBottom$universe_ui_dialog_release() {
        return this.mTitlePaddingBottom;
    }

    public final int getMTitlePaddingLeft$universe_ui_dialog_release() {
        return this.mTitlePaddingLeft;
    }

    public final int getMTitlePaddingRight$universe_ui_dialog_release() {
        return this.mTitlePaddingRight;
    }

    public final int getMTitlePaddingTop$universe_ui_dialog_release() {
        return this.mTitlePaddingTop;
    }

    public final int getMTitleSize$universe_ui_dialog_release() {
        return this.mTitleSize;
    }

    public final int getMTitleTextColor$universe_ui_dialog_release() {
        return this.mTitleTextColor;
    }

    public final Boolean getMTitleTextStyleBold$universe_ui_dialog_release() {
        return this.mTitleTextStyleBold;
    }

    public final int getMTranslationOnY$universe_ui_dialog_release() {
        return this.mTranslationOnY;
    }

    public final List<Pair<Integer, DialogInterface.OnClickListener>> getMViewClickInfos$universe_ui_dialog_release() {
        return this.mViewClickInfos;
    }

    public final float getMWidth$universe_ui_dialog_release() {
        return this.mWidth;
    }

    public final UDDialog show() {
        UDDialog build = build();
        build.show();
        return build;
    }

    public final UDDialog build() {
        UDDialog uDDialog;
        if (this.mStyle != 0) {
            uDDialog = new UDDialog(this.context, this.mStyle);
        } else if (this.mHeight == 1.0f) {
            uDDialog = new UDDialog(this.context, 2131887112);
        } else {
            uDDialog = new UDDialog(this.context);
        }
        if (this.mController == null) {
            this.mController = new UDDialogController(this.context);
        }
        UDDialogController uDDialogController = this.mController;
        if (uDDialogController != null) {
            uDDialogController.apply(this, uDDialog);
        }
        return uDDialog;
    }

    public final void setMAnimStyle$universe_ui_dialog_release(int i) {
        this.mAnimStyle = i;
    }

    public final void setMAutoDismiss$universe_ui_dialog_release(boolean z) {
        this.mAutoDismiss = z;
    }

    public final void setMBackground$universe_ui_dialog_release(Drawable drawable) {
        this.mBackground = drawable;
    }

    public final void setMCancelable$universe_ui_dialog_release(Boolean bool) {
        this.mCancelable = bool;
    }

    public final void setMCanceledOnTouchOutside$universe_ui_dialog_release(Boolean bool) {
        this.mCanceledOnTouchOutside = bool;
    }

    public final void setMContentLayout$universe_ui_dialog_release(View view) {
        this.mContentLayout = view;
    }

    public final void setMContentLayoutRes$universe_ui_dialog_release(int i) {
        this.mContentLayoutRes = i;
    }

    public final void setMController$universe_ui_dialog_release(UDDialogController uDDialogController) {
        this.mController = uDDialogController;
    }

    public final void setMFooterLayout$universe_ui_dialog_release(View view) {
        this.mFooterLayout = view;
    }

    public final void setMFooterLayoutRes$universe_ui_dialog_release(int i) {
        this.mFooterLayoutRes = i;
    }

    public final void setMGravity$universe_ui_dialog_release(int i) {
        this.mGravity = i;
    }

    public final void setMHeaderLayout$universe_ui_dialog_release(View view) {
        this.mHeaderLayout = view;
    }

    public final void setMHeaderLayoutRes$universe_ui_dialog_release(int i) {
        this.mHeaderLayoutRes = i;
    }

    public final void setMHeight$universe_ui_dialog_release(float f) {
        this.mHeight = f;
    }

    public final void setMLifecycleCallback$universe_ui_dialog_release(LifecycleCallback cVar) {
        this.mLifecycleCallback = cVar;
    }

    public final void setMMarginInDp$universe_ui_dialog_release(int i) {
        this.mMarginInDp = i;
    }

    public final void setMMaskAlpha$universe_ui_dialog_release(float f) {
        this.mMaskAlpha = f;
    }

    public final void setMMaxHeight$universe_ui_dialog_release(float f) {
        this.mMaxHeight = f;
    }

    public final void setMMessage$universe_ui_dialog_release(CharSequence charSequence) {
        this.mMessage = charSequence;
    }

    public final void setMMessageGravity$universe_ui_dialog_release(int i) {
        this.mMessageGravity = i;
    }

    public final void setMMessagePaddingBottom$universe_ui_dialog_release(int i) {
        this.mMessagePaddingBottom = i;
    }

    public final void setMMessagePaddingLeft$universe_ui_dialog_release(int i) {
        this.mMessagePaddingLeft = i;
    }

    public final void setMMessagePaddingRight$universe_ui_dialog_release(int i) {
        this.mMessagePaddingRight = i;
    }

    public final void setMMessagePaddingTop$universe_ui_dialog_release(int i) {
        this.mMessagePaddingTop = i;
    }

    public final void setMMessageSize$universe_ui_dialog_release(int i) {
        this.mMessageSize = i;
    }

    public final void setMMessageTextColor$universe_ui_dialog_release(int i) {
        this.mMessageTextColor = i;
    }

    public final void setMOnCancelListener$universe_ui_dialog_release(DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
    }

    public final void setMOnDismissListener$universe_ui_dialog_release(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public final void setMPaddingBottomInDp$universe_ui_dialog_release(int i) {
        this.mPaddingBottomInDp = i;
    }

    public final void setMPaddingLeftInDp$universe_ui_dialog_release(int i) {
        this.mPaddingLeftInDp = i;
    }

    public final void setMPaddingRightInDp$universe_ui_dialog_release(int i) {
        this.mPaddingRightInDp = i;
    }

    public final void setMPaddingTopInDp$universe_ui_dialog_release(int i) {
        this.mPaddingTopInDp = i;
    }

    public final void setMRootLayout$universe_ui_dialog_release(View view) {
        this.mRootLayout = view;
    }

    public final void setMRootLayoutRes$universe_ui_dialog_release(int i) {
        this.mRootLayoutRes = i;
    }

    public final void setMTitle$universe_ui_dialog_release(CharSequence charSequence) {
        this.mTitle = charSequence;
    }

    public final void setMTitleGravity$universe_ui_dialog_release(int i) {
        this.mTitleGravity = i;
    }

    public final void setMTitleLineCount$universe_ui_dialog_release(int i) {
        this.mTitleLineCount = i;
    }

    public final void setMTitlePaddingBottom$universe_ui_dialog_release(int i) {
        this.mTitlePaddingBottom = i;
    }

    public final void setMTitlePaddingLeft$universe_ui_dialog_release(int i) {
        this.mTitlePaddingLeft = i;
    }

    public final void setMTitlePaddingRight$universe_ui_dialog_release(int i) {
        this.mTitlePaddingRight = i;
    }

    public final void setMTitlePaddingTop$universe_ui_dialog_release(int i) {
        this.mTitlePaddingTop = i;
    }

    public final void setMTitleSize$universe_ui_dialog_release(int i) {
        this.mTitleSize = i;
    }

    public final void setMTitleTextColor$universe_ui_dialog_release(int i) {
        this.mTitleTextColor = i;
    }

    public final void setMTitleTextStyleBold$universe_ui_dialog_release(Boolean bool) {
        this.mTitleTextStyleBold = bool;
    }

    public final void setMTranslationOnY$universe_ui_dialog_release(int i) {
        this.mTranslationOnY = i;
    }

    public final void setMWidth$universe_ui_dialog_release(float f) {
        this.mWidth = f;
    }

    public T animStyle(int i) {
        this.mAnimStyle = i;
        return this;
    }

    public T autoDismiss(boolean z) {
        this.mAutoDismiss = z;
        return this;
    }

    public T gravity(int i) {
        this.mGravity = i;
        return this;
    }

    public T height(float f) {
        this.mHeight = f;
        return this;
    }

    public T lifecycleCallback(LifecycleCallback cVar) {
        this.mLifecycleCallback = cVar;
        return this;
    }

    public T marginInDp(int i) {
        this.mMarginInDp = i;
        return this;
    }

    public T maskAlpha(float f) {
        this.mMaskAlpha = f;
        return this;
    }

    public T maxHeight(float f) {
        this.mMaxHeight = f;
        return this;
    }

    public T messageGravity(int i) {
        this.mMessageGravity = i;
        return this;
    }

    public T messageTextColor(int i) {
        this.mMessageTextColor = i;
        return this;
    }

    public T messageTextSize(int i) {
        this.mMessageSize = i;
        return this;
    }

    public T onCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
        return this;
    }

    public T onDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
        return this;
    }

    public final void setMActionButtonsOrientation$universe_ui_dialog_release(ActionBottomOrientation actionBottomOrientation) {
        Intrinsics.checkParameterIsNotNull(actionBottomOrientation, "<set-?>");
        this.mActionButtonsOrientation = actionBottomOrientation;
    }

    public final void setMMaxWidth$universe_ui_dialog_release(UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.mMaxWidth = aVar;
    }

    public T style(int i) {
        this.mStyle = i;
        return this;
    }

    public T titleColor(int i) {
        this.mTitleTextColor = i;
        return this;
    }

    public T titleGravity(int i) {
        this.mTitleGravity = i;
        return this;
    }

    public T titleLineCount(int i) {
        this.mTitleLineCount = i;
        return this;
    }

    public T titleSize(int i) {
        this.mTitleSize = i;
        return this;
    }

    public T translationOnY(int i) {
        this.mTranslationOnY = i;
        return this;
    }

    public T width(float f) {
        this.mWidth = f;
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002 \u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "it", "Landroid/util/Pair;", "", "Landroid/content/DialogInterface$OnClickListener;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder$d */
    static final class C25744d extends Lambda implements Function1<Pair<Integer, DialogInterface.OnClickListener>, Boolean> {
        final /* synthetic */ int $id;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25744d(int i) {
            super(1);
            this.$id = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Pair<Integer, DialogInterface.OnClickListener> pair) {
            return Boolean.valueOf(invoke(pair));
        }

        public final boolean invoke(Pair<Integer, DialogInterface.OnClickListener> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            Integer num = (Integer) pair.first;
            if (num != null && num.intValue() == this.$id) {
                return true;
            }
            return false;
        }
    }

    public T actionButtonOrientation(ActionBottomOrientation actionBottomOrientation) {
        Intrinsics.checkParameterIsNotNull(actionBottomOrientation, "value");
        this.mActionButtonsOrientation = actionBottomOrientation;
        return this;
    }

    public T backgroundResource(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = ContextCompat.getDrawable(this.context, i);
        }
        this.mBackground = drawable;
        return this;
    }

    public T cancelOnTouchOutside(boolean z) {
        this.mCanceledOnTouchOutside = Boolean.valueOf(z);
        return this;
    }

    public T cancelable(boolean z) {
        this.mCancelable = Boolean.valueOf(z);
        return this;
    }

    public T contentLayout(View view) {
        this.mContentLayout = view;
        this.mContentLayoutRes = 0;
        return this;
    }

    public T contentLayoutRes(int i) {
        this.mContentLayoutRes = i;
        this.mContentLayout = null;
        return this;
    }

    public final T controller(UDDialogController uDDialogController) {
        Intrinsics.checkParameterIsNotNull(uDDialogController, "controller");
        this.mController = uDDialogController;
        return this;
    }

    public T footerLayout(View view) {
        this.mFooterLayout = view;
        this.mFooterLayoutRes = 0;
        return this;
    }

    public T footerLayoutRes(int i) {
        this.mFooterLayoutRes = i;
        this.mFooterLayout = null;
        return this;
    }

    public T headerLayout(View view) {
        this.mHeaderLayout = view;
        this.mHeaderLayoutRes = 0;
        return this;
    }

    public T headerLayoutRes(int i) {
        this.mHeaderLayoutRes = i;
        this.mHeaderLayout = null;
        return this;
    }

    public T maxWidth(UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "value");
        this.mMaxWidth = aVar;
        return this;
    }

    public T message(int i) {
        this.mMessage = this.context.getString(i);
        return this;
    }

    public T rootLayout(View view) {
        this.mRootLayout = view;
        this.mRootLayoutRes = 0;
        return this;
    }

    public T rootLayoutRes(int i) {
        this.mRootLayout = null;
        this.mRootLayoutRes = i;
        return this;
    }

    public T title(int i) {
        this.mTitle = this.context.getString(i);
        return this;
    }

    public T titleBold(boolean z) {
        this.mTitleTextStyleBold = Boolean.valueOf(z);
        return this;
    }

    public T message(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        this.mMessage = charSequence;
        return this;
    }

    public T title(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        this.mTitle = charSequence;
        return this;
    }

    public T backgroundColor(int i) {
        UDRoundDrawable aVar;
        if (i == 0) {
            aVar = null;
        } else {
            UDRoundDrawable aVar2 = new UDRoundDrawable();
            aVar2.setColor(ContextCompat.getColor(this.context, i));
            aVar2.setCornerRadius((float) UDRadius.L.getRadiusSize(this.context));
            aVar = aVar2;
        }
        this.mBackground = aVar;
        return this;
    }

    public UDBaseDialogBuilder(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    public T addActionButton(ActionBuilder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "actionBuilder");
        this.mActionButtons.add(aVar.mo90719j());
        return this;
    }

    public T addViewClickListener(int i, DialogInterface.OnClickListener onClickListener) {
        if (onClickListener == null) {
            CollectionsKt.removeAll((List) this.mViewClickInfos, (Function1) new C25744d(i));
        } else {
            this.mViewClickInfos.add(new Pair<>(Integer.valueOf(i), onClickListener));
        }
        return this;
    }

    public T addActionButton(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.mActionButtons.add(new ActionBuilder().mo90702a(i).mo90706b(i2).mo90703a(onClickListener).mo90719j());
        return this;
    }

    public T addActionButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        this.mActionButtons.add(new ActionBuilder().mo90702a(i).mo90704a(charSequence).mo90703a(onClickListener).mo90719j());
        return this;
    }

    public T messagePadding(int i, int i2, int i3, int i4) {
        this.mMessagePaddingLeft = i;
        this.mMessagePaddingTop = i2;
        this.mMessagePaddingRight = i3;
        this.mMessagePaddingBottom = i4;
        return this;
    }

    public T paddingInDp(int i, int i2, int i3, int i4) {
        this.mPaddingLeftInDp = i;
        this.mPaddingTopInDp = i2;
        this.mPaddingRightInDp = i3;
        this.mPaddingBottomInDp = i4;
        return this;
    }

    public T titlePadding(int i, int i2, int i3, int i4) {
        this.mTitlePaddingLeft = i;
        this.mTitlePaddingTop = i2;
        this.mTitlePaddingRight = i3;
        this.mTitlePaddingBottom = i4;
        return this;
    }
}
