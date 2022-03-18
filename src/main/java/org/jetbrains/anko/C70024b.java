package org.jetbrains.anko;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000~\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\"(\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"(\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"(\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\"(\u0010\u001d\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\"(\u0010#\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"\"(\u0010&\u001a\u00020\u0001*\u00020'2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\"(\u0010&\u001a\u00020\u0001*\u00020,2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010-\"\u0004\b*\u0010.\",\u00100\u001a\u0004\u0018\u00010/*\u0002012\b\u0010\u0000\u001a\u0004\u0018\u00010/8G@FX\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105\"(\u00106\u001a\u00020\u0001*\u0002012\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:\",\u0010<\u001a\u0004\u0018\u00010;*\u0002012\b\u0010\u0000\u001a\u0004\u0018\u00010;8G@FX\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\"(\u0010A\u001a\u00020\u0001*\u00020B2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\"(\u0010G\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"\"(\u0010J\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"\"(\u0010M\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\"(\u0010S\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bT\u0010P\"\u0004\bU\u0010R\"(\u0010V\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bW\u0010P\"\u0004\bX\u0010R\"(\u0010Y\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010R\"(\u0010\\\u001a\u00020\u0001*\u00020B2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b]\u0010D\"\u0004\b^\u0010F\"(\u0010_\u001a\u00020\u0001*\u00020`2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d\"(\u0010e\u001a\u00020\u0001*\u00020f2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j\"(\u0010l\u001a\u00020k*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020k8G@FX\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p\"(\u0010q\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\br\u0010P\"\u0004\bs\u0010R\"(\u0010t\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bu\u0010 \"\u0004\bv\u0010\"\"(\u0010w\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\bx\u0010 \"\u0004\by\u0010\"\"(\u0010z\u001a\u00020\u0001*\u00020N2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b{\u0010P\"\u0004\b|\u0010R\"(\u0010}\u001a\u00020\u0001*\u00020'2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b~\u0010)\"\u0004\b\u0010+\"(\u0010}\u001a\u00020\u0001*\u00020,2\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u000e¢\u0006\f\u001a\u0004\b~\u0010-\"\u0004\b\u0010.¨\u0006\u0001"}, d2 = {"v", "", "backgroundColor", "Landroid/view/View;", "getBackgroundColor", "(Landroid/view/View;)I", "setBackgroundColor", "(Landroid/view/View;I)V", "backgroundResource", "getBackgroundResource", "setBackgroundResource", "buttonDrawableResource", "Landroid/widget/CompoundButton;", "getButtonDrawableResource", "(Landroid/widget/CompoundButton;)I", "setButtonDrawableResource", "(Landroid/widget/CompoundButton;I)V", "checkMarkDrawableResource", "Landroid/widget/CheckedTextView;", "getCheckMarkDrawableResource", "(Landroid/widget/CheckedTextView;)I", "setCheckMarkDrawableResource", "(Landroid/widget/CheckedTextView;I)V", "gravity", "Landroid/widget/Gallery;", "getGravity", "(Landroid/widget/Gallery;)I", "setGravity", "(Landroid/widget/Gallery;I)V", "hintResource", "Landroid/widget/TextView;", "getHintResource", "(Landroid/widget/TextView;)I", "setHintResource", "(Landroid/widget/TextView;I)V", "hintTextColor", "getHintTextColor", "setHintTextColor", "horizontalGravity", "Landroid/widget/LinearLayout;", "getHorizontalGravity", "(Landroid/widget/LinearLayout;)I", "setHorizontalGravity", "(Landroid/widget/LinearLayout;I)V", "Landroid/widget/RelativeLayout;", "(Landroid/widget/RelativeLayout;)I", "(Landroid/widget/RelativeLayout;I)V", "Landroid/graphics/Bitmap;", "imageBitmap", "Landroid/widget/ImageView;", "getImageBitmap", "(Landroid/widget/ImageView;)Landroid/graphics/Bitmap;", "setImageBitmap", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "imageResource", "getImageResource", "(Landroid/widget/ImageView;)I", "setImageResource", "(Landroid/widget/ImageView;I)V", "Landroid/net/Uri;", "imageURI", "getImageURI", "(Landroid/widget/ImageView;)Landroid/net/Uri;", "setImageURI", "(Landroid/widget/ImageView;Landroid/net/Uri;)V", "leftStripDrawableResource", "Landroid/widget/TabWidget;", "getLeftStripDrawableResource", "(Landroid/widget/TabWidget;)I", "setLeftStripDrawableResource", "(Landroid/widget/TabWidget;I)V", "lines", "getLines", "setLines", "linkTextColor", "getLinkTextColor", "setLinkTextColor", "logoDescriptionResource", "Landroid/widget/Toolbar;", "getLogoDescriptionResource", "(Landroid/widget/Toolbar;)I", "setLogoDescriptionResource", "(Landroid/widget/Toolbar;I)V", "logoResource", "getLogoResource", "setLogoResource", "navigationContentDescriptionResource", "getNavigationContentDescriptionResource", "setNavigationContentDescriptionResource", "navigationIconResource", "getNavigationIconResource", "setNavigationIconResource", "rightStripDrawableResource", "getRightStripDrawableResource", "setRightStripDrawableResource", "selectedDateVerticalBarResource", "Landroid/widget/CalendarView;", "getSelectedDateVerticalBarResource", "(Landroid/widget/CalendarView;)I", "setSelectedDateVerticalBarResource", "(Landroid/widget/CalendarView;I)V", "selectorResource", "Landroid/widget/AbsListView;", "getSelectorResource", "(Landroid/widget/AbsListView;)I", "setSelectorResource", "(Landroid/widget/AbsListView;I)V", "", "singleLine", "getSingleLine", "(Landroid/widget/TextView;)Z", "setSingleLine", "(Landroid/widget/TextView;Z)V", "subtitleResource", "getSubtitleResource", "setSubtitleResource", "textColor", "getTextColor", "setTextColor", "textResource", "getTextResource", "setTextResource", "titleResource", "getTitleResource", "setTitleResource", "verticalGravity", "getVerticalGravity", "setVerticalGravity", "anko-sdk25_release"}, mo238835k = 2, mv = {1, 1, 5})
/* renamed from: org.jetbrains.anko.b */
public final class C70024b {
    /* renamed from: a */
    public static final void m268600a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$receiver");
        view.setBackgroundResource(i);
    }

    /* renamed from: a */
    public static final void m268601a(ImageView imageView, int i) {
        Intrinsics.checkParameterIsNotNull(imageView, "$receiver");
        imageView.setImageResource(i);
    }
}
