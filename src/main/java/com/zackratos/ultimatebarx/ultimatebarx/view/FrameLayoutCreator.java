package com.zackratos.ultimatebarx.ultimatebarx.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.zackratos.ultimatebarx.ultimatebarx.C68087b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/FrameLayoutCreator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/BaseCreator;", "frameLayout", "Landroid/widget/FrameLayout;", "tag", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "landscape", "", "(Landroid/widget/FrameLayout;Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;Z)V", "getNavigationBarView", "Landroid/view/View;", "context", "Landroid/content/Context;", "fitWindow", "getStatusBarView", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.e */
public final class FrameLayoutCreator extends BaseCreator {

    /* renamed from: a */
    private final FrameLayout f171353a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/zackratos/ultimatebarx/ultimatebarx/view/FrameLayoutCreator$getStatusBarView$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.e$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC68105b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f171357a;

        /* renamed from: b */
        final /* synthetic */ boolean f171358b;

        public void onGlobalLayout() {
            int i;
            T t = this.f171357a.element;
            ViewGroup.LayoutParams layoutParams = this.f171357a.element.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f171358b) {
                    i = -C68087b.m264633a();
                } else {
                    i = 0;
                }
                layoutParams2.topMargin = i;
                t.setLayoutParams(layoutParams2);
                this.f171357a.element.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        ViewTreeObserver$OnGlobalLayoutListenerC68105b(Ref.ObjectRef objectRef, boolean z) {
            this.f171357a = objectRef;
            this.f171358b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/zackratos/ultimatebarx/ultimatebarx/view/FrameLayoutCreator$getNavigationBarView$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.e$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC68104a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayoutCreator f171354a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f171355b;

        /* renamed from: c */
        final /* synthetic */ boolean f171356c;

        public void onGlobalLayout() {
            T t = this.f171355b.element;
            ViewGroup.LayoutParams layoutParams = this.f171355b.element.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i = 0;
                if (this.f171354a.mo237017b()) {
                    if (this.f171356c) {
                        i = -C68087b.m264634b();
                    }
                    layoutParams2.rightMargin = i;
                } else {
                    if (this.f171356c) {
                        i = -C68087b.m264634b();
                    }
                    layoutParams2.bottomMargin = i;
                }
                t.setLayoutParams(layoutParams2);
                this.f171355b.element.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        ViewTreeObserver$OnGlobalLayoutListenerC68104a(FrameLayoutCreator eVar, Ref.ObjectRef objectRef, boolean z) {
            this.f171354a = eVar;
            this.f171355b = objectRef;
            this.f171356c = z;
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Creator
    /* renamed from: a */
    public View mo237018a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f171353a.findViewWithTag(mo237016a().mo237012a());
        if (objectRef.element == null) {
            T t = (T) new View(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C68087b.m264633a());
            layoutParams.gravity = 48;
            t.setLayoutParams(layoutParams);
            objectRef.element = t;
            objectRef.element.setTag(mo237016a().mo237012a());
            this.f171353a.addView(objectRef.element);
        }
        objectRef.element.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC68105b(objectRef, z));
        return objectRef.element;
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Creator
    /* renamed from: b */
    public View mo237019b(Context context, boolean z) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f171353a.findViewWithTag(mo237016a().mo237013b());
        int i3 = -1;
        if (mo237017b()) {
            i = 5;
            i3 = C68087b.m264634b();
            i2 = -1;
        } else {
            i2 = C68087b.m264634b();
            i = 80;
        }
        if (objectRef.element == null) {
            T t = (T) new View(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i2);
            layoutParams.gravity = i;
            t.setLayoutParams(layoutParams);
            objectRef.element = t;
            objectRef.element.setTag(mo237016a().mo237013b());
            this.f171353a.addView(objectRef.element);
        }
        objectRef.element.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC68104a(this, objectRef, z));
        return objectRef.element;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameLayoutCreator(FrameLayout frameLayout, Tag gVar, boolean z) {
        super(gVar, z);
        Intrinsics.checkParameterIsNotNull(frameLayout, "frameLayout");
        Intrinsics.checkParameterIsNotNull(gVar, "tag");
        this.f171353a = frameLayout;
    }
}
