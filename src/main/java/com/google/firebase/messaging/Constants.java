package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.concurrent.TimeUnit;

public final class Constants {

    /* renamed from: a */
    public static final long f56559a = TimeUnit.MINUTES.toMillis(3);

    public static final class FirelogAnalytics {

        public @interface EventType {
            public static final String MESSAGE_DELIVERED = "MESSAGE_DELIVERED";
        }

        public @interface MessageType {
            public static final String DATA_MESSAGE = "DATA_MESSAGE";
            public static final String DISPLAY_NOTIFICATION = "DISPLAY_NOTIFICATION";
        }
    }

    public static final class ScionAnalytics {

        public @interface MessageType {
            public static final String DATA_MESSAGE = "data";
            public static final String DISPLAY_NOTIFICATION = "display";
        }
    }

    /* renamed from: com.google.firebase.messaging.Constants$a */
    public static final class C22883a {
        /* renamed from: a */
        public static ArrayMap<String, String> m83137a(Bundle bundle) {
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            return arrayMap;
        }
    }
}
