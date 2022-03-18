package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.w */
final class C21969w implements Comparator<ActivityTransition> {
    C21969w() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int a = activityTransition3.mo74279a();
        int a2 = activityTransition4.mo74279a();
        if (a != a2) {
            return a < a2 ? -1 : 1;
        }
        int b = activityTransition3.mo74280b();
        int b2 = activityTransition4.mo74280b();
        if (b == b2) {
            return 0;
        }
        return b < b2 ? -1 : 1;
    }
}
