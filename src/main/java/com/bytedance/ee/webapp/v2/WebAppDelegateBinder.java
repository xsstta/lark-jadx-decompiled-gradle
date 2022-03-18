package com.bytedance.ee.webapp.v2;

import android.os.RemoteException;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.webapp.v2.IWebAppBinderInterface;

public class WebAppDelegateBinder extends IWebAppBinderInterface.Stub {
    private int height;
    IWebAppBinderCallbackInterface mCallback;
    IWebLifeCycleListener mLifeCycleListener;

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public int getTabTitleBarHeight() throws RemoteException {
        return this.height;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void goBack() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.goBack();
        } else {
            C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so goBack failed");
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void goForward() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.goForward();
        } else {
            C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so goForward failed");
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public boolean canGoBack() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            return iWebAppBinderCallbackInterface.canGoBack();
        }
        C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so canGoBack failed");
        return false;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public boolean canGoForward() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            return iWebAppBinderCallbackInterface.canGoForward();
        }
        C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so canGoForward failed");
        return false;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public String getBotId() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            return iWebAppBinderCallbackInterface.getBotId();
        }
        C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so getBotId failed");
        return "";
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public boolean hasInit() throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.hasInit();
            return false;
        }
        C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so hasInit failed");
        return false;
    }

    public void notifyFirstDataLoaded() {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onFirstDataLoaded();
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyFirstDataLoaded , ", e);
            }
        }
    }

    public void notifyFirstFrameDraw() {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onFirstFrameDraw();
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyFirstFrameDraw , ", e);
            }
        }
    }

    public void notifyFirstFrameShow() {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onFirstFrameShow();
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyFirstFrameShow , ", e);
            }
        }
    }

    public void onCreateView() {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onCreateView();
            } catch (RemoteException e) {
                e.printStackTrace();
                C13479a.m54759a("WebAppDelegateBinder", "tab web onCreateView exception : ", e);
            }
        }
    }

    public void onResume() {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onResume();
            } catch (RemoteException e) {
                e.printStackTrace();
                C13479a.m54759a("WebAppDelegateBinder", "tab web onResume exception : ", e);
            }
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void setCallback(IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface) throws RemoteException {
        this.mCallback = iWebAppBinderCallbackInterface;
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void setWebLifecycleListener(IWebLifeCycleListener iWebLifeCycleListener) throws RemoteException {
        this.mLifeCycleListener = iWebLifeCycleListener;
    }

    public void notifyPageFinished(String str) {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onPageFinished(str);
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyPageFinished", e);
            }
        }
    }

    public void notifyPageStarted(String str) {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onPageStarted(str);
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyPageStarted", e);
            }
        }
    }

    public void notifyProgressChanged(int i) {
        IWebLifeCycleListener iWebLifeCycleListener = this.mLifeCycleListener;
        if (iWebLifeCycleListener != null) {
            try {
                iWebLifeCycleListener.onProgressChanged(i);
            } catch (RemoteException e) {
                C13479a.m54759a("WebAppDelegateBinder", "notifyProgressChanged", e);
            }
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void setTabTitleBarHeight(int i) throws RemoteException {
        C13479a.m54764b("WebAppDelegateBinder", "setTitleBarHeight = " + i);
        this.height = i;
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.setTabTitleBarHeight(i);
        } else {
            C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so setTabTitleBarHeight failed");
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void addCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.addCommonApp(str, iWebTabCallbackInterface);
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void removeCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.removeCommonApp(str, iWebTabCallbackInterface);
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void requestCommonApp(String str, IWebTabCallbackInterface iWebTabCallbackInterface) throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.requestCommonApp(str, iWebTabCallbackInterface);
        }
    }

    @Override // com.bytedance.ee.webapp.v2.IWebAppBinderInterface
    public void fireEvent(String str, String str2) throws RemoteException {
        IWebAppBinderCallbackInterface iWebAppBinderCallbackInterface = this.mCallback;
        if (iWebAppBinderCallbackInterface != null) {
            iWebAppBinderCallbackInterface.fireEvent(str, str2);
        } else {
            C13479a.m54758a("WebAppDelegateBinder", "not set mCallback so fireEvent failed");
        }
    }
}
