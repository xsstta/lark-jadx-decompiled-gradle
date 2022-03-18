package com.huawei.hms.site.widget;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.site.C23738a;
import com.huawei.hms.site.C23766q;
import com.huawei.hms.site.api.model.ChildrenNode;
import com.huawei.hms.site.api.model.Coordinate;
import com.huawei.hms.site.api.model.CoordinateBounds;
import com.huawei.hms.site.api.model.LocationType;
import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.api.model.Site;
import com.larksuite.suite.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SearchFragment extends Fragment {

    /* renamed from: a */
    public Site f58887a;

    /* renamed from: b */
    public SearchStatus f58888b;

    /* renamed from: c */
    public SiteSelectionListener f58889c;

    /* renamed from: d */
    public String f58890d;

    /* renamed from: e */
    public Coordinate f58891e;

    /* renamed from: f */
    public Integer f58892f;

    /* renamed from: g */
    public CoordinateBounds f58893g;

    /* renamed from: h */
    public String f58894h;

    /* renamed from: i */
    public String f58895i;

    /* renamed from: j */
    public String f58896j;

    /* renamed from: k */
    public List<LocationType> f58897k;

    /* renamed from: l */
    public String f58898l;

    /* renamed from: m */
    public String f58899m;

    /* renamed from: n */
    public SiteSearchView f58900n;

    /* renamed from: o */
    public boolean f58901o;

    /* renamed from: p */
    public Boolean f58902p;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_search_fragment_in_sdk, (ViewGroup) null);
        this.f58900n = (SiteSearchView) inflate.findViewById(R.id.fragmentSearchView);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.fragmentLinearLayout);
        linearLayout.requestFocus();
        this.f58900n.setOnQueryTextFocusChangeListener(new View$OnFocusChangeListenerC23779a(linearLayout));
        this.f58900n.setOnClickListener(new View$OnClickListenerC23780b());
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void setApiKey(String str) {
        if (str != null) {
            this.f58899m = str;
            return;
        }
        throw new IllegalArgumentException("ApiKey is null.");
    }

    public void setHint(String str) {
        this.f58898l = str;
        if (this.f58900n != null && str != null && str.length() != 0) {
            this.f58900n.setQueryHint(this.f58898l);
        }
    }

    public void setOnSiteSelectedListener(SiteSelectionListener siteSelectionListener) {
        this.f58889c = siteSelectionListener;
    }

    public void setSearchFilter(SearchFilter searchFilter) {
        if (searchFilter != null) {
            String query = searchFilter.getQuery();
            Coordinate location = searchFilter.getLocation();
            Integer radius = searchFilter.getRadius();
            CoordinateBounds bounds = searchFilter.getBounds();
            String countryCode = searchFilter.getCountryCode();
            String language = searchFilter.getLanguage();
            String politicalView = searchFilter.getPoliticalView();
            List<LocationType> poiType = searchFilter.getPoiType();
            boolean isChildren = searchFilter.isChildren();
            Boolean strictBounds = searchFilter.getStrictBounds();
            this.f58890d = query;
            this.f58891e = location;
            this.f58892f = radius;
            this.f58893g = bounds;
            this.f58894h = countryCode;
            this.f58895i = language;
            this.f58896j = politicalView;
            this.f58897k = poiType;
            this.f58901o = isChildren;
            this.f58902p = strictBounds;
            return;
        }
        throw new IllegalArgumentException("SearchFilter is null.");
    }

    /* renamed from: com.huawei.hms.site.widget.SearchFragment$b */
    public class View$OnClickListenerC23780b implements View.OnClickListener {
        public View$OnClickListenerC23780b() {
        }

        public void onClick(View view) {
            C23766q qVar = new C23766q(new Intent(SearchFragment.this.getActivity(), SearchActivity.class));
            qVar.putExtra(SearchIntents.EXTRA_QUERY, SearchFragment.this.f58890d);
            qVar.putExtra("location", SearchFragment.this.f58891e);
            qVar.putExtra("radius", SearchFragment.this.f58892f);
            qVar.putExtra("bounds", SearchFragment.this.f58893g);
            qVar.putExtra("countryCode", SearchFragment.this.f58894h);
            qVar.putExtra("language", SearchFragment.this.f58895i);
            qVar.putExtra("politicalView", SearchFragment.this.f58896j);
            qVar.putExtra("poiType", (Serializable) SearchFragment.this.f58897k);
            qVar.putExtra("hint", SearchFragment.this.f58898l);
            qVar.putExtra("apiKey", SearchFragment.this.f58899m);
            qVar.putExtra("children", SearchFragment.this.f58901o);
            qVar.putExtra("strictBounds", SearchFragment.this.f58902p);
            SearchFragment.this.startActivityForResult(qVar, 1);
        }
    }

    /* renamed from: com.huawei.hms.site.widget.SearchFragment$a */
    public class View$OnFocusChangeListenerC23779a implements View.OnFocusChangeListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f58903a;

        public View$OnFocusChangeListenerC23779a(LinearLayout linearLayout) {
            this.f58903a = linearLayout;
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                C23766q qVar = new C23766q(new Intent(SearchFragment.this.getActivity(), SearchActivity.class));
                qVar.putExtra(SearchIntents.EXTRA_QUERY, SearchFragment.this.f58890d);
                qVar.putExtra("location", SearchFragment.this.f58891e);
                qVar.putExtra("radius", SearchFragment.this.f58892f);
                qVar.putExtra("politicalView", SearchFragment.this.f58896j);
                qVar.putExtra("poiType", (Serializable) SearchFragment.this.f58897k);
                qVar.putExtra("hint", SearchFragment.this.f58898l);
                qVar.putExtra("bounds", SearchFragment.this.f58893g);
                qVar.putExtra("countryCode", SearchFragment.this.f58894h);
                qVar.putExtra("language", SearchFragment.this.f58895i);
                qVar.putExtra("apiKey", SearchFragment.this.f58899m);
                qVar.putExtra("children", SearchFragment.this.f58901o);
                qVar.putExtra("strictBounds", SearchFragment.this.f58902p);
                SearchFragment.this.startActivityForResult(qVar, 1);
                this.f58903a.requestFocus();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable[] parcelableArr;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            ChildrenNode[] childrenNodeArr = null;
            Parcelable parcelable4 = null;
            if (i2 == 0) {
                if (this.f58889c != null) {
                    C23766q qVar = new C23766q(intent);
                    qVar.setExtrasClassLoader(ChildrenNode.class.getClassLoader());
                    Bundle bundleExtra = qVar.getBundleExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (bundleExtra == null) {
                        bundleExtra = new Bundle();
                    }
                    Bundle bundleExtra2 = qVar.getBundleExtra("childData");
                    if (bundleExtra2 == null) {
                        bundleExtra2 = new Bundle();
                    }
                    try {
                        parcelable2 = bundleExtra.getParcelable("site");
                    } catch (Exception e) {
                        C23738a.m86923a(e, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
                        parcelable2 = null;
                    }
                    if (parcelable2 != null) {
                        try {
                            parcelable3 = bundleExtra.getParcelable("site");
                        } catch (Exception e2) {
                            C23738a.m86923a(e2, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
                            parcelable3 = null;
                        }
                        this.f58887a = (Site) parcelable3;
                        try {
                            parcelableArr = bundleExtra2.getParcelableArray("child");
                        } catch (Exception e3) {
                            C23738a.m86923a(e3, C23738a.m86922a("getParcelableArray exception: "), "SafeBundle", null, true);
                            parcelableArr = new Parcelable[0];
                        }
                        if (parcelableArr != null) {
                            childrenNodeArr = (ChildrenNode[]) Arrays.copyOf(parcelableArr, parcelableArr.length, ChildrenNode[].class);
                        }
                        this.f58887a.getPoi().setChildrenNodes(childrenNodeArr);
                        this.f58889c.onSiteSelected(this.f58887a);
                        return;
                    }
                    throw new IllegalArgumentException("Site in intent is null.");
                }
            } else if (this.f58889c != null) {
                Bundle extras = new C23766q(intent).getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                try {
                    parcelable = extras.getParcelable("searchStatus");
                } catch (Exception e4) {
                    C23738a.m86923a(e4, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
                    parcelable = null;
                }
                if (parcelable != null) {
                    try {
                        parcelable4 = extras.getParcelable("searchStatus");
                    } catch (Exception e5) {
                        C23738a.m86923a(e5, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
                    }
                    SearchStatus searchStatus = (SearchStatus) parcelable4;
                    this.f58888b = searchStatus;
                    this.f58889c.onError(searchStatus);
                    return;
                }
                throw new IllegalArgumentException("searchStatus in intent is null.");
            }
        }
    }
}
