package com.ss.android.vc.meeting.utils;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(runOnProcess = XProcess.Main)
public class XLKUIToast {
    @XMethod
    public static void showToast(Context context, Integer num) {
        LKUIToast.show(context, num.intValue());
    }
}
