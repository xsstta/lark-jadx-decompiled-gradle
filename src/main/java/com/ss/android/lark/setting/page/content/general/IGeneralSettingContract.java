package com.ss.android.lark.setting.page.content.general;

import ai.v1.MobileComposerSetting;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

public interface IGeneralSettingContract {

    public enum SmartComposeScene {
        MESSENGER,
        MAIL,
        DOC
    }

    /* renamed from: com.ss.android.lark.setting.page.content.general.IGeneralSettingContract$a */
    public interface AbstractC54430a extends IModel {

        /* renamed from: com.ss.android.lark.setting.page.content.general.IGeneralSettingContract$a$a */
        public interface AbstractC54431a {
        }
    }

    /* renamed from: com.ss.android.lark.setting.page.content.general.IGeneralSettingContract$b */
    public interface AbstractC54432b extends IView<AbstractC54433a> {

        /* renamed from: com.ss.android.lark.setting.page.content.general.IGeneralSettingContract$b$a */
        public interface AbstractC54433a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186086a(MobileComposerSetting mobileComposerSetting);

            /* renamed from: a */
            void mo186087a(boolean z);

            /* renamed from: a */
            void mo186088a(boolean z, boolean z2);

            /* renamed from: b */
            void mo186089b(boolean z);

            /* renamed from: c */
            void mo186090c(boolean z);
        }
    }
}
