package com.tt.miniapp.address;

import com.tt.miniapp.component.nativeview.picker.wheel.entity.WheelItem;

public class AddressInfo implements WheelItem {
    public String code = "";
    public String name = "";
    public String type = "";

    @Override // com.tt.miniapp.component.nativeview.picker.wheel.entity.WheelItem
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public String getAddrHashCode() {
        return this.name + this.code + this.type;
    }

    public AddressInfo(String str, String str2, String str3) {
        this.name = str;
        this.code = str2;
        this.type = str3;
    }
}
