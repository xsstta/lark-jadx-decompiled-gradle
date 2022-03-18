package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.AbstractC20979j;
import com.p943f.p944a.AbstractC20980k;
import com.p943f.p944a.C20972g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\u0014\u0010(\u001a\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\u0014\u0010*\u001a\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010,\u001a\u00020\u0000J\u0006\u0010-\u001a\u00020\u0000J\b\u0010.\u001a\u00020\u0004H\u0016J\u0006\u0010/\u001a\u00020\u0000R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u00061"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabItem;", "Lcom/xwray/groupie/Item;", "Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder;", "key", "", "name", "icon", "Landroid/graphics/drawable/Drawable;", "unmovable", "", "primaryOnly", "added", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZ)V", "getAdded", "()Z", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getKey", "()Ljava/lang/String;", "getName", "getPrimaryOnly", "getUnmovable", "addBackground", "", "viewHolder", "bind", "position", "", "createViewHolder", "itemView", "Landroid/view/View;", "equals", "other", "", "generateDragResource", "context", "Landroid/content/Context;", "generateEditResourceId", "getDragDirs", "getLayout", "hasSameContentAs", "hashCode", "isSameAs", "removeBackground", "toAddedItem", "toRemovedItem", "toString", "toggle", "ViewHolder", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.d */
public final class EditorTabItem extends AbstractC20975h<ViewHolder> {

    /* renamed from: b */
    private final String f112517b;

    /* renamed from: c */
    private final String f112518c;

    /* renamed from: d */
    private final Drawable f112519d;

    /* renamed from: e */
    private final boolean f112520e;

    /* renamed from: f */
    private final boolean f112521f;

    /* renamed from: g */
    private final boolean f112522g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0002()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010!\u001a\u00020\"2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\f¨\u0006*"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder;", "Lcom/xwray/groupie/GroupieViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "container", "Landroid/widget/LinearLayout;", "getContainer", "()Landroid/widget/LinearLayout;", "dragIcon", "Landroid/widget/ImageView;", "getDragIcon", "()Landroid/widget/ImageView;", "icon", "Lcom/larksuite/component/ignition/widget/squircle/SquircleImageView;", "getIcon", "()Lcom/larksuite/component/ignition/widget/squircle/SquircleImageView;", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "onClickListener", "Landroid/view/View$OnClickListener;", "onItemClickListener", "Lcom/xwray/groupie/OnItemClickListener;", "removeText", "getRemoveText", "scrollingLimit", "", "getScrollingLimit", "()F", "statusIcon", "getStatusIcon", "bind", "", "item", "Lcom/xwray/groupie/Item;", "onItemLongClickListener", "Lcom/xwray/groupie/OnItemLongClickListener;", "unbind", "Companion", "HorizontalSwipeGestureListener", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.d$a */
    public static final class ViewHolder extends C20972g {

        /* renamed from: c */
        public static final Companion f112523c = new Companion(null);

        /* renamed from: a */
        public AbstractC20979j f112524a;

        /* renamed from: b */
        public final View.OnClickListener f112525b = new View$OnClickListenerC44360e(this);

        /* renamed from: f */
        private final LinearLayout f112526f;

        /* renamed from: g */
        private final TextView f112527g;

        /* renamed from: h */
        private final ImageView f112528h;

        /* renamed from: i */
        private final SquircleImageView f112529i;

        /* renamed from: j */
        private final ImageView f112530j;

        /* renamed from: k */
        private final TextView f112531k;

