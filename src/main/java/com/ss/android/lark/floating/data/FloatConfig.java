package com.ss.android.lark.floating.data;

import android.graphics.Rect;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.interfaces.OnAppFloatAnimator;
import com.ss.android.lark.floating.interfaces.OnDisplayHeight;
import com.ss.android.lark.floating.interfaces.OnFloatAnimator;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0003\b\u0001\b\b\u0018\u00002\u00020\u0001Bû\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\b00\u0012\b\b\u0002\u00101\u001a\u00020\n\u0012\b\b\u0002\u00102\u001a\u00020\n¢\u0006\u0002\u00103J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010zJ\n\u0010\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\u0016\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\u0016\u0010¤\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\u0010\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\"0!HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\n\u0010«\u0001\u001a\u00020.HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010­\u0001\u001a\b\u0012\u0004\u0012\u00020\b00HÆ\u0003J\u0010\u0010®\u0001\u001a\u00020\nHÀ\u0003¢\u0006\u0003\b¯\u0001J\u0010\u0010°\u0001\u001a\u00020\nHÀ\u0003¢\u0006\u0003\b±\u0001J\f\u0010²\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010³\u0001\u001a\u00020\nHÆ\u0003J\n\u0010´\u0001\u001a\u00020\nHÆ\u0003J\n\u0010µ\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\nHÆ\u0003J\n\u0010·\u0001\u001a\u00020\nHÆ\u0003J\u0003\u0010¸\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020.2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\b002\b\b\u0002\u00101\u001a\u00020\n2\b\b\u0002\u00102\u001a\u00020\nHÆ\u0001¢\u0006\u0003\u0010¹\u0001J\u0015\u0010º\u0001\u001a\u00020\n2\t\u0010»\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010½\u0001\u001a\u00020\bHÖ\u0001R\u001a\u0010\f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00105\"\u0004\bO\u00107R \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u00101\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00105\"\u0004\bU\u00107R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\b00¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u001a\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00105\"\u0004\bi\u00107R\u001a\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00105\"\u0004\bk\u00107R\u001a\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00105\"\u0004\bm\u00107R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u00020\n2\u0006\u0010r\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\bs\u00105\"\u0004\bt\u00107R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u00105\"\u0004\bu\u00107R\u001a\u0010\r\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u00105\"\u0004\bv\u00107R\u001a\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u00105\"\u0004\bx\u00107R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010}\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010C\"\u0004\b\u0010ER*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u00102\u001a\u00020\nX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00105\"\u0005\b\u0001\u00107R*\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cX\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001c\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010e\"\u0005\b\u0001\u0010gR\u001c\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010e\"\u0005\b\u0001\u0010gR\u001c\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u00105\"\u0005\b\u0001\u00107¨\u0006¾\u0001"}, d2 = {"Lcom/ss/android/lark/floating/data/FloatConfig;", "", "layoutId", "", "layoutView", "Landroid/view/View;", "containerView", "floatTag", "", "dragEnable", "", "isDrag", "_isAnim", "isShow", "hasEditText", "sidePattern", "Lcom/ss/android/lark/floating/enums/SidePattern;", "showPattern", "Lcom/ss/android/lark/floating/enums/ShowPattern;", "keepScreenOn", "hardwareAccelerated", "banRequestPermission", "dimBehind", "", "widthMatch", "heightMatch", "gravity", "offsetPair", "Lkotlin/Pair;", "targetOffsetX", "targetOffsetY", "locationPair", "evictRects", "", "Landroid/graphics/Rect;", "invokeView", "Lcom/ss/android/lark/floating/interfaces/OnInvokeView;", "callbacks", "Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;", "floatCallbacks", "Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;", "floatAnimator", "Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "appFloatAnimator", "Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;", "displayHeight", "Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;", "filterSet", "", "filterSelf", "needShow", "(Ljava/lang/Integer;Landroid/view/View;Landroid/view/View;Ljava/lang/String;ZZZZZLcom/ss/android/lark/floating/enums/SidePattern;Lcom/ss/android/lark/floating/enums/ShowPattern;ZZZFZZILkotlin/Pair;IILkotlin/Pair;Ljava/util/List;Lcom/ss/android/lark/floating/interfaces/OnInvokeView;Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;Ljava/util/Set;ZZ)V", "get_isAnim", "()Z", "set_isAnim", "(Z)V", "getAppFloatAnimator", "()Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;", "setAppFloatAnimator", "(Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;)V", "getBanRequestPermission", "setBanRequestPermission", "getCallbacks", "()Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;", "setCallbacks", "(Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;)V", "getContainerView", "()Landroid/view/View;", "setContainerView", "(Landroid/view/View;)V", "getDimBehind", "()F", "setDimBehind", "(F)V", "getDisplayHeight", "()Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;", "setDisplayHeight", "(Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;)V", "getDragEnable", "setDragEnable", "getEvictRects", "()Ljava/util/List;", "setEvictRects", "(Ljava/util/List;)V", "getFilterSelf$float_release", "setFilterSelf$float_release", "getFilterSet", "()Ljava/util/Set;", "getFloatAnimator", "()Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;", "setFloatAnimator", "(Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;)V", "getFloatCallbacks", "()Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;", "setFloatCallbacks", "(Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;)V", "getFloatTag", "()Ljava/lang/String;", "setFloatTag", "(Ljava/lang/String;)V", "getGravity", "()I", "setGravity", "(I)V", "getHardwareAccelerated", "setHardwareAccelerated", "getHasEditText", "setHasEditText", "getHeightMatch", "setHeightMatch", "getInvokeView", "()Lcom/ss/android/lark/floating/interfaces/OnInvokeView;", "setInvokeView", "(Lcom/ss/android/lark/floating/interfaces/OnInvokeView;)V", "value", "isAnim", "setAnim", "setDrag", "setShow", "getKeepScreenOn", "setKeepScreenOn", "getLayoutId", "()Ljava/lang/Integer;", "setLayoutId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLayoutView", "setLayoutView", "getLocationPair", "()Lkotlin/Pair;", "setLocationPair", "(Lkotlin/Pair;)V", "getNeedShow$float_release", "setNeedShow$float_release", "getOffsetPair", "setOffsetPair", "getShowPattern", "()Lcom/ss/android/lark/floating/enums/ShowPattern;", "setShowPattern", "(Lcom/ss/android/lark/floating/enums/ShowPattern;)V", "getSidePattern", "()Lcom/ss/android/lark/floating/enums/SidePattern;", "setSidePattern", "(Lcom/ss/android/lark/floating/enums/SidePattern;)V", "getTargetOffsetX", "setTargetOffsetX", "getTargetOffsetY", "setTargetOffsetY", "getWidthMatch", "setWidthMatch", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component31$float_release", "component32", "component32$float_release", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Landroid/view/View;Landroid/view/View;Ljava/lang/String;ZZZZZLcom/ss/android/lark/floating/enums/SidePattern;Lcom/ss/android/lark/floating/enums/ShowPattern;ZZZFZZILkotlin/Pair;IILkotlin/Pair;Ljava/util/List;Lcom/ss/android/lark/floating/interfaces/OnInvokeView;Lcom/ss/android/lark/floating/interfaces/OnFloatCallbacks;Lcom/ss/android/lark/floating/interfaces/FloatCallbacks;Lcom/ss/android/lark/floating/interfaces/OnFloatAnimator;Lcom/ss/android/lark/floating/interfaces/OnAppFloatAnimator;Lcom/ss/android/lark/floating/interfaces/OnDisplayHeight;Ljava/util/Set;ZZ)Lcom/ss/android/lark/floating/data/FloatConfig;", "equals", "other", "hashCode", "toString", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.b.a */
public final class FloatConfig {

