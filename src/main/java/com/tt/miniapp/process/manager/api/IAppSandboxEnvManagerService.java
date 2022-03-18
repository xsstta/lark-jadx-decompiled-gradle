package com.tt.miniapp.process.manager.api;

import android.content.Context;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import java.util.Collection;
import java.util.Set;

public interface IAppSandboxEnvManagerService {
    /* renamed from: a */
    ISandboxEnvInfo mo232354a(String str);

    /* renamed from: a */
    IAppSandboxEnvProcessor mo232355a(SandBoxEnvType sandBoxEnvType);

    /* renamed from: a */
    void mo232356a(Context context);

    /* renamed from: a */
    void mo232357a(SandBoxEnvType sandBoxEnvType, IAppSandboxEnvProcessor iAppSandboxEnvProcessor);

    /* renamed from: b */
    ISandboxEnvInfo mo232358b(String str);

    /* renamed from: b */
    Collection<IAppSandboxEnvProcessor> mo232359b();

    /* renamed from: c */
    ISandboxEnvInfo mo232360c(String str);

    /* renamed from: c */
    Set<SandBoxEnvType> mo232361c();

    /* renamed from: d */
    IAppSandboxEnvProcessor mo232362d(String str);

    /* renamed from: e */
    IAppSandboxEnvProcessor mo232363e(String str);

    public enum SandBoxEnvType {
        MINI_PROCESS,
        MAIN_PROCESS;

        public static SandBoxEnvType fromNumber(int i) {
            if (i != 1) {
                return MINI_PROCESS;
            }
            return MAIN_PROCESS;
        }
    }
}
