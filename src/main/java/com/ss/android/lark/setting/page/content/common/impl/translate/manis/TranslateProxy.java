package com.ss.android.lark.setting.page.content.common.impl.translate.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.AbstractC54255a;
import com.ss.android.lark.setting.page.content.common.impl.translate.manis.dto.TransmissionData;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface TranslateProxy extends IHookInterface {
    void detectSourceLanguage(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar);

    void getTargetLangList(AbstractC54255a.AbstractC54256a aVar);

    void getWebTranslateSetting(String str, String str2, AbstractC54255a.AbstractC54256a aVar);

    void sendTranslateRequest(TransmissionData transmissionData, AbstractC54255a.AbstractC54256a aVar);

    void setAutoTranslate(boolean z, AbstractC54255a.AbstractC54257b bVar);

    void setUnTranslateThisLanguage(TransmissionData transmissionData, boolean z, AbstractC54255a.AbstractC54257b bVar);

    void setUnTranslateThisSite(String str, boolean z, AbstractC54255a.AbstractC54257b bVar);

    void updateGlobalAutoTranslateScope(int i, AbstractC54255a.AbstractC54257b bVar);
}