        /* renamed from: l */
        private final float f112532l;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder$Companion;", "", "()V", "construct", "Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder;", "itemView", "Landroid/view/View;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.d$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ViewHolder mo157586a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                return new ViewHolder(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J(\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder$HorizontalSwipeGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/ss/android/lark/main/app/tab/EditorTabItem$ViewHolder;)V", "currentDownEvent", "Landroid/view/MotionEvent;", "getCurrentDownEvent", "()Landroid/view/MotionEvent;", "setCurrentDownEvent", "(Landroid/view/MotionEvent;)V", "initialTranslationX", "", "getInitialTranslationX", "()F", "setInitialTranslationX", "(F)V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "handleScrollFinished", "", "e", "onDown", "onScroll", "e1", "e2", "distanceX", "distanceY", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.d$a$b */
        public final class HorizontalSwipeGestureListener extends GestureDetector.SimpleOnGestureListener {

            /* renamed from: b */
            private MotionEvent f112534b;

            /* renamed from: c */
            private boolean f112535c;

            /* renamed from: d */
            private float f112536d;

            /* renamed from: a */
            public final boolean mo157588a() {
                return this.f112535c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            public HorizontalSwipeGestureListener() {
            }

            public boolean onDown(MotionEvent motionEvent) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                this.f112534b = null;
                this.f112535c = false;
                this.f112536d = ViewHolder.this.mo157579a().getTranslationX();
                return true;
            }

            /* renamed from: a */
            public final void mo157587a(MotionEvent motionEvent) {
                float f;
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                if (ViewHolder.this.mo157579a().getTranslationX() > ViewHolder.this.mo157585g() / ((float) 2)) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = ViewHolder.this.mo157585g();
                }
                ViewHolder.this.mo157579a().animate().translationX(f).start();
                ViewHolder.this.mo157584f().animate().translationX(f).start();
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e1");
                Intrinsics.checkParameterIsNotNull(motionEvent2, "e2");
                if (this.f112534b != null) {
                    float a = C0745a.m3626a(this.f112536d + (motionEvent2.getX() - motionEvent.getX()), ViewHolder.this.mo157585g(), (float) BitmapDescriptorFactory.HUE_RED);
                    ViewHolder.this.mo157579a().setTranslationX(a);
                    ViewHolder.this.mo157584f().setTranslationX(a);
                    return true;
                } else if (Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent2.getY() - motionEvent.getY())) {
                    return false;
                } else {
                    this.f112534b = motionEvent;
                    this.f112535c = true;
                    View view = ViewHolder.this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        }

        /* renamed from: a */
        public final LinearLayout mo157579a() {
            return this.f112526f;
        }

        /* renamed from: b */
        public final TextView mo157580b() {
            return this.f112527g;
        }

        /* renamed from: c */
        public final ImageView mo157581c() {
            return this.f112528h;
        }

        /* renamed from: d */
        public final SquircleImageView mo157582d() {
            return this.f112529i;
        }

        /* renamed from: e */
        public final ImageView mo157583e() {
            return this.f112530j;
        }

        /* renamed from: f */
        public final TextView mo157584f() {
            return this.f112531k;
        }

        /* renamed from: g */
        public final float mo157585g() {
            return this.f112532l;
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: h */
        public void mo71032h() {
            this.f112528h.setOnClickListener(null);
            this.f112531k.setOnClickListener(null);
            this.itemView.setOnTouchListener(null);
            super.mo71032h();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.d$a$e */
        static final class View$OnClickListenerC44360e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f112540a;

            View$OnClickListenerC44360e(ViewHolder aVar) {
                this.f112540a = aVar;
            }

            public final void onClick(View view) {
                AbstractC20979j jVar;
                if (this.f112540a.getAdapterPosition() != -1 && (jVar = this.f112540a.f112524a) != null) {
                    jVar.mo71073a(this.f112540a.mo71035l(), view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.d$a$d */
        static final class View$OnClickListenerC44359d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f112539a;

            View$OnClickListenerC44359d(ViewHolder aVar) {
                this.f112539a = aVar;
            }

            public final void onClick(View view) {
                this.f112539a.mo157579a().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f112539a.mo157584f().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f112539a.f112525b.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View g = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_container);
            Intrinsics.checkExpressionValueIsNotNull(g, "ViewCompat.requireViewBy…av_editor_item_container)");
            this.f112526f = (LinearLayout) g;
            View g2 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_name);
            Intrinsics.checkExpressionValueIsNotNull(g2, "ViewCompat.requireViewBy…ain_nav_editor_item_name)");
            this.f112527g = (TextView) g2;
            View g3 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_status);
            Intrinsics.checkExpressionValueIsNotNull(g3, "ViewCompat.requireViewBy…n_nav_editor_item_status)");
            this.f112528h = (ImageView) g3;
            View g4 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_icon);
            Intrinsics.checkExpressionValueIsNotNull(g4, "ViewCompat.requireViewBy…ain_nav_editor_item_icon)");
            this.f112529i = (SquircleImageView) g4;
            View g5 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_drag);
            Intrinsics.checkExpressionValueIsNotNull(g5, "ViewCompat.requireViewBy…ain_nav_editor_item_drag)");
            this.f112530j = (ImageView) g5;
            View g6 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_remove);
            Intrinsics.checkExpressionValueIsNotNull(g6, "ViewCompat.requireViewBy…n_nav_editor_item_remove)");
            this.f112531k = (TextView) g6;
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            this.f112532l = -((float) C44390w.m176139a(80, context));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.app.tab.d$a$c */
        static final class View$OnTouchListenerC44358c implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ GestureDetector f112537a;

            /* renamed from: b */
            final /* synthetic */ HorizontalSwipeGestureListener f112538b;

            View$OnTouchListenerC44358c(GestureDetector gestureDetector, HorizontalSwipeGestureListener bVar) {
                this.f112537a = gestureDetector;
                this.f112538b = bVar;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f112537a.onTouchEvent(motionEvent);
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !this.f112538b.mo157588a()) {
                    return false;
                }
                this.f112538b.mo157587a(motionEvent);
                return false;
            }
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: a */
        public void mo71031a(AbstractC20975h<?> hVar, AbstractC20979j jVar, AbstractC20980k kVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            super.mo71031a(hVar, jVar, kVar);
            this.itemView.setOnClickListener(null);
            this.f112528h.setOnClickListener(this.f112525b);
            this.f112524a = jVar;
            EditorTabItem dVar = (EditorTabItem) hVar;
            if (!dVar.mo157577k() || (dVar.mo157576j() && !dVar.mo157575i())) {
                this.itemView.setOnTouchListener(null);
            } else {
                HorizontalSwipeGestureListener bVar = new HorizontalSwipeGestureListener();
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                this.itemView.setOnTouchListener(new View$OnTouchListenerC44358c(new GestureDetector(view.getContext(), bVar), bVar));
            }
            this.f112531k.setOnClickListener(new View$OnClickListenerC44359d(this));
        }
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public int mo71038a() {
        return R.layout.main_nav_editor_item_layout;
    }

