package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.search.v1.ExtraHitField;
import com.ss.android.lark.searchcommon.dto.OpenAppState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchOpenAppInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 8909572639273974577L;
    private List<SearchOpenAppAbility> abilities = new ArrayList();
    private OpenAppState appState = OpenAppState.USABLE;
    private String appStoreUrl;
    private List<ExtraHitField> extraHitFields = new ArrayList();
    private boolean isAvailable = true;

    public static class SearchOpenAppAbility implements Serializable {
        private static final long serialVersionUID = 7989518027963432944L;
        private String requiredInfo;
        public int type;

        public String getRequiredInfo() {
            return this.requiredInfo;
        }

        public int getType() {
            return this.type;
        }

        public SearchOpenAppAbility(int i, String str) {
            this.type = i;
            this.requiredInfo = str;
        }
    }

    public List<SearchOpenAppAbility> getAbilities() {
        return this.abilities;
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

    public SearchOpenAppInfo() {
        this.type = 12;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getTagForReport() {
        StringBuilder sb = new StringBuilder(super.getTagForReport());
        if (!this.isAvailable) {
            sb.append("uninstalled_app,");
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getResultTypeForReport() {
        /*
            r5 = this;
            boolean r0 = r5.isAvailable
            java.lang.String r1 = "apps"
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.util.List<com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo$SearchOpenAppAbility> r0 = r5.abilities
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r0.next()
            com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo$SearchOpenAppAbility r2 = (com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo.SearchOpenAppAbility) r2
            int r3 = r2.type
            r4 = 2
            if (r3 == r4) goto L_0x0023
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto L_0x000d
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = "app_bot"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.dto.info.SearchOpenAppInfo.getResultTypeForReport():java.lang.String");
    }

    public void available(boolean z) {
        this.isAvailable = z;
    }

    public void setAbilities(List<SearchOpenAppAbility> list) {
        this.abilities = list;
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
}
