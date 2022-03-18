package com.ss.android.lark.map.p2237a.p2238a;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.AbstractC22092d;
import com.google.android.gms.tasks.AbstractC22093e;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.map.MapModule;
import com.ss.android.lark.map.p2240b.C44612a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.map.a.a.e */
public class C44567e implements AbstractC41562e {

    /* renamed from: a */
    private static final LatLng f112956a;

    /* renamed from: b */
    private static final LatLng f112957b;

    /* renamed from: c */
    private LatLng f112958c = f112957b;

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: c */
    public void mo149560c() {
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public double mo149553a() {
        return this.f112958c.f53577a;
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: b */
    public double mo149559b() {
        return this.f112958c.f53578b;
    }

    static {
        LatLng latLng = new LatLng(39.908823d, 116.39747d);
        f112956a = latLng;
        f112957b = latLng;
    }

    /* renamed from: d */
    private LatLngBounds m176833d() {
        double d;
        double d2;
        double d3 = this.f112958c.f53577a + 0.5d;
        double d4 = this.f112958c.f53577a - 0.5d;
        if (d3 > 90.0d) {
            d3 = 90.0d - d3;
        }
        if (d4 < -90.0d) {
            d3 += 180.0d;
        }
        int i = (d3 > d4 ? 1 : (d3 == d4 ? 0 : -1));
        if (i > 0) {
            d = d3;
        } else {
            d = d4;
        }
        if (i <= 0) {
            d4 = d3;
        }
        double d5 = this.f112958c.f53578b + 0.5d;
        double d6 = this.f112958c.f53578b - 0.5d;
        if (d5 > 180.0d) {
            d5 = 180.0d - d5;
        }
        if (d6 < -180.0d) {
            d6 += 360.0d;
        }
        int i2 = (d5 > d6 ? 1 : (d5 == d6 ? 0 : -1));
        if (i2 > 0) {
            d2 = d5;
        } else {
            d2 = d6;
        }
        if (i2 > 0) {
            d5 = d6;
        }
        return new LatLngBounds(new LatLng(d4, d5), new LatLng(d, d2));
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149554a(double d, double d2) {
        this.f112958c = new LatLng(d, d2);
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149556a(Context context, final AbstractC41562e.AbstractC41565c cVar) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.m165389i("LocationPOIService", "failed to queryNearByLocation, haven't access location permission");
            cVar.mo149563a(-1);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Places.initialize(context, "AIzaSyDkHlBAlM1WRuge9dbcdCA-oveoLE2EZ4c", Locale.getDefault());
        Places.createClient(context).findCurrentPlace(FindCurrentPlaceRequest.builder(Arrays.asList(Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG)).build()).addOnSuccessListener(new AbstractC22093e<FindCurrentPlaceResponse>() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445692 */

            /* renamed from: a */
            public void mo75026a(FindCurrentPlaceResponse findCurrentPlaceResponse) {
                List<PlaceLikelihood> placeLikelihoods = findCurrentPlaceResponse.getPlaceLikelihoods();
                if (placeLikelihoods != null) {
                    Log.m165379d("LocationPOIService", "queryNearByLocation called. places size:" + placeLikelihoods.size());
                    for (PlaceLikelihood placeLikelihood : placeLikelihoods) {
                        Place place = placeLikelihood.getPlace();
                        if (place != null) {
                            String name = place.getName();
                            String address = place.getAddress();
                            LatLng latLng = place.getLatLng();
                            arrayList.add(new POIInfo(name, address, latLng == null ? 0.0d : latLng.f53577a, latLng == null ? 0.0d : latLng.f53578b));
                        }
                    }
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445692.RunnableC445701 */

                        public void run() {
                            cVar.mo149564a(arrayList);
                        }
                    });
                    return;
                }
                cVar.mo149563a(-1);
            }
        }).addOnFailureListener(new AbstractC22092d() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445681 */

            @Override // com.google.android.gms.tasks.AbstractC22092d
            /* renamed from: a */
            public void mo75025a(Exception exc) {
                Log.m165389i("LocationPOIService", "failed to queryNearByLocation, e:" + exc);
                cVar.mo149563a(-1);
            }
        });
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149557a(Context context, final POIInfo pOIInfo, final AbstractC41562e.AbstractC41564b bVar) {
        if (pOIInfo.isPlaceIdEmpty()) {
            bVar.mo149562a(pOIInfo);
        } else if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Log.m165389i("LocationPOIService", "failed to getLatLngByPlaceId, haven't access location permission");
            bVar.mo149562a(pOIInfo);
        } else {
            Places.initialize(context, "AIzaSyDkHlBAlM1WRuge9dbcdCA-oveoLE2EZ4c", Locale.getDefault());
            Places.createClient(context).fetchPlace(FetchPlaceRequest.builder(pOIInfo.getPlaceId(), Arrays.asList(Place.Field.ID, Place.Field.LAT_LNG)).build()).addOnSuccessListener(new AbstractC22093e<FetchPlaceResponse>() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445746 */

                /* renamed from: a */
                public void mo75026a(FetchPlaceResponse fetchPlaceResponse) {
                    Log.m165389i("LocationPOIService", "success to getLatLngByPlaceId.");
                    LatLng latLng = fetchPlaceResponse.getPlace().getLatLng();
                    if (latLng == null) {
                        bVar.mo149562a(pOIInfo);
                        return;
                    }
                    pOIInfo.setLatitude(latLng.f53577a);
                    pOIInfo.setLongitude(latLng.f53578b);
                    bVar.mo149562a(pOIInfo);
                }
            }).addOnFailureListener(new AbstractC22092d() {
                /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445735 */

                @Override // com.google.android.gms.tasks.AbstractC22092d
                /* renamed from: a */
                public void mo75025a(Exception exc) {
                    Log.m165383e("LocationPOIService", "failed to getLatLngByPlaceId, e:" + exc);
                    bVar.mo149562a(pOIInfo);
                }
            });
        }
    }

    @Override // com.ss.android.lark.location.p2146b.AbstractC41562e
    /* renamed from: a */
    public void mo149558a(Context context, String str, final AbstractC41562e.AbstractC41565c cVar) {
        final ArrayList arrayList = new ArrayList();
        Places.initialize(context, "AIzaSyDkHlBAlM1WRuge9dbcdCA-oveoLE2EZ4c", Locale.getDefault());
        PlacesClient createClient = Places.createClient(context);
        AutocompleteSessionToken newInstance = AutocompleteSessionToken.newInstance();
        LatLngBounds d = m176833d();
        createClient.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setLocationBias(RectangularBounds.newInstance(d.f53579a, d.f53580b)).setOrigin(this.f112958c).setSessionToken(newInstance).setQuery(str).build()).addOnSuccessListener(new AbstractC22093e<FindAutocompletePredictionsResponse>() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445724 */

            /* renamed from: a */
            public void mo75026a(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
                List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
                if (CollectionUtils.isEmpty(autocompletePredictions)) {
                    cVar.mo149563a(-1);
                    return;
                }
                Log.m165379d("LocationPOIService", "queryKeyWordLocation called. places size:" + autocompletePredictions.size());
                for (AutocompletePrediction autocompletePrediction : autocompletePredictions) {
                    arrayList.add(new POIInfo(autocompletePrediction.getPlaceId(), autocompletePrediction.getPrimaryText(null).toString(), autocompletePrediction.getSecondaryText(null).toString(), 0.0d, 0.0d));
                }
                cVar.mo149564a(arrayList);
            }
        }).addOnFailureListener(new AbstractC22092d() {
            /* class com.ss.android.lark.map.p2237a.p2238a.C44567e.C445713 */

            @Override // com.google.android.gms.tasks.AbstractC22092d
            /* renamed from: a */
            public void mo75025a(Exception exc) {
                Log.m165389i("LocationPOIService", "failed to queryKeyWordLocation, e:" + exc);
                cVar.mo149563a(-1);
            }
        });
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
            Log.m165384e("LocationPOIService", "failed to getFromLocation.", e);
            UserSP.getInstance().putString("name_type", "none");
            pOIInfo.setLocationName(C44612a.m176961a());
        }
    }
}
