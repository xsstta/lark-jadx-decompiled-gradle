package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.C22715a;
import com.google.android.play.core.tasks.AbstractC22738j;

public class SplitInstallException extends AbstractC22738j {

    /* renamed from: a */
    private final int f56108a;

    public SplitInstallException(int i) {
        super(String.format("Split Install Error(%d): %s", Integer.valueOf(i), C22715a.m82642a(i)));
        if (i != 0) {
            this.f56108a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @Override // com.google.android.play.core.tasks.AbstractC22738j
    public int getErrorCode() {
        return this.f56108a;
    }
}
