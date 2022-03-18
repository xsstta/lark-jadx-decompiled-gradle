package com.ss.android.lark.fastqrcode.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.fastqrcode.p1834d.C37059b;

public class DefaultScanBoxView extends IScanBoxView {

    /* renamed from: A */
    private boolean f95206A;

    /* renamed from: B */
    private String f95207B;

    /* renamed from: C */
    private String f95208C;

    /* renamed from: D */
    private String f95209D;

    /* renamed from: E */
    private int f95210E;

    /* renamed from: F */
    private int f95211F;

    /* renamed from: G */
    private boolean f95212G;

    /* renamed from: H */
    private int f95213H;

    /* renamed from: I */
    private boolean f95214I;

    /* renamed from: J */
    private int f95215J;

    /* renamed from: K */
    private boolean f95216K;

    /* renamed from: L */
    private boolean f95217L;

    /* renamed from: M */
    private boolean f95218M;

    /* renamed from: N */
    private Drawable f95219N;

    /* renamed from: O */
    private Bitmap f95220O;

    /* renamed from: P */
    private float f95221P;

    /* renamed from: Q */
    private float f95222Q;

    /* renamed from: R */
    private Bitmap f95223R;

    /* renamed from: S */
    private Bitmap f95224S;

    /* renamed from: T */
    private Bitmap f95225T;

    /* renamed from: U */
    private Bitmap f95226U;

    /* renamed from: V */
    private float f95227V;

    /* renamed from: W */
    private StaticLayout f95228W;

    /* renamed from: a */
    private int f95229a;
    private int aa;
    private boolean ab;

    /* renamed from: b */
    private int f95230b;

    /* renamed from: c */
    private Rect f95231c;

    /* renamed from: d */
    private float f95232d;

    /* renamed from: e */
    private float f95233e;

    /* renamed from: f */
    private Paint f95234f;

    /* renamed from: g */
    private TextPaint f95235g;

    /* renamed from: h */
    private int f95236h;

    /* renamed from: i */
    private int f95237i;

    /* renamed from: j */
    private int f95238j;

    /* renamed from: k */
    private int f95239k;

    /* renamed from: l */
    private int f95240l;

    /* renamed from: m */
    private int f95241m;

    /* renamed from: n */
    private int f95242n;

    /* renamed from: o */
    private int f95243o;

    /* renamed from: p */
    private int f95244p;

    /* renamed from: q */
    private int f95245q;

    /* renamed from: r */
    private int f95246r;

    /* renamed from: s */
    private boolean f95247s;

    /* renamed from: t */
    private Drawable f95248t;

    /* renamed from: u */
    private Bitmap f95249u;

    /* renamed from: v */
    private int f95250v;

    /* renamed from: w */
    private int f95251w;

    /* renamed from: x */
    private int f95252x;

    /* renamed from: y */
    private boolean f95253y;

    /* renamed from: z */
    private int f95254z;

    public int getAnimTime() {
        return this.f95252x;
    }

    public String getBarCodeTipText() {
        return this.f95208C;
    }

    public int getBarcodeRectHeight() {
        return this.f95242n;
    }

    public int getBorderColor() {
        return this.f95251w;
    }

    public int getBorderSize() {
        return this.f95250v;
    }

    public int getCornerColor() {
        return this.f95237i;
    }

    public int getCornerLength() {
        return this.f95238j;
    }

    public int getCornerSize() {
        return this.f95239k;
    }

    public Drawable getCustomScanLineDrawable() {
        return this.f95248t;
    }

    public float getHalfCornerSize() {
        return this.f95227V;
    }

    public boolean getIsBarcode() {
        return this.f95206A;
    }

    public int getMaskColor() {
        return this.f95236h;
    }

    public String getQRCodeTipText() {
        return this.f95207B;
    }

    public int getRectHeight() {
        return this.f95241m;
    }

    public int getRectWidth() {
        return this.f95240l;
    }

