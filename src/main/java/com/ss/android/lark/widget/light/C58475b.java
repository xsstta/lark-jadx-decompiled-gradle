package com.ss.android.lark.widget.light;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import androidx.core.util.C0844e;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.light.processor.AbbreviationSpanProcessor;
import com.ss.android.lark.widget.light.processor.AtSpanProcessor;
import com.ss.android.lark.widget.light.processor.EmojiconSpanProcessor;
import com.ss.android.lark.widget.light.processor.EmptyHolderSpanProcessor;
import com.ss.android.lark.widget.light.processor.ISpanProcessor;
import com.ss.android.lark.widget.light.processor.ImageSpanProcessor;
import com.ss.android.lark.widget.light.processor.IntentionProcessor;
import com.ss.android.lark.widget.light.processor.MediaSpanProcessor;
import com.ss.android.lark.widget.light.processor.MentionSpanProcessor;
import com.ss.android.lark.widget.light.processor.PhoneSpanProcessor;
import com.ss.android.lark.widget.light.processor.PrefixSpanProcessor;
import com.ss.android.lark.widget.light.processor.SpacingSpanProcessor;
import com.ss.android.lark.widget.light.processor.TextStyleSpanProcessor;
import com.ss.android.lark.widget.light.processor.UrlSpanProcessor;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.AtInfo;
import com.ss.android.lark.widget.span.EmojiconInfo;
import com.ss.android.lark.widget.span.EmptyHolderInfo;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.IntentionInfo;
import com.ss.android.lark.widget.span.KeyIconUrlInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.MentionInfo;
import com.ss.android.lark.widget.span.PhoneInfo;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.RichUrlInfo;
import com.ss.android.lark.widget.span.SpacingInfo;
import com.ss.android.lark.widget.span.SpanInfo;
import com.ss.android.lark.widget.span.TextStyleInfo;
import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.light.b */
public class C58475b {

    /* renamed from: a */
    private HashMap<Class<? extends SpanInfo>, ISpanProcessor<?>> f144130a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.light.b$a */
    public static final class C58477a {

        /* renamed from: a */
        public static final C58475b f144131a = new C58475b();
    }

    /* renamed from: a */
    public static C58475b m226783a() {
        return C58477a.f144131a;
    }

    private C58475b() {
        m226791b();
    }

    /* renamed from: b */
    private void m226791b() {
        HashMap<Class<? extends SpanInfo>, ISpanProcessor<?>> hashMap = new HashMap<>();
        this.f144130a = hashMap;
        hashMap.put(UrlInfo.class, new UrlSpanProcessor());
        this.f144130a.put(KeyIconUrlInfo.class, new UrlSpanProcessor());
        this.f144130a.put(RichUrlInfo.class, new UrlSpanProcessor());
        this.f144130a.put(AtInfo.class, new AtSpanProcessor());
        this.f144130a.put(PhoneInfo.class, new PhoneSpanProcessor());
        this.f144130a.put(AbbreviationInfo.class, new AbbreviationSpanProcessor());
        this.f144130a.put(IntentionInfo.class, new IntentionProcessor());
        this.f144130a.put(ImageInfo.class, new ImageSpanProcessor());
        this.f144130a.put(SpacingInfo.class, new SpacingSpanProcessor());
        this.f144130a.put(TextStyleInfo.class, new TextStyleSpanProcessor());
        this.f144130a.put(MentionInfo.class, new MentionSpanProcessor());
        this.f144130a.put(MediaInfo.class, new MediaSpanProcessor());
        this.f144130a.put(EmojiconInfo.class, new EmojiconSpanProcessor());
        this.f144130a.put(PrefixInfo.class, new PrefixSpanProcessor());
        this.f144130a.put(EmptyHolderInfo.class, new EmptyHolderSpanProcessor());
    }

    /* renamed from: a */
    private ISpanProcessor m226784a(SpanInfo spanInfo) {
        return this.f144130a.get(spanInfo.getClass());
    }

