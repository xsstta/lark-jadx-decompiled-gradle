package com.ss.android.lark.eetroublecapture;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.eetroublebase.C36960a;
import com.ss.android.lark.eetroublebase.Log;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.eetroublecapture.m */
public class C36993m implements AbstractC36989i {

    /* renamed from: a */
    private static final String[] f95093a = {"_data", "width", "height"};

    /* renamed from: b */
    private static final String[] f95094b = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: c */
    private static float f95095c;

    /* renamed from: d */
    private static float f95096d;

    /* renamed from: e */
    private static float f95097e;

    /* renamed from: f */
    private ContentResolver f95098f;

    /* renamed from: g */
    private C36995a f95099g = new C36995a();

    /* renamed from: h */
    private C36990j f95100h;

    /* renamed from: i */
    private C36990j f95101i;

    /* renamed from: j */
    private long f95102j = 0;

    /* renamed from: k */
    private long f95103k = 0;

    /* renamed from: l */
    private long f95104l = 0;

    /* renamed from: m */
    private Context f95105m;

    /* renamed from: n */
    private AbstractC36974c f95106n = null;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.eetroublecapture.m$a */
    public static class C36995a implements AbstractC36992l {

        /* renamed from: a */
        private List<AbstractC36992l> f95107a;

        /* renamed from: b */
        public boolean mo136511b() {
            return this.f95107a.isEmpty();
        }

        private C36995a() {
            this.f95107a = new ArrayList();
        }

        @Override // com.ss.android.lark.eetroublecapture.AbstractC36992l
        /* renamed from: a */
        public void mo136471a() {
            for (AbstractC36992l lVar : this.f95107a) {
                lVar.mo136471a();
            }
        }

        /* renamed from: c */
        public boolean mo136512c(AbstractC36992l lVar) {
            return this.f95107a.contains(lVar);
        }

        /* renamed from: b */
        public int mo136510b(AbstractC36992l lVar) {
            this.f95107a.remove(lVar);
            return this.f95107a.size();
        }

        /* renamed from: a */
        public int mo136509a(AbstractC36992l lVar) {
            if (lVar != null && !this.f95107a.contains(lVar)) {
                this.f95107a.add(lVar);
            }
            return this.f95107a.size();
        }
    }

    /* renamed from: a */
    private boolean m145995a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f95103k;
        if (j == 0 || elapsedRealtime - j > ((long) C36960a.m145914a().mo136419e())) {
            this.f95103k = elapsedRealtime;
            this.f95104l = 1;
            return true;
        } else if (this.f95104l >= ((long) C36960a.m145914a().mo136420f())) {
            return false;
        } else {
            this.f95104l++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo136506a(long j) {
        this.f95102j = j;
    }

    /* renamed from: b */
    public synchronized void mo136508b(AbstractC36992l lVar) {
        if (this.f95099g.mo136512c(lVar) && this.f95099g.mo136510b(lVar) == 0) {
            this.f95098f.unregisterContentObserver(this.f95100h);
            this.f95098f.unregisterContentObserver(this.f95101i);
        }
    }

    /* renamed from: a */
    private boolean m145997a(Context context) {
        try {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(LocationRequest.PRIORITY_HD_ACCURACY);
            if (runningServices == null) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo.process.equals("com.android.systemui:screenshot")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.m145906a("TroubleCapture: checkScreenshotProcess", th);
            return false;
        }
    }

    /* renamed from: b */
    private void m145999b(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = this.f95098f.query(uri, f95093a, null, null, "_id desc limit 1");
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    if (m145998a(cursor.getString(cursor.getColumnIndex("_data")), cursor.getInt(cursor.getColumnIndex("width")), cursor.getInt(cursor.getColumnIndex("height")))) {
                        this.f95099g.mo136471a();
                    }
                    if (cursor == null || cursor.isClosed()) {
                        return;
                    }
                    cursor.close();
                    return;
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (0 == 0 || cursor.isClosed()) {
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36989i
    /* renamed from: a */
    public void mo136502a(Uri uri) {
        boolean z;
        Activity activity;
        if (!this.f95099g.mo136511b()) {
            AbstractC36974c cVar = this.f95106n;
            if (cVar == null || cVar.mo136463a() == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Log.m145905a("TroubleCapture: media image changed but activity in background");
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f95102j;
            Log.m145905a("TroubleCapture: media image gap = " + elapsedRealtime);
            if (elapsedRealtime < 6000) {
                Log.m145905a("TroubleCapture: media image changed but after outter trigger closly");
                return;
            }
            Log.m145905a("TroubleCapture: media image changed once");
            try {
                AbstractC36974c cVar2 = this.f95106n;
                if (cVar2 != null) {
                    activity = cVar2.mo136463a();
                } else {
                    activity = null;
                }
                if (activity != null && C36966c.m145951a(activity)) {
                    m145999b(uri);
                } else if (m145997a(this.f95105m)) {
                    this.f95099g.mo136471a();
                } else if (m145995a()) {
                    this.f95099g.mo136471a();
                }
            } catch (Exception e) {
                Log.m145906a("TroubleCapture: exception", e);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo136507a(AbstractC36992l lVar) {
        if (!this.f95099g.mo136512c(lVar)) {
            int a = this.f95099g.mo136509a(lVar);
            if (this.f95100h == null) {
                this.f95100h = new C36990j(C36966c.m145946a(), MediaStore.Images.Media.INTERNAL_CONTENT_URI, this);
                this.f95101i = new C36990j(C36966c.m145946a(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this);
            }
            if (a == 1) {
                this.f95098f.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f95100h);
                this.f95098f.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f95101i);
            }
        }
    }

    /* renamed from: a */
    private boolean m145996a(float f, float f2) {
        if (((double) Math.abs(f - f2)) < 0.001d) {
            return true;
        }
        return false;
    }

    public C36993m(Application application, AbstractC36974c cVar) {
        int i;
        float f;
        int i2;
        float f2;
        this.f95105m = application;
        this.f95098f = application.getContentResolver();
        this.f95106n = cVar;
        Display defaultDisplay = ((WindowManager) application.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f95097e = (float) displayMetrics.widthPixels;
        if (displayMetrics.heightPixels > displayMetrics.widthPixels) {
            f = ((float) displayMetrics.heightPixels) * 1.0f;
            i = displayMetrics.widthPixels;
        } else {
            f = ((float) displayMetrics.widthPixels) * 1.0f;
            i = displayMetrics.heightPixels;
        }
        f95095c = f / ((float) i);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        if (displayMetrics2.heightPixels > displayMetrics2.widthPixels) {
            f2 = ((float) displayMetrics2.heightPixels) * 1.0f;
            i2 = displayMetrics2.widthPixels;
        } else {
            f2 = ((float) displayMetrics2.widthPixels) * 1.0f;
            i2 = displayMetrics2.heightPixels;
        }
        f95096d = f2 / ((float) i2);
    }

    /* renamed from: a */
    private boolean m145998a(String str, int i, int i2) {
        float f;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : f95094b) {
            if (lowerCase.contains(str2)) {
                return true;
            }
        }
        if (i2 > i) {
            f = (((float) i2) * 1.0f) / ((float) i);
        } else {
            f = (((float) i) * 1.0f) / ((float) i2);
        }
        if (m145996a(f95095c, f) || m145996a(f95096d, f)) {
            return true;
        }
        if (i <= 0 || f95097e != ((float) i)) {
            return false;
        }
        return true;
    }
}
