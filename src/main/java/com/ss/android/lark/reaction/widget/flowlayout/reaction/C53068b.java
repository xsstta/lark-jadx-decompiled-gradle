package com.ss.android.lark.reaction.widget.flowlayout.reaction;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.C26254af;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.reaction.b */
public class C53068b extends LinkMovementMethod {

    /* renamed from: a */
    private static C53068b f131176a;

    /* renamed from: b */
    private static Object f131177b = new NoCopySpan.Concrete();

    public boolean canSelectArbitrarily() {
        return super.canSelectArbitrarily();
    }

    /* renamed from: a */
    public static MovementMethod m205438a() {
        if (f131176a == null) {
            f131176a = new C53068b();
        }
        return f131176a;
    }

    /* access modifiers changed from: protected */
    public boolean down(TextView textView, Spannable spannable) {
        if (m205439a(3, textView, spannable)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    public void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f131177b);
    }

    /* access modifiers changed from: protected */
    public boolean left(TextView textView, Spannable spannable) {
        if (m205439a(2, textView, spannable)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    /* access modifiers changed from: protected */
    public boolean right(TextView textView, Spannable spannable) {
        if (m205439a(3, textView, spannable)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    /* access modifiers changed from: protected */
    public boolean up(TextView textView, Spannable spannable) {
        if (m205439a(2, textView, spannable)) {
            return true;
        }
        return super.up(textView, spannable);
    }

    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
        Selection.removeSelection(spannable);
        if ((i & 1) != 0) {
            spannable.setSpan(f131177b, 0, 0, 34);
        } else {
            spannable.removeSpan(f131177b);
        }
    }

    /* renamed from: a */
    private boolean m205439a(int i, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingTop = textView.getTotalPaddingTop() + textView.getTotalPaddingBottom();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        ClickableDrawableSpan[] aVarArr = (ClickableDrawableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableDrawableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f131177b) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i2 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i != 1) {
            if (i == 2) {
                int i3 = -1;
                for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[i4]);
                    if ((spanEnd < max || min == max) && spanEnd > i3) {
                        i2 = spannable.getSpanStart(clickableSpanArr[i4]);
                        i3 = spanEnd;
                    }
                }
                if (i2 >= 0) {
                    Selection.setSelection(spannable, i3, i2);
                    return true;
                }
            } else if (i == 3) {
                int i5 = Integer.MAX_VALUE;
                int i6 = Integer.MAX_VALUE;
                for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                    int spanStart = spannable.getSpanStart(clickableSpanArr[i7]);
                    if ((spanStart > min || min == max) && spanStart < i6) {
                        i5 = spannable.getSpanEnd(clickableSpanArr[i7]);
                        i6 = spanStart;
                    }
                }
                if (i5 < Integer.MAX_VALUE) {
                    Selection.setSelection(spannable, i6, i5);
                    return true;
                }
            }
        } else if (min == max) {
            return false;
        } else {
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
            if (clickableSpanArr2.length == 1) {
                clickableSpanArr2[0].onClick(textView);
            } else if (aVarArr.length == 1) {
                aVarArr[0].mo181261a(textView);
            }
        }
        return false;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    clickableSpan.onClick(textView);
                } else if (action == 0) {
                    if (textView.getContext().getApplicationInfo().targetSdkVersion >= 28) {
                        try {
                            Method a = C26254af.m95003a((Class<?>) TextView.class, "hideFloatingToolbar", Integer.class);
                            if (a != null) {
                                a.setAccessible(true);
                                a.invoke(textView, Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY));
                            }
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                }
                return true;
            }
            ClickableDrawableSpan[] aVarArr = (ClickableDrawableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableDrawableSpan.class);
            if (aVarArr.length != 0) {
                ClickableDrawableSpan aVar = aVarArr[0];
                if (action == 1) {
                    aVar.mo181261a(textView);
                }
            } else {
                Selection.removeSelection(spannable);
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        return super.canSelectArbitrarily();
    }
}
