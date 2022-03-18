package com.bytedance.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.bytedance.notification.C20218a;
import com.bytedance.notification.p857a.AbstractC20222a;
import com.bytedance.notification.p858b.C20226a;
import com.bytedance.notification.p858b.C20228c;
import com.larksuite.suite.R;
import com.ss.android.message.p3002a.C59436a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.notification.b */
public class C20223b {

    /* renamed from: A */
    private final double f49424A;

    /* renamed from: B */
    private final AbstractC20222a f49425B;

    /* renamed from: C */
    private View f49426C;

    /* renamed from: D */
    private final Handler f49427D = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    Notification f49428a;

    /* renamed from: b */
    private final Context f49429b;

    /* renamed from: c */
    private final String f49430c;

    /* renamed from: d */
    private final int f49431d;

    /* renamed from: e */
    private Bitmap f49432e;

    /* renamed from: f */
    private final String f49433f;

    /* renamed from: g */
    private final String f49434g;

    /* renamed from: h */
    private final NotificationStyle f49435h;

    /* renamed from: i */
    private final Bitmap f49436i;

    /* renamed from: j */
    private final Intent f49437j;

    /* renamed from: k */
    private final int f49438k;

    /* renamed from: l */
    private final boolean f49439l;

    /* renamed from: m */
    private final int f49440m;

    /* renamed from: n */
    private final boolean f49441n;

    /* renamed from: o */
    private final int f49442o;

    /* renamed from: p */
    private final int f49443p;

    /* renamed from: q */
    private final int f49444q;

    /* renamed from: r */
    private final String f49445r;

    /* renamed from: s */
    private final boolean f49446s;

    /* renamed from: t */
    private final boolean f49447t;

    /* renamed from: u */
    private final boolean f49448u;

    /* renamed from: v */
    private final boolean f49449v;

    /* renamed from: w */
    private final int f49450w;

    /* renamed from: x */
    private final int f49451x;

    /* renamed from: y */
    private final int f49452y;

    /* renamed from: z */
    private final int f49453z;

    /* renamed from: b */
    private Notification m73822b() {
        return this.f49428a;
    }

    /* renamed from: com.bytedance.notification.b$a */
    public static class C20225a extends NotificationCompat.Builder {

        /* renamed from: A */
        public AbstractC20222a f49458A;

        /* renamed from: B */
        private PushNotificationExtra f49459B;

        /* renamed from: C */
        private int f49460C;

        /* renamed from: a */
        public Context f49461a;

        /* renamed from: b */
        public String f49462b;

        /* renamed from: c */
        public int f49463c;

        /* renamed from: d */
        public int f49464d;

        /* renamed from: e */
        public Bitmap f49465e;

        /* renamed from: f */
        public String f49466f;

        /* renamed from: g */
        public String f49467g;

        /* renamed from: h */
        public NotificationStyle f49468h = NotificationStyle.NORMAL;

        /* renamed from: i */
        public Bitmap f49469i;

        /* renamed from: j */
        public Intent f49470j;

        /* renamed from: k */
        public boolean f49471k;

        /* renamed from: l */
        public int f49472l;

        /* renamed from: m */
        public boolean f49473m;

        /* renamed from: n */
        public int f49474n;

        /* renamed from: o */
        public int f49475o;

        /* renamed from: p */
        public int f49476p;

        /* renamed from: q */
        public String f49477q;

        /* renamed from: r */
        public boolean f49478r;

        /* renamed from: s */
        public boolean f49479s;

        /* renamed from: t */
        public boolean f49480t;

        /* renamed from: u */
        public boolean f49481u;

        /* renamed from: v */
        public int f49482v;

        /* renamed from: w */
        public int f49483w;

        /* renamed from: x */
        public int f49484x;

        /* renamed from: y */
        public int f49485y;

        /* renamed from: z */
        public double f49486z;

