package com.ss.android.lark.apihandler.basic.jsapi.util;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TimePicker;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class TimePickerHandlerV2 extends AbstractInjectJSApiHandler<C28822a> implements Parcelable {
    public static final Parcelable.Creator<TimePickerHandlerV2> CREATOR = new Parcelable.Creator<TimePickerHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.util.TimePickerHandlerV2.C288201 */

        /* renamed from: a */
        public TimePickerHandlerV2[] newArray(int i) {
            return new TimePickerHandlerV2[i];
        }

        /* renamed from: a */
        public TimePickerHandlerV2 createFromParcel(Parcel parcel) {
            return new TimePickerHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    public AbstractC25832c f72392a;

    /* renamed from: b */
    public String f72393b;

    /* renamed from: c */
    private TimePickerDialog.OnTimeSetListener f72394c;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.util.TimePickerHandlerV2$a */
    public static class C28822a implements BaseJSModel {
        public String format;
        private String value;

        C28822a() {
        }

        public String getFormat() {
            return this.format;
        }

        public String getValue() {
            return this.value;
        }

        public void setFormat(String str) {
            this.format = str;
        }

        public void setValue(String str) {
            this.value = str;
        }
    }

    public TimePickerHandlerV2() {
    }

    /* renamed from: b */
    private void m105586b() {
        this.f72394c = new TimePickerDialog.OnTimeSetListener() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.util.TimePickerHandlerV2.C288212 */

            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("value", C26279i.m95153a(C26279i.m95154a(i + ":" + i2, "HH:mm"), TimePickerHandlerV2.this.f72393b));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                TimePickerHandlerV2.this.f72392a.mo91902a(jSONObject.toString());
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        m105586b();
    }

    protected TimePickerHandlerV2(Parcel parcel) {
        super(parcel);
        this.f72393b = parcel.readString();
    }

    /* renamed from: a */
    private String m105585a(int i) {
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            try {
                jSONObject.put("code", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            jSONObject.put("code", 2);
        }
        jSONObject.put("value", 0);
        return jSONObject.toString();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f72393b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C28822a aVar, AbstractC25832c cVar) {
        if (mo91997u() == null || aVar == null) {
            cVar.mo91902a(m105585a(0));
            return;
        }
        try {
            Date parse = new SimpleDateFormat(aVar.getFormat()).parse(aVar.getValue());
            this.f72393b = aVar.format;
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            int i = instance.get(11);
            int i2 = instance.get(12);
            this.f72392a = cVar;
            new TimePickerDialog(mo91997u(), this.f72394c, i, i2, true).show();
        } catch (ParseException e) {
            e.printStackTrace();
            this.f72392a.mo91902a(m105585a(2));
        }
    }
}
