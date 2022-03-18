package com.ss.android.lark.integrator.core;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.SafeModeManager;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.core.dependency.AbstractC36117b;
import com.ss.android.lark.core.dependency.AbstractC36118c;
import com.ss.android.lark.core.dependency.AbstractC36119d;
import com.ss.android.lark.core.dependency.AbstractC36120e;
import com.ss.android.lark.core.dependency.AbstractC36121f;
import com.ss.android.lark.core.dependency.AbstractC36122g;
import com.ss.android.lark.core.dependency.AbstractC36123h;
import com.ss.android.lark.core.dependency.AbstractC36124i;
import com.ss.android.lark.core.dependency.AbstractC36125j;
import com.ss.android.lark.core.dependency.AbstractC36126l;
import com.ss.android.lark.core.dependency.AbstractC36127m;
import com.ss.android.lark.core.dependency.AbstractC36128n;
import com.ss.android.lark.core.dependency.AbstractC36129o;
import com.ss.android.lark.core.dependency.AbstractC36130p;
import com.ss.android.lark.core.dependency.AbstractC36131q;
import com.ss.android.lark.core.dependency.AbstractC36132s;
import com.ss.android.lark.core.dependency.IEnvDependency;
import com.ss.android.lark.core.dependency.IMomentsDependency;
import com.ss.android.lark.core.dependency.ITodoDependency;
import com.ss.android.lark.platform.p2498r.C51947a;
import org.json.JSONObject;

public class CoreModuleProvider {

    @ClaymoreImpl(AbstractC36119d.class)
    public static class CoreDependencyImpl implements AbstractC36119d {
        private AbstractC36117b mCCMDependency;
        private AbstractC36118c mCalendarDependency;
        private IEnvDependency mEnvDependency;
        private AbstractC36126l mFeatureInjectDependency;
        private AbstractC36120e mGeckoResManagerDependency;
        private AbstractC36121f mHelpDeskDependency;
        private AbstractC36122g mIIMDependency;
        private AbstractC36124i mIMigrateTempDependency;
        private AbstractC36123h mMailDependency;
        private AbstractC36125j mMinutesDependency;
        private IMomentsDependency mMomentsDependency;
        private AbstractC36127m mOpenPlatformDependency;
        private AbstractC36128n mPassportDependency;
        private AbstractC36129o mSafeModeDependency;
        private AbstractC36130p mThirdPartyInfoDependency;
        private AbstractC36131q mThirdShareDependency;
        private ITodoDependency mTodoDependency;
        private AbstractC36132s mVideoConferenceDependency;

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36117b getCCMDependency() {
            if (this.mCCMDependency == null) {
                this.mCCMDependency = new C39352b();
            }
            return this.mCCMDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36118c getCalendarDependency() {
            if (this.mCalendarDependency == null) {
                this.mCalendarDependency = new C39363c();
            }
            return this.mCalendarDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public IEnvDependency getEnvDependency() {
            if (this.mEnvDependency == null) {
                this.mEnvDependency = new C39366e();
            }
            return this.mEnvDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36120e getGeckoResDependency() {
            if (this.mGeckoResManagerDependency == null) {
                this.mGeckoResManagerDependency = new C39367f();
            }
            return this.mGeckoResManagerDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36121f getHelpdeskDependency() {
            if (this.mHelpDeskDependency == null) {
                this.mHelpDeskDependency = new C39368g();
            }
            return this.mHelpDeskDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36122g getIMDependency() {
            if (this.mIIMDependency == null) {
                this.mIIMDependency = new C39369h();
            }
            return this.mIIMDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36123h getMailDependency() {
            if (this.mMailDependency == null) {
                this.mMailDependency = new C39370i();
            }
            return this.mMailDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36124i getMigrateTempDependency() {
            if (this.mIMigrateTempDependency == null) {
                this.mIMigrateTempDependency = new C39371j();
            }
            return this.mIMigrateTempDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36125j getMinutesDependency() {
            if (this.mMinutesDependency == null) {
                this.mMinutesDependency = new C39372k();
            }
            return this.mMinutesDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public IMomentsDependency getMomentsDependency() {
            if (this.mMomentsDependency == null) {
                this.mMomentsDependency = new MomentsDependencyImpl();
            }
            return this.mMomentsDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36126l getOpenFeatureDependency() {
            if (this.mFeatureInjectDependency == null) {
                this.mFeatureInjectDependency = new C39373m();
            }
            return this.mFeatureInjectDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36127m getOpenPlatformDependency() {
            if (this.mOpenPlatformDependency == null) {
                this.mOpenPlatformDependency = new C39383n();
            }
            return this.mOpenPlatformDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36128n getPassportDependency() {
            if (this.mPassportDependency == null) {
                this.mPassportDependency = new C39387o();
            }
            return this.mPassportDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC29582d getResourceService() {
            return C51947a.m201491a().mo181472a();
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36129o getSafeModeDependency() {
            if (this.mSafeModeDependency == null) {
                this.mSafeModeDependency = new AbstractC36129o() {
                    /* class com.ss.android.lark.integrator.core.CoreModuleProvider.CoreDependencyImpl.C393491 */

                    @Override // com.ss.android.lark.core.dependency.AbstractC36129o
                    /* renamed from: a */
                    public boolean mo133109a() {
                        if (SafeModeManager.f62333a.mo88864a() != SafeModeConstants.SafeModeLevel.NONE) {
                            return true;
                        }
                        return false;
                    }

                    @Override // com.ss.android.lark.core.dependency.AbstractC36129o
                    /* renamed from: a */
                    public void mo133108a(JSONObject jSONObject) {
                        SafeModeManager.f62333a.mo88869a(jSONObject);
                    }
                };
            }
            return this.mSafeModeDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36130p getThirdPartyInfoDependency() {
            if (this.mThirdPartyInfoDependency == null) {
                this.mThirdPartyInfoDependency = new C39388p();
            }
            return this.mThirdPartyInfoDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36131q getThirdShareDependency() {
            if (this.mThirdShareDependency == null) {
                this.mThirdShareDependency = new C39389q();
            }
            return this.mThirdShareDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public ITodoDependency getTodoDependency() {
            if (this.mTodoDependency == null) {
                this.mTodoDependency = new TodoDependencyImpl();
            }
            return this.mTodoDependency;
        }

        @Override // com.ss.android.lark.core.dependency.AbstractC36119d
        public AbstractC36132s getVideoConferenceDependency() {
            if (this.mVideoConferenceDependency == null) {
                this.mVideoConferenceDependency = new C39391s();
            }
            return this.mVideoConferenceDependency;
        }
    }
}
