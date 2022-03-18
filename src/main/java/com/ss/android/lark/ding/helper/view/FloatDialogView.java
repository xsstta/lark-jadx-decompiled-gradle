package com.ss.android.lark.ding.helper.view;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.ding.helper.AbstractC36654g;
import com.ss.android.lark.ding.helper.C36650c;
import com.ss.android.lark.ding.helper.C36651d;
import com.ss.android.lark.ding.helper.C36652e;
import com.ss.android.lark.ding.helper.C36653f;
import com.ss.android.lark.ding.helper.view.AbstractC36671c;
import com.ss.android.lark.ding.helper.view.C36664a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.floatwindow.AbstractC58451a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class FloatDialogView implements AbstractC36671c {

    /* renamed from: a */
    Map<Integer, AbstractC36654g> f94267a = new LinkedHashMap(4);

    /* renamed from: b */
    Context f94268b;

    /* renamed from: c */
    AbstractC36671c.AbstractC36672a f94269c;

    /* renamed from: d */
    public AbstractC36670b f94270d;

    /* renamed from: e */
    private boolean f94271e;

    /* renamed from: f */
    private boolean f94272f = false;

    /* renamed from: g */
    private int f94273g = 4;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PLAN {
    }

    /* renamed from: l */
    private void m144678l() {
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: b */
    public void mo135239b() {
        this.f94270d.mo135262d();
    }

    /* renamed from: i */
    private int m144675i() {
        return m144674h().mo135199b();
    }

    /* renamed from: j */
    private int m144676j() {
        return m144674h().mo135200c();
    }

    /* renamed from: m */
    private void m144679m() {
        this.f94270d.mo135256a(new C36664a.AbstractC36668a() {
            /* class com.ss.android.lark.ding.helper.view.FloatDialogView.C366636 */

            @Override // com.ss.android.lark.ding.helper.view.C36664a.AbstractC36668a
            /* renamed from: a */
            public void mo135250a(String str) {
                FloatDialogView.this.mo135241c();
            }
        });
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: c */
    public void mo135241c() {
        Log.m165389i("FloatDialogView", "dismiss");
        m144674h().mo135195a();
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: d */
    public void mo135243d() {
        this.f94270d.mo135263e();
        mo135241c();
    }

    /* renamed from: f */
    public void mo135247f() {
        Log.m165389i("FloatDialogView", "retryShowDingDialog");
        mo135245e();
    }

    /* renamed from: a */
    public void mo135233a() {
        this.f94273g = 4;
        Log.m165389i("FloatDialogView", "initDefaultPlan: " + this.f94273g);
    }

    /* renamed from: e */
    public void mo135245e() {
        Log.m165389i("FloatDialogView", "showFloatDialog");
        AbstractC36654g h = m144674h();
        h.mo135197a(this.f94270d.mo135253a());
        h.mo135198a(this.f94271e);
    }

    /* renamed from: h */
    private AbstractC36654g m144674h() {
        AbstractC36654g gVar = this.f94267a.get(Integer.valueOf(this.f94273g));
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException("Not exist the dialog plan " + this.f94273g);
    }

    /* renamed from: k */
    private void m144677k() {
        Log.m165389i("FloatDialogView", "closeFloatDialog + wrapper.hasChild() > " + this.f94270d.mo135260b());
        if (this.f94270d.mo135260b()) {
            this.f94270d.mo135262d();
            m144679m();
            return;
        }
        mo135241c();
    }

    /* renamed from: g */
    private void m144673g() {
        C36650c cVar = new C36650c(this.f94268b, new AbstractC36654g.AbstractC36655a() {
            /* class com.ss.android.lark.ding.helper.view.FloatDialogView.C366571 */

            @Override // com.ss.android.lark.ding.helper.AbstractC36654g.AbstractC36655a
            /* renamed from: a */
            public void mo135232a() {
                Log.m165389i("FloatDialogView", "initPlan onPlanShowFail");
                FloatDialogView.this.mo135233a();
                FloatDialogView.this.mo135247f();
            }
        });
        C36653f fVar = new C36653f(this.f94268b, null);
        C36651d dVar = new C36651d(this.f94268b, null);
        C36652e eVar = new C36652e(this.f94268b);
        this.f94267a.put(Integer.valueOf(cVar.mo135228d()), cVar);
        this.f94267a.put(Integer.valueOf(fVar.mo135231d()), fVar);
        this.f94267a.put(Integer.valueOf(dVar.mo135229d()), dVar);
        this.f94267a.put(Integer.valueOf(eVar.mo135230d()), eVar);
        mo135233a();
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: a */
    public void mo135238a(boolean z) {
        this.f94271e = z;
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: d */
    public void mo135244d(Stack<AbstractC58451a> stack) {
        m144672f(stack);
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: a */
    public void mo135234a(int i) {
        this.f94270d.mo135254a(i);
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: a */
    public void mo135235a(Activity activity) {
        m144674h().mo135196a(activity);
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: a */
    public void mo135236a(final AbstractC58451a aVar) {
        m144678l();
        this.f94270d.mo135255a(m144675i(), m144676j());
        mo135245e();
        this.f94270d.mo135253a().post(new Runnable() {
            /* class com.ss.android.lark.ding.helper.view.FloatDialogView.RunnableC366593 */

            public void run() {
                FloatDialogView.this.f94270d.mo135257a(aVar, new C36664a.AbstractC36668a() {
                    /* class com.ss.android.lark.ding.helper.view.FloatDialogView.RunnableC366593.C366601 */

                    @Override // com.ss.android.lark.ding.helper.view.C36664a.AbstractC36668a
                    /* renamed from: a */
                    public void mo135250a(String str) {
                        FloatDialogView.this.f94269c.mo135227a(str);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: b */
    public void mo135240b(Stack<AbstractC58451a> stack) {
        Log.m165389i("FloatDialogView", "showCurrentCard data.size > " + stack.size());
        this.f94272f = true;
        if (this.f94273g != 2 || this.f94270d.mo135253a() == null || !this.f94270d.mo135253a().isShown()) {
            m144672f(stack);
        }
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: c */
    public void mo135242c(final Stack<AbstractC58451a> stack) {
        if (!stack.empty()) {
            m144678l();
            this.f94270d.mo135255a(m144675i(), m144676j());
            mo135245e();
            this.f94270d.mo135258a(new Runnable() {
                /* class com.ss.android.lark.ding.helper.view.FloatDialogView.RunnableC366625 */

                public void run() {
                    if (!FloatDialogView.this.mo135246e(stack)) {
                        FloatDialogView.this.f94270d.mo135262d();
                        FloatDialogView.this.f94269c.mo135226a();
                    }
                }
            });
        } else if (this.f94270d.mo135260b()) {
            this.f94270d.mo135262d();
            m144679m();
        } else {
            mo135241c();
        }
    }

    /* renamed from: e */
    public boolean mo135246e(Stack<AbstractC58451a> stack) {
        if (!stack.isEmpty()) {
            return false;
        }
        this.f94270d.mo135262d();
        m144679m();
        return true;
    }

    /* renamed from: f */
    private void m144672f(final Stack<AbstractC58451a> stack) {
        Log.m165389i("FloatDialogView", "showResumeImpl data.size > " + stack.size());
        if (!stack.empty()) {
            m144678l();
            this.f94270d.mo135255a(m144675i(), m144676j());
            mo135245e();
            this.f94270d.mo135258a(new Runnable() {
                /* class com.ss.android.lark.ding.helper.view.FloatDialogView.RunnableC366614 */

                public void run() {
                    if (!FloatDialogView.this.mo135246e(stack)) {
                        boolean hasWindowFocus = FloatDialogView.this.f94270d.mo135253a().hasWindowFocus();
                        Log.m165389i("FloatDialogView", "showResumeImpl hasWindowFocus: " + hasWindowFocus);
                        try {
                            FloatDialogView.this.mo135241c();
                            FloatDialogView.this.mo135245e();
                        } catch (Exception e) {
                            Log.m165398w("FloatDialogView", "showResumeImpl Exception when ALREADY hasWindowFocus", e);
                        }
                    }
                }
            });
            return;
        }
        m144677k();
    }

    @Override // com.ss.android.lark.ding.helper.view.AbstractC36671c
    /* renamed from: a */
    public void mo135237a(final Stack<AbstractC58451a> stack) {
        Log.m165389i("FloatDialogView", "showCardList data.size > " + stack.size());
        if (!stack.empty()) {
            this.f94272f = true;
            m144678l();
            this.f94270d.mo135255a(m144675i(), m144676j());
            this.f94270d.mo135259a(stack);
            mo135245e();
            this.f94270d.mo135258a(new Runnable() {
                /* class com.ss.android.lark.ding.helper.view.FloatDialogView.RunnableC366582 */

                public void run() {
                    if (!FloatDialogView.this.mo135246e(stack)) {
                        Log.m165389i("FloatDialogView", "showCardList reset data.size > " + stack.size());
                        FloatDialogView.this.f94270d.mo135261c();
                    }
                }
            });
            return;
        }
        m144677k();
    }

    public FloatDialogView(Context context, AbstractC36671c.AbstractC36672a aVar) {
        this.f94268b = context;
        this.f94270d = new C36664a(context);
        this.f94269c = aVar;
        m144673g();
    }
}
