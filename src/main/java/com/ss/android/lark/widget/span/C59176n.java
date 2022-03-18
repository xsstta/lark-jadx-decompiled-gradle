package com.ss.android.lark.widget.span;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.widget.span.n */
public class C59176n {

    /* renamed from: a */
    private static Pattern f146873a = Pattern.compile(C59184s.f146895a);

    /* renamed from: b */
    private static Pattern f146874b = C57814c.f142386a;

    /* renamed from: c */
    private static Pattern f146875c = Pattern.compile("([\\d|(][(\\d{3})|.|\\-|\\d]{4,}\\d{4,})");

    /* renamed from: d */
    private static Pattern f146876d = Pattern.compile("\\+[0-9]{10,18},{1,3}[0-9]{9,}#|400[0-9]{7},{1,3}[0-9]{9,}#");

    /* renamed from: e */
    private static Pattern f146877e = Pattern.compile("<chat.*?[^>]chat_id=\\\"([\\s\\S]*?)\">([\\s\\S]*?)</chat>");

    /* renamed from: f */
    private final List<SpanInfo> f146878f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.span.n$a */
    public static final class C59178a {

        /* renamed from: a */
        public static final C59176n f146879a = new C59176n();
    }

    /* renamed from: a */
    public static C59176n m229853a() {
        return C59178a.f146879a;
    }

    /* renamed from: b */
    public static Pattern m229858b() {
        return f146873a;
    }

