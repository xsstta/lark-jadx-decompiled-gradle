package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.larksuite.suite.R;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0686a {

    /* renamed from: a */
    C0689b f2850a;

    /* renamed from: b */
    int f2851b = -1;

    /* renamed from: c */
    int f2852c = -1;

    /* renamed from: d */
    private final ConstraintLayout f2853d;

    /* renamed from: e */
    private SparseArray<C0687a> f2854e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0689b> f2855f = new SparseArray<>();

    /* renamed from: g */
    private AbstractC0695c f2856g = null;

    /* renamed from: a */
    public void mo3874a(AbstractC0695c cVar) {
        this.f2856g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static class C0687a {

        /* renamed from: a */
        int f2857a;

        /* renamed from: b */
        ArrayList<C0688b> f2858b = new ArrayList<>();

        /* renamed from: c */
        int f2859c = -1;

        /* renamed from: d */
        C0689b f2860d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3876a(C0688b bVar) {
            this.f2858b.add(bVar);
        }

        /* renamed from: a */
        public int mo3875a(float f, float f2) {
            for (int i = 0; i < this.f2858b.size(); i++) {
                if (this.f2858b.get(i).mo3877a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }

        public C0687a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16842960, R.attr.constraints});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2857a = obtainStyledAttributes.getResourceId(index, this.f2857a);
                } else if (index == 1) {
                    this.f2859c = obtainStyledAttributes.getResourceId(index, this.f2859c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2859c);
                    context.getResources().getResourceName(this.f2859c);
                    if ("layout".equals(resourceTypeName)) {
                        C0689b bVar = new C0689b();
                        this.f2860d = bVar;
                        bVar.mo3888a(context, this.f2859c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$b */
    public static class C0688b {

        /* renamed from: a */
        float f2861a = Float.NaN;

        /* renamed from: b */
        float f2862b = Float.NaN;

        /* renamed from: c */
        float f2863c = Float.NaN;

        /* renamed from: d */
        float f2864d = Float.NaN;

        /* renamed from: e */
        int f2865e = -1;

        /* renamed from: f */
        C0689b f2866f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3877a(float f, float f2) {
            if (!Float.isNaN(this.f2861a) && f < this.f2861a) {
                return false;
            }
            if (!Float.isNaN(this.f2862b) && f2 < this.f2862b) {
                return false;
            }
            if (!Float.isNaN(this.f2863c) && f > this.f2863c) {
                return false;
            }
            if (Float.isNaN(this.f2864d) || f2 <= this.f2864d) {
                return true;
            }
            return false;
        }

        public C0688b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2865e = obtainStyledAttributes.getResourceId(index, this.f2865e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2865e);
                    context.getResources().getResourceName(this.f2865e);
                    if ("layout".equals(resourceTypeName)) {
                        C0689b bVar = new C0689b();
                        this.f2866f = bVar;
                        bVar.mo3888a(context, this.f2865e);
                    }
                } else if (index == 1) {
                    this.f2864d = obtainStyledAttributes.getDimension(index, this.f2864d);
                } else if (index == 2) {
                    this.f2862b = obtainStyledAttributes.getDimension(index, this.f2862b);
                } else if (index == 3) {
                    this.f2863c = obtainStyledAttributes.getDimension(index, this.f2863c);
                } else if (index == 4) {
                    this.f2861a = obtainStyledAttributes.getDimension(index, this.f2861a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m3382a(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0689b bVar = new C0689b();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                bVar.mo3889a(context, xmlPullParser);
                this.f2855f.put(i, bVar);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m3381a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0687a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
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
                            aVar = new C0687a(context, xml);
                            this.f2854e.put(aVar.f2857a, aVar);
                        } else if (c == 3) {
                            C0688b bVar = new C0688b(context, xml);
                            if (aVar != null) {
                                aVar.mo3876a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m3382a(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    C0686a(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2853d = constraintLayout;
        m3381a(context, i);
    }

    /* renamed from: a */
    public void mo3873a(int i, float f, float f2) {
        C0689b bVar;
        int i2;
        C0687a aVar;
        int a;
        C0689b bVar2;
        int i3;
        int i4 = this.f2851b;
        if (i4 == i) {
            if (i == -1) {
                aVar = this.f2854e.valueAt(0);
            } else {
                aVar = this.f2854e.get(i4);
            }
            if ((this.f2852c == -1 || !aVar.f2858b.get(this.f2852c).mo3877a(f, f2)) && this.f2852c != (a = aVar.mo3875a(f, f2))) {
                if (a == -1) {
                    bVar2 = this.f2850a;
                } else {
                    bVar2 = aVar.f2858b.get(a).f2866f;
                }
                if (a == -1) {
                    i3 = aVar.f2859c;
                } else {
                    i3 = aVar.f2858b.get(a).f2865e;
                }
                if (bVar2 != null) {
                    this.f2852c = a;
                    AbstractC0695c cVar = this.f2856g;
                    if (cVar != null) {
                        cVar.mo3925a(-1, i3);
                    }
                    bVar2.mo3905c(this.f2853d);
                    AbstractC0695c cVar2 = this.f2856g;
                    if (cVar2 != null) {
                        cVar2.mo3926b(-1, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f2851b = i;
        C0687a aVar2 = this.f2854e.get(i);
        int a2 = aVar2.mo3875a(f, f2);
        if (a2 == -1) {
            bVar = aVar2.f2860d;
        } else {
            bVar = aVar2.f2858b.get(a2).f2866f;
        }
        if (a2 == -1) {
            i2 = aVar2.f2859c;
        } else {
            i2 = aVar2.f2858b.get(a2).f2865e;
        }
        if (bVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2852c = a2;
        AbstractC0695c cVar3 = this.f2856g;
        if (cVar3 != null) {
            cVar3.mo3925a(i, i2);
        }
        bVar.mo3905c(this.f2853d);
        AbstractC0695c cVar4 = this.f2856g;
        if (cVar4 != null) {
            cVar4.mo3926b(i, i2);
        }
    }
}
