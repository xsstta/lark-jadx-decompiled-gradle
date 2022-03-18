package com.ss.android.lark.inv.export.router;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface InvRouter {

    public interface InvitationEntrancePage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteExternalContactPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteExternalPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteMemberNonDirectionalPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }

            @Retention(RetentionPolicy.SOURCE)
            public @interface Type {
            }
        }
    }

    public interface InviteMemberOrientationPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteMemberTeamCodePage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteParentChannelPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface From {
            }
        }
    }

    public interface InviteParentNonDirectionPage {

        public interface Param {

            @Retention(RetentionPolicy.SOURCE)
            public @interface Type {
            }
        }
    }
}
