package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.trace.p155a.C3069b;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.widget.recyclerview.FpsRecyclerView;

public class FpsRecyclerView extends RecyclerView {

    /* renamed from: a */
    public static final boolean f146098a = C37030f.m146093a().mo103027a("lark.android.full.fps");

    /* renamed from: b */
    public C3069b f146099b;

    /* renamed from: c */
    public C3069b f146100c;

    /* renamed from: d */
    public Runnable f146101d;

    /* renamed from: e */
    private int f146102e;

    /* renamed from: f */
    private C3069b f146103f;

    /* renamed from: g */
    private String f146104g;

    /* renamed from: h */
    private RecyclerView.OnScrollListener f146105h;

    /* renamed from: i */
    private InputMethodManager f146106i;

    /* renamed from: com.ss.android.lark.widget.recyclerview.FpsRecyclerView$a */
    public interface AbstractC58963a {
        /* renamed from: a */
        void mo200055a(double d);
    }

    /* renamed from: e */
    private void m228863e() {
        this.f146105h = new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.widget.recyclerview.FpsRecyclerView.C589602 */

            /* renamed from: a */
            boolean f146108a;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    this.f146108a = false;
                } else if (i == 1 && !this.f146108a) {
                    FpsRecyclerView.this.mo200045a();
                    this.f146108a = true ^ this.f146108a;
                }
            }
        };
    }

    /* renamed from: a */
    public void mo200045a() {
        getInputMethodManager().hideSoftInputFromWindow(getWindowToken(), 0);
        clearFocus();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnScrollListener(this.f146105h);
        if (f146098a) {
            m228865g();
        }
    }

    /* renamed from: d */
    private void m228862d() {
        if (this.f146100c == null) {
            this.f146100c = new C3069b(getSceneTag());
            addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.widget.recyclerview.FpsRecyclerView.C589591 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (FpsRecyclerView.this.f146100c != null) {
                        if (i != 0) {
                            FpsRecyclerView.this.f146100c.mo12923a();
                        } else {
                            FpsRecyclerView.this.f146100c.mo12926b();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo200047c() {
        if (f146098a && this.f146102e != 1) {
            m228864f();
            this.f146102e = 1;
            this.f146099b.mo12926b();
            UICallbackExecutor.removeCallbacks(this.f146101d);
            this.f146103f.mo12923a();
        }
    }

    public InputMethodManager getInputMethodManager() {
        if (this.f146106i == null) {
            this.f146106i = (InputMethodManager) getContext().getSystemService("input_method");
        }
        return this.f146106i;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f146098a) {
            m228864f();
        } else {
            m228862d();
        }
        addOnScrollListener(this.f146105h);
    }

    /* renamed from: f */
    private void m228864f() {
        if (this.f146103f == null) {
            this.f146103f = new C3069b(getSceneTag());
            this.f146099b = new C3069b(getSceneTag() + "_idle");
            addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.widget.recyclerview.FpsRecyclerView.C589613 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i != 0) {
                        FpsRecyclerView.this.mo200047c();
                    } else {
                        FpsRecyclerView.this.mo200046b();
                    }
                }
            });
            mo200046b();
        }
    }

    /* renamed from: g */
    private void m228865g() {
        if (f146098a && this.f146102e != 3) {
            this.f146102e = 3;
            UICallbackExecutor.removeCallbacks(this.f146101d);
            C3069b bVar = this.f146103f;
            if (bVar != null) {
                bVar.mo12926b();
            }
            C3069b bVar2 = this.f146099b;
            if (bVar2 != null) {
                bVar2.mo12926b();
            }
        }
    }

    /* renamed from: b */
    public void mo200046b() {
        if (f146098a && this.f146102e != 2) {
            m228864f();
            this.f146102e = 2;
            this.f146099b.mo12926b();
            this.f146103f.mo12926b();
            UICallbackExecutor.removeCallbacks(this.f146101d);
            this.f146101d.run();
        }
    }

    public String getSceneTag() {
        String str;
        String str2 = this.f146104g;
        if (str2 != null) {
            return str2;
        }
        String str3 = null;
        try {
            str = getResources().getResourceEntryName(((ViewGroup) getParent()).getId());
        } catch (Exception unused) {
            str = null;
        }
        try {
            str3 = getResources().getResourceEntryName(getId());
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = str3;
            }
            this.f146104g = str;
        } else {
            this.f146104g = str + "/" + str3;
        }
        if (TextUtils.isEmpty(this.f146104g)) {
            this.f146104g = "FpsRecyclerView";
        }
        return this.f146104g;
    }

    public final void setSceneTag(String str) {
        this.f146104g = str;
    }

    public FpsRecyclerView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDisplayHint(int i) {
        super.onDisplayHint(i);
        if (!f146098a) {
            return;
        }
        if (i == 0) {
            mo200046b();
        } else {
            m228865g();
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!f146098a) {
            return;
        }
        if (i == 0) {
            mo200046b();
        } else {
            m228865g();
        }
    }

    public void setFpsCallback(AbstractC58963a aVar) {
        C3069b bVar = this.f146100c;
        if (bVar != null) {
            aVar.getClass();
            bVar.mo12925a(new C3069b.AbstractC3076d() {
                /* class com.ss.android.lark.widget.recyclerview.$$Lambda$OF2wrj_TRQ7nwCCwJgZC19Qwzw */

                @Override // com.bytedance.apm.trace.p155a.C3069b.AbstractC3076d
                public final void fpsCallBack(double d) {
                    FpsRecyclerView.AbstractC58963a.this.mo200055a(d);
                }
            });
            return;
        }
        C3069b bVar2 = this.f146103f;
        if (bVar2 != null) {
            aVar.getClass();
            bVar2.mo12925a(new C3069b.AbstractC3076d() {
                /* class com.ss.android.lark.widget.recyclerview.$$Lambda$OF2wrj_TRQ7nwCCwJgZC19Qwzw */

                @Override // com.bytedance.apm.trace.p155a.C3069b.AbstractC3076d
                public final void fpsCallBack(double d) {
                    FpsRecyclerView.AbstractC58963a.this.mo200055a(d);
                }
            });
        }
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146102e = -1;
        this.f146101d = new Runnable() {
            /* class com.ss.android.lark.widget.recyclerview.FpsRecyclerView.RunnableC589624 */

            public void run() {
                if (FpsRecyclerView.f146098a && FpsRecyclerView.this.f146099b != null) {
                    FpsRecyclerView.this.f146099b.mo12926b();
                    FpsRecyclerView.this.f146099b.mo12923a();
                    UICallbackExecutor.executeDelayed(FpsRecyclerView.this.f146101d, 60000);
                }
            }
        };
        m228863e();
    }
}
