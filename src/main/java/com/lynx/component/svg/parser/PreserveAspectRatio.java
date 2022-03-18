package com.lynx.component.svg.parser;

public class PreserveAspectRatio {

    /* renamed from: a */
    public static final PreserveAspectRatio f65288a = new PreserveAspectRatio(null, null);

    /* renamed from: b */
    public static final PreserveAspectRatio f65289b = new PreserveAspectRatio(Alignment.none, null);

    /* renamed from: c */
    public static final PreserveAspectRatio f65290c = new PreserveAspectRatio(Alignment.xMidYMid, Scale.meet);

    /* renamed from: d */
    public static final PreserveAspectRatio f65291d = new PreserveAspectRatio(Alignment.xMinYMin, Scale.meet);

    /* renamed from: e */
    public static final PreserveAspectRatio f65292e = new PreserveAspectRatio(Alignment.xMaxYMax, Scale.meet);

    /* renamed from: f */
    public static final PreserveAspectRatio f65293f = new PreserveAspectRatio(Alignment.xMidYMin, Scale.meet);

    /* renamed from: g */
    public static final PreserveAspectRatio f65294g = new PreserveAspectRatio(Alignment.xMidYMax, Scale.meet);

    /* renamed from: h */
    public static final PreserveAspectRatio f65295h = new PreserveAspectRatio(Alignment.xMidYMid, Scale.slice);

    /* renamed from: i */
    public static final PreserveAspectRatio f65296i = new PreserveAspectRatio(Alignment.xMinYMin, Scale.slice);

    /* renamed from: j */
    private Alignment f65297j;

    /* renamed from: k */
    private Scale f65298k;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    /* renamed from: a */
    public Alignment mo93812a() {
        return this.f65297j;
    }

    /* renamed from: b */
    public Scale mo93813b() {
        return this.f65298k;
    }

    public String toString() {
        return this.f65297j + " " + this.f65298k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        if (this.f65297j == preserveAspectRatio.f65297j && this.f65298k == preserveAspectRatio.f65298k) {
            return true;
        }
        return false;
    }

    PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f65297j = alignment;
        this.f65298k = scale;
    }
}
