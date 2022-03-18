package com.ss.android.lark.piece.core;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0012J\u001c\u0010#\u001a\u0004\u0018\u0001H$\"\n\b\u0000\u0010$\u0018\u0001*\u00020\u0012H\b¢\u0006\u0002\u0010%J'\u0010#\u001a\u0004\u0018\u0001H$\"\b\b\u0000\u0010$*\u00020\u00122\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010&J$\u0010#\u001a\u0004\u0018\u0001H$\"\n\b\u0000\u0010$\u0018\u0001*\u00020\u00122\u0006\u0010!\u001a\u00020\u0013H\b¢\u0006\u0002\u0010'J/\u0010#\u001a\u0004\u0018\u0001H$\"\b\b\u0000\u0010$*\u00020\u00122\u0006\u0010!\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011¢\u0006\u0002\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR1\u0010\u000f\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00120\u00100\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/ss/android/lark/piece/core/PieceContext;", "", "context", "Landroid/content/Context;", "pieceManagerFragment", "Landroidx/fragment/app/Fragment;", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V", "getContext", "()Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "pieceExportMap", "", "Ljava/lang/Class;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "", "getPieceExportMap", "()Ljava/util/Map;", "getPieceManagerFragment", "()Landroidx/fragment/app/Fragment;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "addPieceExport", "", "clazz", "pieceId", "instance", "getPieceExport", "T", "()Lcom/ss/android/lark/piece/core/IPieceExport;", "(Ljava/lang/Class;)Lcom/ss/android/lark/piece/core/IPieceExport;", "(I)Lcom/ss/android/lark/piece/core/IPieceExport;", "(ILjava/lang/Class;)Lcom/ss/android/lark/piece/core/IPieceExport;", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.piece.core.b */
public final class PieceContext {

    /* renamed from: a */
    public ViewModelStoreOwner f128072a;

    /* renamed from: b */
    public FragmentManager f128073b;

    /* renamed from: c */
    private final Map<Class<? extends IPieceExport>, Map<Integer, IPieceExport>> f128074c = new LinkedHashMap();

    /* renamed from: d */
    private final Context f128075d;

    /* renamed from: e */
    private final Fragment f128076e;

    /* renamed from: c */
    public final Context mo177227c() {
        return this.f128075d;
    }

    /* renamed from: d */
    public final Fragment mo177228d() {
        return this.f128076e;
    }

    /* renamed from: a */
    public final ViewModelStoreOwner mo177220a() {
        ViewModelStoreOwner viewModelStoreOwner = this.f128072a;
        if (viewModelStoreOwner == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelStoreOwner");
        }
        return viewModelStoreOwner;
    }

    /* renamed from: b */
    public final FragmentManager mo177226b() {
        FragmentManager fragmentManager = this.f128073b;
        if (fragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
        }
        return fragmentManager;
    }

    /* renamed from: a */
    public final void mo177223a(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "<set-?>");
        this.f128073b = fragmentManager;
    }

    /* renamed from: a */
    public final void mo177224a(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkParameterIsNotNull(viewModelStoreOwner, "<set-?>");
        this.f128072a = viewModelStoreOwner;
    }

    /* renamed from: a */
    public final <T extends IPieceExport> T mo177222a(Class<? extends IPieceExport> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Map<Integer, IPieceExport> map = this.f128074c.get(cls);
        if (map == null || map.values().isEmpty()) {
            return null;
        }
        T t = (T) map.get(-1);
        if (t == null) {
            t = (T) ((IPieceExport) CollectionsKt.first(map.values()));
        }
        if (!(t instanceof IPieceExport)) {
            return null;
        }
        return t;
    }

    public PieceContext(Context context, Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragment, "pieceManagerFragment");
        this.f128075d = context;
        this.f128076e = fragment;
    }

    /* renamed from: a */
    public final <T extends IPieceExport> T mo177221a(int i, Class<? extends IPieceExport> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Map<Integer, IPieceExport> map = this.f128074c.get(cls);
        IPieceExport aVar = null;
        if (map == null) {
            return null;
        }
        IPieceExport aVar2 = map.get(Integer.valueOf(i));
        if (aVar2 instanceof IPieceExport) {
            aVar = aVar2;
        }
        return (T) aVar;
    }

    /* renamed from: a */
    public final void mo177225a(Class<? extends IPieceExport> cls, int i, IPieceExport aVar) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(aVar, "instance");
        LinkedHashMap linkedHashMap = this.f128074c.get(cls);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(Integer.valueOf(i), aVar);
        this.f128074c.put(cls, linkedHashMap);
    }
}
