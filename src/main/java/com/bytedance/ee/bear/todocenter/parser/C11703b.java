package com.bytedance.ee.bear.todocenter.parser;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p717s.C13723a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.C69981e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.bytedance.ee.bear.todocenter.parser.b */
public class C11703b {

    /* renamed from: a */
    private static final Pattern f31489a = Pattern.compile("<block(\n|.)*?>(\n|.)*?</block>");

    /* renamed from: b */
    private static final Pattern f31490b = Pattern.compile("&#?\\w+;");

    /* renamed from: c */
    private AbstractC11706c f31491c;

    /* renamed from: com.bytedance.ee.bear.todocenter.parser.b$c */
    public interface AbstractC11706c {
        /* renamed from: a */
        String mo44839a(String str);

        /* renamed from: a */
        Locale mo44840a();
    }

    public C11703b(AbstractC11706c cVar) {
        this.f31491c = cVar;
    }

    /* renamed from: b */
    public static C11705b m48539b(String str) {
        Matcher matcher = f31490b.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String a = C11707c.m48544a(str.substring(start, end));
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(new C11704a(start, end, a, a.length() - (end - start)));
            } else {
                C13479a.m54775e("BlockContentParser", "replaceHtmlChar() replaceValue is empty");
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11704a aVar = (C11704a) arrayList.get(size);
            sb.replace(aVar.f31492a, aVar.f31493b, aVar.f31494c);
        }
        return new C11705b(sb.toString(), arrayList);
    }

    /* renamed from: c */
    private AbsBlock[] m48540c(String str) throws XmlPullParserException, IOException {
        boolean z;
        Matcher matcher = f31489a.matcher(str);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String replaceAll = str.substring(start, end).replaceAll(ContainerUtils.FIELD_DELIMITER, "&amp;");
            boolean z2 = false;
            if (i + 1 >= start || start <= 0 || str.charAt(start - 1) == ' ') {
                z = false;
            } else {
                z = true;
            }
            if (end < str.length() - 1 && str.charAt(end) != ' ') {
                z2 = true;
            }
            AbsBlock a = m48536a(z, z2, replaceAll, start, end);
            if (a != null) {
                arrayList.add(a);
            }
            i = end;
        }
        AbsBlock[] absBlockArr = new AbsBlock[arrayList.size()];
        arrayList.toArray(absBlockArr);
        return absBlockArr;
    }

    /* renamed from: a */
    public C11700a mo44838a(String str) throws Exception {
        C13479a.m54772d("BlockContentParser", "apply: begin origin=" + str);
        long uptimeMillis = SystemClock.uptimeMillis();
        AbsBlock[] c = m48540c(str);
        C11705b b = m48539b(m48538a(str, c));
        String str2 = b.f31496a;
        for (AbsBlock absBlock : c) {
            int i = 0;
            for (C11704a aVar : b.f31497b) {
                if (absBlock.start >= aVar.f31493b) {
                    i += aVar.f31495d;
                }
            }
            absBlock.start += i;
            absBlock.end += i;
        }
        C13479a.m54772d("BlockContentParser", "parse() finish, cost time=" + (SystemClock.uptimeMillis() - uptimeMillis));
        return new C11700a(str2, c);
    }

    /* renamed from: com.bytedance.ee.bear.todocenter.parser.b$b */
    public static class C11705b {

        /* renamed from: a */
        public String f31496a;

        /* renamed from: b */
        public List<C11704a> f31497b;

        public C11705b(String str, List<C11704a> list) {
            this.f31496a = str;
            this.f31497b = list;
            if (list == null) {
                this.f31497b = new ArrayList();
            }
        }
    }

    /* renamed from: a */
    private UnsupportBlock m48537a(String str, String str2) {
        UnsupportBlock unsupportBlock = new UnsupportBlock();
        unsupportBlock.setContent(str + "[**]" + str2);
        return unsupportBlock;
    }

    /* renamed from: a */
    private String m48538a(String str, AbsBlock[] absBlockArr) {
        C13479a.m54772d("BlockContentParser", "replaceAts: ");
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (i < absBlockArr.length) {
            AbsBlock absBlock = absBlockArr[i];
            int length = (absBlock.end - absBlock.start) - absBlock.content.length();
            sb.replace(absBlock.start, absBlock.end, absBlock.content);
            absBlock.end = absBlock.start + absBlock.content.length();
            i++;
            for (int i2 = i; i2 < absBlockArr.length; i2++) {
                AbsBlock absBlock2 = absBlockArr[i2];
                absBlock2.start -= length;
                absBlock2.end -= length;
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.parser.b$a */
    public static class C11704a {

        /* renamed from: a */
        int f31492a;

        /* renamed from: b */
        int f31493b;

        /* renamed from: c */
        String f31494c;

        /* renamed from: d */
        int f31495d;

        public C11704a(int i, int i2, String str, int i3) {
            this.f31492a = i;
            this.f31493b = i2;
            this.f31494c = str;
            this.f31495d = i3;
        }
    }

    /* renamed from: a */
    private AbsBlock m48536a(boolean z, boolean z2, String str, int i, int i2) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        ReminderBlock reminderBlock;
        C13479a.m54772d("BlockContentParser", "parseBlock: start = " + i + ", end = " + i2);
        int indexOf = str.indexOf(">") + 1;
        int lastIndexOf = str.lastIndexOf("<");
        String str4 = "";
        if (indexOf >= lastIndexOf || lastIndexOf >= str.length()) {
            str2 = str4;
        } else {
            str2 = C69981e.m268411d(str.substring(indexOf, lastIndexOf));
        }
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        if (z) {
            str3 = " ";
        } else {
            str3 = str4;
        }
        if (z2) {
            str4 = " ";
        }
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String name = newPullParser.getName();
            if (eventType == 2 && "block".equals(name)) {
                C13479a.m54772d("BlockContentParser", "apply: find block tag");
                try {
                    String attributeValue = newPullParser.getAttributeValue(null, ShareHitPoint.f121869d);
                    char c = 65535;
                    boolean z3 = false;
                    switch (attributeValue.hashCode()) {
                        case 48:
                            if (attributeValue.equals("0")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 49:
                            if (attributeValue.equals("1")) {
                                c = 1;
                                break;
                            }
                            break;
                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                            if (attributeValue.equals("2")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        AtPersonBlock uid = new AtPersonBlock().setUid(newPullParser.getAttributeValue(null, "uid"));
                        String a = this.f31491c.mo44839a(uid.getUid());
                        if (!TextUtils.isEmpty(a)) {
                            uid.setContent(str3 + "@" + a + str4);
                            reminderBlock = uid;
                        } else {
                            C13479a.m54775e("BlockContentParser", "UserDependency.getUserName() is empty, use default content name");
                            uid.setContent(str3 + "@" + str2 + str4);
                            reminderBlock = uid;
                        }
                    } else if (c == 1) {
                        AtDocumentBlock objType = new AtDocumentBlock().setHref(newPullParser.getAttributeValue(null, "href")).setToken(newPullParser.getAttributeValue(null, "token")).setObjType(newPullParser.getAttributeValue(null, "obj_type"));
                        objType.setContent("icon" + str2 + str4);
                        reminderBlock = objType;
                    } else if (c != 2) {
                        C13479a.m54764b("BlockContentParser", "parseBlock() unsupportBlock type=" + attributeValue);
                        reminderBlock = m48537a(str3, str4);
                    } else {
                        ReminderBlock shouldNotify = new ReminderBlock().setExpireTime(newPullParser.getAttributeValue(null, "expire_time")).setWholeDay(newPullParser.getAttributeValue(null, "is_wholeday")).setShouldNotify(newPullParser.getAttributeValue(null, "should_notify"));
                        Application application = C13615c.f35773a;
                        long expireTime = shouldNotify.getExpireTime();
                        if (!shouldNotify.isWholeDay()) {
                            z3 = true;
                        }
                        String a2 = C13723a.m55655a(application, expireTime, z3, this.f31491c.mo44840a());
                        shouldNotify.setContent("icon" + a2 + str4);
                        reminderBlock = shouldNotify;
                    }
                    boolean isValid = reminderBlock.isValid();
                    AtPersonBlock atPersonBlock = reminderBlock;
                    if (!isValid) {
                        C13479a.m54775e("BlockContentParser", "block.isValid() is false, replace it UnsupportBlock. block=" + reminderBlock);
                        atPersonBlock = m48537a(str3, str4);
                    }
                    atPersonBlock.setContent(m48539b(atPersonBlock.getContent()).f31496a);
                    atPersonBlock.start = i;
                    atPersonBlock.end = i2;
                    return atPersonBlock;
                } catch (Exception e) {
                    C13479a.m54759a("BlockContentParser", "parse xml exception", e);
                }
            }
        }
        return null;
    }
}
