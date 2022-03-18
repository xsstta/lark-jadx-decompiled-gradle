package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

public abstract class NotificationCompatSideChannelService extends Service {
    /* renamed from: a */
    public abstract void mo4219a(String str);

    /* renamed from: a */
    public abstract void mo4220a(String str, int i, String str2);

    /* renamed from: a */
    public abstract void mo4221a(String str, int i, String str2, Notification notification);

    private class NotificationSideChannelStub extends INotificationSideChannel.Stub {
        NotificationSideChannelStub() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.mo4218a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo4219a(str);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.mo4218a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo4220a(str, i, str2);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.mo4218a(getCallingUid(), str);
            long clearCallingIdentity = clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo4221a(str, i, str2, notification);
            } finally {
                restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4218a(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }
}
