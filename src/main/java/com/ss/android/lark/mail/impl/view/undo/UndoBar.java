package com.ss.android.lark.mail.impl.view.undo;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43978c;

public class UndoBar<T> {

    /* renamed from: a */
    protected final Context f111562a;

    /* renamed from: b */
    protected final UndoBarView f111563b;

    /* renamed from: c */
    protected final AbstractC43978c f111564c;

    /* renamed from: d */
    protected final Handler f111565d = new Handler();

    /* renamed from: e */
    protected AbstractC43972b f111566e;

    /* renamed from: f */
    protected T f111567f;

    /* renamed from: g */
    protected CharSequence f111568g;

    /* renamed from: h */
    protected CharSequence f111569h;

    /* renamed from: i */
    protected long f111570i = 5000;

    /* renamed from: j */
    protected int f111571j = LocationRequest.PRIORITY_INDOOR;

    /* renamed from: k */
    protected Style f111572k;

    /* renamed from: l */
    protected int f111573l;

    /* renamed from: m */
    protected boolean f111574m;

    /* renamed from: n */
    private boolean f111575n;

    /* renamed from: o */
    private final Runnable f111576o = new Runnable() {
        /* class com.ss.android.lark.mail.impl.view.undo.UndoBar.RunnableC439671 */

        public void run() {
            UndoBar.this.mo156486f();
        }
    };

    /* renamed from: p */
    private final View.OnClickListener f111577p;

    /* renamed from: com.ss.android.lark.mail.impl.view.undo.UndoBar$b */
    public interface AbstractC43972b<T> {
        /* renamed from: b */
        void mo156457b(Context context, T t);

        /* renamed from: c */
        void mo156504c();

        /* renamed from: c */
        void mo156505c(Context context, T t);
    }

    public enum Style {
        DEFAULT(R.layout.mail_undo_holo_layout);
        
        private final int mLayoutResId;

        /* access modifiers changed from: package-private */
        public int getLayoutResId() {
            return this.mLayoutResId;
        }