        /* renamed from: a */
        public C20223b mo68446a() throws IllegalArgumentException {
            if (!TextUtils.isEmpty(this.f49467g)) {
                PackageInfo packageInfo = null;
                if (this.f49463c == 0) {
                    if (C20229c.m73869a().mo68472c() != 0) {
                        this.f49463c = C20229c.m73869a().mo68472c();
                    } else if (Build.VERSION.SDK_INT > 20) {
                        this.f49463c = R.drawable.status_icon_l;
                    } else {
                        this.f49463c = R.drawable.status_icon;
                    }
                    int i = this.f49463c;
                    if (i != 0) {
                        setSmallIcon(i);
                    } else {
                        throw new IllegalArgumentException("icon id is not set !");
                    }
                }
                int i2 = this.f49464d;
                if (i2 != -1) {
                    this.f49465e = m73826a(this.f49463c, i2);
                } else if (C20229c.m73869a().mo68473d() != -1) {
                    this.f49465e = m73826a(this.f49463c, C20229c.m73869a().mo68473d());
                    setColor(C20229c.m73869a().mo68473d());
                } else {
                    this.f49465e = BitmapFactory.decodeResource(this.f49461a.getResources(), this.f49463c);
                }
                if (TextUtils.isEmpty(this.f49462b)) {
                    if (!TextUtils.isEmpty(C20229c.m73869a().mo68471b())) {
                        this.f49462b = C20229c.m73869a().mo68471b();
                    } else {
                        try {
                            packageInfo = this.f49461a.getPackageManager().getPackageInfo(this.f49461a.getPackageName(), 0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        try {
                            this.f49462b = this.f49461a.getResources().getString(packageInfo.applicationInfo.labelRes);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (TextUtils.isEmpty(this.f49462b)) {
                        throw new IllegalArgumentException("appName id is not set !");
                    }
                }
                if (this.f49459B != null) {
                    m73828b();
                }
                if (this.f49469i == null) {
                    this.f49468h = NotificationStyle.NORMAL;
                } else if (C20228c.m73857a().mo68462b()) {
                    int a = C20226a.m73855a(this.f49461a, 36.0f);
                    this.f49469i = Bitmap.createScaledBitmap(this.f49469i, a, a, true);
                }
                if (!this.f49481u) {
                    this.f49482v = -1;
                }
                return new C20223b(this);
            }
            throw new IllegalArgumentException("content is empty!");
        }

        /* renamed from: a */
        public C20225a mo68445a(boolean z) {
            this.f49471k = z;
            return this;
        }

        /* renamed from: b */
        private void m73828b() {
            NotificationStyle notificationStyle;
            if (this.f49459B.f49380k == NotificationStyle.SMALL_PICTURE.styleIndex) {
                notificationStyle = NotificationStyle.SMALL_PICTURE;
            } else {
                notificationStyle = NotificationStyle.NORMAL;
            }
            mo68441a(notificationStyle);
            mo68445a(this.f49459B.f49372c);
            mo68447b(this.f49459B.f49373d);
            mo68459g(this.f49459B.f49388s);
            mo68452d(this.f49459B.f49374e);
            mo68454e(this.f49459B.f49375f);
            mo68456f(this.f49459B.f49376g);
            mo68453d(this.f49459B.f49381l);
            mo68455e(this.f49459B.f49382m);
            mo68450c(this.f49459B.f49383n);
            mo68458g(this.f49459B.f49384o);
            mo68460h(this.f49459B.f49385p);
            mo68461i(this.f49459B.f49386q);
            mo68436a(this.f49459B.f49387r);
            mo68449b(this.f49459B.f49377h);
            this.f49460C = this.f49459B.f49379j;
            mo68451c(this.f49459B.f49378i);
        }

        /* renamed from: a */
        public C20225a mo68436a(double d) {
            this.f49486z = d;
            return this;
        }

        /* renamed from: b */
        public C20225a mo68447b(int i) {
            this.f49472l = i;
            return this;
        }

        /* renamed from: c */
        public C20225a mo68450c(int i) {
            this.f49482v = i;
            return this;
        }

        /* renamed from: d */
        public C20225a mo68452d(int i) {
            this.f49474n = i;
            return this;
        }

        /* renamed from: e */
        public C20225a mo68454e(int i) {
            this.f49475o = i;
            return this;
        }

        /* renamed from: f */
        public C20225a mo68456f(int i) {
            this.f49476p = i;
            return this;
        }

        /* renamed from: g */
        public C20225a mo68458g(int i) {
            this.f49483w = i;
            return this;
        }

        /* renamed from: h */
        public C20225a mo68460h(int i) {
            this.f49484x = i;
            return this;
        }

        /* renamed from: i */
        public C20225a mo68461i(int i) {
            this.f49485y = i;
            return this;
        }

        /* renamed from: a */
        public C20225a setSmallIcon(int i) {
            super.setSmallIcon(i);
            this.f49463c = i;
            return this;
        }

        /* renamed from: b */
        public C20225a mo68449b(boolean z) {
            super.setOngoing(z);
            return this;
        }

        /* renamed from: d */
        public C20225a mo68453d(boolean z) {
            this.f49480t = z;
            return this;
        }

        /* renamed from: e */
        public C20225a mo68455e(boolean z) {
            this.f49481u = z;
            return this;
        }

        /* renamed from: f */
        public C20225a setShowWhen(boolean z) {
            super.setShowWhen(z);
            this.f49478r = z;
            return this;
        }

        /* renamed from: g */
        public C20225a mo68459g(boolean z) {
            this.f49473m = z;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Builder
        public NotificationCompat.Builder setColor(int i) {
            this.f49464d = i;
            return super.setColor(i);
        }

        /* renamed from: a */
        public C20225a setContentIntent(PendingIntent pendingIntent) {
            super.setContentIntent(pendingIntent);
            return this;
        }

        /* renamed from: b */
        public C20225a setContentTitle(CharSequence charSequence) {
            super.setContentTitle(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f49466f = charSequence.toString();
            }
            return this;
        }

        /* renamed from: a */
        public C20225a mo68439a(Intent intent) {
            this.f49470j = intent;
            return this;
        }

        /* renamed from: c */
        public C20225a mo68451c(boolean z) {
            this.f49479s = z;
            if (z) {
                try {
                    if (this.f49460C > 0 && Build.VERSION.SDK_INT >= 19) {
                        setPriority(2);
                        super.setWhen(System.currentTimeMillis() + TimeUnit.DAYS.toMillis((long) this.f49460C));
                        setShowWhen(false);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return this;
        }

        /* renamed from: a */
        public C20225a setLargeIcon(Bitmap bitmap) {
            super.setLargeIcon(bitmap);
            this.f49469i = bitmap;
            return this;
        }

        /* renamed from: a */
        public C20225a mo68441a(NotificationStyle notificationStyle) {
            this.f49468h = notificationStyle;
            return this;
        }

        /* renamed from: a */
        public C20225a mo68442a(PushNotificationExtra pushNotificationExtra) {
            this.f49459B = pushNotificationExtra;
            return this;
        }

        /* renamed from: a */
        public C20225a mo68443a(AbstractC20222a aVar) {
            this.f49458A = aVar;
            return this;
        }

        /* renamed from: a */
        public C20225a setContentText(CharSequence charSequence) {
            super.setContentText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f49467g = charSequence.toString();
            }
            return this;
        }

        public C20225a(Context context, String str) throws IllegalArgumentException {
            super(context, str);
            m73827a(context, str);
        }

        /* renamed from: a */
        private void m73827a(Context context, String str) {
            this.f49461a = context;
            this.f49477q = str;
            this.f49463c = 0;
            this.f49464d = -1;
            this.f49460C = 2;
            this.f49473m = false;
            this.f49472l = -1;
            this.f49474n = 0;
            this.f49475o = 0;
            this.f49476p = 0;
            this.f49482v = -1;
            this.f49483w = 0;
            this.f49484x = 0;
            this.f49486z = 1.0d;
        }

        /* renamed from: a */
        private Bitmap m73826a(int i, int i2) {
            if (Build.VERSION.SDK_INT <= 20) {
                return BitmapFactory.decodeResource(this.f49461a.getResources(), i);
            }
            Drawable drawable = this.f49461a.getResources().getDrawable(i);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (i2 != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawable.draw(new Canvas(createBitmap));
            return createBitmap;
        }
    }

    /* renamed from: a */
    private Notification m73817a() {
        RemoteViews remoteViews;
        Notification.Builder builder;
        Bitmap bitmap;
        try {
            if (this.f49439l || this.f49448u) {
                RemoteViews remoteViews2 = null;
                if (this.f49428a.contentView != null) {
                    remoteViews = this.f49428a.contentView;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        builder = new Notification.Builder(this.f49429b.getApplicationContext(), this.f49445r);
                    } else {
                        builder = new Notification.Builder(this.f49429b.getApplicationContext());
                    }
                    builder.setShowWhen(this.f49446s);
                    builder.setSmallIcon(this.f49431d);
                    builder.setColor(this.f49438k);
                    builder.setContentTitle(this.f49433f);
                    builder.setContentText(this.f49434g);
                    if (this.f49435h == NotificationStyle.SMALL_PICTURE && (bitmap = this.f49436i) != null) {
                        builder.setLargeIcon(bitmap);
                    }
                    remoteViews = builder.createContentView();
                } else {
                    remoteViews = null;
                }
                if (remoteViews != null && Build.VERSION.SDK_INT >= 7) {
                    View apply = remoteViews.apply(this.f49429b.getApplicationContext(), new FrameLayout(this.f49429b.getApplicationContext()));
                    this.f49426C = remoteViews.apply(this.f49429b.getApplicationContext(), new FrameLayout(this.f49429b.getApplicationContext()));
                    if (C20228c.m73857a().mo68462b()) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            remoteViews2 = m73818a(apply);
                            m73820a(remoteViews2, apply);
                            this.f49426C = remoteViews2.apply(this.f49429b.getApplicationContext(), new FrameLayout(this.f49429b.getApplicationContext()));
                        }
                    } else if (this.f49439l) {
                        if (this.f49441n) {
                            ArrayList<Integer> arrayList = new ArrayList();
                            m73819a(apply, arrayList);
                            for (Integer num : arrayList) {
                                remoteViews.setTextColor(num.intValue(), -16777216);
                            }
                        }
                        m73820a(remoteViews, apply);
                        remoteViews.setInt(apply.getId(), "setBackgroundColor", this.f49440m);
                        remoteViews.reapply(this.f49429b.getApplicationContext(), apply);
                        if (C59436a.m230730a(C59436a.f147555g)) {
                            remoteViews2 = new RemoteViews(this.f49429b.getPackageName(), (int) R.layout.highlight_notification_parent);
                            remoteViews2.setInt(R.id.push_inner_layout, "setBackgroundColor", this.f49440m);
                            remoteViews2.addView(R.id.push_parent_layout, remoteViews);
                        } else {
                            remoteViews2 = remoteViews;
                        }
                    }
                    if (this.f49439l && remoteViews2 != null) {
                        this.f49428a.contentView = remoteViews2;
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f49428a.bigContentView = remoteViews2;
                        }
                    }
                    return m73822b();
                }
            }
            return m73822b();
        } catch (Throwable unused) {
            return m73822b();
        }
    }

    public C20223b(C20225a aVar) {
        this.f49429b = aVar.f49461a;
        this.f49430c = aVar.f49462b;
        this.f49431d = aVar.f49463c;
        this.f49433f = aVar.f49466f;
        this.f49434g = aVar.f49467g;
        this.f49435h = aVar.f49468h;
        this.f49436i = aVar.f49469i;
        this.f49437j = aVar.f49470j;
        this.f49439l = aVar.f49471k;
        this.f49440m = aVar.f49472l;
        this.f49441n = aVar.f49473m;
        this.f49442o = aVar.f49474n;
        this.f49443p = aVar.f49475o;
        this.f49444q = aVar.f49476p;
        this.f49445r = aVar.f49477q;
        this.f49446s = aVar.f49478r;
        this.f49447t = aVar.f49479s;
        this.f49448u = aVar.f49480t;
        this.f49449v = aVar.f49481u;
        this.f49450w = aVar.f49482v;
        this.f49451x = aVar.f49483w;
        this.f49452y = aVar.f49484x;
        this.f49453z = aVar.f49485y;
        this.f49424A = aVar.f49486z;
        this.f49425B = aVar.f49458A;
        this.f49432e = aVar.f49465e;
        this.f49438k = aVar.f49464d;
        this.f49428a = aVar.build();
    }

    /* renamed from: a */
    private RemoteViews m73818a(View view) {
        int i;
        if (view == null) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.f49429b.getPackageName(), (int) R.layout.notification_style_layout_xm);
        remoteViews.setInt(R.id.push_notification_style_root_layout, "setBackgroundColor", this.f49440m);
        remoteViews.setInt(R.id.push_inner_layout, "setBackgroundColor", this.f49440m);
        TextView textView = (TextView) view.findViewById(Resources.getSystem().getIdentifier("title", "id", "android"));
        int i2 = this.f49443p;
        if (i2 == 0) {
            i2 = textView.getCurrentTextColor();
        }
        remoteViews.setTextColor(R.id.push_notification_title, i2);
        remoteViews.setTextViewTextSize(R.id.push_notification_title, 0, textView.getTextSize());
        remoteViews.setTextViewText(R.id.push_notification_title, this.f49433f);
        TextView textView2 = (TextView) view.findViewById(Resources.getSystem().getIdentifier("text", "id", "android"));
        int i3 = this.f49444q;
        if (i3 == 0) {
            i3 = textView2.getCurrentTextColor();
        }
        remoteViews.setTextColor(R.id.push_notification_content, i3);
        remoteViews.setTextViewTextSize(R.id.push_notification_content, 0, textView2.getTextSize());
        remoteViews.setTextViewText(R.id.push_notification_content, this.f49434g);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
        if (this.f49436i == null || this.f49435h != NotificationStyle.SMALL_PICTURE) {
            if (C20228c.m73857a().mo68463c()) {
                int i4 = layoutParams.topMargin;
                int i5 = layoutParams.topMargin;
                i = R.id.push_notification_small_picture;
                remoteViews.setViewPadding(R.id.push_notification_small_icon, i4, i5, 0, 0);
                int a = C20226a.m73855a(this.f49429b, 26.0f);
                this.f49432e = Bitmap.createScaledBitmap(this.f49432e, a, a, true);
                remoteViews.setInt(R.id.parent_push_notification_small_icon, "setGravity", 8388611);
            } else {
                i = R.id.push_notification_small_picture;
                int a2 = C20226a.m73855a(this.f49429b, 36.0f);
                this.f49432e = Bitmap.createScaledBitmap(this.f49432e, a2, a2, true);
                int a3 = C20226a.m73855a(this.f49429b, 4.0f);
                remoteViews.setViewPadding(R.id.push_notification_small_icon, a3, a3, a3, a3);
            }
            remoteViews.setBitmap(R.id.push_notification_small_icon, "setImageBitmap", this.f49432e);
            remoteViews.setViewVisibility(i, 8);
        } else if (C20228c.m73857a().mo68463c()) {
            remoteViews.setViewPadding(R.id.push_notification_small_icon, layoutParams.topMargin, layoutParams.topMargin, 0, 0);
            remoteViews.setBitmap(R.id.push_notification_small_picture, "setImageBitmap", this.f49436i);
            remoteViews.setViewVisibility(R.id.push_notification_small_picture, 0);
            int a4 = C20226a.m73855a(this.f49429b, 26.0f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f49432e, a4, a4, true);
            this.f49432e = createScaledBitmap;
            remoteViews.setBitmap(R.id.push_notification_small_icon, "setImageBitmap", createScaledBitmap);
            remoteViews.setInt(R.id.parent_push_notification_small_icon, "setGravity", 8388611);
        } else {
            remoteViews.setBitmap(R.id.push_notification_small_icon, "setImageBitmap", this.f49436i);
            int a5 = C20226a.m73855a(this.f49429b, 4.0f);
            remoteViews.setViewPadding(R.id.push_notification_small_icon, a5, a5, a5, a5);
            remoteViews.setViewVisibility(R.id.push_notification_small_picture, 8);
        }
        return remoteViews;
    }

    /* renamed from: a */
    private void m73819a(View view, List<Integer> list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    m73819a(childAt, list);
                }
            }
        } else if (view instanceof TextView) {
            list.add(Integer.valueOf(view.getId()));
        }
    }

