package com.ss.android.lark.ug.thirdshare.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.larkconfig.larksetting.handler.p2117k.C41204a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.p2492m.C51838a;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareRemoteConfig;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.ViewUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

@ClaymoreImpl(AbstractC55760b.class)
public class ThirdShareDependencyImpl implements AbstractC55760b {
    public String getAppId() {
        return String.valueOf(C29410a.m108287a().mo104277a());
    }

    public String getDeviceId() {
        return C36083a.m141486a().getPassportDependency().mo133090i();
    }

    public String getQQKey() {
        return C36083a.m141486a().getThirdPartyInfoDependency().mo133112c();
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b
    public Map<String, ShareRemoteConfig> getShareRemoteConfig() {
        return C41204a.m163434d().mo107775e();
    }

    public String getWeChatKey() {
        return C36083a.m141486a().getThirdPartyInfoDependency().mo133111b();
    }

    public String getWeiboKey() {
        return C36083a.m141486a().getThirdPartyInfoDependency().mo133110a();
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b
    public boolean isGooglePlay() {
        return C36083a.m141487b().isUsPackage();
    }

    public boolean isSupportWxSdk() {
        return PackageChannelManager.isKABuildPackage(LarkContext.getApplication());
    }

    public boolean isFgEnable(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    public boolean isMainActivity(Context context) {
        return C36149a.m142162a().mo157098b().mo105702a(context);
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b
    public void shareLarkChatImage(final Context context, Bitmap bitmap, final int i) {
        C55680a.m215704a(bitmap, new C55680a.AbstractC55693b() {
            /* class com.ss.android.lark.ug.thirdshare.dependency.ThirdShareDependencyImpl.C575601 */

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveFailed(String str) {
                Log.m165383e("ThirdShare", str);
                ViewUtils.m224144a();
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveSuccess(File file) {
                ImageContent imageContent = new ImageContent();
                ImageSet imageSet = new ImageSet();
                imageContent.setImageSet(imageSet);
                Image image = new Image();
                imageSet.setOrigin(image);
                ArrayList arrayList = new ArrayList();
                image.setUrls(arrayList);
                arrayList.add(file.getAbsolutePath());
                C51838a.m200992a().mo140411a(context, imageContent, i);
            }
        });
    }

    @Override // com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b
    public void shareLarkChatText(Context context, String str, String str2, int i) {
        ShareTextForwardData shareTextForwardData = new ShareTextForwardData("", str2, "", true, false, true);
        shareTextForwardData.setTitleBarText(str);
        C51838a.m200992a().mo140400a(context, shareTextForwardData, i);
    }

    public void shareWxMiniApp(String str, String str2, int i, String str3, File file, String str4) {
        C36083a.m141486a().getThirdShareDependency().mo133120a(str, str2, i, str3, file, str4);
    }
}
