package com.ss.android.lark.integrator.im;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.filedetail.FileDetailModuleProvider;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.p1886b.C38210b;
import com.ss.android.lark.integrator.im.dependency.AbstractC39576s;
import com.ss.android.lark.integrator.im.dependency.C39564e;
import com.ss.android.lark.p2392o.AbstractC48705o;

/* renamed from: com.ss.android.lark.integrator.im.j */
class C39698j implements AbstractC39576s {

    /* renamed from: b */
    private static C38210b.AbstractC38211a f101243b;

    /* renamed from: a */
    private final String f101244a = "MigrateTempDependencyImpl";

    C39698j() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39576s
    /* renamed from: a */
    public AbstractC36505s mo143631a() {
        return new C39564e();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39576s
    /* renamed from: a */
    public void mo143633a(final AbstractC48705o oVar) {
        C396991 r0 = new C38210b.AbstractC38211a() {
            /* class com.ss.android.lark.integrator.im.C39698j.C396991 */

            @Override // com.ss.android.lark.filedetail.p1886b.C38210b.AbstractC38211a
            /* renamed from: a */
            public void mo139633a(Message message) {
                oVar.mo123080a(message);
            }
        };
        f101243b = r0;
        C38210b.m150166a(r0);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39576s
    /* renamed from: b */
    public void mo143635b(AbstractC48705o oVar) {
        C38210b.m150167b(f101243b);
        f101243b = null;
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39576s
    /* renamed from: a */
    public void mo143632a(Context context, Message message) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139558a(new FileDetailLaunchParams.Builder(context, message).mo139654a(5L).mo139657a(message.getChatId()).mo139658a(false).mo139659a());
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39576s
    /* renamed from: b */
    public void mo143634b(Context context, Message message) {
        int i;
        if (TextUtils.isEmpty(message.getThreadId())) {
            i = message.getPosition();
        } else {
            i = -1;
        }
        FileDetailModuleProvider.f97899a.mo139631a().mo139554a(context, new FolderManageLaunchParams.Builder(message).mo139706a(message.getChatId()).mo139703a(i).mo139716f(message.getThreadId()).mo139713d(message.getThreadPosition()).mo139709b(6).mo139708a());
    }
}
