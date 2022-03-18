package com.bytedance.ee.bear.drive.biz.comment;

import android.os.Handler;
import com.bytedance.apm.trace.p155a.C3069b;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.d */
public class C6367d {

    /* renamed from: a */
    public float f17632a;

    /* renamed from: b */
    public float f17633b;

    /* renamed from: c */
    public boolean f17634c;

    /* renamed from: d */
    public boolean f17635d;

    /* renamed from: e */
    public AbstractC6370b f17636e;

    /* renamed from: f */
    public CommentRectLayout f17637f;

    /* renamed from: g */
    public final Handler f17638g = new Handler();

    /* renamed from: h */
    public Runnable f17639h = new Runnable() {
        /* class com.bytedance.ee.bear.drive.biz.comment.C6367d.RunnableC63681 */

        public void run() {
            C6367d.this.f17638g.removeCallbacks(C6367d.this.f17640i);
            C6367d.this.f17634c = true;
            if (C6367d.this.f17636e != null) {
                C6367d.this.f17636e.mo25583a(C6367d.this.f17632a, C6367d.this.f17633b);
            }
        }
    };

    /* renamed from: i */
    public RunnableC6369a f17640i = new RunnableC6369a();

    /* renamed from: j */
    private boolean f17641j;

    /* renamed from: k */
    private long f17642k;

    /* renamed from: l */
    private C3069b f17643l = new C3069b("bear_drive_image_scale");

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.d$b */
    public interface AbstractC6370b {
        /* renamed from: a */
        void mo25583a(float f, float f2);

        /* renamed from: a */
        void mo25584a(CommentRectF commentRectF);
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.d$a */
    private class RunnableC6369a implements Runnable {

        /* renamed from: b */
        private CommentRectF f17646b;

        public void run() {
            if (!C6367d.this.f17635d) {
                C6367d.this.f17638g.removeCallbacks(C6367d.this.f17639h);
                C6367d.this.f17634c = true;
                if (C6367d.this.f17636e != null) {
                    if (this.f17646b != null) {
                        C6367d.this.f17637f.mo25485a(this.f17646b.mo25555a());
                    }
                    C6367d.this.f17636e.mo25584a(this.f17646b);
                }
            }
        }

        /* renamed from: a */
        public void mo25581a(CommentRectF commentRectF) {
            this.f17646b = commentRectF;
        }

        private RunnableC6369a() {
        }
    }

    /* renamed from: a */
    public void mo25578a(AbstractC6370b bVar) {
        this.f17636e = bVar;
    }

    public C6367d(CommentRectLayout commentRectLayout) {
        this.f17637f = commentRectLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r11 != 3) goto L_0x00e9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25579a(android.view.MotionEvent r11, com.bytedance.ee.bear.drive.view.preview.imageviewer.AbstractC7361c r12) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.comment.C6367d.mo25579a(android.view.MotionEvent, com.bytedance.ee.bear.drive.view.preview.imageviewer.c):boolean");
    }
}
