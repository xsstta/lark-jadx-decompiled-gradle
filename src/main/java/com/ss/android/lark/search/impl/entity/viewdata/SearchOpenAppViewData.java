package com.ss.android.lark.search.impl.entity.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.search.v1.ExtraHitField;
import com.ss.android.lark.searchcommon.dto.OpenAppState;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchOpenAppViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -5561745996736424596L;
    private Map<Integer, OpenAppAbilityViewData> abilityMap = new HashMap();
    private OpenAppState appState;
    private String appStoreUrl;
    private List<ExtraHitField> extraHitFields;
    private boolean isAvailable;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 12;
    }

    public static class OpenAppAbilityViewData implements Serializable {
        private static final long serialVersionUID = -6138301855455942550L;
        private String requiredInfo;
        protected int type;

        public String getRequiredInfo() {
            return this.requiredInfo;
        }

        public int getType() {
            return this.type;
        }

        public OpenAppAbilityViewData(int i, String str) {
            this.type = i;
            this.requiredInfo = str;
        }
    }

    public Map<Integer, OpenAppAbilityViewData> getAbilities() {
        return this.abilityMap;
    }

    public OpenAppState getAppState() {
        return this.appState;
    }

    public String getAppStoreUrl() {
        return this.appStoreUrl;
    }

    public List<ExtraHitField> getExtraHitFields() {
        return this.extraHitFields;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public boolean hasBotAbility() {
        if (this.abilityMap.get(1) != null) {
            return true;
        }
        return false;
    }

    public boolean isOpenAppDeleted() {
        if (this.appState == OpenAppState.APP_DELETED) {
            return true;
        }
        return false;
    }

    public boolean isOpenAppOffline() {
        if (this.appState == OpenAppState.OFFLINE) {
            return true;
        }
        return false;
    }

    public boolean isOpenAppUsable() {
        if (this.appState == OpenAppState.USABLE) {
            return true;
        }
        return false;
    }

    public boolean extraHitFieldsValid() {
        List<ExtraHitField> list = this.extraHitFields;
        if (list == null || list.size() <= 0 || !extraHitFieldValid(this.extraHitFields.get(0))) {
            return false;
        }
        return true;
    }

    public boolean hasH5Ability() {
        if (this.abilityMap.get(2) != null) {
            return true;
        }
        return false;
    }

    public boolean hasMicroAppAbility() {
        if (this.abilityMap.get(3) != null) {
            return true;
        }
        return false;
    }

    public void available(boolean z) {
        this.isAvailable = z;
    }

    public void setAbilities(Map<Integer, OpenAppAbilityViewData> map) {
        this.abilityMap = map;
    }

    public void setAppState(OpenAppState openAppState) {
        this.appState = openAppState;
    }

    public void setAppStoreUrl(String str) {
        this.appStoreUrl = str;
    }

    public void setExtraHitFields(List<ExtraHitField> list) {
        this.extraHitFields = list;
    }

    private boolean extraHitFieldValid(ExtraHitField extraHitField) {
        if (TextUtils.isEmpty(extraHitField.field_name) || TextUtils.isEmpty(extraHitField.title)) {
            return false;
        }
        return true;
    }
}
