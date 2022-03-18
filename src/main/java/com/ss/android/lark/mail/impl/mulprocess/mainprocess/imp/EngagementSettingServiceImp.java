package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.List;

@RemoteServiceImpl(service = IEngagementSettingService.class)
public class EngagementSettingServiceImp implements IEngagementSettingService {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean canShareToExternalPermission() {
        return C43362e.m172201a().mo155099n();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public List<String> getDomains() {
        return C43362e.m172201a().mo155096k();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IEngagementSettingService
    public boolean getRecallEnable() {
        return C43362e.m172201a().mo155090e();
    }

    public EngagementSettingServiceImp(Context context) {
        this.mContext = context;
    }
}
