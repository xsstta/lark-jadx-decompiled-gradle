package com.ss.android.photoeditor.ve.textsticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/DeleteTextStickerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "deleteDesc", "Landroid/widget/TextView;", "deleteIcon", "Landroid/widget/ImageView;", "deleteView", "Landroid/view/View;", "isSelect", "", "layoutId", "updateSelectStatus", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DeleteTextStickerView extends FrameLayout {

    /* renamed from: a */
    private final int f149320a;

    /* renamed from: b */
    private View f149321b;

    /* renamed from: c */
    private ImageView f149322c;

    /* renamed from: d */
    private TextView f149323d;

    /* renamed from: e */
    private boolean f149324e;

    /* renamed from: a */
    public final boolean mo204051a() {
        if (!this.f149324e || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteTextStickerView(Context context) {
        super(context);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149320a = R.layout.view_delete_text_sticker;
        View.inflate(getContext(), R.layout.view_delete_text_sticker, this);
        this.f149321b = findViewById(R.id.ll_delete_container);
        this.f149322c = (ImageView) findViewById(R.id.iv_delete_icon);
        this.f149323d = (TextView) findViewById(R.id.tv_delete_desc);
    }

    /* renamed from: a */
    public final void mo204050a(boolean z) {
        this.f149324e = z;
        if (z) {
            ImageView imageView = this.f149322c;
            if (imageView != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                imageView.setBackground(context.getResources().getDrawable(R.drawable.ic_svg_delete_white));
            }
            TextView textView = this.f149323d;
            if (textView != null) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                textView.setTextColor(context2.getResources().getColor(R.color.lkui_N100));
            }
            TextView textView2 = this.f149323d;
            if (textView2 != null) {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                textView2.setText(context3.getResources().getText(R.string.Lark_ImageViewer_ButtonReleaseToDelete));
            }
            View view = this.f149321b;
            if (view != null) {
                Context context4 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context4, "context");
                view.setBackground(context4.getResources().getDrawable(R.drawable.bg_delete_text_sticker_selected));
                return;
            }
            return;
        }
        ImageView imageView2 = this.f149322c;
        if (imageView2 != null) {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            imageView2.setBackground(context5.getResources().getDrawable(R.drawable.ic_svg_delete_red));
        }
        TextView textView3 = this.f149323d;
        if (textView3 != null) {
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            textView3.setTextColor(context6.getResources().getColor(R.color.lkui_R500));
        }
        TextView textView4 = this.f149323d;
        if (textView4 != null) {
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            textView4.setText(context7.getResources().getText(R.string.Lark_ImageViewer_DragHereToDelete));
        }
        View view2 = this.f149321b;
        if (view2 != null) {
            Context context8 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context8, "context");
            view2.setBackground(context8.getResources().getDrawable(R.drawable.bg_delete_text_sticker));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteTextStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149320a = R.layout.view_delete_text_sticker;
        View.inflate(getContext(), R.layout.view_delete_text_sticker, this);
        this.f149321b = findViewById(R.id.ll_delete_container);
        this.f149322c = (ImageView) findViewById(R.id.iv_delete_icon);
        this.f149323d = (TextView) findViewById(R.id.tv_delete_desc);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteTextStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.f149320a = R.layout.view_delete_text_sticker;
        View.inflate(getContext(), R.layout.view_delete_text_sticker, this);
        this.f149321b = findViewById(R.id.ll_delete_container);
        this.f149322c = (ImageView) findViewById(R.id.iv_delete_icon);
        this.f149323d = (TextView) findViewById(R.id.tv_delete_desc);
    }
}
