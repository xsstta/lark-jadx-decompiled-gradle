package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.guide.C38548a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/AbRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IRes;", "experimentConfigClazz", "Ljava/lang/Class;", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "(Ljava/lang/Class;)V", "resIdMap", "", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "enableExperimentValue", "", "getString", "context", "Landroid/content/Context;", "id", "initResIdMappingMap", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.a */
public abstract class AbRes implements IRes {

    /* renamed from: a */
    public static final Companion f99155a = new Companion(null);

    /* renamed from: b */
    private Map<Integer, Integer> f99156b;

    /* renamed from: c */
    private String f99157c = "v1";

    /* renamed from: a */
    public abstract Map<Integer, Integer> mo141351a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/AbRes$Companion;", "", "()V", "VERSION_DEFAULT", "", "VERSION_EXPERIMENT", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.res.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final boolean m152203c() {
        return Intrinsics.areEqual(this.f99157c, "v2");
    }

    public AbRes(Class<? extends AbstractC28490a<?>> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "experimentConfigClazz");
        try {
            String str = (String) C38548a.m152027a().mo141245a((Class<? extends AbstractC28490a>) cls, true);
            if (str != null) {
                String optString = new JSONObject(str).optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "v1");
                Intrinsics.checkExpressionValueIsNotNull(optString, "JSONObject(it).optString…ersion\", VERSION_DEFAULT)");
                this.f99157c = optString;
            }
        } catch (Exception e) {
            ResLogUtils pVar = ResLogUtils.f99169a;
            String b = mo141361b();
            pVar.mo141372a(b, "get ab version error, clazz=" + cls.getName(), e);
        }
        if (this.f99156b == null) {
            this.f99156b = mo141351a();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: a */
    public String mo141350a(Context context, int i) {
        Map<Integer, Integer> map;
        Integer num;
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!m152203c() || (map = this.f99156b) == null || (num = map.get(Integer.valueOf(i))) == null) {
            return null;
        }
        boolean z2 = true;
        if (num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        try {
            String string = context.getString(intValue);
            Intrinsics.checkExpressionValueIsNotNull(string, "it");
            if (string.length() <= 0) {
                z2 = false;
            }
            if (!z2) {
                string = null;
            }
            if (string == null) {
                return null;
            }
            ResLogUtils.f99169a.mo141369a(mo141361b(), "use ab resId", intValue, i);
            return string;
        } catch (Resources.NotFoundException e) {
            ResLogUtils.f99169a.mo141370a(mo141361b(), "resId not found", intValue, i, e);
            return null;
        }
    }
}
