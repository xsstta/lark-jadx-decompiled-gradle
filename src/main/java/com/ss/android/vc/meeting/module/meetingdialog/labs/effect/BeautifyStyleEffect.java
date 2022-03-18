package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;

public class BeautifyStyleEffect extends EffectModel {
    private EffectModel.BeautifyStyle beautyStyle = EffectModel.BeautifyStyle.UNKNOWN;

    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel
    public boolean isBeautifyStyle() {
        return true;
    }

    public EffectModel.BeautifyStyle getBeautyStyle() {
        return this.beautyStyle;
    }

    public void setBeautyStyle(EffectModel.BeautifyStyle beautifyStyle) {
        this.beautyStyle = beautifyStyle;
    }

    public static BeautifyStyleEffect newInstance(EffectModel.BeautifyStyle beautifyStyle) {
        return new BeautifyStyleEffect(null, null, null, beautifyStyle);
    }

    public BeautifyStyleEffect(String str, String str2, Effect effect, EffectModel.BeautifyStyle beautifyStyle) {
        super(str, str2, effect);
        setBeautyStyle(beautifyStyle);
    }
}
