package com.ss.android.lark.larkconfig.larksetting.handler.magic;

import android.text.TextUtils;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "getSettingKey", "", "getTag", "getUgMagicConfig", "Companion", "SingletonHolder", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.i.a */
public final class UGMagicConfigEventFilterHandler extends AbstractBaseSettingHandler {

    /* renamed from: a */
    public static String f104978a;

    /* renamed from: c */
    public static final Companion f104979c = new Companion(null);

    @JvmStatic
    /* renamed from: e */
    public static final UGMagicConfigEventFilterHandler m163423e() {
        return f104979c.mo148497a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "ug_magic_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "UGMagicConfigEventFilterHandler";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler$Companion;", "", "()V", "SETTING_KEY", "", "TAG", "ugMagicConfig", "getInstance", "Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler;", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.i.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final UGMagicConfigEventFilterHandler mo148497a() {
            return SingletonHolder.f104980a.mo148498a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler;", "getInstance", "()Lcom/ss/android/lark/larkconfig/larksetting/handler/magic/UGMagicConfigEventFilterHandler;", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.i.a$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f104980a = new SingletonHolder();

        /* renamed from: b */
        private static final UGMagicConfigEventFilterHandler f104981b = new UGMagicConfigEventFilterHandler();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final UGMagicConfigEventFilterHandler mo148498a() {
            return f104981b;
        }
    }

    /* renamed from: d */
    public final String mo136183d() {
        String str = f104978a;
        if (str == null) {
            str = mo148410h();
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public UGMagicConfigEventFilterHandler() {
        mo148402a(mo148412j().mo148421a(C411991.INSTANCE).mo148428e(new Function0<Unit>(this) {
            /* class com.ss.android.lark.larkconfig.larksetting.handler.magic.UGMagicConfigEventFilterHandler.C412002 */
            final /* synthetic */ UGMagicConfigEventFilterHandler this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                if (!TextUtils.isEmpty(this.this$0.mo148410h())) {
                    Log.m165379d("UGMagicConfigEventFilterHandler", "UGMagicConfig from local value: " + this.this$0.mo148410h());
                    UGMagicConfigEventFilterHandler.f104978a = this.this$0.mo148410h();
                }
            }
        }));
    }
}
