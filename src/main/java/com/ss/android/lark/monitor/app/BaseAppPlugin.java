package com.ss.android.lark.monitor.app;

import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/monitor/app/BaseAppPlugin;", "Lcom/ss/android/lark/monitor/app/IAppPlugin;", "()V", "monitorEvent", "", "eventName", "", "values", "Lorg/json/JSONObject;", "parseLines", "content", "parseValues", "report", "Companion", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.monitor.app.b */
public abstract class BaseAppPlugin implements IAppPlugin {

    /* renamed from: a */
    public static final Companion f121362a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/monitor/app/BaseAppPlugin$Companion;", "", "()V", "PARAM_KEY_ARRAY_DATA", "", "TAG", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.b$c */
    static final class RunnableC48220c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseAppPlugin f121366a;

        /* renamed from: b */
        final /* synthetic */ String f121367b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f121368c;

        RunnableC48220c(BaseAppPlugin bVar, String str, JSONObject jSONObject) {
            this.f121366a = bVar;
            this.f121367b = str;
            this.f121368c = jSONObject;
        }

        public final void run() {
            this.f121366a.mo168730b(this.f121367b, this.f121368c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.monitor.app.b$b */
    static final class RunnableC48219b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseAppPlugin f121363a;

        /* renamed from: b */
        final /* synthetic */ JSONArray f121364b;

        /* renamed from: c */
        final /* synthetic */ String f121365c;

        RunnableC48219b(BaseAppPlugin bVar, JSONArray jSONArray, String str) {
            this.f121363a = bVar;
            this.f121364b = jSONArray;
            this.f121365c = str;
        }

        public final void run() {
            int length = this.f121364b.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = this.f121364b.optJSONObject(i);
                BaseAppPlugin bVar = this.f121363a;
                String str = this.f121365c;
                Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "jsonObject");
                bVar.mo168730b(str, optJSONObject);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo168727a(String str) {
        JSONObject jSONObject = new JSONObject();
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return jSONObject;
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        JSONArray jSONArray = new JSONArray();
        List split$default = StringsKt.split$default((CharSequence) str2, new String[]{"||"}, false, 0, 6, (Object) null);
        if (split$default != null) {
            Object[] array = split$default.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                for (String str3 : strArr) {
                    if (!TextUtils.isEmpty(str3)) {
                        jSONArray.put(mo168729b(str3));
                    }
                }
                try {
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    /* renamed from: b */
    public final JSONObject mo168729b(String str) {
        JSONObject jSONObject = new JSONObject();
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return jSONObject;
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        List split$default = StringsKt.split$default((CharSequence) str2, new String[]{";"}, false, 0, 6, (Object) null);
        if (split$default != null) {
            Object[] array = split$default.toArray(new String[0]);
            if (array != null) {
                for (String str3 : (String[]) array) {
                    List split$default2 = StringsKt.split$default((CharSequence) str3, new String[]{":"}, false, 0, 6, (Object) null);
                    if (split$default2 != null) {
                        Object[] array2 = split$default2.toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr = (String[]) array2;
                            if (strArr != null && strArr.length == 2) {
                                try {
                                    jSONObject.put(strArr[0], strArr[1]);
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                    }
                }
                return jSONObject;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    /* renamed from: b */
    public final void mo168730b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        if (jSONObject.has("metric") || jSONObject.has("category") || jSONObject.has("extra")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("metric");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("category");
            jSONObject2 = jSONObject.optJSONObject("extra");
            jSONObject = optJSONObject;
            jSONObject3 = optJSONObject2;
        } else {
            jSONObject2 = jSONObject3;
        }
        ApmAgent.monitorEvent(str, jSONObject3, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo168728a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.names() == null) {
            Log.m165397w("BaseAppPlugin", "report values is null");
            return;
        }
        if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (jSONArray != null) {
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getCachedThreadPool().execute(new RunnableC48219b(this, jSONArray, str));
            } else {
                return;
            }
        } else {
            CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
            coreThreadPool2.getCachedThreadPool().execute(new RunnableC48220c(this, str, jSONObject));
        }
        Log.m165379d("BaseAppPlugin", "start reportToSlardar:" + str);
    }
}
