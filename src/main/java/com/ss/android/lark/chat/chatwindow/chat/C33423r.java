package com.ss.android.lark.chat.chatwindow.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.p1660e.C33974e;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58983c;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.r */
public class C33423r extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    C33424a f86084a;

    /* renamed from: b */
    AbstractC58983c<ChatMessageVO> f86085b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.r$a */
    public static class C33424a {

        /* renamed from: b */
        private static final int f86086b = UIHelper.dp2px(1.0f);

        /* renamed from: c */
        private static final int f86087c = UIHelper.dp2px(0.5f);

        /* renamed from: d */
        private static final int f86088d = UIHelper.dp2px(0.6f);

        /* renamed from: e */
        private static final int f86089e = UIHelper.dp2px(9.0f);

        /* renamed from: f */
        private static final int f86090f;

        /* renamed from: g */
        private static final int f86091g;

        /* renamed from: h */
        private static final int f86092h;

        /* renamed from: i */
        private static final int f86093i;

        /* renamed from: j */
        private static final int f86094j;

        /* renamed from: k */
        private static final int f86095k;

        /* renamed from: l */
        private static final int f86096l;

        /* renamed from: m */
        private static final int f86097m;

        /* renamed from: n */
        private static final int f86098n;

        /* renamed from: o */
        private static final int f86099o;

        /* renamed from: p */
        private static final int f86100p;

        /* renamed from: q */
        private static final int f86101q = UIHelper.dp2px(14.0f);

        /* renamed from: r */
        private static final int f86102r;

        /* renamed from: s */
        private static final int f86103s = R.color.text_title;

        /* renamed from: t */
        private static final int f86104t = R.color.text_link_normal;

        /* renamed from: u */
        private static final int f86105u = R.color.text_title;

        /* renamed from: v */
        private static final int f86106v = R.color.text_link_normal;

        /* renamed from: w */
        private static final int f86107w = R.color.text_placeholder;

        /* renamed from: A */
        private boolean f86108A;

        /* renamed from: B */
        private boolean f86109B;

        /* renamed from: C */
        private long f86110C;

        /* renamed from: D */
        private final String f86111D;

        /* renamed from: E */
        private C33974e f86112E;

        /* renamed from: F */
        private int f86113F;

        /* renamed from: G */
        private final TextPaint f86114G;

        /* renamed from: H */
        private float f86115H = 14.0f;

        /* renamed from: I */
        private float f86116I = 14.0f;

        /* renamed from: J */
        private float f86117J = 20.0f;

        /* renamed from: K */
        private final int f86118K;

        /* renamed from: L */
        private final int f86119L;

        /* renamed from: M */
        private final int f86120M;

        /* renamed from: N */
        private final int f86121N;

        /* renamed from: O */
        private final int f86122O;

        /* renamed from: P */
        private final Rect f86123P;

        /* renamed from: Q */
        private final SparseArray<Drawable> f86124Q = new SparseArray<>();

        /* renamed from: a */
        public final int f86125a;

        /* renamed from: x */
        private final Context f86126x;

        /* renamed from: y */
        private String f86127y;

        /* renamed from: z */
        private String f86128z;

        /* renamed from: b */
        private int m129506b() {
            return f86094j + m129510d();
        }

        /* renamed from: c */
        private int m129508c() {
            return f86093i + m129510d();
        }

        /* renamed from: g */
        private Rect m129514g() {
            this.f86123P.setEmpty();
            return this.f86123P;
        }

        /* renamed from: d */
        private int m129510d() {
            return (int) (((float) 0) + this.f86116I + ((float) f86088d));
        }

        /* renamed from: f */
        private int m129513f() {
            return f86096l + 0 + f86102r + f86099o;
        }

        /* renamed from: e */
        private int m129512e() {
            this.f86114G.setTextSize(this.f86116I);
            return f86095k + 0 + f86101q + f86089e;
        }

        static {
            int dp2px = UIHelper.dp2px(10.0f);
            f86090f = dp2px;
            int dp2px2 = UIHelper.dp2px(15.0f);
            f86091g = dp2px2;
            int dp2px3 = UIHelper.dp2px(20.0f);
            f86092h = dp2px3;
            f86093i = dp2px;
            f86094j = dp2px;
            f86095k = dp2px;
            f86096l = dp2px3;
            f86097m = dp2px2;
            f86098n = dp2px2;
            f86099o = dp2px;
            f86100p = dp2px;
            f86102r = dp2px3;
        }

        /* renamed from: a */
        public int mo122991a() {
            int i;
            boolean z = this.f86108A;
            int i2 = 0;
            if (!z || !this.f86109B) {
                if (z) {
                    i2 = 0 + m129506b();
                }
                if (this.f86109B) {
                    i = m129508c() + i2;
                } else {
                    i = i2;
                }
            } else {
                i = m129512e() + 0;
            }
            if (this.f86110C != 0) {
                return i + m129513f();
            }
            return i;
        }

        /* renamed from: a */
        private Drawable m129503a(int i) {
            Drawable drawable = this.f86124Q.get(i);
            if (drawable != null) {
                return drawable;
            }
            Drawable c = C57582a.m223614c(this.f86126x, i);
            this.f86124Q.put(i, c);
            return c;
        }

        /* renamed from: a */
        public void mo122992a(Canvas canvas) {
            this.f86113F = 0;
            boolean z = this.f86108A;
            if (!z || !this.f86109B) {
                if (z) {
                    m129504a(canvas, this.f86114G);
                }
                if (this.f86109B) {
                    m129507b(canvas, this.f86114G);
                }
            } else {
                m129509c(canvas, this.f86114G);
            }
            if (this.f86110C != 0) {
                m129511d(canvas, this.f86114G);
            }
        }

        /* renamed from: a */
        public void mo122993a(C33974e eVar) {
            if (this.f86112E != eVar) {
                this.f86108A = eVar.mo124310b();
                this.f86109B = eVar.mo124312c();
                this.f86110C = eVar.mo124306a();
                this.f86127y = eVar.mo124313d();
                if (this.f86110C != 0) {
                    this.f86128z = eVar.mo124314e();
                }
                this.f86112E = eVar;
            }
        }

        /* renamed from: a */
        private void m129504a(Canvas canvas, Paint paint) {
            paint.setColor(this.f86118K);
            paint.setTextSize(this.f86116I);
            this.f86113F += f86094j;
            m129505a(canvas, paint, this.f86127y, m129503a(R.drawable.chat_window_time_gradient_right_to_left_label), m129503a(R.drawable.chat_window_time_gradient_left_to_right_label));
        }

        /* renamed from: b */
        private void m129507b(Canvas canvas, Paint paint) {
            paint.setColor(this.f86119L);
            paint.setTextSize(this.f86116I);
            this.f86113F += f86093i;
            m129505a(canvas, paint, this.f86111D, m129503a(R.drawable.chat_window_message_divider_gradient_right_to_left_label), m129503a(R.drawable.chat_window_message_divider_gradient_left_to_right_label));
        }

        protected C33424a(Context context, int i) {
            this.f86126x = context;
            this.f86125a = i;
            TextPaint textPaint = new TextPaint(1);
            this.f86114G = textPaint;
            textPaint.density = C57582a.m223603a(context).getDisplayMetrics().density;
            this.f86111D = C57582a.m223604a(context, (int) R.string.Lark_Legacy_NewMessageSign);
            this.f86118K = C57582a.m223616d(context, f86103s);
            this.f86119L = C57582a.m223616d(context, f86104t);
            this.f86120M = C57582a.m223616d(context, f86105u);
            this.f86121N = C57582a.m223616d(context, f86106v);
            this.f86122O = C57582a.m223616d(context, f86107w);
            this.f86115H = LKUIDisplayManager.m91864a(context, (int) this.f86115H);
            this.f86116I = LKUIDisplayManager.m91864a(context, (int) this.f86116I);
            this.f86117J = LKUIDisplayManager.m91864a(context, (int) this.f86117J);
            this.f86123P = new Rect();
        }

        /* renamed from: c */
        private void m129509c(Canvas canvas, Paint paint) {
            paint.setColor(this.f86120M);
            paint.setTextSize(this.f86116I);
            this.f86113F += f86095k;
            Rect g = m129514g();
            String str = this.f86127y;
            paint.getTextBounds(str, 0, str.length(), g);
            canvas.drawText(this.f86127y, (float) f86097m, (float) (this.f86113F + g.height()), paint);
            paint.setColor(this.f86121N);
            Rect g2 = m129514g();
            String str2 = this.f86111D;
            paint.getTextBounds(str2, 0, str2.length(), g2);
            canvas.drawText(this.f86111D, (float) ((this.f86125a - f86098n) - g2.width()), (float) (this.f86113F + g2.height()), paint);
            int height = this.f86113F + g.height() + f86089e;
            this.f86113F = height;
            int i = this.f86125a;
            int i2 = f86086b;
            Drawable a = m129503a(R.drawable.chat_window_message_divider_gradient_date_and_message_label);
            a.setBounds(0, height, i + 0, i2 + height);
            a.draw(canvas);
        }

        /* renamed from: d */
        private void m129511d(Canvas canvas, Paint paint) {
            paint.setColor(this.f86122O);
            paint.setTextSize(this.f86115H);
            int i = this.f86113F;
            int i2 = f86096l;
            this.f86113F = i + i2;
            Rect g = m129514g();
            String str = this.f86128z;
            paint.getTextBounds(str, 0, str.length(), g);
            canvas.drawText(this.f86128z, (float) ((this.f86125a - g.width()) / 2), (float) (this.f86113F + g.height() + ((i2 - g.height()) / 2)), paint);
            this.f86113F = (int) (((float) this.f86113F) + this.f86117J);
        }

        /* renamed from: a */
        private void m129505a(Canvas canvas, Paint paint, String str, Drawable drawable, Drawable drawable2) {
            Rect g = m129514g();
            paint.getTextBounds(str, 0, str.length(), g);
            int i = f86097m;
            int i2 = this.f86113F;
            int height = g.height();
            int i3 = f86086b;
            int i4 = i2 + ((height - i3) / 2);
            int i5 = f86100p;
            int width = ((this.f86125a + g.width()) / 2) + i5;
            int height2 = this.f86113F + ((g.height() - i3) / 2);
            int width2 = (((this.f86125a - g.width()) / 2) - i) - i5;
            if (DesktopUtil.m144301a(this.f86126x)) {
                i3 = f86087c;
            }
            int width3 = (((this.f86125a - g.width()) / 2) - f86098n) - i5;
            int height3 = this.f86113F + g.height();
            int i6 = f86088d;
            drawable.setBounds(i, i4, width2 + i, i4 + i3);
            drawable.draw(canvas);
            drawable2.setBounds(width, height2, width3 + width, i3 + height2);
            drawable2.draw(canvas);
            canvas.drawText(str, (float) ((this.f86125a - g.width()) / 2), (float) (height3 - i6), paint);
            this.f86113F += g.height() + i6;
        }
    }

    public C33423r(AbstractC58983c<ChatMessageVO> cVar) {
        this.f86085b = cVar;
    }

    /* renamed from: a */
    private C33424a m129502a(ViewGroup viewGroup, C33974e eVar) {
        C33424a aVar = this.f86084a;
        if (aVar == null || aVar.f86125a != viewGroup.getMeasuredWidth()) {
            this.f86084a = new C33424a(viewGroup.getContext(), viewGroup.getMeasuredWidth());
        }
        this.f86084a.mo122993a(eVar);
        return this.f86084a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        C33974e q;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (!(childAdapterPosition == -1 || childAdapterPosition >= this.f86085b.getItemCount() || (q = this.f86085b.mo31276a(childAdapterPosition).mo124282q()) == null)) {
                canvas.save();
                C33424a a = m129502a(recyclerView, q);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (((float) childAt.getTop()) + ((float) ((int) (childAt.getTranslationY() + 0.5f)))) - ((float) a.mo122991a()));
                a.mo122992a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition < this.f86085b.getItemCount()) {
            ChatMessageVO a = this.f86085b.mo31276a(childAdapterPosition);
            if (a.mo124282q() != null) {
                rect.set(0, m129502a(recyclerView, a.mo124282q()).mo122991a(), 0, 0);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }
}
