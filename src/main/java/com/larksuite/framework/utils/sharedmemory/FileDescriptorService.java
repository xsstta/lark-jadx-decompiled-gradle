package com.larksuite.framework.utils.sharedmemory;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class FileDescriptorService extends Service {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, ParcelFileDescriptor> f64962a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, Integer> f64963b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private final Messenger f64964c = new Messenger(new HandlerC26319a());

    /* renamed from: com.larksuite.framework.utils.sharedmemory.FileDescriptorService$a */
    private static class HandlerC26319a extends Handler {
        private HandlerC26319a() {
        }

        public void handleMessage(Message message) {
            int i;
            int i2 = message.what;
            if (i2 == 100) {
                Bundle data = message.getData();
                String string = data.getString("key");
                int i3 = data.getInt("len");
                FileDescriptorService.f64962a.put(string, (ParcelFileDescriptor) data.getParcelable("pfd"));
                FileDescriptorService.f64963b.put(string, Integer.valueOf(i3));
            } else if (i2 != 200) {
                super.handleMessage(message);
            } else {
                Messenger messenger = message.replyTo;
                String string2 = message.getData().getString("key");
                Message obtain = Message.obtain();
                if (FileDescriptorService.f64962a.get(string2) == null) {
                    Log.m165389i("FileDescriptorService", "key= " + string2 + ", has no data");
                }
                Bundle bundle = new Bundle();
                ParcelFileDescriptor parcelFileDescriptor = FileDescriptorService.f64962a.get(string2);
                try {
                    i = FileDescriptorService.f64963b.get(string2).intValue();
                } catch (Exception e) {
                    Log.m165386e("FileDescriptorService", e);
                    i = 0;
                }
                try {
                    Method declaredMethod = ParcelFileDescriptor.class.getDeclaredMethod("seekTo", Long.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(parcelFileDescriptor, 0);
                } catch (Exception e2) {
                    Log.m165386e("FileDescriptorService", e2);
                }
                bundle.putParcelable("pfd", parcelFileDescriptor);
                bundle.putInt("len", i);
                bundle.putString("key", string2);
                obtain.setData(bundle);
                try {
                    messenger.send(obtain);
                } catch (RemoteException e3) {
                    Log.m165386e("FileDescriptorService", e3);
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f64964c.getBinder();
    }
}