    /* renamed from: a */
    public List<UrlInfo> mo201129a(String str, List<MessageUrlPreview> list, List<SpanInfo> list2) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            Matcher matcher = f146873a.matcher(str);
            while (matcher.find()) {
                UrlInfo urlInfo = new UrlInfo();
                urlInfo.start = matcher.start();
                urlInfo.end = matcher.end();
                urlInfo.text = matcher.group();
                urlInfo.href = matcher.group();
                urlInfo.type = 1;
                if (m229857a(urlInfo, list2)) {
                    arrayList.add(urlInfo);
                }
            }
        } else {
            String str2 = str.toString();
            for (MessageUrlPreview messageUrlPreview : list) {
                UrlInfo urlInfo2 = new UrlInfo();
                urlInfo2.type = 1;
                urlInfo2.text = messageUrlPreview.getUrl();
                urlInfo2.start = messageUrlPreview.getOffset();
                urlInfo2.end = messageUrlPreview.getCount() + messageUrlPreview.getOffset();
                if (urlInfo2.start < str2.length() && urlInfo2.start >= 0 && urlInfo2.end >= 0 && urlInfo2.end <= str2.length()) {
                    arrayList.add(urlInfo2);
                }
            }
        }
        return arrayList;
    }

    private C59176n() {
        this.f146878f = new ArrayList();
    }

    /* renamed from: b */
    public List<AtInfo> mo201130b(String str) {
        return m229859c(str, null);
    }

    /* renamed from: a */
    public static void m229855a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165382e("set vc pattern failed, pattern is null");
            return;
        }
        Pattern pattern = null;
        try {
            pattern = Pattern.compile(str);
        } catch (Exception e) {
            Log.m165382e("set vc pattern failed");
            e.printStackTrace();
        }
        if (pattern != null) {
            f146876d = pattern;
            Log.m165388i("set vc pattern success");
        }
    }

    /* renamed from: a */
    private void m229856a(List<SpanInfo> list, List<? extends SpanInfo> list2) {
        if (CollectionUtils.isNotEmpty(list2)) {
            list.addAll(list2);
        }
    }

    /* renamed from: a */
    public RecogniseSpansResult mo201126a(String str, boolean z) {
        return m229852a(str, new ArrayList(), z, (String) null);
    }

    /* renamed from: c */
    private List<AtInfo> m229859c(String str, List<SpanInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Matcher matcher = f146874b.matcher(str);
        while (matcher.find()) {
            AtInfo atInfo = new AtInfo();
            atInfo.start = matcher.start();
            atInfo.end = matcher.end();
            atInfo.userId = matcher.group(1);
            atInfo.text = matcher.group(2);
            atInfo.type = 0;
            if (m229857a(atInfo, list)) {
                arrayList.add(atInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<PhoneInfo> mo201131b(String str, List<SpanInfo> list) {
        ArrayList arrayList = new ArrayList();
        List<SpanInfo> arrayList2 = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        Matcher matcher = f146876d.matcher(str);
        while (matcher.find()) {
            PhoneInfo phoneInfo = new PhoneInfo();
            phoneInfo.start = matcher.start();
            phoneInfo.end = matcher.end();
            phoneInfo.text = matcher.group();
            phoneInfo.type = 2;
            if (m229857a(phoneInfo, list)) {
                arrayList.add(phoneInfo);
                arrayList2.add(phoneInfo);
            }
        }
        SpannableString spannableString = new SpannableString(str);
        Linkify.addLinks(spannableString, 4);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(0, spannableString.length(), ClickableSpan.class);
        for (ClickableSpan clickableSpan : clickableSpanArr) {
            int spanStart = spannableString.getSpanStart(clickableSpan);
            int spanEnd = spannableString.getSpanEnd(clickableSpan);
            PhoneInfo phoneInfo2 = new PhoneInfo();
            phoneInfo2.start = spanStart;
            phoneInfo2.end = spanEnd;
            phoneInfo2.text = str.substring(spanStart, spanEnd);
            phoneInfo2.type = 2;
            if (m229857a(phoneInfo2, list) && m229857a(phoneInfo2, arrayList2)) {
                arrayList.add(phoneInfo2);
                arrayList2.add(phoneInfo2);
            }
        }
        Matcher matcher2 = f146875c.matcher(str);
        while (matcher2.find()) {
            PhoneInfo phoneInfo3 = new PhoneInfo();
            phoneInfo3.start = matcher2.start();
            phoneInfo3.end = matcher2.end();
            phoneInfo3.text = matcher2.group();
            phoneInfo3.type = 2;
            if (m229857a(phoneInfo3, list) && m229857a(phoneInfo3, arrayList2)) {
                arrayList.add(phoneInfo3);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m229857a(SpanInfo spanInfo, List<SpanInfo> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).isGlobalSpanInfo) {
                    int i2 = list.get(i).start;
                    if (spanInfo.start < list.get(i).end && spanInfo.end > i2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public RecogniseSpansResult mo201125a(String str, List<UrlInfo> list) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m229856a(arrayList, list);
        List<AtInfo> c = m229859c(str, arrayList);
        m229856a(arrayList, c);
        List<UrlInfo> a = mo201129a(str, (List<MessageUrlPreview>) null, arrayList);
        m229856a(arrayList, a);
        a.addAll(list);
        List<PhoneInfo> b = mo201131b(str, arrayList);
        m229856a(arrayList, b);
        RecogniseSpansResult.C59147a aVar = new RecogniseSpansResult.C59147a();
        aVar.mo201042a(a).mo201044b(c).mo201045c(b);
        return aVar.mo201043a();
    }

    /* renamed from: a */
    public List<SpanInfo> mo201128a(String str, C59173m mVar) {
        if (TextUtils.isEmpty(str)) {
            return mVar.f146868d;
        }
        List<SpanInfo> list = mVar.f146868d;
        if (mVar.f146865a) {
            m229856a(list, m229859c(str, list));
        }
        if (mVar.f146866b) {
            m229856a(list, mo201129a(str, (List<MessageUrlPreview>) null, list));
        }
        if (mVar.f146867c) {
            m229856a(list, mo201131b(str, list));
        }
        Collections.sort(list);
        return list;
    }

    /* renamed from: a */
    public RecogniseSpansResult mo201127a(String str, boolean z, String str2) {
        return m229852a(str, new ArrayList(), z, str2);
    }

    /* renamed from: a */
    private List<SpanInfo> m229854a(List<UrlInfo> list, List<AtInfo> list2, List<PhoneInfo> list3, List<ChatInfo> list4) {
        ArrayList arrayList = new ArrayList();
        Collection collection = list;
        if (list == null) {
            collection = this.f146878f;
        }
        arrayList.addAll(collection == 1 ? 1 : 0);
        Collection collection2 = list2;
        if (list2 == null) {
            collection2 = this.f146878f;
        }
        arrayList.addAll(collection2 == 1 ? 1 : 0);
        Collection collection3 = list3;
        if (list3 == null) {
            collection3 = this.f146878f;
        }
        arrayList.addAll(collection3 == 1 ? 1 : 0);
        Collection collection4 = list4;
        if (list4 == null) {
            collection4 = this.f146878f;
        }
        arrayList.addAll(collection4 == 1 ? 1 : 0);
        return arrayList;
    }

    /* renamed from: a */
    private RecogniseSpansResult m229852a(String str, List<MessageUrlPreview> list, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RecogniseSpansResult a = C59170l.m229843a().mo201118a(str);
        if (!C59170l.m229844a(a)) {
            return a;
        }
        List<AtInfo> b = mo201130b(str);
        ArrayList arrayList = new ArrayList();
        List<UrlInfo> a2 = mo201129a(str, list, m229854a((List<UrlInfo>) null, b, (List<PhoneInfo>) null, arrayList));
        List<SpanInfo> a3 = m229854a(a2, b, (List<PhoneInfo>) null, arrayList);
        RecogniseSpansResult.C59147a aVar = new RecogniseSpansResult.C59147a();
        aVar.mo201042a(a2).mo201044b(b).mo201046d(arrayList);
        if (z) {
            aVar.mo201045c(mo201131b(str, a3));
        }
        RecogniseSpansResult a4 = aVar.mo201043a();
        if (!C59170l.m229844a(a4)) {
            C59170l a5 = C59170l.m229843a();
            RecogniseSpansResult a6 = a5.mo201118a(str2 + str);
            if (a6 != null) {
                a6.addAtSpanInfos(b);
                a6.addPhoneSpanInfos(a4.getPhoneSpanInfos());
                a6.addChatSpanInfos(arrayList);
            }
            C59170l.m229843a().mo201119a(str, a4);
        }
        return a4;
    }
}
