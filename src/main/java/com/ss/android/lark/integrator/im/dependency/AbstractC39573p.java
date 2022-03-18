package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.dependency.p */
public interface AbstractC39573p {
    AbstractC39571m getCCMDependency();

    ICalendarDependency getCalendarDependency();

    AbstractC39572n getCoreDependency();

    IEnvDependency getEnvDependency();

    IHelpdeskDependency getHelpdeskDependency();

    Map<String, String> getIMFAutoInitModuleConfigMap();

    Map<String, String> getIMFThirdPartyModuleConfigMap();

    Map<String, String> getIMFThirdPartyPrefixModuleConfigMap();

    AbstractC39574q getMailDependency();

    AbstractC39575r getMeegoDependency();

    AbstractC39576s getMigrateTempDependency();

    AbstractC39577t getOpenFeatureDependency();

    AbstractC39578u getOpenPlatformDependency();

    AbstractC39579v getPassportDependency();

    ITodoDependency getTodoDependency();

    AbstractC39580x getVideoConferenceDependency();

    void imfInitProcessorDoInit(String str);

    void showResourceDeletedByAdminDialog(Context context, Boolean bool, DialogInterface.OnDismissListener onDismissListener);
}
