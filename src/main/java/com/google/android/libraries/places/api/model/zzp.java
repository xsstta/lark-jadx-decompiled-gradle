package com.google.android.libraries.places.api.model;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class zzp extends Place {
    private final String zza;
    private final AddressComponents zzb;
    private final List<String> zzc;
    private final String zzd;
    private final LatLng zze;
    private final String zzf;
    private final OpeningHours zzg;
    private final String zzh;
    private final List<PhotoMetadata> zzi;
    private final PlusCode zzj;
    private final Integer zzk;
    private final Double zzl;
    private final List<Place.Type> zzm;
    private final Integer zzn;
    private final Integer zzo;
    private final LatLngBounds zzp;
    private final Uri zzq;

    @Override // com.google.android.libraries.places.api.model.Place
    public String getAddress() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public AddressComponents getAddressComponents() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<String> getAttributions() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getId() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLng getLatLng() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getName() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public OpeningHours getOpeningHours() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public String getPhoneNumber() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<PhotoMetadata> getPhotoMetadatas() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public PlusCode getPlusCode() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getPriceLevel() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Double getRating() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public List<Place.Type> getTypes() {
        return this.zzm;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUserRatingsTotal() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Integer getUtcOffsetMinutes() {
        return this.zzo;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public LatLngBounds getViewport() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.api.model.Place
    public Uri getWebsiteUri() {
        return this.zzq;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str = this.zza;
        int i17 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i18 = (i ^ 1000003) * 1000003;
        AddressComponents addressComponents = this.zzb;
        if (addressComponents == null) {
            i2 = 0;
        } else {
            i2 = addressComponents.hashCode();
        }
        int i19 = (i18 ^ i2) * 1000003;
        List<String> list = this.zzc;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int i20 = (i19 ^ i3) * 1000003;
        String str2 = this.zzd;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i21 = (i20 ^ i4) * 1000003;
        LatLng latLng = this.zze;
        if (latLng == null) {
            i5 = 0;
        } else {
            i5 = latLng.hashCode();
        }
        int i22 = (i21 ^ i5) * 1000003;
        String str3 = this.zzf;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        int i23 = (i22 ^ i6) * 1000003;
        OpeningHours openingHours = this.zzg;
        if (openingHours == null) {
            i7 = 0;
        } else {
            i7 = openingHours.hashCode();
        }
        int i24 = (i23 ^ i7) * 1000003;
        String str4 = this.zzh;
        if (str4 == null) {
            i8 = 0;
        } else {
            i8 = str4.hashCode();
        }
        int i25 = (i24 ^ i8) * 1000003;
        List<PhotoMetadata> list2 = this.zzi;
        if (list2 == null) {
            i9 = 0;
        } else {
            i9 = list2.hashCode();
        }
        int i26 = (i25 ^ i9) * 1000003;
        PlusCode plusCode = this.zzj;
        if (plusCode == null) {
            i10 = 0;
        } else {
            i10 = plusCode.hashCode();
        }
        int i27 = (i26 ^ i10) * 1000003;
        Integer num = this.zzk;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i28 = (i27 ^ i11) * 1000003;
        Double d = this.zzl;
        if (d == null) {
            i12 = 0;
        } else {
            i12 = d.hashCode();
        }
        int i29 = (i28 ^ i12) * 1000003;
        List<Place.Type> list3 = this.zzm;
        if (list3 == null) {
            i13 = 0;
        } else {
            i13 = list3.hashCode();
        }
        int i30 = (i29 ^ i13) * 1000003;
        Integer num2 = this.zzn;
        if (num2 == null) {
            i14 = 0;
        } else {
            i14 = num2.hashCode();
        }
        int i31 = (i30 ^ i14) * 1000003;
        Integer num3 = this.zzo;
        if (num3 == null) {
            i15 = 0;
        } else {
            i15 = num3.hashCode();
        }
        int i32 = (i31 ^ i15) * 1000003;
        LatLngBounds latLngBounds = this.zzp;
        if (latLngBounds == null) {
            i16 = 0;
        } else {
            i16 = latLngBounds.hashCode();
        }
        int i33 = (i32 ^ i16) * 1000003;
        Uri uri = this.zzq;
        if (uri != null) {
            i17 = uri.hashCode();
        }
        return i33 ^ i17;
    }

    public String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String str2 = this.zzd;
        String valueOf3 = String.valueOf(this.zze);
        String str3 = this.zzf;
        String valueOf4 = String.valueOf(this.zzg);
        String str4 = this.zzh;
        String valueOf5 = String.valueOf(this.zzi);
        String valueOf6 = String.valueOf(this.zzj);
        String valueOf7 = String.valueOf(this.zzk);
        String valueOf8 = String.valueOf(this.zzl);
        String valueOf9 = String.valueOf(this.zzm);
        String valueOf10 = String.valueOf(this.zzn);
        String valueOf11 = String.valueOf(this.zzo);
        String valueOf12 = String.valueOf(this.zzp);
        String valueOf13 = String.valueOf(this.zzq);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 220 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length() + String.valueOf(str3).length() + String.valueOf(valueOf4).length() + String.valueOf(str4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length());
        sb.append("Place{address=");
        sb.append(str);
        sb.append(", addressComponents=");
        sb.append(valueOf);
        sb.append(", attributions=");
        sb.append(valueOf2);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", openingHours=");
        sb.append(valueOf4);
        sb.append(", phoneNumber=");
        sb.append(str4);
        sb.append(", photoMetadatas=");
        sb.append(valueOf5);
        sb.append(", plusCode=");
        sb.append(valueOf6);
        sb.append(", priceLevel=");
        sb.append(valueOf7);
        sb.append(", rating=");
        sb.append(valueOf8);
        sb.append(", types=");
        sb.append(valueOf9);
        sb.append(", userRatingsTotal=");
        sb.append(valueOf10);
        sb.append(", utcOffsetMinutes=");
        sb.append(valueOf11);
        sb.append(", viewport=");
        sb.append(valueOf12);
        sb.append(", websiteUri=");
        sb.append(valueOf13);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Place) {
            Place place = (Place) obj;
            String str = this.zza;
            if (str != null ? str.equals(place.getAddress()) : place.getAddress() == null) {
                AddressComponents addressComponents = this.zzb;
                if (addressComponents != null ? addressComponents.equals(place.getAddressComponents()) : place.getAddressComponents() == null) {
                    List<String> list = this.zzc;
                    if (list != null ? list.equals(place.getAttributions()) : place.getAttributions() == null) {
                        String str2 = this.zzd;
                        if (str2 != null ? str2.equals(place.getId()) : place.getId() == null) {
                            LatLng latLng = this.zze;
                            if (latLng != null ? latLng.equals(place.getLatLng()) : place.getLatLng() == null) {
                                String str3 = this.zzf;
                                if (str3 != null ? str3.equals(place.getName()) : place.getName() == null) {
                                    OpeningHours openingHours = this.zzg;
                                    if (openingHours != null ? openingHours.equals(place.getOpeningHours()) : place.getOpeningHours() == null) {
                                        String str4 = this.zzh;
                                        if (str4 != null ? str4.equals(place.getPhoneNumber()) : place.getPhoneNumber() == null) {
                                            List<PhotoMetadata> list2 = this.zzi;
                                            if (list2 != null ? list2.equals(place.getPhotoMetadatas()) : place.getPhotoMetadatas() == null) {
                                                PlusCode plusCode = this.zzj;
                                                if (plusCode != null ? plusCode.equals(place.getPlusCode()) : place.getPlusCode() == null) {
                                                    Integer num = this.zzk;
                                                    if (num != null ? num.equals(place.getPriceLevel()) : place.getPriceLevel() == null) {
                                                        Double d = this.zzl;
                                                        if (d != null ? d.equals(place.getRating()) : place.getRating() == null) {
                                                            List<Place.Type> list3 = this.zzm;
                                                            if (list3 != null ? list3.equals(place.getTypes()) : place.getTypes() == null) {
                                                                Integer num2 = this.zzn;
                                                                if (num2 != null ? num2.equals(place.getUserRatingsTotal()) : place.getUserRatingsTotal() == null) {
                                                                    Integer num3 = this.zzo;
                                                                    if (num3 != null ? num3.equals(place.getUtcOffsetMinutes()) : place.getUtcOffsetMinutes() == null) {
                                                                        LatLngBounds latLngBounds = this.zzp;
                                                                        if (latLngBounds != null ? latLngBounds.equals(place.getViewport()) : place.getViewport() == null) {
                                                                            Uri uri = this.zzq;
                                                                            if (uri != null ? !uri.equals(place.getWebsiteUri()) : place.getWebsiteUri() != null) {
                                                                                return false;
                                                                            }
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    zzp(String str, AddressComponents addressComponents, List<String> list, String str2, LatLng latLng, String str3, OpeningHours openingHours, String str4, List<PhotoMetadata> list2, PlusCode plusCode, Integer num, Double d, List<Place.Type> list3, Integer num2, Integer num3, LatLngBounds latLngBounds, Uri uri) {
        this.zza = str;
        this.zzb = addressComponents;
        this.zzc = list;
        this.zzd = str2;
        this.zze = latLng;
        this.zzf = str3;
        this.zzg = openingHours;
        this.zzh = str4;
        this.zzi = list2;
        this.zzj = plusCode;
        this.zzk = num;
        this.zzl = d;
        this.zzm = list3;
        this.zzn = num2;
        this.zzo = num3;
        this.zzp = latLngBounds;
        this.zzq = uri;
    }
}
