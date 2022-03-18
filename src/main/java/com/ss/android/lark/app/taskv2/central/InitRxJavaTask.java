package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import java.util.Properties;

public class InitRxJavaTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        Properties properties = System.getProperties();
        properties.setProperty("rx2.purge-enabled", "false");
        properties.setProperty("rx2.io-keep-alive-time", "300");
    }
}
