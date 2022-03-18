package com.ss.android.photoeditor.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59613d;

/* renamed from: com.ss.android.photoeditor.text.a */
public class C59805a {

    /* renamed from: a */
    public float f148649a;

    /* renamed from: b */
    public PointF f148650b;

    /* renamed from: c */
    public int f148651c;

    /* renamed from: d */
    public boolean f148652d;

    /* renamed from: e */
    private int f148653e;

    /* renamed from: f */
    private int f148654f;

    /* renamed from: g */
    private String f148655g;

    /* renamed from: h */
    private Context f148656h;

    /* renamed from: i */
    private int f148657i;

    /* renamed from: j */
    private int f148658j;

    /* renamed from: k */
    private TextEditorDrawView f148659k;

    /* renamed from: l */
    private Matrix f148660l;

    /* renamed from: m */
    private Matrix f148661m;

    /* renamed from: n */
    private Bitmap f148662n;

    /* renamed from: o */
    private Region f148663o;

    /* renamed from: p */
    private Bitmap f148664p;

    /* renamed from: q */
    private boolean f148665q;

    /* renamed from: r */
    private Bitmap f148666r;

    /* renamed from: s */
    private boolean f148667s;

    /* renamed from: t */
    private PointF f148668t;

    /* renamed from: u */
    private PointF f148669u;

    /* renamed from: v */
    private PointF f148670v;

    /* renamed from: w */
    private PointF f148671w;

    /* renamed from: a */
    public int mo203572a() {
        return this.f148657i;
    }

    /* renamed from: b */
    public String mo203581b() {
        return this.f148655g;
    }

    /* renamed from: a */
    public boolean mo203580a(float f, float f2) {
        RectF rectF = new RectF();
        Path path = new Path();
        path.moveTo(this.f148668t.x, this.f148668t.y);
        path.lineTo(this.f148669u.x, this.f148669u.y);
        path.lineTo(this.f148670v.x, this.f148670v.y);
        path.lineTo(this.f148671w.x, this.f148671w.y);
        path.close();
        path.computeBounds(rectF, true);
        Region region = new Region();
        this.f148663o = region;
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return this.f148663o.contains((int) f, (int) f2);
    }

    /* renamed from: f */
    private Matrix m231990f() {
        return m231983a(this.f148664p, this.f148650b.x + (((float) this.f148653e) * this.f148649a), this.f148650b.y + (((float) this.f148654f) * this.f148649a));
    }

    /* renamed from: g */
    private Matrix m231991g() {
        return m231983a(this.f148662n, this.f148650b.x - (((float) this.f148653e) * this.f148649a), this.f148650b.y - (((float) this.f148654f) * this.f148649a));
    }

    /* renamed from: e */
    private Matrix m231989e() {
        this.f148660l.reset();
        this.f148660l.postTranslate(this.f148650b.x - ((float) this.f148653e), this.f148650b.y - ((float) this.f148654f));
        Matrix matrix = this.f148660l;
        float f = this.f148649a;
        matrix.postScale(f, f, this.f148650b.x, this.f148650b.y);
        this.f148660l.postRotate((float) this.f148651c, this.f148650b.x, this.f148650b.y);
        return this.f148660l;
    }

    /* renamed from: c */
    private void m231985c() {
        RectF rectF = new RectF(this.f148650b.x - ((float) this.f148653e), this.f148650b.y - ((float) this.f148654f), this.f148650b.x + ((float) this.f148653e), this.f148650b.y + ((float) this.f148654f));
        C59610b.m231211a(rectF, this.f148650b.x, this.f148650b.y, this.f148649a);
        this.f148668t = new PointF(rectF.left, rectF.top);
        this.f148669u = new PointF(rectF.right, rectF.top);
        this.f148670v = new PointF(rectF.right, rectF.bottom);
        this.f148671w = new PointF(rectF.left, rectF.bottom);
        C59610b.m231210a(this.f148668t, this.f148650b.x, this.f148650b.y, this.f148651c);
        C59610b.m231210a(this.f148669u, this.f148650b.x, this.f148650b.y, this.f148651c);
        C59610b.m231210a(this.f148670v, this.f148650b.x, this.f148650b.y, this.f148651c);
        C59610b.m231210a(this.f148671w, this.f148650b.x, this.f148650b.y, this.f148651c);
    }

