package com.ss.android.lark.setting.page.content.general.feedfilter.view;

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
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.AbstractC20979j;
import com.p943f.p944a.AbstractC20980k;
import com.p943f.p944a.C20972g;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0016J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020!H\u0002J\b\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020!H\u0016J\u0014\u0010/\u001a\u00020!2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u0014\u00101\u001a\u00020\t2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u00102\u001a\u00020!H\u0016J\u0014\u00103\u001a\u00020\t2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u00104\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\u0000J\u0006\u00106\u001a\u00020\u0000J\b\u00107\u001a\u00020\u0004H\u0016J\u0006\u00108\u001a\u00020\u0000R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006:"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem;", "Lcom/xwray/groupie/Item;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder;", "key", "", "name", "icon", "Landroid/graphics/drawable/Drawable;", "unmovable", "", "primaryOnly", "notRemove", "added", "highlight", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZZZ)V", "getAdded", "()Z", "getHighlight", "setHighlight", "(Z)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getKey", "()Ljava/lang/String;", "getName", "getNotRemove", "getPrimaryOnly", "getUnmovable", "addBackground", "", "viewHolder", "bind", "position", "", "createViewHolder", "itemView", "Landroid/view/View;", "equals", "other", "", "generateBackgroundColor", "context", "Landroid/content/Context;", "generateDragResource", "generateEditResourceId", "getDragDirs", "getLayout", "getPosition", "item", "hasSameContentAs", "hashCode", "isSameAs", "removeBackground", "toAddedItem", "toRemovedItem", "toString", "toggle", "ViewHolder", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c */
public final class FeedTabItem extends AbstractC20975h<ViewHolder> {

    /* renamed from: b */
    private final String f134739b;

    /* renamed from: c */
    private final String f134740c;

    /* renamed from: d */
    private final Drawable f134741d;

    /* renamed from: e */
    private final boolean f134742e;

    /* renamed from: f */
    private final boolean f134743f;

    /* renamed from: g */
    private final boolean f134744g;

    /* renamed from: h */
    private final boolean f134745h;

    /* renamed from: i */
    private boolean f134746i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder;", "Lcom/xwray/groupie/GroupieViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "container", "Landroid/widget/LinearLayout;", "getContainer", "()Landroid/widget/LinearLayout;", "dragIcon", "Landroid/widget/ImageView;", "getDragIcon", "()Landroid/widget/ImageView;", "nameText", "Landroid/widget/TextView;", "getNameText", "()Landroid/widget/TextView;", "onClickListener", "Landroid/view/View$OnClickListener;", "onItemClickListener", "Lcom/xwray/groupie/OnItemClickListener;", "removeText", "getRemoveText", "scrollingLimit", "", "getScrollingLimit", "()F", "statusIcon", "getStatusIcon", "bind", "", "item", "Lcom/xwray/groupie/Item;", "onItemLongClickListener", "Lcom/xwray/groupie/OnItemLongClickListener;", "unbind", "Companion", "HorizontalSwipeGestureListener", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a */
    public static final class ViewHolder extends C20972g {

        /* renamed from: c */
        public static final Companion f134747c = new Companion(null);

        /* renamed from: a */
        public AbstractC20979j f134748a;

        /* renamed from: b */
        public final View.OnClickListener f134749b = new View$OnClickListenerC54502e(this);

        /* renamed from: f */
        private final LinearLayout f134750f;

        /* renamed from: g */
        private final TextView f134751g;

        /* renamed from: h */
        private final ImageView f134752h;

        /* renamed from: i */
        private final ImageView f134753i;

        /* renamed from: j */
        private final TextView f134754j;

        /* renamed from: k */
        private final float f134755k;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder$Companion;", "", "()V", "construct", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder;", "itemView", "Landroid/view/View;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ViewHolder mo186264a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                return new ViewHolder(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder$HorizontalSwipeGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedTabItem$ViewHolder;)V", "currentDownEvent", "Landroid/view/MotionEvent;", "initialTranslationX", "", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "handleScrollFinished", "", "e", "onDown", "onScroll", "e1", "e2", "distanceX", "distanceY", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a$b */
        public final class HorizontalSwipeGestureListener extends GestureDetector.SimpleOnGestureListener {

            /* renamed from: b */
            private MotionEvent f134757b;

            /* renamed from: c */
            private boolean f134758c;

            /* renamed from: d */
            private float f134759d;

            /* renamed from: a */
            public final boolean mo186266a() {
                return this.f134758c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            public HorizontalSwipeGestureListener() {
            }

            public boolean onDown(MotionEvent motionEvent) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                this.f134757b = null;
                this.f134758c = false;
                this.f134759d = ViewHolder.this.mo186258a().getTranslationX();
                return true;
            }

