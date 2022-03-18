package com.ss.android.lark.mail.impl.mulprocess.webprocess.imp;

import android.content.Context;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = ITranslationService.class)
public class TranslationService implements ITranslationService {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.ITranslationService
    public void setTranslationSetting(TranslationSetting translationSetting) {
        C43853v.m173840a(translationSetting);
    }

    public TranslationService(Context context) {
        this.mContext = context;
    }
}
