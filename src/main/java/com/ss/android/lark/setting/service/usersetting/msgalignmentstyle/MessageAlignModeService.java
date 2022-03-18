package com.ss.android.lark.setting.service.usersetting.msgalignmentstyle;

import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/MessageAlignModeService;", "Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/IMsgAlignModeService;", "()V", "KEY_FG_MESSAGE_ALIGN_ENABLE", "", "KEY_FG_MESSAGE_DEFAULT_ALIGN_LEFT", "KEY_MSG_ALIGN_MODE", "TAG", "defaultAlignMode", "Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "getDefaultAlignMode", "()Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "defaultAlignMode$delegate", "Lkotlin/Lazy;", "featureGatingDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "getFeatureGatingDependency", "()Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "featureGatingDependency$delegate", "isEnableSettingMessageAlignment", "", "()Z", "isEnableSettingMessageAlignment$delegate", "getCurrentAlignMode", "setAlignMode", "", "mode", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.a */
public final class MessageAlignModeService {

    /* renamed from: a */
    public static final MessageAlignModeService f135136a = new MessageAlignModeService();

    /* renamed from: b */
    private static final Lazy f135137b = LazyKt.lazy(C54711b.INSTANCE);

    /* renamed from: c */
    private static final Lazy f135138c = LazyKt.lazy(C54712c.INSTANCE);

    /* renamed from: d */
    private static final Lazy f135139d = LazyKt.lazy(C54710a.INSTANCE);

    /* renamed from: d */
    private final AlignMode m212316d() {
        return (AlignMode) f135139d.getValue();
    }

    /* renamed from: a */
    public final ISettingDependency.IFeatureGatingDependency mo186838a() {
        return (ISettingDependency.IFeatureGatingDependency) f135137b.getValue();
    }

    /* renamed from: b */
    public final boolean mo186840b() {
        return ((Boolean) f135138c.getValue()).booleanValue();
    }

    private MessageAlignModeService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IFeatureGatingDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.a$b */
    static final class C54711b extends Lambda implements Function0<ISettingDependency.IFeatureGatingDependency> {
        public static final C54711b INSTANCE = new C54711b();

        C54711b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ISettingDependency.IFeatureGatingDependency invoke() {
            return C54115c.m210080a().mo178291e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/service/usersetting/msgalignmentstyle/AlignMode;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.a$a */
    static final class C54710a extends Lambda implements Function0<AlignMode> {
        public static final C54710a INSTANCE = new C54710a();

        C54710a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AlignMode invoke() {
            if (MessageAlignModeService.f135136a.mo186838a().mo178337a("messenger.message_bubble_align_left")) {
                return AlignMode.AlignLeft;
            }
            return AlignMode.AlignLeftAndRight;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.a$c */
    static final class C54712c extends Lambda implements Function0<Boolean> {
        public static final C54712c INSTANCE = new C54712c();

        C54712c() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return MessageAlignModeService.f135136a.mo186838a().mo178337a("messenger.message_settings_bubble_alignment");
        }
    }

    /* renamed from: c */
    public AlignMode mo186841c() {
        if (!mo186840b()) {
            return AlignMode.AlignLeft;
        }
        return AlignMode.Companion.mo186837a(C57744a.m224104a().getInt("MESSAGE_BUBBLE_ALIGNMENT", m212316d().getValue()));
    }

    /* renamed from: a */
    public void mo186839a(AlignMode alignMode) {
        Intrinsics.checkParameterIsNotNull(alignMode, "mode");
        C57744a.m224104a().putInt("MESSAGE_BUBBLE_ALIGNMENT", alignMode.getValue());
    }
}
