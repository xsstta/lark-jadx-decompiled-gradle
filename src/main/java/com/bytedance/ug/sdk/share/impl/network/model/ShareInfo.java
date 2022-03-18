package com.bytedance.ug.sdk.share.impl.network.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.api.entity.C20818c;
import com.bytedance.ug.sdk.share.api.entity.ShareContent;
import com.bytedance.ug.sdk.share.api.entity.ShareStrategy;
import com.bytedance.ug.sdk.share.api.panel.ShareChannelType;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ShareInfo implements Serializable {
    @SerializedName("channel")
    private String mChannel;
    @SerializedName("share_data")
    private ShareDetail mShareDetail;
    @SerializedName("method")
    private String mStrategy;

    public String getChannel() {
        return this.mChannel;
    }

    public ShareDetail getShareDetail() {
        return this.mShareDetail;
    }

    public String getStrategy() {
        return this.mStrategy;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setShareDetail(ShareDetail shareDetail) {
        this.mShareDetail = shareDetail;
    }

    public void setStrategy(String str) {
        this.mStrategy = str;
    }

    public static ShareContent applyTokenToShareModel(ShareInfo shareInfo, ShareContent shareContent) {
        ShareDetail shareDetail = shareInfo.getShareDetail();
        if (shareDetail != null) {
            TokenInfo tokenInfo = shareDetail.getTokenInfo();
            if (tokenInfo != null) {
                C20818c cVar = new C20818c();
                cVar.mo70278a(tokenInfo.getTitle());
                cVar.mo70280b(tokenInfo.getDescription());
                cVar.mo70282c(tokenInfo.getTips());
                shareContent.setTokenShareInfo(cVar);
            }
            TokenInfo imageTokenInfo = shareDetail.getImageTokenInfo();
            if (imageTokenInfo != null) {
                C20818c cVar2 = new C20818c();
                cVar2.mo70278a(imageTokenInfo.getTitle());
                cVar2.mo70280b(imageTokenInfo.getDescription());
                cVar2.mo70282c(imageTokenInfo.getTips());
                shareContent.setImageTokenShareInfo(cVar2);
            }
        }
        return shareContent;
    }

    public static ShareContent applyToShareModel(ShareInfo shareInfo, ShareContent shareContent) {
        String strategy = shareInfo.getStrategy();
        if (!TextUtils.isEmpty(strategy)) {
            shareContent.setShareStrategy(ShareStrategy.getStrategyByType(strategy));
        }
        ShareDetail shareDetail = shareInfo.getShareDetail();
        if (shareDetail != null) {
            String title = shareDetail.getTitle();
            if (!TextUtils.isEmpty(title)) {
                shareContent.setTitle(title);
            }
            String description = shareDetail.getDescription();
            if (!TextUtils.isEmpty(description)) {
                shareContent.setText(description);
            }
            String imageUrl = shareDetail.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                shareContent.setImageUrl(imageUrl);
            }
            String qrCodeImageUrl = shareDetail.getQrCodeImageUrl();
            if (!TextUtils.isEmpty(qrCodeImageUrl)) {
                shareContent.setQrcodeImageUrl(qrCodeImageUrl);
            }
            String hiddenImageUrl = shareDetail.getHiddenImageUrl();
            if (!TextUtils.isEmpty(hiddenImageUrl)) {
                shareContent.setHiddenImageUrl(hiddenImageUrl);
            }
            String shareUrl = shareDetail.getShareUrl();
            if (!TextUtils.isEmpty(shareUrl)) {
                try {
                    Uri parse = Uri.parse(shareUrl);
                    if (shareContent.getShareChanelType() == ShareChannelType.COPY_LINK || !TextUtils.isEmpty(parse.getQueryParameter("share_token"))) {
                        shareContent.setTargetUrl(shareUrl);
                    } else {
                        shareContent.setTargetUrl(parse.buildUpon().appendQueryParameter("share_token", shareContent.getShareToken()).build().toString());
                    }
                } catch (Exception unused) {
                    shareContent.setTargetUrl(shareUrl);
                }
            }
            String videoUrl = shareDetail.getVideoUrl();
            if (!TextUtils.isEmpty(videoUrl)) {
                shareContent.setVideoUrl(videoUrl);
            }
            String audioUrl = shareDetail.getAudioUrl();
            if (!TextUtils.isEmpty(audioUrl)) {
                shareContent.setAudioUrl(audioUrl);
            }
            TokenInfo tokenInfo = shareDetail.getTokenInfo();
            if (tokenInfo != null) {
                C20818c cVar = new C20818c();
                cVar.mo70278a(tokenInfo.getTitle());
                cVar.mo70280b(tokenInfo.getDescription());
                cVar.mo70282c(tokenInfo.getTips());
                shareContent.setTokenShareInfo(cVar);
            }
            TokenInfo imageTokenInfo = shareDetail.getImageTokenInfo();
            if (imageTokenInfo != null) {
                C20818c cVar2 = new C20818c();
                cVar2.mo70278a(imageTokenInfo.getTitle());
                cVar2.mo70280b(imageTokenInfo.getDescription());
                cVar2.mo70282c(imageTokenInfo.getTips());
                shareContent.setImageTokenShareInfo(cVar2);
            }
        }
        return shareContent;
    }
}
