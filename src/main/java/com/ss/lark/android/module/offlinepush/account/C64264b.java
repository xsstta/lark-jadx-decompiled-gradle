package com.ss.lark.android.module.offlinepush.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/* renamed from: com.ss.lark.android.module.offlinepush.account.b */
public class C64264b extends AbstractThreadedSyncAdapter {
    /* renamed from: a */
    private void m252718a() {
        if (getContext() == null) {
        }
    }

    public C64264b(Context context, boolean z) {
        super(context, z);
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        m252718a();
    }
}
