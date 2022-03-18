package com.ss.android.lark.ding.helper.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout;
import java.util.Stack;

/* renamed from: com.ss.android.lark.ding.helper.view.a */
public class C36664a implements AbstractC36670b {

    /* renamed from: a */
    Context f94285a;

    /* renamed from: b */
    public DialogAnimationLayout f94286b;

    /* renamed from: c */
    private CountDownTimerC36669b f94287c;

    /* renamed from: com.ss.android.lark.ding.helper.view.a$a */
    public interface AbstractC36668a {
        /* renamed from: a */
        void mo135250a(String str);
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public View mo135253a() {
        return this.f94286b;
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: c */
    public void mo135261c() {
        DialogAnimationLayout dialogAnimationLayout = this.f94286b;
        if (dialogAnimationLayout != null) {
            dialogAnimationLayout.mo197908a();
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: d */
    public void mo135262d() {
        DialogAnimationLayout dialogAnimationLayout = this.f94286b;
        if (dialogAnimationLayout != null) {
            dialogAnimationLayout.mo197916e();
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: b */
    public boolean mo135260b() {
        DialogAnimationLayout dialogAnimationLayout = this.f94286b;
        if (dialogAnimationLayout == null || !dialogAnimationLayout.mo197915d()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: e */
    public void mo135263e() {
        DialogAnimationLayout dialogAnimationLayout = this.f94286b;
        if (dialogAnimationLayout != null) {
            dialogAnimationLayout.mo197911b();
        }
        CountDownTimerC36669b bVar = this.f94287c;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    /* renamed from: com.ss.android.lark.ding.helper.view.a$b */
    public static class CountDownTimerC36669b extends CountDownTimer {
        public void onFinish() {
        }

        public void onTick(long j) {
        }

        public CountDownTimerC36669b(long j) {
            super(j, j);
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135254a(int i) {
        DialogAnimationLayout dialogAnimationLayout = this.f94286b;
        if (dialogAnimationLayout != null) {
            dialogAnimationLayout.mo197909a(i, true);
        }
    }

    public C36664a(Context context) {
        this.f94285a = context;
        if (this.f94286b == null) {
            this.f94286b = new DialogAnimationLayout(context);
            if (DesktopUtil.m144301a(context)) {
                this.f94286b.setAppearWidth((int) context.getResources().getDimension(R.dimen.trans_layout_width));
                this.f94286b.setGravity(5);
            }
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135256a(final AbstractC36668a aVar) {
        if (this.f94286b != null) {
            mo135258a(new Runnable() {
                /* class com.ss.android.lark.ding.helper.view.C36664a.RunnableC366662 */

                public void run() {
                    C36664a.this.f94286b.setFinishListener(new DialogAnimationLayout.AbstractC58457b() {
                        /* class com.ss.android.lark.ding.helper.view.C36664a.RunnableC366662.C366671 */

                        @Override // com.ss.android.lark.widget.floatwindow.cardbag.DialogAnimationLayout.AbstractC58457b
                        /* renamed from: a */
                        public void mo135266a() {
                            if (aVar != null) {
                                aVar.mo135250a(null);
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135258a(Runnable runnable) {
        DialogAnimationLayout dialogAnimationLayout;
        if (runnable != null && (dialogAnimationLayout = this.f94286b) != null) {
            dialogAnimationLayout.post(runnable);
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135259a(Stack<AbstractC58451a> stack) {
        this.f94286b.mo197911b();
        for (int i = 0; i < stack.size(); i++) {
            this.f94286b.mo197910a(stack.get(i).mo117928a(this.f94285a));
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135255a(int i, int i2) {
        this.f94286b.setPadding(i2, i, i2, 0);
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36670b
    /* renamed from: a */
    public void mo135257a(AbstractC58451a aVar, AbstractC36668a aVar2) {
        if (aVar.mo117934d() && aVar.mo117935e() > 0) {
            m144698a(aVar.mo117929a(), aVar.mo117935e(), aVar2);
        }
        View a = aVar.mo117928a(this.f94285a);
        if (a != null) {
            this.f94286b.mo197913b(a);
        }
    }

    /* renamed from: a */
    private void m144698a(final String str, long j, final AbstractC36668a aVar) {
        CountDownTimerC36669b bVar = this.f94287c;
        if (bVar != null) {
            bVar.cancel();
        }
        CountDownTimerC366651 r0 = new CountDownTimerC36669b(j) {
            /* class com.ss.android.lark.ding.helper.view.C36664a.CountDownTimerC366651 */

            @Override // com.ss.android.lark.ding.helper.view.C36664a.CountDownTimerC36669b
            public void onFinish() {
                AbstractC36668a aVar = aVar;
                if (aVar != null) {
                    aVar.mo135250a(str);
                }
            }
        };
        this.f94287c = r0;
        r0.start();
    }
}
