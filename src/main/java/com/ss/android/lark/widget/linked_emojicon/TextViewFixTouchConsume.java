package com.ss.android.lark.widget.linked_emojicon;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.C58328c;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.light.touch.TouchConsumeView;
import java.util.Timer;
import java.util.TimerTask;

public abstract class TextViewFixTouchConsume extends EllipsizedEmojiconTextView {

    /* renamed from: a */
    public static long f144247a = 500;

    /* renamed from: b */
    boolean f144248b;

    /* renamed from: c */
    boolean f144249c;

    /* renamed from: e */
    public boolean f144250e;

    /* renamed from: f */
    public boolean f144251f;

    /* renamed from: g */
    public boolean f144252g;

    /* renamed from: h */
    public int f144253h;

    /* renamed from: i */
    public int f144254i;

    /* renamed from: k */
    private Context f144255k;

    public boolean hasFocus() {
        return false;
    }

    public void scrollTo(int i, int i2) {
    }

    /* renamed from: com.ss.android.lark.widget.linked_emojicon.TextViewFixTouchConsume$a */
    public static class C58493a extends LinkMovementMethod {

        /* renamed from: a */
        static C58493a f144256a;

        /* renamed from: b */
        private boolean f144257b;

        /* renamed from: c */
        private int f144258c;

        /* renamed from: d */
        private int f144259d;

        /* renamed from: b */
        public int mo198222b() {
            return this.f144258c;
        }

        /* renamed from: c */
        public int mo198223c() {
            return this.f144259d;
        }

        /* renamed from: a */
        public static C58493a m226905a() {
            if (f144256a == null) {
                f144256a = new C58493a();
            }
            return f144256a;
        }

        /* renamed from: a */
        public void mo198221a(boolean z) {
            this.f144257b = z;
        }

        public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            if (this.f144257b) {
                return false;
            }
            return super.onGenericMotionEvent(textView, spannable, motionEvent);
        }

        /* renamed from: a */
        private int m226904a(TextView textView, int i, int i2) {
            int i3;
            int totalPaddingLeft = i - textView.getTotalPaddingLeft();
            int totalPaddingTop = i2 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            float f = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            if (layout.getPrimaryHorizontal(offsetForHorizontal) >= f) {
                offsetForHorizontal--;
            }
            int lineEnd = layout.getLineEnd(lineForVertical);
            if (lineEnd > 1) {
                i3 = lineEnd - 1;
            } else {
                i3 = 0;
            }
            if (f > layout.getSecondaryHorizontal(i3)) {
                return offsetForHorizontal + 1;
            }
            return offsetForHorizontal;
        }

        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            final TextViewFixTouchConsume textViewFixTouchConsume = (TextViewFixTouchConsume) textView;
            if (action == 3) {
                textViewFixTouchConsume.f144252g = true;
                return true;
            } else if (action == 2) {
                if (!(textViewFixTouchConsume.f144253h == 0 && textViewFixTouchConsume.f144254i == 0) && (Math.abs(textViewFixTouchConsume.f144253h - ((int) motionEvent.getX())) >= 10 || Math.abs(textViewFixTouchConsume.f144254i - ((int) motionEvent.getY())) >= 10)) {
                    textViewFixTouchConsume.f144252g = true;
                }
                return true;
            } else if (action != 1 && action != 0) {
                return Touch.onTouchEvent(textView, spannable, motionEvent);
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    textViewFixTouchConsume.f144253h = x;
                    textViewFixTouchConsume.f144254i = y;
                } else if (action == 1) {
                    textViewFixTouchConsume.f144253h = 0;
                    textViewFixTouchConsume.f144254i = 0;
                }
                int a = m226904a(textView, x, y);
                final ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(a, a, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    textViewFixTouchConsume.f144250e = false;
                    if (action == 1) {
                        if (textViewFixTouchConsume.f144251f) {
                            textViewFixTouchConsume.f144250e = true;
                            this.f144258c = x;
                            this.f144259d = y;
                            if (clickableSpanArr.length == 1) {
                                clickableSpanArr[0].onClick(textView);
                            } else if (clickableSpanArr.length > 1) {
                                if (((ReplacementSpan[]) spannable.getSpans(a, a, ReplacementSpan.class)).length != 0) {
                                    clickableSpanArr[clickableSpanArr.length - 1].onClick(textView);
                                } else {
                                    clickableSpanArr[0].onClick(textView);
                                }
                            }
                        }
                    } else if (action == 0) {
                        textViewFixTouchConsume.f144252g = false;
                        if (textViewFixTouchConsume.f144251f || textViewFixTouchConsume.f144250e) {
                            textViewFixTouchConsume.f144250e = true;
                        } else {
                            textViewFixTouchConsume.f144251f = true;
                            new Timer().schedule(new TimerTask() {
                                /* class com.ss.android.lark.widget.linked_emojicon.TextViewFixTouchConsume.C58493a.C584941 */

                                public void run() {
                                    Activity activityFromView = UIUtils.getActivityFromView(textViewFixTouchConsume);
                                    if (activityFromView != null) {
                                        activityFromView.runOnUiThread(new Runnable() {
                                            /* class com.ss.android.lark.widget.linked_emojicon.TextViewFixTouchConsume.C58493a.C584941.RunnableC584951 */

                                            public void run() {
                                                if (textViewFixTouchConsume.f144252g || textViewFixTouchConsume.f144250e || !textViewFixTouchConsume.f144251f) {
                                                    textViewFixTouchConsume.f144251f = false;
                                                    textViewFixTouchConsume.f144252g = false;
                                                    return;
                                                }
                                                textViewFixTouchConsume.setTag(R.id.tag_long_press, TouchConsumeView.f144228h);
                                                clickableSpanArr[0].onClick(textViewFixTouchConsume);
                                                textViewFixTouchConsume.f144251f = false;
                                            }
                                        });
                                    }
                                }
                            }, TextViewFixTouchConsume.f144247a);
                            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                        }
                    }
                    if (textView instanceof TextViewFixTouchConsume) {
                        textViewFixTouchConsume.f144249c = true;
                    }
                    return true;
                }
                if (!C58328c.m226164a()) {
                    Selection.removeSelection(spannable);
                }
                Touch.onTouchEvent(textView, spannable, motionEvent);
                return false;
            }
        }
    }

    public TextViewFixTouchConsume(Context context) {
        this(context, null);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f144248b = false;
        super.setOnLongClickListener(onLongClickListener);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.f144249c = false;
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.m165383e("TextViewFixTouchConsume", "supre onTouchEvent crash:" + e);
        }
        if (this.f144248b) {
            return this.f144249c;
        }
        boolean z2 = this.f144249c;
        return z2 ? z2 : z;
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public TextViewFixTouchConsume(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f144248b = true;
        this.f144255k = context;
    }
}
