package com.ss.android.lark.mail.impl.mulprocess.webprocess;

import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService(hostProcess = "mailweb")
public interface ITranslationService extends IHookInterface {
    void setTranslationSetting(TranslationSetting translationSetting);
}
