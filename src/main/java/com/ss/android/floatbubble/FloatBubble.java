package com.ss.android.floatbubble;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.util.C28465a;
import com.ss.android.floatbubble.util.C28469c;
import com.ss.android.floatbubble.util.p1319b.C28468a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Timer;
import java.util.TimerTask;

public class FloatBubble extends FrameLayout {

    /* renamed from: A */
    private int f71553A;

    /* renamed from: B */
    private int f71554B;

    /* renamed from: C */
    private boolean f71555C;

    /* renamed from: D */
    private AbstractC28458c f71556D;

    /* renamed from: E */
    private FrameLayout f71557E;

    /* renamed from: F */
    private long f71558F;

    /* renamed from: G */
    private boolean f71559G;

    /* renamed from: H */
    private int f71560H = 1;

    /* renamed from: a */
    public WindowManager f71561a;

    /* renamed from: b */
    public WindowManager.LayoutParams f71562b;

    /* renamed from: c */
    public int f71563c;

    /* renamed from: d */
    public int f71564d;

    /* renamed from: e */
    public AbstractC28457b f71565e;

    /* renamed from: f */
    public volatile boolean f71566f;

    /* renamed from: g */
    public Handler f71567g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Context f71568h;

    /* renamed from: i */
    private boolean f71569i;

    /* renamed from: j */
    private int f71570j;

    /* renamed from: k */
    private int f71571k;

    /* renamed from: l */
    private int f71572l;

    /* renamed from: m */
    private int f71573m;

    /* renamed from: n */
    private int f71574n = 51;

    /* renamed from: o */
    private int f71575o = 2;

    /* renamed from: p */
    private int f71576p;

    /* renamed from: q */
    private int f71577q = 1;

    /* renamed from: r */
    private int f71578r = 1;

    /* renamed from: s */
    private int f71579s;

    /* renamed from: t */
    private int f71580t;

    /* renamed from: u */
    private int f71581u;

    /* renamed from: v */
    private int f71582v;

    /* renamed from: w */
    private int f71583w;

    /* renamed from: x */
    private Timer f71584x;

    /* renamed from: y */
    private TimerTask f71585y;

    /* renamed from: z */
    private long f71586z = 16;

    /* renamed from: com.ss.android.floatbubble.FloatBubble$b */
    public interface AbstractC28457b {
        void onDismiss();
    }

    /* renamed from: com.ss.android.floatbubble.FloatBubble$c */
    public interface AbstractC28458c {
        void onShow();
    }

    public boolean isShown() {
        return this.f71566f;
    }

