package com.ss.android.lark.apihandler.basic.jsapi.util;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.DatePicker;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class DatePickerHandlerV2 extends AbstractInjectJSApiHandler<C28808a> implements Parcelable {
    public static final Parcelable.Creator<DatePickerHandlerV2> CREATOR = new Parcelable.Creator<DatePickerHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.util.DatePickerHandlerV2.C288061 */

        /* renamed from: a */
        public DatePickerHandlerV2[] newArray(int i) {
            return new DatePickerHandlerV2[i];
        }

        /* renamed from: a */
        public DatePickerHandlerV2 createFromParcel(Parcel parcel) {
            return new DatePickerHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    public AbstractC25832c f72381a;

    /* renamed from: b */
    public String f72382b;

    /* renamed from: c */
    private DatePickerDialog.OnDateSetListener f72383c;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.util.DatePickerHandlerV2$a */
    public static class C28808a implements BaseJSModel {
        public String format;
        private String value;

        C28808a() {
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

    public DatePickerHandlerV2() {
    }

    /* renamed from: b */
    private void m105543b() {
        this.f72383c = new DatePickerDialog.OnDateSetListener() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.util.DatePickerHandlerV2.C288072 */

            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("value", C26279i.m95153a(C26279i.m95154a(i + "-" + i2 + "-" + i3, "yyyy-M-d"), DatePickerHandlerV2.this.f72382b));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                DatePickerHandlerV2.this.f72381a.mo91902a(jSONObject.toString());
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        m105543b();
    }

    protected DatePickerHandlerV2(Parcel parcel) {
        super(parcel);
        this.f72382b = parcel.readString();
    }

    /* renamed from: a */
    private String m105542a(int i) {
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
        parcel.writeString(this.f72382b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C28808a aVar, AbstractC25832c cVar) {
        if (mo91997u() == null || aVar == null) {
            cVar.mo91902a(m105542a(0));
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(aVar.getFormat());
            this.f72382b = aVar.format;
            Date parse = simpleDateFormat.parse(aVar.getValue());
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            int i = instance.get(1);
            int i2 = instance.get(2);
            int i3 = instance.get(5);
            this.f72381a = cVar;
            new DatePickerDialog(mo91997u(), this.f72383c, i, i2, i3).show();
        } catch (Exception e) {
            e.printStackTrace();
            cVar.mo91902a(m105542a(2));
        }
    }
}
