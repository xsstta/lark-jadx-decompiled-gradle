package com.tt.miniapphost.process.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CrossProcessDataEntity implements Parcelable {
    public static final Parcelable.Creator<CrossProcessDataEntity> CREATOR = new Parcelable.Creator<CrossProcessDataEntity>() {
        /* class com.tt.miniapphost.process.data.CrossProcessDataEntity.C675731 */

        /* renamed from: a */
        public CrossProcessDataEntity[] newArray(int i) {
            return new CrossProcessDataEntity[i];
        }

        /* renamed from: a */
        public CrossProcessDataEntity createFromParcel(Parcel parcel) {
            return new CrossProcessDataEntity(parcel);
        }
    };

    /* renamed from: a */
    public Bundle f170393a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public Bundle mo234739a() {
        return this.f170393a;
    }

    /* renamed from: com.tt.miniapphost.process.data.CrossProcessDataEntity$a */
    public static class C67574a {

        /* renamed from: a */
        Bundle f170394a = new Bundle();

        /* renamed from: a */
        public static C67574a m263013a() {
            return new C67574a();
        }

        /* renamed from: b */
        public CrossProcessDataEntity mo234763b() {
            return new CrossProcessDataEntity(this.f170394a);
        }

        /* renamed from: a */
        public C67574a mo234758a(String str, Parcelable parcelable) {
            this.f170394a.putParcelable(str, parcelable);
            return this;
        }

        /* renamed from: a */
        public C67574a mo234759a(String str, Serializable serializable) {
            this.f170394a.putSerializable(str, serializable);
            return this;
        }

        /* renamed from: a */
        public C67574a mo234761a(String str, ArrayList<? extends Parcelable> arrayList) {
            if (arrayList != null) {
                this.f170394a.putParcelableArrayList(str, arrayList);
            }
            return this;
        }

        /* renamed from: a */
        public C67574a mo234760a(String str, Object obj) {
            if (obj == null) {
                this.f170394a.remove(str);
            } else if (obj instanceof String) {
                this.f170394a.putString(str, (String) obj);
            } else if (obj instanceof Boolean) {
                this.f170394a.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                this.f170394a.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                this.f170394a.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                this.f170394a.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof JSONObject) {
                this.f170394a.putString(str, obj.toString());
            } else {
                throw new IllegalArgumentException();
            }
            return this;
        }

        /* renamed from: a */
        public C67574a mo234762a(String str, List<String> list) {
            if (list != null) {
                this.f170394a.putStringArrayList(str, new ArrayList<>(list));
            }
            return this;
        }
    }

    public String toString() {
        return this.f170393a.toString();
    }

    public CrossProcessDataEntity(Bundle bundle) {
        this.f170393a = bundle;
    }

    /* renamed from: b */
    public String mo234744b(String str) {
        return mo234740a(str, (String) null);
    }

    /* renamed from: c */
    public Serializable mo234745c(String str) {
        return this.f170393a.getSerializable(str);
    }

    /* renamed from: d */
    public boolean mo234746d(String str) {
        return mo234743a(str, false);
    }

    /* renamed from: e */
    public int mo234748e(String str) {
        return mo234737a(str, 0);
    }

    /* renamed from: g */
    public List<String> mo234750g(String str) {
        return this.f170393a.getStringArrayList(str);
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo234751h(String str) {
        return (T) this.f170393a.getParcelable(str);
    }

    protected CrossProcessDataEntity(Parcel parcel) {
        this.f170393a = parcel.readBundle(getClass().getClassLoader());
    }

    /* renamed from: f */
    public JSONObject mo234749f(String str) {
        try {
            String b = mo234744b(str);
            if (b != null) {
                return new JSONObject(b);
            }
            return null;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CrossProcessDataEntity", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo234742a(String str) {
        return this.f170393a.containsKey(str);
    }

    /* renamed from: a */
    public int mo234737a(String str, int i) {
        return this.f170393a.getInt(str, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f170393a);
    }

    /* renamed from: a */
    public long mo234738a(String str, long j) {
        return this.f170393a.getLong(str, j);
    }

    /* renamed from: a */
    public String mo234740a(String str, String str2) {
        return this.f170393a.getString(str, str2);
    }

    /* renamed from: a */
    public List<String> mo234741a(String str, List<String> list) {
        ArrayList<String> stringArrayList = this.f170393a.getStringArrayList(str);
        return stringArrayList != null ? stringArrayList : list;
    }

    /* renamed from: a */
    public boolean mo234743a(String str, boolean z) {
        return this.f170393a.getBoolean(str, z);
    }
}
