package com.larksuite.component.openplatform.core.plugin.device.bluetooth;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;

public enum BluetoothError {
    BLUETOOTH_API_NO_ERROR(0, "ok"),
    BLUETOOTH_API_NOT_INIT(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "not init"),
    BLUETOOTH_API_DEVICE_NOT_AVAILABLE(UpdateDialogStatusCode.DISMISS, "device not available"),
    BLUETOOTH_API_DEVICE_NOT_FOUND(UpdateDialogStatusCode.SHOW, "device not found"),
    BLUETOOTH_API_CONNECTION_FAIL(10003, "connection failed"),
    BLUETOOTH_API_SERVICE_NOT_FOUND(10004, "service not found"),
    BLUETOOTH_API_CHARACTERISTIC_ID_NOT_FOUND(10005, "characteristicId not found"),
    BLUETOOTH_API_NO_CONNECTION(10006, "no connection"),
    BLUETOOTH_API_OPERATION_NOT_AVAILABLE_ON_THIS_CHARACTERISTIC(10007, "operation not available on this characteristic"),
    BLUETOOTH_API_SYSTEM_ERROR(10008, "system error"),
    BLUETOOTH_API_BLE_NOT_AVAILABLE(10009, "BLE not available on this device"),
    BLUETOOTH_API_DESCRIPTOR_NOT_FOUND(10010, "descriptor not found"),
    BLUETOOTH_API_INVALID_DEVICE_ID(10011, "invalid deviceId"),
    BLUETOOTH_API_INVALID_SERVICE_ID(10012, "invalid serviceId"),
    BLUETOOTH_API_INVALID_CHARACTERISTIC_ID(10013, "invalid characteristicId"),
    BLUETOOTH_API_INVALID_DATA(10014, "invalid data"),
    BLUETOOTH_API_OPERATION_TIMEOUT(10015, "operation time out"),
    BLUETOOTH_API_PARAMETERS_NEEDED(10016, "parameters needed"),
    BLUETOOTH_API_FAILED_TO_WRITE(10017, "failed to write characteristic"),
    BLUETOOTH_API_FAILED_TO_READ(10018, "failed to read characteristic"),
    BLUETOOTH_API_JSON_ERROR(10019, "construct json data error"),
    BLUETOOTH_API_OTHER_ERROR(10020, "");
    
    private int errorCode;
    private String errorMsg;

    public int errorCode() {
        return this.errorCode;
    }

    public String errorMsg() {
        return this.errorMsg;
    }

    public String toString() {
        return "BluetoothError{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    private BluetoothError(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }
}
