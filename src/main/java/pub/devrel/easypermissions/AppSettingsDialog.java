package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.DialogInterfaceC0257a;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;

public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new Parcelable.Creator<AppSettingsDialog>() {
        /* class pub.devrel.easypermissions.AppSettingsDialog.C701951 */

        /* renamed from: a */
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }

        /* renamed from: a */
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel);
        }
    };

    /* renamed from: a */
    private final int f175321a;

    /* renamed from: b */
    private final String f175322b;

    /* renamed from: c */
    private final String f175323c;

    /* renamed from: d */
    private final String f175324d;

    /* renamed from: e */
    private final String f175325e;

    /* renamed from: f */
    private final int f175326f;

    /* renamed from: g */
    private final int f175327g;

    /* renamed from: h */
    private Object f175328h;

    /* renamed from: i */
    private Context f175329i;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo247356a() {
        return this.f175327g;
    }

    /* renamed from: pub.devrel.easypermissions.AppSettingsDialog$a */
    public static class C70196a {

        /* renamed from: a */
        private final Object f175330a;

        /* renamed from: b */
        private final Context f175331b;

        /* renamed from: c */
        private int f175332c = -1;

        /* renamed from: d */
        private String f175333d;

        /* renamed from: e */
        private String f175334e;

        /* renamed from: f */
        private String f175335f;

        /* renamed from: g */
        private String f175336g;

        /* renamed from: h */
        private int f175337h = -1;

        /* renamed from: i */
        private boolean f175338i;

        /* renamed from: a */
        public AppSettingsDialog mo247364a() {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            int i2;
            if (TextUtils.isEmpty(this.f175333d)) {
                str = this.f175331b.getString(R.string.rationale_ask_again);
            } else {
                str = this.f175333d;
            }
            this.f175333d = str;
            if (TextUtils.isEmpty(this.f175334e)) {
                str2 = this.f175331b.getString(R.string.title_settings_dialog);
            } else {
                str2 = this.f175334e;
            }
            this.f175334e = str2;
            if (TextUtils.isEmpty(this.f175335f)) {
                str3 = this.f175331b.getString(17039370);
            } else {
                str3 = this.f175335f;
            }
            this.f175335f = str3;
            if (TextUtils.isEmpty(this.f175336g)) {
                str4 = this.f175331b.getString(17039360);
            } else {
                str4 = this.f175336g;
            }
            this.f175336g = str4;
            int i3 = this.f175337h;
            if (i3 > 0) {
                i = i3;
            } else {
                i = 16061;
            }
            this.f175337h = i;
            if (this.f175338i) {
                i2 = 268435456;
            } else {
                i2 = 0;
            }
            return new AppSettingsDialog(this.f175330a, this.f175332c, this.f175333d, this.f175334e, this.f175335f, str4, i, i2);
        }

        public C70196a(Activity activity) {
            this.f175330a = activity;
            this.f175331b = activity;
        }
    }

    private AppSettingsDialog(Parcel parcel) {
        this.f175321a = parcel.readInt();
        this.f175322b = parcel.readString();
        this.f175323c = parcel.readString();
        this.f175324d = parcel.readString();
        this.f175325e = parcel.readString();
        this.f175326f = parcel.readInt();
        this.f175327g = parcel.readInt();
    }

    /* renamed from: a */
    private void m269011a(Object obj) {
        this.f175328h = obj;
        if (obj instanceof Activity) {
            this.f175329i = (Activity) obj;
        } else if (obj instanceof Fragment) {
            this.f175329i = ((Fragment) obj).getContext();
        } else {
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    /* renamed from: a */
    static AppSettingsDialog m269010a(Intent intent, Activity activity) {
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            appSettingsDialog = new C70196a(activity).mo247364a();
        }
        appSettingsDialog.m269011a(activity);
        return appSettingsDialog;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f175321a);
        parcel.writeString(this.f175322b);
        parcel.writeString(this.f175323c);
        parcel.writeString(this.f175324d);
        parcel.writeString(this.f175325e);
        parcel.writeInt(this.f175326f);
        parcel.writeInt(this.f175327g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public DialogInterfaceC0257a mo247357a(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        DialogInterfaceC0257a.C0258a aVar;
        int i = this.f175321a;
        if (i != -1) {
            aVar = new DialogInterfaceC0257a.C0258a(this.f175329i, i);
        } else {
            aVar = new DialogInterfaceC0257a.C0258a(this.f175329i);
        }
        return aVar.mo925a(false).mo923a(this.f175323c).mo927b(this.f175322b).mo924a(this.f175324d, onClickListener).mo928b(this.f175325e, onClickListener2).mo930c();
    }

    private AppSettingsDialog(Object obj, int i, String str, String str2, String str3, String str4, int i2, int i3) {
        m269011a(obj);
        this.f175321a = i;
        this.f175322b = str;
        this.f175323c = str2;
        this.f175324d = str3;
        this.f175325e = str4;
        this.f175326f = i2;
        this.f175327g = i3;
    }
}
