package com.ss.android.lark.widget.light;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.ellipsize.EllipsizeHelper;
import com.ss.android.lark.widget.light.layout.C58489c;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IImageSpanClickListener;
import com.ss.android.lark.widget.light.listener.IIntentionClickListener;
import com.ss.android.lark.widget.light.listener.IMediaSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.light.listener.ImageClickInfo;
import com.ss.android.lark.widget.light.touch.TouchConsumeView;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.linked_emojicon.C58512f;
import com.ss.android.lark.widget.select.SelectableView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.C59159i;
import com.ss.android.lark.widget.span.C59160j;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.RemoteMediaSpan;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 À\u00012\u00020\u00012\u00020\u0002:\u0004À\u0001Á\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010.H\u0002J\u0018\u0010k\u001a\u00020.2\u0006\u0010j\u001a\u00020.2\u0006\u0010l\u001a\u00020TH\u0002J\b\u0010m\u001a\u00020\nH\u0016J\b\u0010n\u001a\u00020\nH\u0016J\n\u0010o\u001a\u0004\u0018\u00010.H\u0016J\u0006\u0010p\u001a\u00020qJ\n\u0010r\u001a\u0004\u0018\u00010<H\u0016J\b\u0010s\u001a\u00020TH\u0002J\b\u0010t\u001a\u00020TH\u0002J\n\u0010u\u001a\u0004\u0018\u000106H\u0002J\u001a\u0010v\u001a\u0004\u0018\u00010<2\u0006\u0010j\u001a\u00020.2\u0006\u0010w\u001a\u00020\nH\u0002J\b\u0010x\u001a\u00020iH\u0002J(\u0010y\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020T2\u0006\u0010\u001a\u00020TH\u0016J%\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J%\u0010\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0015\u0010\u0001\u001a\u00020i2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0014J%\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J%\u0010\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0016J6\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020$2\u0007\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\nH\u0014J\u001b\u0010\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\nH\u0014J:\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020$2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J.\u0010\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020$H\u0016J\u001b\u0010\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010 \u0001\u001a\u00030\u0001H\u0016J\u001b\u0010¡\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010 \u0001\u001a\u00030\u0001H\u0016J\u0013\u0010¢\u0001\u001a\u00020$2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0016J\u001b\u0010¥\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010¦\u0001\u001a\u00020$2\u0006\u0010z\u001a\u00020{2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001b\u0010§\u0001\u001a\u00020i2\u0006\u0010z\u001a\u00020{2\b\u0010¨\u0001\u001a\u00030©\u0001H\u0016J\u0010\u0010ª\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020*J\u0010\u0010¬\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020,J\u0010\u0010­\u0001\u001a\u00020i2\u0007\u0010®\u0001\u001a\u00020<J\u0012\u0010¯\u0001\u001a\u00020i2\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0010\u0010°\u0001\u001a\u00020i2\u0007\u0010±\u0001\u001a\u00020$J\u0010\u0010²\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u000202J\u0012\u0010³\u0001\u001a\u00020i2\u0007\u0010´\u0001\u001a\u00020\nH\u0016J\u0010\u0010µ\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u000208J\u0010\u0010¶\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020:J\u0010\u0010·\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020>J\u0010\u0010¸\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020@J\u0015\u0010¹\u0001\u001a\u00020i2\n\u0010«\u0001\u001a\u0005\u0018\u00010º\u0001H\u0016J\u0012\u0010»\u0001\u001a\u00020i2\t\u0010«\u0001\u001a\u0004\u0018\u000100J\u0010\u0010¼\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020EJ\u0012\u0010½\u0001\u001a\u00020i2\u0007\u0010´\u0001\u001a\u00020\nH\u0016J\u0010\u0010¾\u0001\u001a\u00020i2\u0007\u0010«\u0001\u001a\u00020HJ\t\u0010¿\u0001\u001a\u00020iH\u0016R\u000e\u0010\f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010I\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001b\"\u0004\bK\u0010\u001dR\u0012\u0010L\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010&\"\u0004\bO\u0010(R\u001a\u0010P\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\u001a\u0010S\u001a\u00020TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020TX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001e\u0010\\\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001b\"\u0004\b^\u0010\u001dR\u001a\u0010_\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010\u001dR\u001a\u0010b\u001a\u00020cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006Â\u0001"}, d2 = {"Lcom/ss/android/lark/widget/light/LKUILightTextView;", "Lcom/ss/android/lark/widget/light/touch/TouchConsumeView;", "Lcom/ss/android/lark/widget/light/listener/ISpanClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TEXT_ITALIC_PADDING", "alignment", "Landroid/text/Layout$Alignment;", "getAlignment", "()Landroid/text/Layout$Alignment;", "setAlignment", "(Landroid/text/Layout$Alignment;)V", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "gravity", "getGravity", "()I", "setGravity", "(I)V", "highlightedColorInt", "imageLoadListener", "Lcom/ss/android/lark/widget/span/RemoteDrawableLoadListener;", "getImageLoadListener", "()Lcom/ss/android/lark/widget/span/RemoteDrawableLoadListener;", "includeFontPadding", "", "getIncludeFontPadding", "()Z", "setIncludeFontPadding", "(Z)V", "mAbbreviationClickListener", "Lcom/ss/android/lark/widget/light/listener/IAbbreviationClickListener;", "mAtSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IAtSpanClickListener;", "mCharSequence", "", "mEllipsizeListener", "Lcom/ss/android/lark/widget/light/LKUILightTextView$OnEllipsizeListener;", "mHashTagSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IMomentsHashTagSpanClickListener;", "mHighlightPaint", "Landroid/graphics/Paint;", "mHighlightPath", "Landroid/graphics/Path;", "mImageSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IImageSpanClickListener;", "mIntentionClickListener", "Lcom/ss/android/lark/widget/light/listener/IIntentionClickListener;", "mLayout", "Landroid/text/Layout;", "mMediaSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IMediaSpanClickListener;", "mMentionSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IMentionSpanClickListener;", "mMovementMethod", "Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod;", "mNeedCountLine", "mPhoneSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IPhoneSpanClickListener;", "mRemoteDrawableLoadListener", "mUrlSpanClickListener", "Lcom/ss/android/lark/widget/light/listener/IUrlSpanClickListener;", "maxLines", "getMaxLines", "setMaxLines", "selectedColorInt", "shouldLayoutZeroLengthText", "getShouldLayoutZeroLengthText", "setShouldLayoutZeroLengthText", "singleLine", "getSingleLine", "setSingleLine", "spacingExtra", "", "getSpacingExtra", "()F", "setSpacingExtra", "(F)V", "spacingMulti", "getSpacingMulti", "setSpacingMulti", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "bindDrawableCallback", "", "content", "ellipsizeIfNeed", "width", "getAcitonUpX", "getActionUpY", "getContent", "getFirstAtSpanLoc", "", "getLayout", "getTotalPaddingLeft", "getTotalPaddingTop", "getUpdatedHighlightPath", "makeNewLayout", "wantWidth", "notifyEllipsize", "onAbbreviationClick", "view", "Landroid/view/View;", "abbreviationInfo", "Lcom/ss/android/lark/widget/span/AbbreviationInfo;", "actionUpX", "actionUpY", "onAtClick", "text", "", "userId", "onAtLongClick", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onHashTagClick", "id", "name", "onHashTagLongClick", "onImageClick", "imageClickInfo", "Lcom/ss/android/lark/widget/light/listener/ImageClickInfo;", "onIntentionClick", "intentionInfo", "Lcom/ss/android/lark/widget/span/IntentionInfo;", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onMentionClick", "authorized", "url", "onMentionLongClick", "onPhoneClick", "phoneNumber", "onPhoneLongClick", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onURLClick", "onURLLongClick", "onVideoClick", "mediaInfo", "Lcom/ss/android/lark/widget/span/MediaInfo;", "setAbbreviationClickListener", "listener", "setAtSpanClickListener", "setContentLayout", "layout", "setContentText", "setFakeBoldText", "fakeBoldText", "setHashTagSpanClickListener", "setHighlightedColor", "color", "setImageSpanClickListener", "setIntentionClickListener", "setMediaSpanClickListener", "setMentionSpanClickListener", "setOnClickListener", "Landroid/view/View$OnClickListener;", "setOnEllipsizeListener", "setPhoneSpanClickListener", "setSelectedColor", "setUrlSpanClickListener", "updateSelection", "Companion", "OnEllipsizeListener", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LKUILightTextView extends TouchConsumeView implements ISpanClickListener {

    /* renamed from: a */
    public static final Companion f144051a = new Companion(null);

    /* renamed from: A */
    private IAtSpanClickListener f144052A;

    /* renamed from: B */
    private IMentionSpanClickListener f144053B;

    /* renamed from: C */
    private IMomentsHashTagSpanClickListener f144054C;

    /* renamed from: D */
    private IUrlSpanClickListener f144055D;

    /* renamed from: E */
    private IPhoneSpanClickListener f144056E;

    /* renamed from: F */
    private IAbbreviationClickListener f144057F;

    /* renamed from: G */
    private IImageSpanClickListener f144058G;

    /* renamed from: H */
    private IIntentionClickListener f144059H;

    /* renamed from: I */
    private IMediaSpanClickListener f144060I;

    /* renamed from: J */
    private C59159i f144061J;

    /* renamed from: K */
    private OnEllipsizeListener f144062K;

    /* renamed from: L */
    private boolean f144063L;

    /* renamed from: M */
    private Layout f144064M;

    /* renamed from: N */
    private CharSequence f144065N;

    /* renamed from: O */
    private TouchConsumeView.TouchConsumeMovementMethod f144066O;

    /* renamed from: P */
    private Path f144067P;

    /* renamed from: Q */
    private Paint f144068Q;

    /* renamed from: l */
    private int f144069l = ((int) UIHelper.sp2px(17.0f));

    /* renamed from: m */
    private int f144070m = UIUtils.getColor(getContext(), R.color.text_title);

    /* renamed from: n */
    private int f144071n = C25653b.m91894a(getContext(), R.color.primary_pri_500, 0.2f);

    /* renamed from: o */
    private int f144072o = C25653b.m91894a(getContext(), R.color.primary_pri_500, 0.2f);

    /* renamed from: p */
    private int f144073p = Integer.MAX_VALUE;

    /* renamed from: q */
    private float f144074q = 1.0f;

    /* renamed from: r */
    private float f144075r = ((float) UIHelper.dp2px(2.5f));

    /* renamed from: s */
    private TextUtils.TruncateAt f144076s;

    /* renamed from: t */
    private Layout.Alignment f144077t = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: u */
    private boolean f144078u;

    /* renamed from: v */
    private boolean f144079v = true;

    /* renamed from: w */
    private Typeface f144080w;

    /* renamed from: x */
    private int f144081x;

    /* renamed from: y */
    private boolean f144082y;

    /* renamed from: z */
    private final int f144083z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/light/LKUILightTextView$OnEllipsizeListener;", "", "onEllipsized", "", "ellipsize", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.LKUILightTextView$b */
    public interface OnEllipsizeListener {
        /* renamed from: a */
        void mo198050a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/widget/light/LKUILightTextView$Companion;", "", "()V", "DEFAULT_MAX_LINES", "", "DEFAULT_SPACING_EXTRA", "", "DEFAULT_SPACING_MULTIPLIER", "DEFAULT_TEXT_SIZE", "TAG", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.LKUILightTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Layout.Alignment getAlignment() {
        return this.f144077t;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.f144076s;
    }

    public final int getGravity() {
        return this.f144081x;
    }

    public final boolean getIncludeFontPadding() {
        return this.f144079v;
    }

    @Override // com.ss.android.lark.widget.select.SelectableView
    public Layout getLayout() {
        return this.f144064M;
    }

    public final int getMaxLines() {
        return this.f144073p;
    }

    public final boolean getShouldLayoutZeroLengthText() {
        return this.f144082y;
    }

    public final boolean getSingleLine() {
        return this.f144078u;
    }

    public final float getSpacingExtra() {
        return this.f144075r;
    }

    public final float getSpacingMulti() {
        return this.f144074q;
    }

    public final int getTextColor() {
        return this.f144070m;
    }

    public final int getTextSize() {
        return this.f144069l;
    }

    public final Typeface getTypeface() {
        return this.f144080w;
    }

    @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
    /* renamed from: a */
    public void mo122870a(View view, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        IAtSpanClickListener bVar = this.f144052A;
        if (bVar != null) {
            bVar.mo122870a(view, str, str2);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
    /* renamed from: a */
    public void mo122872a(View view, String str, String str2, boolean z, String str3) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        IMentionSpanClickListener fVar = this.f144053B;
        if (fVar != null) {
            fVar.mo122872a(view, str, str2, z, str3);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
    /* renamed from: a */
    public boolean mo122873a(View view, String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        IMentionSpanClickListener fVar = this.f144053B;
        if (fVar == null) {
            return false;
        }
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        return fVar.mo122873a(view, str, str2, z);
    }

    @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener.IActionLocationProvider
    public int getAcitonUpX() {
        return TouchConsumeView.TouchConsumeMovementMethod.f144240b.mo198214a().mo198209a();
    }

    @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener.IActionLocationProvider
    public int getActionUpY() {
        return TouchConsumeView.TouchConsumeMovementMethod.f144240b.mo198214a().mo198211b();
    }

    @Override // com.ss.android.lark.widget.select.SelectableView
    public CharSequence getContent() {
        Layout layout = this.f144064M;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    private final C59159i getImageLoadListener() {
        if (this.f144061J == null) {
            this.f144061J = new C59159i(this);
        }
        C59159i iVar = this.f144061J;
        if (iVar != null) {
            return iVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.span.RemoteDrawableLoadListener");
    }

    private final float getTotalPaddingLeft() {
        int i;
        int i2 = this.f144081x & 7;
        if (i2 == 1) {
            return ((float) (getMeasuredWidth() - C58489c.m226886a(this.f144064M))) / ((float) 2);
        }
        if (i2 != 5) {
            i = getPaddingLeft();
        } else {
            i = (getMeasuredWidth() - getPaddingRight()) - C58489c.m226886a(this.f144064M);
        }
        return (float) i;
    }

    private final float getTotalPaddingTop() {
        int i;
        int i2 = this.f144081x & SmEvents.EVENT_NE_RR;
        if (i2 == 16) {
            return ((float) (getMeasuredHeight() - C58489c.m226887b(this.f144064M))) / ((float) 2);
        }
        if (i2 != 80) {
            i = getPaddingTop();
        } else {
            i = (getMeasuredHeight() - getPaddingBottom()) - C58489c.m226887b(this.f144064M);
        }
        return (float) i;
    }

    private final Path getUpdatedHighlightPath() {
        CharSequence charSequence = null;
        Path path = null;
        Layout layout = this.f144064M;
        if (layout != null) {
            charSequence = layout.getText();
        }
        if (!(charSequence instanceof Spannable)) {
            return path;
        }
        int selectionStart = Selection.getSelectionStart(charSequence);
        int selectionEnd = Selection.getSelectionEnd(charSequence);
        if (selectionStart < 0) {
            return path;
        }
        if (this.f144067P == null) {
            this.f144067P = new Path();
        }
        Path path2 = this.f144067P;
        if (path2 != null) {
            path2.reset();
        }
        Layout layout2 = this.f144064M;
        if (layout2 != null) {
            layout2.getSelectionPath(selectionStart, selectionEnd, this.f144067P);
        }
        if (this.f144068Q == null) {
            Paint paint = new Paint(1);
            this.f144068Q = paint;
            if (paint != null) {
                paint.setColor(this.f144071n);
            }
            Paint paint2 = this.f144068Q;
            if (paint2 != null) {
                paint2.setStyle(Paint.Style.FILL);
            }
        }
        return this.f144067P;
    }

    public final int[] getFirstAtSpanLoc() {
        boolean z;
        int[] iArr = {-1, -1};
        Layout layout = getLayout();
        if (layout != null) {
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return iArr;
            }
            Spanned spanned = (Spanned) text;
            C58512f[] fVarArr = (C58512f[]) spanned.getSpans(0, spanned.length(), C58512f.class);
            Intrinsics.checkExpressionValueIsNotNull(fVarArr, "spanArray");
            if (fVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return iArr;
            }
            int spanEnd = spanned.getSpanEnd(fVarArr[0]);
            int lineForOffset = layout.getLineForOffset(spanEnd);
            Rect rect = new Rect();
            try {
                layout.getLineBounds(lineForOffset, rect);
                int i = this.f144073p;
                if (i == Integer.MAX_VALUE || lineForOffset < i - 1) {
                    return new int[]{(int) layout.getSecondaryHorizontal(spanEnd), rect.top};
                }
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private final void m226713a() {
        Layout layout;
        if (this.f144063L && this.f144073p != Integer.MAX_VALUE && this.f144062K != null && (layout = this.f144064M) != null) {
            int lineCount = layout.getLineCount();
            Log.m165379d("LKUILightTextView", "notifyEllipsize, line:" + lineCount + ", maxLines:" + this.f144073p);
            int i = this.f144073p;
            if (lineCount < i) {
                OnEllipsizeListener bVar = this.f144062K;
                if (bVar != null) {
                    bVar.mo198050a(false);
                }
            } else {
                int coerceAtMost = RangesKt.coerceAtMost(lineCount, i);
                boolean z = true;
                int ellipsisCount = layout.getEllipsisCount(coerceAtMost - 1);
                Log.m165379d("LKUILightTextView", "ellipsized:" + ellipsisCount + ", text is: " + layout.getText());
                OnEllipsizeListener bVar2 = this.f144062K;
                if (bVar2 != null) {
                    if (ellipsisCount == 0) {
                        z = false;
                    }
                    bVar2.mo198050a(z);
                }
            }
            this.f144063L = false;
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f144076s = truncateAt;
    }

    public final void setGravity(int i) {
        this.f144081x = i;
    }

    public final void setIncludeFontPadding(boolean z) {
        this.f144079v = z;
    }

    public final void setMaxLines(int i) {
        this.f144073p = i;
    }

    public final void setOnEllipsizeListener(OnEllipsizeListener bVar) {
        this.f144062K = bVar;
    }

    public final void setShouldLayoutZeroLengthText(boolean z) {
        this.f144082y = z;
    }

    public final void setSingleLine(boolean z) {
        this.f144078u = z;
    }

    public final void setSpacingExtra(float f) {
        this.f144075r = f;
    }

    public final void setSpacingMulti(float f) {
        this.f144074q = f;
    }

    public final void setTextColor(int i) {
        this.f144070m = i;
    }

    public final void setTextSize(int i) {
        this.f144069l = i;
    }

    public final void setAbbreviationClickListener(IAbbreviationClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f144057F = aVar;
    }

    public final void setAlignment(Layout.Alignment alignment) {
        Intrinsics.checkParameterIsNotNull(alignment, "<set-?>");
        this.f144077t = alignment;
    }

    public final void setAtSpanClickListener(IAtSpanClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f144052A = bVar;
    }

    public final void setHashTagSpanClickListener(IMomentsHashTagSpanClickListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        this.f144054C = gVar;
    }

    @Override // com.ss.android.lark.widget.select.SelectableView
    public void setHighlightedColor(int i) {
        this.f144072o = i;
        invalidate();
    }

    public final void setImageSpanClickListener(IImageSpanClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f144058G = cVar;
    }

    public final void setIntentionClickListener(IIntentionClickListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f144059H = dVar;
    }

    public final void setMediaSpanClickListener(IMediaSpanClickListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f144060I = eVar;
    }

    public final void setMentionSpanClickListener(IMentionSpanClickListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f144053B = fVar;
    }

    public final void setPhoneSpanClickListener(IPhoneSpanClickListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        this.f144056E = hVar;
    }

    @Override // com.ss.android.lark.widget.select.SelectableView
    public void setSelectedColor(int i) {
        this.f144071n = i;
        invalidate();
    }

    public final void setTypeface(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "<set-?>");
        this.f144080w = typeface;
    }

    public final void setUrlSpanClickListener(IUrlSpanClickListener jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "listener");
        this.f144055D = jVar;
    }

    public final void setFakeBoldText(boolean z) {
        if (z) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
            Intrinsics.checkExpressionValueIsNotNull(defaultFromStyle, "Typeface.defaultFromStyle(Typeface.BOLD)");
            this.f144080w = defaultFromStyle;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.LKUILightTextView$c */
    public static final class View$OnClickListenerC58474c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LKUILightTextView f144084a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f144085b;

        View$OnClickListenerC58474c(LKUILightTextView lKUILightTextView, View.OnClickListener onClickListener) {
            this.f144084a = lKUILightTextView;
            this.f144085b = onClickListener;
        }

        public final void onClick(View view) {
            if (!this.f144084a.getMConsumedSpanEvent()) {
                this.f144085b.onClick(this.f144084a);
            }
        }
    }

    @Override // com.ss.android.lark.widget.select.SelectableView
    public void setContentText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        if (!C26325y.m95335a(charSequence, this.f144065N)) {
            this.f144065N = charSequence;
            this.f144064M = null;
            this.f144063L = true;
            m226714a(charSequence);
            requestLayout();
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            super.setOnClickListener(null);
        } else {
            super.setOnClickListener(new View$OnClickListenerC58474c(this, onClickListener));
        }
    }

    public final void setContentLayout(Layout layout) {
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(layout, "layout");
        if (!C26325y.m95335a(layout, this.f144064M)) {
            this.f144064M = layout;
            this.f144063L = true;
            if (layout != null) {
                charSequence = layout.getText();
            } else {
                charSequence = null;
            }
            m226714a(charSequence);
            requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUILightTextView(Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Typeface defaultFromStyle = Typeface.defaultFromStyle(0);
        Intrinsics.checkExpressionValueIsNotNull(defaultFromStyle, "Typeface.defaultFromStyle(Typeface.NORMAL)");
        this.f144080w = defaultFromStyle;
        this.f144081x = 51;
        this.f144083z = UIHelper.dp2px(2.0f);
        this.f144066O = TouchConsumeView.TouchConsumeMovementMethod.f144240b.mo198214a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.save();
        }
        if (this.f144064M != null) {
            if (canvas != null) {
                canvas.translate(getTotalPaddingLeft(), getTotalPaddingTop());
            }
            Path updatedHighlightPath = getUpdatedHighlightPath();
            if (this.f146627k == SelectableView.State.SELECTED) {
                Paint paint2 = this.f144068Q;
                if (paint2 != null) {
                    paint2.setColor(this.f144071n);
                }
            } else if (this.f146627k == SelectableView.State.HIGHLIGHTED && (paint = this.f144068Q) != null) {
                paint.setColor(this.f144072o);
            }
            Layout layout = this.f144064M;
            if (layout != null) {
                layout.draw(canvas, updatedHighlightPath, this.f144068Q, 0);
            }
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    @Override // com.ss.android.lark.widget.light.touch.TouchConsumeView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        Layout layout = this.f144064M;
        if (layout != null) {
            CharSequence charSequence2 = null;
            if (layout != null) {
                charSequence = layout.getText();
            } else {
                charSequence = null;
            }
            if (charSequence instanceof Spanned) {
                TouchConsumeView.TouchConsumeMovementMethod bVar = this.f144066O;
                LKUILightTextView lKUILightTextView = this;
                Layout layout2 = this.f144064M;
                if (layout2 == null) {
                    Intrinsics.throwNpe();
                }
                Layout layout3 = this.f144064M;
                if (layout3 != null) {
                    charSequence2 = layout3.getText();
                }
                if (charSequence2 != null) {
                    z = bVar.mo198210a(lKUILightTextView, layout2, (Spanned) charSequence2, motionEvent);
                    boolean onTouchEvent = super.onTouchEvent(motionEvent);
                    if (!z || onTouchEvent) {
                        return true;
                    }
                    return false;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.text.Spanned");
            }
        }
        z = false;
        boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
        if (!z) {
        }
        return true;
    }

    /* renamed from: a */
    private final void m226714a(CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            C58508e[] eVarArr = (C58508e[]) spannable.getSpans(0, charSequence.length(), C58508e.class);
            if (eVarArr != null) {
                if (eVarArr.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    for (C58508e eVar : eVarArr) {
                        eVar.mo198322a(new C58507d(this));
                    }
                }
            }
            C59160j[] jVarArr = (C59160j[]) spannable.getSpans(0, charSequence.length(), C59160j.class);
            if (jVarArr != null) {
                if (jVarArr.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    for (C59160j jVar : jVarArr) {
                        jVar.mo201099a(getImageLoadListener());
                    }
                }
            }
            RemoteMediaSpan[] remoteMediaSpanArr = (RemoteMediaSpan[]) spannable.getSpans(0, charSequence.length(), RemoteMediaSpan.class);
            if (remoteMediaSpanArr != null) {
                if (remoteMediaSpanArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (RemoteMediaSpan remoteMediaSpan : remoteMediaSpanArr) {
                        remoteMediaSpan.mo201060a(getImageLoadListener());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IImageSpanClickListener
    /* renamed from: a */
    public void mo122874a(View view, ImageClickInfo kVar) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(kVar, "imageClickInfo");
        IImageSpanClickListener cVar = this.f144058G;
        if (cVar != null) {
            cVar.mo122874a(view, kVar);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
    public void a_(View view, String str) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "text");
        IUrlSpanClickListener jVar = this.f144055D;
        if (jVar != null) {
            jVar.a_(view, str);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
    /* renamed from: b */
    public void mo122867b(View view, String str) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        IPhoneSpanClickListener hVar = this.f144056E;
        if (hVar != null) {
            hVar.mo122867b(view, str);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
    public boolean b_(View view, String str) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "text");
        IUrlSpanClickListener jVar = this.f144055D;
        if (jVar == null) {
            return false;
        }
        if (jVar == null) {
            Intrinsics.throwNpe();
        }
        return jVar.b_(view, str);
    }

    /* renamed from: a */
    private final CharSequence m226712a(CharSequence charSequence, float f) {
        int i;
        boolean z = this.f144078u;
        if ((!z && this.f144073p == Integer.MAX_VALUE) || this.f144076s == null) {
            return charSequence;
        }
        if (z) {
            i = 1;
        } else {
            i = this.f144073p;
        }
        EllipsizeHelper.Companion aVar = EllipsizeHelper.f144129b;
        float f2 = f * ((float) i);
        float f3 = (float) this.f144069l;
        TextUtils.TruncateAt truncateAt = this.f144076s;
        if (truncateAt == null) {
            Intrinsics.throwNpe();
        }
        return aVar.mo198108a(charSequence, f2, f3, truncateAt);
    }

    /* renamed from: a */
    private final Layout m226711a(CharSequence charSequence, int i) {
        return new TextLayoutBuilder().mo198149a(charSequence).mo198144a(this.f144069l).mo198152b(this.f144070m).mo198155c(this.f144073p).mo198147a(this.f144076s).mo198151b(this.f144074q).mo198143a(this.f144075r).mo198157d(i).mo198146a(this.f144077t).mo198153b(this.f144078u).mo198145a(this.f144080w).mo198150a(this.f144079v).mo198156c(false).mo198159e(this.f144082y).mo198142a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUILightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Typeface defaultFromStyle = Typeface.defaultFromStyle(0);
        Intrinsics.checkExpressionValueIsNotNull(defaultFromStyle, "Typeface.defaultFromStyle(Typeface.NORMAL)");
        this.f144080w = defaultFromStyle;
        this.f144081x = 51;
        this.f144083z = UIHelper.dp2px(2.0f);
        this.f144066O = TouchConsumeView.TouchConsumeMovementMethod.f144240b.mo198214a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Layout layout;
        Layout layout2;
        super.onMeasure(i, i2);
        if (this.f144064M != null || this.f144065N != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            Layout layout3 = this.f144064M;
            if (layout3 == null) {
                CharSequence charSequence = this.f144065N;
                if (charSequence == null) {
                    Intrinsics.throwNpe();
                }
                this.f144064M = m226711a(m226712a(charSequence, (float) (((size - getPaddingRight()) - getPaddingLeft()) - this.f144083z)), ((size - getPaddingRight()) - getPaddingLeft()) - this.f144083z);
            } else {
                if (layout3 == null) {
                    Intrinsics.throwNpe();
                }
                if (layout3.getWidth() + getPaddingLeft() + getPaddingRight() + this.f144083z > size) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Layout.width(");
                    Layout layout4 = this.f144064M;
                    if (layout4 == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(layout4.getWidth() + getPaddingLeft() + getPaddingRight() + this.f144083z);
                    sb.append(") > view max width({");
                    sb.append(size);
                    sb.append("})，rebuildLayout");
                    Log.m165383e("LKUILightTextView", sb.toString());
                    Layout layout5 = this.f144064M;
                    if (layout5 == null) {
                        Intrinsics.throwNpe();
                    }
                    CharSequence text = layout5.getText();
                    Intrinsics.checkExpressionValueIsNotNull(text, "mLayout!!.text");
                    this.f144064M = m226711a(m226712a(text, (float) (((size - getPaddingRight()) - getPaddingLeft()) - this.f144083z)), ((size - getPaddingLeft()) - getPaddingRight()) - this.f144083z);
                }
            }
            if (!(View.MeasureSpec.getMode(i) == 1073741824 || (layout2 = this.f144064M) == null)) {
                if (layout2 == null) {
                    Intrinsics.throwNpe();
                }
                size = this.f144083z + layout2.getWidth() + getPaddingLeft() + getPaddingRight();
            }
            if (!(View.MeasureSpec.getMode(i2) == 1073741824 || (layout = this.f144064M) == null)) {
                size2 = C58489c.m226887b(layout) + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IIntentionClickListener
    /* renamed from: a */
    public void mo122884a(View view, IntentionInfo intentionInfo) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(intentionInfo, "intentionInfo");
        IIntentionClickListener dVar = this.f144059H;
        if (dVar != null) {
            dVar.mo122884a(view, intentionInfo);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IMediaSpanClickListener
    /* renamed from: a */
    public void mo122875a(View view, MediaInfo mediaInfo) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(mediaInfo, "mediaInfo");
        IMediaSpanClickListener eVar = this.f144060I;
        if (eVar != null) {
            eVar.mo122875a(view, mediaInfo);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
    /* renamed from: a */
    public void mo122866a(View view, String str) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
        IPhoneSpanClickListener hVar = this.f144056E;
        if (hVar != null) {
            hVar.mo122866a(view, str);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
    public void a_(View view, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        IMomentsHashTagSpanClickListener gVar = this.f144054C;
        if (gVar != null) {
            gVar.a_(view, str, str2);
        }
    }

    @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
    /* renamed from: b */
    public boolean mo122871b(View view, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        IAtSpanClickListener bVar = this.f144052A;
        if (bVar == null) {
            return false;
        }
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        return bVar.mo122871b(view, str, str2);
    }

    @Override // com.ss.android.lark.widget.light.listener.IMomentsHashTagSpanClickListener
    public boolean b_(View view, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        IMomentsHashTagSpanClickListener gVar = this.f144054C;
        if (gVar != null) {
            return gVar.b_(view, str, str2);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKUILightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        Typeface defaultFromStyle = Typeface.defaultFromStyle(0);
        Intrinsics.checkExpressionValueIsNotNull(defaultFromStyle, "Typeface.defaultFromStyle(Typeface.NORMAL)");
        this.f144080w = defaultFromStyle;
        this.f144081x = 51;
        this.f144083z = UIHelper.dp2px(2.0f);
        this.f144066O = TouchConsumeView.TouchConsumeMovementMethod.f144240b.mo198214a();
    }

    @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
    public void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(abbreviationInfo, "abbreviationInfo");
        IAbbreviationClickListener aVar = this.f144057F;
        if (aVar != null) {
            aVar.onAbbreviationClick(view, abbreviationInfo, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m226713a();
    }
}