            /* renamed from: a */
            public final void mo186265a(MotionEvent motionEvent) {
                float f;
                Intrinsics.checkParameterIsNotNull(motionEvent, "e");
                if (ViewHolder.this.mo186258a().getTranslationX() > ViewHolder.this.mo186263f() / ((float) 2)) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = ViewHolder.this.mo186263f();
                }
                ViewHolder.this.mo186258a().animate().translationX(f).start();
                ViewHolder.this.mo186262e().animate().translationX(f).start();
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "e1");
                Intrinsics.checkParameterIsNotNull(motionEvent2, "e2");
                if (this.f134757b != null) {
                    float a = C0745a.m3626a(this.f134759d + (motionEvent2.getX() - motionEvent.getX()), ViewHolder.this.mo186263f(), (float) BitmapDescriptorFactory.HUE_RED);
                    ViewHolder.this.mo186258a().setTranslationX(a);
                    ViewHolder.this.mo186262e().setTranslationX(a);
                    return true;
                } else if (Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent2.getY() - motionEvent.getY())) {
                    return false;
                } else {
                    this.f134757b = motionEvent;
                    this.f134758c = true;
                    View view = ViewHolder.this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        }

        /* renamed from: a */
        public final LinearLayout mo186258a() {
            return this.f134750f;
        }

        /* renamed from: b */
        public final TextView mo186259b() {
            return this.f134751g;
        }

        /* renamed from: c */
        public final ImageView mo186260c() {
            return this.f134752h;
        }

        /* renamed from: d */
        public final ImageView mo186261d() {
            return this.f134753i;
        }

        /* renamed from: e */
        public final TextView mo186262e() {
            return this.f134754j;
        }

