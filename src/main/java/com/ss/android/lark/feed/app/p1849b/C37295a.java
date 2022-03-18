package com.ss.android.lark.feed.app.p1849b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.filter.widget.FeedFilterView;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.shortcut.ShortcutBtnItemView;
import com.ss.android.lark.feed.app.shortcut.ShortcutItemView;
import com.ss.android.lark.feed.app.view.C37996h;
import com.ss.android.lark.feed.app.view.FeedItemView;
import com.ss.android.lark.feed.app.view.FeedReactionView;
import com.ss.android.lark.feed.app.view.NoneRtlSupportFeedItemView;
import com.ss.android.lark.feed.app.view.ShortcutFeedItemView;
import com.ss.android.lark.feed.p1847a.C37268c;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.lark.feed.app.b.a */
public class C37295a implements AbstractC37305b {

    /* renamed from: a */
    protected static boolean f95794a = C37268c.m146766b().mo139198q().mo139256a("lark.feed.activity_to_application");

    /* renamed from: b */
    protected Map<Class<?>, AbstractC37297a> f95795b;

    /* renamed from: com.ss.android.lark.feed.app.b.a$c */
    private static class C37299c extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 4;
        }

        private C37299c() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            return new FeedReactionView(context);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$a */
    public static abstract class AbstractC37297a {

        /* renamed from: a */
        Queue<View> f95796a = new LinkedBlockingQueue();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract int mo137134b();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract View mo137135b(Context context);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo137130a() {
            this.f95796a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo137136c() {
            return this.f95796a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo137131a(Context context) {
            for (int i = 0; i < mo137134b(); i++) {
                this.f95796a.add(mo137135b(context));
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0017  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo137137c(android.content.Context r3) {
            /*
                r2 = this;
            L_0x0000:
                java.util.Queue<android.view.View> r0 = r2.f95796a
                java.lang.Object r0 = r0.poll()
                android.view.View r0 = (android.view.View) r0
                boolean r1 = com.ss.android.lark.feed.app.p1849b.C37295a.f95794a
                if (r1 != 0) goto L_0x0015
                if (r0 == 0) goto L_0x0015
                android.content.Context r1 = r0.getContext()
                if (r1 == r3) goto L_0x0015
                goto L_0x0000
            L_0x0015:
                if (r0 != 0) goto L_0x001b
                android.view.View r0 = r2.mo137135b(r3)
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a.mo137137c(android.content.Context):android.view.View");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo137133a(View view) {
            this.f95796a.offer(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo137132a(Context context, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f95796a.offer(mo137135b(context));
            }
        }
    }

    public C37295a() {
        HashMap hashMap = new HashMap();
        this.f95795b = hashMap;
        hashMap.put(FeedItemView.class, new C37298b());
        this.f95795b.put(C37996h.class, new C37301e());
        this.f95795b.put(ShortcutFeedItemView.class, new C37303g());
        this.f95795b.put(ShortcutItemView.class, new C37304h());
        this.f95795b.put(ShortcutBtnItemView.class, new C37302f());
        this.f95795b.put(FeedFilterView.class, new C37300d());
        this.f95795b.put(FeedReactionView.class, new C37299c());
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$f */
    public static class C37302f extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            return new ShortcutBtnItemView(context);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$g */
    public static class C37303g extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            return new ShortcutFeedItemView(context);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$h */
    public static class C37304h extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 8;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            return new ShortcutItemView(context);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$b */
    public static class C37298b extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 12;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            if (C37713d.f96681k) {
                return new FeedItemView(context);
            }
            return new NoneRtlSupportFeedItemView(context);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$d */
    public static class C37300d extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            return LayoutInflater.from(context).inflate(R.layout.extra_header_filter_layout, (ViewGroup) new FrameLayout(context), false);
        }
    }

    /* renamed from: com.ss.android.lark.feed.app.b.a$e */
    public static class C37301e extends AbstractC37297a {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public int mo137134b() {
            return 1;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.feed.app.p1849b.C37295a.AbstractC37297a
        /* renamed from: b */
        public View mo137135b(Context context) {
            int i;
            LayoutInflater from = LayoutInflater.from(context);
            FrameLayout frameLayout = new FrameLayout(context);
            if (DesktopUtil.m144301a(context)) {
                i = R.layout.desktop_extra_header_layout;
            } else {
                i = R.layout.extra_header_layout;
            }
            return from.inflate(i, (ViewGroup) frameLayout, false);
        }
    }

    @Override // com.ss.android.lark.feed.app.p1849b.AbstractC37305b
    /* renamed from: a */
    public <T> void mo137129a(Class<T> cls, T t) {
        this.f95795b.get(cls).mo137133a((View) t);
    }

    @Override // com.ss.android.lark.feed.app.p1849b.AbstractC37305b
    /* renamed from: a */
    public <T extends View> T mo137128a(Class<?> cls, Context context) {
        if (f95794a) {
            context = context.getApplicationContext();
        }
        AbstractC37297a aVar = this.f95795b.get(cls);
        if (aVar != null) {
            return (T) aVar.mo137137c(context);
        }
        return null;
    }
}
