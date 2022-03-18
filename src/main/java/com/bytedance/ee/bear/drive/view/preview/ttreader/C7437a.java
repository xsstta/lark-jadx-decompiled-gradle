package com.bytedance.ee.bear.drive.view.preview.ttreader;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.a */
public class C7437a {

    /* renamed from: a */
    public AbstractC7440b f20038a;

    /* renamed from: b */
    public long f20039b;

    /* renamed from: c */
    private long f20040c;

    /* renamed from: d */
    private PointF f20041d;

    /* renamed from: e */
    private PointF f20042e;

    /* renamed from: f */
    private Handler f20043f = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ee.bear.drive.view.preview.ttreader.C7437a.HandlerC74381 */

        public void handleMessage(Message message) {
            if (C7437a.this.f20038a != null) {
                int i = message.what;
                if (i == 0) {
                    C7437a.this.f20038a.mo29034a();
                } else if (i == 1) {
                    C7437a.this.f20039b = System.currentTimeMillis();
                    C7437a.this.f20038a.mo29035b();
                } else if (i == 2) {
                    C7437a.this.f20038a.mo29036c();
                }
            }
        }
    };

    /* renamed from: g */
    private boolean f20044g = false;

    /* renamed from: h */
    private C7439a f20045h = new C7439a();

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.a$b */
    public interface AbstractC7440b {
        /* renamed from: a */
        void mo29034a();

        /* renamed from: b */
        void mo29035b();

        /* renamed from: c */
        void mo29036c();
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.a$a */
    public static class C7439a {

        /* renamed from: a */
        public boolean f20047a;

        /* renamed from: b */
        public boolean f20048b;

        /* renamed from: c */
        public boolean f20049c;

        public C7439a() {
            this.f20047a = true;
            this.f20048b = true;
            this.f20049c = true;
        }

        public C7439a(boolean z, boolean z2, boolean z3) {
            this.f20047a = z;
            this.f20048b = z2;
            this.f20049c = z3;
        }
    }

    /* renamed from: a */
    public void mo29028a() {
        this.f20043f.removeMessages(0);
        this.f20043f.sendEmptyMessageDelayed(0, 150);
    }

    /* renamed from: b */
    public void mo29032b() {
        if (System.currentTimeMillis() - this.f20039b >= 150) {
            this.f20043f.removeMessages(2);
            this.f20043f.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public void mo29030a(C7439a aVar) {
        this.f20045h = aVar;
    }

    /* renamed from: a */
    public void mo29031a(AbstractC7440b bVar) {
        this.f20038a = bVar;
    }

    /* renamed from: a */
    private void m29755a(long j) {
        if (this.f20038a != null) {
            this.f20043f.removeMessages(0);
            this.f20043f.removeMessages(1);
            this.f20043f.removeMessages(2);
            PointF pointF = this.f20041d;
            if (pointF != null && this.f20042e != null) {
                float abs = Math.abs(pointF.x - this.f20042e.x);
                float abs2 = Math.abs(this.f20041d.y - this.f20042e.y);
                if (j <= 150 && Math.max(abs, abs2) <= 10.0f && this.f20045h.f20047a) {
                    this.f20043f.sendEmptyMessageDelayed(0, 150);
                }
            }
        }
    }

    /* renamed from: b */
    private void m29756b(MotionEvent motionEvent) {
        if (this.f20038a != null && !this.f20044g) {
            this.f20043f.removeMessages(0);
            this.f20043f.removeMessages(1);
            this.f20043f.removeMessages(2);
            PointF pointF = this.f20041d;
            if (pointF != null) {
                float y = pointF.y - motionEvent.getY();
                if (Math.abs(y) > ((float) C13749l.m55738a(20))) {
                    this.f20044g = true;
                    if (y > BitmapDescriptorFactory.HUE_RED) {
                        if (this.f20045h.f20048b) {
                            this.f20043f.sendEmptyMessage(1);
                        }
                    } else if (this.f20045h.f20049c) {
                        this.f20043f.sendEmptyMessage(2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29029a(MotionEvent motionEvent) {
        C13479a.m54772d("TTClickHelper", "onInterceptTouchEvent: " + motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20044g = false;
            this.f20040c = System.currentTimeMillis();
            this.f20041d = new PointF(motionEvent.getX(), motionEvent.getY());
        } else if (action == 1) {
            this.f20042e = new PointF(motionEvent.getX(), motionEvent.getY());
            m29755a(System.currentTimeMillis() - this.f20040c);
        } else if (action == 2) {
            m29756b(motionEvent);
        }
    }
}
