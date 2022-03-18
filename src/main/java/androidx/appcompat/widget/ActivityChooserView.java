package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0342o;
import androidx.core.view.AbstractC0894b;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import com.larksuite.suite.R;

public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0370a f1280a;

    /* renamed from: b */
    final FrameLayout f1281b;

    /* renamed from: c */
    final FrameLayout f1282c;

    /* renamed from: d */
    AbstractC0894b f1283d;

    /* renamed from: e */
    final DataSetObserver f1284e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f1285f;

    /* renamed from: g */
    boolean f1286g;

    /* renamed from: h */
    int f1287h;

    /* renamed from: i */
    private final View$OnClickListenerC0371b f1288i;

    /* renamed from: j */
    private final View f1289j;

    /* renamed from: k */
    private final Drawable f1290k;

    /* renamed from: l */
    private final ImageView f1291l;

    /* renamed from: m */
    private final ImageView f1292m;

    /* renamed from: n */
    private final int f1293n;

    /* renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f1294o;

    /* renamed from: p */
    private ListPopupWindow f1295p;

    /* renamed from: q */
    private boolean f1296q;

    /* renamed from: r */
    private int f1297r;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0370a extends BaseAdapter {

        /* renamed from: b */
        private C0436c f1305b;

        /* renamed from: c */
        private int f1306c = 4;

        /* renamed from: d */
        private boolean f1307d;

        /* renamed from: e */
        private boolean f1308e;

        /* renamed from: f */
        private boolean f1309f;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getViewTypeCount() {
            return 3;
        }

        /* renamed from: e */
        public C0436c mo1846e() {
            return this.f1305b;
        }

        /* renamed from: f */
        public boolean mo1847f() {
            return this.f1307d;
        }

        /* renamed from: b */
        public ResolveInfo mo1843b() {
            return this.f1305b.mo2555b();
        }

        /* renamed from: c */
        public int mo1844c() {
            return this.f1305b.mo2551a();
        }

        /* renamed from: d */
        public int mo1845d() {
            return this.f1305b.mo2556c();
        }

        /* renamed from: a */
        public int mo1838a() {
            int i = this.f1306c;
            this.f1306c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1306c = i;
            return i2;
        }

        public int getCount() {
            int a = this.f1305b.mo2551a();
            if (!this.f1307d && this.f1305b.mo2555b() != null) {
                a--;
            }
            int min = Math.min(a, this.f1306c);
            if (this.f1309f) {
                return min + 1;
            }
            return min;
        }

        C0370a() {
        }

        /* renamed from: a */
        public void mo1839a(int i) {
            if (this.f1306c != i) {
                this.f1306c = i;
                notifyDataSetChanged();
            }
        }

        public int getItemViewType(int i) {
            if (!this.f1309f || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        /* renamed from: a */
        public void mo1841a(boolean z) {
            if (this.f1309f != z) {
                this.f1309f = z;
                notifyDataSetChanged();
            }
        }

        public Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f1307d && this.f1305b.mo2555b() != null) {
                    i++;
                }
                return this.f1305b.mo2553a(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void mo1840a(C0436c cVar) {
            C0436c e = ActivityChooserView.this.f1280a.mo1846e();
            if (e != null && ActivityChooserView.this.isShown()) {
                e.unregisterObserver(ActivityChooserView.this.f1284e);
            }
            this.f1305b = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f1284e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo1842a(boolean z, boolean z2) {
            if (this.f1307d != z || this.f1308e != z2) {
                this.f1307d = z;
                this.f1308e = z2;
                notifyDataSetChanged();
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1307d || i != 0 || !this.f1308e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }
    }

    public C0436c getDataModel() {
        return this.f1280a.mo1846e();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class View$OnClickListenerC0371b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        /* renamed from: a */
        private void m1620a() {
            if (ActivityChooserView.this.f1285f != null) {
                ActivityChooserView.this.f1285f.onDismiss();
            }
        }

        public void onDismiss() {
            m1620a();
            if (ActivityChooserView.this.f1283d != null) {
                ActivityChooserView.this.f1283d.mo4682a(false);
            }
        }

        View$OnClickListenerC0371b() {
        }

        public boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.f1282c) {
                if (ActivityChooserView.this.f1280a.getCount() > 0) {
                    ActivityChooserView.this.f1286g = true;
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.mo1815a(activityChooserView.f1287h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public void onClick(View view) {
            if (view == ActivityChooserView.this.f1282c) {
                ActivityChooserView.this.mo1817b();
                Intent b = ActivityChooserView.this.f1280a.mo1846e().mo2554b(ActivityChooserView.this.f1280a.mo1846e().mo2552a(ActivityChooserView.this.f1280a.mo1843b()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == ActivityChooserView.this.f1281b) {
                ActivityChooserView.this.f1286g = false;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                activityChooserView.mo1815a(activityChooserView.f1287h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((C0370a) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                ActivityChooserView.this.mo1817b();
                if (!ActivityChooserView.this.f1286g) {
                    if (!ActivityChooserView.this.f1280a.mo1847f()) {
                        i++;
                    }
                    Intent b = ActivityChooserView.this.f1280a.mo1846e().mo2554b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b);
                    }
                } else if (i > 0) {
                    ActivityChooserView.this.f1280a.mo1846e().mo2557c(i);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.mo1815a(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: c */
    public boolean mo1818c() {
        return getListPopupWindow().isShowing();
    }

    /* renamed from: a */
    public boolean mo1816a() {
        if (mo1818c() || !this.f1296q) {
            return false;
        }
        this.f1286g = false;
        mo1815a(this.f1287h);
        return true;
    }

    /* renamed from: b */
    public boolean mo1817b() {
        if (!mo1818c()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1294o);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0436c e = this.f1280a.mo1846e();
        if (e != null) {
            e.registerObserver(this.f1284e);
        }
        this.f1296q = true;
    }

    /* access modifiers changed from: package-private */
    public ListPopupWindow getListPopupWindow() {
        if (this.f1295p == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1295p = listPopupWindow;
            listPopupWindow.setAdapter(this.f1280a);
            this.f1295p.setAnchorView(this);
            this.f1295p.setModal(true);
            this.f1295p.setOnItemClickListener(this.f1288i);
            this.f1295p.setOnDismissListener(this.f1288i);
        }
        return this.f1295p;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0436c e = this.f1280a.mo1846e();
        if (e != null) {
            e.unregisterObserver(this.f1284e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1294o);
        }
        if (mo1818c()) {
            mo1817b();
        }
        this.f1296q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1819d() {
        if (this.f1280a.getCount() > 0) {
            this.f1281b.setEnabled(true);
        } else {
            this.f1281b.setEnabled(false);
        }
        int c = this.f1280a.mo1844c();
        int d = this.f1280a.mo1845d();
        if (c == 1 || (c > 1 && d > 0)) {
            this.f1282c.setVisibility(0);
            ResolveInfo b = this.f1280a.mo1843b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1292m.setImageDrawable(b.loadIcon(packageManager));
            if (this.f1297r != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                this.f1282c.setContentDescription(getContext().getString(this.f1297r, loadLabel));
            }
        } else {
            this.f1282c.setVisibility(8);
        }
        if (this.f1282c.getVisibility() == 0) {
            this.f1289j.setBackgroundDrawable(this.f1290k);
        } else {
            this.f1289j.setBackgroundDrawable(null);
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1297r = i;
    }

    public void setInitialActivityCount(int i) {
        this.f1287h = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1285f = onDismissListener;
    }

    public void setProvider(AbstractC0894b bVar) {
        this.f1283d = bVar;
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1291l.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1291l.setContentDescription(getContext().getString(i));
    }

    public void setActivityChooserModel(C0436c cVar) {
        this.f1280a.mo1840a(cVar);
        if (mo1818c()) {
            mo1817b();
            mo1816a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1815a(int r6) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.mo1815a(int):void");
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f1303a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0427af a = C0427af.m1777a(context, attributeSet, f1303a);
            setBackgroundDrawable(a.mo2477a(0));
            a.mo2482b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f1289j;
        if (this.f1282c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1284e = new DataSetObserver() {
            /* class androidx.appcompat.widget.ActivityChooserView.C03651 */

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f1280a.notifyDataSetChanged();
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f1280a.notifyDataSetInvalidated();
            }
        };
        this.f1294o = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class androidx.appcompat.widget.ActivityChooserView.ViewTreeObserver$OnGlobalLayoutListenerC03662 */

            public void onGlobalLayout() {
                if (!ActivityChooserView.this.mo1818c()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                if (ActivityChooserView.this.f1283d != null) {
                    ActivityChooserView.this.f1283d.mo4682a(true);
                }
            }
        };
        this.f1287h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.expandActivityOverflowButtonDrawable, R.attr.initialActivityCount}, i, 0);
        ViewCompat.m4034a(this, context, new int[]{R.attr.expandActivityOverflowButtonDrawable, R.attr.initialActivityCount}, attributeSet, obtainStyledAttributes, i, 0);
        this.f1287h = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        View$OnClickListenerC0371b bVar = new View$OnClickListenerC0371b();
        this.f1288i = bVar;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.f1289j = findViewById;
        this.f1290k = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f1282c = frameLayout;
        frameLayout.setOnClickListener(bVar);
        frameLayout.setOnLongClickListener(bVar);
        this.f1292m = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(bVar);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            /* class androidx.appcompat.widget.ActivityChooserView.C03673 */

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0864d.m4171a(accessibilityNodeInfo).mo4602l(true);
            }
        });
        frameLayout2.setOnTouchListener(new AbstractView$OnAttachStateChangeListenerC0466s(frameLayout2) {
            /* class androidx.appcompat.widget.ActivityChooserView.C03684 */

            @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
            /* renamed from: a */
            public AbstractC0342o mo1233a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            /* access modifiers changed from: protected */
            @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
            /* renamed from: b */
            public boolean mo1234b() {
                ActivityChooserView.this.mo1816a();
                return true;
            }

            /* access modifiers changed from: protected */
            @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
            /* renamed from: c */
            public boolean mo1781c() {
                ActivityChooserView.this.mo1817b();
                return true;
            }
        });
        this.f1281b = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
        this.f1291l = imageView;
        imageView.setImageDrawable(drawable);
        C0370a aVar = new C0370a();
        this.f1280a = aVar;
        aVar.registerDataSetObserver(new DataSetObserver() {
            /* class androidx.appcompat.widget.ActivityChooserView.C03695 */

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mo1819d();
            }
        });
        Resources resources = context.getResources();
        this.f1293n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1289j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo1818c()) {
            mo1817b();
        }
    }
}
