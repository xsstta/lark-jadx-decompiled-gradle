package com.bytedance.ee.bear.drive.biz.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.p030a.C0959c;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.p718t.C13751m;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommentRectLayout extends FrameLayout {

    /* renamed from: d */
    private static final int f17562d = C13749l.m55738a(100);

    /* renamed from: a */
    public RectF f17563a = new RectF();

    /* renamed from: b */
    public C6365b f17564b;

    /* renamed from: c */
    public Rect f17565c = new Rect();

    /* renamed from: e */
    private List<CommentRectF> f17566e = new ArrayList();

    /* renamed from: f */
    private List<CommentRectF> f17567f = new ArrayList();

    /* renamed from: g */
    private Paint f17568g = new Paint();

    /* renamed from: h */
    private Paint f17569h = new Paint();

    /* renamed from: i */
    private int f17570i = C13749l.m55738a(2);

    /* renamed from: j */
    private C0959c f17571j;

    /* renamed from: k */
    private boolean f17572k = false;

    /* renamed from: l */
    private boolean f17573l = true;

    /* renamed from: m */
    private boolean f17574m = false;

    /* renamed from: n */
    private boolean f17575n = false;

    /* renamed from: o */
    private boolean f17576o;

    /* renamed from: p */
    private float f17577p;

    /* renamed from: q */
    private float f17578q;

    /* renamed from: r */
    private int f17579r;

    /* renamed from: s */
    private String f17580s;

    /* renamed from: t */
    private PorterDuffXfermode f17581t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: u */
    private AbstractC6342a f17582u;

    /* renamed from: v */
    private ImageView f17583v;

    /* renamed from: w */
    private TextView f17584w;

    /* renamed from: x */
    private TextView f17585x;

    /* renamed from: y */
    private boolean f17586y = true;

    /* renamed from: com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout$a */
    public interface AbstractC6342a {
        /* renamed from: a */
        void mo25501a();

        /* renamed from: a */
        void mo25502a(boolean z);

        /* renamed from: b */
        void mo25503b();

        /* renamed from: b */
        void mo25504b(boolean z);
    }

    /* renamed from: a */
    private float m25516a(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public boolean getCommentRectVisible() {
        return this.f17572k;
    }

    public RectF getHostWholeRectF() {
        return this.f17563a;
    }

    /* renamed from: a */
    public void mo25486a(List<CommentRectF> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f17566e.clear();
        this.f17567f.clear();
        for (CommentRectF commentRectF : list) {
            this.f17566e.add(commentRectF);
            this.f17567f.add(new CommentRectF(commentRectF.mo25564c(), commentRectF.mo25555a(), m25516a(commentRectF.left), m25516a(commentRectF.top), m25516a(commentRectF.right), m25516a(commentRectF.bottom)));
        }
        C13479a.m54772d("DRIVE_COMMENT_FLOW", "comment rect layout target list=" + this.f17567f);
        m25523b(this.f17563a);
        if (this.f17572k) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo25485a(String str) {
        this.f17580s = str;
        invalidate();
    }

    /* renamed from: d */
    public void mo25490d() {
        this.f17580s = null;
        invalidate();
    }

    /* renamed from: b */
    public boolean mo25488b() {
        if (this.f17574m || this.f17575n) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m25529f() {
        setCommentRectVisible(true);
        this.f17574m = false;
        this.f17564b.setVisibility(8);
        this.f17585x.setVisibility(8);
        invalidate();
    }

    /* renamed from: g */
    private void m25530g() {
        setClickable(false);
        this.f17575n = false;
        m25529f();
        this.f17583v.setVisibility(8);
        this.f17584w.setVisibility(8);
        this.f17585x.setVisibility(8);
        this.f17565c.set(0, 0, 0, 0);
        AbstractC6342a aVar = this.f17582u;
        if (aVar != null) {
            aVar.mo25504b(false);
            this.f17582u.mo25502a(false);
        }
    }

    /* renamed from: c */
    public CommentRectF mo25489c() {
        CommentRectF commentRectF;
        if (!this.f17574m || this.f17564b.getVisibility() != 0) {
            commentRectF = null;
        } else {
            commentRectF = getCreateCommentRect();
        }
        m25530g();
        m25529f();
        C13479a.m54764b("DRIVE_COMMENT_FLOW", "CommentRectLayout create rect=" + commentRectF);
        return commentRectF;
    }

    /* renamed from: a */
    public void mo25482a() {
        setClickable(true);
        if (!this.f17575n) {
            this.f17575n = true;
            this.f17583v.setVisibility(0);
            this.f17584w.setVisibility(0);
            m25529f();
            setCommentRectVisible(false);
            AbstractC6342a aVar = this.f17582u;
            if (aVar != null) {
                aVar.mo25502a(true);
            }
        }
    }

    private CommentRectF getCreateCommentRect() {
        if (this.f17564b.getVisibility() != 0) {
            return null;
        }
        float width = this.f17563a.width();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (width <= BitmapDescriptorFactory.HUE_RED || this.f17563a.height() <= BitmapDescriptorFactory.HUE_RED) {
            C13479a.m54758a("CommentRectLayout", "getCreateCommentRect but whole width or height is zero");
            return null;
        }
        CommentRectF commentRectF = new CommentRectF();
        float top = (((float) this.f17564b.getTop()) - this.f17563a.top) + ((float) this.f17564b.getSideOffsetValue());
        float left = (((float) this.f17564b.getLeft()) - this.f17563a.left) + ((float) this.f17564b.getSideOffsetValue());
        float right = (((float) this.f17564b.getRight()) - this.f17563a.left) - ((float) this.f17564b.getSideOffsetValue());
        float bottom = (((float) this.f17564b.getBottom()) - this.f17563a.top) - ((float) this.f17564b.getSideOffsetValue());
        if (top < BitmapDescriptorFactory.HUE_RED) {
            top = BitmapDescriptorFactory.HUE_RED;
        }
        if (left < BitmapDescriptorFactory.HUE_RED) {
            left = BitmapDescriptorFactory.HUE_RED;
        }
        if (right < BitmapDescriptorFactory.HUE_RED) {
            right = BitmapDescriptorFactory.HUE_RED;
        }
        if (bottom >= BitmapDescriptorFactory.HUE_RED) {
            f = bottom;
        }
        commentRectF.set(m25516a(left / this.f17563a.width()), m25516a(top / this.f17563a.height()), m25516a(right / this.f17563a.width()), m25516a(f / this.f17563a.height()));
        return commentRectF;
    }

    /* renamed from: h */
    private boolean m25531h() {
        boolean z = false;
        if (this.f17564b.getVisibility() != 0) {
            return false;
        }
        int i = this.f17565c.left;
        int i2 = this.f17565c.top;
        int i3 = this.f17565c.right;
        int i4 = this.f17565c.bottom;
        boolean z2 = true;
        if (((float) i) < this.f17563a.left - ((float) this.f17564b.getSideOffsetValue())) {
            i = (int) ((this.f17563a.left - ((float) this.f17564b.getSideOffsetValue())) + 0.5f);
            z = true;
        }
        if (((float) i2) < this.f17563a.top - ((float) this.f17564b.getSideOffsetValue())) {
            i2 = (int) ((this.f17563a.top - ((float) this.f17564b.getSideOffsetValue())) + 0.5f);
            z = true;
        }
        if (((float) i3) > this.f17563a.right + ((float) this.f17564b.getSideOffsetValue())) {
            i3 = (int) (this.f17563a.right + ((float) this.f17564b.getSideOffsetValue()) + 0.5f);
            z = true;
        }
        if (((float) i4) > this.f17563a.bottom + ((float) this.f17564b.getSideOffsetValue())) {
            i4 = (int) (this.f17563a.bottom + ((float) this.f17564b.getSideOffsetValue()) + 0.5f);
        } else {
            z2 = z;
        }
        if (z2) {
            this.f17565c.set(i, i2, i3, i4);
        }
        return z2;
    }

    /* renamed from: e */
    private void m25528e() {
        setWillNotDraw(false);
        this.f17568g.setColor(getResources().getColor(R.color.ud_Y500));
        this.f17568g.setAntiAlias(true);
        this.f17568g.setStyle(Paint.Style.STROKE);
        this.f17568g.setStrokeWidth((float) this.f17570i);
        this.f17569h.setAntiAlias(true);
        this.f17569h.setColor(C25653b.m91893a(getResources().getColor(R.color.static_black), 0.6f));
        this.f17569h.setStyle(Paint.Style.FILL);
        this.f17564b = new C6365b(getContext());
        int i = f17562d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f17564b.setLayoutParams(layoutParams);
        this.f17564b.setVisibility(8);
        addView(this.f17564b);
        ImageView imageView = new ImageView(getContext());
        this.f17583v = imageView;
        C13751m.m55764a(imageView, getResources(), R.drawable.ud_icon_close_small_outlined, null, getResources().getColor(R.color.static_white));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C13749l.m55738a(24), C13749l.m55738a(24));
        layoutParams2.leftMargin = C13749l.m55738a(16);
        layoutParams2.topMargin = C13749l.m55738a(34);
        this.f17583v.setLayoutParams(layoutParams2);
        this.f17583v.setVisibility(8);
        this.f17583v.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$CommentRectLayout$au6ylVvmI9Hkujno_XHAv39Ua0 */

            public final void onClick(View view) {
                CommentRectLayout.m269342lambda$au6ylVvmI9Hkujno_XHAv39Ua0(CommentRectLayout.this, view);
            }
        });
        addView(this.f17583v);
        TextView textView = new TextView(getContext());
        this.f17584w = textView;
        textView.setText(getResources().getString(R.string.Drive_Drive_PrepareAreaCommentAdd));
        this.f17584w.setTextColor(-1);
        this.f17584w.setTextSize(14.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = C13749l.m55738a((int) SmActions.ACTION_ONTHECALL_EXIT);
        this.f17584w.setLayoutParams(layoutParams3);
        this.f17584w.setBackgroundDrawable(getResources().getDrawable(R.drawable.drive_bg_area_comment_add));
        this.f17584w.setVisibility(8);
        this.f17584w.setElevation((float) C13749l.m55738a(8));
        this.f17584w.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$CommentRectLayout$HcqqsI76zRqWkZ6DihqhCozARLY */

            public final void onClick(View view) {
                CommentRectLayout.lambda$HcqqsI76zRqWkZ6DihqhCozARLY(CommentRectLayout.this, view);
            }
        });
        addView(this.f17584w);
        setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$CommentRectLayout$dXeuuPgBAg1Do0KeIRP34br7RhE */

            public final void onClick(View view) {
                CommentRectLayout.lambda$dXeuuPgBAg1Do0KeIRP34br7RhE(CommentRectLayout.this, view);
            }
        });
        this.f17585x = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        layoutParams4.bottomMargin = C13749l.m55738a(20);
        this.f17585x.setLayoutParams(layoutParams4);
        this.f17585x.setText(getResources().getString(R.string.Drive_Drive_AreaCommentAddText));
        this.f17585x.setBackgroundDrawable(getResources().getDrawable(R.drawable.drive_bg_area_comment_add_text));
        this.f17585x.setTextColor(-1);
        this.f17585x.setTextSize(14.0f);
        this.f17585x.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$CommentRectLayout$a2ZCpx4TxLhlxjEr0Dqt9Depfgo */

            public final void onClick(View view) {
                CommentRectLayout.lambda$a2ZCpx4TxLhlxjEr0Dqt9Depfgo(CommentRectLayout.this, view);
            }
        });
        this.f17585x.setVisibility(8);
        addView(this.f17585x);
        setClickable(false);
        this.f17571j = C0959c.m4641a(this, 5.0f, new C0959c.AbstractC0962a() {
            /* class com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.C63411 */

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public boolean mo4900b(View view, int i) {
                if (view == CommentRectLayout.this.f17564b) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4893a(View view, float f, float f2) {
                super.mo4893a(view, f, f2);
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public int mo4890a(View view, int i, int i2) {
                float width;
                if (((float) i) < CommentRectLayout.this.f17563a.left - ((float) CommentRectLayout.this.f17564b.getSideOffsetValue())) {
                    width = CommentRectLayout.this.f17563a.left - ((float) CommentRectLayout.this.f17564b.getSideOffsetValue());
                } else {
                    if (((float) (CommentRectLayout.this.f17564b.getWidth() + i)) > CommentRectLayout.this.f17563a.right + ((float) CommentRectLayout.this.f17564b.getSideOffsetValue())) {
                        width = (CommentRectLayout.this.f17563a.right - ((float) CommentRectLayout.this.f17564b.getWidth())) + ((float) CommentRectLayout.this.f17564b.getSideOffsetValue());
                    }
                    int width2 = CommentRectLayout.this.f17565c.width();
                    CommentRectLayout.this.f17565c.left = i;
                    CommentRectLayout.this.f17565c.right = width2 + i;
                    CommentRectLayout.this.invalidate();
                    return i;
                }
                i = (int) (width + 0.5f);
                int width22 = CommentRectLayout.this.f17565c.width();
                CommentRectLayout.this.f17565c.left = i;
                CommentRectLayout.this.f17565c.right = width22 + i;
                CommentRectLayout.this.invalidate();
                return i;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public int mo4897b(View view, int i, int i2) {
                float height;
                if (((float) i) < CommentRectLayout.this.f17563a.top - ((float) CommentRectLayout.this.f17564b.getSideOffsetValue())) {
                    height = CommentRectLayout.this.f17563a.top - ((float) CommentRectLayout.this.f17564b.getSideOffsetValue());
                } else {
                    if (((float) (CommentRectLayout.this.f17564b.getHeight() + i)) > CommentRectLayout.this.f17563a.bottom + ((float) CommentRectLayout.this.f17564b.getSideOffsetValue())) {
                        height = (CommentRectLayout.this.f17563a.bottom - ((float) CommentRectLayout.this.f17564b.getHeight())) + ((float) CommentRectLayout.this.f17564b.getSideOffsetValue());
                    }
                    int height2 = CommentRectLayout.this.f17565c.height();
                    CommentRectLayout.this.f17565c.top = i;
                    CommentRectLayout.this.f17565c.bottom = height2 + i;
                    CommentRectLayout.this.invalidate();
                    return i;
                }
                i = (int) (height + 0.5f);
                int height22 = CommentRectLayout.this.f17565c.height();
                CommentRectLayout.this.f17565c.top = i;
                CommentRectLayout.this.f17565c.bottom = height22 + i;
                CommentRectLayout.this.invalidate();
                return i;
            }
        });
    }

    public void setCommentClickListener(AbstractC6342a aVar) {
        this.f17582u = aVar;
    }

    public void setEnableCommentRectClickable(boolean z) {
        this.f17573l = z;
    }

    public void setEnableCorrectMatrix(boolean z) {
        this.f17586y = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25520a(View view) {
        AbstractC6342a aVar = this.f17582u;
        if (aVar != null) {
            aVar.mo25503b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25524b(View view) {
        mo25483a(this.f17577p, this.f17578q);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m25525c(View view) {
        mo25483a(this.f17577p, this.f17578q);
    }

    public void setCommentRectVisible(boolean z) {
        this.f17572k = z;
        invalidate();
    }

    public void setDisableShowCommentRect(boolean z) {
        this.f17576o = z;
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m25527d(View view) {
        m25530g();
        AbstractC6342a aVar = this.f17582u;
        if (aVar != null) {
            aVar.mo25501a();
        }
    }

    public CommentRectLayout(Context context) {
        super(context);
        m25528e();
    }

    /* renamed from: b */
    private void m25523b(RectF rectF) {
        float f = rectF.right - rectF.left;
        float f2 = rectF.bottom - rectF.top;
        for (int i = 0; i < this.f17566e.size(); i++) {
            CommentRectF commentRectF = this.f17566e.get(i);
            float a = rectF.left + (m25516a(commentRectF.left) * f);
            float a2 = rectF.left + (m25516a(commentRectF.right) * f);
            float a3 = rectF.top + (m25516a(commentRectF.top) * f2);
            float a4 = rectF.top + (m25516a(commentRectF.bottom) * f2);
            if (i < this.f17567f.size()) {
                if (commentRectF.mo25564c() == 1) {
                    this.f17567f.get(i).mo25559a(commentRectF.mo25555a(), a, a3, a2, a4);
                } else if (commentRectF.mo25564c() == 2 || commentRectF.mo25564c() == 3) {
                    this.f17567f.get(i).mo25559a(commentRectF.mo25555a(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.onDraw(canvas);
        if (this.f17572k && !this.f17576o) {
            Iterator<CommentRectF> it = this.f17567f.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                CommentRectF next = it.next();
                if (!TextUtils.isEmpty(this.f17580s) && TextUtils.equals(this.f17580s, next.mo25555a())) {
                    if (next.mo25564c() == 1) {
                        m25518a(canvas, next.left, next.top, next.right, next.bottom, 0);
                    } else if (next.mo25564c() == 2 || next.mo25564c() == 3) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            for (CommentRectF commentRectF : this.f17567f) {
                if (commentRectF.mo25564c() == 1) {
                    canvas.drawRect(commentRectF, this.f17568g);
                } else if ((commentRectF.mo25564c() == 3 || commentRectF.mo25564c() == 2) && z2 && !z && this.f17563a.width() > BitmapDescriptorFactory.HUE_RED && this.f17563a.height() > BitmapDescriptorFactory.HUE_RED) {
                    canvas.drawRect(this.f17563a, this.f17568g);
                    z = true;
                }
            }
        }
        if (this.f17574m && this.f17564b.getVisibility() == 0) {
            m25518a(canvas, (float) this.f17564b.getLeft(), (float) this.f17564b.getTop(), (float) this.f17564b.getRight(), (float) this.f17564b.getBottom(), this.f17564b.getSidePadding() + this.f17564b.getTouchSideSize());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 != 3) goto L_0x01d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r16) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.comment.CommentRectLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo25484a(RectF rectF) {
        if (rectF != null && !rectF.equals(this.f17563a)) {
            C13479a.m54772d("CommentRectLayout", "onMatrixChanged() called with: rect = [" + rectF + "]");
            m25519a(this.f17563a, rectF);
            this.f17563a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            m25523b(this.f17563a);
            if (this.f17572k) {
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private boolean m25526c(float f, float f2) {
        return m25522a(f, f2, this.f17564b);
    }

    /* renamed from: b */
    public CommentRectF mo25487b(float f, float f2) {
        if (!this.f17572k) {
            return null;
        }
        for (int size = this.f17567f.size() - 1; size >= 0; size--) {
            CommentRectF commentRectF = this.f17567f.get(size);
            if (commentRectF.contains(f, f2)) {
                return commentRectF;
            }
        }
        return null;
    }

    public CommentRectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25528e();
    }

    /* renamed from: a */
    private void m25519a(RectF rectF, RectF rectF2) {
        if (this.f17564b.getVisibility() != 0) {
            return;
        }
        if (rectF.left <= BitmapDescriptorFactory.HUE_RED && rectF.top <= BitmapDescriptorFactory.HUE_RED && rectF.right <= BitmapDescriptorFactory.HUE_RED && rectF.bottom <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (this.f17565c.left > 0 || this.f17565c.top > 0 || this.f17565c.right > 0 || this.f17565c.bottom > 0) {
            float sidePadding = (((float) this.f17565c.left) - rectF.left) + ((float) this.f17564b.getSidePadding());
            float sidePadding2 = (((float) this.f17565c.top) - rectF.top) + ((float) this.f17564b.getSidePadding());
            float sidePadding3 = (((float) this.f17565c.right) - rectF.left) - ((float) this.f17564b.getSidePadding());
            float sidePadding4 = (((float) this.f17565c.bottom) - rectF.top) - ((float) this.f17564b.getSidePadding());
            float f = rectF.right - rectF.left;
            float f2 = rectF.bottom - rectF.top;
            float f3 = rectF2.right - rectF2.left;
            float f4 = rectF2.bottom - rectF2.top;
            float sidePadding5 = (rectF2.left + ((sidePadding / f) * f3)) - ((float) this.f17564b.getSidePadding());
            float sidePadding6 = rectF2.left + ((sidePadding3 / f) * f3) + ((float) this.f17564b.getSidePadding());
            float sidePadding7 = (rectF2.top + ((sidePadding2 / f2) * f4)) - ((float) this.f17564b.getSidePadding());
            float sidePadding8 = rectF2.top + (((sidePadding4 * 1.0f) / f2) * f4) + ((float) this.f17564b.getSidePadding());
            if (sidePadding6 - sidePadding5 < ((float) C6365b.f17622a)) {
                sidePadding6 = ((float) C6365b.f17622a) + sidePadding5;
            }
            if (sidePadding8 - sidePadding7 < ((float) C6365b.f17622a)) {
                sidePadding8 = ((float) C6365b.f17622a) + sidePadding7;
            }
            m25521a(this.f17586y, Math.round(sidePadding5), Math.round(sidePadding7), Math.round(sidePadding6), Math.round(sidePadding8));
        }
    }

    /* renamed from: a */
    public void mo25483a(float f, float f2) {
        setClickable(false);
        this.f17575n = false;
        this.f17584w.setVisibility(8);
        this.f17585x.setVisibility(0);
        setCommentRectVisible(false);
        ((FrameLayout.LayoutParams) this.f17564b.getLayoutParams()).gravity = 17;
        this.f17583v.setVisibility(0);
        this.f17574m = true;
        postDelayed(new Runnable(f, C13749l.m55736a() - C13749l.m55738a(80), f2) {
            /* class com.bytedance.ee.bear.drive.biz.comment.$$Lambda$CommentRectLayout$tEyNPbVJuIqV6O_ZvM07Q6vcZNg */
            public final /* synthetic */ float f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ float f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                CommentRectLayout.lambda$tEyNPbVJuIqV6O_ZvM07Q6vcZNg(CommentRectLayout.this, this.f$1, this.f$2, this.f$3);
            }
        }, 300);
        AbstractC6342a aVar = this.f17582u;
        if (aVar != null) {
            aVar.mo25504b(true);
        }
    }

    /* renamed from: a */
    private boolean m25522a(float f, float f2, View view) {
        if (view.getVisibility() != 0 || f < ((float) view.getLeft()) || f > ((float) view.getRight()) || f2 < ((float) view.getTop()) || f2 > ((float) view.getBottom())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25517a(float f, int i, float f2) {
        int i2 = 0;
        this.f17564b.setVisibility(0);
        float f3 = (float) (i / 2);
        int i3 = (int) (f - f3);
        int i4 = (int) (f2 - f3);
        int i5 = i3 + i;
        int i6 = i4 + i;
        if (i3 < 0) {
            i5 = i;
            i3 = 0;
        }
        if (i5 > getWidth()) {
            i5 = getWidth();
            i3 = i5 - i;
        }
        if (i4 < 0) {
            i6 = i;
        } else {
            i2 = i4;
        }
        if (i6 > getHeight()) {
            i6 = getHeight();
            i2 = i6 - i;
        }
        if (((float) i3) < this.f17563a.left - ((float) this.f17564b.getSideOffsetValue())) {
            i3 = (int) (this.f17563a.left - ((float) this.f17564b.getSideOffsetValue()));
            i5 = i3 + i;
        }
        if (((float) i2) < this.f17563a.top - ((float) this.f17564b.getSideOffsetValue())) {
            i2 = (int) (this.f17563a.top - ((float) this.f17564b.getSideOffsetValue()));
            i6 = i2 + i;
        }
        if (((float) i5) > this.f17563a.right + ((float) this.f17564b.getSideOffsetValue())) {
            i5 = (int) (this.f17563a.right + ((float) this.f17564b.getSideOffsetValue()));
            i3 = i5 - i;
        }
        if (((float) i6) > this.f17563a.bottom + ((float) this.f17564b.getSideOffsetValue())) {
            i6 = (int) (this.f17563a.bottom + ((float) this.f17564b.getSideOffsetValue()));
            i2 = i6 - i;
        }
        m25521a(true, i3, i2, i5, i6);
    }

    public CommentRectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25528e();
    }

    /* renamed from: a */
    private void m25521a(boolean z, int i, int i2, int i3, int i4) {
        this.f17565c.set(i, i2, i3, i4);
        if (z) {
            m25531h();
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f17564b.getVisibility() == 0) {
            this.f17564b.layout(this.f17565c.left, this.f17565c.top, this.f17565c.right, this.f17565c.bottom);
        }
    }

    /* renamed from: a */
    private void m25518a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        float f7;
        float f8;
        int saveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight(), null, 31);
        this.f17569h.setXfermode(null);
        if (this.f17563a.left < BitmapDescriptorFactory.HUE_RED) {
            f5 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f5 = this.f17563a.left;
        }
        if (this.f17563a.top < BitmapDescriptorFactory.HUE_RED) {
            f6 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f6 = this.f17563a.top;
        }
        if (this.f17563a.right > ((float) getWidth())) {
            f7 = (float) getWidth();
        } else {
            f7 = this.f17563a.right;
        }
        if (this.f17563a.bottom > ((float) getBottom())) {
            f8 = (float) getBottom();
        } else {
            f8 = this.f17563a.bottom;
        }
        canvas.drawRect(f5, f6, f7, f8, this.f17569h);
        this.f17569h.setXfermode(this.f17581t);
        float f9 = (float) i;
        canvas.drawRect(f + f9, f2 + f9, f3 - f9, f4 - f9, this.f17569h);
        canvas.restoreToCount(saveLayer);
    }
}