    public Bitmap getScanLineBitmap() {
        return this.f95249u;
    }

    public int getScanLineColor() {
        return this.f95245q;
    }

    public int getScanLineMargin() {
        return this.f95246r;
    }

    public int getScanLineSize() {
        return this.f95244p;
    }

    public int getTipBackgroundColor() {
        return this.f95215J;
    }

    public int getTipBackgroundRadius() {
        return this.aa;
    }

    public String getTipText() {
        return this.f95209D;
    }

    public int getTipTextColor() {
        return this.f95211F;
    }

    public int getTipTextMargin() {
        return this.f95213H;
    }

    public int getTipTextSize() {
        return this.f95210E;
    }

    public StaticLayout getTipTextSl() {
        return this.f95228W;
    }

    public int getToolbarHeight() {
        return this.f95254z;
    }

    public int getTopOffset() {
        return this.f95243o;
    }

    /* renamed from: c */
    private void m146202c() {
        int width = (getWidth() - this.f95240l) / 2;
        int i = this.f95243o;
        Rect rect = new Rect(width, i, this.f95240l + width, this.f95241m + i);
        this.f95231c = rect;
        if (this.f95206A) {
            float f = ((float) rect.left) + this.f95227V + 0.5f;
            this.f95233e = f;
            this.f95222Q = f;
            return;
        }
        float f2 = ((float) rect.top) + this.f95227V + 0.5f;
        this.f95232d = f2;
        this.f95221P = f2;
    }

