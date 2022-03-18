package com.ss.android.lark.multitask;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.task.AbstractC48363a;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.DrawableIconFactory;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.multitask.task.RemoteTaskContainer;
import com.ss.android.lark.multitask.task.RemoteTaskSnapshot;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.multitask.task.TaskSnapshotStorage;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0002J\u0014\u0010\u001d\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/multitask/TaskSnapshotSharedPreferencesStorage;", "Lcom/ss/android/lark/multitask/task/TaskSnapshotStorage;", "()V", "SHARED_PREFERENCES_NAME", "", "TAG", "currentTenantId", "getCurrentTenantId", "()Ljava/lang/String;", "currentUserId", "getCurrentUserId", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "getSaveArgsMethod", "Ljava/lang/reflect/Method;", ActivityC23764o.f58839a, "", "readTaskSnapshots", "", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "removeTaskSnapshot", "", "taskSnapshot", "writeTaskSnapshot", "decodeTaskSnapshotsInCurrentTenant", "toJson", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.r */
public final class TaskSnapshotSharedPreferencesStorage implements TaskSnapshotStorage {

    /* renamed from: a */
    public static final TaskSnapshotSharedPreferencesStorage f121768a = new TaskSnapshotSharedPreferencesStorage();

    /* renamed from: b */
    private static final Lazy f121769b = LazyKt.lazy(C48349b.INSTANCE);

    /* renamed from: b */
    private final SharedPreferences m190707b() {
        return (SharedPreferences) f121769b.getValue();
    }

    private TaskSnapshotSharedPreferencesStorage() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.r$b */
    static final class C48349b extends Lambda implements Function0<SharedPreferences> {
        public static final C48349b INSTANCE = new C48349b();

