package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import com.larksuite.suite.R;

public final class maa {
    /* renamed from: a */
    public static View m86183a(Activity activity, mam mam, ViewGroup viewGroup, Bundle bundle) {
        View view;
        try {
            Bundle a = mbw.m86521a(bundle);
            Context b = mbv.m86517b(activity);
            if (mam != null) {
                mcq.m86886b("MapFragmentUtil", "sdk onCreateView iMapFragmentDelegate".concat(String.valueOf(mam)));
                view = (View) ObjectWrapper.unwrap(mam.mo83975a(ObjectWrapper.wrap(LayoutInflater.from(b)), ObjectWrapper.wrap(viewGroup), a));
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        mcq.m86886b("MapFragmentUtil", "onCreateView: removeView");
                        ((ViewGroup) parent).removeView(view);
                    }
                }
            } else {
                view = LayoutInflater.from(b).inflate(R.layout.empty_layout, (ViewGroup) null);
            }
            mbw.m86521a(a);
            return view;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
