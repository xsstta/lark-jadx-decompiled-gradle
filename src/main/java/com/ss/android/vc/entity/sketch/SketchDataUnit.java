package com.ss.android.vc.entity.sketch;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilType;
import java.util.List;

public class SketchDataUnit {

    /* renamed from: a */
    public ShapeType f152754a;

    /* renamed from: b */
    public String f152755b;

    /* renamed from: c */
    public C60995d f152756c;

    /* renamed from: d */
    public C60996e f152757d;

    /* renamed from: e */
    public C60993b f152758e;

    /* renamed from: f */
    public C60994c f152759f;

    /* renamed from: g */
    public C60992a f152760g;

    /* renamed from: h */
    public int f152761h;

    /* renamed from: i */
    public ByteviewUser f152762i;

    /* renamed from: com.ss.android.vc.entity.sketch.SketchDataUnit$a */
    public static class C60992a {

        /* renamed from: a */
        public Coord f152763a;

        /* renamed from: b */
        public Coord f152764b;

        /* renamed from: c */
        public long f152765c;

        /* renamed from: d */
        public float f152766d;
    }

    /* renamed from: com.ss.android.vc.entity.sketch.SketchDataUnit$b */
    public static class C60993b {

        /* renamed from: a */
        public List<Coord> f152767a;

        /* renamed from: b */
        public int f152768b;

        /* renamed from: c */
        public boolean f152769c;

        /* renamed from: d */
        public float f152770d;

        /* renamed from: e */
        public long f152771e;
    }

    /* renamed from: com.ss.android.vc.entity.sketch.SketchDataUnit$c */
    public static class C60994c {

        /* renamed from: a */
        public Coord f152772a;

        /* renamed from: b */
        public float f152773b;

        /* renamed from: c */
        public float f152774c;

        /* renamed from: d */
        public long f152775d;

        /* renamed from: e */
        public float f152776e;
    }

    /* renamed from: com.ss.android.vc.entity.sketch.SketchDataUnit$d */
    public static class C60995d {

        /* renamed from: a */
        public List<Coord> f152777a;

        /* renamed from: b */
        public int f152778b;

        /* renamed from: c */
        public boolean f152779c;

        /* renamed from: d */
        public int f152780d;

        /* renamed from: e */
        public float f152781e;

        /* renamed from: f */
        public long f152782f;

        /* renamed from: g */
        public PencilType f152783g;
    }

    /* renamed from: com.ss.android.vc.entity.sketch.SketchDataUnit$e */
    public static class C60996e {

        /* renamed from: a */
        public Coord f152784a;

        /* renamed from: b */
        public Coord f152785b;

        /* renamed from: c */
        public long f152786c;

        /* renamed from: d */
        public float f152787d;
    }

    public enum ShapeType {
        PENCIL(1),
        RECTANGLE(2),
        COMET(3),
        OVAL(4),
        ARROW(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ShapeType valueOf(int i) {
            return forNumber(i);
        }

        public static ShapeType forNumber(int i) {
            if (i == 1) {
                return PENCIL;
            }
            if (i == 2) {
                return RECTANGLE;
            }
            if (i == 3) {
                return COMET;
            }
            if (i == 4) {
                return OVAL;
            }
            if (i != 5) {
                return null;
            }
            return ARROW;
        }

        private ShapeType(int i) {
            this.value = i;
        }
    }
}
