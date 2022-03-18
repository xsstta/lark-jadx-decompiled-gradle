package com.tt.miniapp.process.info.base;

import android.content.Context;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;

public abstract class AbsSandboxEnvInfo implements ISandboxEnvInfo {
    private volatile boolean mActivityCreated;
    public String mAppId = "";
    private final int mEnvIndex;
    public final Class mInHostStackActivityClass;
    protected volatile boolean mIsInitialized;
    private boolean mIsLaunchActivityInHostStack;
    protected boolean mIsStarting;
    private String mKillingAppId;
    private Class mLaunchActivityClass;
    public SandboxMonitor mMiniProcessMonitor;
    public final Class mNormalActivityClass;
    public final Class mPreloadServiceClass;
    public final String mProcessIdentity;
    private String mSchema;
    public long mStartTime;
    private long mUseTime;
    public String mVersionType;
    public AbstractC67433a microAppContext;
    protected IAppSandboxEnvProcessor processor;

    public abstract IAppSandboxEnvManagerService.SandBoxEnvType getSandboxType();

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public abstract void init(Context context);

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public AbstractC67433a getAppContext() {
        return this.microAppContext;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getAppId() {
        return this.mAppId;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public Class getInHostStackActivityClass() {
        return this.mInHostStackActivityClass;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public int getIndex() {
        return this.mEnvIndex;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getKillingAppId() {
        return this.mKillingAppId;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public Class getLaunchActivityClass() {
        return this.mLaunchActivityClass;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public SandboxMonitor getMiniProcessMontior() {
        return this.mMiniProcessMonitor;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public Class getNormalActivityClass() {
        return this.mNormalActivityClass;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public Class getPreloadServiceClass() {
        return this.mPreloadServiceClass;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getProcessIdentity() {
        return this.mProcessIdentity;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public RenderEngineType getRenderEngineType() {
        return RenderEngineType.WebView;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public long getStartTime() {
        return this.mStartTime;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public long getUseTime() {
        return this.mUseTime;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public String getVersionType() {
        return this.mVersionType;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isActivityCreated() {
        return this.mActivityCreated;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isLaunchActivityInHostStack() {
        return this.mIsLaunchActivityInHostStack;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean hasBindSchema() {
        if (this.mSchema != null) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isSnapshotCreatingFaker() {
        return "SNAPSHOT_CREATING_FAKER".equals(getAppId());
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void prepareStart() {
        this.mIsStarting = true;
        this.mUseTime = System.currentTimeMillis();
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public boolean isUsing() {
        if (this.mIsStarting || this.processor.isSandboxEnvExistByName(getSandboxName())) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void reset() {
        this.mUseTime = 0;
        this.mStartTime = System.currentTimeMillis();
        this.mAppId = "";
        this.mVersionType = null;
        this.mIsStarting = false;
        this.mLaunchActivityClass = null;
        this.mIsLaunchActivityInHostStack = false;
        this.microAppContext = null;
        this.mActivityCreated = false;
        this.mSchema = null;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void setKillingAppId(String str) {
        this.mKillingAppId = str;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void setSchema(String str) {
        this.mSchema = str;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void updateActivityCreateStatus(boolean z) {
        this.mActivityCreated = z;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void updateAppId(String str) {
        this.mAppId = str;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public Class generateLaunchActivityClass(boolean z) {
        Class cls;
        if (this.mLaunchActivityClass == null) {
            this.mIsLaunchActivityInHostStack = z;
            if (z) {
                cls = this.mInHostStackActivityClass;
            } else {
                cls = this.mNormalActivityClass;
            }
            this.mLaunchActivityClass = cls;
        }
        return this.mLaunchActivityClass;
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void processRunning(String str, String str2) {
        this.mAppId = str;
        this.mVersionType = str2;
        this.mIsStarting = false;
        this.mUseTime = System.currentTimeMillis();
    }

    @Override // com.tt.miniapp.process.info.api.ISandboxEnvInfo
    public void reuseInfo(String str, String str2, AbstractC67433a aVar) {
        reset();
        this.mAppId = str;
        this.mVersionType = str2;
        this.microAppContext = aVar;
    }

    public AbsSandboxEnvInfo(int i, String str, Class cls, Class cls2, Class cls3, IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        this.mProcessIdentity = str;
        this.mEnvIndex = i;
        this.mNormalActivityClass = cls;
        this.mInHostStackActivityClass = cls2;
        this.mPreloadServiceClass = cls3;
        this.processor = iAppSandboxEnvProcessor;
        this.mMiniProcessMonitor = new SandboxMonitor(this, iAppSandboxEnvProcessor.getInnerProcessLifeListener());
    }
}
