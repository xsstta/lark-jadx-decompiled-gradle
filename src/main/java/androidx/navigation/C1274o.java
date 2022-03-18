package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.C1248e;
import androidx.navigation.C1264i;
import androidx.navigation.C1275p;
import com.larksuite.suite.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.navigation.o */
public final class C1274o {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f4571a = new ThreadLocal<>();

    /* renamed from: b */
    private Context f4572b;

    /* renamed from: c */
    private C1293s f4573c;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C1269k mo6381a(int r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C1274o.mo6381a(int):androidx.navigation.k");
    }

    /* renamed from: a */
    private void m5787a(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws IOException, XmlPullParserException {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, new int[]{16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive});
        int resourceId = obtainAttributes.getResourceId(0, 0);
        C1247d dVar = new C1247d(obtainAttributes.getResourceId(1, 0));
        C1275p.C1276a aVar = new C1275p.C1276a();
        aVar.mo6393a(obtainAttributes.getBoolean(4, false));
        aVar.mo6392a(obtainAttributes.getResourceId(7, -1), obtainAttributes.getBoolean(8, false));
        aVar.mo6391a(obtainAttributes.getResourceId(2, -1));
        aVar.mo6395b(obtainAttributes.getResourceId(3, -1));
        aVar.mo6396c(obtainAttributes.getResourceId(5, -1));
        aVar.mo6397d(obtainAttributes.getResourceId(6, -1));
        dVar.mo6286a(aVar.mo6394a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                    m5784a(resources, bundle, attributeSet, i);
                }
            }
        }
        if (!bundle.isEmpty()) {
            dVar.mo6285a(bundle);
        }
        navDestination.mo6244a(resourceId, dVar);
        obtainAttributes.recycle();
    }

    public C1274o(Context context, C1293s sVar) {
        this.f4572b = context;
        this.f4573c = sVar;
    }

    /* renamed from: a */
    private C1248e m5782a(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        AbstractC1277q<?> qVar;
        C1248e.C1249a aVar = new C1248e.C1249a();
        boolean z = false;
        aVar.mo6297a(typedArray.getBoolean(3, false));
        ThreadLocal<TypedValue> threadLocal = f4571a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        int i2 = null;
        if (string != null) {
            qVar = AbstractC1277q.m5804a(string, resources.getResourcePackageName(i));
        } else {
            qVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            if (qVar == AbstractC1277q.f4589b) {
                if (typedValue.resourceId != 0) {
                    i2 = Integer.valueOf(typedValue.resourceId);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i2 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVar.mo6403b() + ". Must be a reference to a resource.");
                }
            } else if (typedValue.resourceId != 0) {
                if (qVar == null) {
                    qVar = AbstractC1277q.f4589b;
                    i2 = Integer.valueOf(typedValue.resourceId);
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + qVar.mo6403b() + ". You must use a \"" + AbstractC1277q.f4589b.mo6403b() + "\" type to reference other resources.");
                }
            } else if (qVar == AbstractC1277q.f4597j) {
                i2 = typedArray.getString(1);
            } else {
                int i3 = typedValue.type;
                if (i3 == 3) {
                    String charSequence = typedValue.string.toString();
                    if (qVar == null) {
                        qVar = AbstractC1277q.m5805b(charSequence);
                    }
                    i2 = qVar.mo6400a(charSequence);
                } else if (i3 == 4) {
                    qVar = m5783a(typedValue, qVar, AbstractC1277q.f4593f, string, "float");
                    i2 = Float.valueOf(typedValue.getFloat());
                } else if (i3 == 5) {
                    qVar = m5783a(typedValue, qVar, AbstractC1277q.f4588a, string, "dimension");
                    i2 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                } else if (i3 == 18) {
                    qVar = m5783a(typedValue, qVar, AbstractC1277q.f4595h, string, "boolean");
                    if (typedValue.data != 0) {
                        z = true;
                    }
                    i2 = Boolean.valueOf(z);
                } else if (typedValue.type < 16 || typedValue.type > 31) {
                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                } else if (qVar == AbstractC1277q.f4593f) {
                    qVar = m5783a(typedValue, qVar, AbstractC1277q.f4593f, string, "float");
                    i2 = Float.valueOf((float) typedValue.data);
                } else {
                    qVar = m5783a(typedValue, qVar, AbstractC1277q.f4588a, string, "integer");
                    i2 = Integer.valueOf(typedValue.data);
                }
            }
        }
        if (i2 != null) {
            aVar.mo6296a(i2);
        }
        if (qVar != null) {
            aVar.mo6295a(qVar);
        }
        return aVar.mo6298a();
    }

    /* renamed from: a */
    private void m5785a(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, new int[]{16844014, R.attr.action, R.attr.mimeType, R.attr.uri});
        String string = obtainAttributes.getString(3);
        String string2 = obtainAttributes.getString(1);
        String string3 = obtainAttributes.getString(2);
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            C1264i.C1265a aVar = new C1264i.C1265a();
            if (string != null) {
                aVar.mo6353a(string.replace("${applicationId}", this.f4572b.getPackageName()));
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.mo6355b(string2.replace("${applicationId}", this.f4572b.getPackageName()));
            }
            if (string3 != null) {
                aVar.mo6356c(string3.replace("${applicationId}", this.f4572b.getPackageName()));
            }
            navDestination.mo6246a(aVar.mo6354a());
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    /* renamed from: a */
    private void m5784a(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, new int[]{16842755, 16843245, R.attr.argType, R.attr.nullable});
        String string = obtainAttributes.getString(0);
        if (string != null) {
            C1248e a = m5782a(obtainAttributes, resources, i);
            if (a.mo6290a()) {
                a.mo6289a(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: a */
    private NavDestination m5781a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        NavDestination d = this.f4573c.mo6457a(xmlResourceParser.getName()).mo6267d();
        d.mo6245a(this.f4572b, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return d;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    m5786a(resources, d, attributeSet, i);
                } else if ("deepLink".equals(name)) {
                    m5785a(resources, d, attributeSet);
                } else if ("action".equals(name)) {
                    m5787a(resources, d, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (d instanceof C1269k)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, new int[]{R.attr.graph});
                    ((C1269k) d).mo6370a((NavDestination) mo6381a(obtainAttributes.getResourceId(0, 0)));
                    obtainAttributes.recycle();
                } else if (d instanceof C1269k) {
                    ((C1269k) d).mo6370a(m5781a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    private void m5786a(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, new int[]{16842755, 16843245, R.attr.argType, R.attr.nullable});
        String string = obtainAttributes.getString(0);
        if (string != null) {
            navDestination.mo6249a(string, m5782a(obtainAttributes, resources, i));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: a */
    private static AbstractC1277q m5783a(TypedValue typedValue, AbstractC1277q qVar, AbstractC1277q qVar2, String str, String str2) throws XmlPullParserException {
        if (qVar == null || qVar == qVar2) {
            return qVar != null ? qVar : qVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }
}
