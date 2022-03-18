package com.ss.android.lark.mm.widget.selectable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47117q;
import com.ss.android.lark.ui.p2892a.C57582a;

public class SelectableTextHelper {

    /* renamed from: a */
    public C47163b f118887a;

    /* renamed from: b */
    public C47163b f118888b;

    /* renamed from: c */
    public C47167b f118889c = new C47167b();

    /* renamed from: d */
    public AbstractC47166a f118890d;

    /* renamed from: e */
    public Context f118891e;

    /* renamed from: f */
    public TextView f118892f;

    /* renamed from: g */
    public int f118893g = -1;

    /* renamed from: h */
    public int f118894h = -1;

    /* renamed from: i */
    public int f118895i;

    /* renamed from: j */
    public int f118896j;

    /* renamed from: k */
    public boolean f118897k;

    /* renamed from: l */
    public boolean f118898l = true;

    /* renamed from: m */
    public int f118899m = -1;

    /* renamed from: n */
    public int f118900n = -1;

    /* renamed from: o */
    ViewTreeObserver.OnScrollChangedListener f118901o;

    /* renamed from: p */
    private C47165d f118902p;

    /* renamed from: q */
    private View f118903q;

    /* renamed from: r */
    private Spannable f118904r;

    /* renamed from: s */
    private int f118905s;

    /* renamed from: t */
    private BackgroundColorSpan f118906t;

    /* renamed from: u */
    private C47162a f118907u;

    /* renamed from: v */
    private ViewTreeObserver.OnPreDrawListener f118908v;

    /* renamed from: w */
    private AbstractC47164c f118909w;

    /* renamed from: x */
    private final Runnable f118910x = new Runnable() {
        /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.RunnableC471617 */

        public void run() {
            if (!SelectableTextHelper.this.f118898l) {
                if (SelectableTextHelper.this.mo165818d() != null) {
                    SelectableTextHelper.this.mo165818d().mo165842a();
                }
                if (SelectableTextHelper.this.f118887a != null) {
                    SelectableTextHelper selectableTextHelper = SelectableTextHelper.this;
                    selectableTextHelper.mo165811a(selectableTextHelper.f118887a);
                }
                if (SelectableTextHelper.this.f118888b != null) {
                    SelectableTextHelper selectableTextHelper2 = SelectableTextHelper.this;
                    selectableTextHelper2.mo165811a(selectableTextHelper2.f118888b);
                }
            }
        }
    };

    public enum Mode {
        SUBTITLE_TRANSLATE,
        NORMAL,
        SUMMARY_TRANSLATE,
        SUBTITLE_TRANSLATE_PLAYING,
        UNCOMPLETED
    }

    /* renamed from: com.ss.android.lark.mm.widget.selectable.SelectableTextHelper$c */
    public interface AbstractC47164c {
        /* renamed from: a */
        Mode mo162159a();
    }

