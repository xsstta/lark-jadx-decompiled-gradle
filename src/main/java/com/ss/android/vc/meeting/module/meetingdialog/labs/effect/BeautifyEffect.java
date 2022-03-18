package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

public class BeautifyEffect extends EffectModel {
    @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel
    public boolean isBeautify() {
        return true;
    }

    public BeautifyEffect(String str, String str2, Effect effect) {
        super(str, str2, effect);
    }
}
