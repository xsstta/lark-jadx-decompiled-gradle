package com.larksuite.component.openplatform.plugins.device.nfc;

/* renamed from: com.larksuite.component.openplatform.plugins.device.nfc.d */
public class C25596d {
    /* renamed from: a */
    public static String m91337a(String str) {
        if (str.endsWith("NfcA")) {
            return "NFC-A";
        }
        if (str.endsWith("NfcB")) {
            return "NFC-B";
        }
        if (str.endsWith("MifareClassic")) {
            return "MIFARE-Classic";
        }
        if (str.endsWith("NfcV")) {
            return "NFC-V";
        }
        if (str.endsWith("NfcF")) {
            return "NFC-F";
        }
        if (str.endsWith("IsoDep")) {
            return "ISO-DEP";
        }
        if (str.endsWith("Ndef")) {
            return "NDEF";
        }
        if (str.endsWith("MifareUltralight")) {
            return "MIFARE-Ultralight";
        }
        if (str.endsWith("NdefFormatable")) {
            return "NDEF-Formatable";
        }
        return "";
    }
}
