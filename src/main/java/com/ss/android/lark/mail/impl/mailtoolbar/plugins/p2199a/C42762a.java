package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.content.res.C0760e;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.C1382h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.FilePicker;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42780d;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42256d;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.a */
public class C42762a extends AbstractC6207c {

    /* renamed from: c */
    public C42776b f108905c;

    /* renamed from: d */
    public View f108906d;

    /* renamed from: e */
    public View f108907e;

    /* renamed from: f */
    public RecyclerView f108908f;

    /* renamed from: g */
    public C42780d f108909g;

    /* renamed from: h */
    public List<FileEntry> f108910h;

    /* renamed from: i */
    private final String f108911i = "MailAttachmentPickerFragment";

    /* renamed from: j */
    private View f108912j;

    /* renamed from: k */
    private View f108913k;

    /* renamed from: l */
    private View f108914l;

    /* renamed from: m */
    private GridLayoutManager f108915m;

    /* renamed from: n */
    private int f108916n;

    /* renamed from: o */
    private int f108917o;

    /* renamed from: p */
    private View f108918p;

    /* renamed from: g */
    public void mo153571g() {
        Log.m165389i("MailAttachmentPickerFragment", "startReceivedFilePicker");
        m170539a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.AnonymousClass11 */

            public void run() {
                long j;
                String str;
                boolean a = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2");
                if (a) {
                    j = 3221225472L;
                } else {
                    j = 26214400 - C42762a.this.f108905c.getSelectedCalculationFileSize();
                }
                if (a) {
                    str = C43819s.m173686a(R.string.Mail_Attachment_FailedToSend, "size", String.valueOf(3));
                } else {
                    str = C43819s.m173684a((int) R.string.Mail_Attachment_OverLimit);
                }
                C41816b.m166115a().mo150156w().mo150163a(C42762a.this.getActivity(), 2333, j, str, C43819s.m173684a((int) R.string.Mail_Attachment_ReceivedFiles));
            }
        });
    }

    /* renamed from: h */
    public void mo153572h() {
        Log.m165389i("MailAttachmentPickerFragment", "startSystemFilePicker");
        m170539a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.RunnableC427653 */

            public void run() {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    FragmentActivity activity = C42762a.this.getActivity();
                    if (activity != null) {
                        activity.startActivityForResult(Intent.createChooser(intent, ""), 2334);
                    }
                } catch (Exception e) {
                    Log.m165384e("MailAttachmentPickerFragment", "startSystemFilePicker", e);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        Log.m165389i("MailAttachmentPickerFragment", "getContentView");
        m170538a(this.f108906d);
        return this.f108906d;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C41970e.m166941d().mo150950a(MailItemId.attachment, 0);
    }

    /* renamed from: j */
    private void m170540j() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mail_attachment_picker_fragment, (ViewGroup) null);
        this.f108906d = inflate;
        View findViewById = inflate.findViewById(R.id.received_file_title_container_more);
        this.f108912j = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.View$OnClickListenerC427706 */

            public void onClick(View view) {
                C42762a.this.mo153571g();
            }
        });
        View findViewById2 = this.f108906d.findViewById(R.id.received_file_title_container_right_arrow);
        this.f108913k = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.View$OnClickListenerC427717 */

            public void onClick(View view) {
                C42762a.this.mo153571g();
            }
        });
        this.f108907e = this.f108906d.findViewById(R.id.empty_list_hint_container);
        this.f108908f = (RecyclerView) this.f108906d.findViewById(R.id.lark_file_list_view);
    }

    /* renamed from: f */
    public void mo22132f() {
        int i;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), this.f108917o, 0, false);
        this.f108915m = gridLayoutManager;
        this.f108908f.setLayoutManager(gridLayoutManager);
        C1382h hVar = new C1382h(getContext(), 0);
        Resources resources = getResources();
        if (this.f108917o == 1) {
            i = R.drawable.mail_attachment_picker_1_item_horizontal_divider_drawable;
        } else {
            i = R.drawable.mail_attachment_picker_2_items_horizontal_divider_drawable;
        }
        Drawable a = C0760e.m3682a(resources, i, null);
        if (a != null) {
            hVar.mo7418a(a);
        }
        this.f108908f.addItemDecoration(hVar);
        this.f108909g = new C42780d(getContext(), new C42780d.AbstractC42782a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.C427728 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42780d.AbstractC42782a
            /* renamed from: a */
            public void mo153584a(int i, final Uri uri) {
                Log.m165389i("MailAttachmentPickerFragment", "onItemClicked: " + i);
                CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.C427728.RunnableC427731 */

                    public void run() {
                        try {
                            if (TextUtils.isEmpty(LarkUriUtil.m95300a(C41816b.m166115a().mo150132b(), uri))) {
                                Log.m165383e("MailAttachmentPickerFragment", "onItemClicked invalid file");
                                return;
                            }
                            int a = C43785p.m173532a(LarkUriUtil.m95302b(C41816b.m166115a().mo150132b(), uri), C42762a.this.f108905c.getSelectedAttachmentSize(), C42762a.this.f108905c.getSelectedCalculationFileSize());
                            if (a != 0) {
                                Log.m165383e("MailAttachmentPickerFragment", "onItemClicked file size exceed");
                                MailToast.m173700a(C43819s.m173686a(a, "size", String.valueOf(3)));
                                C42209j.m168612a("send_insert_attachment_overlimit", "toast");
                                return;
                            }
                            if (C42762a.this.getContext() != null) {
                                ((C42256d) C42344d.m169091a(C42256d.class, C42762a.this.getContext())).mo152376a((String) null, false);
                            }
                            C43849u.m173826a(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.C427728.RunnableC427731.RunnableC427741 */

                                public void run() {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(uri);
                                    C42762a.this.f108905c.uploadAttachments(arrayList);
                                }
                            });
                        } catch (Exception e) {
                            Log.m165390i("MailAttachmentPickerFragment", "onItemClicked", e);
                        }
                    }
                });
            }
        }, this.f108916n);
        C1382h hVar2 = new C1382h(getContext(), 1);
        Drawable a2 = C0760e.m3682a(getResources(), R.drawable.mail_attachment_picker_vertical_divider_drawable, null);
        if (a2 != null) {
            hVar2.mo7418a(a2);
        }
        this.f108908f.addItemDecoration(hVar2);
        this.f108908f.setAdapter(this.f108909g);
        View findViewById = this.f108906d.findViewById(R.id.local_file_title_container);
        this.f108914l = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.View$OnClickListenerC427759 */

            public void onClick(View view) {
                Log.m165389i("MailAttachmentPickerFragment", "localFileContainer onClick");
                C42762a.this.mo153572h();
            }
        });
    }

    /* renamed from: a */
    private void m170538a(final View view) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.ViewTreeObserver$OnGlobalLayoutListenerC427631 */

                public void onGlobalLayout() {
                    int i;
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int height = iArr[1] + view.getHeight();
                    C41970e.m166941d().mo150950a(MailItemId.attachment, view.getHeight());
                    if (DeviceUtils.getRealScreenHeight(C42762a.this.getContext()) - height < 60) {
                        i = C43785p.m173530a(35);
                    } else {
                        i = 0;
                    }
                    C42762a.this.mo153567a(i);
                    C42762a.this.mo153569b(i);
                    C42762a.this.mo22132f();
                    if (C42762a.this.f108910h != null) {
                        C42762a aVar = C42762a.this;
                        aVar.mo153570b(aVar.f108910h);
                        C42762a.this.f108910h = null;
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo153570b(final List<FileEntry> list) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.AnonymousClass10 */

            public void run() {
                if (C42762a.this.f108909g == null) {
                    C42762a.this.f108910h = list;
                    return;
                }
                if (CollectionUtils.isEmpty(list)) {
                    C42762a.this.f108908f.setVisibility(8);
                    C42762a.this.f108907e.setVisibility(0);
                } else {
                    C42762a.this.f108908f.setVisibility(0);
                    C42762a.this.f108907e.setVisibility(8);
                }
                C42762a.this.f108909g.mo153596a(list);
            }
        });
    }

    /* renamed from: a */
    private void m170539a(final Runnable runnable) {
        C57805b.m224333d(getActivity(), new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.C427642 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    Log.m165389i("MailAttachmentPickerFragment", "checkFilePermissionToGo run");
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        C43849u.m173826a(runnable);
                        return;
                    }
                    return;
                }
                Log.m165389i("MailAttachmentPickerFragment", "checkFilePermissionToGo permission denied");
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        if (!(a == null || a.getWindow() == null)) {
            this.f108918p = a.getWindow().getDecorView();
            a.getWindow().getDecorView().setElevation(BitmapDescriptorFactory.HUE_RED);
            a.getWindow().getDecorView().setPadding(0, 0, 0, 0);
            a.getWindow().getDecorView().setBackgroundColor(-1);
        }
        return a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Log.m165389i("MailAttachmentPickerFragment", "onCreate");
        super.onCreate(bundle);
        this.f108905c = (C42776b) aj.m5366a(getActivity()).mo6005a(C42776b.class);
        m170540j();
        m170539a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.RunnableC427664 */

            public void run() {
                FilePicker.f12248b.mo15803a(C42762a.this.f108906d.getContext(), new IGetDataCallback<List<FileEntry>>() {
                    /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.RunnableC427664.C427671 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("MailAttachmentPickerFragment", "fetchReceivedFiles onError");
                    }

                    /* renamed from: a */
                    public void onSuccess(final List<FileEntry> list) {
                        Log.m165389i("MailAttachmentPickerFragment", "fetchReceivedFiles onSuccess");
                        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.RunnableC427664.C427671.RunnableC427681 */

                            public void run() {
                                ArrayList arrayList = new ArrayList(list);
                                C42762a.this.mo153568a(arrayList);
                                C42762a.this.mo153570b(arrayList);
                            }
                        });
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void mo153567a(int i) {
        if (this.f108918p != null && getActivity() != null && C57764ab.m224186a((Activity) getActivity())) {
            this.f108918p.setElevation(BitmapDescriptorFactory.HUE_RED);
            this.f108918p.setPadding(0, 0, 0, i);
        }
    }

    /* renamed from: b */
    public void mo153569b(int i) {
        this.f108917o = 1;
        this.f108916n = UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_1_row_item_default_height);
        View view = this.f108906d;
        if (view != null && view.getHeight() != 0) {
            int height = (((this.f108906d.getHeight() - (UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_bar_height) * 2)) - (UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_item_horizontal_space) * 2)) - UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_received_file_container_bottom_padding)) - i;
            int i2 = height / 2;
            if (i2 >= UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_2_row_item_min_height)) {
                this.f108917o = 2;
                this.f108916n = i2;
                return;
            }
            this.f108917o = 1;
            this.f108916n = height;
        }
    }

    /* renamed from: a */
    public void mo153568a(List<FileEntry> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Collections.sort(list, new Comparator<FileEntry>() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42762a.C427695 */

                /* renamed from: a */
                public int compare(FileEntry fileEntry, FileEntry fileEntry2) {
                    if (fileEntry == null || fileEntry2 == null) {
                        return 0;
                    }
                    if (fileEntry.getLastModifyTime() > fileEntry2.getLastModifyTime()) {
                        return -1;
                    }
                    if (fileEntry.getLastModifyTime() == fileEntry2.getLastModifyTime()) {
                        return 0;
                    }
                    return 1;
                }
            });
        }
    }
}
