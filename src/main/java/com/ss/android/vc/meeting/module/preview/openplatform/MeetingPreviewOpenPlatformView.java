package com.ss.android.vc.meeting.module.preview.openplatform;

import android.view.View;
import android.widget.EditText;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.avatarlist.VcPreviewAvatarListView;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.preview.AbstractC62715f;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.meeting.module.preview.C62725g;
import com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0016H\u0016R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformView;", "Lcom/ss/android/vc/meeting/module/preview/MeetingPreviewBaseView;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView$Delegate;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "dependency", "Lcom/ss/android/vc/meeting/module/preview/ViewDependency;", "(Lcom/ss/android/lark/base/fragment/BaseFragment;Lcom/ss/android/vc/meeting/module/preview/ViewDependency;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "avatarListView", "Lcom/ss/android/vc/common/widget/avatarlist/VcPreviewAvatarListView;", "getAvatarListView", "()Lcom/ss/android/vc/common/widget/avatarlist/VcPreviewAvatarListView;", "setAvatarListView", "(Lcom/ss/android/vc/common/widget/avatarlist/VcPreviewAvatarListView;)V", "initView", "", "isAudioBtnOnWhenPermissionGranted", "", "isGranted", "onLoadMeetingInfoSuccess", "title", "onMeetingInfoUpdate", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "onViewInited", "updateCameraBtn", "cameraMute", "updateMicBtn", "micMute", "updateSpeakerBtn", "speakerOpen", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.c.e */
public final class MeetingPreviewOpenPlatformView extends AbstractC62715f<IVCPreviewOpenPlatformContract.IView.Delegate> implements IVCPreviewOpenPlatformContract.IView {

    /* renamed from: Q */
    private final String f157761Q = "MeetingPreviewOpenPlatformView@";

    /* renamed from: R */
    private VcPreviewAvatarListView f157762R;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: x */
    public void mo216580x() {
        super.mo216580x();
        m245273C();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.e$b */
    static final class RunnableC62693b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingPreviewOpenPlatformView f157764a;

        /* renamed from: b */
        final /* synthetic */ boolean f157765b;

        RunnableC62693b(MeetingPreviewOpenPlatformView eVar, boolean z) {
            this.f157764a = eVar;
            this.f157765b = z;
        }

        public final void run() {
            IVCPreviewOpenPlatformContract.IView.Delegate aVar = (IVCPreviewOpenPlatformContract.IView.Delegate) this.f157764a.f157821d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mViewDelegate");
            MeetingAudioManager c = aVar.mo216547c();
            if (c != null) {
                c.mo212702f(this.f157765b);
            }
        }
    }

    /* renamed from: C */
    private final void m245273C() {
        VcPreviewAvatarListView vcPreviewAvatarListView;
        C60700b.m235851b(this.f157761Q, "[initView]", "initView");
        EditText editText = this.f157824g;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mTitleEv");
        editText.setVisibility(0);
        this.f157824g.setText(mo216682b(UIHelper.getString(R.string.View_G_ServerNoTitle)));
        View view = this.f157822e;
        if (view != null) {
            vcPreviewAvatarListView = (VcPreviewAvatarListView) view.findViewById(R.id.meeting_avatar_list);
        } else {
            vcPreviewAvatarListView = null;
        }
        this.f157762R = vcPreviewAvatarListView;
        ((IVCPreviewOpenPlatformContract.IView.Delegate) this.f157821d).mo216612e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f
    /* renamed from: c */
    public boolean mo216628c(boolean z) {
        if (!z || !this.f157804H) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.e$a */
    static final class View$OnClickListenerC62692a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoChat f157763a;

        View$OnClickListenerC62692a(VideoChat videoChat) {
            this.f157763a = videoChat;
        }

        public final void onClick(View view) {
            String id = this.f157763a.getId();
            ByteviewUser sponsorUser = this.f157763a.getSponsorUser();
            VideoChatSettings videoChatSettings = this.f157763a.getVideoChatSettings();
            Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "videoChat.videoChatSettings");
            C62725g.m245472a(id, sponsorUser, videoChatSettings.getTopic(), this.f157763a.getParticipants());
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IView
    public void p_(boolean z) {
        String str = this.f157761Q;
        C60700b.m235851b(str, "[updateMicBtn]", "micMute = " + z);
        this.f157804H = z ^ true;
        mo216680a(false);
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IView
    public void q_(boolean z) {
        String str = this.f157761Q;
        C60700b.m235851b(str, "[updateCameraBtn]", "cameraMute = " + z);
        this.f157805I = z ^ true;
        mo216685f(false);
    }

    @Override // com.ss.android.vc.meeting.module.preview.openplatform.IVCPreviewOpenPlatformContract.IView
    public void r_(boolean z) {
        String str = this.f157761Q;
        C60700b.m235851b(str, "[updateSpeakerBtn]", "speakerOpen = " + z);
        this.f157836s.post(new RunnableC62693b(this, z));
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62715f, com.ss.android.vc.meeting.module.preview.AbstractC62650a.AbstractC62653b
    /* renamed from: a */
    public void mo216526a(VideoChat videoChat) {
        int i;
        super.mo216526a(videoChat);
        if (videoChat != null) {
            if (videoChat.getVideoChatSettings() != null) {
                VideoChatSettings videoChatSettings = videoChat.getVideoChatSettings();
                Intrinsics.checkExpressionValueIsNotNull(videoChatSettings, "videoChat.videoChatSettings");
                this.f157824g.setText(mo216682b(videoChatSettings.getTopic()));
            }
            List<Participant> participants = videoChat.getParticipants();
            if (participants != null) {
                i = participants.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                VcPreviewAvatarListView vcPreviewAvatarListView = this.f157762R;
                if (vcPreviewAvatarListView != null) {
                    vcPreviewAvatarListView.setVisibility(0);
                }
                VcPreviewAvatarListView vcPreviewAvatarListView2 = this.f157762R;
                if (vcPreviewAvatarListView2 != null) {
                    vcPreviewAvatarListView2.mo208618a(videoChat.getId(), videoChat.getParticipants());
                }
                VcPreviewAvatarListView vcPreviewAvatarListView3 = this.f157762R;
                if (vcPreviewAvatarListView3 != null) {
                    vcPreviewAvatarListView3.setOnClickListener(new View$OnClickListenerC62692a(videoChat));
                    return;
                }
                return;
            }
            VcPreviewAvatarListView vcPreviewAvatarListView4 = this.f157762R;
            if (vcPreviewAvatarListView4 != null) {
                vcPreviewAvatarListView4.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingPreviewOpenPlatformView(BaseFragment baseFragment, AbstractC62746h hVar) {
        super(baseFragment, hVar);
        Intrinsics.checkParameterIsNotNull(baseFragment, "fragment");
        Intrinsics.checkParameterIsNotNull(hVar, "dependency");
    }
}