    /* renamed from: a */
    private void m73820a(RemoteViews remoteViews, View view) {
        if (this.f49442o != 0) {
            if (!C59436a.m230730a(C59436a.f147555g)) {
                m73821a(remoteViews, "app_name_text", "id", "android", this.f49442o, view);
                m73821a(remoteViews, "time_divider", "id", "android", this.f49442o, view);
                m73821a(remoteViews, "time", "id", "android", this.f49442o, view);
            } else if (this.f49447t) {
                m73821a(remoteViews, "sub_time_divider", "id", "vivo", 0, view);
                m73821a(remoteViews, "sub_time", "id", "vivo", 0, view);
            } else {
                m73821a(remoteViews, "sub_time_divider", "id", "vivo", this.f49442o, view);
                m73821a(remoteViews, "sub_time", "id", "vivo", this.f49442o, view);
            }
        }
        int i = this.f49443p;
        if (i != 0) {
            m73821a(remoteViews, "title", "id", "android", i, view);
        }
        int i2 = this.f49444q;
        if (i2 != 0) {
            m73821a(remoteViews, "text", "id", "android", i2, view);
        }
    }

    /* renamed from: a */
    public void mo68434a(String str, int i) {
        Notification a = m73817a();
        NotificationManager notificationManager = (NotificationManager) this.f49429b.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 5) {
            notificationManager.notify(str, i, a);
        } else {
            notificationManager.notify(i, a);
        }
        m73823b(this.f49426C, str, i);
    }

    /* renamed from: b */
    private void m73823b(final View view, final String str, final int i) {
        if (this.f49448u && view != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f49427D.post(new Runnable() {
                    /* class com.bytedance.notification.C20223b.RunnableC202241 */

                    public void run() {
                        C20223b.this.mo68433a(view, str, i);
                    }
                });
            } else {
                mo68433a(view, str, i);
            }
        }
    }

    /* renamed from: a */
    public void mo68433a(View view, String str, int i) {
        new C20218a.C20221a(this.f49429b).mo68423a(this.f49430c).mo68424a(this.f49449v).mo68420a(this.f49432e).mo68419a(this.f49437j).mo68426b(this.f49450w).mo68428c(this.f49451x).mo68429d(this.f49452y).mo68430e(this.f49453z).mo68417a(this.f49424A).mo68422a(this.f49425B).mo68421a(view).mo68427b(str).mo68418a(i).mo68425a().mo68414b();
    }

    /* renamed from: a */
    private void m73821a(RemoteViews remoteViews, String str, String str2, String str3, int i, View view) {
        int identifier = Resources.getSystem().getIdentifier(str, str2, str3);
        if (view.findViewById(identifier) instanceof TextView) {
            remoteViews.setTextColor(identifier, i);
        }
    }
}
