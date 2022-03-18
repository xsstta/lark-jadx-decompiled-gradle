package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C22908o();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    Bundle bundle;
    private Map<String, String> data;
    private C22889a notification;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public final String getCollapseKey() {
        return this.bundle.getString("collapse_key");
    }

    public final Map<String, String> getData() {
        if (this.data == null) {
            this.data = Constants.C22883a.m83137a(this.bundle);
        }
        return this.data;
    }

    public final String getFrom() {
        return this.bundle.getString("from");
    }

    public final String getMessageType() {
        return this.bundle.getString("message_type");
    }

    public final byte[] getRawData() {
        return this.bundle.getByteArray("rawData");
    }

    public final String getSenderId() {
        return this.bundle.getString("google.c.sender.id");
    }

    public final String getTo() {
        return this.bundle.getString("google.to");
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.bundle);
        return intent;
    }

    public final String getMessageId() {
        String string = this.bundle.getString("google.message_id");
        if (string == null) {
            return this.bundle.getString("message_id");
        }
        return string;
    }

    public final C22889a getNotification() {
        if (this.notification == null && C22907n.m83214a(this.bundle)) {
            this.notification = new C22889a(new C22907n(this.bundle));
        }
        return this.notification;
    }

    public final int getOriginalPriority() {
        String string = this.bundle.getString("google.original_priority");
        if (string == null) {
            string = this.bundle.getString("google.priority");
        }
        return getMessagePriority(string);
    }

    public final int getPriority() {
        String string = this.bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.bundle.getString("google.priority");
        }
        return getMessagePriority(string);
    }

    public final long getSentTime() {
        Object obj = this.bundle.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public final int getTtl() {
        Object obj = this.bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public RemoteMessage(Bundle bundle2) {
        this.bundle = bundle2;
    }

    /* access modifiers changed from: package-private */
    public final void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.bundle);
    }

    private final int getMessagePriority(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    public static class C22889a {

        /* renamed from: a */
        private final String f56565a;

        /* renamed from: b */
        private final String f56566b;

        /* renamed from: c */
        private final String[] f56567c;

        /* renamed from: d */
        private final String f56568d;

        /* renamed from: e */
        private final String f56569e;

        /* renamed from: f */
        private final String[] f56570f;

        /* renamed from: g */
        private final String f56571g;

        /* renamed from: h */
        private final String f56572h;

        /* renamed from: i */
        private final String f56573i;

        /* renamed from: j */
        private final String f56574j;

        /* renamed from: k */
        private final String f56575k;

        /* renamed from: l */
        private final String f56576l;

        /* renamed from: m */
        private final String f56577m;

        /* renamed from: n */
        private final Uri f56578n;

        /* renamed from: o */
        private final String f56579o;

        /* renamed from: p */
        private final Integer f56580p;

        /* renamed from: q */
        private final Integer f56581q;

        /* renamed from: r */
        private final Integer f56582r;

        /* renamed from: s */
        private final int[] f56583s;

        /* renamed from: t */
        private final Long f56584t;

        /* renamed from: u */
        private final boolean f56585u;

        /* renamed from: v */
        private final boolean f56586v;

        /* renamed from: w */
        private final boolean f56587w;

        /* renamed from: x */
        private final boolean f56588x;

        /* renamed from: y */
        private final boolean f56589y;

        /* renamed from: z */
        private final long[] f56590z;

        private C22889a(C22907n nVar) {
            this.f56565a = nVar.mo79506a("gcm.n.title");
            this.f56566b = nVar.mo79515e("gcm.n.title");
            this.f56567c = m83145a(nVar, "gcm.n.title");
            this.f56568d = nVar.mo79506a("gcm.n.body");
            this.f56569e = nVar.mo79515e("gcm.n.body");
            this.f56570f = m83145a(nVar, "gcm.n.body");
            this.f56571g = nVar.mo79506a("gcm.n.icon");
            this.f56573i = nVar.mo79514e();
            this.f56574j = nVar.mo79506a("gcm.n.tag");
            this.f56575k = nVar.mo79506a("gcm.n.color");
            this.f56576l = nVar.mo79506a("gcm.n.click_action");
            this.f56577m = nVar.mo79506a("gcm.n.android_channel_id");
            this.f56578n = nVar.mo79512d();
            this.f56572h = nVar.mo79506a("gcm.n.image");
            this.f56579o = nVar.mo79506a("gcm.n.ticker");
            this.f56580p = nVar.mo79511c("gcm.n.notification_priority");
            this.f56581q = nVar.mo79511c("gcm.n.visibility");
            this.f56582r = nVar.mo79511c("gcm.n.notification_count");
            this.f56585u = nVar.mo79509b("gcm.n.sticky");
            this.f56586v = nVar.mo79509b("gcm.n.local_only");
            this.f56587w = nVar.mo79509b("gcm.n.default_sound");
            this.f56588x = nVar.mo79509b("gcm.n.default_vibrate_timings");
            this.f56589y = nVar.mo79509b("gcm.n.default_light_settings");
            this.f56584t = nVar.mo79513d("gcm.n.event_time");
            this.f56583s = nVar.mo79519g();
            this.f56590z = nVar.mo79516f();
        }

        /* renamed from: a */
        private static String[] m83145a(C22907n nVar, String str) {
            Object[] f = nVar.mo79517f(str);
            if (f == null) {
                return null;
            }
            String[] strArr = new String[f.length];
            for (int i = 0; i < f.length; i++) {
                strArr[i] = String.valueOf(f[i]);
            }
            return strArr;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C22908o.m83240a(this, parcel, i);
    }
}
