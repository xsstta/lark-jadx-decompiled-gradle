package com.ss.android.lark.browser.biz.basic.jsapi.util;

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

public class TimePickerHandlerV2 extends AbstractInjectJSApiHandler<C29755a> implements Parcelable {
    public static final Parcelable.Creator<TimePickerHandlerV2> CREATOR = new Parcelable.Creator<TimePickerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.TimePickerHandlerV2.C297531 */

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
    public AbstractC25832c f74459a;

    /* renamed from: b */
    public String f74460b;

    /* renamed from: c */
    private TimePickerDialog.OnTimeSetListener f74461c;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.util.TimePickerHandlerV2$a */
    public static class C29755a implements BaseJSModel {
        public String format;
        private String value;

        C29755a() {
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
    private void m110023b() {
        this.f74461c = new TimePickerDialog.OnTimeSetListener() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.util.TimePickerHandlerV2.C297542 */

            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("value", C26279i.m95153a(C26279i.m95154a(i + ":" + i2, "HH:mm"), TimePickerHandlerV2.this.f74460b));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                TimePickerHandlerV2.this.f74459a.mo91902a(jSONObject.toString());
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        m110023b();
    }

    protected TimePickerHandlerV2(Parcel parcel) {
        super(parcel);
        this.f74460b = parcel.readString();
    }

    /* renamed from: a */
    private String m110022a(int i) {
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
        parcel.writeString(this.f74460b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29755a aVar, AbstractC25832c cVar) {
        if (mo91997u() == null || aVar == null) {
            cVar.mo91902a(m110022a(0));
            return;
        }
        try {
            Date parse = new SimpleDateFormat(aVar.getFormat()).parse(aVar.getValue());
            this.f74460b = aVar.format;
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            int i = instance.get(11);
            int i2 = instance.get(12);
            this.f74459a = cVar;
            new TimePickerDialog(mo91997u(), this.f74461c, i, i2, true).show();
        } catch (ParseException e) {
            e.printStackTrace();
            this.f74459a.mo91902a(m110022a(2));
        }
    }
}
