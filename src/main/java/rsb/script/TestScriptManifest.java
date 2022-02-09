package rsb.script;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestScriptManifest {

	String name();

	double version() default 1.0;

	String description() default "This is a test script";

	String[] authors();
}
