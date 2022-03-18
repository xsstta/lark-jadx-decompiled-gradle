package com.bytedance.push.third;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.push.C20386c;
import com.bytedance.push.interfaze.AbstractC20449l;
import com.bytedance.push.utils.AbstractC20557g;
import com.bytedance.push.utils.C20552c;
import com.ss.android.pushmanager.setting.C59971b;
import com.ss.android.ug.bus.C60442b;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.third.a */
public abstract class AbstractC20539a {
    protected static final Set<Integer> mAllowPushSet = new CopyOnWriteArraySet();
    protected Map<Integer, AbstractC20557g<AbstractC20544b>> mPushChannelMap = new HashMap();

    public Pair<String, String> getPushConfig(int i, C20386c cVar) {
        return null;
    }

    public int getTryRegisterChannelId() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public abstract void initChannels();

    public boolean isNeedUnzip(int i) {
        return false;
    }

    public boolean requestOpNotificationPermission() {
        return false;
    }

    public AbstractC20539a() {
        initChannels();
    }

    public Set<Integer> getChannels() {
        Map<Integer, AbstractC20557g<AbstractC20544b>> map = this.mPushChannelMap;
        if (map == null) {
            return null;
        }
        return map.keySet();
    }

    protected static void initAllowPushSet() {
        if (C20552c.m74848a()) {
            C20552c.m74845a("BaseChannelHelper", "initAllowPushSet: mAllowPushSet = " + mAllowPushSet);
        }
        if (mAllowPushSet.isEmpty()) {
            handlerApplogConfig(C59971b.m232728b().mo68922a(), false);
        }
    }

    public JSONArray buildApplogHeader() {
        JSONArray jSONArray = new JSONArray();
        for (Integer num : this.mPushChannelMap.keySet()) {
            if (isLocalSupportChannel(num.intValue())) {
                jSONArray.put(num);
            }
        }
        return jSONArray;
    }

    public static boolean isServerSupportChannel(int i) {
        initAllowPushSet();
        return mAllowPushSet.contains(Integer.valueOf(i));
    }

    public IPushAdapter getAdapterInstance(int i) {
        AbstractC20544b channel = getChannel(Integer.valueOf(i));
        if (channel == null) {
            return null;
        }
        return channel.mo69175b();
    }

    public String getSenderNameById(int i) {
        AbstractC20544b channel = getChannel(Integer.valueOf(i));
        if (channel != null) {
            return channel.mo69177d();
        }
        return "unknown";
    }

    public boolean isLocalSupportChannel(int i) {
        AbstractC20544b channel = getChannel(Integer.valueOf(i));
        if (channel == null) {
            return false;
        }
        return channel.mo69174a();
    }

    private AbstractC20544b getChannel(Integer num) {
        Map<Integer, AbstractC20557g<AbstractC20544b>> map;
        if (num == null || (map = this.mPushChannelMap) == null) {
            getChannelFailedEvent(num, this.mPushChannelMap);
            return null;
        }
        AbstractC20557g<AbstractC20544b> gVar = map.get(num);
        if (gVar != null) {
            return gVar.mo69198c(new Object[0]);
        }
        getChannelFailedEvent(num, this.mPushChannelMap);
        return null;
    }

    public int getChannelId(String str) {
        Log.d("bdpush", "getChannelId is called:" + str);
        if (this.mPushChannelMap == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (Integer num : this.mPushChannelMap.keySet()) {
            AbstractC20544b channel = getChannel(num);
            if (channel != null && str.equals(channel.mo69176c())) {
                return num.intValue();
            }
        }
        return -1;
    }

    public boolean hasSupportChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 0) {
                        if (jSONArray.optInt(0) == -9307) {
                            return true;
                        }
                        String jSONArray2 = buildApplogHeader().toString();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            int optInt = jSONArray.optInt(i);
                            if (jSONArray2.contains(optInt + "")) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void getChannelFailedEvent(Integer num, Map<Integer, AbstractC20557g<AbstractC20544b>> map) {
        JSONObject jSONObject = new JSONObject();
        if (num == null) {
            try {
                jSONObject.put("channelId", "null");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            jSONObject.put("channelId", num);
        }
        if (map == null) {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "pushChannelMap is null");
        } else {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, map.keySet());
        }
        ((AbstractC20449l) C60442b.m234863a(AbstractC20449l.class)).mo68867a("get_channel_failed", jSONObject, (JSONObject) null, (JSONObject) null);
    }

    public static void handlerApplogConfig(String str, boolean z) {
        if (z) {
            C59971b.m232728b().mo204205b(str);
        }
        if (!TextUtils.isEmpty(str)) {
            C20552c.m74844a("support:" + str);
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONArray != null) {
                if (C20552c.m74848a()) {
                    C20552c.m74845a("BaseChannelHelper", "handlerApplogConfig: jsonArray = " + jSONArray);
                }
                mAllowPushSet.clear();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    int optInt = jSONArray.optInt(i);
                    if (optInt > 0) {
                        mAllowPushSet.add(Integer.valueOf(optInt));
                    }
                }
            }
        }
    }
}
