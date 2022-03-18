package com.ss.android.lark.pb.guide;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BannerScene implements WireEnum {
    BANNER_SCENE_UNKNOWN(0),
    BANNER_SCENE_CONTACT(1),
    BANNER_SCENE_FEED(2),
    BANNER_SCENE_CCM(3),
    BANNER_SCENE_SHARED(4),
    BANNER_SCENE_SIDEBAR(5);
    
    public static final ProtoAdapter<BannerScene> ADAPTER = ProtoAdapter.newEnumAdapter(BannerScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static BannerScene fromValue(int i) {
        if (i == 0) {
            return BANNER_SCENE_UNKNOWN;
        }
        if (i == 1) {
            return BANNER_SCENE_CONTACT;
        }
        if (i == 2) {
            return BANNER_SCENE_FEED;
        }
        if (i == 3) {
            return BANNER_SCENE_CCM;
        }
        if (i == 4) {
            return BANNER_SCENE_SHARED;
        }
        if (i != 5) {
            return null;
        }
        return BANNER_SCENE_SIDEBAR;
    }

    private BannerScene(int i) {
        this.value = i;
    }
}
