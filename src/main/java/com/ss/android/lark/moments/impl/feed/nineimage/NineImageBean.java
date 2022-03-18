package com.ss.android.lark.moments.impl.feed.nineimage;

import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0012\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "Lcom/larksuite/framework/utils/diff/Diffable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean$NineImageType;", "imageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "media", "Lcom/bytedance/lark/pb/moments/v1/Media;", "needHorizonSpace", "", "needVerticalSpace", "(Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean$NineImageType;Lcom/bytedance/lark/pb/basic/v1/ImageSet;Lcom/bytedance/lark/pb/moments/v1/Media;ZZ)V", "getImageSet", "()Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "getMedia", "()Lcom/bytedance/lark/pb/moments/v1/Media;", "getNeedHorizonSpace", "()Z", "getNeedVerticalSpace", "getType", "()Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean$NineImageType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getItemType", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "", "NineImageType", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NineImageBean implements AbstractC26248b<NineImageBean> {

    /* renamed from: a */
    private final NineImageType f119990a;

    /* renamed from: b */
    private final ImageSet f119991b;

    /* renamed from: c */
    private final Media f119992c;

    /* renamed from: d */
    private final boolean f119993d;

    /* renamed from: e */
    private final boolean f119994e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean$NineImageType;", "", "(Ljava/lang/String;I)V", "TYPE_SINGLE_IMAGE", "TYPE_NORMAL_IMAGE", "TYPE_VIDEO", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum NineImageType {
        TYPE_SINGLE_IMAGE,
        TYPE_NORMAL_IMAGE,
        TYPE_VIDEO
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NineImageBean)) {
            return false;
        }
        NineImageBean nineImageBean = (NineImageBean) obj;
        return Intrinsics.areEqual(this.f119990a, nineImageBean.f119990a) && Intrinsics.areEqual(this.f119991b, nineImageBean.f119991b) && Intrinsics.areEqual(this.f119992c, nineImageBean.f119992c) && this.f119993d == nineImageBean.f119993d && this.f119994e == nineImageBean.f119994e;
    }

    public int hashCode() {
        NineImageType nineImageType = this.f119990a;
        int i = 0;
        int hashCode = (nineImageType != null ? nineImageType.hashCode() : 0) * 31;
        ImageSet imageSet = this.f119991b;
        int hashCode2 = (hashCode + (imageSet != null ? imageSet.hashCode() : 0)) * 31;
        Media media = this.f119992c;
        if (media != null) {
            i = media.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f119993d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f119994e;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        return "NineImageBean(type=" + this.f119990a + ", imageSet=" + this.f119991b + ", media=" + this.f119992c + ", needHorizonSpace=" + this.f119993d + ", needVerticalSpace=" + this.f119994e + ")";
    }

    /* renamed from: b */
    public final NineImageType mo167081b() {
        return this.f119990a;
    }

    /* renamed from: c */
    public final ImageSet mo167083c() {
        return this.f119991b;
    }

    /* renamed from: d */
    public final Media mo167084d() {
        return this.f119992c;
    }

    /* renamed from: e */
    public final boolean mo167085e() {
        return this.f119993d;
    }

    /* renamed from: f */
    public final boolean mo167087f() {
        return this.f119994e;
    }

    /* renamed from: a */
    public final int mo167079a() {
        return this.f119990a.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (com.ss.android.lark.moments.impl.common.utils.C47281d.m187233a(r0, r1) == false) goto L_0x001b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isContentSame(com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean r4) {
        /*
            r3 = this;
            int r0 = r3.mo167079a()
            com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean$NineImageType r1 = com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.NineImageType.TYPE_VIDEO
            int r1 = r1.ordinal()
            r2 = 0
            if (r0 == r1) goto L_0x001b
            com.bytedance.lark.pb.basic.v1.ImageSet r0 = r3.f119991b
            if (r4 == 0) goto L_0x0014
            com.bytedance.lark.pb.basic.v1.ImageSet r1 = r4.f119991b
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            boolean r0 = com.ss.android.lark.moments.impl.common.utils.C47281d.m187233a(r0, r1)
            if (r0 != 0) goto L_0x0033
        L_0x001b:
            int r0 = r3.mo167079a()
            com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean$NineImageType r1 = com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.NineImageType.TYPE_VIDEO
            int r1 = r1.ordinal()
            if (r0 != r1) goto L_0x0035
            com.bytedance.lark.pb.moments.v1.Media r0 = r3.f119992c
            if (r4 == 0) goto L_0x002d
            com.bytedance.lark.pb.moments.v1.Media r2 = r4.f119992c
        L_0x002d:
            boolean r4 = com.ss.android.lark.moments.impl.common.utils.C47281d.m187234a(r0, r2)
            if (r4 == 0) goto L_0x0035
        L_0x0033:
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.isContentSame(com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) == false) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isItemSame(com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0059
            int r0 = r3.mo167079a()
            int r1 = r4.mo167079a()
            if (r0 != r1) goto L_0x0059
            int r0 = r3.mo167079a()
            com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean$NineImageType r1 = com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.NineImageType.TYPE_VIDEO
            int r1 = r1.ordinal()
            r2 = 0
            if (r0 == r1) goto L_0x002f
            com.bytedance.lark.pb.basic.v1.ImageSet r0 = r3.f119991b
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.key
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            com.bytedance.lark.pb.basic.v1.ImageSet r1 = r4.f119991b
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = r1.key
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L_0x0057
        L_0x002f:
            int r0 = r3.mo167079a()
            com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean$NineImageType r1 = com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.NineImageType.TYPE_VIDEO
            int r1 = r1.ordinal()
            if (r0 != r1) goto L_0x0059
            com.bytedance.lark.pb.moments.v1.Media r0 = r3.f119992c
            if (r0 == 0) goto L_0x0046
            com.bytedance.lark.pb.basic.v1.ImageSet r0 = r0.cover
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = r0.key
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            com.bytedance.lark.pb.moments.v1.Media r4 = r4.f119992c
            if (r4 == 0) goto L_0x0051
            com.bytedance.lark.pb.basic.v1.ImageSet r4 = r4.cover
            if (r4 == 0) goto L_0x0051
            java.lang.String r2 = r4.key
        L_0x0051:
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r4 == 0) goto L_0x0059
        L_0x0057:
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean.isItemSame(com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean):boolean");
    }

    public NineImageBean(NineImageType nineImageType, ImageSet imageSet, Media media, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(nineImageType, ShareHitPoint.f121869d);
        this.f119990a = nineImageType;
        this.f119991b = imageSet;
        this.f119992c = media;
        this.f119993d = z;
        this.f119994e = z2;
    }
}