    /* renamed from: a */
    private C0844e<List<SpanInfo>, List<SpanInfo>> m226782a(List<SpanInfo> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0844e<List<SpanInfo>, List<SpanInfo>> eVar = new C0844e<>(arrayList, arrayList2);
        if (list == null) {
            return eVar;
        }
        for (SpanInfo spanInfo : list) {
            if (spanInfo.isGlobalSpanInfo) {
                arrayList2.add(spanInfo);
            } else {
                arrayList.add(spanInfo);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private void m226790a(List<SpanInfo> list, String str, C58513g gVar) {
        gVar.append(str.substring(0, list.get(0).start));
    }

    /* renamed from: a */
    private void m226787a(Context context, C58513g gVar, List<SpanInfo> list, SpannableStringExtraParams aVar) {
        if (aVar.mo198070s()) {
            gVar.setSpan(new StrikethroughSpan(), 0, gVar.length(), 33);
        }
        for (SpanInfo spanInfo : list) {
            ISpanProcessor a = m226784a(spanInfo);
            if (a != null) {
                a.mo198129a(context, gVar, spanInfo, aVar);
            }
        }
    }

    /* renamed from: a */
    public CharSequence mo198109a(Context context, String str, List<SpanInfo> list, SpannableStringExtraParams aVar) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        C58513g gVar = new C58513g(context);
        C0844e<List<SpanInfo>, List<SpanInfo>> a = m226782a(list);
        m226786a(context, gVar, str, (List<SpanInfo>) a.f3317a, aVar);
        m226787a(context, gVar, a.f3318b, aVar);
        if (length != gVar.length()) {
            Log.m165379d("SpannableStringParser", "content length is not equals, content is:" + str + ", preLength is:" + length + ", after length is:" + gVar.length());
        }
        return gVar;
    }

    /* renamed from: a */
    private void m226788a(Context context, String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2) {
        gVar.append(str.substring(spanInfo.end, spanInfo2.start));
    }

    /* renamed from: a */
    private void m226785a(Context context, C58513g gVar, String str, SpanInfo spanInfo, SpannableStringExtraParams aVar) {
        ISpanProcessor a = m226784a(spanInfo);
        if (a != null) {
            a.mo198129a(context, gVar, spanInfo, aVar);
        } else {
            Log.m165383e("SpannableStringParser", "unknown spanInfo：" + spanInfo.getClass().getSimpleName());
            gVar.append(spanInfo.text);
        }
        gVar.append(str.substring(Math.min(spanInfo.end, str.length())));
    }

    /* renamed from: a */
    private void m226786a(Context context, C58513g gVar, String str, List<SpanInfo> list, SpannableStringExtraParams aVar) {
        if (CollectionUtils.isEmpty(list)) {
            gVar.append(str);
            return;
        }
        m226790a(list, str, gVar);
        int i = 0;
        while (i < list.size() - 1) {
            SpanInfo spanInfo = list.get(i);
            i++;
            SpanInfo spanInfo2 = list.get(i);
            if (spanInfo.end <= spanInfo2.start) {
                m226789a(context, str, gVar, spanInfo, spanInfo2, aVar);
            } else {
                spanInfo.end = spanInfo2.start;
                int i2 = spanInfo.end - spanInfo.start;
                if (i2 <= spanInfo.text.length()) {
                    spanInfo.text = spanInfo.text.substring(0, i2);
                    m226789a(context, str, gVar, spanInfo, spanInfo2, aVar);
                }
            }
        }
        m226785a(context, gVar, str, list.get(list.size() - 1), aVar);
    }

    /* renamed from: a */
    private void m226789a(Context context, String str, C58513g gVar, SpanInfo spanInfo, SpanInfo spanInfo2, SpannableStringExtraParams aVar) {
        ISpanProcessor a = m226784a(spanInfo);
        if (a != null) {
            a.mo198129a(context, gVar, spanInfo, aVar);
        } else {
            Log.m165383e("SpannableStringParser", "unknown spanInfo：" + spanInfo.getClass().getSimpleName());
            gVar.append(spanInfo.text);
        }
        m226788a(context, str, gVar, spanInfo, spanInfo2);
    }
}
