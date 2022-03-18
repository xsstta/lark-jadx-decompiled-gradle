package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.w */
public class C0479w extends Resources {

    /* renamed from: a */
    private final Resources f1732a;

    public Configuration getConfiguration() {
        return this.f1732a.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1732a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.f1732a.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.f1732a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws Resources.NotFoundException {
        return this.f1732a.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.f1732a.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        return this.f1732a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.f1732a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.f1732a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.f1732a.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.f1732a.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        return m2136a(this.f1732a, i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.f1732a.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.f1732a.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.f1732a.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.f1732a.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.f1732a.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.f1732a.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) throws Resources.NotFoundException {
        return this.f1732a.getString(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.f1732a.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.f1732a.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.f1732a.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.f1732a.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.f1732a.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.f1732a.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.f1732a.openRawResourceFd(i);
    }

    public C0479w(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1732a = resources;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return this.f1732a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.f1732a.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.f1732a.getQuantityText(i, i2);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1732a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1732a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f1732a.getDrawable(i, theme);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.f1732a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f1732a.getText(i, charSequence);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1732a.openRawResource(i, typedValue);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1732a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    /* renamed from: a */
    public static int m2136a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f1732a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1732a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1732a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1732a.parseBundleExtra(str, attributeSet, bundle);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f1732a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.f1732a.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1732a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f1732a.getValueForDensity(i, i2, typedValue, z);
    }
}
