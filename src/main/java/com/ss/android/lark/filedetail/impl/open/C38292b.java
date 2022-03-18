package com.ss.android.lark.filedetail.impl.open;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.detail.C38233b;
import com.ss.android.lark.filedetail.impl.detail.menu.FileMenuActionFactory;
import com.ss.android.lark.filedetail.impl.detail.menu.IFileMenuClickDependency;
import com.ss.android.lark.filedetail.impl.open.C38292b;
import com.ss.android.lark.filedetail.impl.statistic.DriveHitPoint;
import com.ss.android.lark.filedetail.impl.statistic.FavouriteHitPoint;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.filedetail.impl.open.b */
public class C38292b {

    /* renamed from: a */
    AbstractC38197a f98329a;

    /* renamed from: b */
    AbstractC38197a.AbstractC38205h f98330b;

    /* renamed from: c */
    AbstractC38197a.AbstractC38199b f98331c;

    /* renamed from: d */
    AbstractC38197a.AbstractC38198a f98332d;

    /* renamed from: e */
    IFileMenuClickDependency f98333e;

    /* renamed from: f */
    public OpenFileInfo f98334f;

    /* renamed from: g */
    public Context f98335g;

    /* renamed from: h */
    public boolean f98336h;

    /* renamed from: i */
    private boolean f98337i;

