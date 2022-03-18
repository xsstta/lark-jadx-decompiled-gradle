package com.bytedance.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.Logger;
import com.bytedance.notification.p857a.AbstractC20222a;
import com.bytedance.notification.p858b.C20226a;
import com.bytedance.notification.p858b.C20227b;
import com.bytedance.notification.p858b.C20228c;
import com.larksuite.suite.R;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.notification.a */
public class C20218a {

    /* renamed from: a */
    public final Context f49390a;

    /* renamed from: b */
    public final Intent f49391b;

    /* renamed from: c */
    public final AbstractC20222a f49392c;

    /* renamed from: d */
    public Toast f49393d;

    /* renamed from: e */
    private final String f49394e;

    /* renamed from: f */
    private final Bitmap f49395f;

    /* renamed from: g */
    private final int f49396g;

    /* renamed from: h */
    private final int f49397h;

    /* renamed from: i */
    private final int f49398i;

    /* renamed from: j */
    private final int f49399j;

    /* renamed from: k */
    private final double f49400k;

    /* renamed from: l */
    private final int f49401l;

    /* renamed from: m */
    private final View.OnClickListener f49402m;

    /* renamed from: n */
    private View f49403n;

    /* renamed from: o */
    private int f49404o;

    /* renamed from: p */
    private boolean f49405p;

    /* renamed from: q */
    private final int f49406q = 1;

