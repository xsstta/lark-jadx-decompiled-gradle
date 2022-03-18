package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.filedetail.FileDetailModuleProvider;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.p1886b.C38208a;
import java.io.File;

/* renamed from: com.ss.android.lark.integrator.im.dependency.e */
public class C39564e implements AbstractC36505s {
    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public long mo134696a() {
        return 1;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134705a(String str) {
        C38208a.m150163a(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: b */
    public void mo134707b(String str) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139559a(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134704a(Context context, boolean z) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139556a(context, z);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134697a(Context context, Message message, int i) {
        FolderManageLaunchParams.Builder c = new FolderManageLaunchParams.Builder(message).mo139706a(message.getChatId()).mo139709b(i).mo139711c(1);
        if (i == 0 || i == 1) {
            c.mo139703a(message.getPosition());
        } else {
            c.mo139716f(message.getThreadId()).mo139713d(message.getThreadPosition());
        }
        FileDetailModuleProvider.f97899a.mo139631a().mo139554a(context, c.mo139708a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: b */
    public void mo134706b(Context context, Message message, FavoriteMessageInfo favoriteMessageInfo) {
        String str;
        if (favoriteMessageInfo.getSourceChat() != null) {
            str = favoriteMessageInfo.getSourceChat().getId();
        } else {
            str = message.getChatId();
        }
        FileDetailModuleProvider.f97899a.mo139631a().mo139554a(context, new FolderManageLaunchParams.Builder(message).mo139706a(str).mo139709b(4).mo139711c(2).mo139705a(favoriteMessageInfo).mo139708a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134698a(Context context, Message message, FavoriteMessageInfo favoriteMessageInfo) {
        String str;
        if (favoriteMessageInfo.getSourceChat() != null) {
            str = favoriteMessageInfo.getSourceChat().getId();
        } else {
            str = message.getChatId();
        }
        FileDetailModuleProvider.f97899a.mo139631a().mo139558a(new FileDetailLaunchParams.Builder(context, message).mo139657a(str).mo139655a(favoriteMessageInfo).mo139654a(6L).mo139660b(2).mo139659a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134700a(Context context, Message message, boolean z) {
        if (message.getType() == Message.Type.FILE) {
            FileDetailLaunchParams a = new FileDetailLaunchParams.Builder(context, message).mo139658a(z).mo139659a();
            FileContent fileContent = (FileContent) message.getContent();
            String filePath = fileContent.getFilePath();
            FileDetailModuleProvider.f97899a.mo139631a().mo139555a(context, new File(filePath), fileContent.getMime(), a, fileContent.getKey());
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134701a(Context context, Message message, boolean z, long j) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139558a(new FileDetailLaunchParams.Builder(context, message).mo139657a(message.getChatId()).mo139658a(z).mo139654a(j).mo139659a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134699a(Context context, Message message, String str, String str2, int i) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139554a(context, new FolderManageLaunchParams.Builder(message).mo139706a(message.getChatId()).mo139710b(str).mo139712c(str2).mo139709b(5).mo139711c(i).mo139708a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134702a(Context context, Message message, boolean z, long j, String str) {
        FileDetailModuleProvider.f97899a.mo139631a().mo139558a(new FileDetailLaunchParams.Builder(context, message).mo139657a(message.getChatId()).mo139658a(z).mo139654a(j).mo139665d(str).mo139659a());
    }

    @Override // com.ss.android.lark.dependency.AbstractC36505s
    /* renamed from: a */
    public void mo134703a(Context context, Message message, boolean z, String str, String str2, int i) {
        FileDetailLaunchParams.Builder b = new FileDetailLaunchParams.Builder(context, message).mo139658a(z).mo139668f(false).mo139667e(false).mo139657a(str2).mo139661b(str).mo139663c(str2).mo139660b(i);
        if (i == 3) {
            b.mo139654a(7L);
        }
        FileDetailModuleProvider.f97899a.mo139631a().mo139558a(b.mo139659a());
    }
}
