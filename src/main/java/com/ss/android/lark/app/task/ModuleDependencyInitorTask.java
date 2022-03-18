package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.task.initor.AudioModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.DiskManageModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.EmojiModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.HotfixModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.LarkPhotoEditorModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.MonitorModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.RichTextModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.utils.LarkContext;

public class ModuleDependencyInitorTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        MonitorModuleDependencyInitor.m106409a(context);
        TeaAgentModuleDependencyInitor.m106643a(context);
        AudioModuleDependencyInitor.m106341a(context);
        BaseModuleDependencyInitor.m106344a(context);
        HotfixModuleDependencyInitor.m106400a(context);
        WidgetModuleDependencyInitor.m106670a(context);
        PhotoPickerModuleDependencyInitor.m106412a(context);
        LarkPhotoEditorModuleDependencyInitor.m106402a(context);
        RichTextModuleDependencyInitor.m106518a(context);
        EmojiModuleDependencyInitor.m106397a(context);
        DiskManageModuleDependencyInitor.m106375a();
        C53254m.m205920a(LarkContext.getApplication());
    }
}
