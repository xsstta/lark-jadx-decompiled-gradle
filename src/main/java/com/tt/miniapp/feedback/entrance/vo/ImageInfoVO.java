package com.tt.miniapp.feedback.entrance.vo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ImageInfoVO implements Parcelable {
    public static final Parcelable.Creator<ImageInfoVO> CREATOR = new Parcelable.Creator<ImageInfoVO>() {
        /* class com.tt.miniapp.feedback.entrance.vo.ImageInfoVO.C661561 */

        /* renamed from: a */
        public ImageInfoVO[] newArray(int i) {
            return new ImageInfoVO[i];
        }

        /* renamed from: a */
        public ImageInfoVO createFromParcel(Parcel parcel) {
            return new ImageInfoVO(parcel);
        }
    };

    /* renamed from: a */
    private String f167010a;

    /* renamed from: b */
    private String f167011b;

    /* renamed from: c */
    private int f167012c;

    /* renamed from: d */
    private int f167013d;

    /* renamed from: e */
    private List<String> f167014e;

    public int describeContents() {
        return 0;
    }

    public ImageInfoVO() {
    }

    /* renamed from: a */
    public int mo231444a() {
        return this.f167012c;
    }

    /* renamed from: b */
    public int mo231448b() {
        return this.f167013d;
    }

    /* renamed from: c */
    public List<String> mo231451c() {
        return this.f167014e;
    }

    /* renamed from: a */
    public void mo231445a(int i) {
        this.f167012c = i;
    }

    /* renamed from: b */
    public void mo231449b(int i) {
        this.f167013d = i;
    }

    /* renamed from: a */
    public void mo231446a(String str) {
        this.f167010a = str;
    }

    /* renamed from: b */
    public void mo231450b(String str) {
        this.f167011b = str;
    }

    /* renamed from: a */
    public void mo231447a(List<String> list) {
        this.f167014e = list;
    }

    protected ImageInfoVO(Parcel parcel) {
        this.f167010a = parcel.readString();
        this.f167011b = parcel.readString();
        this.f167012c = parcel.readInt();
        this.f167013d = parcel.readInt();
        this.f167014e = parcel.createStringArrayList();
    }

    /* renamed from: a */
    public static JSONObject m259055a(ImageInfoVO imageInfoVO) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!(imageInfoVO == null || imageInfoVO.mo231451c() == null || imageInfoVO.mo231451c().isEmpty())) {
            jSONObject.put("image_uri", imageInfoVO.mo231451c().get(0));
            jSONObject.put("image_width", imageInfoVO.mo231448b());
            jSONObject.put("image_height", imageInfoVO.mo231444a());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static ImageInfoVO m259054a(JSONObject jSONObject) throws JSONException {
        ImageInfoVO imageInfoVO = new ImageInfoVO();
        imageInfoVO.mo231446a(jSONObject.optString("web_uri"));
        imageInfoVO.mo231450b(jSONObject.optString("format"));
        imageInfoVO.mo231445a(jSONObject.optInt("height"));
        imageInfoVO.mo231449b(jSONObject.optInt("width"));
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optJSONObject(i).optString("url"));
        }
        imageInfoVO.mo231447a(arrayList);
        return imageInfoVO;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167010a);
        parcel.writeString(this.f167011b);
        parcel.writeInt(this.f167012c);
        parcel.writeInt(this.f167013d);
        parcel.writeStringList(this.f167014e);
    }
}
