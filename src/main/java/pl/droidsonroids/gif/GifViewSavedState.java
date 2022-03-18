package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* access modifiers changed from: package-private */
public class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new Parcelable.Creator<GifViewSavedState>() {
        /* class pl.droidsonroids.gif.GifViewSavedState.C701451 */

        /* renamed from: a */
        public GifViewSavedState[] newArray(int i) {
            return new GifViewSavedState[i];
        }

        /* renamed from: a */
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel);
        }
    };

    /* renamed from: a */
    final long[][] f175246a;

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f175246a = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f175246a;
            if (i < jArr.length) {
                jArr[i] = parcel.createLongArray();
                i++;
            } else {
                return;
            }
        }
    }

    GifViewSavedState(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        long[][] jArr2 = new long[1][];
        this.f175246a = jArr2;
        jArr2[0] = jArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo247257a(Drawable drawable, int i) {
        if (this.f175246a[i] != null && (drawable instanceof C70149c)) {
            C70149c cVar = (C70149c) drawable;
            cVar.mo247272a((long) cVar.f175253f.mo247195a(this.f175246a[i], cVar.f175252e));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f175246a.length);
        for (long[] jArr : this.f175246a) {
            parcel.writeLongArray(jArr);
        }
    }

    GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f175246a = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C70149c) {
                this.f175246a[i] = ((C70149c) drawable).f175253f.mo247217o();
            } else {
                this.f175246a[i] = null;
            }
        }
    }
}
