package com.ss.android.lark.widget.richtext.preprocess.p2966a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a;
import com.ss.android.lark.widget.richtext.preprocess.C59058i;
import com.ss.android.lark.widget.richtext.preprocess.ElementExtra;
import com.ss.android.lark.widget.span.PrefixInfo;
import com.ss.android.lark.widget.span.PrefixSpan;
import java.util.Stack;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.a.b */
public class C59039b extends AbstractC59037a {

    /* renamed from: b */
    private int f146331b = -1;

    /* renamed from: c */
    private Stack<Integer> f146332c = new Stack<>();

    /* renamed from: d */
    private Stack<ElementExtra.FloorInfo> f146333d = new Stack<>();

    /* renamed from: e */
    private Stack<PrefixInfo> f146334e = new Stack<>();

    /* renamed from: f */
    private ElementExtra.FloorInfo f146335f;

    /* renamed from: g */
    private PrefixInfo f146336g = null;

    /* renamed from: h */
    private C59058i.AbstractC59061b f146337h;

    /* renamed from: a */
    public ElementExtra.FloorInfo mo200598a() {
        return this.f146335f;
    }

    /* renamed from: b */
    private int m229230b() {
        ElementExtra.FloorInfo floorInfo = this.f146335f;
        if (floorInfo == null) {
            return 0;
        }
        return Math.max(floorInfo.floor, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.richtext.preprocess.a.b$1 */
    public static /* synthetic */ class C590401 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146338a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.widget.span.PrefixSpan$Type[] r0 = com.ss.android.lark.widget.span.PrefixSpan.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.f146338a = r0
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.LIST_NUM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.f146338a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.FILL_RECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.f146338a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.FILL_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.f146338a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.HOLLOW_RECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.f146338a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.widget.span.PrefixSpan$Type r1 = com.ss.android.lark.widget.span.PrefixSpan.Type.HOLLOW_CIRCLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.preprocess.p2966a.C59039b.C590401.<clinit>():void");
        }
    }

    public C59039b(C59058i.AbstractC59061b bVar) {
        this.f146337h = bVar;
    }

    /* renamed from: a */
    private String m229228a(PrefixSpan prefixSpan) {
        PrefixSpan.C59146b b = prefixSpan.mo201009b();
        int i = C590401.f146338a[b.mo201020a().ordinal()];
        if (i == 1) {
            return b.mo201022b();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return "- ";
        }
        return "";
    }

    /* renamed from: a */
    private void m229229a(RichTextElement richTextElement, PrefixSpan prefixSpan) {
        if ((richTextElement.getProperty() instanceof RichTextElement.LIProperty) && prefixSpan != null) {
            RichTextElement.LIProperty lIProperty = (RichTextElement.LIProperty) richTextElement.getProperty();
            lIProperty.setListNum(m229228a(prefixSpan));
            lIProperty.setFloor(m229230b());
        }
    }

    /* renamed from: b */
    private void m229231b(RichTextElement richTextElement, StringBuilder sb) {
        ElementExtra.FloorInfo floorInfo = this.f146335f;
        if (floorInfo == null || !floorInfo.isEnabled() || this.f146331b == sb.length()) {
            Log.m165383e("LiParser", "span is invalid, remove prefixInfo");
            this.f146337h.mo200628b(this.f146336g);
            return;
        }
        PrefixSpan a = C59041c.m229235a(this.f146335f);
        if (a != null) {
            m229229a(richTextElement, a);
            this.f146336g.prefixParams = a.mo201009b();
            this.f146336g.type = 12;
            this.f146336g.start = this.f146331b;
            this.f146336g.end = sb.length();
            this.f146336g.text = sb.substring(this.f146331b, sb.length());
            return;
        }
        Log.m165383e("LiParser", "span is null, remove prefixInfo");
        this.f146337h.mo200628b(this.f146336g);
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200596a(RichTextElement richTextElement, StringBuilder sb) {
        ElementExtra.FloorInfo floorInfo;
        int i;
        super.mo200596a(richTextElement, sb);
        if (this.f146331b == sb.length()) {
            sb.append(" ");
        }
        m229231b(richTextElement, sb);
        PrefixInfo prefixInfo = null;
        if (this.f146333d.isEmpty()) {
            floorInfo = null;
        } else {
            floorInfo = this.f146333d.pop();
        }
        this.f146335f = floorInfo;
        if (this.f146332c.isEmpty()) {
            i = -1;
        } else {
            i = this.f146332c.pop().intValue();
        }
        this.f146331b = i;
        if (!this.f146334e.isEmpty()) {
            prefixInfo = this.f146334e.pop();
        }
        this.f146336g = prefixInfo;
    }

    @Override // com.ss.android.lark.widget.richtext.preprocess.AbstractC59037a
    /* renamed from: a */
    public void mo200597a(RichTextElement richTextElement, StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
        super.mo200597a(richTextElement, sb, richTextTag);
        int i = this.f146331b;
        if (i != -1) {
            this.f146332c.push(Integer.valueOf(i));
        }
        this.f146331b = sb.length();
        ElementExtra.FloorInfo floorInfo = this.f146335f;
        if (floorInfo != null) {
            this.f146333d.push(floorInfo);
        }
        this.f146335f = richTextElement.getElementExtra().getFloorInfo();
        PrefixInfo prefixInfo = this.f146336g;
        if (prefixInfo != null) {
            this.f146334e.push(prefixInfo);
        }
        PrefixInfo prefixInfo2 = new PrefixInfo(new PrefixSpan.C59145a(PrefixSpan.Type.NONE).mo201016a().mo201009b());
        this.f146336g = prefixInfo2;
        this.f146337h.mo200627a(prefixInfo2);
    }
}
