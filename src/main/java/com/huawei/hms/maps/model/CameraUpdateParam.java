package com.huawei.hms.maps.model;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mcq;

public class CameraUpdateParam implements Parcelable {
    public static final Parcelable.Creator<CameraUpdateParam> CREATOR = new Parcelable.Creator<CameraUpdateParam>() {
        /* class com.huawei.hms.maps.model.CameraUpdateParam.C237021 */

        @Override // android.os.Parcelable.Creator
        public final CameraUpdateParam createFromParcel(Parcel parcel) {
            return new CameraUpdateParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraUpdateParam[] newArray(int i) {
            return new CameraUpdateParam[i];
        }
    };

    /* renamed from: a */
    private CameraPosition f58696a;

    /* renamed from: b */
    private LatLng f58697b;

    /* renamed from: c */
    private NewLatLngBounds f58698c;

    /* renamed from: d */
    private NewLatLngBoundsWidthHeight f58699d;

    /* renamed from: e */
    private NewLatLngZoom f58700e;

    /* renamed from: f */
    private ScrollBy f58701f;

    /* renamed from: g */
    private ZoomByWithFocus f58702g;

    /* renamed from: h */
    private ZoomBy f58703h;

    /* renamed from: i */
    private ZoomTo f58704i;

    public static class NewLatLngBounds implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBounds> CREATOR = new Parcelable.Creator<NewLatLngBounds>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBounds.C237031 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBounds createFromParcel(Parcel parcel) {
                return new NewLatLngBounds(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBounds[] newArray(int i) {
                return new NewLatLngBounds[i];
            }
        };

        /* renamed from: a */
        private LatLngBounds f58705a;

        /* renamed from: b */
        private int f58706b = Integer.MAX_VALUE;

        public NewLatLngBounds() {
        }

        protected NewLatLngBounds(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f58705a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.f58706b = parcelReader.readInt(3, this.f58706b);
        }

        public NewLatLngBounds(LatLngBounds latLngBounds, int i) {
            this.f58705a = latLngBounds;
            this.f58706b = i;
        }

        public int describeContents() {
            return 0;
        }

        public LatLngBounds getBounds() {
            return this.f58705a;
        }

        public int getPadding() {
            return this.f58706b;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.f58705a = latLngBounds;
        }

        public void setPadding(int i) {
            this.f58706b = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f58705a, i, false);
            parcelWrite.writeInt(3, this.f58706b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class NewLatLngBoundsWidthHeight implements Parcelable {
        public static final Parcelable.Creator<NewLatLngBoundsWidthHeight> CREATOR = new Parcelable.Creator<NewLatLngBoundsWidthHeight>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngBoundsWidthHeight.C237041 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBoundsWidthHeight createFromParcel(Parcel parcel) {
                return new NewLatLngBoundsWidthHeight(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngBoundsWidthHeight[] newArray(int i) {
                return new NewLatLngBoundsWidthHeight[i];
            }
        };

        /* renamed from: a */
        private LatLngBounds f58707a;

        /* renamed from: b */
        private int f58708b = Integer.MAX_VALUE;

        /* renamed from: c */
        private int f58709c = Integer.MAX_VALUE;

        /* renamed from: d */
        private int f58710d = Integer.MAX_VALUE;

        public NewLatLngBoundsWidthHeight() {
        }

        protected NewLatLngBoundsWidthHeight(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f58707a = (LatLngBounds) parcelReader.readParcelable(2, LatLngBounds.CREATOR, null);
            this.f58708b = parcelReader.readInt(3, this.f58708b);
            this.f58709c = parcelReader.readInt(4, this.f58709c);
            this.f58710d = parcelReader.readInt(5, this.f58710d);
        }

        public NewLatLngBoundsWidthHeight(LatLngBounds latLngBounds, int i, int i2, int i3) {
            this.f58707a = latLngBounds;
            this.f58709c = i;
            this.f58710d = i2;
            this.f58708b = i3;
        }

        public int describeContents() {
            return 0;
        }

        public LatLngBounds getBounds() {
            return this.f58707a;
        }

        public int getHeight() {
            return this.f58710d;
        }

        public int getPadding() {
            return this.f58708b;
        }

        public int getWidth() {
            return this.f58709c;
        }

        public void setBounds(LatLngBounds latLngBounds) {
            this.f58707a = latLngBounds;
        }

        public void setHeight(int i) {
            this.f58710d = i;
        }

        public void setPadding(int i) {
            this.f58708b = i;
        }

        public void setWidth(int i) {
            this.f58709c = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f58707a, i, false);
            parcelWrite.writeInt(3, this.f58708b);
            parcelWrite.writeInt(4, this.f58709c);
            parcelWrite.writeInt(5, this.f58710d);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class NewLatLngZoom implements Parcelable {
        public static final Parcelable.Creator<NewLatLngZoom> CREATOR = new Parcelable.Creator<NewLatLngZoom>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.NewLatLngZoom.C237051 */

            @Override // android.os.Parcelable.Creator
            public final NewLatLngZoom createFromParcel(Parcel parcel) {
                return new NewLatLngZoom(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NewLatLngZoom[] newArray(int i) {
                return new NewLatLngZoom[i];
            }
        };

        /* renamed from: a */
        private LatLng f58711a;

        /* renamed from: b */
        private float f58712b = -1.0f;

        public NewLatLngZoom() {
        }

        protected NewLatLngZoom(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f58711a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
            this.f58712b = parcelReader.readFloat(3, this.f58712b);
        }

        public NewLatLngZoom(LatLng latLng, float f) {
            this.f58711a = latLng;
            this.f58712b = f;
        }

        public int describeContents() {
            return 0;
        }

        public LatLng getLatLng() {
            return this.f58711a;
        }

        public float getZoom() {
            return this.f58712b;
        }

        public void setLatLng(LatLng latLng) {
            this.f58711a = latLng;
        }

        public void setZoom(float f) {
            this.f58712b = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeParcelable(2, this.f58711a, i, false);
            parcelWrite.writeFloat(3, this.f58712b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ScrollBy implements Parcelable {
        public static final Parcelable.Creator<ScrollBy> CREATOR = new Parcelable.Creator<ScrollBy>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ScrollBy.C237061 */

            @Override // android.os.Parcelable.Creator
            public final ScrollBy createFromParcel(Parcel parcel) {
                return new ScrollBy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ScrollBy[] newArray(int i) {
                return new ScrollBy[i];
            }
        };

        /* renamed from: a */
        private float f58713a = Float.MAX_VALUE;

        /* renamed from: b */
        private float f58714b = Float.MAX_VALUE;

        public ScrollBy() {
        }

        public ScrollBy(float f, float f2) {
            this.f58713a = f;
            this.f58714b = f2;
        }

        protected ScrollBy(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f58713a = parcelReader.readFloat(2, this.f58713a);
            this.f58714b = parcelReader.readFloat(3, this.f58714b);
        }

        public int describeContents() {
            return 0;
        }

        public float getxPixel() {
            return this.f58713a;
        }

        public float getyPixel() {
            return this.f58714b;
        }

        public void setxPixel(float f) {
            this.f58713a = f;
        }

        public void setyPixel(float f) {
            this.f58714b = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f58713a);
            parcelWrite.writeFloat(3, this.f58714b);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomBy implements Parcelable {
        public static final Parcelable.Creator<ZoomBy> CREATOR = new Parcelable.Creator<ZoomBy>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomBy.C237071 */

            @Override // android.os.Parcelable.Creator
            public final ZoomBy createFromParcel(Parcel parcel) {
                return new ZoomBy(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomBy[] newArray(int i) {
                return new ZoomBy[i];
            }
        };

        /* renamed from: a */
        private float f58715a;

        public ZoomBy(float f) {
            this.f58715a = f;
        }

        protected ZoomBy(Parcel parcel) {
            mcq.m86886b("zoomby", "zoomBy: constructor1 " + this.f58715a);
            this.f58715a = new ParcelReader(parcel).readFloat(2, BitmapDescriptorFactory.HUE_RED);
            mcq.m86886b("zoomby", "zoomBy: constructor ReadDone " + this.f58715a);
        }

        public int describeContents() {
            return 0;
        }

        public float getAmount() {
            return this.f58715a;
        }

        public void setAmount(float f) {
            this.f58715a = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            mcq.m86886b("zoomby", "zoomBy: writeToParcel " + this.f58715a);
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f58715a);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomByWithFocus implements Parcelable {
        public static final Parcelable.Creator<ZoomByWithFocus> CREATOR = new Parcelable.Creator<ZoomByWithFocus>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomByWithFocus.C237081 */

            @Override // android.os.Parcelable.Creator
            public final ZoomByWithFocus createFromParcel(Parcel parcel) {
                return new ZoomByWithFocus(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomByWithFocus[] newArray(int i) {
                return new ZoomByWithFocus[i];
            }
        };

        /* renamed from: a */
        private float f58716a;

        /* renamed from: b */
        private Point f58717b;

        public ZoomByWithFocus() {
        }

        public ZoomByWithFocus(float f, Point point) {
            this.f58716a = f;
            this.f58717b = point;
        }

        protected ZoomByWithFocus(Parcel parcel) {
            ParcelReader parcelReader = new ParcelReader(parcel);
            this.f58716a = parcelReader.readFloat(2, 1.0f);
            this.f58717b = (Point) parcelReader.readParcelable(3, Point.CREATOR, null);
        }

        public int describeContents() {
            return 0;
        }

        public float getAmount() {
            return this.f58716a;
        }

        public Point getFocus() {
            return this.f58717b;
        }

        public void setAmount(float f) {
            this.f58716a = f;
        }

        public void setFocus(Point point) {
            this.f58717b = point;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f58716a);
            parcelWrite.writeParcelable(3, this.f58717b, i, false);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public static class ZoomTo implements Parcelable {
        public static final Parcelable.Creator<ZoomTo> CREATOR = new Parcelable.Creator<ZoomTo>() {
            /* class com.huawei.hms.maps.model.CameraUpdateParam.ZoomTo.C237091 */

            @Override // android.os.Parcelable.Creator
            public final ZoomTo createFromParcel(Parcel parcel) {
                return new ZoomTo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoomTo[] newArray(int i) {
                return new ZoomTo[i];
            }
        };

        /* renamed from: a */
        private float f58718a = Float.MAX_VALUE;

        public ZoomTo(float f) {
            this.f58718a = f;
        }

        protected ZoomTo(Parcel parcel) {
            this.f58718a = new ParcelReader(parcel).readFloat(2, this.f58718a);
        }

        public int describeContents() {
            return 0;
        }

        public float getZoom() {
            return this.f58718a;
        }

        public void setZoom(float f) {
            this.f58718a = f;
        }

        public void writeToParcel(Parcel parcel, int i) {
            ParcelWrite parcelWrite = new ParcelWrite(parcel);
            int beginObjectHeader = parcelWrite.beginObjectHeader();
            parcelWrite.writeFloat(2, this.f58718a);
            parcelWrite.finishObjectHeader(beginObjectHeader);
        }
    }

    public CameraUpdateParam() {
    }

    protected CameraUpdateParam(Parcel parcel) {
        mcq.m86886b("ContentValues", "CameraUpdateParam: zoomBy");
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58696a = (CameraPosition) parcelReader.readParcelable(2, CameraPosition.CREATOR, null);
        this.f58697b = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
        this.f58698c = (NewLatLngBounds) parcelReader.readParcelable(4, NewLatLngBounds.CREATOR, null);
        this.f58700e = (NewLatLngZoom) parcelReader.readParcelable(5, NewLatLngZoom.CREATOR, null);
        this.f58701f = (ScrollBy) parcelReader.readParcelable(6, ScrollBy.CREATOR, null);
        this.f58702g = (ZoomByWithFocus) parcelReader.readParcelable(7, ZoomByWithFocus.CREATOR, null);
        this.f58703h = (ZoomBy) parcelReader.readParcelable(8, ZoomBy.CREATOR, null);
        this.f58704i = (ZoomTo) parcelReader.readParcelable(9, ZoomTo.CREATOR, null);
        this.f58699d = (NewLatLngBoundsWidthHeight) parcelReader.readParcelable(10, NewLatLngBoundsWidthHeight.CREATOR, null);
    }

    public int describeContents() {
        return 0;
    }

    public CameraPosition getCameraPosition() {
        return this.f58696a;
    }

    public LatLng getLatLng() {
        return this.f58697b;
    }

    public NewLatLngBounds getNewLatLngBounds() {
        return this.f58698c;
    }

    public NewLatLngBoundsWidthHeight getNewLatLngBoundsWidthHeight() {
        return this.f58699d;
    }

    public NewLatLngZoom getNewLatLngZoom() {
        return this.f58700e;
    }

    public ScrollBy getScrollBy() {
        return this.f58701f;
    }

    public ZoomBy getZoomBy() {
        return this.f58703h;
    }

    public ZoomByWithFocus getZoomByWithFocus() {
        return this.f58702g;
    }

    public ZoomTo getZoomTo() {
        return this.f58704i;
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        this.f58696a = cameraPosition;
    }

    public void setLatLng(LatLng latLng) {
        this.f58697b = latLng;
    }

    public void setNewLatLngBounds(NewLatLngBounds newLatLngBounds) {
        this.f58698c = newLatLngBounds;
    }

    public void setNewLatLngBoundsWidthHeight(NewLatLngBoundsWidthHeight newLatLngBoundsWidthHeight) {
        this.f58699d = newLatLngBoundsWidthHeight;
    }

    public void setNewLatLngZoom(NewLatLngZoom newLatLngZoom) {
        this.f58700e = newLatLngZoom;
    }

    public void setScrollBy(ScrollBy scrollBy) {
        this.f58701f = scrollBy;
    }

    public void setZoomBy(ZoomBy zoomBy) {
        this.f58703h = zoomBy;
    }

    public void setZoomByWithFocus(ZoomByWithFocus zoomByWithFocus) {
        this.f58702g = zoomByWithFocus;
    }

    public void setZoomTo(ZoomTo zoomTo) {
        this.f58704i = zoomTo;
    }

    public String toString() {
        return getClass().getSimpleName() + ":" + "{cameraPosition=" + this.f58696a + ",latLng=" + this.f58697b + ",scrollBy=" + this.f58701f + ",zoomByWithFocus=" + this.f58702g + ",newLatLngBounds=" + this.f58698c + ",newLatLngZoom=" + this.f58700e + ",zoomBy=" + this.f58703h + ",zoomTo=" + this.f58704i + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, getCameraPosition(), i, false);
        parcelWrite.writeParcelable(3, getLatLng(), i, false);
        parcelWrite.writeParcelable(4, getNewLatLngBounds(), i, false);
        parcelWrite.writeParcelable(5, getNewLatLngZoom(), i, false);
        parcelWrite.writeParcelable(6, getScrollBy(), i, false);
        parcelWrite.writeParcelable(7, getZoomByWithFocus(), i, false);
        parcelWrite.writeParcelable(8, getZoomBy(), i, false);
        parcelWrite.writeParcelable(9, getZoomTo(), i, false);
        parcelWrite.writeParcelable(10, getNewLatLngBoundsWidthHeight(), i, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