    /* renamed from: f */
    public final String mo157571f() {
        return this.f112517b;
    }

    /* renamed from: g */
    public final String mo157572g() {
        return this.f112518c;
    }

    /* renamed from: h */
    public final Drawable mo157573h() {
        return this.f112519d;
    }

    /* renamed from: i */
    public final boolean mo157575i() {
        return this.f112520e;
    }

    /* renamed from: j */
    public final boolean mo157576j() {
        return this.f112521f;
    }

    /* renamed from: k */
    public final boolean mo157577k() {
        return this.f112522g;
    }

    public String toString() {
        return this.f112518c;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public int mo71045b() {
        if (this.f112520e) {
            return 0;
        }
        return 3;
    }

    /* renamed from: l */
    private final int m175959l() {
        if (!this.f112522g) {
            return R.drawable.ud_icon_add_colorful;
        }
        if (!this.f112521f) {
            return R.drawable.ud_icon_delete_colorful;
        }
        return R.drawable.ud_icon_delete_disable_colorful;
    }

    public final EditorTabItem aR_() {
        if (this.f112522g) {
            return this;
        }
        return new EditorTabItem(this.f112517b, this.f112518c, this.f112519d, this.f112520e, this.f112521f, true);
    }

    /* renamed from: d */
    public final EditorTabItem mo157568d() {
        if (this.f112522g) {
            return new EditorTabItem(this.f112517b, this.f112518c, this.f112519d, this.f112520e, this.f112521f, false);
        }
        return this;
    }

    /* renamed from: e */
    public final EditorTabItem mo157569e() {
        return new EditorTabItem(this.f112517b, this.f112518c, this.f112519d, this.f112520e, this.f112521f, !this.f112522g);
    }

    public int hashCode() {
        return (((((((this.f112517b.hashCode() * 31) + this.f112518c.hashCode()) * 31) + Boolean.valueOf(this.f112520e).hashCode()) * 31) + Boolean.valueOf(this.f112521f).hashCode()) * 31) + Boolean.valueOf(this.f112522g).hashCode();
    }

    /* renamed from: a */
    public ViewHolder mo71003b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        return ViewHolder.f112523c.mo157586a(view);
    }

    /* renamed from: a */
    private final Drawable m175958a(Context context) {
        if (this.f112520e) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.ud_icon_tuodong_outlined);
        if (drawable != null) {
            drawable.mutate();
        }
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(context, R.color.icon_disable));
        }
        return drawable;
    }

    /* renamed from: b */
    public final void mo157567b(ViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.itemView.setBackgroundResource(R.color.transparent);
    }

    /* renamed from: a */
    public final void mo157564a(ViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.itemView.setBackgroundResource(R.color.bg_float);
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public boolean mo71047b(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        return equals(hVar);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            EditorTabItem dVar = (EditorTabItem) obj;
            if (!(!Intrinsics.areEqual(this.f112517b, dVar.f112517b)) && !(!Intrinsics.areEqual(this.f112518c, dVar.f112518c)) && this.f112520e == dVar.f112520e && this.f112521f == dVar.f112521f && this.f112522g == dVar.f112522g) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.main.app.tab.EditorTabItem");
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public boolean mo71044a(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        if (this == hVar) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), hVar.getClass())) {
            return false;
        }
        EditorTabItem dVar = (EditorTabItem) hVar;
        if (this.f112521f == dVar.f112521f && !(!Intrinsics.areEqual(this.f112517b, dVar.f112517b))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo71041a(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.mo157580b().setText(this.f112518c);
        aVar.mo157581c().setImageResource(m175959l());
        aVar.mo157582d().setImageDrawable(this.f112519d);
        ImageView e = aVar.mo157583e();
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "viewHolder.itemView.context");
        e.setImageDrawable(m175958a(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorTabItem(String str, String str2, Drawable drawable, boolean z, boolean z2, boolean z3) {
        super((long) str2.hashCode());
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.f112517b = str;
        this.f112518c = str2;
        this.f112519d = drawable;
        this.f112520e = z;
        this.f112521f = z2;
        this.f112522g = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EditorTabItem(java.lang.String r8, java.lang.String r9, android.graphics.drawable.Drawable r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0007
            r13 = 0
            r6 = 0
            goto L_0x0008
        L_0x0007:
            r6 = r13
        L_0x0008:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.tab.EditorTabItem.<init>(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
