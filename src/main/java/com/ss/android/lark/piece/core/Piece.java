package com.ss.android.lark.piece.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.data.PieceViewModel;
import com.ss.android.lark.piece.data.SharedData;
import com.ss.android.lark.piece.p2465b.C51468a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u0001*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001f\u0010?\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00122\b\b\u0001\u0010#\u001a\u00020\u0007¢\u0006\u0002\u0010@J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u0004\u0018\u00010DJ\u001c\u0010E\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u0003H\b¢\u0006\u0002\u0010FJ'\u0010E\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030H¢\u0006\u0002\u0010IJ$\u0010E\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0001\u0010\u0001\u0018\u0001*\u00020\u00032\u0006\u0010J\u001a\u00020\u0007H\b¢\u0006\u0002\u0010KJ/\u0010E\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010J\u001a\u00020\u00072\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030H¢\u0006\u0002\u0010LJ\u0018\u0010M\u001a\u00020\u00122\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH&J#\u0010R\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u00010H¢\u0006\u0002\u0010UJ+\u0010R\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u00010H2\u0006\u0010V\u001a\u00020W¢\u0006\u0002\u0010XJ\u0006\u0010Y\u001a\u00020)J\u0006\u0010Z\u001a\u00020)J\u001d\u0010[\u001a\u00020\u00122\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0010¢\u0006\u0002\b\\J3\u0010]\u001a\u00028\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_2\u0006\u0010b\u001a\u00020_¢\u0006\u0002\u0010cJ3\u0010]\u001a\u00028\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u00072\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007¢\u0006\u0002\u0010dJ\u001e\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u00020\u001e2\u000e\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0 J\"\u0010h\u001a\u00020)2\u0006\u0010i\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u00072\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\b\u0010m\u001a\u00020)H\u0016J\b\u0010n\u001a\u00020BH\u0017J\b\u0010o\u001a\u00020BH\u0017J\b\u0010p\u001a\u00020BH\u0017J\b\u0010q\u001a\u00020BH\u0017J\b\u0010r\u001a\u00020BH\u0017J\b\u0010s\u001a\u00020BH\u0017J\u0010\u0010t\u001a\u00020B2\u0006\u0010u\u001a\u00020vH\u0004J\u0018\u0010w\u001a\u00020B2\u0006\u0010u\u001a\u00020v2\u0006\u0010x\u001a\u00020yH\u0004J\u001e\u0010z\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030H\u0012\u0004\u0012\u00020\u0003\u0018\u00010{H\u0016J\u0006\u0010|\u001a\u00020OJ\u0016\u0010}\u001a\u00020B2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020B0H\u0004J\u0017\u0010\u0001\u001a\u00020B2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020B0H\u0004J\u000f\u0010\u0001\u001a\u00028\u0000H\u0004¢\u0006\u0003\u0010\u0001J\u0018\u0010\u0001\u001a\u00028\u00002\t\b\u0001\u0010\u0001\u001a\u00020\u0007¢\u0006\u0003\u0010\u0001J\u0018\u0010\u0001\u001a\u00028\u00002\t\b\u0001\u0010\u0001\u001a\u00020\u0007¢\u0006\u0003\u0010\u0001J\u0016\u0010&\u001a\u00028\u00002\b\b\u0001\u0010#\u001a\u00020\u0007¢\u0006\u0003\u0010\u0001J\u0017\u0010\u0001\u001a\u00020B2\u0006\u00102\u001a\u000201H\u0010¢\u0006\u0003\b\u0001J\u0011\u0010\u0001\u001a\u00020B2\u0006\u0010j\u001a\u00020\u0007H\u0016J\u0019\u0010\u0001\u001a\u00020B2\u0006\u0010j\u001a\u00020\u00072\u0006\u0010k\u001a\u00020lH\u0016J\u001f\u0010\u0001\u001a\u00028\u00002\u0007\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u0007¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020lH\u0016J\u001a\u0010\u0001\u001a\u00020B2\u0007\u0010\u0001\u001a\u00020l2\u0006\u0010i\u001a\u00020\u0007H\u0016J \u0010\u0001\u001a\u00020B2\u0007\u0010f\u001a\u00030\u00012\u000e\u0010g\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0 J\u0014\u0010=\u001a\u00028\u00002\u0006\u0010=\u001a\u00020\u0007¢\u0006\u0003\u0010\u0001R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR.\u0010\u001b\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0 0\u001f0\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u001a\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020)8DX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\"\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u000101@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u000206X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010>\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/piece/core/Piece;", "T", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "backgroundColor", "", "Ljava/lang/Integer;", "backgroundResId", "bottomMargin", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "setCallbackManager", "(Lcom/larksuite/framework/callback/CallbackManager;)V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "dataObserverMap", "Lkotlin/Lazy;", "", "", "", "Lcom/ss/android/lark/piece/data/DataObserver;", "endMargin", "height", "id", "getId", "()I", "setId", "(I)V", "isActive", "", "()Z", "setActive", "(Z)V", "isContentViewInitialized", "mainHandler", "Landroid/os/Handler;", "<set-?>", "Lcom/ss/android/lark/piece/core/PieceContext;", "pieceContext", "getPieceContext", "()Lcom/ss/android/lark/piece/core/PieceContext;", "sharedData", "Lcom/ss/android/lark/piece/data/SharedData;", "getSharedData", "()Lcom/ss/android/lark/piece/data/SharedData;", "setSharedData", "(Lcom/ss/android/lark/piece/data/SharedData;)V", "startMargin", "topMargin", "visibility", "width", "findViewById", "(I)Landroid/view/View;", "finish", "", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "getPieceExport", "()Lcom/ss/android/lark/piece/core/IPieceExport;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/lark/piece/core/IPieceExport;", "pieceId", "(I)Lcom/ss/android/lark/piece/core/IPieceExport;", "(ILjava/lang/Class;)Lcom/ss/android/lark/piece/core/IPieceExport;", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "getViewModel", "Landroidx/lifecycle/ViewModel;", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModel;", "hasBottomMargin", "hasTopMargin", "initView", "initView$piece_release", "marginDp", "start", "", "top", "end", "bottom", "(Landroid/content/Context;FFFF)Ljava/lang/Object;", "(Landroid/content/Context;IIII)Ljava/lang/Object;", "observeSharedData", "key", "observer", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "onDestroy", "onPause", "onResume", "onStart", "onStop", "post", "runnable", "Ljava/lang/Runnable;", "postDelayed", "delayMillis", "", "providePieceExport", "Lkotlin/Pair;", "requireContext", "runSafely", "block", "Lkotlin/Function0;", "runSafelyOnUI", "self", "()Ljava/lang/Object;", "setBackgroundColor", "color", "(I)Ljava/lang/Object;", "setBackgroundResource", "resId", "setPieceContext", "setPieceContext$piece_release", "setResult", "setSize", "widthPx", "heightPx", "(II)Ljava/lang/Object;", "startActivity", "intent", "startActivityForResult", "unObserveSharedData", "", "Companion", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class Piece<T> implements LifecycleObserver, IPieceExport, CoroutineScope {

    /* renamed from: f */
    public static final Companion f128049f = new Companion(null);

    /* renamed from: a */
    private final CoroutineContext f128050a = Dispatchers.m266324b().plus(cr.m266795a(null, 1, null));

    /* renamed from: b */
    private int f128051b = -1;

    /* renamed from: c */
    public SharedData f128052c;

    /* renamed from: d */
    public PieceContext f128053d;

    /* renamed from: e */
    public View f128054e;

    /* renamed from: g */
    private int f128055g;

    /* renamed from: h */
    private Integer f128056h;

    /* renamed from: i */
    private Integer f128057i;

    /* renamed from: j */
    private Integer f128058j;

    /* renamed from: k */
    private Integer f128059k;

    /* renamed from: l */
    private int f128060l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f128061m = Integer.MIN_VALUE;

    /* renamed from: n */
    private int f128062n = Integer.MIN_VALUE;

    /* renamed from: o */
    private int f128063o = Integer.MIN_VALUE;

    /* renamed from: p */
    private Handler f128064p;

    /* renamed from: q */
    private volatile boolean f128065q;

    /* renamed from: r */
    private CallbackManager f128066r = new CallbackManager();

    /* renamed from: s */
    private final Lazy<Map<Object, List<DataObserver<? extends Object>>>> f128067s = LazyKt.lazy(C51469b.INSTANCE);

    /* renamed from: A */
    public boolean mo177178A() {
        return false;
    }

    /* renamed from: B */
    public Pair<Class<? extends IPieceExport>, IPieceExport> mo177179B() {
        return null;
    }

    /* renamed from: a */
    public abstract View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.f128065q = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final T mo177210x() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/piece/core/Piece$Companion;", "", "()V", "MATCH_CONSTRAINT", "", "MATCH_PARENT", "PARENT_ID", "UNSET", "WRAP_CONTENT", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.core.Piece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f128050a;
    }

    /* renamed from: r */
    public final PieceContext mo177204r() {
        return this.f128053d;
    }

    /* renamed from: u */
    public final int mo177207u() {
        return this.f128051b;
    }

    /* renamed from: v */
    public final boolean mo177208v() {
        return this.f128065q;
    }

    /* renamed from: w */
    public final CallbackManager mo177209w() {
        return this.f128066r;
    }

    /* renamed from: a */
    public final void mo177192a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        if (this.f128065q) {
            function0.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "Lcom/ss/android/lark/piece/data/DataObserver;", "T", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.core.Piece$b */
    static final class C51469b extends Lambda implements Function0<Map<Object, List<DataObserver<? extends Object>>>> {
        public static final C51469b INSTANCE = new C51469b();

        C51469b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<Object, List<DataObserver<? extends Object>>> invoke() {
            return new LinkedHashMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.piece.core.Piece$c */
    static final class RunnableC51470c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Piece f128068a;

        /* renamed from: b */
        final /* synthetic */ Function0 f128069b;

        RunnableC51470c(Piece piece, Function0 function0) {
            this.f128068a = piece;
            this.f128069b = function0;
        }

        public final void run() {
            if (this.f128068a.mo177208v()) {
                this.f128069b.invoke();
            }
        }
    }

    /* renamed from: D */
    public final boolean mo177181D() {
        if (this.f128061m <= 0 || this.f128055g == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean mo177182E() {
        if (this.f128060l <= 0 || this.f128055g == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final SharedData mo177203q() {
        SharedData cVar = this.f128052c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedData");
        }
        return cVar;
    }

    /* renamed from: s */
    public final View mo177205s() {
        View view = this.f128054e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentView");
        }
        return view;
    }

    /* renamed from: t */
    public final boolean mo177206t() {
        if (this.f128054e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final FragmentManager mo177211y() {
        PieceContext bVar = this.f128053d;
        if (bVar != null) {
            return bVar.mo177226b();
        }
        return null;
    }

    /* renamed from: C */
    public final Context mo177180C() {
        Context c;
        PieceContext bVar = this.f128053d;
        if (bVar != null && (c = bVar.mo177227c()) != null) {
            return c;
        }
        throw new IllegalStateException("this method can only be called between onCreate() and onDestroy()");
    }

    /* renamed from: z */
    public void mo177212z() {
        Context context;
        PieceContext bVar = this.f128053d;
        Activity activity = null;
        if (bVar != null) {
            context = bVar.mo177227c();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C69364ai.m266267a(this, null, 1, null);
        Handler handler = this.f128064p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f128066r.cancelCallbacks();
        if (this.f128067s.isInitialized()) {
            for (Map.Entry<Object, List<DataObserver<? extends Object>>> entry : this.f128067s.getValue().entrySet()) {
                Object key = entry.getKey();
                for (DataObserver<? extends Object> aVar : entry.getValue()) {
                    SharedData cVar = this.f128052c;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sharedData");
                    }
                    cVar.mo177170b(key, aVar);
                }
            }
        }
        this.f128067s.getValue().clear();
        this.f128065q = false;
        this.f128053d = null;
    }

    /* renamed from: a */
    public final void mo177188a(SharedData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
        this.f128052c = cVar;
    }

    /* renamed from: a */
    public void mo177189a(PieceContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "pieceContext");
        this.f128053d = bVar;
    }

    /* renamed from: b */
    public final T mo177194b(int i) {
        this.f128055g = i;
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            view.setVisibility(i);
        }
        return mo177210x();
    }

    /* renamed from: c */
    public final T mo177198c(int i) {
        this.f128051b = i;
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            view.setId(i);
        }
        return mo177210x();
    }

    /* renamed from: d */
    public final T mo177199d(int i) {
        this.f128056h = Integer.valueOf(i);
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            view.setBackgroundResource(i);
        }
        return mo177210x();
    }

    /* renamed from: e */
    public final T mo177200e(int i) {
        this.f128057i = Integer.valueOf(i);
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            view.setBackgroundColor(i);
        }
        return mo177210x();
    }

    /* renamed from: f */
    public final <T extends View> T mo177201f(int i) {
        View view = this.f128054e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentView");
        }
        T t = (T) view.findViewById(i);
        Intrinsics.checkExpressionValueIsNotNull(t, "contentView.findViewById(id)");
        return t;
    }

    /* renamed from: g */
    public void mo177202g(int i) {
        Context context;
        PieceContext bVar = this.f128053d;
        Activity activity = null;
        if (bVar != null) {
            context = bVar.mo177227c();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.setResult(i);
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC1142af> T mo177183a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        PieceContext bVar = this.f128053d;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        T t = (T) new C1144ai(bVar.mo177220a()).mo6005a(cls);
        Intrinsics.checkExpressionValueIsNotNull(t, "ViewModelProvider(pieceC…oreOwner).get(modelClass)");
        if (t instanceof PieceViewModel) {
            T t2 = t;
            SharedData cVar = this.f128052c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedData");
            }
            t2.setSharedData(cVar);
            t2.setPieceContext(this.f128053d);
        }
        return t;
    }

    /* renamed from: b */
    public final void mo177197b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "block");
        if (this.f128065q) {
            mo177191a(new RunnableC51470c(this, function0));
        }
    }

    /* renamed from: a */
    public void mo177186a(Intent intent) {
        Fragment d;
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        PieceContext bVar = this.f128053d;
        if (bVar != null && (d = bVar.mo177228d()) != null) {
            d.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo177191a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        if (this.f128064p == null) {
            this.f128064p = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.f128064p;
        if (handler == null) {
            Intrinsics.throwNpe();
        }
        handler.post(runnable);
    }

    /* renamed from: a */
    public void mo177185a(int i, Intent intent) {
        Context context;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PieceContext bVar = this.f128053d;
        Activity activity = null;
        if (bVar != null) {
            context = bVar.mo177227c();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.setResult(i, intent);
        }
    }

    /* renamed from: a */
    public final T mo177184a(int i, int i2) {
        this.f128058j = Integer.valueOf(i);
        this.f128059k = Integer.valueOf(i2);
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
            }
        }
        return mo177210x();
    }

    /* renamed from: b */
    public View mo177193b(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        if (!mo177206t()) {
            this.f128054e = mo127619a(context, marginLayoutParams);
        }
        View view = this.f128054e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentView");
        }
        Integer num = this.f128058j;
        if (!(num == null || this.f128059k == null)) {
            if (num == null) {
                Intrinsics.throwNpe();
            }
            marginLayoutParams.width = num.intValue();
            Integer num2 = this.f128059k;
            if (num2 == null) {
                Intrinsics.throwNpe();
            }
            marginLayoutParams.height = num2.intValue();
        }
        int i = this.f128060l;
        if (i != Integer.MIN_VALUE) {
            marginLayoutParams.topMargin = i;
        }
        int i2 = this.f128061m;
        if (i2 != Integer.MIN_VALUE) {
            marginLayoutParams.bottomMargin = i2;
        }
        int i3 = this.f128062n;
        if (i3 != Integer.MIN_VALUE) {
            marginLayoutParams.setMarginStart(i3);
        }
        int i4 = this.f128063o;
        if (i4 != Integer.MIN_VALUE) {
            marginLayoutParams.setMarginEnd(i4);
        }
        Integer num3 = this.f128056h;
        if (num3 != null) {
            view.setBackgroundResource(num3.intValue());
        }
        Integer num4 = this.f128057i;
        if (num4 != null) {
            view.setBackgroundColor(num4.intValue());
        }
        view.setVisibility(this.f128055g);
        if (this.f128051b != -1) {
            View view2 = this.f128054e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            view2.setId(this.f128051b);
        }
        View view3 = this.f128054e;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentView");
        }
        return view3;
    }

    /* renamed from: a */
    public void mo177187a(Intent intent, int i) {
        Fragment d;
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        PieceContext bVar = this.f128053d;
        if (bVar != null && (d = bVar.mo177228d()) != null) {
            d.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public final void mo177190a(Object obj, DataObserver<? extends Object> aVar) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        ArrayList arrayList = this.f128067s.getValue().get(obj);
        if (arrayList == null || !arrayList.contains(aVar)) {
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f128067s.getValue().put(obj, arrayList);
            }
            arrayList.add(aVar);
            SharedData cVar = this.f128052c;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedData");
            }
            cVar.mo177167a(obj, aVar);
        }
    }

    /* renamed from: b */
    public final T mo177196b(Context context, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return mo177195b(context, (float) i, (float) i2, (float) i3, (float) i4);
    }

    /* renamed from: b */
    public final T mo177195b(Context context, float f, float f2, float f3, float f4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f128062n = C51468a.m199485a(f, context);
        this.f128060l = C51468a.m199485a(f2, context);
        this.f128063o = C51468a.m199485a(f3, context);
        this.f128061m = C51468a.m199485a(f4, context);
        if (mo177206t()) {
            View view = this.f128054e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contentView");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(this.f128062n);
                marginLayoutParams.topMargin = this.f128060l;
                marginLayoutParams.setMarginEnd(this.f128063o);
                marginLayoutParams.bottomMargin = this.f128061m;
                view.setLayoutParams(layoutParams);
            }
        }
        return mo177210x();
    }
}
