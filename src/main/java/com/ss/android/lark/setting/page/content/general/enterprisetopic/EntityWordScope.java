package com.ss.android.lark.setting.page.content.general.enterprisetopic;

import com.ss.android.lark.pb.ai.FeatureSetting;
import com.ss.android.lark.setting.C54115c;
import java.io.Serializable;

public class EntityWordScope implements Serializable {
    public boolean mDocSettingEnable;
    public boolean mMailSettingEnable;
    public boolean mMsgSettingEnable;

    public static boolean isMailFgEnable() {
        return false;
    }

    public static boolean isMsgFgEnable() {
        return true;
    }

    public static boolean isDocFgEnable() {
        return C54115c.m210080a().mo178291e().mo178337a("ai.abbreviation.docs");
    }

    public static boolean isAllFgClosed() {
        if (isMsgFgEnable() || isDocFgEnable() || isMailFgEnable()) {
            return false;
        }
        return true;
    }

    public boolean isAllDisable() {
        if ((!this.mMsgSettingEnable || !isMsgFgEnable()) && ((!this.mDocSettingEnable || !isDocFgEnable()) && (!this.mMailSettingEnable || !isMailFgEnable()))) {
            return true;
        }
        return false;
    }

    public static EntityWordScope fromFeatureSetting(FeatureSetting featureSetting) {
        boolean z;
        boolean z2;
        EntityWordScope entityWordScope = new EntityWordScope();
        boolean z3 = true;
        if (featureSetting.mmessenger_setting != null) {
            z = featureSetting.mmessenger_setting.mis_enabled.booleanValue();
        } else {
            z = true;
        }
        entityWordScope.mMsgSettingEnable = z;
        if (featureSetting.mdocs_setting != null) {
            z2 = featureSetting.mdocs_setting.mis_enabled.booleanValue();
        } else {
            z2 = true;
        }
        entityWordScope.mDocSettingEnable = z2;
        if (featureSetting.mmail_setting != null) {
            z3 = featureSetting.mmail_setting.mis_enabled.booleanValue();
        }
        entityWordScope.mMailSettingEnable = z3;
        return entityWordScope;
    }
}