    /* renamed from: A */
    private OnFloatAnimator f98446A;

    /* renamed from: B */
    private OnAppFloatAnimator f98447B;

    /* renamed from: C */
    private OnDisplayHeight f98448C;

    /* renamed from: D */
    private final Set<String> f98449D;

    /* renamed from: E */
    private boolean f98450E;

    /* renamed from: F */
    private boolean f98451F;

    /* renamed from: a */
    private Integer f98452a;

    /* renamed from: b */
    private View f98453b;

    /* renamed from: c */
    private View f98454c;

    /* renamed from: d */
    private String f98455d;

    /* renamed from: e */
    private boolean f98456e;

    /* renamed from: f */
    private boolean f98457f;

    /* renamed from: g */
    private boolean f98458g;

    /* renamed from: h */
    private boolean f98459h;

    /* renamed from: i */
    private boolean f98460i;

    /* renamed from: j */
    private SidePattern f98461j;

    /* renamed from: k */
    private ShowPattern f98462k;

    /* renamed from: l */
    private boolean f98463l;

    /* renamed from: m */
    private boolean f98464m;

    /* renamed from: n */
    private boolean f98465n;

    /* renamed from: o */
    private float f98466o;

    /* renamed from: p */
    private boolean f98467p;

    /* renamed from: q */
    private boolean f98468q;