    /* renamed from: b */
    public C47167b mo165814b() {
        return this.f118889c;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mm.widget.selectable.SelectableTextHelper$b */
    public class C47163b extends View {

        /* renamed from: a */
        public boolean f118923a;

        /* renamed from: c */
        private PopupWindow f118925c;

        /* renamed from: d */
        private Paint f118926d;

        /* renamed from: e */
        private int f118927e;

        /* renamed from: f */
        private int f118928f;

        /* renamed from: g */
        private int f118929g;

        /* renamed from: h */
        private int f118930h = 25;

        /* renamed from: i */
        private int f118931i;

        /* renamed from: j */
        private int f118932j;

        /* renamed from: k */
        private int f118933k;

        /* renamed from: l */
        private int f118934l;

        /* renamed from: m */
        private int f118935m;

        /* renamed from: n */
        private int f118936n;

        /* renamed from: o */
        private int[] f118937o = new int[2];

        /* renamed from: a */
        public void mo165835a() {
            this.f118925c.dismiss();
        }

        /* renamed from: d */
        private void m186846d() {
            this.f118923a = !this.f118923a;
            invalidate();
        }

        /* renamed from: c */
        public int mo165839c() {
            return this.f118937o[1] + SelectableTextHelper.this.f118892f.getPaddingTop();
        }

        /* renamed from: b */
        public int mo165837b() {
            return (this.f118937o[0] - this.f118930h) + SelectableTextHelper.this.f118892f.getPaddingLeft();
        }

        /* renamed from: e */
        private void m186847e() {
            SelectableTextHelper.this.f118892f.getLocationInWindow(this.f118937o);
            Layout layout = SelectableTextHelper.this.f118892f.getLayout();
            if (this.f118923a) {
                this.f118925c.update((((int) layout.getPrimaryHorizontal(SelectableTextHelper.this.f118889c.f118944a)) - this.f118928f) + mo165837b(), layout.getLineBottom(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118944a)) + mo165839c(), -1, -1);
            } else {
                this.f118925c.update(((int) layout.getPrimaryHorizontal(SelectableTextHelper.this.f118889c.f118945b)) + mo165837b(), layout.getLineBottom(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118945b)) + mo165839c(), -1, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            int i = this.f118927e;
            canvas.drawCircle((float) (this.f118930h + i), (float) i, (float) i, this.f118926d);
            if (this.f118923a) {
                int i2 = this.f118927e;
                int i3 = this.f118930h;
                canvas.drawRect((float) (i2 + i3), BitmapDescriptorFactory.HUE_RED, (float) ((i2 * 2) + i3), (float) i2, this.f118926d);
                return;
            }
            int i4 = this.f118930h;
            int i5 = this.f118927e;
            canvas.drawRect((float) i4, BitmapDescriptorFactory.HUE_RED, (float) (i4 + i5), (float) i5, this.f118926d);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r0 != 3) goto L_0x0092;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r4) {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.C47163b.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public C47163b(boolean z) {
            super(SelectableTextHelper.this.f118891e);
            int i = SelectableTextHelper.this.f118896j / 2;
            this.f118927e = i;
            this.f118928f = i * 2;
            this.f118929g = i * 2;
            this.f118923a = z;
            Paint paint = new Paint(1);
            this.f118926d = paint;
            paint.setColor(SelectableTextHelper.this.f118895i);
            PopupWindow popupWindow = new PopupWindow(this);
            this.f118925c = popupWindow;
            popupWindow.setClippingEnabled(false);
            this.f118925c.setWidth(this.f118928f + (this.f118930h * 2));
            this.f118925c.setHeight(this.f118929g + (this.f118930h / 2));
            invalidate();
        }

        /* renamed from: a */
        public void mo165836a(int i, int i2) {
            int i3;
            SelectableTextHelper.this.f118892f.getLocationInWindow(this.f118937o);
            if (this.f118923a) {
                i3 = SelectableTextHelper.this.f118889c.f118944a;
            } else {
                i3 = SelectableTextHelper.this.f118889c.f118945b;
            }
            int a = C47168c.m186861a(SelectableTextHelper.this.f118892f, i, i2 - this.f118937o[1], i3);
            if (a != i3) {
                SelectableTextHelper.this.mo165820f();
                if (!this.f118923a) {
                    int i4 = this.f118933k;
                    if (a < i4) {
                        C47163b a2 = SelectableTextHelper.this.mo165807a(true);
                        a2.m186846d();
                        m186846d();
                        int i5 = this.f118933k;
                        this.f118934l = i5;
                        SelectableTextHelper.this.mo165817c(a, i5);
                        a2.m186847e();
                    } else {
                        SelectableTextHelper.this.mo165817c(i4, a);
                    }
                } else if (a > this.f118934l) {
                    C47163b a3 = SelectableTextHelper.this.mo165807a(false);
                    m186846d();
                    a3.m186846d();
                    int i6 = this.f118934l;
                    this.f118933k = i6;
                    SelectableTextHelper.this.mo165817c(i6, a);
                    a3.m186847e();
                } else {
                    SelectableTextHelper.this.mo165817c(a, -1);
                }
                m186847e();
            }
        }

        /* renamed from: b */
        public void mo165838b(int i, int i2) {
            int i3;
            SelectableTextHelper.this.f118892f.getLocationInWindow(this.f118937o);
            if (this.f118923a) {
                i3 = this.f118928f;
            } else {
                i3 = 0;
            }
            int f = C45950b.m182104a(SelectableTextHelper.this.f118891e).mo161322f();
            int g = C45950b.m182104a(SelectableTextHelper.this.f118891e).mo161323g();
            if (mo165839c() + i2 > f && mo165839c() + i2 < g - C57582a.m223600a(20)) {
                this.f118925c.showAtLocation(SelectableTextHelper.this.f118892f, 0, (i - i3) + mo165837b(), i2 + mo165839c());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mm.widget.selectable.SelectableTextHelper$d */
    public class C47165d {

        /* renamed from: b */
        private PopupWindow f118939b;

        /* renamed from: c */
        private int[] f118940c = new int[2];

        /* renamed from: d */
        private int f118941d;

        /* renamed from: e */
        private int f118942e;

        /* renamed from: f */
        private Context f118943f;

        /* renamed from: b */
        public void mo165843b() {
            this.f118939b.dismiss();
        }

        /* renamed from: a */
        public void mo165842a() {
            int i;
            int i2;
            int i3;
            int i4;
            this.f118939b.dismiss();
            SelectableTextHelper.this.f118892f.getLocationOnScreen(this.f118940c);
            Layout layout = SelectableTextHelper.this.f118892f.getLayout();
            if (layout != null) {
                int primaryHorizontal = ((int) layout.getPrimaryHorizontal(SelectableTextHelper.this.f118889c.f118944a)) + this.f118940c[0];
                int primaryHorizontal2 = ((int) layout.getPrimaryHorizontal(SelectableTextHelper.this.f118889c.f118945b)) + this.f118940c[0];
                if (layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118944a) == layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118945b)) {
                    i = primaryHorizontal2 - primaryHorizontal;
                } else if (SelectableTextHelper.this.mo165816c() == Mode.NORMAL) {
                    i = primaryHorizontal2;
                } else {
                    i = SelectableTextHelper.this.f118892f.getWidth();
                }
                int lineTop = layout.getLineTop(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118944a)) + this.f118940c[1];
                int f = C45950b.m182104a(this.f118943f).mo161322f();
                if (layout.getLineBottom(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118945b)) + this.f118940c[1] < f) {
                    C45855f.m181663b("SelectableTextHelper", "anchor not visible!");
                    return;
                }
                int g = C45950b.m182104a(this.f118943f).mo161323g();
                if (lineTop >= g) {
                    C45855f.m181663b("SelectableTextHelper", "anchor not visible!");
                    return;
                }
                if (SelectableTextHelper.this.f118887a != null) {
                    i2 = SelectableTextHelper.this.f118887a.getHeight();
                } else {
                    i2 = 0;
                }
                if (lineTop < f) {
                    i4 = layout.getLineBottom(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118945b)) + this.f118940c[1] + i2 + UIUtils.dp2px(this.f118943f, 16.0f);
                    i3 = (primaryHorizontal2 - (this.f118941d / 2)) - (i / 2);
                } else {
                    i4 = (layout.getLineTop(layout.getLineForOffset(SelectableTextHelper.this.f118889c.f118944a)) + this.f118940c[1]) - this.f118942e;
                    i3 = (primaryHorizontal + (i / 2)) - (this.f118941d / 2);
                }
                if (i3 <= 0) {
                    i3 = UIUtils.dp2px(this.f118943f, 16.0f);
                }
                if (i4 > g) {
                    i4 = UIUtils.dp2px(this.f118943f, 16.0f) + g;
                }
                if (i4 < f) {
                    i4 = f - this.f118942e;
                }
                if (this.f118941d + i3 > C47168c.m186858a(this.f118943f)) {
                    i3 = (C47168c.m186858a(this.f118943f) - this.f118941d) - UIUtils.dp2px(this.f118943f, 16.0f);
                }
                this.f118939b.setElevation(8.0f);
                this.f118939b.showAtLocation(SelectableTextHelper.this.f118892f, 0, i3, i4);
            }
        }

