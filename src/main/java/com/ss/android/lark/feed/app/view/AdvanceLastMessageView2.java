package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AdvanceLastMessageView2 extends AsyncMessageView {

    /* renamed from: i */
    private static final int f97246i;

    /* renamed from: j */
    private static final int f97247j;

    /* renamed from: k */
    private static final ExecutorService f97248k = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public volatile Layout f97249a;

    /* renamed from: b */
    public String f97250b;

    /* renamed from: c */
    public int f97251c;

    /* renamed from: e */
    public boolean f97252e;

    /* renamed from: f */
    public boolean f97253f;

    /* renamed from: g */
    public float f97254g;

    /* renamed from: h */
    public int f97255h;

    /* renamed from: l */
    private RunnableC37908a f97256l;

    static {
        int i;
        float f;
        if (DesktopUtil.m144307b()) {
            i = UIHelper.dp2px(16.0f);
        } else {
            i = LKUIDisplayManager.m91881c(UIHelper.getContext(), 16);
        }
        f97246i = i;
        if (DesktopUtil.m144307b()) {
            f = UIHelper.sp2px(C37967b.f97475t);
        } else {
            f = LKUIDisplayManager.m91864a(UIHelper.getContext(), (int) C37967b.f97475t);
        }
        f97247j = (int) f;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.view.AdvanceLastMessageView2$a */
    public class RunnableC37908a implements Runnable {

        /* renamed from: b */
        private volatile boolean f97258b;

        /* renamed from: a */
        public void mo138848a() {
            this.f97258b = true;
        }

        public void run() {
            try {
                if (!this.f97258b) {
                    Layout a = new TextLayoutBuilder().mo198144a((int) AdvanceLastMessageView2.this.f97254g).mo198152b(AdvanceLastMessageView2.this.f97255h).mo198154c((float) AdvanceLastMessageView2.this.getLineHeight()).mo198155c(1).mo198151b(1.0f).mo198143a((float) UIHelper.dp2px(2.5f)).mo198157d(AdvanceLastMessageView2.this.f97251c).mo198146a(Layout.Alignment.ALIGN_NORMAL).mo198153b(true).mo198150a(true).mo198149a(AdvanceLastMessageView2.m149153a(AdvanceLastMessageView2.this.f97250b, AdvanceLastMessageView2.this.f97251c, AdvanceLastMessageView2.this.getPaint(), AdvanceLastMessageView2.this.f97252e, AdvanceLastMessageView2.this.f97253f)).mo198142a();
                    if (!this.f97258b) {
                        AdvanceLastMessageView2.this.f97249a = a;
                        AdvanceLastMessageView2.this.postInvalidate();
                    }
                }
            } catch (Exception e) {
                Log.m165384e("AdvanceLastMessageView", "Precompute Text Failed.", e);
            }
        }

        private RunnableC37908a() {
        }
    }

    public AdvanceLastMessageView2(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f97249a != null) {
            canvas.save();
            this.f97249a.draw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    @Override // com.ss.android.lark.feed.app.view.AsyncMessageView
    /* renamed from: a */
    public void mo138842a(int i) {
        Log.m165389i("AdvanceLastMessageView", "update width, oldWidth=" + this.f97251c + "， newWidth=" + i);
        this.f97251c = i;
        mo138843a(this.f97250b, i, this.f97252e, this.f97253f);
    }

    public AdvanceLastMessageView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f97251c, getLineHeight());
    }

    public AdvanceLastMessageView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.ss.android.lark.feed.app.view.AsyncMessageView
    /* renamed from: a */
    public void mo138843a(String str, int i, boolean z, boolean z2) {
        this.f97250b = str;
        this.f97251c = i;
        this.f97252e = z;
        this.f97253f = z2;
        this.f97254g = getTextSize();
        this.f97255h = getCurrentTextColor();
        this.f97249a = null;
        RunnableC37908a aVar = this.f97256l;
        if (aVar != null) {
            aVar.mo138848a();
        }
        RunnableC37908a aVar2 = new RunnableC37908a();
        this.f97256l = aVar2;
        f97248k.submit(aVar2);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.text.SpannableStringBuilder, android.text.Spannable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m149153a(java.lang.String r2, int r3, android.text.TextPaint r4, boolean r5, boolean r6) {
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
            int r6 = com.ss.android.lark.feed.app.view.AdvanceLastMessageView2.f97246i
            r0 = 2
            int r1 = com.ss.android.lark.feed.app.view.AdvanceLastMessageView2.f97247j
            com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler.m226947a(r2, r5, r6, r0, r1)
            r2 = r5
        L_0x0026:
            float r3 = (float) r3
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r4, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.view.AdvanceLastMessageView2.m149153a(java.lang.String, int, android.text.TextPaint, boolean, boolean):java.lang.CharSequence");
    }
}
