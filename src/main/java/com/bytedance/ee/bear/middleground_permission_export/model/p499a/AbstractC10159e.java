package com.bytedance.ee.bear.middleground_permission_export.model.p499a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.component.universe_design.image.UDAvatar;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.a.e */
public interface AbstractC10159e {
    /* renamed from: a */
    View mo36660a(Context context);

    /* renamed from: a */
    View mo36661a(Context context, String str, String str2, int i, String str3, boolean z);

    /* renamed from: a */
    View mo36662a(Context context, String str, boolean z);

    /* renamed from: a */
    View mo36663a(Context context, boolean z, String str, boolean z2);

    /* renamed from: a */
    View mo36664a(FragmentActivity fragmentActivity, int i, String str, String str2);

    /* renamed from: a */
    View mo36665a(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, FolderVersion folderVersion, boolean z, boolean z2);

    /* renamed from: a */
    View mo36666a(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, boolean z, boolean z2);

    /* renamed from: a */
    DialogInterface$OnCancelListenerC1021b mo36667a(FragmentActivity fragmentActivity, String str, int i, boolean z, Runnable runnable);

    /* renamed from: a */
    void mo36669a(Activity activity, String str);

    /* renamed from: a */
    void mo36670a(Context context, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AbstractC10154a aVar, String str2, boolean z6, boolean z7);

    /* renamed from: a */
    void mo36671a(FragmentActivity fragmentActivity, DocPermSetInfo docPermSetInfo, ArrayList<UserInfo> arrayList, String str, boolean z);

    /* renamed from: a */
    void mo36672a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, String str4);

    /* renamed from: a */
    void mo36673a(FragmentActivity fragmentActivity, String str, C8275a aVar, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, boolean z5);

    /* renamed from: a */
    void mo36674a(FragmentActivity fragmentActivity, String str, String str2, String str3, ArrayList<UserInfo> arrayList);

    /* renamed from: a */
    void mo36675a(FragmentManager fragmentManager, int i, String str, C8275a aVar, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, String str4, String str5, String str6);

    /* renamed from: a */
    void mo36676a(FragmentManager fragmentManager, int i, boolean z, int i2, boolean z2, boolean z3, String str, int i3, String str2, boolean z4, boolean z5, String str3, String str4, String str5);

    /* renamed from: a */
    void mo36677a(UDAvatar uDAvatar, UserInfo userInfo);

    /* renamed from: b */
    Fragment mo36678b(FragmentManager fragmentManager, String str, int i, int i2, boolean z, Runnable runnable);
}
