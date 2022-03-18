package com.android.volley;

import android.content.Intent;

public class AuthFailureError extends VolleyError {
    private Intent mResolutionIntent;

    public AuthFailureError() {
    }

    public Intent getResolutionIntent() {
        return this.mResolutionIntent;
    }

    public String getMessage() {
        if (this.mResolutionIntent != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public AuthFailureError(Intent intent) {
        this.mResolutionIntent = intent;
    }

    public AuthFailureError(C1933h hVar) {
        super(hVar);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