    /* renamed from: c */
    public void mo101318c() {
        Timer timer = this.f71584x;
        if (timer != null) {
            timer.cancel();
            this.f71584x = null;
        }
        TimerTask timerTask = this.f71585y;
        if (timerTask != null) {
            timerTask.cancel();
            this.f71585y = null;
        }
        this.f71567g.removeCallbacksAndMessages(null);
        Log.m165389i("VideoChat_FloatBubble", "timer :  cancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.floatbubble.FloatBubble$a */
    public class C28455a extends TimerTask {

        /* renamed from: a */
        int f71588a;

        /* renamed from: b */
        int f71589b;

        /* renamed from: c */
        volatile int f71590c;

        public void run() {
            this.f71590c++;
            if (Math.abs(this.f71589b - FloatBubble.this.f71562b.x) <= Math.abs(this.f71588a)) {
                FloatBubble.this.f71562b.x = this.f71589b;
            } else {
                FloatBubble.this.f71562b.x += this.f71588a;
            }
            FloatBubble.this.f71567g.post(new Runnable() {
                /* class com.ss.android.floatbubble.FloatBubble.C28455a.RunnableC284561 */

                public void run() {
                    if (!FloatBubble.this.f71566f || C28455a.this.f71590c >= 10) {
                        FloatBubble.this.mo101318c();
                    }
                    if (FloatBubble.this.f71566f) {
                        FloatBubble.this.f71561a.updateViewLayout(FloatBubble.this, FloatBubble.this.f71562b);
                    }
                }
            });
        }

        C28455a() {
            if (FloatBubble.this.f71562b.x >= (FloatBubble.this.f71564d + FloatBubble.this.f71563c) / 2) {
                this.f71589b = FloatBubble.this.f71564d;
                this.f71588a = (FloatBubble.this.f71564d - FloatBubble.this.f71562b.x) / 10;
                return;
            }
            this.f71589b = FloatBubble.this.f71563c;
            this.f71588a = (FloatBubble.this.f71563c - FloatBubble.this.f71562b.x) / 10;
        }
    }

    /* renamed from: f */
    private void m104280f() {
        mo101318c();
        this.f71584x = new Timer();
        C28455a aVar = new C28455a();
        this.f71585y = aVar;
        this.f71584x.schedule(aVar, 0, this.f71586z);
        Log.m165389i("VideoChat_FloatBubble", "appealToLeftRight timer start");
    }

    public int[] getAxis() {
        WindowManager.LayoutParams layoutParams = this.f71562b;
        if (layoutParams != null) {
            this.f71582v = C28459a.m104291a(this.f71568h, layoutParams.x);
            this.f71581u = C28459a.m104291a(this.f71568h, this.f71562b.y);
        }
        return new int[]{this.f71582v, this.f71581u};
    }

    /* renamed from: e */
    private void m104279e() {
        int i;
        if (this.f71559G) {
            i = 17039400;
        } else {
            i = 262184;
        }
        if (this.f71576p == 1) {
            i |= 16;
        }
        if (this.f71569i) {
            i |= SmActions.ACTION_ONTHECALL_EXIT;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, i, -3);
        this.f71562b = layoutParams;
        layoutParams.gravity = this.f71574n;
        this.f71562b.x = this.f71582v;
        this.f71562b.y = this.f71581u;
        this.f71561a.addView(this, this.f71562b);
        Log.m165389i("VideoChat_FloatBubble", "addAsActivityLayer");
    }

    /* renamed from: b */
    public void mo101316b() {
        Log.m165389i("VideoChat_FloatBubble", "show" + this.f71566f);
        this.f71566f = true;
        try {
            Context context = this.f71568h;
            if (context != null) {
                if (context instanceof Application) {
                    if (C28460b.m104296a(context)) {
                        m104278d();
                    } else {
                        Log.m165383e("VideoChat_FloatBubble", "No permission to show a float window，Please call FloatBubblePermission.isPermissionGranted first to check if app has this permission and call FloatBubblePermission.requestFloatPermission to request the permission if not");
                        return;
                    }
                } else if (context instanceof Activity) {
                    m104279e();
                }
                AbstractC28458c cVar = this.f71556D;
                if (cVar != null) {
                    cVar.onShow();
                }
            }
        } catch (Exception e) {
            Log.m165383e("VideoChat_FloatBubble", e.getStackTrace().toString());
        }
    }

    /* renamed from: d */
    private void m104278d() {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 2038;
        } else {
            i = 2002;
        }
        int i4 = 262184;
        if (DesktopUtil.m144301a(getContext())) {
            i4 = 40;
            i2 = 2037;
        } else {
            i2 = i;
        }
        if (this.f71559G) {
            i4 |= 16777216;
        }
        if (this.f71576p == 1) {
            i4 |= 16;
        }
        if (this.f71569i) {
            i3 = i4 | SmActions.ACTION_ONTHECALL_EXIT;
        } else {
            i3 = i4;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i2, i3, -3);
        this.f71562b = layoutParams;
        layoutParams.gravity = this.f71574n;
        this.f71562b.x = this.f71582v;
        this.f71562b.y = this.f71581u;
        if (C28468a.m104319a(getContext())) {
            C28468a.m104318a(this.f71562b);
            int i5 = this.f71581u;
            int i6 = this.f71579s;
            if (i5 < i6) {
                this.f71562b.y = i6;
            } else if (i5 > this.f71564d) {
                this.f71562b.y = this.f71580t;
            }
        }
        this.f71561a.addView(this, this.f71562b);
        Log.m165389i("VideoChat_FloatBubble", "addAsAppLayer");
    }

    /* renamed from: a */
    public void mo101314a() {
        C28469c.m104323a(new Runnable() {
            /* class com.ss.android.floatbubble.FloatBubble.RunnableC284541 */

            public void run() {
                Log.m165389i("VideoChat_FloatBubble", "dismiss" + FloatBubble.this.f71566f);
                if (FloatBubble.this.f71566f) {
                    FloatBubble.this.f71566f = false;
                    if (FloatBubble.this.f71561a != null) {
                        try {
                            FloatBubble.this.f71561a.removeView(FloatBubble.this);
                        } catch (Exception e) {
                            Log.m165383e("VideoChat_FloatBubble", e.getStackTrace().toString());
                        }
                    }
                    if (FloatBubble.this.f71565e != null) {
                        FloatBubble.this.f71565e.onDismiss();
                    }
                    Log.m165389i("VideoChat_FloatBubble", "dismiss really");
                }
                FloatBubble.this.mo101318c();
            }
        });
    }

    /* renamed from: a */
    public FloatBubble mo101309a(int i) {
        this.f71575o = i;
        return this;
    }

    /* renamed from: c */
    public FloatBubble mo101317c(int i) {
        this.f71583w = i;
        return this;
    }

    /* renamed from: b */
    public FloatBubble mo101315b(int i) {
        this.f71574n = i;
        m104277b(true);
        return this;
    }

    /* renamed from: a */
    public FloatBubble mo101311a(AbstractC28457b bVar) {
        this.f71565e = bVar;
        return this;
    }

    public FloatBubble(Context context) {
        super(context);
    }

    /* renamed from: a */
    private FloatBubble m104276a(View view) {
        if (this.f71568h == null) {
            return this;
        }
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.float_bubble_view, this);
        this.f71557E = frameLayout;
        ((FrameLayout) frameLayout.findViewById(R.id.float_bubble_container)).addView(view);
        return this;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int rawX = ((int) motionEvent.getRawX()) - this.f71570j;
                    int rawY = ((int) motionEvent.getRawY()) - this.f71571k;
                    this.f71562b.x = this.f71572l + (rawX * this.f71577q);
                    this.f71562b.y = this.f71573m + (rawY * this.f71578r);
                    int i = this.f71562b.x;
                    int i2 = this.f71563c;
                    if (i < i2) {
                        this.f71562b.x = i2;
                    }
                    int i3 = this.f71562b.x;
                    int i4 = this.f71564d;
                    if (i3 > i4) {
                        this.f71562b.x = i4;
                    }
                    int i5 = this.f71562b.y;
                    int i6 = this.f71579s;
                    if (i5 < i6) {
                        this.f71562b.y = i6;
                    }
                    int i7 = this.f71562b.y;
                    int i8 = this.f71580t;
                    if (i7 > i8) {
                        this.f71562b.y = i8;
                    }
                    this.f71561a.updateViewLayout(this, this.f71562b);
                    return super.dispatchTouchEvent(motionEvent);
                } else if (action != 3) {
                    return true;
                }
            }
            if (this.f71583w == 1) {
                m104280f();
            }
            int rawX2 = (int) (motionEvent.getRawX() - ((float) this.f71570j));
            int rawY2 = (int) (motionEvent.getRawY() - ((float) this.f71571k));
            if (rawX2 < 10 && rawY2 < 10 && System.currentTimeMillis() - this.f71558F <= 300) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f71570j = (int) motionEvent.getRawX();
        this.f71571k = (int) motionEvent.getRawY();
        this.f71572l = this.f71562b.x;
        this.f71573m = this.f71562b.y;
        this.f71558F = System.currentTimeMillis();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private void m104277b(boolean z) {
        int i;
        this.f71553A = C28465a.m104306a(this.f71568h, this.f71561a);
        int b = C28465a.m104307b(this.f71568h, this.f71561a);
        this.f71554B = b;
        if (b > this.f71553A) {
            i = 1;
        } else {
            i = 2;
        }
        if (i != this.f71560H) {
            Log.m165389i("VideoChat_FloatBubble", "screen orientation changed cause initScreenParams force");
            z = true;
        }
        this.f71560H = i;
        if (!z) {
            if (!this.f71555C) {
                this.f71555C = true;
            } else {
                return;
            }
        }
        int width = getWidth();
        int height = getHeight();
        int i2 = this.f71574n;
        int i3 = i2 & 7;
        if (i3 == 1) {
            this.f71577q = 1;
            int i4 = this.f71553A;
            this.f71563c = ((i4 - width) * -1) / 2;
            this.f71564d = (i4 - width) / 2;
        } else if (i3 != 5) {
            this.f71577q = 1;
            this.f71563c = 0;
            this.f71564d = this.f71553A - width;
        } else {
            this.f71577q = -1;
            this.f71563c = 0;
            this.f71564d = this.f71553A - width;
        }
        int i5 = i2 & SmEvents.EVENT_NE_RR;
        if (i5 == 16) {
            this.f71578r = 1;
            int i6 = this.f71554B;
            this.f71579s = ((i6 - height) * -1) / 2;
            this.f71580t = (i6 - height) / 2;
            if (C28468a.m104319a(getContext())) {
                int b2 = (C28468a.m104320b(getContext()) - C28468a.m104322c(getContext())) / 2;
                this.f71579s += b2;
                this.f71580t += b2;
            }
        } else if (i5 != 80) {
            this.f71578r = 1;
            this.f71579s = 0;
            this.f71580t = this.f71554B - height;
            if (C28468a.m104319a(getContext())) {
                this.f71579s += C28468a.m104320b(getContext());
                this.f71580t += C28468a.m104320b(getContext());
            }
        } else {
            this.f71578r = -1;
            this.f71579s = 0;
            this.f71580t = this.f71554B - height;
            if (C28468a.m104319a(getContext())) {
                this.f71579s += C28468a.m104322c(getContext());
                this.f71580t += C28468a.m104322c(getContext());
            }
        }
        int i7 = this.f71575o;
        if (i7 == 0) {
            this.f71578r = 0;
        } else if (i7 == 1) {
            this.f71577q = 0;
        } else if (i7 == 3) {
            this.f71577q = 0;
            this.f71578r = 0;
        }
    }

    /* renamed from: a */
    public FloatBubble mo101312a(AbstractC28458c cVar) {
        this.f71556D = cVar;
        return this;
    }

    /* renamed from: a */
    public FloatBubble mo101313a(boolean z) {
        this.f71559G = z;
        return this;
    }

    /* renamed from: a */
    public static FloatBubble m104273a(Application application, View view) {
        return m104275a((Context) application, view, false);
    }

    public FloatBubble(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public FloatBubble mo101310a(int i, int i2) {
        this.f71582v = C28459a.m104293b(this.f71568h, i);
        this.f71581u = C28459a.m104293b(this.f71568h, i2);
        if (!(this.f71562b == null || this.f71561a == null || !this.f71566f)) {
            this.f71562b.x = this.f71582v;
            this.f71562b.y = this.f71581u;
            this.f71561a.updateViewLayout(this, this.f71562b);
        }
        return this;
    }

    /* renamed from: a */
    public static FloatBubble m104274a(Application application, View view, boolean z) {
        return m104275a((Context) application, view, z);
    }

    /* renamed from: a */
    private static FloatBubble m104275a(Context context, View view, boolean z) {
        if (context == null || view == null) {
            Log.m165383e("VideoChat_FloatBubble", "context and contentView can not be null");
            return null;
        }
        FloatBubble floatBubble = new FloatBubble(context);
        floatBubble.f71568h = context;
        floatBubble.f71561a = (WindowManager) context.getSystemService("window");
        floatBubble.f71569i = z;
        floatBubble.m104276a(view);
        Log.m165389i("VideoChat_FloatBubble", "make float bubble");
        return floatBubble;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m104277b(false);
    }
}
