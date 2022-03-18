package com.bytedance.ee.bear.onboarding.export.p516a.p517a;

import android.graphics.RectF;
import android.view.View;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;

/* renamed from: com.bytedance.ee.bear.onboarding.export.a.a.c */
public class C10390c extends C10388a {

    /* renamed from: a */
    private String f27934a;

    /* renamed from: b */
    private String f27935b;

    /* renamed from: c */
    private int f27936c;

    /* renamed from: d */
    private int f27937d;

    /* renamed from: e */
    private Integer f27938e;

    /* renamed from: f */
    private AbstractC10392b f27939f;

    /* renamed from: g */
    private View f27940g;

    /* renamed from: h */
    private RectF f27941h;

    /* renamed from: i */
    private boolean f27942i;

    /* renamed from: j */
    private FlowStyleHollowShape f27943j;

    /* renamed from: k */
    private int f27944k;

    /* renamed from: l */
    private AbstractC10394d f27945l;

    /* renamed from: m */
    private String f27946m;

    /* renamed from: n */
    private String f27947n;

    /* renamed from: o */
    private boolean f27948o;

    /* renamed from: com.bytedance.ee.bear.onboarding.export.a.a.c$b */
    public static abstract class AbstractC10392b {
    }

    /* renamed from: com.bytedance.ee.bear.onboarding.export.a.a.c$a */
    public static class C10391a extends AbstractC10392b {

        /* renamed from: a */
        private String f27949a;

        /* renamed from: b */
        private String f27950b;

        /* renamed from: a */
        public String mo39582a() {
            return this.f27950b;
        }

        /* renamed from: b */
        public String mo39583b() {
            return this.f27949a;
        }
    }

    /* renamed from: com.bytedance.ee.bear.onboarding.export.a.a.c$c */
    public static class C10393c extends AbstractC10392b {

        /* renamed from: a */
        private String f27951a;

        /* renamed from: b */
        private String f27952b;

        /* renamed from: a */
        public String mo39584a() {
            return this.f27952b;
        }

        /* renamed from: b */
        public String mo39585b() {
            return this.f27951a;
        }

        public C10393c(String str, String str2) {
            this.f27951a = str;
            this.f27952b = str2;
        }
    }

    /* renamed from: c */
    public String mo39567c() {
        return this.f27935b;
    }

    /* renamed from: d */
    public int mo39568d() {
        return this.f27936c;
    }

    /* renamed from: e */
    public int mo39569e() {
        return this.f27937d;
    }

    /* renamed from: f */
    public View mo39570f() {
        return this.f27940g;
    }

    /* renamed from: g */
    public RectF mo39571g() {
        return this.f27941h;
    }

    /* renamed from: h */
    public boolean mo39572h() {
        return this.f27942i;
    }

    /* renamed from: i */
    public Integer mo39573i() {
        return this.f27938e;
    }

    /* renamed from: j */
    public AbstractC10392b mo39574j() {
        return this.f27939f;
    }

    /* renamed from: k */
    public AbstractC10394d mo39575k() {
        return this.f27945l;
    }

    /* renamed from: l */
    public FlowStyleHollowShape mo39576l() {
        return this.f27943j;
    }

    /* renamed from: m */
    public int mo39577m() {
        return this.f27944k;
    }

    /* renamed from: n */
    public boolean mo39578n() {
        return this.f27948o;
    }

    /* renamed from: o */
    public String mo39579o() {
        return this.f27946m;
    }

    /* renamed from: p */
    public String mo39580p() {
        return this.f27947n;
    }

    /* renamed from: b */
    public String mo39566b() {
        return this.f27934a;
    }

    public String toString() {
        return "FlowData{title='" + this.f27934a + '\'' + ", body='" + this.f27935b + '\'' + ", index=" + this.f27936c + ", count=" + this.f27937d + ", targetView=" + this.f27940g + ", targetRect=" + this.f27941h + ", isLast='" + this.f27942i + '\'' + ", hollowShape=" + this.f27943j + ", customHighlightRectRadius=" + this.f27944k + '}';
    }

    /* renamed from: a */
    public C10390c mo39559a(AbstractC10394d dVar) {
        this.f27945l = dVar;
        return this;
    }

    /* renamed from: b */
    public C10390c mo39565b(String str) {
        this.f27947n = str;
        return this;
    }

    /* renamed from: a */
    public C10390c mo39560a(FlowStyleHollowShape flowStyleHollowShape) {
        this.f27943j = flowStyleHollowShape;
        return this;
    }

    /* renamed from: a */
    public C10390c mo39561a(String str) {
        this.f27935b = str;
        return this;
    }

    /* renamed from: a */
    public C10390c mo39562a(boolean z) {
        this.f27948o = z;
        return this;
    }

    /* renamed from: a */
    public void mo39563a(int i) {
        this.f27944k = i;
    }

    /* renamed from: a */
    public void mo39564a(AbstractC10392b bVar) {
        this.f27939f = bVar;
    }

    public C10390c(String str, boolean z, RectF rectF) {
        this.f27934a = str;
        this.f27942i = z;
        this.f27941h = rectF;
    }

    public C10390c(String str, boolean z, View view) {
        this.f27934a = str;
        this.f27942i = z;
        this.f27940g = view;
    }

    public C10390c(String str, int i, int i2, RectF rectF) {
        this.f27934a = str;
        this.f27936c = i;
        this.f27937d = i2;
        this.f27941h = rectF;
    }

    public C10390c(String str, int i, int i2, View view) {
        this.f27934a = str;
        this.f27936c = i;
        this.f27937d = i2;
        this.f27940g = view;
    }
}
