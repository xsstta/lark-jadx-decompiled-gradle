package com.larksuite.component.universe_design.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.animation.UDAnimation;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b&\b\u0016\u0018\u0000 ¿\u00012\u00020\u0001:\n¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020#J\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u000209J\u0016\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020\u0014J\u0016\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020\tJ\u001e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u0014J\u0014\u0010=\u001a\u00020;2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090AJ\u0010\u0010B\u001a\u00020;2\u0006\u0010C\u001a\u00020DH\u0002J \u0010E\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u0014H\u0002J\u0018\u0010F\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020\tH\u0002J\u0018\u0010G\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0006\u0010?\u001a\u00020\u0014H\u0002J\u0010\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020JH\u0016J\u001a\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0018\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020J2\u0006\u0010M\u001a\u00020\tH\u0016J\"\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020J2\u0006\u0010M\u001a\u00020\t2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J \u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010O\u001a\u00020\tH\u0016J\u0010\u0010P\u001a\u00020;2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010Q\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\"\u0010R\u001a\u00020;2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010S\u001a\u00020;H\u0002J\b\u0010T\u001a\u00020;H\u0002J\u0018\u0010U\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\u001c\u0010Y\u001a\u00020%2\b\b\u0001\u0010Z\u001a\u00020\t2\b\b\u0001\u0010[\u001a\u00020\tH\u0002J\u0010\u0010\\\u001a\u00020;2\u0006\u0010]\u001a\u00020\tH\u0002J\u0010\u0010^\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010_\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010`\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\"\u0010a\u001a\u00020;2\u0017\u0010b\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020;0c¢\u0006\u0002\bdH\bJ\b\u0010e\u001a\u00020\u000eH\u0002J\b\u0010f\u001a\u0004\u0018\u00010gJ\u0006\u0010h\u001a\u00020\tJ\u000e\u0010i\u001a\u0002092\u0006\u0010@\u001a\u00020\tJ\u0006\u0010j\u001a\u00020%J\u0006\u0010k\u001a\u00020\tJ\b\u0010l\u001a\u00020\tH\u0007J\u0006\u0010m\u001a\u00020%J\u0006\u0010n\u001a\u00020\tJ\b\u0010o\u001a\u00020\tH\u0007J\u0006\u0010p\u001a\u00020%J\r\u0010q\u001a\u00020;H\u0000¢\u0006\u0002\brJ\u0006\u0010s\u001a\u00020\u0014J\u0006\u0010t\u001a\u00020\u0014J\u0006\u0010u\u001a\u00020\u0014J\u0006\u0010v\u001a\u000209J\u0010\u0010w\u001a\u00020;2\u0006\u0010x\u001a\u00020yH\u0016J0\u0010z\u001a\u00020;2\u0006\u0010{\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010\u001a\u00020\tH\u0014J\u001b\u0010\u0001\u001a\u00020;2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0014J+\u0010\u0001\u001a\u00020;2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0014J\u0007\u0010\u0001\u001a\u00020;J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010<\u001a\u00020#J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010>\u001a\u000209J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\tJ\u0011\u0010\u0001\u001a\u00020;2\u0006\u0010>\u001a\u000209H\u0002J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010>\u001a\u000209J \u0010\u0001\u001a\u00020;2\u0006\u0010>\u001a\u0002092\u0007\u0010\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b\u0001J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\tJ \u0010\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b\u0001J\u001c\u0010\u0001\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u0001092\u0007\u0010\u0001\u001a\u00020\u0014H\u0002J\u0010\u0010\u0001\u001a\u00020;2\u0007\u0010\u0001\u001a\u00020\u0014J\u0010\u0010\u0001\u001a\u00020;2\u0007\u0010\u0001\u001a\u00020\u0014J\u0012\u0010\u0001\u001a\u00020;2\t\b\u0001\u0010\u0001\u001a\u00020\tJ\u0012\u0010\u0001\u001a\u00020;2\t\u0010\u0001\u001a\u0004\u0018\u00010gJ\u0012\u0010\u0001\u001a\u00020;2\t\b\u0001\u0010\u0001\u001a\u00020\tJ\u0010\u0010\u0001\u001a\u00020;2\u0007\u0010\u0001\u001a\u00020\u0014J\u000f\u0010\u0001\u001a\u00020;2\u0006\u0010O\u001a\u00020\tJ\u0011\u0010\u0001\u001a\u00020;2\b\u0010\u0001\u001a\u00030\u0001J1\u0010\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020\t2\u0006\u0010V\u001a\u00020W2\u0007\u0010 \u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b¡\u0001J\u0012\u0010¢\u0001\u001a\u00020;2\t\b\u0001\u0010\u0001\u001a\u00020\tJ\u0012\u0010£\u0001\u001a\u00020;2\t\b\u0001\u0010¤\u0001\u001a\u00020\tJ\u0010\u0010¥\u0001\u001a\u00020;2\u0007\u0010¦\u0001\u001a\u00020%J\u0011\u0010§\u0001\u001a\u00020;2\b\b\u0001\u0010&\u001a\u00020\tJ\u0012\u0010¨\u0001\u001a\u00020;2\t\b\u0001\u0010©\u0001\u001a\u00020\tJ\u0012\u0010ª\u0001\u001a\u00020;2\t\b\u0001\u0010«\u0001\u001a\u00020\tJ\u0010\u0010¬\u0001\u001a\u00020;2\u0007\u0010­\u0001\u001a\u00020%J\u001b\u0010¬\u0001\u001a\u00020;2\b\b\u0001\u0010Z\u001a\u00020\t2\b\b\u0001\u0010[\u001a\u00020\tJ\u0012\u0010®\u0001\u001a\u00020;2\t\b\u0001\u0010¯\u0001\u001a\u00020\tJ\u0011\u0010°\u0001\u001a\u00020;2\b\b\u0001\u0010.\u001a\u00020\tJ3\u0010±\u0001\u001a\u00020;2\t\b\u0001\u0010²\u0001\u001a\u00020\t2\t\b\u0001\u0010³\u0001\u001a\u00020\t2\t\b\u0001\u0010´\u0001\u001a\u00020\t2\t\b\u0001\u0010µ\u0001\u001a\u00020\tJ\u0012\u0010¶\u0001\u001a\u00020;2\t\b\u0001\u0010\u0001\u001a\u00020\tJ\u0012\u0010·\u0001\u001a\u00020;2\t\b\u0001\u0010¤\u0001\u001a\u00020\tJ\u0010\u0010¸\u0001\u001a\u00020;2\u0007\u0010¦\u0001\u001a\u00020%J\u001b\u0010¸\u0001\u001a\u00020;2\b\b\u0001\u0010Z\u001a\u00020\t2\b\b\u0001\u0010[\u001a\u00020\tJ\u0012\u0010¹\u0001\u001a\u00020;2\u0007\u0010º\u0001\u001a\u00020\tH\u0002J\t\u0010»\u0001\u001a\u00020;H\u0002J\u0012\u0010¼\u0001\u001a\u00020;2\u0007\u0010½\u0001\u001a\u00020\tH\u0002J\t\u0010¾\u0001\u001a\u00020;H\u0002R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010.\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b/\u0010(R\u0012\u00100\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\"X\u0004¢\u0006\u0002\n\u0000¨\u0006Ä\u0001"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomDividerDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getBottomDividerDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "bottomDividerDrawable$delegate", "Lkotlin/Lazy;", "bottomDividerEnabled", "", "edgeShadowDrawable", "edgeShadowEnable", "edgeShadowShow", "indicator", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$UDTabIndicator;", "indicatorAnimatorDuration", "", "indicatorFullWidth", "scrollAnimator", "Landroid/animation/ValueAnimator;", "scrollBounds", "Landroid/graphics/Rect;", "selectedListeners", "", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "tabBackgroundColors", "Landroid/content/res/ColorStateList;", "tabGravity", "tabGravity$annotations", "()V", "tabIconTintColors", "tabLayoutPaddingStart", "tabMargin", "tabMaxWidth", "tabMinWidth", "tabMode", "tabMode$annotations", "tabMultiLineTitleTextSize", "tabPaddingBottom", "tabPaddingEnd", "tabPaddingStart", "tabPaddingTop", "tabTitleColors", "tabTitleTextAppearance", "tabTitleTextSize", "tabs", "Lcom/larksuite/component/universe_design/tab/UDTab;", "addOnTabSelectedListener", "", "listener", "addTab", "tab", "setSelected", "position", "", "addTabFromItemView", "itemView", "Lcom/larksuite/component/universe_design/tab/UDTabItem;", "addTabInternal", "addTabToList", "addTabView", "addView", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "addViewInternal", "animateToTab", "applyAttrs", "applyTabGravity", "applyTabMode", "calculateScrollXForTab", "offset", "", "configureTabStyle", "createColorStateList", "normalColor", "selectedColor", "dispatchSelectState", "selectedPosition", "dispatchTabReselected", "dispatchTabSelected", "dispatchTabUnselected", "forEachListenersReverse", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "generateEdgeShadowDrawable", "getIndicatorDrawable", "Landroid/graphics/drawable/Drawable;", "getSelectPosition", "getTabAt", "getTabBackgroundColors", "getTabCount", "getTabGravity", "getTabIconTintColor", "getTabMargin", "getTabMode", "getTabTitleColors", "invaliIndicator", "invaliIndicator$universe_ui_tab_release", "isBottomDividerEnabled", "isEdgeShadowEnabled", "isIndicatorFullWidth", "newTab", "onDrawForeground", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onScrollChanged", "oldl", "oldt", "removeAllTabs", "removeOnTabSelectedListener", "removeTab", "removeTabAt", "removeTabInternal", "selectTab", "updateIndicator", "selectTab$universe_ui_tab_release", "selectTabAt", "selectTabAt$universe_ui_tab_release", "selectTabInternal", "setBottomDividerEnabled", "enable", "setEdgeShadowEnabled", "setIndicatorColor", "color", "setIndicatorDrawable", "drawable", "drawableRes", "setIndicatorFullWidth", "fullWidth", "setIndicatorHeight", "setIndicatorInterpolator", "indicatorInterpolator", "Lcom/larksuite/component/universe_design/tab/UDTabIndicatorInterpolator;", "setScrollPosition", "updateSelectedText", "setScrollPosition$universe_ui_tab_release", "setTabBackgroundColor", "setTabBackgroundColorResource", "colorRes", "setTabBackgroundColors", "colors", "setTabGravity", "setTabIconTintColor", "tintColor", "setTabIconTintColorResource", "tintRes", "setTabIconTintColors", "tint", "setTabMargin", "margin", "setTabMode", "setTabPadding", "paddingStart", "paddingTop", "paddingEnd", "paddingBottom", "setTabTitleColor", "setTabTitleColorResource", "setTabTitleColors", "setupTabMaxWidth", "maxWidth", "updateEdgeShadow", "updateTabsPosition", "startPosition", "updateTabsStyle", "Companion", "OnTabSelectedListener", "TabGravity", "TabMode", "UDTabIndicator", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDTabLayout extends HorizontalScrollView {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private final Lazy bottomDividerDrawable$delegate;
    private boolean bottomDividerEnabled;
    private GradientDrawable edgeShadowDrawable;
    private boolean edgeShadowEnable;
    private boolean edgeShadowShow;
    private final UDTabIndicator indicator;
    public long indicatorAnimatorDuration;
    private boolean indicatorFullWidth;
    private ValueAnimator scrollAnimator;
    private final Rect scrollBounds;
    public final List<OnTabSelectedListener> selectedListeners;
    private ColorStateList tabBackgroundColors;
    private int tabGravity;
    private ColorStateList tabIconTintColors;
    private int tabLayoutPaddingStart;
    private int tabMargin;
    private int tabMaxWidth;
    private int tabMinWidth;
    private int tabMode;
    private int tabMultiLineTitleTextSize;
    private int tabPaddingBottom;
    private int tabPaddingEnd;
    private int tabPaddingStart;
    private int tabPaddingTop;
    private ColorStateList tabTitleColors;
    private int tabTitleTextAppearance;
    private int tabTitleTextSize;
    private final List<UDTab> tabs;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$TabGravity;", "", "Companion", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TabGravity {
        public static final Companion Companion = Companion.f63589a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$TabGravity$Companion;", "", "()V", "CENTER", "", "FILL", "START", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$TabGravity$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f63589a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$TabMode;", "", "Companion", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TabMode {
        public static final Companion Companion = Companion.f63590a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$TabMode$Companion;", "", "()V", "AUTO", "", "FIXED", "SCROLLABLE", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$TabMode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f63590a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$b */
    public interface OnTabSelectedListener {
        /* renamed from: a */
        void mo53906a(UDTab bVar);

        /* renamed from: b */
        void mo53907b(UDTab bVar);

        /* renamed from: c */
        void mo53908c(UDTab bVar);
    }

    private final GradientDrawable getBottomDividerDrawable() {
        return (GradientDrawable) this.bottomDividerDrawable$delegate.getValue();
    }

    @TabGravity
    private static /* synthetic */ void tabGravity$annotations() {
    }

    @TabMode
    private static /* synthetic */ void tabMode$annotations() {
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$Companion;", "", "()V", "NO_POSITION", "", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J\u001d\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u000206H\u0000¢\u0006\u0002\b7J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0002J\r\u0010 \u001a\u00020/H\u0000¢\u0006\u0002\b;J\u0010\u0010<\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0014J0\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000fH\u0014J\u0018\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000fH\u0014J\u0015\u0010F\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\bGJ\u0016\u0010H\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010I\u001a\u00020!J\u000e\u0010J\u001a\u00020/2\u0006\u00104\u001a\u00020\u000fJ\u001e\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u001bJ\u0010\u0010N\u001a\u00020!2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020!H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R,\u0010%\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8\u0006@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R,\u0010*\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8\u0006@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013¨\u0006R"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayout$UDTabIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;Landroid/content/Context;)V", "indicatorAnimator", "Landroid/animation/ValueAnimator;", "value", "Landroid/graphics/drawable/Drawable;", "indicatorDrawable", "getIndicatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setIndicatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "indicatorHeight", "", "getIndicatorHeight", "()I", "setIndicatorHeight", "(I)V", "indicatorInterpolator", "Lcom/larksuite/component/universe_design/tab/UDTabIndicatorInterpolator;", "getIndicatorInterpolator", "()Lcom/larksuite/component/universe_design/tab/UDTabIndicatorInterpolator;", "setIndicatorInterpolator", "(Lcom/larksuite/component/universe_design/tab/UDTabIndicatorInterpolator;)V", "indicatorOffset", "", "getIndicatorOffset", "()F", "setIndicatorOffset", "(F)V", "invaliIndicator", "", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "tabGravity", "tabGravity$annotations", "()V", "getTabGravity", "setTabGravity", "tabMode", "tabMode$annotations", "getTabMode", "setTabMode", "addTab", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "addTab$universe_ui_tab_release", "animateIndicatorTo", "position", "duration", "", "animateIndicatorTo$universe_ui_tab_release", "drawIndicator", "canvas", "Landroid/graphics/Canvas;", "invaliIndicator$universe_ui_tab_release", "onDraw", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "removeTab", "removeTab$universe_ui_tab_release", "selectTab", "needAnimate", "setIndicatorPosition", "startPosition", "endPosition", "offset", "updateChildLayoutParams", "layoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "updateChildren", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$c */
    public final class UDTabIndicator extends LinearLayout {

        /* renamed from: a */
        final /* synthetic */ UDTabLayout f63591a;

        /* renamed from: b */
        private Drawable f63592b;

        /* renamed from: c */
        private int f63593c = 2;

        /* renamed from: d */
        private int f63594d = 1;

        /* renamed from: e */
        private int f63595e = -1;

        /* renamed from: f */
        private float f63596f;

        /* renamed from: g */
        private UDTabIndicatorInterpolator f63597g = new UDTabIndicatorInterpolator();

        /* renamed from: h */
        private int f63598h = -1;

        /* renamed from: i */
        private ValueAnimator f63599i;

        /* renamed from: j */
        private boolean f63600j;

        /* renamed from: c */
        public final void mo91310c() {
            this.f63600j = true;
        }

        /* renamed from: a */
        public final Drawable mo91298a() {
            return this.f63592b;
        }

        /* renamed from: b */
        public final int mo91307b() {
            return this.f63595e;
        }

        /* renamed from: a */
        public final void mo91306a(UDTabIndicatorInterpolator cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "<set-?>");
            this.f63597g = cVar;
        }

        /* renamed from: d */
        private final boolean m92989d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    m92988a((LinearLayout.LayoutParams) layoutParams);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo91312d(int i) {
            this.f63598h = i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayout$UDTabIndicator$animateIndicatorTo$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$c$b */
        public static final class C25775b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ UDTabIndicator f63606a;

            /* renamed from: b */
            final /* synthetic */ long f63607b;

            /* renamed from: c */
            final /* synthetic */ int f63608c;

            /* renamed from: d */
            final /* synthetic */ int f63609d;

            public void onAnimationEnd(Animator animator) {
                this.f63606a.mo91299a(BitmapDescriptorFactory.HUE_RED);
            }

            public void onAnimationStart(Animator animator) {
                Intrinsics.checkParameterIsNotNull(animator, "animation");
                this.f63606a.mo91311c(this.f63609d);
            }

            C25775b(UDTabIndicator cVar, long j, int i, int i2) {
                this.f63606a = cVar;
                this.f63607b = j;
                this.f63608c = i;
                this.f63609d = i2;
            }
        }

        /* renamed from: a */
        public final void mo91299a(float f) {
            this.f63596f = f;
        }

        /* renamed from: c */
        public final void mo91311c(int i) {
            this.f63595e = i;
        }

        /* renamed from: a */
        public final void mo91300a(int i) {
            this.f63593c = i;
            if (m92989d()) {
                requestLayout();
            }
        }

        /* renamed from: b */
        public final void mo91308b(int i) {
            this.f63594d = i;
            if (m92989d()) {
                requestLayout();
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            super.onDraw(canvas);
            m92987a(canvas);
        }

        /* renamed from: b */
        public final void mo91309b(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            removeView(bVar.mo91341c());
            m92989d();
            mo91310c();
        }

        /* renamed from: e */
        public final void mo91313e(int i) {
            Drawable drawable = this.f63592b;
            if (drawable != null) {
                this.f63597g.mo91350a(this.f63591a, getChildAt(i), drawable);
                invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/larksuite/component/universe_design/tab/UDTabLayout$UDTabIndicator$animateIndicatorTo$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$c$a */
        public static final class C25774a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ ValueAnimator f63601a;

            /* renamed from: b */
            final /* synthetic */ UDTabIndicator f63602b;

            /* renamed from: c */
            final /* synthetic */ long f63603c;

            /* renamed from: d */
            final /* synthetic */ int f63604d;

            /* renamed from: e */
            final /* synthetic */ int f63605e;

            C25774a(ValueAnimator valueAnimator, UDTabIndicator cVar, long j, int i, int i2) {
                this.f63601a = valueAnimator;
                this.f63602b = cVar;
                this.f63603c = j;
                this.f63604d = i;
                this.f63605e = i2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UDTabIndicator cVar = this.f63602b;
                int i = this.f63604d;
                int i2 = this.f63605e;
                ValueAnimator valueAnimator2 = this.f63601a;
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "this");
                cVar.mo91301a(i, i2, valueAnimator2.getAnimatedFraction());
                UDTabIndicator cVar2 = this.f63602b;
                ValueAnimator valueAnimator3 = this.f63601a;
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator3, "this");
                cVar2.mo91299a(valueAnimator3.getAnimatedFraction());
            }
        }

        /* renamed from: a */
        private final void m92987a(Canvas canvas) {
            Drawable drawable = this.f63592b;
            if (drawable != null) {
                int i = this.f63598h;
                if (i <= 0) {
                    i = drawable.getIntrinsicHeight();
                }
                if (i > 0) {
                    drawable.setBounds(drawable.getBounds().left, getHeight() - i, drawable.getBounds().right, getHeight());
                    drawable.draw(canvas);
                }
            }
        }

        /* renamed from: a */
        private final boolean m92988a(LinearLayout.LayoutParams layoutParams) {
            boolean z = false;
            boolean z2 = true;
            if (this.f63594d == 1 && this.f63593c == 1) {
                if (layoutParams.weight == 1.0f || layoutParams.width == 0) {
                    z2 = false;
                }
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                return z2;
            }
            if (!(layoutParams.weight == BitmapDescriptorFactory.HUE_RED || layoutParams.width == -2)) {
                z = true;
            }
            layoutParams.width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            return z;
        }

        /* renamed from: a */
        public final void mo91303a(Drawable drawable) {
            this.f63592b = drawable;
            mo91310c();
            requestLayout();
        }

        /* renamed from: a */
        public final void mo91304a(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            addView(bVar.mo91341c(), bVar.mo91343d());
            m92989d();
            mo91310c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UDTabIndicator(UDTabLayout uDTabLayout, Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f63591a = uDTabLayout;
            this.f63592b = UDIconUtils.getIconDrawable(context, R.drawable.ud_tab_indicator);
            setWillNotDraw(false);
        }

        /* renamed from: a */
        public final void mo91302a(int i, long j) {
            ValueAnimator valueAnimator;
            ValueAnimator valueAnimator2 = this.f63599i;
            if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.f63599i) == null)) {
                valueAnimator.cancel();
            }
            int i2 = this.f63595e;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "this");
            ofFloat.setInterpolator(UDAnimation.Interpolator.m92368a());
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new C25774a(ofFloat, this, j, i2, i));
            ofFloat.addListener(new C25775b(this, j, i2, i));
            ofFloat.start();
            this.f63599i = ofFloat;
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            boolean z;
            boolean z2;
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                if (this.f63593c == 2 && this.f63594d == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                        i3 += childAt.getMeasuredWidth();
                    }
                    if (i3 <= getMeasuredWidth()) {
                        int childCount2 = getChildCount();
                        z2 = false;
                        for (int i5 = 0; i5 < childCount2; i5++) {
                            View childAt2 = getChildAt(i5);
                            Intrinsics.checkExpressionValueIsNotNull(childAt2, "child");
                            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                            if (layoutParams != null) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                if (layoutParams2.weight != 1.0f || layoutParams.width != 0) {
                                    layoutParams2.weight = 1.0f;
                                    layoutParams.width = 0;
                                    z2 = true;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                    } else {
                        z2 = m92989d();
                    }
                    if (z2) {
                        super.onMeasure(i, i2);
                    }
                }
                if (this.f63594d == 0) {
                    int childCount3 = getChildCount();
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt3 = getChildAt(i8);
                        Intrinsics.checkExpressionValueIsNotNull(childAt3, "child");
                        if (childAt3.getVisibility() == 0) {
                            i6 = Math.max(i6, childAt3.getMeasuredWidth());
                            i7++;
                        }
                    }
                    if (i7 * i6 > getMeasuredWidth()) {
                        mo91308b(1);
                        z = m92989d();
                    } else {
                        int childCount4 = getChildCount();
                        boolean z3 = false;
                        for (int i9 = 0; i9 < childCount4; i9++) {
                            View childAt4 = getChildAt(i9);
                            Intrinsics.checkExpressionValueIsNotNull(childAt4, "child");
                            ViewGroup.LayoutParams layoutParams3 = childAt4.getLayoutParams();
                            if (layoutParams3 != null) {
                                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                if (layoutParams3.width != i6 || layoutParams4.weight != BitmapDescriptorFactory.HUE_RED) {
                                    layoutParams3.width = i6;
                                    layoutParams4.weight = BitmapDescriptorFactory.HUE_RED;
                                    z3 = true;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                        z = z3;
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo91305a(UDTab bVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            int d = bVar.mo91343d();
            if (z) {
                mo91302a(d, this.f63591a.indicatorAnimatorDuration);
                return;
            }
            this.f63595e = d;
            mo91313e(d);
            invalidate();
        }

        /* renamed from: a */
        public final void mo91301a(int i, int i2, float f) {
            Drawable drawable = this.f63592b;
            if (drawable != null) {
                this.f63597g.mo91351a(this.f63591a, getChildAt(i), getChildAt(i2), f, drawable);
                postInvalidateOnAnimation();
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f63599i;
            if (((valueAnimator == null || !valueAnimator.isRunning()) && z) || this.f63600j) {
                int i5 = this.f63595e;
                mo91301a(i5, i5 + 1, this.f63596f);
                this.f63600j = false;
            }
        }
    }

    @TabGravity
    public final int getTabGravity() {
        return this.tabGravity;
    }

    public final int getTabMargin() {
        return this.tabMargin;
    }

    @TabMode
    public final int getTabMode() {
        return this.tabMode;
    }

    public final boolean isBottomDividerEnabled() {
        return this.bottomDividerEnabled;
    }

    public final boolean isEdgeShadowEnabled() {
        return this.edgeShadowEnable;
    }

    public final boolean isIndicatorFullWidth() {
        return this.indicatorFullWidth;
    }

    public final Drawable getIndicatorDrawable() {
        return this.indicator.mo91298a();
    }

    public final int getSelectPosition() {
        return this.indicator.mo91307b();
    }

    public final int getTabCount() {
        return this.tabs.size();
    }

    public final void invaliIndicator$universe_ui_tab_release() {
        this.indicator.mo91310c();
    }

    public final ColorStateList getTabBackgroundColors() {
        ColorStateList colorStateList = this.tabBackgroundColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        return colorStateList;
    }

    public final ColorStateList getTabIconTintColor() {
        ColorStateList colorStateList = this.tabIconTintColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabIconTintColors");
        }
        return colorStateList;
    }

    public final ColorStateList getTabTitleColors() {
        ColorStateList colorStateList = this.tabTitleColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabTitleColors");
        }
        return colorStateList;
    }

    public final void removeAllTabs() {
        this.tabs.clear();
        this.indicator.removeAllViews();
        selectTabAt(-1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$e */
    static final class C25777e extends Lambda implements Function0<GradientDrawable> {
        final /* synthetic */ UDTabLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25777e(UDTabLayout uDTabLayout) {
            super(0);
            this.this$0 = uDTabLayout;
        }

        @Override // kotlin.jvm.functions.Function0
        public final GradientDrawable invoke() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            gradientDrawable.setColor(UDColorUtils.getColor(context, R.color.line_divider_default));
            return gradientDrawable;
        }
    }

    private final void applyTabMode() {
        this.indicator.mo91300a(this.tabMode);
        if (isLaidOut()) {
            updateTabsStyle();
            this.indicator.mo91310c();
        }
    }

    public final UDTab newTab() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        UDTab bVar = new UDTab(context);
        configureTabStyle(bVar);
        return bVar;
    }

    private final void applyTabGravity() {
        this.indicator.mo91308b(this.tabGravity);
        int i = this.tabGravity;
        if (i == 0 || i == 1) {
            this.indicator.setGravity(17);
        } else if (i == 2) {
            this.indicator.setGravity(8388611);
        }
        this.indicator.mo91310c();
        if (isLaidOut()) {
            updateTabsStyle();
        }
    }

    private final GradientDrawable generateEdgeShadowDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        int[] iArr = new int[2];
        ColorStateList colorStateList = this.tabBackgroundColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        iArr[0] = UDColorUtils.getAlphaColor(colorStateList.getDefaultColor(), BitmapDescriptorFactory.HUE_RED);
        ColorStateList colorStateList2 = this.tabBackgroundColors;
        if (colorStateList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        iArr[1] = colorStateList2.getDefaultColor();
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    private final void updateTabsStyle() {
        for (UDTab bVar : this.tabs) {
            configureTabStyle(bVar);
        }
        ColorStateList colorStateList = this.tabBackgroundColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        setBackgroundColor(colorStateList.getDefaultColor());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (((r0.getRight() - r0.getPaddingRight()) - getScrollX()) <= r4.scrollBounds.right) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateEdgeShadow() {
        /*
            r4 = this;
            boolean r0 = r4.edgeShadowEnable
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.larksuite.component.universe_design.tab.UDTabLayout$c r0 = r4.indicator
            int r0 = r0.getWidth()
            int r1 = r4.getWidth()
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L_0x0046
            com.larksuite.component.universe_design.tab.UDTabLayout$c r0 = r4.indicator
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x0045
            com.larksuite.component.universe_design.tab.UDTabLayout$c r0 = r4.indicator
            int r1 = r0.getChildCount()
            int r1 = r1 - r2
            android.view.View r0 = r0.getChildAt(r1)
            android.graphics.Rect r1 = r4.scrollBounds
            r4.getHitRect(r1)
            java.lang.String r1 = "lastTabView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r0.getRight()
            int r0 = r0.getPaddingRight()
            int r1 = r1 - r0
            int r0 = r4.getScrollX()
            int r1 = r1 - r0
            android.graphics.Rect r0 = r4.scrollBounds
            int r0 = r0.right
            if (r1 > r0) goto L_0x0047
            goto L_0x0046
        L_0x0045:
            return
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r4.setWillNotDraw(r3)
        L_0x004c:
            boolean r0 = r4.edgeShadowShow
            if (r2 == r0) goto L_0x0055
            r4.edgeShadowShow = r2
            r4.invalidate()
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.tab.UDTabLayout.updateEdgeShadow():void");
    }

    public UDTabLayout(Context context) {
        this(context, null);
    }

    public final void selectTabAt(int i) {
        selectTabAt$universe_ui_tab_release(i, true);
    }

    public final void setTabGravity(@TabGravity int i) {
        this.tabGravity = i;
        applyTabGravity();
    }

    public final void setTabMargin(int i) {
        this.tabMargin = i;
        updateTabsStyle();
    }

    public final void setTabMode(@TabMode int i) {
        this.tabMode = i;
        applyTabMode();
    }

    public final void addOnTabSelectedListener(OnTabSelectedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.selectedListeners.add(bVar);
    }

    public final void addTab(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        addTab(bVar, this.tabs.isEmpty());
    }

    public void addView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInternal(view);
    }

    public final UDTab getTabAt(int i) {
        return this.tabs.get(i);
    }

    public final void removeOnTabSelectedListener(OnTabSelectedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.selectedListeners.remove(bVar);
    }

    public final void removeTab(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        removeTabInternal(bVar);
    }

    public final void selectTab(UDTab bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        selectTab$universe_ui_tab_release(bVar, true);
    }

    public final void setBottomDividerEnabled(boolean z) {
        if (this.bottomDividerEnabled != z) {
            this.bottomDividerEnabled = z;
            invalidate();
        }
    }

    public final void setEdgeShadowEnabled(boolean z) {
        if (this.edgeShadowEnable != z) {
            this.edgeShadowEnable = z;
            updateEdgeShadow();
        }
    }

    public final void setIndicatorDrawable(Drawable drawable) {
        this.indicator.mo91303a(drawable);
        this.indicator.invalidate();
    }

    public final void setIndicatorFullWidth(boolean z) {
        this.indicatorFullWidth = z;
        UDTabIndicator cVar = this.indicator;
        cVar.mo91313e(cVar.mo91307b());
    }

    public final void setIndicatorHeight(int i) {
        this.indicator.mo91312d(i);
        this.indicator.invalidate();
    }

    public final void setIndicatorInterpolator(UDTabIndicatorInterpolator cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "indicatorInterpolator");
        this.indicator.mo91306a(cVar);
    }

    public final void setTabBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "ColorStateList.valueOf(color)");
        setTabBackgroundColors(valueOf);
    }

    public final void setTabIconTintColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "ColorStateList.valueOf(tintColor)");
        this.tabIconTintColors = valueOf;
        updateTabsStyle();
    }

    public final void setTabTitleColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "ColorStateList.valueOf(color)");
        this.tabTitleColors = valueOf;
        updateTabsStyle();
    }

    private final void addViewInternal(View view) {
        if (view instanceof UDTabItem) {
            addTabFromItemView((UDTabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only UDTabItem instances can be added to UDTabLayout.".toString());
    }

    private final void dispatchSelectState(int i) {
        boolean z;
        int size = this.tabs.size();
        for (int i2 = 0; i2 < size; i2++) {
            UDTab bVar = this.tabs.get(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo91337a(z);
        }
    }

    private final void dispatchTabReselected(UDTab bVar) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.selectedListeners); lastIndex >= 0; lastIndex--) {
            this.selectedListeners.get(lastIndex).mo53906a(bVar);
        }
    }

    private final void dispatchTabSelected(UDTab bVar) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.selectedListeners); lastIndex >= 0; lastIndex--) {
            this.selectedListeners.get(lastIndex).mo53908c(bVar);
        }
    }

    private final void dispatchTabUnselected(UDTab bVar) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.selectedListeners); lastIndex >= 0; lastIndex--) {
            this.selectedListeners.get(lastIndex).mo53907b(bVar);
        }
    }

    private final void forEachListenersReverse(Function1<? super OnTabSelectedListener, Unit> function1) {
        for (int lastIndex = CollectionsKt.getLastIndex(this.selectedListeners); lastIndex >= 0; lastIndex--) {
            function1.invoke(this.selectedListeners.get(lastIndex));
        }
    }

    private final void updateTabsPosition(int i) {
        int size = this.tabs.size();
        while (i < size) {
            this.tabs.get(i).mo91330a(i);
            i++;
        }
    }

    public final void removeTabAt(int i) {
        if (i >= 0 && i < this.tabs.size()) {
            removeTab(this.tabs.get(i));
        }
    }

    public final void setIndicatorColor(int i) {
        Drawable a = this.indicator.mo91298a();
        if (a != null) {
            a.mutate();
            a.setTint(i);
        }
        this.indicator.invalidate();
    }

    public final void setIndicatorDrawable(int i) {
        UDTabIndicator cVar = this.indicator;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        cVar.mo91303a(UDIconUtils.getIconDrawable(context, i));
        this.indicator.invalidate();
    }

    public final void setTabBackgroundColorResource(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setTabBackgroundColors(UDColorUtils.getColorStateList(context, i));
    }

    public final void setTabIconTintColorResource(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.tabIconTintColors = UDColorUtils.getColorStateList(context, i);
        updateTabsStyle();
    }

    public final void setTabIconTintColors(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "tint");
        this.tabIconTintColors = colorStateList;
        updateTabsStyle();
    }

    public final void setTabTitleColorResource(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        this.tabTitleColors = UDColorUtils.getColorStateList(context, i);
        updateTabsStyle();
    }

    public final void setTabTitleColors(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        this.tabTitleColors = colorStateList;
        updateTabsStyle();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/larksuite/component/universe_design/tab/UDTabLayout$animateToTab$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayout$d */
    public static final class C25776d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f63610a;

        /* renamed from: b */
        final /* synthetic */ UDTabLayout f63611b;

        C25776d(ValueAnimator valueAnimator, UDTabLayout uDTabLayout) {
            this.f63610a = valueAnimator;
            this.f63611b = uDTabLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            UDTabLayout uDTabLayout = this.f63611b;
            ValueAnimator valueAnimator2 = this.f63610a;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, "this");
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                uDTabLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    private final void animateToTab(UDTab bVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), calculateScrollXForTab(bVar.mo91343d(), BitmapDescriptorFactory.HUE_RED));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "this");
        ofInt.setInterpolator(UDAnimation.Interpolator.m92368a());
        ofInt.setDuration(this.indicatorAnimatorDuration);
        ofInt.addUpdateListener(new C25776d(ofInt, this));
        ofInt.start();
        this.scrollAnimator = ofInt;
    }

    private final void removeTabInternal(UDTab bVar) {
        if (bVar.mo91343d() == this.indicator.mo91307b()) {
            if (this.tabs.isEmpty()) {
                selectTabAt(-1);
            } else {
                selectTabAt(Math.max(0, bVar.mo91343d() - 1));
            }
        }
        this.tabs.remove(bVar);
        this.indicator.mo91309b(bVar);
        updateTabsPosition(bVar.mo91343d());
    }

    private final void setupTabMaxWidth(int i) {
        if (i != this.tabMaxWidth) {
            for (UDTab bVar : this.tabs) {
                View c = bVar.mo91341c();
                if (!(c instanceof UDTabView)) {
                    c = null;
                }
                UDTabView eVar = (UDTabView) c;
                if (eVar != null) {
                    eVar.setMaxWidth$universe_ui_tab_release(this.tabMaxWidth);
                }
            }
        }
    }

    public final void setTabBackgroundColors(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        this.tabBackgroundColors = colorStateList;
        updateTabsStyle();
        GradientDrawable gradientDrawable = this.edgeShadowDrawable;
        if (gradientDrawable != null) {
            int[] iArr = new int[2];
            ColorStateList colorStateList2 = this.tabBackgroundColors;
            if (colorStateList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
            }
            iArr[0] = UDColorUtils.getAlphaColor(colorStateList2.getDefaultColor(), BitmapDescriptorFactory.HUE_RED);
            ColorStateList colorStateList3 = this.tabBackgroundColors;
            if (colorStateList3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
            }
            iArr[1] = colorStateList3.getDefaultColor();
            gradientDrawable.setColors(iArr);
        }
    }

    private final void addTabFromItemView(UDTabItem uDTabItem) {
        Integer customView$universe_ui_tab_release;
        UDTab newTab = newTab();
        newTab.mo91335a(uDTabItem.getTitle$universe_ui_tab_release());
        newTab.mo91332a(uDTabItem.getIcon$universe_ui_tab_release());
        if (uDTabItem.getCustomView$universe_ui_tab_release() != null && ((customView$universe_ui_tab_release = uDTabItem.getCustomView$universe_ui_tab_release()) == null || customView$universe_ui_tab_release.intValue() != 0)) {
            View inflate = LayoutInflater.from(newTab.mo91348i()).inflate(uDTabItem.getCustomView$universe_ui_tab_release().intValue(), (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…temView.customView, null)");
            newTab.mo91333a(inflate);
        }
        addTab(newTab);
    }

    private final void configureTabStyle(UDTab bVar) {
        int i;
        int i2;
        bVar.mo91341c().setPaddingRelative(this.tabPaddingStart, this.tabPaddingTop, this.tabPaddingEnd, this.tabPaddingBottom);
        bVar.mo91341c().setMinimumWidth(this.tabMinWidth);
        ViewGroup.LayoutParams layoutParams = bVar.mo91341c().getLayoutParams();
        UDTabView eVar = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            if (bVar.mo91343d() > 0) {
                i2 = this.tabMargin;
            } else {
                i2 = this.tabLayoutPaddingStart;
            }
            marginLayoutParams.leftMargin = i2;
        }
        ColorStateList colorStateList = this.tabIconTintColors;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabIconTintColors");
        }
        bVar.mo91340b(colorStateList);
        ColorStateList colorStateList2 = this.tabBackgroundColors;
        if (colorStateList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        bVar.mo91342c(colorStateList2);
        TextView f = bVar.mo91345f();
        int i3 = 2;
        if (f != null) {
            f.setTextAppearance(f.getContext(), this.tabTitleTextAppearance);
            f.setTextSize(0, (float) this.tabTitleTextSize);
            if (this.tabMode == 1) {
                i = 2;
            } else {
                i = 1;
            }
            f.setMaxLines(i);
        }
        TextView h = bVar.mo91347h();
        if (h != null) {
            h.setTextAppearance(h.getContext(), this.tabTitleTextAppearance);
            h.setTypeface(null, 1);
            h.setTextSize(0, (float) this.tabTitleTextSize);
            if (this.tabMode != 1) {
                i3 = 1;
            }
            h.setMaxLines(i3);
        }
        ColorStateList colorStateList3 = this.tabTitleColors;
        if (colorStateList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabTitleColors");
        }
        bVar.mo91331a(colorStateList3);
        View c = bVar.mo91341c();
        if (c instanceof UDTabView) {
            eVar = c;
        }
        UDTabView eVar2 = eVar;
        if (eVar2 != null) {
            eVar2.setMultiLineTitleTextSize$universe_ui_tab_release(this.tabMultiLineTitleTextSize);
            eVar2.setSingleLineTitleTextSize$universe_ui_tab_release((float) this.tabTitleTextSize);
            eVar2.setMaxWidth$universe_ui_tab_release(this.tabMaxWidth);
        }
        bVar.mo91337a(bVar.mo91341c().isSelected());
        this.indicator.mo91310c();
        requestLayout();
    }

    public final void addTab(List<UDTab> list) {
        Intrinsics.checkParameterIsNotNull(list, "tabs");
        for (UDTab bVar : list) {
            addTab(bVar);
        }
    }

    public void onDrawForeground(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (this.edgeShadowEnable && this.edgeShadowShow) {
            int width = getWidth();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            int a = (width - ((int) UDDimenUtils.m93308a(context, 64))) + getScrollX();
            int width2 = getWidth() + getScrollX();
            int height = getHeight();
            if (this.edgeShadowDrawable == null) {
                this.edgeShadowDrawable = generateEdgeShadowDrawable();
            }
            GradientDrawable gradientDrawable = this.edgeShadowDrawable;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(a, 0, width2, height);
            }
            GradientDrawable gradientDrawable2 = this.edgeShadowDrawable;
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
        }
        super.onDrawForeground(canvas);
        if (this.bottomDividerEnabled) {
            int scrollX = getScrollX();
            int height2 = getHeight();
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            getBottomDividerDrawable().setBounds(scrollX, height2 - ((int) UDDimenUtils.m93308a(context2, 1)), getWidth() + getScrollX(), getHeight());
            getBottomDividerDrawable().draw(canvas);
        }
    }

    public UDTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void addTabView(UDTab bVar, boolean z) {
        this.indicator.mo91304a(bVar);
        if (z) {
            selectTabInternal(bVar, true);
        }
    }

    public final void selectTab$universe_ui_tab_release(UDTab bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        selectTabInternal(bVar, z);
    }

    public final void setTabIconTintColors(int i, int i2) {
        this.tabIconTintColors = createColorStateList(i, i2);
        updateTabsStyle();
    }

    public final void setTabTitleColors(int i, int i2) {
        this.tabTitleColors = createColorStateList(i, i2);
        updateTabsStyle();
    }

    private final void addTabToList(UDTab bVar, int i) {
        this.tabs.add(i, bVar);
        bVar.mo91334a(this);
        updateTabsPosition(i);
        configureTabStyle(bVar);
    }

    private final ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final void addTab(UDTab bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        addTab(bVar, i, false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInternal(view);
    }

    public final void selectTabAt$universe_ui_tab_release(int i, boolean z) {
        if (i < 0 || i >= this.tabs.size()) {
            selectTabInternal(null, z);
        } else {
            selectTab$universe_ui_tab_release(this.tabs.get(i), z);
        }
    }

    private final int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = this.tabMode;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.indicator.getChildAt(i);
        int i5 = i + 1;
        if (i5 <= this.indicator.getChildCount()) {
            view = this.indicator.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
        return (-(((getWidth() / 2) - (i2 / 2)) - childAt.getLeft())) + ((int) (((float) (i4 + i2)) * 0.5f * f));
    }

    private final void selectTabInternal(UDTab bVar, boolean z) {
        boolean z2;
        if (bVar == null) {
            this.indicator.mo91311c(-1);
            if (z) {
                this.indicator.mo91313e(-1);
                return;
            }
            return;
        }
        dispatchSelectState(bVar.mo91343d());
        int selectPosition = getSelectPosition();
        if (bVar.mo91343d() == this.indicator.mo91307b()) {
            dispatchTabReselected(bVar);
            animateToTab(bVar);
        } else {
            if (z) {
                animateToTab(bVar);
                UDTabIndicator cVar = this.indicator;
                if (selectPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cVar.mo91305a(bVar, z2);
            } else {
                this.indicator.mo91311c(bVar.mo91343d());
            }
            if (selectPosition != -1) {
                dispatchTabUnselected(this.tabs.get(selectPosition));
            }
        }
        dispatchTabSelected(bVar);
    }

    public final void addTab(UDTab bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        addTab(bVar, this.tabs.size(), z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r2 != 2) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r1.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 != 0) goto L_0x000d
            int r0 = r5.tabMaxWidth
            goto L_0x0012
        L_0x000d:
            int r1 = r5.tabMaxWidth
            if (r1 <= 0) goto L_0x0012
            r0 = r1
        L_0x0012:
            r5.setupTabMaxWidth(r0)
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x005d
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.tabMode
            java.lang.String r3 = "child"
            if (r2 == 0) goto L_0x003e
            if (r2 == r0) goto L_0x0030
            r4 = 2
            if (r2 == r4) goto L_0x003e
            goto L_0x004e
        L_0x0030:
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            int r2 = r1.getMeasuredWidth()
            int r3 = r5.getMeasuredWidth()
            if (r2 == r3) goto L_0x004c
            goto L_0x004d
        L_0x003e:
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            int r2 = r1.getMeasuredWidth()
            int r3 = r5.getMeasuredWidth()
            if (r2 >= r3) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            r6 = r0
        L_0x004e:
            if (r6 == 0) goto L_0x005d
            int r6 = r5.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            r1.measure(r6, r7)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.tab.UDTabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInternal(view);
    }

    private final void addTabInternal(UDTab bVar, int i, boolean z) {
        addTabToList(bVar, i);
        addTabView(bVar, z);
    }

    public UDTabLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDTabLayout);
    }

    public final void addTab(UDTab bVar, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "tab");
        addTabInternal(bVar, i, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInternal(view);
    }

    private final void applyAttrs(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_tab_backgroundColor, R.attr.ud_tab_bottomDividerEnabled, R.attr.ud_tab_edgeShadowEnabled, R.attr.ud_tab_gravity, R.attr.ud_tab_iconTint, R.attr.ud_tab_indicator, R.attr.ud_tab_indicatorAnimationDuration, R.attr.ud_tab_indicatorColor, R.attr.ud_tab_indicatorFullWidth, R.attr.ud_tab_indicatorHeight, R.attr.ud_tab_layoutPaddingStart, R.attr.ud_tab_maxWidth, R.attr.ud_tab_minWidth, R.attr.ud_tab_mode, R.attr.ud_tab_multiLineTitleSize, R.attr.ud_tab_padding, R.attr.ud_tab_paddingBottom, R.attr.ud_tab_paddingEnd, R.attr.ud_tab_paddingStart, R.attr.ud_tab_paddingTop, R.attr.ud_tab_tabMargin, R.attr.ud_tab_titleColor, R.attr.ud_tab_titleSize, R.attr.ud_tab_titleTextAppearance}, i, i2);
        setTabGravity(obtainStyledAttributes.getInt(3, this.tabGravity));
        setTabMode(obtainStyledAttributes.getInt(13, this.tabMode));
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList == null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            colorStateList = ColorStateList.valueOf(UDColorUtils.getColor(context, R.color.bg_body));
            Intrinsics.checkExpressionValueIsNotNull(colorStateList, "ColorStateList.valueOf(\n…ontext, R.color.bg_body))");
        }
        this.tabBackgroundColors = colorStateList;
        if (colorStateList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabBackgroundColors");
        }
        setBackgroundColor(colorStateList.getDefaultColor());
        this.tabTitleTextAppearance = obtainStyledAttributes.getResourceId(23, 2131887183);
        this.tabTitleTextSize = obtainStyledAttributes.getDimensionPixelSize(22, this.tabTitleTextSize);
        this.tabMultiLineTitleTextSize = obtainStyledAttributes.getDimensionPixelSize(14, this.tabMultiLineTitleTextSize);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(21);
        if (colorStateList2 == null) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            colorStateList2 = UDColorUtils.getColorStateList(context2, R.color.ud_tab_title_text_color);
        }
        this.tabTitleColors = colorStateList2;
        ColorStateList colorStateList3 = obtainStyledAttributes.getColorStateList(4);
        if (colorStateList3 == null) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            colorStateList3 = UDColorUtils.getColorStateList(context3, R.color.ud_tab_title_text_color);
        }
        this.tabIconTintColors = colorStateList3;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.tabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(18, dimensionPixelSize);
        this.tabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize);
        this.tabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        this.tabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(16, dimensionPixelSize);
        this.tabMargin = obtainStyledAttributes.getDimensionPixelSize(20, this.tabMargin);
        this.tabLayoutPaddingStart = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.tabMinWidth = obtainStyledAttributes.getDimensionPixelSize(12, this.tabMinWidth);
        this.tabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(11, this.tabMaxWidth);
        this.indicator.mo91303a(obtainStyledAttributes.getDrawable(5));
        if (obtainStyledAttributes.hasValue(7)) {
            setIndicatorColor(obtainStyledAttributes.getColor(7, 0));
        }
        setIndicatorHeight(obtainStyledAttributes.getInt(9, -1));
        this.indicatorAnimatorDuration = (long) obtainStyledAttributes.getInt(6, (int) this.indicatorAnimatorDuration);
        this.indicatorFullWidth = obtainStyledAttributes.getBoolean(8, this.indicatorFullWidth);
        this.edgeShadowEnable = obtainStyledAttributes.getBoolean(2, this.edgeShadowEnable);
        this.bottomDividerEnabled = obtainStyledAttributes.getBoolean(1, this.bottomDividerEnabled);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        updateEdgeShadow();
    }

    public final void setScrollPosition$universe_ui_tab_release(int i, float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnimator;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.scrollAnimator) == null)) {
            valueAnimator.cancel();
        }
        int a = C69029a.m265653a(((float) i) + f);
        if (a >= 0 && a < this.tabs.size()) {
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z2) {
                this.indicator.mo91301a(i, i + 1, f);
            }
            if (z) {
                dispatchSelectState(a);
            }
        }
    }

    public final void setTabPadding(int i, int i2, int i3, int i4) {
        for (UDTab bVar : this.tabs) {
            bVar.mo91341c().setPaddingRelative(i, i2, i3, i4);
        }
        this.indicator.mo91310c();
        requestLayout();
    }

    public UDTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        UDTabIndicator cVar = new UDTabIndicator(this, context2);
        this.indicator = cVar;
        this.tabs = new ArrayList();
        this.selectedListeners = new ArrayList();
        this.tabMode = 2;
        this.tabGravity = 1;
        this.tabMaxWidth = -1;
        this.indicatorAnimatorDuration = 300;
        this.edgeShadowEnable = true;
        this.indicatorFullWidth = true;
        this.tabTitleTextAppearance = 2131887183;
        Context context3 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "context");
        this.tabTitleTextSize = UDDimenUtils.m93313d(context3, R.dimen.ud_tabs_title_text_size);
        Context context4 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "context");
        this.tabMultiLineTitleTextSize = UDDimenUtils.m93313d(context4, R.dimen.ud_tabs_title_text_size_multi_line);
        this.scrollBounds = new Rect();
        this.bottomDividerDrawable$delegate = LazyKt.lazy(new C25777e(this));
        this.bottomDividerEnabled = true;
        applyAttrs(attributeSet, i, i2);
        super.addView(cVar, 0, new FrameLayout.LayoutParams(-2, -2));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEdgeShadow();
    }
}
