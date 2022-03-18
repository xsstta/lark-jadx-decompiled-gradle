package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.provider.C0813a;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class FontResourcesParserCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$a */
    public interface AbstractC0751a {
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$b */
    public static final class C0752b implements AbstractC0751a {

        /* renamed from: a */
        private final C0753c[] f3107a;

        /* renamed from: a */
        public C0753c[] mo4269a() {
            return this.f3107a;
        }

        public C0752b(C0753c[] cVarArr) {
            this.f3107a = cVarArr;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$c */
    public static final class C0753c {

        /* renamed from: a */
        private final String f3108a;

        /* renamed from: b */
        private int f3109b;

        /* renamed from: c */
        private boolean f3110c;

        /* renamed from: d */
        private String f3111d;

        /* renamed from: e */
        private int f3112e;

        /* renamed from: f */
        private int f3113f;

        /* renamed from: a */
        public String mo4270a() {
            return this.f3108a;
        }

        /* renamed from: b */
        public int mo4271b() {
            return this.f3109b;
        }

        /* renamed from: c */
        public boolean mo4272c() {
            return this.f3110c;
        }

        /* renamed from: d */
        public String mo4273d() {
            return this.f3111d;
        }

        /* renamed from: e */
        public int mo4274e() {
            return this.f3112e;
        }

        /* renamed from: f */
        public int mo4275f() {
            return this.f3113f;
        }

        public C0753c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3108a = str;
            this.f3109b = i;
            this.f3110c = z;
            this.f3111d = str2;
            this.f3112e = i2;
            this.f3113f = i3;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$d */
    public static final class C0754d implements AbstractC0751a {

        /* renamed from: a */
        private final C0813a f3114a;

        /* renamed from: b */
        private final int f3115b;

        /* renamed from: c */
        private final int f3116c;

        /* renamed from: a */
        public C0813a mo4276a() {
            return this.f3114a;
        }

        /* renamed from: b */
        public int mo4277b() {
            return this.f3116c;
        }

        /* renamed from: c */
        public int mo4278c() {
            return this.f3115b;
        }

        public C0754d(C0813a aVar, int i, int i2) {
            this.f3114a = aVar;
            this.f3116c = i;
            this.f3115b = i2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m3638a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m3639a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: a */
    private static int m3635a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    private static AbstractC0751a m3640b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m3641c(xmlPullParser, resources);
        }
        m3639a(xmlPullParser);
        return null;
    }

    /* renamed from: a */
    public static AbstractC0751a m3636a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m3640b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m3637a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m3635a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m3638a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m3638a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    private static AbstractC0751a m3641c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery});
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(4);
        String string3 = obtainAttributes.getString(5);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(2, 1);
        int integer2 = obtainAttributes.getInteger(3, ParticipantRepo.f117150c);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m3642d(xmlPullParser, resources));
                    } else {
                        m3639a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0752b((C0753c[]) arrayList.toArray(new C0753c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m3639a(xmlPullParser);
        }
        return new C0754d(new C0813a(string, string2, string3, m3637a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0753c m3642d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[]{16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex});
        int i = 8;
        if (!obtainAttributes.hasValue(8)) {
            i = 1;
        }
        int i2 = obtainAttributes.getInt(i, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        int i3 = 6;
        if (!obtainAttributes.hasValue(6)) {
            i3 = 2;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = 9;
        if (!obtainAttributes.hasValue(9)) {
            i4 = 3;
        }
        int i5 = 7;
        if (!obtainAttributes.hasValue(7)) {
            i5 = 4;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = 5;
        if (!obtainAttributes.hasValue(5)) {
            i7 = 0;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m3639a(xmlPullParser);
        }
        return new C0753c(string2, i2, z, string, i6, resourceId);
    }
}
