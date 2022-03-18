package com.bytedance.push.interfaze;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.util.Pair;
import com.bytedance.push.third.AbstractC20545c;
import com.ss.android.push.Triple;
import com.ss.android.pushmanager.C59966d;
import java.io.IOException;
import java.util.zip.DataFormatException;
import org.json.JSONObject;

public interface IThirdSupportService {
    public static final String SEND_PUSH_TOKEN_URL = C59966d.m232705a();

    boolean allowPullUp(String str);

    boolean canKeepPackageAlive(Context context, String str);

    String getAdmPayloadName();

    String getFcmPayloadName();

    JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException;

    Pair<String, String> getPushConfig(int i);

    String getToken(Context context, int i);

    Triple<String, String, String> getUmConfig();

    void hackJobHandler(Service service);

    boolean isMainProcess(Context context);

    void onClickNotPassThroughNotification(Context context, String str, int i, String str2);

    void registerSenderFailed(int i, String str, String str2);

    void registerSenderSuccessAndUploadToken(Context context, int i, String str);

    void sendMonitor(Context context, String str, JSONObject jSONObject);

    void sendToken(Context context, AbstractC20545c cVar);

    boolean shouldShowUpgradeDialog(Activity activity);
}
