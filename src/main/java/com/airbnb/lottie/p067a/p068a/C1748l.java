package com.airbnb.lottie.p067a.p068a;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.l */
public class C1748l implements AbstractC1746j, AbstractC1750m {

    /* renamed from: a */
    private final Path f5985a = new Path();

    /* renamed from: b */
    private final Path f5986b = new Path();

    /* renamed from: c */
    private final Path f5987c = new Path();

    /* renamed from: d */
    private final String f5988d;

    /* renamed from: e */
    private final List<AbstractC1750m> f5989e = new ArrayList();

    /* renamed from: f */
    private final MergePaths f5990f;

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: b */
    public String mo8939b() {
        return this.f5988d;
    }

    /* renamed from: a */
    private void m7809a() {
        for (int i = 0; i < this.f5989e.size(); i++) {
            this.f5987c.addPath(this.f5989e.get(i).mo8942e());
        }
    }

    /* renamed from: com.airbnb.lottie.a.a.l$1 */
    static /* synthetic */ class C17491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5991a;

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
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.p067a.p068a.C1748l.C17491.f5991a = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.p067a.p068a.C1748l.C17491.f5991a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.airbnb.lottie.p067a.p068a.C1748l.C17491.f5991a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.airbnb.lottie.p067a.p068a.C1748l.C17491.f5991a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.airbnb.lottie.p067a.p068a.C1748l.C17491.f5991a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p067a.p068a.C1748l.C17491.<clinit>():void");
        }
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1750m
    /* renamed from: e */
    public Path mo8942e() {
        this.f5987c.reset();
        if (this.f5990f.mo9163c()) {
            return this.f5987c;
        }
        int i = C17491.f5991a[this.f5990f.mo9162b().ordinal()];
        if (i == 1) {
            m7809a();
        } else if (i == 2) {
            m7810a(Path.Op.UNION);
        } else if (i == 3) {
            m7810a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m7810a(Path.Op.INTERSECT);
        } else if (i == 5) {
            m7810a(Path.Op.XOR);
        }
        return this.f5987c;
    }

    public C1748l(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5988d = mergePaths.mo9161a();
            this.f5990f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1746j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8943a(java.util.ListIterator<com.airbnb.lottie.p067a.p068a.AbstractC1739c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.a.a.c r0 = (com.airbnb.lottie.p067a.p068a.AbstractC1739c) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.p067a.p068a.AbstractC1750m
            if (r1 == 0) goto L_0x000d
            java.util.List<com.airbnb.lottie.a.a.m> r1 = r2.f5989e
            com.airbnb.lottie.a.a.m r0 = (com.airbnb.lottie.p067a.p068a.AbstractC1750m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p067a.p068a.C1748l.mo8943a(java.util.ListIterator):void");
    }

    /* renamed from: a */
    private void m7810a(Path.Op op) {
        this.f5986b.reset();
        this.f5985a.reset();
        for (int size = this.f5989e.size() - 1; size >= 1; size--) {
            AbstractC1750m mVar = this.f5989e.get(size);
            if (mVar instanceof C1740d) {
                C1740d dVar = (C1740d) mVar;
                List<AbstractC1750m> c = dVar.mo8940c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = c.get(size2).mo8942e();
                    e.transform(dVar.mo8941d());
                    this.f5986b.addPath(e);
                }
            } else {
                this.f5986b.addPath(mVar.mo8942e());
            }
        }
        AbstractC1750m mVar2 = this.f5989e.get(0);
        if (mVar2 instanceof C1740d) {
            C1740d dVar2 = (C1740d) mVar2;
            List<AbstractC1750m> c2 = dVar2.mo8940c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = c2.get(i).mo8942e();
                e2.transform(dVar2.mo8941d());
                this.f5985a.addPath(e2);
            }
        } else {
            this.f5985a.set(mVar2.mo8942e());
        }
        this.f5987c.op(this.f5985a, this.f5986b, op);
    }

    @Override // com.airbnb.lottie.p067a.p068a.AbstractC1739c
    /* renamed from: a */
    public void mo8936a(List<AbstractC1739c> list, List<AbstractC1739c> list2) {
        for (int i = 0; i < this.f5989e.size(); i++) {
            this.f5989e.get(i).mo8936a(list, list2);
        }
    }
}
