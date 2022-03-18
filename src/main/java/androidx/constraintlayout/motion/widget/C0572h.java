package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.h */
public class C0572h {

    /* renamed from: a */
    static HashMap<String, Constructor<? extends AbstractC0549c>> f2165a;

    /* renamed from: b */
    private HashMap<Integer, ArrayList<AbstractC0549c>> f2166b = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC0549c>> hashMap = new HashMap<>();
        f2165a = hashMap;
        try {
            hashMap.put("KeyAttribute", C0550d.class.getConstructor(new Class[0]));
            f2165a.put("KeyPosition", C0573i.class.getConstructor(new Class[0]));
            f2165a.put("KeyCycle", C0553f.class.getConstructor(new Class[0]));
            f2165a.put("KeyTimeCycle", C0576k.class.getConstructor(new Class[0]));
            f2165a.put("KeyTrigger", C0578l.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    /* renamed from: a */
    private void m2608a(AbstractC0549c cVar) {
        if (!this.f2166b.containsKey(Integer.valueOf(cVar.f2097c))) {
            this.f2166b.put(Integer.valueOf(cVar.f2097c), new ArrayList<>());
        }
        this.f2166b.get(Integer.valueOf(cVar.f2097c)).add(cVar);
    }

    /* renamed from: a */
    public void mo3257a(C0581n nVar) {
        ArrayList<AbstractC0549c> arrayList = this.f2166b.get(Integer.valueOf(nVar.f2252b));
        if (arrayList != null) {
            nVar.mo3279a(arrayList);
        }
        ArrayList<AbstractC0549c> arrayList2 = this.f2166b.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC0549c> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0549c next = it.next();
                if (next.mo3235a(((ConstraintLayout.LayoutParams) nVar.f2251a.getLayoutParams()).f2804V)) {
                    nVar.mo3277a(next);
                }
            }
        }
    }

    public C0572h(Context context, XmlPullParser xmlPullParser) {
        AbstractC0549c cVar;
        Exception e;
        AbstractC0549c cVar2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f2165a.containsKey(name)) {
                        try {
                            cVar = (AbstractC0549c) f2165a.get(name).newInstance(new Object[0]);
                            try {
                                cVar.mo3232a(context, Xml.asAttributeSet(xmlPullParser));
                                m2608a(cVar);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            cVar = cVar2;
                            e = e3;
                            Log.e("KeyFrames", "unable to create ", e);
                            cVar2 = cVar;
                            eventType = xmlPullParser.next();
                        }
                        cVar2 = cVar;
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || cVar2 == null || cVar2.f2100f == null)) {
                        ConstraintAttribute.m3338a(context, xmlPullParser, cVar2.f2100f);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
