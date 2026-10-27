/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

module net.sourceforge.pmd.util.fxdesigner {
    exports net.sourceforge.pmd.util.fxdesigner to net.sourceforge.pmd.cli, javafx.graphics;
    exports net.sourceforge.pmd.util.fxdesigner.util.codearea to javafx.fxml;

    opens net.sourceforge.pmd.util.fxdesigner to javafx.fxml;
    opens net.sourceforge.pmd.util.fxdesigner.popups to javafx.fxml;
    opens net.sourceforge.pmd.util.fxdesigner.util.controls to javafx.fxml;

    // resources need to be opened unconditionally
    opens net.sourceforge.pmd.util.fxdesigner.fxml;
    opens net.sourceforge.pmd.util.fxdesigner.css; // this is generated during build
    opens net.sourceforge.pmd.util.fxdesigner.icons.app;

    requires net.sourceforge.pmd.core;

    requires org.apache.commons.lang3;
    requires org.checkerframework.checker.qual;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.controlsfx.controls;

    requires java.xml;
    requires java.desktop;
    requires java.sql;

    requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    // automatic names
    requires reactfx;
    requires fx.live.templates;
    requires richtextfx;
    requires wellbehavedfx;
}
