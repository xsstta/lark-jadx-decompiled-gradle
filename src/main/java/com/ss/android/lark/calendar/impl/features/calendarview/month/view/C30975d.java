package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.BaseEventChipViewAttribute;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IRowAnimateListener;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a.C31101a;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.d */
public class C30975d extends FrameLayout {

    /* renamed from: d */
    private static int f78078d = 11;

    /* renamed from: e */
    private static float f78079e = 8.0f;

    /* renamed from: A */
    private TextPaint f78080A = new TextPaint();

    /* renamed from: B */
    private TextPaint f78081B = new TextPaint();

    /* renamed from: C */
    private TextPaint f78082C = new TextPaint();

    /* renamed from: D */
    private String[] f78083D;

    /* renamed from: E */
    private int f78084E;

    /* renamed from: F */
    private boolean f78085F;

    /* renamed from: G */
    private CalendarDate f78086G;

    /* renamed from: H */
    private CalendarDate f78087H;

    /* renamed from: I */
    private CalendarDate f78088I;

    /* renamed from: J */
    private CalendarDate f78089J;

    /* renamed from: K */
    private int f78090K;

    /* renamed from: L */
    private int f78091L;

    /* renamed from: M */
    private int f78092M;

    /* renamed from: N */
    private int f78093N;

    /* renamed from: O */
    private int f78094O;

    /* renamed from: P */
    private int f78095P;

    /* renamed from: Q */
    private int f78096Q;

    /* renamed from: R */
    private int f78097R;

    /* renamed from: S */
    private int f78098S;

    /* renamed from: T */
    private int f78099T;

    /* renamed from: U */
    private int f78100U;

    /* renamed from: V */
    private int f78101V;

    /* renamed from: W */
    private int f78102W;

    /* renamed from: a */
    public IRowAnimateListener f78103a;
    private int aa;
    private ArrayList<Integer> ab;
    private ImageView ac;
    private ImageView ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;

    /* renamed from: ai  reason: collision with root package name */
    private int f175445ai;
    private TextPaint aj;
    private Paint ak;
    private Paint al;
    private Paint am;
    private Paint an;

    /* renamed from: b */
    public ValueAnimator f78104b;

    /* renamed from: c */
    List<MonthEventChipViewData> f78105c;

    /* renamed from: f */
    private Context f78106f;

    /* renamed from: g */
    private int f78107g;

    /* renamed from: h */
    private int f78108h;

    /* renamed from: i */
    private int f78109i;

    /* renamed from: j */
    private int f78110j;

    /* renamed from: k */
    private int f78111k;

    /* renamed from: l */
    private int f78112l;

    /* renamed from: m */
    private int f78113m;

    /* renamed from: n */
    private int f78114n;

    /* renamed from: o */
    private int f78115o;

    /* renamed from: p */
    private int f78116p;

    /* renamed from: q */
    private int f78117q;

    /* renamed from: r */
    private int f78118r;

    /* renamed from: s */
    private Paint f78119s = new Paint();

    /* renamed from: t */
    private Paint f78120t = new Paint();

    /* renamed from: u */
    private TextPaint f78121u = new TextPaint();

    /* renamed from: v */
    private Paint f78122v = new Paint();

    /* renamed from: w */
    private Paint f78123w = new Paint();

    /* renamed from: x */
    private TextPaint f78124x = new TextPaint();

    /* renamed from: y */
    private TextPaint f78125y = new TextPaint();

    /* renamed from: z */
    private TextPaint f78126z = new TextPaint();

    public void setSelectedCol(int i) {
        if (i > 6) {
        }
    }

    public CalendarDate getFirstDateOfTheRow() {
        return this.f78089J;
    }

