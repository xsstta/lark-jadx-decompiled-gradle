package com.google.android.play.core.install;

import com.google.android.play.core.install.model.C22618a;
import com.google.android.play.core.tasks.AbstractC22738j;

public class InstallException extends AbstractC22738j {

    /* renamed from: a */
    private final int f55999a;

    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", Integer.valueOf(i), C22618a.m82224a(i)));
        if (i != 0) {
            this.f55999a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @Override // com.google.android.play.core.tasks.AbstractC22738j
    public int getErrorCode() {
        return this.f55999a;
    }
}
