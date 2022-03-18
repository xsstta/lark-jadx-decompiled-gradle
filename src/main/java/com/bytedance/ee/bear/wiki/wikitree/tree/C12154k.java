package com.bytedance.ee.bear.wiki.wikitree.tree;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.k */
public final class C12154k {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.k$1 */
    public static /* synthetic */ class C121551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f32726a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.wiki.wikitree.tree.C12154k.C121551.f32726a = r0
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.PANEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12154k.C121551.f32726a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12154k.C121551.f32726a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.MOV_TO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.C12154k.C121551.f32726a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType r1 = com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType.NEW_TO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.tree.C12154k.C121551.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C12151j m50485a(WikiTreeType wikiTreeType, C12164q qVar, String str) {
        int i = C121551.f32726a[wikiTreeType.ordinal()];
        if (i == 1) {
            return new C12140b(qVar, str);
        }
        if (i == 2) {
            return new C12142d(qVar, str);
        }
        if (i == 3) {
            return new C12149h(qVar, str);
        }
        if (i == 4) {
            return new C12151j(qVar, str);
        }
        throw new IllegalArgumentException("no extension found for this tree type. ");
    }
}
