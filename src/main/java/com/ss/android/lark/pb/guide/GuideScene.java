package com.ss.android.lark.pb.guide;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum GuideScene implements WireEnum {
    GUIDE_SCENE_UNKNOWN(0),
    GUIDE_SCENE_CCM(1);
    
    public static final ProtoAdapter<GuideScene> ADAPTER = ProtoAdapter.newEnumAdapter(GuideScene.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    public static GuideScene fromValue(int i) {
        if (i == 0) {
            return GUIDE_SCENE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GUIDE_SCENE_CCM;
    }

    private GuideScene(int i) {
        this.value = i;
    }
}
