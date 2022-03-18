package com.ss.android.lark.integrator.moments;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.integrator.moments.dependency.MomentsAccountModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsAvatarModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsBrowserModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsChatModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsCoreModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsDriveModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsDynamicConfigModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsForwardModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsImageModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsLanguageModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsMainModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsPassportSdkModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsPhoneModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsProfileModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsQRCodeModule;
import com.ss.android.lark.integrator.moments.dependency.MomentsWschannelModule;
import com.ss.android.lark.integrator.moments.p2043a.C39898h;
import com.ss.android.lark.moments.dependency.IMomentsDependency;
import com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IAvatarModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IBrowserModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.ICoreModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IDriveDependency;
import com.ss.android.lark.moments.dependency.idependency.IDynamicConfigModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IForwardDependency;
import com.ss.android.lark.moments.dependency.idependency.IImageDependency;
import com.ss.android.lark.moments.dependency.idependency.ILanguageModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IPhoneModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IQRCodeModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IWschannelModuleDependency;
import com.ss.android.lark.moments.p2337b.p2338a.AbstractC47178j;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@ClaymoreImpl(IMomentsDependency.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010Y\u001a\u00020\u0004H\u0016J\b\u0010Z\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u0010[\u001a\u000207H\u0016J\b\u0010\\\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010]\u001a\u00020PH\u0016J\b\u0010^\u001a\u00020UH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b.\u0010/R\u001b\u00101\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020A8BX\u0002¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bB\u0010CR\u001b\u0010E\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bG\u0010HR\u001b\u0010J\u001a\u00020K8BX\u0002¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bL\u0010MR\u001b\u0010O\u001a\u00020P8BX\u0002¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\bQ\u0010RR\u001b\u0010T\u001a\u00020U8BX\u0002¢\u0006\f\n\u0004\bX\u0010\b\u001a\u0004\bV\u0010W¨\u0006_"}, d2 = {"Lcom/ss/android/lark/integrator/moments/MomentsDependency;", "Lcom/ss/android/lark/moments/dependency/IMomentsDependency;", "()V", "accountModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IAccountModuleDependency;", "getAccountModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IAccountModuleDependency;", "accountModuleDependency$delegate", "Lkotlin/Lazy;", "avatarModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IAvatarModuleDependency;", "getAvatarModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IAvatarModuleDependency;", "avatarModuleDependency$delegate", "browserModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IBrowserModuleDependency;", "getBrowserModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IBrowserModuleDependency;", "browserModuleDependency$delegate", "chatModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency;", "getChatModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency;", "chatModuleDependency$delegate", "coreModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/ICoreModuleDependency;", "getCoreModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/ICoreModuleDependency;", "coreModuleDependency$delegate", "driveDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IDriveDependency;", "getDriveDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IDriveDependency;", "driveDependency$delegate", "dynamicDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IDynamicConfigModuleDependency;", "getDynamicDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IDynamicConfigModuleDependency;", "dynamicDependency$delegate", "featureGatingDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IFeatureGatingDependency;", "getFeatureGatingDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IFeatureGatingDependency;", "featureGatingDependency$delegate", "forwardDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IForwardDependency;", "getForwardDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IForwardDependency;", "forwardDependency$delegate", "imageDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IImageDependency;", "getImageDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IImageDependency;", "imageDependency$delegate", "languageModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/ILanguageModuleDependency;", "getLanguageModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/ILanguageModuleDependency;", "languageModuleDependency$delegate", "mainModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IMainModuleDependency;", "getMainModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IMainModuleDependency;", "mainModuleDependency$delegate", "passportSdkDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency;", "getPassportSdkDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency;", "passportSdkDependency$delegate", "phoneModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IPhoneModuleDependency;", "getPhoneModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IPhoneModuleDependency;", "phoneModuleDependency$delegate", "profileModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IProfileModuleDependency;", "getProfileModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IProfileModuleDependency;", "profileModuleDependency$delegate", "qrCodeModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IQRCodeModuleDependency;", "getQrCodeModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IQRCodeModuleDependency;", "qrCodeModuleDependency$delegate", "wschannelModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IWschannelModuleDependency;", "getWschannelModuleDependency", "()Lcom/ss/android/lark/moments/dependency/idependency/IWschannelModuleDependency;", "wschannelModuleDependency$delegate", "accountDependency", "avatarDependency", "languageDependency", "mainDependency", "qrCodeDependency", "wschannelDependency", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsDependency implements IMomentsDependency {
    private final Lazy accountModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39878a.INSTANCE);
    private final Lazy avatarModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39879b.INSTANCE);
    private final Lazy browserModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39880c.INSTANCE);
    private final Lazy chatModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39881d.INSTANCE);
    private final Lazy coreModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39882e.INSTANCE);
    private final Lazy driveDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39883f.INSTANCE);
    private final Lazy dynamicDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39884g.INSTANCE);
    private final Lazy featureGatingDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39885h.INSTANCE);
    private final Lazy forwardDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39886i.INSTANCE);
    private final Lazy imageDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39887j.INSTANCE);
    private final Lazy languageModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39888k.INSTANCE);
    private final Lazy mainModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39889l.INSTANCE);
    private final Lazy passportSdkDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39890m.INSTANCE);
    private final Lazy phoneModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39891n.INSTANCE);
    private final Lazy profileModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39892o.INSTANCE);
    private final Lazy qrCodeModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39893p.INSTANCE);
    private final Lazy wschannelModuleDependency$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39894q.INSTANCE);

    private final IAccountModuleDependency getAccountModuleDependency() {
        return (IAccountModuleDependency) this.accountModuleDependency$delegate.getValue();
    }

    private final IAvatarModuleDependency getAvatarModuleDependency() {
        return (IAvatarModuleDependency) this.avatarModuleDependency$delegate.getValue();
    }

    private final IBrowserModuleDependency getBrowserModuleDependency() {
        return (IBrowserModuleDependency) this.browserModuleDependency$delegate.getValue();
    }

    private final IChatModuleDependency getChatModuleDependency() {
        return (IChatModuleDependency) this.chatModuleDependency$delegate.getValue();
    }

    private final ICoreModuleDependency getCoreModuleDependency() {
        return (ICoreModuleDependency) this.coreModuleDependency$delegate.getValue();
    }

    private final IDriveDependency getDriveDependency() {
        return (IDriveDependency) this.driveDependency$delegate.getValue();
    }

    private final IDynamicConfigModuleDependency getDynamicDependency() {
        return (IDynamicConfigModuleDependency) this.dynamicDependency$delegate.getValue();
    }

    private final AbstractC47178j getFeatureGatingDependency() {
        return (AbstractC47178j) this.featureGatingDependency$delegate.getValue();
    }

    private final IForwardDependency getForwardDependency() {
        return (IForwardDependency) this.forwardDependency$delegate.getValue();
    }

    private final IImageDependency getImageDependency() {
        return (IImageDependency) this.imageDependency$delegate.getValue();
    }

    private final ILanguageModuleDependency getLanguageModuleDependency() {
        return (ILanguageModuleDependency) this.languageModuleDependency$delegate.getValue();
    }

    private final IMainModuleDependency getMainModuleDependency() {
        return (IMainModuleDependency) this.mainModuleDependency$delegate.getValue();
    }

    private final IPassportSdkModuleDependency getPassportSdkDependency() {
        return (IPassportSdkModuleDependency) this.passportSdkDependency$delegate.getValue();
    }

    private final IPhoneModuleDependency getPhoneModuleDependency() {
        return (IPhoneModuleDependency) this.phoneModuleDependency$delegate.getValue();
    }

    private final IProfileModuleDependency getProfileModuleDependency() {
        return (IProfileModuleDependency) this.profileModuleDependency$delegate.getValue();
    }

    private final IQRCodeModuleDependency getQrCodeModuleDependency() {
        return (IQRCodeModuleDependency) this.qrCodeModuleDependency$delegate.getValue();
    }

    private final IWschannelModuleDependency getWschannelModuleDependency() {
        return (IWschannelModuleDependency) this.wschannelModuleDependency$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsAccountModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$a */
    static final class C39878a extends Lambda implements Function0<MomentsAccountModule> {
        public static final C39878a INSTANCE = new C39878a();

        C39878a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsAccountModule invoke() {
            return new MomentsAccountModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsAvatarModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$b */
    static final class C39879b extends Lambda implements Function0<MomentsAvatarModule> {
        public static final C39879b INSTANCE = new C39879b();

        C39879b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsAvatarModule invoke() {
            return new MomentsAvatarModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsBrowserModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$c */
    static final class C39880c extends Lambda implements Function0<MomentsBrowserModule> {
        public static final C39880c INSTANCE = new C39880c();

        C39880c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsBrowserModule invoke() {
            return new MomentsBrowserModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsChatModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$d */
    static final class C39881d extends Lambda implements Function0<MomentsChatModule> {
        public static final C39881d INSTANCE = new C39881d();

        C39881d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsChatModule invoke() {
            return new MomentsChatModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsCoreModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$e */
    static final class C39882e extends Lambda implements Function0<MomentsCoreModule> {
        public static final C39882e INSTANCE = new C39882e();

        C39882e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsCoreModule invoke() {
            return new MomentsCoreModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsDriveModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$f */
    static final class C39883f extends Lambda implements Function0<MomentsDriveModule> {
        public static final C39883f INSTANCE = new C39883f();

        C39883f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsDriveModule invoke() {
            return new MomentsDriveModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsDynamicConfigModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$g */
    static final class C39884g extends Lambda implements Function0<MomentsDynamicConfigModule> {
        public static final C39884g INSTANCE = new C39884g();

        C39884g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsDynamicConfigModule invoke() {
            return new MomentsDynamicConfigModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsFeatureGating;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$h */
    static final class C39885h extends Lambda implements Function0<C39898h> {
        public static final C39885h INSTANCE = new C39885h();

        C39885h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C39898h invoke() {
            return new C39898h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsForwardModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$i */
    static final class C39886i extends Lambda implements Function0<MomentsForwardModule> {
        public static final C39886i INSTANCE = new C39886i();

        C39886i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsForwardModule invoke() {
            return new MomentsForwardModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsImageModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$j */
    static final class C39887j extends Lambda implements Function0<MomentsImageModule> {
        public static final C39887j INSTANCE = new C39887j();

        C39887j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsImageModule invoke() {
            return new MomentsImageModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsLanguageModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$k */
    static final class C39888k extends Lambda implements Function0<MomentsLanguageModule> {
        public static final C39888k INSTANCE = new C39888k();

        C39888k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsLanguageModule invoke() {
            return new MomentsLanguageModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsMainModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$l */
    static final class C39889l extends Lambda implements Function0<MomentsMainModule> {
        public static final C39889l INSTANCE = new C39889l();

        C39889l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsMainModule invoke() {
            return new MomentsMainModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsPassportSdkModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$m */
    static final class C39890m extends Lambda implements Function0<MomentsPassportSdkModule> {
        public static final C39890m INSTANCE = new C39890m();

        C39890m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsPassportSdkModule invoke() {
            return new MomentsPassportSdkModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsPhoneModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$n */
    static final class C39891n extends Lambda implements Function0<MomentsPhoneModule> {
        public static final C39891n INSTANCE = new C39891n();

        C39891n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsPhoneModule invoke() {
            return new MomentsPhoneModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsProfileModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$o */
    static final class C39892o extends Lambda implements Function0<MomentsProfileModule> {
        public static final C39892o INSTANCE = new C39892o();

        C39892o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsProfileModule invoke() {
            return new MomentsProfileModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsQRCodeModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$p */
    static final class C39893p extends Lambda implements Function0<MomentsQRCodeModule> {
        public static final C39893p INSTANCE = new C39893p();

        C39893p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsQRCodeModule invoke() {
            return new MomentsQRCodeModule();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/integrator/moments/dependency/MomentsWschannelModule;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.MomentsDependency$q */
    static final class C39894q extends Lambda implements Function0<MomentsWschannelModule> {
        public static final C39894q INSTANCE = new C39894q();

        C39894q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsWschannelModule invoke() {
            return new MomentsWschannelModule();
        }
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IAccountModuleDependency accountDependency() {
        return getAccountModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IAvatarModuleDependency avatarDependency() {
        return getAvatarModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IBrowserModuleDependency browserModuleDependency() {
        return getBrowserModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IChatModuleDependency chatModuleDependency() {
        return getChatModuleDependency();
    }

    public ICoreModuleDependency coreModuleDependency() {
        return getCoreModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IDriveDependency driveDependency() {
        return getDriveDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IDynamicConfigModuleDependency dynamicDependency() {
        return getDynamicDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public AbstractC47178j featureGatingDependency() {
        return getFeatureGatingDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IForwardDependency forwardDependency() {
        return getForwardDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IImageDependency imageDependency() {
        return getImageDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public ILanguageModuleDependency languageDependency() {
        return getLanguageModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IMainModuleDependency mainDependency() {
        return getMainModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IPassportSdkModuleDependency passportSdkDependency() {
        return getPassportSdkDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IPhoneModuleDependency phoneModuleDependency() {
        return getPhoneModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IProfileModuleDependency profileModuleDependency() {
        return getProfileModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IQRCodeModuleDependency qrCodeDependency() {
        return getQrCodeModuleDependency();
    }

    @Override // com.ss.android.lark.moments.dependency.IMomentsDependency
    public IWschannelModuleDependency wschannelDependency() {
        return getWschannelModuleDependency();
    }
}
