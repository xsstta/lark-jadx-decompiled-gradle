package com.ss.android.lark.guide.biz.onboarding.res;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/BasResGetter;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IResGetter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/guide/biz/onboarding/res/IRes;", "Lkotlin/collections/ArrayList;", "getResList", "()Ljava/util/ArrayList;", "getString", "", "id", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.b */
public abstract class BasResGetter implements IResGetter {

    /* renamed from: a */
    private final ArrayList<IRes> f99158a;

    /* renamed from: b */
    private final Context f99159b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ArrayList<IRes> mo141353a() {
        return this.f99158a;
    }

    public BasResGetter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f99159b = context;
        ArrayList<IRes> arrayList = new ArrayList<>();
        this.f99158a = arrayList;
        arrayList.add(new LocalRes());
        arrayList.add(new SettingsTccRes(context));
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.IResGetter
    /* renamed from: a */
    public String mo141352a(int i) {
        boolean z;
        for (int size = this.f99158a.size() - 1; size >= 0; size--) {
            String a = this.f99158a.get(size).mo141350a(this.f99159b, i);
            if (a != null) {
                if (a.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    a = null;
                }
                if (a != null) {
                    return a;
                }
            }
        }
        return "";
    }
}
