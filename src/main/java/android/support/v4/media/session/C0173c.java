package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.session.c */
public class C0173c {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.c$a */
    public static final class C0174a {
        /* renamed from: a */
        public static String m569a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m570b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m571c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m572d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: a */
        public static Object m568a(String str, CharSequence charSequence, int i, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    /* renamed from: a */
    public static int m558a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m560b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m561c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m562d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m563e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m564f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m565g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m566h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m567i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: a */
    public static Object m559a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        return builder.build();
    }
}