    /* renamed from: a */
    private void m146197a() {
        Drawable drawable = this.f95219N;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                this.f95225T = ((BitmapDrawable) drawable).getBitmap();
            } else if (drawable instanceof LayerDrawable) {
                Bitmap createBitmap = Bitmap.createBitmap(786, 699, Bitmap.Config.ARGB_8888);
                this.f95219N.setBounds(0, 0, 786, 699);
                this.f95219N.draw(new Canvas(createBitmap));
                this.f95225T = createBitmap;
            }
        }
        if (this.f95225T == null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.qrcode_default_grid_scan_line);
            this.f95225T = decodeResource;
            this.f95225T = C37059b.m146194b(decodeResource, this.f95245q);
        }
        Bitmap a = C37059b.m146184a(this.f95225T, 90);
        this.f95226U = a;
        Bitmap a2 = C37059b.m146184a(a, 90);
        this.f95226U = a2;
        this.f95226U = C37059b.m146184a(a2, 90);
        Drawable drawable2 = this.f95248t;
        if (drawable2 != null) {
            this.f95223R = ((BitmapDrawable) drawable2).getBitmap();
        }
        if (this.f95223R == null) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.qrcode_default_scan_line);
            this.f95223R = decodeResource2;
            this.f95223R = C37059b.m146194b(decodeResource2, this.f95245q);
        }
        this.f95224S = C37059b.m146184a(this.f95223R, 90);
        this.f95243o += this.f95254z;
        this.f95227V = (((float) this.f95239k) * 1.0f) / 2.0f;
        this.f95235g.setTextSize((float) this.f95210E);
        this.f95235g.setColor(this.f95211F);
        setIsBarcode(this.f95206A);
    }

    /* renamed from: b */
    private void m146200b() {
        if (this.f95206A) {
            if (this.f95220O == null) {
                this.f95233e += (float) this.f95229a;
                int i = this.f95244p;
                Bitmap bitmap = this.f95249u;
                if (bitmap != null) {
                    i = bitmap.getWidth();
                }
                if (this.f95217L) {
                    if (this.f95233e + ((float) i) > ((float) this.f95231c.right) - this.f95227V || this.f95233e < ((float) this.f95231c.left) + this.f95227V) {
                        this.f95229a = -this.f95229a;
                    }
                } else if (this.f95233e + ((float) i) > ((float) this.f95231c.right) - this.f95227V) {
                    this.f95233e = ((float) this.f95231c.left) + this.f95227V + 0.5f;
                }
            } else {
                float f = this.f95222Q + ((float) this.f95229a);
                this.f95222Q = f;
                if (f > ((float) this.f95231c.right) - this.f95227V) {
                    this.f95222Q = ((float) this.f95231c.left) + this.f95227V + 0.5f;
                }
            }
        } else if (this.f95220O == null) {
            this.f95232d += (float) this.f95229a;
            int i2 = this.f95244p;
            Bitmap bitmap2 = this.f95249u;
            if (bitmap2 != null) {
                i2 = bitmap2.getHeight();
            }
            if (this.f95217L) {
                if (this.f95232d + ((float) i2) > ((float) this.f95231c.bottom) - this.f95227V || this.f95232d < ((float) this.f95231c.top) + this.f95227V) {
                    this.f95229a = -this.f95229a;
                }
            } else if (this.f95232d + ((float) i2) > ((float) this.f95231c.bottom) - this.f95227V) {
                this.f95232d = ((float) this.f95231c.top) + this.f95227V + 0.5f;
            }
        } else {
            float f2 = this.f95221P + ((float) this.f95229a);
            this.f95221P = f2;
            if (f2 > ((float) this.f95231c.bottom) - this.f95227V) {
                this.f95221P = ((float) this.f95231c.top) + this.f95227V + 0.5f;
            }
        }
        postInvalidateDelayed((long) this.f95230b, this.f95231c.left, this.f95231c.top, this.f95231c.right, this.f95231c.bottom);
    }

    public void setAnimTime(int i) {
        this.f95252x = i;
    }

    public void setBarCodeTipText(String str) {
        this.f95208C = str;
    }

    public void setBarcodeRectHeight(int i) {
        this.f95242n = i;
    }

    public void setBorderColor(int i) {
        this.f95251w = i;
    }

    public void setBorderSize(int i) {
        this.f95250v = i;
    }

    public void setCenterVertical(boolean z) {
        this.f95253y = z;
    }

    public void setCornerColor(int i) {
        this.f95237i = i;
    }

    public void setCornerLength(int i) {
        this.f95238j = i;
    }

    public void setCornerSize(int i) {
        this.f95239k = i;
    }

    public void setCustomScanLineDrawable(Drawable drawable) {
        this.f95248t = drawable;
    }

    public void setHalfCornerSize(float f) {
        this.f95227V = f;
    }

    public void setMaskColor(int i) {
        this.f95236h = i;
    }

    public void setOnlyDecodeScanBoxArea(boolean z) {
        this.ab = z;
    }

    public void setQRCodeTipText(String str) {
        this.f95207B = str;
    }

    public void setRectHeight(int i) {
        this.f95241m = i;
    }

    public void setRectWidth(int i) {
        this.f95240l = i;
    }

    public void setScanLineBitmap(Bitmap bitmap) {
        this.f95249u = bitmap;
    }

    public void setScanLineColor(int i) {
        this.f95245q = i;
    }

    public void setScanLineMargin(int i) {
        this.f95246r = i;
    }

    public void setScanLineReverse(boolean z) {
        this.f95217L = z;
    }

    public void setScanLineSize(int i) {
        this.f95244p = i;
    }

    public void setShowDefaultGridScanLineDrawable(boolean z) {
        this.f95218M = z;
    }

    public void setShowDefaultScanLineDrawable(boolean z) {
        this.f95247s = z;
    }

    public void setShowTipBackground(boolean z) {
        this.f95216K = z;
    }

    public void setShowTipTextAsSingleLine(boolean z) {
        this.f95214I = z;
    }

    public void setTipBackgroundColor(int i) {
        this.f95215J = i;
    }

    public void setTipBackgroundRadius(int i) {
        this.aa = i;
    }

    public void setTipText(String str) {
        this.f95209D = str;
    }

    public void setTipTextBelowRect(boolean z) {
        this.f95212G = z;
    }

    public void setTipTextColor(int i) {
        this.f95211F = i;
    }

    public void setTipTextMargin(int i) {
        this.f95213H = i;
    }

    public void setTipTextSize(int i) {
        this.f95210E = i;
    }

    public void setTipTextSl(StaticLayout staticLayout) {
        this.f95228W = staticLayout;
    }

    public void setToolbarHeight(int i) {
        this.f95254z = i;
    }

    public void setTopOffset(int i) {
        this.f95243o = i;
    }

    public void onDraw(Canvas canvas) {
        if (this.f95231c != null) {
            m146199a(canvas);
            m146201b(canvas);
            m146203c(canvas);
            m146204d(canvas);
            m146205e(canvas);
            m146200b();
        }
    }

    /* renamed from: b */
    private void m146201b(Canvas canvas) {
        if (this.f95250v > 0) {
            this.f95234f.setStyle(Paint.Style.STROKE);
            this.f95234f.setColor(this.f95251w);
            this.f95234f.setStrokeWidth((float) this.f95250v);
            canvas.drawRect(this.f95231c, this.f95234f);
        }
    }

    @Override // com.ss.android.lark.fastqrcode.widget.IScanBoxView
    /* renamed from: a */
    public Rect mo136590a(int i) {
        if (!this.ab) {
            return null;
        }
        Rect rect = new Rect(this.f95231c);
        float measuredHeight = (((float) i) * 1.0f) / ((float) getMeasuredHeight());
        rect.left = (int) (((float) rect.left) * measuredHeight);
        rect.right = (int) (((float) rect.right) * measuredHeight);
        rect.top = (int) (((float) rect.top) * measuredHeight);
        rect.bottom = (int) (((float) rect.bottom) * measuredHeight);
        return rect;
    }

    /* renamed from: a */
    private void m146199a(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.f95236h != 0) {
            this.f95234f.setStyle(Paint.Style.FILL);
            this.f95234f.setColor(this.f95236h);
            float f = (float) width;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, (float) this.f95231c.top, this.f95234f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) this.f95231c.top, (float) this.f95231c.left, (float) (this.f95231c.bottom + 1), this.f95234f);
            canvas.drawRect((float) (this.f95231c.right + 1), (float) this.f95231c.top, f, (float) (this.f95231c.bottom + 1), this.f95234f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) (this.f95231c.bottom + 1), f, (float) height, this.f95234f);
        }
    }

    public DefaultScanBoxView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f95234f = paint;
        paint.setAntiAlias(true);
        this.f95236h = Color.parseColor("#33FFFFFF");
        this.f95237i = -1;
        this.f95238j = C37059b.m146181a(context, 20.0f);
        this.f95239k = C37059b.m146181a(context, 3.0f);
        this.f95244p = C37059b.m146181a(context, 1.0f);
        this.f95245q = -1;
        this.f95243o = C37059b.m146181a(context, 90.0f);
        this.f95240l = C37059b.m146181a(context, 200.0f);
        this.f95242n = C37059b.m146181a(context, 140.0f);
        this.f95246r = 0;
        this.f95247s = false;
        this.f95248t = null;
        this.f95249u = null;
        this.f95250v = C37059b.m146181a(context, 1.0f);
        this.f95251w = -1;
        this.f95252x = 1000;
        this.f95253y = false;
        this.f95254z = 0;
        this.f95206A = false;
        this.f95229a = C37059b.m146181a(context, 2.7f);
        this.f95209D = null;
        this.f95210E = C37059b.m146193b(context, 14.0f);
        this.f95211F = -1;
        this.f95212G = false;
        this.f95213H = C37059b.m146181a(context, 20.0f);
        this.f95214I = false;
        this.f95215J = Color.parseColor("#22000000");
        this.f95216K = false;
        this.f95217L = false;
        this.f95218M = false;
        TextPaint textPaint = new TextPaint();
        this.f95235g = textPaint;
        textPaint.setAntiAlias(true);
        this.aa = C37059b.m146181a(context, 4.0f);
        this.ab = false;
    }

    public void setIsBarcode(boolean z) {
        this.f95206A = z;
        if (this.f95219N != null || this.f95218M) {
            if (z) {
                this.f95220O = this.f95226U;
            } else {
                this.f95220O = this.f95225T;
            }
        } else if (this.f95248t != null || this.f95247s) {
            if (z) {
                this.f95249u = this.f95224S;
            } else {
                this.f95249u = this.f95223R;
            }
        }
        if (z) {
            this.f95209D = this.f95208C;
            this.f95241m = this.f95242n;
            this.f95230b = (int) (((((float) this.f95252x) * 1.0f) * ((float) this.f95229a)) / ((float) this.f95240l));
        } else {
            this.f95209D = this.f95207B;
            int i = this.f95240l;
            this.f95241m = i;
            this.f95230b = (int) (((((float) this.f95252x) * 1.0f) * ((float) this.f95229a)) / ((float) i));
        }
        if (!TextUtils.isEmpty(this.f95209D)) {
            if (this.f95214I) {
                this.f95228W = new StaticLayout(this.f95209D, this.f95235g, C37059b.m146187a(getContext()).x, Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            } else {
                this.f95228W = new StaticLayout(this.f95209D, this.f95235g, this.f95240l - (this.aa * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
            }
        }
        if (this.f95253y) {
            int i2 = C37059b.m146187a(getContext()).y;
            int i3 = this.f95254z;
            if (i3 == 0) {
                this.f95243o = (i2 - this.f95241m) / 2;
            } else {
                this.f95243o = ((i2 - this.f95241m) / 2) + (i3 / 2);
            }
        }
        m146202c();
        postInvalidate();
    }

    /* renamed from: c */
    private void m146203c(Canvas canvas) {
        if (this.f95227V > BitmapDescriptorFactory.HUE_RED) {
            this.f95234f.setStyle(Paint.Style.STROKE);
            this.f95234f.setColor(this.f95237i);
            this.f95234f.setStrokeWidth((float) this.f95239k);
            canvas.drawLine(((float) this.f95231c.left) - this.f95227V, (float) this.f95231c.top, (((float) this.f95231c.left) - this.f95227V) + ((float) this.f95238j), (float) this.f95231c.top, this.f95234f);
            canvas.drawLine((float) this.f95231c.left, ((float) this.f95231c.top) - this.f95227V, (float) this.f95231c.left, (((float) this.f95231c.top) - this.f95227V) + ((float) this.f95238j), this.f95234f);
            canvas.drawLine(((float) this.f95231c.right) + this.f95227V, (float) this.f95231c.top, (((float) this.f95231c.right) + this.f95227V) - ((float) this.f95238j), (float) this.f95231c.top, this.f95234f);
            canvas.drawLine((float) this.f95231c.right, ((float) this.f95231c.top) - this.f95227V, (float) this.f95231c.right, (((float) this.f95231c.top) - this.f95227V) + ((float) this.f95238j), this.f95234f);
            canvas.drawLine(((float) this.f95231c.left) - this.f95227V, (float) this.f95231c.bottom, (((float) this.f95231c.left) - this.f95227V) + ((float) this.f95238j), (float) this.f95231c.bottom, this.f95234f);
            canvas.drawLine((float) this.f95231c.left, ((float) this.f95231c.bottom) + this.f95227V, (float) this.f95231c.left, (((float) this.f95231c.bottom) + this.f95227V) - ((float) this.f95238j), this.f95234f);
            canvas.drawLine(((float) this.f95231c.right) + this.f95227V, (float) this.f95231c.bottom, (((float) this.f95231c.right) + this.f95227V) - ((float) this.f95238j), (float) this.f95231c.bottom, this.f95234f);
            canvas.drawLine((float) this.f95231c.right, ((float) this.f95231c.bottom) + this.f95227V, (float) this.f95231c.right, (((float) this.f95231c.bottom) + this.f95227V) - ((float) this.f95238j), this.f95234f);
        }
    }

    /* renamed from: d */
    private void m146204d(Canvas canvas) {
        if (this.f95206A) {
            if (this.f95220O != null) {
                RectF rectF = new RectF(((float) this.f95231c.left) + this.f95227V + 0.5f, ((float) this.f95231c.top) + this.f95227V + ((float) this.f95246r), this.f95222Q, (((float) this.f95231c.bottom) - this.f95227V) - ((float) this.f95246r));
                Rect rect = new Rect((int) (((float) this.f95220O.getWidth()) - rectF.width()), 0, this.f95220O.getWidth(), this.f95220O.getHeight());
                if (rect.left < 0) {
                    rect.left = 0;
                    rectF.left = rectF.right - ((float) rect.width());
                }
                canvas.drawBitmap(this.f95220O, rect, rectF, this.f95234f);
            } else if (this.f95249u != null) {
                canvas.drawBitmap(this.f95249u, (Rect) null, new RectF(this.f95233e, ((float) this.f95231c.top) + this.f95227V + ((float) this.f95246r), this.f95233e + ((float) this.f95249u.getWidth()), (((float) this.f95231c.bottom) - this.f95227V) - ((float) this.f95246r)), this.f95234f);
            } else {
                this.f95234f.setStyle(Paint.Style.FILL);
                this.f95234f.setColor(this.f95245q);
                canvas.drawRect(this.f95233e, ((float) this.f95231c.top) + this.f95227V + ((float) this.f95246r), this.f95233e + ((float) this.f95244p), (((float) this.f95231c.bottom) - this.f95227V) - ((float) this.f95246r), this.f95234f);
            }
        } else if (this.f95220O != null) {
            RectF rectF2 = new RectF(((float) this.f95231c.left) + this.f95227V + ((float) this.f95246r), ((float) this.f95231c.top) + this.f95227V + 0.5f, (((float) this.f95231c.right) - this.f95227V) - ((float) this.f95246r), this.f95221P);
            Rect rect2 = new Rect(0, (int) (((float) this.f95220O.getHeight()) - rectF2.height()), this.f95220O.getWidth(), this.f95220O.getHeight());
            if (rect2.top < 0) {
                rect2.top = 0;
                rectF2.top = rectF2.bottom - ((float) rect2.height());
            }
            canvas.drawBitmap(this.f95220O, rect2, rectF2, this.f95234f);
        } else if (this.f95249u != null) {
            canvas.drawBitmap(this.f95249u, (Rect) null, new RectF(((float) this.f95231c.left) + this.f95227V + ((float) this.f95246r), this.f95232d, (((float) this.f95231c.right) - this.f95227V) - ((float) this.f95246r), this.f95232d + ((float) this.f95249u.getHeight())), this.f95234f);
        } else {
            this.f95234f.setStyle(Paint.Style.FILL);
            this.f95234f.setColor(this.f95245q);
            canvas.drawRect(((float) this.f95231c.left) + this.f95227V + ((float) this.f95246r), this.f95232d, (((float) this.f95231c.right) - this.f95227V) - ((float) this.f95246r), this.f95232d + ((float) this.f95244p), this.f95234f);
        }
    }

    /* renamed from: e */
    private void m146205e(Canvas canvas) {
        if (!TextUtils.isEmpty(this.f95209D) && this.f95228W != null) {
            if (this.f95212G) {
                if (this.f95216K) {
                    this.f95234f.setColor(this.f95215J);
                    this.f95234f.setStyle(Paint.Style.FILL);
                    if (this.f95214I) {
                        Rect rect = new Rect();
                        TextPaint textPaint = this.f95235g;
                        String str = this.f95209D;
                        textPaint.getTextBounds(str, 0, str.length(), rect);
                        float width = (float) (((canvas.getWidth() - rect.width()) / 2) - this.aa);
                        RectF rectF = new RectF(width, (float) ((this.f95231c.bottom + this.f95213H) - this.aa), ((float) rect.width()) + width + ((float) (this.aa * 2)), (float) (this.f95231c.bottom + this.f95213H + this.f95228W.getHeight() + this.aa));
                        int i = this.aa;
                        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f95234f);
                    } else {
                        RectF rectF2 = new RectF((float) this.f95231c.left, (float) ((this.f95231c.bottom + this.f95213H) - this.aa), (float) this.f95231c.right, (float) (this.f95231c.bottom + this.f95213H + this.f95228W.getHeight() + this.aa));
                        int i2 = this.aa;
                        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f95234f);
                    }
                }
                canvas.save();
                if (this.f95214I) {
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (this.f95231c.bottom + this.f95213H));
                } else {
                    canvas.translate((float) (this.f95231c.left + this.aa), (float) (this.f95231c.bottom + this.f95213H));
                }
                this.f95228W.draw(canvas);
                canvas.restore();
                return;
            }
            if (this.f95216K) {
                this.f95234f.setColor(this.f95215J);
                this.f95234f.setStyle(Paint.Style.FILL);
                if (this.f95214I) {
                    Rect rect2 = new Rect();
                    TextPaint textPaint2 = this.f95235g;
                    String str2 = this.f95209D;
                    textPaint2.getTextBounds(str2, 0, str2.length(), rect2);
                    float width2 = (float) (((canvas.getWidth() - rect2.width()) / 2) - this.aa);
                    RectF rectF3 = new RectF(width2, (float) (((this.f95231c.top - this.f95213H) - this.f95228W.getHeight()) - this.aa), ((float) rect2.width()) + width2 + ((float) (this.aa * 2)), (float) ((this.f95231c.top - this.f95213H) + this.aa));
                    int i3 = this.aa;
                    canvas.drawRoundRect(rectF3, (float) i3, (float) i3, this.f95234f);
                } else {
                    RectF rectF4 = new RectF((float) this.f95231c.left, (float) (((this.f95231c.top - this.f95213H) - this.f95228W.getHeight()) - this.aa), (float) this.f95231c.right, (float) ((this.f95231c.top - this.f95213H) + this.aa));
                    int i4 = this.aa;
                    canvas.drawRoundRect(rectF4, (float) i4, (float) i4, this.f95234f);
                }
            }
            canvas.save();
            if (this.f95214I) {
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) ((this.f95231c.top - this.f95213H) - this.f95228W.getHeight()));
            } else {
                canvas.translate((float) (this.f95231c.left + this.aa), (float) ((this.f95231c.top - this.f95213H) - this.f95228W.getHeight()));
            }
            this.f95228W.draw(canvas);
            canvas.restore();
        }
    }

    public DefaultScanBoxView(Context context, AttributeSet attributeSet) {
        this(context);
        mo136591a(context, attributeSet);
    }

    /* renamed from: a */
    private void m146198a(int i, TypedArray typedArray) {
        if (i == 30) {
            this.f95243o = typedArray.getDimensionPixelSize(i, this.f95243o);
        } else if (i == 7) {
            this.f95239k = typedArray.getDimensionPixelSize(i, this.f95239k);
        } else if (i == 6) {
            this.f95238j = typedArray.getDimensionPixelSize(i, this.f95238j);
        } else if (i == 24) {
            this.f95244p = typedArray.getDimensionPixelSize(i, this.f95244p);
        } else if (i == 21) {
            this.f95240l = typedArray.getDimensionPixelSize(i, this.f95240l);
        } else if (i == 19) {
            this.f95236h = typedArray.getColor(i, this.f95236h);
        } else if (i == 5) {
            this.f95237i = typedArray.getColor(i, this.f95237i);
        } else if (i == 22) {
            this.f95245q = typedArray.getColor(i, this.f95245q);
        } else if (i == 23) {
            this.f95246r = typedArray.getDimensionPixelSize(i, this.f95246r);
        } else if (i == 15) {
            this.f95247s = typedArray.getBoolean(i, this.f95247s);
        } else if (i == 9) {
            this.f95248t = typedArray.getDrawable(i);
        } else if (i == 4) {
            this.f95250v = typedArray.getDimensionPixelSize(i, this.f95250v);
        } else if (i == 3) {
            this.f95251w = typedArray.getColor(i, this.f95251w);
        } else if (i == 0) {
            this.f95252x = typedArray.getInteger(i, this.f95252x);
        } else if (i == 11) {
            this.f95253y = typedArray.getBoolean(i, this.f95253y);
        } else if (i == 29) {
            this.f95254z = typedArray.getDimensionPixelSize(i, this.f95254z);
        } else if (i == 2) {
            this.f95242n = typedArray.getDimensionPixelSize(i, this.f95242n);
        } else if (i == 10) {
            this.f95206A = typedArray.getBoolean(i, this.f95206A);
        } else if (i == 1) {
            this.f95208C = typedArray.getString(i);
        } else if (i == 20) {
            this.f95207B = typedArray.getString(i);
        } else if (i == 28) {
            this.f95210E = typedArray.getDimensionPixelSize(i, this.f95210E);
        } else if (i == 26) {
            this.f95211F = typedArray.getColor(i, this.f95211F);
        } else if (i == 18) {
            this.f95212G = typedArray.getBoolean(i, this.f95212G);
        } else if (i == 27) {
            this.f95213H = typedArray.getDimensionPixelSize(i, this.f95213H);
        } else if (i == 17) {
            this.f95214I = typedArray.getBoolean(i, this.f95214I);
        } else if (i == 16) {
            this.f95216K = typedArray.getBoolean(i, this.f95216K);
        } else if (i == 25) {
            this.f95215J = typedArray.getColor(i, this.f95215J);
        } else if (i == 13) {
            this.f95217L = typedArray.getBoolean(i, this.f95217L);
        } else if (i == 14) {
            this.f95218M = typedArray.getBoolean(i, this.f95218M);
        } else if (i == 8) {
            this.f95219N = typedArray.getDrawable(i);
        } else if (i == 12) {
            this.ab = typedArray.getBoolean(i, this.ab);
        }
    }

    /* renamed from: a */
    public void mo136591a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.qrcv_animTime, R.attr.qrcv_barCodeTipText, R.attr.qrcv_barcodeRectHeight, R.attr.qrcv_borderColor, R.attr.qrcv_borderSize, R.attr.qrcv_cornerColor, R.attr.qrcv_cornerLength, R.attr.qrcv_cornerSize, R.attr.qrcv_customGridScanLineDrawable, R.attr.qrcv_customScanLineDrawable, R.attr.qrcv_isBarcode, R.attr.qrcv_isCenterVertical, R.attr.qrcv_isOnlyDecodeScanBoxArea, R.attr.qrcv_isScanLineReverse, R.attr.qrcv_isShowDefaultGridScanLineDrawable, R.attr.qrcv_isShowDefaultScanLineDrawable, R.attr.qrcv_isShowTipBackground, R.attr.qrcv_isShowTipTextAsSingleLine, R.attr.qrcv_isTipTextBelowRect, R.attr.qrcv_maskColor, R.attr.qrcv_qrCodeTipText, R.attr.qrcv_rectWidth, R.attr.qrcv_scanLineColor, R.attr.qrcv_scanLineMargin, R.attr.qrcv_scanLineSize, R.attr.qrcv_tipBackgroundColor, R.attr.qrcv_tipTextColor, R.attr.qrcv_tipTextMargin, R.attr.qrcv_tipTextSize, R.attr.qrcv_toolbarHeight, R.attr.qrcv_topOffset});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            m146198a(obtainStyledAttributes.getIndex(i), obtainStyledAttributes);
        }
        obtainStyledAttributes.recycle();
        m146197a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m146202c();
    }
}