        C48349b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C48335j.m190643a().mo168869a().getSharedPreferences("multitask_storage", 0);
        }
    }

    /* renamed from: c */
    private final String m190708c() {
        return C48335j.m190643a().mo168874e();
    }

    /* renamed from: d */
    private final String m190709d() {
        return C48335j.m190643a().mo168873d();
    }

    @Override // com.ss.android.lark.multitask.task.TaskSnapshotStorage
    /* renamed from: a */
    public List<C48376q> mo169089a() {
        List<C48376q> a;
        List<String> list = null;
        Set<String> stringSet = m190707b().getStringSet(m190708c(), null);
        if (stringSet != null) {
            list = CollectionsKt.toList(stringSet);
        }
        if (list == null || (a = m190706a(list)) == null) {
            return CollectionsKt.emptyList();
        }
        return a;
    }

    /* renamed from: a */
    private final Method m190705a(Object obj) {
        Method declaredMethod = obj.getClass().getDeclaredMethod("saveArgs", new Class[0]);
        Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "o.javaClass.getDeclaredMethod(\"saveArgs\")");
        return declaredMethod;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r0 != null) goto L_0x002e;
     */
    @Override // com.ss.android.lark.multitask.task.TaskSnapshotStorage
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo169090a(com.ss.android.lark.multitask.task.C48376q r4) {
        /*
            r3 = this;
            java.lang.String r0 = "taskSnapshot"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = r3.m190709d()
            java.lang.String r1 = r3.m190708c()
            java.lang.String r4 = r3.m190704a(r4, r0)
            android.content.SharedPreferences r0 = r3.m190707b()
            r2 = 0
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toMutableSet(r0)
            if (r0 == 0) goto L_0x002a
            r0.add(r4)
            if (r0 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            java.util.Set r0 = kotlin.collections.am.m265686a(r4)
        L_0x002e:
            android.content.SharedPreferences r4 = r3.m190707b()
            android.content.SharedPreferences$Editor r4 = r4.edit()
            android.content.SharedPreferences$Editor r4 = r4.putStringSet(r1, r0)
            r4.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.multitask.TaskSnapshotSharedPreferencesStorage.mo169090a(com.ss.android.lark.multitask.task.q):void");
    }

    @Override // com.ss.android.lark.multitask.task.TaskSnapshotStorage
    /* renamed from: b */
    public void mo169091b(C48376q qVar) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        String d = m190709d();
        String c = m190708c();
        List<String> list = null;
        Set<String> stringSet = m190707b().getStringSet(c, null);
        if (stringSet != null) {
            list = CollectionsKt.toList(stringSet);
        }
        if (list != null) {
            List<C48376q> a = m190706a(list);
            ArrayList arrayList = new ArrayList();
            for (T t : a) {
                if (!Intrinsics.areEqual(t.mo169241c(), qVar.mo169241c())) {
                    arrayList.add(f121768a.m190704a(t, d));
                }
            }
            m190707b().edit().putStringSet(c, CollectionsKt.toSet(arrayList)).apply();
        }
    }

    /* renamed from: a */
    private final List<C48376q> m190706a(List<String> list) {
        AbstractC48375n nVar;
        AbstractC48363a aVar;
        boolean z;
        DrawableIconFactory drawableIconFactory;
        RemoteTaskSnapshot remoteTaskSnapshot;
        String d = m190709d();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((JSONObject) obj).get("tenant_id"), d)) {
                arrayList2.add(obj);
            }
        }
        List<JSONObject> sortedWith = CollectionsKt.sortedWith(arrayList2, new C48348a());
        ArrayList arrayList3 = new ArrayList();
        for (JSONObject jSONObject : sortedWith) {
            try {
                boolean optBoolean = jSONObject.optBoolean("remote");
                if (optBoolean) {
                    nVar = new RemoteTaskContainer();
                } else {
                    nVar = GlobalTaskContainerImpl.f121803b;
                }
                AbstractC48375n nVar2 = nVar;
                JSONObject optJSONObject = jSONObject.optJSONObject("saved_state");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                Bundle a = C48281b.m190473a(optJSONObject);
                JSONObject jSONObject2 = jSONObject.getJSONObject("activity_starter");
                String string = jSONObject2.getString("starter_class");
                String string2 = jSONObject2.getString("activity_class");
                try {
                    Object newInstance = Class.forName(string).getDeclaredConstructor(String.class).newInstance(string2);
                    if (newInstance != null) {
                        aVar = (AbstractC48363a) newInstance;
                        String optString = jSONObject.optString("icon");
                        Intrinsics.checkExpressionValueIsNotNull(optString, "iconString");
                        if (optString.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            drawableIconFactory = new DrawableIconFactory(optString);
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("icon_factory");
                            String string3 = jSONObject3.getString("icon_factory_class");
                            String string4 = jSONObject3.getString("args");
                            Object newInstance2 = Class.forName(string3).getDeclaredConstructor(String.class).newInstance(string4);
                            if (newInstance2 != null) {
                                drawableIconFactory = (Task.IconFactory) newInstance2;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.Task.IconFactory");
                            }
                        }
                        long a2 = MultitaskHelper.f121712f.mo169052a().mo169233a();
                        String string5 = jSONObject.getString("identifier");
                        String string6 = jSONObject.getString(ShareHitPoint.f121869d);
                        String string7 = jSONObject.getString("title");
                        if (!optBoolean) {
                            remoteTaskSnapshot = new C48376q(a2, string5, string6, string7, drawableIconFactory, nVar2, aVar, a);
                        } else {
                            remoteTaskSnapshot = RemoteTaskSnapshot.m190748a(a2, string5, string6, string7, drawableIconFactory, nVar2, aVar, a);
                        }
                        Intrinsics.checkExpressionValueIsNotNull(remoteTaskSnapshot, "decodedTaskSnapshot");
                        arrayList3.add(remoteTaskSnapshot);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.AbsActivityTaskStarter");
                    }
                } catch (Exception unused) {
                    Object newInstance3 = Class.forName(string).getDeclaredConstructor(Class.class).newInstance(Class.forName(string2));
                    if (newInstance3 != null) {
                        aVar = (AbstractC48363a) newInstance3;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.AbsActivityTaskStarter");
                    }
                }
            } catch (Exception e) {
                Log.m165398w("Multitask-TaskSnapshotStorage", "decodeTaskSnapshotsInCurrentTenant " + jSONObject, e);
            }
        }
        return arrayList3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.r$a */
    public static final class C48348a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(t.optLong("add_time", 0)), Long.valueOf(t2.optLong("add_time", 0)));
        }
    }

    /* renamed from: a */
    private final String m190704a(C48376q qVar, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tenant_id", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("starter_class", qVar.mo169245f().getClass().getName());
        AbstractC48378t f = qVar.mo169245f();
        if (f != null) {
            jSONObject2.put("activity_class", ((AbstractC48363a) f).mo169204a());
            jSONObject.put("activity_starter", jSONObject2);
            if (qVar.mo169243e() instanceof DrawableIconFactory) {
                Task.IconFactory e = qVar.mo169243e();
                if (e != null) {
                    jSONObject.put("icon", ((DrawableIconFactory) e).getName());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.DrawableIconFactory");
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("icon_factory_class", qVar.mo169243e().getClass().getName());
                TaskSnapshotSharedPreferencesStorage rVar = f121768a;
                Task.IconFactory e2 = qVar.mo169243e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "iconFactory");
                jSONObject3.put("args", rVar.m190705a(e2).invoke(qVar.mo169243e(), new Object[0]));
                jSONObject.put("icon_factory", jSONObject3);
            }
            jSONObject.put("identifier", qVar.mo169241c());
            jSONObject.put(ShareHitPoint.f121869d, qVar.mo169242d());
            jSONObject.put("title", qVar.mo169239b());
            jSONObject.put("saved_state", C48281b.m190474a(qVar.mo169246g()));
            jSONObject.put("remote", qVar instanceof RemoteTaskSnapshot);
            jSONObject.put("add_time", System.currentTimeMillis());
            String jSONObject4 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "JSONObject().also {\n    …s())\n        }.toString()");
            return jSONObject4;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.task.AbsActivityTaskStarter");
    }
}