    /* renamed from: c */
    private C58339d.C58341a m150698c() {
        return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_SaveFileToDrive), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382942 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m150706a() {
                if (C38292b.this.f98336h) {
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_WillSaveToLarkDrive);
                    C38292b.this.f98336h = false;
                }
            }

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                if (C38292b.this.f98334f.mFileContent.getSaveToDrive() == 0) {
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_SavedFileToDrive);
                    return;
                }
                DriveHitPoint.f98022a.mo139772a(C38292b.this.f98334f.mFileContent.getMime());
                UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382942.C382951 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C38292b.this.f98336h = false;
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C38292b.this.f98336h = false;
                    }
                });
                C38292b bVar = C38292b.this;
                bVar.mo140070a(bVar.f98334f.mFileContent.getKey(), C38292b.this.f98334f.mMessageId, C38292b.this.f98334f.mSourceId, C38292b.this.f98334f.mSourceType, uIGetDataCallback);
                C38292b.this.f98336h = true;
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.filedetail.impl.open.$$Lambda$b$2$8PjfPLoWVhMU7J5YKDByXfldtoA */

                    public final void run() {
                        C38292b.C382942.this.m150706a();
                    }
                }, 1000);
            }
        });
    }

    /* renamed from: d */
    private C58339d.C58341a m150699d() {
        return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_ForwardToChat), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382963 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                if (C38292b.this.f98333e != null) {
                    C38292b.this.f98333e.mo139828b();
                }
            }
        });
    }

    /* renamed from: e */
    private C58339d.C58341a m150700e() {
        return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_AddToFavorite), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382974 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                if (!TextUtils.isEmpty(C38292b.this.f98334f.mMessageId)) {
                    C38292b.this.mo140071a(new ArrayList<String>() {
                        /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382974.C382981 */

                        {
                            add(C38292b.this.f98334f.mMessageId);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: f */
    private C58339d.C58341a m150701f() {
        return new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_ViewInChat), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382995 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                if (C38292b.this.f98333e != null) {
                    C38292b.this.f98333e.mo139827a();
                }
            }
        });
    }

    /* renamed from: g */
    private C58339d.C58341a m150702g() {
        C58339d.C58341a aVar = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_Cancel), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C383028 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
            }
        });
        aVar.mo197568a(R.color.function_danger_600);
        aVar.mo197570a(true);
        return aVar;
    }

    /* renamed from: b */
    private C58339d.C58341a m150697b() {
        final String str;
        if (this.f98334f.mFileContent == null) {
            str = "";
        } else {
            str = this.f98334f.mFileContent.getKey();
        }
        boolean a = this.f98332d.mo139597a(str, true);
        C58339d.C58341a aVar = new C58339d.C58341a(UIHelper.getString(R.string.Lark_Legacy_OpenInAnotherApp), new C58339d.AbstractC58343b() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C382931 */

            @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
            public void onMenuItemClick() {
                FileContent fileContent = C38292b.this.f98334f.mFileContent;
                if (fileContent != null) {
                    C38303c.m150712a(C38292b.this.f98335g, new File(C57881t.m224631d(fileContent.getFilePath(), fileContent.getName())), fileContent.getMime(), str);
                    C38233b.m150368a(fileContent, C38292b.this.f98334f.mChatId, "menu");
                }
            }
        });
        if (!a) {
            aVar.mo197568a(R.color.text_disable);
        }
        return aVar;
    }

    /* renamed from: a */
    public List<C58339d.C58341a> mo140069a() {
        boolean z;
        ArrayList<C58339d.C58341a> arrayList = new ArrayList();
        if (!this.f98337i) {
            arrayList.add(m150697b());
        }
        if (!this.f98334f.mIsSecret) {
            if (this.f98334f.mFileContent == null || !this.f98334f.mFileContent.isFromDrive()) {
                z = false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(this.f98334f.mMessageId)) {
                if (!z && (this.f98334f.mMenuFlag & 1) > 0) {
                    arrayList.add(m150698c());
                }
                if ((this.f98334f.mMenuFlag & 2) > 0) {
                    arrayList.add(m150699d());
                }
                if ((this.f98334f.mMenuFlag & 4) > 0) {
                    arrayList.add(m150700e());
                }
            }
        }
        if (this.f98334f.mJumpPosition != -1) {
            arrayList.add(m150701f());
        }
        this.f98334f.mFileContent.getMime();
        arrayList.add(m150702g());
        for (C58339d.C58341a aVar : arrayList) {
            aVar.mo197573c(R.color.static_white);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo140071a(List<String> list) {
        if (list != null && list.size() > 0) {
            FileDetailModule.f97880b.mo139564a().getFavoriteDependency().mo139622a(list, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.filedetail.impl.open.C38292b.C383006 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_SaveBoxSaveFail);
                }

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_ChatViewFavorites);
                    FavouriteHitPoint.f98023a.mo139776a("in_file_page");
                }
            }));
        }
    }

    public C38292b(Context context, OpenFileInfo openFileInfo) {
        this(context, openFileInfo, false);
    }

    public C38292b(Context context, OpenFileInfo openFileInfo, boolean z) {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        this.f98329a = a;
        this.f98330b = a.getForwardDependency();
        this.f98331c = this.f98329a.getChatDependency();
        this.f98332d = this.f98329a.getAuditDependency();
        this.f98336h = false;
        this.f98335g = context;
        this.f98334f = openFileInfo;
        this.f98337i = z;
        if (openFileInfo.isFromFolderManage) {
            this.f98333e = FileMenuActionFactory.f98063a.mo139826b(this.f98335g, openFileInfo);
        } else {
            this.f98333e = FileMenuActionFactory.f98063a.mo139824a(this.f98335g, openFileInfo);
        }
    }

    /* renamed from: a */
    public void mo140070a(String str, final String str2, String str3, Message.SourceType sourceType, final IGetDataCallback<String> iGetDataCallback) {
        FileDetailModule.f97880b.mo139564a().getDriveDependency().mo139621a(str, str2, str3, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.filedetail.impl.open.C38292b.C383017 */

            /* renamed from: a */
            public void onSuccess(String str) {
                if ("success".equals(str)) {
                    Log.m165388i("saved to drive，messageId: " + str2);
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_SavedFileToDrive);
                    C38292b.this.f98334f.mFileContent.setSaveToDrive(0);
                } else {
                    C38292b.this.f98334f.mFileContent.setSaveToDrive(2);
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_SaveToDriveFail);
                    Log.m165396w("failed to save to drive！result: " + str + "  messageId: " + str2);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C38292b.this.f98334f.mFileContent.setSaveToDrive(2);
                if (errorResult instanceof BusinessErrorResult) {
                    LKUIToast.show(C38292b.this.f98335g, ((BusinessErrorResult) errorResult).getShowMessage());
                } else if (errorResult.getErrorCode() != 10019 || FileDetailModule.f97880b.mo139564a().isOverseaTenant()) {
                    LKUIToast.show(C38292b.this.f98335g, (int) R.string.Lark_Legacy_SaveToDriveFail);
                } else {
                    FileDetailModule.f97880b.mo139564a().showFullQuotoDialog((FragmentActivity) C38292b.this.f98335g, FullQuotoConfig.SAVE_TO_DRIVE);
                }
                Log.m165382e("failed to save to drive");
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }
}