    /* renamed from: r */
    private final Handler f49407r = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.notification.C20218a.HandlerC202191 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && C20218a.this.f49393d != null) {
                C20218a.this.f49393d.cancel();
            }
        }
    };

    /* renamed from: c */
    private View.OnClickListener m73796c() {
        return new View.OnClickListener() {
            /* class com.bytedance.notification.C20218a.View$OnClickListenerC202202 */

            public void onClick(View view) {
                C20227b.m73856a("PushBannerNotification", "onClick: on click of banner");
                if (C20218a.this.f49392c != null) {
                    C20218a.this.f49392c.mo68431a();
                }
                C20218a.this.f49393d.cancel();
                try {
                    C20218a.this.f49391b.putExtra("from_banner_notification", true);
                    PendingIntent.getActivity(C20218a.this.f49390a, 0, C20218a.this.f49391b, 0).send(C20218a.this.f49390a, 0, C20218a.this.f49391b);
                    if (!ActivityLifecycleObserver.getIns().isBackGround()) {
                        C20218a.this.mo68412a();
                        C20218a.this.mo68413a(true, "");
                        return;
                    }
                    C20218a.this.mo68413a(false, "unknown");
                } catch (Exception e) {
                    C20218a aVar = C20218a.this;
                    aVar.mo68413a(false, "exception:" + e.getLocalizedMessage());
                }
            }
        };
    }

    /* renamed from: d */
    private boolean m73797d() {
        try {
            this.f49393d.setGravity(49, 0, this.f49404o);
            this.f49393d.setView(this.f49403n);
            try {
                Object a = m73793a(this.f49393d, "mTN");
                if (a != null) {
                    Object a2 = m73793a(a, "mParams");
                    if (a2 instanceof WindowManager.LayoutParams) {
                        ((WindowManager.LayoutParams) a2).flags = 136;
                    }
                }
            } catch (Throwable unused) {
                C20227b.m73856a("PushBannerNotification", "initToast: 反射出现了异常！！");
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo68412a() {
        try {
            if (Build.VERSION.SDK_INT >= 5) {
                ((NotificationManager) this.f49390a.getSystemService("notification")).cancel("app_notify", this.f49401l);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo68414b() {
        if (this.f49405p) {
            try {
                if (this.f49400k > 0.0d) {
                    this.f49393d.setDuration(1);
                    this.f49393d.show();
                    this.f49407r.sendEmptyMessageDelayed(1, (long) (this.f49400k * 1000.0d));
                }
            } catch (Throwable th) {
                Logger.m15170e("PushBannerNotification", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.notification.a$a */
    public static class C20221a {

        /* renamed from: a */
        public final Context f49410a;

        /* renamed from: b */
        public String f49411b;

        /* renamed from: c */
        public Bitmap f49412c;

        /* renamed from: d */
        public int f49413d = -1;

        /* renamed from: e */
        public int f49414e;

        /* renamed from: f */
        public int f49415f;

        /* renamed from: g */
        public int f49416g;

        /* renamed from: h */
        public double f49417h;

        /* renamed from: i */
        public Intent f49418i;

        /* renamed from: j */
        public int f49419j;

        /* renamed from: k */
        public String f49420k;

        /* renamed from: l */
        public AbstractC20222a f49421l;

        /* renamed from: m */
        public View f49422m;

        /* renamed from: n */
        private boolean f49423n;

        /* renamed from: a */
        public C20218a mo68425a() throws IllegalArgumentException {
            if (!this.f49423n) {
                this.f49413d = -1;
            }
            return new C20218a(this);
        }

        /* renamed from: a */
        public C20221a mo68417a(double d) {
            this.f49417h = d;
            return this;
        }

        /* renamed from: b */
        public C20221a mo68426b(int i) {
            this.f49413d = i;
            return this;
        }

        /* renamed from: c */
        public C20221a mo68428c(int i) {
            this.f49414e = i;
            return this;
        }

        /* renamed from: d */
        public C20221a mo68429d(int i) {
            this.f49415f = i;
            return this;
        }

        /* renamed from: e */
        public C20221a mo68430e(int i) {
            this.f49416g = i;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68418a(int i) {
            this.f49419j = i;
            return this;
        }

        /* renamed from: b */
        public C20221a mo68427b(String str) {
            this.f49420k = str;
            return this;
        }

        public C20221a(Context context) {
            this.f49410a = context;
        }

        /* renamed from: a */
        public C20221a mo68419a(Intent intent) {
            this.f49418i = intent;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68420a(Bitmap bitmap) {
            this.f49412c = bitmap;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68421a(View view) {
            this.f49422m = view;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68422a(AbstractC20222a aVar) {
            this.f49421l = aVar;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68423a(String str) {
            this.f49411b = str;
            return this;
        }

        /* renamed from: a */
        public C20221a mo68424a(boolean z) {
            this.f49423n = z;
            return this;
        }
    }

    public C20218a(C20221a aVar) {
        Context context = aVar.f49410a;
        this.f49390a = context;
        this.f49394e = aVar.f49411b;
        this.f49395f = aVar.f49412c;
        this.f49391b = aVar.f49418i;
        this.f49396g = aVar.f49413d;
        this.f49397h = aVar.f49414e;
        this.f49398i = aVar.f49415f;
        this.f49399j = aVar.f49416g;
        this.f49401l = aVar.f49419j;
        this.f49400k = aVar.f49417h;
        this.f49392c = aVar.f49421l;
        this.f49393d = new Toast(context);
        View.OnClickListener c = m73796c();
        this.f49402m = c;
        View a = m73792a(aVar.f49422m);
        this.f49403n = a;
        if (a != null) {
            a.setOnClickListener(c);
            this.f49405p = m73797d();
        }
    }

    /* renamed from: a */
    private void m73795a(LinearLayout linearLayout) {
        if (this.f49397h != 0) {
            if (!C20228c.m73857a().mo68466f()) {
                m73794a(linearLayout, Resources.getSystem().getIdentifier("app_name_text", "id", "android"), this.f49397h);
                m73794a(linearLayout, Resources.getSystem().getIdentifier("time_divider", "id", "android"), this.f49397h);
                m73794a(linearLayout, Resources.getSystem().getIdentifier("time", "id", "android"), this.f49397h);
            } else if (!C20228c.m73857a().mo68467g()) {
                m73794a(linearLayout, Resources.getSystem().getIdentifier("sub_time_divider", "id", "vivo"), this.f49397h);
                m73794a(linearLayout, Resources.getSystem().getIdentifier("sub_time", "id", "vivo"), this.f49397h);
            }
        }
        if (this.f49398i != 0) {
            m73794a(linearLayout, Resources.getSystem().getIdentifier("title", "id", "android"), this.f49398i);
        }
        if (this.f49399j != 0) {
            m73794a(linearLayout, Resources.getSystem().getIdentifier("text", "id", "android"), this.f49399j);
        }
    }

    /* renamed from: a */
    private View m73792a(View view) {
        if (view == null) {
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) this.f49390a.getSystemService("layout_inflater")).inflate(R.layout.highlight_banner_parent, (ViewGroup) null);
        linearLayout.addView(view);
        float f = 30.0f;
        ImageView imageView = (ImageView) view.findViewById(Resources.getSystem().getIdentifier("icon", "id", "android"));
        if (imageView != null) {
            imageView.setImageBitmap(this.f49395f);
        }
        if (C20228c.m73857a().mo68465e()) {
            View findViewById = view.findViewById(Resources.getSystem().getIdentifier("notification_header", "id", "android"));
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
            View findViewById2 = view.findViewById(Resources.getSystem().getIdentifier("notification_main_column", "id", "android"));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams.topMargin = layoutParams.bottomMargin;
            findViewById2.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(Resources.getSystem().getIdentifier("right_icon_container", "id", "android"));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams2.height = -1;
            linearLayout2.setVerticalGravity(16);
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            linearLayout2.setLayoutParams(layoutParams2);
            ImageView imageView2 = (ImageView) view.findViewById(Resources.getSystem().getIdentifier("right_icon", "id", "android"));
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams3.gravity = 17;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setLayoutParams(layoutParams3);
        } else if (C20228c.m73857a().mo68466f()) {
            if (C20228c.m73857a().mo68467g()) {
                View findViewById3 = linearLayout.findViewById(R.id.push_notification_logo_and_name_layout);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view.findViewById(Resources.getSystem().getIdentifier("notification_main_column", "id", "android")).getLayoutParams();
                ((ImageView) linearLayout.findViewById(R.id.push_notification_small_icon)).setImageBitmap(this.f49395f);
                TextView textView = (TextView) linearLayout.findViewById(R.id.push_notification_app_name);
                textView.setText(this.f49394e);
                int i = this.f49397h;
                if (i != 0) {
                    textView.setTextColor(i);
                }
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) findViewById3.getLayoutParams();
                layoutParams5.leftMargin = layoutParams4.leftMargin;
                layoutParams5.topMargin = layoutParams4.topMargin;
                if (layoutParams5.topMargin == 0) {
                    layoutParams5.topMargin = C20226a.m73855a(this.f49390a, 10.0f);
                }
                findViewById3.setLayoutParams(layoutParams5);
                findViewById3.setVisibility(0);
            }
        } else if (C20228c.m73857a().mo68468h()) {
            f = 15.0f;
            if (C20228c.m73857a().mo68470j()) {
                View findViewById4 = linearLayout.findViewById(Resources.getSystem().getIdentifier("notification_header", "id", "android"));
                findViewById4.setPadding(findViewById4.getPaddingLeft(), 0, findViewById4.getPaddingRight(), 0);
            } else if (C20228c.m73857a().mo68469i()) {
                view.setPadding(C20226a.m73855a(this.f49390a, 5.0f), 0, 0, 0);
            }
        } else if (C20228c.m73857a().mo68462b()) {
            linearLayout.setPadding(view.getPaddingLeft(), C20226a.m73855a(this.f49390a, 13.0f), view.getPaddingRight(), C20226a.m73855a(this.f49390a, 13.0f));
            view.setBackgroundColor(this.f49396g);
            View findViewById5 = view.findViewById(R.id.push_inner_layout);
            if (findViewById5 != null) {
                findViewById5.setBackgroundColor(this.f49396g);
            }
        }
        m73795a(linearLayout);
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) this.f49390a.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        }
        this.f49404o = C20226a.m73855a(this.f49390a, 8.0f);
        int a = this.f49390a.getResources().getDisplayMetrics().widthPixels - C20226a.m73855a(this.f49390a, 10.0f);
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams6.width = a;
        view.setLayoutParams(layoutParams6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(this.f49396g);
        if (Build.VERSION.SDK_INT >= 16) {
            linearLayout.setBackground(gradientDrawable);
        }
        return linearLayout;
    }

    /* renamed from: a */
    public void mo68413a(boolean z, String str) {
        AbstractC20222a aVar = this.f49392c;
        if (aVar != null) {
            aVar.mo68432a(z, str);
        }
    }

    /* renamed from: a */
    private Object m73793a(Object obj, String str) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: a */
    private void m73794a(View view, int i, int i2) {
        try {
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                textView.setTextColor(i2);
            }
        } catch (Throwable unused) {
        }
    }
}
