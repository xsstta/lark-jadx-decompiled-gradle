package com.bytedance.ee.bear.list.create;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.list.create.C8242h;
import com.bytedance.ee.bear.list.create.SelectCreationMenuItem;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.create.k */
public class C8248k implements C8242h.AbstractC8243a {

    /* renamed from: a */
    private final ArrayList<SelectCreationMenuItem> f22232a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<SelectCreationMenuItem> f22233b = new ArrayList<>();

    /* renamed from: c */
    private final SelectCreationMenuConfig f22234c;

    /* renamed from: d */
    private final Context f22235d;

    /* renamed from: e */
    private final C10917c f22236e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.list.create.C8242h.AbstractC8243a
    /* renamed from: a */
    public ArrayList<SelectCreationMenuItem> mo32339a() {
        return this.f22232a;
    }

    @Override // com.bytedance.ee.bear.list.create.C8242h.AbstractC8243a
    /* renamed from: b */
    public ArrayList<SelectCreationMenuItem> mo32341b() {
        return this.f22233b;
    }

    /* renamed from: c */
    private String m33856c() {
        String str;
        JSONException e;
        String string = this.f22235d.getString(R.string.Doc_Facade_Document);
        String str2 = (String) C4211a.m17514a().mo16533a("docx_i18n_name", "");
        if (TextUtils.isEmpty(str2)) {
            return string;
        }
        try {
            str = new JSONObject(str2).optString(C4484g.m18494b().mo17252c(), "");
            if (TextUtils.isEmpty(str)) {
                return string;
            }
            try {
                C13479a.m54764b("SelectCreationMenuModel", "parseDocXName()...docXName = " + str);
            } catch (JSONException e2) {
                e = e2;
            }
            return str;
        } catch (JSONException e3) {
            str = string;
            e = e3;
            C13479a.m54758a("SelectCreationMenuModel", "parseDocXName()...error = " + e);
            return str;
        }
    }

    @Override // com.bytedance.ee.bear.list.create.C8242h.AbstractC8243a
    /* renamed from: a */
    public void mo32340a(boolean z) {
        this.f22232a.clear();
        this.f22233b.clear();
        this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_DOC, this.f22235d.getString(R.string.Doc_Facade_Document), R.drawable.ic_create_file_doc_colorful, this.f22234c.mo32278a(), true, true));
        this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_SHEET, this.f22235d.getString(R.string.Doc_Facade_CreateSheet), R.drawable.ic_create_file_sheet_colorful, this.f22234c.mo32280b(), true, true));
        if (this.f22234c.mo32297j()) {
            this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_MINDNOTE, this.f22235d.getString(R.string.Doc_Facade_MindNote), R.drawable.ic_create_file_mindnote_colorful, this.f22234c.mo32284d(), true, true));
        }
        if (this.f22234c.mo32299k()) {
            this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_BITABLE, this.f22235d.getString(R.string.Doc_List_DocumentTypeBase), R.drawable.ic_create_file_bitable_colorful, this.f22234c.mo32287e(), z, true));
        }
        if (this.f22234c.mo32300l()) {
            this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_DOCX, m33856c(), R.drawable.ic_create_file_docx_colorful, this.f22234c.mo32289f(), z, true));
        }
        if (this.f22234c.mo32301m()) {
            this.f22232a.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.ADD_FOLDER, this.f22235d.getString(R.string.Doc_Facade_CreateFolder), R.drawable.ic_create_file_folder_colorful, this.f22234c.mo32282c(), z, true));
        }
        if (this.f22234c.mo32295i()) {
            boolean a = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36539a();
            this.f22233b.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.UPLOAD_PHOTOS, this.f22235d.getString(R.string.CreationMobile_Docs_UploadImage_Tab), R.drawable.facade_upload_image, this.f22234c.mo32291g(), z, a));
            this.f22233b.add(new SelectCreationMenuItem(SelectCreationMenuItem.ItemType.UPLOAD_FILE, this.f22235d.getString(R.string.CreationMobile_Docs_UploadFile_Tab), R.drawable.facade_upload_file2, this.f22234c.mo32293h(), z, a));
        }
    }

    C8248k(SelectCreationMenuConfig selectCreationMenuConfig, Context context, C10917c cVar) {
        this.f22234c = selectCreationMenuConfig;
        this.f22235d = context;
        this.f22236e = cVar;
    }
}
