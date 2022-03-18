package com.ss.android.lark.feed.app.filter.data;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.suite.R;
import com.samskivert.mustache.C27035d;
import com.samskivert.mustache.C27059e;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.widget.ColorTransPagerTitleView;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u00032\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData;", "", "()V", "Companion", "FilterHolder", "FilterItem", "FilterItemType", "IFilterItem", "OnTabClickListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedTabItemData {

    /* renamed from: a */
    public static final Lazy f96281a = LazyKt.lazy(C37550b.INSTANCE);

    /* renamed from: b */
    public static final Companion f96282b = new Companion(null);

    @Target({ElementType.TYPE, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterItemType;", "", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface FilterItemType {
        public static final Companion Companion = Companion.f96283a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterItemType$Companion;", "", "()V", "DATA", "", "MANAGER", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$FilterItemType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f96283a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0015H&J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "getId", "()Ljava/lang/String;", "tabListener", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "getTabListener", "()Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "setTabListener", "(Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "viewLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getViewLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "createTitleView", "Landroid/view/View;", "context", "Landroid/content/Context;", "getCount", "", "getFeedFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "getItemType", "updateTitleView", "", "itemView", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$e */
    public interface IFilterItem extends AbstractC26248b<IFilterItem> {
        /* renamed from: a */
        int mo137797a();

        /* renamed from: a */
        View mo137798a(Context context);

        /* renamed from: a */
        void mo137799a(OnTabClickListener fVar);

        /* renamed from: b */
        FeedFilter mo137801b();

        /* renamed from: c */
        int mo137803c();

        /* renamed from: d */
        FrameLayout.LayoutParams mo137804d();

        /* renamed from: e */
        String mo137805e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "", "onTabClickListener", "", "view", "Landroid/view/View;", "item", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "onTabDoubleClickListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$f */
    public interface OnTabClickListener {
        /* renamed from: a */
        void mo137826a(View view, IFilterItem eVar);

        /* renamed from: b */
        void mo137827b(View view, IFilterItem eVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\r\u001a\u00020\u0004*\u00020\u000eH\u0002J\u0019\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$Companion;", "", "()V", "FILTER_MORE_ID", "", "TITLE_TEXT_SIZE_IN_SP", "", "template", "Lcom/samskivert/mustache/Template;", "getTemplate", "()Lcom/samskivert/mustache/Template;", "template$delegate", "Lkotlin/Lazy;", "toBadgeCountText", "", "toTextWithBadgeCount", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "badgeCount", "toTextWithBadgeCount$im_feed_release", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$a */
    public static final class Companion {
        /* renamed from: a */
        private final C27059e m147667a() {
            Lazy lazy = FeedTabItemData.f96281a;
            Companion aVar = FeedTabItemData.f96282b;
            return (C27059e) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final String m147668a(int i) {
            if (i > 1000000) {
                return "1M+";
            }
            if (i == 1000000) {
                return "1M";
            }
            if (i > 0) {
                return String.valueOf(i);
            }
            return "";
        }

        /* renamed from: a */
        public final String mo137796a(FeedFilter feedFilter, int i) {
            Intrinsics.checkParameterIsNotNull(feedFilter, "$this$toTextWithBadgeCount");
            Companion aVar = this;
            String a = aVar.m147667a().mo96212a(MapsKt.mapOf(TuplesKt.to("messageType", feedFilter.toString()), TuplesKt.to("unreadNumber", aVar.m147668a(i))));
            Intrinsics.checkExpressionValueIsNotNull(a, "template.execute(\n      …ount.toBadgeCountText()))");
            if (a != null) {
                return StringsKt.trim((CharSequence) a).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\"H\u0016J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010)\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u001a\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010\u001aH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterHolder;", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", "id", "", "icon", "Landroid/graphics/drawable/Drawable;", "tabListener", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getId", "()Ljava/lang/String;", "getTabListener", "()Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "setTabListener", "(Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "viewLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getViewLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "component1", "component2", "component3", "copy", "createTitleView", "Landroid/view/View;", "context", "Landroid/content/Context;", "equals", "", "other", "", "getCount", "", "getFeedFilter", "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "getItemType", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "updateTitleView", "", "itemView", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$c */
    public static final class FilterHolder implements IFilterItem {

        /* renamed from: a */
        private final String f96284a;

        /* renamed from: b */
        private final Drawable f96285b;

        /* renamed from: c */
        private OnTabClickListener f96286c;

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public int mo137797a() {
            return 2;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: c */
        public int mo137803c() {
            return -1;
        }

        public String toString() {
            return "FilterHolder(id=" + mo137805e() + ", icon=" + this.f96285b + ", tabListener=" + mo137808g() + ")";
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: b */
        public FeedFilter mo137801b() {
            return FeedFilter.UNKNOWN;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: e */
        public String mo137805e() {
            return this.f96284a;
        }

        /* renamed from: f */
        public final Drawable mo137807f() {
            return this.f96285b;
        }

        /* renamed from: g */
        public OnTabClickListener mo137808g() {
            return this.f96286c;
        }

        public int hashCode() {
            return mo137805e().hashCode();
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: d */
        public FrameLayout.LayoutParams mo137804d() {
            AbstractC38037a b = C37268c.m146766b();
            Intrinsics.checkExpressionValueIsNotNull(b, "FeedContext.getDependency()");
            return new FrameLayout.LayoutParams(UIUtils.dp2px(b.mo139170a(), 48.0f), -1);
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public void mo137799a(OnTabClickListener fVar) {
            this.f96286c = fVar;
        }

        /* renamed from: a */
        public boolean isItemSame(IFilterItem eVar) {
            return Intrinsics.areEqual(this, eVar);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterHolder$createTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$c$a */
        static final class View$OnClickListenerC37551a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FilterHolder f96287a;

            /* renamed from: b */
            final /* synthetic */ ImageView f96288b;

            /* renamed from: c */
            final /* synthetic */ FrameLayout.LayoutParams f96289c;

            View$OnClickListenerC37551a(FilterHolder cVar, ImageView imageView, FrameLayout.LayoutParams layoutParams) {
                this.f96287a = cVar;
                this.f96288b = imageView;
                this.f96289c = layoutParams;
            }

            public final void onClick(View view) {
                OnTabClickListener g = this.f96287a.mo137808g();
                if (g != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    g.mo137826a(view, this.f96287a);
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FilterHolder) && !(!Intrinsics.areEqual(mo137805e(), ((FilterHolder) obj).mo137805e()))) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public View mo137798a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(this.f96285b);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(imageView, layoutParams);
            frameLayout.setOnClickListener(new View$OnClickListenerC37551a(this, imageView, layoutParams));
            return frameLayout;
        }

        /* renamed from: b */
        public boolean isContentSame(IFilterItem eVar) {
            if (!(eVar instanceof FilterHolder)) {
                return false;
            }
            if (Intrinsics.areEqual(this, eVar)) {
                return true;
            }
            if (!(!Intrinsics.areEqual(mo137805e(), eVar.mo137805e())) && !(!Intrinsics.areEqual(this.f96285b, ((FilterHolder) eVar).f96285b))) {
                return true;
            }
            return false;
        }

        public FilterHolder(String str, Drawable drawable, OnTabClickListener fVar) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(drawable, "icon");
            this.f96284a = str;
            this.f96285b = drawable;
            this.f96286c = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB1\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0003H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\u0012\u00100\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00102\u001a\u00020)2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u00103\u001a\u00020\nH\u0016J\u001a\u00104\u001a\u0002052\u0006\u0010&\u001a\u00020'2\b\u00106\u001a\u0004\u0018\u00010%H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00067"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterItem;", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$IFilterItem;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "badgeCount", "", "tabListener", "Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "(Lcom/ss/android/lark/feed/app/entity/FeedFilter;ILcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "id", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/feed/app/entity/FeedFilter;ILcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "getDesc", "()Ljava/lang/String;", "getId", "getTabListener", "()Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;", "setTabListener", "(Lcom/ss/android/lark/feed/app/filter/data/FeedTabItemData$OnTabClickListener;)V", "getType", "()Lcom/ss/android/lark/feed/app/entity/FeedFilter;", "viewLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getViewLayoutParams", "()Landroid/widget/FrameLayout$LayoutParams;", "component1", "component2", "component3", "component4", "component5", "copy", "createTitleView", "Landroid/view/View;", "context", "Landroid/content/Context;", "equals", "", "other", "", "getCount", "getFeedFilter", "getItemType", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "updateTitleView", "", "itemView", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$d */
    public static final class FilterItem implements IFilterItem {

        /* renamed from: a */
        private final String f96290a;

        /* renamed from: b */
        private final String f96291b;

        /* renamed from: c */
        private final FeedFilter f96292c;

        /* renamed from: d */
        private int f96293d;

        /* renamed from: e */
        private OnTabClickListener f96294e;

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public int mo137797a() {
            return 1;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: b */
        public FeedFilter mo137801b() {
            return this.f96292c;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: c */
        public int mo137803c() {
            return this.f96293d;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: e */
        public String mo137805e() {
            return this.f96290a;
        }

        /* renamed from: f */
        public final String mo137817f() {
            return this.f96291b;
        }

        /* renamed from: g */
        public final FeedFilter mo137818g() {
            return this.f96292c;
        }

        /* renamed from: h */
        public final int mo137819h() {
            return this.f96293d;
        }

        /* renamed from: i */
        public OnTabClickListener mo137821i() {
            return this.f96294e;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: d */
        public FrameLayout.LayoutParams mo137804d() {
            return new FrameLayout.LayoutParams(-2, -1);
        }

        public int hashCode() {
            return this.f96292c.hashCode();
        }

        public String toString() {
            return "id " + mo137805e() + ", desc " + this.f96291b + ", badgeCount " + this.f96293d + ", type " + this.f96292c;
        }

        /* renamed from: a */
        public final void mo137812a(int i) {
            this.f96293d = i;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public void mo137799a(OnTabClickListener fVar) {
            this.f96294e = fVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$d$a */
        public static final class View$OnClickListenerC37552a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FilterItem f96295a;

            View$OnClickListenerC37552a(FilterItem dVar) {
                this.f96295a = dVar;
            }

            public final void onClick(View view) {
                OnTabClickListener i = this.f96295a.mo137821i();
                if (i != null) {
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    i.mo137826a(view, this.f96295a);
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof FilterItem) && this.f96292c == ((FilterItem) obj).f96292c) {
                return true;
            }
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/feed/app/filter/data/FeedTabItemData$FilterItem$createTitleView$detector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDoubleTap", "", "event", "Landroid/view/MotionEvent;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$d$c */
        public static final class C37554c extends GestureDetector.SimpleOnGestureListener {

            /* renamed from: a */
            final /* synthetic */ FilterItem f96297a;

            /* renamed from: b */
            final /* synthetic */ ColorTransPagerTitleView f96298b;

            public boolean onDoubleTap(MotionEvent motionEvent) {
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                if (!UIUtils.calcViewScreenLocation(this.f96298b).contains(motionEvent.getRawX(), motionEvent.getRawY())) {
                    return false;
                }
                OnTabClickListener i = this.f96297a.mo137821i();
                if (i == null) {
                    return true;
                }
                i.mo137827b(this.f96298b, this.f96297a);
                return true;
            }

            C37554c(FilterItem dVar, ColorTransPagerTitleView aVar) {
                this.f96297a = dVar;
                this.f96298b = aVar;
            }
        }

        /* renamed from: a */
        public boolean isItemSame(IFilterItem eVar) {
            return Intrinsics.areEqual(this, eVar);
        }

        /* renamed from: b */
        public boolean isContentSame(IFilterItem eVar) {
            if (!(eVar instanceof FilterItem) || (!Intrinsics.areEqual(mo137805e(), eVar.mo137805e()))) {
                return false;
            }
            FilterItem dVar = (FilterItem) eVar;
            if (!(!Intrinsics.areEqual(this.f96291b, dVar.f96291b)) && this.f96293d == dVar.f96293d && this.f96292c == dVar.f96292c) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.feed.app.filter.data.FeedTabItemData.IFilterItem
        /* renamed from: a */
        public View mo137798a(Context context) {
            Typeface typeface;
            Intrinsics.checkParameterIsNotNull(context, "context");
            ColorTransPagerTitleView aVar = new ColorTransPagerTitleView(context);
            aVar.setText(FeedTabItemData.f96282b.mo137796a(this.f96292c, this.f96293d));
            aVar.setTextSize(14.0f);
            aVar.setGravity(16);
            Context context2 = aVar.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "getContext()");
            aVar.setNormalColor(UDColorUtils.getColor(context2, R.color.text_caption));
            Context context3 = aVar.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "getContext()");
            aVar.setSelectedColor(UDColorUtils.getColor(context3, R.color.primary_pri_500));
            C37548b a = C37548b.m147657a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FilterStatusManager.inst()");
            if (a.mo137792b() == mo137801b()) {
                typeface = Typeface.create(Typeface.DEFAULT, 1);
            } else {
                typeface = Typeface.create(Typeface.DEFAULT, 0);
            }
            aVar.setTypeface(typeface);
            aVar.setOnClickListener(new View$OnClickListenerC37552a(this));
            aVar.setOnTouchListener(new View$OnTouchListenerC37553b(new GestureDetector(context, new C37554c(this, aVar))));
            return aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$d$b */
        public static final class View$OnTouchListenerC37553b implements View.OnTouchListener {

            /* renamed from: a */
            final /* synthetic */ GestureDetector f96296a;

            View$OnTouchListenerC37553b(GestureDetector gestureDetector) {
                this.f96296a = gestureDetector;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f96296a.onTouchEvent(motionEvent);
            }
        }

        /* renamed from: a */
        public void mo137813a(Context context, View view) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (view instanceof ColorTransPagerTitleView) {
                ((ColorTransPagerTitleView) view).setText(FeedTabItemData.f96282b.mo137796a(this.f96292c, this.f96293d));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FilterItem(com.ss.android.lark.feed.app.entity.FeedFilter r8, int r9, com.ss.android.lark.feed.app.filter.data.FeedTabItemData.OnTabClickListener r10) {
            /*
                r7 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                int r0 = r8.getValue()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r3 = r8.toString()
                com.ss.android.lark.feed.app.entity.FeedFilter r0 = com.ss.android.lark.feed.app.entity.FeedFilter.INBOX
                if (r8 == r0) goto L_0x0020
                com.ss.android.lark.feed.app.entity.FeedFilter r0 = com.ss.android.lark.feed.app.entity.FeedFilter.DONE
                if (r8 == r0) goto L_0x0020
                com.ss.android.lark.feed.app.entity.FeedFilter r0 = com.ss.android.lark.feed.app.entity.FeedFilter.MESSAGE
                if (r8 != r0) goto L_0x001e
                goto L_0x0020
            L_0x001e:
                r5 = r9
                goto L_0x0022
            L_0x0020:
                r9 = 0
                r5 = 0
            L_0x0022:
                r1 = r7
                r4 = r8
                r6 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.filter.data.FeedTabItemData.FilterItem.<init>(com.ss.android.lark.feed.app.entity.FeedFilter, int, com.ss.android.lark.feed.app.filter.data.FeedTabItemData$f):void");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FilterItem(FeedFilter feedFilter, int i, OnTabClickListener fVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(feedFilter, i, (i2 & 4) != 0 ? null : fVar);
        }

        public FilterItem(String str, String str2, FeedFilter feedFilter, int i, OnTabClickListener fVar) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "desc");
            Intrinsics.checkParameterIsNotNull(feedFilter, ShareHitPoint.f121869d);
            this.f96290a = str;
            this.f96291b = str2;
            this.f96292c = feedFilter;
            this.f96293d = i;
            this.f96294e = fVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/samskivert/mustache/Template;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.FeedTabItemData$b */
    static final class C37550b extends Lambda implements Function0<C27059e> {
        public static final C37550b INSTANCE = new C37550b();

        C37550b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C27059e invoke() {
            return C27035d.m98270a().mo96184a(false).mo96186a(UIUtils.getString(UIHelper.getContext(), R.string.Lark_Feed_MessageTypeUnreadNumber));
        }
    }
}
