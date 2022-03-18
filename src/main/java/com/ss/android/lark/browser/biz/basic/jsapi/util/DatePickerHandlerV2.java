package com.ss.android.lark.browser.biz.basic.jsapi.util;

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

public class DatePickerHandlerV2 extends AbstractInjectJSApiHandler<C29741a> implements Parcelable {
    public static final Parcelable.Creator<DatePickerHandlerV2> CREATOR = new Parcelable.Creator<DatePickerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.DatePickerHandlerV2.C297391 */

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
    public AbstractC25832c f74448a;

    /* renamed from: b */
    public String f74449b;

    /* renamed from: c */
    private DatePickerDialog.OnDateSetListener f74450c;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.util.DatePickerHandlerV2$a */
    public static class C29741a implements BaseJSModel {
        public String format;
        private String value;

        C29741a() {
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
    private void m109980b() {
        this.f74450c = new DatePickerDialog.OnDateSetListener() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.util.DatePickerHandlerV2.C297402 */

            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("value", C26279i.m95153a(C26279i.m95154a(i + "-" + i2 + "-" + i3, "yyyy-M-d"), DatePickerHandlerV2.this.f74449b));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                DatePickerHandlerV2.this.f74448a.mo91902a(jSONObject.toString());
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        m109980b();
    }

    protected DatePickerHandlerV2(Parcel parcel) {
        super(parcel);
        this.f74449b = parcel.readString();
    }

    /* renamed from: a */
    private String m109979a(int i) {
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
        parcel.writeString(this.f74449b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29741a aVar, AbstractC25832c cVar) {
        if (mo91997u() == null || aVar == null) {
            cVar.mo91902a(m109979a(0));
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(aVar.getFormat());
            this.f74449b = aVar.format;
            Date parse = simpleDateFormat.parse(aVar.getValue());
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            int i = instance.get(1);
            int i2 = instance.get(2);
            int i3 = instance.get(5);
            this.f74448a = cVar;
            new DatePickerDialog(mo91997u(), this.f74450c, i, i2, i3).show();
        } catch (Exception e) {
            e.printStackTrace();
            cVar.mo91902a(m109979a(2));
        }
    }
}
