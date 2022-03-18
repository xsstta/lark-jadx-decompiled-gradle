package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC1852a;
import com.airbnb.lottie.p067a.p068a.AbstractC1739c;
import com.airbnb.lottie.p067a.p068a.C1748l;
import com.airbnb.lottie.p071c.C1787d;

public class MergePaths implements AbstractC1837b {

    /* renamed from: a */
    private final String f6283a;

    /* renamed from: b */
    private final MergePathsMode f6284b;

    /* renamed from: c */
    private final boolean f6285c;

    /* renamed from: a */
    public String mo9161a() {
        return this.f6283a;
    }

    /* renamed from: b */
    public MergePathsMode mo9162b() {
        return this.f6284b;
    }

    /* renamed from: c */
    public boolean mo9163c() {
        return this.f6285c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f6284b + '}';
    }

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC1837b
    /* renamed from: a */
    public AbstractC1739c mo9140a(LottieDrawable lottieDrawable, AbstractC1852a aVar) {
        if (lottieDrawable.mo8881c()) {
            return new C1748l(this);
        }
        C1787d.m7973b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f6283a = str;
        this.f6284b = mergePathsMode;
        this.f6285c = z;
    }
}
