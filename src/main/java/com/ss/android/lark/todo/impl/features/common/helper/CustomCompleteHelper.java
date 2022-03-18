package com.ss.android.lark.todo.impl.features.common.helper;

import android.content.Context;
import com.bytedance.lark.pb.todo.v1.CustomComplete;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56257l;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper;", "", "()V", "isTodoCustomComplete", "", "languageDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "getLanguageDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "languageDependency$delegate", "Lkotlin/Lazy;", "getStringFromTip", "", "tip", "", "isCustomComplete", "completeAction", "Lcom/bytedance/lark/pb/todo/v1/CustomComplete$Action;", "isCustomCompleteStrategy", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "ITipShowListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.helper.a */
public final class CustomCompleteHelper {

    /* renamed from: a */
    public static final CustomCompleteHelper f139396a = new CustomCompleteHelper();

    /* renamed from: b */
    private static final Lazy f139397b = LazyKt.lazy(C56332b.INSTANCE);

    /* renamed from: c */
    private static final boolean f139398c = TodoDependencyHolder.f139242a.mo191731b().mo191937j();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/CustomCompleteHelper$ITipShowListener;", "", "showTipToast", "", "tipsStr", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.a$a */
    public interface ITipShowListener {
        /* renamed from: a */
        void mo191923a(String str);
    }

    /* renamed from: a */
    private final AbstractC56257l m219784a() {
        return (AbstractC56257l) f139397b.getValue();
    }

    private CustomCompleteHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ILanguageDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.common.helper.a$b */
    static final class C56332b extends Lambda implements Function0<AbstractC56257l> {
        public static final C56332b INSTANCE = new C56332b();

        C56332b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC56257l invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().languageDependency();
        }
    }

    /* renamed from: a */
    public final boolean mo191998a(CustomComplete.Action action) {
        boolean z;
        if (action == null) {
            return false;
        }
        String str = action.href;
        Intrinsics.checkExpressionValueIsNotNull(str, "completeAction.href");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Map<String, String> map = action.tip;
            Intrinsics.checkExpressionValueIsNotNull(map, "completeAction.tip");
            if (!map.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final String m219785a(Map<String, String> map) {
        String str;
        boolean z;
        String str2;
        if (m219784a().mo145394a()) {
            str = map.get("zh_cn");
        } else if (m219784a().mo145395b()) {
            str = map.get("en_us");
        } else if (m219784a().mo145396c()) {
            str = map.get("ja_jp");
        } else if (m219784a().mo145397d()) {
            str = map.get("es_es");
        } else if (m219784a().mo145398e()) {
            str = map.get("it_it");
        } else if (m219784a().mo145399f()) {
            str = map.get("de_de");
        } else if (m219784a().mo145400g()) {
            str = map.get("fr_fr");
        } else if (m219784a().mo145401h()) {
            str = map.get("pt_br");
        } else if (m219784a().mo145402i()) {
            str = map.get("id_id");
        } else if (m219784a().mo145403j()) {
            str = map.get("id_id");
        } else if (m219784a().mo145404k()) {
            str = map.get("vi_vn");
        } else if (m219784a().mo145405l()) {
            str = map.get("th_th");
        } else if (m219784a().mo145406m()) {
            str = map.get("ko_kr");
        } else if (m219784a().mo145407n()) {
            str = map.get("ru_ru");
        } else if (m219784a().mo145408o()) {
            str = map.get("hi_in");
        } else if (m219784a().mo145409p()) {
            str = map.get("zh_hk");
        } else if (m219784a().mo145410q()) {
            str = map.get("zh_tw");
        } else {
            str = map.get("en_us");
        }
        String str3 = str;
        boolean z2 = true;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        String str4 = (String) new ArrayList(map.keySet()).get(0);
        String str5 = map.get("en_us");
        if (!(str5 == null || str5.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            str2 = map.get(str4);
        } else {
            str2 = map.get("en_us");
        }
        String str6 = str2;
        if (str6 != null) {
            return str6;
        }
        return "";
    }

    /* renamed from: a */
    public final boolean mo191997a(Context context, CustomComplete.Action action, ITipShowListener aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(action, "completeAction");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        if (!f139398c) {
            return false;
        }
        String str = action.href;
        Intrinsics.checkExpressionValueIsNotNull(str, "completeAction.href");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(context, action.href);
            return true;
        }
        Map<String, String> map = action.tip;
        Intrinsics.checkExpressionValueIsNotNull(map, "completeAction.tip");
        if (!(!map.isEmpty())) {
            return false;
        }
        Map<String, String> map2 = action.tip;
        Intrinsics.checkExpressionValueIsNotNull(map2, "completeAction.tip");
        aVar.mo191923a(m219785a(map2));
        return true;
    }
}
