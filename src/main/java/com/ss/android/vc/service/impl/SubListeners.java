package com.ss.android.vc.service.impl;

import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.dependency.AbstractC60880ae;
import com.ss.android.vc.dependency.AbstractC60885b;
import com.ss.android.vc.dependency.AbstractC60894j;
import com.ss.android.vc.dependency.AbstractC60897m;
import com.ss.android.vc.dependency.AbstractC60912x;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.Locale;

public class SubListeners {

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class AccountChangeListener implements AbstractC60885b {

        /* renamed from: com.ss.android.vc.service.impl.SubListeners$AccountChangeListener$a */
        private static class C63654a {

            /* renamed from: a */
            public static AccountChangeListener f160677a = new AccountChangeListener();
        }

        private AccountChangeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static AccountChangeListener m249573a() {
            return C63654a.f160677a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60885b
        @XMethod
        public void onAccountChange(String str) {
            VcBizService.initForFeedback();
            VideoChatModule.m235665i().mo208194a(str);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class ConnStateListener implements AbstractC60894j {

        /* renamed from: com.ss.android.vc.service.impl.SubListeners$ConnStateListener$a */
        private static class C63655a {

            /* renamed from: a */
            public static ConnStateListener f160678a = new ConnStateListener();
        }

        private ConnStateListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static ConnStateListener m249574a() {
            return C63655a.f160678a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60894j
        @XMethod
        public void onConnStateChanged(boolean z) {
            VideoChatModule.m235665i().mo208196a(z);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class DeviceIdChangeListener implements AbstractC60897m.AbstractC60898a {

        /* renamed from: com.ss.android.vc.service.impl.SubListeners$DeviceIdChangeListener$a */
        private static class C63656a {

            /* renamed from: a */
            public static DeviceIdChangeListener f160679a = new DeviceIdChangeListener();
        }

        private DeviceIdChangeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static DeviceIdChangeListener m249575a() {
            return C63656a.f160679a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60897m.AbstractC60898a
        @XMethod
        public void onDeviceIdChange(String str) {
            VideoChatModule.m235665i().mo208200b(str);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class LoginChangeListener implements AbstractC60912x.AbstractC60913a {

        /* renamed from: com.ss.android.vc.service.impl.SubListeners$LoginChangeListener$a */
        private static class C63657a {

            /* renamed from: a */
            public static LoginChangeListener f160680a = new LoginChangeListener();
        }

        private LoginChangeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static LoginChangeListener m249576a() {
            return C63657a.f160680a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60912x.AbstractC60913a
        @XMethod
        public void onLoginStatusChangedEvent(int i) {
            VideoChatModule.m235665i().mo208188a(i);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class OnLanguageChangeListener implements AbstractC60880ae {

        /* renamed from: com.ss.android.vc.service.impl.SubListeners$OnLanguageChangeListener$a */
        private static class C63658a {

            /* renamed from: a */
            public static OnLanguageChangeListener f160681a = new OnLanguageChangeListener();
        }

        private OnLanguageChangeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static OnLanguageChangeListener m249577a() {
            return C63658a.f160681a;
        }

        @Override // com.ss.android.vc.dependency.AbstractC60880ae
        @XMethod
        public void onLanguageChange(Locale locale, Locale locale2) {
            VideoChatModule.m235665i().mo208195a(locale, locale2);
        }
    }
}
