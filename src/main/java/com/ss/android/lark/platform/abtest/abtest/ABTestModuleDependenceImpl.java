package com.ss.android.lark.platform.abtest.abtest;

import android.app.Application;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.abtest.api.listener.AbTestModuleDependency;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.invitation.v2.InvitationModule;
import com.ss.android.lark.p1322a.C28476b;
import com.ss.android.lark.platform.abtest.C51660a;
import com.ss.android.lark.platform.larksetting.LarkSettingModuleProvider;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbTestModuleDependency.class)
public class ABTestModuleDependenceImpl implements AbTestModuleDependency {
    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public String getAbTestHost() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.TT_ABTEST);
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public Application getApp() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public String getUserId() {
        return C36083a.m141486a().getPassportDependency().mo133085d();
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public boolean isAbTestEnable() {
        return C37239a.m146648b().mo136951a("tt_ab_test");
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public boolean isDebug() {
        return C26284k.m95185a(getApp());
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public int getTenantTag() {
        return C36083a.m141486a().getPassportDependency().mo133087f().getTenantTag();
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public void registerExperiments() {
        C36083a.m141486a().getOpenFeatureDependency().mo132993a(C51660a.m200386a());
        C51660a.m200386a().registerExperiments("AOT", C28476b.m104345b());
        C51660a.m200386a().registerExperiments("UG", C38548a.m152028d());
        C51660a.m200386a().registerExperiments("Invite", InvitationModule.getAbTestExperiments());
        C51660a.m200386a().registerExperiments("Chat", C36083a.m141486a().getIMDependency().mo132962w());
        C36083a.m141486a().getTodoDependency().mo133128a(C51660a.m200386a());
        C36083a.m141486a().getMomentsDependency().mo132987a(C51660a.m200386a());
    }

    @Override // com.ss.android.lark.abtest.api.listener.AbTestModuleDependency
    public <T> T getAbSettings(String str, Class<T> cls, T t) {
        return (T) LarkSettingModuleProvider.m200903a().mo148444a(str, cls, t);
    }
}
