package android.support.v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* class android.support.v4.media.RatingCompat.C01171 */

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };

    /* renamed from: a */
    private final int f261a;

    /* renamed from: b */
    private final float f262b;

    /* renamed from: c */
    private Object f263c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Style {
    }

    public int describeContents() {
        return this.f261a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f261a);
        sb.append(" rating=");
        float f = this.f262b;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static RatingCompat m284a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return new RatingCompat(1, f);
    }

    /* renamed from: b */
    public static RatingCompat m285b(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return new RatingCompat(2, f);
    }

    /* renamed from: a */
    public static RatingCompat m280a(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: a */
    public static RatingCompat m281a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static RatingCompat m283a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m284a(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m285b(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m282a(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m280a(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m281a(ratingStyle);
            }
            ratingCompat.f263c = obj;
        }
        return ratingCompat;
    }

    RatingCompat(int i, float f) {
        this.f261a = i;
        this.f262b = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f261a);
        parcel.writeFloat(this.f262b);
    }

    /* renamed from: a */
    public static RatingCompat m282a(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }
}
