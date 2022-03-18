package com.ss.lark.android.avatar.p3206b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.utils.p2905b.C57811b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58648a;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.lark.android.avatar.ui.AvatarPreviewActivity;
import com.ss.lark.android.avatar.ui.AvatarSource;
import com.ss.lark.android.avatar.ui.C64236d;
import com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.lark.android.avatar.b.a */
public class C64201a {
    /* renamed from: a */
    public static C64207a m252504a() {
        return new C64207a();
    }

    /* renamed from: com.ss.lark.android.avatar.b.a$a */
    public static class C64207a {

        /* renamed from: a */
        private Bundle f162318a = new Bundle();

        /* renamed from: b */
        private View f162319b;

        /* renamed from: c */
        private BaseData.AnimationType f162320c = BaseData.AnimationType.TRANSLATE_ANIMATION;

        /* renamed from: a */
        public C64207a mo222604a() {
            this.f162318a.putInt("direct_pick_photo", 2);
            return this;
        }

        /* renamed from: b */
        public C64207a mo222614b() {
            this.f162318a.putInt("direct_pick_photo", 1);
            return this;
        }

        /* renamed from: a */
        public C64207a mo222606a(View view) {
            this.f162319b = view;
            return this;
        }

        /* renamed from: a */
        public C64207a mo222605a(int i) {
            this.f162318a.putInt("current_item", i);
            return this;
        }

        /* renamed from: b */
        public C64207a mo222615b(String str) {
            this.f162318a.putString("failed_upload_toast", str);
            return this;
        }

        /* renamed from: a */
        public C64207a mo222607a(BaseData.AnimationType animationType) {
            this.f162320c = animationType;
            return this;
        }

        /* renamed from: a */
        public C64207a mo222608a(AvatarSource avatarSource) {
            this.f162318a.putSerializable("avatar_source", avatarSource);
            return this;
        }

        /* renamed from: a */
        public C64207a mo222609a(IUpdateAvatarAPI iUpdateAvatarAPI) {
            this.f162318a.putSerializable("extra_updateapi", iUpdateAvatarAPI);
            return this;
        }

        /* renamed from: a */
        public C64207a mo222610a(String str) {
            this.f162318a.putString("extra_toolbar_text", str);
            return this;
        }

        /* renamed from: a */
        public C64207a mo222611a(ArrayList<PhotoItem> arrayList) {
            al.m95028a().mo93366a("key_photos_preview", arrayList);
            this.f162318a.putString("key_photos_preview", "key_photos_preview");
            return this;
        }

        /* renamed from: a */
        public C64207a mo222612a(boolean z) {
            this.f162318a.putBoolean("show_save", z);
            return this;
        }

