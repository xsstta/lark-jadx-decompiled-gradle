package com.ss.android.vc.meeting.module.reaction.livewidget;

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
import com.ss.android.lark.widget.light.touch.TouchConsumeView;
import java.util.Timer;
import java.util.TimerTask;

public abstract class VCTextViewFixTouchConsume extends VCEllipsizedEmojiconTextView {

    /* renamed from: v */
    public static long f158195v = 500;

    /* renamed from: A */
    public boolean f158196A;

    /* renamed from: B */
    public int f158197B;

    /* renamed from: C */
    public int f158198C;

    /* renamed from: b */
    private Context f158199b;

    /* renamed from: w */
    boolean f158200w;

    /* renamed from: x */
    boolean f158201x;

    /* renamed from: y */
    public boolean f158202y;

    /* renamed from: z */
    public boolean f158203z;

    public boolean hasFocus() {
        return false;
    }

    public void scrollTo(int i, int i2) {
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.livewidget.VCTextViewFixTouchConsume$a */
    public static class C62836a extends LinkMovementMethod {

        /* renamed from: a */
        static C62836a f158204a;

        /* renamed from: b */
        private boolean f158205b;

        /* renamed from: c */
        private int f158206c;

        /* renamed from: d */
        private int f158207d;

        /* renamed from: b */
        public int mo217141b() {
            return this.f158206c;
        }

        /* renamed from: c */
        public int mo217142c() {
            return this.f158207d;
        }

        /* renamed from: a */
        public static C62836a m245971a() {
            if (f158204a == null) {
                f158204a = new C62836a();
            }
            return f158204a;
        }

        /* renamed from: a */
        public void mo217140a(boolean z) {
            this.f158205b = z;
        }

        public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            if (this.f158205b) {
                return false;
            }
            return super.onGenericMotionEvent(textView, spannable, motionEvent);
        }

        /* renamed from: a */
        private int m245970a(TextView textView, int i, int i2) {
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
            final VCTextViewFixTouchConsume vCTextViewFixTouchConsume = (VCTextViewFixTouchConsume) textView;
            if (action == 3) {
                vCTextViewFixTouchConsume.f158196A = true;
                return true;
            } else if (action == 2) {
                if (!(vCTextViewFixTouchConsume.f158197B == 0 && vCTextViewFixTouchConsume.f158198C == 0) && (Math.abs(vCTextViewFixTouchConsume.f158197B - ((int) motionEvent.getX())) >= 10 || Math.abs(vCTextViewFixTouchConsume.f158198C - ((int) motionEvent.getY())) >= 10)) {
                    vCTextViewFixTouchConsume.f158196A = true;
                }
                return true;
            } else if (action != 1 && action != 0) {
                return Touch.onTouchEvent(textView, spannable, motionEvent);
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    vCTextViewFixTouchConsume.f158197B = x;
                    vCTextViewFixTouchConsume.f158198C = y;
                } else if (action == 1) {
                    vCTextViewFixTouchConsume.f158197B = 0;
                    vCTextViewFixTouchConsume.f158198C = 0;
                }
                int a = m245970a(textView, x, y);
                final ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(a, a, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    vCTextViewFixTouchConsume.f158202y = false;
                    if (action == 1) {
                        if (vCTextViewFixTouchConsume.f158203z) {
                            vCTextViewFixTouchConsume.f158202y = true;
                            this.f158206c = x;
                            this.f158207d = y;
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
                        vCTextViewFixTouchConsume.f158196A = false;
                        if (vCTextViewFixTouchConsume.f158203z || vCTextViewFixTouchConsume.f158202y) {
                            vCTextViewFixTouchConsume.f158202y = true;
                        } else {
                            vCTextViewFixTouchConsume.f158203z = true;
                            new Timer().schedule(new TimerTask() {
                                /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCTextViewFixTouchConsume.C62836a.C628371 */

                                public void run() {
                                    Activity activityFromView = UIUtils.getActivityFromView(vCTextViewFixTouchConsume);
                                    if (activityFromView != null) {
                                        activityFromView.runOnUiThread(new Runnable() {
                                            /* class com.ss.android.vc.meeting.module.reaction.livewidget.VCTextViewFixTouchConsume.C62836a.C628371.RunnableC628381 */

                                            public void run() {
                                                if (vCTextViewFixTouchConsume.f158196A || vCTextViewFixTouchConsume.f158202y || !vCTextViewFixTouchConsume.f158203z) {
                                                    vCTextViewFixTouchConsume.f158203z = false;
                                                    vCTextViewFixTouchConsume.f158196A = false;
                                                    return;
                                                }
                                                vCTextViewFixTouchConsume.setTag(R.id.tag_long_press, TouchConsumeView.f144228h);
                                                clickableSpanArr[0].onClick(vCTextViewFixTouchConsume);
                                                vCTextViewFixTouchConsume.f158203z = false;
                                            }
                                        });
                                    }
                                }
                            }, VCTextViewFixTouchConsume.f158195v);
                            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                        }
                    }
                    if (textView instanceof VCTextViewFixTouchConsume) {
                        vCTextViewFixTouchConsume.f158201x = true;
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

    public VCTextViewFixTouchConsume(Context context) {
        this(context, null);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f158200w = false;
        super.setOnLongClickListener(onLongClickListener);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.f158201x = false;
        try {
            z = super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.m165383e("TextViewFixTouchConsume", "supre onTouchEvent crash:" + e);
        }
        if (this.f158200w) {
            return this.f158201x;
        }
        boolean z2 = this.f158201x;
        return z2 ? z2 : z;
    }

    public VCTextViewFixTouchConsume(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public VCTextViewFixTouchConsume(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f158200w = true;
        this.f158199b = context;
    }
}