    /* renamed from: r */
    private int f98469r;

    /* renamed from: s */
    private Pair<Integer, Integer> f98470s;

    /* renamed from: t */
    private int f98471t;

    /* renamed from: u */
    private int f98472u;

    /* renamed from: v */
    private Pair<Integer, Integer> f98473v;

    /* renamed from: w */
    private List<Rect> f98474w;

    /* renamed from: x */
    private AbstractC38339g f98475x;

    /* renamed from: y */
    private OnFloatCallbacks f98476y;

    /* renamed from: z */
    private FloatCallbacks f98477z;

    public FloatConfig() {
        this(null, null, null, null, false, false, false, false, false, null, null, false, false, false, BitmapDescriptorFactory.HUE_RED, false, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, -1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FloatConfig) {
                FloatConfig aVar = (FloatConfig) obj;
                if (Intrinsics.areEqual(this.f98452a, aVar.f98452a) && Intrinsics.areEqual(this.f98453b, aVar.f98453b) && Intrinsics.areEqual(this.f98454c, aVar.f98454c) && Intrinsics.areEqual(this.f98455d, aVar.f98455d)) {
                    if (this.f98456e == aVar.f98456e) {
                        if (this.f98457f == aVar.f98457f) {
                            if (this.f98458g == aVar.f98458g) {
                                if (this.f98459h == aVar.f98459h) {
                                    if ((this.f98460i == aVar.f98460i) && Intrinsics.areEqual(this.f98461j, aVar.f98461j) && Intrinsics.areEqual(this.f98462k, aVar.f98462k)) {
                                        if (this.f98463l == aVar.f98463l) {
                                            if (this.f98464m == aVar.f98464m) {
                                                if ((this.f98465n == aVar.f98465n) && Float.compare(this.f98466o, aVar.f98466o) == 0) {
                                                    if (this.f98467p == aVar.f98467p) {
                                                        if (this.f98468q == aVar.f98468q) {
                                                            if ((this.f98469r == aVar.f98469r) && Intrinsics.areEqual(this.f98470s, aVar.f98470s)) {
                                                                if (this.f98471t == aVar.f98471t) {
                                                                    if ((this.f98472u == aVar.f98472u) && Intrinsics.areEqual(this.f98473v, aVar.f98473v) && Intrinsics.areEqual(this.f98474w, aVar.f98474w) && Intrinsics.areEqual(this.f98475x, aVar.f98475x) && Intrinsics.areEqual(this.f98476y, aVar.f98476y) && Intrinsics.areEqual(this.f98477z, aVar.f98477z) && Intrinsics.areEqual(this.f98446A, aVar.f98446A) && Intrinsics.areEqual(this.f98447B, aVar.f98447B) && Intrinsics.areEqual(this.f98448C, aVar.f98448C) && Intrinsics.areEqual(this.f98449D, aVar.f98449D)) {
                                                                        if (this.f98450E == aVar.f98450E) {
                                                                            if (this.f98451F == aVar.f98451F) {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.f98452a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        View view = this.f98453b;
        int hashCode2 = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        View view2 = this.f98454c;
        int hashCode3 = (hashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31;
        String str = this.f98455d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f98456e;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        boolean z2 = this.f98457f;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f98458g;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.f98459h;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.f98460i;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        SidePattern sidePattern = this.f98461j;
        int hashCode5 = (i22 + (sidePattern != null ? sidePattern.hashCode() : 0)) * 31;
        ShowPattern showPattern = this.f98462k;
        int hashCode6 = (hashCode5 + (showPattern != null ? showPattern.hashCode() : 0)) * 31;
        boolean z6 = this.f98463l;
        if (z6) {
            z6 = true;
        }
        int i23 = z6 ? 1 : 0;
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = (hashCode6 + i23) * 31;
        boolean z7 = this.f98464m;
        if (z7) {
            z7 = true;
        }
        int i27 = z7 ? 1 : 0;
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z8 = this.f98465n;
        if (z8) {
            z8 = true;
        }
        int i31 = z8 ? 1 : 0;
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int floatToIntBits = (((i30 + i31) * 31) + Float.floatToIntBits(this.f98466o)) * 31;
        boolean z9 = this.f98467p;
        if (z9) {
            z9 = true;
        }
        int i34 = z9 ? 1 : 0;
        int i35 = z9 ? 1 : 0;
        int i36 = z9 ? 1 : 0;
        int i37 = (floatToIntBits + i34) * 31;
        boolean z10 = this.f98468q;
        if (z10) {
            z10 = true;
        }
        int i38 = z10 ? 1 : 0;
        int i39 = z10 ? 1 : 0;
        int i40 = z10 ? 1 : 0;
        int i41 = (((i37 + i38) * 31) + this.f98469r) * 31;
        Pair<Integer, Integer> pair = this.f98470s;
        int hashCode7 = (((((i41 + (pair != null ? pair.hashCode() : 0)) * 31) + this.f98471t) * 31) + this.f98472u) * 31;
        Pair<Integer, Integer> pair2 = this.f98473v;
        int hashCode8 = (hashCode7 + (pair2 != null ? pair2.hashCode() : 0)) * 31;
        List<Rect> list = this.f98474w;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        AbstractC38339g gVar = this.f98475x;
        int hashCode10 = (hashCode9 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        OnFloatCallbacks eVar = this.f98476y;
        int hashCode11 = (hashCode10 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        FloatCallbacks aVar = this.f98477z;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        OnFloatAnimator dVar = this.f98446A;
        int hashCode13 = (hashCode12 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        OnAppFloatAnimator bVar = this.f98447B;
        int hashCode14 = (hashCode13 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        OnDisplayHeight cVar = this.f98448C;
        int hashCode15 = (hashCode14 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<String> set = this.f98449D;
        if (set != null) {
            i = set.hashCode();
        }
        int i42 = (hashCode15 + i) * 31;
        boolean z11 = this.f98450E;
        if (z11) {
            z11 = true;
        }
        int i43 = z11 ? 1 : 0;
        int i44 = z11 ? 1 : 0;
        int i45 = z11 ? 1 : 0;
        int i46 = (i42 + i43) * 31;
        boolean z12 = this.f98451F;
        if (!z12) {
            i2 = z12 ? 1 : 0;
        }
        return i46 + i2;
    }

    public String toString() {
        return "FloatConfig(layoutId=" + this.f98452a + ", layoutView=" + this.f98453b + ", containerView=" + this.f98454c + ", floatTag=" + this.f98455d + ", dragEnable=" + this.f98456e + ", isDrag=" + this.f98457f + ", _isAnim=" + this.f98458g + ", isShow=" + this.f98459h + ", hasEditText=" + this.f98460i + ", sidePattern=" + this.f98461j + ", showPattern=" + this.f98462k + ", keepScreenOn=" + this.f98463l + ", hardwareAccelerated=" + this.f98464m + ", banRequestPermission=" + this.f98465n + ", dimBehind=" + this.f98466o + ", widthMatch=" + this.f98467p + ", heightMatch=" + this.f98468q + ", gravity=" + this.f98469r + ", offsetPair=" + this.f98470s + ", targetOffsetX=" + this.f98471t + ", targetOffsetY=" + this.f98472u + ", locationPair=" + this.f98473v + ", evictRects=" + this.f98474w + ", invokeView=" + this.f98475x + ", callbacks=" + this.f98476y + ", floatCallbacks=" + this.f98477z + ", floatAnimator=" + this.f98446A + ", appFloatAnimator=" + this.f98447B + ", displayHeight=" + this.f98448C + ", filterSet=" + this.f98449D + ", filterSelf=" + this.f98450E + ", needShow=" + this.f98451F + ")";
    }

    /* renamed from: A */
    public final OnAppFloatAnimator mo140167A() {
        return this.f98447B;
    }

    /* renamed from: B */
    public final OnDisplayHeight mo140168B() {
        return this.f98448C;
    }

    /* renamed from: C */
    public final Set<String> mo140169C() {
        return this.f98449D;
    }

    /* renamed from: D */
    public final boolean mo140170D() {
        return this.f98450E;
    }

    /* renamed from: E */
    public final boolean mo140171E() {
        return this.f98451F;
    }

    /* renamed from: b */
    public final Integer mo140184b() {
        return this.f98452a;
    }

    /* renamed from: c */
    public final View mo140188c() {
        return this.f98453b;
    }

    /* renamed from: d */
    public final String mo140191d() {
        return this.f98455d;
    }

    /* renamed from: i */
    public final SidePattern mo140203i() {
        return this.f98461j;
    }

    /* renamed from: j */
    public final ShowPattern mo140204j() {
        return this.f98462k;
    }

    /* renamed from: k */
    public final boolean mo140205k() {
        return this.f98463l;
    }

    /* renamed from: l */
    public final boolean mo140206l() {
        return this.f98464m;
    }

    /* renamed from: m */
    public final boolean mo140207m() {
        return this.f98465n;
    }

    /* renamed from: n */
    public final float mo140208n() {
        return this.f98466o;
    }

    /* renamed from: o */
    public final boolean mo140209o() {
        return this.f98467p;
    }

    /* renamed from: p */
    public final boolean mo140210p() {
        return this.f98468q;
    }

    /* renamed from: q */
    public final int mo140211q() {
        return this.f98469r;
    }

    /* renamed from: r */
    public final Pair<Integer, Integer> mo140212r() {
        return this.f98470s;
    }

    /* renamed from: s */
    public final int mo140213s() {
        return this.f98471t;
    }

    /* renamed from: t */
    public final int mo140214t() {
        return this.f98472u;
    }

    /* renamed from: u */
    public final Pair<Integer, Integer> mo140216u() {
        return this.f98473v;
    }

    /* renamed from: v */
    public final List<Rect> mo140217v() {
        return this.f98474w;
    }

    /* renamed from: w */
    public final AbstractC38339g mo140218w() {
        return this.f98475x;
    }

    /* renamed from: x */
    public final OnFloatCallbacks mo140219x() {
        return this.f98476y;
    }

    /* renamed from: y */
    public final FloatCallbacks mo140220y() {
        return this.f98477z;
    }

    /* renamed from: z */
    public final OnFloatAnimator mo140221z() {
        return this.f98446A;
    }

    /* renamed from: a */
    public final boolean mo140183a() {
        return this.f98458g;
    }

    /* renamed from: a */
    public final void mo140182a(boolean z) {
        this.f98458g = z;
    }

    /* renamed from: e */
    public final boolean mo140194e() {
        return this.f98456e;
    }

    /* renamed from: f */
    public final boolean mo140197f() {
        return this.f98457f;
    }

    /* renamed from: g */
    public final boolean mo140199g() {
        return this.f98459h;
    }

    /* renamed from: h */
    public final boolean mo140201h() {
        return this.f98460i;
    }

    /* renamed from: a */
    public final void mo140172a(int i) {
        this.f98469r = i;
    }

    /* renamed from: e */
    public final void mo140193e(boolean z) {
        this.f98464m = z;
    }

    /* renamed from: f */
    public final void mo140196f(boolean z) {
        this.f98465n = z;
    }

    /* renamed from: g */
    public final void mo140198g(boolean z) {
        this.f98450E = z;
    }

    /* renamed from: h */
    public final void mo140200h(boolean z) {
        this.f98451F = z;
    }

    /* renamed from: a */
    public final void mo140173a(View view) {
        this.f98453b = view;
    }

    /* renamed from: b */
    public final void mo140185b(int i) {
        this.f98471t = i;
    }

    /* renamed from: c */
    public final void mo140189c(int i) {
        this.f98472u = i;
    }

    /* renamed from: d */
    public final void mo140192d(boolean z) {
        this.f98459h = z;
    }

    /* renamed from: a */
    public final void mo140174a(FloatCallbacks aVar) {
        this.f98477z = aVar;
    }

    /* renamed from: b */
    public final void mo140186b(View view) {
        this.f98454c = view;
    }

    /* renamed from: c */
    public final void mo140190c(boolean z) {
        this.f98457f = z;
    }

    /* renamed from: a */
    public final void mo140175a(OnFloatCallbacks eVar) {
        this.f98476y = eVar;
    }

    /* renamed from: b */
    public final void mo140187b(boolean z) {
        this.f98456e = z;
    }

    /* renamed from: a */
    public final void mo140176a(AbstractC38339g gVar) {
        this.f98475x = gVar;
    }

    /* renamed from: a */
    public final void mo140177a(ShowPattern showPattern) {
        Intrinsics.checkParameterIsNotNull(showPattern, "<set-?>");
        this.f98462k = showPattern;
    }

    /* renamed from: a */
    public final void mo140178a(SidePattern sidePattern) {
        Intrinsics.checkParameterIsNotNull(sidePattern, "<set-?>");
        this.f98461j = sidePattern;
    }

    /* renamed from: a */
    public final void mo140179a(Integer num) {
        this.f98452a = num;
    }

    /* renamed from: a */
    public final void mo140180a(String str) {
        this.f98455d = str;
    }

    /* renamed from: a */
    public final void mo140181a(List<Rect> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f98474w = list;
    }

    public FloatConfig(Integer num, View view, View view2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, SidePattern sidePattern, ShowPattern showPattern, boolean z6, boolean z7, boolean z8, float f, boolean z9, boolean z10, int i, Pair<Integer, Integer> pair, int i2, int i3, Pair<Integer, Integer> pair2, List<Rect> list, AbstractC38339g gVar, OnFloatCallbacks eVar, FloatCallbacks aVar, OnFloatAnimator dVar, OnAppFloatAnimator bVar, OnDisplayHeight cVar, Set<String> set, boolean z11, boolean z12) {
        Intrinsics.checkParameterIsNotNull(sidePattern, "sidePattern");
        Intrinsics.checkParameterIsNotNull(showPattern, "showPattern");
        Intrinsics.checkParameterIsNotNull(pair, "offsetPair");
        Intrinsics.checkParameterIsNotNull(pair2, "locationPair");
        Intrinsics.checkParameterIsNotNull(list, "evictRects");
        Intrinsics.checkParameterIsNotNull(cVar, "displayHeight");
        Intrinsics.checkParameterIsNotNull(set, "filterSet");
        this.f98452a = num;
        this.f98453b = view;
        this.f98454c = view2;
        this.f98455d = str;
        this.f98456e = z;
        this.f98457f = z2;
        this.f98458g = z3;
        this.f98459h = z4;
        this.f98460i = z5;
        this.f98461j = sidePattern;
        this.f98462k = showPattern;
        this.f98463l = z6;
        this.f98464m = z7;
        this.f98465n = z8;
        this.f98466o = f;
        this.f98467p = z9;
        this.f98468q = z10;
        this.f98469r = i;
        this.f98470s = pair;
        this.f98471t = i2;
        this.f98472u = i3;
        this.f98473v = pair2;
        this.f98474w = list;
        this.f98475x = gVar;
        this.f98476y = eVar;
        this.f98477z = aVar;
        this.f98446A = dVar;
        this.f98447B = bVar;
        this.f98448C = cVar;
        this.f98449D = set;
        this.f98450E = z11;
        this.f98451F = z12;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FloatConfig(java.lang.Integer r34, android.view.View r35, android.view.View r36, java.lang.String r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, com.ss.android.lark.floating.enums.SidePattern r43, com.ss.android.lark.floating.enums.ShowPattern r44, boolean r45, boolean r46, boolean r47, float r48, boolean r49, boolean r50, int r51, kotlin.Pair r52, int r53, int r54, kotlin.Pair r55, java.util.List r56, com.ss.android.lark.floating.p1896c.AbstractC38339g r57, com.ss.android.lark.floating.interfaces.OnFloatCallbacks r58, com.ss.android.lark.floating.interfaces.FloatCallbacks r59, com.ss.android.lark.floating.interfaces.OnFloatAnimator r60, com.ss.android.lark.floating.interfaces.OnAppFloatAnimator r61, com.ss.android.lark.floating.interfaces.OnDisplayHeight r62, java.util.Set r63, boolean r64, boolean r65, int r66, kotlin.jvm.internal.DefaultConstructorMarker r67) {
        /*
        // Method dump skipped, instructions count: 463
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.floating.data.FloatConfig.<init>(java.lang.Integer, android.view.View, android.view.View, java.lang.String, boolean, boolean, boolean, boolean, boolean, com.ss.android.lark.floating.enums.SidePattern, com.ss.android.lark.floating.enums.ShowPattern, boolean, boolean, boolean, float, boolean, boolean, int, kotlin.Pair, int, int, kotlin.Pair, java.util.List, com.ss.android.lark.floating.c.g, com.ss.android.lark.floating.c.e, com.ss.android.lark.floating.c.a, com.ss.android.lark.floating.c.d, com.ss.android.lark.floating.c.b, com.ss.android.lark.floating.c.c, java.util.Set, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
