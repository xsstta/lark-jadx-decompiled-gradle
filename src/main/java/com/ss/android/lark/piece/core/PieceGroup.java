package com.ss.android.lark.piece.core;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J+\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000f\u001a\u00028\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012J#\u0010\r\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0013J7\u0010\u0014\u001a\u00028\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000f\u001a\u00028\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0017J/\u0010\u0014\u001a\u00028\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0018J3\u0010\u0019\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00028\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u001cJ+\u0010\u0019\u001a\u00028\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u001dJ7\u0010\u001e\u001a\u00028\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000f\u001a\u00028\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0017J/\u0010\u001e\u001a\u00028\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0018J\r\u0010\u001f\u001a\u00028\u0001H$¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u001c\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J,\u0010)\u001a\u0004\u0018\u0001H\u0001\"\u0010\b\u0002\u0010\u0001\u0018\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\b2\b\b\u0001\u0010*\u001a\u00020\u001bH\b¢\u0006\u0002\u0010+J5\u0010)\u001a\u0004\u0018\u0001H\u0001\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\b2\b\b\u0001\u0010*\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00010-¢\u0006\u0002\u0010.J\u001d\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u0003H\u0000¢\u0006\u0002\b0J\"\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u000105H\u0017J\b\u00106\u001a\u00020\u0011H\u0016J\u0012\u00107\u001a\u00020&2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\bJ\u0015\u00108\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0010¢\u0006\u0002\b9R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00030\fX\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/piece/core/PieceGroup;", "T", "LP", "Landroid/view/ViewGroup$MarginLayoutParams;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "()V", "childPieceList", "", "Lcom/ss/android/lark/piece/core/Piece;", "getChildPieceList", "()Ljava/util/List;", "pieceLayoutParamsMap", "", "addPiece", "piece", "layoutConfig", "condition", "", "(Lcom/ss/android/lark/piece/core/Piece;Landroid/view/ViewGroup$MarginLayoutParams;Z)Ljava/lang/Object;", "(Lcom/ss/android/lark/piece/core/Piece;Z)Ljava/lang/Object;", "addPieceAfter", "existedPiece", "newPiece", "(Lcom/ss/android/lark/piece/core/Piece;Lcom/ss/android/lark/piece/core/Piece;Landroid/view/ViewGroup$MarginLayoutParams;Z)Ljava/lang/Object;", "(Lcom/ss/android/lark/piece/core/Piece;Lcom/ss/android/lark/piece/core/Piece;Z)Ljava/lang/Object;", "addPieceAtIndex", "index", "", "(Lcom/ss/android/lark/piece/core/Piece;ILandroid/view/ViewGroup$MarginLayoutParams;Z)Ljava/lang/Object;", "(Lcom/ss/android/lark/piece/core/Piece;IZ)Ljava/lang/Object;", "addPieceBefore", "buildLayoutParamsForChild", "()Landroid/view/ViewGroup$MarginLayoutParams;", "buildView", "Landroid/view/View;", "context", "Landroid/content/Context;", "configPiece", "", "pieceContext", "Lcom/ss/android/lark/piece/core/PieceContext;", "getPieceById", "id", "(I)Lcom/ss/android/lark/piece/core/Piece;", "pieceClass", "Ljava/lang/Class;", "(ILjava/lang/Class;)Lcom/ss/android/lark/piece/core/Piece;", "initView", "initView$piece_release", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "removePiece", "setPieceContext", "setPieceContext$piece_release", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class PieceGroup<T, LP extends ViewGroup.MarginLayoutParams> extends LifecycleOwnerPiece<T> {

    /* renamed from: a */
    private final List<Piece<?>> f128070a = new ArrayList();

    /* renamed from: b */
    private final Map<Piece<?>, ViewGroup.MarginLayoutParams> f128071b = new LinkedHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract LP mo128668b();

    /* renamed from: d */
    public final List<Piece<?>> mo177219d() {
        return this.f128070a;
    }

    /* renamed from: a */
    public final T mo177218a(Piece<?> piece, boolean z) {
        Intrinsics.checkParameterIsNotNull(piece, "piece");
        return !z ? mo177210x() : (T) m199534a(this, piece, mo128668b(), false, 4, null);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public void mo177189a(PieceContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "pieceContext");
        super.mo177189a(bVar);
        for (T t : this.f128070a) {
            m199536a(bVar, (Piece<?>) t);
            getLifecycle().addObserver(t);
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Iterator<T> it = this.f128070a.iterator();
        while (it.hasNext()) {
            if (it.next().mo128689a(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: A */
    public boolean mo177178A() {
        Iterator<T> it = this.f128070a.iterator();
        while (it.hasNext()) {
            if (it.next().mo177178A()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final View mo177214a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return mo177193b(context, mo128668b());
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: b */
    public final View mo177193b(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        super.mo177193b(context, marginLayoutParams);
        View s = mo177205s();
        if (s != null) {
            ViewGroup viewGroup = (ViewGroup) s;
            for (Piece<?> piece : this.f128070a) {
                ViewGroup.MarginLayoutParams remove = this.f128071b.remove(piece);
                if (remove == null) {
                    remove = mo128668b();
                }
                piece.mo177193b(context, remove);
                piece.mo177205s().setLayoutParams(remove);
                viewGroup.addView(piece.mo177205s());
            }
            return viewGroup;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    private final void m199536a(PieceContext bVar, Piece<?> piece) {
        piece.mo177188a(mo177203q());
        piece.mo177189a(bVar);
        Pair<Class<? extends IPieceExport>, IPieceExport> B = piece.mo177179B();
        if (B != null) {
            bVar.mo177225a(B.getFirst(), piece.mo177207u(), B.getSecond());
        }
    }

    /* renamed from: a */
    public final <T extends Piece<?>> T mo177215a(int i, Class<T> cls) {
        T t;
        Intrinsics.checkParameterIsNotNull(cls, "pieceClass");
        Iterator<Piece<?>> it = this.f128070a.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (t2.mo177207u() != -1 && t2.mo177207u() == i && Intrinsics.areEqual(t2.getClass(), cls)) {
                return t2;
            }
            if ((t2 instanceof PieceGroup) && (t = (T) t2.mo177215a(i, cls)) != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final T mo177217a(Piece<?> piece, LP lp, boolean z) {
        Intrinsics.checkParameterIsNotNull(piece, "piece");
        Intrinsics.checkParameterIsNotNull(lp, "layoutConfig");
        return !z ? mo177210x() : (T) m199533a(this, piece, this.f128070a.size(), lp, false, 8, null);
    }

    /* renamed from: a */
    public final T mo177216a(Piece<?> piece, int i, LP lp, boolean z) {
        Intrinsics.checkParameterIsNotNull(piece, "piece");
        Intrinsics.checkParameterIsNotNull(lp, "layoutConfig");
        if (!z) {
            return mo177210x();
        }
        PieceContext r = mo177204r();
        if (r != null) {
            m199536a(r, piece);
        }
        if (mo177206t()) {
            View s = mo177205s();
            if (s != null) {
                ViewGroup viewGroup = (ViewGroup) s;
                Context context = viewGroup.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
                piece.mo177193b(context, lp);
                piece.mo177205s().setLayoutParams(lp);
                if (i < 0 || i > this.f128070a.size()) {
                    viewGroup.addView(piece.mo177205s());
                } else {
                    viewGroup.addView(piece.mo177205s(), i);
                }
                if (mo177208v()) {
                    getLifecycle().addObserver(piece);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        } else {
            this.f128071b.put(piece, lp);
        }
        if (i < 0 || i > this.f128070a.size()) {
            this.f128070a.add(piece);
        } else {
            this.f128070a.add(i, piece);
        }
        return mo177210x();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m199535a(PieceGroup pieceGroup, Piece piece, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return pieceGroup.mo177218a(piece, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPiece");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m199534a(PieceGroup pieceGroup, Piece piece, ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            return pieceGroup.mo177217a(piece, marginLayoutParams, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPiece");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m199533a(PieceGroup pieceGroup, Piece piece, int i, ViewGroup.MarginLayoutParams marginLayoutParams, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            return pieceGroup.mo177216a(piece, i, marginLayoutParams, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPieceAtIndex");
    }
}
