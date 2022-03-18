package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0767f;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.transition.t */
public class C1554t {

    /* renamed from: a */
    private static final Class<?>[] f5442a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final ArrayMap<String, Constructor<?>> f5443b = new ArrayMap<>();

    /* renamed from: c */
    private final Context f5444c;

    private C1554t(Context context) {
        this.f5444c = context;
    }

    /* renamed from: a */
    public static C1554t m7120a(Context context) {
        return new C1554t(context);
    }

    /* renamed from: a */
    public Transition mo8053a(int i) {
        XmlResourceParser xml = this.f5444c.getResources().getXml(i);
        try {
            Transition a = m7119a(xml, Xml.asAttributeSet(xml), (Transition) null);
            xml.close();
            return a;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: a */
    private Object m7121a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                ArrayMap<String, Constructor<?>> arrayMap = f5443b;
                synchronized (arrayMap) {
                    Constructor<?> constructor = arrayMap.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f5444c.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f5442a);
                        constructor.setAccessible(true);
                        arrayMap.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(this.f5444c, attributeSet);
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    /* renamed from: b */
    private void m7122b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f5444c.obtainStyledAttributes(attributeSet, C1553s.f5431a);
                    int c = C0767f.m3703c(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (c != 0) {
                        transition.mo7896b(c);
                    } else {
                        int c2 = C0767f.m3703c(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (c2 != 0) {
                            transition.mo7877a(c2, true);
                        } else {
                            String a = C0767f.m3698a(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (a != null) {
                                transition.mo7883a(a);
                            } else {
                                String a2 = C0767f.m3698a(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (a2 != null) {
                                    transition.mo7884a(a2, true);
                                } else {
                                    String a3 = C0767f.m3698a(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (a3 != null) {
                                        try {
                                            transition.mo7882a(Class.forName(a3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + a3, e);
                                        }
                                    } else {
                                        String a4 = C0767f.m3698a(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (a4 != null) {
                                            transition.mo7881a(Class.forName(a4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    /* renamed from: a */
    private Transition m7119a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        TransitionSet transitionSet;
        Transition transition2;
        int depth = xmlPullParser.getDepth();
        if (transition instanceof TransitionSet) {
            transitionSet = (TransitionSet) transition;
        } else {
            transitionSet = null;
        }
        loop0:
        while (true) {
            transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            transition2 = new Fade(this.f5444c, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            transition2 = new ChangeBounds(this.f5444c, attributeSet);
                        } else if ("slide".equals(name)) {
                            transition2 = new Slide(this.f5444c, attributeSet);
                        } else if ("explode".equals(name)) {
                            transition2 = new Explode(this.f5444c, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            transition2 = new ChangeImageTransform(this.f5444c, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            transition2 = new ChangeTransform(this.f5444c, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            transition2 = new ChangeClipBounds(this.f5444c, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            transition2 = new AutoTransition(this.f5444c, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            transition2 = new ChangeScroll(this.f5444c, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            transition2 = new TransitionSet(this.f5444c, attributeSet);
                        } else if ("transition".equals(name)) {
                            transition2 = (Transition) m7121a(attributeSet, Transition.class, "transition");
                        } else if ("targets".equals(name)) {
                            m7122b(xmlPullParser, attributeSet, transition);
                        } else if ("arcMotion".equals(name)) {
                            if (transition != null) {
                                transition.mo7890a(new ArcMotion(this.f5444c, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (transition != null) {
                                transition.mo7890a((PathMotion) m7121a(attributeSet, PathMotion.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        } else if (transition != null) {
                            transition.mo7890a(new PatternPathMotion(this.f5444c, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                m7119a(xmlPullParser, attributeSet, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            } else if (transition != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.mo7933a(transition2);
        }
        return transition2;
    }
}