        /* renamed from: f */
        public final float mo186263f() {
            return this.f134755k;
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: h */
        public void mo71032h() {
            this.f134752h.setOnClickListener(null);
            this.f134754j.setOnClickListener(null);
            this.itemView.setOnTouchListener(null);
            super.mo71032h();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a$e */
        static final class View$OnClickListenerC54502e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f134763a;

            View$OnClickListenerC54502e(ViewHolder aVar) {
                this.f134763a = aVar;
            }

            public final void onClick(View view) {
                AbstractC20979j jVar;
                if (this.f134763a.getAdapterPosition() != -1 && (jVar = this.f134763a.f134748a) != null) {
                    jVar.mo71073a(this.f134763a.mo71035l(), view);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a$d */
        static final class View$OnClickListenerC54501d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f134762a;

            View$OnClickListenerC54501d(ViewHolder aVar) {
                this.f134762a = aVar;
            }

            public final void onClick(View view) {
                this.f134762a.mo186258a().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f134762a.mo186262e().animate().translationX(BitmapDescriptorFactory.HUE_RED).start();
                this.f134762a.f134749b.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View g = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_container);
            Intrinsics.checkExpressionValueIsNotNull(g, "ViewCompat.requireViewBy…av_editor_item_container)");
            this.f134750f = (LinearLayout) g;
            View g2 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_name);
            Intrinsics.checkExpressionValueIsNotNull(g2, "ViewCompat.requireViewBy…ain_nav_editor_item_name)");
            this.f134751g = (TextView) g2;
            View g3 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_status);
            Intrinsics.checkExpressionValueIsNotNull(g3, "ViewCompat.requireViewBy…n_nav_editor_item_status)");
            this.f134752h = (ImageView) g3;
            View g4 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_drag);
            Intrinsics.checkExpressionValueIsNotNull(g4, "ViewCompat.requireViewBy…ain_nav_editor_item_drag)");
            this.f134753i = (ImageView) g4;
            View g5 = ViewCompat.m4080g(view, (int) R.id.main_nav_editor_item_remove);
            Intrinsics.checkExpressionValueIsNotNull(g5, "ViewCompat.requireViewBy…n_nav_editor_item_remove)");
            this.f134754j = (TextView) g5;
            this.f134755k = -((float) UIHelper.dp2px(80.0f));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.c$a$c */
        static final class View$OnTouchListenerC54500c implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ GestureDetector f134760a;

            /* renamed from: b */
            final /* synthetic */ HorizontalSwipeGestureListener f134761b;

            View$OnTouchListenerC54500c(GestureDetector gestureDetector, HorizontalSwipeGestureListener bVar) {
                this.f134760a = gestureDetector;
                this.f134761b = bVar;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (this.f134760a.onTouchEvent(motionEvent)) {
                    return true;
                }
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
                if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !this.f134761b.mo186266a()) {
                    return false;
                }
                this.f134761b.mo186265a(motionEvent);
                return true;
            }
        }

        @Override // com.p943f.p944a.C20972g
        /* renamed from: a */
        public void mo71031a(AbstractC20975h<?> hVar, AbstractC20979j jVar, AbstractC20980k kVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "item");
            super.mo71031a(hVar, jVar, kVar);
            this.itemView.setOnClickListener(null);
            this.f134752h.setOnClickListener(this.f134749b);
            this.f134748a = jVar;
            FeedTabItem cVar = (FeedTabItem) hVar;
            if (!cVar.mo186256m() || (cVar.mo186254k() && !cVar.mo186253j())) {
                this.itemView.setOnTouchListener(null);
            } else {
                HorizontalSwipeGestureListener bVar = new HorizontalSwipeGestureListener();
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                this.itemView.setOnTouchListener(new View$OnTouchListenerC54500c(new GestureDetector(view.getContext(), bVar), bVar));
            }
            this.f134754j.setOnClickListener(new View$OnClickListenerC54501d(this));
        }
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public int mo71038a() {
        return R.layout.feed_editor_item_layout;
    }

    /* renamed from: g */
    public final String mo186249g() {
        return this.f134739b;
    }

    /* renamed from: h */
    public final String mo186250h() {
        return this.f134740c;
    }

    /* renamed from: i */
    public final Drawable mo186252i() {
        return this.f134741d;
    }

    /* renamed from: j */
    public final boolean mo186253j() {
        return this.f134742e;
    }

    /* renamed from: k */
    public final boolean mo186254k() {
        return this.f134743f;
    }

    /* renamed from: l */
    public final boolean mo186255l() {
        return this.f134744g;
    }

    /* renamed from: m */
    public final boolean mo186256m() {
        return this.f134745h;
    }

    public String toString() {
        return this.f134740c;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public int mo71045b() {
        if (this.f134742e) {
            return 0;
        }
        return 3;
    }

    /* renamed from: n */
    private final int m211453n() {
        if (!this.f134745h) {
            return R.drawable.ud_icon_add_colorful;
        }
        if (this.f134744g || this.f134743f) {
            return R.drawable.ud_icon_delete_disable_colorful;
        }
        return R.drawable.ud_icon_delete_colorful;
    }

    /* renamed from: d */
    public final FeedTabItem mo186245d() {
        if (this.f134745h) {
            return this;
        }
        return new FeedTabItem(this.f134739b, this.f134740c, this.f134741d, this.f134742e, this.f134743f, this.f134744g, true, false, SmActions.ACTION_ONTHECALL_EXIT, null);
    }

    /* renamed from: e */
    public final FeedTabItem mo186246e() {
        if (this.f134745h) {
            return new FeedTabItem(this.f134739b, this.f134740c, this.f134741d, this.f134742e, this.f134743f, this.f134744g, false, false, SmActions.ACTION_ONTHECALL_EXIT, null);
        }
        return this;
    }

    /* renamed from: f */
    public final FeedTabItem mo186248f() {
        return new FeedTabItem(this.f134739b, this.f134740c, this.f134741d, this.f134742e, this.f134743f, this.f134744g, !this.f134745h, false, SmActions.ACTION_ONTHECALL_EXIT, null);
    }

    public int hashCode() {
        return (((((((this.f134739b.hashCode() * 31) + this.f134740c.hashCode()) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f134742e)) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f134743f)) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.f134745h);
    }

    /* renamed from: a */
    public ViewHolder mo71003b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        return ViewHolder.f134747c.mo186264a(view);
    }

    /* renamed from: a */
    private final Drawable m211452a(Context context) {
        if (this.f134742e) {
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
    public final void mo186244b(ViewHolder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.itemView.setBackgroundResource(R.color.transparent);
    }

    @Override // com.p943f.p944a.AbstractC20966c, com.p943f.p944a.AbstractC20975h
    /* renamed from: c */
    public int mo71007c(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "item");
        if (Intrinsics.areEqual(this, hVar)) {
            return 0;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo186241a(ViewHolder aVar) {
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
            FeedTabItem cVar = (FeedTabItem) obj;
            if (!(!Intrinsics.areEqual(this.f134739b, cVar.f134739b)) && !(!Intrinsics.areEqual(this.f134740c, cVar.f134740c)) && this.f134742e == cVar.f134742e && this.f134743f == cVar.f134743f && this.f134745h == cVar.f134745h && this.f134746i == cVar.f134746i) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem");
    }

    /* renamed from: a */
    public final void mo186243a(boolean z) {
        this.f134746i = z;
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
        FeedTabItem cVar = (FeedTabItem) hVar;
        if (this.f134743f == cVar.f134743f && !(!Intrinsics.areEqual(this.f134739b, cVar.f134739b))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo71041a(ViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        aVar.mo186259b().setText(this.f134740c);
        aVar.mo186260c().setImageResource(m211453n());
        ImageView d = aVar.mo186261d();
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "viewHolder.itemView.context");
        d.setImageDrawable(m211452a(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedTabItem(String str, String str2, Drawable drawable, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super((long) str2.hashCode());
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.f134739b = str;
        this.f134740c = str2;
        this.f134741d = drawable;
        this.f134742e = z;
        this.f134743f = z2;
        this.f134744g = z3;
        this.f134745h = z4;
        this.f134746i = z5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FeedTabItem(java.lang.String r13, java.lang.String r14, android.graphics.drawable.Drawable r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = 0
            goto L_0x000b
        L_0x0009:
            r10 = r19
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r11 = 0
            goto L_0x0013
        L_0x0011:
            r11 = r20
        L_0x0013:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.page.content.general.feedfilter.view.FeedTabItem.<init>(java.lang.String, java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