        /* renamed from: a */
        public void mo222613a(Activity activity, Fragment fragment, int i) {
            if (!DesktopUtil.m144301a((Context) activity)) {
                Intent a = AvatarPreviewActivity.m252564a(activity, this.f162318a);
                if (a != null) {
                    C58648a.m227466a(activity, a, this.f162320c, this.f162319b, null);
                    if (Navigation.from(activity).openActivity(a, i)) {
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            C64236d dVar = new C64236d();
            dVar.setArguments(this.f162318a);
            FloatWindowParams a2 = new FloatWindowParams.C36567a().mo134945a("AvatarPreviewLauncher").mo134930b();
            dVar.setFragmentParams(a2);
            if (fragment instanceof C36516a) {
                C36512a.m144041a().mo134760a((C36516a) fragment, dVar, a2, i);
            } else {
                C36512a.m144041a().mo134762a(dVar, a2);
            }
        }
    }

    /* renamed from: a */
    private static void m252506a(final Activity activity, final View view, final int i, final IUpdateAvatarAPI iUpdateAvatarAPI) {
        View inflate = UIUtils.inflate(activity, R.layout.modify_avatar_bottom_popupwindow, null);
        final Dialog a = C57811b.m224341a(activity, inflate);
        C57810a.m224336a(activity, a);
        inflate.findViewById(R.id.take_picture_tv).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.lark.android.avatar.p3206b.C64201a.C642021 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m165389i("AvatarPreviewLauncher", "showModifyAvatarPopup going to take picture");
                C64201a.m252504a().mo222606a(view).mo222607a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo222614b().mo222609a(iUpdateAvatarAPI).mo222613a(activity, null, i);
            }
        });
        inflate.findViewById(R.id.select_from_gallery_tv).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.lark.android.avatar.p3206b.C64201a.C642032 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m165389i("AvatarPreviewLauncher", "showModifyAvatarPopup going to select from gallery");
                C64201a.m252504a().mo222606a(view).mo222607a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo222604a().mo222609a(iUpdateAvatarAPI).mo222613a(activity, null, i);
            }
        });
        inflate.findViewById(R.id.cancel_tv).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.lark.android.avatar.p3206b.C64201a.C642043 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Dialog dialog = a;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m165389i("AvatarPreviewLauncher", "showModifyAvatarPopup cancel");
            }
        });
    }

    /* renamed from: a */
    public static void m252509a(Fragment fragment, Activity activity, View view, int i, IUpdateAvatarAPI iUpdateAvatarAPI) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            m252506a(activity, view, i, iUpdateAvatarAPI);
        } else {
            m252510b(fragment, activity, view, i, iUpdateAvatarAPI);
        }
    }

    /* renamed from: b */
    private static void m252510b(final Fragment fragment, final Activity activity, final View view, final int i, final IUpdateAvatarAPI iUpdateAvatarAPI) {
        new C25639g(fragment.getContext()).mo89249h(16).mo89248g(R.string.Lark_Legacy_EditPhoto).mo89246d(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ChooseFromPhotolibrary, new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.avatar.p3206b.C64201a.DialogInterface$OnClickListenerC642065 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                Log.m165389i("AvatarPreviewLauncher", "showModifyAvatarPopup going to select from gallery");
                C64201a.m252504a().mo222606a(view).mo222607a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo222604a().mo222609a(iUpdateAvatarAPI).mo222613a(activity, fragment, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_ModifyAvatarCancel, new DialogInterface.OnClickListener() {
            /* class com.ss.lark.android.avatar.p3206b.C64201a.DialogInterface$OnClickListenerC642054 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                Log.m165389i("AvatarPreviewLauncher", "showModifyAvatarPopup cancel");
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public static void m252507a(Activity activity, View view, IUpdateAvatarAPI iUpdateAvatarAPI, String str, int i, AvatarSource avatarSource) {
        m252504a().mo222606a(view).mo222607a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo222604a().mo222609a(iUpdateAvatarAPI).mo222615b(str).mo222608a(avatarSource).mo222613a(activity, null, i);
    }

    /* renamed from: a */
    private static C64207a m252505a(Context context, String str, String str2, View view, String str3, AvatarSource avatarSource) {
        Log.m165389i("AvatarPreviewLauncher", "Entering gotoPreview");
        if (context == null || TextUtils.isEmpty(str) || view == null) {
            Log.m165389i("AvatarPreviewLauncher", "Error params gotoPreview");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ArrayList<PhotoItem> arrayList2 = (ArrayList) C58659h.m227517b(arrayList);
        Iterator<PhotoItem> it = arrayList2.iterator();
        if (it.hasNext()) {
            it.next().setEntityId(str2);
        }
        return m252504a().mo222606a(view).mo222611a(arrayList2).mo222605a(0).mo222607a(BaseData.AnimationType.TRANSLATE_ANIMATION).mo222612a(false).mo222615b(str3).mo222608a(avatarSource);
    }

    /* renamed from: a */
    public static void m252508a(Context context, String str, String str2, View view, String str3, IUpdateAvatarAPI iUpdateAvatarAPI, String str4, int i, AvatarSource avatarSource) {
        C64207a a = m252505a(context, str, str2, view, str4, avatarSource);
        if (a != null) {
            a.mo222610a(str3);
            a.mo222609a(iUpdateAvatarAPI);
            a.mo222613a((Activity) context, null, i);
        }
    }
}
