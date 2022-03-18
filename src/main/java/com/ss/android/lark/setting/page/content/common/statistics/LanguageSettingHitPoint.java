package com.ss.android.lark.setting.page.content.common.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/statistics/LanguageSettingHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.b.b */
public final class LanguageSettingHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f134054a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/statistics/LanguageSettingHitPoint$Companion;", "", "()V", "sendCleanCache", "", "sendEnterLanguageAndTranslateSetting", "sendEnterLanguageSetting", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo185345a() {
            try {
                Statistics.sendEvent("setting_langandtime");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo185346b() {
            try {
                Statistics.sendEvent("setting_language_choose");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        /* renamed from: c */
        public final void mo185347c() {
            try {
                Statistics.sendEvent("clean_cache");
            } catch (Exception e) {
                Log.m165382e(e.getMessage());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
