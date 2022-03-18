package androidx.p042i.p043a.p044a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.p031d.p032a.p033a.C0965a;
import androidx.p031d.p032a.p033a.C0966b;
import androidx.p031d.p032a.p033a.C0967c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.i.a.a.d */
public class C1100d {
    /* renamed from: a */
    public static Interpolator m5209a(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i == 17563663) {
            try {
                return new C0965a();
            } catch (XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i == 17563661) {
            return new C0966b();
        } else {
            if (i == 17563662) {
                return new C0967c();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i);
            Interpolator a = m5210a(context, context.getResources(), context.getTheme(), animation);
            if (animation != null) {
                animation.close();
            }
            return a;
        }
    }

    /* renamed from: a */
    private static Interpolator m5210a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator gVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            gVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            gVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            gVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            gVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            gVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            gVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            gVar = new animationInterpolatorC1104g(context, asAttributeSet, xmlPullParser);
                        } else {
                            throw new RuntimeException("Unknown interpolator name: " + xmlPullParser.getName());
                        }
                        interpolator = gVar;
                    }
                }
            }
        }
        return interpolator;
    }
}
