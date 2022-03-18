package com.larksuite.component.dynamicresources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
public class DynamicResourcesImpl extends Resources implements AbstractC24311j {
    private static LruCache<Integer, Integer> sIdCache;
    private final C24279c mCharSequenceResourcesRetriever = new C24279c();
    private final C24280d mColorResourcesRetriever = new C24280d();
    private final C24281e mColorStateListResourcesRetriever = new C24281e();
    private final C24282f mDrawableResourcesRetriever = new C24282f();
    public final Resources mDynamicResources;
    private final String mDynamicResourcesPkgName;
    boolean mInited = false;
    private final C24283g mStringResourcesRetriever = new C24283g();
    public final Resources mSysResources;

    /* renamed from: b */
    public Resources mo86915b() {
        return this.mSysResources;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo86916c() {
        if ((getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public Configuration getConfiguration() {
        if (!this.mInited) {
            return super.getConfiguration();
        }
        return this.mSysResources.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        if (!this.mInited) {
            return super.getDisplayMetrics();
        }
        return this.mSysResources.getDisplayMetrics();
    }

    /* renamed from: a */
    static void m88640a() {
        LruCache<Integer, Integer> lruCache = sIdCache;
        if (lruCache != null && lruCache.size() != 0) {
            Log.m165379d("DynamicResources", "clearing id cache.");
            sIdCache.evictAll();
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$c */
    private class C24279c extends AbstractC24278b<CharSequence> {
        C24279c() {
            super("CharSequence", false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public CharSequence mo86971a(Resources resources, int i) {
            return resources.getText(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public CharSequence mo86972a(Resources resources, int i, Resources.Theme theme) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$d */
    private class C24280d extends AbstractC24277a {
        protected C24280d() {
            super("Color", true);
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.component.dynamicresources.DynamicResourcesImpl.AbstractC24277a
        /* renamed from: a */
        public int mo86967a(Resources resources, int i) {
            return resources.getColor(i);
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.component.dynamicresources.DynamicResourcesImpl.AbstractC24277a
        /* renamed from: a */
        public int mo86968a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$e */
    private class C24281e extends AbstractC24278b<ColorStateList> {
        public C24281e() {
            super("ColorStateList", true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public ColorStateList mo86971a(Resources resources, int i) {
            return resources.getColorStateList(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public ColorStateList mo86972a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$f */
    private class C24282f extends AbstractC24278b<Drawable> {
        protected C24282f() {
            super("Drawable", false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Drawable mo86971a(Resources resources, int i) {
            return resources.getDrawable(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Drawable mo86972a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$g */
    private class C24283g extends AbstractC24278b<String> {
        C24283g() {
            super("String", false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo86971a(Resources resources, int i) {
            return resources.getString(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo86972a(Resources resources, int i, Resources.Theme theme) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getAnimation(i);
        }
        return this.mSysResources.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getBoolean(i);
        }
        return this.mSysResources.getBoolean(i);
    }

    @Override // com.larksuite.component.dynamicresources.AbstractC24311j, android.content.res.Resources
    public int getColor(int i) {
        if (!this.mInited) {
            return super.getColor(i);
        }
        return this.mColorResourcesRetriever.mo86965a(i);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getDimension(i);
        }
        return this.mSysResources.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getDimensionPixelOffset(i);
        }
        return this.mSysResources.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getDimensionPixelSize(i);
        }
        return this.mSysResources.getDimensionPixelSize(i);
    }

    public float getFloat(int i) {
        if (!this.mInited) {
            return super.getFloat(i);
        }
        return this.mSysResources.getFloat(i);
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getFont(i);
        }
        return this.mSysResources.getFont(i);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getIntArray(i);
        }
        return this.mSysResources.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return m88641b(this, i);
        }
        return m88642c(this.mSysResources, i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getLayout(i);
        }
        return this.mSysResources.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getMovie(i);
        }
        return this.mSysResources.getMovie(i);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getResourceEntryName(i);
        }
        return this.mSysResources.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getResourceName(i);
        }
        return this.mSysResources.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getResourcePackageName(i);
        }
        return this.mSysResources.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getResourceTypeName(i);
        }
        return this.mSysResources.getResourceTypeName(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getStringArray(i);
        }
        return this.mSysResources.getStringArray(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getTextArray(i);
        }
        return this.mSysResources.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getXml(i);
        }
        return this.mSysResources.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.obtainTypedArray(i);
        }
        return this.mSysResources.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.openRawResource(i);
        }
        return this.mSysResources.openRawResource(i);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.openRawResourceFd(i);
        }
        return this.mSysResources.openRawResourceFd(i);
    }

    @Override // com.larksuite.component.dynamicresources.AbstractC24311j, android.content.res.Resources
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getColorStateList(i);
        }
        return (ColorStateList) this.mColorStateListResourcesRetriever.mo86969a(i);
    }

    @Override // com.larksuite.component.dynamicresources.AbstractC24311j, android.content.res.Resources
    public Drawable getDrawable(int i) {
        if (!this.mInited) {
            return super.getDrawable(i);
        }
        return (Drawable) this.mDrawableResourcesRetriever.mo86969a(i);
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        if (!this.mInited) {
            return super.getString(i);
        }
        return (String) this.mStringResourcesRetriever.mo86969a(i);
    }

    @Override // com.larksuite.component.dynamicresources.AbstractC24311j, android.content.res.Resources
    public CharSequence getText(int i) {
        if (!this.mInited) {
            return super.getText(i);
        }
        return (CharSequence) this.mCharSequenceResourcesRetriever.mo86969a(i);
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$a */
    private abstract class AbstractC24277a {

        /* renamed from: b */
        private final String f59935b;

        /* renamed from: c */
        private final String f59936c;

        /* renamed from: d */
        private final boolean f59937d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo86967a(Resources resources, int i);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo86968a(Resources resources, int i, Resources.Theme theme);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo86965a(int i) {
            int i2;
            C24305h.m88729a(this.f59936c, "");
            if (this.f59937d && DynamicResourcesImpl.this.mo86916c()) {
                return mo86967a(DynamicResourcesImpl.this.mSysResources, i);
            }
            try {
                int a = DynamicResourcesImpl.this.mo86914a(i);
                if (a == 0) {
                    i2 = mo86967a(DynamicResourcesImpl.this.mSysResources, i);
                } else {
                    i2 = mo86967a(DynamicResourcesImpl.this.mDynamicResources, a);
                }
            } catch (Exception e) {
                Log.m165383e("DynamicResources", this.f59935b + " error : " + e);
                i2 = mo86967a(DynamicResourcesImpl.this.mSysResources, i);
            }
            C24305h.m88730b(this.f59936c, "");
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo86966a(int i, Resources.Theme theme) {
            int i2;
            C24305h.m88729a(this.f59936c, "");
            try {
                int a = DynamicResourcesImpl.this.mo86914a(i);
                if (a == 0) {
                    i2 = mo86968a(DynamicResourcesImpl.this.mSysResources, i, theme);
                } else {
                    i2 = mo86968a(DynamicResourcesImpl.this.mDynamicResources, a, theme);
                }
            } catch (Exception e) {
                Log.m165383e("DynamicResources", this.f59935b + " error : " + e);
                i2 = mo86968a(DynamicResourcesImpl.this.mSysResources, i, theme);
            }
            C24305h.m88730b(this.f59936c, "");
            return i2;
        }

        protected AbstractC24277a(String str, boolean z) {
            this.f59935b = str;
            this.f59936c = "DynamicResourcesRes_get" + str;
            this.f59937d = z;
        }
    }

    /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesImpl$b */
    abstract class AbstractC24278b<T> {

        /* renamed from: b */
        private final String f59939b;

        /* renamed from: c */
        private final String f59940c;

        /* renamed from: d */
        private final boolean f59941d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo86971a(Resources resources, int i);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo86972a(Resources resources, int i, Resources.Theme theme);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public T mo86969a(int i) {
            T t;
            C24305h.m88729a(this.f59940c, "");
            if (this.f59941d && DynamicResourcesImpl.this.mo86916c()) {
                return mo86971a(DynamicResourcesImpl.this.mSysResources, i);
            }
            try {
                int a = DynamicResourcesImpl.this.mo86914a(i);
                if (a == 0) {
                    t = mo86971a(DynamicResourcesImpl.this.mSysResources, i);
                } else {
                    t = mo86971a(DynamicResourcesImpl.this.mDynamicResources, a);
                }
            } catch (Exception e) {
                Log.m165383e("DynamicResources", this.f59939b + " error : " + e);
                t = mo86971a(DynamicResourcesImpl.this.mSysResources, i);
            }
            C24305h.m88730b(this.f59940c, "");
            return t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public T mo86970a(int i, Resources.Theme theme) {
            T t;
            C24305h.m88729a(this.f59940c, "");
            if (this.f59941d && DynamicResourcesImpl.this.mo86916c()) {
                return mo86971a(DynamicResourcesImpl.this.mSysResources, i);
            }
            try {
                int a = DynamicResourcesImpl.this.mo86914a(i);
                if (a == 0) {
                    t = mo86972a(DynamicResourcesImpl.this.mSysResources, i, theme);
                } else {
                    t = mo86972a(DynamicResourcesImpl.this.mDynamicResources, a, theme);
                }
            } catch (Exception e) {
                Log.m165383e("DynamicResources", this.f59939b + " error : " + e);
                t = mo86972a(DynamicResourcesImpl.this.mSysResources, i, theme);
            }
            C24305h.m88730b(this.f59940c, "");
            return t;
        }

        protected AbstractC24278b(String str, boolean z) {
            this.f59939b = str;
            this.f59940c = "DynamicResourcesRes_get" + str;
            this.f59941d = z;
        }
    }

    @Override // com.larksuite.component.dynamicresources.AbstractC24311j
    /* renamed from: a */
    public int mo86914a(int i) {
        if (!this.mInited) {
            return 0;
        }
        if (TextUtils.isEmpty(this.mDynamicResourcesPkgName)) {
            return i;
        }
        C24305h.m88729a("DynamicResourcesRes_getTargetId", "");
        Integer num = sIdCache.get(Integer.valueOf(i));
        if (num != null) {
            C24305h.m88730b("DynamicResourcesRes_getTargetId", "");
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(this.mDynamicResources.getIdentifier(this.mSysResources.getResourceEntryName(i), this.mSysResources.getResourceTypeName(i), this.mDynamicResourcesPkgName));
        sIdCache.put(Integer.valueOf(i), valueOf);
        C24305h.m88730b("DynamicResourcesRes_getTargetId", "");
        return valueOf.intValue();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getDrawableForDensity(i, i2);
        }
        return this.mSysResources.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getQuantityString(i, i2);
        }
        return this.mSysResources.getQuantityString(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getQuantityText(i, i2);
        }
        return this.mSysResources.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getString(i, objArr);
        }
        return this.mSysResources.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        if (!this.mInited) {
            return super.getText(i, charSequence);
        }
        return this.mSysResources.getText(i, charSequence);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        if (!this.mInited) {
            return obtainAttributes(attributeSet, iArr);
        }
        return this.mSysResources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws IOException, XmlPullParserException {
        if (!this.mInited) {
            super.parseBundleExtras(xmlResourceParser, bundle);
        } else {
            this.mSysResources.parseBundleExtras(xmlResourceParser, bundle);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getColor(i, theme);
        }
        return this.mColorResourcesRetriever.mo86966a(i, theme);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.openRawResource(i, typedValue);
        }
        return this.mSysResources.openRawResource(i, typedValue);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        if (!this.mInited) {
            super.updateConfiguration(configuration, displayMetrics);
            return;
        }
        this.mSysResources.updateConfiguration(configuration, displayMetrics);
        this.mDynamicResources.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getColorStateList(i, theme);
        }
        return (ColorStateList) this.mColorStateListResourcesRetriever.mo86970a(i, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getDrawable(i, theme);
        }
        return (Drawable) this.mDrawableResourcesRetriever.mo86970a(i, theme);
    }

    /* renamed from: b */
    public static int m88641b(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return super.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return super.getInteger(i);
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
                            android.util.Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return super.getInteger(i);
        }
    }

    /* renamed from: c */
    public static int m88642c(Resources resources, int i) throws Resources.NotFoundException {
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
                            android.util.Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
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
        if (!this.mInited) {
            return super.getFraction(i, i2, i3);
        }
        return this.mSysResources.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        if (!this.mInited) {
            return super.getIdentifier(str, str2, str3);
        }
        return this.mSysResources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        if (!this.mInited) {
            super.getValue(i, typedValue, z);
        } else {
            this.mSysResources.getValue(i, typedValue, z);
        }
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        if (!this.mInited) {
            super.parseBundleExtra(str, attributeSet, bundle);
        } else {
            this.mSysResources.parseBundleExtra(str, attributeSet, bundle);
        }
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        if (!this.mInited) {
            return super.getDrawableForDensity(i, i2, theme);
        }
        return this.mSysResources.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        if (!this.mInited) {
            return super.getQuantityString(i, i2, objArr);
        }
        return this.mSysResources.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        if (!this.mInited) {
            super.getValue(str, typedValue, z);
        } else {
            this.mSysResources.getValue(str, typedValue, z);
        }
    }

    public DynamicResourcesImpl(Resources resources, Resources resources2, String str) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mSysResources = resources;
        this.mDynamicResources = resources2;
        this.mDynamicResourcesPkgName = str;
        if (sIdCache == null) {
            sIdCache = new LruCache<>(3000);
        }
        this.mInited = true;
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        if (!this.mInited) {
            super.getValueForDensity(i, i2, typedValue, z);
        } else {
            this.mSysResources.getValueForDensity(i, i2, typedValue, z);
        }
    }
}
