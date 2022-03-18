package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
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
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class AlertController {

    /* renamed from: A */
    private int f483A;

    /* renamed from: B */
    private boolean f484B;

    /* renamed from: C */
    private CharSequence f485C;

    /* renamed from: D */
    private Drawable f486D;

    /* renamed from: E */
    private CharSequence f487E;

    /* renamed from: F */
    private Drawable f488F;

    /* renamed from: G */
    private CharSequence f489G;

    /* renamed from: H */
    private Drawable f490H;

    /* renamed from: I */
    private int f491I;

    /* renamed from: J */
    private Drawable f492J;

    /* renamed from: K */
    private ImageView f493K;

    /* renamed from: L */
    private TextView f494L;

    /* renamed from: M */
    private TextView f495M;

    /* renamed from: N */
    private View f496N;

    /* renamed from: O */
    private int f497O;

    /* renamed from: P */
    private int f498P;

    /* renamed from: Q */
    private boolean f499Q;

    /* renamed from: R */
    private int f500R;

    /* renamed from: S */
    private final View.OnClickListener f501S = new View.OnClickListener() {
        /* class androidx.appcompat.app.AlertController.View$OnClickListenerC02201 */

        public void onClick(View view) {
            Message message;
            if (view == AlertController.this.f504c && AlertController.this.f505d != null) {
                message = Message.obtain(AlertController.this.f505d);
            } else if (view == AlertController.this.f506e && AlertController.this.f507f != null) {
                message = Message.obtain(AlertController.this.f507f);
            } else if (view != AlertController.this.f508g || AlertController.this.f509h == null) {
                message = null;
            } else {
                message = Message.obtain(AlertController.this.f509h);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.f517p.obtainMessage(1, AlertController.this.f502a).sendToTarget();
        }
    };

    /* renamed from: a */
    final DialogC0259b f502a;

    /* renamed from: b */
    ListView f503b;

    /* renamed from: c */
    Button f504c;

    /* renamed from: d */
    Message f505d;

    /* renamed from: e */
    Button f506e;

    /* renamed from: f */
    Message f507f;

    /* renamed from: g */
    Button f508g;

    /* renamed from: h */
    Message f509h;

    /* renamed from: i */
    NestedScrollView f510i;

    /* renamed from: j */
    ListAdapter f511j;

    /* renamed from: k */
    int f512k = -1;

    /* renamed from: l */
    int f513l;

    /* renamed from: m */
    int f514m;

    /* renamed from: n */
    int f515n;

    /* renamed from: o */
    int f516o;

    /* renamed from: p */
    Handler f517p;

    /* renamed from: q */
    private final Context f518q;

    /* renamed from: r */
    private final Window f519r;

    /* renamed from: s */
    private final int f520s;

    /* renamed from: t */
    private CharSequence f521t;

    /* renamed from: u */
    private CharSequence f522u;

    /* renamed from: v */
    private View f523v;

    /* renamed from: w */
    private int f524w;

    /* renamed from: x */
    private int f525x;

    /* renamed from: y */
    private int f526y;

    /* renamed from: z */
    private int f527z;

    /* renamed from: b */
    public ListView mo733b() {
        return this.f503b;
    }

    /* renamed from: a */
    public void mo731a(CharSequence charSequence) {
        this.f521t = charSequence;
        TextView textView = this.f494L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo727a(int i) {
        this.f523v = null;
        this.f524w = i;
        this.f484B = false;
    }

    /* renamed from: a */
    public void mo730a(View view, int i, int i2, int i3, int i4) {
        this.f523v = view;
        this.f524w = 0;
        this.f484B = true;
        this.f525x = i;
        this.f526y = i2;
        this.f527z = i3;
        this.f483A = i4;
    }

    /* renamed from: a */
    public void mo728a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f517p.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f489G = charSequence;
            this.f509h = message;
            this.f490H = drawable;
        } else if (i == -2) {
            this.f487E = charSequence;
            this.f507f = message;
            this.f488F = drawable;
        } else if (i == -1) {
            this.f485C = charSequence;
            this.f505d = message;
            this.f486D = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo729a(Drawable drawable) {
        this.f492J = drawable;
        this.f491I = 0;
        ImageView imageView = this.f493K;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f493K.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public boolean mo732a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f510i;
        return nestedScrollView != null && nestedScrollView.mo4747a(keyEvent);
    }

    /* renamed from: c */
    private int m701c() {
        int i = this.f498P;
        if (i == 0) {
            return this.f497O;
        }
        if (this.f500R == 1) {
            return i;
        }
        return this.f497O;
    }

    /* renamed from: a */
    public void mo726a() {
        this.f502a.setContentView(m701c());
        m703d();
    }

    /* renamed from: d */
    private void m703d() {
        boolean z;
        boolean z2;
        boolean z3;
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f519r.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        m695a(viewGroup);
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a = m693a(findViewById7, findViewById4);
        ViewGroup a2 = m693a(findViewById8, findViewById5);
        ViewGroup a3 = m693a(findViewById9, findViewById6);
        m702c(a2);
        m704d(a3);
        m700b(a);
        int i = 0;
        if (viewGroup == null || viewGroup.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (a == null || a.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (a3 == null || a3.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(R.id.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f510i;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f522u == null && this.f503b == null)) {
                view = a.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(R.id.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f503b;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo747a(z2, z3);
        }
        if (!z) {
            View view2 = this.f503b;
            if (view2 == null) {
                view2 = this.f510i;
            }
            if (view2 != null) {
                if (z3) {
                    i = 2;
                }
                int i2 = z2 ? 1 : 0;
                char c = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                m696a(a2, view2, i2 | i, 3);
            }
        }
        ListView listView2 = this.f503b;
        if (listView2 != null && (listAdapter = this.f511j) != null) {
            listView2.setAdapter(listAdapter);
            int i3 = this.f512k;
            if (i3 > -1) {
                listView2.setItemChecked(i3, true);
                listView2.setSelection(i3);
            }
        }
    }

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f541a;

        /* renamed from: b */
        private final int f542b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle});
            this.f542b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f541a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }

        /* renamed from: a */
        public void mo747a(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f541a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f542b;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }
    }

    /* renamed from: b */
    public void mo735b(View view) {
        this.f496N = view;
    }

    /* renamed from: c */
    public void mo739c(View view) {
        this.f523v = view;
        this.f524w = 0;
        this.f484B = false;
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    private static final class HandlerC0231b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f597a;

        public HandlerC0231b(DialogInterface dialogInterface) {
            this.f597a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f597a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: b */
    public void mo736b(CharSequence charSequence) {
        this.f522u = charSequence;
        TextView textView = this.f495M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public static class C0225a {

        /* renamed from: A */
        public int f543A;

        /* renamed from: B */
        public int f544B;

        /* renamed from: C */
        public int f545C;

        /* renamed from: D */
        public int f546D;

        /* renamed from: E */
        public boolean f547E;

        /* renamed from: F */
        public boolean[] f548F;

        /* renamed from: G */
        public boolean f549G;

        /* renamed from: H */
        public boolean f550H;

        /* renamed from: I */
        public int f551I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f552J;

        /* renamed from: K */
        public Cursor f553K;

        /* renamed from: L */
        public String f554L;

        /* renamed from: M */
        public String f555M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f556N;

        /* renamed from: O */
        public AbstractC0230a f557O;

        /* renamed from: P */
        public boolean f558P = true;

        /* renamed from: a */
        public final Context f559a;

        /* renamed from: b */
        public final LayoutInflater f560b;

        /* renamed from: c */
        public int f561c;

        /* renamed from: d */
        public Drawable f562d;

        /* renamed from: e */
        public int f563e;

        /* renamed from: f */
        public CharSequence f564f;

        /* renamed from: g */
        public View f565g;

        /* renamed from: h */
        public CharSequence f566h;

        /* renamed from: i */
        public CharSequence f567i;

        /* renamed from: j */
        public Drawable f568j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f569k;

        /* renamed from: l */
        public CharSequence f570l;

        /* renamed from: m */
        public Drawable f571m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f572n;

        /* renamed from: o */
        public CharSequence f573o;

        /* renamed from: p */
        public Drawable f574p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f575q;

        /* renamed from: r */
        public boolean f576r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f577s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f578t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f579u;

        /* renamed from: v */
        public CharSequence[] f580v;

        /* renamed from: w */
        public ListAdapter f581w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f582x;

        /* renamed from: y */
        public int f583y;

        /* renamed from: z */
        public View f584z;

        /* renamed from: androidx.appcompat.app.AlertController$a$a */
        public interface AbstractC0230a {
            /* renamed from: a */
            void mo754a(ListView listView);
        }

        public C0225a(Context context) {
            this.f559a = context;
            this.f576r = true;
            this.f560b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m722b(final AlertController alertController) {
            ListAdapter listAdapter;
            int i;
            final RecycleListView recycleListView = (RecycleListView) this.f560b.inflate(alertController.f513l, (ViewGroup) null);
            if (!this.f549G) {
                if (this.f550H) {
                    i = alertController.f515n;
                } else {
                    i = alertController.f516o;
                }
                if (this.f553K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f559a, i, this.f553K, new String[]{this.f554L}, new int[]{16908308});
                } else {
                    listAdapter = this.f581w;
                    if (listAdapter == null) {
                        listAdapter = new C0232c(this.f559a, i, 16908308, this.f580v);
                    }
                }
            } else if (this.f553K == null) {
                listAdapter = new ArrayAdapter<CharSequence>(this.f559a, alertController.f514m, 16908308, this.f580v) {
                    /* class androidx.appcompat.app.AlertController.C0225a.C02261 */

                    public View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        if (C0225a.this.f548F != null && C0225a.this.f548F[i]) {
                            recycleListView.setItemChecked(i, true);
                        }
                        return view2;
                    }
                };
            } else {
                listAdapter = new CursorAdapter(this.f559a, this.f553K, false) {
                    /* class androidx.appcompat.app.AlertController.C0225a.C02272 */

                    /* renamed from: d */
                    private final int f590d;

                    /* renamed from: e */
                    private final int f591e;

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return C0225a.this.f560b.inflate(alertController.f514m, viewGroup, false);
                    }

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f590d));
                        RecycleListView recycleListView = recycleListView;
                        int position = cursor.getPosition();
                        boolean z = true;
                        if (cursor.getInt(this.f591e) != 1) {
                            z = false;
                        }
                        recycleListView.setItemChecked(position, z);
                    }

                    {
                        Cursor cursor = getCursor();
                        this.f590d = cursor.getColumnIndexOrThrow(C0225a.this.f554L);
                        this.f591e = cursor.getColumnIndexOrThrow(C0225a.this.f555M);
                    }
                };
            }
            AbstractC0230a aVar = this.f557O;
            if (aVar != null) {
                aVar.mo754a(recycleListView);
            }
            alertController.f511j = listAdapter;
            alertController.f512k = this.f551I;
            if (this.f582x != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    /* class androidx.appcompat.app.AlertController.C0225a.C02283 */

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C0225a.this.f582x.onClick(alertController.f502a, i);
                        if (!C0225a.this.f550H) {
                            alertController.f502a.dismiss();
                        }
                    }
                });
            } else if (this.f552J != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    /* class androidx.appcompat.app.AlertController.C0225a.C02294 */

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (C0225a.this.f548F != null) {
                            C0225a.this.f548F[i] = recycleListView.isItemChecked(i);
                        }
                        C0225a.this.f552J.onClick(alertController.f502a, i, recycleListView.isItemChecked(i));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f556N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f550H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f549G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f503b = recycleListView;
        }

        /* renamed from: a */
        public void mo748a(AlertController alertController) {
            View view = this.f565g;
            if (view != null) {
                alertController.mo735b(view);
            } else {
                CharSequence charSequence = this.f564f;
                if (charSequence != null) {
                    alertController.mo731a(charSequence);
                }
                Drawable drawable = this.f562d;
                if (drawable != null) {
                    alertController.mo729a(drawable);
                }
                int i = this.f561c;
                if (i != 0) {
                    alertController.mo734b(i);
                }
                int i2 = this.f563e;
                if (i2 != 0) {
                    alertController.mo734b(alertController.mo738c(i2));
                }
            }
            CharSequence charSequence2 = this.f566h;
            if (charSequence2 != null) {
                alertController.mo736b(charSequence2);
            }
            CharSequence charSequence3 = this.f567i;
            if (!(charSequence3 == null && this.f568j == null)) {
                alertController.mo728a(-1, charSequence3, this.f569k, (Message) null, this.f568j);
            }
            CharSequence charSequence4 = this.f570l;
            if (!(charSequence4 == null && this.f571m == null)) {
                alertController.mo728a(-2, charSequence4, this.f572n, (Message) null, this.f571m);
            }
            CharSequence charSequence5 = this.f573o;
            if (!(charSequence5 == null && this.f574p == null)) {
                alertController.mo728a(-3, charSequence5, this.f575q, (Message) null, this.f574p);
            }
            if (!(this.f580v == null && this.f553K == null && this.f581w == null)) {
                m722b(alertController);
            }
            View view2 = this.f584z;
            if (view2 == null) {
                int i3 = this.f583y;
                if (i3 != 0) {
                    alertController.mo727a(i3);
                }
            } else if (this.f547E) {
                alertController.mo730a(view2, this.f543A, this.f544B, this.f545C, this.f546D);
            } else {
                alertController.mo739c(view2);
            }
        }
    }

    /* renamed from: b */
    public void mo734b(int i) {
        this.f492J = null;
        this.f491I = i;
        ImageView imageView = this.f493K;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f493K.setImageResource(this.f491I);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public int mo738c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f518q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public Button mo740d(int i) {
        if (i == -3) {
            return this.f508g;
        }
        if (i == -2) {
            return this.f506e;
        }
        if (i != -1) {
            return null;
        }
        return this.f504c;
    }

    /* renamed from: a */
    private void m695a(ViewGroup viewGroup) {
        View view = this.f523v;
        boolean z = false;
        if (view == null) {
            if (this.f524w != 0) {
                view = LayoutInflater.from(this.f518q).inflate(this.f524w, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m699a(view)) {
            this.f519r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f519r.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f484B) {
                frameLayout.setPadding(this.f525x, this.f526y, this.f527z, this.f483A);
            }
            if (this.f503b != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f1377g = BitmapDescriptorFactory.HUE_RED;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    private void m702c(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f519r.findViewById(R.id.scrollView);
        this.f510i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f510i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f495M = textView;
        if (textView != null) {
            CharSequence charSequence = this.f522u;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f510i.removeView(this.f495M);
            if (this.f503b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f510i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f510i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f503b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m700b(ViewGroup viewGroup) {
        if (this.f496N != null) {
            viewGroup.addView(this.f496N, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f519r.findViewById(R.id.title_template).setVisibility(8);
            return;
        }
        this.f493K = (ImageView) this.f519r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f521t)) || !this.f499Q) {
            this.f519r.findViewById(R.id.title_template).setVisibility(8);
            this.f493K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f519r.findViewById(R.id.alertTitle);
        this.f494L = textView;
        textView.setText(this.f521t);
        int i = this.f491I;
        if (i != 0) {
            this.f493K.setImageResource(i);
            return;
        }
        Drawable drawable = this.f492J;
        if (drawable != null) {
            this.f493K.setImageDrawable(drawable);
            return;
        }
        this.f494L.setPadding(this.f493K.getPaddingLeft(), this.f493K.getPaddingTop(), this.f493K.getPaddingRight(), this.f493K.getPaddingBottom());
        this.f493K.setVisibility(8);
    }

    /* renamed from: a */
    private void m697a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private void m704d(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f504c = button;
        button.setOnClickListener(this.f501S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f485C) || this.f486D != null) {
            this.f504c.setText(this.f485C);
            Drawable drawable = this.f486D;
            if (drawable != null) {
                int i = this.f520s;
                drawable.setBounds(0, 0, i, i);
                this.f504c.setCompoundDrawables(this.f486D, null, null, null);
            }
            this.f504c.setVisibility(0);
            z = true;
        } else {
            this.f504c.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f506e = button2;
        button2.setOnClickListener(this.f501S);
        if (!TextUtils.isEmpty(this.f487E) || this.f488F != null) {
            this.f506e.setText(this.f487E);
            Drawable drawable2 = this.f488F;
            if (drawable2 != null) {
                int i2 = this.f520s;
                drawable2.setBounds(0, 0, i2, i2);
                this.f506e.setCompoundDrawables(this.f488F, null, null, null);
            }
            this.f506e.setVisibility(0);
            z |= true;
        } else {
            this.f506e.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f508g = button3;
        button3.setOnClickListener(this.f501S);
        if (!TextUtils.isEmpty(this.f489G) || this.f490H != null) {
            this.f508g.setText(this.f489G);
            Drawable drawable3 = this.f490H;
            if (drawable3 != null) {
                int i3 = this.f520s;
                drawable3.setBounds(0, 0, i3, i3);
                this.f508g.setCompoundDrawables(this.f490H, null, null, null);
            }
            this.f508g.setVisibility(0);
            z |= true;
        } else {
            this.f508g.setVisibility(8);
        }
        if (m698a(this.f518q)) {
            if (z) {
                m697a(this.f504c);
            } else if (z) {
                m697a(this.f506e);
            } else if (z) {
                m697a(this.f508g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static boolean m698a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m699a(View view) {
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
            if (m699a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private ViewGroup m693a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: b */
    public boolean mo737b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f510i;
        if (nestedScrollView == null || !nestedScrollView.mo4747a(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m694a(View view, View view2, View view3) {
        int i;
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

    public AlertController(Context context, DialogC0259b bVar, Window window) {
        this.f518q = context;
        this.f502a = bVar;
        this.f519r = window;
        this.f517p = new HandlerC0231b(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout}, R.attr.alertDialogStyle, 0);
        this.f497O = obtainStyledAttributes.getResourceId(0, 0);
        this.f498P = obtainStyledAttributes.getResourceId(2, 0);
        this.f513l = obtainStyledAttributes.getResourceId(4, 0);
        this.f514m = obtainStyledAttributes.getResourceId(5, 0);
        this.f515n = obtainStyledAttributes.getResourceId(7, 0);
        this.f516o = obtainStyledAttributes.getResourceId(3, 0);
        this.f499Q = obtainStyledAttributes.getBoolean(6, true);
        this.f520s = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        bVar.supportRequestWindowFeature(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static class C0232c extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public C0232c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    /* renamed from: a */
    private void m696a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f519r.findViewById(R.id.scrollIndicatorUp);
        final View findViewById2 = this.f519r.findViewById(R.id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            ViewCompat.m4031a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f522u != null) {
                this.f510i.setOnScrollChangeListener(new NestedScrollView.AbstractC0934b() {
                    /* class androidx.appcompat.app.AlertController.C02212 */

                    @Override // androidx.core.widget.NestedScrollView.AbstractC0934b
                    /* renamed from: a */
                    public void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m694a(nestedScrollView, findViewById, findViewById2);
                    }
                });
                this.f510i.post(new Runnable() {
                    /* class androidx.appcompat.app.AlertController.RunnableC02223 */

                    public void run() {
                        AlertController.m694a(AlertController.this.f510i, findViewById, findViewById2);
                    }
                });
                return;
            }
            ListView listView = this.f503b;
            if (listView != null) {
                listView.setOnScrollListener(new AbsListView.OnScrollListener() {
                    /* class androidx.appcompat.app.AlertController.C02234 */

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m694a(absListView, findViewById, findViewById2);
                    }
                });
                this.f503b.post(new Runnable() {
                    /* class androidx.appcompat.app.AlertController.RunnableC02245 */

                    public void run() {
                        AlertController.m694a(AlertController.this.f503b, findViewById, findViewById2);
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
