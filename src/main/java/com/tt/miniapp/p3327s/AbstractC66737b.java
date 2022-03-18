package com.tt.miniapp.p3327s;

import com.tt.miniapphost.entity.AppInfoEntity;

/* renamed from: com.tt.miniapp.s.b */
public interface AbstractC66737b {
    void mismatchHost();

    void offline();

    void requestAppInfoFail(String str, String str2);

    void requestAppInfoSuccess(AppInfoEntity appInfoEntity);

    void showNotSupportView(AppInfoEntity appInfoEntity, int i);
}