    /* renamed from: c */
    public void mo112149c() {
        this.f78084E = -1;
        ImageView imageView = this.ad;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo112143a() {
        List<MonthEventChipViewData> list = this.f78105c;
        if (list != null) {
            for (MonthEventChipViewData monthEventChipViewData : list) {
                if (!monthEventChipViewData.isHasDrawnMask() && monthEventChipViewData.needDrawEventFinishedMask()) {
                    postInvalidate();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo112147b() {
        if (this.f78084E != -1) {
            if (this.ad == null) {
                ImageView imageView = new ImageView(this.f78106f);
                this.ad = imageView;
                imageView.setBackgroundColor(C25633a.m91708b(getResources().getColor(R.color.ud_N100), 0.9f));
                Context context = this.f78106f;
                this.ad.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_up_bold_outlined, UDColorUtils.getColor(context, R.color.icon_n3)));
                this.ad.setScaleType(ImageView.ScaleType.CENTER);
                addView(this.ad);
                this.ad.setVisibility(8);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f78108h, (this.f78109i - this.f78110j) - this.f78091L);
            layoutParams.topMargin = ((this.f78115o + this.f78110j) + this.f78091L) - this.aa;
            layoutParams.leftMargin = ((this.f78108h * this.f78084E) + this.f78112l) - this.f78113m;
            this.ad.setLayoutParams(layoutParams);
            this.ad.bringToFront();
            this.ad.setVisibility(0);
        }
    }

    public void setCurrentDateHasBgCircle(boolean z) {
        this.f78085F = z;
    }

    public void setIsShowLunarCalendar(boolean z) {
        this.ae = z;
    }

    public void setMaxRowList(ArrayList<Integer> arrayList) {
        this.ab = arrayList;
    }

    public void setRowAnimateListener(IRowAnimateListener cVar) {
        this.f78103a = cVar;
    }

    public void setSelectState(int i) {
        this.f78084E = i;
    }

    /* renamed from: b */
    private void m115623b(Canvas canvas) {
        for (int i = 0; i < 7; i++) {
            CalendarDate addDay = this.f78089J.addDay(i);
            String a = C31101a.m116088a(addDay);
            float f = (float) ((this.f78108h * i) + this.f78112l);
            float f2 = (float) (this.f78115o + this.f78110j + this.f78118r + this.f78117q);
            if (!m115622a(addDay, this.f78088I)) {
                canvas.drawText(a, f, f2, this.f78082C);
            } else {
                canvas.drawText(a, f, f2, this.f78081B);
            }
        }
    }

    /* renamed from: c */
    private void m115624c(Canvas canvas) {
        int i = this.f78084E;
        if (i != -1) {
            canvas.drawCircle((float) ((this.f78108h * i) + this.f78112l + this.f78099T + this.f78113m), (float) (this.f78115o + ((this.f78110j / 3) * 2)), (float) this.f78116p, this.f78119s);
        }
    }

    /* renamed from: a */
    public int mo112142a(float f) {
        int i = (int) ((f - ((float) this.f78112l)) / ((float) this.f78108h));
        if (i > 6) {
            i = 6;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public C30975d(Context context) {
        super(context);
        this.f78106f = context;
        this.f78083D = new String[7];
        this.f78084E = -1;
        this.f78085F = true;
        m115620a(context);
    }

    /* renamed from: a */
    private void m115621a(Canvas canvas) {
        for (int i = 0; i < 7; i++) {
            CalendarDate addDay = this.f78089J.addDay(i);
            int i2 = this.f78108h * i;
            if (addDay.sameDay(this.f78086G)) {
                if (this.f78085F) {
                    canvas.drawCircle((float) (this.f78112l + i2 + this.f78099T + this.f78113m), (float) (this.f78115o + ((this.f78110j / 3) * 2)), (float) this.f78116p, this.f78123w);
                    canvas.drawText(this.f78083D[i], (float) (i2 + this.f78112l + this.f78099T + this.f78113m), (float) (this.f78115o + this.f78110j), this.f78126z);
                } else {
                    canvas.drawText(this.f78083D[i], (float) (i2 + this.f78112l + this.f78099T + this.f78113m), (float) (this.f78115o + this.f78110j), this.f78080A);
                }
            } else if (!m115622a(addDay, this.f78088I)) {
                canvas.drawText(this.f78083D[i], (float) (i2 + this.f78112l + this.f78099T + this.f78113m), (float) (this.f78115o + this.f78110j), this.f78125y);
            } else {
                canvas.drawText(this.f78083D[i], (float) (i2 + this.f78112l + this.f78099T + this.f78113m), (float) (this.f78115o + this.f78110j), this.f78124x);
            }
        }
    }

    /* renamed from: d */
    private void m115625d(Canvas canvas) {
        if (this.ab.size() >= 7) {
            for (int i = 0; i < 7; i++) {
                int intValue = this.ab.get(i).intValue();
                int i2 = this.f78090K;
                if (intValue >= i2) {
                    int i3 = (intValue - i2) + 1;
                    String str = i3 > 9 ? "+N" : "+" + i3;
                    int i4 = this.f78108h;
                    int i5 = i + 1;
                    int i6 = this.f78100U;
                    int i7 = this.f78095P;
                    int i8 = this.f78115o;
                    int i9 = this.f78101V;
                    RectF rectF = new RectF((float) ((((i4 * i5) + i6) - i7) - this.f78096Q), (float) (i8 + i9), (float) (((i4 * i5) + i6) - i7), (float) (i8 + this.f78097R + i9));
                    int i10 = this.f78098S;
                    canvas.drawRoundRect(rectF, (float) i10, (float) i10, this.f78120t);
                    canvas.drawText(str, (float) ((((this.f78108h * i5) + this.f78100U) - this.f78095P) - (this.f78096Q / 2)), (float) (((this.f78115o + this.f78111k) + this.f78101V) - this.f78102W), this.f78121u);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!(this.f78086G == null || this.f78087H == null || this.f78088I == null || this.f78089J == null)) {
            for (int i = 0; i < 7; i++) {
                this.f78083D[i] = Integer.toString(this.f78089J.addDay(i).getMonthDay());
            }
            m115624c(canvas);
            m115621a(canvas);
            if (this.ae) {
                m115623b(canvas);
            }
            ArrayList<Integer> arrayList = this.ab;
            if (arrayList != null && arrayList.size() > 0) {
                m115625d(canvas);
            }
            mo112147b();
            if (this.f78105c != null) {
                RectF rectF = new RectF();
                this.am.setColor(C32658j.m125333a(C32634ae.m125178a(R.color.ud_N00), (double) CalendarSkinColorTool.m124925b(C30022a.f74884c.mo108456c().getSkinType())));
                for (MonthEventChipViewData monthEventChipViewData : this.f78105c) {
                    if (monthEventChipViewData.getRow() < this.f78090K) {
                        BaseEventChipViewAttribute attribute = monthEventChipViewData.getAttribute();
                        int span = (this.f78108h * (monthEventChipViewData.getSpan() - 1)) + this.f78093N;
                        int i2 = this.f78094O;
                        int colum = (monthEventChipViewData.getColum() * this.f78108h) + this.f78100U;
                        int row = this.f78115o + this.f78110j + this.f78091L + (monthEventChipViewData.getRow() * (this.f78094O + this.f78092M));
                        if (this.ae) {
                            row += this.f78117q + this.f78118r;
                        }
                        rectF.set((float) colum, (float) row, (float) (colum + span), (float) (i2 + row));
                        int[] stripColorsWithAlpha = attribute.getStripColorsWithAlpha();
                        if (stripColorsWithAlpha == null) {
                            this.al.setColor(monthEventChipViewData.getAttribute().getBackGroundColor());
                            int i3 = this.af;
                            canvas.drawRoundRect(rectF, (float) i3, (float) i3, this.al);
                        } else {
                            this.al.setColor(monthEventChipViewData.getAttribute().getBackGroundColor());
                            int i4 = this.af;
                            canvas.drawRoundRect(rectF, (float) i4, (float) i4, this.al);
                            this.an.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, 20.0f, 20.0f, new int[]{stripColorsWithAlpha[0], stripColorsWithAlpha[0], stripColorsWithAlpha[1], stripColorsWithAlpha[1]}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, BitmapDescriptorFactory.HUE_RED, 0.5f}, Shader.TileMode.REPEAT));
                            int i5 = this.af;
                            canvas.drawRoundRect(rectF, (float) i5, (float) i5, this.an);
                        }
                        int borderColor = attribute.getBorderColor();
                        if (borderColor != -1) {
                            this.ak.setColor(borderColor);
                            int i6 = this.af;
                            canvas.drawRoundRect(rectF, (float) i6, (float) i6, this.ak);
                        }
                        this.aj.setColor(monthEventChipViewData.getAttribute().getTextColor());
                        this.aj.setStrikeThruText(attribute.textSTRIKE());
                        String eventTitle = monthEventChipViewData.getEventTitle();
                        canvas.drawText(eventTitle, 0, this.aj.breakText(eventTitle, 0, eventTitle.length(), true, (float) (span - this.ah), null), (float) (colum + this.ah), (float) (row + this.f175445ai), (Paint) this.aj);
                        if (monthEventChipViewData.needDrawEventFinishedMask()) {
                            int i7 = this.af;
                            canvas.drawRoundRect(rectF, (float) i7, (float) i7, this.am);
                            monthEventChipViewData.setHasDrawnMask(true);
                        }
                    }
                }
                LaunchPerfMonitor.m124427c();
                LaunchPerfMonitor.m124430d("show_chip");
                LaunchMemoryMonitor.m124420b();
            }
        }
    }

    /* renamed from: a */
    private void m115620a(Context context) {
        setBackgroundResource(R.color.bg_body);
        this.f78122v.setStyle(Paint.Style.FILL);
        this.f78122v.setColor(context.getResources().getColor(R.color.bg_body));
        this.f78112l = context.getResources().getDimensionPixelSize(R.dimen.dp_16);
        this.f78114n = context.getResources().getDimensionPixelSize(R.dimen.dp_11d5);
        this.f78115o = context.getResources().getDimensionPixelSize(R.dimen.dp_6);
        this.f78113m = context.getResources().getDimensionPixelSize(R.dimen.dp_1);
        this.f78116p = context.getResources().getDimensionPixelSize(R.dimen.dp_11);
        this.f78091L = context.getResources().getDimensionPixelSize(R.dimen.dp_7);
        this.f78092M = context.getResources().getDimensionPixelSize(R.dimen.dp_3);
        this.f78094O = context.getResources().getDimensionPixelSize(R.dimen.dp_16);
        this.f78101V = context.getResources().getDimensionPixelSize(R.dimen.dp_3d5);
        this.f78095P = context.getResources().getDimensionPixelSize(R.dimen.dp_4d5);
        this.f78099T = context.getResources().getDimensionPixelSize(R.dimen.dp_7);
        this.f78100U = context.getResources().getDimensionPixelSize(R.dimen.dp_16);
        this.f78096Q = context.getResources().getDimensionPixelSize(R.dimen.dp_19);
        this.f78097R = context.getResources().getDimensionPixelSize(R.dimen.dp_12);
        this.f78098S = context.getResources().getDimensionPixelSize(R.dimen.dp_2d5);
        this.f78102W = context.getResources().getDimensionPixelSize(R.dimen.dp_05);
        this.aa = this.f78106f.getResources().getDimensionPixelSize(R.dimen.dp_05);
        this.f78117q = C57582a.m223601a(this.f78106f, (float) f78078d);
        this.f78118r = C57582a.m223601a(this.f78106f, f78079e);
        this.f78110j = context.getResources().getDimensionPixelSize(R.dimen.dp_14);
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/DINPro-Bold.ttf");
        this.f78124x.setTextSize((float) this.f78110j);
        this.f78124x.setTextAlign(Paint.Align.CENTER);
        this.f78124x.setColor(context.getResources().getColor(R.color.text_title));
        this.f78124x.setAntiAlias(true);
        this.f78124x.setTypeface(createFromAsset);
        this.f78125y.setTextSize((float) this.f78110j);
        this.f78125y.setTextAlign(Paint.Align.CENTER);
        this.f78125y.setColor(context.getResources().getColor(R.color.ud_N400));
        this.f78125y.setAntiAlias(true);
        this.f78125y.setTypeface(createFromAsset);
        this.f78126z.setTextSize((float) this.f78110j);
        this.f78126z.setTextAlign(Paint.Align.CENTER);
        this.f78126z.setColor(context.getResources().getColor(R.color.white));
        this.f78126z.setAntiAlias(true);
        this.f78126z.setTypeface(createFromAsset);
        this.f78080A.setTextSize((float) this.f78110j);
        this.f78080A.setTextAlign(Paint.Align.CENTER);
        this.f78080A.setColor(context.getResources().getColor(R.color.primary_pri_500));
        this.f78080A.setAntiAlias(true);
        this.f78123w.setStyle(Paint.Style.FILL);
        this.f78123w.setColor(context.getResources().getColor(R.color.primary_pri_500));
        this.f78123w.setAntiAlias(true);
        this.f78119s.setStyle(Paint.Style.FILL);
        this.f78119s.setColor(context.getResources().getColor(R.color.ud_N300));
        this.f78119s.setAntiAlias(true);
        this.f78120t.setStyle(Paint.Style.FILL);
        this.f78120t.setColor(context.getResources().getColor(R.color.ud_N500));
        this.f78120t.setAlpha(31);
        this.f78120t.setAntiAlias(true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_10);
        this.f78111k = dimensionPixelSize;
        this.f78121u.setTextSize((float) dimensionPixelSize);
        this.f78121u.setTextAlign(Paint.Align.CENTER);
        this.f78121u.setColor(context.getResources().getColor(R.color.ud_N500));
        this.f78121u.setAntiAlias(true);
        this.f78081B.setTextSize((float) this.f78117q);
        this.f78081B.setColor(C57582a.m223616d(context, R.color.ud_N500));
        this.f78081B.setAntiAlias(true);
        this.f78082C.setTextSize((float) this.f78117q);
        this.f78082C.setColor(C57582a.m223616d(context, R.color.ud_N400));
        this.f78082C.setAntiAlias(true);
        this.af = context.getResources().getDimensionPixelSize(R.dimen.dp_2);
        this.ag = context.getResources().getDimensionPixelSize(R.dimen.dp_11);
        this.ah = context.getResources().getDimensionPixelSize(R.dimen.dp_5);
        TextPaint textPaint = new TextPaint();
        this.aj = textPaint;
        textPaint.setTextSize((float) this.ag);
        this.aj.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.aj.getFontMetrics();
        this.f175445ai = (int) (((((float) this.f78094O) - (fontMetrics.bottom - fontMetrics.top)) / 2.0f) - fontMetrics.top);
        Paint paint = new Paint(1);
        this.ak = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.ak.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.dp_05));
        this.al = new Paint(1);
        this.am = new Paint(1);
        this.an = new Paint(1);
        ImageView imageView = new ImageView(this.f78106f);
        this.ac = imageView;
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo112146a(List<MonthEventChipViewData> list) {
        this.f78105c = list;
        mo112147b();
        invalidate();
    }

    /* renamed from: a */
    private static boolean m115622a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        if (calendarDate.getYear() == calendarDate2.getYear() && calendarDate.getMonth() == calendarDate2.getMonth()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo112148b(int i, int i2) {
        this.f78107g = i;
        int i3 = ((i - this.f78112l) - this.f78114n) / 7;
        this.f78108h = i3;
        this.f78109i = i2;
        this.f78093N = i3 - this.f78095P;
        int i4 = (((i2 - this.f78115o) - this.f78110j) - this.f78091L) / (this.f78094O + this.f78092M);
        this.f78090K = i4;
        if (this.ae) {
            this.f78090K = i4 - 1;
        }
    }

    /* renamed from: a */
    public void mo112144a(final int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(getTop(), i2);
        this.f78104b = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.C30975d.C309761 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C30975d.this.getLayoutParams();
                layoutParams.leftMargin = i;
                layoutParams.topMargin = ((Integer) C30975d.this.f78104b.getAnimatedValue()).intValue();
                C30975d.this.setLayoutParams(layoutParams);
            }
        });
        this.f78104b.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.C30975d.C309772 */

            public void onAnimationEnd(Animator animator) {
                C30975d.this.f78103a.onRowViewAnimatorFinished();
            }
        });
        this.f78104b.setDuration(350L);
        this.f78104b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f78104b.setTarget(this);
        this.f78104b.start();
    }

    /* renamed from: a */
    public void mo112145a(CalendarDate calendarDate, CalendarDate calendarDate2, CalendarDate calendarDate3, CalendarDate calendarDate4) {
        this.f78086G = calendarDate;
        this.f78087H = calendarDate2;
        this.f78089J = calendarDate3;
        this.f78088I = calendarDate4;
        invalidate();
    }
}
