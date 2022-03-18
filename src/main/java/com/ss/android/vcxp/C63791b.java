package com.ss.android.vcxp;

import android.content.Context;
import android.os.MemoryFile;
import com.bytedance.apm.ApmAgent;
import com.google.gson.TypeAdapter;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dto.BaseSearchInfo;
import com.ss.android.vc.meeting.p3102a.C61208a;
import com.ss.android.vc.meeting.p3102a.C61209b;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.p3186c.C63803b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.ss.android.vcxp.b */
public class C63791b {

    /* renamed from: a */
    public static Method f160976a;

    /* renamed from: b */
    public static AbstractC63793a f160977b = C63794b.m250479a();

    /* renamed from: c */
    private static Field f160978c;

    /* renamed from: d */
    private static Field f160979d;

    /* renamed from: e */
    private static Boolean f160980e = false;

    /* renamed from: com.ss.android.vcxp.b$a */
    public interface AbstractC63793a {
        /* renamed from: a */
        void mo220430a(String str, String str2, String str3, long j, boolean z);

        /* renamed from: a */
        void mo220431a(String str, String str2, String str3, String str4, boolean z);

        /* renamed from: a */
        void mo220432a(String str, String str2, Throwable th, boolean z);
    }

    /* renamed from: com.ss.android.vcxp.b$b */
    public static class C63794b implements AbstractC63793a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vcxp.b$b$a */
        public static class C63795a {

            /* renamed from: a */
            public static final C63794b f160981a = new C63794b();
        }

        private C63794b() {
        }

        /* renamed from: a */
        public static C63794b m250479a() {
            return C63795a.f160981a;
        }

        /* renamed from: a */
        public void mo220433a(String str, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_multi_process", C63791b.m250468b());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", System.currentTimeMillis() - j);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("process_name", str);
                ApmAgent.monitorEvent("vc_xp_init", jSONObject, jSONObject2, jSONObject3);
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.vcxp.C63791b.AbstractC63793a
        /* renamed from: a */
        public void mo220432a(String str, String str2, Throwable th, boolean z) {
            C60700b.m235865g("XDependency", "[XMonitor.onException]", str + ":" + str2 + ":" + th.toString());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("where", str2);
                jSONObject.put("is_on_ui_thread", z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("process_name", str);
                jSONObject2.put("message", th.getMessage());
                ApmAgent.monitorEvent("vc_xp_exception", jSONObject, null, jSONObject2);
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.vcxp.C63791b.AbstractC63793a
        /* renamed from: a */
        public void mo220430a(String str, String str2, String str3, long j, boolean z) {
            if (j > 1000) {
                C60700b.m235854c("XDependency", "[XMonitor.onSuccess]", z + ":" + str + ":" + j + ":" + str2 + "." + str3);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("level", (j / 1000) + 1);
                jSONObject.put("is_on_ui_thread", z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("process_name", str);
                jSONObject3.put("class_name", str2);
                jSONObject3.put("method_name", str3);
                ApmAgent.monitorEvent("vc_xp_success", jSONObject, jSONObject2, jSONObject3);
            } catch (Exception unused) {
            }
        }

        @Override // com.ss.android.vcxp.C63791b.AbstractC63793a
        /* renamed from: a */
        public void mo220431a(String str, String str2, String str3, String str4, boolean z) {
            C60700b.m235854c("XDependency", "[XMonitor.onFail]", z + ":" + str + ":" + str4 + ":" + str2 + "." + str3);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_on_ui_thread", z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("process_name", str);
                jSONObject2.put("class_name", str2);
                jSONObject2.put("method_name", str3);
                jSONObject2.put("message", str4);
                ApmAgent.monitorEvent("vc_xp_fail", jSONObject, null, jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static AbstractC63793a m250465a() {
        return f160977b;
    }

    /* renamed from: e */
    public static Class m250471e() {
        return Message.class;
    }

    /* renamed from: h */
    public static Object m250474h() {
        return ByteString.EMPTY;
    }

    /* renamed from: d */
    public static Context m250470d() {
        return LarkContext.getApplication();
    }

    static {
        try {
            f160976a = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static HashMap<Class, TypeAdapter> m250475i() {
        HashMap<Class, TypeAdapter> hashMap = new HashMap<>();
        hashMap.put(BaseSearchInfo.class, C61208a.f153282a);
        hashMap.put(RichTextElement.RichTextProperty.class, C61209b.f153283a);
        return hashMap;
    }

    /* renamed from: f */
    public static Field m250472f() {
        if (f160978c == null) {
            Field[] declaredFields = Message.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field = declaredFields[i];
                if (field.getType().equals(ProtoAdapter.class)) {
                    f160978c = field;
                    field.setAccessible(true);
                    break;
                }
                i++;
            }
        }
        return f160978c;
    }

    /* renamed from: g */
    public static Field m250473g() {
        if (f160979d == null) {
            Field[] declaredFields = Message.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field = declaredFields[i];
                if (field.getType().equals(ByteString.class)) {
                    f160979d = field;
                    field.setAccessible(true);
                    break;
                }
                i++;
            }
        }
        return f160979d;
    }

    /* renamed from: b */
    public static boolean m250468b() {
        Boolean bool;
        if (f160980e == null) {
            synchronized (C63791b.class) {
                if (f160980e == null) {
                    if (f160976a == null) {
                        f160980e = false;
                        C60700b.m235854c("XDependency", "[isEnabled]", "getFileDescriptor=null");
                    } else {
                        Boolean a = C63808e.m250518a();
                        Boolean a2 = m250466a(m250470d());
                        if (a != null) {
                            bool = a;
                        } else {
                            bool = a2;
                        }
                        f160980e = bool;
                        C60700b.m235854c("XDependency", "[isEnabled2]", "runningEnabled=" + a + ",configEnabled=" + a2);
                        C63808e.m250520a(f160980e);
                    }
                }
            }
        }
        return f160980e.booleanValue();
    }

    /* renamed from: c */
    public static void m250469c() {
        synchronized (C63791b.class) {
            C60700b.m235854c("XDependency", "[setEnabled]", "current isEnabled=" + f160980e);
            Boolean bool = f160980e;
            if (bool == null || !bool.booleanValue()) {
                C63808e.m250520a((Boolean) true);
                f160980e = true;
                if (XProcess.Main.value().equals(C63803b.m250505a(LarkContext.getApplication()))) {
                    C63808e.f161019a = true;
                }
                try {
                    Class<?> cls = Class.forName("com.ss.android.lark.app.task.InitVideoChatTask");
                    Method[] methods = cls.getMethods();
                    for (Method method : methods) {
                        int modifiers = method.getModifiers();
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (modifiers == 1 && parameterTypes.length == 1 && Context.class.equals(parameterTypes[0])) {
                            method.invoke(cls.newInstance(), LarkContext.getApplication());
                            C60700b.m235854c("XDependency", "[setEnabled2]", "init success");
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C60700b.m235854c("XDependency", "[setEnabled3]", "init failed");
                C63808e.m250520a((Boolean) false);
                f160980e = false;
            }
        }
    }

    /* renamed from: a */
    public static Boolean m250466a(Context context) {
        return Boolean.valueOf(context.getSharedPreferences("vc", 0).getBoolean("XConfig.isEnabled", false));
    }

    /* renamed from: a */
    public static void m250467a(Context context, Boolean bool) {
        context.getSharedPreferences("vc", 0).edit().putBoolean("XConfig.isEnabled", bool.booleanValue()).commit();
    }
}
