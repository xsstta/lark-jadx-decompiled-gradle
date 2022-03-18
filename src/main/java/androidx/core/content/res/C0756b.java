package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.b */
public final class C0756b {

    /* renamed from: a */
    private final Shader f3117a;

    /* renamed from: b */
    private final ColorStateList f3118b;

    /* renamed from: c */
    private int f3119c;

    /* renamed from: a */
    public Shader mo4279a() {
        return this.f3117a;
    }

    /* renamed from: b */
    public int mo4281b() {
        return this.f3119c;
    }

    /* renamed from: c */
    public boolean mo4283c() {
        if (this.f3117a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo4285e() {
        if (mo4283c() || this.f3119c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo4284d() {
        ColorStateList colorStateList;
        if (this.f3117a != null || (colorStateList = this.f3118b) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static C0756b m3659a(int i) {
        return new C0756b(null, null, i);
    }

    /* renamed from: b */
    public void mo4282b(int i) {
        this.f3119c = i;
    }

    /* renamed from: a */
    static C0756b m3660a(ColorStateList colorStateList) {
        return new C0756b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    static C0756b m3662a(Shader shader) {
        return new C0756b(shader, null, 0);
    }

    /* renamed from: a */
    public boolean mo4280a(int[] iArr) {
        if (mo4284d()) {
            ColorStateList colorStateList = this.f3118b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3119c) {
                this.f3119c = colorForState;
                return true;
            }
        }
        return false;
    }

    private C0756b(Shader shader, ColorStateList colorStateList, int i) {
        this.f3117a = shader;
        this.f3118b = colorStateList;
        this.f3119c = i;
    }

    /* renamed from: a */
    public static C0756b m3661a(Resources resources, int i, Resources.Theme theme) {
        try {
            return m3663b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: b */
    private static C0756b m3663b(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m3662a(C0757c.m3672a(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m3660a(C0755a.m3656a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
