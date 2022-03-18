package com.smt.usbcam;

public interface OnConnectListener {
    void onAttach();

    void onBusy(boolean z);

    void onCancel();

    void onConnect();

    void onDettach();

    void onDisconnect();
}
