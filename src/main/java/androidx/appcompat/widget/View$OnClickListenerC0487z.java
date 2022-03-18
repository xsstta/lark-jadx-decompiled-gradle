package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p022c.p023a.AbstractC0500c;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.z */
class View$OnClickListenerC0487z extends AbstractC0500c implements View.OnClickListener {

    /* renamed from: j */
    private final SearchView f1766j;

    /* renamed from: k */
    private final SearchableInfo f1767k;

    /* renamed from: l */
    private final Context f1768l;

    /* renamed from: m */
    private final WeakHashMap<String, Drawable.ConstantState> f1769m;

    /* renamed from: n */
    private final int f1770n;

    /* renamed from: o */
    private boolean f1771o = false;

    /* renamed from: p */
    private int f1772p = 1;

    /* renamed from: q */
    private ColorStateList f1773q;

    /* renamed from: r */
    private int f1774r = -1;

    /* renamed from: s */
    private int f1775s = -1;

    /* renamed from: t */
    private int f1776t = -1;

    /* renamed from: u */
    private int f1777u = -1;

    /* renamed from: v */
    private int f1778v = -1;

    /* renamed from: w */
    private int f1779w = -1;

    @Override // androidx.p022c.p023a.AbstractC0495a
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.p022c.p023a.AbstractC0495a, androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: a */
    public Cursor mo2771a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1766j.getVisibility() == 0 && this.f1766j.getWindowVisibility() == 0) {
            try {
                Cursor a = mo2770a(this.f1767k, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // androidx.p022c.p023a.AbstractC0495a, androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: a */
    public void mo2775a(Cursor cursor) {
        if (this.f1771o) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2775a(cursor);
            if (cursor != null) {
                this.f1774r = cursor.getColumnIndex("suggest_text_1");
                this.f1775s = cursor.getColumnIndex("suggest_text_2");
                this.f1776t = cursor.getColumnIndex("suggest_text_2_url");
                this.f1777u = cursor.getColumnIndex("suggest_icon_1");
                this.f1778v = cursor.getColumnIndex("suggest_icon_2");
                this.f1779w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.p022c.p023a.AbstractC0495a, androidx.p022c.p023a.AbstractC0500c
    /* renamed from: a */
    public View mo2773a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo2773a(context, cursor, viewGroup);
        a.setTag(new C0488a(a));
        ((ImageView) a.findViewById(R.id.edit_query)).setImageResource(this.f1770n);
        return a;
    }

    @Override // androidx.p022c.p023a.AbstractC0495a
    /* renamed from: a */
    public void mo2776a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0488a aVar = (C0488a) view.getTag();
        int i = this.f1779w;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1780a != null) {
            m2159a(aVar.f1780a, m2156a(cursor, this.f1774r));
        }
        if (aVar.f1781b != null) {
            String a = m2156a(cursor, this.f1776t);
            if (a != null) {
                charSequence = m2164b((CharSequence) a);
            } else {
                charSequence = m2156a(cursor, this.f1775s);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f1780a != null) {
                    aVar.f1780a.setSingleLine(false);
                    aVar.f1780a.setMaxLines(2);
                }
            } else if (aVar.f1780a != null) {
                aVar.f1780a.setSingleLine(true);
                aVar.f1780a.setMaxLines(1);
            }
            m2159a(aVar.f1781b, charSequence);
        }
        if (aVar.f1782c != null) {
            m2158a(aVar.f1782c, m2167e(cursor), 4);
        }
        if (aVar.f1783d != null) {
            m2158a(aVar.f1783d, m2168f(cursor), 8);
        }
        int i3 = this.f1772p;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1784e.setVisibility(0);
            aVar.f1784e.setTag(aVar.f1780a.getText());
            aVar.f1784e.setOnClickListener(this);
            return;
        }
        aVar.f1784e.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo2772a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1802d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2166d(mo2794a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2166d(mo2794a());
    }

    /* renamed from: c */
    private Drawable m2165c() {
        Drawable a = m2154a(this.f1767k.getSearchActivity());
        if (a != null) {
            return a;
        }
        return this.f1802d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    public void mo2774a(int i) {
        this.f1772p = i;
    }

    /* renamed from: f */
    private Drawable m2168f(Cursor cursor) {
        int i = this.f1778v;
        if (i == -1) {
            return null;
        }
        return m2155a(cursor.getString(i));
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1766j.onQueryRefine((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private Drawable m2163b(String str) {
        Drawable.ConstantState constantState = this.f1769m.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: d */
    private void m2166d(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m2167e(Cursor cursor) {
        int i = this.f1777u;
        if (i == -1) {
            return null;
        }
        Drawable a = m2155a(cursor.getString(i));
        if (a != null) {
            return a;
        }
        return m2165c();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z$a */
    public static final class C0488a {

        /* renamed from: a */
        public final TextView f1780a;

        /* renamed from: b */
        public final TextView f1781b;

        /* renamed from: c */
        public final ImageView f1782c;

        /* renamed from: d */
        public final ImageView f1783d;

        /* renamed from: e */
        public final ImageView f1784e;

        public C0488a(View view) {
            this.f1780a = (TextView) view.findViewById(16908308);
            this.f1781b = (TextView) view.findViewById(16908309);
            this.f1782c = (ImageView) view.findViewById(16908295);
            this.f1783d = (ImageView) view.findViewById(16908296);
            this.f1784e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    /* renamed from: a */
    private Drawable m2154a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1769m.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1769m.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1768l.getResources());
        }
        Drawable b = m2161b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f1769m.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: b */
    private CharSequence m2164b(CharSequence charSequence) {
        if (this.f1773q == null) {
            TypedValue typedValue = new TypedValue();
            this.f1802d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.f1773q = this.f1802d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1773q, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private Drawable m2155a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1768l.getPackageName() + "/" + parseInt;
            Drawable b = m2163b(str2);
            if (b != null) {
                return b;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f1768l, parseInt);
            m2160a(str2, drawable);
            return drawable;
        } catch (NumberFormatException unused) {
            Drawable b2 = m2163b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m2162b(Uri.parse(str));
            m2160a(str, b3);
            return b3;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m2161b(ComponentName componentName) {
        PackageManager packageManager = this.f1802d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, SmActions.ACTION_ONTHECALL_EXIT);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m2162b(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return mo2772a(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.f1768l.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
    }

    @Override // androidx.p022c.p023a.AbstractC0495a, androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: b */
    public CharSequence mo2777b(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m2157a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f1767k.shouldRewriteQueryFromData() && (a2 = m2157a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f1767k.shouldRewriteQueryFromText() || (a = m2157a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static String m2157a(Cursor cursor, String str) {
        return m2156a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m2156a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m2159a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m2160a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1769m.put(str, drawable.getConstantState());
        }
    }

    @Override // androidx.p022c.p023a.AbstractC0495a
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2796b(this.f1802d, this.f1801c, viewGroup);
            if (b != null) {
                ((C0488a) b.getTag()).f1780a.setText(e.toString());
            }
            return b;
        }
    }

    @Override // androidx.p022c.p023a.AbstractC0495a
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2773a(this.f1802d, this.f1801c, viewGroup);
            if (a != null) {
                ((C0488a) a.getTag()).f1780a.setText(e.toString());
            }
            return a;
        }
    }

    /* renamed from: a */
    private void m2158a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo2770a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1802d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public View$OnClickListenerC0487z(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1766j = searchView;
        this.f1767k = searchableInfo;
        this.f1770n = searchView.getSuggestionCommitIconResId();
        this.f1768l = context;
        this.f1769m = weakHashMap;
    }
}
