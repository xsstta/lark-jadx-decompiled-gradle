package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.z */
final class C21972z implements Comparator<DetectedActivity> {
    C21972z() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(DetectedActivity detectedActivity, DetectedActivity detectedActivity2) {
        DetectedActivity detectedActivity3 = detectedActivity;
        DetectedActivity detectedActivity4 = detectedActivity2;
        int compareTo = Integer.valueOf(detectedActivity4.mo74301b()).compareTo(Integer.valueOf(detectedActivity3.mo74301b()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity3.mo74300a()).compareTo(Integer.valueOf(detectedActivity4.mo74300a())) : compareTo;
    }
}
