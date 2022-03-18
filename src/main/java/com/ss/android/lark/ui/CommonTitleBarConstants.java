package com.ss.android.lark.ui;

import com.larksuite.suite.R;
import com.ss.android.lark.C37030f;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

public class CommonTitleBarConstants {
    public static final int DEFAULT_ACTION_TEXT_SIZE;
    public static final int DEFAULT_LEFT_TEXT_SIZE;
    public static final int DEFAULT_MAIN_TEXT_SIZE;
    public static final int DEFAULT_SUB_TEXT_SIZE;
    public static final int ICON_BACK;
    public static final int ICON_CLOSE;

    /* renamed from: TEXT_CANCEL */
    public static final int Lark_Legacy_Cancel = 2131829849;

    static {
        if (C37030f.m146093a() == null || C37030f.m146093a().mo103021a() == null || !DesktopUtil.m144301a(C37030f.m146093a().mo103021a())) {
            DEFAULT_LEFT_TEXT_SIZE = 17;
            DEFAULT_MAIN_TEXT_SIZE = 18;
            DEFAULT_SUB_TEXT_SIZE = 12;
            DEFAULT_ACTION_TEXT_SIZE = 17;
            ICON_BACK = R.drawable.ud_icon_left_outlined;
            ICON_CLOSE = R.drawable.ud_icon_close_small_outlined;
            return;
        }
        DEFAULT_LEFT_TEXT_SIZE = 14;
        DEFAULT_MAIN_TEXT_SIZE = 16;
        DEFAULT_SUB_TEXT_SIZE = 12;
        DEFAULT_ACTION_TEXT_SIZE = 14;
        ICON_BACK = R.drawable.titlebar_back_bg_desktop_selector;
        ICON_CLOSE = R.drawable.titlebar_close_bg_desktop_selector;
    }
}
