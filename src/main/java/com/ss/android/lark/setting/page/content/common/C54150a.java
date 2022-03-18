package com.ss.android.lark.setting.page.content.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.impl.display.DisplayAppearanceSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.locale.C54181a;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguageSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.msgalignment.MessageAlignSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.TargetLanguageSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.TranslateSettingActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54309b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54311c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingFacadeActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54331a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.C54341e;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54356a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.C54366e;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingFacadeActivity;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageAutoTranslateSettingInfo;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplaySettingInfo;
import com.ss.android.lark.setting.page.content.common.statistics.LanguageSettingHitPoint;

/* renamed from: com.ss.android.lark.setting.page.content.common.a */
public class C54150a {
    /* renamed from: a */
    public static void m210221a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, MessageAlignSettingActivity.class), 65281);
    }

    /* renamed from: f */
    public static void m210233f(Context context) {
        context.startActivity(new Intent(context, DisplayAppearanceSettingActivity.class));
    }

    /* renamed from: c */
    public static void m210230c(Context context) {
        Bundle bundle = new Bundle();
        if (DesktopUtil.m144301a(context)) {
            m210227a(bundle, new C54311c());
        } else {
            m210224a(context, bundle, TargetLanguageSettingActivity.class);
        }
    }

    /* renamed from: d */
    public static void m210231d(Context context) {
        Bundle bundle = new Bundle();
        if (DesktopUtil.m144301a(context)) {
            m210227a(bundle, new C54366e());
        } else {
            m210224a(context, bundle, DisplaySettingFacadeActivity.class);
        }
    }

    /* renamed from: e */
    public static void m210232e(Context context) {
        Bundle bundle = new Bundle();
        if (DesktopUtil.m144301a(context)) {
            m210227a(bundle, new C54341e());
        } else {
            m210224a(context, bundle, AutoTranslateSettingFacadeActivity.class);
        }
    }

    /* renamed from: g */
    public static void m210234g(Context context) {
        Intent intent = new Intent(context, FontSettingActivity.class);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m210222a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            MainWindowParams a = new MainWindowParams.C36570a(ContainerType.Right).mo134958a("system_setting").mo134930b();
            C36512a.m144041a().mo134763a(new C54160c(), a);
        } else {
            context.startActivity(new Intent(context, LanguageAndTranslateActivity.class));
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.C54150a.RunnableC541511 */

            public void run() {
                LanguageSettingHitPoint.f134054a.mo185345a();
            }
        });
    }

    /* renamed from: b */
    public static void m210228b(Context context) {
        if (DesktopUtil.m144301a(context)) {
            C36512a.m144041a().mo134761a(new C54309b(), new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b());
            return;
        }
        m210224a(context, new Bundle(), TranslateSettingActivity.class);
    }

    /* renamed from: b */
    private static void m210229b(Bundle bundle, C36516a aVar) {
        aVar.setArguments(bundle);
        DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
        aVar.setFragmentParams(a);
        C36512a.m144041a().mo134761a(aVar, a);
    }

    /* renamed from: a */
    public static void m210223a(Context context, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!DesktopUtil.m144301a(context)) {
            m210224a(context, bundle, LanguageSettingActivity.class);
        } else {
            m210229b(bundle, new C54181a());
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.page.content.common.C54150a.RunnableC541522 */

            public void run() {
                LanguageSettingHitPoint.f134054a.mo185346b();
            }
        });
    }

    /* renamed from: a */
    public static void m210225a(Context context, LanguageAutoTranslateSettingInfo languageAutoTranslateSettingInfo) {
        Bundle bundle = new Bundle();
        if (DesktopUtil.m144301a(context)) {
            m210227a(C54331a.m210947b(languageAutoTranslateSettingInfo), new C54331a());
            return;
        }
        bundle.putParcelable("language_auto_translate_setting_info", languageAutoTranslateSettingInfo);
        m210224a(context, bundle, AutoTranslateSettingDetailActivity.class);
    }

    /* renamed from: a */
    public static void m210226a(Context context, LanguageDisplaySettingInfo languageDisplaySettingInfo) {
        Bundle bundle = new Bundle();
        if (DesktopUtil.m144301a(context)) {
            m210227a(C54356a.m211029b(languageDisplaySettingInfo), new C54356a());
            return;
        }
        bundle.putParcelable("arg1", languageDisplaySettingInfo);
        m210224a(context, bundle, DisplaySettingDetailActivity.class);
    }

    /* renamed from: a */
    private static void m210227a(Bundle bundle, C36516a aVar) {
        aVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
        aVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(aVar, a);
    }

    /* renamed from: a */
    private static void m210224a(Context context, Bundle bundle, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
