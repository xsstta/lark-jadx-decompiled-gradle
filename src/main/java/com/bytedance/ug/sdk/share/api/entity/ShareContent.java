package com.bytedance.ug.sdk.share.api.entity;

import android.graphics.Bitmap;
import com.bytedance.ug.sdk.share.api.p914a.AbstractC20794a;
import com.bytedance.ug.sdk.share.api.p914a.AbstractC20796b;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20807b;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20810d;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20811e;
import com.bytedance.ug.sdk.share.api.panel.ShareChannelType;
import com.bytedance.ug.sdk.share.impl.p918b.AbstractC20825c;
import java.io.Serializable;
import org.json.JSONObject;

public class ShareContent implements Serializable {
    public String mAudioUrl;
    public String mCopyUrl;
    public AbstractC20796b mEventCallBack;
    public C20816a mExtraParams;
    public String mFileName;
    public String mFileUrl;
    public String mFrom;
    public ShareChannelType mFromChannel;
    public String mHiddenImageUrl;
    public Bitmap mImage;
    public AbstractC20807b mImageTokenDialog;
    public C20818c mImageTokenShareInfo;
    public String mImageUrl;
    public JSONObject mLogEventParams;
    public String mPanelId;
    public String mQrcodeImageUrl;
    public String mResourceId;
    public ShareChannelType mShareChanelType;
    public ShareContentType mShareContentType;
    public AbstractC20810d mShareProgressView;
    public ShareStrategy mShareStrategy;
    public String mShareToken;
    public AbstractC20811e mShareTokenDialog;
    public AbstractC20794a mShareTokenGenerator;
    public ShareContentType mSystemShareType;
    public String mTargetUrl;
    public String mText;
    public String mTitle;
    public C20818c mTokenShareInfo;
    public AbstractC20825c mVideoDialogCallback;
    public String mVideoName;
    public String mVideoUrl;

    public String getAudioUrl() {
        return this.mAudioUrl;
    }

    public String getCopyUrl() {
        return this.mCopyUrl;
    }

    public AbstractC20796b getEventCallBack() {
        return this.mEventCallBack;
    }

    public C20816a getExtraParams() {
        return this.mExtraParams;
    }

    public String getFileName() {
        return this.mFileName;
    }

    public String getFileUrl() {
        return this.mFileUrl;
    }

    public String getFrom() {
        return this.mFrom;
    }

    public ShareChannelType getFromChannel() {
        return this.mFromChannel;
    }

    public String getHiddenImageUrl() {
        return this.mHiddenImageUrl;
    }

    public Bitmap getImage() {
        return this.mImage;
    }

    public AbstractC20807b getImageTokenDialog() {
        return this.mImageTokenDialog;
    }

