package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("cronet")
public abstract class TTAppInfoProvider {
    public abstract AppInfo getAppInfo();

    public static class AppInfo {
        private String mAbi;
        private String mAppId;
        private String mAppName;
        private String mCarrierRegion;
        private String mChannel;
        private String mDeviceBrand;
        private String mDeviceId;
        private String mDeviceModel;
        private String mDevicePlatform;
        private String mDeviceType;
        private String mDomainBoe;
        private String mDomainBoeHttps;
        private String mDomainHttpDns;
        private String mDomainNetlog;
        private String mHostFirst;
        private String mHostSecond;
        private String mHostThird;
        private String mHttpDnsRequestFlags;
        private String mIsMainProcess;
        private String mManifestVersionCode;
        private String mNetAccessType;
        private String mOSApi;
        private String mOSVersion;
        private String mRegion;
        private String mSdkAppID;
        private String mSdkVersion;
        private String mStoreIdc;
        private String mSysRegion;
        private String mTNCRequestFlags;
        private String mTNCRequestHeader;
        private String mTNCRequestQuery;
        private String mUpdateVersionCode;
        private String mUserId;
        private String mVersionCode;
        private String mVersionName;

        public String getAbi() {
            return this.mAbi;
        }

        public String getAppId() {
            return this.mAppId;
        }

        public String getAppName() {
            return this.mAppName;
        }

        public String getCarrierRegion() {
            return this.mCarrierRegion;
        }

        public String getChannel() {
            return this.mChannel;
        }

        public String getDeviceBrand() {
            return this.mDeviceBrand;
        }

        public String getDeviceId() {
            return this.mDeviceId;
        }

        public String getDeviceModel() {
            return this.mDeviceModel;
        }

        public String getDevicePlatform() {
            return this.mDevicePlatform;
        }

        public String getDeviceType() {
            return this.mDeviceType;
        }

        public String getDomainBoe() {
            return this.mDomainBoe;
        }

        public String getDomainBoeHttps() {
            return this.mDomainBoeHttps;
        }

        public String getDomainHttpDns() {
            return this.mDomainHttpDns;
        }

        public String getDomainNetlog() {
            return this.mDomainNetlog;
        }

        public String getHostFirst() {
            return this.mHostFirst;
        }

        public String getHostSecond() {
            return this.mHostSecond;
        }

        public String getHostThird() {
            return this.mHostThird;
        }

        public String getHttpDnsRequestFlags() {
            return this.mHttpDnsRequestFlags;
        }

        public String getIsMainProcess() {
            return this.mIsMainProcess;
        }

        public String getManifestVersionCode() {
            return this.mManifestVersionCode;
        }

        public String getNetAccessType() {
            return this.mNetAccessType;
        }

        public String getOSApi() {
            return this.mOSApi;
        }

        public String getOSVersion() {
            return this.mOSVersion;
        }

        public String getRegion() {
            return this.mRegion;
        }

        public String getSdkAppID() {
            return this.mSdkAppID;
        }

        public String getSdkVersion() {
            return this.mSdkVersion;
        }

        public String getStoreIdc() {
            return this.mStoreIdc;
        }

        public String getSysRegion() {
            return this.mSysRegion;
        }

        public String getTNCRequestFlags() {
            return this.mTNCRequestFlags;
        }

        public String getTNCRequestHeader() {
            return this.mTNCRequestHeader;
        }

        public String getTNCRequestQuery() {
            return this.mTNCRequestQuery;
        }

        public String getUpdateVersionCode() {
            return this.mUpdateVersionCode;
        }

        public String getUserId() {
            return this.mUserId;
        }

        public String getVersionCode() {
            return this.mVersionCode;
        }

        public String getVersionName() {
            return this.mVersionName;
        }

        public void setAbi(String str) {
            this.mAbi = str;
        }

        public void setAppId(String str) {
            this.mAppId = str;
        }

        public void setAppName(String str) {
            this.mAppName = str;
        }

        public void setCarrierRegion(String str) {
            this.mCarrierRegion = str;
        }

        public void setChannel(String str) {
            this.mChannel = str;
        }

        public void setDeviceBrand(String str) {
            this.mDeviceBrand = str;
        }

        public void setDeviceId(String str) {
            this.mDeviceId = str;
        }

        public void setDeviceModel(String str) {
            this.mDeviceModel = str;
        }

        public void setDevicePlatform(String str) {
            this.mDevicePlatform = str;
        }

        public void setDeviceType(String str) {
            this.mDeviceType = str;
        }

        public void setDomainBoe(String str) {
            this.mDomainBoe = str;
        }

        public void setDomainBoeHttps(String str) {
            this.mDomainBoeHttps = str;
        }

        public void setDomainHttpDns(String str) {
            this.mDomainHttpDns = str;
        }

        public void setDomainNetlog(String str) {
            this.mDomainNetlog = str;
        }

        public void setHostFirst(String str) {
            this.mHostFirst = str;
        }

        public void setHostSecond(String str) {
            this.mHostSecond = str;
        }

        public void setHostThird(String str) {
            this.mHostThird = str;
        }

        public void setHttpDnsRequestFlags(String str) {
            this.mHttpDnsRequestFlags = str;
        }

        public void setIsMainProcess(String str) {
            this.mIsMainProcess = str;
        }

        public void setManifestVersionCode(String str) {
            this.mManifestVersionCode = str;
        }

        public void setNetAccessType(String str) {
            this.mNetAccessType = str;
        }

        public void setOSApi(String str) {
            this.mOSApi = str;
        }

        public void setOSVersion(String str) {
            this.mOSVersion = str;
        }

        public void setRegion(String str) {
            this.mRegion = str;
        }

        public void setSdkAppID(String str) {
            this.mSdkAppID = str;
        }

        public void setSdkVersion(String str) {
            this.mSdkVersion = str;
        }

        public void setStoreIdc(String str) {
            this.mStoreIdc = str;
        }

        public void setSysRegion(String str) {
            this.mSysRegion = str;
        }

        public void setTNCRequestFlags(String str) {
            this.mTNCRequestFlags = str;
        }

        public void setTNCRequestHeader(String str) {
            this.mTNCRequestHeader = str;
        }

        public void setTNCRequestQuery(String str) {
            this.mTNCRequestQuery = str;
        }

        public void setUpdateVersionCode(String str) {
            this.mUpdateVersionCode = str;
        }

        public void setUserId(String str) {
            this.mUserId = str;
        }

        public void setVersionCode(String str) {
            this.mVersionCode = str;
        }

        public void setVersionName(String str) {
            this.mVersionName = str;
        }
    }
}
