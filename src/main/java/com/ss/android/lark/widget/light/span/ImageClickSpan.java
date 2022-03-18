package com.ss.android.lark.widget.light.span;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.LKUILightTextView;
import com.ss.android.lark.widget.light.listener.ISpanClickListener;
import com.ss.android.lark.widget.light.listener.ImageClickInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/light/span/ImageClickSpan;", "Landroid/text/style/ClickableSpan;", "mImageInfo", "Lcom/ss/android/lark/widget/span/ImageInfo;", "(Lcom/ss/android/lark/widget/span/ImageInfo;)V", "equals", "", "other", "", "getImageClickInfo", "Lcom/ss/android/lark/widget/light/listener/ImageClickInfo;", "widget", "Landroid/view/View;", "hashCode", "", "onClick", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.span.d */
public final class ImageClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final ImageInfo f144212a;

    public int hashCode() {
        return this.f144212a.hashCode();
    }

    public ImageClickSpan(ImageInfo imageInfo) {
        Intrinsics.checkParameterIsNotNull(imageInfo, "mImageInfo");
        this.f144212a = imageInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ImageClickSpan) && !(!Intrinsics.areEqual(this.f144212a, ((ImageClickSpan) obj).f144212a))) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        if (view instanceof ISpanClickListener) {
            if (view.getTag(R.id.tag_long_press) != null) {
                view.setTag(R.id.tag_long_press, null);
            } else {
                ((ISpanClickListener) view).mo122874a(view, m226896a(view));
            }
        }
    }

    /* renamed from: a */
    private final ImageClickInfo m226896a(View view) {
        CharSequence charSequence;
        int spanStart;
        ImageClickInfo kVar = new ImageClickInfo();
        kVar.mo198117a(this.f144212a.key);
        kVar.mo198120b(this.f144212a.url);
        kVar.mo198123c(this.f144212a.token);
        kVar.mo198116a(this.f144212a.width);
        kVar.mo198119b(this.f144212a.height);
        if (!(view instanceof LKUILightTextView)) {
            return kVar;
        }
        Layout layout = ((LKUILightTextView) view).getLayout();
        if (layout != null) {
            charSequence = layout.getText();
        } else {
            charSequence = null;
        }
        if (!(charSequence instanceof Spannable) || (spanStart = ((Spannable) charSequence).getSpanStart(this)) < 0) {
            return kVar;
        }
        int lineTop = layout.getLineTop(layout.getLineForOffset(spanStart));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] + lineTop;
        kVar.mo198122c(iArr[0]);
        kVar.mo198125d(iArr[1]);
        return kVar;
    }
}