        public C47165d(Context context, View view) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f118943f = context;
            this.f118941d = view.getMeasuredWidth();
            this.f118942e = view.getMeasuredHeight();
            C47117q.m186583a(view);
            PopupWindow popupWindow = new PopupWindow(view, -2, -2, false);
            this.f118939b = popupWindow;
            popupWindow.setClippingEnabled(false);
        }
    }

    /* renamed from: g */
    public void mo165821g() {
        mo165820f();
        mo165819e();
    }

    /* renamed from: com.ss.android.lark.mm.widget.selectable.SelectableTextHelper$a */
    public static class C47162a {

        /* renamed from: a */
        public TextView f118918a;

        /* renamed from: b */
        public int f118919b = -15500842;

        /* renamed from: c */
        public int f118920c = -5250572;

        /* renamed from: d */
        public float f118921d = 24.0f;

        /* renamed from: e */
        public View f118922e;

        /* renamed from: a */
        public SelectableTextHelper mo165833a() {
            return new SelectableTextHelper(this);
        }

        /* renamed from: a */
        public C47162a mo165831a(float f) {
            this.f118921d = f;
            return this;
        }

        /* renamed from: b */
        public C47162a mo165834b(int i) {
            this.f118920c = i;
            return this;
        }

        /* renamed from: a */
        public C47162a mo165832a(int i) {
            this.f118919b = i;
            return this;
        }

        public C47162a(TextView textView, View view) {
            this.f118918a = textView;
            this.f118922e = view;
        }
    }

    /* renamed from: c */
    public Mode mo165816c() {
        AbstractC47164c cVar = this.f118909w;
        if (cVar == null) {
            return Mode.NORMAL;
        }
        return cVar.mo162159a();
    }

    /* renamed from: d */
    public C47165d mo165818d() {
        if (this.f118902p == null) {
            this.f118902p = new C47165d(this.f118891e, this.f118903q);
        }
        return this.f118902p;
    }

    /* renamed from: e */
    public void mo165819e() {
        this.f118898l = true;
        C47163b bVar = this.f118887a;
        if (bVar != null) {
            bVar.mo165835a();
        }
        C47163b bVar2 = this.f118888b;
        if (bVar2 != null) {
            bVar2.mo165835a();
        }
        if (mo165818d() != null) {
            mo165818d().mo165843b();
        }
    }

    /* renamed from: f */
    public void mo165820f() {
        BackgroundColorSpan backgroundColorSpan;
        this.f118889c.f118946c = null;
        this.f118899m = -1;
        this.f118900n = -1;
        Spannable spannable = this.f118904r;
        if (spannable != null && (backgroundColorSpan = this.f118906t) != null) {
            spannable.removeSpan(backgroundColorSpan);
            this.f118906t = null;
        }
    }

    /* renamed from: h */
    public void mo165822h() {
        this.f118892f.getViewTreeObserver().removeOnScrollChangedListener(this.f118901o);
        this.f118892f.getViewTreeObserver().removeOnPreDrawListener(this.f118908v);
        mo165820f();
        mo165819e();
        this.f118887a = null;
        this.f118888b = null;
        this.f118902p = null;
    }

    /* renamed from: a */
    public void mo165808a() {
        TextView textView = this.f118892f;
        textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
        this.f118892f.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.View$OnLongClickListenerC471551 */

            public boolean onLongClick(View view) {
                if (!(SelectableTextHelper.this.mo165816c() == Mode.SUBTITLE_TRANSLATE_PLAYING || SelectableTextHelper.this.mo165816c() == Mode.UNCOMPLETED)) {
                    if (SelectableTextHelper.this.f118890d != null) {
                        SelectableTextHelper.this.f118890d.mo162157a();
                    }
                    if (SelectableTextHelper.this.mo165816c() == Mode.NORMAL) {
                        SelectableTextHelper selectableTextHelper = SelectableTextHelper.this;
                        selectableTextHelper.mo165810a(selectableTextHelper.f118893g, SelectableTextHelper.this.f118894h);
                    } else if (SelectableTextHelper.this.mo165816c() == Mode.SUBTITLE_TRANSLATE || SelectableTextHelper.this.mo165816c() == Mode.SUMMARY_TRANSLATE) {
                        SelectableTextHelper selectableTextHelper2 = SelectableTextHelper.this;
                        selectableTextHelper2.mo165815b(0, selectableTextHelper2.f118892f.getText().length());
                    }
                }
                return true;
            }
        });
        this.f118892f.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.View$OnTouchListenerC471562 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                SelectableTextHelper.this.f118893g = (int) motionEvent.getX();
                SelectableTextHelper.this.f118894h = (int) motionEvent.getY();
                return false;
            }
        });
        this.f118892f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.View$OnClickListenerC471573 */

            public void onClick(View view) {
                C45855f.m181664c("SelectableTextHelper", "click textView");
                SelectableTextHelper.this.mo165820f();
                SelectableTextHelper.this.mo165819e();
            }
        });
        this.f118892f.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.View$OnAttachStateChangeListenerC471584 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                SelectableTextHelper.this.mo165822h();
            }
        });
        this.f118908v = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.ViewTreeObserver$OnPreDrawListenerC471595 */

            public boolean onPreDraw() {
                if (!SelectableTextHelper.this.f118897k) {
                    return true;
                }
                SelectableTextHelper.this.f118897k = false;
                SelectableTextHelper.this.mo165809a(100);
                return true;
            }
        };
        this.f118892f.getViewTreeObserver().addOnPreDrawListener(this.f118908v);
        this.f118901o = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.ViewTreeObserver$OnScrollChangedListenerC471606 */

            public void onScrollChanged() {
                if (!SelectableTextHelper.this.f118897k && !SelectableTextHelper.this.f118898l) {
                    SelectableTextHelper.this.f118897k = true;
                    if (SelectableTextHelper.this.mo165818d() != null) {
                        SelectableTextHelper.this.mo165818d().mo165843b();
                    }
                    if (SelectableTextHelper.this.f118887a != null) {
                        SelectableTextHelper.this.f118887a.mo165835a();
                    }
                    if (SelectableTextHelper.this.f118888b != null) {
                        SelectableTextHelper.this.f118888b.mo165835a();
                    }
                }
            }
        };
        this.f118892f.getViewTreeObserver().addOnScrollChangedListener(this.f118901o);
    }

    /* renamed from: a */
    public void mo165812a(AbstractC47164c cVar) {
        this.f118909w = cVar;
    }

    /* renamed from: a */
    public void mo165813a(AbstractC47166a aVar) {
        this.f118890d = aVar;
    }

    /* renamed from: a */
    public C47163b mo165807a(boolean z) {
        if (this.f118887a.f118923a == z) {
            return this.f118887a;
        }
        return this.f118888b;
    }

    /* renamed from: a */
    public void mo165809a(int i) {
        this.f118892f.removeCallbacks(this.f118910x);
        if (i <= 0) {
            this.f118910x.run();
        } else {
            this.f118892f.postDelayed(this.f118910x, (long) i);
        }
    }

    public SelectableTextHelper(C47162a aVar) {
        this.f118907u = aVar;
        TextView textView = aVar.f118918a;
        this.f118892f = textView;
        this.f118891e = textView.getContext();
        this.f118905s = aVar.f118920c;
        this.f118895i = aVar.f118919b;
        this.f118903q = aVar.f118922e;
        this.f118896j = C47168c.m186859a(this.f118891e, aVar.f118921d);
        mo165808a();
    }

    /* renamed from: a */
    public void mo165811a(C47163b bVar) {
        int i;
        Layout layout = this.f118892f.getLayout();
        if (layout != null) {
            if (bVar.f118923a) {
                i = this.f118889c.f118944a;
            } else {
                i = this.f118889c.f118945b;
            }
            bVar.mo165838b((int) layout.getPrimaryHorizontal(i), layout.getLineBottom(layout.getLineForOffset(i)));
        }
    }

    /* renamed from: a */
    public void mo165810a(int i, int i2) {
        if (i != -1 && i2 != -1) {
            int a = C47168c.m186860a(this.f118892f, i, i2);
            mo165815b(a, a + 1);
        }
    }

    /* renamed from: b */
    public void mo165815b(int i, int i2) {
        mo165819e();
        mo165820f();
        this.f118898l = false;
        if (mo165816c() == Mode.NORMAL) {
            if (this.f118887a == null) {
                this.f118887a = new C47163b(true);
            }
            if (this.f118888b == null) {
                this.f118888b = new C47163b(false);
            }
        }
        if (this.f118892f.getText() instanceof Spannable) {
            this.f118904r = (Spannable) this.f118892f.getText();
        }
        if (this.f118904r != null && i < this.f118892f.getText().length()) {
            mo165817c(i, i2);
            if (mo165816c() == Mode.NORMAL) {
                mo165811a(this.f118887a);
                mo165811a(this.f118888b);
            }
            if (mo165818d() != null) {
                mo165818d().mo165842a();
            }
        }
    }

    /* renamed from: c */
    public void mo165817c(int i, int i2) {
        if (i != -1) {
            this.f118889c.f118944a = i;
        }
        if (i2 != -1) {
            this.f118889c.f118945b = i2;
        }
        if (this.f118889c.f118944a > this.f118889c.f118945b) {
            int i3 = this.f118889c.f118944a;
            C47167b bVar = this.f118889c;
            bVar.f118944a = bVar.f118945b;
            this.f118889c.f118945b = i3;
        }
        this.f118899m = this.f118889c.f118944a;
        this.f118900n = this.f118889c.f118945b;
        C47167b bVar2 = this.f118889c;
        bVar2.f118946c = this.f118904r.subSequence(bVar2.f118944a, this.f118889c.f118945b).toString();
        if (!(this.f118904r == null || mo165816c() == Mode.SUBTITLE_TRANSLATE)) {
            if (this.f118906t == null) {
                this.f118906t = new BackgroundColorSpan(this.f118905s);
            }
            this.f118904r.setSpan(this.f118906t, this.f118889c.f118944a, this.f118889c.f118945b, 17);
        }
        AbstractC47166a aVar = this.f118890d;
        if (aVar != null) {
            aVar.mo162158a(this.f118889c.f118946c);
        }
    }
}
