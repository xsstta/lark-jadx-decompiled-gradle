package com.larksuite.component.universe_design.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.drawable.UDRoundDrawable;
import com.larksuite.component.universe_design.radius.UDRadius;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.component.universe_design.util.UDUiUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010Ù\u0001\u001a\u00030Ú\u0001H\u0002J7\u0010Û\u0001\u001a\u00030Ú\u0001\"\u0011\b\u0000\u0010Ü\u0001*\n\u0012\u0005\u0012\u0003HÜ\u00010Ý\u00012\u000f\u0010Þ\u0001\u001a\n\u0012\u0005\u0012\u0003HÜ\u00010Ý\u00012\u0007\u0010ß\u0001\u001a\u00020IH\u0017J\u0018\u0010à\u0001\u001a\u00030Ú\u00012\f\u0010Þ\u0001\u001a\u0007\u0012\u0002\b\u00030Ý\u0001H\u0002J\u0013\u0010á\u0001\u001a\u00030Ú\u00012\u0007\u0010ß\u0001\u001a\u00020IH\u0016J\u000b\u0010â\u0001\u001a\u0004\u0018\u00010@H\u0014J\t\u0010ã\u0001\u001a\u00020(H\u0015J\t\u0010ä\u0001\u001a\u00020(H\u0015J\t\u0010å\u0001\u001a\u00020(H\u0015J\t\u0010æ\u0001\u001a\u00020(H\u0015J\n\u0010ç\u0001\u001a\u00030è\u0001H\u0002J,\u0010é\u0001\u001a\u0004\u0018\u00010@2\t\u0010ê\u0001\u001a\u0004\u0018\u00010@2\t\b\u0001\u0010ë\u0001\u001a\u00020(2\t\b\u0001\u0010ì\u0001\u001a\u00020(H\u0004J\u001b\u0010í\u0001\u001a\u00020^2\u0007\u0010î\u0001\u001a\u00020^2\u0007\u0010ï\u0001\u001a\u00020(H\u0004J\n\u0010ê\u0001\u001a\u00030Ú\u0001H\u0002J\u001f\u0010ð\u0001\u001a\u00030Ú\u00012\u0007\u0010ß\u0001\u001a\u00020I2\n\u0010ñ\u0001\u001a\u0005\u0018\u00010ò\u0001H\u0016J\u000b\u0010ó\u0001\u001a\u0004\u0018\u00010@H\u0014J\u000b\u0010ô\u0001\u001a\u0004\u0018\u00010@H\u0014J\u000b\u0010õ\u0001\u001a\u0004\u0018\u00010@H\u0014J\n\u0010ö\u0001\u001a\u00030Ú\u0001H\u0016J\n\u0010÷\u0001\u001a\u00030Ú\u0001H\u0017J(\u0010ø\u0001\u001a\u00030Ú\u00012\b\u0010ù\u0001\u001a\u00030ú\u00012\u0007\u0010û\u0001\u001a\u00020(2\t\b\u0001\u0010ü\u0001\u001a\u00020(H\u0004J7\u0010ý\u0001\u001a\u00030Ú\u00012\u0007\u0010þ\u0001\u001a\u00020@2\u0007\u0010ÿ\u0001\u001a\u00020(2\u0007\u0010\u0002\u001a\u00020(2\u0007\u0010\u0002\u001a\u00020(2\u0007\u0010\u0002\u001a\u00020(H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010<\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R\u001c\u0010H\u001a\u0004\u0018\u00010IX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\u001a\u0010Q\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010*\"\u0004\bS\u0010,R\u001a\u0010T\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010*\"\u0004\bV\u0010,R\u001c\u0010W\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010B\"\u0004\bY\u0010DR\u001a\u0010Z\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010*\"\u0004\b\\\u0010,R\u001a\u0010]\u001a\u00020^X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001c\u0010c\u001a\u0004\u0018\u00010dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010*\"\u0004\bk\u0010,R\u001a\u0010l\u001a\u00020^X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR\u001a\u0010o\u001a\u00020^X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010`\"\u0004\bq\u0010bR\u001a\u0010r\u001a\u00020sX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001c\u0010x\u001a\u0004\u0018\u00010yX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001b\u0010~\u001a\u00020(X\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0010*\"\u0005\b\u0001\u0010,R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R!\u0010\u0001\u001a\u00020(8\u0004@\u0004X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010*\"\u0005\b\u0001\u0010,R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010*\"\u0005\b¡\u0001\u0010,R\u001d\u0010¢\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010*\"\u0005\b¤\u0001\u0010,R\u001d\u0010¥\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010*\"\u0005\b§\u0001\u0010,R\u001d\u0010¨\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010*\"\u0005\bª\u0001\u0010,R\u001f\u0010«\u0001\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010B\"\u0005\b­\u0001\u0010DR\u001d\u0010®\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010*\"\u0005\b°\u0001\u0010,R\u001f\u0010±\u0001\u001a\u0004\u0018\u00010yX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010{\"\u0005\b³\u0001\u0010}R\u001d\u0010´\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010*\"\u0005\b¶\u0001\u0010,R\u001d\u0010·\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010*\"\u0005\b¹\u0001\u0010,R\u001d\u0010º\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010*\"\u0005\b¼\u0001\u0010,R\u001d\u0010½\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010*\"\u0005\b¿\u0001\u0010,R\u001d\u0010À\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010*\"\u0005\bÂ\u0001\u0010,R\u001d\u0010Ã\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010*\"\u0005\bÅ\u0001\u0010,R\u001d\u0010Æ\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010*\"\u0005\bÈ\u0001\u0010,R!\u0010É\u0001\u001a\u00020(8\u0004@\u0004X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010*\"\u0005\bË\u0001\u0010,R!\u0010Ì\u0001\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0012\n\u0002\u0010;\u001a\u0005\bÍ\u0001\u00108\"\u0005\bÎ\u0001\u0010:R\u001d\u0010Ï\u0001\u001a\u00020(X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010*\"\u0005\bÑ\u0001\u0010,R*\u0010Ò\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030Ô\u00010Ó\u00010\u001dX\u0004¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010 R\u001d\u0010Ö\u0001\u001a\u00020^X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010`\"\u0005\bØ\u0001\u0010b¨\u0006\u0002"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialog$DialogCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isContentLayoutDefault", "", "isContentLayoutDefault$universe_ui_dialog_release", "()Z", "setContentLayoutDefault$universe_ui_dialog_release", "(Z)V", "isContentVisible", "isContentVisible$universe_ui_dialog_release", "setContentVisible$universe_ui_dialog_release", "isFooterLayoutDefault", "isFooterLayoutDefault$universe_ui_dialog_release", "setFooterLayoutDefault$universe_ui_dialog_release", "isFooterVisible", "isFooterVisible$universe_ui_dialog_release", "setFooterVisible$universe_ui_dialog_release", "isHeaderLayoutDefault", "isHeaderLayoutDefault$universe_ui_dialog_release", "setHeaderLayoutDefault$universe_ui_dialog_release", "isHeaderVisible", "isHeaderVisible$universe_ui_dialog_release", "setHeaderVisible$universe_ui_dialog_release", "mActionButtons", "", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionButtonInfo;", "getMActionButtons", "()Ljava/util/List;", "mActionButtonsOrientation", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;", "getMActionButtonsOrientation", "()Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;", "setMActionButtonsOrientation", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBottomOrientation;)V", "mAnimStyle", "", "getMAnimStyle", "()I", "setMAnimStyle", "(I)V", "mAutoDismiss", "getMAutoDismiss", "setMAutoDismiss", "mBackground", "Landroid/graphics/drawable/Drawable;", "getMBackground", "()Landroid/graphics/drawable/Drawable;", "setMBackground", "(Landroid/graphics/drawable/Drawable;)V", "mCancelable", "getMCancelable", "()Ljava/lang/Boolean;", "setMCancelable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mCanceledOnTouchOutside", "getMCanceledOnTouchOutside", "setMCanceledOnTouchOutside", "mContentLayout", "Landroid/view/View;", "getMContentLayout", "()Landroid/view/View;", "setMContentLayout", "(Landroid/view/View;)V", "mContentLayoutRes", "getMContentLayoutRes", "setMContentLayoutRes", "mDialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "getMDialog", "()Lcom/larksuite/component/universe_design/dialog/UDDialog;", "setMDialog", "(Lcom/larksuite/component/universe_design/dialog/UDDialog;)V", "mFooterLayout", "getMFooterLayout", "setMFooterLayout", "mFooterLayoutRes", "getMFooterLayoutRes", "setMFooterLayoutRes", "mGravity", "getMGravity", "setMGravity", "mHeaderLayout", "getMHeaderLayout", "setMHeaderLayout", "mHeaderLayoutRes", "getMHeaderLayoutRes", "setMHeaderLayoutRes", "mHeight", "", "getMHeight", "()F", "setMHeight", "(F)V", "mLifecycleCallback", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "getMLifecycleCallback", "()Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "setMLifecycleCallback", "(Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;)V", "mMarginInDp", "getMMarginInDp", "setMMarginInDp", "mMaskAlpha", "getMMaskAlpha", "setMMaskAlpha", "mMaxHeight", "getMMaxHeight", "setMMaxHeight", "mMaxWidth", "Lcom/larksuite/component/universe_design/dimension/UDDimension;", "getMMaxWidth", "()Lcom/larksuite/component/universe_design/dimension/UDDimension;", "setMMaxWidth", "(Lcom/larksuite/component/universe_design/dimension/UDDimension;)V", "mMessage", "", "getMMessage", "()Ljava/lang/CharSequence;", "setMMessage", "(Ljava/lang/CharSequence;)V", "mMessageGravity", "getMMessageGravity", "setMMessageGravity", "mMessagePaddingBottom", "getMMessagePaddingBottom", "setMMessagePaddingBottom", "mMessagePaddingLeft", "getMMessagePaddingLeft", "setMMessagePaddingLeft", "mMessagePaddingRight", "getMMessagePaddingRight", "setMMessagePaddingRight", "mMessagePaddingTop", "getMMessagePaddingTop", "setMMessagePaddingTop", "mMessageSize", "getMMessageSize", "setMMessageSize", "mMessageTextColor", "getMMessageTextColor", "setMMessageTextColor", "mOnCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "getMOnCancelListener", "()Landroid/content/DialogInterface$OnCancelListener;", "setMOnCancelListener", "(Landroid/content/DialogInterface$OnCancelListener;)V", "mOnDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getMOnDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setMOnDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "mPaddingBottomInDp", "getMPaddingBottomInDp", "setMPaddingBottomInDp", "mPaddingLeftInDp", "getMPaddingLeftInDp", "setMPaddingLeftInDp", "mPaddingRightInDp", "getMPaddingRightInDp", "setMPaddingRightInDp", "mPaddingTopInDp", "getMPaddingTopInDp", "setMPaddingTopInDp", "mRootLayout", "getMRootLayout", "setMRootLayout", "mRootLayoutRes", "getMRootLayoutRes", "setMRootLayoutRes", "mTitle", "getMTitle", "setMTitle", "mTitleGravity", "getMTitleGravity", "setMTitleGravity", "mTitleLineCount", "getMTitleLineCount", "setMTitleLineCount", "mTitlePaddingBottom", "getMTitlePaddingBottom", "setMTitlePaddingBottom", "mTitlePaddingLeft", "getMTitlePaddingLeft", "setMTitlePaddingLeft", "mTitlePaddingRight", "getMTitlePaddingRight", "setMTitlePaddingRight", "mTitlePaddingTop", "getMTitlePaddingTop", "setMTitlePaddingTop", "mTitleSize", "getMTitleSize", "setMTitleSize", "mTitleTextColor", "getMTitleTextColor", "setMTitleTextColor", "mTitleTextStyleBold", "getMTitleTextStyleBold", "setMTitleTextStyleBold", "mTranslationOnY", "getMTranslationOnY", "setMTranslationOnY", "mViewClickInfos", "Landroid/util/Pair;", "Landroid/content/DialogInterface$OnClickListener;", "getMViewClickInfos", "mWidth", "getMWidth", "setMWidth", "adjustSize", "", "apply", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "applyDialogConfig", "beforeCreate", "createView", "getDefaultContentRes", "getDefaultFooterRes", "getDefaultHeaderRes", "getDefaultRootRes", "getDialogInitSize", "Landroid/util/Size;", "getFinalView", "initView", "initRes", "defaultRes", "getSize", "dpValue", "fullSize", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateContent", "onCreateFooter", "onCreateHeader", "onDismiss", "onShow", "setupTextView", "textView", "Landroid/widget/TextView;", "textSize", "textColor", "setupViewPadding", "view", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "Companion", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDDialogController implements UDDialog.DialogCallback {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private boolean isContentLayoutDefault;
    private boolean isContentVisible = true;
    private boolean isFooterLayoutDefault;
    private boolean isFooterVisible = true;
    private boolean isHeaderLayoutDefault;
    private boolean isHeaderVisible = true;
    private final List<UDBaseDialogBuilder.ActionButtonInfo> mActionButtons = new ArrayList();
    private UDBaseDialogBuilder.ActionBottomOrientation mActionButtonsOrientation = UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL;
    private int mAnimStyle;
    private boolean mAutoDismiss = true;
    private Drawable mBackground;
    private Boolean mCancelable;
    private Boolean mCanceledOnTouchOutside;
    private View mContentLayout;
    private int mContentLayoutRes;
    private UDDialog mDialog;
    private View mFooterLayout;
    private int mFooterLayoutRes;
    private int mGravity = 17;
    private View mHeaderLayout;
    private int mHeaderLayoutRes;
    private float mHeight = ((float) -2);
    private UDBaseDialogBuilder.LifecycleCallback mLifecycleCallback;
    private int mMarginInDp;
    private float mMaskAlpha = -1.0f;
    private float mMaxHeight = 1.0f;
    private UDDimension mMaxWidth = new UDDimension.Px(Integer.MAX_VALUE);
    private CharSequence mMessage;
    private int mMessageGravity = -1;
    private int mMessagePaddingBottom = -1;
    private int mMessagePaddingLeft = -1;
    private int mMessagePaddingRight = -1;
    private int mMessagePaddingTop = -1;
    private int mMessageSize = -1;
    private int mMessageTextColor = -1;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private int mPaddingBottomInDp;
    private int mPaddingLeftInDp;
    private int mPaddingRightInDp;
    private int mPaddingTopInDp;
    private View mRootLayout;
    private int mRootLayoutRes;
    private CharSequence mTitle;
    private int mTitleGravity = -1;
    private int mTitleLineCount = 2;
    private int mTitlePaddingBottom = -1;
    private int mTitlePaddingLeft = -1;
    private int mTitlePaddingRight = -1;
    private int mTitlePaddingTop = -1;
    private int mTitleSize = -1;
    private int mTitleTextColor = -1;
    private Boolean mTitleTextStyleBold;
    private int mTranslationOnY;
    private final List<Pair<Integer, DialogInterface.OnClickListener>> mViewClickInfos = new ArrayList();
    private float mWidth = 1.0f;

    /* access modifiers changed from: protected */
    public int getDefaultRootRes() {
        return R.layout.ud_dialog_default_root;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback
    public void onDismiss() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/dialog/UDDialogController$Companion;", "", "()V", "DEFAULT_NO_MESSAGE_TITLE_PADDING_BOTTOM", "", "DEFAULT_NO_TITLE_MESSAGE_PADDING_TOP", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialogController$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public final List<UDBaseDialogBuilder.ActionButtonInfo> getMActionButtons() {
        return this.mActionButtons;
    }

    /* access modifiers changed from: protected */
    public final UDBaseDialogBuilder.ActionBottomOrientation getMActionButtonsOrientation() {
        return this.mActionButtonsOrientation;
    }

    /* access modifiers changed from: protected */
    public final int getMAnimStyle() {
        return this.mAnimStyle;
    }

    public final boolean getMAutoDismiss() {
        return this.mAutoDismiss;
    }

    /* access modifiers changed from: protected */
    public final Drawable getMBackground() {
        return this.mBackground;
    }

    /* access modifiers changed from: protected */
    public final Boolean getMCancelable() {
        return this.mCancelable;
    }

    /* access modifiers changed from: protected */
    public final Boolean getMCanceledOnTouchOutside() {
        return this.mCanceledOnTouchOutside;
    }

    /* access modifiers changed from: protected */
    public final View getMContentLayout() {
        return this.mContentLayout;
    }

    /* access modifiers changed from: protected */
    public final int getMContentLayoutRes() {
        return this.mContentLayoutRes;
    }

    public final UDDialog getMDialog() {
        return this.mDialog;
    }

    /* access modifiers changed from: protected */
    public final View getMFooterLayout() {
        return this.mFooterLayout;
    }

    /* access modifiers changed from: protected */
    public final int getMFooterLayoutRes() {
        return this.mFooterLayoutRes;
    }

    /* access modifiers changed from: protected */
    public final int getMGravity() {
        return this.mGravity;
    }

    /* access modifiers changed from: protected */
    public final View getMHeaderLayout() {
        return this.mHeaderLayout;
    }

    /* access modifiers changed from: protected */
    public final int getMHeaderLayoutRes() {
        return this.mHeaderLayoutRes;
    }

    /* access modifiers changed from: protected */
    public final float getMHeight() {
        return this.mHeight;
    }

    /* access modifiers changed from: protected */
    public final UDBaseDialogBuilder.LifecycleCallback getMLifecycleCallback() {
        return this.mLifecycleCallback;
    }

    /* access modifiers changed from: protected */
    public final int getMMarginInDp() {
        return this.mMarginInDp;
    }

    /* access modifiers changed from: protected */
    public final float getMMaskAlpha() {
        return this.mMaskAlpha;
    }

    /* access modifiers changed from: protected */
    public final float getMMaxHeight() {
        return this.mMaxHeight;
    }

    /* access modifiers changed from: protected */
    public final UDDimension getMMaxWidth() {
        return this.mMaxWidth;
    }

    /* access modifiers changed from: protected */
    public final CharSequence getMMessage() {
        return this.mMessage;
    }

    /* access modifiers changed from: protected */
    public final int getMMessageGravity() {
        return this.mMessageGravity;
    }

    /* access modifiers changed from: protected */
    public final int getMMessagePaddingBottom() {
        return this.mMessagePaddingBottom;
    }

    /* access modifiers changed from: protected */
    public final int getMMessagePaddingLeft() {
        return this.mMessagePaddingLeft;
    }

    /* access modifiers changed from: protected */
    public final int getMMessagePaddingRight() {
        return this.mMessagePaddingRight;
    }

    /* access modifiers changed from: protected */
    public final int getMMessagePaddingTop() {
        return this.mMessagePaddingTop;
    }

    /* access modifiers changed from: protected */
    public final int getMMessageSize() {
        return this.mMessageSize;
    }

    /* access modifiers changed from: protected */
    public final int getMMessageTextColor() {
        return this.mMessageTextColor;
    }

    /* access modifiers changed from: protected */
    public final DialogInterface.OnCancelListener getMOnCancelListener() {
        return this.mOnCancelListener;
    }

    /* access modifiers changed from: protected */
    public final DialogInterface.OnDismissListener getMOnDismissListener() {
        return this.mOnDismissListener;
    }

    /* access modifiers changed from: protected */
    public final int getMPaddingBottomInDp() {
        return this.mPaddingBottomInDp;
    }

    /* access modifiers changed from: protected */
    public final int getMPaddingLeftInDp() {
        return this.mPaddingLeftInDp;
    }

    /* access modifiers changed from: protected */
    public final int getMPaddingRightInDp() {
        return this.mPaddingRightInDp;
    }

    /* access modifiers changed from: protected */
    public final int getMPaddingTopInDp() {
        return this.mPaddingTopInDp;
    }

    /* access modifiers changed from: protected */
    public final View getMRootLayout() {
        return this.mRootLayout;
    }

    /* access modifiers changed from: protected */
    public final int getMRootLayoutRes() {
        return this.mRootLayoutRes;
    }

    /* access modifiers changed from: protected */
    public final CharSequence getMTitle() {
        return this.mTitle;
    }

    /* access modifiers changed from: protected */
    public final int getMTitleGravity() {
        return this.mTitleGravity;
    }

    /* access modifiers changed from: protected */
    public final int getMTitleLineCount() {
        return this.mTitleLineCount;
    }

    /* access modifiers changed from: protected */
    public final int getMTitlePaddingBottom() {
        return this.mTitlePaddingBottom;
    }

    /* access modifiers changed from: protected */
    public final int getMTitlePaddingLeft() {
        return this.mTitlePaddingLeft;
    }

    /* access modifiers changed from: protected */
    public final int getMTitlePaddingRight() {
        return this.mTitlePaddingRight;
    }

    /* access modifiers changed from: protected */
    public final int getMTitlePaddingTop() {
        return this.mTitlePaddingTop;
    }

    /* access modifiers changed from: protected */
    public final int getMTitleSize() {
        return this.mTitleSize;
    }

    /* access modifiers changed from: protected */
    public final int getMTitleTextColor() {
        return this.mTitleTextColor;
    }

    /* access modifiers changed from: protected */
    public final Boolean getMTitleTextStyleBold() {
        return this.mTitleTextStyleBold;
    }

    /* access modifiers changed from: protected */
    public final int getMTranslationOnY() {
        return this.mTranslationOnY;
    }

    /* access modifiers changed from: protected */
    public final List<Pair<Integer, DialogInterface.OnClickListener>> getMViewClickInfos() {
        return this.mViewClickInfos;
    }

    /* access modifiers changed from: protected */
    public final float getMWidth() {
        return this.mWidth;
    }

    public final boolean isContentLayoutDefault$universe_ui_dialog_release() {
        return this.isContentLayoutDefault;
    }

    public final boolean isContentVisible$universe_ui_dialog_release() {
        return this.isContentVisible;
    }

    public final boolean isFooterLayoutDefault$universe_ui_dialog_release() {
        return this.isFooterLayoutDefault;
    }

    public final boolean isFooterVisible$universe_ui_dialog_release() {
        return this.isFooterVisible;
    }

    public final boolean isHeaderLayoutDefault$universe_ui_dialog_release() {
        return this.isHeaderLayoutDefault;
    }

    public final boolean isHeaderVisible$universe_ui_dialog_release() {
        return this.isHeaderVisible;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback
    public void onShow() {
        adjustSize();
    }

    /* access modifiers changed from: protected */
    public int getDefaultContentRes() {
        this.isContentLayoutDefault = true;
        return R.layout.ud_dialog_default_content;
    }

    /* access modifiers changed from: protected */
    public int getDefaultHeaderRes() {
        this.isHeaderLayoutDefault = true;
        return R.layout.ud_dialog_default_header;
    }

    private final void initView() {
        UDDialog uDDialog;
        View createView = createView();
        if (createView != null && (uDDialog = this.mDialog) != null) {
            uDDialog.setContentView(createView);
        }
    }

    /* access modifiers changed from: protected */
    public int getDefaultFooterRes() {
        this.isFooterLayoutDefault = true;
        int i = C25751f.f63326a[this.mActionButtonsOrientation.ordinal()];
        if (i == 1) {
            return R.layout.ud_dialog_default_horizontal_footer;
        }
        if (i == 2) {
            return R.layout.ud_dialog_default_vertical_footer;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/larksuite/component/universe_design/dialog/UDDialogController$adjustSize$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "universe-ui-dialog_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialogController$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC25745b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f63281a;

        /* renamed from: b */
        final /* synthetic */ float f63282b;

        /* renamed from: c */
        final /* synthetic */ Window f63283c;

        /* renamed from: d */
        final /* synthetic */ Size f63284d;

        public void onGlobalLayout() {
            this.f63281a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (((float) this.f63281a.getHeight()) > this.f63282b) {
                ViewGroup.LayoutParams layoutParams = this.f63281a.getLayoutParams();
                layoutParams.height = (int) this.f63282b;
                this.f63281a.setLayoutParams(layoutParams);
                this.f63281a.requestLayout();
                this.f63283c.setLayout(this.f63284d.getWidth(), (int) this.f63282b);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC25745b(View view, float f, Window window, Size size) {
            this.f63281a = view;
            this.f63282b = f;
            this.f63283c = window;
            this.f63284d = size;
        }
    }

    private final void adjustSize() {
        Window window;
        UDDialog uDDialog = this.mDialog;
        if (uDDialog != null && (window = uDDialog.getWindow()) != null) {
            Size dialogInitSize = getDialogInitSize();
            float a = UDDimenUtils.m93308a(this.context, this.mTranslationOnY);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = dialogInitSize.getWidth();
            attributes.height = dialogInitSize.getHeight();
            attributes.y = (int) a;
            attributes.gravity = this.mGravity;
            window.setAttributes(attributes);
            float f = this.mMaxHeight;
            if (f > ((float) 0) && f != 1.0f) {
                float size = getSize(f, UDUiUtils.m93321a(this.context).getHeight());
                View decorView = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView, "window.decorView");
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC25745b(decorView, size, window, dialogInitSize));
            }
        }
    }

    private final Size getDialogInitSize() {
        float f;
        float f2;
        Size a = UDUiUtils.m93321a(this.context);
        float a2 = UDDimenUtils.m93308a(this.context, this.mMarginInDp);
        float size = getSize(this.mWidth, Math.min(a.getWidth(), a.getHeight()));
        float f3 = (float) 0;
        if (size > f3) {
            f = Math.max((float) BitmapDescriptorFactory.HUE_RED, size - (((float) 2) * a2));
        } else {
            f = this.mWidth;
        }
        float min = Math.min(f, this.mMaxWidth.mo90193a(this.context));
        float size2 = getSize(this.mHeight, a.getHeight());
        if (size2 > f3) {
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, size2 - (a2 * ((float) 2)));
        } else {
            f2 = this.mHeight;
        }
        return new Size((int) min, (int) f2);
    }

    /* access modifiers changed from: protected */
    public View onCreateContent() {
        View finalView = getFinalView(this.mContentLayout, this.mContentLayoutRes, getDefaultContentRes());
        if (finalView == null) {
            return null;
        }
        if (!TextUtils.isEmpty(this.mMessage)) {
            TextView textView = (TextView) finalView.findViewById(R.id.ud_dialog_content_message_tv);
            if (textView != null) {
                int i = this.mMessageGravity;
                if (i >= 0) {
                    textView.setGravity(i);
                }
                textView.setText(this.mMessage);
                setupTextView(textView, this.mMessageSize, this.mMessageTextColor);
            }
            if (this.isHeaderVisible || this.mMessagePaddingTop >= 0) {
                setupViewPadding(finalView, this.mMessagePaddingLeft, this.mMessagePaddingTop, this.mMessagePaddingRight, this.mMessagePaddingBottom);
            } else {
                Context context2 = this.context;
                setupViewPadding(finalView, this.mMessagePaddingLeft, UDDimenUtils.m93310b(context2, (int) UDDimenUtils.m93311c(context2, (int) R.dimen.ud_dialog_padding_top)), this.mMessagePaddingRight, this.mMessagePaddingBottom);
            }
        } else if (this.mContentLayout == null && this.mContentLayoutRes == 0 && this.isContentLayoutDefault) {
            finalView.setVisibility(8);
            this.isContentVisible = false;
        }
        return finalView;
    }

    /* access modifiers changed from: protected */
    public View onCreateHeader() {
        Typeface typeface;
        View finalView = getFinalView(this.mHeaderLayout, this.mHeaderLayoutRes, getDefaultHeaderRes());
        if (finalView == null) {
            return null;
        }
        if (!TextUtils.isEmpty(this.mTitle)) {
            TextView textView = (TextView) finalView.findViewById(R.id.ud_dialog_title_tv);
            if (textView != null) {
                textView.setMaxLines(this.mTitleLineCount);
                int i = this.mTitleGravity;
                if (i >= 0) {
                    textView.setGravity(i);
                }
                textView.setText(this.mTitle);
                Boolean bool = this.mTitleTextStyleBold;
                if (bool != null) {
                    if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                        typeface = Typeface.DEFAULT_BOLD;
                    } else {
                        typeface = Typeface.DEFAULT;
                    }
                    textView.setTypeface(typeface);
                }
                setupTextView(textView, this.mTitleSize, this.mTitleTextColor);
            }
            setupViewPadding(finalView, this.mTitlePaddingLeft, this.mTitlePaddingTop, this.mTitlePaddingRight, this.mTitlePaddingBottom);
        } else if (this.mHeaderLayout == null && this.mHeaderLayoutRes == 0 && this.isHeaderLayoutDefault) {
            finalView.setVisibility(8);
            this.isHeaderVisible = false;
        }
        return finalView;
    }

    /* access modifiers changed from: protected */
    public View createView() {
        View finalView = getFinalView(this.mRootLayout, this.mRootLayoutRes, getDefaultRootRes());
        Window window = null;
        if (finalView == null) {
            return null;
        }
        setupViewPadding(finalView, this.mPaddingLeftInDp, this.mPaddingTopInDp, this.mPaddingRightInDp, this.mPaddingBottomInDp);
        ViewGroup viewGroup = (ViewGroup) finalView.findViewById(R.id.ud_dialog_header_container);
        ViewGroup viewGroup2 = (ViewGroup) finalView.findViewById(R.id.ud_dialog_content_container);
        ViewGroup viewGroup3 = (ViewGroup) finalView.findViewById(R.id.ud_dialog_footer_container);
        View onCreateHeader = onCreateHeader();
        if (!(onCreateHeader == null || viewGroup == null)) {
            viewGroup.addView(onCreateHeader);
        }
        View onCreateContent = onCreateContent();
        if (!(onCreateContent == null || viewGroup2 == null)) {
            viewGroup2.addView(onCreateContent);
        }
        View onCreateFooter = onCreateFooter();
        if (!(onCreateFooter == null || viewGroup3 == null)) {
            viewGroup3.addView(onCreateFooter);
        }
        for (Pair<Integer, DialogInterface.OnClickListener> pair : this.mViewClickInfos) {
            Object obj = pair.first;
            Intrinsics.checkExpressionValueIsNotNull(obj, "viewActionInfo.first");
            View findViewById = finalView.findViewById(((Number) obj).intValue());
            if (!(pair.second == null || findViewById == null)) {
                findViewById.setOnClickListener(new View$OnClickListenerC25746c(this, pair));
            }
        }
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            finalView.setBackground(drawable);
        }
        UDDialog uDDialog = this.mDialog;
        if (uDDialog != null) {
            window = uDDialog.getWindow();
        }
        float f = this.mMaskAlpha;
        if (!(f == -1.0f || window == null)) {
            window.setDimAmount(f);
        }
        return finalView;
    }

    /* access modifiers changed from: protected */
    public View onCreateFooter() {
        UDButton uDButton;
        UDButton uDButton2;
        UDButton uDButton3;
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View finalView = getFinalView(this.mFooterLayout, this.mFooterLayoutRes, getDefaultFooterRes());
        if (finalView == null) {
            return null;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        for (UDBaseDialogBuilder.ActionButtonInfo bVar : this.mActionButtons) {
            TextView textView = (TextView) finalView.findViewById(bVar.mo90720a());
            if (textView != null) {
                textView.setVisibility(0);
                if (bVar.mo90721b() != 0) {
                    textView.setText(bVar.mo90721b());
                } else {
                    textView.setText(bVar.mo90722c());
                }
                if (bVar.mo90724e() != 0) {
                    Context context2 = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    textView.setTextColor(UDColorUtils.getColor(context2, bVar.mo90724e()));
                } else if (bVar.mo90725f() != 0) {
                    textView.setTextColor(bVar.mo90725f());
                }
                if (bVar.mo90723d() != 0) {
                    textView.setTextSize((float) bVar.mo90723d());
                }
                if (bVar.mo90726g() != 0) {
                    UDRoundDrawable aVar = new UDRoundDrawable();
                    Context context3 = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                    aVar.setColor(UDColorUtils.getColor(context3, bVar.mo90726g()));
                    UDRadius uDRadius = UDRadius.L;
                    Context context4 = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                    aVar.setCornerRadius((float) uDRadius.getRadiusSize(context4));
                    textView.setBackground(aVar);
                } else if (bVar.mo90727h() != 0) {
                    textView.setBackgroundResource(bVar.mo90727h());
                }
                textView.setOnClickListener(new View$OnClickListenerC25747d(this, bVar, intRef));
                int a = bVar.mo90720a();
                if (a == R.id.ud_dialog_btn_secondary2) {
                    intRef.element |= 1;
                } else if (a == R.id.ud_dialog_btn_secondary) {
                    intRef.element |= 2;
                } else if (a == R.id.ud_dialog_btn_primary) {
                    intRef.element |= 4;
                } else if (a == R.id.ud_dialog_btn_cancel) {
                    intRef.element |= 8;
                }
            }
        }
        if (intRef.element > 0 && (findViewById5 = finalView.findViewById(R.id.ud_dialog_footer_divider)) != null) {
            findViewById5.setVisibility(0);
        }
        if (intRef.element == 6 && (findViewById4 = finalView.findViewById(R.id.ud_dialog_btn_divider)) != null) {
            findViewById4.setVisibility(0);
        }
        if (!((intRef.element & 1) == 0 || (findViewById3 = finalView.findViewById(R.id.ud_dialog_secondary_btn_divider2)) == null)) {
            findViewById3.setVisibility(0);
        }
        if (!((intRef.element & 2) == 0 || (findViewById2 = finalView.findViewById(R.id.ud_dialog_secondary_btn_divider)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (!((intRef.element & 4) == 0 || (findViewById = finalView.findViewById(R.id.ud_dialog_primary_btn_divider)) == null)) {
            findViewById.setVisibility(0);
        }
        float radiusSize = (float) UDRadius.L.getRadiusSize(this.context);
        if (this.mActionButtonsOrientation == UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL) {
            if (intRef.element == 2 && (uDButton3 = (UDButton) finalView.findViewById(R.id.ud_dialog_btn_secondary)) != null) {
                uDButton3.setCornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, radiusSize, radiusSize);
            }
            if (intRef.element == 4 && (uDButton2 = (UDButton) finalView.findViewById(R.id.ud_dialog_btn_primary)) != null) {
                uDButton2.setCornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, radiusSize, radiusSize);
            }
        } else if ((intRef.element & 1) > 0) {
            UDButton uDButton4 = (UDButton) finalView.findViewById(R.id.ud_dialog_btn_secondary2);
            if (uDButton4 != null) {
                uDButton4.setCornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, radiusSize, radiusSize);
            }
        } else if ((intRef.element & 2) > 0) {
            UDButton uDButton5 = (UDButton) finalView.findViewById(R.id.ud_dialog_btn_secondary);
            if (uDButton5 != null) {
                uDButton5.setCornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, radiusSize, radiusSize);
            }
        } else if ((intRef.element & 4) > 0 && (uDButton = (UDButton) finalView.findViewById(R.id.ud_dialog_btn_primary)) != null) {
            uDButton.setCornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, radiusSize, radiusSize);
        }
        if (TextUtils.isEmpty(this.mMessage) && this.mContentLayout == null && this.mContentLayoutRes == 0 && this.isContentLayoutDefault) {
            finalView.setPadding(0, (int) UDDimenUtils.m93308a(this.context, 12), 0, 0);
        }
        return finalView;
    }

    public final void setContentLayoutDefault$universe_ui_dialog_release(boolean z) {
        this.isContentLayoutDefault = z;
    }

    public final void setContentVisible$universe_ui_dialog_release(boolean z) {
        this.isContentVisible = z;
    }

    public final void setFooterLayoutDefault$universe_ui_dialog_release(boolean z) {
        this.isFooterLayoutDefault = z;
    }

    public final void setFooterVisible$universe_ui_dialog_release(boolean z) {
        this.isFooterVisible = z;
    }

    public final void setHeaderLayoutDefault$universe_ui_dialog_release(boolean z) {
        this.isHeaderLayoutDefault = z;
    }

    public final void setHeaderVisible$universe_ui_dialog_release(boolean z) {
        this.isHeaderVisible = z;
    }

    /* access modifiers changed from: protected */
    public final void setMAnimStyle(int i) {
        this.mAnimStyle = i;
    }

    public final void setMAutoDismiss(boolean z) {
        this.mAutoDismiss = z;
    }

    /* access modifiers changed from: protected */
    public final void setMBackground(Drawable drawable) {
        this.mBackground = drawable;
    }

    /* access modifiers changed from: protected */
    public final void setMCancelable(Boolean bool) {
        this.mCancelable = bool;
    }

    /* access modifiers changed from: protected */
    public final void setMCanceledOnTouchOutside(Boolean bool) {
        this.mCanceledOnTouchOutside = bool;
    }

    /* access modifiers changed from: protected */
    public final void setMContentLayout(View view) {
        this.mContentLayout = view;
    }

    /* access modifiers changed from: protected */
    public final void setMContentLayoutRes(int i) {
        this.mContentLayoutRes = i;
    }

    public final void setMDialog(UDDialog uDDialog) {
        this.mDialog = uDDialog;
    }

    /* access modifiers changed from: protected */
    public final void setMFooterLayout(View view) {
        this.mFooterLayout = view;
    }

    /* access modifiers changed from: protected */
    public final void setMFooterLayoutRes(int i) {
        this.mFooterLayoutRes = i;
    }

    /* access modifiers changed from: protected */
    public final void setMGravity(int i) {
        this.mGravity = i;
    }

    /* access modifiers changed from: protected */
    public final void setMHeaderLayout(View view) {
        this.mHeaderLayout = view;
    }

    /* access modifiers changed from: protected */
    public final void setMHeaderLayoutRes(int i) {
        this.mHeaderLayoutRes = i;
    }

    /* access modifiers changed from: protected */
    public final void setMHeight(float f) {
        this.mHeight = f;
    }

    /* access modifiers changed from: protected */
    public final void setMLifecycleCallback(UDBaseDialogBuilder.LifecycleCallback cVar) {
        this.mLifecycleCallback = cVar;
    }

    /* access modifiers changed from: protected */
    public final void setMMarginInDp(int i) {
        this.mMarginInDp = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMaskAlpha(float f) {
        this.mMaskAlpha = f;
    }

    /* access modifiers changed from: protected */
    public final void setMMaxHeight(float f) {
        this.mMaxHeight = f;
    }

    /* access modifiers changed from: protected */
    public final void setMMessage(CharSequence charSequence) {
        this.mMessage = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void setMMessageGravity(int i) {
        this.mMessageGravity = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessagePaddingBottom(int i) {
        this.mMessagePaddingBottom = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessagePaddingLeft(int i) {
        this.mMessagePaddingLeft = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessagePaddingRight(int i) {
        this.mMessagePaddingRight = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessagePaddingTop(int i) {
        this.mMessagePaddingTop = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessageSize(int i) {
        this.mMessageSize = i;
    }

    /* access modifiers changed from: protected */
    public final void setMMessageTextColor(int i) {
        this.mMessageTextColor = i;
    }

    /* access modifiers changed from: protected */
    public final void setMOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.mOnCancelListener = onCancelListener;
    }

    /* access modifiers changed from: protected */
    public final void setMOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    /* access modifiers changed from: protected */
    public final void setMPaddingBottomInDp(int i) {
        this.mPaddingBottomInDp = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaddingLeftInDp(int i) {
        this.mPaddingLeftInDp = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaddingRightInDp(int i) {
        this.mPaddingRightInDp = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaddingTopInDp(int i) {
        this.mPaddingTopInDp = i;
    }

    /* access modifiers changed from: protected */
    public final void setMRootLayout(View view) {
        this.mRootLayout = view;
    }

    /* access modifiers changed from: protected */
    public final void setMRootLayoutRes(int i) {
        this.mRootLayoutRes = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void setMTitleGravity(int i) {
        this.mTitleGravity = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitleLineCount(int i) {
        this.mTitleLineCount = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitlePaddingBottom(int i) {
        this.mTitlePaddingBottom = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitlePaddingLeft(int i) {
        this.mTitlePaddingLeft = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitlePaddingRight(int i) {
        this.mTitlePaddingRight = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitlePaddingTop(int i) {
        this.mTitlePaddingTop = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitleSize(int i) {
        this.mTitleSize = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitleTextColor(int i) {
        this.mTitleTextColor = i;
    }

    /* access modifiers changed from: protected */
    public final void setMTitleTextStyleBold(Boolean bool) {
        this.mTitleTextStyleBold = bool;
    }

    /* access modifiers changed from: protected */
    public final void setMTranslationOnY(int i) {
        this.mTranslationOnY = i;
    }

    /* access modifiers changed from: protected */
    public final void setMWidth(float f) {
        this.mWidth = f;
    }

    /* access modifiers changed from: protected */
    public final void setMActionButtonsOrientation(UDBaseDialogBuilder.ActionBottomOrientation actionBottomOrientation) {
        Intrinsics.checkParameterIsNotNull(actionBottomOrientation, "<set-?>");
        this.mActionButtonsOrientation = actionBottomOrientation;
    }

    /* access modifiers changed from: protected */
    public final void setMMaxWidth(UDDimension aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.mMaxWidth = aVar;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback
    public void beforeCreate(UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        UDBaseDialogBuilder.LifecycleCallback cVar = this.mLifecycleCallback;
        if (cVar != null) {
            cVar.mo89291a(uDDialog);
        }
    }

    private final void applyDialogConfig(UDBaseDialogBuilder<?> uDBaseDialogBuilder) {
        if (uDBaseDialogBuilder.getMGravity$universe_ui_dialog_release() == 80 && this.mAnimStyle == 0) {
            this.mAnimStyle = UDDialog.Companion.mo90734a().mo90735a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialogController$c */
    public static final class View$OnClickListenerC25746c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDDialogController f63285a;

        /* renamed from: b */
        final /* synthetic */ Pair f63286b;

        View$OnClickListenerC25746c(UDDialogController uDDialogController, Pair pair) {
            this.f63285a = uDDialogController;
            this.f63286b = pair;
        }

        public final void onClick(View view) {
            Object obj = this.f63286b.first;
            Intrinsics.checkExpressionValueIsNotNull(obj, "viewActionInfo.first");
            ((DialogInterface.OnClickListener) this.f63286b.second).onClick(this.f63285a.getMDialog(), ((Number) obj).intValue());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/larksuite/component/universe_design/dialog/UDDialogController$onCreateFooter$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.dialog.UDDialogController$d */
    public static final class View$OnClickListenerC25747d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDDialogController f63287a;

        /* renamed from: b */
        final /* synthetic */ UDBaseDialogBuilder.ActionButtonInfo f63288b;

        /* renamed from: c */
        final /* synthetic */ Ref.IntRef f63289c;

        View$OnClickListenerC25747d(UDDialogController uDDialogController, UDBaseDialogBuilder.ActionButtonInfo bVar, Ref.IntRef intRef) {
            this.f63287a = uDDialogController;
            this.f63288b = bVar;
            this.f63289c = intRef;
        }

        public final void onClick(View view) {
            UDDialog mDialog;
            DialogInterface.OnClickListener i = this.f63288b.mo90728i();
            if (i != null) {
                i.onClick(this.f63287a.getMDialog(), this.f63288b.mo90720a());
            }
            if (this.f63287a.getMAutoDismiss() && (mDialog = this.f63287a.getMDialog()) != null) {
                mDialog.dismiss();
            }
        }
    }

    public UDDialogController(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    /* access modifiers changed from: protected */
    public final float getSize(float f, int i) {
        if (f <= ((float) 0)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f <= ((float) 1)) {
            return ((float) i) * f;
        }
        return UDDimenUtils.m93307a(this.context, f);
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialog.DialogCallback
    public void onCreate(UDDialog uDDialog, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        Boolean bool = this.mCancelable;
        if (bool != null) {
            uDDialog.setCancelable(bool.booleanValue());
        }
        Boolean bool2 = this.mCanceledOnTouchOutside;
        if (bool2 != null) {
            uDDialog.setCanceledOnTouchOutside(bool2.booleanValue());
        }
        DialogInterface.OnCancelListener onCancelListener = this.mOnCancelListener;
        if (onCancelListener != null) {
            uDDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            uDDialog.setOnDismissListener(onDismissListener);
        }
        Window window = uDDialog.getWindow();
        int i = this.mAnimStyle;
        if (!(i == 0 || window == null)) {
            window.setWindowAnimations(i);
        }
        initView();
        UDBaseDialogBuilder.LifecycleCallback cVar = this.mLifecycleCallback;
        if (cVar != null) {
            cVar.mo89292b(uDDialog);
        }
    }

    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        float f;
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        this.mDialog = uDDialog;
        uDDialog.setCallback$universe_ui_dialog_release(this);
        this.mTitle = uDBaseDialogBuilder.getMTitle$universe_ui_dialog_release();
        this.mTitleSize = uDBaseDialogBuilder.getMTitleSize$universe_ui_dialog_release();
        this.mTitleTextColor = uDBaseDialogBuilder.getMTitleTextColor$universe_ui_dialog_release();
        this.mTitleTextStyleBold = uDBaseDialogBuilder.getMTitleTextStyleBold$universe_ui_dialog_release();
        this.mTitleLineCount = uDBaseDialogBuilder.getMTitleLineCount$universe_ui_dialog_release();
        this.mTitleGravity = uDBaseDialogBuilder.getMTitleGravity$universe_ui_dialog_release();
        this.mTitlePaddingLeft = uDBaseDialogBuilder.getMTitlePaddingLeft$universe_ui_dialog_release();
        this.mTitlePaddingTop = uDBaseDialogBuilder.getMTitlePaddingTop$universe_ui_dialog_release();
        this.mTitlePaddingRight = uDBaseDialogBuilder.getMTitlePaddingRight$universe_ui_dialog_release();
        this.mTitlePaddingBottom = uDBaseDialogBuilder.getMTitlePaddingBottom$universe_ui_dialog_release();
        this.mMessage = uDBaseDialogBuilder.getMMessage$universe_ui_dialog_release();
        this.mMessageSize = uDBaseDialogBuilder.getMMessageSize$universe_ui_dialog_release();
        this.mMessageTextColor = uDBaseDialogBuilder.getMMessageTextColor$universe_ui_dialog_release();
        this.mMessagePaddingLeft = uDBaseDialogBuilder.getMMessagePaddingLeft$universe_ui_dialog_release();
        this.mMessagePaddingTop = uDBaseDialogBuilder.getMMessagePaddingTop$universe_ui_dialog_release();
        this.mMessagePaddingRight = uDBaseDialogBuilder.getMMessagePaddingRight$universe_ui_dialog_release();
        this.mMessagePaddingBottom = uDBaseDialogBuilder.getMMessagePaddingBottom$universe_ui_dialog_release();
        this.mMessageGravity = uDBaseDialogBuilder.getMMessageGravity$universe_ui_dialog_release();
        this.mGravity = uDBaseDialogBuilder.getMGravity$universe_ui_dialog_release();
        this.mWidth = uDBaseDialogBuilder.getMWidth$universe_ui_dialog_release();
        this.mMaxWidth = uDBaseDialogBuilder.getMMaxWidth$universe_ui_dialog_release();
        this.mHeight = uDBaseDialogBuilder.getMHeight$universe_ui_dialog_release();
        this.mMaxHeight = uDBaseDialogBuilder.getMMaxHeight$universe_ui_dialog_release();
        this.mAutoDismiss = uDBaseDialogBuilder.getMAutoDismiss$universe_ui_dialog_release();
        this.mCancelable = uDBaseDialogBuilder.getMCancelable$universe_ui_dialog_release();
        this.mCanceledOnTouchOutside = uDBaseDialogBuilder.getMCanceledOnTouchOutside$universe_ui_dialog_release();
        this.mOnCancelListener = uDBaseDialogBuilder.getMOnCancelListener$universe_ui_dialog_release();
        this.mOnDismissListener = uDBaseDialogBuilder.getMOnDismissListener$universe_ui_dialog_release();
        this.mHeaderLayoutRes = uDBaseDialogBuilder.getMHeaderLayoutRes$universe_ui_dialog_release();
        this.mContentLayoutRes = uDBaseDialogBuilder.getMContentLayoutRes$universe_ui_dialog_release();
        this.mFooterLayoutRes = uDBaseDialogBuilder.getMFooterLayoutRes$universe_ui_dialog_release();
        this.mRootLayoutRes = uDBaseDialogBuilder.getMRootLayoutRes$universe_ui_dialog_release();
        this.mHeaderLayout = uDBaseDialogBuilder.getMHeaderLayout$universe_ui_dialog_release();
        this.mContentLayout = uDBaseDialogBuilder.getMContentLayout$universe_ui_dialog_release();
        this.mFooterLayout = uDBaseDialogBuilder.getMFooterLayout$universe_ui_dialog_release();
        this.mRootLayout = uDBaseDialogBuilder.getMRootLayout$universe_ui_dialog_release();
        this.mMarginInDp = uDBaseDialogBuilder.getMMarginInDp$universe_ui_dialog_release();
        this.mTranslationOnY = uDBaseDialogBuilder.getMTranslationOnY$universe_ui_dialog_release();
        this.mPaddingLeftInDp = uDBaseDialogBuilder.getMPaddingLeftInDp$universe_ui_dialog_release();
        this.mPaddingTopInDp = uDBaseDialogBuilder.getMPaddingTopInDp$universe_ui_dialog_release();
        this.mPaddingRightInDp = uDBaseDialogBuilder.getMPaddingRightInDp$universe_ui_dialog_release();
        this.mPaddingBottomInDp = uDBaseDialogBuilder.getMPaddingBottomInDp$universe_ui_dialog_release();
        this.mBackground = uDBaseDialogBuilder.getMBackground$universe_ui_dialog_release();
        this.mMaskAlpha = uDBaseDialogBuilder.getMMaskAlpha$universe_ui_dialog_release();
        this.mAnimStyle = uDBaseDialogBuilder.getMAnimStyle$universe_ui_dialog_release();
        this.mActionButtonsOrientation = uDBaseDialogBuilder.getMActionButtonsOrientation$universe_ui_dialog_release();
        this.mActionButtons.addAll(uDBaseDialogBuilder.getMActionButtons$universe_ui_dialog_release());
        this.mViewClickInfos.addAll(uDBaseDialogBuilder.getMViewClickInfos$universe_ui_dialog_release());
        this.mLifecycleCallback = uDBaseDialogBuilder.getMLifecycleCallback$universe_ui_dialog_release();
        if (this.mHeight == 1.0f) {
            if (this.mMarginInDp > 0) {
                Context context2 = this.context;
                this.mHeight = (float) UDDimenUtils.m93310b(context2, UDUiUtils.m93321a(context2).getHeight());
            } else {
                this.mHeight = (float) -1;
            }
        }
        if (this.mWidth == 1.0f) {
            if (this.mMarginInDp > 0) {
                Context context3 = this.context;
                f = (float) UDDimenUtils.m93310b(context3, UDUiUtils.m93321a(context3).getWidth());
            } else {
                f = (float) -1;
            }
            this.mWidth = f;
        }
        applyDialogConfig(uDBaseDialogBuilder);
    }

    /* access modifiers changed from: protected */
    public final View getFinalView(View view, int i, int i2) {
        View view2 = null;
        if (view != null) {
            return view;
        }
        if (i == 0) {
            i = i2;
        }
        if (i != 0) {
            return LayoutInflater.from(this.context).inflate(i, (ViewGroup) null);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    public final void setupTextView(TextView textView, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (i > 0) {
            textView.setTextSize(2, (float) i);
        }
        if (i2 != -1) {
            textView.setTextColor(UDColorUtils.getColor(this.context, i2));
        }
    }

    /* access modifiers changed from: protected */
    public final void setupViewPadding(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        int a = (int) UDDimenUtils.m93308a(this.context, i);
        int a2 = (int) UDDimenUtils.m93308a(this.context, i2);
        int a3 = (int) UDDimenUtils.m93308a(this.context, i3);
        int a4 = (int) UDDimenUtils.m93308a(this.context, i4);
        if (i < 0) {
            a = view.getPaddingLeft();
        }
        if (i2 < 0) {
            a2 = view.getPaddingTop();
        }
        if (i3 < 0) {
            a3 = view.getPaddingRight();
        }
        if (i4 < 0) {
            a4 = view.getPaddingBottom();
        }
        view.setPadding(a, a2, a3, a4);
    }
}
