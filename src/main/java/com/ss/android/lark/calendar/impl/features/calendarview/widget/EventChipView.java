package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.EventChipViewAttribute;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class EventChipView extends RelativeLayout {

    /* renamed from: f */
    private static boolean f78408f = false;

    /* renamed from: g */
    private static int f78409g = 0;

    /* renamed from: h */
    private static int f78410h = 0;

    /* renamed from: i */
    private static int f78411i = 0;

    /* renamed from: j */
    private static int f78412j = 0;

    /* renamed from: k */
    private static int f78413k = 0;

    /* renamed from: l */
    private static int f78414l = 0;

    /* renamed from: m */
    private static int f78415m = 0;

    /* renamed from: n */
    private static int f78416n = 0;

    /* renamed from: o */
    private static int f78417o = 3;

    /* renamed from: p */
    private static int f78418p;

    /* renamed from: q */
    private static int f78419q;

    /* renamed from: r */
    private static int f78420r;

    /* renamed from: s */
    private static int f78421s;

    /* renamed from: t */
    private static int f78422t;

    /* renamed from: u */
    private static int f78423u;

    /* renamed from: v */
    private static int f78424v;

    /* renamed from: w */
    private static int f78425w;

    /* renamed from: x */
    private static int f78426x;

    /* renamed from: A */
    private int f78427A;

    /* renamed from: B */
    private int f78428B;

    /* renamed from: C */
    private int f78429C;

    /* renamed from: D */
    private int f78430D;

    /* renamed from: E */
    private int f78431E;

    /* renamed from: F */
    private int f78432F;

    /* renamed from: G */
    private Path f78433G;

    /* renamed from: H */
    private EventChipViewData f78434H;

    /* renamed from: I */
    private DragDrawChipViewData f78435I;

    /* renamed from: J */
    private boolean f78436J;

    /* renamed from: K */
    private boolean f78437K;

    /* renamed from: L */
    private EventChipViewAttribute f78438L;

    /* renamed from: M */
    private Drawable f78439M;

    /* renamed from: N */
    private Drawable f78440N;

    /* renamed from: O */
    private Drawable f78441O;

    /* renamed from: P */
    private TextPaint f78442P;

    /* renamed from: Q */
    private boolean f78443Q;

    /* renamed from: R */
    private int f78444R = 0;

    /* renamed from: S */
    private int f78445S = 0;

    /* renamed from: a */
    protected Bitmap f78446a;

    /* renamed from: b */
    protected Bitmap f78447b;

    /* renamed from: c */
    protected Bitmap f78448c;

    /* renamed from: d */
    protected Paint f78449d;

    /* renamed from: e */
    protected int f78450e;

    /* renamed from: y */
    private Paint f78451y = new Paint();

    /* renamed from: z */
    private int f78452z = 1;

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView$a */
    public static class C31086a {

        /* renamed from: a */
        public int f78454a;

        /* renamed from: b */
        public int f78455b;

        public int hashCode() {
            return this.f78454a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C31086a) || this.f78454a != ((C31086a) obj).f78454a) {
                return false;
            }
            return true;
        }

        public C31086a(int i, int i2) {
            this.f78454a = i;
            this.f78455b = i2;
        }
    }

    public DragDrawChipViewData getDayData() {
        return this.f78435I;
    }

    public EventChipViewData getViewData() {
        return this.f78434H;
    }

    /* renamed from: a */
    public void mo112558a(EventChipViewData eventChipViewData) {
        if (eventChipViewData == null) {
            C3474b.m14688a();
            return;
        }
        this.f78443Q = false;
        this.f78434H = eventChipViewData;
        this.f78438L = eventChipViewData.getAttribute();
        m116012e();
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo112555a(Context context) {
        m116008b(context);
        setWillNotDraw(false);
        this.f78438L = new AppendState();
        this.f78429C = f78411i;
        this.f78428B = f78413k;
        this.f78427A = f78410h;
        if (this.f78452z == 0) {
            this.f78429C = f78414l;
            this.f78428B = f78412j;
            this.f78427A = f78409g;
        }
        TextPaint textPaint = new TextPaint();
        this.f78442P = textPaint;
        textPaint.setAntiAlias(true);
        this.f78433G = new Path();
        m116012e();
    }

    /* renamed from: a */
    public void mo112554a(int i, int i2, int i3, int i4) {
        this.f78444R = i3;
        this.f78445S = i4;
        if (i2 > 0) {
            this.f78431E = i2 - this.f78432F;
        }
        if (i > 0) {
            this.f78430D = i;
        }
        this.f78433G.reset();
        Path path = this.f78433G;
        RectF rectF = new RectF((float) i3, (float) i4, (float) (this.f78430D + i3), (float) (this.f78431E + i4));
        int i5 = f78414l;
        path.addRoundRect(rectF, new float[]{(float) i5, (float) i5, (float) i5, (float) i5, (float) i5, (float) i5, (float) i5, (float) i5}, Path.Direction.CW);
    }

    /* renamed from: a */
    public void mo112556a(Canvas canvas) {
        canvas.save();
        int i = this.f78444R;
        int i2 = this.f78445S;
        canvas.clipRect(new Rect(i, i2, this.f78430D + i, this.f78431E + i2));
        m116013f(canvas);
        m116015h(canvas);
        m116014g(canvas);
        mo112560b(canvas);
        mo112562c(canvas);
        mo112564d(canvas);
        mo112565e(canvas);
        m116016i(canvas);
        m116018k(canvas);
        m116011c(canvas, this.f78431E);
        m115997a(canvas, this.f78431E);
        m116009b(canvas, this.f78431E);
        canvas.restore();
    }

    /* renamed from: a */
    public Bitmap mo112553a() {
        int i = this.f78444R;
        int i2 = this.f78445S;
        this.f78444R = 0;
        this.f78445S = 0;
        Bitmap createBitmap = Bitmap.createBitmap(this.f78430D, this.f78431E, Bitmap.Config.ARGB_8888);
        mo112556a(new Canvas(createBitmap));
        this.f78444R = i;
        this.f78445S = i2;
        return createBitmap;
    }

    /* renamed from: a */
    private void m116005a(TextPaint textPaint, Paint paint, Canvas canvas, C31086a aVar, ArrayList<String> arrayList, String str, String str2, float f, float f2, float f3) {
        String str3;
        float width = ((float) ((getWidth() - this.f78428B) - f78416n)) - textPaint.measureText(str, 0, str.length());
        if (!TextUtils.isEmpty(str2)) {
            int length = TextUtils.ellipsize(str2, textPaint, width, TextUtils.TruncateAt.END).toString().length();
            if (aVar.f78455b <= length) {
                str3 = TextUtils.ellipsize(str2, textPaint, width, TextUtils.TruncateAt.END).toString();
            } else {
                int i = length / 2;
                if (((aVar.f78454a + aVar.f78455b) / 2) + i > str2.length()) {
                    str3 = TextUtils.ellipsize(str2, textPaint, width, TextUtils.TruncateAt.START).toString();
                } else {
                    str3 = TextUtils.ellipsize("…" + TextUtils.ellipsize(str2.substring(((aVar.f78454a + aVar.f78455b) / 2) - i), textPaint, width, TextUtils.TruncateAt.END).toString(), textPaint, width, TextUtils.TruncateAt.START).toString();
                }
            }
            String str4 = str + str3;
            float f4 = (float) this.f78428B;
            Iterator<C31086a> it = m115996a(arrayList, str4).iterator();
            while (it.hasNext()) {
                C31086a next = it.next();
                canvas.drawRect(textPaint.measureText(str4, 0, next.f78454a) + f4 + ((float) this.f78444R), f2 + ((float) this.f78445S), textPaint.measureText(str4, 0, next.f78455b) + f4 + ((float) this.f78444R), f2 + f3 + ((float) this.f78445S), paint);
            }
            canvas.drawText(str4, 0, str4.length(), f4 + ((float) this.f78444R), f + ((float) this.f78445S), (Paint) textPaint);
        } else if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, 0, str.length(), (float) (this.f78428B + this.f78444R), f + ((float) this.f78445S), (Paint) textPaint);
        }
    }

    /* renamed from: a */
    private void m116003a(Canvas canvas, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f78442P.setFakeBoldText(z);
            this.f78442P.setTextSize((float) f78422t);
            canvas.drawText(str, 0, this.f78442P.breakText(str, 0, str.length(), true, (float) ((this.f78430D - this.f78428B) + f78422t), null), (float) (this.f78428B + this.f78444R), (((float) this.f78429C) - this.f78442P.getFontMetrics().top) + ((float) this.f78445S), (Paint) this.f78442P);
        }
    }

    /* renamed from: a */
    private void m116002a(Canvas canvas, String str, String str2, Paint.FontMetrics fontMetrics) {
        this.f78442P.setFakeBoldText(false);
        this.f78442P.setTextSize((float) f78422t);
        float f = BitmapDescriptorFactory.HUE_RED;
        float[] fArr = {0.0f};
        if (!TextUtils.isEmpty(str)) {
            int breakText = this.f78442P.breakText(str, 0, str.length(), true, (float) ((this.f78430D - this.f78428B) + f78422t), fArr);
            f = fArr[0];
            canvas.drawText(str, 0, breakText, (float) (this.f78428B + this.f78444R), (((float) this.f78429C) - fontMetrics.top) + ((float) this.f78445S), (Paint) this.f78442P);
        }
        if ((((float) (this.f78430D - this.f78428B)) - f) - ((float) f78419q) > ((float) f78426x)) {
            this.f78442P.setFakeBoldText(false);
            this.f78442P.setTextSize((float) f78423u);
            canvas.drawText(str2, 0, this.f78442P.breakText(str2, 0, str2.length(), true, ((((float) (this.f78430D - this.f78428B)) - f) - ((float) this.f78427A)) + ((float) f78423u), null), ((float) this.f78428B) + f + ((float) f78419q) + ((float) this.f78444R), (((float) this.f78429C) - fontMetrics.top) + ((float) this.f78445S), (Paint) this.f78442P);
        }
    }

    /* renamed from: a */
    private void m116006a(List<String> list, Canvas canvas, Paint.FontMetrics fontMetrics) {
        for (int i = 0; i < list.size() - 1; i++) {
            canvas.drawText(list.get(i), 0, list.get(i).length(), (float) (this.f78428B + this.f78444R), (((float) (((this.f78429C + f78420r) + this.f78427A) + (f78421s * i))) - fontMetrics.top) + ((float) this.f78445S), (Paint) this.f78442P);
        }
    }

    /* renamed from: a */
    private boolean m116007a(char c) {
        return Character.isLowerCase(c) || Character.isUpperCase(c);
    }

    /* renamed from: c */
    public void mo112561c() {
        this.f78436J = true;
        invalidate();
    }

    /* renamed from: d */
    public void mo112563d() {
        this.f78436J = false;
        invalidate();
    }

    public int getDragCircleColor() {
        return this.f78438L.getDragColor();
    }

    /* renamed from: b */
    public void mo112559b() {
        EventChipViewData eventChipViewData;
        if (!this.f78443Q && (eventChipViewData = this.f78434H) != null && eventChipViewData.needDrawEventFinishedMask()) {
            postInvalidate();
        }
    }

    /* renamed from: e */
    private void m116012e() {
        this.f78439M = this.f78438L.getBaseBgDrawable(f78414l);
        this.f78440N = this.f78438L.getStripBgDrawable(f78414l, f78415m);
        this.f78441O = this.f78438L.getColorBgWithBorderDrawable(f78414l, f78415m, this.f78437K);
    }

    public void setBottomPaddingPx(int i) {
        this.f78432F = i;
    }

    public void setShowDragBorder(boolean z) {
        this.f78437K = z;
    }

    public void setType(int i) {
        this.f78452z = i;
    }

    /* renamed from: f */
    private void m116013f(Canvas canvas) {
        m116004a(this.f78439M, canvas);
    }

    /* renamed from: h */
    private void m116015h(Canvas canvas) {
        m116004a(this.f78441O, canvas);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    /* renamed from: a */
    public void mo112557a(DragDrawChipViewData eVar) {
        this.f78435I = eVar;
        mo112558a(eVar.mo110981n());
    }

    public void setAttribute(EventChipViewAttribute eventChipViewAttribute) {
        this.f78438L = eventChipViewAttribute;
        m116012e();
        invalidate();
    }

    public void setBottomPadding(float f) {
        this.f78432F = UIUtils.dp2px(getContext(), f);
    }

    public EventChipView(Context context) {
        super(context);
        mo112555a(context);
    }

    /* renamed from: g */
    private void m116014g(Canvas canvas) {
        Drawable drawable = this.f78440N;
        if (drawable != null) {
            int i = this.f78444R;
            int i2 = this.f78445S;
            drawable.setBounds(i, i2, this.f78430D + i, this.f78431E + i2);
            try {
                this.f78440N.draw(canvas);
            } catch (Exception e) {
                Log.m165389i("EventChipView", "[drawWaveStripe]" + e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public void mo112564d(Canvas canvas) {
        EventChipViewData eventChipViewData = this.f78434H;
        if (eventChipViewData != null && eventChipViewData.isExchangeEventInstance()) {
            if (this.f78447b == null) {
                this.f78447b = ao.m125217a(getContext(), (int) R.drawable.ud_icon_exchange_filled, 16);
            }
            m115998a(canvas, this.f78447b);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m116013f(canvas);
        m116015h(canvas);
        m116014g(canvas);
        mo112560b(canvas);
        if (this.f78452z != 2) {
            mo112562c(canvas);
            mo112564d(canvas);
            mo112565e(canvas);
        }
        m116016i(canvas);
        m116018k(canvas);
        if (this.f78452z != 2) {
            m116011c(canvas, this.f78431E);
            m115997a(canvas, this.f78431E);
        }
        LaunchPerfMonitor.m124430d("show_chip");
        LaunchPerfMonitor.m124427c();
        LaunchMemoryMonitor.m124420b();
    }

    /* renamed from: i */
    private void m116016i(Canvas canvas) {
        EventChipViewData eventChipViewData;
        if (this.f78438L.showAppendStr() && !TextUtils.isEmpty(this.f78438L.appendStr())) {
            m115999a(canvas, this.f78438L.appendStr());
        }
        if (this.f78438L.showEventStr() && (eventChipViewData = this.f78434H) != null) {
            String eventTitle = eventChipViewData.getEventTitle();
            String eventLocation = this.f78434H.getEventLocation();
            this.f78442P.setTextAlign(Paint.Align.LEFT);
            this.f78442P.setStrikeThruText(this.f78438L.textSTRIKE());
            if (this.f78436J) {
                this.f78442P.setColor(C32658j.m125333a(this.f78438L.getTextColor(), 0.5d));
            } else {
                this.f78442P.setColor(this.f78438L.getTextColor());
            }
            int i = this.f78452z;
            if (i == 1) {
                m116003a(canvas, eventTitle, true);
                m116010b(canvas, eventLocation);
            } else if (i == 2) {
                m116017j(canvas);
            } else {
                m116001a(canvas, eventTitle, eventLocation);
            }
        }
    }

    /* renamed from: k */
    private void m116018k(Canvas canvas) {
        EventChipViewData eventChipViewData = this.f78434H;
        if (eventChipViewData != null && eventChipViewData.needDrawEventFinishedMask()) {
            this.f78443Q = true;
            int a = C32658j.m125333a(C32634ae.m125178a(R.color.bg_body), (double) CalendarSkinColorTool.m124925b(C30022a.f74884c.mo108456c().getSkinType()));
            int i = f78414l;
            m116004a(ao.m125218a(a, new float[]{(float) i, (float) i, (float) i, (float) i}, 0, 0), canvas);
        }
    }

    /* renamed from: c */
    public void mo112562c(Canvas canvas) {
        EventChipViewData eventChipViewData = this.f78434H;
        if (eventChipViewData != null && eventChipViewData.isGoogleEventInstance()) {
            if (this.f78446a == null) {
                this.f78446a = ao.m125217a(getContext(), (int) R.drawable.ud_icon_google_filled, 16);
            }
            m115998a(canvas, this.f78446a);
        }
    }

    /* renamed from: e */
    public void mo112565e(Canvas canvas) {
        EventChipViewData eventChipViewData = this.f78434H;
        if (eventChipViewData != null && eventChipViewData.isLocalEventInstance()) {
            if (this.f78448c == null) {
                this.f78448c = ao.m125217a(getContext(), (int) R.drawable.ud_icon_cellphone_outlined, 16);
            }
            m115998a(canvas, this.f78448c);
        }
    }

    /* renamed from: b */
    public static void m116008b(Context context) {
        if (!f78408f) {
            f78409g = UIUtils.dp2px(context, 1.0f);
            f78410h = UIUtils.dp2px(context, 2.0f);
            f78411i = UIUtils.dp2px(context, 4.0f);
            f78412j = UIUtils.dp2px(context, 6.0f);
            f78413k = UIUtils.dp2px(context, 8.0f);
            f78414l = f78410h;
            f78415m = UIUtils.dp2px(context, 0.5f);
            f78416n = f78412j;
            f78417o = UIUtils.dp2px(context, (float) f78417o);
            f78418p = f78410h;
            f78419q = f78412j;
            f78420r = UIUtils.dp2px(context, 20.0f);
            f78421s = UIUtils.dp2px(context, 16.0f);
            f78422t = UIUtils.dp2px(context, 14.0f);
            f78423u = UIUtils.dp2px(context, 12.0f);
            f78424v = UIUtils.dp2px(context, 13.0f);
            f78425w = f78412j;
            f78426x = UIUtils.dp2px(context, 100.0f);
            f78408f = true;
        }
    }

    /* renamed from: j */
    private void m116017j(Canvas canvas) {
        TextPaint textPaint = new TextPaint(this.f78442P);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize((float) f78422t);
        TextPaint textPaint2 = new TextPaint(this.f78442P);
        textPaint2.setFakeBoldText(false);
        textPaint2.setTextSize((float) f78423u);
        Paint paint = new Paint();
        paint.setColor(this.f78438L.getHighlightColor());
        paint.setStyle(Paint.Style.FILL);
        EventChipViewData.C30802a thirdLineData = this.f78434H.getThirdLineData();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        m116005a(textPaint, paint, canvas, thirdLineData.f77464f, thirdLineData.f77467i, "", thirdLineData.f77459a, ((float) this.f78429C) - fontMetrics.top, (float) this.f78429C, (float) f78420r);
        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        m116005a(textPaint2, paint, canvas, thirdLineData.f77465g, thirdLineData.f77468j, thirdLineData.f77461c, thirdLineData.f77460b, ((float) ((this.f78429C + f78420r) + this.f78427A)) - fontMetrics2.top, (float) (this.f78429C + f78420r + this.f78427A), (float) f78421s);
        if (thirdLineData.f77470l) {
            m116005a(textPaint2, paint, canvas, thirdLineData.f77466h, thirdLineData.f77469k, thirdLineData.f77463e, thirdLineData.f77462d, ((float) (((this.f78429C + f78420r) + f78421s) + (this.f78427A * 2))) - fontMetrics2.top, (float) (this.f78429C + f78420r + f78421s + (this.f78427A * 2)), (float) f78421s);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo112560b(Canvas canvas) {
        if (this.f78438L.needDrawCalendar()) {
            this.f78451y.setColor(this.f78438L.getCalendarColor());
            int i = this.f78444R;
            int i2 = f78415m;
            int i3 = this.f78445S;
            canvas.drawRect((float) (i + i2), (float) (i3 + i2), (float) (f78418p + i + i2), (float) ((this.f78431E + i3) - i2), this.f78451y);
        }
    }

    /* renamed from: a */
    private void m116004a(Drawable drawable, Canvas canvas) {
        if (drawable != null) {
            int i = this.f78444R;
            int i2 = this.f78445S;
            drawable.setBounds(i, i2, this.f78430D + i, this.f78431E + i2);
            drawable.draw(canvas);
        }
    }

    public EventChipView(Context context, int i) {
        super(context);
        this.f78452z = i;
        mo112555a(context);
    }

    /* renamed from: a */
    private void m115997a(Canvas canvas, int i) {
        if (this.f78436J) {
            this.f78451y.setColor(C25633a.m91708b(C32634ae.m125178a(R.color.ud_N00), 0.8f));
            int i2 = this.f78444R;
            int i3 = this.f78445S;
            canvas.drawRect((float) i2, (float) i3, (float) (this.f78430D + i2), (float) (i + i3), this.f78451y);
        }
    }

    /* renamed from: b */
    private void m116009b(Canvas canvas, int i) {
        if ((this.f78434H instanceof DayEventChipViewData) && this.f78435I.mo110963a()) {
            this.f78451y.setColor(C25633a.m91708b(C32634ae.m125178a(R.color.ud_N400), 0.2f));
            int i2 = this.f78444R;
            int i3 = this.f78445S;
            canvas.drawRect((float) i2, (float) i3, (float) (this.f78430D + i2), (float) (i + i3), this.f78451y);
        }
    }

    /* renamed from: c */
    private void m116011c(Canvas canvas, int i) {
        if (isPressed()) {
            this.f78451y.setColor(C32658j.m125333a(C32634ae.m125178a(R.color.ud_N500), 0.1d));
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (this.f78430D + this.f78444R), (float) (i + this.f78445S), this.f78451y);
        }
    }

    public EventChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo112555a(context);
    }

    /* renamed from: a */
    private TreeSet<C31086a> m115996a(ArrayList<String> arrayList, String str) {
        int indexOf;
        TreeSet<C31086a> treeSet = new TreeSet<>(new Comparator<C31086a>() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView.C310851 */

            /* renamed from: a */
            public int compare(C31086a aVar, C31086a aVar2) {
                return aVar.f78454a - aVar2.f78454a;
            }
        });
        if (TextUtils.isEmpty(str)) {
            return treeSet;
        }
        String lowerCase = str.toLowerCase();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                int i = 0;
                while (i < lowerCase.length() && (indexOf = lowerCase.indexOf(next.toLowerCase(), i)) != -1) {
                    int length = next.length() + indexOf;
                    treeSet.add(new C31086a(indexOf, length));
                    i = length;
                }
            }
        }
        return treeSet;
    }

    /* renamed from: b */
    private void m116010b(Canvas canvas, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f78442P.setTextSize((float) f78423u);
            this.f78442P.setFakeBoldText(false);
            canvas.drawText(str, 0, this.f78442P.breakText(str, 0, str.length(), true, (float) ((this.f78430D - this.f78428B) + f78423u), null), (float) (this.f78428B + this.f78444R), (((float) ((this.f78429C + f78420r) + this.f78427A)) - this.f78442P.getFontMetrics().top) + ((float) this.f78445S), (Paint) this.f78442P);
        }
    }

    /* renamed from: a */
    private void m115998a(Canvas canvas, Bitmap bitmap) {
        int width = bitmap.getWidth();
        bitmap.getHeight();
        int i = this.f78430D - width;
        int i2 = f78417o;
        int i3 = (i - i2) + this.f78444R;
        int i4 = i2 + this.f78445S;
        if (this.f78449d == null) {
            this.f78449d = new Paint();
        }
        try {
            int alphaColor = UDColorUtils.getAlphaColor(this.f78438L.getLogoColor(), 0.4f);
            if (alphaColor != this.f78450e) {
                this.f78450e = alphaColor;
                this.f78449d.setColorFilter(new PorterDuffColorFilter(alphaColor, PorterDuff.Mode.SRC_IN));
            }
            canvas.drawBitmap(bitmap, (float) i3, (float) i4, this.f78449d);
        } catch (Exception e) {
            C3474b.m14692a(e);
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m115999a(Canvas canvas, String str) {
        this.f78442P.setColor(this.f78438L.getTextColor());
        this.f78442P.setStrikeThruText(this.f78438L.textSTRIKE());
        this.f78442P.setFakeBoldText(false);
        this.f78442P.setTextSize((float) f78424v);
        Paint.FontMetrics fontMetrics = this.f78442P.getFontMetrics();
        this.f78442P.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) ((this.f78430D / 2) + this.f78444R), ((((float) (this.f78431E / 2)) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)) + ((float) this.f78445S), this.f78442P);
    }

    /* renamed from: a */
    private void m116001a(Canvas canvas, String str, String str2) {
        this.f78442P.setFakeBoldText(false);
        this.f78442P.setTextSize((float) f78422t);
        Paint.FontMetrics fontMetrics = this.f78442P.getFontMetrics();
        if (!TextUtils.isEmpty(str2)) {
            this.f78442P.setFakeBoldText(false);
            this.f78442P.setTextSize((float) f78423u);
            Paint.FontMetrics fontMetrics2 = this.f78442P.getFontMetrics();
            int i = this.f78429C;
            int i2 = f78420r;
            int i3 = this.f78427A;
            int i4 = f78421s;
            int i5 = f78425w;
            float f = (float) (i + i2 + i3 + i4 + i5);
            float f2 = (float) (i + i2 + i3 + (i4 * 2) + i5);
            int i6 = this.f78431E;
            if (((float) i6) < f) {
                m116002a(canvas, str, str2, fontMetrics);
            } else if (((float) i6) < f || ((float) i6) >= f2) {
                m116000a(canvas, str, fontMetrics, str2, fontMetrics2);
            } else {
                m116003a(canvas, str, false);
                this.f78442P.setFakeBoldText(false);
                this.f78442P.setTextSize((float) f78423u);
                canvas.drawText(str2, 0, this.f78442P.breakText(str2, 0, str2.length(), true, (float) ((this.f78430D - this.f78428B) + f78423u), null), (float) (this.f78428B + this.f78444R), (((float) ((this.f78429C + f78420r) + this.f78427A)) - fontMetrics2.top) + ((float) this.f78445S), (Paint) this.f78442P);
            }
        } else if (!TextUtils.isEmpty(str)) {
            int i7 = this.f78431E;
            int i8 = (i7 - this.f78429C) - f78425w;
            int i9 = f78420r;
            if (i8 - i9 < i9) {
                m116003a(canvas, str, false);
            } else {
                m115995a(canvas, str, fontMetrics, (float) i7, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        this.f78431E = ((i2 - getPaddingTop()) - getPaddingBottom()) - this.f78432F;
        this.f78430D = paddingLeft;
        this.f78433G.reset();
        Path path = this.f78433G;
        int i5 = this.f78444R;
        int i6 = this.f78445S;
        RectF rectF = new RectF((float) i5, (float) i6, (float) (paddingLeft + i5), (float) (this.f78431E + i6));
        int i7 = f78414l;
        path.addRoundRect(rectF, new float[]{(float) i7, (float) i7, (float) i7, (float) i7, (float) i7, (float) i7, (float) i7, (float) i7}, Path.Direction.CW);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6 A[LOOP:0: B:4:0x0016->B:31:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9 A[EDGE_INSN: B:34:0x00b9->B:32:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m115995a(android.graphics.Canvas r16, java.lang.String r17, android.graphics.Paint.FontMetrics r18, float r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView.m115995a(android.graphics.Canvas, java.lang.String, android.graphics.Paint$FontMetrics, float, boolean):int");
    }

    /* renamed from: a */
    private void m116000a(Canvas canvas, String str, Paint.FontMetrics fontMetrics, String str2, Paint.FontMetrics fontMetrics2) {
        ArrayList arrayList;
        boolean z;
        int i;
        int i2;
        int length = str2.length();
        ArrayList arrayList2 = new ArrayList();
        float f = (float) (((this.f78431E - this.f78429C) - this.f78427A) - f78425w);
        int i3 = 0;
        while (f >= ((float) f78420r) && i3 < length) {
            while (i3 < str2.length() && Character.isWhitespace(str2.charAt(i3))) {
                i3++;
            }
            int breakText = this.f78442P.breakText(str2, i3, str2.length(), true, (float) ((this.f78430D - this.f78428B) - f78416n), null) + i3;
            if (breakText > 1 && breakText < length) {
                int i4 = breakText - 1;
                if (m116007a(str2.charAt(i4)) && m116007a(str2.charAt(breakText))) {
                    while (true) {
                        if (i4 <= i3) {
                            break;
                        }
                        char charAt = str2.charAt(i4);
                        if (Character.isWhitespace(charAt) || !m116007a(charAt)) {
                            i2 = i4 + 1;
                        } else {
                            i4--;
                        }
                    }
                    i2 = i4 + 1;
                    arrayList2.add(str2.substring(i3, i2));
                    f -= (float) f78421s;
                    i3 = i2;
                }
            }
            i2 = breakText;
            arrayList2.add(str2.substring(i3, i2));
            f -= (float) f78421s;
            i3 = i2;
        }
        if (i3 < length) {
            m116006a(arrayList2, canvas, fontMetrics2);
            m116003a(canvas, str, false);
        } else if (f < ((float) f78421s)) {
            m116006a(arrayList2, canvas, fontMetrics2);
            m116003a(canvas, str, false);
        } else {
            this.f78442P.setFakeBoldText(true);
            this.f78442P.setTextSize((float) f78422t);
            int i5 = f78420r;
            if (f - ((float) i5) < ((float) i5)) {
                z = false;
                m116003a(canvas, str, false);
                arrayList = arrayList2;
                i = 1;
            } else {
                z = false;
                arrayList = arrayList2;
                i = m115995a(canvas, str, fontMetrics, f, false);
            }
            this.f78442P.setFakeBoldText(z);
            this.f78442P.setTextSize((float) f78423u);
            int i6 = 0;
            while (i6 < arrayList.size()) {
                canvas.drawText(arrayList.get(i6), 0, arrayList.get(i6).length(), (float) (this.f78428B + this.f78444R), (((float) (((this.f78429C + (f78420r * i)) + this.f78427A) + (f78421s * i6))) - fontMetrics2.top) + ((float) this.f78445S), (Paint) this.f78442P);
                i6++;
                arrayList = arrayList;
            }
        }
    }
}