    /* renamed from: d */
    private void m231987d() {
        TextView textView = new TextView(this.f148656h);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextSize(1, (float) C59613d.m231216a(this.f148658j));
        textView.setTextColor(this.f148657i);
        textView.setText(this.f148655g);
        textView.setShadowLayer(mo203571a(1.5f), -mo203571a(BitmapDescriptorFactory.HUE_RED), mo203571a(0.5f), 855638016);
        textView.setPadding(29, 29, 29, 29);
        textView.measure(View.MeasureSpec.makeMeasureSpec((int) this.f148659k.getImageRect().width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int) this.f148659k.getImageRect().height(), Integer.MIN_VALUE));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        textView.requestLayout();
        Bitmap bitmap = this.f148666r;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f148666r.recycle();
        }
        this.f148666r = Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        textView.draw(new Canvas(this.f148666r));
    }

    /* renamed from: b */
    private void m231984b(Canvas canvas) {
        canvas.drawBitmap(this.f148662n, m231990f(), null);
    }

    /* renamed from: c */
    private void m231986c(Canvas canvas) {
        Bitmap bitmap = this.f148664p;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, m231991g(), null);
        }
    }

    /* renamed from: a */
    public float mo203571a(float f) {
        return (f * Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }

    public C59805a(C59805a aVar) {
        this(aVar.f148659k, (int) aVar.f148650b.x, (int) aVar.f148650b.y, aVar.f148655g, aVar.f148649a, aVar.f148651c, aVar.f148657i);
    }

    /* renamed from: d */
    private void m231988d(Canvas canvas) {
        canvas.save();
        RectF rectF = new RectF(this.f148650b.x - (((float) this.f148653e) * this.f148649a), this.f148650b.y - (((float) this.f148654f) * this.f148649a), this.f148650b.x + (((float) this.f148653e) * this.f148649a), this.f148650b.y + (((float) this.f148654f) * this.f148649a));
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{14.0f, 14.0f}, BitmapDescriptorFactory.HUE_RED));
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(((float) C59613d.m231216a(1)) * this.f148649a);
        canvas.rotate((float) this.f148651c, this.f148650b.x, this.f148650b.y);
        canvas.drawRoundRect(rectF, ((float) C59613d.m231216a(3)) * this.f148649a, ((float) C59613d.m231216a(3)) * this.f148649a, paint);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo203576a(int i) {
        if (!this.f148667s && this.f148657i != i) {
            this.f148657i = i;
            m231987d();
        }
    }

    /* renamed from: a */
    public void mo203577a(Canvas canvas) {
        canvas.drawBitmap(this.f148666r, m231989e(), null);
        if (this.f148665q) {
            m231988d(canvas);
            m231984b(canvas);
            m231986c(canvas);
        }
    }

    /* renamed from: a */
    public void mo203579a(boolean z) {
        if (this.f148665q != z) {
            this.f148665q = z;
            m231987d();
        }
    }

    /* renamed from: b */
    public boolean mo203582b(float f, float f2) {
        float f3 = this.f148649a * 10.0f;
        return new RectF(this.f148670v.x - C59613d.m231215a(f3), this.f148670v.y - C59613d.m231215a(f3), this.f148670v.x + C59613d.m231215a(f3), this.f148670v.y + C59613d.m231215a(f3)).contains(f, f2);
    }

    /* renamed from: c */
    public boolean mo203583c(float f, float f2) {
        float f3 = this.f148649a * 10.0f;
        return new RectF(this.f148668t.x - C59613d.m231215a(f3), this.f148668t.y - C59613d.m231215a(f3), this.f148668t.x + C59613d.m231215a(f3), this.f148668t.y + C59613d.m231215a(f3)).contains(f, f2);
    }

    /* renamed from: a */
    public void mo203578a(String str, int i) {
        if (!this.f148667s) {
            this.f148652d = true;
            this.f148655g = str;
            this.f148657i = i;
            m231987d();
            int width = this.f148666r.getWidth();
            int height = this.f148666r.getHeight();
            this.f148653e = width / 2;
            this.f148654f = height / 2;
            this.f148668t = new PointF(this.f148650b.x - ((float) this.f148653e), this.f148650b.y - ((float) this.f148654f));
            this.f148669u = new PointF(this.f148650b.x + ((float) this.f148653e), this.f148650b.y - ((float) this.f148654f));
            this.f148670v = new PointF(this.f148650b.x + ((float) this.f148653e), this.f148650b.y + ((float) this.f148654f));
            this.f148671w = new PointF(this.f148650b.x - ((float) this.f148653e), this.f148650b.y + ((float) this.f148654f));
            m231985c();
        }
    }

    /* renamed from: a */
    public void mo203574a(float f, float f2, int i) {
        C59610b.m231210a(this.f148650b, f, f2, i);
        this.f148651c += i;
        m231985c();
    }

    /* renamed from: a */
    public void mo203573a(float f, float f2, float f3) {
        if (!this.f148667s) {
            PointF pointF = this.f148650b;
            pointF.x = ((pointF.x - f) * f3) + f;
            PointF pointF2 = this.f148650b;
            pointF2.y = ((pointF2.y - f2) * f3) + f2;
            this.f148649a *= f3;
            m231985c();
        }
    }

    /* renamed from: a */
    private Matrix m231983a(Bitmap bitmap, float f, float f2) {
        float a = C59613d.m231215a(this.f148649a * 16.0f) / ((float) bitmap.getWidth());
        this.f148661m.reset();
        this.f148661m.postScale(a, a);
        this.f148661m.postTranslate(f - (C59613d.m231215a(this.f148649a * 16.0f) / 2.0f), f2 - (C59613d.m231215a(this.f148649a * 16.0f) / 2.0f));
        this.f148661m.postRotate((float) this.f148651c, this.f148650b.x, this.f148650b.y);
        return this.f148661m;
    }

    /* renamed from: a */
    public void mo203575a(float f, float f2, int i, float f3) {
        if (!this.f148667s) {
            this.f148650b.x = f;
            this.f148650b.y = f2;
            this.f148651c = i;
            this.f148649a = f3;
            this.f148650b = new PointF(f, f2);
            m231985c();
        }
    }

    public C59805a(TextEditorDrawView textEditorDrawView, int i, int i2, String str, float f, int i3, int i4) {
        this.f148649a = 2.5f;
        this.f148658j = 8;
        this.f148659k = textEditorDrawView;
        this.f148656h = textEditorDrawView.getContext();
        this.f148655g = str;
        this.f148657i = i4;
        this.f148649a = f;
        this.f148651c = i3;
        this.f148660l = new Matrix();
        this.f148661m = new Matrix();
        this.f148650b = new PointF((float) i, (float) i2);
        m231987d();
        int width = this.f148666r.getWidth();
        int height = this.f148666r.getHeight();
        this.f148653e = width / 2;
        this.f148654f = height / 2;
        Log.m165379d("TextSticker", "halfHeight = " + this.f148654f);
        Log.m165379d("TextSticker", "halfWidth = " + this.f148653e);
        this.f148668t = new PointF((float) (i - this.f148653e), (float) (i2 - this.f148654f));
        this.f148669u = new PointF((float) (this.f148653e + i), (float) (i2 - this.f148654f));
        this.f148670v = new PointF((float) (this.f148653e + i), (float) (this.f148654f + i2));
        this.f148671w = new PointF((float) (i - this.f148653e), (float) (i2 + this.f148654f));
        this.f148662n = ((BitmapDrawable) textEditorDrawView.getResources().getDrawable(R.drawable.photo_editor_text_editing_change)).getBitmap();
        this.f148664p = ((BitmapDrawable) textEditorDrawView.getResources().getDrawable(R.drawable.photo_editor_text_delete)).getBitmap();
        m231985c();
    }
}
