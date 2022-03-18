package com.ss.video.rtc.engine.handler;

public interface IRtcEngineEncryptionHandler {
    byte[] onDecryptData(byte[] bArr);

    byte[] onEncryptData(byte[] bArr);
}
