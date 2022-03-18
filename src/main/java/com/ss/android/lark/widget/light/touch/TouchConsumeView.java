package com.ss.android.lark.widget.light.touch;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.select.SelectableView;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 #2\u00020\u0001:\u0002#$B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/widget/light/touch/TouchConsumeView;", "Lcom/ss/android/lark/widget/select/SelectableView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "linkHit", "", "getLinkHit$linked_emoji_release", "()Z", "setLinkHit$linked_emoji_release", "(Z)V", "mConsumedSpanEvent", "getMConsumedSpanEvent", "setMConsumedSpanEvent", "mDontConsumeNonUrlClicks", "mPositionDownStartX", "mPositionDownStartY", "stateNormalClickWillTrigger", "stateTouchMoving", "stateWaitingForLongPressTrigger", "hasFocus", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "scrollTo", "", "x", "y", "setOnLongClickListener", "l", "Landroid/view/View$OnLongClickListener;", "Companion", "TouchConsumeMovementMethod", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class TouchConsumeView extends SelectableView {

    /* renamed from: g */
    public static final int f144227g = 10;

    /* renamed from: h */
    public static final String f144228h = f144228h;

    /* renamed from: i */
    public static final long f144229i = 500;

    /* renamed from: j */
    public static final Companion f144230j = new Companion(null);

    /* renamed from: a */
    private boolean f144231a;

    /* renamed from: b */
    public boolean f144232b;

    /* renamed from: c */
    public boolean f144233c;

    /* renamed from: d */
    public boolean f144234d;

    /* renamed from: e */
    public int f144235e;

    /* renamed from: f */
    public int f144236f;

    /* renamed from: l */
    private boolean f144237l;

    /* renamed from: m */
    private boolean f144238m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "<set-?>", "", "actionUpX", "getActionUpX", "()I", "actionUpY", "getActionUpY", "interceptGenericMotionEvent", "", "getOff", "widget", "Landroid/view/View;", "layout", "Landroid/text/Layout;", "x", "y", "onGenericMotionEvent", "Landroid/widget/TextView;", "text", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "buffer", "onTouchEvent2", "Lcom/ss/android/lark/widget/light/touch/TouchConsumeView;", "Landroid/text/Spanned;", "setInterceptGenericMotionEvent", "", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.touch.TouchConsumeView$b */
    public static final class TouchConsumeMovementMethod extends LinkMovementMethod {

        /* renamed from: a */
        public static TouchConsumeMovementMethod f144239a;

        /* renamed from: b */
        public static final Companion f144240b = new Companion(null);

        /* renamed from: c */
        private boolean f144241c;

        /* renamed from: d */
        private int f144242d;

        /* renamed from: e */
        private int f144243e;

        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(textView, "widget");
            Intrinsics.checkParameterIsNotNull(spannable, "buffer");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            return false;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod;", "getInstance", "()Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod;", "sInstance", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.light.touch.TouchConsumeView$b$a */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: a */
            public final TouchConsumeMovementMethod mo198214a() {
                if (TouchConsumeMovementMethod.f144239a == null) {
                    TouchConsumeMovementMethod.f144239a = new TouchConsumeMovementMethod();
                }
                TouchConsumeMovementMethod bVar = TouchConsumeMovementMethod.f144239a;
                if (bVar != null) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.light.touch.TouchConsumeView.TouchConsumeMovementMethod");
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final int mo198209a() {
            return this.f144242d;
        }

        /* renamed from: b */
        public final int mo198211b() {
            return this.f144243e;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/widget/light/touch/TouchConsumeView$TouchConsumeMovementMethod$onTouchEvent2$1", "Ljava/util/TimerTask;", "run", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.light.touch.TouchConsumeView$b$b */
        public static final class C58491b extends TimerTask {

            /* renamed from: a */
            final /* synthetic */ TouchConsumeView f144244a;

            /* renamed from: b */
            final /* synthetic */ ClickableSpan[] f144245b;

            public void run() {
                Activity activityFromView = UIUtils.getActivityFromView(this.f144244a);
                if (activityFromView != null) {
                    activityFromView.runOnUiThread(new RunnableC58492a(this));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.widget.light.touch.TouchConsumeView$b$b$a */
            static final class RunnableC58492a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C58491b f144246a;

                RunnableC58492a(C58491b bVar) {
                    this.f144246a = bVar;
                }

                public final void run() {
                    if (this.f144246a.f144244a.f144234d || this.f144246a.f144244a.f144232b || !this.f144246a.f144244a.f144233c) {
                        this.f144246a.f144244a.f144233c = false;
                        this.f144246a.f144244a.f144234d = false;
                        return;
                    }
                    this.f144246a.f144244a.setTag(R.id.tag_long_press, TouchConsumeView.f144230j.mo198208a());
                    this.f144246a.f144245b[0].onClick(this.f144246a.f144244a);
                    this.f144246a.f144244a.f144233c = false;
                }
            }

            C58491b(TouchConsumeView touchConsumeView, ClickableSpan[] clickableSpanArr) {
                this.f144244a = touchConsumeView;
                this.f144245b = clickableSpanArr;
            }
        }

        public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(textView, "widget");
            Intrinsics.checkParameterIsNotNull(spannable, "text");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            if (this.f144241c) {
                return false;
            }
            return super.onGenericMotionEvent(textView, spannable, motionEvent);
        }

        /* renamed from: a */
        private final int m226899a(View view, Layout layout, int i, int i2) {
            int i3;
            int paddingLeft = i - view.getPaddingLeft();
            int lineForVertical = layout.getLineForVertical((i2 - view.getPaddingTop()) + view.getScrollY());
            float scrollX = (float) (paddingLeft + view.getScrollX());
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
            if (layout.getPrimaryHorizontal(offsetForHorizontal) >= scrollX) {
                offsetForHorizontal--;
            }
            int lineEnd = layout.getLineEnd(lineForVertical);
            if (lineEnd > 1) {
                i3 = lineEnd - 1;
            } else {
                i3 = 0;
            }
            if (scrollX > layout.getSecondaryHorizontal(i3)) {
                return offsetForHorizontal + 1;
            }
            return offsetForHorizontal;
        }

        /* renamed from: a */
        public final boolean mo198210a(TouchConsumeView touchConsumeView, Layout layout, Spanned spanned, MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(touchConsumeView, "widget");
            Intrinsics.checkParameterIsNotNull(layout, "layout");
            Intrinsics.checkParameterIsNotNull(spanned, "buffer");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 3) {
                touchConsumeView.f144234d = true;
                return true;
            } else if (action == 2) {
                if (!(touchConsumeView.f144235e == 0 && touchConsumeView.f144236f == 0) && (Math.abs(touchConsumeView.f144235e - ((int) motionEvent.getX())) >= TouchConsumeView.f144227g || Math.abs(touchConsumeView.f144236f - ((int) motionEvent.getY())) >= TouchConsumeView.f144227g)) {
                    touchConsumeView.f144234d = true;
                }
                return true;
            } else if (action != 1 && action != 0) {
                return false;
            } else {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0) {
                    touchConsumeView.f144235e = x;
                    touchConsumeView.f144236f = y;
                    touchConsumeView.setMConsumedSpanEvent(false);
                } else if (action == 1) {
                    touchConsumeView.f144235e = 0;
                    touchConsumeView.f144236f = 0;
                }
                TouchConsumeView touchConsumeView2 = touchConsumeView;
                int a = m226899a(touchConsumeView2, layout, x, y);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(a, a, ClickableSpan.class);
                Intrinsics.checkExpressionValueIsNotNull(clickableSpanArr, "link");
                if (clickableSpanArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    return false;
                }
                touchConsumeView.f144232b = false;
                if (action == 1) {
                    if (touchConsumeView.f144233c) {
                        touchConsumeView.f144232b = true;
                        this.f144242d = x;
                        this.f144243e = y;
                        if (clickableSpanArr.length == 1) {
                            touchConsumeView.setMConsumedSpanEvent(true);
                            clickableSpanArr[0].onClick(touchConsumeView2);
                        } else if (clickableSpanArr.length > 1) {
                            touchConsumeView.setMConsumedSpanEvent(true);
                            ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(a, a, ReplacementSpan.class);
                            Intrinsics.checkExpressionValueIsNotNull(replacementSpanArr, "replacementSpans");
                            if (replacementSpanArr.length == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                clickableSpanArr[clickableSpanArr.length - 1].onClick(touchConsumeView2);
                            } else {
                                clickableSpanArr[0].onClick(touchConsumeView2);
                            }
                        }
                    }
                } else if (action == 0) {
                    touchConsumeView.f144234d = false;
                    if (touchConsumeView.f144233c || touchConsumeView.f144232b) {
                        touchConsumeView.f144232b = true;
                    } else {
                        touchConsumeView.f144233c = true;
                        new Timer().schedule(new C58491b(touchConsumeView, clickableSpanArr), TouchConsumeView.f144229i);
                    }
                }
                touchConsumeView.setLinkHit$linked_emoji_release(true);
                return true;
            }
        }
    }

    public boolean hasFocus() {
        return false;
    }

    public void scrollTo(int i, int i2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/widget/light/touch/TouchConsumeView$Companion;", "", "()V", "LONG_PRESS_DELAY", "", "MAX_MOVE_DISTANCE", "", "TAG_LONG_PRESS", "", "getTAG_LONG_PRESS", "()Ljava/lang/String;", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.touch.TouchConsumeView$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo198208a() {
            return TouchConsumeView.f144228h;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getLinkHit$linked_emoji_release() {
        return this.f144237l;
    }

    public final boolean getMConsumedSpanEvent() {
        return this.f144238m;
    }

    public final void setLinkHit$linked_emoji_release(boolean z) {
        this.f144237l = z;
    }

    public final void setMConsumedSpanEvent(boolean z) {
        this.f144238m = z;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f144231a = false;
        super.setOnLongClickListener(onLongClickListener);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        this.f144237l = false;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f144231a) {
            return this.f144237l;
        }
        boolean z = this.f144237l;
        return z ? z : onTouchEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchConsumeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f144231a = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TouchConsumeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
