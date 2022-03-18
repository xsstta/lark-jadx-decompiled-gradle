package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.utils.LogUtil;

public class ByteRtcEngineEncryptHandler {
    private IRtcEngineEncryptionHandler mCustomizeEncryptHandler;

    public ByteRtcEngineEncryptHandler(IRtcEngineEncryptionHandler iRtcEngineEncryptionHandler) {
        this.mCustomizeEncryptHandler = iRtcEngineEncryptionHandler;
    }

    public byte[] onDecryptData(byte[] bArr) {
        LogUtil.m257129d("ByteRtcEngineEncryptHandler", "onDecryptData...");
        try {
            IRtcEngineEncryptionHandler iRtcEngineEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRtcEngineEncryptionHandler != null) {
                return iRtcEngineEncryptionHandler.onDecryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEncryptHandler", "onDecryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }

    public byte[] onEncryptData(byte[] bArr) {
        LogUtil.m257129d("ByteRtcEngineEncryptHandler", "onEncryptData...");
        try {
            IRtcEngineEncryptionHandler iRtcEngineEncryptionHandler = this.mCustomizeEncryptHandler;
            if (iRtcEngineEncryptionHandler != null) {
                return iRtcEngineEncryptionHandler.onEncryptData(bArr);
            }
            return null;
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineEncryptHandler", "onEncryptData callback catch exception.\n" + e.getMessage());
            return null;
        }
    }
}
