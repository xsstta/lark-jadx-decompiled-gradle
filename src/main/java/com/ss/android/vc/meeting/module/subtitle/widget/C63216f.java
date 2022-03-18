package com.ss.android.vc.meeting.module.subtitle.widget;

import android.text.Layout;
import android.widget.TextView;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.f */
public class C63216f {
    /* renamed from: a */
    private static boolean m247569a(Layout layout, int i) {
        if (i <= 0 || layout.getLineForOffset(i) != layout.getLineForOffset(i - 1) + 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m247568a(TextView textView, int i, int i2, int i3) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return -1;
        }
        int lineForVertical = layout.getLineForVertical(i2);
        if (m247569a(layout, i3)) {
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if (i > lineRight - ((lineRight - ((int) layout.getPrimaryHorizontal(i3 - 1))) / 2)) {
                i3--;
            }
        }
        int lineForOffset = layout.getLineForOffset(i3);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineBottom = layout.getLineBottom(lineForOffset);
        int i4 = (lineBottom - lineTop) / 2;
        if ((lineForVertical == lineForOffset + 1 && i2 - lineBottom < i4) || (lineForVertical == lineForOffset - 1 && lineTop - i2 < i4)) {
            lineForVertical = lineForOffset;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i);
        if (offsetForHorizontal >= textView.getText().length() - 1) {
            return offsetForHorizontal;
        }
        int i5 = offsetForHorizontal + 1;
        if (!m247569a(layout, i5)) {
            return offsetForHorizontal;
        }
        int lineRight2 = (int) layout.getLineRight(lineForVertical);
        return i > lineRight2 - ((lineRight2 - ((int) layout.getPrimaryHorizontal(offsetForHorizontal))) / 2) ? i5 : offsetForHorizontal;
    }
}