    public C20818c getImageTokenShareInfo() {
        return this.mImageTokenShareInfo;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public JSONObject getLogEventParams() {
        return this.mLogEventParams;
    }

    public String getPanelId() {
        return this.mPanelId;
    }

    public String getQrcodeImageUrl() {
        return this.mQrcodeImageUrl;
    }

    public String getResourceId() {
        return this.mResourceId;
    }

    public ShareChannelType getShareChanelType() {
        return this.mShareChanelType;
    }

    public ShareContentType getShareContentType() {
        return this.mShareContentType;
    }

    public AbstractC20810d getShareProgressView() {
        return this.mShareProgressView;
    }

    public ShareStrategy getShareStrategy() {
        return this.mShareStrategy;
    }

    public String getShareToken() {
        return this.mShareToken;
    }

    public AbstractC20811e getShareTokenDialog() {
        return this.mShareTokenDialog;
    }

    public AbstractC20794a getShareTokenGenerator() {
        return this.mShareTokenGenerator;
    }

    public ShareContentType getSystemShareType() {
        return this.mSystemShareType;
    }

    public String getTargetUrl() {
        return this.mTargetUrl;
    }

    public String getText() {
        return this.mText;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public C20818c getTokenShareInfo() {
        return this.mTokenShareInfo;
    }

    public AbstractC20825c getVideoDialogCallback() {
        return this.mVideoDialogCallback;
    }

    public String getVideoName() {
        return this.mVideoName;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    /* renamed from: com.bytedance.ug.sdk.share.api.entity.ShareContent$a */
    public static class C20813a {

        /* renamed from: a */
        private ShareContent f50958a = new ShareContent();

        /* renamed from: a */
        public C20813a mo70170a(String str) {
            this.f50958a.mTitle = str;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70168a(ShareChannelType shareChannelType) {
            this.f50958a.mShareChanelType = shareChannelType;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70171a(JSONObject jSONObject) {
            this.f50958a.mLogEventParams = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70169a(AbstractC20825c cVar) {
            this.f50958a.mVideoDialogCallback = cVar;
            return this;
        }

        /* renamed from: a */
        public ShareContent mo70172a() {
            if (this.f50958a.mShareTokenGenerator == null) {
                this.f50958a.mShareTokenGenerator = new AbstractC20794a.C20795a();
            }
            return this.f50958a;
        }

        /* renamed from: a */
        public C20813a mo70158a(Bitmap bitmap) {
            this.f50958a.mImage = bitmap;
            return this;
        }

        /* renamed from: b */
        public C20813a mo70173b(ShareContentType shareContentType) {
            if (shareContentType != null) {
                this.f50958a.mSystemShareType = shareContentType;
            }
            return this;
        }

        /* renamed from: c */
        public C20813a mo70177c(String str) {
            this.f50958a.mText = str;
            return this;
        }

        /* renamed from: d */
        public C20813a mo70178d(String str) {
            this.f50958a.mImageUrl = str;
            return this;
        }

        /* renamed from: e */
        public C20813a mo70179e(String str) {
            this.f50958a.mVideoUrl = str;
            return this;
        }

        /* renamed from: f */
        public C20813a mo70180f(String str) {
            this.f50958a.mVideoName = str;
            return this;
        }

        /* renamed from: g */
        public C20813a mo70181g(String str) {
            this.f50958a.mAudioUrl = str;
            return this;
        }

        /* renamed from: h */
        public C20813a mo70182h(String str) {
            this.f50958a.mQrcodeImageUrl = str;
            return this;
        }

        /* renamed from: i */
        public C20813a mo70183i(String str) {
            this.f50958a.mHiddenImageUrl = str;
            return this;
        }

        /* renamed from: j */
        public C20813a mo70184j(String str) {
            this.f50958a.mCopyUrl = str;
            return this;
        }

        /* renamed from: k */
        public C20813a mo70185k(String str) {
            this.f50958a.mFileUrl = str;
            return this;
        }

        /* renamed from: l */
        public C20813a mo70186l(String str) {
            this.f50958a.mFileName = str;
            return this;
        }

        /* renamed from: m */
        public C20813a mo70187m(String str) {
            this.f50958a.mFrom = str;
            return this;
        }

        /* renamed from: n */
        public C20813a mo70188n(String str) {
            this.f50958a.mPanelId = str;
            return this;
        }

        /* renamed from: o */
        public C20813a mo70189o(String str) {
            this.f50958a.mResourceId = str;
            return this;
        }

        /* renamed from: p */
        public C20813a mo70190p(String str) {
            this.f50958a.mShareToken = str;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70159a(AbstractC20794a aVar) {
            this.f50958a.mShareTokenGenerator = aVar;
            return this;
        }

        /* renamed from: b */
        public C20813a mo70174b(C20818c cVar) {
            this.f50958a.mImageTokenShareInfo = cVar;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70160a(AbstractC20796b bVar) {
            this.f50958a.mEventCallBack = bVar;
            return this;
        }

        /* renamed from: b */
        public C20813a mo70175b(ShareChannelType shareChannelType) {
            this.f50958a.mFromChannel = shareChannelType;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70161a(AbstractC20807b bVar) {
            this.f50958a.mImageTokenDialog = bVar;
            return this;
        }

        /* renamed from: b */
        public C20813a mo70176b(String str) {
            this.f50958a.mTargetUrl = str;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70162a(AbstractC20810d dVar) {
            this.f50958a.mShareProgressView = dVar;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70163a(AbstractC20811e eVar) {
            this.f50958a.mShareTokenDialog = eVar;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70164a(ShareContentType shareContentType) {
            if (shareContentType != null) {
                this.f50958a.mShareContentType = shareContentType;
            }
            return this;
        }

        /* renamed from: a */
        public C20813a mo70165a(ShareStrategy shareStrategy) {
            this.f50958a.mShareStrategy = shareStrategy;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70166a(C20816a aVar) {
            this.f50958a.mExtraParams = aVar;
            return this;
        }

        /* renamed from: a */
        public C20813a mo70167a(C20818c cVar) {
            this.f50958a.mTokenShareInfo = cVar;
            return this;
        }
    }

    private ShareContent() {
        this.mShareStrategy = ShareStrategy.NORMAL;
        this.mShareContentType = ShareContentType.ALL;
        this.mSystemShareType = ShareContentType.TEXT;
    }

    @Override // java.lang.Object
    public ShareContent clone() {
        C20818c cVar;
        C20818c cVar2;
        C20816a aVar = null;
        if (this.mTokenShareInfo != null) {
            cVar = new C20818c();
            cVar.mo70278a(this.mTokenShareInfo.mo70277a());
            cVar.mo70280b(this.mTokenShareInfo.mo70279b());
            cVar.mo70282c(this.mTokenShareInfo.mo70281c());
        } else {
            cVar = null;
        }
        if (this.mImageTokenShareInfo != null) {
            cVar2 = new C20818c();
            cVar2.mo70278a(this.mImageTokenShareInfo.mo70277a());
            cVar2.mo70280b(this.mImageTokenShareInfo.mo70279b());
            cVar2.mo70282c(this.mImageTokenShareInfo.mo70281c());
        } else {
            cVar2 = null;
        }
        if (this.mExtraParams != null) {
            aVar = new C20816a();
            aVar.mo70256a(this.mExtraParams.mo70255a());
            aVar.mo70260c(this.mExtraParams.mo70259c());
            aVar.mo70258b(this.mExtraParams.mo70257b());
            aVar.mo70264e(this.mExtraParams.mo70263e());
            aVar.mo70266f(this.mExtraParams.mo70265f());
            aVar.mo70262d(this.mExtraParams.mo70261d());
            aVar.mo70270h(this.mExtraParams.mo70269h());
            aVar.mo70268g(this.mExtraParams.mo70267g());
        }
        return new C20813a().mo70164a(this.mShareContentType).mo70173b(this.mSystemShareType).mo70168a(this.mShareChanelType).mo70165a(this.mShareStrategy).mo70170a(this.mTitle).mo70177c(this.mText).mo70176b(this.mTargetUrl).mo70184j(this.mCopyUrl).mo70158a(this.mImage).mo70178d(this.mImageUrl).mo70183i(this.mHiddenImageUrl).mo70182h(this.mQrcodeImageUrl).mo70179e(this.mVideoUrl).mo70180f(this.mVideoName).mo70181g(this.mAudioUrl).mo70186l(this.mFileName).mo70185k(this.mFileUrl).mo70163a(this.mShareTokenDialog).mo70161a(this.mImageTokenDialog).mo70162a(this.mShareProgressView).mo70169a(this.mVideoDialogCallback).mo70160a(this.mEventCallBack).mo70167a(cVar).mo70174b(cVar2).mo70166a(aVar).mo70171a(this.mLogEventParams).mo70187m(this.mFrom).mo70175b(this.mFromChannel).mo70188n(this.mPanelId).mo70189o(this.mResourceId).mo70159a(this.mShareTokenGenerator).mo70190p(this.mShareToken).mo70172a();
    }

    public void setAudioUrl(String str) {
        this.mAudioUrl = str;
    }

    public void setCopyUrl(String str) {
        this.mCopyUrl = str;
    }

    public void setEventCallBack(AbstractC20796b bVar) {
        this.mEventCallBack = bVar;
    }

    public void setExtraParams(C20816a aVar) {
        this.mExtraParams = aVar;
    }

    public void setFileName(String str) {
        this.mFileName = str;
    }

    public void setFileUrl(String str) {
        this.mFileUrl = str;
    }

    public void setFrom(String str) {
        this.mFrom = str;
    }

    public void setFromChannel(ShareChannelType shareChannelType) {
        this.mFromChannel = shareChannelType;
    }

    public void setHiddenImageUrl(String str) {
        this.mHiddenImageUrl = str;
    }

    public void setImage(Bitmap bitmap) {
        this.mImage = bitmap;
    }

    public void setImageTokenShareInfo(C20818c cVar) {
        this.mImageTokenShareInfo = cVar;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public void setPanelId(String str) {
        this.mPanelId = str;
    }

    public void setQrcodeImageUrl(String str) {
        this.mQrcodeImageUrl = str;
    }

    public void setResourceId(String str) {
        this.mResourceId = str;
    }

    public void setShareChannelType(ShareChannelType shareChannelType) {
        this.mShareChanelType = shareChannelType;
    }

    public void setShareContentType(ShareContentType shareContentType) {
        this.mShareContentType = shareContentType;
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.mShareStrategy = shareStrategy;
    }

    public void setShareToken(String str) {
        this.mShareToken = str;
    }

    public void setSystemShareType(ShareContentType shareContentType) {
        this.mSystemShareType = shareContentType;
    }

    public void setTargetUrl(String str) {
        this.mTargetUrl = str;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTokenShareInfo(C20818c cVar) {
        this.mTokenShareInfo = cVar;
    }

    public void setVideoDialogCallback(AbstractC20825c cVar) {
        this.mVideoDialogCallback = cVar;
    }

    public void setVideoName(String str) {
        this.mVideoName = str;
    }

    public void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }
}
