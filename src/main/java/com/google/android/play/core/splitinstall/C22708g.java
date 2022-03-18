package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.AbstractC22617a;

/* renamed from: com.google.android.play.core.splitinstall.g */
final class C22708g implements AbstractC22617a {

    /* renamed from: a */
    final /* synthetic */ Activity f56201a;

    C22708g(Activity activity) {
        this.f56201a = activity;
    }

    @Override // com.google.android.play.core.common.AbstractC22617a
    /* renamed from: a */
    public final void mo78853a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.f56201a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
