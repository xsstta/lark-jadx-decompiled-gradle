package com.ss.android.lark.banner.entity.params;

import com.ss.android.lark.pb.guide.BannerScene;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/banner/entity/params/BannerSceneMapper;", "", "()V", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.entity.a.a */
public final class BannerSceneMapper {

    /* renamed from: a */
    public static final HashMap<String, BannerScene> f73647a;

    /* renamed from: b */
    public static final Companion f73648b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/banner/entity/params/BannerSceneMapper$Companion;", "", "()V", "mapper", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/pb/guide/BannerScene;", "getScene", "sceneName", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BannerScene mo104434a(String str) {
            if (str == null) {
                return BannerScene.BANNER_SCENE_UNKNOWN;
            }
            BannerScene bannerScene = BannerSceneMapper.f73647a.get(str);
            if (bannerScene != null) {
                return bannerScene;
            }
            return BannerScene.BANNER_SCENE_UNKNOWN;
        }
    }

    static {
        HashMap<String, BannerScene> hashMap = new HashMap<>();
        hashMap.put("BANNER_SCENE_UNKNOWN", BannerScene.BANNER_SCENE_UNKNOWN);
        hashMap.put("BANNER_SCENE_CONTACT", BannerScene.BANNER_SCENE_CONTACT);
        hashMap.put("BANNER_SCENE_FEED", BannerScene.BANNER_SCENE_FEED);
        hashMap.put("BANNER_SCENE_CCM", BannerScene.BANNER_SCENE_CCM);
        hashMap.put("BANNER_SCENE_SHARED", BannerScene.BANNER_SCENE_SHARED);
        f73647a = hashMap;
    }
}
