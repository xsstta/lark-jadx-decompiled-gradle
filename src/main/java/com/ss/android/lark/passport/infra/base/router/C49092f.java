package com.ss.android.lark.passport.infra.base.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.ClearPageStackStartPointActivity;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IRouterActionFindService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.infra.base.router.f */
public class C49092f {

    /* renamed from: a */
    public static String f123293a;

    /* renamed from: b */
    private static volatile boolean f123294b;

    /* renamed from: c */
    private static final C49087a f123295c;

    /* renamed from: b */
    public static void m193535b() {
        f123294b = true;
    }

    /* renamed from: c */
    public static void m193536c() {
        f123294b = false;
    }

    /* renamed from: a */
    public static C49087a m193521a() {
        return f123295c;
    }

    /* renamed from: d */
    public static boolean m193537d() {
        return f123294b;
    }

    /* renamed from: a */
    public static boolean m193533a(String str, int i, UniContext uniContext) {
        return f123295c.mo171378a(str, i, uniContext);
    }

    /* renamed from: a */
    public static boolean m193531a(Context context, String str, JSONObject jSONObject, int i, PassportLog passportLog, AbstractC49336a aVar) {
        return f123295c.mo171377a(context, str, jSONObject, i, (UniContext) null, passportLog, aVar);
    }

    /* renamed from: a */
    public static boolean m193532a(Context context, String str, JSONObject jSONObject, int i, UniContext uniContext, PassportLog passportLog, AbstractC49336a aVar) {
        return f123295c.mo171377a(context, str, jSONObject, i, uniContext, passportLog, aVar);
    }

    static {
        IRouterActionFindService lVar = (IRouterActionFindService) ServiceFinder.m193746a(IRouterActionFindService.class);
        if (lVar != null) {
            f123295c = new C49087a(lVar.getTotalPageRouterAction(), lVar.getTotalNormalRouterAction());
        } else {
            f123295c = new C49087a(new C49095h(), new C49094g());
        }
    }

    /* renamed from: b */
    public static String m193534b(Activity activity) {
        return f123295c.mo171373a(activity);
    }

    /* renamed from: a */
    public static void m193522a(Activity activity) {
        activity.startActivity(new Intent(activity, ClearPageStackStartPointActivity.class));
        activity.overridePendingTransition(0, 0);
    }

    /* renamed from: com.ss.android.lark.passport.infra.base.router.f$a */
    static class C49093a implements AbstractC49336a {

        /* renamed from: a */
        private final AbstractC49336a f123296a;

        /* renamed from: b */
        private final UniContext f123297b;

        /* renamed from: c */
        private final PassportLog f123298c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m193538a(int i, Object obj) {
            this.f123296a.onRouterResult(i, obj);
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
        public void onRouterResult(int i, Object obj) {
            String str;
            if (this.f123296a != null) {
                C49148ac.m193806a(new Runnable(i, obj) {
                    /* class com.ss.android.lark.passport.infra.base.router.$$Lambda$f$a$ZoakZ7W2COimunWP0Fcj89wuz4c */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ Object f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C49092f.C49093a.this.m193538a(this.f$1, this.f$2);
                    }
                });
            }
            if (i == -100 && (obj instanceof String)) {
                C49092f.f123293a = (String) obj;
            }
            PassportLog passportLog = this.f123298c;
            StringBuilder sb = new StringBuilder();
            sb.append("onRouterResult, code: ");
            sb.append(i);
            sb.append(", data: ");
            if (obj == null) {
                str = "null";
            } else {
                str = obj.toString();
            }
            sb.append(str);
            passportLog.mo171465b("Router", sb.toString());
        }

        public C49093a(AbstractC49336a aVar, UniContext uniContext, PassportLog passportLog) {
            this.f123296a = aVar;
            this.f123297b = uniContext;
            this.f123298c = passportLog == null ? PassportLog.f123351c.mo171474a() : passportLog;
        }
    }

