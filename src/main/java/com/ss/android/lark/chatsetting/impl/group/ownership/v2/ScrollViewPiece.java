package com.ss.android.lark.chatsetting.impl.group.ownership.v2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.data.DataObserver;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/ScrollViewPiece;", "Lcom/ss/android/lark/piece/core/PieceGroup;", "Landroid/widget/FrameLayout$LayoutParams;", "()V", "isScrollBottomObserver", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/ScrollViewPiece$isScrollBottomObserver$1", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/ScrollViewPiece$isScrollBottomObserver$1;", "buildLayoutParamsForChild", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCreate", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ScrollViewPiece extends PieceGroup<ScrollViewPiece, FrameLayout.LayoutParams> {

    /* renamed from: a */
    private final C34871a f90038a = new C34871a(this, true);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FrameLayout.LayoutParams mo128668b() {
        return new FrameLayout.LayoutParams(-1, -2);
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("is_scroll_bottom", this.f90038a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/ScrollViewPiece$isScrollBottomObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.ScrollViewPiece$a */
    public static final class C34871a extends DataObserver<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ScrollViewPiece f90039a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.ScrollViewPiece$a$a */
        public static final class RunnableC34872a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C34871a f90040a;

            RunnableC34872a(C34871a aVar) {
                this.f90040a = aVar;
            }

            public final void run() {
                View s = this.f90040a.f90039a.mo177205s();
                if (s != null) {
                    ((ScrollView) s).fullScroll(130);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ScrollView");
            }
        }

        /* renamed from: a */
        public void mo127664a(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) true) && this.f90039a.mo177206t() && (this.f90039a.mo177205s() instanceof ScrollView)) {
                this.f90039a.mo177205s().post(new RunnableC34872a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34871a(ScrollViewPiece scrollViewPiece, boolean z) {
            super(z);
            this.f90039a = scrollViewPiece;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        return new ScrollView(context);
    }
}
