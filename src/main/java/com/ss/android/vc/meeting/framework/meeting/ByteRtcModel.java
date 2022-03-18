package com.ss.android.vc.meeting.framework.meeting;

import android.view.View;
import com.ss.android.vc.meeting.framework.meeting.utils.C61327a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class ByteRtcModel {

    /* renamed from: a */
    private Map<String, C61291a> f153541a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RtcStreamType {
    }

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.ByteRtcModel$a */
    public static class C61291a {

        /* renamed from: a */
        public String f153542a;

        /* renamed from: b */
        public String f153543b;

        /* renamed from: c */
        public int f153544c;

        /* renamed from: d */
        private View f153545d;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("mId " + this.f153542a);
            stringBuffer.append(" mStreamId " + this.f153543b);
            stringBuffer.append(" type " + C61327a.m238899b(RtcStreamType.class, this.f153544c));
            stringBuffer.append(" view " + ByteRtcModel.m238522a(this.f153545d));
            return stringBuffer.toString();
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, C61291a> entry : this.f153541a.entrySet()) {
            stringBuffer.append("id " + entry.getKey() + " ");
            StringBuilder sb = new StringBuilder();
            sb.append(" stream: ");
            sb.append(entry.getValue().toString());
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m238522a(View view) {
        if (view == null) {
            return "view = null";
        }
        return " view != null " + view.getWidth() + " " + view.getHeight();
    }
}
