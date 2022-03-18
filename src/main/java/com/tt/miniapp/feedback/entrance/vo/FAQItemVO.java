package com.tt.miniapp.feedback.entrance.vo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class FAQItemVO implements Parcelable {
    public static final Parcelable.Creator<FAQItemVO> CREATOR = new Parcelable.Creator<FAQItemVO>() {
        /* class com.tt.miniapp.feedback.entrance.vo.FAQItemVO.C661531 */

        /* renamed from: a */
        public FAQItemVO[] newArray(int i) {
            return new FAQItemVO[i];
        }

        /* renamed from: a */
        public FAQItemVO createFromParcel(Parcel parcel) {
            return new FAQItemVO(parcel);
        }
    };

    /* renamed from: a */
    private long f166983a;

    /* renamed from: b */
    private String f166984b;

    /* renamed from: c */
    private JSONArray f166985c;

    /* renamed from: d */
    private String f166986d;

    /* renamed from: e */
    private List<String> f166987e;

    /* renamed from: f */
    private int f166988f;

    /* renamed from: g */
    private int f166989g;

    /* renamed from: h */
    private int f166990h;

    /* renamed from: i */
    private String f166991i;

    /* renamed from: j */
    private List<FAQItemVO> f166992j;

    public int describeContents() {
        return 0;
    }

    public FAQItemVO() {
    }

    /* renamed from: a */
    public long mo231384a() {
        return this.f166983a;
    }

    /* renamed from: b */
    public String mo231389b() {
        return this.f166984b;
    }

    /* renamed from: c */
    public JSONArray mo231391c() {
        return this.f166985c;
    }

    /* renamed from: d */
    public String mo231392d() {
        return this.f166986d;
    }

    /* renamed from: e */
    public List<FAQItemVO> mo231394e() {
        return this.f166992j;
    }

    /* renamed from: a */
    public void mo231385a(long j) {
        this.f166983a = j;
    }

    /* renamed from: b */
    public void mo231390b(String str) {
        this.f166986d = str;
    }

    /* renamed from: a */
    public void mo231386a(String str) {
        this.f166984b = str;
    }

    /* renamed from: a */
    public void mo231387a(List<FAQItemVO> list) {
        this.f166992j = list;
    }

    protected FAQItemVO(Parcel parcel) {
        this.f166983a = parcel.readLong();
        this.f166984b = parcel.readString();
        this.f166986d = parcel.readString();
        this.f166987e = parcel.createStringArrayList();
        this.f166988f = parcel.readInt();
        this.f166989g = parcel.readInt();
        this.f166990h = parcel.readInt();
        this.f166991i = parcel.readString();
        this.f166992j = parcel.createTypedArrayList(CREATOR);
    }

    /* renamed from: a */
    public void mo231388a(JSONArray jSONArray) {
        this.f166985c = jSONArray;
    }

    /* renamed from: a */
    public static FAQItemVO m259005a(JSONObject jSONObject) {
        FAQItemVO fAQItemVO = new FAQItemVO();
        fAQItemVO.mo231385a(jSONObject.optLong("id"));
        fAQItemVO.mo231386a(jSONObject.optString("name"));
        fAQItemVO.mo231388a(jSONObject.optJSONArray("children"));
        fAQItemVO.mo231390b(jSONObject.optString("value"));
        JSONArray optJSONArray = jSONObject.optJSONArray("related_labels");
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(m259005a(optJSONArray.optJSONObject(i)));
        }
        fAQItemVO.mo231387a(arrayList);
        return fAQItemVO;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f166983a);
        parcel.writeString(this.f166984b);
        parcel.writeString(this.f166986d);
        parcel.writeStringList(this.f166987e);
        parcel.writeInt(this.f166988f);
        parcel.writeInt(this.f166989g);
        parcel.writeInt(this.f166990h);
        parcel.writeString(this.f166991i);
        parcel.writeTypedList(this.f166992j);
    }
}
