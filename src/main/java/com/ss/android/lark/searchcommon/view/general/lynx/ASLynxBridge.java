package com.ss.android.lark.searchcommon.view.general.lynx;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0012\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0012\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\b2\b\u0010#\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0007J\u0012\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u00100\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0007J\u0012\u00104\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u001c\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¨\u00068"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/ASLynxBridge;", "Lcom/lynx/jsbridge/LynxModule;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cardAction", "", "cardId", "", "action", "", "cardActionPassThrough", "jsonString", "closePage", "convertObjectToJSONObject", "", "param", "convertReadableMapToJSON", "Lorg/json/JSONObject;", "params", "Lcom/lynx/react/bridge/ReadableMap;", "encrypt", "content", "getAvatarUrl", "resKey", "callback", "Lcom/lynx/react/bridge/Callback;", "getStringByKey", "key", "isDarkMode", "", "log", "msg", "openDial", "title", "phoneNum", "openLocation", "latitude", "", "longitude", "openProfile", "userId", "openSchema", "link", "openSearch", SearchIntents.EXTRA_QUERY, "openSearchTab", "appId", "reportClick", "seeMoreDefinitions", "abbrName", "jsonArray", "sendClickEvent", "sendEvent", "eventName", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ASLynxBridge extends LynxModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/ASLynxBridge$Companion;", "", "()V", "NAME", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.ASLynxBridge$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.ASLynxBridge$b */
    static final class RunnableC54030b implements Runnable {

        /* renamed from: a */
        public static final RunnableC54030b f133770a = new RunnableC54030b();

        RunnableC54030b() {
        }

        public final void run() {
            new Instrumentation().sendKeyDownUpSync(4);
        }
    }

    @LynxMethod
    public final void closePage() {
        Log.m165379d("ASLynxBridge", "closePage");
        C57865c.m224576a(RunnableC54030b.f133770a);
    }

    @LynxMethod
    public final boolean isDarkMode() {
        SearchCommonUtils bVar = SearchCommonUtils.f133387a;
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        return bVar.mo184562a(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.ASLynxBridge$d */
    static final class RunnableC54032d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ASLynxBridge f133773a;

        /* renamed from: b */
        final /* synthetic */ String f133774b;

        /* renamed from: c */
        final /* synthetic */ ReadableMap f133775c;

        RunnableC54032d(ASLynxBridge aSLynxBridge, String str, ReadableMap readableMap) {
            this.f133773a = aSLynxBridge;
            this.f133774b = str;
            this.f133775c = readableMap;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f133774b)) {
                String str = this.f133774b;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                Statistics.sendEvent(str, this.f133773a.convertReadableMapToJSON(this.f133775c));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.ASLynxBridge$c */
    static final class RunnableC54031c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f133771a;

        /* renamed from: b */
        final /* synthetic */ Callback f133772b;

        RunnableC54031c(String str, Callback callback) {
            this.f133771a = str;
            this.f133772b = callback;
        }

        public final void run() {
            String str = "";
            if (!TextUtils.isEmpty(this.f133771a)) {
                String a = SearchCommonModuleDependency.m208732b().mo102888a(this.f133771a, str);
                Callback callback = this.f133772b;
                Object[] objArr = new Object[1];
                if (a != null) {
                    str = a;
                }
                objArr[0] = str;
                callback.invoke(objArr);
                return;
            }
            this.f133772b.invoke(str);
        }
    }

    @LynxMethod
    public final void log(String str) {
        Log.m165379d("ASLynxBridge", str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ASLynxBridge(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @LynxMethod
    public final String encrypt(String str) {
        if (str == null) {
            return "";
        }
        String c = C57859q.m224567c(str);
        Intrinsics.checkExpressionValueIsNotNull(c, "EncryptUtils.getEncryptedText(content)");
        return c;
    }

    @LynxMethod
    public final void sendClickEvent(ReadableMap readableMap) {
        Log.m165379d("ASLynxBridge", "sendClickEvent");
        reportClick(convertReadableMapToJSON(readableMap));
    }

    public final JSONObject convertReadableMapToJSON(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Object convertObjectToJSONObject = convertObjectToJSONObject(readableMap);
        if (convertObjectToJSONObject != null) {
            return (JSONObject) convertObjectToJSONObject;
        }
        throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @LynxMethod
    public final void openProfile(String str) {
        Log.m165379d("ASLynxBridge", "openProfile");
        if (str != null) {
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            b.mo102891a(context, str);
        }
    }

    @LynxMethod
    public final void openSchema(String str) {
        Log.m165379d("ASLynxBridge", "openSchema");
        if (!TextUtils.isEmpty(str)) {
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            b.mo102910c(context, str);
        }
    }

    @LynxMethod
    public final void openSearch(String str) {
        Log.m165379d("ASLynxBridge", "openSearch");
        SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        b.mo102906b(context, str);
    }

    @LynxMethod
    public final void openSearchTab(String str) {
        Log.m165379d("ASLynxBridge", "openSearchTab");
        Activity a = ViewUtils.m224141a(this.mContext);
        if (str != null && a != null) {
            SearchCommonModuleDependency.m208732b().mo102889a(a, str);
        }
    }

    private final void reportClick(JSONObject jSONObject) {
        Object obj;
        if (this.mContext instanceof AbstractC26684l) {
            Context context = this.mContext;
            if (context != null) {
                LynxView f = ((AbstractC26684l) context).mo94682f();
                if (f != null) {
                    obj = f.getTag(R.id.lynx_view_click_listener);
                } else {
                    obj = null;
                }
                if (obj instanceof IReportListener) {
                    ((IReportListener) obj).mo101693a(jSONObject);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.behavior.LynxContext");
        }
    }

    @LynxMethod
    public final void cardActionPassThrough(String str) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "jsonString");
        try {
            if (this.mContext instanceof AbstractC26684l) {
                Context context = this.mContext;
                if (context != null) {
                    LynxView f = ((AbstractC26684l) context).mo94682f();
                    Object obj2 = null;
                    if (f != null) {
                        obj = f.getTag(R.id.lynx_view_client_callback);
                    } else {
                        obj = null;
                    }
                    if (obj instanceof IGetDataCallback) {
                        obj2 = obj;
                    }
                    IGetDataCallback iGetDataCallback = (IGetDataCallback) obj2;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.behavior.LynxContext");
            }
        } catch (Exception unused) {
        }
    }

    @LynxMethod
    public final String getStringByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        Resources resources = context.getResources();
        Context context2 = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        int identifier = resources.getIdentifier(str, "string", context2.getPackageName());
        if (identifier == 0) {
            return "";
        }
        String string = this.mContext.getString(identifier);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(resId)");
        return string;
    }

    private final Object convertObjectToJSONObject(Object obj) {
        if (obj instanceof ReadableMap) {
            HashMap<String, Object> hashMap = ((ReadableMap) obj).toHashMap();
            JSONObject jSONObject = new JSONObject();
            if (hashMap != null) {
                Set<Map.Entry<String, Object>> entrySet = hashMap.entrySet();
                Intrinsics.checkExpressionValueIsNotNull(entrySet, "map.entries");
                for (Map.Entry<String, Object> entry : entrySet) {
                    try {
                        jSONObject.put(entry.getKey(), convertObjectToJSONObject(entry.getValue()));
                    } catch (JSONException e) {
                        Log.m165384e("ASLynxBridge", "convertError", e);
                    }
                }
            }
            return jSONObject;
        } else if (!(obj instanceof ReadableArray)) {
            return obj;
        } else {
            ArrayList<Object> arrayList = ((ReadableArray) obj).toArrayList();
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(convertObjectToJSONObject(arrayList.get(i)));
                }
            }
            return jSONArray;
        }
    }

    @LynxMethod
    public final void openDial(String str, String str2) {
        Log.m165379d("ASLynxBridge", "openDial");
        if (str2 != null) {
            SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            b.mo102893a(context, str, str2);
        }
    }

    @LynxMethod
    public final void openLocation(double d, double d2) {
        Log.m165379d("ASLynxBridge", "openLocation");
        SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        b.mo102890a(context, d, d2);
    }

    @LynxMethod
    public final void cardAction(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "cardId");
        Log.m165379d("ASLynxBridge", "cardAction " + i);
        SearchCommonModuleDependency.m208732b().mo102911c(str, i);
    }

    @LynxMethod
    public final void getAvatarUrl(String str, Callback callback) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        Log.m165379d("ASLynxBridge", "getAvatarUrl, resKey={" + str + '}');
        C57865c.m224576a(new RunnableC54031c(str, callback));
    }

    @LynxMethod
    public final void seeMoreDefinitions(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "abbrName");
        Intrinsics.checkParameterIsNotNull(str2, "jsonArray");
        Log.m165379d("ASLynxBridge", "seeMoreDefinitions " + str2);
        SearchCommonModuleDependency.ISearchCommonModuleDependency b = SearchCommonModuleDependency.m208732b();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        b.mo102907b(context, str, str2);
    }

    @LynxMethod
    public final void sendEvent(String str, ReadableMap readableMap) {
        Log.m165379d("ASLynxBridge", "sendEvent, eventName={" + str + '}');
        C57865c.m224576a(new RunnableC54032d(this, str, readableMap));
    }
}
