package com.ss.android.lark.piece.core;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\fH\u0017J\b\u0010\u000e\u001a\u00020\fH\u0017J\b\u0010\u000f\u001a\u00020\fH\u0017J\b\u0010\u0010\u001a\u00020\fH\u0017J\b\u0010\u0011\u001a\u00020\fH\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "T", "Lcom/ss/android/lark/piece/core/Piece;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry$annotations", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "getLifecycle", "onCreate", "", "onDestroy", "onPause", "onResume", "onStart", "onStop", "piece_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class LifecycleOwnerPiece<T> extends Piece<T> implements LifecycleOwner {

    /* renamed from: a */
    private final LifecycleRegistry f128048a = new LifecycleRegistry(this);

    /* renamed from: c */
    public LifecycleRegistry getLifecycle() {
        return this.f128048a;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onPause() {
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onResume() {
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onStart() {
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onStop() {
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        this.f128048a.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }
}
