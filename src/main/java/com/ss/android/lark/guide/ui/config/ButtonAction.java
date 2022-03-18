package com.ss.android.lark.guide.ui.config;

import com.ss.android.lark.guide.ui.config.ButtonConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Deprecated(level = DeprecationLevel.WARNING, message = "Please use ButtonAction interface from ButtonConfig", replaceWith = @ReplaceWith(expression = "ButtonConfig.ButtonAction", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/ButtonAction;", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.c */
public interface ButtonAction extends ButtonConfig.ButtonAction {
}
