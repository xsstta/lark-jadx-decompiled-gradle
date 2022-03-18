package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.lark.android.passport.biz.account.migration.AccountRedesignMigrationManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/app/task/AccountRedesignMigrationTask;", "Lcom/larksuite/framework/launch/task/AsyncLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "getTaskName", "", "isAsync", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AccountRedesignMigrationTask extends AsyncLaunchTask<Object> {

    /* renamed from: a */
    public static final AccountRedesignMigrationTask f72549a = new AccountRedesignMigrationTask();

    @Override // com.larksuite.framework.launch.task.AsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return false;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: e */
    public String mo92547e() {
        return "AccountRedesignMigrationTask";
    }

    private AccountRedesignMigrationTask() {
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        AccountRedesignMigrationManager.m252906c();
    }
}
