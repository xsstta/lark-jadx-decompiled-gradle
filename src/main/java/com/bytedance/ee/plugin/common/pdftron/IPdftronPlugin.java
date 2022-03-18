package com.bytedance.ee.plugin.common.pdftron;

import android.content.Context;
import com.bytedance.ee.plugin.common.IPluginApi;

public interface IPdftronPlugin extends IPluginApi {
    boolean initPdftron(Context context, String str);

    IPDFDrawWrapper newPDFDraw(Context context);

    IPDFViewCtrlWrapper newPDFViewCtrl(Context context);
}
