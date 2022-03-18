package com.ss.android.lark.integrator.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.core.dependency.AbstractC36124i;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import java.io.File;

/* renamed from: com.ss.android.lark.integrator.core.j */
class C39371j implements AbstractC36124i {

    /* renamed from: a */
    private final String f100692a = "MigrateTempDependencyImpl";

    C39371j() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36124i
    /* renamed from: a */
    public void mo132979a(Context context, FileContent fileContent, boolean z) {
        new FileDetailModule().mo139560b(new FileDetailLaunchParams.Builder(context, fileContent, "").mo139654a(0L).mo139669g(z).mo139659a());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36124i
    /* renamed from: a */
    public boolean mo132981a(Context context, String str, String str2) {
        String str3;
        Logger.m15173i("MigrateTempDependencyImpl", "path startFileDetailActivity filePath:" + str + " fileType:" + str2);
        FileContent fileContent = new FileContent();
        fileContent.setFilePath(str);
        fileContent.setKey(str);
        fileContent.setFileState(FileState.DONE);
        fileContent.setMime(str2);
        File file = new File(str);
        if (file.exists()) {
            str3 = file.getName();
        } else {
            str3 = "";
        }
        fileContent.setName(str3);
        new FileDetailModule().mo139560b(new FileDetailLaunchParams.Builder(context, fileContent, "").mo139654a(0L).mo139659a());
        return true;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36124i
    /* renamed from: a */
    public void mo132978a(Context context, FileContent fileContent, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        FileDetailLaunchParams.Builder aVar = new FileDetailLaunchParams.Builder(context, fileContent, str);
        aVar.mo139657a(str2).mo139653a(i).mo139664c(z).mo139662b(z2).mo139658a(false);
        new FileDetailModule().mo139558a(aVar.mo139659a());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36124i
    /* renamed from: a */
    public void mo132980a(Context context, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, long j) {
        int i2;
        FolderManageLaunchParams.Builder a = new FolderManageLaunchParams.Builder(str3).mo139706a(str4).mo139707a(z);
        if (z2) {
            i2 = 8;
        } else {
            i2 = 7;
        }
        FolderManageLaunchParams.Builder d = a.mo139709b(i2).mo139704a(j).mo139715e(str2).mo139714d(str);
        if (!TextUtils.isEmpty(str5)) {
            d.mo139716f(str5).mo139713d(i);
        } else {
            d.mo139703a(i);
        }
        new FileDetailModule().mo139554a(context, d.mo139708a());
    }
}
