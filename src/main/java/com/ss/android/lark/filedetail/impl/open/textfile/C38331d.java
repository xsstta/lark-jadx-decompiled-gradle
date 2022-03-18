package com.ss.android.lark.filedetail.impl.open.textfile;

import android.os.Bundle;
import android.view.View;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.filedetail.impl.open.textfile.AbstractC38323a;

/* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.d */
public class C38331d extends BasePresenter<AbstractC38323a.AbstractC38324a, AbstractC38323a.AbstractC38326b, AbstractC38323a.AbstractC38326b.AbstractC38327a> {

    /* renamed from: a */
    private OpenFileInfo f98412a = new OpenFileInfo();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC38323a.AbstractC38326b.AbstractC38327a createViewDelegate() {
        return new C38334b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f98412a.mFileContent != null) {
            ((AbstractC38323a.AbstractC38326b) getView()).mo140115a(this.f98412a.mFileContent.getName());
            ((AbstractC38323a.AbstractC38326b) getView()).mo140113a(this.f98412a);
        }
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.d$a */
    private class C38333a implements AbstractC38323a.AbstractC38324a.AbstractC38325a {
        private C38333a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.d$b */
    public class C38334b implements AbstractC38323a.AbstractC38326b.AbstractC38327a {
        private C38334b() {
        }
    }

    /* renamed from: a */
    public void mo140127a(View view) {
        ((AbstractC38323a.AbstractC38326b) getView()).mo140112a(view, this.f98412a);
    }

    /* renamed from: a */
    private void m150796a(Bundle bundle) {
        OpenFileParams openFileParams;
        if (bundle != null && (openFileParams = (OpenFileParams) bundle.getSerializable("extra.open.params")) != null) {
            this.f98412a.mFileContent = openFileParams.getFileContent();
            this.f98412a.mMessageId = openFileParams.getMessageId();
            this.f98412a.mChatId = openFileParams.getChatId();
            this.f98412a.mJumpPosition = openFileParams.getJumpPosition();
            this.f98412a.mIsSecret = openFileParams.isSecret();
            this.f98412a.mMenuFlag = openFileParams.getMenuFlag();
            this.f98412a.threadId = openFileParams.getThreadId();
            this.f98412a.isFromFolderManage = openFileParams.isFromFolderManager();
        }
    }

    public C38331d(AbstractC38323a.AbstractC38324a aVar, AbstractC38323a.AbstractC38326b bVar, Bundle bundle) {
        super(aVar, bVar);
        m150796a(bundle);
        aVar.mo140125a(new C38333a());
    }
}
