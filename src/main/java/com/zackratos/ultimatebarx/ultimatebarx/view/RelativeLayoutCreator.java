package com.zackratos.ultimatebarx.ultimatebarx.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.zackratos.ultimatebarx.ultimatebarx.C68087b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/view/RelativeLayoutCreator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/BaseCreator;", "relativeLayout", "Landroid/widget/RelativeLayout;", "tag", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "landscape", "", "(Landroid/widget/RelativeLayout;Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;Z)V", "getNavigationBarView", "Landroid/view/View;", "context", "Landroid/content/Context;", "fitWindow", "getStatusBarView", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.f */
public final class RelativeLayoutCreator extends BaseCreator {

    /* renamed from: a */
    private final RelativeLayout f171359a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/zackratos/ultimatebarx/ultimatebarx/view/RelativeLayoutCreator$getStatusBarView$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.f$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC68107b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f171363a;

        /* renamed from: b */
        final /* synthetic */ boolean f171364b;

        public void onGlobalLayout() {
            int i;
            T t = this.f171363a.element;
            ViewGroup.LayoutParams layoutParams = this.f171363a.element.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (this.f171364b) {
                    i = -C68087b.m264633a();
                } else {
                    i = 0;
                }
                layoutParams2.topMargin = i;
                t.setLayoutParams(layoutParams2);
                this.f171363a.element.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }

        ViewTreeObserver$OnGlobalLayoutListenerC68107b(Ref.ObjectRef objectRef, boolean z) {
            this.f171363a = objectRef;
            this.f171364b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/zackratos/ultimatebarx/ultimatebarx/view/RelativeLayoutCreator$getNavigationBarView$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.f.f$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC68106a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ RelativeLayoutCreator f171360a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f171361b;

        /* renamed from: c */
        final /* synthetic */ boolean f171362c;

        public void onGlobalLayout() {
            T t = this.f171361b.element;
            ViewGroup.LayoutParams layoutParams = this.f171361b.element.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int i = 0;
                if (this.f171360a.mo237017b()) {
                    if (this.f171362c) {
                        i = -C68087b.m264634b();
                    }
                    layoutParams2.rightMargin = i;
                } else {
                    if (this.f171362c) {
                        i = -C68087b.m264634b();
                    }
                    layoutParams2.bottomMargin = i;
                }
                t.setLayoutParams(layoutParams2);
                this.f171361b.element.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }

        ViewTreeObserver$OnGlobalLayoutListenerC68106a(RelativeLayoutCreator fVar, Ref.ObjectRef objectRef, boolean z) {
            this.f171360a = fVar;
            this.f171361b = objectRef;
            this.f171362c = z;
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Creator
    /* renamed from: a */
    public View mo237018a(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f171359a.findViewWithTag(mo237016a().mo237012a());
        if (objectRef.element == null) {
            T t = (T) new View(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C68087b.m264633a());
            layoutParams.addRule(10);
            t.setLayoutParams(layoutParams);
            objectRef.element = t;
            objectRef.element.setTag(mo237016a().mo237012a());
            this.f171359a.addView(objectRef.element);
        }
        objectRef.element.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC68107b(objectRef, z));
        return objectRef.element;
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.view.Creator
    /* renamed from: b */
    public View mo237019b(Context context, boolean z) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f171359a.findViewWithTag(mo237016a().mo237013b());
        int i3 = -1;
        if (mo237017b()) {
            i = 11;
            i3 = C68087b.m264634b();
            i2 = -1;
        } else {
            i2 = C68087b.m264634b();
            i = 12;
        }
        if (objectRef.element == null) {
            T t = (T) new View(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i2);
            layoutParams.addRule(i);
            t.setLayoutParams(layoutParams);
            objectRef.element = t;
            objectRef.element.setTag(mo237016a().mo237013b());
            this.f171359a.addView(objectRef.element);
        }
        objectRef.element.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC68106a(this, objectRef, z));
        return objectRef.element;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelativeLayoutCreator(RelativeLayout relativeLayout, Tag gVar, boolean z) {
        super(gVar, z);
        Intrinsics.checkParameterIsNotNull(relativeLayout, "relativeLayout");
        Intrinsics.checkParameterIsNotNull(gVar, "tag");
        this.f171359a = relativeLayout;
    }
}
