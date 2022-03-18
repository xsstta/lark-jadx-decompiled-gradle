package com.ss.android.lark.search.redesign.customtab;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.AbstractC20979j;
import com.p943f.p944a.AbstractC20980k;
import com.p943f.p944a.C20972g;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000245B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0016J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\u0014\u0010,\u001a\u00020\b2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030-H\u0016J\b\u0010.\u001a\u00020!H\u0016J\u0014\u0010/\u001a\u00020\b2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030-H\u0016J\b\u00100\u001a\u00020\u0000H\u0016J\b\u00101\u001a\u00020\u0000H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0000H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u001c¨\u00066"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabItem;", "Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder;", "name", "", "icon", "Landroid/graphics/drawable/Drawable;", "needShow", "", "unmovable", "primaryOnly", "added", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZZ)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getName", "()Ljava/lang/String;", "getNeedShow", "()Z", "radiusType", "Lcom/ss/android/lark/search/redesign/customtab/TabItem$RadiusType;", "getRadiusType", "()Lcom/ss/android/lark/search/redesign/customtab/TabItem$RadiusType;", "setRadiusType", "(Lcom/ss/android/lark/search/redesign/customtab/TabItem$RadiusType;)V", "showDivider", "getShowDivider", "setShowDivider", "(Z)V", "bind", "", "viewHolder", "position", "", "createViewHolder", "itemView", "Landroid/view/View;", "equals", "other", "", "generateDragResourceId", "generateEditResourceId", "getDragDirs", "getLayout", "hasSameContentAs", "Lcom/xwray/groupie/Item;", "hashCode", "isSameAs", "toAddedItem", "toRemovedItem", "toString", "toggle", "RadiusType", "ViewHolder", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TabItem extends BaseTabItem<ViewHolder> {

    /* renamed from: b */
    private RadiusType f132615b;

    /* renamed from: c */
    private boolean f132616c;

    /* renamed from: d */
    private final String f132617d;

    /* renamed from: e */
    private final Drawable f132618e;

    /* renamed from: f */
    private final boolean f132619f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabItem$RadiusType;", "", "(Ljava/lang/String;I)V", "NONE", "HEADER", "FOOTER", "ALL", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum RadiusType {
        NONE,
        HEADER,
        FOOTER,
        ALL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\"\u001a\u00020#2\n\u0010$\u001a\u0006\u0012\u0002\b\u00030%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000f¨\u0006+"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder;", "Lcom/xwray/groupie/GroupieViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "container", "Landroid/widget/LinearLayout;", "getContainer", "()Landroid/widget/LinearLayout;", "divider", "getDivider", "()Landroid/view/View;", "dragIcon", "Landroid/widget/ImageView;", "getDragIcon", "()Landroid/widget/ImageView;", "icon", "getIcon", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "onClickListener", "Landroid/view/View$OnClickListener;", "onItemClickListener", "Lcom/xwray/groupie/OnItemClickListener;", "removeText", "getRemoveText", "scrollingLimit", "", "getScrollingLimit", "()F", "statusIcon", "getStatusIcon", "bind", "", "item", "Lcom/xwray/groupie/Item;", "onItemLongClickListener", "Lcom/xwray/groupie/OnItemLongClickListener;", "unbind", "Companion", "HorizontalSwipeGestureListener", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a */
    public static final class ViewHolder extends C20972g {

        /* renamed from: c */
        public static final Companion f132620c = new Companion(null);

        /* renamed from: a */
        public AbstractC20979j f132621a;

        /* renamed from: b */
        public final View.OnClickListener f132622b = new View$OnClickListenerC53734e(this);

        /* renamed from: f */
        private final LinearLayout f132623f;

        /* renamed from: g */
        private final ImageView f132624g;

        /* renamed from: h */
        private final ImageView f132625h;

        /* renamed from: i */
        private final TextView f132626i;

        /* renamed from: j */
        private final ImageView f132627j;

        /* renamed from: k */
        private final TextView f132628k;

        /* renamed from: l */
        private final View f132629l;

        /* renamed from: m */
        private final float f132630m;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder$Companion;", "", "()V", "construct", "Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder;", "itemView", "Landroid/view/View;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ViewHolder mo183267a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                return new ViewHolder(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J(\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder$HorizontalSwipeGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/ss/android/lark/search/redesign/customtab/TabItem$ViewHolder;)V", "currentDownEvent", "Landroid/view/MotionEvent;", "getCurrentDownEvent", "()Landroid/view/MotionEvent;", "setCurrentDownEvent", "(Landroid/view/MotionEvent;)V", "initialTranslationX", "", "getInitialTranslationX", "()F", "setInitialTranslationX", "(F)V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "handleScrollFinished", "", "e", "onDown", "onScroll", "e1", "e2", "distanceX", "distanceY", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a$b */
        public final class HorizontalSwipeGestureListener extends GestureDetector.SimpleOnGestureListener {

            /* renamed from: b */
            private MotionEvent f132632b;

            /* renamed from: c */
            private boolean f132633c;

            /* renamed from: d */
            private float f132634d;

            /* renamed from: a */
            public final boolean mo183269a() {
                return this.f132633c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            public HorizontalSwipeGestureListener() {
            }

            public boolean onDown(MotionEvent motionEvent) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                this.f132632b = null;
                this.f132633c = false;
                this.f132634d = ViewHolder.this.mo183259a().getTranslationX();
                return true;
            }

            /* renamed from: a */
            public final void mo183268a(MotionEvent motionEvent) {
                float f;
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                if (ViewHolder.this.mo183259a().getTranslationX() > ViewHolder.this.mo183266i() / ((float) 2)) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = ViewHolder.this.mo183266i();
                }
                ViewHolder.this.mo183259a().animate().translationX(f).start();
                ViewHolder.this.mo183264f().animate().translationX(f).start();
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e1");
                Intrinsics.checkParameterIsNotNull(motionEvent2, "e2");
                if (this.f132632b != null) {
                    float a = C0745a.m3626a(this.f132634d + (motionEvent2.getX() - motionEvent.getX()), ViewHolder.this.mo183266i(), (float) BitmapDescriptorFactory.HUE_RED);
                    ViewHolder.this.mo183259a().setTranslationX(a);
                    ViewHolder.this.mo183264f().setTranslationX(a);
                    return true;
                } else if (Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent2.getY() - motionEvent.getY())) {
                    return false;
                } else {
                    this.f132632b = motionEvent;
                    this.f132633c = true;
                    View view = ViewHolder.this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        }

        /* renamed from: a */
        public final LinearLayout mo183259a() {
            return this.f132623f;
        }

        /* renamed from: b */
        public final ImageView mo183260b() {
            return this.f132624g;
        }

        /* renamed from: c */
        public final ImageView mo183261c() {
            return this.f132625h;
        }

        /* renamed from: d */
        public final TextView mo183262d() {
            return this.f132626i;
        }

        /* renamed from: e */
        public final ImageView mo183263e() {
            return this.f132627j;
        }

        /* renamed from: f */
        public final TextView mo183264f() {
            return this.f132628k;
        }

        /* renamed from: g */
        public final View mo183265g() {
            return this.f132629l;
        }

        /* renamed from: i */
        public final float mo183266i() {
            return this.f132630m;
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: h */
        public void mo71032h() {
            this.f132624g.setOnClickListener(null);
            this.f132628k.setOnClickListener(null);
            this.itemView.setOnTouchListener(null);
            super.mo71032h();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a$e */
        static final class View$OnClickListenerC53734e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f132638a;

            View$OnClickListenerC53734e(ViewHolder aVar) {
                this.f132638a = aVar;
            }

            public final void onClick(View view) {
                AbstractC20979j jVar;
                if (this.f132638a.getAdapterPosition() != -1 && (jVar = this.f132638a.f132621a) != null) {
                    jVar.mo71073a(this.f132638a.mo71035l(), view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a$d */
        static final class View$OnClickListenerC53733d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f132637a;

            View$OnClickListenerC53733d(ViewHolder aVar) {
                this.f132637a = aVar;
            }

            public final void onClick(View view) {
                this.f132637a.mo183259a().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f132637a.mo183264f().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f132637a.f132622b.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View g = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_container);
            Intrinsics.checkExpressionValueIsNotNull(g, "ViewCompat.requireViewBy…ab_editor_item_container)");
            this.f132623f = (LinearLayout) g;
            View g2 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_status);
            Intrinsics.checkExpressionValueIsNotNull(g2, "ViewCompat.requireViewBy…m_tab_editor_item_status)");
            this.f132624g = (ImageView) g2;
            View g3 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_icon);
            Intrinsics.checkExpressionValueIsNotNull(g3, "ViewCompat.requireViewBy…tom_tab_editor_item_icon)");
            this.f132625h = (ImageView) g3;
            View g4 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_name);
            Intrinsics.checkExpressionValueIsNotNull(g4, "ViewCompat.requireViewBy…tom_tab_editor_item_name)");
            this.f132626i = (TextView) g4;
            View g5 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_drag);
            Intrinsics.checkExpressionValueIsNotNull(g5, "ViewCompat.requireViewBy…tom_tab_editor_item_drag)");
            this.f132627j = (ImageView) g5;
            View g6 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_remove);
            Intrinsics.checkExpressionValueIsNotNull(g6, "ViewCompat.requireViewBy…m_tab_editor_item_remove)");
            this.f132628k = (TextView) g6;
            View g7 = ViewCompat.m4080g(view, (int) R.id.custom_tab_editor_item_divider);
            Intrinsics.checkExpressionValueIsNotNull(g7, "ViewCompat.requireViewBy…_tab_editor_item_divider)");
            this.f132629l = g7;
            this.f132630m = -((float) UIHelper.dp2px(80.0f));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.redesign.customtab.TabItem$a$c */
        static final class View$OnTouchListenerC53732c implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ GestureDetector f132635a;

            /* renamed from: b */
            final /* synthetic */ HorizontalSwipeGestureListener f132636b;

            View$OnTouchListenerC53732c(GestureDetector gestureDetector, HorizontalSwipeGestureListener bVar) {
                this.f132635a = gestureDetector;
                this.f132636b = bVar;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f132635a.onTouchEvent(motionEvent);
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !this.f132636b.mo183269a()) {
                    return false;
                }
                this.f132636b.mo183268a(motionEvent);
                return false;
            }
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: a */
        public void mo71031a(AbstractC20975h<?> hVar, AbstractC20979j jVar, AbstractC20980k kVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            super.mo71031a(hVar, jVar, kVar);
            this.itemView.setOnClickListener(null);
            this.f132624g.setOnClickListener(this.f132622b);
            this.f132621a = jVar;
            TabItem tabItem = (TabItem) hVar;
            if (!tabItem.mo183277i() || tabItem.mo183276h()) {
                this.itemView.setOnTouchListener(null);
            } else {
                HorizontalSwipeGestureListener bVar = new HorizontalSwipeGestureListener();
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                this.itemView.setOnTouchListener(new View$OnTouchListenerC53732c(new GestureDetector(view.getContext(), bVar), bVar));
            }
            this.f132628k.setOnClickListener(new View$OnClickListenerC53733d(this));
        }
    }

    /* renamed from: p */
    public final RadiusType mo183253p() {
        return this.f132615b;
    }

    /* renamed from: q */
    public final boolean mo183254q() {
        return this.f132616c;
    }

    /* renamed from: r */
    public final String mo183255r() {
        return this.f132617d;
    }

    /* renamed from: s */
    public final Drawable mo183256s() {
        return this.f132618e;
    }

    /* renamed from: t */
    public final boolean mo183257t() {
        return this.f132619f;
    }

    public String toString() {
        return this.f132617d;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public int mo71038a() {
        if (this.f132619f) {
            return R.layout.custom_tab_item_layout;
        }
        return R.layout.custom_tab_item_zero_height_layout;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public int mo71045b() {
        if (mo183275g()) {
            return 0;
        }
        return 3;
    }

    /* renamed from: o */
    public int mo183252o() {
        if (mo183275g()) {
            return 0;
        }
        return R.drawable.ic_nav_tab_edit_drag_setting;
    }

    /* renamed from: j */
    public TabItem mo183246f() {
        return new TabItem(this.f132617d, this.f132618e, mo183275g(), mo183276h(), !mo183277i(), false, 32, null);
    }

    /* renamed from: k */
    public TabItem mo183243d() {
        if (mo183277i()) {
            return this;
        }
        return new TabItem(this.f132617d, this.f132618e, this.f132619f, mo183275g(), mo183276h(), true);
    }

    /* renamed from: l */
    public TabItem mo183244e() {
        if (mo183277i()) {
            return new TabItem(this.f132617d, this.f132618e, this.f132619f, mo183275g(), mo183276h(), false);
        }
        return this;
    }

    /* renamed from: n */
    public int mo183251n() {
        if (!mo183277i()) {
            return R.drawable.ic_nav_tab_edit_add_setting;
        }
        if (!mo183276h()) {
            return R.drawable.ic_nav_tab_edit_remove_setting;
        }
        return 0;
    }

    public int hashCode() {
        return (((((((((this.f132617d.hashCode() * 31) + Boolean.valueOf(mo183275g()).hashCode()) * 31) + Boolean.valueOf(mo183276h()).hashCode()) * 31) + Boolean.valueOf(mo183277i()).hashCode()) * 31) + this.f132615b.hashCode()) * 31) + Boolean.valueOf(this.f132616c).hashCode();
    }

    /* renamed from: a */
    public final void mo183242a(boolean z) {
        this.f132616c = z;
    }

    /* renamed from: a */
    public ViewHolder mo71003b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        return ViewHolder.f132620c.mo183267a(view);
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public boolean mo71047b(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        return equals(hVar);
    }

    /* renamed from: a */
    public final void mo183240a(RadiusType radiusType) {
        Intrinsics.checkParameterIsNotNull(radiusType, "<set-?>");
        this.f132615b = radiusType;
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
        TabItem tabItem = (TabItem) hVar;
        if (mo183276h() == tabItem.mo183276h() && !(!Intrinsics.areEqual(this.f132617d, tabItem.f132617d))) {
            return true;
        }
        return false;
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
            TabItem tabItem = (TabItem) obj;
            if (!(!Intrinsics.areEqual(this.f132617d, tabItem.f132617d)) && mo183275g() == tabItem.mo183275g() && mo183276h() == tabItem.mo183276h() && mo183277i() == tabItem.mo183277i() && this.f132615b == tabItem.f132615b && this.f132616c == tabItem.f132616c) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.redesign.customtab.TabItem");
    }

    /* renamed from: a */
    public void mo71041a(ViewHolder aVar, int i) {
        Drawable drawable;
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.mo183260b().setImageResource(mo183251n());
        aVar.mo183261c().setImageDrawable(this.f132618e);
        aVar.mo183262d().setText(this.f132617d);
        aVar.mo183263e().setImageResource(mo183252o());
        LinearLayout a = aVar.mo183259a();
        int i2 = C53739e.f132655a[this.f132615b.ordinal()];
        int i3 = 4;
        if (i2 == 1) {
            drawable = C57582a.m223614c(aVar.mo183259a().getContext(), R.color.bg_float);
        } else if (i2 == 2) {
            drawable = C57582a.m223614c(aVar.mo183259a().getContext(), R.drawable.editor_tab_item_top_bg);
        } else if (i2 == 3) {
            drawable = C57582a.m223614c(aVar.mo183259a().getContext(), R.drawable.editor_tab_item_bottom_bg);
        } else if (i2 == 4) {
            drawable = C57582a.m223614c(aVar.mo183259a().getContext(), R.drawable.editor_tab_item_single_bg);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        a.setBackground(drawable);
        View g = aVar.mo183265g();
        if (this.f132616c) {
            i3 = 0;
        }
        g.setVisibility(i3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabItem(String str, Drawable drawable, boolean z, boolean z2, boolean z3, boolean z4) {
        super((long) str.hashCode(), z2, z3, z4);
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f132617d = str;
        this.f132618e = drawable;
        this.f132619f = z;
        this.f132615b = RadiusType.NONE;
        this.f132616c = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TabItem(java.lang.String r8, android.graphics.drawable.Drawable r9, boolean r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.customtab.TabItem.<init>(java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
