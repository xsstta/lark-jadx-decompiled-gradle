package com.tt.refer.impl.business.api.diagnose;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.tt.refer.impl.business.api.diagnose.commands.ClearLocalJSSDK;
import com.tt.refer.impl.business.api.diagnose.commands.ClearLocalMeta;
import com.tt.refer.impl.business.api.diagnose.commands.ClearLocalPkg;
import com.tt.refer.impl.business.api.diagnose.commands.ExportTTFileLog;
import com.tt.refer.impl.business.api.diagnose.commands.GetAppStrategy;
import com.tt.refer.impl.business.api.diagnose.commands.GetConfigValue;
import com.tt.refer.impl.business.api.diagnose.commands.GetCurrentWebviewType;
import com.tt.refer.impl.business.api.diagnose.commands.GetDiskInfo;
import com.tt.refer.impl.business.api.diagnose.commands.GetFgValue;
import com.tt.refer.impl.business.api.diagnose.commands.GetGrantedPermissions;
import com.tt.refer.impl.business.api.diagnose.commands.GetMemoryInfo;
import com.tt.refer.impl.business.api.diagnose.commands.GetMiniAppVersion;
import com.tt.refer.impl.business.api.diagnose.commands.GetNetWorkType;
import com.tt.refer.impl.business.api.diagnose.commands.GetSandBoxInfo;
import com.tt.refer.impl.business.api.diagnose.commands.GetTTWebviewVersion;
import com.tt.refer.impl.business.api.diagnose.commands.GetTenantId;
import com.tt.refer.impl.business.api.diagnose.commands.GetUserId;
import com.tt.refer.impl.business.api.diagnose.commands.KillGadget;
import com.tt.refer.impl.business.api.diagnose.commands.SetDumpEnable;
import com.tt.refer.impl.business.api.diagnose.p3430a.C67887g;

/* renamed from: com.tt.refer.impl.business.api.diagnose.b */
public final class C67888b {
    /* renamed from: a */
    public static AbstractC67885a m264151a(int i) {
        if (i == 1) {
            return new C67887g();
        }
        if (i == 3) {
            return new GetCurrentWebviewType();
        }
        if (i == 15) {
            return new GetConfigValue();
        }
        if (i == 17) {
            return new GetGrantedPermissions();
        }
        if (i == 19) {
            return new GetAppStrategy();
        }
        if (i == 28) {
            return new GetSandBoxInfo();
        }
        if (i == 30) {
            return new SetDumpEnable();
        }
        if (i == 107) {
            return new ExportTTFileLog();
        }
        if (i == 12) {
            return new GetMiniAppVersion();
        }
        if (i == 13) {
            return new GetFgValue();
        }
        switch (i) {
            case 5:
                return new GetTTWebviewVersion();
            case 6:
                return new GetDiskInfo();
            case 7:
                return new GetMemoryInfo();
            case 8:
                return new GetNetWorkType();
            case 9:
                return new GetUserId();
            case 10:
                return new GetTenantId();
            default:
                switch (i) {
                    case 22:
                        return new ClearLocalMeta();
                    case 23:
                        return new ClearLocalPkg();
                    case 24:
                        return new ClearLocalJSSDK();
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        return new KillGadget();
                    default:
                        return null;
                }
        }
    }
}
