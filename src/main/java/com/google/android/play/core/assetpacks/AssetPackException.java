package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.C22603a;
import com.google.android.play.core.tasks.AbstractC22738j;

public class AssetPackException extends AbstractC22738j {

    /* renamed from: a */
    private final int f55641a;

    AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), C22603a.m82150a(i)));
        if (i != 0) {
            this.f55641a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    @Override // com.google.android.play.core.tasks.AbstractC22738j
    public int getErrorCode() {
        return this.f55641a;
    }
}
