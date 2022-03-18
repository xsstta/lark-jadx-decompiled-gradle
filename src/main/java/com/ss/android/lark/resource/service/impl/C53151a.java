package com.ss.android.lark.resource.service.impl;

import com.bytedance.lark.pb.media.v1.AvatarFsUnitParams;
import com.bytedance.lark.pb.media.v1.AvatarResourceParams;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.resource.service.AvatarFsUnitParams;
import com.ss.android.lark.resource.service.AvatarResourceParams;
import java.util.Map;

/* renamed from: com.ss.android.lark.resource.service.impl.a */
public class C53151a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.resource.service.impl.a$2 */
    public static /* synthetic */ class C531532 {

        /* renamed from: a */
        static final /* synthetic */ int[] f131439a;

        /* renamed from: b */
        static final /* synthetic */ int[] f131440b;

        /* renamed from: c */
        static final /* synthetic */ int[] f131441c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009e */
        static {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.resource.service.impl.C53151a.C531532.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Resource m205711a(com.bytedance.lark.pb.media.v1.Resource resource) {
        if (resource == null) {
            return null;
        }
        return new Resource(resource.key, resource.path);
    }

    /* renamed from: a */
    private static AvatarFsUnitParams.Format m205707a(AvatarResourceParams.ImageFormat imageFormat) {
        int i = C531532.f131439a[imageFormat.ordinal()];
        if (i == 1) {
            return AvatarFsUnitParams.Format.PNG;
        }
        if (i == 2) {
            return AvatarFsUnitParams.Format.JPEG;
        }
        if (i != 3) {
            return AvatarFsUnitParams.Format.PNG;
        }
        return AvatarFsUnitParams.Format.WEBP;
    }

    /* renamed from: a */
    private static AvatarFsUnitParams.CutType m205706a(AvatarResourceParams.CutType cutType) {
        switch (C531532.f131440b[cutType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return AvatarFsUnitParams.CutType.FACE;
            default:
                return AvatarFsUnitParams.CutType.NOOP;
        }
    }

    /* renamed from: a */
    private static AvatarFsUnitParams.ImageSizeType m205708a(AvatarFsUnitParams.ImageSizeType imageSizeType) {
        int i = C531532.f131441c[imageSizeType.ordinal()];
        if (i == 1) {
            return AvatarFsUnitParams.ImageSizeType.SMALL;
        }
        if (i == 2) {
            return AvatarFsUnitParams.ImageSizeType.MIDDLE;
        }
        if (i == 3) {
            return AvatarFsUnitParams.ImageSizeType.BIG;
        }
        if (i != 4) {
            return AvatarFsUnitParams.ImageSizeType.ORIGIN;
        }
        return AvatarFsUnitParams.ImageSizeType.ORIGIN;
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.media.v1.AvatarFsUnitParams m205709a(com.ss.android.lark.resource.service.AvatarFsUnitParams avatarFsUnitParams) {
        if (avatarFsUnitParams == null) {
            return null;
        }
        AvatarFsUnitParams.C18184a aVar = new AvatarFsUnitParams.C18184a();
        aVar.mo63050a(m205706a(avatarFsUnitParams.getCutType())).mo63052a(m205708a(avatarFsUnitParams.getImageSizeType())).mo63051a(m205707a(avatarFsUnitParams.getImageFormat())).mo63053a(avatarFsUnitParams.getQuality());
        if (avatarFsUnitParams.isNoop()) {
            aVar.mo63053a(AvatarFsUnitParams.Quality.Q_NOOP);
        }
        return aVar.build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.media.v1.AvatarResourceParams m205710a(AvatarResourceParams avatarResourceParams) {
        if (avatarResourceParams == null) {
            return null;
        }
        return new AvatarResourceParams.C18186a().mo63061a(Integer.valueOf(avatarResourceParams.getWidth())).mo63063b(Integer.valueOf(avatarResourceParams.getHeight())).mo63058a(AvatarResourceParams.CutType.fromValue(avatarResourceParams.getCutType().getNumber())).mo63059a(AvatarResourceParams.ImageFormat.fromValue(avatarResourceParams.getFormat().getNumber())).mo63060a(Boolean.valueOf(avatarResourceParams.isNoop())).mo63064c(Integer.valueOf(avatarResourceParams.getQuality())).build();
    }

    /* renamed from: a */
    public static Map<String, Resource> m205712a(Map<String, com.bytedance.lark.pb.media.v1.Resource> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.media.v1.Resource, Resource>() {
            /* class com.ss.android.lark.resource.service.impl.C53151a.C531521 */

            /* renamed from: a */
            public Resource get(com.bytedance.lark.pb.media.v1.Resource resource) {
                return C53151a.m205711a(resource);
            }
        });
    }
}
