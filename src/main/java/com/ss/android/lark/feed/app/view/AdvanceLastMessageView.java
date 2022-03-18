package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AdvanceLastMessageView extends AsyncMessageView {

    /* renamed from: h */
    private static final int f97233h;

    /* renamed from: i */
    private static final int f97234i;

    /* renamed from: j */
    private static final ExecutorService f97235j = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public String f97236a;

    /* renamed from: b */
    public int f97237b;

    /* renamed from: c */
    public boolean f97238c;

    /* renamed from: e */
    public boolean f97239e;

    /* renamed from: f */
    public float f97240f;

    /* renamed from: g */
    public int f97241g;

    /* renamed from: k */
    private Future<Layout> f97242k;

    /* renamed from: l */
    private Layout f97243l;

    /* renamed from: m */
    private boolean f97244m;

    static {
        int i;
        float f;
        if (DesktopUtil.m144307b()) {
            i = UIHelper.dp2px(16.0f);
        } else {
            i = LKUIDisplayManager.m91881c(UIHelper.getContext(), 16);
        }
        f97233h = i;
        if (DesktopUtil.m144307b()) {
            f = UIHelper.sp2px(C37967b.f97475t);
        } else {
            f = LKUIDisplayManager.m91864a(UIHelper.getContext(), (int) C37967b.f97475t);
        }
        f97234i = (int) f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.view.AdvanceLastMessageView$a */
    public class CallableC37906a implements Callable<Layout> {
        /* renamed from: a */
        public Layout call() {
            try {
                return new TextLayoutBuilder().mo198144a((int) AdvanceLastMessageView.this.f97240f).mo198152b(AdvanceLastMessageView.this.f97241g).mo198155c(1).mo198151b(1.0f).mo198143a((float) UIHelper.dp2px(2.5f)).mo198157d(AdvanceLastMessageView.this.f97237b).mo198146a(Layout.Alignment.ALIGN_NORMAL).mo198153b(true).mo198150a(true).mo198149a(AdvanceLastMessageView.m149149a(AdvanceLastMessageView.this.f97236a, AdvanceLastMessageView.this.f97237b, AdvanceLastMessageView.this.getPaint(), AdvanceLastMessageView.this.f97238c, AdvanceLastMessageView.this.f97239e)).mo198142a();
            } catch (Exception e) {
                Log.m165384e("AdvanceLastMessageView", "Precompute Text Failed.", e);
                return null;
            }
        }

        private CallableC37906a() {
        }
    }

    public AdvanceLastMessageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f97244m || this.f97243l == null) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        this.f97243l.draw(canvas);
        canvas.restore();
    }

    @Override // com.ss.android.lark.feed.app.view.AsyncMessageView
    /* renamed from: a */
    public void mo138842a(int i) {
        Log.m165389i("AdvanceLastMessageView", "update width, oldWidth=" + this.f97237b + "， newWidth=" + i);
        this.f97237b = i;
        mo138843a(this.f97236a, i, this.f97238c, this.f97239e);
    }

    public AdvanceLastMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        int i3;
        Future<Layout> future = this.f97242k;
        if (future != null) {
            try {
                Layout layout = future.get(16, TimeUnit.MILLISECONDS);
                this.f97243l = layout;
                if (layout != null) {
                    if (layout.getLineCount() > 1) {
                        i3 = this.f97243l.getLineTop(1);
                    } else {
                        i3 = this.f97243l.getHeight();
                    }
                    setMeasuredDimension(this.f97237b, i3);
                    this.f97244m = true;
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(this.f97236a)) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f97244m = false;
        setText(m149149a(this.f97236a, this.f97237b, getPaint(), this.f97238c, this.f97239e));
        super.onMeasure(i, i2);
    }

    public AdvanceLastMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.ss.android.lark.feed.app.view.AsyncMessageView
    /* renamed from: a */
    public void mo138843a(String str, int i, boolean z, boolean z2) {
        this.f97236a = str;
        this.f97237b = i;
        this.f97238c = z;
        this.f97239e = z2;
        this.f97240f = getTextSize();
        this.f97241g = getCurrentTextColor();
        this.f97243l = null;
        this.f97244m = false;
        this.f97242k = f97235j.submit(new CallableC37906a());
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.text.SpannableStringBuilder, android.text.Spannable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m149149a(java.lang.String r2, int r3, android.text.TextPaint r4, boolean r5, boolean r6) {
        /*
            if (r6 != 0) goto L_0x0014
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = "["
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = "]"
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L_0x0026
        L_0x0014:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r2)
            android.content.Context r2 = com.ss.android.lark.utils.UIHelper.getContext()
            int r6 = com.ss.android.lark.feed.app.view.AdvanceLastMessageView.f97233h
            r0 = 1
            int r1 = com.ss.android.lark.feed.app.view.AdvanceLastMessageView.f97234i
            com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler.m226947a(r2, r5, r6, r0, r1)
            r2 = r5
        L_0x0026:
            float r3 = (float) r3
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r4, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.view.AdvanceLastMessageView.m149149a(java.lang.String, int, android.text.TextPaint, boolean, boolean):java.lang.CharSequence");
    }
}
