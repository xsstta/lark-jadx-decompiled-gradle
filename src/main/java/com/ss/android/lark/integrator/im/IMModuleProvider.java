package com.ss.android.lark.integrator.im;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.filedetail.FileDetailModuleProvider;
import com.ss.android.lark.integrator.im.dependency.AbstractC39571m;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import com.ss.android.lark.integrator.im.dependency.AbstractC39573p;
import com.ss.android.lark.integrator.im.dependency.AbstractC39574q;
import com.ss.android.lark.integrator.im.dependency.AbstractC39575r;
import com.ss.android.lark.integrator.im.dependency.AbstractC39576s;
import com.ss.android.lark.integrator.im.dependency.AbstractC39577t;
import com.ss.android.lark.integrator.im.dependency.AbstractC39578u;
import com.ss.android.lark.integrator.im.dependency.AbstractC39579v;
import com.ss.android.lark.integrator.im.dependency.AbstractC39580x;
import com.ss.android.lark.integrator.im.dependency.ICalendarDependency;
import com.ss.android.lark.integrator.im.dependency.IEnvDependency;
import com.ss.android.lark.integrator.im.dependency.IHelpdeskDependency;
import com.ss.android.lark.integrator.im.dependency.ITodoDependency;
import com.ss.android.lark.p2567s.p2568a.p2573e.C53203a;
import com.ss.android.lark.p2567s.p2568a.p2573e.C53204b;
import java.util.Map;

public class IMModuleProvider {

    @ClaymoreImpl(AbstractC39573p.class)
    public static class IMDependencyImpl implements AbstractC39573p {
        private AbstractC39571m mCCMDependency;
        private ICalendarDependency mCalendarDependency;
        private AbstractC39572n mCoreDependency;
        private IEnvDependency mEnvDependency;
        private AbstractC39577t mFeatureInjectDependency;
        private IHelpdeskDependency mHelpdeskDependency;
        private AbstractC39576s mIMigrateTempDependency;
        private AbstractC39574q mMailDependency;
        private AbstractC39575r mMeegoDependency;
        private AbstractC39578u mOpenPlatformDependency;
        private AbstractC39579v mPassportDependency;
        private ITodoDependency mTodoDependency;
        private AbstractC39580x mVideoConferenceDependency;

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public Map<String, String> getIMFAutoInitModuleConfigMap() {
            return C53203a.f131536a;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public Map<String, String> getIMFThirdPartyModuleConfigMap() {
            return C53203a.f131537b;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public Map<String, String> getIMFThirdPartyPrefixModuleConfigMap() {
            return C53203a.f131538c;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39571m getCCMDependency() {
            if (this.mCCMDependency == null) {
                this.mCCMDependency = new C39424a();
            }
            return this.mCCMDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public ICalendarDependency getCalendarDependency() {
            if (this.mCalendarDependency == null) {
                this.mCalendarDependency = new C39430b();
            }
            return this.mCalendarDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39572n getCoreDependency() {
            if (this.mCoreDependency == null) {
                this.mCoreDependency = new C39557d();
            }
            return this.mCoreDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public IEnvDependency getEnvDependency() {
            if (this.mEnvDependency == null) {
                this.mEnvDependency = new C39582e();
            }
            return this.mEnvDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public IHelpdeskDependency getHelpdeskDependency() {
            if (this.mHelpdeskDependency == null) {
                this.mHelpdeskDependency = new HelpDeskDependencyImpl();
            }
            return this.mHelpdeskDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39574q getMailDependency() {
            if (this.mMailDependency == null) {
                this.mMailDependency = new C39634h();
            }
            return this.mMailDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39575r getMeegoDependency() {
            if (this.mMeegoDependency == null) {
                this.mMeegoDependency = new C39639i();
            }
            return this.mMeegoDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39576s getMigrateTempDependency() {
            if (this.mIMigrateTempDependency == null) {
                this.mIMigrateTempDependency = new C39698j();
            }
            return this.mIMigrateTempDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39577t getOpenFeatureDependency() {
            if (this.mFeatureInjectDependency == null) {
                this.mFeatureInjectDependency = new C39704k();
            }
            return this.mFeatureInjectDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39578u getOpenPlatformDependency() {
            if (this.mOpenPlatformDependency == null) {
                this.mOpenPlatformDependency = new C39711l();
            }
            return this.mOpenPlatformDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39579v getPassportDependency() {
            if (this.mPassportDependency == null) {
                this.mPassportDependency = new C39714m();
            }
            return this.mPassportDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public ITodoDependency getTodoDependency() {
            if (this.mTodoDependency == null) {
                this.mTodoDependency = new TodoDependencyImpl();
            }
            return this.mTodoDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public AbstractC39580x getVideoConferenceDependency() {
            if (this.mVideoConferenceDependency == null) {
                this.mVideoConferenceDependency = new C39765r();
            }
            return this.mVideoConferenceDependency;
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public void imfInitProcessorDoInit(String str) {
            C53204b.m205842a(str);
        }

        @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39573p
        public void showResourceDeletedByAdminDialog(Context context, Boolean bool, DialogInterface.OnDismissListener onDismissListener) {
            FileDetailModuleProvider.f97899a.mo139631a().mo139557a(context, bool.booleanValue(), onDismissListener);
        }
    }
}
