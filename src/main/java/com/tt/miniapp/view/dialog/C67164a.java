package com.tt.miniapp.view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;
import java.lang.ref.WeakReference;

/* renamed from: com.tt.miniapp.view.dialog.a */
public class C67164a {

    /* renamed from: A */
    private boolean f169362A;

    /* renamed from: B */
    private CharSequence f169363B;

    /* renamed from: C */
    private CharSequence f169364C;

    /* renamed from: D */
    private CharSequence f169365D;

    /* renamed from: E */
    private int f169366E;

    /* renamed from: F */
    private Drawable f169367F;

    /* renamed from: G */
    private ImageView f169368G;

    /* renamed from: H */
    private TextView f169369H;

    /* renamed from: I */
    private TextView f169370I;

    /* renamed from: J */
    private View f169371J;

    /* renamed from: K */
    private boolean f169372K;

    /* renamed from: L */
    private int f169373L;

    /* renamed from: M */
    private int f169374M;

    /* renamed from: N */
    private int f169375N;

    /* renamed from: O */
    private final View.OnClickListener f169376O = new View.OnClickListener() {
        /* class com.tt.miniapp.view.dialog.C67164a.View$OnClickListenerC671651 */

        public void onClick(View view) {
            Message message;
            if (view == C67164a.this.f169380d && C67164a.this.f169381e != null) {
                message = Message.obtain(C67164a.this.f169381e);
            } else if (view == C67164a.this.f169382f && C67164a.this.f169383g != null) {
                message = Message.obtain(C67164a.this.f169383g);
            } else if (view != C67164a.this.f169384h || C67164a.this.f169385i == null) {
                message = null;
            } else {
                message = Message.obtain(C67164a.this.f169385i);
            }
            if (message != null) {
                message.sendToTarget();
            }
            C67164a.this.f169393q.obtainMessage(1, C67164a.this.f169378b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f169377a;

    /* renamed from: b */
    public final DialogInterface f169378b;

    /* renamed from: c */
    public ListView f169379c;

    /* renamed from: d */
    public Button f169380d;

    /* renamed from: e */
    public Message f169381e;

    /* renamed from: f */
    public Button f169382f;

    /* renamed from: g */
    public Message f169383g;

    /* renamed from: h */
    public Button f169384h;

    /* renamed from: i */
    public Message f169385i;

    /* renamed from: j */
    public ScrollView f169386j;

    /* renamed from: k */
    public ListAdapter f169387k;

    /* renamed from: l */
    public int f169388l = -1;

    /* renamed from: m */
    public int f169389m;

    /* renamed from: n */
    public int f169390n;

    /* renamed from: o */
    public int f169391o;

    /* renamed from: p */
    public int f169392p;

    /* renamed from: q */
    public Handler f169393q;

    /* renamed from: r */
    private final Window f169394r;

    /* renamed from: s */
    private CharSequence f169395s;

    /* renamed from: t */
    private CharSequence f169396t;

    /* renamed from: u */
    private View f169397u;

    /* renamed from: v */
    private int f169398v;

    /* renamed from: w */
    private int f169399w;

    /* renamed from: x */
    private int f169400x;

    /* renamed from: y */
    private int f169401y;

    /* renamed from: z */
    private int f169402z;

    /* renamed from: a */
    private static boolean m261807a(Context context) {
        return false;
    }

    /* renamed from: a */
    public void mo233543a(CharSequence charSequence) {
        this.f169395s = charSequence;
        TextView textView = this.f169369H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo233542a(View view, int i, int i2, int i3, int i4) {
        this.f169397u = view;
        this.f169398v = 0;
        this.f169362A = true;
        this.f169399w = i;
        this.f169400x = i2;
        this.f169401y = i3;
        this.f169402z = i4;
    }

    /* renamed from: a */
    public void mo233541a(Drawable drawable) {
        this.f169367F = drawable;
        this.f169366E = 0;
        ImageView imageView = this.f169368G;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public boolean mo233545a(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.f169386j;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    /* renamed from: b */
    private int m261810b() {
        int i = this.f169374M;
        if (i == 0) {
            return this.f169373L;
        }
        if (this.f169375N == 1) {
            return i;
        }
        return this.f169373L;
    }

    /* renamed from: d */
    private boolean m261813d() {
        boolean z;
        Button button = (Button) this.f169394r.findViewById(R.id.microapp_m_button1);
        this.f169380d = button;
        button.setOnClickListener(this.f169376O);
        if (TextUtils.isEmpty(this.f169363B)) {
            this.f169380d.setVisibility(8);
            z = false;
        } else {
            this.f169380d.setText(this.f169363B);
            this.f169380d.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) this.f169394r.findViewById(R.id.microapp_m_button2);
        this.f169382f = button2;
        button2.setOnClickListener(this.f169376O);
        if (TextUtils.isEmpty(this.f169364C)) {
            this.f169382f.setVisibility(8);
        } else {
            this.f169382f.setText(this.f169364C);
            this.f169382f.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) this.f169394r.findViewById(R.id.microapp_m_button3);
        this.f169384h = button3;
        button3.setOnClickListener(this.f169376O);
        if (TextUtils.isEmpty(this.f169365D)) {
            this.f169384h.setVisibility(8);
        } else {
            this.f169384h.setText(this.f169365D);
            this.f169384h.setVisibility(0);
            z |= true;
        }
        if (m261807a(this.f169377a)) {
            if (z) {
                m261806a(this.f169380d);
            } else if (z) {
                m261806a(this.f169382f);
            } else if (z) {
                m261806a(this.f169384h);
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m261812c() {
        boolean z;
        View view;
        ListView listView;
        ViewGroup viewGroup = (ViewGroup) this.f169394r.findViewById(R.id.microapp_m_contentPanel);
        m261811b(viewGroup);
        boolean d = m261813d();
        ViewGroup viewGroup2 = (ViewGroup) this.f169394r.findViewById(R.id.microapp_m_topPanel);
        boolean a = m261809a(viewGroup2);
        View findViewById = this.f169394r.findViewById(R.id.microapp_m_buttonPanel);
        if (!d) {
            findViewById.setVisibility(8);
            if (!(this.f169396t != null || (listView = this.f169379c) == null || listView.getParent() == null)) {
                ListView listView2 = this.f169379c;
                listView2.setPadding(listView2.getPaddingLeft(), this.f169379c.getPaddingTop(), this.f169379c.getPaddingRight(), this.f169379c.getPaddingTop());
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.f169394r.findViewById(R.id.microapp_m_customPanel);
        View view2 = this.f169397u;
        boolean z2 = false;
        if (view2 == null) {
            if (this.f169398v != 0) {
                view2 = LayoutInflater.from(this.f169377a).inflate(this.f169398v, (ViewGroup) frameLayout, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m261808a(view2)) {
            this.f169394r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout2 = (FrameLayout) this.f169394r.findViewById(R.id.microapp_m_custom);
            frameLayout2.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (this.f169362A) {
                frameLayout2.setPadding(this.f169399w, this.f169400x, this.f169401y, this.f169402z);
            }
            if (this.f169379c != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            frameLayout.setVisibility(8);
        }
        if (a) {
            if (this.f169396t == null && view2 == null && this.f169379c == null) {
                view = this.f169394r.findViewById(R.id.microapp_m_titleDividerTop);
            } else {
                view = this.f169394r.findViewById(R.id.microapp_m_titleDivider);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (viewGroup.getVisibility() == 0) {
            z2 = true;
        }
        if (d && a && !z && !z2) {
            C67590h.m263077a(viewGroup2, -3, -3, -3, (int) C67590h.m263065a(this.f169377a, 16.0f));
        }
        m261804a(null, viewGroup2, viewGroup, frameLayout, findViewById, a, z, d);
    }

    /* renamed from: a */
    public void mo233538a() {
        this.f169394r.requestFeature(1);
        this.f169394r.setContentView(m261810b());
        m261812c();
    }

    /* renamed from: b */
    public void mo233547b(View view) {
        this.f169371J = view;
    }

    /* renamed from: a */
    public void mo233544a(boolean z) {
        this.f169372K = z;
    }

    /* renamed from: c */
    public void mo233551c(View view) {
        this.f169397u = view;
        this.f169398v = 0;
        this.f169362A = false;
    }

    /* renamed from: com.tt.miniapp.view.dialog.a$b */
    private static final class HandlerC67175b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f169465a;

        public HandlerC67175b(DialogInterface dialogInterface) {
            this.f169465a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f169465a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: a */
    public void mo233539a(int i) {
        this.f169397u = null;
        this.f169398v = i;
        this.f169362A = false;
    }

    /* renamed from: com.tt.miniapp.view.dialog.a$a */
    public static class C67169a {

        /* renamed from: A */
        public int f169413A;

        /* renamed from: B */
        public boolean f169414B;

        /* renamed from: C */
        public boolean[] f169415C;

        /* renamed from: D */
        public boolean f169416D;

        /* renamed from: E */
        public boolean f169417E;

        /* renamed from: F */
        public int f169418F = -1;

        /* renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f169419G;

        /* renamed from: H */
        public Cursor f169420H;

        /* renamed from: I */
        public String f169421I;

        /* renamed from: J */
        public String f169422J;

        /* renamed from: K */
        public boolean f169423K;

        /* renamed from: L */
        public AdapterView.OnItemSelectedListener f169424L;

        /* renamed from: M */
        public AbstractC67174a f169425M;

        /* renamed from: N */
        public boolean f169426N = true;

        /* renamed from: a */
        public final Context f169427a;

        /* renamed from: b */
        public final LayoutInflater f169428b;

        /* renamed from: c */
        public int f169429c;

        /* renamed from: d */
        public Drawable f169430d;

        /* renamed from: e */
        public int f169431e;

        /* renamed from: f */
        public CharSequence f169432f;

        /* renamed from: g */
        public View f169433g;

        /* renamed from: h */
        public CharSequence f169434h;

        /* renamed from: i */
        public CharSequence f169435i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f169436j;

        /* renamed from: k */
        public CharSequence f169437k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f169438l;

        /* renamed from: m */
        public CharSequence f169439m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f169440n;

        /* renamed from: o */
        public boolean f169441o;

        /* renamed from: p */
        public DialogInterface.OnCancelListener f169442p;

        /* renamed from: q */
        public DialogInterface.OnDismissListener f169443q;

        /* renamed from: r */
        public DialogInterface.OnKeyListener f169444r;

        /* renamed from: s */
        public CharSequence[] f169445s;

        /* renamed from: t */
        public ListAdapter f169446t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f169447u;

        /* renamed from: v */
        public int f169448v;

        /* renamed from: w */
        public View f169449w;

        /* renamed from: x */
        public int f169450x;

        /* renamed from: y */
        public int f169451y;

        /* renamed from: z */
        public int f169452z;

        /* renamed from: com.tt.miniapp.view.dialog.a$a$a */
        public interface AbstractC67174a {
            /* renamed from: a */
            void mo233563a(ListView listView);
        }

        public C67169a(Context context) {
            this.f169427a = context;
            this.f169441o = true;
            this.f169428b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m261828b(final C67164a aVar) {
            ListAdapter listAdapter;
            int i;
            final ListView listView = (ListView) this.f169428b.inflate(aVar.f169389m, (ViewGroup) null);
            if (!this.f169416D) {
                if (this.f169417E) {
                    i = aVar.f169391o;
                } else {
                    i = aVar.f169392p;
                }
                if (this.f169420H == null) {
                    ListAdapter listAdapter2 = this.f169446t;
                    if (listAdapter2 == null) {
                        listAdapter2 = new C67176c(this.f169427a, i, R.id.microapp_m_text1, this.f169445s);
                    }
                    listAdapter = listAdapter2;
                } else {
                    listAdapter = new SimpleCursorAdapter(this.f169427a, i, this.f169420H, new String[]{this.f169421I}, new int[]{R.id.microapp_m_text1});
                }
            } else if (this.f169420H == null) {
                listAdapter = new ArrayAdapter<CharSequence>(this.f169427a, aVar.f169390n, R.id.microapp_m_text1, this.f169445s) {
                    /* class com.tt.miniapp.view.dialog.C67164a.C67169a.C671701 */

                    public View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        if (C67169a.this.f169415C != null && C67169a.this.f169415C[i]) {
                            listView.setItemChecked(i, true);
                        }
                        return view2;
                    }
                };
            } else {
                listAdapter = new CursorAdapter(this.f169427a, this.f169420H, false) {
                    /* class com.tt.miniapp.view.dialog.C67164a.C67169a.C671712 */

                    /* renamed from: d */
                    private final int f169458d;

                    /* renamed from: e */
                    private final int f169459e;

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return C67169a.this.f169428b.inflate(aVar.f169390n, viewGroup, false);
                    }

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.microapp_m_text1)).setText(cursor.getString(this.f169458d));
                        ListView listView = listView;
                        int position = cursor.getPosition();
                        boolean z = true;
                        if (cursor.getInt(this.f169459e) != 1) {
                            z = false;
                        }
                        listView.setItemChecked(position, z);
                    }

                    {
                        Cursor cursor = getCursor();
                        this.f169458d = cursor.getColumnIndexOrThrow(C67169a.this.f169421I);
                        this.f169459e = cursor.getColumnIndexOrThrow(C67169a.this.f169422J);
                    }
                };
            }
            AbstractC67174a aVar2 = this.f169425M;
            if (aVar2 != null) {
                aVar2.mo233563a(listView);
            }
            aVar.f169387k = listAdapter;
            aVar.f169388l = this.f169418F;
            if (this.f169447u != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    /* class com.tt.miniapp.view.dialog.C67164a.C67169a.C671723 */

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C67169a.this.f169447u.onClick(aVar.f169378b, i);
                        if (!C67169a.this.f169417E) {
                            aVar.f169378b.dismiss();
                        }
                    }
                });
            } else if (this.f169419G != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    /* class com.tt.miniapp.view.dialog.C67164a.C67169a.C671734 */

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (C67169a.this.f169415C != null) {
                            C67169a.this.f169415C[i] = listView.isItemChecked(i);
                        }
                        C67169a.this.f169419G.onClick(aVar.f169378b, i, listView.isItemChecked(i));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f169424L;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f169417E) {
                listView.setChoiceMode(1);
            } else if (this.f169416D) {
                listView.setChoiceMode(2);
            }
            aVar.f169379c = listView;
        }

        /* renamed from: a */
        public void mo233557a(C67164a aVar) {
            View view = this.f169433g;
            if (view != null) {
                aVar.mo233547b(view);
            } else {
                CharSequence charSequence = this.f169432f;
                if (charSequence != null) {
                    aVar.mo233543a(charSequence);
                }
                Drawable drawable = this.f169430d;
                if (drawable != null) {
                    aVar.mo233541a(drawable);
                }
                int i = this.f169429c;
                if (i != 0) {
                    aVar.mo233546b(i);
                }
                int i2 = this.f169431e;
                if (i2 != 0) {
                    aVar.mo233546b(aVar.mo233550c(i2));
                }
            }
            CharSequence charSequence2 = this.f169434h;
            if (charSequence2 != null) {
                aVar.mo233548b(charSequence2);
            }
            CharSequence charSequence3 = this.f169435i;
            if (charSequence3 != null) {
                aVar.mo233540a(-1, charSequence3, this.f169436j, null);
            }
            CharSequence charSequence4 = this.f169437k;
            if (charSequence4 != null) {
                aVar.mo233540a(-2, charSequence4, this.f169438l, null);
            }
            CharSequence charSequence5 = this.f169439m;
            if (charSequence5 != null) {
                aVar.mo233540a(-3, charSequence5, this.f169440n, null);
            }
            if (this.f169423K) {
                aVar.mo233544a(true);
            }
            if (!(this.f169445s == null && this.f169420H == null && this.f169446t == null)) {
                m261828b(aVar);
            }
            View view2 = this.f169449w;
            if (view2 == null) {
                int i3 = this.f169448v;
                if (i3 != 0) {
                    aVar.mo233539a(i3);
                }
            } else if (this.f169414B) {
                aVar.mo233542a(view2, this.f169450x, this.f169451y, this.f169452z, this.f169413A);
            } else {
                aVar.mo233551c(view2);
            }
        }
    }

    /* renamed from: b */
    public void mo233546b(int i) {
        this.f169367F = null;
        this.f169366E = i;
        ImageView imageView = this.f169368G;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: c */
    public int mo233550c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f169377a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public void mo233548b(CharSequence charSequence) {
        this.f169396t = charSequence;
        TextView textView = this.f169370I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    private void m261806a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
        View findViewById = this.f169394r.findViewById(R.id.microapp_m_leftSpacer);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = this.f169394r.findViewById(R.id.microapp_m_rightSpacer);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    /* renamed from: a */
    static boolean m261808a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m261808a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m261811b(ViewGroup viewGroup) {
        ScrollView scrollView = (ScrollView) this.f169394r.findViewById(R.id.microapp_m_scrollView);
        this.f169386j = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) this.f169394r.findViewById(R.id.microapp_m_message);
        this.f169370I = textView;
        if (textView != null) {
            CharSequence charSequence = this.f169396t;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                this.f169386j.removeView(this.f169370I);
                if (this.f169379c != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f169386j.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f169386j);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f169379c, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
            final View findViewById = this.f169394r.findViewById(R.id.microapp_m_scrollIndicatorUp);
            final View findViewById2 = this.f169394r.findViewById(R.id.microapp_m_scrollIndicatorDown);
            if (findViewById != null || findViewById2 != null) {
                if (this.f169396t != null) {
                    this.f169386j.post(new Runnable() {
                        /* class com.tt.miniapp.view.dialog.C67164a.RunnableC671662 */

                        public void run() {
                            C67164a.m261805a(C67164a.this.f169386j, findViewById, findViewById2);
                        }
                    });
                    return;
                }
                ListView listView = this.f169379c;
                if (listView != null) {
                    listView.setOnScrollListener(new AbsListView.OnScrollListener() {
                        /* class com.tt.miniapp.view.dialog.C67164a.C671673 */

                        public void onScrollStateChanged(AbsListView absListView, int i) {
                        }

                        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            C67164a.m261805a(absListView, findViewById, findViewById2);
                        }
                    });
                    this.f169379c.post(new Runnable() {
                        /* class com.tt.miniapp.view.dialog.C67164a.RunnableC671684 */

                        public void run() {
                            C67164a.m261805a(C67164a.this.f169379c, findViewById, findViewById2);
                        }
                    });
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 != null) {
                    viewGroup.removeView(findViewById2);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m261809a(ViewGroup viewGroup) {
        if (this.f169371J != null) {
            viewGroup.addView(this.f169371J, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f169394r.findViewById(R.id.microapp_m_title_template).setVisibility(8);
        } else {
            this.f169368G = (ImageView) this.f169394r.findViewById(R.id.microapp_m_icon);
            if (!TextUtils.isEmpty(this.f169395s)) {
                TextView textView = (TextView) this.f169394r.findViewById(R.id.microapp_m_alertTitle);
                this.f169369H = textView;
                textView.setText(this.f169395s);
                int i = this.f169366E;
                if (i != 0) {
                    this.f169368G.setImageResource(i);
                } else {
                    Drawable drawable = this.f169367F;
                    if (drawable != null) {
                        this.f169368G.setImageDrawable(drawable);
                    } else {
                        this.f169369H.setPadding(this.f169368G.getPaddingLeft(), this.f169368G.getPaddingTop(), this.f169368G.getPaddingRight(), this.f169368G.getPaddingBottom());
                        this.f169368G.setVisibility(8);
                    }
                }
            } else {
                this.f169394r.findViewById(R.id.microapp_m_title_template).setVisibility(8);
                this.f169368G.setVisibility(8);
                viewGroup.setVisibility(8);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo233549b(int i, KeyEvent keyEvent) {
        ScrollView scrollView = this.f169386j;
        if (scrollView == null || !scrollView.executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public C67164a(Context context, DialogInterface dialogInterface, Window window) {
        this.f169377a = context;
        this.f169378b = dialogInterface;
        this.f169394r = window;
        this.f169393q = new HandlerC67175b(dialogInterface);
        this.f169373L = R.layout.microapp_m_alert_dialog;
        this.f169374M = 0;
        this.f169389m = R.layout.microapp_m_select_dialog;
        this.f169390n = R.layout.microapp_m_select_dialog_multichoice;
        this.f169391o = R.layout.microapp_m_select_dialog_singlechoice;
        this.f169392p = R.layout.microapp_m_select_dialog_item;
    }

    /* renamed from: a */
    public static void m261805a(View view, View view2, View view3) {
        int i;
        if (Build.VERSION.SDK_INT >= 14) {
            int i2 = 0;
            if (view2 != null) {
                if (view.canScrollVertically(-1)) {
                    i = 0;
                } else {
                    i = 4;
                }
                view2.setVisibility(i);
            }
            if (view3 != null) {
                if (!view.canScrollVertically(1)) {
                    i2 = 4;
                }
                view3.setVisibility(i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.dialog.a$c */
    public static class C67176c extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public C67176c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    /* renamed from: a */
    public void mo233540a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f169393q.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f169365D = charSequence;
            this.f169385i = message;
        } else if (i == -2) {
            this.f169364C = charSequence;
            this.f169383g = message;
        } else if (i == -1) {
            this.f169363B = charSequence;
            this.f169381e = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    private void m261804a(TypedArray typedArray, View view, View view2, View view3, View view4, boolean z, boolean z2, boolean z3) {
        ListAdapter listAdapter;
        ListView listView = this.f169379c;
        if (listView != null && (listAdapter = this.f169387k) != null) {
            listView.setAdapter(listAdapter);
            int i = this.f169388l;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }
}
