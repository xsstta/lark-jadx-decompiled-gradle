package com.ss.lark.android.module.offlinepush.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.ss.lark.android.module.offlinepush.account.a */
public class C64263a extends AbstractAccountAuthenticator {
    public C64263a(Context context) {
        super(context);
    }

    public String getAuthTokenLabel(String str) {
        throw new UnsupportedOperationException();
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }
}
