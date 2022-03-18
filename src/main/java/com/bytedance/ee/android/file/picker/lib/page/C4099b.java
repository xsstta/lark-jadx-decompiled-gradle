package com.bytedance.ee.android.file.picker.lib.page;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.local.C4073f;
import com.bytedance.ee.android.file.picker.lib.page.C4105e;
import com.bytedance.ee.android.file.picker.lib.statistics.FilePickerHitPoint;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* renamed from: com.bytedance.ee.android.file.picker.lib.page.b */
public class C4099b extends C36516a implements C4073f.AbstractC4078b {

    /* renamed from: a */
    public View f12426a;

    /* renamed from: b */
    private String[] f12427b = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: c */
    private C4102d f12428c;

    /* renamed from: d */
    private C4105e.AbstractC4111a f12429d = new C4105e.AbstractC4111a() {
        /* class com.bytedance.ee.android.file.picker.lib.page.C4099b.C41001 */

        @Override // com.bytedance.ee.android.file.picker.lib.page.C4105e.AbstractC4111a
        /* renamed from: a */
        public void mo16047a() {
            if (C4099b.this.getActivity() instanceof FilePickerActivity) {
                C4099b.this.getActivity().finish();
            } else {
                C4099b.this.finish();
            }
        }

        @Override // com.bytedance.ee.android.file.picker.lib.page.C4105e.AbstractC4111a
        /* renamed from: b */
        public void mo16049b() {
            try {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.addFlags(64);
                intent.addFlags(1);
                C4099b.this.startActivityForResult(intent, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            } catch (ActivityNotFoundException e) {
                C4048c.m16857b("no file manager, " + e.getMessage());
                LKUIToast.show(C4099b.this.getContext(), (int) R.string.Lark_Groups_Failed);
            }
        }

        @Override // com.bytedance.ee.android.file.picker.lib.page.C4105e.AbstractC4111a
        /* renamed from: a */
        public void mo16048a(C4105e eVar) {
            eVar.f12435c = (MagicIndicator) C4099b.this.f12426a.findViewById(R.id.indicator);
            eVar.f12437e = (CommonTitleBar) C4099b.this.f12426a.findViewById(R.id.titlebar);
            eVar.f12436d = (ViewPager) C4099b.this.f12426a.findViewById(R.id.view_pager);
            eVar.f12438f = (ViewGroup) C4099b.this.f12426a.findViewById(R.id.content_root);
        }
    };

    /* renamed from: g */
    private void m17074g() {
        ActivityCompat.requestPermissions(getActivity(), this.f12427b, 321);
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: d */
    public String mo15997d() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("extra.over.select.file.size.text.tips");
        }
        return null;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: e */
    public String mo15998e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("extra.over.select.single.file.size.text.tips");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C4102d dVar = this.f12428c;
        if (dVar != null) {
            dVar.mo15856c();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: a */
    public int mo15993a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("extra.max.num", Integer.MAX_VALUE);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: b */
    public long mo15995b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("extra.max.select.file.size", Long.MAX_VALUE);
        }
        return Long.MAX_VALUE;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: c */
    public long mo15996c() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("extra.max.single.select.size", Long.MAX_VALUE);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    private void m17073f() {
        String[] strArr = this.f12427b;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (ContextCompat.checkSelfPermission(getActivity(), strArr[i]) != 0) {
                break;
            }
            i++;
        }
        if (z) {
            m17075h();
        } else {
            m17074g();
        }
    }

    /* renamed from: h */
    private void m17075h() {
        int i = getArguments().getInt("action", 0);
        String string = getArguments().getString("extra.custom.title", null);
        String string2 = getArguments().getString("extra.custom.send.btn", null);
        boolean z = getArguments().getBoolean("extra.show.filter.menu", false);
        C4102d dVar = new C4102d(getActivity(), getChildFragmentManager(), this.f12429d, i, getArguments().getInt("extra.file.type", 202000), string, string2, z, this);
        this.f12428c = dVar;
        dVar.j_();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m17073f();
    }

    /* renamed from: a */
    private boolean m17072a(long j) {
        long c = mo15996c();
        String e = mo15998e();
        if (j <= c) {
            return true;
        }
        new C25639g(getContext()).mo89242c(e).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_DialogOk, (DialogInterface.OnClickListener) null).mo89239c();
        FilePickerHitPoint.f12299a.mo15891a(String.valueOf(j));
        return false;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.C4073f.AbstractC4078b
    /* renamed from: a */
    public void mo15994a(List<Uri> list, long j) {
        if (list == null || list.isEmpty()) {
            C4048c.m16857b("finishing activity with no file selected");
        } else {
            C4048c.m16858c("selected local files:" + list.size());
            Intent intent = new Intent();
            ArrayList arrayList = new ArrayList();
            for (Uri uri : list) {
                if (LarkUriUtil.m95311g(LarkContext.getApplication(), uri)) {
                    arrayList.add(new ClipData.Item(uri));
                } else {
                    C4048c.m16857b("cannot open uri: " + uri);
                }
            }
            if (!arrayList.isEmpty()) {
                ClipData clipData = new ClipData(new ClipDescription("lark file picker", new String[]{"text/uri-list"}), (ClipData.Item) arrayList.get(0));
                for (int i = 1; i < arrayList.size(); i++) {
                    clipData.addItem((ClipData.Item) arrayList.get(i));
                }
                intent.setClipData(clipData);
                intent.putExtra("extra.select.file.size", j);
                if (getActivity() instanceof FilePickerActivity) {
                    getActivity().setResult(-1, intent);
                } else {
                    setResult(-1, intent);
                }
            } else {
                C4048c.m16857b("finishing activity without openable uri");
            }
        }
        if (getActivity() instanceof FilePickerActivity) {
            getActivity().finish();
        } else {
            finish();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.file_picker_activity_file_picker, viewGroup, false);
        this.f12426a = inflate;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 321) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z = true;
                    break;
                } else if (iArr[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                m17075h();
            } else if (getActivity() instanceof FilePickerActivity) {
                getActivity().finish();
            } else {
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        ContentResolver contentResolver;
        if (i == 1001) {
            if (i2 == -1) {
                FilePickerHitPoint.f12299a.mo15893b();
                if (intent == null) {
                    C4048c.m16857b("data = null");
                } else if (intent.getData() != null) {
                    Uri data = intent.getData();
                    int flags = intent.getFlags() & 3;
                    if (!(data == null || (activity = getActivity()) == null || (contentResolver = activity.getContentResolver()) == null)) {
                        contentResolver.takePersistableUriPermission(data, flags);
                        long d = LarkUriUtil.m95306d(activity, data);
                        if (m17072a(d)) {
                            mo15994a(Collections.singletonList(data), d);
                        }
                    }
                } else if (intent.getClipData() != null) {
                    this.f12428c.mo16051a(requireContext(), intent, intent.getClipData());
                } else {
                    C4048c.m16857b("data.getData() = null");
                }
            }
            if (i2 == 0) {
                FilePickerHitPoint.f12299a.mo15894c();
            }
            if (getActivity() instanceof FilePickerActivity) {
                getActivity().finish();
            } else {
                finish();
            }
        }
    }
}
