package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.larksuite.suite.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0696d {

    /* renamed from: a */
    int f2958a = -1;

    /* renamed from: b */
    int f2959b = -1;

    /* renamed from: c */
    int f2960c = -1;

    /* renamed from: d */
    private SparseArray<C0697a> f2961d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0689b> f2962e = new SparseArray<>();

    /* renamed from: f */
    private AbstractC0695c f2963f = null;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0697a {

        /* renamed from: a */
        int f2964a;

        /* renamed from: b */
        ArrayList<C0698b> f2965b = new ArrayList<>();

        /* renamed from: c */
        int f2966c = -1;

        /* renamed from: d */
        boolean f2967d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3931a(C0698b bVar) {
            this.f2965b.add(bVar);
        }

        /* renamed from: a */
        public int mo3930a(float f, float f2) {
            for (int i = 0; i < this.f2965b.size(); i++) {
                if (this.f2965b.get(i).mo3932a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        public C0697a(Context context, XmlPullParser xmlPullParser) {
            this.f2967d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16842960, R.attr.constraints});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2964a = obtainStyledAttributes.getResourceId(index, this.f2964a);
                } else if (index == 1) {
                    this.f2966c = obtainStyledAttributes.getResourceId(index, this.f2966c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2966c);
                    context.getResources().getResourceName(this.f2966c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2967d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C0696d(Context context, XmlPullParser xmlPullParser) {
        m3442a(context, xmlPullParser);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0698b {

        /* renamed from: a */
        float f2968a = Float.NaN;

        /* renamed from: b */
        float f2969b = Float.NaN;

        /* renamed from: c */
        float f2970c = Float.NaN;

        /* renamed from: d */
        float f2971d = Float.NaN;

        /* renamed from: e */
        int f2972e = -1;

        /* renamed from: f */
        boolean f2973f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3932a(float f, float f2) {
            if (!Float.isNaN(this.f2968a) && f < this.f2968a) {
                return false;
            }
            if (!Float.isNaN(this.f2969b) && f2 < this.f2969b) {
                return false;
            }
            if (!Float.isNaN(this.f2970c) && f > this.f2970c) {
                return false;
            }
            if (Float.isNaN(this.f2971d) || f2 <= this.f2971d) {
                return true;
            }
            return false;
        }

        public C0698b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2972e = obtainStyledAttributes.getResourceId(index, this.f2972e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2972e);
                    context.getResources().getResourceName(this.f2972e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2973f = true;
                    }
                } else if (index == 1) {
                    this.f2971d = obtainStyledAttributes.getDimension(index, this.f2971d);
                } else if (index == 2) {
                    this.f2969b = obtainStyledAttributes.getDimension(index, this.f2969b);
                } else if (index == 3) {
                    this.f2970c = obtainStyledAttributes.getDimension(index, this.f2970c);
                } else if (index == 4) {
                    this.f2968a = obtainStyledAttributes.getDimension(index, this.f2968a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m3442a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.defaultState});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2958a = obtainStyledAttributes.getResourceId(index, this.f2958a);
            }
        }
        obtainStyledAttributes.recycle();
        C0697a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0697a(context, xmlPullParser);
                            this.f2961d.put(aVar.f2964a, aVar);
                        } else if (c != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            C0698b bVar = new C0698b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.mo3931a(bVar);
                            }
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo3928a(int i, int i2, int i3) {
        return mo3929b(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: a */
    public int mo3927a(int i, int i2, float f, float f2) {
        C0697a aVar = this.f2961d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            C0698b bVar = null;
            Iterator<C0698b> it = aVar.f2965b.iterator();
            while (it.hasNext()) {
                C0698b next = it.next();
                if (next.mo3932a(f, f2)) {
                    if (i == next.f2972e) {
                        return i;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f2972e;
            }
            return aVar.f2966c;
        } else if (aVar.f2966c == i) {
            return i;
        } else {
            Iterator<C0698b> it2 = aVar.f2965b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f2972e) {
                    return i;
                }
            }
            return aVar.f2966c;
        }
    }

    /* renamed from: b */
    public int mo3929b(int i, int i2, float f, float f2) {
        C0697a aVar;
        int a;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.f2961d.valueAt(0);
            } else {
                aVar = this.f2961d.get(this.f2959b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.f2960c != -1 && aVar.f2965b.get(i).mo3932a(f, f2)) || i == (a = aVar.mo3930a(f, f2))) {
                return i;
            }
            if (a == -1) {
                return aVar.f2966c;
            }
            return aVar.f2965b.get(a).f2972e;
        }
        C0697a aVar2 = this.f2961d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int a2 = aVar2.mo3930a(f, f2);
        if (a2 == -1) {
            return aVar2.f2966c;
        }
        return aVar2.f2965b.get(a2).f2972e;
    }
}
