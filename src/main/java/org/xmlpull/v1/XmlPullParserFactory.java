package org.xmlpull.v1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class XmlPullParserFactory {
    static final Class referenceContextClass = new XmlPullParserFactory().getClass();
    protected String classNamesLocation;
    protected Hashtable features = new Hashtable();
    protected Vector parserClasses;
    protected Vector serializerClasses;

    public static XmlPullParserFactory newInstance() throws XmlPullParserException {
        return newInstance(null, null);
    }

    protected XmlPullParserFactory() {
    }

    public XmlPullParser newPullParser() throws XmlPullParserException {
        Vector vector = this.parserClasses;
        if (vector == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Factory initialization was incomplete - has not tried ");
            stringBuffer.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < this.parserClasses.size(); i++) {
                Class cls = (Class) this.parserClasses.elementAt(i);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.features.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.features.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(cls.getName());
                    stringBuffer3.append(": ");
                    stringBuffer3.append(e.toString());
                    stringBuffer3.append("; ");
                    stringBuffer2.append(stringBuffer3.toString());
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("could not create parser: ");
            stringBuffer4.append((Object) stringBuffer2);
            throw new XmlPullParserException(stringBuffer4.toString());
        } else {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("No valid parser classes found in ");
            stringBuffer5.append(this.classNamesLocation);
            throw new XmlPullParserException(stringBuffer5.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.xmlpull.v1.XmlPullParserFactory newInstance(java.lang.String r12, java.lang.Class r13) throws org.xmlpull.v1.XmlPullParserException {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.v1.XmlPullParserFactory.newInstance(java.lang.String, java.lang.Class):org.xmlpull.v1.XmlPullParserFactory");
    }
}
