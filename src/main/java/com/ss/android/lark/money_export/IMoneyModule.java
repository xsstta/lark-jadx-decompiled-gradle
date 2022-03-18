package com.ss.android.lark.money_export;

import android.app.Activity;
import android.content.Context;

public interface IMoneyModule {
    void createRedPacket(Context context, String str, boolean z, int i, String str2, String str3);

    void openH5(Context context, String str);

    void openLynxPage(Context context, String str);

    void openRedPacket(Activity activity, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4);

    void openWallet(Context context);
}