    /* renamed from: a */
    public static void m193525a(Object obj, Intent intent) {
        String str;
        Class<?> cls = obj.getClass();
        Map map = (Map) intent.getSerializableExtra("step_info");
        if (map != null) {
            JSONObject jSONObject = new JSONObject(map);
            while (cls != null && cls != BaseActivity.class) {
                try {
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (Field field : declaredFields) {
                        RouterFieldAnno routerFieldAnno = (RouterFieldAnno) field.getAnnotation(RouterFieldAnno.class);
                        if (routerFieldAnno != null) {
                            str = routerFieldAnno.name();
                        } else {
                            str = null;
                        }
                        m193526a(obj, field, str, jSONObject);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cls = cls.getSuperclass();
            }
        }
    }

    /* renamed from: a */
    public static void m193524a(Class<? extends Activity> cls, int i, int... iArr) {
        f123295c.mo171375a(cls, i, iArr);
    }

    /* renamed from: a */
    static void m193526a(Object obj, Field field, String str, JSONObject jSONObject) throws Exception {
        if (str != null) {
            Class<?> type = field.getType();
            field.setAccessible(true);
            if (TextUtils.isEmpty(str)) {
                field.set(obj, C49202p.m193967a(jSONObject, type));
            } else if (jSONObject.containsKey(str)) {
                if (type == Short.TYPE) {
                    field.setShort(obj, jSONObject.getShortValue(str));
                } else if (type == Short.class) {
                    field.set(obj, jSONObject.getShort(str));
                } else if (type == Integer.TYPE) {
                    field.setInt(obj, jSONObject.getIntValue(str));
                } else if (type == Integer.class) {
                    field.set(obj, jSONObject.getInteger(str));
                } else if (type == Long.TYPE) {
                    field.setLong(obj, jSONObject.getLongValue(str));
                } else if (type == Long.class) {
                    field.set(obj, jSONObject.getLong(str));
                } else if (type == Float.TYPE) {
                    field.setFloat(obj, jSONObject.getFloatValue(str));
                } else if (type == Float.class) {
                    field.set(obj, jSONObject.getFloat(str));
                } else if (type == Double.TYPE) {
                    field.setDouble(obj, jSONObject.getDoubleValue(str));
                } else if (type == Double.class) {
                    field.set(obj, jSONObject.getDouble(str));
                } else if (type == Boolean.TYPE) {
                    field.setBoolean(obj, jSONObject.getBooleanValue(str));
                } else if (type == Boolean.class) {
                    field.set(obj, jSONObject.getBoolean(str));
                } else if (type == String.class) {
                    field.set(obj, jSONObject.getString(str));
                } else {
                    field.set(obj, C49202p.m193967a(jSONObject.getJSONObject(str), type));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m193528a(Context context, BaseStepData baseStepData, int i, UniContext uniContext) {
        m193530a(context, baseStepData, i, uniContext, ClearPageStackStartPointActivity.class);
        return true;
    }

    /* renamed from: a */
    public static boolean m193527a(Context context, BaseStepData baseStepData, int i, PassportLog passportLog, AbstractC49336a aVar) {
        return f123295c.mo171376a(context, baseStepData, i, null, passportLog, aVar);
    }

    /* renamed from: a */
    public static boolean m193530a(Context context, BaseStepData baseStepData, int i, UniContext uniContext, Class cls) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("step_info", baseStepData.stepInfo);
        intent.putExtra("next_step", baseStepData.nextStep);
        intent.putExtra("step_scene", i);
        intent.putExtra("key_of_uni_context", uniContext);
        intent.addFlags(65536);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.startActivityForResult(intent, 0);
            activity.overridePendingTransition(0, 0);
            return true;
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m193529a(Context context, BaseStepData baseStepData, int i, UniContext uniContext, PassportLog passportLog, AbstractC49336a aVar) {
        return f123295c.mo171376a(context, baseStepData, i, uniContext, passportLog, aVar);
    }

    /* renamed from: a */
    public static void m193523a(Activity activity, int i, String str, JSONObject jSONObject, int i2, UniContext uniContext, PassportLog passportLog) {
        f123295c.mo171374a(activity, i, str, jSONObject, i2, uniContext, passportLog);
    }
}
