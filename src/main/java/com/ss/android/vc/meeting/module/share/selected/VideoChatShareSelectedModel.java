package com.ss.android.vc.meeting.module.share.selected;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.meeting.module.share.ShareItemType;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\bH\u0016R$\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "selectedGroupCount", "", "selectedFromInvite", "", "(Ljava/util/ArrayList;IZ)V", "getData", "()Ljava/util/ArrayList;", "mDeletedGroupCount", "getMDeletedGroupCount", "()I", "setMDeletedGroupCount", "(I)V", "mDeleteds", "", "getMDeleteds", "()[Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "setMDeleteds", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;)V", "[Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "getSelectedFromInvite", "()Z", "setSelectedFromInvite", "(Z)V", "getSelectedGroupCount", "setSelectedGroupCount", "deleteData", "", "item", "position", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.e */
public final class VideoChatShareSelectedModel extends BaseModel implements IVideoChatShareSelectedContract.IModel {

    /* renamed from: a */
    private VideoChatShareItem[] f158579a = new VideoChatShareItem[0];

    /* renamed from: b */
    private int f158580b;

    /* renamed from: c */
    private final ArrayList<VideoChatShareItem> f158581c;

    /* renamed from: d */
    private int f158582d;

    /* renamed from: e */
    private boolean f158583e;

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IModel
    /* renamed from: b */
    public ArrayList<VideoChatShareItem> mo217549b() {
        return this.f158581c;
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IModel
    /* renamed from: c */
    public int mo217550c() {
        return this.f158580b;
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IModel
    /* renamed from: d */
    public int mo217551d() {
        return this.f158582d;
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IModel
    /* renamed from: a */
    public VideoChatShareItem[] mo217548a() {
        return this.f158579a;
    }

    /* renamed from: a */
    public void mo217572a(int i) {
        this.f158580b = i;
    }

    /* renamed from: a */
    public void mo217573a(VideoChatShareItem[] videoChatShareItemArr) {
        Intrinsics.checkParameterIsNotNull(videoChatShareItemArr, "<set-?>");
        this.f158579a = videoChatShareItemArr;
    }

    /* renamed from: b */
    public void mo217574b(int i) {
        this.f158582d = i;
    }

    @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IModel
    /* renamed from: a */
    public void mo217547a(VideoChatShareItem videoChatShareItem, int i) {
        Intrinsics.checkParameterIsNotNull(videoChatShareItem, "item");
        if (i < mo217549b().size() || i >= 0) {
            mo217549b().remove(i);
            mo217573a((VideoChatShareItem[]) C69043h.m265725a(mo217548a(), videoChatShareItem));
            if (videoChatShareItem.getType() == ShareItemType.GROUP) {
                mo217574b(mo217551d() - 1);
                mo217572a(mo217550c() + 1);
            }
        }
    }

    public VideoChatShareSelectedModel(ArrayList<VideoChatShareItem> arrayList, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrayList, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f158581c = arrayList;
        this.f158582d = i;
        this.f158583e = z;
    }
}
