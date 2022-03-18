package com.ss.android.lark.map.p2237a.p2239b;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.site.api.SearchResultListener;
import com.huawei.hms.site.api.SearchService;
import com.huawei.hms.site.api.SearchServiceFactory;
import com.huawei.hms.site.api.model.Coordinate;
import com.huawei.hms.site.api.model.DetailSearchRequest;
import com.huawei.hms.site.api.model.DetailSearchResponse;
import com.huawei.hms.site.api.model.HwLocationType;
import com.huawei.hms.site.api.model.NearbySearchRequest;
import com.huawei.hms.site.api.model.NearbySearchResponse;
import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.api.model.Site;
import com.huawei.hms.site.api.model.TextSearchRequest;
import com.huawei.hms.site.api.model.TextSearchResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.map.MapModule;
import com.ss.android.lark.map.p2240b.C44612a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.map.a.b.e */
public class C44595e implements AbstractC41562e {

    /* renamed from: a */
    private static final LatLng f113022a;

    /* renamed from: b */
    private static final LatLng f113023b;

    /* renamed from: c */
    private LatLng f113024c = f113023b;

    /* renamed from: d */
    private SearchService f113025d;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: c */
    public void mo149560c() {
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public double mo149553a() {
        return this.f113024c.latitude;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: b */
    public double mo149559b() {
        return this.f113024c.longitude;
    }

    static {
        LatLng latLng = new LatLng(39.908823d, 116.39747d);
        f113022a = latLng;
        f113023b = latLng;
    }

    /* renamed from: a */
    private void m176919a(Context context) {
        if (this.f113025d == null) {
            try {
                this.f113025d = SearchServiceFactory.create(context, URLEncoder.encode("CgB6e3x9/LdPj+RcH1JFL5PEFU17FQ2vgVPSmSwzK8N0afwTBqrdcYjnUm98Y0oXielqV8k3OQ6B7+6+tPzlc3E3", "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                Log.m165386e("LocationPOIServiceHW", e);
            }
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149554a(double d, double d2) {
        this.f113024c = new LatLng(d, d2);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149556a(Context context, final AbstractC41562e.AbstractC41565c cVar) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.m165389i("LocationPOIServiceHW", "failed to queryNearByLocation, haven't access location permission");
            cVar.mo149563a(-1);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        m176919a(context);
        NearbySearchRequest nearbySearchRequest = new NearbySearchRequest();
        nearbySearchRequest.setLocation(new Coordinate(this.f113024c.latitude, this.f113024c.longitude));
        nearbySearchRequest.setHwPoiType(HwLocationType.ADDRESS);
        nearbySearchRequest.setLanguage(Locale.getDefault().getLanguage());
        this.f113025d.nearbySearch(nearbySearchRequest, new SearchResultListener<NearbySearchResponse>() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44595e.C445961 */

            @Override // com.huawei.hms.site.api.SearchResultListener
            public void onSearchError(SearchStatus searchStatus) {
                Log.m165389i("LocationPOIServiceHW", "failed to queryNearByLocation : " + searchStatus.getErrorCode() + " " + searchStatus.getErrorMessage());
                cVar.mo149563a(-1);
            }

            /* renamed from: a */
            public void onSearchResult(NearbySearchResponse nearbySearchResponse) {
                if (nearbySearchResponse == null || nearbySearchResponse.getTotalCount() <= 0) {
                    cVar.mo149563a(-1);
                    return;
                }
                List<Site> sites = nearbySearchResponse.getSites();
                Log.m165379d("LocationPOIServiceHW", "queryNearByLocation called. sites size:" + sites.size());
                if (sites != null && !sites.isEmpty()) {
                    for (Site site : sites) {
                        Log.m165389i("TAG", String.format("siteId: '%s', name: %s\r\n", site.getSiteId(), site.getName()));
                        String name = site.getName();
                        String formatAddress = site.getFormatAddress();
                        LatLng latLng = new LatLng(site.location.lat, site.location.lng);
                        arrayList.add(new POIInfo(name, formatAddress, latLng.latitude, latLng.longitude));
                    }
                }
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.map.p2237a.p2239b.C44595e.C445961.RunnableC445971 */

                    public void run() {
                        cVar.mo149564a(arrayList);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149558a(Context context, String str, final AbstractC41562e.AbstractC41565c cVar) {
        final ArrayList arrayList = new ArrayList();
        m176919a(context);
        TextSearchRequest textSearchRequest = new TextSearchRequest();
        textSearchRequest.setQuery(str);
        textSearchRequest.setLocation(new Coordinate(this.f113024c.latitude, this.f113024c.longitude));
        textSearchRequest.setLanguage(Locale.getDefault().getLanguage());
        this.f113025d.textSearch(textSearchRequest, new SearchResultListener<TextSearchResponse>() {
            /* class com.ss.android.lark.map.p2237a.p2239b.C44595e.C445982 */

            @Override // com.huawei.hms.site.api.SearchResultListener
            public void onSearchError(SearchStatus searchStatus) {
                Log.m165389i("LocationPOIServiceHW", "failed to queryKeyWordLocation : " + searchStatus.getErrorCode() + " " + searchStatus.getErrorMessage());
                cVar.mo149563a(-1);
            }

            /* renamed from: a */
            public void onSearchResult(TextSearchResponse textSearchResponse) {
                if (textSearchResponse == null || textSearchResponse.getTotalCount() <= 0) {
                    cVar.mo149563a(-1);
                    return;
                }
                List<Site> sites = textSearchResponse.getSites();
                if (sites == null || sites.size() == 0) {
                    cVar.mo149563a(-1);
                    return;
                }
                for (Site site : sites) {
                    Log.m165389i("TAG", String.format("siteId: '%s', name: %s\r\n", site.getSiteId(), site.getName()));
                    arrayList.add(new POIInfo(site.getSiteId(), site.name, site.getFormatAddress(), 0.0d, 0.0d));
                }
                cVar.mo149564a(arrayList);
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149557a(Context context, final POIInfo pOIInfo, final AbstractC41562e.AbstractC41564b bVar) {
        if (pOIInfo.isPlaceIdEmpty()) {
            bVar.mo149562a(pOIInfo);
        } else if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.m165389i("LocationPOIServiceHW", "failed to getLatLngByPlaceId, haven't access location permission");
            bVar.mo149562a(pOIInfo);
        } else {
            m176919a(context);
            DetailSearchRequest detailSearchRequest = new DetailSearchRequest();
            detailSearchRequest.setSiteId(pOIInfo.getPlaceId());
            detailSearchRequest.setLanguage(Locale.getDefault().getLanguage());
            this.f113025d.detailSearch(detailSearchRequest, new SearchResultListener<DetailSearchResponse>() {
                /* class com.ss.android.lark.map.p2237a.p2239b.C44595e.C445993 */

                @Override // com.huawei.hms.site.api.SearchResultListener
                public void onSearchError(SearchStatus searchStatus) {
                    Log.m165389i("LocationPOIServiceHW", "failed to getLatLngByPlaceId : " + searchStatus.getErrorCode() + " " + searchStatus.getErrorMessage());
                    bVar.mo149562a(pOIInfo);
                }

                /* renamed from: a */
                public void onSearchResult(DetailSearchResponse detailSearchResponse) {
                    Site site;
                    if (detailSearchResponse == null || (site = detailSearchResponse.getSite()) == null) {
                        bVar.mo149562a(pOIInfo);
                        return;
                    }
                    Log.m165389i("TAG", String.format("siteId: '%s', name: %s\r\n", site.getSiteId(), site.getName()));
                    Log.m165389i("LocationPOIServiceHW", "success to getLatLngByPlaceId.");
                    if (detailSearchResponse.getSite().location != null) {
                        pOIInfo.setLatitude(detailSearchResponse.getSite().location.lat);
                        pOIInfo.setLongitude(detailSearchResponse.getSite().location.lng);
                    }
                    bVar.mo149562a(pOIInfo);
                }
            });
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149555a(Context context, double d, double d2, AbstractC41562e.AbstractC41563a aVar) {
        Locale locale;
        POIInfo pOIInfo = new POIInfo(d, d2);
        if (MapModule.getDependency().getLanguageDependency().mo149521a()) {
            locale = Locale.CHINA;
        } else {
            locale = Locale.ENGLISH;
        }
        try {
            List<Address> fromLocation = new Geocoder(context, locale).getFromLocation(d, d2, 1);
            if (CollectionUtils.isEmpty(fromLocation)) {
                UserSP.getInstance().putString("name_type", "none");
                pOIInfo.setLocationName(C44612a.m176961a());
                aVar.mo149561a(pOIInfo);
                return;
            }
            Address address = fromLocation.get(0);
            if (address == null) {
                UserSP.getInstance().putString("name_type", "none");
                pOIInfo.setLocationName(C44612a.m176961a());
                aVar.mo149561a(pOIInfo);
                return;
            }
            String addressLine = address.getAddressLine(0);
            if (TextUtils.isEmpty(addressLine)) {
                UserSP.getInstance().putString("name_type", "none");
                pOIInfo.setLocationName(C44612a.m176961a());
                aVar.mo149561a(pOIInfo);
                return;
            }
            UserSP.getInstance().putString("name_type", "full_address");
            pOIInfo.setLocationName(addressLine);
            aVar.mo149561a(pOIInfo);
        } catch (IOException e) {
            Log.m165384e("LocationPOIServiceHW", "failed to getFromLocation.", e);
            UserSP.getInstance().putString("name_type", "none");
            pOIInfo.setLocationName(C44612a.m176961a());
        }
    }
}
