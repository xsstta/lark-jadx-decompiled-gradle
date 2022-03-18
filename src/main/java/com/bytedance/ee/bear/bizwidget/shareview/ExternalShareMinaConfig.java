package com.bytedance.ee.bear.bizwidget.shareview;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@AppConfig(key = "external_share_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "QQConfig", "Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig$ChannelConfig;", "getQQConfig", "()Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig$ChannelConfig;", "setQQConfig", "(Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig$ChannelConfig;)V", "WBConfig", "getWBConfig", "setWBConfig", "WXConfig", "getWXConfig", "setWXConfig", "enableShareMiniApp", "", "getEnableShareMiniApp", "()Z", "setEnableShareMiniApp", "(Z)V", "isEnableShareMiniApp", "isShareChannelBanned", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "isShareDomainBanned", "ChannelConfig", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ExternalShareMinaConfig implements NonProguard {
    private ChannelConfig QQConfig = new ChannelConfig();
    private ChannelConfig WBConfig = new ChannelConfig();
    private ChannelConfig WXConfig = new ChannelConfig();
    private boolean enableShareMiniApp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig$ChannelConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "isShareChannelBanned", "", "()Z", "setShareChannelBanned", "(Z)V", "isShareDomainBanned", "setShareDomainBanned", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ChannelConfig implements NonProguard {
        private boolean isShareChannelBanned = true;
        private boolean isShareDomainBanned;

        public final boolean isShareChannelBanned() {
            return this.isShareChannelBanned;
        }

        public final boolean isShareDomainBanned() {
            return this.isShareDomainBanned;
        }

        public final void setShareChannelBanned(boolean z) {
            this.isShareChannelBanned = z;
        }

        public final void setShareDomainBanned(boolean z) {
            this.isShareDomainBanned = z;
        }
    }

    public final boolean getEnableShareMiniApp() {
        return this.enableShareMiniApp;
    }

    public final ChannelConfig getQQConfig() {
        return this.QQConfig;
    }

    public final ChannelConfig getWBConfig() {
        return this.WBConfig;
    }

    public final ChannelConfig getWXConfig() {
        return this.WXConfig;
    }

    public final boolean isEnableShareMiniApp() {
        return this.enableShareMiniApp;
    }

    public final void setEnableShareMiniApp(boolean z) {
        this.enableShareMiniApp = z;
    }

    public final void setQQConfig(ChannelConfig channelConfig) {
        Intrinsics.checkParameterIsNotNull(channelConfig, "<set-?>");
        this.QQConfig = channelConfig;
    }

    public final void setWBConfig(ChannelConfig channelConfig) {
        Intrinsics.checkParameterIsNotNull(channelConfig, "<set-?>");
        this.WBConfig = channelConfig;
    }

    public final void setWXConfig(ChannelConfig channelConfig) {
        Intrinsics.checkParameterIsNotNull(channelConfig, "<set-?>");
        this.WXConfig = channelConfig;
    }

    public final boolean isShareChannelBanned(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
        if (shareType == ShareType.Wechat || shareType == ShareType.WechatMoments) {
            return this.WXConfig.isShareChannelBanned();
        }
        if (shareType == ShareType.QQ) {
            return this.QQConfig.isShareChannelBanned();
        }
        if (shareType == ShareType.Weibo) {
            return this.WBConfig.isShareChannelBanned();
        }
        return true;
    }

    public final boolean isShareDomainBanned(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
        if (shareType == ShareType.Wechat || shareType == ShareType.WechatMoments) {
            return this.WXConfig.isShareDomainBanned();
        }
        if (shareType == ShareType.QQ) {
            return this.QQConfig.isShareDomainBanned();
        }
        if (shareType == ShareType.Weibo) {
            return this.WBConfig.isShareDomainBanned();
        }
        return false;
    }
}
