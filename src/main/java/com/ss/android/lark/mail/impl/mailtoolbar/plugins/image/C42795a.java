package com.ss.android.lark.mail.impl.mailtoolbar.plugins.image;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.C5627ab;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.fileselector.listener.SimpleDialogLifecycle;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.C57764ab;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"MAX_SIZE", "", "TAG", "", "changeBottomPadding", "", "fragment", "Landroidx/fragment/app/DialogFragment;", "dialog", "Landroid/app/Dialog;", "bottomMargin", "activity", "Landroidx/fragment/app/FragmentActivity;", "decorView", "Landroid/view/View;", "changeBottomPaddingByView", "view", "showMailInsertImageFragment", "viewModel", "Lcom/ss/android/lark/mail/impl/mailtoolbar/plugins/toolbar/MailToolbarViewModel;", "mail_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.a */
public final class C42795a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mail/impl/mailtoolbar/plugins/image/MailInsertImageUtilsKt$showMailInsertImageFragment$config$2", "Lcom/bytedance/ee/bear/fileselector/listener/SimpleDialogLifecycle;", "onCreateDialog", "", "dialog", "Landroid/app/Dialog;", "onDetach", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.a$c */
    public static final class C42798c extends SimpleDialogLifecycle {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f108971a;

        @Override // com.bytedance.ee.bear.fileselector.listener.SimpleDialogLifecycle, com.bytedance.ee.bear.fileselector.listener.IDialogLifecycle
        /* renamed from: e */
        public void mo30444e() {
            C41970e.m166941d().mo150950a(MailItemId.insertImage, 0);
        }

        C42798c(Ref.ObjectRef objectRef) {
            this.f108971a = objectRef;
        }

        @Override // com.bytedance.ee.bear.fileselector.listener.SimpleDialogLifecycle, com.bytedance.ee.bear.fileselector.listener.IDialogLifecycle
        /* renamed from: a */
        public void mo30440a(Dialog dialog) {
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            C42795a.m170581a(this.f108971a.element, dialog);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mail/impl/mailtoolbar/plugins/image/MailInsertImageUtilsKt$changeBottomPaddingByView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.a$a */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC42796a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f108964a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f108965b;

        public void onGlobalLayout() {
            this.f108964a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int[] iArr = new int[2];
            this.f108964a.getLocationOnScreen(iArr);
            C41970e.m166941d().mo150950a(MailItemId.insertImage, this.f108964a.getHeight());
            C42795a.m170579a(DeviceUtils.getRealScreenHeight(this.f108965b) - (iArr[1] + this.f108964a.getHeight()), this.f108965b, this.f108964a);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC42796a(View view, FragmentActivity fragmentActivity) {
            this.f108964a = view;
            this.f108965b = fragmentActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/ss/android/lark/mail/impl/mailtoolbar/plugins/image/MailInsertImageUtilsKt$showMailInsertImageFragment$config$1", "Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "mediaArrayList", "", "Lcom/ss/android/lark/mail/impl/mailtoolbar/plugins/image/ImageItem;", "callbackImageResourceViaJS", "", "imageList", "showPlaceholder", "", "onSelectFileBeanList", "fileBeanList", "", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.a$b */
    public static final class C42797b extends SimpleFileSelectListener {

        /* renamed from: a */
        final /* synthetic */ C42801c f108966a;

        /* renamed from: b */
        final /* synthetic */ C42815b f108967b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f108968c;

        /* renamed from: d */
        final /* synthetic */ C42799b f108969d;

        /* renamed from: e */
        private final List<ImageItem> f108970e = new ArrayList();

        @Override // com.bytedance.ee.bear.fileselector.api.IFileSelectListener, com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener
        /* renamed from: a */
        public void mo18019a(List<? extends FileBean> list) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(list, "fileBeanList");
            if (this.f108966a.getPermissionCode() != PermissionCode.VIEW) {
                List<? extends FileBean> list2 = list;
                if (!list2.isEmpty()) {
                    this.f108967b.clearSubToolbars();
                    C10548d.m43702b(this.f108968c);
                    ((C42262e) C42344d.m169091a(C42262e.class, this.f108968c)).mo152376a((String) null, false);
                    this.f108970e.clear();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list2);
                    for (T t : list) {
                        String path = t.getPath();
                        Intrinsics.checkExpressionValueIsNotNull(path, "media.path");
                        if (!StringsKt.isBlank(path)) {
                            arrayList.add(new File(t.getPath()));
                        }
                    }
                    long j = 0;
                    if (arrayList.isEmpty()) {
                        ((C42262e) C42344d.m169091a(C42262e.class, this.f108968c)).mo152372a("cancel", 0);
                        return;
                    }
                    if (arrayList2.size() != 1 || !((FileBean) arrayList2.get(0)).isVideo()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    PermissionCode permissionCode = this.f108966a.getPermissionCode();
                    ArrayList<File> arrayList3 = arrayList;
                    for (File file : arrayList3) {
                        if (file.exists()) {
                            j += file.length();
                        }
                    }
                    if (permissionCode == null || permissionCode == PermissionCode.NONE) {
                        Log.m165389i("InsertImageFragment", "process normal media");
                        if (!z || arrayList.size() != 1) {
                            Log.m165389i("InsertImageFragment", "process images");
                            for (File file2 : arrayList3) {
                                String a = C43785p.m173536a();
                                int[] a2 = C5627ab.m22837a(file2);
                                Intrinsics.checkExpressionValueIsNotNull(a, "uuid");
                                int i = a2[0];
                                int i2 = a2[1];
                                String name = file2.getName();
                                Intrinsics.checkExpressionValueIsNotNull(name, "file.name");
                                this.f108970e.add(new ImageItem(a, "cid:" + a, i, i2, name));
                                C42799b.mImgMap.put(a, file2.getPath());
                            }
                            m170582a(this, this.f108970e, false, 2, null);
                            return;
                        }
                        Log.m165389i("InsertImageFragment", "process video");
                        int a3 = C43785p.m173532a(((File) arrayList.get(0)).length(), this.f108966a.getSelectedAttachmentSize(), this.f108966a.getSelectedCalculationFileSize());
                        if (a3 != 0) {
                            Log.m165397w("InsertImageFragment", "process video file size exceed");
                            MailToast.m173700a(C43819s.m173686a(a3, "size", String.valueOf(3)));
                            ((C42262e) C42344d.m169091a(C42262e.class, this.f108968c)).mo152372a("cancel", j);
                            return;
                        }
                        this.f108966a.uploadVideo(((File) arrayList.get(0)).getPath());
                        this.f108966a.showKeyboardPanel();
                    } else if (permissionCode == PermissionCode.VIEW) {
                        Log.m165389i("InsertImageFragment", "process co edit image, do not respond for View");
                        ((C42262e) C42344d.m169091a(C42262e.class, this.f108968c)).mo152372a(ApiHandler.API_CALLBACK_EXCEPTION, j);
                    } else {
                        Log.m165389i("InsertImageFragment", "process co edit image");
                        if (arrayList.size() > 0) {
                            for (File file3 : arrayList3) {
                                String a4 = C43785p.m173536a();
                                int[] a5 = C5627ab.m22837a(file3);
                                Intrinsics.checkExpressionValueIsNotNull(a4, "uuid");
                                String path2 = file3.getPath();
                                Intrinsics.checkExpressionValueIsNotNull(path2, "file.path");
                                int i3 = a5[0];
                                int i4 = a5[1];
                                String name2 = file3.getName();
                                Intrinsics.checkExpressionValueIsNotNull(name2, "file.name");
                                this.f108970e.add(new ImageItem(a4, path2, i3, i4, name2));
                            }
                            m170583b(this.f108970e, true);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        private final void m170583b(List<ImageItem> list, boolean z) {
            boolean z2;
            Log.m165389i("InsertImageFragment", "callbackImageResourceViaJS image size: " + list.size());
            List<ImageItem> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((Object) "code", (Object) 0);
                jSONObject2.put((Object) "thumbs", JSONArray.toJSON(list));
                jSONObject2.put((Object) "isPlaceholder", (Object) Boolean.valueOf(z));
                this.f108969d.insertImages(jSONObject.toJSONString());
            }
        }

        C42797b(C42801c cVar, C42815b bVar, FragmentActivity fragmentActivity, C42799b bVar2) {
            this.f108966a = cVar;
            this.f108967b = bVar;
            this.f108968c = fragmentActivity;
            this.f108969d = bVar2;
        }

        /* renamed from: a */
        static /* synthetic */ void m170582a(C42797b bVar, List list, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            bVar.m170583b(list, z);
        }
    }

    /* renamed from: a */
    private static final void m170580a(View view, FragmentActivity fragmentActivity) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC42796a(view, fragmentActivity));
    }

    /* renamed from: a */
    public static final void m170581a(DialogInterface$OnCancelListenerC1021b bVar, Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "decorView");
            decorView.setElevation(BitmapDescriptorFactory.HUE_RED);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.getDecorView().setBackgroundColor(-1);
            if (bVar != null) {
                View decorView2 = window.getDecorView();
                Intrinsics.checkExpressionValueIsNotNull(decorView2, "decorView");
                FragmentActivity requireActivity = bVar.requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(requireActivity, "fragment.requireActivity()");
                m170580a(decorView2, requireActivity);
            }
        }
    }

    /* renamed from: a */
    public static final DialogInterface$OnCancelListenerC1021b m170578a(FragmentActivity fragmentActivity, C42815b bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AbstractC1142af a = new C1144ai(fragmentActivity2).mo6005a(C42799b.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(activi…ageViewModel::class.java)");
        AbstractC1142af a2 = new C1144ai(fragmentActivity2).mo6005a(C42801c.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "ViewModelProvider(activi…diaViewModel::class.java)");
        C42801c cVar = (C42801c) a2;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        FileSelectConfig a3 = ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) FileSelectConfig.ccmAlbumBuilder().mo30450c(3)).mo30452d(9)).mo30453d(true)).mo30447a(true)).mo30467g(2).mo30449b(cVar.supportVideo())).mo30473k(true).mo30474l(true).mo30469h(true).mo30471i(false).mo30463g(true)).mo30462f(2048)).mo30459a(new C42797b(cVar, bVar, fragmentActivity, (C42799b) a))).mo30465a(new C42798c(objectRef)).mo30455a();
        Log.m165389i("InsertImageFragment", "FileSelectorManager.selectFile");
        FileSelectorManager.Companion aVar = FileSelectorManager.f21081a;
        FragmentActivity fragmentActivity3 = fragmentActivity;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        Intrinsics.checkExpressionValueIsNotNull(a3, "config");
        objectRef.element = (T) aVar.mo30481a(fragmentActivity3, supportFragmentManager, a3, MailItemId.insertImage.name());
        return objectRef.element;
    }

    /* renamed from: a */
    public static final void m170579a(int i, FragmentActivity fragmentActivity, View view) {
        int i2;
        if (C57764ab.m224186a((Activity) fragmentActivity)) {
            view.setElevation(BitmapDescriptorFactory.HUE_RED);
            if (i < 60) {
                i2 = C43785p.m173530a(35);
            } else {
                i2 = 0;
            }
            view.setPadding(0, 0, 0, i2);
        }
    }
}
