package com.ss.android.lark.moments.dependency;

import com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IAvatarModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IBrowserModuleDependency;
import com.ss.android.lark.moments.dependency.idependency.IChatModuleDependency;
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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&¨\u0006$"}, d2 = {"Lcom/ss/android/lark/moments/dependency/IMomentsDependency;", "", "accountDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IAccountModuleDependency;", "avatarDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IAvatarModuleDependency;", "browserModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IBrowserModuleDependency;", "chatModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IChatModuleDependency;", "coreModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/ICoreModuleDependency;", "driveDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IDriveDependency;", "dynamicDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IDynamicConfigModuleDependency;", "featureGatingDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IFeatureGatingDependency;", "forwardDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IForwardDependency;", "imageDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IImageDependency;", "languageDependency", "Lcom/ss/android/lark/moments/dependency/idependency/ILanguageModuleDependency;", "mainDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IMainModuleDependency;", "passportSdkDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency;", "phoneModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IPhoneModuleDependency;", "profileModuleDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IProfileModuleDependency;", "qrCodeDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IQRCodeModuleDependency;", "wschannelDependency", "Lcom/ss/android/lark/moments/dependency/idependency/IWschannelModuleDependency;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.b.a */
public interface IMomentsDependency {
    IAccountModuleDependency accountDependency();

    IAvatarModuleDependency avatarDependency();

    IBrowserModuleDependency browserModuleDependency();

    IChatModuleDependency chatModuleDependency();

    IDriveDependency driveDependency();

    IDynamicConfigModuleDependency dynamicDependency();

    AbstractC47178j featureGatingDependency();

    IForwardDependency forwardDependency();

    IImageDependency imageDependency();

    ILanguageModuleDependency languageDependency();

    IMainModuleDependency mainDependency();

    IPassportSdkModuleDependency passportSdkDependency();

    IPhoneModuleDependency phoneModuleDependency();

    IProfileModuleDependency profileModuleDependency();

    IQRCodeModuleDependency qrCodeDependency();

    IWschannelModuleDependency wschannelDependency();
}
