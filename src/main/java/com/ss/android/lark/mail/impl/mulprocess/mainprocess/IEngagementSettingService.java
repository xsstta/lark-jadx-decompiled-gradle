package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.List;

@RemoteService
public interface IEngagementSettingService extends IHookInterface {
    boolean canShareToExternalPermission();

    List<String> getDomains();

    boolean getRecallEnable();
}
