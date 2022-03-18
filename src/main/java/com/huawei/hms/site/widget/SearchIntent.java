package com.huawei.hms.site.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SearchIntent {
    public static int SEARCH_REQUEST_CODE = 1;

    /* renamed from: m */
    public static Intent f58906m;

    /* renamed from: a */
    public String f58907a;

    /* renamed from: b */
    public Coordinate f58908b;

    /* renamed from: c */
    public Integer f58909c;

    /* renamed from: d */
    public CoordinateBounds f58910d;

    /* renamed from: e */
    public String f58911e;

    /* renamed from: f */
    public String f58912f;

    /* renamed from: g */
    public String f58913g;

    /* renamed from: h */
    public List<LocationType> f58914h;

    /* renamed from: i */
    public String f58915i;

    /* renamed from: j */
    public String f58916j;

    /* renamed from: k */
    public boolean f58917k;

    /* renamed from: l */
    public Boolean f58918l;

    public static boolean isSuccess(int i) {
        return i == 0;
    }

    public Intent getIntent(Activity activity) {
        C23766q qVar = new C23766q(new Intent(activity, SearchActivity.class));
        f58906m = qVar;
        qVar.putExtra(SearchIntents.EXTRA_QUERY, this.f58907a);
        f58906m.putExtra("location", this.f58908b);
        f58906m.putExtra("radius", this.f58909c);
        f58906m.putExtra("bounds", this.f58910d);
        f58906m.putExtra("countryCode", this.f58911e);
        f58906m.putExtra("language", this.f58912f);
        f58906m.putExtra("politicalView", this.f58913g);
        f58906m.putExtra("poiType", (Serializable) this.f58914h);
        f58906m.putExtra("hint", this.f58916j);
        f58906m.putExtra("apiKey", this.f58915i);
        f58906m.putExtra("children", this.f58917k);
        f58906m.putExtra("strictBounds", this.f58918l);
        return f58906m;
    }

    public void setApiKey(String str) {
        if (str != null) {
            this.f58915i = str;
            return;
        }
        throw new IllegalArgumentException("ApiKey is null.");
    }

    public void setHint(String str) {
        this.f58916j = str;
    }

    public void setSearchFilter(SearchFilter searchFilter) {
        if (searchFilter != null) {
            this.f58907a = searchFilter.getQuery();
            this.f58908b = searchFilter.getLocation();
            this.f58909c = searchFilter.getRadius();
            this.f58910d = searchFilter.getBounds();
            this.f58911e = searchFilter.getCountryCode();
            this.f58912f = searchFilter.getLanguage();
            this.f58913g = searchFilter.getPoliticalView();
            this.f58914h = searchFilter.getPoiType();
            this.f58917k = searchFilter.isChildren();
            this.f58918l = searchFilter.getStrictBounds();
            return;
        }
        throw new IllegalArgumentException("SearchFilter is null.");
    }

    public SearchStatus getStatusFromIntent(Intent intent) {
        Parcelable parcelable;
        Objects.requireNonNull(intent, "Intent is null.");
        Bundle extras = new C23766q(intent).getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        Parcelable parcelable2 = null;
        try {
            parcelable = extras.getParcelable("searchStatus");
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
            parcelable = null;
        }
        if (parcelable != null) {
            try {
                parcelable2 = extras.getParcelable("searchStatus");
            } catch (Exception e2) {
                C23738a.m86923a(e2, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
            }
            return (SearchStatus) parcelable2;
        }
        throw new IllegalArgumentException("searchStatus in intent is null.");
    }

    public Site getSiteFromIntent(Intent intent) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable[] parcelableArr;
        Objects.requireNonNull(intent, "Intent is null.");
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
        ChildrenNode[] childrenNodeArr = null;
        try {
            parcelable = bundleExtra.getParcelable("site");
        } catch (Exception e) {
            C23738a.m86923a(e, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
            parcelable = null;
        }
        if (parcelable != null) {
            try {
                parcelable2 = bundleExtra.getParcelable("site");
            } catch (Exception e2) {
                C23738a.m86923a(e2, C23738a.m86922a("getParcelable exception: "), "SafeBundle", null, true);
                parcelable2 = null;
            }
            Site site = (Site) parcelable2;
            try {
                parcelableArr = bundleExtra2.getParcelableArray("child");
            } catch (Exception e3) {
                C23738a.m86923a(e3, C23738a.m86922a("getParcelableArray exception: "), "SafeBundle", null, true);
                parcelableArr = new Parcelable[0];
            }
            if (parcelableArr != null) {
                childrenNodeArr = (ChildrenNode[]) Arrays.copyOf(parcelableArr, parcelableArr.length, ChildrenNode[].class);
            }
            site.getPoi().setChildrenNodes(childrenNodeArr);
            return site;
        }
        throw new IllegalArgumentException("Site in intent is null.");
    }
}
