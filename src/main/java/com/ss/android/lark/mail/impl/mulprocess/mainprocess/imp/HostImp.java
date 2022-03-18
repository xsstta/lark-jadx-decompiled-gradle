package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.TranslationSetting;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43389a;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43853v;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@RemoteServiceImpl(service = IHost.class)
public class HostImp implements IHost {
    private final Context context;

    public Context getContext() {
        return this.context;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public TranslationSetting syncTranslationSetting() {
        return C43853v.m173850h();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAccessKey() {
        return C41816b.m166115a().mo150119I().mo150200b();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public long getAppId() {
        return C41816b.m166115a().mo150119I().mo150199a();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getAppVersionName() {
        return C41816b.m166115a().mo150119I().mo150203e();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getCurrentLabelId() {
        return C43374f.m172264f().mo155129q();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDeviceId() {
        return C41816b.m166115a().mo150119I().mo150202d();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getDomain() {
        return C41816b.m166115a().mo150119I().mo150201c();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getEnv() {
        return C41816b.m166115a().mo150147n();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getFilePathListKey() {
        return C41816b.m166115a().mo150156w().mo150162a();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getForwardModuleAdditionNoteKey() {
        return C41816b.m166115a().mo150150q();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getGeckoRootFilePath() {
        return C41816b.m166115a().mo150119I().mo150204f();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getSession() {
        return C41816b.m166115a().mo150140g();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getUserId() {
        return C41816b.m166115a().mo150139f();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean is24HourClock() {
        return C41816b.m166115a().mo150116F().mo150192b();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isDebug() {
        return C41816b.m166115a().mo150143j();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isStrongBadgeRemind() {
        return C41816b.m166115a().mo150116F().mo150190a();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUsingTTWebView() {
        return C41816b.m166115a().mo150144k();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void tryInitDrive() {
        C41816b.m166115a().mo150158y().mo150170a();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getCurNetWorkLevel() {
        return C41816b.m166115a().mo150112B().mo150174a().getValue();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getLan() {
        String str;
        Locale m = C41816b.m166115a().mo150146m();
        if (m == null || m.getLanguage() == null) {
            str = null;
        } else {
            str = m.getLanguage().toLowerCase();
        }
        if (TextUtils.isEmpty(str)) {
            return "en";
        }
        return str;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean useCNString() {
        Log.m165388i("useEnString");
        Locale m = C41816b.m166115a().mo150146m();
        if (m == null) {
            return false;
        }
        String displayCountry = m.getDisplayCountry();
        if (!TextUtils.isEmpty(displayCountry) && displayCountry.equals(Locale.CHINA.getDisplayCountry())) {
            return true;
        }
        return false;
    }

    public HostImp(Context context2) {
        this.context = context2;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelDownload(String[] strArr) {
        return C41816b.m166115a().mo150158y().mo150171b(strArr);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean getFGByKey(String str) {
        return C41816b.m166115a().mo150154u().mo150160a(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean isUserSPContains(String str) {
        return C43779n.m173507a().contains(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithDoc(String str) {
        return C41816b.m166115a().mo150130a(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithLittleApp(String str) {
        return C41816b.m166115a().mo150135b(str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean viewByDrive(Bundle bundle) {
        return C41816b.m166115a().mo150129a(bundle);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int driveCancelUpload(List<String> list) {
        if (list == null) {
            return 0;
        }
        return C41816b.m166115a().mo150158y().mo150165a((String[]) list.toArray(new String[list.size()]));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void openChat(String str) {
        C41816b.m166115a().mo150115E().mo150186a(C41816b.m166115a().mo150132b(), str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean tryOpenUrlWithAppBrowser(String str) {
        return C41816b.m166115a().mo150134b(C41816b.m166115a().mo150132b(), str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void putBoolean(String str, boolean z) {
        C43779n.m173507a().putBoolean(str, z);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String getChatterAvatarByUserId(String str, int i) {
        return C41816b.m166115a().mo150115E().mo150185a(str, i);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public int getFileIconByMIMEType(String str, String str2) {
        return C41816b.m166115a().mo150111A().mo150173a(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void launchReplyLotsOfMessagesActivity(String str, String str2) {
        C41816b.m166115a().mo150124a(this.context, str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportBusiness(String str, String str2) {
        try {
            C41816b.m166115a().mo150114D().mo150182b(str, new JSONObject(str2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public void reportSlardar(String str, String str2) {
        try {
            C41816b.m166115a().mo150114D().mo150183c(str, new JSONObject(str2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public boolean openProfile(String str, String str2, String str3, String str4) {
        return C41816b.m166115a().mo150157x().mo150164a(str, str2, str3, str4);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String docImageDownload(String str, String str2, int i, boolean z, AbstractC43389a aVar) {
        return C41816b.m166115a().mo150158y().mo150167a(str, str2, i, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(Uri uri, String str, String str2, String str3, AbstractC43390b bVar) {
        return C41816b.m166115a().mo150158y().mo150166a(uri, str, str2, str3, bVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveUpload(String str, String str2, String str3, String str4, AbstractC43390b bVar) {
        return C41816b.m166115a().mo150158y().mo150169a(str, str2, str3, str4, bVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IHost
    public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, AbstractC43389a aVar) {
        return C41816b.m166115a().mo150158y().mo150168a(str, str2, str3, str4, i, str5, aVar);
    }
}