        private Style(int i) {
            this.mLayoutResId = i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.undo.UndoBar$a */
    public static class C43971a<T> {

        /* renamed from: a */
        private Window f111582a;

        /* renamed from: b */
        private View f111583b;

        /* renamed from: c */
        private ViewGroup f111584c;

        /* renamed from: d */
        private Context f111585d;

        /* renamed from: e */
        private CharSequence f111586e;

        /* renamed from: f */
        private CharSequence f111587f;

        /* renamed from: g */
        private AbstractC43972b f111588g;

        /* renamed from: h */
        private T f111589h;

        /* renamed from: i */
        private long f111590i = 5000;

        /* renamed from: j */
        private int f111591j = LocationRequest.PRIORITY_INDOOR;

        /* renamed from: k */
        private Style f111592k;

        /* renamed from: l */
        private int f111593l = -1;

        /* renamed from: m */
        private boolean f111594m;

        /* renamed from: n */
        private boolean f111595n;

        /* renamed from: a */
        public Context mo156496a() {
            return this.f111585d;
        }

        /* renamed from: b */
        public UndoBar<T> mo156503b() {
            UndoBar<T> undoBar;
            Window window = this.f111582a;
            if (window != null) {
                undoBar = new UndoBar<>(window, this.f111592k);
            } else {
                ViewGroup viewGroup = this.f111584c;
                if (viewGroup != null) {
                    undoBar = new UndoBar<>(viewGroup, this.f111592k);
                } else {
                    undoBar = null;
                }
            }
            if (undoBar != null) {
                undoBar.mo156471a(this.f111588g);
                undoBar.mo156473a((Object) this.f111589h);
                undoBar.mo156472a(this.f111586e);
                CharSequence charSequence = this.f111587f;
                if (charSequence == null || charSequence.length() <= 0) {
                    undoBar.mo156469a((int) R.string.Mail_Toast_Undo);
                } else {
                    undoBar.mo156478b(this.f111587f);
                }
                undoBar.mo156474a(this.f111595n);
                undoBar.mo156470a(this.f111590i);
                undoBar.mo156477b(this.f111591j);
                undoBar.mo156481c(this.f111593l);
                undoBar.mo156479b(this.f111594m);
            }
            return undoBar;
        }

        /* renamed from: b */
        public C43971a mo156502b(CharSequence charSequence) {
            this.f111587f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C43971a mo156497a(long j) {
            this.f111590i = j;
            return this;
        }

        /* renamed from: a */
        public C43971a mo156498a(AbstractC43972b bVar) {
            this.f111588g = bVar;
            return this;
        }

        /* renamed from: a */
        public C43971a mo156499a(CharSequence charSequence) {
            this.f111586e = charSequence;
            return this;
        }

        /* renamed from: a */
        public C43971a mo156500a(T t) {
            this.f111589h = t;
            return this;
        }

        /* renamed from: a */
        public C43971a mo156501a(boolean z) {
            this.f111595n = z;
            return this;
        }

        public C43971a(Activity activity, Context context) {
            this.f111582a = activity.getWindow();
            this.f111585d = context;
        }

        public C43971a(Window window, Context context) {
            this.f111582a = window;
            this.f111585d = context;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo156488h() {
        mo156484d(false);
        mo156490j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo156489i() {
        AbstractC43972b bVar = this.f111566e;
        if (bVar != null) {
            bVar.mo156504c();
        }
    }

    /* renamed from: c */
    public void mo156480c() {
        mo156484d(true);
        this.f111568g = null;
        this.f111567f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo156483d() {
        this.f111564c.mo156528a((long) this.f111571j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo156485e() {
        this.f111564c.mo156529a((long) this.f111571j, new AbstractC43978c.AbstractC43979a() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBar.C439693 */

            @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43978c.AbstractC43979a
            /* renamed from: a */
            public void mo156493a() {
                ViewParent parent;
                UndoBar.this.f111563b.setVisibility(8);
                if (UndoBar.this.f111563b != null && (parent = UndoBar.this.f111563b.getParent()) != null) {
                    ViewParent parent2 = parent.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView((View) parent);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo156486f() {
        mo156480c();
        mo156489i();
        this.f111566e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo156487g() {
        AbstractC43972b bVar = this.f111566e;
        if (bVar != null) {
            bVar.mo156457b(this.f111562a, this.f111567f);
        }
        this.f111566e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo156490j() {
        AbstractC43972b bVar = this.f111566e;
        if (bVar != null) {
            bVar.mo156505c(this.f111562a, this.f111567f);
        }
    }

    /* renamed from: b */
    public void mo156476b() {
        this.f111563b.setMessage(C43819s.m173684a((int) R.string.Mail_Toast_UnDoing));
        this.f111563b.mo156506a();
        this.f111563b.setVisibility(0);
        this.f111564c.mo156527a(1.0f);
    }

    /* renamed from: a */
    public boolean mo156475a() {
        return mo156482c(true);
    }

    /* renamed from: a */
    public void mo156470a(long j) {
        this.f111570i = j;
    }

    /* renamed from: b */
    public void mo156477b(int i) {
        this.f111571j = i;
    }

    /* renamed from: c */
    public void mo156481c(int i) {
        this.f111573l = i;
    }

    /* renamed from: a */
    public void mo156471a(AbstractC43972b bVar) {
        this.f111566e = bVar;
    }

    /* renamed from: b */
    public void mo156478b(CharSequence charSequence) {
        this.f111569h = charSequence;
    }

    /* renamed from: a */
    public void mo156469a(int i) {
        this.f111569h = this.f111562a.getString(i);
    }

    /* renamed from: b */
    public void mo156479b(boolean z) {
        this.f111574m = z;
    }

    /* renamed from: a */
    private ViewGroup m174140a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(new FrameLayout.LayoutParams(-1, -1)));
        return frameLayout;
    }

    /* renamed from: d */
    public void mo156484d(boolean z) {
        this.f111565d.removeCallbacks(this.f111576o);
        if (z) {
            mo156485e();
            return;
        }
        this.f111564c.mo156527a(BitmapDescriptorFactory.HUE_RED);
        this.f111563b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UndoBarView mo156468a(Window window) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(16908290);
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        return mo156467a(viewGroup);
    }

    /* renamed from: c */
    public boolean mo156482c(boolean z) {
        this.f111563b.setButtonLabel(this.f111569h);
        this.f111563b.setMessage(this.f111568g);
        this.f111565d.removeCallbacks(this.f111576o);
        this.f111565d.postDelayed(this.f111576o, this.f111570i);
        this.f111563b.setVisibility(0);
        Log.m165389i("UndoBar", "show");
        if (z) {
            mo156483d();
            return true;
        }
        this.f111564c.mo156527a(1.0f);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UndoBarView mo156467a(ViewGroup viewGroup) {
        UndoBarView undoBarView = (UndoBarView) viewGroup.findViewById(R.id.mail_undoBar);
        if (undoBarView != null) {
            ViewParent parent = undoBarView.getParent();
            if (parent != null) {
                ViewParent parent2 = parent.getParent();
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView((View) parent);
                }
            }
            undoBarView = null;
        }
        if (undoBarView != null && undoBarView.getTag() == this.f111572k) {
            return undoBarView;
        }
        viewGroup.removeView(undoBarView);
        UndoBarView undoBarView2 = (UndoBarView) LayoutInflater.from(viewGroup.getContext()).inflate(this.f111572k.getLayoutResId(), viewGroup, false);
        undoBarView2.setTag(this.f111572k);
        ViewGroup a = m174140a(viewGroup.getContext());
        a.addView(undoBarView2);
        viewGroup.addView(a);
        a.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBar.View$OnTouchListenerC439704 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.m165389i("onUndoAction", "touch dismiss");
                if (UndoBar.this.f111563b != null && UndoBar.this.f111563b.getVisibility() == 0) {
                    UndoBar.this.mo156487g();
                }
                UndoBar.this.mo156486f();
                return false;
            }
        });
        return undoBarView2;
    }

    /* renamed from: a */
    public void mo156472a(CharSequence charSequence) {
        this.f111568g = charSequence;
    }

    /* renamed from: a */
    public void mo156473a(T t) {
        this.f111567f = t;
    }

    /* renamed from: a */
    public void mo156474a(boolean z) {
        this.f111575n = z;
    }

    public UndoBar(ViewGroup viewGroup, Style style) {
        View$OnClickListenerC439682 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBar.View$OnClickListenerC439682 */

            public void onClick(View view) {
                UndoBar.this.mo156488h();
            }
        };
        this.f111577p = r0;
        this.f111572k = Style.DEFAULT;
        this.f111573l = -1;
        style = style == null ? Style.DEFAULT : style;
        this.f111562a = viewGroup.getContext();
        this.f111572k = style;
        UndoBarView a = mo156467a(viewGroup);
        this.f111563b = a;
        a.setOnUndoClickListener(r0);
        this.f111564c = new C43980d(a);
        mo156484d(false);
    }

    public UndoBar(Window window, Style style) {
        View$OnClickListenerC439682 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.undo.UndoBar.View$OnClickListenerC439682 */

            public void onClick(View view) {
                UndoBar.this.mo156488h();
            }
        };
        this.f111577p = r0;
        this.f111572k = Style.DEFAULT;
        this.f111573l = -1;
        style = style == null ? Style.DEFAULT : style;
        this.f111562a = window.getContext();
        this.f111572k = style;
        UndoBarView a = mo156468a(window);
        this.f111563b = a;
        a.setOnUndoClickListener(r0);
        this.f111564c = new C43980d(a);
        mo156484d(false);
    }
}
